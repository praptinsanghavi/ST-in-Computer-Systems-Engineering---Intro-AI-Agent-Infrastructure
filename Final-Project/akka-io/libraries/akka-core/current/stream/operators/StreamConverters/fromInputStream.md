---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:27:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromInputStream.html
title: StreamConverters.fromInputStream • Akka core
---

# StreamConverters.fromInputStream • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# StreamConverters.fromInputStream

Create a source that wraps an `InputStream`.

[Additional Sink and Source converters](../index.html#additional-sink-and-source-converters)

## Signature

[`StreamConverters.fromInputStream`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html#fromInputStream(akka.japi.function.Creator) "akka.stream.javadsl.StreamConverters")[`StreamConverters.fromInputStream`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html#fromInputStream(in:()=%3Ejava.io.InputStream,chunkSize:Int):akka.stream.scaladsl.Source[akka.util.ByteString,scala.concurrent.Future[akka.stream.IOResult]] "akka.stream.scaladsl.StreamConverters")

## Description

Creates a Source from a `java.io.InputStream` created by the given function. Emitted elements are up to `chunkSize` sized [`ByteString`](https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")[`ByteString`](https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html "akka.util.ByteString")s elements. The actual size of the emitted elements depends on how much data the underlying `java.io.InputStream` returns on each read invocation. Such chunks will never be larger than `chunkSize` though.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or set it for a given Source by using `akka.stream.ActorAttributes`.

It materializes a `CompletionStage``Future` of `IOResult` containing the number of bytes read from the source file upon completion, and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does not give any guarantee that the bytes were seen by downstream stages.

The created `InputStream` will be closed when the `Source` is cancelled.

See also [fromOutputStream](fromOutputStream.html)

## Example

Here is an example using both `fromInputStream` and `fromOutputStream` to read from a `java.io.InputStream`, uppercase the read content and write back out into a `java.io.OutputStream`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/stream/operators/converters/ToFromJavaIOStreams.scala#L27-L38 "Go to snippet source")val bytes = "Some random input".getBytes
val inputStream = new ByteArrayInputStream(bytes)
val outputStream = new ByteArrayOutputStream()

val source: Source[ByteString, Future[IOResult]] = StreamConverters.fromInputStream(() => inputStream)

val toUpperCase: Flow[ByteString, ByteString, NotUsed] = Flow[ByteString].map(_.map(_.toChar.toUpper.toByte))

val sink: Sink[ByteString, Future[IOResult]] = StreamConverters.fromOutputStream(() => outputStream)

val eventualResult = source.via(toUpperCase).runWith(sink)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/stream/operators/converters/ToFromJavaIOStreams.java#L65-L80 "Go to snippet source")java.io.InputStream inputStream = new ByteArrayInputStream(bytes);
Source<ByteString, CompletionStage<IOResult>> source =
    StreamConverters.fromInputStream(() -> inputStream);

// Given a ByteString produces a ByteString with the upperCase representation
// Removed from the sample for brevity.
// Flow<ByteString, ByteString, NotUsed> toUpperCase = ...

java.io.OutputStream outputStream = new ByteArrayOutputStream();
Sink<ByteString, CompletionStage<IOResult>> sink =
    StreamConverters.fromOutputStream(() -> outputStream);

CompletionStage<IOResult> ioResultCompletionStage =
    source.via(toUpperCase).runWith(sink, system);
// When the ioResultCompletionStage completes, the byte array backing the outputStream
// will contain the uppercase representation of the bytes read from the inputStream.
```

## Code Examples

### Example 1: Example

```scala
val bytes = "Some random input".getBytes
val inputStream = new ByteArrayInputStream(bytes)
val outputStream = new ByteArrayOutputStream()

val source: Source[ByteString, Future[IOResult]] = StreamConverters.fromInputStream(() => inputStream)

val toUpperCase: Flow[ByteString, ByteString, NotUsed] = Flow[ByteString].map(_.map(_.toChar.toUpper.toByte))

val sink: Sink[ByteString, Future[IOResult]] = StreamConverters.fromOutputStream(() => outputStream)

val eventualResult = source.via(toUpperCase).runWith(sink)
```

### Example 2: Example

```java
java.io.InputStream inputStream = new ByteArrayInputStream(bytes);
Source<ByteString, CompletionStage<IOResult>> source =
    StreamConverters.fromInputStream(() -> inputStream);

// Given a ByteString produces a ByteString with the upperCase representation
// Removed from the sample for brevity.
// Flow<ByteString, ByteString, NotUsed> toUpperCase = ...

java.io.OutputStream outputStream = new ByteArrayOutputStream();
Sink<ByteString, CompletionStage<IOResult>> sink =
    StreamConverters.fromOutputStream(() -> outputStream);

CompletionStage<IOResult> ioResultCompletionStage =
    source.via(toUpperCase).runWith(sink, system);
// When the ioResultCompletionStage completes, the byte array backing the outputStream
// will contain the uppercase representation of the bytes read from the inputStream.
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/StreamConverters$.html
- https://doc.akka.io/api/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/StreamConverters.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromFutureSource.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/Source/fromIterator.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromOutputStream.html
- https://doc.akka.io/libraries/akka-core/current/stream/operators/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromInputStream.html](https://doc.akka.io/libraries/akka-core/current/stream/operators/StreamConverters/fromInputStream.html)*