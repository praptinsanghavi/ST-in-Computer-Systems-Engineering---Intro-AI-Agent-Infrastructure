---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/from.html
title: Source.applySource.from • Akka core
---

# Source.applySource.from • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.applySource.from

Stream the values of an `immutable.Seq``Iterable`.

[Source operators](../index.html#source-operators)

## Signature

[`Source.apply`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source.apply`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#apply[T](iterable:scala.collection.immutable.Iterable[T]):akka.stream.scaladsl.Source[T,akka.NotUsed] "akka.stream.scaladsl.Source")

[`Source.from`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#from(java.lang.Iterable) "akka.stream.javadsl.Source")[`Source.from`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html "akka.stream.scaladsl.Source")

## Description

Stream the values of an `immutable.Seq``Iterable`. Make sure the `Iterable` is immutable or at least not modified after being used as a source. Otherwise the stream may fail with `ConcurrentModificationException` or other more subtle errors may occur.

## Examples

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceDocExamples.java#L9-L32 "Go to snippet source")import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.actor.testkit.typed.javadsl.ManualTime;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.stream.javadsl.Source;

import akka.actor.ActorRef;
import akka.stream.OverflowStrategy;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.testkit.TestProbe;

import akka.stream.javadsl.RunnableGraph;
import java.util.concurrent.CompletableFuture;

import java.util.Arrays;
import java.util.Optional;

Source<Integer, NotUsed> ints = Source.from(Arrays.asList(0, 1, 2, 3, 4, 5));
ints.runForeach(System.out::println, system);

String text =
    "Perfection is finally attained not when there is no longer more to add,"
        + "but when there is no longer anything to take away.";
Source<String, NotUsed> words = Source.from(Arrays.asList(text.split("\\s")));
words.runForeach(System.out::println, system);
```

## Reactive Streams semantics

**emits** the next value of the seq

**completes** when the last element of the seq has been emitted

## Code Examples

### Example 1: Examples

```java
import akka.Done;
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.actor.testkit.typed.javadsl.ManualTime;
import akka.actor.testkit.typed.javadsl.TestKitJunitResource;
import akka.stream.javadsl.Source;

import akka.actor.ActorRef;
import akka.stream.OverflowStrategy;
import akka.stream.CompletionStrategy;
import akka.stream.javadsl.Sink;
import akka.testkit.TestProbe;

import akka.stream.javadsl.RunnableGraph;
import java.util.concurrent.CompletableFuture;

import java.util.Arrays;
import java.util.Optional;

Source<Integer, NotUsed> ints = Source.from(Arrays.asList(0, 1, 2, 3, 4, 5));
ints.runForeach(System.out::println, system);

String text =
    "Perfection is finally attained not when there is no longer more to add,"
        + "but when there is no longer anything to take away.";
Source<String, NotUsed> words = Source.from(Arrays.asList(text.split("\\s")));
words.runForeach(System.out::println, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/foreachAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromCompletionStage.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/from.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/from.html)*