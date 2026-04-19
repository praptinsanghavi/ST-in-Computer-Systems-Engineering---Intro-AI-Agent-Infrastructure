---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html
title: Basics and working with Flows • Akka core
---

# Basics and working with Flows • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Basics and working with Flows

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

## Core concepts

Akka Streams is a library to process and transfer a sequence of elements using bounded buffer space. This latter property is what we refer to as *boundedness*, and it is the defining feature of Akka Streams. Translated to everyday terms, it is possible to express a chain (or as we see later, graphs) of processing entities. Each of these entities executes independently (and possibly concurrently) from the others while only buffering a limited number of elements at any given time. This property of bounded buffers is one of the differences from the actor model, where each actor usually has an unbounded, or a bounded, but dropping mailbox. Akka Stream processing entities have bounded “mailboxes” that do not drop.

Before we move on, let’s define some basic terminology which will be used throughout the entire documentation:

Stream
An active process that involves moving and transforming data.
Element
An element is the processing unit of streams. All operations transform and transfer elements from upstream to downstream. Buffer sizes are always expressed as number of elements independently from the actual size of the elements.
Back\-pressure
 
A means of flow\-control, a way for consumers of data to notify a producer about their current availability, effectively slowing down the upstream producer to match their consumption speeds. In the context of Akka Streams back\-pressure is always understood as *non\-blocking* and *asynchronous*.
Non\-Blocking
 
Means that a certain operation does not hinder the progress of the calling thread, even if it takes a long time to finish the requested operation.
Graph
A description of a stream processing topology, defining the pathways through which elements shall flow when the stream is running.
Operator
The common name for all building blocks that build up a Graph. Examples of operators are `map()`, `filter()`, custom ones extending [`GraphStage`s](stream-customize.html) and graph junctions like `Merge` or `Broadcast`. For the full list of built\-in operators see the [operator index](operators/index.html)

When we talk about *asynchronous, non\-blocking backpressure*, we mean that the operators available in Akka Streams will not use blocking calls but asynchronous message passing to exchange messages between each other. This way they can slow down a fast producer without blocking its thread. This is a thread\-pool friendly design, since entities that need to wait (a fast producer waiting on a slow consumer) will not block the thread but can hand it back for further use to an underlying thread\-pool.

## Defining and running streams

Linear processing pipelines can be expressed in Akka Streams using the following core abstractions:

Source
An operator with *exactly one output*, emitting data elements whenever downstream operators are ready to receive them.
Sink
An operator with *exactly one input*, requesting and accepting data elements, possibly slowing down the upstream producer of elements.
Flow
An operator which has *exactly one input and output*, which connects its upstream and downstream by transforming the data elements flowing through it.
RunnableGraph
A Flow that has both ends “attached” to a Source and Sink respectively, and is ready to be `run()`.

