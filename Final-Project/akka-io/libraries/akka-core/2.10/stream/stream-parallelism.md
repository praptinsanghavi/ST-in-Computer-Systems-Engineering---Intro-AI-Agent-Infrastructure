---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-parallelism.html
title: Pipelining and Parallelism • Akka core
---

# Pipelining and Parallelism • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Pipelining and Parallelism

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Akka Streams, add the module to your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

## Introduction

Akka Streams operators (be it simple operators on Flows and Sources or graph junctions) are “fused” together and executed sequentially by default. This avoids the overhead of events crossing asynchronous boundaries but limits the flow to execute at most one operator at any given time.

In many cases it is useful to be able to concurrently execute the operators of a flow, this is done by explicitly marking them as asynchronous using the `async``async()` method. Each operator marked as asynchronous will run in a dedicated actor internally, while all operators not marked asynchronous will run in one single actor.

We will illustrate through the example of pancake cooking how streams can be used for various processing patterns, exploiting the available parallelism on modern computers. The setting is the following: both Patrik and Roland like to make pancakes, but they need to produce sufficient amount in a cooking session to make all of the children happy. To increase their pancake production throughput they use two frying pans. How they organize their pancake processing is markedly different.

## Pipelining

Roland uses the two frying pans in an asymmetric fashion. The first pan is only used to fry one side of the pancake then the half\-finished pancake is flipped into the second pan for the finishing fry on the other side. Once the first frying pan becomes available it gets a new scoop of batter. As an effect, most of the time there are two pancakes being cooked at the same time, one being cooked on its first side and the second being cooked to completion. This is how this setup would look like implemented as a stream:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowParallelismDocSpec.scala#L25-L44 "Go to snippet source")// Takes a scoop of batter and creates a pancake with one side cooked
val fryingPan1: Flow[ScoopOfBatter, HalfCookedPancake, NotUsed] =
  Flow[ScoopOfBatter].map { batter =>
    HalfCookedPancake()
  }

// Finishes a half-cooked pancake
val fryingPan2: Flow[HalfCookedPancake, Pancake, NotUsed] =
  Flow[HalfCookedPancake].map { halfCooked =>
    Pancake()
  }

  // With the two frying pans we can fully cook pancakes
  val pancakeChef: Flow[ScoopOfBatter, Pancake, NotUsed] =
    Flow[ScoopOfBatter].via(fryingPan1.async).via(fryingPan2.async)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowParallelismDocTest.java#L39-L51 "Go to snippet source")Flow<ScoopOfBatter, HalfCookedPancake, NotUsed> fryingPan1 =
    Flow.of(ScoopOfBatter.class).map(batter -> new HalfCookedPancake());

Flow<HalfCookedPancake, Pancake, NotUsed> fryingPan2 =
    Flow.of(HalfCookedPancake.class).map(halfCooked -> new Pancake());

  // With the two frying pans we can fully cook pancakes
  Flow<ScoopOfBatter, Pancake, NotUsed> pancakeChef = fryingPan1.async().via(fryingPan2.async());
