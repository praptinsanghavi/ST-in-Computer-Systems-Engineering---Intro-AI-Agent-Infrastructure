---
description: Akka 2.10.17 - akka.stream.javadsl.SubFlow
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:56:17Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/SubFlow$.html
title: Akka 2.10.17 - akka.stream.javadsl.SubFlow
---

# Akka 2.10.17 - akka.stream.javadsl.SubFlow

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.SubFlow

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
[o](SubFlow.html "See companion class")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [SubFlow](SubFlow.html "See companion class")[**](../../../akka/stream/javadsl/SubFlow$.html "Permalink")

### Companion [class SubFlow](SubFlow.html "See companion class")

#### object SubFlow

Source[SubFlow.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/SubFlow.scala#L27)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SubFlow
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/SubFlow$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/SubFlow$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/SubFlow$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/SubFlow$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/javadsl/SubFlow$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/javadsl/SubFlow$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/stream/javadsl/SubFlow$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/stream/javadsl/SubFlow$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/stream/javadsl/SubFlow$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/stream/javadsl/SubFlow$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/stream/javadsl/SubFlow$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/stream/javadsl/SubFlow$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/javadsl/SubFlow$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/javadsl/SubFlow$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/stream/javadsl/SubFlow$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/stream/javadsl/SubFlow$.html#upcast[In,SuperOut,Out<:SuperOut,M](flow:akka.stream.javadsl.SubFlow[In,Out,M]):akka.stream.javadsl.SubFlow[In,SuperOut,M] "Permalink")  def upcast\[In, SuperOut, Out \<: SuperOut, M](flow: [SubFlow](SubFlow.html)\[In, Out, M]): [SubFlow](SubFlow.html)\[In, SuperOut, M]Upcast a stream of elements to a stream of supertypes of that element.

Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
fan\-in operators where you do not want to pay the cost of casting each element in a `map`.

SuperOuta supertype to the type of element flowing out of the flow

returnsA flow that accepts `In` and outputs elements of the super type
17. [**](../../../akka/stream/javadsl/SubFlow$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/stream/javadsl/SubFlow$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../../akka/stream/javadsl/SubFlow$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/SubFlow$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/AsPublisher.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Balance$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/BidiFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Broadcast$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/BroadcastHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Concat$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/DelayStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/DelayStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FileIO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FlowWithContext$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Framing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/FramingTruncation.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/GraphDSL$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/JavaFlowSupport.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/JsonFraming$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Keep$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Merge$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/MergeHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/MergeLatest$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/MergePreferred$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/MergePrioritized$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/MergeSequence$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Partition$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/PartitionHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RestartFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RestartSink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RestartSource$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RestartSourceWithContext$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RetryFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RunnableGraph$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/RunnableGraph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Sink$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SinkQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SinkQueueWithCancel$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SinkQueueWithCancel.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Source$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SourceQueue.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SourceQueueWithComplete$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SourceQueueWithComplete.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SourceWithContext$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SubFlow$.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SubFlow$.html)*