It is possible to attach a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") to a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") resulting in a composite source, and it is also possible to prepend a `Flow` to a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") to get a new sink. After a stream is properly constructed by having both a source and a sink, it will be represented by the [`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph")[`RunnableGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html "akka.stream.scaladsl.RunnableGraph") type, indicating that it is ready to be executed.

It is important to remember that even after constructing the `RunnableGraph` by connecting all the source, sink and different operators, no data will flow through it until it is materialized. Materialization is the process of allocating all resources needed to run the computation described by a Graph (in Akka Streams this will often involve starting up Actors). Thanks to Flows being a description of the processing pipeline they are *immutable, thread\-safe, and freely shareable*, which means that it is for example safe to share and send them between actors, to have one actor prepare the work, and then have it be materialized at some completely different place in the code.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L40-L48 "Go to snippet source")val source = Source(1 to 10)
val sink = Sink.fold[Int, Int](0)(_ + _)

// connect the Source to the Sink, obtaining a RunnableGraph
val runnable: RunnableGraph[Future[Int]] = source.toMat(sink)(Keep.right)

// materialize the flow and get the value of the sink
val sum: Future[Int] = runnable.run()

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L69-L78 "Go to snippet source")final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
// note that the Future is scala.concurrent.Future
final Sink<Integer, CompletionStage<Integer>> sink = Sink.fold(0, Integer::sum);

// connect the Source to the Sink, obtaining a RunnableFlow
final RunnableGraph<CompletionStage<Integer>> runnable = source.toMat(sink, Keep.right());

// materialize the flow
final CompletionStage<Integer> sum = runnable.run(system);
```

After running (materializing) the `RunnableGraph[T]` we get back the materialized value of type T. Every stream operator can produce a materialized value, and it is the responsibility of the user to combine them to a new type. In the above example, we used [`toMat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#toMat[Mat2,Mat3](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(combine:(Mat,Mat2)=%3EMat3):akka.stream.scaladsl.RunnableGraph[Mat3] "akka.stream.scaladsl.Source") to indicate that we want to transform the materialized value of the source and sink, and we used the convenience function [`Keep.right`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Keep$.html#right[L,R]:(L,R)=%3ER "akka.stream.scaladsl.Keep") to say that we are only interested in the materialized value of the sink.

In our example, the [`Sink.fold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#fold[U,T](zero:U)(f:(U,T)=>U):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[U]] "akka.stream.scaladsl.Sink") materializes a value of type [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future") which will represent the result of the folding process over the stream. In general, a stream can expose multiple materialized values, but it is quite common to be interested in only the value of the Source or the Sink in the stream. For this reason there is a convenience method called `runWith()` available for [`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink"), [`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") or [`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") requiring, respectively, a supplied `Source` (in order to run a `Sink`), a `Sink` (in order to run a `Source`) or both a `Source` and a `Sink` (in order to run a `Flow`, since it has neither attached yet).

After running (materializing) the [`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph") we get a special container object, the `MaterializedMap`. Both sources and sinks are able to put specific objects into this map. Whether they put something in or not is implementation dependent. 

For example, a [`Sink.fold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink$.html#fold(java.lang.Object,akka.japi.function.Function2) "akka.stream.javadsl.Sink") will make a [`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") available in this map which will represent the result of the folding process over the stream. In general, a stream can expose multiple materialized values, but it is quite common to be interested in only the value of the Source or the Sink in the stream. For this reason there is a convenience method called `runWith()` available for [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink"), [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source") or [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow") requiring, respectively, a supplied `Source` (in order to run a `Sink`), a `Sink` (in order to run a `Source`) or both a `Source` and a `Sink` (in order to run a `Flow`, since it has neither attached yet).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L54-L58 "Go to snippet source")val source = Source(1 to 10)
val sink = Sink.fold[Int, Int](0)(_ + _)

// materialize the flow, getting the Sink's materialized value
val sum: Future[Int] = source.runWith(sink)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L88-L93 "Go to snippet source")final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
final Sink<Integer, CompletionStage<Integer>> sink = Sink.fold(0, Integer::sum);

// materialize the flow, getting the Sink's materialized value
final CompletionStage<Integer> sum = source.runWith(sink, system);
```

It is worth pointing out that since operators are *immutable*, connecting them returns a new operator, instead of modifying the existing instance, so while constructing long flows, remember to assign the new value to a variable or run it:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L29-L34 "Go to snippet source")val source = Source(1 to 10)
source.map(_ => 0) // has no effect on source, since it's immutable
source.runWith(Sink.fold(0)(_ + _)) // 55

val zeroes = source.map(_ => 0) // returns new Source[Int], with `map()` appended
zeroes.runWith(Sink.fold(0)(_ + _)) // 0
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L51-L59 "Go to snippet source")final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
source.map(x -> 0); // has no effect on source, since it's immutable
source.runWith(Sink.fold(0, Integer::sum), system); // 55

// returns new Source<Integer>, with `map()` appended
final Source<Integer, NotUsed> zeroes = source.map(x -> 0);
final Sink<Integer, CompletionStage<Integer>> fold = Sink.fold(0, Integer::sum);
zeroes.runWith(fold, system); // 0
```

Note
By default, Akka Streams elements support **exactly one** downstream operator. Making fan\-out (supporting multiple downstream operators) an explicit opt\-in feature allows default stream elements to be less complex and more efficient. Also, it allows for greater flexibility on *how exactly* to handle the multicast scenarios, by providing named fan\-out elements such as broadcast (signals all down\-stream elements) or balance (signals one of available down\-stream elements).

In the above example we used the `runWith` method, which both materializes the stream and returns the materialized value of the given sink or source.

Since a stream can be materialized multiple times, the materialized value will also be calculated anew `MaterializedMap` returned is different for each such materialization, usually leading to different values being returned each time. In the example below, we create two running materialized instances of the stream that we described in the `runnable` variable. Both materializations give us a different [`Future`](http://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html "scala.concurrent.Future")[`CompletionStage`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html "java.util.concurrent.CompletionStage") from the map even though we used the same `sink` to refer to the future:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L64-L73 "Go to snippet source")// connect the Source to the Sink, obtaining a RunnableGraph
val sink = Sink.fold[Int, Int](0)(_ + _)
val runnable: RunnableGraph[Future[Int]] =
  Source(1 to 10).toMat(sink)(Keep.right)

// get the materialized value of the sink
val sum1: Future[Int] = runnable.run()
val sum2: Future[Int] = runnable.run()

// sum1 and sum2 are different Futures!
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L103-L112 "Go to snippet source")// connect the Source to the Sink, obtaining a RunnableGraph
final Sink<Integer, CompletionStage<Integer>> sink = Sink.fold(0, Integer::sum);
final RunnableGraph<CompletionStage<Integer>> runnable =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).toMat(sink, Keep.right());

// get the materialized value of the FoldSink
final CompletionStage<Integer> sum1 = runnable.run(system);
final CompletionStage<Integer> sum2 = runnable.run(system);

// sum1 and sum2 are different Futures!
```

### Defining sources, sinks and flows

The objects [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") define various ways to create sources and sinks of elements. The following examples show some of the most useful constructs (refer to the API documentation for more details):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L97-L121 "Go to snippet source")// Create a source from an Iterable
Source(List(1, 2, 3))

// Create a source from a Future
Source.future(Future.successful("Hello Streams!"))

// Create a source from a single element
Source.single("only one element")

// an empty source
Source.empty

// Sink that folds over the stream and returns a Future
// of the final result as its materialized value
Sink.fold[Int, Int](0)(_ + _)

// Sink that returns a Future as its materialized value,
// containing the first element of the stream
Sink.head

// A Sink that consumes a stream without doing anything with the elements
Sink.ignore

// A Sink that executes a side-effecting call for every element of the stream
Sink.foreach[String](println(_))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L144-L172 "Go to snippet source")// Create a source from an Iterable
List<Integer> list = new LinkedList<>();
list.add(1);
list.add(2);
list.add(3);
Source.from(list);

// Create a source form a Future
Source.future(Futures.successful("Hello Streams!"));

// Create a source from a single element
Source.single("only one element");

// an empty source
Source.empty();

// Sink that folds over the stream and returns a Future
// of the final result in the MaterializedMap
Sink.fold(0, Integer::sum);

// Sink that returns a Future in the MaterializedMap,
// containing the first element of the stream
Sink.head();

// A Sink that consumes a stream without doing anything with the elements
Sink.ignore();

// A Sink that executes a side-effecting call for every element of the stream
Sink.foreach(System.out::println);
```

There are various ways to wire up different parts of a stream, the following examples show some of the available options:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L127-L142 "Go to snippet source")// Explicitly creating and wiring up a Source, Sink and Flow
Source(1 to 6).via(Flow[Int].map(_ * 2)).to(Sink.foreach(println(_)))

// Starting from a Source
val source = Source(1 to 6).map(_ * 2)
source.to(Sink.foreach(println(_)))

// Starting from a Sink
val sink: Sink[Int, NotUsed] = Flow[Int].map(_ * 2).to(Sink.foreach(println(_)))
Source(1 to 6).to(sink)

// Broadcast to a sink inline
val otherSink: Sink[Int, NotUsed] =
  Flow[Int].alsoTo(Sink.foreach(println(_))).to(Sink.ignore)
Source(1 to 6).to(otherSink)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L179-L192 "Go to snippet source")// Explicitly creating and wiring up a Source, Sink and Flow
Source.from(Arrays.asList(1, 2, 3, 4))
    .via(Flow.of(Integer.class).map(elem -> elem * 2))
    .to(Sink.foreach(System.out::println));

// Starting from a Source
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4)).map(elem -> elem * 2);
source.to(Sink.foreach(System.out::println));

