---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:31Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMap.html
title: statefulMap • Akka core
---

# statefulMap • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# statefulMap

Transform each stream element with the help of a state.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.statefulMap`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#statefulMap(akka.japi.function.Creator,akka.japi.function.Function2,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.statefulMap`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#statefulMap[S,T](create:()=%3ES)(f:(S,Out)%20=%3E(S,T),onComplete:S=%3EOption[T]):Repr[T] "akka.stream.scaladsl.Flow")

## Description

Transform each stream element with the help of a state. 

The state creation function is invoked once when the stream is materialized and the returned state is passed to the mapping function for mapping the first element. 

The mapping function returns a mapped element to emit downstream and a state to pass to the next mapping function. The state can be the same for each mapping return, be a new immutable state but it is also safe to use a mutable state.

The on complete function is called, once, when the first of upstream completion, downstream cancellation or stream failure happens. If the cause is upstream completion and the downstream is still accepting elements, the returned value from the function is passed downstream before completing the operator itself, for the other cases the returned value is ignored.

The `statefulMap` operator adheres to the ActorAttributes.SupervisionStrategy attribute.

For mapping stream elements without keeping a state see [map](map.html).

## Examples

In the first example we implement an `zipWithIndex` operator like [zipWithIndex](zipWithIndex.html), it always associates a unique index with each element of the stream, the index starts from 0\.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMap.scala#L15-L22 "Go to snippet source")Source(List("A", "B", "C", "D"))
  .statefulMap(() => 0L)((index, elem) => (index + 1, (elem, index)), _ => None)
  .runForeach(println)
//prints
//(A,0)
//(B,1)
//(C,2)
//(D,3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMap.java#L19-L29 "Go to snippet source")Source.from(Arrays.asList("A", "B", "C", "D"))
    .statefulMap(
        () -> 0L,
        (index, element) -> Pair.create(index + 1, Pair.create(element, index)),
        indexOnComplete -> Optional.empty())
    .runForeach(System.out::println, system);
// prints
// Pair(A,0)
// Pair(B,1)
// Pair(C,2)
// Pair(D,3)
```

In the second example, the elements are buffered until the incoming element is different, and then emitted downstream. When upstream completes, if there are buffered elements, they are emitted before completing.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMap.scala#L28-L42 "Go to snippet source")Source("A" :: "B" :: "B" :: "C" :: "C" :: "C" :: "D" :: Nil)
  .statefulMap(() => List.empty[String])(
    (buffer, element) =>
      buffer match {
        case head :: _ if head != element => (element :: Nil, buffer)
        case _                            => (element :: buffer, Nil)
      },
    buffer => Some(buffer))
  .filter(_.nonEmpty)
  .runForeach(println)
//prints
//List(A)
//List(B, B)
//List(C, C, C)
//List(D)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMap.java#L35-L55 "Go to snippet source")Source.from(Arrays.asList("A", "B", "B", "C", "C", "C", "D"))
    .statefulMap(
        () -> (List<String>) new LinkedList<String>(),
        (buffer, element) -> {
          if (buffer.size() > 0 && (!buffer.get(0).equals(element))) {
            return Pair.create(
                new LinkedList<>(Collections.singletonList(element)),
                Collections.unmodifiableList(buffer));
          } else {
            buffer.add(element);
            return Pair.create(buffer, Collections.<String>emptyList());
          }
        },
        Optional::ofNullable)
    .filterNot(List::isEmpty)
    .runForeach(System.out::println, system);
// prints
// [A]
// [B, B]
// [C, C, C]
// [D]
```

In the forth example, repeated incoming elements are only emitted once and then dropped.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMap.scala#L48-L62 "Go to snippet source")Source("A" :: "B" :: "B" :: "C" :: "C" :: "C" :: "D" :: Nil)
  .statefulMap(() => Option.empty[String])(
    (lastElement, elem) =>
      lastElement match {
        case Some(head) if head == elem => (Some(elem), None)
        case _                          => (Some(elem), Some(elem))
      },
    _ => None)
  .collect { case Some(elem) => elem }
  .runForeach(println)
//prints
//A
//B
//C
//D
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMap.java#L61-L78 "Go to snippet source")Source.from(Arrays.asList("A", "B", "B", "C", "C", "C", "D"))
    .statefulMap(
        Optional::<String>empty,
        (lastElement, element) -> {
          if (lastElement.isPresent() && lastElement.get().equals(element)) {
            return Pair.create(lastElement, Optional.<String>empty());
          } else {
            return Pair.create(Optional.of(element), Optional.of(element));
          }
        },
        listOnComplete -> Optional.empty())
    .via(Flow.flattenOptional())
    .runForeach(System.out::println, system);