```

The two `map` operators in sequence (encapsulated in the “frying pan” flows) will be executed in a pipelined way, the same way that Roland was using his frying pans:

1. A `ScoopOfBatter` enters `fryingPan1`
2. `fryingPan1` emits a HalfCookedPancake once `fryingPan2` becomes available
3. `fryingPan2` takes the HalfCookedPancake
4. at this point fryingPan1 already takes the next scoop, without waiting for fryingPan2 to finish

The benefit of pipelining is that it can be applied to any sequence of processing steps that are otherwise not parallelisable (for example because the result of a processing step depends on all the information from the previous step). One drawback is that if the processing times of the operators are very different then some of the operators will not be able to operate at full throughput because they will wait on a previous or subsequent operator most of the time. In the pancake example frying the second half of the pancake is usually faster than frying the first half, `fryingPan2` will not be able to operate at full capacity [\[1]](#1).

Note
Asynchronous stream operators have internal buffers to make communication between them more efficient. For more details about the behavior of these and how to add additional buffers refer to [Buffers and working with rate](stream-rate.html).

## Parallel processing

Patrik uses the two frying pans symmetrically. He uses both pans to fully fry a pancake on both sides, then puts the results on a shared plate. Whenever a pan becomes empty, he takes the next scoop from the shared bowl of batter. In essence he parallelizes the same process over multiple pans. This is how this setup will look like if implemented using streams:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowParallelismDocSpec.scala#L50-L69 "Go to snippet source")val fryingPan: Flow[ScoopOfBatter, Pancake, NotUsed] =
  Flow[ScoopOfBatter].map { batter =>
    Pancake()
  }

val pancakeChef: Flow[ScoopOfBatter, Pancake, NotUsed] = Flow.fromGraph(GraphDSL.create() { implicit builder =>
  val dispatchBatter = builder.add(Balance[ScoopOfBatter](2))
  val mergePancakes = builder.add(Merge[Pancake](2))

  // Using two frying pans in parallel, both fully cooking a pancake from the batter.
  // We always put the next scoop of batter to the first frying pan that becomes available.
  dispatchBatter.out(0) ~> fryingPan.async ~> mergePancakes.in(0)
  // Notice that we used the "fryingPan" flow without importing it via builder.add().
  // Flows used this way are auto-imported, which in this case means that the two
  // uses of "fryingPan" mean actually different stages in the graph.
  dispatchBatter.out(1) ~> fryingPan.async ~> mergePancakes.in(1)

  FlowShape(dispatchBatter.in, mergePancakes.out)
})

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowParallelismDocTest.java#L58-L85 "Go to snippet source")Flow<ScoopOfBatter, Pancake, NotUsed> fryingPan =
    Flow.of(ScoopOfBatter.class).map(batter -> new Pancake());

Flow<ScoopOfBatter, Pancake, NotUsed> pancakeChef =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<Pancake, Pancake> mergePancakes = b.add(Merge.create(2));
              final UniformFanOutShape<ScoopOfBatter, ScoopOfBatter> dispatchBatter =
                  b.add(Balance.create(2));

              // Using two frying pans in parallel, both fully cooking a pancake from the
              // batter.
              // We always put the next scoop of batter to the first frying pan that becomes
              // available.
              b.from(dispatchBatter.out(0))
                  .via(b.add(fryingPan.async()))
                  .toInlet(mergePancakes.in(0));
              // Notice that we used the "fryingPan" flow without importing it via
              // builder.add().
              // Flows used this way are auto-imported, which in this case means that the two
              // uses of "fryingPan" mean actually different stages in the graph.
              b.from(dispatchBatter.out(1))
                  .via(b.add(fryingPan.async()))
                  .toInlet(mergePancakes.in(1));

              return FlowShape.of(dispatchBatter.in(), mergePancakes.out());
            }));
```

The benefit of parallelizing is that it is easy to scale. In the pancake example it is easy to add a third frying pan with Patrik’s method, but Roland cannot add a third frying pan, since that would require a third processing step, which is not practically possible in the case of frying pancakes.

One drawback of the example code above is it does not preserve the ordering of pancakes. This might be a problem if children like to track their “own” pancakes. In those cases the [`Balance`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Balance.html "akka.stream.javadsl.Balance")[`Balance`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Balance$.html "akka.stream.scaladsl.Balance") and [`Merge`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Merge.html "akka.stream.javadsl.Merge")[`Merge`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Merge$.html "akka.stream.scaladsl.Merge") operators should be replaced by round\-robin balancing and merging operators which put in and take out pancakes in a strict order.

