---
description: Akka 2.10.17 - akka.stream.scaladsl.SourceWithContext
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/SourceWithContext.html
title: Akka 2.10.17 - akka.stream.scaladsl.SourceWithContext
---

# Akka 2.10.17 - akka.stream.scaladsl.SourceWithContext

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.SourceWithContext

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
- SourceWithContext
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
- [ZipLatest](ZipLatest.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
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
[c](SourceWithContext$.html "See companion object")[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# [SourceWithContext](SourceWithContext$.html "See companion object")[**](../../../akka/stream/scaladsl/SourceWithContext.html "Permalink")

### Companion [object SourceWithContext](SourceWithContext$.html "See companion object")

#### final  class SourceWithContext\[\+Out, \+Ctx, \+Mat] extends GraphDelegate\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat] with [FlowWithContextOps](FlowWithContextOps.html)\[Out, Ctx, Mat]

A source that provides operations which automatically propagate the context of an element.
Only a subset of common operations from [FlowOps](FlowOps.html) is supported. As an escape hatch you can
use [FlowWithContextOps.via](FlowWithContextOps.html#via[Out2,Ctx2,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[(Out,Ctx),(Out2,Ctx2)],Mat2]):FlowWithContextOps.this.Repr[Out2,Ctx2]) to manually provide the context propagation for otherwise unsupported
operations.

Can be created by calling [Source.asSourceWithContext](Source.html#asSourceWithContext[Ctx](f:Out=>Ctx):akka.stream.scaladsl.SourceWithContext[Out,Ctx,Mat])

Source[SourceWithContext.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/SourceWithContext.scala#L28)Linear Supertypes[FlowWithContextOps](FlowWithContextOps.html)\[Out, Ctx, Mat], GraphDelegate\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat], [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SourceWithContext
2. FlowWithContextOps
3. GraphDelegate
4. Graph
5. AnyRef
6. Any
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
### Type Members

1. [**](../../../akka/stream/scaladsl/SourceWithContext.html#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance] "Permalink")  type Repr\[\+O, \+C] \= [ReprMat](#ReprMat[+O,+C,+M]=akka.stream.scaladsl.SourceWithContext[O,C,M@scala.annotation.unchecked.uncheckedVariance])\[O, C, Mat]Definition Classes[FlowWithContextOps](FlowWithContextOps.html)
2. [**](../../../akka/stream/scaladsl/SourceWithContext.html#ReprMat[+O,+C,+M]=akka.stream.scaladsl.SourceWithContext[O,C,M@scala.annotation.unchecked.uncheckedVariance] "Permalink")  type ReprMat\[\+O, \+C, \+M] \= SourceWithContext\[O, C, M]Definition ClassesSourceWithContext → [FlowWithContextOps](FlowWithContextOps.html)
3. [**](../../../akka/stream/scaladsl/SourceWithContext.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [SourceShape](../SourceShape.html)\[(Out, Ctx)]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/scaladsl/SourceWithContext.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/SourceWithContext.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/SourceWithContext.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toany2stringadd\[SourceWithContext\[Out, Ctx, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/SourceWithContext.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (SourceWithContext\[Out, Ctx, Mat], B)ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toArrowAssoc\[SourceWithContext\[Out, Ctx, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/SourceWithContext.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/scaladsl/SourceWithContext.html#addAttributes(attr:akka.stream.Attributes):akka.stream.Graph[S,M] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]Add the given attributes to this [Graph](../Graph.html).

Add the given attributes to this [Graph](../Graph.html). If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Source is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition Classes[Graph](../Graph.html)
7. [**](../../../akka/stream/scaladsl/SourceWithContext.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/scaladsl/SourceWithContext.html#asJava[JOut>:Out,JCtx>:Ctx,JMat>:Mat]:akka.stream.javadsl.SourceWithContext[JOut,JCtx,JMat] "Permalink")  def asJava\[JOut \>: Out, JCtx \>: Ctx, JMat \>: Mat]: [javadsl.SourceWithContext](../javadsl/SourceWithContext.html)\[JOut, JCtx, JMat]
9. [**](../../../akka/stream/scaladsl/SourceWithContext.html#asSource:akka.stream.scaladsl.Source[(Out,Ctx),Mat] "Permalink")  def asSource: [Source](Source.html)\[(Out, Ctx), Mat]Stops automatic context propagation from here and converts this to a regular
stream of a pair of (data, context).
10. [**](../../../akka/stream/scaladsl/SourceWithContext.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition Classes[Graph](../Graph.html)
11. [**](../../../akka/stream/scaladsl/SourceWithContext.html#async(dispatcher:String):akka.stream.Graph[S,M] "Permalink")  def async(dispatcher: String): [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition Classes[Graph](../Graph.html)
12. [**](../../../akka/stream/scaladsl/SourceWithContext.html#async:akka.stream.Graph[S,M] "Permalink")  def async: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

Definition Classes[Graph](../Graph.html)
13. [**](../../../akka/stream/scaladsl/SourceWithContext.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/stream/scaladsl/SourceWithContext.html#collect[Out2](f:PartialFunction[Out,Out2]):FlowWithContextOps.this.Repr[Out2,Ctx] "Permalink")  def collect\[Out2](f: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Out, Out2]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.collect](FlowOps.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.collect](FlowOps.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T]).

Note, that the context of elements that are filtered out is skipped as well.

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.collect](FlowOps.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T])
15. [**](../../../akka/stream/scaladsl/SourceWithContext.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (SourceWithContext\[Out, Ctx, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SourceWithContext\[Out, Ctx, Mat]ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toEnsuring\[SourceWithContext\[Out, Ctx, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/scaladsl/SourceWithContext.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (SourceWithContext\[Out, Ctx, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SourceWithContext\[Out, Ctx, Mat]ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toEnsuring\[SourceWithContext\[Out, Ctx, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/scaladsl/SourceWithContext.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): SourceWithContext\[Out, Ctx, Mat]ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toEnsuring\[SourceWithContext\[Out, Ctx, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/scaladsl/SourceWithContext.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): SourceWithContext\[Out, Ctx, Mat]ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toEnsuring\[SourceWithContext\[Out, Ctx, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/scaladsl/SourceWithContext.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/stream/scaladsl/SourceWithContext.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/stream/scaladsl/SourceWithContext.html#filter(pred:Out=>Boolean):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def filter(pred: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.filter](FlowOps.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.filter](FlowOps.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out]).

Note, that the context of elements that are filtered out is skipped as well.

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.filter](FlowOps.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out])
22. [**](../../../akka/stream/scaladsl/SourceWithContext.html#filterNot(pred:Out=>Boolean):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def filterNot(pred: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.filterNot](FlowOps.html#filterNot(p:Out=>Boolean):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.filterNot](FlowOps.html#filterNot(p:Out=>Boolean):FlowOps.this.Repr[Out]).

Note, that the context of elements that are filtered out is skipped as well.

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.filterNot](FlowOps.html#filterNot(p:Out=>Boolean):FlowOps.this.Repr[Out])
23. [**](../../../akka/stream/scaladsl/SourceWithContext.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition Classes[Graph](../Graph.html)
24. [**](../../../akka/stream/scaladsl/SourceWithContext.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/stream/scaladsl/SourceWithContext.html#grouped(n:Int):FlowWithContextOps.this.Repr[Seq[Out],Seq[Ctx]] "Permalink")  def grouped(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out], [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Ctx]]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.grouped](FlowOps.html#grouped(n:Int):FlowOps.this.Repr[Seq[Out]]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.grouped](FlowOps.html#grouped(n:Int):FlowOps.this.Repr[Seq[Out]]).

Each output group will be associated with a `Seq` of corresponding context elements.

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.grouped](FlowOps.html#grouped(n:Int):FlowOps.this.Repr[Seq[Out]])
26. [**](../../../akka/stream/scaladsl/SourceWithContext.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/scaladsl/SourceWithContext.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
28. [**](../../../akka/stream/scaladsl/SourceWithContext.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def log(name: String, extract: (Out) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [ConstantFun.scalaIdentityFunction](../../index.html))(implicit log: [LoggingAdapter](../../event/LoggingAdapter.html) \= null): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.log](FlowOps.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.log](FlowOps.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.log](FlowOps.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out])
29. [**](../../../akka/stream/scaladsl/SourceWithContext.html#logWithMarker(name:String,marker:(Out,Ctx)=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def logWithMarker(name: String, marker: (Out, Ctx) \=\> [LogMarker](../../event/LogMarker.html), extract: (Out) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [ConstantFun.scalaIdentityFunction](../../index.html))(implicit log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html) \= null): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.logWithMarker](FlowOps.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.logWithMarker](FlowOps.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.logWithMarker](FlowOps.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out])
30. [**](../../../akka/stream/scaladsl/SourceWithContext.html#map[Out2](f:Out=>Out2):FlowWithContextOps.this.Repr[Out2,Ctx] "Permalink")  def map\[Out2](f: (Out) \=\> Out2): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.map](FlowOps.html#map[T](f:Out=>T):FlowOps.this.Repr[T]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.map](FlowOps.html#map[T](f:Out=>T):FlowOps.this.Repr[T]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.map](FlowOps.html#map[T](f:Out=>T):FlowOps.this.Repr[T])
31. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapAsync[Out2](parallelism:Int)(f:Out=>scala.concurrent.Future[Out2]):FlowWithContextOps.this.Repr[Out2,Ctx] "Permalink")  def mapAsync\[Out2](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: (Out) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Out2]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapAsync](FlowOps.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapAsync](FlowOps.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.mapAsync](FlowOps.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
32. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapAsyncPartitioned[Out2,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[Out2]):FlowWithContextOps.this.Repr[Out2,Ctx] "Permalink")  def mapAsyncPartitioned\[Out2, P](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), perPartition: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(partitioner: (Out) \=\> P)(f: (Out, P) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Out2]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.mapAsyncPartitioned](FlowOps.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
33. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapConcat[Out2](f:Out=>IterableOnce[Out2]):FlowWithContextOps.this.Repr[Out2,Ctx] "Permalink")  def mapConcat\[Out2](f: (Out) \=\> IterableOnce\[Out2]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapConcat](FlowOps.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapConcat](FlowOps.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T]).

The context of the input element will be associated with each of the output elements calculated from
this input element.

Example:

`def dup(element: String) = Seq(element, element)`

Input:

("a", 1\)
("b", 2\)

inputElements.mapConcat(dup)

Output:

("a", 1\)
("a", 1\)
("b", 2\)
("b", 2\)

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.mapConcat](FlowOps.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T])
34. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapContext[Ctx2](f:Ctx=>Ctx2):FlowWithContextOps.this.Repr[Out,Ctx2] "Permalink")  def mapContext\[Ctx2](f: (Ctx) \=\> Ctx2): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx2]Apply the given function to each context element (leaving the data elements unchanged).

Apply the given function to each context element (leaving the data elements unchanged).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)
35. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def mapError(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, Throwable]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapError](FlowOps.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.mapError](FlowOps.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.mapError](FlowOps.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out])
36. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapMaterializedValue[Mat2](f:Mat=>Mat2):akka.stream.scaladsl.SourceWithContext[Out,Ctx,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: (Mat) \=\> Mat2): SourceWithContext\[Out, Ctx, Mat2]Context\-preserving variant of [akka.stream.scaladsl.Source.mapMaterializedValue](Source.html#mapMaterializedValue[Mat2](f:Mat=>Mat2):Source.this.ReprMat[Out,Mat2]).

Context\-preserving variant of [akka.stream.scaladsl.Source.mapMaterializedValue](Source.html#mapMaterializedValue[Mat2](f:Mat=>Mat2):Source.this.ReprMat[Out,Mat2]).

See also[akka.stream.scaladsl.Source.mapMaterializedValue](Source.html#mapMaterializedValue[Mat2](f:Mat=>Mat2):Source.this.ReprMat[Out,Mat2])
37. [**](../../../akka/stream/scaladsl/SourceWithContext.html#named(name:String):akka.stream.Graph[S,M] "Permalink")  def named(name: String): [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]Specifies the name of the Graph.

Specifies the name of the Graph.
If the name is null or empty the name is ignored, i.e. \#none is returned.

Definition Classes[Graph](../Graph.html)
38. [**](../../../akka/stream/scaladsl/SourceWithContext.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
39. [**](../../../akka/stream/scaladsl/SourceWithContext.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
40. [**](../../../akka/stream/scaladsl/SourceWithContext.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
41. [**](../../../akka/stream/scaladsl/SourceWithContext.html#runWith[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[(Out,Ctx)],Mat2])(implicitmaterializer:akka.stream.Materializer):Mat2 "Permalink")  def runWith\[Mat2](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[(Out, Ctx)], Mat2])(implicit materializer: [Materializer](../Materializer.html)): Mat2Connect this akka.stream.scaladsl.SourceWithContext to a [akka.stream.scaladsl.Sink](Sink.html) and run it.

Connect this akka.stream.scaladsl.SourceWithContext to a [akka.stream.scaladsl.Sink](Sink.html) and run it.
The returned value is the materialized value of the `Sink`.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](../SystemMaterializer.html) for running the stream.
42. [**](../../../akka/stream/scaladsl/SourceWithContext.html#shape:S "Permalink") final  def shape: [SourceShape](../SourceShape.html)\[(Out, Ctx)]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition ClassesGraphDelegate → [Graph](../Graph.html)
43. [**](../../../akka/stream/scaladsl/SourceWithContext.html#sliding(n:Int,step:Int):FlowWithContextOps.this.Repr[Seq[Out],Seq[Ctx]] "Permalink")  def sliding(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out], [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Ctx]]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.sliding](FlowOps.html#sliding(n:Int,step:Int):FlowOps.this.Repr[Seq[Out]]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.sliding](FlowOps.html#sliding(n:Int,step:Int):FlowOps.this.Repr[Seq[Out]]).

Each output group will be associated with a `Seq` of corresponding context elements.

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.sliding](FlowOps.html#sliding(n:Int,step:Int):FlowOps.this.Repr[Seq[Out]])
44. [**](../../../akka/stream/scaladsl/SourceWithContext.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
45. [**](../../../akka/stream/scaladsl/SourceWithContext.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html), costCalculation: (Out) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out])
46. [**](../../../akka/stream/scaladsl/SourceWithContext.html#throttle(control:akka.stream.scaladsl.ThrottleControl):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out])
47. [**](../../../akka/stream/scaladsl/SourceWithContext.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,costCalculation:Out=>Int,mode:akka.stream.ThrottleMode):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), costCalculation: (Out) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](../ThrottleMode.html)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out])
48. [**](../../../akka/stream/scaladsl/SourceWithContext.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,costCalculation:Out=>Int):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), costCalculation: (Out) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out])
49. [**](../../../akka/stream/scaladsl/SourceWithContext.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,mode:akka.stream.ThrottleMode):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](../ThrottleMode.html)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out])
50. [**](../../../akka/stream/scaladsl/SourceWithContext.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration):FlowWithContextOps.this.Repr[Out,Ctx] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out, Ctx]Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out]).

Definition Classes[FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.throttle](FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out])
51. [**](../../../akka/stream/scaladsl/SourceWithContext.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[(Out,Ctx)],Mat2]):akka.stream.scaladsl.RunnableGraph[Mat] "Permalink")  def to\[Mat2](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[(Out, Ctx)], Mat2]): [RunnableGraph](RunnableGraph.html)\[Mat]Connect this akka.stream.scaladsl.SourceWithContext to a [akka.stream.scaladsl.Sink](Sink.html),
concatenating the processing steps of both.
52. [**](../../../akka/stream/scaladsl/SourceWithContext.html#toMat[Mat2,Mat3](sink:akka.stream.Graph[akka.stream.SinkShape[(Out,Ctx)],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.RunnableGraph[Mat3] "Permalink")  def toMat\[Mat2, Mat3](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[(Out, Ctx)], Mat2])(combine: (Mat, Mat2) \=\> Mat3): [RunnableGraph](RunnableGraph.html)\[Mat3]Connect this akka.stream.scaladsl.SourceWithContext to a [akka.stream.scaladsl.Sink](Sink.html),
concatenating the processing steps of both.
53. [**](../../../akka/stream/scaladsl/SourceWithContext.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
54. [**](../../../akka/stream/scaladsl/SourceWithContext.html#unsafeDataVia[Out2,Mat2](viaFlow:akka.stream.Graph[akka.stream.FlowShape[Out,Out2],Mat2]):SourceWithContext.this.Repr[Out2,Ctx] "Permalink")  def unsafeDataVia\[Out2, Mat2](viaFlow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out2], Mat2]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx]Transform this flow by the regular flow.

Transform this flow by the regular flow. The given flow works on the data portion of the stream and
ignores the context.

The given flow \*must\* not re\-order, drop or emit multiple elements for one incoming
element, the sequence of incoming contexts is re\-combined with the outgoing
elements of the stream. If a flow not fulfilling this requirement is used the stream
will not fail but continue running in a corrupt state and re\-combine incorrect pairs
of elements and contexts or deadlock.

For more background on these requirements
 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.

Definition ClassesSourceWithContext → [FlowWithContextOps](FlowWithContextOps.html)
55. [**](../../../akka/stream/scaladsl/SourceWithContext.html#via[Out2,Ctx2,Mat2](viaFlow:akka.stream.Graph[akka.stream.FlowShape[(Out,Ctx),(Out2,Ctx2)],Mat2]):SourceWithContext.this.Repr[Out2,Ctx2] "Permalink")  def via\[Out2, Ctx2, Mat2](viaFlow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[(Out, Ctx), (Out2, Ctx2)], Mat2]): [Repr](#Repr[+O,+C]=FlowWithContextOps.this.ReprMat[O,C,Mat@scala.annotation.unchecked.uncheckedVariance])\[Out2, Ctx2]Transform this flow by the regular flow.

Transform this flow by the regular flow. The given flow must support manual context propagation by
taking and producing tuples of (data, context).

 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
 by the downstream elements, such as reordering. For more background on these requirements
 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.

This can be used as an escape hatch for operations that are not (yet) provided with automatic
context propagation here.

Definition ClassesSourceWithContext → [FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOps.via](FlowOps.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):FlowOps.this.Repr[T])
56. [**](../../../akka/stream/scaladsl/SourceWithContext.html#viaMat[Out2,Ctx2,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[(Out,Ctx),(Out2,Ctx2)],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.SourceWithContext[Out2,Ctx2,Mat3] "Permalink")  def viaMat\[Out2, Ctx2, Mat2, Mat3](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[(Out, Ctx), (Out2, Ctx2)], Mat2])(combine: (Mat, Mat2) \=\> Mat3): SourceWithContext\[Out2, Ctx2, Mat3]Transform this flow by the regular flow.

Transform this flow by the regular flow. The given flow must support manual context propagation by
taking and producing tuples of (data, context).

 It is up to the implementer to ensure the inner flow does not exhibit any behaviour that is not expected
 by the downstream elements, such as reordering. For more background on these requirements
 see https://doc.akka.io/libraries/akka\-core/current/stream/stream\-context.html.

This can be used as an escape hatch for operations that are not (yet) provided with automatic
context propagation here.

The `combine` function is used to compose the materialized values of this flow and that
flow into the materialized value of the resulting Flow.

Definition ClassesSourceWithContext → [FlowWithContextOps](FlowWithContextOps.html)See also[akka.stream.scaladsl.FlowOpsMat.viaMat](FlowOpsMat.html#viaMat[T,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2])(combine:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[T,Mat3])
57. [**](../../../akka/stream/scaladsl/SourceWithContext.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
58. [**](../../../akka/stream/scaladsl/SourceWithContext.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
59. [**](../../../akka/stream/scaladsl/SourceWithContext.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
60. [**](../../../akka/stream/scaladsl/SourceWithContext.html#withAttributes(attr:akka.stream.Attributes):akka.stream.scaladsl.SourceWithContext[Out,Ctx,Mat] "Permalink")  def withAttributes(attr: [Attributes](../Attributes.html)): SourceWithContext\[Out, Ctx, Mat]Context\-preserving variant of [akka.stream.scaladsl.Source.withAttributes](Source.html#withAttributes(attr:akka.stream.Attributes):Source.this.Repr[Out]).

Context\-preserving variant of [akka.stream.scaladsl.Source.withAttributes](Source.html#withAttributes(attr:akka.stream.Attributes):Source.this.Repr[Out]).

Definition ClassesSourceWithContext → [Graph](../Graph.html)See also[akka.stream.scaladsl.Source.withAttributes](Source.html#withAttributes(attr:akka.stream.Attributes):Source.this.Repr[Out])
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/scaladsl/SourceWithContext.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(sourceWithContext: GraphMapMatVal[SourceShape[(Out, Ctx)], Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/SourceWithContext.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/SourceWithContext.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toStringFormat\[SourceWithContext\[Out, Ctx, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/SourceWithContext.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (SourceWithContext\[Out, Ctx, Mat], B)ImplicitThis member is added by an implicit conversion from SourceWithContext\[Out, Ctx, Mat] toArrowAssoc\[SourceWithContext\[Out, Ctx, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [FlowWithContextOps](FlowWithContextOps.html)\[Out, Ctx, Mat]

### Inherited from GraphDelegate\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]

### Inherited from [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromSourceWithContext\[Out, Ctx, Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[SourceShape](../SourceShape.html)\[(Out, Ctx)], Mat]

### Inherited by implicit conversion any2stringadd fromSourceWithContext\[Out, Ctx, Mat] to any2stringadd\[SourceWithContext\[Out, Ctx, Mat]]

### Inherited by implicit conversion StringFormat fromSourceWithContext\[Out, Ctx, Mat] to StringFormat\[SourceWithContext\[Out, Ctx, Mat]]

### Inherited by implicit conversion Ensuring fromSourceWithContext\[Out, Ctx, Mat] to Ensuring\[SourceWithContext\[Out, Ctx, Mat]]

### Inherited by implicit conversion ArrowAssoc fromSourceWithContext\[Out, Ctx, Mat] to ArrowAssoc\[SourceWithContext\[Out, Ctx, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/SystemMaterializer.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/ThrottleMode.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/javadsl/SourceWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/BidiFlow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Concat$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/DelayStrategy$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowOpsMat.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/FlowWithContextOps.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Framing$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/GraphApply.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/GraphDSL$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Interleave$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Interleave.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/JavaFlowSupport$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/JsonFraming$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Keep$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Merge$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Merge.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeHub$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeLatest$.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/MergeLatest.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/SourceWithContext.html)*