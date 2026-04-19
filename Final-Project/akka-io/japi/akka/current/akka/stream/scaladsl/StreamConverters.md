---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:42:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamConverters.html
title: StreamConverters
---

# StreamConverters

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class StreamConverters

- java.lang.Object
- - akka.stream.scaladsl.StreamConverters

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
	| `static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.InputStream>` | `[asInputStream](#asInputStream(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration readTimeout)` | Creates a Sink which when materialized will return an `InputStream` which it is possible  to read the values produced by the stream this Sink is attached to. |
	| `static scala.concurrent.duration.FiniteDuration` | `[asInputStream$default$1](#asInputStream$default$1())()` |  |
	| `static <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​java.util.stream.Stream<T>>` | `[asJavaStream](#asJavaStream())()` | Creates a sink which materializes into Java 8 Stream that can be run to trigger demand through the sink. |
	| `static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.OutputStream>` | `[asOutputStream](#asOutputStream(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration writeTimeout)` | Creates a Source which when materialized will return an `OutputStream` which it is possible  to write the ByteStrings to the stream this Source is attached to. |
	| `static scala.concurrent.duration.FiniteDuration` | `[asOutputStream$default$1](#asOutputStream$default$1())()` |  |
	| `static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromInputStream](#fromInputStream(scala.Function0,int))​(scala.Function0<java.io.InputStream> in,  int chunkSize)` | Creates a Source from an `InputStream` created by the given function. |
	| `static int` | `[fromInputStream$default$2](#fromInputStream$default$2())()` |  |
	| `static <T,​S extends java.util.stream.BaseStream<T,​S>>[Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")>` | `[fromJavaStream](#fromJavaStream(scala.Function0))​(scala.Function0<java.util.stream.BaseStream<T,​S>> stream)` | Creates a source that wraps a Java 8 Stream. |
	| `static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>>` | `[fromOutputStream](#fromOutputStream(scala.Function0,boolean))​(scala.Function0<java.io.OutputStream> out,  boolean autoFlush)` | Creates a Sink which writes incoming `ByteString`s to an `OutputStream` created by the given function. |
	| `static boolean` | `[fromOutputStream$default$2](#fromOutputStream$default$2())()` |  |
	| `static <T,​R>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<R>>` | `[javaCollector](#javaCollector(scala.Function0))​(scala.Function0<java.util.stream.Collector<T,​?,​R>> collectorFactory)` | Creates a sink which materializes into a Future which will be completed with result of the Java 8 Collector transformation  and reduction operations. |
	| `static <T,​R>[Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<R>>` | `[javaCollectorParallelUnordered](#javaCollectorParallelUnordered(int,scala.Function0))​(int parallelism,  scala.Function0<java.util.stream.Collector<T,​?,​R>> collectorFactory)` | Creates a sink which materializes into a Future which will be completed with result of the Java 8 Collector transformation  and reduction operations. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StreamConverters
		
		
		
		```
		public StreamConverters()
		```

	- ### Method Detail
	
	
	
		- #### fromInputStream
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> fromInputStream​(scala.Function0<java.io.InputStream> in,
		                                                                                         int chunkSize)
		```
		
		Creates a Source from an `InputStream` created by the given function.
		 Emitted elements are up to `chunkSize` sized [`ByteString`](../../util/ByteString.html "class in akka.util") elements.
		 The actual size of the emitted elements depends on how much data the underlying
		 `InputStream` returns on each read invocation. Such chunks will
		 never be larger than chunkSize though.
		 
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 It materializes a `Future` of `IOResult` containing the number of bytes read from the source file upon completion,
		 and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
		 not give any guarantee that the bytes were seen by downstream stages.
		 
		
		
		 The created `InputStream` will be closed when the [`Source`](Source.html "class in akka.stream.scaladsl") is cancelled.
		 
		
		
		
		Parameters:
		`in` \- a function which creates the InputStream to read from
		`chunkSize` \- the size of each read operation, defaults to 8192
		- #### fromInputStream$default$2
		
		
		
		```
		public static int fromInputStream$default$2()
		```
		- #### asOutputStream
		
		
		
		```
		public static [Source](Source.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.OutputStream> asOutputStream​(scala.concurrent.duration.FiniteDuration writeTimeout)
		```
		
		Creates a Source which when materialized will return an `OutputStream` which it is possible
		 to write the ByteStrings to the stream this Source is attached to.
		 
		 This Source is intended for inter\-operation with legacy APIs since it is inherently blocking.
		 
		
		
		 You can configure the internal buffer size by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The created `OutputStream` will be closed when the [`Source`](Source.html "class in akka.stream.scaladsl") is cancelled, and closing the `OutputStream`
		 will complete this [`Source`](Source.html "class in akka.stream.scaladsl").
		 
		
		
		
		Parameters:
		`writeTimeout` \- the max time the write operation on the materialized OutputStream should block, defaults to 5 seconds
		- #### asOutputStream$default$1
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration asOutputStream$default$1()
		```
		- #### fromOutputStream
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[IOResult](../IOResult.html "class in akka.stream")>> fromOutputStream​(scala.Function0<java.io.OutputStream> out,
		                                                                                        boolean autoFlush)
		```
		
		Creates a Sink which writes incoming `ByteString`s to an `OutputStream` created by the given function.
		 
		 Materializes a `Future` of `IOResult` that will be completed with the size of the file (in bytes) at the streams completion,
		 and a possible exception if IO operation was not completed successfully.
		 
		
		
		 You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
		 set it for a given Source by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 If `autoFlush` is true the OutputStream will be flushed whenever a byte array is written, defaults to false.
		 
		
		
		 The `OutputStream` will be closed when the stream flowing into this [`Sink`](Sink.html "class in akka.stream.scaladsl") is completed. The [`Sink`](Sink.html "class in akka.stream.scaladsl")
		 will cancel the stream when the `OutputStream` is no longer writable.
		- #### fromOutputStream$default$2
		
		
		
		```
		public static boolean fromOutputStream$default$2()
		```
		- #### asInputStream
		
		
		
		```
		public static [Sink](Sink.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​java.io.InputStream> asInputStream​(scala.concurrent.duration.FiniteDuration readTimeout)
		```
		
		Creates a Sink which when materialized will return an `InputStream` which it is possible
		 to read the values produced by the stream this Sink is attached to.
		 
		 This Sink is intended for inter\-operation with legacy APIs since it is inherently blocking.
		 
		
		
		 You can configure the internal buffer size by using [`ActorAttributes`](../ActorAttributes.html "class in akka.stream").
		 
		
		
		 The `InputStream` will be closed when the stream flowing into this [`Sink`](Sink.html "class in akka.stream.scaladsl") completes, and
		 closing the `InputStream` will cancel this [`Sink`](Sink.html "class in akka.stream.scaladsl").
		 
		
		
		
		Parameters:
		`readTimeout` \- the max time the read operation on the materialized InputStream should block
		- #### asInputStream$default$1
		
		
		
		```
		public static scala.concurrent.duration.FiniteDuration asInputStream$default$1()
		```
		- #### javaCollector
		
		
		
		```
		public static <T,​R> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<R>> javaCollector​(scala.Function0<java.util.stream.Collector<T,​?,​R>> collectorFactory)
		```
		
		Creates a sink which materializes into a Future which will be completed with result of the Java 8 Collector transformation
		 and reduction operations. This allows usage of Java 8 streams transformations for reactive streams. The Collector will trigger
		 demand downstream. Elements emitted through the stream will be accumulated into a mutable result container, optionally transformed
		 into a final representation after all input elements have been processed. The Collector can also do reduction
		 at the end. Reduction processing is performed sequentially
		 
		 Note that a flow can be materialized multiple times, so the function producing the Collector must be able
		 to handle multiple invocations.
		- #### javaCollectorParallelUnordered
		
		
		
		```
		public static <T,​R> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​scala.concurrent.Future<R>> javaCollectorParallelUnordered​(int parallelism,
		                                                                                                  scala.Function0<java.util.stream.Collector<T,​?,​R>> collectorFactory)
		```
		
		Creates a sink which materializes into a Future which will be completed with result of the Java 8 Collector transformation
		 and reduction operations. This allows usage of Java 8 streams transformations for reactive streams. The Collector will trigger demand
		 downstream. Elements emitted through the stream will be accumulated into a mutable result container, optionally transformed
		 into a final representation after all input elements have been processed. The Collector can also do reduction
		 at the end. Reduction processing is performed in parallel based on graph Balance.
		 
		 Note that a flow can be materialized multiple times, so the function producing the Collector must be able
		 to handle multiple invocations.
		- #### asJavaStream
		
		
		
		```
		public static <T> [Sink](Sink.html "class in akka.stream.scaladsl")<T,​java.util.stream.Stream<T>> asJavaStream()
		```
		
		Creates a sink which materializes into Java 8 Stream that can be run to trigger demand through the sink.
		 Elements emitted through the stream will be available for reading through the Java 8 Stream.
		 
		 The Java 8 Stream will be ended when the stream flowing into this Sink completes, and closing the Java
		 Stream will cancel the inflow of this Sink.
		 
		
		
		 If the Java 8 Stream throws exception the Akka stream is cancelled.
		 
		
		
		 Be aware that Java Stream blocks current thread while waiting on next element from downstream.
		 As it is interacting wit blocking API the implementation runs on a separate dispatcher
		 configured through the akka.stream.blocking\-io\-dispatcher.
		- #### fromJavaStream
		
		
		
		```
		public static <T,​S extends java.util.stream.BaseStream<T,​S>> [Source](Source.html "class in akka.stream.scaladsl")<T,​[NotUsed](../../NotUsed.html "class in akka")> fromJavaStream​(scala.Function0<java.util.stream.BaseStream<T,​S>> stream)
		```
		
		Creates a source that wraps a Java 8 Stream. Source uses a stream iterator to get all its
		 elements and send them downstream on demand.
		 
		 Example usage: `StreamConverters.fromJavaStream(() => IntStream.rangeClosed(1, 10))`
		
		
		
		 You can use `Source.async` to create asynchronous boundaries between synchronous Java Stream
		 and the rest of flow.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/stream/ActorAttributes.html
- https://doc.akka.io/japi/akka/current/akka/stream/IOResult.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Sink.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamConverters.html](https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/StreamConverters.html)*