A more detailed example of creating a worker pool can be found in the cookbook: [Balancing jobs to a fixed pool of workers](stream-cookbook.html#cookbook-balance)

## Combining pipelining and parallel processing

The two concurrency patterns that we demonstrated as means to increase throughput are not exclusive. In fact, it is rather simple to combine the two approaches and streams provide a nice unifying language to express and compose them.

First, let’s look at how we can parallelize pipelined operators. In the case of pancakes this means that we will employ two chefs, each working using Roland’s pipelining method, but we use the two chefs in parallel, just like Patrik used the two frying pans. This is how it looks like if expressed as streams:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowParallelismDocSpec.scala#L75-L86 "Go to snippet source")val pancakeChef: Flow[ScoopOfBatter, Pancake, NotUsed] =
  Flow.fromGraph(GraphDSL.create() { implicit builder =>
    val dispatchBatter = builder.add(Balance[ScoopOfBatter](2))
    val mergePancakes = builder.add(Merge[Pancake](2))

    // Using two pipelines, having two frying pans each, in total using
    // four frying pans
    dispatchBatter.out(0) ~> fryingPan1.async ~> fryingPan2.async ~> mergePancakes.in(0)
    dispatchBatter.out(1) ~> fryingPan1.async ~> fryingPan2.async ~> mergePancakes.in(1)

    FlowShape(dispatchBatter.in, mergePancakes.out)
  })
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowParallelismDocTest.java#L92-L113 "Go to snippet source")Flow<ScoopOfBatter, Pancake, NotUsed> pancakeChef =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<Pancake, Pancake> mergePancakes = b.add(Merge.create(2));
              final UniformFanOutShape<ScoopOfBatter, ScoopOfBatter> dispatchBatter =
                  b.add(Balance.create(2));

              // Using two pipelines, having two frying pans each, in total using
              // four frying pans
              b.from(dispatchBatter.out(0))
                  .via(b.add(fryingPan1.async()))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(0));

              b.from(dispatchBatter.out(1))
                  .via(b.add(fryingPan1.async()))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(1));

              return FlowShape.of(dispatchBatter.in(), mergePancakes.out());
            }));