// Starting from a Sink
final Sink<Integer, NotUsed> sink =
    Flow.of(Integer.class).map(elem -> elem * 2).to(Sink.foreach(System.out::println));
Source.from(Arrays.asList(1, 2, 3, 4)).to(sink);
```

### Illegal stream elements

In accordance to the Reactive Streams specification ([Rule 2\.13](https://github.com/reactive-streams/reactive-streams-jvm#2.13)) Akka Streams do not allow `null` to be passed through the stream as an element. In case you want to model the concept of absence of a value we recommend using [`scala.Option`](http://www.scala-lang.org/api/2.13.17/scala/Option.html "scala.Option") or [`scala.util.Either`](http://www.scala-lang.org/api/2.13.17/scala/util/Either.html "scala.util.Either")[`java.util.Optional`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html "java.util.Optional") which is available since Java 8.

## Back\-pressure explained

Akka Streams implement an asynchronous non\-blocking back\-pressure protocol standardised by the [Reactive Streams](https://www.reactive-streams.org/) specification, which Akka is a founding member of.

The user of the library does not have to write any explicit back\-pressure handling code — it is built in and dealt with automatically by all of the provided Akka Streams operators. It is possible however to add explicit buffer operators with overflow strategies that can influence the behavior of the stream. This is especially important in complex processing graphs which may even contain loops (which *must* be treated with very special care, as explained in [Graph cycles, liveness and deadlocks](stream-graphs.html#graph-cycles)).

The back pressure protocol is defined in terms of the number of elements a downstream `Subscriber` is able to receive and buffer, referred to as `demand`. The source of data, referred to as `Publisher` in Reactive Streams terminology and implemented as [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") in Akka Streams, guarantees that it will never emit more elements than the received total demand for any given `Subscriber`.

Note
The Reactive Streams specification defines its protocol in terms of `Publisher` and `Subscriber`. These types are **not** meant to be user facing API, instead they serve as the low\-level building blocks for different Reactive Streams implementations.

Akka Streams implements these concepts as [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"), [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") (referred to as `Processor` in Reactive Streams) and [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") without exposing the Reactive Streams interfaces directly. If you need to integrate with other Reactive Stream libraries, read [Integrating with Reactive Streams](reactive-streams-interop.html).

The mode in which Reactive Streams back\-pressure works can be colloquially described as “dynamic push / pull mode”, since it will switch between push and pull based back\-pressure models depending on the downstream being able to cope with the upstream production rate or not.

To illustrate this further let us consider both problem situations and how the back\-pressure protocol handles them:

### Slow Publisher, fast Subscriber

This is the happy case – we do not need to slow down the Publisher in this case. However signalling rates are rarely constant and could change at any point in time, suddenly ending up in a situation where the Subscriber is now slower than the Publisher. In order to safeguard from these situations, the back\-pressure protocol must still be enabled during such situations, however we do not want to pay a high penalty for this safety net being enabled.

The Reactive Streams protocol solves this by asynchronously signalling from the Subscriber to the Publisher `Request(n:Int)` `Request(int n)` signals. The protocol guarantees that the Publisher will never signal *more* elements than the signalled demand. Since the Subscriber however is currently faster, it will be signalling these Request messages at a higher rate (and possibly also batching together the demand \- requesting multiple elements in one Request signal). This means that the Publisher should not ever have to wait (be back\-pressured) with publishing its incoming elements.

As we can see, in this scenario we effectively operate in so called push\-mode since the Publisher can continue producing elements as fast as it can, since the pending demand will be recovered just\-in\-time while it is emitting elements.

### Fast Publisher, slow Subscriber

This is the case when back\-pressuring the `Publisher` is required, because the `Subscriber` is not able to cope with the rate at which its upstream would like to emit data elements.

Since the `Publisher` is not allowed to signal more elements than the pending demand signalled by the `Subscriber`, it will have to abide to this back\-pressure by applying one of the below strategies:

- not generate elements, if it is able to control their production rate,
- try buffering the elements in a *bounded* manner until more demand is signalled,
- drop elements until more demand is signalled,
- tear down the stream if unable to apply any of the above strategies.

As we can see, this scenario effectively means that the `Subscriber` will *pull* the elements from the Publisher – this mode of operation is referred to as pull\-based back\-pressure.

## Stream Materialization

When constructing flows and graphs in Akka Streams think of them as preparing a blueprint, an execution plan. Stream materialization is the process of taking a stream description ([`RunnableGraph`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html "akka.stream.javadsl.RunnableGraph")[`RunnableGraph`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html "akka.stream.scaladsl.RunnableGraph")) and allocating all the necessary resources it needs in order to run. In the case of Akka Streams this often means starting up Actors which power the processing, but is not restricted to that—it could also mean opening files or socket connections etc.—depending on what the stream needs.

Materialization is triggered at so called “terminal operations”. Most notably this includes the various forms of the `run()` and `runWith()` methods defined on [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") elements as well as a small number of special syntactic sugars for running with well\-known sinks, such as `runForeach(el => ...)``runForeach(el -> ...)` (being an alias to `runWith(Sink.foreach(el => ...))``runWith(Sink.foreach(el -> ...))`).

Materialization is performed synchronously on the materializing thread by an [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") global [`Materializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer"). The actual stream processing is handled by actors started up during the streams materialization, which will be running on the thread pools they have been configured to run on. By default, the thread pool used is the dispatcher set on the `ActorSystem` config, but it is possible set other thread pools by providing [`Attributes`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes.html "akka.stream.Attributes")[`Attributes`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html "akka.stream.Attributes") to

