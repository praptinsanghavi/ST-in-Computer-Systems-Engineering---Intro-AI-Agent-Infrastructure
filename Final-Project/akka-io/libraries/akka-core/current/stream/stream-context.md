---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:30Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/stream-context.html
title: Context Propagation • Akka core
---

# Context Propagation • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Context Propagation

It can be convenient to attach metadata to each element in the stream.

For example, when reading from an external data source it can be useful to keep track of the read offset, so it can be marked as processed when the element reaches the [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink").

For this use case we provide the [`SourceWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html "akka.stream.javadsl.SourceWithContext")[`SourceWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html "akka.stream.scaladsl.SourceWithContext") and [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") variations on [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow").

Essentially, a [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") is just a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that contains tuplespairs of element and context, but the advantage is in the operators: most operators on [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") will work on the element rather than on the tuplepair, allowing you to focus on your application logic rather without worrying about the context.

## Restrictions

Not all operations that are available on [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") are also available on [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext"). This is intentional: in the use case of keeping track of a read offset, if the [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") was allowed to arbitrarily filter and reorder the stream, the [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") would have no way to determine whether an element was skipped or merely reordered and still in flight.

For this reason, [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") allows filtering operations (such as `filter`, `filterNot`, `collect`, etc.) and grouping operations (such as `grouped`, `sliding`, etc.) but not reordering operations (such as `mapAsyncUnordered` and `statefulMapConcat`). Finally, also ‘one\-to\-n’ operations such as `mapConcat` are allowed.

Filtering operations will drop the context along with dropped elements, while grouping operations will keep all contexts from the elements in the group. Streaming one\-to\-many operations such as `mapConcat` associate the original context with each of the produced elements.

As an escape hatch, there is a `via` operator that allows you to insert an arbitrary [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") that can process the tuplespairs of elements and context in any way desired. When using this operator, it is the responsibility of the implementor to make sure this [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") does not perform any operations (such as reordering) that might break assumptions made by the [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") consuming the context elements.

## Creation

The simplest way to create a [`SourceWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html "akka.stream.javadsl.SourceWithContext")[`SourceWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html "akka.stream.scaladsl.SourceWithContext") is to first create a regular [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") with elements from which the context can be extracted, and then use [Source.asSourceWithContext](operators/Source/asSourceWithContext.html).

## Composition

When you have a [`SourceWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html "akka.stream.javadsl.SourceWithContext")[`SourceWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html "akka.stream.scaladsl.SourceWithContext") `source` that produces elements of type `Foo` with a context of type `Ctx`, and a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") `flow` from `Foo` to `Bar`, you cannot simply `source.via(flow)` to arrive at a [`SourceWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html "akka.stream.javadsl.SourceWithContext")[`SourceWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html "akka.stream.scaladsl.SourceWithContext") that produces elements of type `Bar` with contexts of type `Ctx`. The reason for this is that `flow` might reorder the elements flowing through it, making `via` challenging to implement.

Due to this there is a `unsafeDataVia` that can be used instead however no protection is offered to prevent reordering or dropping/duplicating elements from stream so use this operation with great care.

There is also a [Flow.asFlowWithContext](operators/Flow/asFlowWithContext.html) which can be used when the types used in the inner [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") have room to hold the context. If this is not the case, a better solution is usually to build the flow from the ground up as a [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext"), instead of first building a [`Flow`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") and trying to convert it to [`FlowWithContext`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html "akka.stream.javadsl.FlowWithContext")[`FlowWithContext`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html "akka.stream.scaladsl.FlowWithContext") after\-the\-fact.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/asFlowWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/asSourceWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-dynamic.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/stream-context.html](https://doc.akka.io/libraries/akka-core/current/stream/stream-context.html)*