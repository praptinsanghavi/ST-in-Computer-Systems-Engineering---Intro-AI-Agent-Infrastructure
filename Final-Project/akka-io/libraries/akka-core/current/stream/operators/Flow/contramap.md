---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:18Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/contramap.html
title: contramap • Akka core
---

# contramap • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# contramap

Transform this Flow by applying a function to each *incoming* upstream element before it is passed to the Flow.

[Simple operators](../index.html#simple-operators)

## Signature

[`Flow.contramap`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html "akka.stream.javadsl.Flow")[`Flow.contramap`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html "akka.stream.scaladsl.Flow") { scala\=“\#contramap[In2](f:In2=>In):Flow\[In2, Out, Mat]” java\=“\#map( akka.japi.function.Function)” }

## Description

Transform this Flow by applying a function to each *incoming* upstream element before it is passed to the Flow.

## Examples

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/flow/ContraMap.scala#L8-L10 "Go to snippet source")import akka.NotUsed
import akka.stream.scaladsl._

val flow: Flow[Int, Int, NotUsed] = Flow[Int]
val newFlow: Flow[String, Int, NotUsed] = flow.contramap(_.toInt)
```

## Reactive Streams semantics

**emits** when the mapping function returns an element

**backpressures** ’‘‘Backpressures when’’’ original flow backpressures

**completes** when upstream completes

**cancels** when original flow cancels

## Code Examples

### Example 1: Examples

```scala
import akka.NotUsed
import akka.stream.scaladsl._

val flow: Flow[Int, Int, NotUsed] = Flow[Int]
val newFlow: Flow[String, Int, NotUsed] = flow.contramap(_.toInt)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflateWithSeed.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/cycle.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/contramap.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/contramap.html)*