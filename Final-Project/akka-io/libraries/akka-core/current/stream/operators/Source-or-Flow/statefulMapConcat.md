---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:32Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMapConcat.html
title: statefulMapConcat • Akka core
---

# statefulMapConcat • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# statefulMapConcat

Transform each element into zero or more elements that are individually passed downstream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.statefulMapConcat`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#statefulMapConcat(akka.japi.function.Creator) "akka.stream.javadsl.Flow")[`Flow.statefulMapConcat`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#statefulMapConcat[T](f:()=>Out=>scala.collection.immutable.Iterable[T]):FlowOps.this.Repr[T] "akka.stream.scaladsl.Flow") 

## Description

Transform each element into zero or more elements that are individually passed downstream. The difference to `mapConcat` is that the transformation function is created from a factory for every materialization of the flow. This makes it possible to create and use mutable state for the operation, each new materialization of the stream will have its own state.

For cases where no state is needed but only a way to emit zero or more elements for every incoming element you can use [mapConcat](mapConcat.html)

## Examples

In this first sample we keep a counter, and combine each element with an id that is unique for the stream materialization (replicating the [zipWithIndex](zipWithIndex.html) operator):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMapConcat.scala#L17-L34 "Go to snippet source")val letterAndIndex = Source("a" :: "b" :: "c" :: "d" :: Nil).statefulMapConcat { () =>
  var index = 0L

  // we return the function that will be invoked for each element
  { element =>
    val zipped = (element, index)
    index += 1
    // we return an iterable with the single element
    zipped :: Nil
  }
}

letterAndIndex.runForeach(println)
// prints
// (a,0)
// (b,1)
// (c,2)
// (d,3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMapConcat.java#L20-L42 "Go to snippet source")Source<Pair<String, Long>, NotUsed> letterAndIndex =
    Source.from(Arrays.asList("a", "b", "c", "d"))
        .statefulMapConcat(
            () -> {
              // variables we close over with lambdas must be final, so we use a container,
              // a 1 element array, for the actual value.
              final long[] index = {0L};

              // we return the function that will be invoked for each element
              return (element) -> {
                final Pair<String, Long> zipped = new Pair<>(element, index[0]);
                index[0] += 1;
                // we return an iterable with the single element
                return Collections.singletonList(zipped);
              };
            });

letterAndIndex.runForeach(System.out::println, system);
// prints
// Pair(a,0)
// Pair(b,1)
// Pair(c,2)
// Pair(d,3)
```

In this sample we let the value of the elements have an effect on the following elements, if an element starts with `deny:word` we add it to a deny list and filter out any subsequent entries of `word`:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMapConcat.scala#L40-L63 "Go to snippet source")val fruitsAndDeniedCommands = Source(
  "banana" :: "pear" :: "orange" :: "deny:banana" :: "banana" :: "pear" :: "banana" :: Nil)

val denyFilterFlow = Flow[String].statefulMapConcat { () =>
  var denyList = Set.empty[String]

  { element =>
    if (element.startsWith("deny:")) {
      denyList += element.drop("deny:".size)
      Nil // no element downstream when adding a deny listed keyword
    } else if (denyList(element)) {
      Nil // no element downstream if element is deny listed
    } else {
      element :: Nil
    }
  }
}

fruitsAndDeniedCommands.via(denyFilterFlow).runForeach(println)
// prints
// banana
// pear
// orange
// pear
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMapConcat.java#L48-L77 "Go to snippet source")Source<String, NotUsed> fruitsAndDenyCommands =
    Source.from(
        Arrays.asList("banana", "pear", "orange", "deny:banana", "banana", "pear", "banana"));

Flow<String, String, NotUsed> denyFilterFlow =
    Flow.of(String.class)
        .statefulMapConcat(
            () -> {
              Set<String> denyList = new HashSet<>();

              return (element) -> {
                if (element.startsWith("deny:")) {
                  denyList.add(element.substring("deny:".length()));
                  return Collections
                      .emptyList(); // no element downstream when adding a deny listed keyword
                } else if (denyList.contains(element)) {
                  return Collections
                      .emptyList(); // no element downstream if element is deny listed
                } else {
                  return Collections.singletonList(element);
                }
              };
            });