- the stream to be materialized
- creating a custom instance of [`Materializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer") with `defaultAttributes`

Note
Reusing *instances* of linear computation operators (Source, Sink, Flow) inside composite Graphs is legal, yet will materialize that operator multiple times.

### Operator Fusion

By default, Akka Streams will fuse the stream operators. This means that the processing steps of a flow or stream can be executed within the same Actor and has two consequences:

- passing elements from one operator to the next is a lot faster between fused operators due to avoiding the asynchronous messaging overhead
- fused stream operators do not run in parallel to each other, meaning that only up to one CPU core is used for each fused part

To allow for parallel processing you will have to insert asynchronous boundaries manually into your flows and operators by way of adding [`Attributes.asyncBoundary`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$.html#asyncBoundary:akka.stream.Attributes "akka.stream.Attributes")[`Attributes.asyncBoundary`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html#asyncBoundary() "akka.stream.Attributes") using the method `async` on [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"), [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") and [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") to operators that shall communicate with the downstream of the graph in an asynchronous fashion.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L223 "Go to snippet source")Source(List(1, 2, 3)).map(_ + 1).async.map(_ * 2).to(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L293 "Go to snippet source")Source.range(1, 3).map(x -> x + 1).async().map(x -> x * 2).to(Sink.ignore());
```

In this example we create two regions within the flow which will be executed in one Actor each—assuming that adding and multiplying integers is an extremely costly operation this will lead to a performance gain since two CPUs can work on the tasks in parallel. It is important to note that asynchronous boundaries are not singular places within a flow where elements are passed asynchronously (as in other streaming libraries), but instead attributes always work by adding information to the flow graph that has been constructed up to this point:

![asyncBoundary.png](../images/asyncBoundary.png)

This means that everything that is inside the red bubble will be executed by one actor and everything outside of it by another. This scheme can be applied successively, always having one such boundary enclose the previous ones plus all operators that have been added since then.

Warning
Without fusing (i.e. up to version 2\.0\-M2\) each stream operator had an implicit input buffer that holds a few elements for efficiency reasons. If your flow graphs contain cycles then these buffers may have been crucial in order to avoid deadlocks. With fusing these implicit buffers are no longer there, data elements are passed without buffering between fused operators. In those cases where buffering is needed in order to allow the stream to run at all, you will have to insert explicit buffers with the `.buffer()` operator—typically a buffer of size 2 is enough to allow a feedback loop to function.

### Combining materialized values

Since every operator in Akka Streams can provide a materialized value after being materialized, it is necessary to somehow express how these values should be composed to a final value when we plug these operators together. For this, many operator methods have variants that take an additional argument, a function, that will be used to combine the resulting values. Some examples of using these combiners are illustrated in the example below.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L158-L217 "Go to snippet source")// A source that can be signalled explicitly from the outside
val source: Source[Int, Promise[Option[Int]]] = Source.maybe[Int]

// A flow that internally throttles elements to 1/second, and returns a Cancellable
// which can be used to shut down the stream
val flow: Flow[Int, Int, Cancellable] = throttler

// A sink that returns the first element of a stream in the returned Future
val sink: Sink[Int, Future[Int]] = Sink.head[Int]

// By default, the materialized value of the leftmost stage is preserved
val r1: RunnableGraph[Promise[Option[Int]]] = source.via(flow).to(sink)

// Simple selection of materialized values by using Keep.right
val r2: RunnableGraph[Cancellable] = source.viaMat(flow)(Keep.right).to(sink)
val r3: RunnableGraph[Future[Int]] = source.via(flow).toMat(sink)(Keep.right)

// Using runWith will always give the materialized values of the stages added
// by runWith() itself
val r4: Future[Int] = source.via(flow).runWith(sink)
val r5: Promise[Option[Int]] = flow.to(sink).runWith(source)
val r6: (Promise[Option[Int]], Future[Int]) = flow.runWith(source, sink)

// Using more complex combinations
val r7: RunnableGraph[(Promise[Option[Int]], Cancellable)] =
  source.viaMat(flow)(Keep.both).to(sink)

val r8: RunnableGraph[(Promise[Option[Int]], Future[Int])] =
  source.via(flow).toMat(sink)(Keep.both)

val r9: RunnableGraph[((Promise[Option[Int]], Cancellable), Future[Int])] =
  source.viaMat(flow)(Keep.both).toMat(sink)(Keep.both)

val r10: RunnableGraph[(Cancellable, Future[Int])] =
  source.viaMat(flow)(Keep.right).toMat(sink)(Keep.both)

// It is also possible to map over the materialized values. In r9 we had a
// doubly nested pair, but we want to flatten it out
val r11: RunnableGraph[(Promise[Option[Int]], Cancellable, Future[Int])] =
  r9.mapMaterializedValue {
    case ((promise, cancellable), future) =>
      (promise, cancellable, future)
  }

// Now we can use pattern matching to get the resulting materialized values
val (promise, cancellable, future) = r11.run()

// Type inference works as expected
promise.success(None)
cancellable.cancel()
future.map(_ + 3)

// The result of r11 can be also achieved by using the Graph API
val r12: RunnableGraph[(Promise[Option[Int]], Cancellable, Future[Int])] =
  RunnableGraph.fromGraph(GraphDSL.createGraph(source, flow, sink)((_, _, _)) { implicit builder => (src, f, dst) =>
    import GraphDSL.Implicits._
    src ~> f ~> dst
    ClosedShape
  })

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L211-L262 "Go to snippet source")  
// An empty source that can be shut down explicitly from the outside
Source<Integer, CompletableFuture<Optional<Integer>>> source = Source.<Integer>maybe();

// A flow that internally throttles elements to 1/second, and returns a Cancellable
// which can be used to shut down the stream
Flow<Integer, Integer, Cancellable> flow = throttler;

// A sink that returns the first element of a stream in the returned Future
Sink<Integer, CompletionStage<Integer>> sink = Sink.head();

// By default, the materialized value of the leftmost stage is preserved
RunnableGraph<CompletableFuture<Optional<Integer>>> r1 = source.via(flow).to(sink);

// Simple selection of materialized values by using Keep.right
RunnableGraph<Cancellable> r2 = source.viaMat(flow, Keep.right()).to(sink);
RunnableGraph<CompletionStage<Integer>> r3 = source.via(flow).toMat(sink, Keep.right());

// Using runWith will always give the materialized values of the stages added
// by runWith() itself
CompletionStage<Integer> r4 = source.via(flow).runWith(sink, system);
CompletableFuture<Optional<Integer>> r5 = flow.to(sink).runWith(source, system);
Pair<CompletableFuture<Optional<Integer>>, CompletionStage<Integer>> r6 =
    flow.runWith(source, sink, system);

// Using more complex combinations
RunnableGraph<Pair<CompletableFuture<Optional<Integer>>, Cancellable>> r7 =
    source.viaMat(flow, Keep.both()).to(sink);

RunnableGraph<Pair<CompletableFuture<Optional<Integer>>, CompletionStage<Integer>>> r8 =
    source.via(flow).toMat(sink, Keep.both());

