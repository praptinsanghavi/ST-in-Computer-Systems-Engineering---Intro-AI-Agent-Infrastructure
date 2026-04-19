---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html
title: Source.asSourceWithContext • Akka core
---

# Source.asSourceWithContext • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Source.asSourceWithContext

Extracts context data from the elements of a `Source` so that it can be turned into a `SourceWithContext` which can propagate that context per element along a stream.

[Source operators](../index.html#source-operators)

## Signature

[`Source.asSourceWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#asSourceWithContext(akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.asSourceWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#asSourceWithContext[Ctx](f:Out=>Ctx):akka.stream.scaladsl.SourceWithContext[Out,Ctx,Mat] "akka.stream.scaladsl.Source")

## Description

See [Context Propagation](../../stream-context.html) for a general overview of context propagation.

Extracts context data from the elements of a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") so that it can be turned into a [`SourceWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html "akka.stream.javadsl.SourceWithContext")[`SourceWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html "akka.stream.scaladsl.SourceWithContext") which can propagate that context per element along a stream. The function passed into `asSourceWithContext` must turn elements into contexts, one context for every element.

See also:

- [Context Propagation](../../stream-context.html)
- [`Flow.asFlowWithContext`](../Flow/asFlowWithContext.html) Turns a `Flow` into a `FlowWithContext` which can propagate a context per element along a stream.

## Example

Elements from this source have a correlation number, but the flow structure should focus on the text message in the elements. `asSourceWithContext` chooses the second value in the tuplepair as the context. Another `map` operator makes the first value the stream elements in the `SourceWithContext`. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/WithContextSpec.scala#L13-L37 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.SourceWithContext
import scala.collection.immutable

// values with their contexts as tuples
val values: immutable.Seq[(String, Int)] = immutable.Seq("eins" -> 1, "zwei" -> 2, "drei" -> 3)

// a regular source with the tuples as elements
val source: Source[(String, Int), NotUsed] = Source(values)

// split the tuple into stream elements and their context
val sourceWithContext: SourceWithContext[String, Int, NotUsed] =
  source
    .asSourceWithContext(_._2) // pick the second tuple element as context
    .map(_._1) // keep the first tuple element as stream element

val mapped: SourceWithContext[String, Int, NotUsed] = sourceWithContext
// regular operators apply to the element without seeing the context
  .map(s => s.reverse)

// running the source and asserting the outcome
import akka.stream.scaladsl.Sink
val result = mapped.runWith(Sink.seq)
result.futureValue should contain theSameElementsInOrderAs immutable.Seq("snie" -> 1, "iewz" -> 2, "ierd" -> 3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/WithContextTest.java#L9-L11 "Go to snippet source")import akka.NotUsed;
import akka.japi.Pair;
import akka.stream.javadsl.*;

// values with their contexts as pairs
Collection<Pair<String, Integer>> values =
    Arrays.asList(Pair.create("eins", 1), Pair.create("zwei", 2), Pair.create("drei", 3));

// a regular source with pairs as elements
Source<Pair<String, Integer>, NotUsed> source = Source.from(values);

// split the pair into stream elements and their context
SourceWithContext<String, Integer, NotUsed> sourceWithContext =
    source
        .asSourceWithContext(Pair::second) // pick the second pair element as context
        .map(Pair::first); // keep the first pair element as stream element

SourceWithContext<String, Integer, NotUsed> mapped =
    sourceWithContext
        // regular operators apply to the element without seeing the context
        .map(s -> s.replace('e', 'y'));

// running the source and asserting the outcome
CompletionStage<List<Pair<String, Integer>>> result = mapped.runWith(Sink.seq(), system);
List<Pair<String, Integer>> list = result.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertThat(
    list, hasItems(Pair.create("yins", 1), Pair.create("zwyi", 2), Pair.create("dryi", 3)));
```

## Code Examples

### Example 1: Example

```scala
import akka.NotUsed
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.SourceWithContext
import scala.collection.immutable

// values with their contexts as tuples
val values: immutable.Seq[(String, Int)] = immutable.Seq("eins" -> 1, "zwei" -> 2, "drei" -> 3)

// a regular source with the tuples as elements
val source: Source[(String, Int), NotUsed] = Source(values)

// split the tuple into stream elements and their context
val sourceWithContext: SourceWithContext[String, Int, NotUsed] =
  source
    .asSourceWithContext(_._2) // pick the second tuple element as context
    .map(_._1) // keep the first tuple element as stream element

val mapped: SourceWithContext[String, Int, NotUsed] = sourceWithContext
// regular operators apply to the element without seeing the context
  .map(s => s.reverse)

// running the source and asserting the outcome
import akka.stream.scaladsl.Sink
val result = mapped.runWith(Sink.seq)
result.futureValue should contain theSameElementsInOrderAs immutable.Seq("snie" -> 1, "iewz" -> 2, "ierd" -> 3)
```

### Example 2: Example

```java
import akka.NotUsed;
import akka.japi.Pair;
import akka.stream.javadsl.*;

// values with their contexts as pairs
Collection<Pair<String, Integer>> values =
    Arrays.asList(Pair.create("eins", 1), Pair.create("zwei", 2), Pair.create("drei", 3));

// a regular source with pairs as elements
Source<Pair<String, Integer>, NotUsed> source = Source.from(values);

// split the pair into stream elements and their context
SourceWithContext<String, Integer, NotUsed> sourceWithContext =
    source
        .asSourceWithContext(Pair::second) // pick the second pair element as context
        .map(Pair::first); // keep the first pair element as stream element

SourceWithContext<String, Integer, NotUsed> mapped =
    sourceWithContext
        // regular operators apply to the element without seeing the context
        .map(s -> s.replace('e', 'y'));

// running the source and asserting the outcome
CompletionStage<List<Pair<String, Integer>>> result = mapped.runWith(Sink.seq(), system);
List<Pair<String, Integer>> list = result.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertThat(
    list, hasItems(Pair.create("yins", 1), Pair.create("zwyi", 2), Pair.create("dryi", 3)));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/asFlowWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/asPublisher.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSubscriber.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-context.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html)*