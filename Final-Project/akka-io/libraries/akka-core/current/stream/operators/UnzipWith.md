---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:59Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/UnzipWith.html
title: UnzipWith • Akka core
---

# UnzipWith • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# UnzipWith

Splits each element of input into multiple downstreams using a function

[Fan\-out operators](index.html#fan-out-operators)

## Signature

## Description

Splits each element of input into multiple downstreams using a function

## Reactive Streams semantics

**emits** when all of the outputs stops backpressuring and there is an input element available

**backpressures** when any of the outputs backpressures

**completes** when upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/watch.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Unzip.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/UnzipWith.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/UnzipWith.html)*