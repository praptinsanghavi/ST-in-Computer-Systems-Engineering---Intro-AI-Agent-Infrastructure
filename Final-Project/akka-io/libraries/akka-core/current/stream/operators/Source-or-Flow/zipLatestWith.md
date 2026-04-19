---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:55Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatestWith.html
title: zipLatestWith • Akka core
---

# zipLatestWith • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# zipLatestWith

Combines elements from multiple sources through a `combine` function and passes the returned value downstream, picking always the latest element of each.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.zipLatestWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.zipLatestWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "akka.stream.scaladsl.Source") [`Flow.zipLatestWith`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#zipLatestWith(akka.stream.Graph,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.zipLatestWith`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "akka.stream.scaladsl.Flow")

## Description

Combines elements from each of multiple sources into tuples *Pair* and passes the tuples pairs downstream, picking always the latest element of each.

No element is emitted until at least one element from each Source becomes available. Whenever a new element appears, the zipping function is invoked with a tuple containing the new element and the last seen element of the other stream.

## Reactive Streams semantics

**emits** all of the inputs have at least an element available, and then each time an element becomes available on either of the inputs

**backpressures** when downstream backpressures

**completes** when any upstream completes

**cancels** when downstream cancels

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatest.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/zipN.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatestWith.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/zipLatestWith.html)*