```

The above pattern works well if there are many independent jobs that do not depend on the results of each other, but the jobs themselves need multiple processing steps where each step builds on the result of the previous one. In our case individual pancakes do not depend on each other, they can be cooked in parallel, on the other hand it is not possible to fry both sides of the same pancake at the same time, so the two sides have to be fried in sequence.

It is also possible to organize parallelized operators into pipelines. This would mean employing four chefs:

- the first two chefs prepare half\-cooked pancakes from batter, in parallel, then putting those on a large enough flat surface.
- the second two chefs take these and fry their other side in their own pans, then they put the pancakes on a shared plate.

This is again straightforward to implement with the streams API:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowParallelismDocSpec.scala#L92-L118 "Go to snippet source")val pancakeChefs1: Flow[ScoopOfBatter, HalfCookedPancake, NotUsed] =
  Flow.fromGraph(GraphDSL.create() { implicit builder =>
    val dispatchBatter = builder.add(Balance[ScoopOfBatter](2))
    val mergeHalfPancakes = builder.add(Merge[HalfCookedPancake](2))

    // Two chefs work with one frying pan for each, half-frying the pancakes then putting
    // them into a common pool
    dispatchBatter.out(0) ~> fryingPan1.async ~> mergeHalfPancakes.in(0)
    dispatchBatter.out(1) ~> fryingPan1.async ~> mergeHalfPancakes.in(1)

    FlowShape(dispatchBatter.in, mergeHalfPancakes.out)
  })

val pancakeChefs2: Flow[HalfCookedPancake, Pancake, NotUsed] =
  Flow.fromGraph(GraphDSL.create() { implicit builder =>
    val dispatchHalfPancakes = builder.add(Balance[HalfCookedPancake](2))
    val mergePancakes = builder.add(Merge[Pancake](2))

    // Two chefs work with one frying pan for each, finishing the pancakes then putting
    // them into a common pool
    dispatchHalfPancakes.out(0) ~> fryingPan2.async ~> mergePancakes.in(0)
    dispatchHalfPancakes.out(1) ~> fryingPan2.async ~> mergePancakes.in(1)

    FlowShape(dispatchHalfPancakes.in, mergePancakes.out)
  })

val kitchen: Flow[ScoopOfBatter, Pancake, NotUsed] = pancakeChefs1.via(pancakeChefs2)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowParallelismDocTest.java#L120-L163 "Go to snippet source")Flow<ScoopOfBatter, HalfCookedPancake, NotUsed> pancakeChefs1 =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<HalfCookedPancake, HalfCookedPancake> mergeHalfCooked =
                  b.add(Merge.create(2));
              final UniformFanOutShape<ScoopOfBatter, ScoopOfBatter> dispatchBatter =
                  b.add(Balance.create(2));

              // Two chefs work with one frying pan for each, half-frying the pancakes then
              // putting
              // them into a common pool
              b.from(dispatchBatter.out(0))
                  .via(b.add(fryingPan1.async()))
                  .toInlet(mergeHalfCooked.in(0));
              b.from(dispatchBatter.out(1))
                  .via(b.add(fryingPan1.async()))
                  .toInlet(mergeHalfCooked.in(1));

              return FlowShape.of(dispatchBatter.in(), mergeHalfCooked.out());
            }));

Flow<HalfCookedPancake, Pancake, NotUsed> pancakeChefs2 =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<Pancake, Pancake> mergePancakes = b.add(Merge.create(2));
              final UniformFanOutShape<HalfCookedPancake, HalfCookedPancake>
                  dispatchHalfCooked = b.add(Balance.create(2));

              // Two chefs work with one frying pan for each, finishing the pancakes then
              // putting
              // them into a common pool
              b.from(dispatchHalfCooked.out(0))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(0));
              b.from(dispatchHalfCooked.out(1))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(1));

              return FlowShape.of(dispatchHalfCooked.in(), mergePancakes.out());
            }));

Flow<ScoopOfBatter, Pancake, NotUsed> kitchen = pancakeChefs1.via(pancakeChefs2);
```

This usage pattern is less common but might be usable if a certain step in the pipeline might take wildly different times to finish different jobs. The reason is that there are more balance\-merge steps in this pattern compared to the parallel pipelines. This pattern rebalances after each step, while the previous pattern only balances at the entry point of the pipeline. This only matters however if the processing time distribution has a large deviation.

> [\[1]](#^1) Roland’s reason for this seemingly suboptimal procedure is that he prefers the temperature of the second pan to be slightly lower than the first in order to achieve a more homogeneous result.

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}"
}
```

### Example 4: Pipelining

```scala
// Takes a scoop of batter and creates a pancake with one side cooked
val fryingPan1: Flow[ScoopOfBatter, HalfCookedPancake, NotUsed] =
  Flow[ScoopOfBatter].map { batter =>
    HalfCookedPancake()
  }

// Finishes a half-cooked pancake
val fryingPan2: Flow[HalfCookedPancake, Pancake, NotUsed] =
  Flow[HalfCookedPancake].map { halfCooked =>
    Pancake()
  }

  // With the two frying pans we can fully cook pancakes
  val pancakeChef: Flow[ScoopOfBatter, Pancake, NotUsed] =
    Flow[ScoopOfBatter].via(fryingPan1.async).via(fryingPan2.async)
```

### Example 5: Pipelining

```java
Flow<ScoopOfBatter, HalfCookedPancake, NotUsed> fryingPan1 =
    Flow.of(ScoopOfBatter.class).map(batter -> new HalfCookedPancake());

Flow<HalfCookedPancake, Pancake, NotUsed> fryingPan2 =
    Flow.of(HalfCookedPancake.class).map(halfCooked -> new Pancake());

  // With the two frying pans we can fully cook pancakes
  Flow<ScoopOfBatter, Pancake, NotUsed> pancakeChef = fryingPan1.async().via(fryingPan2.async());
