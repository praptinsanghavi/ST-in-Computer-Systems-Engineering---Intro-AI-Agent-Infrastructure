---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:42Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapMerge.html
title: flatMapMerge • Akka core
---

# flatMapMerge • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# flatMapMerge

Transform each input element into a `Source` whose elements are then flattened into the output stream through merging.

[Nesting and flattening operators](../index.html#nesting-and-flattening-operators)

## Signature

[`Flow.flatMapMerge`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#flatMapMerge(int,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.flatMapMerge`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#flatMapMerge[T,M](breadth:Int,f:Out=%3Eakka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow") 

## Description

Transform each input element into a `Source` whose elements are then flattened into the output stream through merging. The maximum number of merged sources has to be specified. When this is met `flatMapMerge` does not request any more elements meaning that it back pressures until one of the existing `Source`s completes. Order of the elements for each `Source` is preserved but there is no deterministic order between elements from different active `Source`s.

See also: [flatMapConcat](flatMapConcat.html), [mapConcat](mapConcat.html)

## Example

In the following example `flatMapMerge` is used to create a `Source` for each incoming customerId. This could, for example, be a calculation or a query to a database. There can be `breadth` active sources at any given time so events for different customers could interleave in any order but events for the same customer will be in the order emitted by the underlying `Source`;

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/FlatMapMerge.scala#L16-L29 "Go to snippet source")val source: Source[String, NotUsed] = Source(List("customer-1", "customer-2"))

// e.g. could b a query to a database
def lookupCustomerEvents(customerId: String): Source[String, NotUsed] = {
  Source(List(s"$customerId-evt-1", s"$customerId-evt2"))
}

source.flatMapMerge(10, customerId => lookupCustomerEvents(customerId)).runForeach(println)

// prints - events from different customers could interleave
// customer-1-evt-1
// customer-2-evt-1
// customer-1-evt-2
// customer-2-evt-2
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/FlatMapMerge.java#L16-L31 "Go to snippet source")// e.g. could be a query to a database
private Source<String, NotUsed> lookupCustomerEvents(String customerId) {
  return Source.from(Arrays.asList(customerId + "-evt-1", customerId + "-evt-2"));
}
  Source.from(Arrays.asList("customer-1", "customer-2"))
      .flatMapMerge(10, this::lookupCustomerEvents)
      .runForeach(System.out::println, system);
  // prints - events from different customers could interleave
  // customer-1-evt-1
  // customer-2-evt-1
  // customer-1-evt-2
  // customer-2-evt-2
```

## Reactive Streams semantics

**emits** when one of the currently consumed substreams has an element available

**backpressures** when downstream backpressures or the max number of substreams is reached

**completes** when upstream completes and all consumed substreams complete

## Code Examples

### Example 1: Example

```scala
val source: Source[String, NotUsed] = Source(List("customer-1", "customer-2"))

// e.g. could b a query to a database
def lookupCustomerEvents(customerId: String): Source[String, NotUsed] = {
  Source(List(s"$customerId-evt-1", s"$customerId-evt2"))
}

source.flatMapMerge(10, customerId => lookupCustomerEvents(customerId)).runForeach(println)

// prints - events from different customers could interleave
// customer-1-evt-1
// customer-2-evt-1
// customer-1-evt-2
// customer-2-evt-2
```

### Example 2: Example

```java
// e.g. could be a query to a database
private Source<String, NotUsed> lookupCustomerEvents(String customerId) {
  return Source.from(Arrays.asList(customerId + "-evt-1", customerId + "-evt-2"));
}
  Source.from(Arrays.asList("customer-1", "customer-2"))
      .flatMapMerge(10, this::lookupCustomerEvents)
      .runForeach(System.out::println, system);
  // prints - events from different customers could interleave
  // customer-1-evt-1
  // customer-2-evt-1
  // customer-1-evt-2
  // customer-2-evt-2
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapPrefix.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapMerge.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapMerge.html)*