---
description: Akka 2.10.17 - akka.stream.javadsl.Flow
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:31:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Flow$.html
title: Akka 2.10.17 - akka.stream.javadsl.Flow
---

# Akka 2.10.17 - akka.stream.javadsl.Flow

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.Flow

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
[o](Flow.html "See companion class")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [Flow](Flow.html "See companion class")[**](../../../akka/stream/javadsl/Flow$.html "Permalink")

### Companion [class Flow](Flow.html "See companion class")

#### object Flow

Source[Flow.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Flow.scala#L39)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Flow
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/stream/javadsl/Flow$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Flow$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Flow$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/stream/javadsl/Flow$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/stream/javadsl/Flow$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/stream/javadsl/Flow$.html#completionStageFlow[I,O,M](flow:java.util.concurrent.CompletionStage[akka.stream.javadsl.Flow[I,O,M]]):akka.stream.javadsl.Flow[I,O,java.util.concurrent.CompletionStage[M]] "Permalink")  def completionStageFlow\[I, O, M](flow: [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Flow](Flow.html)\[I, O, M]]): [Flow](Flow.html)\[I, O, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Turn a `CompletionStage<Flow>` into a flow that will consume the values of the source when the future completes successfully.

Turn a `CompletionStage<Flow>` into a flow that will consume the values of the source when the future completes successfully.
If the `Future` is completed with a failure the stream is failed.

The materialized completion stage value is completed with the materialized value of the future flow or failed with a
[NeverMaterializedException](../NeverMaterializedException.html) if upstream fails or downstream cancels before the completion stage has completed.
7. [**](../../../akka/stream/javadsl/Flow$.html#create[T]():akka.stream.javadsl.Flow[T,T,akka.NotUsed] "Permalink")  def create\[T](): [Flow](Flow.html)\[T, T, [NotUsed](../../NotUsed.html)]Create a `Flow` which can process elements of type `T`.
8. [**](../../../akka/stream/javadsl/Flow$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../../akka/stream/javadsl/Flow$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../../akka/stream/javadsl/Flow$.html#flattenOptional[Out,In<:java.util.Optional[Out]]():akka.stream.javadsl.Flow[In,Out,akka.NotUsed] "Permalink")  def flattenOptional\[Out, In \<: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Out]](): [Flow](Flow.html)\[In, Out, [NotUsed](../../NotUsed.html)]Collect the value of Optional from the elements passing through this flow, empty Optional is filtered out.

Collect the value of Optional from the elements passing through this flow, empty Optional is filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the current Optional's value is present.

**Backpressures when** the value of the current Optional is present and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
\*
11. [**](../../../akka/stream/javadsl/Flow$.html#fromFunction[I,O](f:akka.japi.function.Function[I,O]):akka.stream.javadsl.Flow[I,O,akka.NotUsed] "Permalink")  def fromFunction\[I, O](f: [Function](../../japi/function/Function.html)\[I, O]): [Flow](Flow.html)\[I, O, [NotUsed](../../NotUsed.html)]Creates a \[Flow] which will use the given function to transform its inputs to outputs.

Creates a \[Flow] which will use the given function to transform its inputs to outputs. It is equivalent
to `Flow.create[T].map(f)`
12. [**](../../../akka/stream/javadsl/Flow$.html#fromGraph[I,O,M](g:akka.stream.Graph[akka.stream.FlowShape[I,O],M]):akka.stream.javadsl.Flow[I,O,M] "Permalink")  def fromGraph\[I, O, M](g: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[I, O], M]): [Flow](Flow.html)\[I, O, M]A graph with the shape of a flow logically is a flow, this method makes it so also in type.
13. [**](../../../akka/stream/javadsl/Flow$.html#fromMaterializer[I,O,M](factory:java.util.function.BiFunction[akka.stream.Materializer,akka.stream.Attributes,akka.stream.javadsl.Flow[I,O,M]]):akka.stream.javadsl.Flow[I,O,java.util.concurrent.CompletionStage[M]] "Permalink")  def fromMaterializer\[I, O, M](factory: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[Materializer](../Materializer.html), [Attributes](../Attributes.html), [Flow](Flow.html)\[I, O, M]]): [Flow](Flow.html)\[I, O, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers the creation of a [Flow](Flow.html) until materialization.

Defers the creation of a [Flow](Flow.html) until materialization. The `factory` function
exposes [Materializer](../Materializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Flow](Flow.html) returned by this method.
14. [**](../../../akka/stream/javadsl/Flow$.html#fromProcessor[I,O](processorFactory:akka.japi.function.Creator[org.reactivestreams.Processor[I,O]]):akka.stream.javadsl.Flow[I,O,akka.NotUsed] "Permalink")  def fromProcessor\[I, O](processorFactory: [Creator](../../japi/function/Creator.html)\[Processor\[I, O]]): [Flow](Flow.html)\[I, O, [NotUsed](../../NotUsed.html)]
15. [**](../../../akka/stream/javadsl/Flow$.html#fromProcessorMat[I,O,Mat](processorFactory:akka.japi.function.Creator[akka.japi.Pair[org.reactivestreams.Processor[I,O],Mat]]):akka.stream.javadsl.Flow[I,O,Mat] "Permalink")  def fromProcessorMat\[I, O, Mat](processorFactory: [Creator](../../japi/function/Creator.html)\[[Pair](../../japi/Pair.html)\[Processor\[I, O], Mat]]): [Flow](Flow.html)\[I, O, Mat]
16. [**](../../../akka/stream/javadsl/Flow$.html#fromSinkAndSource[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.javadsl.Flow[I,O,akka.NotUsed] "Permalink")  def fromSinkAndSource\[I, O](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[I], \_], source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[O], \_]): [Flow](Flow.html)\[I, O, [NotUsed](../../NotUsed.html)]Creates a `Flow` from a `Sink` and a `Source` where the Flow's input
will be sent to the Sink and the Flow's output will come from the Source.

Creates a `Flow` from a `Sink` and a `Source` where the Flow's input
will be sent to the Sink and the Flow's output will come from the Source.

The resulting flow can be visualized as:

```
    +----------------------------------------------+
    | Resulting Flow[I, O, NotUsed]                |
    |                                              |
    |  +---------+                  +-----------+  |
    |  |         |                  |           |  |
I  ~~> | Sink[I] | [no-connection!] | Source[O] | ~~> O
    |  |         |                  |           |  |
    |  +---------+                  +-----------+  |
    +----------------------------------------------+
```
The completion of the Sink and Source sides of a Flow constructed using
this method are independent. So if the Sink receives a completion signal,
the Source side will remain unaware of that. If you are looking to couple
the termination signals of the two sides use `Flow.fromSinkAndSourceCoupled` instead.

See also [fromSinkAndSourceMat](#fromSinkAndSourceMat[I,O,M1,M2,M](sink:akka.stream.Graph[akka.stream.SinkShape[I],M1],source:akka.stream.Graph[akka.stream.SourceShape[O],M2],combine:akka.japi.function.Function2[M1,M2,M]):akka.stream.javadsl.Flow[I,O,M]) when access to materialized values of the parameters is needed.
17. [**](../../../akka/stream/javadsl/Flow$.html#fromSinkAndSourceCoupled[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.javadsl.Flow[I,O,akka.NotUsed] "Permalink")  def fromSinkAndSourceCoupled\[I, O](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[I], \_], source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[O], \_]): [Flow](Flow.html)\[I, O, [NotUsed](../../NotUsed.html)]Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them.

Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them.
Similar to [Flow.fromSinkAndSource](#fromSinkAndSource[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.javadsl.Flow[I,O,akka.NotUsed]) however couples the termination of these two operators.

The resulting flow can be visualized as:

```
    +---------------------------------------------+
    | Resulting Flow[I, O, NotUsed]               |
    |                                             |
    |  +---------+                 +-----------+  |
    |  |         |                 |           |  |
I  ~~> | Sink[I] | ~~~(coupled)~~~ | Source[O] | ~~> O
    |  |         |                 |           |  |
    |  +---------+                 +-----------+  |
    +---------------------------------------------+
```
E.g. if the emitted [Flow](Flow.html) gets a cancellation, the [Source](Source.html) of course is cancelled,
however the Sink will also be completed. The table below illustrates the effects in detail:

| Returned Flow | Sink (`in`) | Source (`out`) |
| --- | --- | --- |
| *cause:* upstream (sink\-side) receives completion | *effect:* receives completion | *effect:* receives cancel |
| *cause:* upstream (sink\-side) receives error | *effect:* receives error | *effect:* receives cancel |
| *cause:* downstream (source\-side) receives cancel | *effect:* completes | *effect:* receives cancel |
| *effect:* cancels upstream, completes downstream | *effect:* completes | *cause:* signals complete |
| *effect:* cancels upstream, errors downstream | *effect:* receives error | *cause:* signals error or throws |
| *effect:* cancels upstream, completes downstream | *cause:* cancels | *effect:* receives cancel |

See also [fromSinkAndSourceCoupledMat](#fromSinkAndSourceCoupledMat[I,O,M1,M2,M](sink:akka.stream.Graph[akka.stream.SinkShape[I],M1],source:akka.stream.Graph[akka.stream.SourceShape[O],M2],combine:akka.japi.function.Function2[M1,M2,M]):akka.stream.javadsl.Flow[I,O,M]) when access to materialized values of the parameters is needed.
18. [**](../../../akka/stream/javadsl/Flow$.html#fromSinkAndSourceCoupledMat[I,O,M1,M2,M](sink:akka.stream.Graph[akka.stream.SinkShape[I],M1],source:akka.stream.Graph[akka.stream.SourceShape[O],M2],combine:akka.japi.function.Function2[M1,M2,M]):akka.stream.javadsl.Flow[I,O,M] "Permalink")  def fromSinkAndSourceCoupledMat\[I, O, M1, M2, M](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[I], M1], source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[O], M2], combine: [Function2](../../japi/function/Function2.html)\[M1, M2, M]): [Flow](Flow.html)\[I, O, M]Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them.

Allows coupling termination (cancellation, completion, erroring) of Sinks and Sources while creating a Flow from them.
Similar to [Flow.fromSinkAndSource](#fromSinkAndSource[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.javadsl.Flow[I,O,akka.NotUsed]) however couples the termination of these two operators.

The resulting flow can be visualized as:

```
    +-----------------------------------------------------+
    | Resulting Flow[I, O, M]                             |
    |                                                     |
    |  +-------------+                 +---------------+  |
    |  |             |                 |               |  |
I  ~~> | Sink[I, M1] | ~~~(coupled)~~~ | Source[O, M2] | ~~> O
    |  |             |                 |               |  |
    |  +-------------+                 +---------------+  |
    +-----------------------------------------------------+
```
E.g. if the emitted [Flow](Flow.html) gets a cancellation, the [Source](Source.html) of course is cancelled,
however the Sink will also be completed. The table on [Flow.fromSinkAndSourceCoupled](#fromSinkAndSourceCoupled[I,O](sink:akka.stream.Graph[akka.stream.SinkShape[I],_],source:akka.stream.Graph[akka.stream.SourceShape[O],_]):akka.stream.javadsl.Flow[I,O,akka.NotUsed])
illustrates the effects in detail.

The `combine` function is used to compose the materialized values of the `sink` and `source`
into the materialized value of the resulting [Flow](Flow.html).
19. [**](../../../akka/stream/javadsl/Flow$.html#fromSinkAndSourceMat[I,O,M1,M2,M](sink:akka.stream.Graph[akka.stream.SinkShape[I],M1],source:akka.stream.Graph[akka.stream.SourceShape[O],M2],combine:akka.japi.function.Function2[M1,M2,M]):akka.stream.javadsl.Flow[I,O,M] "Permalink")  def fromSinkAndSourceMat\[I, O, M1, M2, M](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[I], M1], source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[O], M2], combine: [Function2](../../japi/function/Function2.html)\[M1, M2, M]): [Flow](Flow.html)\[I, O, M]Creates a `Flow` from a `Sink` and a `Source` where the Flow's input
will be sent to the Sink and the Flow's output will come from the Source.

Creates a `Flow` from a `Sink` and a `Source` where the Flow's input
will be sent to the Sink and the Flow's output will come from the Source.

The resulting flow can be visualized as:

```
    +-------------------------------------------------------+
    | Resulting Flow[I, O, M]                              |
    |                                                      |
    |  +-------------+                  +---------------+  |
    |  |             |                  |               |  |
I  ~~> | Sink[I, M1] | [no-connection!] | Source[O, M2] | ~~> O
    |  |             |                  |               |  |
    |  +-------------+                  +---------------+  |
    +------------------------------------------------------+
```
The completion of the Sink and Source sides of a Flow constructed using
this method are independent. So if the Sink receives a completion signal,
the Source side will remain unaware of that. If you are looking to couple
the termination signals of the two sides use `Flow.fromSinkAndSourceCoupledMat` instead.

The `combine` function is used to compose the materialized values of the `sink` and `source`
into the materialized value of the resulting [Flow](Flow.html).
20. [**](../../../akka/stream/javadsl/Flow$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/stream/javadsl/Flow$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/javadsl/Flow$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../akka/stream/javadsl/Flow$.html#lazyCompletionStageFlow[I,O,M](create:akka.japi.function.Creator[java.util.concurrent.CompletionStage[akka.stream.javadsl.Flow[I,O,M]]]):akka.stream.javadsl.Flow[I,O,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazyCompletionStageFlow\[I, O, M](create: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Flow](Flow.html)\[I, O, M]]]): [Flow](Flow.html)\[I, O, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream
to send a first element.

Defers invoking the `create` function to create a future flow until there downstream demand has caused upstream
to send a first element.

The materialized future value is completed with the materialized value of the created flow when that has successfully
been materialized.

If the `create` function throws or returns a future that fails the stream is failed, in this case the materialized
future value is failed with a [NeverMaterializedException](../NeverMaterializedException.html).

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and can trigger the factory earlier than expected.

**Emits when** the internal flow is successfully created and it emits

**Backpressures when** the internal flow is successfully created and it backpressures or downstream backpressures

**Completes when** upstream completes and all elements have been emitted from the internal flow

**Cancels when** downstream cancels
24. [**](../../../akka/stream/javadsl/Flow$.html#lazyFlow[I,O,M](create:akka.japi.function.Creator[akka.stream.javadsl.Flow[I,O,M]]):akka.stream.javadsl.Flow[I,O,java.util.concurrent.CompletionStage[M]] "Permalink")  def lazyFlow\[I, O, M](create: [Creator](../../japi/function/Creator.html)\[[Flow](Flow.html)\[I, O, M]]): [Flow](Flow.html)\[I, O, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers invoking the `create` function to create a future flow until there is downstream demand and passing
that downstream demand upstream triggers the first element.

Defers invoking the `create` function to create a future flow until there is downstream demand and passing
that downstream demand upstream triggers the first element.

Note that asynchronous boundaries (and other operators) in the stream may do pre\-fetching which counter acts
the laziness and can trigger the factory earlier than expected.

**Emits when** the internal flow is successfully created and it emits

**Backpressures when** the internal flow is successfully created and it backpressures or downstream backpressures

**Completes when** upstream completes and all elements have been emitted from the internal flow

**Cancels when** downstream cancels
25. [**](../../../akka/stream/javadsl/Flow$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
26. [**](../../../akka/stream/javadsl/Flow$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/javadsl/Flow$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/javadsl/Flow$.html#of[T](clazz:Class[T]):akka.stream.javadsl.Flow[T,T,akka.NotUsed] "Permalink")  def of\[T](clazz: Class\[T]): [Flow](Flow.html)\[T, T, [NotUsed](../../NotUsed.html)]Create a `Flow` which can process elements of type `T`.
29. [**](../../../akka/stream/javadsl/Flow$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
30. [**](../../../akka/stream/javadsl/Flow$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
31. [**](../../../akka/stream/javadsl/Flow$.html#upcast[In,SuperOut,Out<:SuperOut,M](flow:akka.stream.javadsl.Flow[In,Out,M]):akka.stream.javadsl.Flow[In,SuperOut,M] "Permalink")  def upcast\[In, SuperOut, Out \<: SuperOut, M](flow: [Flow](Flow.html)\[In, Out, M]): [Flow](Flow.html)\[In, SuperOut, M]Upcast a stream of elements to a stream of supertypes of that element.

Upcast a stream of elements to a stream of supertypes of that element. Useful in combination with
fan\-in operators where you do not want to pay the cost of casting each element in a `map`.

SuperOuta supertype to the type of element flowing out of the flow

returnsA flow that accepts `In` and outputs elements of the super type
32. [**](../../../akka/stream/javadsl/Flow$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../../akka/stream/javadsl/Flow$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
34. [**](../../../akka/stream/javadsl/Flow$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Flow$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/javadsl/Flow$.html#lazyInit[I,O,M](flowFactory:akka.japi.function.Function[I,java.util.concurrent.CompletionStage[akka.stream.javadsl.Flow[I,O,M]]],fallback:akka.japi.function.Creator[M]):akka.stream.javadsl.Flow[I,O,M] "Permalink")  def lazyInit\[I, O, M](flowFactory: [Function](../../japi/function/Function.html)\[I, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Flow](Flow.html)\[I, O, M]]], fallback: [Creator](../../japi/function/Creator.html)\[M]): [Flow](Flow.html)\[I, O, M]Creates a real `Flow` upon receiving the first element.

Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
if there are no elements, because of completion, cancellation, or error.

The materialized value of the `Flow` is the value that is created by the `fallback` function.

**Emits when** the internal flow is successfully created and it emits

**Backpressures when** the internal flow is successfully created and it backpressures

**Completes when** upstream completes and all elements have been emitted from the internal flow

**Cancels when** downstream cancels

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Flow.completionStageFlow' in combination with prefixAndTail(1\) instead, see `completionStageFlow` operator docs for details
3. [**](../../../akka/stream/javadsl/Flow$.html#lazyInitAsync[I,O,M](flowFactory:akka.japi.function.Creator[java.util.concurrent.CompletionStage[akka.stream.javadsl.Flow[I,O,M]]]):akka.stream.javadsl.Flow[I,O,java.util.concurrent.CompletionStage[java.util.Optional[M]]] "Permalink")  def lazyInitAsync\[I, O, M](flowFactory: [Creator](../../japi/function/Creator.html)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Flow](Flow.html)\[I, O, M]]]): [Flow](Flow.html)\[I, O, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[M]]]Creates a real `Flow` upon receiving the first element.

Creates a real `Flow` upon receiving the first element. Internal `Flow` will not be created
if there are no elements, because of completion, cancellation, or error.

The materialized value of the `Flow` is a `Future[Option[M]]` that is completed with `Some(mat)` when the internal
flow gets materialized or with `None` when there where no elements. If the flow materialization (including
the call of the `flowFactory`) fails then the future is completed with a failure.

**Emits when** the internal flow is successfully created and it emits

**Backpressures when** the internal flow is successfully created and it backpressures

**Completes when** upstream completes and all elements have been emitted from the internal flow

**Cancels when** downstream cancels

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'Flow.lazyCompletionStageFlow' instead
4. [**](../../../akka/stream/javadsl/Flow$.html#setup[I,O,M](factory:java.util.function.BiFunction[akka.stream.ActorMaterializer,akka.stream.Attributes,akka.stream.javadsl.Flow[I,O,M]]):akka.stream.javadsl.Flow[I,O,java.util.concurrent.CompletionStage[M]] "Permalink")  def setup\[I, O, M](factory: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[[ActorMaterializer](../ActorMaterializer.html), [Attributes](../Attributes.html), [Flow](Flow.html)\[I, O, M]]): [Flow](Flow.html)\[I, O, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[M]]Defers the creation of a [Flow](Flow.html) until materialization.

Defers the creation of a [Flow](Flow.html) until materialization. The `factory` function
exposes [ActorMaterializer](../ActorMaterializer.html) which is going to be used during materialization and
[Attributes](../Attributes.html) of the [Flow](Flow.html) returned by this method.

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use 'fromMaterializer' instead
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/japi/Pair.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function.html
- https://doc.akka.io/api/akka/current/akka/japi/function/Function2.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/ActorMaterializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/NeverMaterializedException.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
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

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow$.html](https://doc.akka.io/api/akka/current/akka/stream/javadsl/Flow$.html)*