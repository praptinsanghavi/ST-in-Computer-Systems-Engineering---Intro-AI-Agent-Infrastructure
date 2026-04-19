---
description: Akka 2.10.17 - akka.stream.scaladsl.Sink
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:49:25Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/Sink.html
title: Akka 2.10.17 - akka.stream.scaladsl.Sink
---

# Akka 2.10.17 - akka.stream.scaladsl.Sink

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.Sink

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

The termination point of a flow is called Sink and can for example be a `Future` or
org.reactivestreams.Subscriber. A flow with an attached output and open input
is also a Sink.

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
- Sink
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
[c](Sink$.html "See companion object")[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# [Sink](Sink$.html "See companion object")[**](../../../akka/stream/scaladsl/Sink.html "Permalink")

### Companion [object Sink](Sink$.html "See companion object")

#### final  class Sink\[\-In, \+Mat] extends [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat]

A `Sink` is a set of stream processing steps that has one open input.
Can be used as a `Subscriber`

Source[Sink.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Sink.scala#L37)Linear Supertypes[Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Sink
2. Graph
3. AnyRef
4. Any
Implicitly  
1. by GraphMapMatVal
2. by SinkToCompletionStage
3. by any2stringadd
4. by StringFormat
5. by Ensuring
6. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/scaladsl/Sink.html#<init>(traversalBuilder:akka.stream.impl.LinearTraversalBuilder,shape:akka.stream.SinkShape[In]):akka.stream.scaladsl.Sink[In,Mat] "Permalink")  new Sink(traversalBuilder: LinearTraversalBuilder, shape: [SinkShape](../SinkShape.html)\[In])
### Type Members

1. [**](../../../akka/stream/scaladsl/Sink.html#Shape=S@scala.annotation.unchecked.uncheckedVariance "Permalink")  type Shape \= [SinkShape](../SinkShape.html)\[In]Type\-level accessor for the shape parameter of this graph.

Type\-level accessor for the shape parameter of this graph.

Definition Classes[Graph](../Graph.html)
### Value Members

1. [**](../../../akka/stream/scaladsl/Sink.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/Sink.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/Sink.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toany2stringadd\[Sink\[In, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/Sink.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Sink\[In, Mat], B)ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toArrowAssoc\[Sink\[In, Mat]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if Mat is a subclass of Future\[Nothing] (Mat \<: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]).Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/Sink.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/scaladsl/Sink.html#addAttributes(attr:akka.stream.Attributes):akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def addAttributes(attr: [Attributes](../Attributes.html)): Sink\[In, Mat]Add the given attributes to this Sink.

Add the given attributes to this Sink. If the specific attribute was already present
on this graph this means the added attribute will be more specific than the existing one.
If this Sink is a composite of multiple graphs, new attributes on the composite will be
less specific than attributes set directly on the individual graphs of the composite.

Definition ClassesSink → [Graph](../Graph.html)
7. [**](../../../akka/stream/scaladsl/Sink.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/stream/scaladsl/Sink.html#asJava[JIn<:In]:akka.stream.javadsl.Sink[JIn,Mat@scala.annotation.unchecked.uncheckedVariance] "Permalink")  def asJava\[JIn \<: In]: [javadsl.Sink](../javadsl/Sink.html)\[JIn, Mat]Converts this Scala DSL element to it's Java DSL counterpart.
9. [**](../../../akka/stream/scaladsl/Sink.html#async(dispatcher:String,inputBufferSize:Int):akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def async(dispatcher: String, inputBufferSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): Sink\[In, Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

inputBufferSizeSet the input buffer to this size for the graph

Definition ClassesSink → [Graph](../Graph.html)
10. [**](../../../akka/stream/scaladsl/Sink.html#async(dispatcher:String):akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def async(dispatcher: String): Sink\[In, Mat]Put an asynchronous boundary around this `Graph`

Put an asynchronous boundary around this `Graph`

dispatcherRun the graph on this dispatcher

Definition ClassesSink → [Graph](../Graph.html)
11. [**](../../../akka/stream/scaladsl/Sink.html#async:akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def async: Sink\[In, Mat]Put an asynchronous boundary around this `Source`

Put an asynchronous boundary around this `Source`

Definition ClassesSink → [Graph](../Graph.html)
12. [**](../../../akka/stream/scaladsl/Sink.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
13. [**](../../../akka/stream/scaladsl/Sink.html#contramap[In2](f:In2=>In):akka.stream.scaladsl.Sink[In2,Mat] "Permalink")  def contramap\[In2](f: (In2) \=\> In): Sink\[In2, Mat]Transform this Sink by applying a function to each \*incoming\* upstream element before
it is passed to the Sink

Transform this Sink by applying a function to each \*incoming\* upstream element before
it is passed to the Sink

**Backpressures when** original Sink backpressures

**Cancels when** original Sink cancels
14. [**](../../../akka/stream/scaladsl/Sink.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Sink\[In, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/scaladsl/Sink.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Sink\[In, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/scaladsl/Sink.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/scaladsl/Sink.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): Sink\[In, Mat]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toEnsuring\[Sink\[In, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/scaladsl/Sink.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/stream/scaladsl/Sink.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/stream/scaladsl/Sink.html#getAttributes:akka.stream.Attributes "Permalink")  def getAttributes: [Attributes](../Attributes.html)Definition ClassesSink → [Graph](../Graph.html)
21. [**](../../../akka/stream/scaladsl/Sink.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/scaladsl/Sink.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/scaladsl/Sink.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/stream/scaladsl/Sink.html#mapMaterializedValue[Mat2](f:Mat=>Mat2):akka.stream.scaladsl.Sink[In,Mat2] "Permalink")  def mapMaterializedValue\[Mat2](f: (Mat) \=\> Mat2): Sink\[In, Mat2]Transform only the materialized value of this Sink, leaving all other properties as they were.
25. [**](../../../akka/stream/scaladsl/Sink.html#named(name:String):akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def named(name: String): Sink\[In, Mat]Add a `name` attribute to this Sink.

Add a `name` attribute to this Sink.

Definition ClassesSink → [Graph](../Graph.html)
26. [**](../../../akka/stream/scaladsl/Sink.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
27. [**](../../../akka/stream/scaladsl/Sink.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/stream/scaladsl/Sink.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/stream/scaladsl/Sink.html#preMaterialize()(implicitmaterializer:akka.stream.Materializer):(Mat,akka.stream.scaladsl.Sink[In,akka.NotUsed]) "Permalink")  def preMaterialize()(implicit materializer: [Materializer](../Materializer.html)): (Mat, Sink\[In, [NotUsed](../../NotUsed.html)])Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
that can be consume elements 'into' the pre\-materialized one.

Materializes this Sink, immediately returning (1\) its materialized value, and (2\) a new Sink
that can be consume elements 'into' the pre\-materialized one.

Useful for when you need a materialized value of a Sink when handing it out to someone to materialize it for you.

Note that `preMaterialize` is implemented through a reactive streams `Subscriber` which means that a buffer is introduced
and that errors are not propagated upstream but are turned into cancellations without error details.
30. [**](../../../akka/stream/scaladsl/Sink.html#runWith[Mat2](source:akka.stream.Graph[akka.stream.SourceShape[In],Mat2])(implicitmaterializer:akka.stream.Materializer):Mat2 "Permalink")  def runWith\[Mat2](source: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[In], Mat2])(implicit materializer: [Materializer](../Materializer.html)): Mat2Connect this `Sink` to a `Source` and run it.

Connect this `Sink` to a `Source` and run it. The returned value is the materialized value
of the `Source`, e.g. the `Subscriber` of a Source\#subscriber.

Note that the `ActorSystem` can be used as the implicit `materializer` parameter to use the
[akka.stream.SystemMaterializer](../SystemMaterializer.html) for running the stream.
31. [**](../../../akka/stream/scaladsl/Sink.html#shape:akka.stream.SinkShape[In] "Permalink")  val shape: [SinkShape](../SinkShape.html)\[In]The shape of a graph is all that is externally visible: its inlets and outlets.

The shape of a graph is all that is externally visible: its inlets and outlets.

Definition ClassesSink → [Graph](../Graph.html)
32. [**](../../../akka/stream/scaladsl/Sink.html#sink:akka.stream.scaladsl.Sink[In,scala.concurrent.Future[T]] "Permalink")  val sink: Sink\[In, [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] to[SinkToCompletionStage](package$$SinkToCompletionStage.html)\[In, T] performed by method SinkToCompletionStage in [akka.stream.scaladsl](index.html).This conversion will take place only if Mat is a subclass of Future\[T] (Mat \<: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]).Definition Classes[SinkToCompletionStage](package$$SinkToCompletionStage.html)
33. [**](../../../akka/stream/scaladsl/Sink.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../akka/stream/scaladsl/Sink.html#toCompletionStage():akka.stream.scaladsl.Sink[In,java.util.concurrent.CompletionStage[T]] "Permalink")  def toCompletionStage(): Sink\[In, [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[T]]ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] to[SinkToCompletionStage](package$$SinkToCompletionStage.html)\[In, T] performed by method SinkToCompletionStage in [akka.stream.scaladsl](index.html).This conversion will take place only if Mat is a subclass of Future\[T] (Mat \<: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]).Definition Classes[SinkToCompletionStage](package$$SinkToCompletionStage.html)
35. [**](../../../akka/stream/scaladsl/Sink.html#toString():String "Permalink")  def toString(): StringDefinition ClassesSink → AnyRef → Any
36. [**](../../../akka/stream/scaladsl/Sink.html#traversalBuilder:akka.stream.impl.LinearTraversalBuilder "Permalink")  val traversalBuilder: LinearTraversalBuilderINTERNAL API.

INTERNAL API.

Every materializable element must be backed by a stream layout module

Definition ClassesSink → [Graph](../Graph.html)
37. [**](../../../akka/stream/scaladsl/Sink.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
38. [**](../../../akka/stream/scaladsl/Sink.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
39. [**](../../../akka/stream/scaladsl/Sink.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
40. [**](../../../akka/stream/scaladsl/Sink.html#withAttributes(attr:akka.stream.Attributes):akka.stream.scaladsl.Sink[In,Mat] "Permalink")  def withAttributes(attr: [Attributes](../Attributes.html)): Sink\[In, Mat]Replace the attributes of this Sink with the given ones.

Replace the attributes of this Sink with the given ones. If this Sink is a composite
of multiple graphs, new attributes on the composite will be less specific than attributes
set directly on the individual graphs of the composite.

Definition ClassesSink → [Graph](../Graph.html)
### Shadowed Implicit Value Members

1. [**](../../../akka/stream/scaladsl/Sink.html#mapMaterializedValue[M2](f:M=>M2):akka.stream.Graph[S,M2] "Permalink")  def mapMaterializedValue\[M2](f: (Mat) \=\> M2): [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], M2]Transform the materialized value of this Graph, leaving all other properties as they were.

Transform the materialized value of this Graph, leaving all other properties as they were.

ffunction to map the graph's materialized value

ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] to[GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[SinkShape](../SinkShape.html)\[In], Mat] performed by method GraphMapMatVal in [akka.stream.Graph](../Graph$.html).ShadowingThis implicitly inherited member is shadowed by one or more members in this class.  
To access this member you can use a [type ascription](https://stackoverflow.com/questions/2087250/what-is-the-purpose-of-type-ascription-in-scala):  

```
(sink: GraphMapMatVal[SinkShape[In], Mat]).mapMaterializedValue(f)
```
Definition Classes[GraphMapMatVal](../Graph$$GraphMapMatVal.html)
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/Sink.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/Sink.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toStringFormat\[Sink\[In, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/Sink.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Sink\[In, Mat], B)ImplicitThis member is added by an implicit conversion from Sink\[In, Mat] toArrowAssoc\[Sink\[In, Mat]] performed by method ArrowAssoc in scala.Predef.This conversion will take place only if Mat is a subclass of Future\[Nothing] (Mat \<: [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Nothing](https://www.scala-lang.org/api/2.13.17/scala/Nothing.html#scala.Nothing)]).Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[In], Mat]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion GraphMapMatVal fromSink\[In, Mat] to [GraphMapMatVal](../Graph$$GraphMapMatVal.html)\[[SinkShape](../SinkShape.html)\[In], Mat]

### Inherited by implicit conversion SinkToCompletionStage fromSink\[In, Mat] to [SinkToCompletionStage](package$$SinkToCompletionStage.html)\[In, T]

### Inherited by implicit conversion any2stringadd fromSink\[In, Mat] to any2stringadd\[Sink\[In, Mat]]

### Inherited by implicit conversion StringFormat fromSink\[In, Mat] to StringFormat\[Sink\[In, Mat]]

### Inherited by implicit conversion Ensuring fromSink\[In, Mat] to Ensuring\[Sink\[In, Mat]]

### Inherited by implicit conversion ArrowAssoc fromSink\[In, Mat] to ArrowAssoc\[Sink\[In, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/NotUsed.html
- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/stream/Attributes.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph$$GraphMapMatVal.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph$.html
- https://doc.akka.io/api/akka/current/akka/stream/Graph.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka/current/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka/current/akka/stream/SystemMaterializer.html
- https://doc.akka.io/api/akka/current/akka/stream/index.html
- https://doc.akka.io/api/akka/current/akka/stream/javadsl/Sink.html
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

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Sink.html)*