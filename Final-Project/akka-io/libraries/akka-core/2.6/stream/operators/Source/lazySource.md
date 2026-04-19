---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:15:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
title: Source.lazySource • Akka Documentation
---

# Source.lazySource • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Source.lazySource

Defers creation and materialization of a `Source` until there is demand.

[Source operators](../index.html#source-operators)

## Signature

[`Source.lazySource`](https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html#lazySource(akka.japi.function.Creator) "akka.stream.javadsl.Source")[`Source.lazySource`](https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source$.html#lazySource[T,M](create:()=>akka.stream.scaladsl.Source[T,M]):akka.stream.scaladsl.Source[T,scala.concurrent.Future[M]] "akka.stream.scaladsl.Source")

## Description

Defers creation and materialization of a `Source` until there is demand, then emits the elements from the source downstream just like if it had been created up front. If the stream fails or cancels before there is demand the factory will not be invoked.

Note that asynchronous boundaries and many other operators in the stream may do pre\-fetching or trigger demand earlier than you would expect.

The materialized value of the `lazy` is a `Future``CompletionStage` that is completed with the materialized value of the nested source once that is constructed.

See also:

- [Source.lazyFutureSource](lazyFutureSource.html) and [Source.lazyCompletionStageSource](lazyCompletionStageSource.html)
- [Flow.lazyFlow](../Flow/lazyFlow.html)
- [Sink.lazySink](../Sink/lazySink.html)

## Example

In this example you might expect this sample to not construct the expensive source until `.pull` is called. However, since `Sink.queue` has a buffer and will ask for that immediately on materialization the expensive source is in created quickly after the stream has been materialized:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/stream/operators/source/Lazy.scala#L20-L30 "Go to snippet source")val source = Source.lazySource { () =>
  println("Creating the actual source")
  createExpensiveSource()
}

val queue = source.runWith(Sink.queue())

// ... time passes ...
// at some point in time we pull the first time
// but the source creation may already have been triggered
queue.pull()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/stream/operators/source/Lazy.java#L28-L40 "Go to snippet source")Source<String, CompletionStage<NotUsed>> source =
    Source.lazySource(
        () -> {
          System.out.println("Creating the actual source");
          return createExpensiveSource();
        });

SinkQueueWithCancel<String> queue = source.runWith(Sink.queue(), system);

// ... time passes ...
// at some point in time we pull the first time
// but the source creation may already have been triggered
queue.pull();
```

Instead the most useful aspect of the operator is that the factory is called once per stream materialization which means that it can be used to safely construct a mutable object to use with the actual deferred source. 

In this example we make use of that by unfolding a mutable object that works like an iterator with a method to say if there are more elements and one that produces the next and moves to the next element.

If the `IteratorLikeThing` was used directly in a `Source.unfold` the same instance would end up being unsafely shared across all three materializations of the stream, but wrapping it with `Source.lazy` ensures we create a separate instance for each of the started streams:

Scala

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/scala/docs/stream/operators/source/Lazy.scala#L40-L53 "Go to snippet source")val stream = Source
  .lazySource { () =>
    val iteratorLike = new IteratorLikeThing
    Source.unfold(iteratorLike) { iteratorLike =>
      if (iteratorLike.thereAreMore) Some((iteratorLike, iteratorLike.extractNext))
      else None
    }
  }
  .to(Sink.foreach(println))

// each of the three materializations will have their own instance of IteratorLikeThing
stream.run()
stream.run()
stream.run()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.6.21/akka-docs/src/test/java/jdocs/stream/operators/source/Lazy.java#L56-L73 "Go to snippet source")RunnableGraph<CompletionStage<NotUsed>> stream =
    Source.lazySource(
            () -> {
              IteratorLikeThing instance = new IteratorLikeThing();
              return Source.unfold(
                  instance,
                  sameInstance -> {
                    if (sameInstance.thereAreMore())
                      return Optional.of(Pair.create(sameInstance, sameInstance.extractNext()));
                    else return Optional.empty();
                  });
            })
        .to(Sink.foreach(System.out::println));

// each of the three materializations will have their own instance of IteratorLikeThing
stream.run(system);
stream.run(system);
stream.run(system);
```

Note though that you can often also achieve the same using [unfoldResource](unfoldResource.html). If you have an actual `Iterator` you should prefer [fromIterator](fromIterator.html).

## Reactive Streams semantics

**emits** depends on the wrapped `Source`

**completes** depends on the wrapped `Source`

## Code Examples

### Example 1: Example

```scala
val source = Source.lazySource { () =>
  println("Creating the actual source")
  createExpensiveSource()
}

val queue = source.runWith(Sink.queue())

// ... time passes ...
// at some point in time we pull the first time
// but the source creation may already have been triggered
queue.pull()
```

### Example 2: Example

```java
Source<String, CompletionStage<NotUsed>> source =
    Source.lazySource(
        () -> {
          System.out.println("Creating the actual source");
          return createExpensiveSource();
        });

SinkQueueWithCancel<String> queue = source.runWith(Sink.queue(), system);

// ... time passes ...
// at some point in time we pull the first time
// but the source creation may already have been triggered
queue.pull();
```

### Example 3: Example

```scala
val stream = Source
  .lazySource { () =>
    val iteratorLike = new IteratorLikeThing
    Source.unfold(iteratorLike) { iteratorLike =>
      if (iteratorLike.thereAreMore) Some((iteratorLike, iteratorLike.extractNext))
      else None
    }
  }
  .to(Sink.foreach(println))

// each of the three materializations will have their own instance of IteratorLikeThing
stream.run()
stream.run()
stream.run()
```

### Example 4: Example

```java
RunnableGraph<CompletionStage<NotUsed>> stream =
    Source.lazySource(
            () -> {
              IteratorLikeThing instance = new IteratorLikeThing();
              return Source.unfold(
                  instance,
                  sameInstance -> {
                    if (sameInstance.thereAreMore())
                      return Optional.of(Pair.create(sameInstance, sameInstance.extractNext()));
                    else return Optional.empty();
                  });
            })
        .to(Sink.foreach(System.out::println));

// each of the three materializations will have their own instance of IteratorLikeThing
stream.run(system);
stream.run(system);
stream.run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.6/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Flow/lazyFlow.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Sink/lazySink.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source-or-Flow/limit.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/fromIterator.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazyCompletionStageSource.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazyFutureSource.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/unfoldResource.html
- https://doc.akka.io/libraries/akka-core/2.6/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazySource.html](https://doc.akka.io/libraries/akka-core/2.6/stream/operators/Source/lazySource.html)*