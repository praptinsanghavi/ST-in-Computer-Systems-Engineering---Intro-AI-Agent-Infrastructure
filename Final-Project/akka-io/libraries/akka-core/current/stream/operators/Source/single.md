---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:00Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/single.html
title: Source.single • Akka core
---

# Source.single • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.single

Stream a single object once.

[Source operators](../index.html#source-operators)

## Signature

[`Source.single`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#single(T) "akka.stream.javadsl.Source")[`Source.single`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#single[T](element:T):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Stream a single object once and complete after thereafter.

See also:

- [`repeat`](repeat.html) Stream a single object repeatedly.
- [`tick`](tick.html) A periodical repetition of an arbitrary object.
- [`cycle`](cycle.html) Stream iterator in cycled manner.

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/SourceSpec.scala#L18-L19 "Go to snippet source")import akka.stream._

val s: Future[immutable.Seq[Int]] = Source.single(1).runWith(Sink.seq)
s.foreach(list => println(s"Collected elements: $list")) // prints: Collected elements: List(1)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/java/akka/stream/javadsl/SourceTest.java#L17 "Go to snippet source")import akka.stream.*;
CompletionStage<List<String>> future = Source.single("A").runWith(Sink.seq(), system);
CompletableFuture<List<String>> completableFuture = future.toCompletableFuture();
completableFuture.thenAccept(result -> System.out.printf("collected elements: %s\n", result));
// result list will contain exactly one element "A"

```

## Reactive Streams semantics

**emits** the value once

**completes** when the single value has been emitted

## Code Examples

### Example 1: Examples

```scala
import akka.stream._

val s: Future[immutable.Seq[Int]] = Source.single(1).runWith(Sink.seq)
s.foreach(list => println(s"Collected elements: $list")) // prints: Collected elements: List(1)
```

### Example 2: Examples

```java
import akka.stream.*;
CompletionStage<List<String>> future = Source.single("A").runWith(Sink.seq(), system);
CompletableFuture<List<String>> completableFuture = future.toCompletableFuture();
completableFuture.thenAccept(result -> System.out.printf("collected elements: %s\n", result));
// result list will contain exactly one element "A"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/PubSub/sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/setup.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/repeat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/tick.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/single.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/single.html)*