```

### Example 6: Parallel processing

```scala
val fryingPan: Flow[ScoopOfBatter, Pancake, NotUsed] =
  Flow[ScoopOfBatter].map { batter =>
    Pancake()
  }

val pancakeChef: Flow[ScoopOfBatter, Pancake, NotUsed] = Flow.fromGraph(GraphDSL.create() { implicit builder =>
  val dispatchBatter = builder.add(Balance[ScoopOfBatter](2))
  val mergePancakes = builder.add(Merge[Pancake](2))

  // Using two frying pans in parallel, both fully cooking a pancake from the batter.
  // We always put the next scoop of batter to the first frying pan that becomes available.
  dispatchBatter.out(0) ~> fryingPan.async ~> mergePancakes.in(0)
  // Notice that we used the "fryingPan" flow without importing it via builder.add().
  // Flows used this way are auto-imported, which in this case means that the two
  // uses of "fryingPan" mean actually different stages in the graph.
  dispatchBatter.out(1) ~> fryingPan.async ~> mergePancakes.in(1)

  FlowShape(dispatchBatter.in, mergePancakes.out)
})
```

### Example 7: Parallel processing

```java
Flow<ScoopOfBatter, Pancake, NotUsed> fryingPan =
    Flow.of(ScoopOfBatter.class).map(batter -> new Pancake());

Flow<ScoopOfBatter, Pancake, NotUsed> pancakeChef =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<Pancake, Pancake> mergePancakes = b.add(Merge.create(2));
              final UniformFanOutShape<ScoopOfBatter, ScoopOfBatter> dispatchBatter =
                  b.add(Balance.create(2));

              // Using two frying pans in parallel, both fully cooking a pancake from the
              // batter.
              // We always put the next scoop of batter to the first frying pan that becomes
              // available.
              b.from(dispatchBatter.out(0))
                  .via(b.add(fryingPan.async()))
                  .toInlet(mergePancakes.in(0));
              // Notice that we used the "fryingPan" flow without importing it via
              // builder.add().
              // Flows used this way are auto-imported, which in this case means that the two
              // uses of "fryingPan" mean actually different stages in the graph.
              b.from(dispatchBatter.out(1))
                  .via(b.add(fryingPan.async()))
                  .toInlet(mergePancakes.in(1));

              return FlowShape.of(dispatchBatter.in(), mergePancakes.out());
            }));
```

### Example 8: Combining pipelining and parallel processing

```scala
val pancakeChef: Flow[ScoopOfBatter, Pancake, NotUsed] =
  Flow.fromGraph(GraphDSL.create() { implicit builder =>
    val dispatchBatter = builder.add(Balance[ScoopOfBatter](2))
    val mergePancakes = builder.add(Merge[Pancake](2))

    // Using two pipelines, having two frying pans each, in total using
    // four frying pans
    dispatchBatter.out(0) ~> fryingPan1.async ~> fryingPan2.async ~> mergePancakes.in(0)
    dispatchBatter.out(1) ~> fryingPan1.async ~> fryingPan2.async ~> mergePancakes.in(1)

    FlowShape(dispatchBatter.in, mergePancakes.out)
  })
```

### Example 9: Combining pipelining and parallel processing

```java
Flow<ScoopOfBatter, Pancake, NotUsed> pancakeChef =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<Pancake, Pancake> mergePancakes = b.add(Merge.create(2));
              final UniformFanOutShape<ScoopOfBatter, ScoopOfBatter> dispatchBatter =
                  b.add(Balance.create(2));

              // Using two pipelines, having two frying pans each, in total using
              // four frying pans
              b.from(dispatchBatter.out(0))
                  .via(b.add(fryingPan1.async()))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(0));

              b.from(dispatchBatter.out(1))
                  .via(b.add(fryingPan1.async()))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(1));

              return FlowShape.of(dispatchBatter.in(), mergePancakes.out());
            }));