fruitsAndDenyCommands.via(denyFilterFlow).runForeach(System.out::println, system);
// prints
// banana
// pear
// orange
// pear
```

For cases where there is a need to emit elements based on the state when the stream ends, it is possible to add an extra element signalling the end of the stream before the `statefulMapConcat` operator.

In this sample we collect all elements starting with the letter `b` and emit those once we have reached the end of the stream using a special end element. The end element is a special string to keep the sample concise, in a real application it may make sense to use types instead.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/StatefulMapConcat.scala#L69-L96 "Go to snippet source")val words = Source("baboon" :: "crocodile" :: "bat" :: "flamingo" :: "hedgehog" :: "beaver" :: Nil)

val bWordsLast = Flow[String].concat(Source.single("-end-")).statefulMapConcat { () =>
  var stashedBWords: List[String] = Nil

  { element =>
    if (element.startsWith("b")) {
      // prepend to stash and emit no element
      stashedBWords = element :: stashedBWords
      Nil
    } else if (element.equals("-end-")) {
      // return in the stashed words in the order they got stashed
      stashedBWords.reverse
    } else {
      // emit the element as is
      element :: Nil
    }
  }
}

words.via(bWordsLast).runForeach(println)
// prints
// crocodile
// flamingo
// hedgehog
// baboon
// bat
// beaver
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/flow/StatefulMapConcat.java#L83-L115 "Go to snippet source")Source<String, NotUsed> words =
    Source.from(Arrays.asList("baboon", "crocodile", "bat", "flamingo", "hedgehog", "beaver"));

Flow<String, String, NotUsed> bWordsLast =
    Flow.of(String.class)
        .concat(Source.single("-end-"))
        .statefulMapConcat(
            () -> {
              List<String> stashedBWords = new ArrayList<>();

              return (element) -> {
                if (element.startsWith("b")) {
                  // add to stash and emit no element
                  stashedBWords.add(element);
                  return Collections.emptyList();
                } else if (element.equals("-end-")) {
                  // return in the stashed words in the order they got stashed
                  return stashedBWords;
                } else {
                  // emit the element as is
                  return Collections.singletonList(element);
                }
              };
            });

words.via(bWordsLast).runForeach(System.out::println, system);
// prints
// crocodile
// flamingo
// hedgehog
// baboon
// bat
// beaver
```

When defining aggregates like this you should consider if it is safe to let the state grow without bounds or if you should rather drop elements or throw an exception if the collected set of elements grows too big.

For even more fine grained capabilities than can be achieved with `statefulMapConcat` take a look at [stream customization](../../stream-customize.html).

## Reactive Streams semantics

**emits** when the mapping function returns an element or there are still remaining elements from the previously calculated collection

**backpressures** when downstream backpressures or there are still available elements from the previously calculated collection

**completes** when upstream completes and all remaining elements has been emitted

## Code Examples

### Example 1: Examples

```scala
val letterAndIndex = Source("a" :: "b" :: "c" :: "d" :: Nil).statefulMapConcat { () =>
  var index = 0L

  // we return the function that will be invoked for each element
  { element =>
    val zipped = (element, index)
    index += 1
    // we return an iterable with the single element
    zipped :: Nil
  }
}

letterAndIndex.runForeach(println)
// prints
// (a,0)
// (b,1)
// (c,2)
// (d,3)
```

### Example 2: Examples

