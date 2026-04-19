---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:16Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collect.html
title: collect • Akka core
---

# collect • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# collect

Apply a partial function to each incoming element, if the partial function is defined for a value the returned value is passed downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.collect`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#collect(scala.PartialFunction) "akka.stream.javadsl.Source")[`Source.collect`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.collect`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#collect(scala.PartialFunction) "akka.stream.javadsl.Flow")[`Flow.collect`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Apply a partial function to each incoming element, if the partial function is defined for a value the returned value is passed downstream. This can often replace `filter` followed by `map` to achieve the same in one single operator.

`collect` is supposed to be used with [`PFBuilder`](https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/PFBuilder.html "akka.japi.pf.PFBuilder")[`PFBuilder`](https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/PFBuilder.html "akka.japi.pf.PFBuilder") to construct the partial function. There is also a [collectType](collectType.html) that often can be easier to use than the `PFBuilder` and then combine with ordinary `filter` and `map` operators.

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
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Collect.scala#L22-L25 "Go to snippet source")val flow: Flow[Message, Pong, NotUsed] =
  Flow[Message].collect {
    case Ping(id) if id != 0 => Pong(id)
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L386-L391 "Go to snippet source")Flow<Message, Pong, NotUsed> flow =
    Flow.of(Message.class)
        .collect(
            new PFBuilder<Message, Pong>()
                .match(Ping.class, p -> p.id != 0, p -> new Pong(p.id))
                .build());
```

An alternative is to use `collectType`. The same conversion be written as follows, and it is as efficient.

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L397-L401 "Go to snippet source")Flow<Message, Pong, NotUsed> flow =
    Flow.of(Message.class)
        .collectType(Ping.class)
        .filter(p -> p.id != 0)
        .map(p -> new Pong(p.id));
```

## Reactive Streams semantics

**emits** when the provided partial function is defined for the element

**backpressures** the partial function is defined for the element and downstream backpressures

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
  Flow[Message].collect {
    case Ping(id) if id != 0 => Pong(id)
  }
```

### Example 4: Example

```java
Flow<Message, Pong, NotUsed> flow =
    Flow.of(Message.class)
        .collect(
            new PFBuilder<Message, Pong>()
                .match(Ping.class, p -> p.id != 0, p -> new Pong(p.id))
                .build());
```

### Example 5: Example

```java
Flow<Message, Pong, NotUsed> flow =
    Flow.of(Message.class)
        .collectType(Ping.class)
        .filter(p -> p.id != 0)
        .map(p -> new Pong(p.id));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/PFBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/cancelled.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/collect.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collectType.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collect.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/collect.html)*