---
description: Akka 2.10.17 - akka.stream.javadsl.StreamConverters
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:32:03Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/StreamConverters$.html
title: Akka 2.10.17 - akka.stream.javadsl.StreamConverters
---

# Akka 2.10.17 - akka.stream.javadsl.StreamConverters

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.StreamConverters

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[stream](../index.html)
- [AsPublisher](AsPublisher.html)
- [Balance](Balance$.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast$.html "Fan-out the stream to several streams.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat$.html "Takes two streams and outputs an output stream formed from the two input streams by consuming one stream first emitting all of its elements, then consuming the second stream emitting all of its elements.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay and can be stateful to compute delay for any sequence of elements, all elements go through nextDelay() updating state and returning delay for each element")
- [FileIO](FileIO$.html "Java API: Factories to create sinks and sources from files")
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [Framing](Framing$.html)
- [FramingTruncation](FramingTruncation.html "Determines mode in which Framing operates.")
- [GraphDSL](GraphDSL$.html)
- [JavaFlowSupport](JavaFlowSupport.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming akka.util.ByteString objects.")
- [Keep](Keep$.html)
- [Merge](Merge$.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest$.html "MergeLatest joins elements from N input streams into stream of lists of size N.")
- [MergePreferred](MergePreferred$.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized$.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence$.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [Partition](Partition$.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Java API")
- [Sink](Sink.html "Java API")
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [Source](Source.html "Java API")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- StreamConverters
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [SubSource](SubSource.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip$.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Split one stream into several streams using a splitting function.")
- [Zip](Zip$.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest$.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipN](ZipN$.html "Combine the elements of multiple streams into a stream of lists.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
o[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# StreamConverters[**](../../../akka/stream/javadsl/StreamConverters$.html "Permalink")

### 

#### object StreamConverters

Converters for interacting with the blocking `java.io` streams APIs and Java 8 Streams

Source[StreamConverters.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/StreamConverters.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. StreamConverters
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/StreamConverters$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/StreamConverters$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/StreamConverters$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/StreamConverters$.html#asInputStream(readTimeout:java.time.Duration):akka.stream.javadsl.Sink[akka.util.ByteString,java.io.InputStream] "Permalink")  def asInputStream(readTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)]Creates a Sink which when materialized will return an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) which it is possible
to read the values produced by the stream this Sink is attached to.

Creates a Sink which when materialized will return an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) which it is possible
to read the values produced by the stream this Sink is attached to.

This Sink is intended for inter\-operation with legacy APIs since it is inherently blocking.

You can configure the internal buffer size by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

The InputStream will be closed when the stream flowing into this [Sink](Sink.html) completes, and
closing the InputStream will cancel this [Sink](Sink.html).

readTimeoutthe max time the read operation on the materialized InputStream should block
5. [**](../../../akka/stream/javadsl/StreamConverters$.html#asInputStream():akka.stream.javadsl.Sink[akka.util.ByteString,java.io.InputStream] "Permalink")  def asInputStream(): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)]Creates a Sink which when materialized will return an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) which it is possible
to read the values produced by the stream this Sink is attached to.

Creates a Sink which when materialized will return an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) which it is possible
to read the values produced by the stream this Sink is attached to.

This method uses a default read timeout, use \#inputStream(FiniteDuration) or \#inputStream(java.time.Duration) to explicitly
configure the timeout.

This Sink is intended for inter\-operation with legacy APIs since it is inherently blocking.

You can configure the internal buffer size by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

The InputStream will be closed when the stream flowing into this [Sink](Sink.html) completes, and
closing the InputStream will cancel this [Sink](Sink.html).
6. [**](../../../akka/stream/javadsl/StreamConverters$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/StreamConverters$.html#asJavaStream[T]():akka.stream.javadsl.Sink[T,java.util.stream.Stream[T]] "Permalink")  def asJavaStream\[T](): [Sink](Sink.html)\[T, [Stream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Stream.html#java.util.stream.Stream)\[T]]Creates a sink which materializes into Java 8 `Stream` that can be run to trigger demand through the sink.

Creates a sink which materializes into Java 8 `Stream` that can be run to trigger demand through the sink.
Elements emitted through the stream will be available for reading through the Java 8 `Stream`.

The Java 8 `Stream` will be ended when the stream flowing into this `Sink` completes, and closing the Java
`Stream` will cancel the inflow of this `Sink`.

Java 8 `Stream` throws exception in case reactive stream failed.

Be aware that Java `Stream` blocks current thread while waiting on next element from downstream.
As it is interacting wit blocking API the implementation runs on a separate dispatcher
configured through the `akka.stream.blocking-io-dispatcher`.
8. [**](../../../akka/stream/javadsl/StreamConverters$.html#asOutputStream():akka.stream.javadsl.Source[akka.util.ByteString,java.io.OutputStream] "Permalink")  def asOutputStream(): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)]Creates a Source which when materialized will return an [java.io.OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html) which it is possible
to write the ByteStrings to the stream this Source is attached to.

Creates a Source which when materialized will return an [java.io.OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html) which it is possible
to write the ByteStrings to the stream this Source is attached to. The write timeout for OutputStreams
materialized will default to 5 seconds, @see \#outputStream(FiniteDuration) or \#outputStream(java.time.Duration) if you want to override it.

This Source is intended for inter\-operation with legacy APIs since it is inherently blocking.

You can configure the internal buffer size by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

The created OutputStream will be closed when the [Source](Source.html) is cancelled, and closing the OutputStream
will complete this [Source](Source.html).
9. [**](../../../akka/stream/javadsl/StreamConverters$.html#asOutputStream(writeTimeout:java.time.Duration):akka.stream.javadsl.Source[akka.util.ByteString,java.io.OutputStream] "Permalink")  def asOutputStream(writeTimeout: [Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)]Creates a Source which when materialized will return an [java.io.OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html) which it is possible
to write the ByteStrings to the stream this Source is attached to.

Creates a Source which when materialized will return an [java.io.OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html) which it is possible
to write the ByteStrings to the stream this Source is attached to.

This Source is intended for inter\-operation with legacy APIs since it is inherently blocking.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

The created OutputStream will be closed when the [Source](Source.html) is cancelled, and closing the OutputStream
will complete this [Source](Source.html).

writeTimeoutthe max time the write operation on the materialized OutputStream should block
10. [**](../../../akka/stream/javadsl/StreamConverters$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/stream/javadsl/StreamConverters$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/stream/javadsl/StreamConverters$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../../akka/stream/javadsl/StreamConverters$.html#fromInputStream(in:akka.japi.function.Creator[java.io.InputStream]):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromInputStream(in: [Creator](../../japi/function/Creator.html)\[[InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)]): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Source from an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) created by the given function.

Creates a Source from an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) created by the given function.
Emitted elements are up to 8192 bytes sized [akka.util.ByteString](../../util/ByteString.html) elements.
The actual size of the emitted elements depends on how much data the underlying
[java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) returns on each read invocation. Such chunks will
never be larger than chunkSize though.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a CompletionStage of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully.

The created InputStream will be closed when the [Source](Source.html) is cancelled.
14. [**](../../../akka/stream/javadsl/StreamConverters$.html#fromInputStream(in:akka.japi.function.Creator[java.io.InputStream],chunkSize:Int):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromInputStream(in: [Creator](../../japi/function/Creator.html)\[[InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html#java.io.InputStream)], chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Source from an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) created by the given function.

Creates a Source from an [java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) created by the given function.
Emitted elements are up to `chunkSize` sized [akka.util.ByteString](../../util/ByteString.html) elements.
The actual size of the emitted elements depends on how much data the underlying
[java.io.InputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/InputStream.html) returns on each read invocation. Such chunks will
never be larger than chunkSize though.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a CompletionStage of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
not give any guarantee that the bytes were seen by downstream stages.

The created InputStream will be closed when the [Source](Source.html) is cancelled.
15. [**](../../../akka/stream/javadsl/StreamConverters$.html#fromJavaStream[O,S<:java.util.stream.BaseStream[O,S]](stream:akka.japi.function.Creator[java.util.stream.BaseStream[O,S]]):akka.stream.javadsl.Source[O,akka.NotUsed] "Permalink")  def fromJavaStream\[O, S \<: [BaseStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/BaseStream.html#java.util.stream.BaseStream)\[O, S]](stream: [Creator](../../japi/function/Creator.html)\[[BaseStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/BaseStream.html#java.util.stream.BaseStream)\[O, S]]): [Source](Source.html)\[O, [NotUsed](../../NotUsed.html)]Creates a source that wraps a Java 8 `Stream`.

Creates a source that wraps a Java 8 `Stream`. `Source` uses a stream iterator to get all its
elements and send them downstream on demand.

Example usage: `Source.fromJavaStream(() -> IntStream.rangeClosed(1, 10))`

You can use [Source.async](Source.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.javadsl.Source[Out,Mat]) to create asynchronous boundaries between synchronous java stream
and the rest of flow.
16. [**](../../../akka/stream/javadsl/StreamConverters$.html#fromOutputStream(f:akka.japi.function.Creator[java.io.OutputStream],autoFlush:Boolean):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromOutputStream(f: [Creator](../../japi/function/Creator.html)\[[OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)], autoFlush: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Sink which writes incoming ByteStrings to an OutputStream created by the given function.

Sink which writes incoming ByteStrings to an OutputStream created by the given function.

Materializes a CompletionStage of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

The OutputStream will be closed when the stream flowing into this [Sink](Sink.html) is completed. The [Sink](Sink.html)
will cancel the stream when the OutputStream is no longer writable.

fA Creator which creates an OutputStream to write to

autoFlushIf true the OutputStream will be flushed whenever a byte array is written
17. [**](../../../akka/stream/javadsl/StreamConverters$.html#fromOutputStream(f:akka.japi.function.Creator[java.io.OutputStream]):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromOutputStream(f: [Creator](../../japi/function/Creator.html)\[[OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html#java.io.OutputStream)]): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Sink which writes incoming ByteStrings to an OutputStream created by the given function.

Sink which writes incoming ByteStrings to an OutputStream created by the given function.

Materializes a CompletionStage of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

This method uses no auto flush for the [java.io.OutputStream](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/OutputStream.html) @see Boolean) if you want to override it.

The OutputStream will be closed when the stream flowing into this [Sink](Sink.html) is completed. The [Sink](Sink.html)
will cancel the stream when the OutputStream is no longer writable.

fA Creator which creates an OutputStream to write to
18. [**](../../../akka/stream/javadsl/StreamConverters$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/javadsl/StreamConverters$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/javadsl/StreamConverters$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/stream/javadsl/StreamConverters$.html#javaCollector[T,R](collector:akka.japi.function.Creator[java.util.stream.Collector[T,_,R]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[R]] "Permalink")  def javaCollector\[T, R](collector: [Creator](../../japi/function/Creator.html)\[[Collector](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html#java.util.stream.Collector)\[T, \_, R]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[R]]Creates a sink which materializes into a `CompletionStage` which will be completed with a result of the Java 8 `Collector`
transformation and reduction operations.

Creates a sink which materializes into a `CompletionStage` which will be completed with a result of the Java 8 `Collector`
transformation and reduction operations. This allows usage of Java 8 streams transformations for reactive streams.
The Collector `will trigger demand downstream. Elements emitted through the stream will be accumulated into a mutable
result container, optionally transformed into a final representation after all input elements have been processed.
The` Collector `can also do reduction at the end. Reduction processing is performed sequentially`

Note that a flow can be materialized multiple times, so the function producing the `Collector` must be able
to handle multiple invocations.
22. [**](../../../akka/stream/javadsl/StreamConverters$.html#javaCollectorParallelUnordered[T,R](parallelism:Int)(collector:akka.japi.function.Creator[java.util.stream.Collector[T,_,R]]):akka.stream.javadsl.Sink[T,java.util.concurrent.CompletionStage[R]] "Permalink")  def javaCollectorParallelUnordered\[T, R](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(collector: [Creator](../../japi/function/Creator.html)\[[Collector](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/stream/Collector.html#java.util.stream.Collector)\[T, \_, R]]): [Sink](Sink.html)\[T, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[R]]Creates a sink which materializes into a `CompletionStage` which will be completed with a result of the Java 8 `Collector`
transformation and reduction operations.

Creates a sink which materializes into a `CompletionStage` which will be completed with a result of the Java 8 `Collector`
transformation and reduction operations. This allows usage of Java 8 streams transformations for reactive streams.
The `Collector` will trigger demand downstream. Elements emitted through the stream will be accumulated into a mutable
result container, optionally transformed into a final representation after all input elements have been processed.
`Collector` can also do reduction at the end. Reduction processing is performed in parallel based on graph `Balance`.

Note that a flow can be materialized multiple times, so the function producing the `Collector` must be able
to handle multiple invocations.
23. [**](../../../akka/stream/javadsl/StreamConverters$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/stream/javadsl/StreamConverters$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/stream/javadsl/StreamConverters$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/javadsl/StreamConverters$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
27. [**](../../../akka/stream/javadsl/StreamConverters$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
28. [**](../../../akka/stream/javadsl/StreamConverters$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
29. [**](../../../akka/stream/javadsl/StreamConverters$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
30. [**](../../../akka/stream/javadsl/StreamConverters$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/StreamConverters$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/current/akka/stream/IOResult.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSink$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSource$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RestartSourceWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RetryFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RunnableGraph$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SinkQueueWithCancel$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SinkQueueWithCancel.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source$.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/SourceQueue.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/StreamConverters$.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/StreamConverters$.html)*