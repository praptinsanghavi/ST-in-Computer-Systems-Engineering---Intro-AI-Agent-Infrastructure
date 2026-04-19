---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Balance.html
title: Balance • Akka core
---

# Balance • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Balance

Fan\-out the stream to several streams.

[Fan\-out operators](index.html#fan-out-operators)

## Description

Fan\-out the stream to several streams. Each upstream element is emitted to the first available downstream consumer.

## Reactive Streams semantics

**emits** when any of the outputs stops backpressuring; emits the element to the first available output

**backpressures** when all of the outputs backpressure

**completes** when upstream completes

**cancels** depends on the `eagerCancel` flag. If it is true, when any downstream cancels, if false, when all downstreams cancel.

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/backpressureTimeout.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/batch.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Balance.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Balance.html)*