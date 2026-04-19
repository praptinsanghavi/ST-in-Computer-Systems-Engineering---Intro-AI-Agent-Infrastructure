---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collectType.html
title: collectType • Akka core
---

# collectType • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# collectType

Transform this stream by testing the type of each of the elements on which the element is an instance of the provided type as they pass through this processing step.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.collectType`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#collectType(java.lang.Class) "akka.stream.javadsl.Source")[`Source.collectType`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#collectType[T](implicittag:scala.reflect.ClassTag[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.collectType`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#collectType(java.lang.Class) "akka.stream.javadsl.Flow")[`Flow.collectType`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#collectType[T](implicittag:scala.reflect.ClassTag[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Filter elements that is of a given type.

## Example

Given stream element classes `Message`, `Ping`, and `Pong`, where `Ping` extends `Message` and `Pong` is an unrelated class.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Collect.scala#L15-L17 "Go to snippet source")trait Message
final case class Ping(id: Int) extends Message
final case class Pong(id: Int)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L365-L381 "Go to snippet source")static interface Message {}

static class Ping implements Message {
  final int id;

  Ping(int id) {
    this.id = id;
  }
}

static class Pong {
  final int id;

  Pong(int id) {
    this.id = id;
  }
}
```

From a stream of `Message` elements we would like to collect all elements of type `Ping` that have an `id != 0`, and then covert to `Pong` with same id.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Collect.scala#L31-L32 "Go to snippet source")val flow: Flow[Message, Pong, NotUsed] =
  Flow[Message].collectType[Ping].filter(_.id != 0).map(p => Pong(p.id))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L397-L401 "Go to snippet source")Flow<Message, Pong, NotUsed> flow =
    Flow.of(Message.class)
        .collectType(Ping.class)
        .filter(p -> p.id != 0)
        .map(p -> new Pong(p.id));
```

## Reactive Streams semantics

**emits** when the element is of the given type

**backpressures** the element is of the given type and downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
trait Message
final case class Ping(id: Int) extends Message
final case class Pong(id: Int)
```

### Example 2: Example

```java
static interface Message {}

static class Ping implements Message {
  final int id;

  Ping(int id) {
    this.id = id;
  }
}

static class Pong {
  final int id;

  Pong(int id) {
    this.id = id;
  }
}
```

### Example 3: Example

```scala
val flow: Flow[Message, Pong, NotUsed] =
  Flow[Message].collectType[Ping].filter(_.id != 0).map(p => Pong(p.id))
```

### Example 4: Example

```java
Flow<Message, Pong, NotUsed> flow =
    Flow.of(Message.class)
        .collectType(Ping.class)
        .filter(p -> p.id != 0)
        .map(p -> new Pong(p.id));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collection.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/combine.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collectType.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collectType.html)*