---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/logWithMarker.html
title: logWithMarker • Akka core
---

# logWithMarker • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# logWithMarker

Log elements flowing through the stream as well as completion and erroring.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.logWithMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#logWithMarker(java.lang.String,akka.japi.function.Function) "akka.stream.javadsl.Source")[`Source.logWithMarker`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.logWithMarker`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#logWithMarker(java.lang.String,akka.japi.function.Function) "akka.stream.javadsl.Flow")[`Flow.logWithMarker`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Log elements flowing through the stream as well as completion and erroring. By default element and completion signals are logged on debug level, and errors are logged on Error level. This can be changed by calling `Attributes.logLevels(...)` `Attributes.createLogLevels(...)` on the given Flow.

See also [log](log.html).

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/LogWithMarker.scala#L9-L23 "Go to snippet source")import akka.event.LogMarker
import akka.stream.Attributes

.logWithMarker(name = "myStream", e => LogMarker(name = "myMarker", properties = Map("element" -> e)))
.addAttributes(
  Attributes.logLevels(
    onElement = Attributes.LogLevels.Off,
    onFinish = Attributes.LogLevels.Info,
    onFailure = Attributes.LogLevels.Error))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L81-L87 "Go to snippet source").logWithMarker(
    "myStream", (e) -> LogMarker.create("myMarker", Collections.singletonMap("element", e)))
.addAttributes(
    Attributes.createLogLevels(
        Attributes.logLevelOff(), // onElement
        Attributes.logLevelInfo(), // onFinish
        Attributes.logLevelError())) // onFailure
```

## Reactive Streams semantics

**emits** when upstream emits

**backpressures** when downstream backpressures

**completes** when upstream completes

## Code Examples

### Example 1: Example

```scala
import akka.event.LogMarker
import akka.stream.Attributes

.logWithMarker(name = "myStream", e => LogMarker(name = "myMarker", properties = Map("element" -> e)))
.addAttributes(
  Attributes.logLevels(
    onElement = Attributes.LogLevels.Off,
    onFinish = Attributes.LogLevels.Info,
    onFailure = Attributes.LogLevels.Error))
```

### Example 2: Example

```java
.logWithMarker(
    "myStream", (e) -> LogMarker.create("myMarker", Collections.singletonMap("element", e)))
.addAttributes(
    Attributes.createLogLevels(
        Attributes.logLevelOff(), // onElement
        Attributes.logLevelInfo(), // onFinish
        Attributes.logLevelError())) // onFailure
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/log.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/map.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/logWithMarker.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/logWithMarker.html)*