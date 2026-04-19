---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapConcat.html
title: flatMapConcat • Akka core
---

# flatMapConcat • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# flatMapConcat

Transform each input element into a `Source` whose elements are then flattened into the output stream through concatenation.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Flow.flatMapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#flatMapConcat(akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.flatMapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#flatMapConcat[T,M](f:Out=:kka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow") 

## Description

Transform each input element into a `Source` whose elements are then flattened into the output stream through concatenation. This means each source is fully consumed before consumption of the next source starts. 

See also: [flatMapMerge](flatMapMerge.html), [mapConcat](mapConcat.html)

## Example

In the following example `flatMapConcat` is used to create a `Source` for each incoming customerId. This could be, for example, a calculation or a query to a database. Each customer is then passed to `lookupCustomerEvents` which returns a `Source`. All the events for a customer are delivered before moving to the next customer. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/FlatMapConcat.scala#L15-L28 "Go to snippet source")val source: Source[String, NotUsed] = Source(List("customer-1", "customer-2"))

// e.g. could b a query to a database
def lookupCustomerEvents(customerId: String): Source[String, NotUsed] = {
  Source(List(s"$customerId-event-1", s"$customerId-event-2"))
}

source.flatMapConcat(customerId => lookupCustomerEvents(customerId)).runForeach(println)

// prints - events from each customer consecutively
// customer-1-event-1
// customer-1-event-2
// customer-2-event-1
// customer-2-event-2
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/FlatMapConcat.java#L16-L31 "Go to snippet source")// e.g. could be a query to a database
private Source<String, NotUsed> lookupCustomerEvents(String customerId) {
  return Source.from(Arrays.asList(customerId + "-event-1", customerId + "-event-2"));
}
  Source.from(Arrays.asList("customer-1", "customer-2"))
      .flatMapConcat(this::lookupCustomerEvents)
      .runForeach(System.out::println, system);
  // prints - events from each customer consecutively
  // customer-1-event-1
  // customer-1-event-2
  // customer-2-event-1
  // customer-2-event-2
```

## Reactive Streams semantics

**emits** when the current consumed substream has an element available

**backpressures** when downstream backpressures

**completes** when upstream completes and all consumed substreams complete

## Code Examples

### Example 1: Example

```scala
val source: Source[String, NotUsed] = Source(List("customer-1", "customer-2"))

// e.g. could b a query to a database
def lookupCustomerEvents(customerId: String): Source[String, NotUsed] = {
  Source(List(s"$customerId-event-1", s"$customerId-event-2"))
}

source.flatMapConcat(customerId => lookupCustomerEvents(customerId)).runForeach(println)

// prints - events from each customer consecutively
// customer-1-event-1
// customer-1-event-2
// customer-2-event-1
// customer-2-event-2
```

### Example 2: Example

```java
// e.g. could be a query to a database
private Source<String, NotUsed> lookupCustomerEvents(String customerId) {
  return Source.from(Arrays.asList(customerId + "-event-1", customerId + "-event-2"));
}
  Source.from(Arrays.asList("customer-1", "customer-2"))
      .flatMapConcat(this::lookupCustomerEvents)
      .runForeach(System.out::println, system);
  // prints - events from each customer consecutively
  // customer-1-event-1
  // customer-1-event-2
  // customer-2-event-1
  // customer-2-event-2
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/filterNot.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapMerge.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapConcat.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapConcat.html)*