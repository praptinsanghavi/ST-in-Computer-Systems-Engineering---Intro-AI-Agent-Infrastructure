---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:10Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazySink.html
title: Sink.lazySink • Akka core
---

# Sink.lazySink • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Sink.lazySink

Defers creation and materialization of a `Sink` until there is a first element.

[Sink operators](../index.html#sink-operators)

## Signature

[`Sink.lazySink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html#lazySink(akka.japi.function.Creator) "akka.stream.javadsl.Sink")[`Sink.lazySink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html#lazySink[T,M](create:()=>akka.stream.scaladsl.Sink[T,M]):akka.stream.scaladsl.Sink[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Sink")

## Description

Defers `Sink` creation and materialization until when the first element arrives from upstream to the `lazySink`. After that the stream behaves as if the nested sink replaced the `lazySink`. The nested `Sink` will not be created if upstream completes or fails without any elements arriving at the sink.

The materialized value of the `Sink` is a `Future``CompletionStage` that is completed with the materialized value of the nested sink once that is constructed.

Can be combined with [prefixAndTail](../Source-or-Flow/prefixAndTail.html) to base the sink on the first element.

See also: 

- [Sink.lazyFutureSink](lazyFutureSink.html) and [lazyCompletionStageSink](lazyCompletionStageSink.html).
- [Source.lazySource](../Source/lazySource.html)
- [Flow.lazyFlow](../Flow/lazyFlow.html)

## Examples

In this example we side effect from `Flow.map`, the sink factory and `Sink.foreach` so that the order becomes visible, the nested sink is only created once the element has passed `map`: 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sink/Lazy.scala#L18-L38 "Go to snippet source")val matVal =
  Source
    .maybe[String]
    .map { element =>
      println(s"mapped $element")
      element
    }
    .toMat(Sink.lazySink { () =>
      println("Sink created")
      Sink.foreach(elem => println(s"foreach $elem"))
    })(Keep.left)
    .run()

// some time passes
// nothing has been printed
matVal.success(Some("one"))
// now prints:
// mapped one
// Sink created
// foreach one

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sink/Lazy.java#L20-L43 "Go to snippet source")CompletionStage<Optional<String>> matVal =
    Source.<String>maybe()
        .map(
            element -> {
              System.out.println("mapped " + element);
              return element;
            })
        .toMat(
            Sink.lazySink(
                () -> {
                  System.out.println("Sink created");
                  return Sink.foreach(elem -> System.out.println("foreach " + elem));
                }),
            Keep.left())
        .run(system);

// some time passes
// nothing has been printed
matVal.toCompletableFuture().complete(Optional.of("one"));
// now prints:
// mapped one
// Sink created
// foreach one

```

## Reactive Streams semantics

**cancels** if the future fails or if the created sink cancels 

**backpressures** when initialized and when created sink backpressures

## Code Examples

### Example 1: Examples

```scala
val matVal =
  Source
    .maybe[String]
    .map { element =>
      println(s"mapped $element")
      element
    }
    .toMat(Sink.lazySink { () =>
      println("Sink created")
      Sink.foreach(elem => println(s"foreach $elem"))
    })(Keep.left)
    .run()

// some time passes
// nothing has been printed
matVal.success(Some("one"))
// now prints:
// mapped one
// Sink created
// foreach one
```

### Example 2: Examples

```java
CompletionStage<Optional<String>> matVal =
    Source.<String>maybe()
        .map(
            element -> {
              System.out.println("mapped " + element);
              return element;
            })
        .toMat(
            Sink.lazySink(
                () -> {
                  System.out.println("Sink created");
                  return Sink.foreach(elem -> System.out.println("foreach " + elem));
                }),
            Keep.left())
        .run(system);

// some time passes
// nothing has been printed
matVal.toCompletableFuture().complete(Optional.of("one"));
// now prints:
// mapped one
// Sink created
// foreach one
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyCompletionStageSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazyFutureSink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prefixAndTail.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySingle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazySink.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazySink.html)*