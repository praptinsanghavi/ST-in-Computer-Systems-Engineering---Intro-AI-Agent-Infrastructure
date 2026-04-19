---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prependLazy.html
title: prependLazy • Akka core
---

# prependLazy • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# prependLazy

Prepends the given source to the flow, consuming it until completion before the original source is consumed.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.prepend`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#prepend(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.prepend`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.prepend`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#prepend(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.prepend`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Prepends the given source to the flow, consuming it until completion before the original source is consumed.

Both streams will be materialized together, however, the original stream will be pulled for the first time only after the prepended upstream was completed. (In contrast, @ref(prepend)\[prepend.md], introduces single\-element buffers after both, original and given sources so that the original source is also pulled once immediately.)

If materialized values needs to be collected `prependLazyMat` is available.

See also [prepend](prepend.html) which is detached.

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowPrependSpec.scala#L25-L29 "Go to snippet source")val ladies = Source(List("Emma", "Emily"))
val gentlemen = Source(List("Liam", "William"))

gentlemen.prependLazy(ladies).runWith(Sink.foreach(println))
// this will print "Emma", "Emily", "Liam", "William"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L36 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

```

## Reactive Streams semantics

**emits** when the given stream has an element available; if the given input completes, it tries the current one

**backpressures** when downstream backpressures

**completes** when all upstreams complete

## Code Examples

### Example 1: Example

```scala
val ladies = Source(List("Emma", "Emily"))
val gentlemen = Source(List("Liam", "William"))

gentlemen.prependLazy(ladies).runWith(Sink.foreach(println))
// this will print "Emma", "Emily", "Liam", "William"
```

### Example 2: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prepend.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/queue.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prependLazy.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prependLazy.html)*