---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:41Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-substream.html
title: Substreams • Akka core
---

# Substreams • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Substreams

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

Substreams are represented as [`SubSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubSource.html "akka.stream.javadsl.SubSource") or [`SubFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html "akka.stream.javadsl.SubFlow")[`SubFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SubFlow.html "akka.stream.scaladsl.SubFlow") instances, on which you can multiplex a single [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") or [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") into a stream of streams.

SubFlows cannot contribute to the super\-flow’s materialized value since they are materialized later, during the runtime of the stream processing.

operators that create substreams are listed on [Nesting and flattening operators](operators/index.html#nesting-and-flattening-operators)

## Nesting operators

### groupBy

A typical operation that generates substreams is [`groupBy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#groupBy(int,akka.japi.function.Function,boolean) "akka.stream.javadsl.Source")[`groupBy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#groupBy[K](maxSubstreams:Int,f:Out=%3EK,allowClosedSubstreamRecreation:Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source").

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L18 "Go to snippet source")val source = Source(1 to 10).groupBy(3, _ % 3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L35 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).groupBy(3, elem -> elem % 3);
```

![stream-substream-groupBy1.png](../../images/stream-substream-groupBy1.png)

This operation splits the incoming stream into separate output streams, one for each element key. The key is computed for each element using the given function, which is `f` in the above diagram. When a new key is encountered for the first time a new substream is opened and subsequently fed with all elements belonging to that key. If `allowClosedSubstreamRecreation` is set to `true` a substream belonging to a specific key will be recreated if it was closed before, otherwise elements belonging to that key will be dropped.

If you add a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") or [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") right after the `groupBy` operator, all transformations are applied to all encountered substreams in the same fashion. So, if you add the following `Sink`, that is added to each of the substreams as in the below diagram.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L22 "Go to snippet source")Source(1 to 10).groupBy(3, _ % 3).to(Sink.ignore).run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L39-L42 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .to(Sink.ignore())
    .run(system);
```

![stream-substream-groupBy2.png](../../images/stream-substream-groupBy2.png)

Also substreams, more precisely, [`SubFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html "akka.stream.javadsl.SubFlow")[`SubFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SubFlow.html "akka.stream.scaladsl.SubFlow") and [`SubSource`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubSource.html "akka.stream.javadsl.SubSource") have methods that allow you to merge or concat substreams into the main stream again.