RunnableGraph<
        Pair<Pair<CompletableFuture<Optional<Integer>>, Cancellable>, CompletionStage<Integer>>>
    r9 = source.viaMat(flow, Keep.both()).toMat(sink, Keep.both());

RunnableGraph<Pair<Cancellable, CompletionStage<Integer>>> r10 =
    source.viaMat(flow, Keep.right()).toMat(sink, Keep.both());

// It is also possible to map over the materialized values. In r9 we had a
// doubly nested pair, but we want to flatten it out

RunnableGraph<Cancellable> r11 =
    r9.mapMaterializedValue(
        (nestedTuple) -> {
          CompletableFuture<Optional<Integer>> p = nestedTuple.first().first();
          Cancellable c = nestedTuple.first().second();
          CompletionStage<Integer> f = nestedTuple.second();

          // Picking the Cancellable, but we could  also construct a domain class here
          return c;
        });
```

Note
In Graphs it is possible to access the materialized value from inside the stream. For details see [Accessing the materialized value inside the Graph](stream-graphs.html#graph-matvalue).

### Source pre\-materialization

There are situations in which you require a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") materialized value **before** the `Source` gets hooked up to the rest of the graph. This is particularly useful in the case of “materialized value powered” `Source`s, like `Source.queue`, `Source.actorRef` or `Source.maybe`.

By using the [`preMaterialize`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#preMaterialize(akka.stream.Materializer) "akka.stream.javadsl.Source")[`preMaterialize`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#preMaterialize()(implicitmaterializer:akka.stream.Materializer):(Mat,Source.this.ReprMat[Out,akka.NotUsed]) "akka.stream.scaladsl.Source") operator on a `Source`, you can obtain its materialized value and another `Source`. The latter can be used to consume messages from the original `Source`. Note that this can be materialized multiple times.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L229-L242 "Go to snippet source")val completeWithDone: PartialFunction[Any, CompletionStrategy] = { case Done => CompletionStrategy.immediately }
val matValuePoweredSource =
  Source.actorRef[String](
    completionMatcher = completeWithDone,
    failureMatcher = PartialFunction.empty,
    bufferSize = 100,
    overflowStrategy = OverflowStrategy.fail)

val (actorRef, source) = matValuePoweredSource.preMaterialize()

actorRef ! "Hello!"

// pass source around for materialization
source.runWith(Sink.foreach(println))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L269-L287 "Go to snippet source")Source<String, ActorRef> matValuePoweredSource =
    Source.actorRef(
        elem -> {
          // complete stream immediately if we send it Done
          if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
          else return Optional.empty();
        },
        // never fail the stream because of a message
        elem -> Optional.empty(),
        100,
        OverflowStrategy.fail());

Pair<ActorRef, Source<String, NotUsed>> actorRefSourcePair =
    matValuePoweredSource.preMaterialize(system);

actorRefSourcePair.first().tell("Hello!", ActorRef.noSender());

// pass source around for materialization
actorRefSourcePair.second().runWith(Sink.foreach(System.out::println), system);
```

## Stream ordering

In Akka Streams almost all computation operators *preserve input order* of elements. This means that if inputs `{IA1,IA2,...,IAn}` “cause” outputs `{OA1,OA2,...,OAk}` and inputs `{IB1,IB2,...,IBm}` “cause” outputs `{OB1,OB2,...,OBl}` and all of `IAi` happened before all `IBi` then `OAi` happens before `OBi`.

