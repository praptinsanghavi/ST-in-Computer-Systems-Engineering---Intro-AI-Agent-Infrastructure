---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recover.html
title: recover • Akka core
---

# recover • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# recover

Allow sending of one last element downstream when a failure has happened upstream.

[Error handling](../index.html#error-handling)

## Signature

[`Source.recover`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#recover(scala.PartialFunction) "akka.stream.javadsl.Source")[`Source.recover`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Source") [`Flow.recover`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#recover(scala.PartialFunction) "akka.stream.javadsl.Flow")[`Flow.recover`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow")

## Description

`recover` allows you to emit a final element and then complete the stream on an upstream failure. Deciding which exceptions should be recovered is done through a `PartialFunction`. If an exception does not have a matching case match defined the stream is failed. 

Recovering can be useful if you want to gracefully complete a stream on failure while letting downstream know that there was a failure.

Throwing an exception inside `recover` *will* be logged on ERROR level automatically.

## Reactive Streams semantics

**emits** when the element is available from the upstream or upstream is failed and pf returns an element

**backpressures** when downstream backpressures, not when failure happened

**completes** when upstream completes or upstream failed with exception pf can handle

Below example demonstrates how `recover` gracefully complete a stream on failure. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L93-L102 "Go to snippet source")Source(0 to 6)
  .map(
    n =>
      // assuming `4` and `5` are unexpected values that could throw exception
      if (List(4, 5).contains(n)) throw new RuntimeException(s"Boom! Bad value found: $n")
      else n.toString)
  .recover {
    case e: RuntimeException => e.getMessage
  }
  .runForeach(println)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L140-L152 "Go to snippet source")Source.from(Arrays.asList(0, 1, 2, 3, 4, 5, 6))
    .map(
        n -> {
          // assuming `4` and `5` are unexpected values that could throw exception
          if (Arrays.asList(4, 5).contains(n))
            throw new RuntimeException(String.format("Boom! Bad value found: %s", n));
          else return n.toString();
        })
    .recover(
        new PFBuilder<Throwable, String>()
            .match(RuntimeException.class, Throwable::getMessage)
            .build())
    .runForeach(System.out::println, system);
```

This will output:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/FlowErrorDocSpec.scala#L108-L112 "Go to snippet source")0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/FlowErrorDocTest.java#L158-L162 "Go to snippet source")0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

The output in the line `before failure` denotes the last successful element available from the upstream, and the output in the line `on failure` denotes the element returns by partial function when upstream is failed.

## Code Examples

### Example 1: Reactive Streams semantics

```scala
Source(0 to 6)
  .map(
    n =>
      // assuming `4` and `5` are unexpected values that could throw exception
      if (List(4, 5).contains(n)) throw new RuntimeException(s"Boom! Bad value found: $n")
      else n.toString)
  .recover {
    case e: RuntimeException => e.getMessage
  }
  .runForeach(println)
```

### Example 2: Reactive Streams semantics

```java
Source.from(Arrays.asList(0, 1, 2, 3, 4, 5, 6))
    .map(
        n -> {
          // assuming `4` and `5` are unexpected values that could throw exception
          if (Arrays.asList(4, 5).contains(n))
            throw new RuntimeException(String.format("Boom! Bad value found: %s", n));
          else return n.toString();
        })
    .recover(
        new PFBuilder<Throwable, String>()
            .match(RuntimeException.class, Throwable::getMessage)
            .build())
    .runForeach(System.out::println, system);
```

### Example 3: Reactive Streams semantics

```scala
0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

### Example 4: Reactive Streams semantics

```java
0
1
2
3                         // last element before failure
Boom! Bad value found: 4  // first element on failure
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recoverWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/range.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recover.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/recover.html)*