The [`mergeSubstreams`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html#mergeSubstreams() "akka.stream.javadsl.SubFlow")[`mergeSubstreams`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SubFlow.html#mergeSubstreams:F[Out] "akka.stream.scaladsl.SubFlow") method merges an unbounded number of substreams back to the main stream.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L26 "Go to snippet source")Source(1 to 10).groupBy(3, _ % 3).mergeSubstreams.runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L46-L49 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .mergeSubstreams()
    .runWith(Sink.ignore(), system);
```

![stream-substream-groupBy3.png](../../images/stream-substream-groupBy3.png)

You can limit the number of active substreams running and being merged at a time, with either the [`mergeSubstreamsWithParallelism`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html#mergeSubstreamsWithParallelism(int) "akka.stream.javadsl.SubFlow")[`mergeSubstreamsWithParallelism`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SubFlow.html#mergeSubstreamsWithParallelism(parallelism:Int):F[Out] "akka.stream.scaladsl.SubFlow") or [`concatSubstreams`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html#concatSubstreams() "akka.stream.javadsl.SubFlow")[`concatSubstreams`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SubFlow.html#concatSubstreams:F[Out] "akka.stream.scaladsl.SubFlow") method.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L30-L33 "Go to snippet source")Source(1 to 10).groupBy(3, _ % 3).mergeSubstreamsWithParallelism(2).runWith(Sink.ignore)

//concatSubstreams is equivalent to mergeSubstreamsWithParallelism(1)
Source(1 to 10).groupBy(3, _ % 3).concatSubstreams.runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L53-L61 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .mergeSubstreamsWithParallelism(2)
    .runWith(Sink.ignore(), system);
// concatSubstreams is equivalent to mergeSubstreamsWithParallelism(1)
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .concatSubstreams()
    .runWith(Sink.ignore(), system);
```

However, since the number of running (i.e. not yet completed) substreams is capped, be careful so that these methods do not cause deadlocks with back pressure like in the below diagram.

Element one and two leads to two created substreams, but since the number of substreams are capped to 2 when element 3 comes in it cannot lead to creation of a new substream until one of the previous two are completed and this leads to the stream being deadlocked.

![stream-substream-groupBy4.png](../../images/stream-substream-groupBy4.png)

### splitWhen and splitAfter

[`splitWhen`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#splitWhen(akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`splitWhen`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#splitWhen(p:Out=%3EBoolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") and [`splitAfter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#splitAfter(akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`splitAfter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#splitAfter(p:Out=%3EBoolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") are two other operations which generate substreams.

The difference from [`groupBy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#groupBy(int,akka.japi.function.Function,boolean) "akka.stream.javadsl.Source")[`groupBy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#groupBy[K](maxSubstreams:Int,f:Out=%3EK,allowClosedSubstreamRecreation:Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") is that, if the predicate for `splitWhen` and `splitAfter` returns true, a new substream is generated, and the succeeding elements after split will flow into the new substream.

`splitWhen` flows the element on which the predicate returned true to a new substream, whereas `splitAfter` flows the next element to the new substream after the element on which predicate returned true.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L39-L41 "Go to snippet source")Source(1 to 10).splitWhen(SubstreamCancelStrategy.drain)(_ == 3)

Source(1 to 10).splitAfter(SubstreamCancelStrategy.drain)(_ == 3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L68-L70 "Go to snippet source")Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).splitWhen(elem -> elem == 3);

Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).splitAfter(elem -> elem == 3);
```

These are useful when you scanned over something and you don’t need to care about anything behind it. A typical example is counting the number of characters for each line like below.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L45-L56 "Go to snippet source")val text =
  "This is the first line.\n" +
  "The second line.\n" +
  "There is also the 3rd line\n"

val charCount = Source(text.toList)
  .splitAfter { _ == '\n' }
  .filter(_ != '\n')
  .map(_ => 1)
  .reduce(_ + _)
  .to(Sink.foreach(println))
  .run()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L74-L84 "Go to snippet source")String text =
    "This is the first line.\n" + "The second line.\n" + "There is also the 3rd line\n";

Source.from(Arrays.asList(text.split("")))
    .map(x -> x.charAt(0))
    .splitAfter(x -> x == '\n')
    .filter(x -> x != '\n')
    .map(x -> 1)
    .reduce((x, y) -> x + y)
    .to(Sink.foreach(x -> System.out.println(x)))
    .run(system);
```

This prints out the following output.

```
23
16
26

```

![stream-substream-splitWhen-splitAfter.png](../../images/stream-substream-splitWhen-splitAfter.png)

## Flattening operators

### flatMapConcat

[`flatMapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#flatMapConcat(akka.japi.function.Function) "akka.stream.javadsl.Source")[`flatMapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#flatMapConcat[T,M](f:Out=%3Eakka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") and [`flatMapMerge`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#flatMapMerge(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`flatMapMerge`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#flatMapMerge[T,M](breadth:Int,f:Out=%3Eakka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") are substream operations different from [`groupBy`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#groupBy(int,akka.japi.function.Function,boolean) "akka.stream.javadsl.Source")[`groupBy`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#groupBy[K](maxSubstreams:Int,f:Out=%3EK,allowClosedSubstreamRecreation:Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "akka.stream.scaladsl.Source") and `splitWhen/After`.

`flatMapConcat` takes a function, which is `f` in the following diagram. The function `f` of `flatMapConcat` transforms each input element into a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that is then flattened into the output stream by concatenation.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L62 "Go to snippet source")Source(1 to 2).flatMapConcat(i => Source(List.fill(3)(i))).runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L92-L94 "Go to snippet source")Source.from(Arrays.asList(1, 2))
    .flatMapConcat(i -> Source.from(Arrays.asList(i, i, i)))
    .runWith(Sink.ignore(), system);
