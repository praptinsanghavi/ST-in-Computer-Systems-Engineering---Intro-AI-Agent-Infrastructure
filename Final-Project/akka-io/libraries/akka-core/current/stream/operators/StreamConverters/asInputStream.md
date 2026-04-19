---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:13Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asInputStream.html
title: StreamConverters.asInputStream • Akka core
---

# StreamConverters.asInputStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.asInputStream

Create a sink which materializes into an `InputStream` that can be read to trigger demand through the sink.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters.asInputStream`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#asInputStream() "akka.stream.javadsl.StreamConverters")[`StreamConverters.asInputStream`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#asInputStream(readTimeout:scala.concurrent.duration.FiniteDuration):akka.stream.scaladsl.Sink[akka.util.ByteString,java.io.InputStream] "akka.stream.scaladsl.StreamConverters")

## Description

Create a sink which materializes into an `InputStream` that can be read to trigger demand through the sink. Bytes emitted through the stream will be available for reading through the `InputStream`

The `InputStream` will be ended when the stream flowing into this `Sink` completes, and the closing the `InputStream` will cancel the inflow of this `Sink`.

## Reactive Streams semantics

**cancels** when the `InputStream` is closed

**backpressures** when no read is pending on the `InputStream`

## Example

Here is an example of a [`Sink`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html "akka.stream.javadsl.Sink")[`Sink`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html "akka.stream.scaladsl.Sink") that reads the contents from the source, converts it into uppercase and materializes into a [`java.io.InputStream`](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html "java.io.InputStream")

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/converters/ToFromJavaIOStreams.scala#L48-L52 "Go to snippet source")val toUpperCase: Flow[ByteString, ByteString, NotUsed] = Flow[ByteString].map(_.map(_.toChar.toUpper.toByte))
val source: Source[ByteString, NotUsed] = Source.single(ByteString("some random input"))
val sink: Sink[ByteString, InputStream] = StreamConverters.asInputStream()

val inputStream: InputStream = source.via(toUpperCase).runWith(sink)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/converters/ToFromJavaIOStreams.java#L92-L106 "Go to snippet source")Charset charset = Charset.defaultCharset();
Flow<ByteString, ByteString, NotUsed> toUpperCase =
    Flow.<ByteString>create()
        .map(
            bs -> {
              String str = bs.decodeString(charset).toUpperCase();
              return ByteString.fromString(str, charset);
            });

final Sink<ByteString, InputStream> sink = StreamConverters.asInputStream();
final InputStream stream =
    Source.single(ByteString.fromString("Some random input"))
        .via(toUpperCase)
        .runWith(sink, system);

```

## Code Examples

### Example 1: Example

```scala
val toUpperCase: Flow[ByteString, ByteString, NotUsed] = Flow[ByteString].map(_.map(_.toChar.toUpper.toByte))
val source: Source[ByteString, NotUsed] = Source.single(ByteString("some random input"))
val sink: Sink[ByteString, InputStream] = StreamConverters.asInputStream()

val inputStream: InputStream = source.via(toUpperCase).runWith(sink)
```

### Example 2: Example

```java
Charset charset = Charset.defaultCharset();
Flow<ByteString, ByteString, NotUsed> toUpperCase =
    Flow.<ByteString>create()
        .map(
            bs -> {
              String str = bs.decodeString(charset).toUpperCase();
              return ByteString.fromString(str, charset);
            });

final Sink<ByteString, InputStream> sink = StreamConverters.asInputStream();
final InputStream stream =
    Source.single(ByteString.fromString("Some random input"))
        .via(toUpperCase)
        .runWith(sink, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Flow/asFlowWithContext.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asJavaStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asInputStream.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/asInputStream.html)*