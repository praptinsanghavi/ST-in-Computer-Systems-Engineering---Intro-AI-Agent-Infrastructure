---
description: Akka 2.10.17 - akka.stream.scaladsl.ZipLatest
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:09:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/ZipLatest.html
title: Akka 2.10.17 - akka.stream.scaladsl.ZipLatest
---

# Akka 2.10.17 - akka.stream.scaladsl.ZipLatest

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.ZipLatest

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/stream/index.html "Permalink")  package [stream](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/stream/scaladsl/index.html "Permalink")  package [scaladsl](index.html "Scala API: The flow DSL allows the formulation of stream transformations based on some input.")Scala API: The flow DSL allows the formulation of stream transformations based on some
input.

Scala API: The flow DSL allows the formulation of stream transformations based on some
input. The starting point is called [Source](Source.html) and can be a collection, an iterator,
a block of code which is evaluated repeatedly or a org.reactivestreams.Publisher.
A flow with an attached input and open output is also a [Source](Source.html).

A flow may also be defined without an attached input or output and that is then
a [Flow](Flow.html). The `Flow` can be connected to the `Source` later by using [Source\#via](Source.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Source.this.Repr[T]) with
the flow as argument, and it remains a [Source](Source.html).

Transformations can be appended to `Source` and `Flow` with the operations
defined in [FlowOps](FlowOps.html). Each DSL element produces a new flow that can be further transformed,
building up a description of the complete transformation pipeline.

The termination point of a flow is called [Sink](Sink.html) and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a [Sink](Sink.html).

If a flow has both an attached input and an attached output it becomes a [RunnableGraph](RunnableGraph.html).
In order to execute this pipeline the flow must be materialized by calling [RunnableGraph\#run](RunnableGraph.html#run()(implicitmaterializer:akka.stream.Materializer):Mat) on it.

You can create your `Source`, `Flow` and `Sink` in any order and then wire them together before
they are materialized by connecting them using [Flow\#via](Flow.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):Flow.this.Repr[T]) and [Flow\#to](Flow.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):akka.stream.scaladsl.Sink[In,Mat]), or connecting them into a
[GraphDSL](GraphDSL$.html) with fan\-in and fan\-out elements.

See [Reactive Streams](https://github.com/reactive-streams/reactive-streams/) for
details on org.reactivestreams.Publisher and org.reactivestreams.Subscriber.

It should be noted that the streams modeled by this library are “hot”,
meaning that they asynchronously flow through a series of processors without
detailed control by the user. In particular it is not predictable how many
elements a given transformation step might buffer before handing elements
downstream, which means that transformation functions may be invoked more
often than for corresponding transformations on strict collections like
List. \*An important consequence\* is that elements that were produced
into a stream may be discarded by later processors, e.g. when using the
\#take operator.

By default every operation is executed within its own [akka.actor.Actor](../../actor/Actor.html)
to enable full pipelining of the chained set of computations. This behavior
is determined by the [akka.stream.Materializer](../Materializer.html) which is required
by those methods that materialize the Flow into a series of
org.reactivestreams.Processor instances. The returned reactive stream
is fully started and active.

Definition Classes[stream](../index.html)
- [Balance](Balance.html "Fan-out the stream to several streams.")
- [BidiFlow](BidiFlow.html)
- [Broadcast](Broadcast.html "Fan-out the stream to several streams emitting each incoming upstream element to all downstream consumers.")
- [BroadcastHub](BroadcastHub$.html "A BroadcastHub is a special streaming hub that is able to broadcast streamed elements to a dynamic set of consumers.")
- [Compression](Compression$.html)
- [Concat](Concat.html "Takes multiple streams and outputs one stream formed from the input streams by first emitting all of the elements from the first stream and then emitting all of the elements from the second stream, etc.")
- [DelayStrategy](DelayStrategy.html "Allows to manage delay.")
- [FileIO](FileIO$.html "Factories to create sinks and sources from files")
- [Flow](Flow.html "A Flow is a set of stream processing steps that has one open input and one open output.")
- [FlowOps](FlowOps.html "Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left-to-right only.")
- [FlowOpsMat](FlowOpsMat.html "INTERNAL API: this trait will be changed in binary-incompatible ways for classes that are derived from it! Do not implement this interface outside the Akka code base!")
- [FlowWithContext](FlowWithContext.html "A flow that provides operations which automatically propagate the context of an element.")
- [FlowWithContextOps](FlowWithContextOps.html "Shared stream operations for FlowWithContext and SourceWithContext that automatically propagate a context element with each data element.")
- [Framing](Framing$.html)
- [GraphApply](GraphApply.html)
- [GraphDSL](GraphDSL$.html)
- [Interleave](Interleave.html "Interleave represents deterministic merge which takes N elements per input stream, in-order of inputs, emits them downstream and then cycles/\"wraps-around\" the inputs.")
- [JavaFlowSupport](JavaFlowSupport$.html "For use only with JDK 9+.")
- [JsonFraming](JsonFraming$.html "Provides JSON framing operators that can separate valid JSON objects from incoming ByteString objects.")
- [Keep](Keep$.html "Convenience functions for often-encountered purposes like keeping only the left (first) or only the right (second) of two input values.")
- [Merge](Merge.html "Merge several streams, taking elements as they arrive from input streams (picking randomly when several have elements ready).")
- [MergeHub](MergeHub$.html "A MergeHub is a special streaming hub that is able to collect streamed elements from a dynamic set of producers.")
- [MergeLatest](MergeLatest.html)
- [MergePreferred](MergePreferred.html "Merge several streams, taking elements as they arrive from input streams (picking from preferred when several have elements ready).")
- [MergePrioritized](MergePrioritized.html "Merge several streams, taking elements as they arrive from input streams (picking from prioritized once when several have elements ready).")
- [MergeSequence](MergeSequence.html "Takes multiple streams whose elements in aggregate have a defined linear sequence with difference 1, starting at 0, and outputs a single stream containing these elements, in order.")
- [MergeSorted](MergeSorted.html "Merge two pre-sorted streams such that the resulting stream is sorted.")
- [OrElse](OrElse$.html)
- [Partition](Partition.html "Fan-out the stream to several streams.")
- [PartitionHub](PartitionHub$.html "A PartitionHub is a special streaming hub that is able to route streamed elements to a dynamic set of consumers.")
- [RestartFlow](RestartFlow$.html "A RestartFlow wraps a Flow that gets restarted when it completes or fails.")
- [RestartSink](RestartSink$.html "A RestartSink wraps a Sink that gets restarted when it completes or fails.")
- [RestartSource](RestartSource$.html "A RestartSource wraps a Source that gets restarted when it completes or fails.")
- [RestartSourceWithContext](RestartSourceWithContext$.html "A RestartSourceWithContext wraps a SourceWithContext that gets restarted when it completes or fails.")
- [RestartWithBackoffFlow](RestartWithBackoffFlow$.html)
- [RetryFlow](RetryFlow$.html)
- [RunnableGraph](RunnableGraph.html "Flow with attached input and output, can be executed.")
- [ScalaSessionAPI](ScalaSessionAPI.html "Allows access to an SSLSession with Scala types")
- [Sink](Sink.html "A Sink is a set of stream processing steps that has one open input.")
- [SinkQueue](SinkQueue.html "This trait allows to have a queue as a sink for a stream.")
- [SinkQueueWithCancel](SinkQueueWithCancel.html "This trait adds cancel support to SinkQueue.")
- [SinkToCompletionStage](package$$SinkToCompletionStage.html)
- [Source](Source.html "A Source is a set of stream processing steps that has one open output.")
- [SourceQueue](SourceQueue.html "This trait allows to have a queue as a data source for some stream.")
- [SourceQueueWithComplete](SourceQueueWithComplete.html "This trait adds completion support to SourceQueue.")
- [SourceToCompletionStage](package$$SourceToCompletionStage.html)
- [SourceWithContext](SourceWithContext.html "A source that provides operations which automatically propagate the context of an element.")
- [StreamConverters](StreamConverters$.html "Converters for interacting with the blocking java.io streams APIs and Java 8 Streams")
- [StreamRefs](StreamRefs$.html "Factories for creating stream refs.")
- [SubFlow](SubFlow.html "A “stream of streams” sub-flow of data elements, e.g.")
- [TLS](TLS$.html "Stream cipher support based upon JSSE.")
- [TLSPlacebo](TLSPlacebo$.html "This object holds simple wrapping akka.stream.scaladsl.BidiFlow implementations that can be used instead of TLS when no encryption is desired.")
- [Tcp](Tcp.html)
- [TcpAttributes](TcpAttributes$.html)
- [TcpIdleTimeoutException](TcpIdleTimeoutException.html)
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Transforms each element of input stream into multiple streams using a splitter function.")
- [UnzipWith10](UnzipWith10.html "UnzipWith specialized for 10 outputs")
- [UnzipWith11](UnzipWith11.html "UnzipWith specialized for 11 outputs")
- [UnzipWith12](UnzipWith12.html "UnzipWith specialized for 12 outputs")
- [UnzipWith13](UnzipWith13.html "UnzipWith specialized for 13 outputs")
- [UnzipWith14](UnzipWith14.html "UnzipWith specialized for 14 outputs")
- [UnzipWith15](UnzipWith15.html "UnzipWith specialized for 15 outputs")
- [UnzipWith16](UnzipWith16.html "UnzipWith specialized for 16 outputs")
- [UnzipWith17](UnzipWith17.html "UnzipWith specialized for 17 outputs")
- [UnzipWith18](UnzipWith18.html "UnzipWith specialized for 18 outputs")
- [UnzipWith19](UnzipWith19.html "UnzipWith specialized for 19 outputs")
- [UnzipWith2](UnzipWith2.html "UnzipWith specialized for 2 outputs")
- [UnzipWith20](UnzipWith20.html "UnzipWith specialized for 20 outputs")
- [UnzipWith21](UnzipWith21.html "UnzipWith specialized for 21 outputs")
- [UnzipWith22](UnzipWith22.html "UnzipWith specialized for 22 outputs")
- [UnzipWith3](UnzipWith3.html "UnzipWith specialized for 3 outputs")
- [UnzipWith4](UnzipWith4.html "UnzipWith specialized for 4 outputs")
- [UnzipWith5](UnzipWith5.html "UnzipWith specialized for 5 outputs")
- [UnzipWith6](UnzipWith6.html "UnzipWith specialized for 6 outputs")
- [UnzipWith7](UnzipWith7.html "UnzipWith specialized for 7 outputs")
- [UnzipWith8](UnzipWith8.html "UnzipWith specialized for 8 outputs")
- [UnzipWith9](UnzipWith9.html "UnzipWith specialized for 9 outputs")
- [UnzipWithApply](UnzipWithApply.html)
- [WireTap](WireTap$.html)
- [Zip](Zip.html "Combine the elements of 2 streams into a stream of tuples.")
- ZipLatest
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipLatestWith10](ZipLatestWith10.html "ZipLatestWith specialized for 10 inputs")
- [ZipLatestWith11](ZipLatestWith11.html "ZipLatestWith specialized for 11 inputs")
- [ZipLatestWith12](ZipLatestWith12.html "ZipLatestWith specialized for 12 inputs")
- [ZipLatestWith13](ZipLatestWith13.html "ZipLatestWith specialized for 13 inputs")
- [ZipLatestWith14](ZipLatestWith14.html "ZipLatestWith specialized for 14 inputs")
- [ZipLatestWith15](ZipLatestWith15.html "ZipLatestWith specialized for 15 inputs")
- [ZipLatestWith16](ZipLatestWith16.html "ZipLatestWith specialized for 16 inputs")
- [ZipLatestWith17](ZipLatestWith17.html "ZipLatestWith specialized for 17 inputs")
- [ZipLatestWith18](ZipLatestWith18.html "ZipLatestWith specialized for 18 inputs")
- [ZipLatestWith19](ZipLatestWith19.html "ZipLatestWith specialized for 19 inputs")
- [ZipLatestWith2](ZipLatestWith2.html "ZipLatestWith specialized for 2 inputs")
- [ZipLatestWith20](ZipLatestWith20.html "ZipLatestWith specialized for 20 inputs")
- [ZipLatestWith21](ZipLatestWith21.html "ZipLatestWith specialized for 21 inputs")
- [ZipLatestWith22](ZipLatestWith22.html "ZipLatestWith specialized for 22 inputs")
- [ZipLatestWith3](ZipLatestWith3.html "ZipLatestWith specialized for 3 inputs")
- [ZipLatestWith4](ZipLatestWith4.html "ZipLatestWith specialized for 4 inputs")
- [ZipLatestWith5](ZipLatestWith5.html "ZipLatestWith specialized for 5 inputs")
- [ZipLatestWith6](ZipLatestWith6.html "ZipLatestWith specialized for 6 inputs")
- [ZipLatestWith7](ZipLatestWith7.html "ZipLatestWith specialized for 7 inputs")
- [ZipLatestWith8](ZipLatestWith8.html "ZipLatestWith specialized for 8 inputs")
- [ZipLatestWith9](ZipLatestWith9.html "ZipLatestWith specialized for 9 inputs")
- [ZipLatestWithApply](ZipLatestWithApply.html)
- [ZipN](ZipN.html "Combine the elements of multiple streams into a stream of sequences.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWith10](ZipWith10.html "ZipWith specialized for 10 inputs")
- [ZipWith11](ZipWith11.html "ZipWith specialized for 11 inputs")
- [ZipWith12](ZipWith12.html "ZipWith specialized for 12 inputs")
- [ZipWith13](ZipWith13.html "ZipWith specialized for 13 inputs")
- [ZipWith14](ZipWith14.html "ZipWith specialized for 14 inputs")
- [ZipWith15](ZipWith15.html "ZipWith specialized for 15 inputs")
- [ZipWith16](ZipWith16.html "ZipWith specialized for 16 inputs")
- [ZipWith17](ZipWith17.html "ZipWith specialized for 17 inputs")
- [ZipWith18](ZipWith18.html "ZipWith specialized for 18 inputs")
- [ZipWith19](ZipWith19.html "ZipWith specialized for 19 inputs")
- [ZipWith2](ZipWith2.html "ZipWith specialized for 2 inputs")
- [ZipWith20](ZipWith20.html "ZipWith specialized for 20 inputs")
- [ZipWith21](ZipWith21.html "ZipWith specialized for 21 inputs")
- [ZipWith22](ZipWith22.html "ZipWith specialized for 22 inputs")
- [ZipWith3](ZipWith3.html "ZipWith specialized for 3 inputs")
- [ZipWith4](ZipWith4.html "ZipWith specialized for 4 inputs")
- [ZipWith5](ZipWith5.html "ZipWith specialized for 5 inputs")
- [ZipWith6](ZipWith6.html "ZipWith specialized for 6 inputs")
- [ZipWith7](ZipWith7.html "ZipWith specialized for 7 inputs")
- [ZipWith8](ZipWith8.html "ZipWith specialized for 8 inputs")
- [ZipWith9](ZipWith9.html "ZipWith specialized for 9 inputs")
- [ZipWithApply](ZipWithApply.html)
- [ZipWithN](ZipWithN.html "Combine the elements of multiple streams into a stream of sequences using a combiner function.")
[c](ZipLatest$.html "See companion object")[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# [ZipLatest](ZipLatest$.html "See companion object")[**](../../../akka/stream/scaladsl/ZipLatest.html "Permalink")

### Companion [object ZipLatest](ZipLatest$.html "See companion object")

#### final  class ZipLatest\[A, B] extends [ZipLatestWith2](ZipLatestWith2.html)\[A, B, (A, B)]

Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

A `ZipLatest` has a `left` and a `right` input port and one `out` port.

No element is emitted until at least one element from each Source becomes available.

**Emits when** all of the inputs have at least an element available, and then each time an element becomes
\* available on either of the inputs

**Backpressures when** downstream backpressures

**Completes when** any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete

**Cancels when** downstream cancels

Source[Graph.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Graph.scala#L1057)Linear Supertypes[ZipLatestWith2](ZipLatestWith2.html)\[A, B, (A, B)], [GraphStage](../stage/GraphStage.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)]], [GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)], [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ZipLatest
2. ZipLatestWith2
3. GraphStage
4. GraphStageWithMaterializedValue
5. Graph
6. AnyRef
7. Any
Implicitly  
1. by GraphMapMatVal
2. by any2stringadd
3. by StringFormat
4. by Ensuring
5. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/scaladsl/ZipLatest.html#<init>():akka.stream.scaladsl.ZipLatest[A,B] "Permalink")  new ZipLatest()
2. [**](../../../akka/stream/scaladsl/ZipLatest.html#<init>(eagerComplete:Boolean):akka.stream.scaladsl.ZipLatest[A,B] "Permalink")  new ZipLatest(eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))
### Type Members

1. [**](../../../akka/stream/scaladsl/ZipLatest.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [FanInShape2](../FanInShape2.html)\[A, B, (A, B)]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/scaladsl/ZipLatest.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/ZipLatest.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/ZipLatest.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toany2stringadd\[ZipLatest\[A, B]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/ZipLatest.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ZipLatest\[A, B], B)ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toArrowAssoc\[ZipLatest\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/ZipLatest.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/scaladsl/ZipLatest.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]Add the given attributes to this [Graph](../Graph.html).

Add the given attributes to this [Graph](../Graph.html). If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Source is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition Classes[Graph](../Graph.html)
7. [**](../../../akka/stream/scaladsl/ZipLatest.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/scaladsl/ZipLatest.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition Classes[Graph](../Graph.html)
9. [**](../../../akka/stream/scaladsl/ZipLatest.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition Classes[Graph](../Graph.html)
10. [**](../../../akka/stream/scaladsl/ZipLatest.html#async:akka.stream.Graph[S,M] "Permalink")  def async: [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

Definition Classes[Graph](../Graph.html)
11. [**](../../../akka/stream/scaladsl/ZipLatest.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/scaladsl/ZipLatest.html#createLogic(inheritedAttributes:akka.stream.Attributes):akka.stream.stage.GraphStageLogic "Permalink")  def createLogic(inheritedAttributes: [Attributes](../Attributes.html)): [GraphStageLogic](../stage/GraphStageLogic.html)Definition Classes[ZipLatestWith2](ZipLatestWith2.html) → [GraphStage](../stage/GraphStage.html)
13. [**](../../../akka/stream/scaladsl/ZipLatest.html#createLogicAndMaterializedValue(inheritedAttributes:akka.stream.Attributes):(akka.stream.stage.GraphStageLogic,akka.NotUsed) "Permalink") final  def createLogicAndMaterializedValue(inheritedAttributes: [Attributes](../Attributes.html)): ([GraphStageLogic](../stage/GraphStageLogic.html), [NotUsed](../../NotUsed.html))Definition Classes[GraphStage](../stage/GraphStage.html) → [GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html)
14. [**](../../../akka/stream/scaladsl/ZipLatest.html#eagerComplete:Boolean "Permalink")  val eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ZipLatestWith2](ZipLatestWith2.html)
15. [**](../../../akka/stream/scaladsl/ZipLatest.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ZipLatest\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ZipLatest\[A, B]ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toEnsuring\[ZipLatest\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/scaladsl/ZipLatest.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ZipLatest\[A, B]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ZipLatest\[A, B]ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toEnsuring\[ZipLatest\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/scaladsl/ZipLatest.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ZipLatest\[A, B]ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toEnsuring\[ZipLatest\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/scaladsl/ZipLatest.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ZipLatest\[A, B]ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toEnsuring\[ZipLatest\[A, B]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/scaladsl/ZipLatest.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/stream/scaladsl/ZipLatest.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/stream/scaladsl/ZipLatest.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition Classes[Graph](../Graph.html)
22. [**](../../../akka/stream/scaladsl/ZipLatest.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/scaladsl/ZipLatest.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/stream/scaladsl/ZipLatest.html#in0:akka.stream.Inlet[A1] "Permalink")  val in0: [Inlet](../Inlet.html)\[A]Definition Classes[ZipLatestWith2](ZipLatestWith2.html)
25. [**](../../../akka/stream/scaladsl/ZipLatest.html#in1:akka.stream.Inlet[A2] "Permalink")  val in1: [Inlet](../Inlet.html)\[B]Definition Classes[ZipLatestWith2](ZipLatestWith2.html)
26. [**](../../../akka/stream/scaladsl/ZipLatest.html#initialAttributes:akka.stream.Attributes "Permalink")  def initialAttributes: [Attributes](../Attributes.html)Definition Classes[ZipLatestWith2](ZipLatestWith2.html) → [GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html)
27. [**](../../../akka/stream/scaladsl/ZipLatest.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../akka/stream/scaladsl/ZipLatest.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: ([NotUsed](../../NotUsed.html)) \=\> M2): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
29. [**](../../../akka/stream/scaladsl/ZipLatest.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]Specifies the name of the Graph.

Specifies the name of the Graph.
If the name is null or empty the name is ignored, i.e. \#none is returned.

Definition Classes[Graph](../Graph.html)
30. [**](../../../akka/stream/scaladsl/ZipLatest.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
31. [**](../../../akka/stream/scaladsl/ZipLatest.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
32. [**](../../../akka/stream/scaladsl/ZipLatest.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/stream/scaladsl/ZipLatest.html#out:akka.stream.Outlet[O] "Permalink")  def out: [Outlet](../Outlet.html)\[(A, B)]Definition Classes[ZipLatestWith2](ZipLatestWith2.html)
34. [**](../../../akka/stream/scaladsl/ZipLatest.html#shape:akka.stream.FanInShape2[A1,A2,O] "Permalink")  val shape: [FanInShape2](../FanInShape2.html)\[A, B, (A, B)]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition Classes[ZipLatestWith2](ZipLatestWith2.html) → [Graph](../Graph.html)
35. [**](../../../akka/stream/scaladsl/ZipLatest.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
36. [**](../../../akka/stream/scaladsl/ZipLatest.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesZipLatest → [ZipLatestWith2](ZipLatestWith2.html) → AnyRef → Any
37. [**](../../../akka/stream/scaladsl/ZipLatest.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/stream/scaladsl/ZipLatest.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/stream/scaladsl/ZipLatest.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../akka/stream/scaladsl/ZipLatest.html#withAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink") final  def withAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]Replace the attributes of this [Flow](Flow.html) with the given ones.

Replace the attributes of this [Flow](Flow.html) with the given ones. If this Flow is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Definition Classes[GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html) → [Graph](../Graph.html)
41. [**](../../../akka/stream/scaladsl/ZipLatest.html#zipper:(A1,A2)=>O "Permalink")  val zipper: (A, B) \=\> (A, B)Definition Classes[ZipLatestWith2](ZipLatestWith2.html)
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/ZipLatest.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/ZipLatest.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toStringFormat\[ZipLatest\[A, B]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/ZipLatest.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ZipLatest\[A, B], B)ImplicitThis member is added by an implicit conversion from ZipLatest\[A, B] toArrowAssoc\[ZipLatest\[A, B]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [ZipLatestWith2](ZipLatestWith2.html)\[A, B, (A, B)]

### Inherited from [GraphStage](../stage/GraphStage.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)]]

### Inherited from [GraphStageWithMaterializedValue](../stage/GraphStageWithMaterializedValue.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]

### Inherited from [Graph](../Graph.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromZipLatest\[A, B] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[FanInShape2](../FanInShape2.html)\[A, B, (A, B)], [NotUsed](../../NotUsed.html)]

### Inherited by implicit conversion any2stringadd fromZipLatest\[A, B] to any2stringadd\[ZipLatest\[A, B]]

### Inherited by implicit conversion StringFormat fromZipLatest\[A, B] to StringFormat\[ZipLatest\[A, B]]

### Inherited by implicit conversion Ensuring fromZipLatest\[A, B] to Ensuring\[ZipLatest\[A, B]]

### Inherited by implicit conversion ArrowAssoc fromZipLatest\[A, B] to ArrowAssoc\[ZipLatest\[A, B]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/FanInShape2.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph$.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Inlet.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/Outlet.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/BidiFlow$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Concat$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/DelayStrategy$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowWithContext$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Framing$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Interleave$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/JavaFlowSupport$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/JsonFraming$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Merge$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeHub$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeLatest$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeLatest.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePreferred.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePrioritized$.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergePrioritized.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeSequence$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/ZipLatest.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/ZipLatest.html)*