```java
Source<Pair<String, Long>, NotUsed> letterAndIndex =
    Source.from(Arrays.asList("a", "b", "c", "d"))
        .statefulMapConcat(
            () -> {
              // variables we close over with lambdas must be final, so we use a container,
              // a 1 element array, for the actual value.
              final long[] index = {0L};

              // we return the function that will be invoked for each element
              return (element) -> {
                final Pair<String, Long> zipped = new Pair<>(element, index[0]);
                index[0] += 1;
                // we return an iterable with the single element
                return Collections.singletonList(zipped);
              };
            });

letterAndIndex.runForeach(System.out::println, system);
// prints
// Pair(a,0)
// Pair(b,1)
// Pair(c,2)
// Pair(d,3)
```

### Example 3: Examples

```scala
val fruitsAndDeniedCommands = Source(
  "banana" :: "pear" :: "orange" :: "deny:banana" :: "banana" :: "pear" :: "banana" :: Nil)

val denyFilterFlow = Flow[String].statefulMapConcat { () =>
  var denyList = Set.empty[String]

  { element =>
    if (element.startsWith("deny:")) {
      denyList += element.drop("deny:".size)
      Nil // no element downstream when adding a deny listed keyword
    } else if (denyList(element)) {
      Nil // no element downstream if element is deny listed
    } else {
      element :: Nil
    }
  }
}

fruitsAndDeniedCommands.via(denyFilterFlow).runForeach(println)
// prints
// banana
// pear
// orange
// pear
```

### Example 4: Examples

```java
Source<String, NotUsed> fruitsAndDenyCommands =
    Source.from(
        Arrays.asList("banana", "pear", "orange", "deny:banana", "banana", "pear", "banana"));

Flow<String, String, NotUsed> denyFilterFlow =
    Flow.of(String.class)
        .statefulMapConcat(
            () -> {
              Set<String> denyList = new HashSet<>();

              return (element) -> {
                if (element.startsWith("deny:")) {
                  denyList.add(element.substring("deny:".length()));
                  return Collections
                      .emptyList(); // no element downstream when adding a deny listed keyword
                } else if (denyList.contains(element)) {
                  return Collections
                      .emptyList(); // no element downstream if element is deny listed
                } else {
                  return Collections.singletonList(element);
                }
              };
            });

fruitsAndDenyCommands.via(denyFilterFlow).runForeach(System.out::println, system);
// prints
// banana
// pear
// orange
// pear
```

### Example 5: Examples

```scala
val words = Source("baboon" :: "crocodile" :: "bat" :: "flamingo" :: "hedgehog" :: "beaver" :: Nil)

val bWordsLast = Flow[String].concat(Source.single("-end-")).statefulMapConcat { () =>
  var stashedBWords: List[String] = Nil

  { element =>
    if (element.startsWith("b")) {
      // prepend to stash and emit no element
      stashedBWords = element :: stashedBWords
      Nil
    } else if (element.equals("-end-")) {
      // return in the stashed words in the order they got stashed
      stashedBWords.reverse
    } else {
      // emit the element as is
      element :: Nil
    }
  }
}

words.via(bWordsLast).runForeach(println)
// prints
// crocodile
// flamingo
// hedgehog
// baboon
// bat
// beaver
```

### Example 6: Examples

```java
Source<String, NotUsed> words =
    Source.from(Arrays.asList("baboon", "crocodile", "bat", "flamingo", "hedgehog", "beaver"));

Flow<String, String, NotUsed> bWordsLast =
    Flow.of(String.class)
        .concat(Source.single("-end-"))
        .statefulMapConcat(
            () -> {
              List<String> stashedBWords = new ArrayList<>();

              return (element) -> {
                if (element.startsWith("b")) {
                  // add to stash and emit no element
                  stashedBWords.add(element);
                  return Collections.emptyList();
                } else if (element.equals("-end-")) {
                  // return in the stashed words in the order they got stashed
                  return stashedBWords;
                } else {
                  // emit the element as is
                  return Collections.singletonList(element);
                }
              };
            });

words.via(bWordsLast).runForeach(System.out::println, system);
// prints
// crocodile
// flamingo
// hedgehog
// baboon
// bat
// beaver
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/mapConcat.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/take.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipWithIndex.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-customize.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMapConcat.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/statefulMapConcat.html)*