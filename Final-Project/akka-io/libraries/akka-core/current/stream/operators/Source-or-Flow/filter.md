---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/filter.html
title: filter • Akka core
---

# filter • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# filter

Filter the incoming elements using a predicate.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.filter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#filter(akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`Source.filter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.filter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#filter(akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.filter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Filter the incoming elements using a predicate. If the predicate returns true the element is passed downstream, if it returns false the element is discarded.

See also [`filterNot`](filterNot.html).

## Example

For example, given a `Source` of words we can select the longer words with the `filter` operator: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Filter.scala#L17-L28 "Go to snippet source")val words: Source[String, NotUsed] =
  Source(
    ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
    "ut labore et dolore magna aliqua").split(" ").toList)

val longWords: Source[String, NotUsed] = words.filter(_.length > 6)

longWords.runForeach(println)
// consectetur
// adipiscing
// eiusmod
// incididunt
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L524-L537 "Go to snippet source")Source<String, NotUsed> words =
    Source.from(
        Arrays.asList(
            ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt "
                    + "ut labore et dolore magna aliqua")
                .split(" ")));

Source<String, NotUsed> longWords = words.filter(w -> w.length() > 6);

longWords.runForeach(System.out::println, system);
// consectetur
// adipiscing
// eiusmod
// incididunt
```

## Reactive Streams semantics

**emits** when the given predicate returns true for the element

**backpressures** when the given predicate returns true for the element and downstream backpressures

**completes** when upstream completes

## API docs

[`Flow.filter`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#filter(akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.filter`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#filter(p:Out=%3EBoolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Code Examples

### Example 1: Example

```scala
val words: Source[String, NotUsed] =
  Source(
    ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
    "ut labore et dolore magna aliqua").split(" ").toList)

val longWords: Source[String, NotUsed] = words.filter(_.length > 6)

longWords.runForeach(println)
// consectetur
// adipiscing
// eiusmod
// incididunt
```

### Example 2: Example

```java
Source<String, NotUsed> words =
    Source.from(
        Arrays.asList(
            ("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt "
                    + "ut labore et dolore magna aliqua")
                .split(" ")));

Source<String, NotUsed> longWords = words.filter(w -> w.length() > 6);

longWords.runForeach(System.out::println, system);
// consectetur
// adipiscing
// eiusmod
// incididunt
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/filterNot.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/failed.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/filter.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/filter.html)*