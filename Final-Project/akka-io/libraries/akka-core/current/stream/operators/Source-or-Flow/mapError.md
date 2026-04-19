---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapError.html
title: mapError • Akka core
---

# mapError • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# mapError

While similar to `recover` this operators can be used to transform an error signal to a different one *without* logging it as an error in the process.

[Error handling](../index.html#error-handling)

## Signature

[`Source.mapError`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#mapError(java.lang.Class,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.mapError`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.mapError`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#mapError(java.lang.Class,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.mapError`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

While similar to `recover` this operators can be used to transform an error signal to a different one *without* logging it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover would log the `t2` error.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements. This operators can recover the failure signal, but not the skipped elements, which will be dropped.

Similarly to `recover` throwing an exception inside `mapError` *will* be logged on ERROR level automatically.

## Example

The following example demonstrates a stream which throws `ArithmeticException` when the element `0` goes through the `map` operator. The`mapError` is used to transform this exception to `UnsupportedOperationException`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/MapError.scala#L20-L32 "Go to snippet source")Source(-1 to 1)
  .map(1 / _)
  .mapError {
    case _: ArithmeticException =>
      new UnsupportedOperationException("Divide by Zero Operation is not supported.") with NoStackTrace
  }
  .runWith(Sink.seq)
  .onComplete {
    case Success(value) => println(value.mkString)
    case Failure(ex)    => println(ex.getMessage)
  }

// prints "Divide by Zero Operation is not supported."
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/sourceorflow/MapError.java#L17-L32 "Go to snippet source")  
final ActorSystem system = ActorSystem.create("mapError-operator-example");
Source.from(Arrays.asList(-1, 0, 1))
    .map(x -> 1 / x)
    .mapError(
        ArithmeticException.class,
        (ArithmeticException e) ->
            new UnsupportedOperationException("Divide by Zero Operation is not supported."))
    .runWith(Sink.seq(), system)
    .whenComplete(
        (result, exception) -> {
          if (result != null) System.out.println(result.toString());
          else System.out.println(exception.getMessage());
        });

// prints "Divide by Zero Operation is not supported."
```

## Reactive Streams semantics

**emits** when element is available from the upstream or upstream is failed and pf returns an element **backpressures** when downstream backpressures **completes** when upstream completes or upstream failed with exception pf can handle

## Code Examples

### Example 1: Example

```scala
Source(-1 to 1)
  .map(1 / _)
  .mapError {
    case _: ArithmeticException =>
      new UnsupportedOperationException("Divide by Zero Operation is not supported.") with NoStackTrace
  }
  .runWith(Sink.seq)
  .onComplete {
    case Success(value) => println(value.mkString)
    case Failure(ex)    => println(ex.getMessage)
  }

// prints "Divide by Zero Operation is not supported."
```

### Example 2: Example

```java
final ActorSystem system = ActorSystem.create("mapError-operator-example");
Source.from(Arrays.asList(-1, 0, 1))
    .map(x -> 1 / x)
    .mapError(
        ArithmeticException.class,
        (ArithmeticException e) ->
            new UnsupportedOperationException("Divide by Zero Operation is not supported."))
    .runWith(Sink.seq(), system)
    .whenComplete(
        (result, exception) -> {
          if (result != null) System.out.println(result.toString());
          else System.out.println(exception.getMessage());
        });

// prints "Divide by Zero Operation is not supported."
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapWithResource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapError.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapError.html)*