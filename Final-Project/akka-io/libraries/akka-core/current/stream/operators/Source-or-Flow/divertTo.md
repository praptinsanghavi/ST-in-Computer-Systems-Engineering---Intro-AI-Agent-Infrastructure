---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:28:34Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/divertTo.html
title: divertTo • Akka core
---

# divertTo • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# divertTo

Each upstream element will either be diverted to the given sink, or the downstream consumer according to the predicate function applied to the element.

[Fan\-out operators](../index.html#fan-out-operators)

## Signature

[`Source.divertTo`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#divertTo(akka.stream.Graph,akka.japi.function.Predicate) "akka.stream.javadsl.Source")[`Source.divertTo`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:Out=>Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.divertTo`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#divertTo(akka.stream.Graph,akka.japi.function.Predicate) "akka.stream.javadsl.Flow")[`Flow.divertTo`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:Out=>Boolean):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Each upstream element will either be diverted to the given sink, or the downstream consumer according to the predicate function applied to the element.

## Reactive Streams semantics

**emits** when the chosen output stops backpressuring and there is an input element available

**backpressures** when the chosen output backpressures

**completes** when upstream completes and no output is pending

**cancels** when any of the downstreams cancel

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/detach.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/drop.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/divertTo.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/divertTo.html)*