This property is even upheld by async operations such as [`mapAsync`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsync(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapAsync`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsync[T](parallelism:Int)(f:Out=%3Escala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source"), however an unordered version exists called [`mapAsyncUnordered`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapAsyncUnordered(int,akka.japi.function.Function) "akka.stream.javadsl.Source")[`mapAsyncUnordered`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") which does not preserve this ordering.

However, in the case of Junctions which handle multiple input streams (e.g. `Merge`) the output order is, in general, *not defined* for elements arriving on different input ports. That is a merge\-like operation may emit `Ai` before emitting `Bi`, and it is up to its internal logic to decide the order of emitted elements. Specialized elements such as `Zip` however *do guarantee* their outputs order, as each output element depends on all upstream elements having been signalled already – thus the ordering in the case of zipping is defined by this property.

If you find yourself in need of fine grained control over order of emitted elements in fan\-in scenarios consider using `MergePreferred`, `MergePrioritized` or [`GraphStage`](stream-customize.html) – which gives you full control over how the merge is performed.

## Actor Materializer Lifecycle

The [`Materializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer") is a component that is responsible for turning the stream blueprint into a running stream and emitting the “materialized value”. An [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") wide `Materializer` is provided by the Akka `Extension` [`SystemMaterializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/SystemMaterializer.html "akka.stream.SystemMaterializer")[`SystemMaterializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/SystemMaterializer.html "akka.stream.SystemMaterializer") by having an implicit `ActorSystem` in scopepassing the `ActorSystem` to the various `run` methods this way there is no need to worry about the `Materializer` unless there are special requirements.

One use case that may require a custom instance of `Materializer` is when all streams materialized in an actor should be tied to the Actor lifecycle and stop if the Actor stops or crashes. 

An important aspect of working with streams and actors is understanding a `Materializer`’s life\-cycle. The materializer is bound to the lifecycle of the [`ActorRefFactory`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html "akka.actor.ActorRefFactory")[`ActorRefFactory`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html "akka.actor.ActorRefFactory") it is created from, which in practice will be either an [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") or [`ActorContext`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html "akka.actor.ActorContext")[`ActorContext`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html "akka.actor.ActorContext") (when the materializer is created within an [`Actor`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor")[`Actor`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor")). 

Tying it to the `ActorSystem` should be replaced with using the system materializer from Akka 2\.6 and on.

When run by the system materializer the streams will run until the `ActorSystem` is shut down. When the materializer is shut down *before* the streams have run to completion, they will be terminated abruptly. This is a little different than the usual way to terminate streams, which is by cancelling/completing them. The stream lifecycles are bound to the materializer like this to prevent leaks, and in normal operations you should not rely on the mechanism and rather use [`KillSwitch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch")[`KillSwitch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch") or normal completion signals to manage the lifecycles of your streams. 

If we look at the following example, where we create the `Materializer` within an `Actor`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L250-L262 "Go to snippet source")final class RunWithMyself extends Actor {
  implicit val mat: Materializer = Materializer(context)

  Source.maybe.runWith(Sink.onComplete {
    case Success(done) => println(s"Completed: $done")
    case Failure(ex)   => println(s"Failed: ${ex.getMessage}")
  })

  def receive = {
    case "boom" =>
      context.stop(self) // will also terminate the stream
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L298-L324 "Go to snippet source")final class RunWithMyself extends AbstractActor {

  Materializer mat = Materializer.createMaterializer(context());

  @Override
  public void preStart() throws Exception {
    Source.repeat("hello")
        .runWith(
            Sink.onComplete(
                tryDone -> {
                  System.out.println("Terminated stream: " + tryDone);
                }),
            mat);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            p -> {
              // this WILL terminate the above stream as well
              context().stop(self());
            })
        .build();
  }
}
```

In the above example we used the [`ActorContext`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html "akka.actor.ActorContext")[`ActorContext`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html "akka.actor.ActorContext") to create the materializer. This binds its lifecycle to the surrounding [`Actor`](https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor")[`Actor`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html "akka.actor.Actor"). In other words, while the stream we started there would under normal circumstances run forever, if we stop the Actor it would terminate the stream as well. We have *bound the stream’s lifecycle to the surrounding actor’s lifecycle*. This is a very useful technique if the stream is closely related to the actor, e.g. when the actor represents a user or other entity, that we continuously query using the created stream – and it would not make sense to keep the stream alive when the actor has terminated already. The streams termination will be signalled by an “Abrupt termination exception” signaled by the stream.

You may also cause a `Materializer` to shut down by explicitly calling [`shutdown()`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html#shutdown():Unit "akka.stream.Materializer")[`shutdown()`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html#shutdown() "akka.stream.Materializer") on it, resulting in abruptly terminating all of the streams it has been running then. 

Sometimes, however, you may want to explicitly create a stream that will out\-last the actor’s life. For example, you are using an Akka stream to push some large stream of data to an external service. You may want to eagerly stop the Actor since it has performed all of its duties already:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowDocSpec.scala#L266-L277 "Go to snippet source")final class RunForever(implicit val mat: Materializer) extends Actor {

  Source.maybe.runWith(Sink.onComplete {
    case Success(done) => println(s"Completed: $done")
    case Failure(ex)   => println(s"Failed: ${ex.getMessage}")
  })

  def receive = {
    case "boom" =>
      context.stop(self) // will NOT terminate the stream (it's bound to the system!)
  }
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowDocTest.java#L328-L357 "Go to snippet source")final class RunForever extends AbstractActor {

  private final Materializer materializer;

  public RunForever(Materializer materializer) {
    this.materializer = materializer;
  }

  @Override
  public void preStart() throws Exception {
    Source.repeat("hello")
        .runWith(
            Sink.onComplete(
                tryDone -> {
                  System.out.println("Terminated stream: " + tryDone);
                }),
            materializer);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            p -> {
              // will NOT terminate the stream (it's bound to the system!)
              context().stop(self());
            })
        .build();
  }
```

In the above example we pass in a materializer to the Actor, which results in binding its lifecycle to the entire [`ActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") rather than the single enclosing actor. This can be useful if you want to share a materializer or group streams into specific materializers, for example because of the materializer’s settings etc.

Warning
Do not create new actor materializers inside actors by passing the [`context.system`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html#system:akka.actor.ActorSystem "akka.actor.ActorContext")[`context.system()`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html#system() "akka.actor.ActorContext") to it. This will cause a new [`Materializer`](https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer")[`Materializer`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html "akka.stream.Materializer") to be created and potentially leaked (unless you shut it down explicitly) for each such actor. It is instead recommended to either pass\-in the Materializer or create one using the actor’s `context`.

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

### Example 4: Defining and running streams

```scala
val source = Source(1 to 10)
val sink = Sink.fold[Int, Int](0)(_ + _)

// connect the Source to the Sink, obtaining a RunnableGraph
val runnable: RunnableGraph[Future[Int]] = source.toMat(sink)(Keep.right)

// materialize the flow and get the value of the sink
val sum: Future[Int] = runnable.run()
```

### Example 5: Defining and running streams

```java
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
// note that the Future is scala.concurrent.Future
final Sink<Integer, CompletionStage<Integer>> sink = Sink.fold(0, Integer::sum);

// connect the Source to the Sink, obtaining a RunnableFlow
final RunnableGraph<CompletionStage<Integer>> runnable = source.toMat(sink, Keep.right());

// materialize the flow
final CompletionStage<Integer> sum = runnable.run(system);
```

### Example 6: Defining and running streams

```scala
val source = Source(1 to 10)
val sink = Sink.fold[Int, Int](0)(_ + _)

// materialize the flow, getting the Sink's materialized value
val sum: Future[Int] = source.runWith(sink)
```

### Example 7: Defining and running streams

```java
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
final Sink<Integer, CompletionStage<Integer>> sink = Sink.fold(0, Integer::sum);

// materialize the flow, getting the Sink's materialized value
final CompletionStage<Integer> sum = source.runWith(sink, system);
```

### Example 8: Defining and running streams

```scala
val source = Source(1 to 10)
source.map(_ => 0) // has no effect on source, since it's immutable
source.runWith(Sink.fold(0)(_ + _)) // 55

val zeroes = source.map(_ => 0) // returns new Source[Int], with `map()` appended
zeroes.runWith(Sink.fold(0)(_ + _)) // 0
```

### Example 9: Defining and running streams

```java
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
source.map(x -> 0); // has no effect on source, since it's immutable
source.runWith(Sink.fold(0, Integer::sum), system); // 55

// returns new Source<Integer>, with `map()` appended
final Source<Integer, NotUsed> zeroes = source.map(x -> 0);
final Sink<Integer, CompletionStage<Integer>> fold = Sink.fold(0, Integer::sum);
zeroes.runWith(fold, system); // 0
```

### Example 10: Defining and running streams

```scala
// connect the Source to the Sink, obtaining a RunnableGraph
val sink = Sink.fold[Int, Int](0)(_ + _)
val runnable: RunnableGraph[Future[Int]] =
  Source(1 to 10).toMat(sink)(Keep.right)

// get the materialized value of the sink
val sum1: Future[Int] = runnable.run()
val sum2: Future[Int] = runnable.run()

// sum1 and sum2 are different Futures!
```

### Example 11: Defining and running streams

```java
// connect the Source to the Sink, obtaining a RunnableGraph
final Sink<Integer, CompletionStage<Integer>> sink = Sink.fold(0, Integer::sum);
final RunnableGraph<CompletionStage<Integer>> runnable =
    Source.from(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).toMat(sink, Keep.right());

// get the materialized value of the FoldSink
final CompletionStage<Integer> sum1 = runnable.run(system);
final CompletionStage<Integer> sum2 = runnable.run(system);

// sum1 and sum2 are different Futures!
```

### Example 12: Defining sources, sinks and flows

```scala
// Create a source from an Iterable
Source(List(1, 2, 3))

// Create a source from a Future
Source.future(Future.successful("Hello Streams!"))

// Create a source from a single element
Source.single("only one element")

// an empty source
Source.empty

// Sink that folds over the stream and returns a Future
// of the final result as its materialized value
Sink.fold[Int, Int](0)(_ + _)

// Sink that returns a Future as its materialized value,
// containing the first element of the stream
Sink.head

// A Sink that consumes a stream without doing anything with the elements
Sink.ignore

// A Sink that executes a side-effecting call for every element of the stream
Sink.foreach[String](println(_))
```

### Example 13: Defining sources, sinks and flows

```java
// Create a source from an Iterable
List<Integer> list = new LinkedList<>();
list.add(1);
list.add(2);
list.add(3);
Source.from(list);

// Create a source form a Future
Source.future(Futures.successful("Hello Streams!"));

// Create a source from a single element
Source.single("only one element");

// an empty source
Source.empty();

// Sink that folds over the stream and returns a Future
// of the final result in the MaterializedMap
Sink.fold(0, Integer::sum);

// Sink that returns a Future in the MaterializedMap,
// containing the first element of the stream
Sink.head();

// A Sink that consumes a stream without doing anything with the elements
Sink.ignore();

// A Sink that executes a side-effecting call for every element of the stream
Sink.foreach(System.out::println);
```

### Example 14: Defining sources, sinks and flows

```scala
// Explicitly creating and wiring up a Source, Sink and Flow
Source(1 to 6).via(Flow[Int].map(_ * 2)).to(Sink.foreach(println(_)))

// Starting from a Source
val source = Source(1 to 6).map(_ * 2)
source.to(Sink.foreach(println(_)))

// Starting from a Sink
val sink: Sink[Int, NotUsed] = Flow[Int].map(_ * 2).to(Sink.foreach(println(_)))
Source(1 to 6).to(sink)

// Broadcast to a sink inline
val otherSink: Sink[Int, NotUsed] =
  Flow[Int].alsoTo(Sink.foreach(println(_))).to(Sink.ignore)
Source(1 to 6).to(otherSink)
```

### Example 15: Defining sources, sinks and flows

```java
// Explicitly creating and wiring up a Source, Sink and Flow
Source.from(Arrays.asList(1, 2, 3, 4))
    .via(Flow.of(Integer.class).map(elem -> elem * 2))
    .to(Sink.foreach(System.out::println));

// Starting from a Source
final Source<Integer, NotUsed> source =
    Source.from(Arrays.asList(1, 2, 3, 4)).map(elem -> elem * 2);
source.to(Sink.foreach(System.out::println));

// Starting from a Sink
final Sink<Integer, NotUsed> sink =
    Flow.of(Integer.class).map(elem -> elem * 2).to(Sink.foreach(System.out::println));
Source.from(Arrays.asList(1, 2, 3, 4)).to(sink);
```

### Example 16: Operator Fusion

```scala
Source(List(1, 2, 3)).map(_ + 1).async.map(_ * 2).to(Sink.ignore)
```

### Example 17: Operator Fusion

```java
Source.range(1, 3).map(x -> x + 1).async().map(x -> x * 2).to(Sink.ignore());
```

### Example 18: Combining materialized values

```scala
// A source that can be signalled explicitly from the outside
val source: Source[Int, Promise[Option[Int]]] = Source.maybe[Int]

// A flow that internally throttles elements to 1/second, and returns a Cancellable
// which can be used to shut down the stream
val flow: Flow[Int, Int, Cancellable] = throttler

// A sink that returns the first element of a stream in the returned Future
val sink: Sink[Int, Future[Int]] = Sink.head[Int]

// By default, the materialized value of the leftmost stage is preserved
val r1: RunnableGraph[Promise[Option[Int]]] = source.via(flow).to(sink)

// Simple selection of materialized values by using Keep.right
val r2: RunnableGraph[Cancellable] = source.viaMat(flow)(Keep.right).to(sink)
val r3: RunnableGraph[Future[Int]] = source.via(flow).toMat(sink)(Keep.right)

// Using runWith will always give the materialized values of the stages added
// by runWith() itself
val r4: Future[Int] = source.via(flow).runWith(sink)
val r5: Promise[Option[Int]] = flow.to(sink).runWith(source)
val r6: (Promise[Option[Int]], Future[Int]) = flow.runWith(source, sink)

// Using more complex combinations
val r7: RunnableGraph[(Promise[Option[Int]], Cancellable)] =
  source.viaMat(flow)(Keep.both).to(sink)

val r8: RunnableGraph[(Promise[Option[Int]], Future[Int])] =
  source.via(flow).toMat(sink)(Keep.both)

val r9: RunnableGraph[((Promise[Option[Int]], Cancellable), Future[Int])] =
  source.viaMat(flow)(Keep.both).toMat(sink)(Keep.both)

val r10: RunnableGraph[(Cancellable, Future[Int])] =
  source.viaMat(flow)(Keep.right).toMat(sink)(Keep.both)

// It is also possible to map over the materialized values. In r9 we had a
// doubly nested pair, but we want to flatten it out
val r11: RunnableGraph[(Promise[Option[Int]], Cancellable, Future[Int])] =
  r9.mapMaterializedValue {
    case ((promise, cancellable), future) =>
      (promise, cancellable, future)
  }

// Now we can use pattern matching to get the resulting materialized values
val (promise, cancellable, future) = r11.run()

// Type inference works as expected
promise.success(None)
cancellable.cancel()
future.map(_ + 3)

// The result of r11 can be also achieved by using the Graph API
val r12: RunnableGraph[(Promise[Option[Int]], Cancellable, Future[Int])] =
  RunnableGraph.fromGraph(GraphDSL.createGraph(source, flow, sink)((_, _, _)) { implicit builder => (src, f, dst) =>
    import GraphDSL.Implicits._
    src ~> f ~> dst
    ClosedShape
  })
```

### Example 19: Combining materialized values

```java
// An empty source that can be shut down explicitly from the outside
Source<Integer, CompletableFuture<Optional<Integer>>> source = Source.<Integer>maybe();

// A flow that internally throttles elements to 1/second, and returns a Cancellable
// which can be used to shut down the stream
Flow<Integer, Integer, Cancellable> flow = throttler;

// A sink that returns the first element of a stream in the returned Future
Sink<Integer, CompletionStage<Integer>> sink = Sink.head();

// By default, the materialized value of the leftmost stage is preserved
RunnableGraph<CompletableFuture<Optional<Integer>>> r1 = source.via(flow).to(sink);

// Simple selection of materialized values by using Keep.right
RunnableGraph<Cancellable> r2 = source.viaMat(flow, Keep.right()).to(sink);
RunnableGraph<CompletionStage<Integer>> r3 = source.via(flow).toMat(sink, Keep.right());

// Using runWith will always give the materialized values of the stages added
// by runWith() itself
CompletionStage<Integer> r4 = source.via(flow).runWith(sink, system);
CompletableFuture<Optional<Integer>> r5 = flow.to(sink).runWith(source, system);
Pair<CompletableFuture<Optional<Integer>>, CompletionStage<Integer>> r6 =
    flow.runWith(source, sink, system);

// Using more complex combinations
RunnableGraph<Pair<CompletableFuture<Optional<Integer>>, Cancellable>> r7 =
    source.viaMat(flow, Keep.both()).to(sink);

RunnableGraph<Pair<CompletableFuture<Optional<Integer>>, CompletionStage<Integer>>> r8 =
    source.via(flow).toMat(sink, Keep.both());

RunnableGraph<
        Pair<Pair<CompletableFuture<Optional<Integer>>, Cancellable>, CompletionStage<Integer>>>
    r9 = source.viaMat(flow, Keep.both()).toMat(sink, Keep.both());

RunnableGraph<Pair<Cancellable, CompletionStage<Integer>>> r10 =
    source.viaMat(flow, Keep.right()).toMat(sink, Keep.both());

// It is also possible to map over the materialized values. In r9 we had a
// doubly nested pair, but we want to flatten it out

RunnableGraph<Cancellable> r11 =
    r9.mapMaterializedValue(
        (nestedTuple) -> {
          CompletableFuture<Optional<Integer>> p = nestedTuple.first().first();
          Cancellable c = nestedTuple.first().second();
          CompletionStage<Integer> f = nestedTuple.second();

          // Picking the Cancellable, but we could  also construct a domain class here
          return c;
        });
```

### Example 20: Source pre-materialization

```scala
val completeWithDone: PartialFunction[Any, CompletionStrategy] = { case Done => CompletionStrategy.immediately }
val matValuePoweredSource =
  Source.actorRef[String](
    completionMatcher = completeWithDone,
    failureMatcher = PartialFunction.empty,
    bufferSize = 100,
    overflowStrategy = OverflowStrategy.fail)

val (actorRef, source) = matValuePoweredSource.preMaterialize()

actorRef ! "Hello!"

// pass source around for materialization
source.runWith(Sink.foreach(println))
```

### Example 21: Source pre-materialization

```java
Source<String, ActorRef> matValuePoweredSource =
    Source.actorRef(
        elem -> {
          // complete stream immediately if we send it Done
          if (elem == Done.done()) return Optional.of(CompletionStrategy.immediately());
          else return Optional.empty();
        },
        // never fail the stream because of a message
        elem -> Optional.empty(),
        100,
        OverflowStrategy.fail());

Pair<ActorRef, Source<String, NotUsed>> actorRefSourcePair =
    matValuePoweredSource.preMaterialize(system);

actorRefSourcePair.first().tell("Hello!", ActorRef.noSender());

// pass source around for materialization
actorRefSourcePair.second().runWith(Sink.foreach(System.out::println), system);
```

### Example 22: Actor Materializer Lifecycle

```scala
final class RunWithMyself extends Actor {
  implicit val mat: Materializer = Materializer(context)

  Source.maybe.runWith(Sink.onComplete {
    case Success(done) => println(s"Completed: $done")
    case Failure(ex)   => println(s"Failed: ${ex.getMessage}")
  })

  def receive = {
    case "boom" =>
      context.stop(self) // will also terminate the stream
  }
}
```

### Example 23: Actor Materializer Lifecycle

```java
final class RunWithMyself extends AbstractActor {

  Materializer mat = Materializer.createMaterializer(context());

  @Override
  public void preStart() throws Exception {
    Source.repeat("hello")
        .runWith(
            Sink.onComplete(
                tryDone -> {
                  System.out.println("Terminated stream: " + tryDone);
                }),
            mat);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            p -> {
              // this WILL terminate the above stream as well
              context().stop(self());
            })
        .build();
  }
}
```

### Example 24: Actor Materializer Lifecycle

```scala
final class RunForever(implicit val mat: Materializer) extends Actor {

  Source.maybe.runWith(Sink.onComplete {
    case Success(done) => println(s"Completed: $done")
    case Failure(ex)   => println(s"Failed: ${ex.getMessage}")
  })

  def receive = {
    case "boom" =>
      context.stop(self) // will NOT terminate the stream (it's bound to the system!)
  }
}
```

### Example 25: Actor Materializer Lifecycle

```java
final class RunForever extends AbstractActor {

  private final Materializer materializer;

  public RunForever(Materializer materializer) {
    this.materializer = materializer;
  }

  @Override
  public void preStart() throws Exception {
    Source.repeat("hello")
        .runWith(
            Sink.onComplete(
                tryDone -> {
                  System.out.println("Terminated stream: " + tryDone);
                }),
            materializer);
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .match(
            String.class,
            p -> {
              // will NOT terminate the stream (it's bound to the system!)
              context().stop(self());
            })
        .build();
  }
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/KillSwitch.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SystemMaterializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRefFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/KillSwitch.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/SystemMaterializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/general/stream/stream-design.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/reactive-streams-interop.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-customize.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-graphs.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html](https://doc.akka.io/libraries/akka-core/current/stream/stream-flows-and-basics.html)*