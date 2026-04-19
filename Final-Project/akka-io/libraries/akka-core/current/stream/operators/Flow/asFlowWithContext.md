---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:17Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/asFlowWithContext.html
title: Flow.asFlowWithContext • Akka core
---

# Flow.asFlowWithContext • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Flow.asFlowWithContext

Extracts context data from the elements of a `Flow` so that it can be turned into a `FlowWithContext` which can propagate that context per element along a stream.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.asFlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#asFlowWithContext(akka.japi.function.Function2,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.asFlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#asFlowWithContext[U,CtxU,CtxOut](collapseContext:(U,CtxU)=>In)(extractContext:Out=>CtxOut):akka.stream.scaladsl.FlowWithContext[U,CtxU,Out,CtxOut,Mat] "akka.stream.scaladsl.Flow")

## Description

See [Context Propagation](../../stream-context.html) for a general overview of context propagation.

Extracts context data from the elements of a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") so that it can be turned into a [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") which can propagate that context per element along a stream. The first function passed into `asFlowWithContext` must turn each incoming pair of element and context value into an element of this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow"). The second function passed into `asFlowWithContext` must turn each outgoing element of this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") into an outgoing context value.

See also:

- [Context Propagation](../../stream-context.html)
- [`Source.asSourceWithContext`](../Source/asSourceWithContext.html) Turns a `Source` into a `SourceWithContext` which can propagate a context per element along a stream.

## Example

Elements from this flow have a correlation number, but the flow structure should focus on the text message in the elements. The first converter in `asFlowWithContext` applies to the end of the “with context” flow to turn it into a regular flow again. The second converter function chooses the second value in the tuplepair as the context. Another `map` operator makes the first value the stream elements in the `FlowWithContext`. 

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/WithContextSpec.scala#L43-L78 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.FlowWithContext
// a regular flow with pairs as elements
val flow: Flow[(String, Int), (String, Int), NotUsed] = // ???

// Declare the "flow with context"
// ingoing: String and Integer
// outgoing: String and Integer
val flowWithContext: FlowWithContext[String, Int, String, Int, NotUsed] =
  // convert the flow of pairs into a "flow with context"
  flow
    .asFlowWithContext[String, Int, Int](
      // at the end of this flow: put the elements and the context back into a tuple
      collapseContext = Tuple2.apply)(
      // pick the second element of the incoming pair as context
      extractContext = _._2)
    .map(_._1) // keep the first pair element as stream element

val mapped = flowWithContext
// regular operators apply to the element without seeing the context
  .map(_.reverse)

// running the flow with some sample data and asserting the outcome
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink
import scala.collection.immutable

val values: immutable.Seq[(String, Int)] = immutable.Seq("eins" -> 1, "zwei" -> 2, "drei" -> 3)
val source = Source(values).asSourceWithContext(_._2).map(_._1)

val result = source.via(mapped).runWith(Sink.seq)
result.futureValue should contain theSameElementsInOrderAs immutable.Seq("snie" -> 1, "iewz" -> 2, "ierd" -> 3)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/WithContextTest.java#L9-L11 "Go to snippet source")import akka.NotUsed;
import akka.japi.Pair;
import akka.stream.javadsl.*;

// a regular flow with pairs as elements
Flow<Pair<String, Integer>, Pair<String, Integer>, NotUsed> flow = // ...

// Declare the "flow with context"
// ingoing: String and Integer
// outgoing: String and Integer
FlowWithContext<String, Integer, String, Integer, NotUsed> flowWithContext =
    // convert the flow of pairs into a "flow with context"
    flow.<String, Integer, Integer>asFlowWithContext(
            // at the end of this flow: put the elements and the context back into a pair
            Pair::create,
            // pick the second element of the incoming pair as context
            Pair::second)
        // keep the first pair element as stream element
        .map(Pair::first);

FlowWithContext<String, Integer, String, Integer, NotUsed> mapped =
    flowWithContext
        // regular operators apply to the element without seeing the context
        .map(s -> s.replace('e', 'y'));

