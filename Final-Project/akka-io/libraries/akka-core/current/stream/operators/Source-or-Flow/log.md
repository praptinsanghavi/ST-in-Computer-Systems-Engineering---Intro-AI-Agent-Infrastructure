---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:26Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/log.html
title: log • Akka core
---

# log • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# log

Log elements flowing through the stream as well as completion and erroring.

[Simple operators](../index.html#simple-operators)

## Signature

[`Source.log`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html#log(java.lang.String) "akka.stream.javadsl.Source")[`Source.log`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Source") [`Flow.log`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Flow.html#log(java.lang.String) "akka.stream.javadsl.Flow")[`Flow.log`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out] "akka.stream.scaladsl.Flow")

## Description

Log elements flowing through the stream as well as completion and erroring. By default element and completion signals are logged on debug level, and errors are logged on Error level. This can be changed by calling `Attributes.logLevels(...)` `Attributes.createLogLevels(...)` on the given Flow.

See also [logWithMarker](logWithMarker.html).

## Example

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/sourceorflow/Log.scala#L9-L22 "Go to snippet source")import akka.stream.Attributes

.log(name = "myStream")
.addAttributes(
  Attributes.logLevels(
    onElement = Attributes.LogLevels.Off,
    onFinish = Attributes.LogLevels.Info,
    onFailure = Attributes.LogLevels.Error))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/SourceOrFlow.java#L52-L73 "Go to snippet source")import akka.event.LogMarker;
import akka.stream.Attributes;

.log("myStream")
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
import akka.stream.Attributes

.log(name = "myStream")
.addAttributes(
  Attributes.logLevels(
    onElement = Attributes.LogLevels.Off,
    onFinish = Attributes.LogLevels.Info,
    onFailure = Attributes.LogLevels.Error))
```

### Example 2: Example

```java
import akka.event.LogMarker;
import akka.stream.Attributes;

.log("myStream")
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
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/limitWeighted.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/logWithMarker.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/log.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/Source-or-Flow/log.html)*