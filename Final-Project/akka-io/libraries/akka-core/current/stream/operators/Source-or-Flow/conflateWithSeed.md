---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:40Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflateWithSeed.html
title: conflateWithSeed • Akka core
---

# conflateWithSeed • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# conflateWithSeed

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure.

[Backpressure aware operators](../index.html#backpressure-aware-operators)

## Signature

[`Source.conflateWithSeed`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#conflateWithSeed(akka.japi.function.Function,akka.japi.function.Function2) "akka.stream.javadsl.Source")[`Source.conflateWithSeed`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "akka.stream.scaladsl.Source") [`Flow.conflateWithSeed`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#conflateWithSeed(akka.japi.function.Function,akka.japi.function.Function2) "akka.stream.javadsl.Flow")[`Flow.conflateWithSeed`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "akka.stream.scaladsl.Flow")

## Description

Allow for a slower downstream by passing incoming elements and a summary into an aggregate function as long as there is backpressure. When backpressure starts or there is no backpressure element is passed into a `seed` function to transform it to the summary type.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Conflate.scala#L9-L39 "Go to snippet source")import akka.stream.scaladsl.Source

import scala.concurrent.duration._

case class Summed(i: Int) {
  def sum(other: Summed) = Summed(this.i + other.i)
}

Source
  .cycle(() => List(1, 10, 100, 1000).iterator)
  .throttle(10, per = 1.second) // faster upstream
  .conflateWithSeed(el => Summed(el))((acc, el) => acc.sum(Summed(el))) // (Summed, Int) => Summed
  .throttle(1, per = 1.second) // slow downstream
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L340-L351 "Go to snippet source")class Summed {

  private final Integer el;

  public Summed(Integer el) {
    this.el = el;
  }

  public Summed sum(Summed other) {
    return new Summed(this.el + other.el);
  }
}

Source.cycle(() -> Arrays.asList(1, 10, 100).iterator())
    .throttle(10, Duration.ofSeconds(1)) // fast upstream
    .conflateWithSeed(Summed::new, (Summed acc, Integer el) -> acc.sum(new Summed(el)))
    .throttle(1, Duration.ofSeconds(1)); // slow downstream
```

If downstream is slower, the “seed” function is called which is able to change the type of the to be conflated elements if needed (it can also be an identity function, in which case this `conflateWithSeed` is equivalent to a plain `conflate`). Next, the conflating function is applied while there is back\-pressure from the downstream, such that the upstream can produce elements at an rate independent of the downstream.

You may want to use this operation for example to apply an average operation on the upstream elements, while the downstream backpressures. This allows us to keep processing upstream elements, and give an average number to the downstream once it is ready to process the next one.

See [Rate transformation](../../stream-rate.html#rate-transformation) for more information and examples.

## Reactive Streams semantics

**emits** when downstream stops backpressuring and there is a conflated element available

**backpressures** when the aggregate or seed functions cannot keep up with incoming elements

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
import akka.stream.scaladsl.Source

import scala.concurrent.duration._

case class Summed(i: Int) {
  def sum(other: Summed) = Summed(this.i + other.i)
}

Source
  .cycle(() => List(1, 10, 100, 1000).iterator)
  .throttle(10, per = 1.second) // faster upstream
  .conflateWithSeed(el => Summed(el))((acc, el) => acc.sum(Summed(el))) // (Summed, Int) => Summed
  .throttle(1, per = 1.second) // slow downstream
```

### Example 2: Example

```java
class Summed {

  private final Integer el;

  public Summed(Integer el) {
    this.el = el;
  }

  public Summed sum(Summed other) {
    return new Summed(this.el + other.el);
  }
}

Source.cycle(() -> Arrays.asList(1, 10, 100).iterator())
    .throttle(10, Duration.ofSeconds(1)) // fast upstream
    .conflateWithSeed(Summed::new, (Summed acc, Integer el) -> acc.sum(new Summed(el)))
    .throttle(1, Duration.ofSeconds(1)); // slow downstream
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/contramap.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflate.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-rate.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflateWithSeed.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/conflateWithSeed.html)*