```

### Example 10: Combining pipelining and parallel processing

```scala
val pancakeChefs1: Flow[ScoopOfBatter, HalfCookedPancake, NotUsed] =
  Flow.fromGraph(GraphDSL.create() { implicit builder =>
    val dispatchBatter = builder.add(Balance[ScoopOfBatter](2))
    val mergeHalfPancakes = builder.add(Merge[HalfCookedPancake](2))

    // Two chefs work with one frying pan for each, half-frying the pancakes then putting
    // them into a common pool
    dispatchBatter.out(0) ~> fryingPan1.async ~> mergeHalfPancakes.in(0)
    dispatchBatter.out(1) ~> fryingPan1.async ~> mergeHalfPancakes.in(1)

    FlowShape(dispatchBatter.in, mergeHalfPancakes.out)
  })

val pancakeChefs2: Flow[HalfCookedPancake, Pancake, NotUsed] =
  Flow.fromGraph(GraphDSL.create() { implicit builder =>
    val dispatchHalfPancakes = builder.add(Balance[HalfCookedPancake](2))
    val mergePancakes = builder.add(Merge[Pancake](2))

    // Two chefs work with one frying pan for each, finishing the pancakes then putting
    // them into a common pool
    dispatchHalfPancakes.out(0) ~> fryingPan2.async ~> mergePancakes.in(0)
    dispatchHalfPancakes.out(1) ~> fryingPan2.async ~> mergePancakes.in(1)

    FlowShape(dispatchHalfPancakes.in, mergePancakes.out)
  })

val kitchen: Flow[ScoopOfBatter, Pancake, NotUsed] = pancakeChefs1.via(pancakeChefs2)
```

### Example 11: Combining pipelining and parallel processing

```java
Flow<ScoopOfBatter, HalfCookedPancake, NotUsed> pancakeChefs1 =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<HalfCookedPancake, HalfCookedPancake> mergeHalfCooked =
                  b.add(Merge.create(2));
              final UniformFanOutShape<ScoopOfBatter, ScoopOfBatter> dispatchBatter =
                  b.add(Balance.create(2));

              // Two chefs work with one frying pan for each, half-frying the pancakes then
              // putting
              // them into a common pool
              b.from(dispatchBatter.out(0))
                  .via(b.add(fryingPan1.async()))
                  .toInlet(mergeHalfCooked.in(0));
              b.from(dispatchBatter.out(1))
                  .via(b.add(fryingPan1.async()))
                  .toInlet(mergeHalfCooked.in(1));

              return FlowShape.of(dispatchBatter.in(), mergeHalfCooked.out());
            }));

Flow<HalfCookedPancake, Pancake, NotUsed> pancakeChefs2 =
    Flow.fromGraph(
        GraphDSL.create(
            b -> {
              final UniformFanInShape<Pancake, Pancake> mergePancakes = b.add(Merge.create(2));
              final UniformFanOutShape<HalfCookedPancake, HalfCookedPancake>
                  dispatchHalfCooked = b.add(Balance.create(2));

              // Two chefs work with one frying pan for each, finishing the pancakes then
              // putting
              // them into a common pool
              b.from(dispatchHalfCooked.out(0))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(0));
              b.from(dispatchHalfCooked.out(1))
                  .via(b.add(fryingPan2.async()))
                  .toInlet(mergePancakes.in(1));

              return FlowShape.of(dispatchHalfCooked.in(), mergePancakes.out());
            }));

Flow<ScoopOfBatter, Pancake, NotUsed> kitchen = pancakeChefs1.via(pancakeChefs2);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Merge$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Balance.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Merge.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-cookbook.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-rate.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-refs.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-testkit.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/stream/stream-parallelism.html](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-parallelism.html)*