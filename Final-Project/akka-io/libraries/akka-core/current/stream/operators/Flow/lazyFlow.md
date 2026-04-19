---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:25Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFlow.html
title: Flow.lazyFlow • Akka core
---

# Flow.lazyFlow • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.lazyFlow

Defers creation and materialization of a `Flow` until there is a first element.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.lazyFlow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#lazyFlow(akka.japi.function.Creator) "akka.stream.javadsl.Flow")[`Flow.lazyFlow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html#lazyFlow[I,O,M](create:()=>akka.stream.scaladsl.Flow[I,O,M]):akka.stream.scaladsl.Flow[I,O,scala.concurrent.Future[M]] "akka.stream.scaladsl.Flow")

## Description

Defers `Flow` creation and materialization until when the first element arrives at the `lazyFlow` from upstream. After that the stream behaves as if the nested flow replaced the `lazyFlow`. The nested `Flow` will not be created if the outer flow completes or fails before any elements arrive.

Note that asynchronous boundaries and many other operators in the stream may do pre\-fetching or trigger demand and thereby making an early element come throught the stream leading to creation of the inner flow earlier than you would expect.

The materialized value of the `Flow` is a `Future``CompletionStage` that is completed with the materialized value of the nested flow once that is constructed.

See also: 

- [flatMapPrefix](../Source-or-Flow/flatMapPrefix.html)
- [Flow.lazyFutureFlow](lazyFutureFlow.html) and [Flow.lazyCompletionStageFlow](lazyCompletionStageFlow.html)
- [Source.lazySource](../Source/lazySource.html)
- [Sink.lazySink](../Sink/lazySink.html)

## Examples

In this sample we produce a short sequence of numbers, mostly to side effect and write to standard out to see in which order things happen. Note how producing the first value in the `Source` happens before the creation of the flow:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/Lazy.scala#L20-L42 "Go to snippet source")val numbers = Source
  .unfold(0) { n =>
    val next = n + 1
    println(s"Source producing $next")
    Some((next, next))
  }
  .take(3)

val flow = Flow.lazyFlow { () =>
  println("Creating the actual flow")
  Flow[Int].map { element =>
    println(s"Actual flow mapped $element")
    element
  }
}

numbers.via(flow).run()
// prints:
// Source producing 1
// Creating the actual flow
// Actual flow mapped 1
// Source producing 2
// Actual flow mapped 2
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/Lazy.java#L24-L51 "Go to snippet source")Source<Integer, NotUsed> numbers =
    Source.unfold(
            0,
            n -> {
              int next = n + 1;
              System.out.println("Source producing " + next);
              return Optional.of(Pair.create(next, next));
            })
        .take(3);

Flow<Integer, Integer, CompletionStage<NotUsed>> flow =
    Flow.lazyFlow(
        () -> {
          System.out.println("Creating the actual flow");
          return Flow.fromFunction(
              element -> {
                System.out.println("Actual flow mapped " + element);
                return element;
              });
        });

numbers.via(flow).run(system);
// prints:
// Source producing 1
// Creating the actual flow
// Actual flow mapped 1
// Source producing 2
// Actual flow mapped 2
```

Since the factory is called once per stream materialization it can be used to safely construct a mutable object to use with the actual deferred `Flow`. In this example we fold elements into an `ArrayList` created inside the lazy flow factory:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/Lazy.scala#L48-L65 "Go to snippet source")val mutableFold = Flow.lazyFlow { () =>
  val zero = new util.ArrayList[Int]()
  Flow[Int].fold(zero) { (list, element) =>
    list.add(element)
    list
  }
}
val stream =
  Source(1 to 3).via(mutableFold).to(Sink.foreach(println))

stream.run()
stream.run()
stream.run()
// prints:
// [1, 2, 3]
// [1, 2, 3]
// [1, 2, 3]

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/Lazy.java#L57-L80 "Go to snippet source")Flow<Integer, List<Integer>, CompletionStage<NotUsed>> mutableFold =
    Flow.lazyFlow(
        () -> {
          List<Integer> zero = new ArrayList<>();

          return Flow.of(Integer.class)
              .fold(
                  zero,
                  (list, element) -> {
                    list.add(element);
                    return list;
                  });
        });

RunnableGraph<NotUsed> stream =
    Source.range(1, 3).via(mutableFold).to(Sink.foreach(System.out::println));

stream.run(system);
stream.run(system);
stream.run(system);
// prints:
// [1, 2, 3]
// [1, 2, 3]
// [1, 2, 3]
```

