---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asOutputStream.html
title: StreamConverters.asOutputStream • Akka core
---

# StreamConverters.asOutputStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.asOutputStream

Create a source that materializes into an `OutputStream`.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters.asOutputStream`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#asOutputStream(java.time.Duration) "akka.stream.javadsl.StreamConverters")[`StreamConverters.asOutputStream`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#asOutputStream(writeTimeout:scala.concurrent.duration.FiniteDuration):akka.stream.scaladsl.Source[akka.util.ByteString,java.io.OutputStream] "akka.stream.scaladsl.StreamConverters")

## Description

Create a source that materializes into an `OutputStream`. When bytes are written to the `OutputStream` they are emitted from the source.

The `OutputStream` will no longer be writable when the `Source` has been canceled from its downstream, and closing the `OutputStream` will complete the `Source`.

## Reactive Streams semantics

**emits** when bytes are written to the `OutputStream`

**completes** when the `OutputStream` is closed

## Example

Here is an example of a [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") that materializes into a [`java.io.OutputStream`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html "java.io.OutputStream"), and is connected to a Sink which concatenates the incoming [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")s

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/converters/ToFromJavaIOStreams.scala#L60-L65 "Go to snippet source")val source: Source[ByteString, OutputStream] = StreamConverters.asOutputStream()
val sink: Sink[ByteString, Future[ByteString]] = Sink.fold[ByteString, ByteString](ByteString.empty)(_ ++ _)

val (outputStream, result): (OutputStream, Future[ByteString]) =
  source.toMat(sink)(Keep.both).run()

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/converters/ToFromJavaIOStreams.java#L117-L123 "Go to snippet source")final Source<ByteString, OutputStream> source = StreamConverters.asOutputStream();
final Sink<ByteString, CompletionStage<ByteString>> sink =
    Sink.fold(emptyByteString(), (ByteString arg1, ByteString arg2) -> arg1.concat(arg2));

final Pair<OutputStream, CompletionStage<ByteString>> output =
    source.toMat(sink, Keep.both()).run(system);

```

## Code Examples

### Example 1: Example

```scala
val source: Source[ByteString, OutputStream] = StreamConverters.asOutputStream()
val sink: Sink[ByteString, Future[ByteString]] = Sink.fold[ByteString, ByteString](ByteString.empty)(_ ++ _)

val (outputStream, result): (OutputStream, Future[ByteString]) =
  source.toMat(sink)(Keep.both).run()
```

### Example 2: Example

```java
final Source<ByteString, OutputStream> source = StreamConverters.asOutputStream();
final Sink<ByteString, CompletionStage<ByteString>> sink =
    Sink.fold(emptyByteString(), (ByteString arg1, ByteString arg2) -> arg1.concat(arg2));

final Pair<OutputStream, CompletionStage<ByteString>> output =
    source.toMat(sink, Keep.both()).run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/ActorFlow/askWithStatusAndContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Sink/asPublisher.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asOutputStream.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asOutputStream.html)*