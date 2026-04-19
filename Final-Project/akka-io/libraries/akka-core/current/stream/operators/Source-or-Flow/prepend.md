---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prepend.html
title: prepend • Akka core
---

# prepend • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# prepend

Prepends the given source to the flow, consuming it until completion before the original source is consumed.

[Fan\-in operators](../index.html#fan-in-operators)

## Signature

[`Source.prepend`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#prepend(akka.stream.Graph) "akka.stream.javadsl.Source")[`Source.prepend`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Source") [`Flow.prepend`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#prepend(akka.stream.Graph) "akka.stream.javadsl.Flow")[`Flow.prepend`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "akka.stream.scaladsl.Flow")

## Description

Prepends the given source to the flow, consuming it until completion before the original source is consumed.

Note

```
The `prepend` operator is for backwards compatibility reasons "detached" and will eagerly
demand an element from both upstreams when the stream is materialized and will then have a
one element buffer for each of the upstreams, this is most often not what you want, instead
use @ref(prependLazy)[prependLazy.md]

```

If materialized values needs to be collected `prependMat` is available.

Note
The `prepend` operator is for backwards compatibility reasons “detached” and will eagerly demand an element from both upstreams when the stream is materialized and will then have a one element buffer for each of the upstreams, this is not always what you want, if not, use @ref(prependLazy)\[prependLazy.md]

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream-tests/src/test/scala/akka/stream/scaladsl/FlowPrependSpec.scala#L15-L19 "Go to snippet source")val ladies = Source(List("Emma", "Emily"))
val gentlemen = Source(List("Liam", "William"))

gentlemen.prepend(ladies).runWith(Sink.foreach(println))
// this will print "Emma", "Emily", "Liam", "William"
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L31-L141 "Go to snippet source")import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> ladies = Source.from(Arrays.asList("Emma", "Emily"));
Source<String, NotUsed> gentlemen = Source.from(Arrays.asList("Liam", "William"));
gentlemen.prepend(ladies).runForeach(System.out::println, system);
// this will print "Emma", "Emily", "Liam", "William"

Source<String, NotUsed> ladies = Source.from(Arrays.asList("Emma", "Emily"));
Source<String, NotUsed> gentlemen = Source.from(Arrays.asList("Liam", "William"));
gentlemen.prependLazy(ladies).runForeach(System.out::println, system);
// this will print "Emma", "Emily", "Liam", "William"

```

## Reactive Streams semantics

**emits** when the given stream has an element available; if the given input completes, it tries the current one

**backpressures** when downstream backpressures

**completes** when all upstreams complete

## Code Examples

### Example 1: Description

```text
The `prepend` operator is for backwards compatibility reasons "detached" and will eagerly
demand an element from both upstreams when the stream is materialized and will then have a
one element buffer for each of the upstreams, this is most often not what you want, instead
use @ref(prependLazy)[prependLazy.md]
```

### Example 2: Example

```scala
val ladies = Source(List("Emma", "Emily"))
val gentlemen = Source(List("Liam", "William"))

gentlemen.prepend(ladies).runWith(Sink.foreach(println))
// this will print "Emma", "Emily", "Liam", "William"
```

### Example 3: Example

```java
import akka.stream.javadsl.Keep;
import akka.stream.javadsl.Source;
import akka.stream.javadsl.Sink;

import java.util.*;

Source<String, NotUsed> ladies = Source.from(Arrays.asList("Emma", "Emily"));
Source<String, NotUsed> gentlemen = Source.from(Arrays.asList("Liam", "William"));
gentlemen.prepend(ladies).runForeach(System.out::println, system);
// this will print "Emma", "Emily", "Liam", "William"

Source<String, NotUsed> ladies = Source.from(Arrays.asList("Emma", "Emily"));
Source<String, NotUsed> gentlemen = Source.from(Arrays.asList("Liam", "William"));
gentlemen.prependLazy(ladies).runForeach(System.out::println, system);
// this will print "Emma", "Emily", "Liam", "William"
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/preMaterialize.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prependLazy.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prepend.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/prepend.html)*