If we instead had used `fold` directly with an `ArrayList` we would have shared the same list across all materialization and what is even worse, unsafely across threads.

## Reactive Streams semantics

**emits** when the internal flow is successfully created and it emits

**backpressures** when the internal flow is successfully created and it backpressures

**completes** when upstream completes and all elements have been emitted from the internal flow

**completes** when upstream completes and all futures have been completed and all elements have been emitted

**cancels** when downstream cancels (keep reading) The operator’s default behaviour in case of downstream cancellation before nested flow materialization (future completion) is to cancel immediately. This behaviour can be controlled by setting the [akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested](./akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html) attribute, this will delay downstream cancellation until nested flow’s materialization which is then immediately cancelled (with the original cancellation cause).

## Code Examples

### Example 1: Examples

```scala
val numbers = Source
  .unfold(0) { n =>
    val next = n + 1
    println(s"Source producing $next")
    Some((next, next))
  }
  .take(3)

val flow = Flow.lazyFlow { () =>
  println("Creating the actual flow")
  Flow[Int].map { element =>
    println(s"Actual flow mapped $element")
    element
  }
}

numbers.via(flow).run()
// prints:
// Source producing 1
// Creating the actual flow
// Actual flow mapped 1
// Source producing 2
// Actual flow mapped 2
```

### Example 2: Examples

```java
Source<Integer, NotUsed> numbers =
    Source.unfold(
            0,
            n -> {
              int next = n + 1;
              System.out.println("Source producing " + next);
              return Optional.of(Pair.create(next, next));
            })
        .take(3);

Flow<Integer, Integer, CompletionStage<NotUsed>> flow =
    Flow.lazyFlow(
        () -> {
          System.out.println("Creating the actual flow");
          return Flow.fromFunction(
              element -> {
                System.out.println("Actual flow mapped " + element);
                return element;
              });
        });

numbers.via(flow).run(system);
// prints:
// Source producing 1
// Creating the actual flow
// Actual flow mapped 1
// Source producing 2
// Actual flow mapped 2
```

### Example 3: Examples

```scala
val mutableFold = Flow.lazyFlow { () =>
  val zero = new util.ArrayList[Int]()
  Flow[Int].fold(zero) { (list, element) =>
    list.add(element)
    list
  }
}
val stream =
  Source(1 to 3).via(mutableFold).to(Sink.foreach(println))

stream.run()
stream.run()
stream.run()
// prints:
// [1, 2, 3]
// [1, 2, 3]
// [1, 2, 3]
```

### Example 4: Examples

```java
Flow<Integer, List<Integer>, CompletionStage<NotUsed>> mutableFold =
    Flow.lazyFlow(
        () -> {
          List<Integer> zero = new ArrayList<>();

          return Flow.of(Integer.class)
              .fold(
                  zero,
                  (list, element) -> {
                    list.add(element);
                    return list;
                  });
        });

RunnableGraph<NotUsed> stream =
    Source.range(1, 3).via(mutableFold).to(Sink.foreach(System.out::println));

stream.run(system);
stream.run(system);
stream.run(system);
// prints:
// [1, 2, 3]
// [1, 2, 3]
// [1, 2, 3]
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/akka.stream.Attributes.NestedMaterializationCancellationPolicy.PropagateToNested.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyCompletionStageFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFutureFlow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/lazySink.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/flatMapPrefix.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyCompletionStageSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazyFuture.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFlow.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/lazyFlow.html)*