// running the flow with some sample data and asserting the outcome
Collection<Pair<String, Integer>> values =
    Arrays.asList(Pair.create("eins", 1), Pair.create("zwei", 2), Pair.create("drei", 3));

SourceWithContext<String, Integer, NotUsed> source =
    Source.from(values).asSourceWithContext(Pair::second).map(Pair::first);

CompletionStage<List<Pair<String, Integer>>> result =
    source.via(mapped).runWith(Sink.seq(), system);
List<Pair<String, Integer>> list = result.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertThat(
    list, hasItems(Pair.create("yins", 1), Pair.create("zwyi", 2), Pair.create("dryi", 3)));
```

## Code Examples

### Example 1: Example

```scala
import akka.NotUsed
import akka.stream.scaladsl.Flow
import akka.stream.scaladsl.FlowWithContext
// a regular flow with pairs as elements
val flow: Flow[(String, Int), (String, Int), NotUsed] = // ???

// Declare the "flow with context"
// ingoing: String and Integer
// outgoing: String and Integer
val flowWithContext: FlowWithContext[String, Int, String, Int, NotUsed] =
  // convert the flow of pairs into a "flow with context"
  flow
    .asFlowWithContext[String, Int, Int](
      // at the end of this flow: put the elements and the context back into a tuple
      collapseContext = Tuple2.apply)(
      // pick the second element of the incoming pair as context
      extractContext = _._2)
    .map(_._1) // keep the first pair element as stream element

val mapped = flowWithContext
// regular operators apply to the element without seeing the context
  .map(_.reverse)

// running the flow with some sample data and asserting the outcome
import akka.stream.scaladsl.Source
import akka.stream.scaladsl.Sink
import scala.collection.immutable

val values: immutable.Seq[(String, Int)] = immutable.Seq("eins" -> 1, "zwei" -> 2, "drei" -> 3)
val source = Source(values).asSourceWithContext(_._2).map(_._1)

val result = source.via(mapped).runWith(Sink.seq)
result.futureValue should contain theSameElementsInOrderAs immutable.Seq("snie" -> 1, "iewz" -> 2, "ierd" -> 3)
```

### Example 2: Example

```java
import akka.NotUsed;
import akka.japi.Pair;
import akka.stream.javadsl.*;

// a regular flow with pairs as elements
Flow<Pair<String, Integer>, Pair<String, Integer>, NotUsed> flow = // ...

// Declare the "flow with context"
// ingoing: String and Integer
// outgoing: String and Integer
FlowWithContext<String, Integer, String, Integer, NotUsed> flowWithContext =
    // convert the flow of pairs into a "flow with context"
    flow.<String, Integer, Integer>asFlowWithContext(
            // at the end of this flow: put the elements and the context back into a pair
            Pair::create,
            // pick the second element of the incoming pair as context
            Pair::second)
        // keep the first pair element as stream element
        .map(Pair::first);

FlowWithContext<String, Integer, String, Integer, NotUsed> mapped =
    flowWithContext
        // regular operators apply to the element without seeing the context
        .map(s -> s.replace('e', 'y'));

// running the flow with some sample data and asserting the outcome
Collection<Pair<String, Integer>> values =
    Arrays.asList(Pair.create("eins", 1), Pair.create("zwei", 2), Pair.create("drei", 3));

SourceWithContext<String, Integer, NotUsed> source =
    Source.from(values).asSourceWithContext(Pair::second).map(Pair::first);

CompletionStage<List<Pair<String, Integer>>> result =
    source.via(mapped).runWith(Sink.seq(), system);
List<Pair<String, Integer>> list = result.toCompletableFuture().get(1, TimeUnit.SECONDS);
assertThat(
    list, hasItems(Pair.create("yins", 1), Pair.create("zwyi", 2), Pair.create("dryi", 3)));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/alsoToAll.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asInputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-context.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/asFlowWithContext.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/asFlowWithContext.html)*