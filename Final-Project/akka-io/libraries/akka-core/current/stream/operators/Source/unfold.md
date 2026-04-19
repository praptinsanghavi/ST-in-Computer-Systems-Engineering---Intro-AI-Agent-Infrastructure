---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:01Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfold.html
title: Source.unfold • Akka core
---

# Source.unfold • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.unfold

Stream the result of a function as long as it returns a `Some` non empty `Optional`.

[Source operators](../index.html#source-operators)

## Signature

[`Source.unfold`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#unfold(java.lang.Object,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.unfold`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html#unfold[S,E](s:S)(f:S=>Option[(S,E)]):akka.stream.scaladsl.Source[E,akka.NotUsed] "akka.stream.scaladsl.Source")

## Description

Stream the result of a function as long as it returns a `Some` non empty `Optional`. The value inside the option consists of a tuple pair where the first value is a state passed back into the next call to the function allowing to pass a state. The first invocation of the provided fold function will receive the `zero` state. 

Warning
The same `zero` state object will be used for every materialization of the `Source` so it is **mandatory** that the state is immutable. For example a `java.util.Iterator`, `Array` or Java standard library collection would not be safe as the fold operation could mutate the value. If you must use a mutable value, combining with [Source.lazySource](lazySource.html) to make sure a new mutable `zero` value is created for each materialization is one solution.

Note that for unfolding a source of elements through a blocking API, such as a network or filesystem resource you should prefer using [unfoldResource](unfoldResource.html).

## Examples

This first sample starts at a user provided integer and counts down to zero using `unfold` :

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Unfold.scala#L13-L17 "Go to snippet source")def countDown(from: Int): Source[Int, NotUsed] =
  Source.unfold(from) { current =>
    if (current == 0) None
    else Some((current - 1, current))
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Unfold.java#L16-L23 "Go to snippet source")public static Source<Integer, NotUsed> countDown(Integer from) {
  return Source.unfold(
      from,
      current -> {
        if (current == 0) return Optional.empty();
        else return Optional.of(Pair.create(current - 1, current));
      });
}
```

It is also possible to express unfolds that don’t have an end, which will never return `None` `Optional.empty` and must be combined with for example `.take(n)` to not produce infinite streams. Here we have implemented the Fibonacci numbers (0, 1, 1, 2, 3, 5, 8, 13, etc.) with `unfold`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/source/Unfold.scala#L21-L25 "Go to snippet source")def fibonacci: Source[BigInt, NotUsed] =
  Source.unfold((BigInt(0), BigInt(1))) {
    case (a, b) =>
      Some(((b, a + b), a))
  }
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/source/Unfold.java#L27-L36 "Go to snippet source")public static Source<BigInteger, NotUsed> fibonacci() {
  return Source.unfold(
      Pair.create(BigInteger.ZERO, BigInteger.ONE),
      current -> {
        BigInteger a = current.first();
        BigInteger b = current.second();
        Pair<BigInteger, BigInteger> next = Pair.create(b, a.add(b));
        return Optional.of(Pair.create(next, a));
      });
}
```

## Reactive Streams semantics

**emits** when there is demand and the unfold function over the previous state returns non empty value

**completes** when the unfold function returns an empty value

## Code Examples

### Example 1: Examples

```scala
def countDown(from: Int): Source[Int, NotUsed] =
  Source.unfold(from) { current =>
    if (current == 0) None
    else Some((current - 1, current))
  }
```

### Example 2: Examples

```java
public static Source<Integer, NotUsed> countDown(Integer from) {
  return Source.unfold(
      from,
      current -> {
        if (current == 0) return Optional.empty();
        else return Optional.of(Pair.create(current - 1, current));
      });
}
```

### Example 3: Examples

```scala
def fibonacci: Source[BigInt, NotUsed] =
  Source.unfold((BigInt(0), BigInt(1))) {
    case (a, b) =>
      Some(((b, a + b), a))
  }
```

### Example 4: Examples

```java
public static Source<BigInteger, NotUsed> fibonacci() {
  return Source.unfold(
      Pair.create(BigInteger.ZERO, BigInteger.ONE),
      current -> {
        BigInteger a = current.first();
        BigInteger b = current.second();
        Pair<BigInteger, BigInteger> next = Pair.create(b, a.add(b));
        return Optional.of(Pair.create(next, a));
      });
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/FileIO/toPath.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/lazySource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfold.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfold.html)*