```

![stream-substream-flatMapConcat1.png](../../images/stream-substream-flatMapConcat1.png)

Like the `concat` operation on [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow"), it fully consumes one [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") after the other. So, there is only one substream actively running at a given time.

Then once the active substream is fully consumed, the next substream can start running. Elements from all the substreams are concatenated to the sink.

![stream-substream-flatMapConcat2.png](../../images/stream-substream-flatMapConcat2.png)

### flatMapMerge

`flatMapMerge` is similar to `flatMapConcat`, but it doesn’t wait for one `Source` to be fully consumed. Instead, up to `breadth` number of streams emit elements at any given time.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/SubstreamDocSpec.scala#L66 "Go to snippet source")Source(1 to 2).flatMapMerge(2, i => Source(List.fill(3)(i))).runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/SubstreamDocTest.java#L98-L100 "Go to snippet source")Source.from(Arrays.asList(1, 2))
    .flatMapMerge(2, i -> Source.from(Arrays.asList(i, i, i)))
    .runWith(Sink.ignore(), system);
```

![stream-substream-flatMapMerge.png](../../images/stream-substream-flatMapMerge.png)

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

### Example 4: groupBy

```scala
val source = Source(1 to 10).groupBy(3, _ % 3)
```

### Example 5: groupBy

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).groupBy(3, elem -> elem % 3);
```

### Example 6: groupBy

```scala
Source(1 to 10).groupBy(3, _ % 3).to(Sink.ignore).run()
```

### Example 7: groupBy

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .to(Sink.ignore())
    .run(system);
```

### Example 8: groupBy

```scala
Source(1 to 10).groupBy(3, _ % 3).mergeSubstreams.runWith(Sink.ignore)
```

### Example 9: groupBy

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .mergeSubstreams()
    .runWith(Sink.ignore(), system);
```

### Example 10: groupBy

```scala
Source(1 to 10).groupBy(3, _ % 3).mergeSubstreamsWithParallelism(2).runWith(Sink.ignore)

//concatSubstreams is equivalent to mergeSubstreamsWithParallelism(1)
Source(1 to 10).groupBy(3, _ % 3).concatSubstreams.runWith(Sink.ignore)
```

### Example 11: groupBy

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .mergeSubstreamsWithParallelism(2)
    .runWith(Sink.ignore(), system);
// concatSubstreams is equivalent to mergeSubstreamsWithParallelism(1)
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
    .groupBy(3, elem -> elem % 3)
    .concatSubstreams()
    .runWith(Sink.ignore(), system);
```

### Example 12: splitWhen and splitAfter

```scala
Source(1 to 10).splitWhen(SubstreamCancelStrategy.drain)(_ == 3)

Source(1 to 10).splitAfter(SubstreamCancelStrategy.drain)(_ == 3)
```

### Example 13: splitWhen and splitAfter

```java
Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).splitWhen(elem -> elem == 3);

Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).splitAfter(elem -> elem == 3);
```

### Example 14: splitWhen and splitAfter

```scala
val text =
  "This is the first line.\n" +
  "The second line.\n" +
  "There is also the 3rd line\n"

val charCount = Source(text.toList)
  .splitAfter { _ == '\n' }
  .filter(_ != '\n')
  .map(_ => 1)
  .reduce(_ + _)
  .to(Sink.foreach(println))
  .run()
```

### Example 15: splitWhen and splitAfter

```java
String text =
    "This is the first line.\n" + "The second line.\n" + "There is also the 3rd line\n";

Source.from(Arrays.asList(text.split("")))
    .map(x -> x.charAt(0))
    .splitAfter(x -> x == '\n')
    .filter(x -> x != '\n')
    .map(x -> 1)
    .reduce((x, y) -> x + y)
    .to(Sink.foreach(x -> System.out.println(x)))
    .run(system);
```

### Example 16: splitWhen and splitAfter

```text
23
16
26
```

### Example 17: flatMapConcat

```scala
Source(1 to 2).flatMapConcat(i => Source(List.fill(3)(i))).runWith(Sink.ignore)
```

### Example 18: flatMapConcat

```java
Source.from(Arrays.asList(1, 2))
    .flatMapConcat(i -> Source.from(Arrays.asList(i, i, i)))
    .runWith(Sink.ignore(), system);
```

### Example 19: flatMapMerge

```scala
Source(1 to 2).flatMapMerge(2, i => Source(List.fill(3)(i))).runWith(Sink.ignore)
```

### Example 20: flatMapMerge

```java
Source.from(Arrays.asList(1, 2))
    .flatMapMerge(2, i -> Source.from(Arrays.asList(i, i, i)))
    .runWith(Sink.ignore(), system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SubFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubFlow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SubSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-cookbook.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-testkit.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/stream-substream.html](https://doc.akka.io/libraries/akka-core/current/stream/stream-substream.html)*