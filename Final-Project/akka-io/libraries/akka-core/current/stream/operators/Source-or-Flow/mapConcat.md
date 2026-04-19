---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
title: mapConcat • Akka core
---

# mapConcat • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapConcat

Transform each element into zero or more elements that are individually passed downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.mapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapConcat(akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.mapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapConcat[T](f:Out=>scala.collection.immutable.Iterable[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.mapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mapConcat(akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.mapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mapConcat[T](f:Out=>scala.collection.immutable.Iterable[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

Transform each element into zero or more elements that are individually passed downstream. This can be used to flatten collections into individual stream elements. Returning an empty iterable results in zero elements being passed downstream rather than the stream being cancelled.

See also [statefulMapConcat](statefulMapConcat.html), [flatMapConcat](flatMapConcat.html), [flatMapMerge](flatMapMerge.html)

## Example

The following takes a stream of integers and emits each element twice downstream.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapConcat.scala#L17-L26 "Go to snippet source")def duplicate(i: Int): List[Int] = List(i, i)

Source(1 to 3).mapConcat(i => duplicate(i)).runForeach(println)
// prints:
// 1
// 1
// 2
// 2
// 3
// 3
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapConcat.java#L15-L32 "Go to snippet source")Iterable<Integer> duplicate(int i) {
  return Arrays.asList(i, i);
}

  Source.from(Arrays.asList(1, 2, 3))
      .mapConcat(i -> duplicate(i))
      .runForeach(System.out::println, system);
  // prints:
  // 1
  // 1
  // 2
  // 2
  // 3
  // 3
```

## Reactive Streams semantics

**emits** when the mapping function returns an element or there are still remaining elements from the previously calculated collection

**backpressures** when downstream backpressures or there are still available elements from the previously calculated collection

**completes** when upstream completes and all remaining elements has been emitted

## Code Examples

### Example 1: Example

```scala
def duplicate(i: Int): List[Int] = List(i, i)

Source(1 to 3).mapConcat(i => duplicate(i)).runForeach(println)
// prints:
// 1
// 1
// 2
// 2
// 3
// 3
```

### Example 2: Example

```java
Iterable<Integer> duplicate(int i) {
  return Arrays.asList(i, i);
}

  Source.from(Arrays.asList(1, 2, 3))
      .mapConcat(i -> duplicate(i))
      .runForeach(System.out::println, system);
  // prints:
  // 1
  // 1
  // 2
  // 2
  // 3
  // 3
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapMerge.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapAsyncUnordered.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapError.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html)*