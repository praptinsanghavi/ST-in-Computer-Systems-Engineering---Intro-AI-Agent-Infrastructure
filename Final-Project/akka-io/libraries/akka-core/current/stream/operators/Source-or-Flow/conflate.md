---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflate.html
title: conflate • Akka core
---

# conflate • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# conflate

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.conflate`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#conflate(akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.conflate`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2] "akka.stream.scaladsl.Source") [`Flow.conflate`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#conflate(akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.conflate`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2] "akka.stream.scaladsl.Flow")

## Description

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure. The summary value must be of the same type as the incoming elements, for example the sum or average of incoming numbers, if aggregation should lead to a different type `conflateWithSeed` can be used:

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Conflate.scala#L9-L23 "Go to snippet source")import akka.stream.scaladsl.Source

import scala.concurrent.duration._

Source
  .cycle(() => List(1, 10, 100, 1000).iterator)
  .throttle(10, per = 1.second) // faster upstream
  .conflate((acc, el) => acc + el) // acc: Int, el: Int
  .throttle(1, per = 1.second) // slow downstream
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L300-L303 "Go to snippet source")Source.cycle(() -> Arrays.asList(1, 10, 100).iterator())
    .throttle(10, Duration.ofSeconds(1)) // fast upstream
    .conflate((Integer acc, Integer el) -> acc + el)
    .throttle(1, Duration.ofSeconds(1)); // slow downstream
```

If downstream is slower the elements are conflated by summing them. This means that upstream can continue producing elements while downstream is applying backpressure. For example: downstream is backpressuring while 1, 10 and 100 arrives from upstream, then backpressure stops and the conflated 111 is emitted downstream.

See [Rate transformation](../../stream-rate.html#rate-transformation) for more information and examples.

## Reactive Streams semantics

**emits** when downstream stops backpressuring and there is a conflated element available

**backpressures** when the aggregate function cannot keep up with incoming elements

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.Source

import scala.concurrent.duration._

Source
  .cycle(() => List(1, 10, 100, 1000).iterator)
  .throttle(10, per = 1.second) // faster upstream
  .conflate((acc, el) => acc + el) // acc: Int, el: Int
  .throttle(1, per = 1.second) // slow downstream
```

### Example 2: Example

```java
Source.cycle(() -> Arrays.asList(1, 10, 100).iterator())
    .throttle(10, Duration.ofSeconds(1)) // fast upstream
    .conflate((Integer acc, Integer el) -> acc + el)
    .throttle(1, Duration.ofSeconds(1)); // slow downstream
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/concatLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflateWithSeed.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflate.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflate.html)*