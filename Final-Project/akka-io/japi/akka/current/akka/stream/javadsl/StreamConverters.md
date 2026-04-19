---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:45:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/javadsl/StreamConverters.html
title: StreamConverters
---

# StreamConverters

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class StreamConverters

- java.lang.Object
- - akka.stream.javadsl.StreamConverters

- ---

```
public class StreamConverters
extends java.lang.Object
```

Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StreamConverters](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.InputStream>` | `[asInputStream](#asInputStream())()` | Creates a Sink which when materialized will return an `InputStream` which it is possible  to read the values produced by the stream this Sink is attached to. |
	| `static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.InputStream>` | `[asInputStream](#asInputStream(java.time.Duration))​(java.time.Duration readTimeout)` | Creates a Sink which when materialized will return an `InputStream` which it is possible  to read the values produced by the stream this Sink is attached to. |
	| `static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.stream.Stream<T>>` | `[asJavaStream](#asJavaStream())()` | Creates a sink which materializes into Java 8 Stream that can be run to trigger demand through the sink. |
	| `static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.OutputStream>` | `[asOutputStream](#asOutputStream())()` | Creates a Source which when materialized will return an `OutputStream` which it is possible  to write the ByteStrings to the stream this Source is attached to. |
	| `static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.OutputStream>` | `[asOutputStream](#asOutputStream(java.time.Duration))​(java.time.Duration writeTimeout)` | Creates a Source which when materialized will return an `OutputStream` which it is possible  to write the ByteStrings to the stream this Source is attached to. |
	| `static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromInputStream](#fromInputStream(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.InputStream> in)` | Creates a Source from an `InputStream` created by the given function. |
	| `static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromInputStream](#fromInputStream(akka.japi.function.Creator,int))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.InputStream> in,  int chunkSize)` | Creates a Source from an `InputStream` created by the given function. |
	| `static <O,​S extends java.util.stream.BaseStream<O,​S>>[Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromJavaStream](#fromJavaStream(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.BaseStream<O,​S>> stream)` | Creates a source that wraps a Java 8 Stream. |
	| `static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromOutputStream](#fromOutputStream(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.OutputStream> f)` | Sink which writes incoming `ByteString`s to an `OutputStream` created by the given function. |
	| `static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromOutputStream](#fromOutputStream(akka.japi.function.Creator,boolean))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.OutputStream> f,  boolean autoFlush)` | Sink which writes incoming `ByteString`s to an `OutputStream` created by the given function. |
	| `static <T,​R>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<R>>` | `[javaCollector](#javaCollector(akka.japi.function.Creator))​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.Collector<T,​?,​R>> collector)` | Creates a sink which materializes into a CompletionStage which will be completed with a result of the Java 8 Collector  transformation and reduction operations. |
	| `static <T,​R>[Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<R>>` | `[javaCollectorParallelUnordered](#javaCollectorParallelUnordered(int,akka.japi.function.Creator))​(int parallelism,  [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.Collector<T,​?,​R>> collector)` | Creates a sink which materializes into a CompletionStage which will be completed with a result of the Java 8 Collector  transformation and reduction operations. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StreamConverters
		
		
		
		```
		public StreamConverters()
		```

	- ### Method Detail
	
	
	
		- #### fromOutputStream
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromOutputStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.OutputStream> f)
		```
		
		Sink which writes incoming `ByteString`s to an `OutputStream` created by the given function.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 This method uses no auto flush for the `OutputStream` @see `#fromOutputStream(function.Creator, Boolean)` if you want to override it.
		 
		
		
		 The `OutputStream` will be closed when the stream flowing into this [`Sink`](Sink.html "class in akka.stream.javadsl") is completed. The [`Sink`](Sink.html "class in akka.stream.javadsl")
		 will cancel the stream when the `OutputStream` is no longer writable.
		 
		
		
		
		Parameters:
		`f` \- A Creator which creates an OutputStream to write to
		- #### fromOutputStream
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromOutputStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.OutputStream> f,
		                                                                                                     boolean autoFlush)
		```
		
		Sink which writes incoming `ByteString`s to an `OutputStream` created by the given function.
		 
		 Materializes a `CompletionStage` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The `OutputStream` will be closed when the stream flowing into this [`Sink`](Sink.html "class in akka.stream.javadsl") is completed. The [`Sink`](Sink.html "class in akka.stream.javadsl")
		 will cancel the stream when the `OutputStream` is no longer writable.
		 
		
		
		
		Parameters:
		`f` \- A Creator which creates an OutputStream to write to
		`autoFlush` \- If true the OutputStream will be flushed whenever a byte array is written
		- #### asInputStream
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.InputStream> asInputStream()
		```
		
		Creates a Sink which when materialized will return an `InputStream` which it is possible
		 to read the values produced by the stream this Sink is attached to.
		 
		 This method uses a default read timeout, use `#inputStream(FiniteDuration)` or `#inputStream(java.time.Duration)` to explicitly
		 configure the timeout.
		 
		
		
		 This Sink is intended for inter\-operation with legacy APIs since it is inherently blocking.
		 
		
		
		 You can configure the internal buffer size by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The `InputStream` will be closed when the stream flowing into this [`Sink`](Sink.html "class in akka.stream.javadsl") completes, and
		 closing the `InputStream` will cancel this [`Sink`](Sink.html "class in akka.stream.javadsl").
		- #### asInputStream
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.InputStream> asInputStream​(java.time.Duration readTimeout)
		```
		
		Creates a Sink which when materialized will return an `InputStream` which it is possible
		 to read the values produced by the stream this Sink is attached to.
		 
		 This Sink is intended for inter\-operation with legacy APIs since it is inherently blocking.
		 
		
		
		 You can configure the internal buffer size by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The `InputStream` will be closed when the stream flowing into this [`Sink`](Sink.html "class in akka.stream.javadsl") completes, and
		 closing the `InputStream` will cancel this [`Sink`](Sink.html "class in akka.stream.javadsl").
		 
		
		
		
		Parameters:
		`readTimeout` \- the max time the read operation on the materialized InputStream should block
		- #### fromInputStream
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromInputStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.InputStream> in,
		                                                                                                      int chunkSize)
		```
		
		Creates a Source from an `InputStream` created by the given function.
		 Emitted elements are up to `chunkSize` sized [`ByteString`](../../util/ByteString.html "class in akka.util") elements.
		 The actual size of the emitted elements depends on how much data the underlying
		 `InputStream` returns on each read invocation. Such chunks will
		 never be larger than chunkSize though.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		 The created `InputStream` will be closed when the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled.
		- #### fromInputStream
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[IOResult](../IOResult.html "class in akka.stream")>> fromInputStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.io.InputStream> in)
		```
		
		Creates a Source from an `InputStream` created by the given function.
		 Emitted elements are up to 8192 bytes sized [`ByteString`](../../util/ByteString.html "class in akka.util") elements.
		 The actual size of the emitted elements depends on how much data the underlying
		 `InputStream` returns on each read invocation. Such chunks will
		 never be larger than chunkSize though.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `CompletionStage` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 The created `InputStream` will be closed when the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled.
		- #### asOutputStream
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.OutputStream> asOutputStream​(java.time.Duration writeTimeout)
		```
		
		Creates a Source which when materialized will return an `OutputStream` which it is possible
		 to write the ByteStrings to the stream this Source is attached to.
		 
		 This Source is intended for inter\-operation with legacy APIs since it is inherently blocking.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The created `OutputStream` will be closed when the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled, and closing the `OutputStream`
		 will complete this [`Source`](Source.html "class in akka.stream.javadsl").
		 
		
		
		
		Parameters:
		`writeTimeout` \- the max time the write operation on the materialized OutputStream should block
		- #### asOutputStream
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.OutputStream> asOutputStream()
		```
		
		Creates a Source which when materialized will return an `OutputStream` which it is possible
		 to write the ByteStrings to the stream this Source is attached to. The write timeout for OutputStreams
		 materialized will default to 5 seconds, @see `#outputStream(FiniteDuration)` or `#outputStream(java.time.Duration)` if you want to override it.
		 
		 This Source is intended for inter\-operation with legacy APIs since it is inherently blocking.
		 
		
		
		 You can configure the internal buffer size by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The created `OutputStream` will be closed when the [`Source`](Source.html "class in akka.stream.javadsl") is cancelled, and closing the `OutputStream`
		 will complete this [`Source`](Source.html "class in akka.stream.javadsl").
		- #### asJavaStream
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.stream.Stream<T>> asJavaStream()
		```
		
		Creates a sink which materializes into Java 8 Stream that can be run to trigger demand through the sink.
		 Elements emitted through the stream will be available for reading through the Java 8 Stream.
		 
		 The Java 8 Stream will be ended when the stream flowing into this Sink completes, and closing the Java
		 Stream will cancel the inflow of this Sink.
		 
		
		
		 Java 8 Stream throws exception in case reactive stream failed.
		 
		
		
		 Be aware that Java Stream blocks current thread while waiting on next element from downstream.
		 As it is interacting wit blocking API the implementation runs on a separate dispatcher
		 configured through the akka.stream.blocking\-io\-dispatcher.
		- #### fromJavaStream
		
		
		
		```
		public static <O,​S extends java.util.stream.BaseStream<O,​S>> [Source](Source.html "class in akka.stream.javadsl")<O,​[NotUsed](../../NotUsed.html "class in akka")> fromJavaStream​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.BaseStream<O,​S>> stream)
		```
		
		Creates a source that wraps a Java 8 Stream. Source uses a stream iterator to get all its
		 elements and send them downstream on demand.
		 
		 Example usage: `Source.fromJavaStream(() -> IntStream.rangeClosed(1, 10))`
		
		
		
		 You can use `Source.async` to create asynchronous boundaries between synchronous java stream
		 and the rest of flow.
		- #### javaCollector
		
		
		
		```
		public static <T,​R> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<R>> javaCollector​([Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.Collector<T,​?,​R>> collector)
		```
		
		Creates a sink which materializes into a CompletionStage which will be completed with a result of the Java 8 Collector
		 transformation and reduction operations. This allows usage of Java 8 streams transformations for reactive streams.
		 The Collector will trigger demand downstream. Elements emitted through the stream will be accumulated into a mutable
		 result container, optionally transformed into a final representation after all input elements have been processed.
		 The Collector can also do reduction at the end. Reduction processing is performed sequentially
		 
		 Note that a flow can be materialized multiple times, so the function producing the Collector must be able
		 to handle multiple invocations.
		- #### javaCollectorParallelUnordered
		
		
		
		```
		public static <T,​R> [Sink](Sink.html "class in akka.stream.javadsl")<T,​java.util.concurrent.CompletionStage<R>> javaCollectorParallelUnordered​(int parallelism,
		                                                                                                               [Creator](../../japi/function/Creator.html "interface in akka.japi.function")<java.util.stream.Collector<T,​?,​R>> collector)
		```
		
		Creates a sink which materializes into a CompletionStage which will be completed with a result of the Java 8 Collector
		 transformation and reduction operations. This allows usage of Java 8 streams transformations for reactive streams.
		 The Collector will trigger demand downstream. Elements emitted through the stream will be accumulated into a mutable
		 result container, optionally transformed into a final representation after all input elements have been processed.
		 Collector can also do reduction at the end. Reduction processing is performed in parallel based on graph Balance.
		 
		 Note that a flow can be materialized multiple times, so the function producing the Collector must be able
		 to handle multiple invocations.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/javadsl/StreamConverters.html](https://doc.akka.io/japi/akka/current/akka/stream/javadsl/StreamConverters.html)*