// prints
// A
// B
// C
// D
```

In the fifth example, we combine the [statefulMap](statefulMap.html) and [mapConcat](mapConcat.html) to implement a [statefulMapConcat](statefulMapConcat.html) like behavior.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMap.scala#L68-L91 "Go to snippet source")Source(1 to 10)
  .statefulMap(() => List.empty[Int])(
    (state, elem) => {
      //grouped 3 elements into a list
      val newState = elem :: state
      if (newState.size == 3)
        (Nil, newState.reverse)
      else
        (newState, Nil)
    },
    state => Some(state.reverse))
  .mapConcat(identity)
  .runForeach(println)
//prints
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMap.java#L84-L108 "Go to snippet source")Source.fromJavaStream(() -> IntStream.rangeClosed(1, 10))
    .statefulMap(
        () -> new ArrayList<Integer>(3),
        (list, element) -> {
          list.add(element);
          if (list.size() == 3) {
            return Pair.create(new ArrayList<Integer>(3), Collections.unmodifiableList(list));
          } else {
            return Pair.create(list, Collections.<Integer>emptyList());
          }
        },
        Optional::ofNullable)
    .mapConcat(list -> list)
    .runForeach(System.out::println, system);
// prints
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
```

## Reactive Streams semantics

**emits** the mapping function returns an element and downstream is ready to consume it

**backpressures** downstream backpressures

**completes** upstream completes

**cancels** downstream cancels

## Code Examples

### Example 1: Examples

```scala
Source(List("A", "B", "C", "D"))
  .statefulMap(() => 0L)((index, elem) => (index + 1, (elem, index)), _ => None)
  .runForeach(println)
//prints
//(A,0)
//(B,1)
//(C,2)
//(D,3)
```

### Example 2: Examples

```java
Source.from(Arrays.asList("A", "B", "C", "D"))
    .statefulMap(
        () -> 0L,
        (index, element) -> Pair.create(index + 1, Pair.create(element, index)),
        indexOnComplete -> Optional.empty())
    .runForeach(System.out::println, system);
// prints
// Pair(A,0)
// Pair(B,1)
// Pair(C,2)
// Pair(D,3)
```

### Example 3: Examples

```scala
Source("A" :: "B" :: "B" :: "C" :: "C" :: "C" :: "D" :: Nil)
  .statefulMap(() => List.empty[String])(
    (buffer, element) =>
      buffer match {
        case head :: _ if head != element => (element :: Nil, buffer)
        case _                            => (element :: buffer, Nil)
      },
    buffer => Some(buffer))
  .filter(_.nonEmpty)
  .runForeach(println)
//prints
//List(A)
//List(B, B)
//List(C, C, C)
//List(D)
```

### Example 4: Examples

```java
Source.from(Arrays.asList("A", "B", "B", "C", "C", "C", "D"))
    .statefulMap(
        () -> (List<String>) new LinkedList<String>(),
        (buffer, element) -> {
          if (buffer.size() > 0 && (!buffer.get(0).equals(element))) {
            return Pair.create(
                new LinkedList<>(Collections.singletonList(element)),
                Collections.unmodifiableList(buffer));
          } else {
            buffer.add(element);
            return Pair.create(buffer, Collections.<String>emptyList());
          }
        },
        Optional::ofNullable)
    .filterNot(List::isEmpty)
    .runForeach(System.out::println, system);
// prints
// [A]
// [B, B]
// [C, C, C]
// [D]
```

### Example 5: Examples

```scala
Source("A" :: "B" :: "B" :: "C" :: "C" :: "C" :: "D" :: Nil)
  .statefulMap(() => Option.empty[String])(
    (lastElement, elem) =>
      lastElement match {
        case Some(head) if head == elem => (Some(elem), None)
        case _                          => (Some(elem), Some(elem))
      },
    _ => None)
  .collect { case Some(elem) => elem }
  .runForeach(println)
//prints
//A
//B
//C
//D
```

### Example 6: Examples

```java
Source.from(Arrays.asList("A", "B", "B", "C", "C", "C", "D"))
    .statefulMap(
        Optional::<String>empty,
        (lastElement, element) -> {
          if (lastElement.isPresent() && lastElement.get().equals(element)) {
            return Pair.create(lastElement, Optional.<String>empty());
          } else {
            return Pair.create(Optional.of(element), Optional.of(element));
          }
        },
        listOnComplete -> Optional.empty())
    .via(Flow.flattenOptional())
    .runForeach(System.out::println, system);
// prints
// A
// B
// C
// D
```

### Example 7: Examples

```scala
Source(1 to 10)
  .statefulMap(() => List.empty[Int])(
    (state, elem) => {
      //grouped 3 elements into a list
      val newState = elem :: state
      if (newState.size == 3)
        (Nil, newState.reverse)
      else
        (newState, Nil)
    },
    state => Some(state.reverse))
  .mapConcat(identity)
  .runForeach(println)
//prints
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
```

### Example 8: Examples

```java
Source.fromJavaStream(() -> IntStream.rangeClosed(1, 10))
    .statefulMap(
        () -> new ArrayList<Integer>(3),
        (list, element) -> {
          list.add(element);
          if (list.size() == 3) {
            return Pair.create(new ArrayList<Integer>(3), Collections.unmodifiableList(list));
          } else {
            return Pair.create(list, Collections.<Integer>emptyList());
          }
        },
        Optional::ofNullable)
    .mapConcat(list -> list)
    .runForeach(System.out::println, system);
// prints
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 10
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/map.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/splitWhen.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMap.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMap.html)*