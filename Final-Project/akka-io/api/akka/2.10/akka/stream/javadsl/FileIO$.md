---
description: Akka 2.10.17 - akka.stream.javadsl.FileIO
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:58:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/FileIO$.html
title: Akka 2.10.17 - akka.stream.javadsl.FileIO
---

# Akka 2.10.17 - akka.stream.javadsl.FileIO

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.FileIO

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
- FileIO
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
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
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

# FileIO[**](../../../akka/stream/javadsl/FileIO$.html "Permalink")

### 

#### object FileIO

Java API: Factories to create sinks and sources from files

Source[FileIO.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/FileIO.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FileIO
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/FileIO$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/FileIO$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/FileIO$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/FileIO$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/javadsl/FileIO$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/javadsl/FileIO$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/javadsl/FileIO$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/javadsl/FileIO$.html#fromPath(f:java.nio.file.Path,chunkSize:Int,startPosition:Long):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromPath(f: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), startPosition: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a synchronous Source from a files contents.

Creates a synchronous Source from a files contents.
Emitted elements are `chunkSize` sized ByteString elements,
except the last element, which will be up to `chunkSize` in size.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
not give any guarantee that the bytes were seen by downstream stages.

fthe file path to read from

chunkSizethe size of each read operation

startPositionstartPosition the start position to read from, defaults to 0
9. [**](../../../akka/stream/javadsl/FileIO$.html#fromPath(f:java.nio.file.Path,chunkSize:Int):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromPath(f: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a synchronous Source from a files contents.

Creates a synchronous Source from a files contents.
Emitted elements are `chunkSize` sized ByteString elements,
except the last element, which will be up to `chunkSize` in size.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
not give any guarantee that the bytes were seen by downstream stages.

It is not possible to read FIFOs, also known as named pipes, with `fromPath`, trying to do so will potentially first block
and then fail the stream.

fthe file path to read from

chunkSizethe size of each read operation
10. [**](../../../akka/stream/javadsl/FileIO$.html#fromPath(f:java.nio.file.Path):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromPath(f: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Source from a files contents.

Creates a Source from a files contents.
Emitted elements are ByteString elements, chunked by default by 8192 bytes,
except the last element, which will be up to 8192 in size.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
not give any guarantee that the bytes were seen by downstream stages.

It is not possible to read FIFOs, also known as named pipes, with `fromPath`, trying to do so will potentially first block
and then fail the stream.

fthe file path to read from
11. [**](../../../akka/stream/javadsl/FileIO$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/javadsl/FileIO$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/javadsl/FileIO$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/stream/javadsl/FileIO$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/stream/javadsl/FileIO$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/stream/javadsl/FileIO$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/stream/javadsl/FileIO$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../../akka/stream/javadsl/FileIO$.html#toPath[Opt<:java.nio.file.OpenOption](f:java.nio.file.Path,options:java.util.Set[Opt],startPosition:Long):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def toPath\[Opt \<: [OpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/OpenOption.html#java.nio.file.OpenOption)](f: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), options: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[Opt], startPosition: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Sink that writes incoming ByteString elements to the given file path.

Creates a Sink that writes incoming ByteString elements to the given file path.

Materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

Accepts as arguments a set of [java.nio.file.StandardOpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html), which will determine
the underlying behavior when writing the file. If [java.nio.file.StandardOpenOption.SYNC](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption$.html#SYNC:java.nio.file.StandardOpenOption(SYNC)) is
provided, every update to the file's content be written synchronously to the underlying storage
device. Otherwise (the default), the write will be written to the storage device asynchronously.
by the OS, and may not be stored durably on the storage device at the time the stream completes.

fThe file path to write to

optionsFile open options, see [java.nio.file.StandardOpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html)

startPositionstartPosition the start position to read from, defaults to 0
19. [**](../../../akka/stream/javadsl/FileIO$.html#toPath[Opt<:java.nio.file.OpenOption](f:java.nio.file.Path,options:java.util.Set[Opt]):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def toPath\[Opt \<: [OpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/OpenOption.html#java.nio.file.OpenOption)](f: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path), options: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[Opt]): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Sink that writes incoming ByteString elements to the given file path.

Creates a Sink that writes incoming ByteString elements to the given file path.

Materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

Accepts as arguments a set of [java.nio.file.StandardOpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html), which will determine
the underlying behavior when writing the file. If [java.nio.file.StandardOpenOption.SYNC](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption$.html#SYNC:java.nio.file.StandardOpenOption(SYNC)) is
provided, every update to the file's content be written synchronously to the underlying storage
device. Otherwise (the default), the write will be written to the storage device asynchronously
by the OS, and may not be stored durably on the storage device at the time the stream completes.

fThe file path to write to

optionsFile open options, see [java.nio.file.StandardOpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html)
20. [**](../../../akka/stream/javadsl/FileIO$.html#toPath(f:java.nio.file.Path):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def toPath(f: [Path](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/Path.html#java.nio.file.Path)): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Sink that writes incoming ByteString elements to the given file path.

Creates a Sink that writes incoming ByteString elements to the given file path.
Overwrites existing files by truncating their contents, if you want to append to an existing file
util.Set\[OpenOption]) with [java.nio.file.StandardOpenOption.APPEND](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption$.html#APPEND:java.nio.file.StandardOpenOption(APPEND)).

Materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

Accepts as arguments a set of [java.nio.file.StandardOpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html), which will determine
the underlying behavior when writing the file. If [java.nio.file.StandardOpenOption.SYNC](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption$.html#SYNC:java.nio.file.StandardOpenOption(SYNC)) is
provided, every update to the file's content be written synchronously to the underlying storage
device. Otherwise (the default), the write will be written to the storage device asynchronously
by the OS, and may not be stored durably on the storage device at the time the stream completes.

fThe file path to write to
21. [**](../../../akka/stream/javadsl/FileIO$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/stream/javadsl/FileIO$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/stream/javadsl/FileIO$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/stream/javadsl/FileIO$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/FileIO$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/FileIO$.html#fromFile(f:java.io.File,chunkSize:Int):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromFile(f: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), chunkSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a synchronous Source from a files contents.

Creates a synchronous Source from a files contents.
Emitted elements are `chunkSize` sized ByteString elements,
except the last element, which will be up to `chunkSize` in size.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
 not give any guarantee that the bytes were seen by downstream stages.

fthe file to read from

chunkSizethe size of each read operation

Annotations@deprecated Deprecated*(Since version 2\.4\.5\)* Use `fromPath` instead.
3. [**](../../../akka/stream/javadsl/FileIO$.html#fromFile(f:java.io.File):akka.stream.javadsl.Source[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def fromFile(f: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Source](Source.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Source from a files contents.

Creates a Source from a files contents.
Emitted elements are ByteString elements, chunked by default by 8192 bytes,
except the last element, which will be up to 8192 in size.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

It materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) containing the number of bytes read from the source file upon completion,
and a possible exception if IO operation was not completed successfully. Note that bytes having been read by the source does
not give any guarantee that the bytes were seen by downstream stages.

fthe file to read from

Annotations@deprecated Deprecated*(Since version 2\.4\.5\)* Use `fromPath` instead.
4. [**](../../../akka/stream/javadsl/FileIO$.html#toFile[Opt<:java.nio.file.OpenOption](f:java.io.File,options:java.util.Set[Opt]):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def toFile\[Opt \<: [OpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/OpenOption.html#java.nio.file.OpenOption)](f: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File), options: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[Opt]): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Sink that writes incoming ByteString elements to the given file.

Creates a Sink that writes incoming ByteString elements to the given file.

Materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

fThe file to write to

optionsFile open options, see [java.nio.file.StandardOpenOption](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption.html)

Annotations@deprecated Deprecated*(Since version 2\.4\.5\)* Use `toPath` instead.
5. [**](../../../akka/stream/javadsl/FileIO$.html#toFile(f:java.io.File):akka.stream.javadsl.Sink[akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.IOResult]] "Permalink")  def toFile(f: [File](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html#java.io.File)): [Sink](Sink.html)\[[ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[IOResult](../IOResult.html)]]Creates a Sink that writes incoming ByteString elements to the given file.

Creates a Sink that writes incoming ByteString elements to the given file.
Overwrites existing files by truncating their contents, if you want to append to an existing file use
util.Set\[OpenOption]) with [java.nio.file.StandardOpenOption.APPEND](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/nio/file/StandardOpenOption$.html#APPEND:java.nio.file.StandardOpenOption(APPEND)).

Materializes a [java.util.concurrent.CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html) of [IOResult](../IOResult.html) that will be completed with the size of the file (in bytes) at the streams completion,
and a possible exception if IO operation was not completed successfully.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [akka.stream.ActorAttributes](../ActorAttributes$.html).

fThe file to write to

Annotations@deprecated Deprecated*(Since version 2\.4\.5\)* Use `toPath` instead.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/IOResult.html
- https://doc.akka.io/api/akka/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartFlow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartSink$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartSource$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RestartSourceWithContext$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RetryFlow$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RunnableGraph$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SinkQueueWithCancel$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SinkQueueWithCancel.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Source$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SourceQueue.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SourceQueueWithComplete$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/SourceQueueWithComplete.html

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FileIO$.html](https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/FileIO$.html)*