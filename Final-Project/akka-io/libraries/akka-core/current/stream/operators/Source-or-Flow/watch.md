---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:43Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watch.html
title: watch • Akka core
---

# watch • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# watch

Watch a specific `ActorRef` and signal a failure downstream once the actor terminates.

[Actor interop operators](../index.html#actor-interop-operators)

## Signature

[`Source.watch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#watch(akka.actor.ActorRef) "akka.stream.javadsl.Source")[`Source.watch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#watch(ref:akka.actor.ActorRef):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.watch`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#watch(akka.actor.ActorRef) "akka.stream.javadsl.Flow")[`Flow.watch`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#watch(ref:akka.actor.ActorRef):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Watch a specific `ActorRef` and signal a failure downstream once the actor terminates. The signaled failure will be an [`WatchedActorTerminatedException`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html "akka.stream.WatchedActorTerminatedException") [`WatchedActorTerminatedException`](https://doc.akka.io/api/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html "akka.stream.WatchedActorTerminatedException").

## Example

An `ActorRef` can be can be watched and the stream will fail with `WatchedActorTerminatedException` when the actor terminates. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Watch.scala#L21-L25 "Go to snippet source")val ref: ActorRef = someActor()
val flow: Flow[String, String, NotUsed] =
  Flow[String].watch(ref).recover {
    case _: WatchedActorTerminatedException => s"$ref terminated"
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L595-L599 "Go to snippet source")final ActorRef ref = someActor();
Flow<String, String, NotUsed> flow =
    Flow.of(String.class)
        .watch(ref)
        .recover(akka.stream.WatchedActorTerminatedException.class, () -> ref + " terminated");
```

## Reactive Streams semantics

**emits** when upstream emits

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
val ref: ActorRef = someActor()
val flow: Flow[String, String, NotUsed] =
  Flow[String].watch(ref).recover {
    case _: WatchedActorTerminatedException => s"$ref terminated"
  }
```

### Example 2: Example

```java
final ActorRef ref = someActor();
Flow<String, String, NotUsed> flow =
    Flow.of(String.class)
        .watch(ref)
        .recover(akka.stream.WatchedActorTerminatedException.class, () -> ref + " terminated");
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watchTermination.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/UnzipWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watch.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watch.html)*