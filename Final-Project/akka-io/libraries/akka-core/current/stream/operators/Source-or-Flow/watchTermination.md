---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:36Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watchTermination.html
title: watchTermination • Akka core
---

# watchTermination • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# watchTermination

Materializes to a `Future` `CompletionStage` that will be completed with Done or failed depending whether the upstream of the operators has been completed or failed.

[Watching status operators](../index.html#watching-status-operators)

## Signature

[`Source.watchTermination`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#watchTermination(akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.watchTermination`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#watchTermination[Mat2]()(matF:(Mat,scala.concurrent.Future[akka.Done])=>Mat2):FlowOpsMat.this.ReprMat[Out,Mat2] "akka.stream.scaladsl.Source") [`Flow.watchTermination`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#watchTermination(akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.watchTermination`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#watchTermination[Mat2]()(matF:(Mat,scala.concurrent.Future[akka.Done])=>Mat2):FlowOpsMat.this.ReprMat[Out,Mat2] "akka.stream.scaladsl.Flow")

## Description

Materializes to a `Future` `CompletionStage` that will be completed with Done or failed depending whether the upstream of the operators has been completed or failed. The operators otherwise passes through elements unchanged.

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/WatchTermination.scala#L20-L52 "Go to snippet source")Source(1 to 5)
  .watchTermination()(
    (prevMatValue, future) =>
      // this function will be run when the stream terminates
      // the Future provided as a second parameter indicates whether the stream completed successfully or failed
      future.onComplete {
        case Failure(exception) => println(exception.getMessage)
        case Success(_)         => println(s"The stream materialized $prevMatValue")
      })
  .runForeach(println)
/*
Prints:
1
2
3
4
5
The stream materialized NotUsed
 */

Source(1 to 5)
  .watchTermination()((prevMatValue, future) =>
    future.onComplete {
      case Failure(exception) => println(exception.getMessage)
      case Success(_)         => println(s"The stream materialized $prevMatValue")
    })
  .runForeach(e => if (e == 3) throw new Exception("Boom") else println(e))
/*
Prints:
1
2
Boom
 */
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L629-L677 "Go to snippet source")Source.range(1, 5)
    .watchTermination(
        (prevMatValue, completionStage) -> {
          completionStage.whenComplete(
              (done, exc) -> {
                if (done != null)
                  System.out.println("The stream materialized " + prevMatValue.toString());
                else System.out.println(exc.getMessage());
              });
          return prevMatValue;
        })
    .runForeach(System.out::println, system);

/*
Prints:
1
2
3
4
5
The stream materialized NotUsed
 */

Source.range(1, 5)
    .watchTermination(
        (prevMatValue, completionStage) -> {
          // this function will be run when the stream terminates
          // the CompletionStage provided as a second parameter indicates whether
          // the stream completed successfully or failed
          completionStage.whenComplete(
              (done, exc) -> {
                if (done != null)
                  System.out.println("The stream materialized " + prevMatValue.toString());
                else System.out.println(exc.getMessage());
              });
          return prevMatValue;
        })
    .runForeach(
        element -> {
          if (element == 3) throw new Exception("Boom");
          else System.out.println(element);
        },
        system);
/*
Prints:
1
2
Boom
 */
```

You can also use the lambda function expected by `watchTermination` to map the materialized value of the stream. Additionally, the completion of the `Future``CompletionStage` provided as a second parameter of the lambda can be used to perform cleanup operations of the resources used by the stream itself. 

## Reactive Streams semantics

**emits** when input has an element available

**backpressures** when output backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Examples

```scala
Source(1 to 5)
  .watchTermination()(
    (prevMatValue, future) =>
      // this function will be run when the stream terminates
      // the Future provided as a second parameter indicates whether the stream completed successfully or failed
      future.onComplete {
        case Failure(exception) => println(exception.getMessage)
        case Success(_)         => println(s"The stream materialized $prevMatValue")
      })
  .runForeach(println)
/*
Prints:
1
2
3
4
5
The stream materialized NotUsed
 */

Source(1 to 5)
  .watchTermination()((prevMatValue, future) =>
    future.onComplete {
      case Failure(exception) => println(exception.getMessage)
      case Success(_)         => println(s"The stream materialized $prevMatValue")
    })
  .runForeach(e => if (e == 3) throw new Exception("Boom") else println(e))
/*
Prints:
1
2
Boom
 */
```

### Example 2: Examples

```java
Source.range(1, 5)
    .watchTermination(
        (prevMatValue, completionStage) -> {
          completionStage.whenComplete(
              (done, exc) -> {
                if (done != null)
                  System.out.println("The stream materialized " + prevMatValue.toString());
                else System.out.println(exc.getMessage());
              });
          return prevMatValue;
        })
    .runForeach(System.out::println, system);

/*
Prints:
1
2
3
4
5
The stream materialized NotUsed
 */

Source.range(1, 5)
    .watchTermination(
        (prevMatValue, completionStage) -> {
          // this function will be run when the stream terminates
          // the CompletionStage provided as a second parameter indicates whether
          // the stream completed successfully or failed
          completionStage.whenComplete(
              (done, exc) -> {
                if (done != null)
                  System.out.println("The stream materialized " + prevMatValue.toString());
                else System.out.println(exc.getMessage());
              });
          return prevMatValue;
        })
    .runForeach(
        element -> {
          if (element == 3) throw new Exception("Boom");
          else System.out.println(element);
        },
        system);
/*
Prints:
1
2
Boom
 */
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watch.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/wireTap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watchTermination.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watchTermination.html)*