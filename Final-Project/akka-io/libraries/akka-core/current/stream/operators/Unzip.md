---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Unzip.html
title: Unzip • Akka core
---

# Unzip • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Unzip

Takes a stream of two element tuples and unzips the two elements ino two different downstreams.

[Fan\-out operators](index.html#fan-out-operators)

## Signature

## Description

Takes a stream of two element tuples and unzips the two elements ino two different downstreams.

## Reactive Streams semantics

**emits** when all of the outputs stops backpressuring and there is an input element available

**backpressures** when any of the outputs backpressures

**completes** when upstream completes

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/unfoldResourceAsync.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/UnzipWith.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Unzip.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Unzip.html)*