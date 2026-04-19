---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:05Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/combine.html
title: Sink.combine • Akka core
---

# Sink.combine • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.combine

Combine several sinks into one using a user specified strategy

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.combine`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#combine(akka.stream.javadsl.Sink,akka.stream.javadsl.Sink,java.util.List,akka.japi.function.Function) "akka.stream.javadsl.Sink")[`Sink.combine`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#combine[T,U](first:akka.stream.scaladsl.Sink[U,_],second:akka.stream.scaladsl.Sink[U,_],rest:akka.stream.scaladsl.Sink[U,_]*)(strategy:Int=>akka.stream.Graph[akka.stream.UniformFanOutShape[T,U],akka.NotUsed]):akka.stream.scaladsl.Sink[T,akka.NotUsed] "akka.stream.scaladsl.Sink")

## Description

Combine several sinks into one using a user specified strategy

## Example

This example shows how to combine multiple sinks with a Fan\-out Junction.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/StreamPartialGraphDSLDocSpec.scala#L118-L123 "Go to snippet source")val sendRemotely = Sink.actorRef(actorRef, "Done", _ => "Failed")
val localProcessing = Sink.foreach[Int](_ => /* do something useful */ ())

val sink = Sink.combine(sendRemotely, localProcessing)(Broadcast[Int](_))

Source(List(0, 1, 2)).runWith(sink)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/StreamPartialGraphDSLDocTest.java#L174-L183 "Go to snippet source")Sink<Integer, NotUsed> sendRemotely = Sink.actorRef(actorRef, "Done");
Sink<Integer, CompletionStage<Done>> localProcessing =
    Sink.<Integer>foreach(
        a -> {
          /*do something useful*/
        });
Sink<Integer, NotUsed> sinks =
    Sink.combine(sendRemotely, localProcessing, new ArrayList<>(), a -> Broadcast.create(a));

Source.<Integer>from(Arrays.asList(new Integer[] {0, 1, 2})).runWith(sinks, system);
```

## Reactive Streams semantics

**cancels** depends on the strategy

**backpressures** depends on the strategy

## Code Examples

### Example 1: Example

```scala
val sendRemotely = Sink.actorRef(actorRef, "Done", _ => "Failed")
val localProcessing = Sink.foreach[Int](_ => /* do something useful */ ())

val sink = Sink.combine(sendRemotely, localProcessing)(Broadcast[Int](_))

Source(List(0, 1, 2)).runWith(sink)
```

### Example 2: Example

```java
Sink<Integer, NotUsed> sendRemotely = Sink.actorRef(actorRef, "Done");
Sink<Integer, CompletionStage<Done>> localProcessing =
    Sink.<Integer>foreach(
        a -> {
          /*do something useful*/
        });
Sink<Integer, NotUsed> sinks =
    Sink.combine(sendRemotely, localProcessing, new ArrayList<>(), a -> Broadcast.create(a));

Source.<Integer>from(Arrays.asList(new Integer[] {0, 1, 2})).runWith(sinks, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/combine.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/completionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/combine.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/combine.html)*