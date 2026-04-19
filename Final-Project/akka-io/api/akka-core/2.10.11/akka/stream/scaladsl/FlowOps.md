---
description: Akka 2.10.11 - akka.stream.scaladsl.FlowOps
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:21:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/FlowOps.html
title: Akka 2.10.11 - akka.stream.scaladsl.FlowOps
---

# Akka 2.10.11 - akka.stream.scaladsl.FlowOps

> **Summary:** Akka 2.10.11 - akka.stream.scaladsl.FlowOps

## Content

Akka2\.10\.11 \< Back****# Packages

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
defined in FlowOps. Each DSL element produces a new flow that can be further transformed,
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
- FlowOps
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
t[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# FlowOps[**](../../../akka/stream/scaladsl/FlowOps.html "Permalink")

### 

#### trait FlowOps\[\+Out, \+Mat] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Scala API: Operations offered by Sources and Flows with a free output side: the DSL flows left\-to\-right only.

INTERNAL API: this trait will be changed in binary\-incompatible ways for classes that are derived from it!
Do not implement this interface outside the Akka code base!

Binary compatibility is only maintained for callers of this trait’s interface.

Annotations@[DoNotInherit](../../annotation/DoNotInherit.html)() Source[Flow.scala](https://github.com/akka/akka-core/tree/v2.10.11/akka-stream/src/main/scala/akka/stream/scaladsl/Flow.scala#L822)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[Flow](Flow.html), [FlowOpsMat](FlowOpsMat.html), [PortOps](GraphDSL$$Implicits$$PortOps.html), [Source](Source.html), [SubFlow](SubFlow.html)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. FlowOps
2. AnyRef
3. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/stream/scaladsl/FlowOps.html#Closed "Permalink") abstract  type Closed
2. [**](../../../akka/stream/scaladsl/FlowOps.html#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed} "Permalink") abstract  type Repr\[\+O] \<: FlowOps\[O, Mat] { ... /\* 2 definitions in type refinement \*/ }
### Abstract Value Members

1. [**](../../../akka/stream/scaladsl/FlowOps.html#addAttributes(attr:akka.stream.Attributes):FlowOps.this.Repr[Out] "Permalink") abstract  def addAttributes(attr: [Attributes](../Attributes.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]
2. [**](../../../akka/stream/scaladsl/FlowOps.html#async:FlowOps.this.Repr[Out] "Permalink") abstract  def async: [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Put an asynchronous boundary around this `Flow`.

Put an asynchronous boundary around this `Flow`.

If this is a `SubFlow` (created e.g. by `groupBy`), this creates an
asynchronous boundary around each materialized sub\-flow, not the
super\-flow. That way, the super\-flow will communicate with sub\-flows
asynchronously.
3. [**](../../../akka/stream/scaladsl/FlowOps.html#named(name:String):FlowOps.this.Repr[Out] "Permalink") abstract  def named(name: String): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]
4. [**](../../../akka/stream/scaladsl/FlowOps.html#to[Mat2](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2]):FlowOps.this.Closed "Permalink") abstract  def to\[Mat2](sink: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], Mat2]): [Closed](#Closed)Connect this [Flow](Flow.html) to a [Sink](Sink.html), concatenating the processing steps of both.

Connect this [Flow](Flow.html) to a [Sink](Sink.html), concatenating the processing steps of both.

```
    +------------------------------+
    | Resulting Sink[In, Mat]      |
    |                              |
    |  +------+          +------+  |
    |  |      |          |      |  |
In ~~> | flow | ~~Out~~> | sink |  |
    |  |   Mat|          |     M|  |
    |  +------+          +------+  |
    +------------------------------+
```
The materialized value of the combined [Sink](Sink.html) will be the materialized
value of the current flow (ignoring the given Sink’s value), use
[toMat](Flow.html#toMat[Mat2,Mat3](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.Sink[In,Mat3]) if a different strategy is needed.

See also [FlowOpsMat.toMat](FlowOpsMat.html#toMat[Mat2,Mat3](sink:akka.stream.Graph[akka.stream.SinkShape[Out],Mat2])(combine:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ClosedMat[Mat3]) when access to materialized values of the parameter is needed.
5. [**](../../../akka/stream/scaladsl/FlowOps.html#via[T,Mat2](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2]):FlowOps.this.Repr[T] "Permalink") abstract  def via\[T, Mat2](flow: [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, T], Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this [Flow](Flow.html) by appending the given processing steps.

Transform this [Flow](Flow.html) by appending the given processing steps.

```
    +---------------------------------+
    | Resulting Flow[In, T, Mat]  |
    |                                 |
    |  +------+             +------+  |
    |  |      |             |      |  |
In ~~> | this |  ~~Out~~>   | flow | ~~> T
    |  |   Mat|             |     M|  |
    |  +------+             +------+  |
    +---------------------------------+
```
The materialized value of the combined [Flow](Flow.html) will be the materialized
value of the current flow (ignoring the other Flow’s value), use
[viaMat](Flow.html#viaMat[T,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2])(combine:(Mat,Mat2)=>Mat3):akka.stream.scaladsl.Flow[In,T,Mat3]) if a different strategy is needed.

See also [FlowOpsMat.viaMat](FlowOpsMat.html#viaMat[T,Mat2,Mat3](flow:akka.stream.Graph[akka.stream.FlowShape[Out,T],Mat2])(combine:(Mat,Mat2)=>Mat3):FlowOpsMat.this.ReprMat[T,Mat3]) when access to materialized values of the parameter is needed.
6. [**](../../../akka/stream/scaladsl/FlowOps.html#withAttributes(attr:akka.stream.Attributes):FlowOps.this.Repr[Out] "Permalink") abstract  def withAttributes(attr: [Attributes](../Attributes.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]
### Concrete Value Members

1. [**](../../../akka/stream/scaladsl/FlowOps.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/FlowOps.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/FlowOps.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toany2stringadd\[FlowOps\[Out, Mat]] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/FlowOps.html#++[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M]):FlowOps.this.Repr[U] "Permalink")  def \+\+\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Concatenates this [Flow](Flow.html) with the given [Source](Source.html) so the first element
emitted by that source is emitted after the last element of this
flow.

Concatenates this [Flow](Flow.html) with the given [Source](Source.html) so the first element
emitted by that source is emitted after the last element of this
flow.

This is a shorthand for [concat](#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])
5. [**](../../../akka/stream/scaladsl/FlowOps.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (FlowOps\[Out, Mat], B)ImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toArrowAssoc\[FlowOps\[Out, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
6. [**](../../../akka/stream/scaladsl/FlowOps.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
7. [**](../../../akka/stream/scaladsl/FlowOps.html#aggregateWithBoundary[Agg,Emit](allocate:()=>Agg)(aggregate:(Agg,Out)=>(Agg,Boolean),harvest:Agg=>Emit,emitOnTimer:Option[(Agg=>Boolean,scala.concurrent.duration.FiniteDuration)]):FlowOps.this.Repr[Emit] "Permalink")  def aggregateWithBoundary\[Agg, Emit](allocate: () \=\> Agg)(aggregate: (Agg, Out) \=\> (Agg, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)), harvest: (Agg) \=\> Emit, emitOnTimer: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[((Agg) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Emit]Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
when custom condition is met which can be triggered by aggregate or timer.

Aggregate input elements into an arbitrary data structure that can be completed and emitted downstream
when custom condition is met which can be triggered by aggregate or timer.
It can be thought of a more general [groupedWeightedWithin](#groupedWeightedWithin(maxWeight:Long,maxNumber:Int,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]]).

**Emits when** the aggregation function decides the aggregate is complete or the timer function returns true

**Backpressures when** downstream backpressures and the aggregate is complete

**Completes when** upstream completes and the last aggregate has been emitted downstream

**Cancels when** downstream cancels

allocateallocate the initial data structure for aggregated elements

aggregateupdate the aggregated elements, return true if ready to emit after update.

harvestthis is invoked before emit within the current stage/operator

emitOnTimerdecide whether the current aggregated elements can be emitted, the custom function is invoked on every interval

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
8. [**](../../../akka/stream/scaladsl/FlowOps.html#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out] "Permalink")  def alsoTo(that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Attaches the given [Sink](Sink.html) to this [Source](Source.html), meaning that elements that pass
through will also be sent to the [Sink](Sink.html).

Attaches the given [Sink](Sink.html) to this [Source](Source.html), meaning that elements that pass
through will also be sent to the [Sink](Sink.html).

It is similar to [\#wireTap](#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) but will backpressure instead of dropping elements when the given [Sink](Sink.html) is not ready.

**Emits when** element is available and demand exists both from the Sink and the downstream.

**Backpressures when** downstream or Sink backpressures

**Completes when** upstream completes

**Cancels when** downstream or Sink cancels
9. [**](../../../akka/stream/scaladsl/FlowOps.html#alsoToAll(those:akka.stream.Graph[akka.stream.SinkShape[Out],_]*):FlowOps.this.Repr[Out] "Permalink")  def alsoToAll(those: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]\*): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Attaches the given [Sink](Sink.html)s to this [Source](Source.html), meaning that elements that pass
through will also be sent to the [Sink](Sink.html).

Attaches the given [Sink](Sink.html)s to this [Source](Source.html), meaning that elements that pass
through will also be sent to the [Sink](Sink.html).

It is similar to [\#wireTap](#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) but will backpressure instead of dropping elements when the given [Sink](Sink.html)s is not ready.

**Emits when** element is available and demand exists both from the Sinks and the downstream.

**Backpressures when** downstream or any of the [Sink](Sink.html)s backpressures

**Completes when** upstream completes

**Cancels when** downstream or any of the [Sink](Sink.html)s cancels
10. [**](../../../akka/stream/scaladsl/FlowOps.html#alsoToGraph[M](that:akka.stream.Graph[akka.stream.SinkShape[Out],M]):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out],M] "Permalink")  def alsoToGraph\[M](that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M]): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out], M]Attributesprotected
11. [**](../../../akka/stream/scaladsl/FlowOps.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
12. [**](../../../akka/stream/scaladsl/FlowOps.html#ask[S](parallelism:Int)(ref:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout,implicittag:scala.reflect.ClassTag[S]):FlowOps.this.Repr[S] "Permalink")  def ask\[S](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(ref: [ActorRef](../../actor/ActorRef.html))(implicit timeout: [Timeout](../../util/Timeout.html), tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[S]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [akka.pattern.AskTimeoutException](../../pattern/AskTimeoutException.html).

Do not forget to include the expected response type in the method call, like so:

```
flow.ask[ExpectedReply](parallelism = 4)(ref)
```
otherwise `Nothing` will be assumed, which is most likely not what you want.

Parallelism limits the number of how many asks can be "in flight" at the same time.
Please note that the elements emitted by this operator are in\-order with regards to the asks being issued
(i.e. same behaviour as mapAsync).

The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated,
or with an [java.util.concurrent.TimeoutException](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/TimeoutException.html) in case the ask exceeds the timeout passed in.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the futures (in submission order) created by the ask pattern internally are completed

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels

Annotations@implicitNotFound()
13. [**](../../../akka/stream/scaladsl/FlowOps.html#ask[S](ref:akka.actor.ActorRef)(implicittimeout:akka.util.Timeout,implicittag:scala.reflect.ClassTag[S]):FlowOps.this.Repr[S] "Permalink")  def ask\[S](ref: [ActorRef](../../actor/ActorRef.html))(implicit timeout: [Timeout](../../util/Timeout.html), tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[S]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[S]Use the `ask` pattern to send a request\-reply message to the target `ref` actor.

Use the `ask` pattern to send a request\-reply message to the target `ref` actor.
If any of the asks times out it will fail the stream with a [akka.pattern.AskTimeoutException](../../pattern/AskTimeoutException.html).

Do not forget to include the expected response type in the method call, like so:

```
flow.ask[ExpectedReply](ref)
```
otherwise `Nothing` will be assumed, which is most likely not what you want.

Defaults to parallelism of 2 messages in flight, since while one ask message may be being worked on, the second one
still be in the mailbox, so defaulting to sending the second one a bit earlier than when first ask has replied maintains
a slightly healthier throughput.

Similar to the plain ask pattern, the target actor is allowed to reply with `akka.util.Status`.
An `akka.util.Status#Failure` will cause the operator to fail with the cause carried in the `Failure` message.

The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the futures (in submission order) created by the ask pattern internally are completed

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Fails when** the passed in actor terminates, or a timeout is exceeded in any of the asks performed

**Cancels when** downstream cancels

Annotations@implicitNotFound()
14. [**](../../../akka/stream/scaladsl/FlowOps.html#backpressureTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def backpressureTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
the stream is failed with a [akka.stream.BackpressureTimeoutException](../BackpressureTimeoutException.html).

If the time between the emission of an element and the following downstream demand exceeds the provided timeout,
the stream is failed with a [akka.stream.BackpressureTimeoutException](../BackpressureTimeoutException.html). The timeout is checked periodically,
so the resolution of the check is one period (equals to timeout value).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses between element emission and downstream demand.

**Cancels when** downstream cancels
15. [**](../../../akka/stream/scaladsl/FlowOps.html#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "Permalink")  def batch\[S](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seed: (Out) \=\> S)(aggregate: (S, Out) \=\> S): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[S]Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them. For example a batch step might store received elements in
an array up to the allowed max limit if the upstream publisher is faster.

This only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is an aggregated element available

**Backpressures when** there are `max` batched elements and 1 pending element and downstream backpressures

**Completes when** upstream completes and there is no batched/pending element waiting

**Cancels when** downstream cancels

See also [FlowOps.conflateWithSeed](#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]), [FlowOps.batchWeighted](#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])

maxmaximum number of elements to batch before backpressuring upstream (must be positive non\-zero)

seedProvides the first state for a batched value using the first unconsumed element as a start

aggregateTakes the currently batched value and the current pending element to produce a new aggregate
16. [**](../../../akka/stream/scaladsl/FlowOps.html#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "Permalink")  def batchWeighted\[S](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), costFn: (Out) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), seed: (Out) \=\> S)(aggregate: (S, Out) \=\> S): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[S]Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by aggregating elements into batches
until the subscriber is ready to accept them. For example a batch step might concatenate `ByteString`
elements up to the allowed max limit if the upstream publisher is faster.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Batching will apply for all elements, even if a single element cost is greater than the total allowed limit.
In this case, previous batched elements will be emitted, then the "heavy" element will be emitted (after
being applied with the `seed` function) without batching further elements with it, and then the rest of the
incoming elements are batched.

**Emits when** downstream stops backpressuring and there is a batched element available

**Backpressures when** there are `max` weighted batched elements \+ 1 pending element and downstream backpressures

**Completes when** upstream completes and there is no batched/pending element waiting

**Cancels when** downstream cancels

See also [FlowOps.conflateWithSeed](#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]), [FlowOps.batch](#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])

maxmaximum weight of elements to batch before backpressuring upstream (must be positive non\-zero)

costFna function to compute a single element weight

seedProvides the first state for a batched value using the first unconsumed element as a start

aggregateTakes the currently batched value and the current pending element to produce a new batch
17. [**](../../../akka/stream/scaladsl/FlowOps.html#buffer(size:Int,overflowStrategy:akka.stream.OverflowStrategy):FlowOps.this.Repr[Out] "Permalink")  def buffer(size: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), overflowStrategy: [OverflowStrategy](../OverflowStrategy.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.

Adds a fixed size buffer in the flow that allows to store elements from a faster upstream until it becomes full.
Depending on the defined [akka.stream.OverflowStrategy](../OverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available

**Emits when** downstream stops backpressuring and there is a pending element in the buffer

**Backpressures when** downstream backpressures or depending on OverflowStrategy:

	- Backpressure \- backpressures when buffer is full
	- DropHead, DropTail, DropBuffer \- never backpressures
	- Fail \- fails the stream if buffer gets full**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

sizeThe size of the buffer in element count

overflowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
18. [**](../../../akka/stream/scaladsl/FlowOps.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/scaladsl/FlowOps.html#collect[T](pf:PartialFunction[Out,T]):FlowOps.this.Repr[T] "Permalink")  def collect\[T](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Out, T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this stream by applying the given partial function to each of the elements
on which the function is defined as they pass through this processing step.

Transform this stream by applying the given partial function to each of the elements
on which the function is defined as they pass through this processing step.
Non\-matching elements are filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the provided partial function is defined for the element

**Backpressures when** the partial function is defined for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
20. [**](../../../akka/stream/scaladsl/FlowOps.html#collectType[T](implicittag:scala.reflect.ClassTag[T]):FlowOps.this.Repr[T] "Permalink")  def collectType\[T](implicit tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this stream by testing the type of each of the elements
on which the element is an instance of the provided type as they pass through this processing step.

Transform this stream by testing the type of each of the elements
on which the element is an instance of the provided type as they pass through this processing step.

Non\-matching elements are filtered out.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the element is an instance of the provided type

**Backpressures when** the element is an instance of the provided type and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
21. [**](../../../akka/stream/scaladsl/FlowOps.html#completionTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def completionTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]If the completion of the stream does not happen until the provided timeout, the stream is failed
with a [akka.stream.CompletionTimeoutException](../CompletionTimeoutException.html).

If the completion of the stream does not happen until the provided timeout, the stream is failed
with a [akka.stream.CompletionTimeoutException](../CompletionTimeoutException.html).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses before upstream completes

**Cancels when** downstream cancels
22. [**](../../../akka/stream/scaladsl/FlowOps.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def concat\[U \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Concatenate the given [Source](Source.html) to this [Flow](Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html) to this [Flow](Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html) is materialized together with this Flow and is "detached" meaning it will
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

When needing a concat operator that is not detached use [\#concatLazy](#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If this [Flow](Flow.html) gets upstream error \- no elements from the given [Source](Source.html) will be pulled.

**Emits when** element is available from current stream or from the given [Source](Source.html) when current is completed

**Backpressures when** downstream backpressures

**Completes when** given [Source](Source.html) completes

**Cancels when** downstream cancels
23. [**](../../../akka/stream/scaladsl/FlowOps.html#concatAllLazy[U>:Out](those:akka.stream.Graph[akka.stream.SourceShape[U],_]*):FlowOps.this.Repr[U] "Permalink")  def concatAllLazy\[U \>: Out](those: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_]\*): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Concatenate the given [Source](Source.html)s to this [Flow](Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the [Source](Source.html)s' elements will be produced.

Concatenate the given [Source](Source.html)s to this [Flow](Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the [Source](Source.html)s' elements will be produced.

Note that the [Source](Source.html)s are materialized together with this Flow. If `lazy` materialization is what is needed
the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
time when this source completes.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concat](#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If this [Flow](Flow.html) gets upstream error \- no elements from the given [Source](Source.html)s will be pulled.

**Emits when** element is available from current stream or from the given [Source](Source.html)s when current is completed

**Backpressures when** downstream backpressures

**Completes when** given all those [Source](Source.html)s completes

**Cancels when** downstream cancels
24. [**](../../../akka/stream/scaladsl/FlowOps.html#concatGraph[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],detached:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],Mat2] "Permalink")  def concatGraph\[U \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2], detached: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], Mat2]Attributesprotected
25. [**](../../../akka/stream/scaladsl/FlowOps.html#concatLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def concatLazy\[U \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Concatenate the given [Source](Source.html) to this [Flow](Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Concatenate the given [Source](Source.html) to this [Flow](Flow.html), meaning that once this
Flow’s input is exhausted and all result elements have been generated,
the Source’s elements will be produced.

Note that the [Source](Source.html) is materialized together with this Flow. If `lazy` materialization is what is needed
the operator can be combined with for example `Source.lazySource` to defer materialization of `that` until the
time when this source completes.

The second source is then kept from producing elements by asserting back\-pressure until its time comes.

For a concat operator that is detached, use [\#concat](#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If this [Flow](Flow.html) gets upstream error \- no elements from the given [Source](Source.html) will be pulled.

**Emits when** element is available from current stream or from the given [Source](Source.html) when current is completed

**Backpressures when** downstream backpressures

**Completes when** given [Source](Source.html) completes

**Cancels when** downstream cancels
26. [**](../../../akka/stream/scaladsl/FlowOps.html#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2] "Permalink")  def conflate\[O2 \>: Out](aggregate: (O2, O2) \=\> O2): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[O2]Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
upstream publisher is faster.

This version of conflate does not change the output type of the stream. See [FlowOps.conflateWithSeed](#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]) for a
more flexible version that can take a seed function and transform elements while rolling up.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is a conflated element available

**Backpressures when** never

**Completes when** upstream completes

**Cancels when** downstream cancels

aggregateTakes the currently aggregated value and the current pending element to produce a new aggregate
See also [FlowOps.conflate](#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2]), [FlowOps.limit](#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out]) [FlowOps.batch](#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]) [FlowOps.batchWeighted](#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])
27. [**](../../../akka/stream/scaladsl/FlowOps.html#conflateWithSeed[S](seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S] "Permalink")  def conflateWithSeed\[S](seed: (Out) \=\> S)(aggregate: (S, Out) \=\> S): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[S]Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them.

Allows a faster upstream to progress independently of a slower subscriber by conflating elements into a summary
until the subscriber is ready to accept them. For example a conflate step might average incoming numbers if the
upstream publisher is faster.

This version of conflate allows to derive a seed from the first element and change the aggregated type to be
different than the input type. See [FlowOps.conflate](#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2]) for a simpler version that does not change types.

This element only rolls up elements if the upstream is faster, but if the downstream is faster it will not
duplicate elements.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** downstream stops backpressuring and there is a conflated element available

**Backpressures when** never

**Completes when** upstream completes

**Cancels when** downstream cancels

seedProvides the first state for a conflated value using the first unconsumed element as a start

aggregateTakes the currently aggregated value and the current pending element to produce a new aggregate
See also [FlowOps.conflate](#conflate[O2>:Out](aggregate:(O2,O2)=>O2):FlowOps.this.Repr[O2]), [FlowOps.limit](#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out]) [FlowOps.batch](#batch[S](max:Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S]) [FlowOps.batchWeighted](#batchWeighted[S](max:Long,costFn:Out=>Long,seed:Out=>S)(aggregate:(S,Out)=>S):FlowOps.this.Repr[S])
28. [**](../../../akka/stream/scaladsl/FlowOps.html#delay(of:scala.concurrent.duration.FiniteDuration,strategy:akka.stream.DelayOverflowStrategy):FlowOps.this.Repr[Out] "Permalink")  def delay(of: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), strategy: [DelayOverflowStrategy](../DelayOverflowStrategy.html) \= [DelayOverflowStrategy.dropTail](../../index.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Shifts elements emission in time by a specified amount.

Shifts elements emission in time by a specified amount. It allows to store elements
in internal buffer while waiting for next element to be emitted. Depending on the defined
[akka.stream.DelayOverflowStrategy](../DelayOverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available in the buffer.

Delay precision is 10ms to avoid unnecessary timer scheduling cycles

Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`

**Emits when** there is a pending element in the buffer and configured time for this element elapsed
 \* EmitEarly \- strategy do not wait to emit element if buffer is full

**Backpressures when** depending on OverflowStrategy
 \* Backpressure \- backpressures when buffer is full
 \* DropHead, DropTail, DropBuffer \- never backpressures
 \* Fail \- fails the stream if buffer gets full

**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

oftime to shift all messages

strategyStrategy that is used when incoming elements cannot fit inside the buffer
29. [**](../../../akka/stream/scaladsl/FlowOps.html#delayWith(delayStrategySupplier:()=>akka.stream.scaladsl.DelayStrategy[Out],overFlowStrategy:akka.stream.DelayOverflowStrategy):FlowOps.this.Repr[Out] "Permalink")  def delayWith(delayStrategySupplier: () \=\> [DelayStrategy](DelayStrategy.html)\[Out], overFlowStrategy: [DelayOverflowStrategy](../DelayOverflowStrategy.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.

Shifts elements emission in time by an amount individually determined through delay strategy a specified amount.
It allows to store elements in internal buffer while waiting for next element to be emitted. Depending on the defined
[akka.stream.DelayOverflowStrategy](../DelayOverflowStrategy.html) it might drop elements or backpressure the upstream if
there is no space available in the buffer.

It determines delay for each ongoing element invoking `DelayStrategy.nextDelay(elem: T): FiniteDuration`.

Note that elements are not re\-ordered: if an element is given a delay much shorter than its predecessor,
it will still have to wait for the preceding element before being emitted.
It is also important to notice that [scaladsl.DelayStrategy](DelayStrategy.html) can be stateful.

Delay precision is 10ms to avoid unnecessary timer scheduling cycles.

Internal buffer has default capacity 16\. You can set buffer size by calling `addAttributes(inputBuffer)`

**Emits when** there is a pending element in the buffer and configured time for this element elapsed
 \* EmitEarly \- strategy do not wait to emit element if buffer is full

**Backpressures when** depending on OverflowStrategy
 \* Backpressure \- backpressures when buffer is full
 \* DropHead, DropTail, DropBuffer \- never backpressures
 \* Fail \- fails the stream if buffer gets full

**Completes when** upstream completes and buffered elements have been drained

**Cancels when** downstream cancels

delayStrategySuppliercreates new [DelayStrategy](DelayStrategy.html) object for each materialization

overFlowStrategyStrategy that is used when incoming elements cannot fit inside the buffer
30. [**](../../../akka/stream/scaladsl/FlowOps.html#detach:FlowOps.this.Repr[Out] "Permalink")  def detach: [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Detaches upstream demand from downstream demand without detaching the
stream rates; in other words acts like a buffer of size 1\.

Detaches upstream demand from downstream demand without detaching the
stream rates; in other words acts like a buffer of size 1\.

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
31. [**](../../../akka/stream/scaladsl/FlowOps.html#divertTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_],when:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def divertTo(that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_], when: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Attaches the given [Sink](Sink.html) to this [Flow](Flow.html), meaning that elements will be sent to the [Sink](Sink.html)
instead of being passed through if the predicate `when` returns `true`.

Attaches the given [Sink](Sink.html) to this [Flow](Flow.html), meaning that elements will be sent to the [Sink](Sink.html)
instead of being passed through if the predicate `when` returns `true`.

**Emits when** emits when an element is available from the input and the chosen output has demand

**Backpressures when** the currently chosen output back\-pressures

**Completes when** upstream completes and no output is pending

**Cancels when** any of the downstreams cancel
32. [**](../../../akka/stream/scaladsl/FlowOps.html#divertToGraph[M](that:akka.stream.Graph[akka.stream.SinkShape[Out],M],when:Out=>Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out],M] "Permalink")  def divertToGraph\[M](that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M], when: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out], M]Attributesprotected
33. [**](../../../akka/stream/scaladsl/FlowOps.html#drop(n:Long):FlowOps.this.Repr[Out] "Permalink")  def drop(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Discard the given number of elements at the beginning of the stream.

Discard the given number of elements at the beginning of the stream.
No elements will be dropped if `n` is zero or negative.

**Emits when** the specified number of elements has been dropped already

**Backpressures when** the specified number of elements has been dropped and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
34. [**](../../../akka/stream/scaladsl/FlowOps.html#dropWhile(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def dropWhile(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Discard elements at the beginning of the stream while predicate is true.

Discard elements at the beginning of the stream while predicate is true.
All elements will be taken after predicate returns false first time.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** predicate returned false and for all following stream elements

**Backpressures when** predicate returned false and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
35. [**](../../../akka/stream/scaladsl/FlowOps.html#dropWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def dropWithin(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Discard the elements received within the given duration at beginning of the stream.

Discard the elements received within the given duration at beginning of the stream.

**Emits when** the specified time elapsed and a new upstream element arrives

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
36. [**](../../../akka/stream/scaladsl/FlowOps.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (FlowOps\[Out, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlowOps\[Out, Mat]ImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toEnsuring\[FlowOps\[Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
37. [**](../../../akka/stream/scaladsl/FlowOps.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (FlowOps\[Out, Mat]) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlowOps\[Out, Mat]ImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toEnsuring\[FlowOps\[Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
38. [**](../../../akka/stream/scaladsl/FlowOps.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): FlowOps\[Out, Mat]ImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toEnsuring\[FlowOps\[Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
39. [**](../../../akka/stream/scaladsl/FlowOps.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): FlowOps\[Out, Mat]ImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toEnsuring\[FlowOps\[Out, Mat]] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
40. [**](../../../akka/stream/scaladsl/FlowOps.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
41. [**](../../../akka/stream/scaladsl/FlowOps.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
42. [**](../../../akka/stream/scaladsl/FlowOps.html#expand[U](expander:Out=>Iterator[U]):FlowOps.this.Repr[U] "Permalink")  def expand\[U](expander: (Out) \=\> Iterator\[U]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
element until new element comes from the upstream.

Allows a faster downstream to progress independently of a slower upstream by extrapolating elements from an older
element until new element comes from the upstream. For example an expand step might repeat the last element for
the subscriber until it receives an update from upstream.

This element will never "drop" upstream elements as all elements go through at least one extrapolation step.
This means that if the upstream is actually faster than the upstream it will be backpressured by the downstream
subscriber.

Expand does not support [akka.stream.Supervision.Restart](../Supervision$$Restart$.html) and [akka.stream.Supervision.Resume](../Supervision$$Resume$.html).
Exceptions from the `seed` function will complete the stream with failure.

**Emits when** downstream stops backpressuring

**Backpressures when** downstream backpressures or iterator runs empty

**Completes when** upstream completes

**Cancels when** downstream cancels

expanderTakes the current extrapolation state to produce an output element and the next extrapolation
 state.

See also[\#extrapolate](#extrapolate[U>:Out](extrapolator:U=>Iterator[U],initial:Option[U]):FlowOps.this.Repr[U]) for a version that always preserves the original element and allows for an initial "startup"
 element.
43. [**](../../../akka/stream/scaladsl/FlowOps.html#extrapolate[U>:Out](extrapolator:U=>Iterator[U],initial:Option[U]):FlowOps.this.Repr[U] "Permalink")  def extrapolate\[U \>: Out](extrapolator: (U) \=\> Iterator\[U], initial: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[U] \= None): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Allows a faster downstream to progress independent of a slower upstream.

Allows a faster downstream to progress independent of a slower upstream.

This is achieved by introducing "extrapolated" elements \- based on those from upstream \- whenever downstream
signals demand.

Extrapolate does not support [akka.stream.Supervision.Restart](../Supervision$$Restart$.html) and [akka.stream.Supervision.Resume](../Supervision$$Resume$.html).
Exceptions from the `extrapolate` function will complete the stream with failure.

**Emits when** downstream stops backpressuring, AND EITHER upstream emits OR initial element is present OR
`extrapolate` is non\-empty and applicable

**Backpressures when** downstream backpressures or current `extrapolate` runs empty

**Completes when** upstream completes and current `extrapolate` runs empty

**Cancels when** downstream cancels

extrapolatortakes the current upstream element and provides a sequence of "extrapolated" elements based
 on the original, to be emitted in case downstream signals demand.

initialthe initial element to be emitted, in case upstream is able to stall the entire stream.

See also[\#expand](#expand[U](expander:Out=>Iterator[U]):FlowOps.this.Repr[U]) for a version that can overwrite the original element.
44. [**](../../../akka/stream/scaladsl/FlowOps.html#filter(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def filter(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Only pass on those elements that satisfy the given predicate.

Only pass on those elements that satisfy the given predicate.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the given predicate returns true for the element

**Backpressures when** the given predicate returns true for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
45. [**](../../../akka/stream/scaladsl/FlowOps.html#filterNot(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def filterNot(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Only pass on those elements that NOT satisfy the given predicate.

Only pass on those elements that NOT satisfy the given predicate.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the given predicate returns false for the element

**Backpressures when** the given predicate returns false for the element and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
46. [**](../../../akka/stream/scaladsl/FlowOps.html#flatMapConcat[T,M](f:Out=>akka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "Permalink")  def flatMapConcat\[T, M](f: (Out) \=\> [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform each input element into a `Source` of output elements that is
then flattened into the output stream by concatenation,
fully consuming one Source after the other.

Transform each input element into a `Source` of output elements that is
then flattened into the output stream by concatenation,
fully consuming one Source after the other.

**Emits when** a currently consumed substream has an element available

**Backpressures when** downstream backpressures

**Completes when** upstream completes and all consumed substreams complete

**Cancels when** downstream cancels
47. [**](../../../akka/stream/scaladsl/FlowOps.html#flatMapMerge[T,M](breadth:Int,f:Out=>akka.stream.Graph[akka.stream.SourceShape[T],M]):FlowOps.this.Repr[T] "Permalink")  def flatMapMerge\[T, M](breadth: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: (Out) \=\> [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], M]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform each input element into a `Source` of output elements that is
then flattened into the output stream by merging, where at most `breadth`
substreams are being consumed at any given time.

Transform each input element into a `Source` of output elements that is
then flattened into the output stream by merging, where at most `breadth`
substreams are being consumed at any given time.

**Emits when** a currently consumed substream has an element available

**Backpressures when** downstream backpressures

**Completes when** upstream completes and all consumed substreams complete

**Cancels when** downstream cancels
48. [**](../../../akka/stream/scaladsl/FlowOps.html#flatMapPrefix[Out2,Mat2](n:Int)(f:Seq[Out]=>akka.stream.scaladsl.Flow[Out,Out2,Mat2]):FlowOps.this.Repr[Out2] "Permalink")  def flatMapPrefix\[Out2, Mat2](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: ([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]) \=\> [Flow](Flow.html)\[Out, Out2, Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out2]Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).

Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements),
then apply `f` on these elements in order to obtain a flow, this flow is then materialized and the rest of the input is processed by this flow (similar to via).
This method returns a flow consuming the rest of the stream producing the materialized flow's output.

**Emits when** the materialized flow emits.
 Notice the first `n` elements are buffered internally before materializing the flow and connecting it to the rest of the upstream \- producing elements at its own discretion (might 'swallow' or multiply elements).

**Backpressures when** the materialized flow backpressures

**Completes when** the materialized flow completes.
 If upstream completes before producing `n` elements, `f` will be applied with the provided elements,
 the resulting flow will be materialized and signalled for upstream completion, it can then complete or continue to emit elements at its own discretion.

**Cancels when** the materialized flow cancels.
 When downstream cancels before materialization of the nested flow, the operator's default behaviour is to cancel immediately,
 this behaviour can be controlled by setting the [akka.stream.Attributes.NestedMaterializationCancellationPolicy](../Attributes$$NestedMaterializationCancellationPolicy.html) attribute on the flow.
 When this attribute is configured to true, downstream cancellation is delayed until the nested flow's materialization which is then immediately cancelled (with the original cancellation cause).

nthe number of elements to accumulate before materializing the downstream flow.

fa function that produces the downstream flow based on the upstream's prefix.
49. [**](../../../akka/stream/scaladsl/FlowOps.html#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "Permalink")  def fold\[T](zero: T)(f: (T, Out) \=\> T): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Similar to `scan` but only emits its result when the upstream completes,
after which it also completes.

Similar to `scan` but only emits its result when the upstream completes,
after which it also completes. Applies the given function towards its current and next value,
yielding the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.scan](#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])
50. [**](../../../akka/stream/scaladsl/FlowOps.html#foldAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def foldAsync\[T](zero: T)(f: (T, Out) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Similar to `fold` but with an asynchronous function.

Similar to `fold` but with an asynchronous function.
Applies the given function towards its current and next value,
yielding the next current value.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

If the function `f` returns a failure and the supervision decision is
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Note that the `zero` value must be immutable.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.fold](#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])
51. [**](../../../akka/stream/scaladsl/FlowOps.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
52. [**](../../../akka/stream/scaladsl/FlowOps.html#groupBy[K](maxSubstreams:Int,f:Out=>K):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def groupBy\[K](maxSubstreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: (Out) \=\> K): [SubFlow](SubFlow.html)\[Out, Mat, [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed}), [Closed](#Closed)]This operation demultiplexes the incoming stream into separate output
streams, one for each element key.

This operation demultiplexes the incoming stream into separate output
streams, one for each element key. The key is computed for each element
using the given function. When a new key is encountered for the first time
a new substream is opened and subsequently fed with all elements belonging to
that key.

WARNING: The operator keeps track of all keys of streams that have already been closed.
If you expect an infinite number of keys this can cause memory issues. Elements belonging
to those keys are drained directly and not send to the substream.

See also[\#groupBy](#groupBy[K](maxSubstreams:Int,f:Out=>K):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed])
53. [**](../../../akka/stream/scaladsl/FlowOps.html#groupBy[K](maxSubstreams:Int,f:Out=>K,allowClosedSubstreamRecreation:Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def groupBy\[K](maxSubstreams: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), f: (Out) \=\> K, allowClosedSubstreamRecreation: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](SubFlow.html)\[Out, Mat, [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed}), [Closed](#Closed)]This operation demultiplexes the incoming stream into separate output
streams, one for each element key.

This operation demultiplexes the incoming stream into separate output
streams, one for each element key. The key is computed for each element
using the given function. When a new key is encountered for the first time
a new substream is opened and subsequently fed with all elements belonging to
that key.

WARNING: If `allowClosedSubstreamRecreation` is set to `false` (default behavior) the operator
keeps track of all keys of streams that have already been closed. If you expect an infinite
number of keys this can cause memory issues. Elements belonging to those keys are drained
directly and not send to the substream.

Note: If `allowClosedSubstreamRecreation` is set to `true` substream completion and incoming
elements are subject to race\-conditions. If elements arrive for a stream that is in the process
of closing these elements might get lost.

The object returned from this method is not a normal [Source](Source.html) or [Flow](Flow.html),
it is a [SubFlow](SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `groupBy`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the group by function `f` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the group by function `f` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](../Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](../Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

Function `f` MUST NOT return `null`. This will throw exception and trigger supervision decision mechanism.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** an element for which the grouping function returns a group that has not yet been created.
Emits the new group

**Backpressures when** there is an element pending for a group whose substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and all substreams cancel

maxSubstreamsconfigures the maximum number of substreams (keys)
 that are supported; if more distinct keys are encountered then the stream fails

fcomputes the key for each element

allowClosedSubstreamRecreationenables recreation of already closed substreams if elements with their
 corresponding keys arrive after completion
54. [**](../../../akka/stream/scaladsl/FlowOps.html#grouped(n:Int):FlowOps.this.Repr[Seq[Out]] "Permalink")  def grouped(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]]Chunk up this stream into groups of the given size, with the last group
possibly smaller than requested due to end\-of\-stream.

Chunk up this stream into groups of the given size, with the last group
possibly smaller than requested due to end\-of\-stream.

`n` must be positive, otherwise IllegalArgumentException is thrown.

**Emits when** the specified number of elements have been accumulated or upstream completed

**Backpressures when** a group has been assembled and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
55. [**](../../../akka/stream/scaladsl/FlowOps.html#groupedWeighted(minWeight:Long)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWeighted(minWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(costFn: (Out) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]]Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

Chunk up this stream into groups of elements that have a cumulative weight greater than or equal to
the `minWeight`, with the last group possibly smaller than requested `minWeight` due to end\-of\-stream.

`minWeight` must be positive, otherwise IllegalArgumentException is thrown.
`costFn` must return a non\-negative result for all inputs, otherwise the stage will fail
with an IllegalArgumentException.

**Emits when** the cumulative weight of elements is greater than or equal to the `minWeight` or upstream completed

**Backpressures when** a buffered group weighs more than `minWeight` and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
56. [**](../../../akka/stream/scaladsl/FlowOps.html#groupedWeightedWithin(maxWeight:Long,maxNumber:Int,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWeightedWithin(maxWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), maxNumber: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(costFn: (Out) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]]Chunk up this stream into groups of elements received within a time window,
or limited by the weight and number of the elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the weight and number of the elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

`maxWeight` must be positive, `maxNumber` must be positive, and `d` must be greater than 0 seconds,
otherwise IllegalArgumentException is thrown.

**Emits when** the configured time elapses since the last group has been emitted or weight limit reached

**Backpressures when** downstream backpressures, and buffered group (\+ pending element) weighs more than
`maxWeight` or has more than `maxNumber` elements

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes
57. [**](../../../akka/stream/scaladsl/FlowOps.html#groupedWeightedWithin(maxWeight:Long,d:scala.concurrent.duration.FiniteDuration)(costFn:Out=>Long):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWeightedWithin(maxWeight: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration))(costFn: (Out) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]]Chunk up this stream into groups of elements received within a time window,
or limited by the weight of the elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the weight of the elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

`maxWeight` must be positive, and `d` must be greater than 0 seconds, otherwise
IllegalArgumentException is thrown.

**Emits when** the configured time elapses since the last group has been emitted or weight limit reached

**Backpressures when** downstream backpressures, and buffered group (\+ pending element) weighs more than `maxWeight`

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes
58. [**](../../../akka/stream/scaladsl/FlowOps.html#groupedWithin(n:Int,d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Seq[Out]] "Permalink")  def groupedWithin(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]]Chunk up this stream into groups of elements received within a time window,
or limited by the given number of elements, whatever happens first.

Chunk up this stream into groups of elements received within a time window,
or limited by the given number of elements, whatever happens first.
Empty groups will not be emitted if no elements are received from upstream.
The last group before end\-of\-stream will contain the buffered elements
since the previously emitted group.

`n` must be positive, and `d` must be greater than 0 seconds, otherwise
IllegalArgumentException is thrown.

**Emits when** the configured time elapses since the last group has been emitted or `n` elements is buffered

**Backpressures when** downstream backpressures, and there are `n+1` buffered elements

**Completes when** upstream completes (emits last group)

**Cancels when** downstream completes
59. [**](../../../akka/stream/scaladsl/FlowOps.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
60. [**](../../../akka/stream/scaladsl/FlowOps.html#idleTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def idleTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]If the time between two processed elements exceeds the provided timeout, the stream is failed
with a [akka.stream.StreamIdleTimeoutException](../StreamIdleTimeoutException.html).

If the time between two processed elements exceeds the provided timeout, the stream is failed
with a [akka.stream.StreamIdleTimeoutException](../StreamIdleTimeoutException.html). The timeout is checked periodically,
so the resolution of the check is one period (equals to timeout value).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses between two emitted elements

**Cancels when** downstream cancels
61. [**](../../../akka/stream/scaladsl/FlowOps.html#initialDelay(delay:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def initialDelay(delay: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Delays the initial element by the specified duration.

Delays the initial element by the specified duration.

**Emits when** upstream emits an element if the initial delay is already elapsed

**Backpressures when** downstream backpressures or initial delay is not yet elapsed

**Completes when** upstream completes

**Cancels when** downstream cancels
62. [**](../../../akka/stream/scaladsl/FlowOps.html#initialTimeout(timeout:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def initialTimeout(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]If the first element has not passed through this operator before the provided timeout, the stream is failed
with a [akka.stream.InitialTimeoutException](../InitialTimeoutException.html).

If the first element has not passed through this operator before the provided timeout, the stream is failed
with a [akka.stream.InitialTimeoutException](../InitialTimeoutException.html).

**Emits when** upstream emits an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or fails if timeout elapses before first element arrives

**Cancels when** downstream cancels
63. [**](../../../akka/stream/scaladsl/FlowOps.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "Permalink")  def interleave\[U \>: Out](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Interleave is a deterministic merge of the given [Source](Source.html) with elements of this [Flow](Flow.html).

Interleave is a deterministic merge of the given [Source](Source.html) with elements of this [Flow](Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
source, then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If it gets error from one of upstreams \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the [Flow](Flow.html) and given [Source](Source.html) completes

**Cancels when** downstream cancels
64. [**](../../../akka/stream/scaladsl/FlowOps.html#interleave[U>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],segmentSize:Int):FlowOps.this.Repr[U] "Permalink")  def interleave\[U \>: Out](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Interleave is a deterministic merge of the given [Source](Source.html) with elements of this [Flow](Flow.html).

Interleave is a deterministic merge of the given [Source](Source.html) with elements of this [Flow](Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
source, then repeat process.

Example:

```
Source(List(1, 2, 3)).interleave(List(4, 5, 6, 7), 2) // 1, 2, 4, 5, 3, 6, 7
```
After one of upstreams is complete then all the rest elements will be emitted from the second one

If it gets error from one of upstreams \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the [Flow](Flow.html) and given [Source](Source.html) completes

**Cancels when** downstream cancels
65. [**](../../../akka/stream/scaladsl/FlowOps.html#interleaveAll[U>:Out](those:Seq[akka.stream.Graph[akka.stream.SourceShape[U],_]],segmentSize:Int,eagerClose:Boolean):FlowOps.this.Repr[U] "Permalink")  def interleaveAll\[U \>: Out](those: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_]], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Interleave is a deterministic merge of the given [Source](Source.html)s with elements of this [Flow](Flow.html).

Interleave is a deterministic merge of the given [Source](Source.html)s with elements of this [Flow](Flow.html).
It first emits `segmentSize` number of elements from this flow to downstream, then \- same amount for `that`
source, then repeat process.

If eagerClose is false and one of the upstreams complete the elements from the other upstream will continue passing
through the interleave operator. If eagerClose is true and one of the upstream complete interleave will cancel the
other upstream and complete itself.

If it gets error from one of upstreams \- stream completes with failure.

**Emits when** element is available from the currently consumed upstream

**Backpressures when** downstream backpressures. Signal to current
upstream, switch to next upstream when received `segmentSize` elements

**Completes when** the [Flow](Flow.html) and given [Source](Source.html) completes

**Cancels when** downstream cancels
66. [**](../../../akka/stream/scaladsl/FlowOps.html#interleaveGraph[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],segmentSize:Int,eagerClose:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],M] "Permalink")  def interleaveGraph\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], segmentSize: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], M]Attributesprotected
67. [**](../../../akka/stream/scaladsl/FlowOps.html#intersperse[T>:Out](inject:T):FlowOps.this.Repr[T] "Permalink")  def intersperse\[T \>: Out](inject: T): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Additionally can inject start and end marker elements to stream.

Examples:

```
val nums = Source(List(1,2,3)).map(_.toString)
nums.intersperse(",")            //   1 , 2 , 3
nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
```
**Emits when** upstream emits (or before with the `start` element if provided)

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
68. [**](../../../akka/stream/scaladsl/FlowOps.html#intersperse[T>:Out](start:T,inject:T,end:T):FlowOps.this.Repr[T] "Permalink")  def intersperse\[T \>: Out](start: T, inject: T, end: T): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Intersperses stream with provided element, similar to how [scala.collection.immutable.List.mkString](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/List.html#mkString:String)
injects a separator between a List's elements.

Additionally can inject start and end marker elements to stream.

Examples:

```
val nums = Source(List(1,2,3)).map(_.toString)
nums.intersperse(",")            //   1 , 2 , 3
nums.intersperse("[", ",", "]")  // [ 1 , 2 , 3 ]
```
In case you want to only prepend or only append an element (yet still use the `intercept` feature
to inject a separator between elements, you may want to use the following pattern instead of the 3\-argument
version of intersperse (See [Source.concat](Source.html#concat[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U]) for semantics details):

```
Source.single(">> ") ++ Source(List("1", "2", "3")).intersperse(",")
Source(List("1", "2", "3")).intersperse(",") ++ Source.single("END")
```
**Emits when** upstream emits (or before with the `start` element if provided)

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
69. [**](../../../akka/stream/scaladsl/FlowOps.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
70. [**](../../../akka/stream/scaladsl/FlowOps.html#keepAlive[U>:Out](maxIdle:scala.concurrent.duration.FiniteDuration,injectedElem:()=>U):FlowOps.this.Repr[U] "Permalink")  def keepAlive\[U \>: Out](maxIdle: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), injectedElem: () \=\> U): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Injects additional elements if upstream does not emit for a configured amount of time.

Injects additional elements if upstream does not emit for a configured amount of time. In other words, this
operator attempts to maintains a base rate of emitted elements towards the downstream.

If the downstream backpressures then no element is injected until downstream demand arrives. Injected elements
do not accumulate during this period.

Upstream elements are always preferred over injected elements.

**Emits when** upstream emits an element or if the upstream was idle for the configured period

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
71. [**](../../../akka/stream/scaladsl/FlowOps.html#limit(max:Long):FlowOps.this.Repr[Out] "Permalink")  def limit(max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Ensure stream boundedness by limiting the number of elements from upstream.

Ensure stream boundedness by limiting the number of elements from upstream.
If the number of incoming elements exceeds max, it will signal
upstream failure `StreamLimitException` downstream.

Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

**Emits when** upstream emits and the number of emitted elements has not reached max

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the number of emitted elements has not reached max

**Errors when** the total number of incoming element exceeds max

**Cancels when** downstream cancels

See also [FlowOps.take](#take(n:Long):FlowOps.this.Repr[Out]), [FlowOps.takeWithin](#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out]), [FlowOps.takeWhile](#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out])
72. [**](../../../akka/stream/scaladsl/FlowOps.html#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out] "Permalink")  def limitWeighted\[T](max: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))(costFn: (Out) \=\> [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Ensure stream boundedness by evaluating the cost of incoming elements
using a cost function.

Ensure stream boundedness by evaluating the cost of incoming elements
using a cost function. Exactly how many elements will be allowed to travel downstream depends on the
evaluated cost of each element. If the accumulated cost exceeds max, it will signal
upstream failure `StreamLimitException` downstream.

Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** upstream emits and the accumulated cost has not reached max

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the number of emitted elements has not reached max

**Errors when** when the accumulated cost exceeds max

**Cancels when** downstream cancels

See also [FlowOps.take](#take(n:Long):FlowOps.this.Repr[Out]), [FlowOps.takeWithin](#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out]), [FlowOps.takeWhile](#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out])
73. [**](../../../akka/stream/scaladsl/FlowOps.html#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out] "Permalink")  def log(name: String, extract: (Out) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [ConstantFun.scalaIdentityFunction](../../index.html))(implicit log: [LoggingAdapter](../../event/LoggingAdapter.html) \= null): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

Uses implicit LoggingAdapter if available, otherwise uses an internally created one,
which uses `akka.event.Logging(materializer.system, materializer)` as its source (use this class to configure slf4j loggers).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
74. [**](../../../akka/stream/scaladsl/FlowOps.html#logWithMarker(name:String,marker:Out=>akka.event.LogMarker,extract:Out=>Any)(implicitlog:akka.event.MarkerLoggingAdapter):FlowOps.this.Repr[Out] "Permalink")  def logWithMarker(name: String, marker: (Out) \=\> [LogMarker](../../event/LogMarker.html), extract: (Out) \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any) \= [ConstantFun.scalaIdentityFunction](../../index.html))(implicit log: [MarkerLoggingAdapter](../../event/MarkerLoggingAdapter.html) \= null): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Logs elements flowing through the stream as well as completion and erroring.

Logs elements flowing through the stream as well as completion and erroring.

By default element and completion signals are logged on debug level, and errors are logged on Error level.
This can be adjusted according to your needs by providing a custom [Attributes.LogLevels](../Attributes$$LogLevels.html) attribute on the given Flow:

Uses implicit MarkerLoggingAdapter if available, otherwise uses an internally created one,
which uses `akka.event.Logging.withMarker(materializer.system, materializer)` as its source (use this class to configure slf4j loggers).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
75. [**](../../../akka/stream/scaladsl/FlowOps.html#map[T](f:Out=>T):FlowOps.this.Repr[T] "Permalink")  def map\[T](f: (Out) \=\> T): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
76. [**](../../../akka/stream/scaladsl/FlowOps.html#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def mapAsync\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: (Out) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step. The function returns a `Future` and the
value of that future will be emitted downstream. The number of Futures
that shall run in parallel is given as the first argument to `mapAsync`.
These Futures may complete in any order, but the elements that
are emitted downstream are in the same order as received from upstream.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html)
the stream will be completed with failure.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Resume](../Supervision$$Resume$.html) or
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) the element is dropped and the stream continues.

If the `Future` is completed with `null`, it is ignored and the next element is processed.

The function `f` is always invoked on the elements in the order they arrive.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the Future returned by the provided function finishes for the next element in sequence

**Backpressures when** the number of futures reaches the configured parallelism and the downstream
backpressures or the first future is not completed

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Cancels when** downstream cancels

See also[\#mapAsyncUnordered](#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]) and [\#mapAsyncPartitioned](#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
77. [**](../../../akka/stream/scaladsl/FlowOps.html#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def mapAsyncPartitioned\[T, P](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), perPartition: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(partitioner: (Out) \=\> P)(f: (Out, P) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this stream by partitioning elements based on the provided partitioner as they
pass through this step and then applying a given `Future`\-returning function to each element
and its partition key.

Transform this stream by partitioning elements based on the provided partitioner as they
pass through this step and then applying a given `Future`\-returning function to each element
and its partition key. The value of the returned future, if successful, will be emitted
downstream.

The number of Futures running at any given time is bounded by the 'parallelism' and 'perPartition'
values. The futures may complete in any order, but the results are emitted in the same order
as the corresponding elements were received.

If the functions 'partitioner' or 'f' throw an exception, or the `Future` completes with failure,
supervision will be applied to determine a decision. If the decision is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html)
the stream will be stopped with failure; otherwise, the element will be dropped and the stream continues.

The function 'partitioner' is always invoked on the elements in the order they arrive.

The function 'f' is invoked on elements with the same partition key in the order they arrive. The order
of invocation of 'f' for elements with different partition keys is undefined and subject to factors
including, but not limited to, the distribution of partition keys within the stream.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the Future returned by 'f' finishes for the next element in sequence

**Backpressures when** the number of elements for which no resulting future has completed reaches the
configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all results have been emitted

**Cancels when** downstream cancels

parallelismat most this many futures will be incomplete at any time

perPartitionat most this many futures will be incomplete for a given partition key at any time

partitionerfunction to generate a partition key

ffunction to generate a Future

See also[\#mapAsync](#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]) and [\#mapAsyncUnordered](#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
78. [**](../../../akka/stream/scaladsl/FlowOps.html#mapAsyncUnordered[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def mapAsyncUnordered\[T](parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int))(f: (Out) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform this stream by applying the given function to each of the elements
as they pass through this processing step.

Transform this stream by applying the given function to each of the elements
as they pass through this processing step. The function returns a `Future` and the
value of that future will be emitted downstream. The number of Futures
that shall run in parallel is given as the first argument to `mapAsyncUnordered`.
Each processed element will be emitted downstream as soon as it is ready, i.e. it is possible
that the elements are not emitted downstream in the same order as received from upstream.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html)
the stream will be completed with failure.

If the function `f` throws an exception or if the `Future` is completed
with failure and the supervision decision is [akka.stream.Supervision.Resume](../Supervision$$Resume$.html) or
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) the element is dropped and the stream continues.

If the `Future` is completed with `null`, it is ignored and the next element is processed.

The function `f` is always invoked on the elements in the order they arrive (even though the result of the futures
returned by `f` might be emitted in a different order).

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** any of the Futures returned by the provided function complete

**Backpressures when** the number of futures reaches the configured parallelism and the downstream backpressures

**Completes when** upstream completes and all futures have been completed and all elements have been emitted

**Cancels when** downstream cancels

See also[\#mapAsync](#mapAsync[T](parallelism:Int)(f:Out=>scala.concurrent.Future[T]):FlowOps.this.Repr[T]) and [\#mapAsyncPartitioned](#mapAsyncPartitioned[T,P](parallelism:Int,perPartition:Int)(partitioner:Out=>P)(f:(Out,P)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
79. [**](../../../akka/stream/scaladsl/FlowOps.html#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T] "Permalink")  def mapConcat\[T](f: (Out) \=\> IterableOnce\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

The returned `Iterable` MUST NOT contain `null` values,
as they are illegal as stream elements \- according to the Reactive Streams specification.

**Emits when** the mapping function returns an element or there are still remaining elements
from the previously calculated collection

**Backpressures when** downstream backpressures or there are still remaining elements from the
previously calculated collection

**Completes when** upstream completes and all remaining elements have been emitted

**Cancels when** downstream cancels
80. [**](../../../akka/stream/scaladsl/FlowOps.html#mapError(pf:PartialFunction[Throwable,Throwable]):FlowOps.this.Repr[Out] "Permalink")  def mapError(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, Throwable]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]While similar to [recover](#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process.

While similar to [recover](#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T]) this operator can be used to transform an error signal to a different one \*without\* logging
it as an error in the process. So in that sense it is NOT exactly equivalent to `recover(t => throw t2)` since recover
would log the `t2` error.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Similarly to [recover](#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T]) throwing an exception inside `mapError` \_will\_ be logged.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
81. [**](../../../akka/stream/scaladsl/FlowOps.html#mapWithResource[R,T](create:()=>R)(f:(R,Out)=>T,close:R=>Option[T]):FlowOps.this.Repr[T] "Permalink")  def mapWithResource\[R, T](create: () \=\> R)(f: (R, Out) \=\> T, close: (R) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform each stream element with the help of a resource.

Transform each stream element with the help of a resource.

The resource creation function is invoked once when the stream is materialized and the returned resource is passed to
the mapping function for mapping the first element. The mapping function returns a mapped element to emit
downstream. The returned `T` MUST NOT be `null` as it is illegal as stream element \- according to the Reactive Streams specification.

The `close` function is called only once when the upstream or downstream finishes or fails. You can do some clean\-up here,
and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.

Early completion can be done with combination of the [takeWhile](#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out]) operator.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

You can configure the default dispatcher for this Source by changing the `akka.stream.materializer.blocking-io-dispatcher` or
set it for a given Source by using [ActorAttributes](../ActorAttributes$.html).

**Emits when** the mapping function returns an element and downstream is ready to consume it

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

Rthe type of the resource

Tthe type of the output elements

createfunction that creates the resource

ffunction that transforms the upstream element and the resource to output element

closefunction that closes the resource, optionally outputting a last element
82. [**](../../../akka/stream/scaladsl/FlowOps.html#merge[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def merge\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Merge the given [Source](Source.html) to this [Flow](Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html) to this [Flow](Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
83. [**](../../../akka/stream/scaladsl/FlowOps.html#mergeAll[U>:Out](those:Seq[akka.stream.Graph[akka.stream.SourceShape[U],_]],eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def mergeAll\[U \>: Out](those: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_]], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Merge the given [Source](Source.html)s to this [Flow](Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

Merge the given [Source](Source.html)s to this [Flow](Flow.html), taking elements as they arrive from input streams,
picking randomly when several elements ready.

**Emits when** one of the inputs has an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete (eagerComplete\=false) or one upstream completes (eagerComplete\=true), default value is `false`

**Cancels when** downstream cancels
84. [**](../../../akka/stream/scaladsl/FlowOps.html#mergeGraph[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],M] "Permalink")  def mergeGraph\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], M]Attributesprotected
85. [**](../../../akka/stream/scaladsl/FlowOps.html#mergeLatest[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):FlowOps.this.Repr[Seq[U]] "Permalink")  def mergeLatest\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[U]]MergeLatest joins elements from N input streams into stream of lists of size N.

MergeLatest joins elements from N input streams into stream of lists of size N.
i\-th element in list is the latest emitted element from i\-th input stream.
MergeLatest emits list for each element emitted from some input stream,
but only after each input stream emitted at least one element.

**Emits when** an element is available from some input and each input emits at least one element from stream start

**Completes when** all upstreams complete (eagerClose\=false) or one upstream completes (eagerClose\=true)
86. [**](../../../akka/stream/scaladsl/FlowOps.html#mergeLatestGraph[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],eagerComplete:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Seq[U]],M] "Permalink")  def mergeLatestGraph\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[U]], M]Attributesprotected
87. [**](../../../akka/stream/scaladsl/FlowOps.html#mergePreferred[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],preferred:Boolean,eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def mergePreferred\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], preferred: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Merge two sources.

Merge two sources. Prefer one source if both sources have elements ready.

**emits** when one of the inputs has an element available. If multiple have elements available, prefer the 'right' one when 'preferred' is 'true', or the 'left' one when 'preferred' is 'false'.

**backpressures** when downstream backpressures

**completes** when all upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)

Annotations@nowarn()
88. [**](../../../akka/stream/scaladsl/FlowOps.html#mergePreferredGraph[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],preferred:Boolean,eagerComplete:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],M] "Permalink")  def mergePreferredGraph\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], preferred: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], M]Attributesprotected Annotations@nowarn()
89. [**](../../../akka/stream/scaladsl/FlowOps.html#mergePrioritized[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean):FlowOps.this.Repr[U] "Permalink")  def mergePrioritized\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], leftPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), rightPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Merge two sources.

Merge two sources. Prefer the sources depending on the 'priority' parameters.

**emits** when one of the inputs has an element available, preferring inputs based on the 'priority' parameters if both have elements available

**backpressures** when downstream backpressures

**completes** when both upstreams complete (This behavior is changeable to completing when any upstream completes by setting `eagerComplete=true`.)
90. [**](../../../akka/stream/scaladsl/FlowOps.html#mergePrioritizedGraph[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M],leftPriority:Int,rightPriority:Int,eagerComplete:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],M] "Permalink")  def mergePrioritizedGraph\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M], leftPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), rightPriority: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], M]Attributesprotected
91. [**](../../../akka/stream/scaladsl/FlowOps.html#mergeSorted[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M])(implicitord:Ordering[U]):FlowOps.this.Repr[U] "Permalink")  def mergeSorted\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M])(implicit ord: Ordering\[U]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Merge the given [Source](Source.html) to this [Flow](Flow.html), taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available).

Merge the given [Source](Source.html) to this [Flow](Flow.html), taking elements as they arrive from input streams,
picking always the smallest of the available elements (waiting for one element from each side
to be available). This means that possible contiguity of the input streams is not exploited to avoid
waiting for elements, this merge will block when one of the inputs does not have more elements (and
does not complete).

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** all upstreams complete

**Cancels when** downstream cancels
92. [**](../../../akka/stream/scaladsl/FlowOps.html#mergeSortedGraph[U>:Out,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M])(implicitord:Ordering[U]):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],M] "Permalink")  def mergeSortedGraph\[U \>: Out, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M])(implicit ord: Ordering\[U]): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], M]Attributesprotected
93. [**](../../../akka/stream/scaladsl/FlowOps.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
94. [**](../../../akka/stream/scaladsl/FlowOps.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
95. [**](../../../akka/stream/scaladsl/FlowOps.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
96. [**](../../../akka/stream/scaladsl/FlowOps.html#onErrorComplete(pf:PartialFunction[Throwable,Boolean]):FlowOps.this.Repr[Out] "Permalink")  def onErrorComplete(pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with exception pf can handle

**Cancels when** downstream cancels
97. [**](../../../akka/stream/scaladsl/FlowOps.html#onErrorComplete[T<:Throwable]()(implicittag:scala.reflect.ClassTag[T]):FlowOps.this.Repr[Out] "Permalink")  def onErrorComplete\[T \<: Throwable]()(implicit tag: [ClassTag](https://www.scala-lang.org/api/2.13.17/scala/reflect/ClassTag.html#scala.reflect.ClassTag)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]onErrorComplete allows to complete the stream when an upstream error occurs.

onErrorComplete allows to complete the stream when an upstream error occurs.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

**Emits when** element is available from the upstream

**Backpressures when** downstream backpressures

**Completes when** upstream completes or failed with exception is an instance of the provided type

**Cancels when** downstream cancels
98. [**](../../../akka/stream/scaladsl/FlowOps.html#orElse[U>:Out,Mat2](secondary:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def orElse\[U \>: Out, Mat2](secondary: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Provides a secondary source that will be consumed if this stream completes without any
elements passing by.

Provides a secondary source that will be consumed if this stream completes without any
elements passing by. As soon as the first element comes through this stream, the alternative
will be cancelled.

Note that this Flow will be materialized together with the [Source](Source.html) and just kept
from producing elements by asserting back\-pressure until its time comes or it gets
cancelled.

On errors the operator is failed regardless of source of the error.

**Emits when** element is available from first stream or first stream closed without emitting any elements and an element
 is available from the second stream

**Backpressures when** downstream backpressures

**Completes when** the primary stream completes after emitting at least one element, when the primary stream completes
 without emitting and the secondary stream already has completed or when the secondary stream completes

**Cancels when** downstream cancels and additionally the alternative is cancelled as soon as an element passes
 by from this stream.
99. [**](../../../akka/stream/scaladsl/FlowOps.html#orElseGraph[U>:Out,Mat2](secondary:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],Mat2] "Permalink")  def orElseGraph\[U \>: Out, Mat2](secondary: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2]): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], Mat2]Attributesprotected
100. [**](../../../akka/stream/scaladsl/FlowOps.html#prefixAndTail[U>:Out](n:Int):FlowOps.this.Repr[(Seq[Out],akka.stream.scaladsl.Source[U,akka.NotUsed])] "Permalink")  def prefixAndTail\[U \>: Out](n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[([Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out], [Source](Source.html)\[U, [NotUsed](../../NotUsed.html)])]Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)
and returns a pair containing a strict sequence of the taken element
and a stream representing the remaining elements.

Takes up to `n` elements from the stream (less than `n` only if the upstream completes before emitting `n` elements)
and returns a pair containing a strict sequence of the taken element
and a stream representing the remaining elements. If *n* is zero or negative, then this will return a pair
of an empty collection and a stream containing the whole upstream unchanged.

In case of an upstream error, depending on the current state

	- the master stream signals the error if less than `n` elements has been seen, and therefore the substream
	 has not yet been emitted
	- the tail substream signals the error after the prefix and tail has been emitted by the main stream
	 (at that point the main stream has already completed)**Emits when** the configured number of prefix elements are available. Emits this prefix, and the rest
as a substream

**Backpressures when** downstream backpressures or substream backpressures

**Completes when** prefix elements have been consumed and substream has been consumed

**Cancels when** downstream cancels or substream cancels
101. [**](../../../akka/stream/scaladsl/FlowOps.html#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def prepend\[U \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Prepend the given [Source](Source.html) to this [Flow](Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](Source.html) to this [Flow](Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](Source.html) is materialized together with this Flow and is "detached" meaning
in effect behave as a one element buffer in front of both the sources, that eagerly demands an element on start
(so it can not be combined with `Source.lazy` to defer materialization of `that`).

This flow will then be kept from producing elements by asserting back\-pressure until its time comes.

When needing a prepend operator that is not detached use [\#prependLazy](#prependLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

**Emits when** element is available from the given [Source](Source.html) or from current stream when the [Source](Source.html) is completed

**Backpressures when** downstream backpressures

**Completes when** this [Flow](Flow.html) completes

**Cancels when** downstream cancels
102. [**](../../../akka/stream/scaladsl/FlowOps.html#prependGraph[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],detached:Boolean):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,U],Mat2] "Permalink")  def prependGraph\[U \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2], detached: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, U], Mat2]Attributesprotected
103. [**](../../../akka/stream/scaladsl/FlowOps.html#prependLazy[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U] "Permalink")  def prependLazy\[U \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[U]Prepend the given [Source](Source.html) to this [Flow](Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Prepend the given [Source](Source.html) to this [Flow](Flow.html), meaning that before elements
are generated from this Flow, the Source's elements will be produced until it
is exhausted, at which point Flow elements will start being produced.

Note that the [Source](Source.html) is materialized together with this Flow and will then be kept from producing elements
by asserting back\-pressure until its time comes.

When needing a prepend operator that is also detached use [\#prepend](#prepend[U>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2]):FlowOps.this.Repr[U])

If the given [Source](Source.html) gets upstream error \- no elements from this [Flow](Flow.html) will be pulled.

**Emits when** element is available from the given [Source](Source.html) or from current stream when the [Source](Source.html) is completed

**Backpressures when** downstream backpressures

**Completes when** this [Flow](Flow.html) completes

**Cancels when** downstream cancels
104. [**](../../../akka/stream/scaladsl/FlowOps.html#recover[T>:Out](pf:PartialFunction[Throwable,T]):FlowOps.this.Repr[T] "Permalink")  def recover\[T \>: Out](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.

Recover allows to send last element on failure and gracefully complete the stream
Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recover` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and pf returns an element

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
105. [**](../../../akka/stream/scaladsl/FlowOps.html#recoverWith[T>:Out](pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "Permalink")  def recoverWith\[T \>: Out](pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], [NotUsed](../../NotUsed.html)]]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]RecoverWith allows to switch to alternative Source on flow failure.

RecoverWith allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered so that each time there is a failure it is fed into the `pf` and a new
Source may be materialized.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWith` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels
106. [**](../../../akka/stream/scaladsl/FlowOps.html#recoverWithRetries[T>:Out](attempts:Int,pf:PartialFunction[Throwable,akka.stream.Graph[akka.stream.SourceShape[T],akka.NotUsed]]):FlowOps.this.Repr[T] "Permalink")  def recoverWithRetries\[T \>: Out](attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), pf: [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[Throwable, [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[T], [NotUsed](../../NotUsed.html)]]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]RecoverWithRetries allows to switch to alternative Source on flow failure.

RecoverWithRetries allows to switch to alternative Source on flow failure. It will stay in effect after
a failure has been recovered up to `attempts` number of times so that each time there is a failure
it is fed into the `pf` and a new Source may be materialized. Note that if you pass in 0, this won't
attempt to recover at all.

A negative `attempts` number is interpreted as "infinite", which results in the exact same behavior as `recoverWith`.

Since the underlying failure signal onError arrives out\-of\-band, it might jump over existing elements.
This operator can recover the failure signal, but not the skipped elements, which will be dropped.

Throwing an exception inside `recoverWithRetries` \_will\_ be logged on ERROR level automatically.

**Emits when** element is available from the upstream or upstream is failed and element is available
from alternative Source

**Backpressures when** downstream backpressures

**Completes when** upstream completes or upstream failed with exception pf can handle

**Cancels when** downstream cancels

attemptsMaximum number of retries or \-1 to retry indefinitely

pfReceives the failure cause and returns the new Source to be materialized if any
107. [**](../../../akka/stream/scaladsl/FlowOps.html#reduce[T>:Out](f:(T,T)=>T):FlowOps.this.Repr[T] "Permalink")  def reduce\[T \>: Out](f: (T, T) \=\> T): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Similar to `fold` but uses first element as zero element.

Similar to `fold` but uses first element as zero element.
Applies the given function towards its current and next value,
yielding the next current value.

If the stream is empty (i.e. completes before signalling any elements),
the reduce operator will fail its downstream with a NoSuchElementException,
which is semantically in\-line with that Scala's standard library collections
do in such situations.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** upstream completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.fold](#fold[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])
108. [**](../../../akka/stream/scaladsl/FlowOps.html#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T] "Permalink")  def scan\[T](zero: T)(f: (T, Out) \=\> T): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Similar to `fold` but is not a terminal operation,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting the next current value.

Similar to `fold` but is not a terminal operation,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** the function scanning the element returns a new element

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

See also [FlowOps.scanAsync](#scanAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T])
109. [**](../../../akka/stream/scaladsl/FlowOps.html#scanAsync[T](zero:T)(f:(T,Out)=>scala.concurrent.Future[T]):FlowOps.this.Repr[T] "Permalink")  def scanAsync\[T](zero: T)(f: (T, Out) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Similar to `scan` but with an asynchronous function,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting a `Future` that resolves to the next current value.

Similar to `scan` but with an asynchronous function,
emits its current value which starts at `zero` and then
applies the current and next value to the given function `f`,
emitting a `Future` that resolves to the next current value.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Restart](../Supervision$$Restart$.html) current value starts at `zero` again
the stream will continue.

If the function `f` throws an exception and the supervision decision is
[akka.stream.Supervision.Resume](../Supervision$$Resume$.html) current value starts at the previous
current value, or zero when it doesn't have one, and the stream will continue.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

Note that the `zero` value must be immutable.

**Emits when** the future returned by `f` completes

**Backpressures when** downstream backpressures

**Completes when** upstream completes and the last future returned by `f` completes

**Cancels when** downstream cancels

See also [FlowOps.scan](#scan[T](zero:T)(f:(T,Out)=>T):FlowOps.this.Repr[T])
110. [**](../../../akka/stream/scaladsl/FlowOps.html#sliding(n:Int,step:Int):FlowOps.this.Repr[Seq[Out]] "Permalink")  def sliding(n: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), step: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 1): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[[Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[Out]]Apply a sliding window over the stream and return the windows as groups of elements, with the last group
possibly smaller than requested due to end\-of\-stream.

Apply a sliding window over the stream and return the windows as groups of elements, with the last group
possibly smaller than requested due to end\-of\-stream.

`n` must be positive, otherwise IllegalArgumentException is thrown.
`step` must be positive, otherwise IllegalArgumentException is thrown.

**Emits when** enough elements have been collected within the window or upstream completed

**Backpressures when** a window has been assembled and downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
111. [**](../../../akka/stream/scaladsl/FlowOps.html#splitAfter(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitAfter(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](SubFlow.html)\[Out, Mat, [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed}), [Closed](#Closed)]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams. It \*ends\* the current substream when the
predicate is true.

See also[\#splitAfter](#splitAfter(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed])
112. [**](../../../akka/stream/scaladsl/FlowOps.html#splitAfter(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitAfter(substreamCancelStrategy: [SubstreamCancelStrategy](../SubstreamCancelStrategy.html))(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](SubFlow.html)\[Out, Mat, [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed}), [Closed](#Closed)]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams. It \*ends\* the current substream when the
predicate is true. This means that for the following series of predicate values,
three substreams will be produced with lengths 2, 2, and 3:

```
false, true,        // elements go into first substream
false, true,        // elements go into second substream
false, false, true  // elements go into third substream
```
The object returned from this method is not a normal [Source](Source.html) or [Flow](Flow.html),
it is a [SubFlow](SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `splitAfter`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](../Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](../Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

**Emits when** an element passes through. When the provided predicate is true it emits the element
and opens a new substream for subsequent element

**Backpressures when** there is an element pending for the next substream, but the previous
is not fully consumed yet, or the substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
cancels or any substream cancels on `SubstreamCancelStrategy.propagate`

See also [FlowOps.splitWhen](#splitWhen(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed]).
113. [**](../../../akka/stream/scaladsl/FlowOps.html#splitWhen(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitWhen(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](SubFlow.html)\[Out, Mat, [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed}), [Closed](#Closed)]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

See also[\#splitWhen](#splitWhen(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed])
114. [**](../../../akka/stream/scaladsl/FlowOps.html#splitWhen(substreamCancelStrategy:akka.stream.SubstreamCancelStrategy)(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed] "Permalink")  def splitWhen(substreamCancelStrategy: [SubstreamCancelStrategy](../SubstreamCancelStrategy.html))(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [SubFlow](SubFlow.html)\[Out, Mat, [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed}), [Closed](#Closed)]This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it.

This operation applies the given predicate to all incoming elements and
emits them to a stream of output streams, always beginning a new one with
the current element if the given predicate returns true for it. This means
that for the following series of predicate values, three substreams will
be produced with lengths 1, 2, and 3:

```
false,             // element goes into first substream
true, false,       // elements go into second substream
true, false, false // elements go into third substream
```
In case the \*first\* element of the stream matches the predicate, the first
substream emitted by splitWhen will start from that element. For example:

```
true, false, false // first substream starts from the split-by element
true, false        // subsequent substreams operate the same way
```
The object returned from this method is not a normal [Source](Source.html) or [Flow](Flow.html),
it is a [SubFlow](SubFlow.html). This means that after this operator all transformations
are applied to all encountered substreams in the same fashion. Substream mode
is exited either by closing the substream (i.e. connecting it to a [Sink](Sink.html))
or by merging the substreams back together; see the `to` and `mergeBack` methods
on [SubFlow](SubFlow.html) for more information.

It is important to note that the substreams also propagate back\-pressure as
any other stream, which means that blocking one substream will block the `splitWhen`
operator itself—and thereby all substreams—once all internal or
explicit buffers are filled.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Stop](../Supervision$$Stop$.html) the stream and substreams will be completed
with failure.

If the split predicate `p` throws an exception and the supervision decision
is [akka.stream.Supervision.Resume](../Supervision$$Resume$.html) or [akka.stream.Supervision.Restart](../Supervision$$Restart$.html)
the element is dropped and the stream and substreams continue.

**Emits when** an element for which the provided predicate is true, opening and emitting
a new substream for subsequent element

**Backpressures when** there is an element pending for the next substream, but the previous
is not fully consumed yet, or the substream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels and substreams cancel on `SubstreamCancelStrategy.drain`, downstream
cancels or any substream cancels on `SubstreamCancelStrategy.propagate`

See also [FlowOps.splitAfter](#splitAfter(p:Out=>Boolean):akka.stream.scaladsl.SubFlow[Out,Mat,FlowOps.this.Repr,FlowOps.this.Closed]).
115. [**](../../../akka/stream/scaladsl/FlowOps.html#statefulMap[S,T](create:()=>S)(f:(S,Out)=>(S,T),onComplete:S=>Option[T]):FlowOps.this.Repr[T] "Permalink")  def statefulMap\[S, T](create: () \=\> S)(f: (S, Out) \=\> (S, T), onComplete: (S) \=\> [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform each stream element with the help of a state.

Transform each stream element with the help of a state.

The state creation function is invoked once when the stream is materialized and the returned state is passed to
the mapping function for mapping the first element. The mapping function returns a mapped element to emit
downstream and a state to pass to the next mapping function. The state can be the same for each mapping return,
be a new immutable state but it is also safe to use a mutable state. The returned `T` MUST NOT be `null` as it is
illegal as stream element \- according to the Reactive Streams specification. A `null` state is not allowed and will fail the stream.

For stateless variant see [FlowOps.map](#map[T](f:Out=>T):FlowOps.this.Repr[T]).

The `onComplete` function is called only once when the upstream or downstream finished, You can do some clean\-up here,
and if the returned value is not empty, it will be emitted to the downstream if available, otherwise the value will be dropped.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element and downstream is ready to consume it

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels

Sthe type of the state

Tthe type of the output elements

createa function that creates the initial state

fa function that transforms the upstream element and the state into a pair of next state and output element

onCompletea function that transforms the ongoing state into an optional output element
116. [**](../../../akka/stream/scaladsl/FlowOps.html#statefulMapConcat[T](f:()=>Out=>IterableOnce[T]):FlowOps.this.Repr[T] "Permalink")  def statefulMapConcat\[T](f: () \=\> (Out) \=\> IterableOnce\[T]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[T]Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream.

Transform each input element into an `Iterable` of output elements that is
then flattened into the output stream. The transformation is meant to be stateful,
which is enabled by creating the transformation function anew for every materialization —
the returned function will typically close over mutable objects to store state between
invocations. For the stateless variant see [FlowOps.mapConcat](#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T]).

The returned `Iterable` MUST NOT contain `null` values,
as they are illegal as stream elements \- according to the Reactive Streams specification.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the mapping function returns an element or there are still remaining elements
from the previously calculated collection

**Backpressures when** downstream backpressures or there are still remaining elements from the
previously calculated collection

**Completes when** upstream completes and all remaining elements has been emitted

**Cancels when** downstream cancels

See also [FlowOps.mapConcat](#mapConcat[T](f:Out=>IterableOnce[T]):FlowOps.this.Repr[T])
117. [**](../../../akka/stream/scaladsl/FlowOps.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
118. [**](../../../akka/stream/scaladsl/FlowOps.html#take(n:Long):FlowOps.this.Repr[Out] "Permalink")  def take(n: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Terminate processing (and cancel the upstream publisher) after the given
number of elements.

Terminate processing (and cancel the upstream publisher) after the given
number of elements. Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

The stream will be completed without producing any elements if `n` is zero
or negative.

**Emits when** the specified number of elements to take has not yet been reached

**Backpressures when** downstream backpressures

**Completes when** the defined number of elements has been taken or upstream completes

**Cancels when** the defined number of elements has been taken or downstream cancels

See also [FlowOps.limit](#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out])
119. [**](../../../akka/stream/scaladsl/FlowOps.html#takeWhile(p:Out=>Boolean,inclusive:Boolean):FlowOps.this.Repr[Out] "Permalink")  def takeWhile(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), inclusive: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time, including the first failed element iff inclusive is true
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time, including the first failed element iff inclusive is true
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

The stream will be completed without producing any elements if predicate is false for
the first stream element.

Adheres to the [ActorAttributes.SupervisionStrategy](../ActorAttributes$$SupervisionStrategy.html) attribute.

**Emits when** the predicate is true

**Backpressures when** downstream backpressures

**Completes when** predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes

**Cancels when** predicate returned false or downstream cancels

See also [FlowOps.limit](#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out])
120. [**](../../../akka/stream/scaladsl/FlowOps.html#takeWhile(p:Out=>Boolean):FlowOps.this.Repr[Out] "Permalink")  def takeWhile(p: (Out) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time,
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

Terminate processing (and cancel the upstream publisher) after predicate
returns false for the first time,
Due to input buffering some elements may have been requested from upstream publishers
that will then not be processed downstream of this step.

The stream will be completed without producing any elements if predicate is false for
the first stream element.

**Emits when** the predicate is true

**Backpressures when** downstream backpressures

**Completes when** predicate returned false (or 1 after predicate returns false if `inclusive` or upstream completes

**Cancels when** predicate returned false or downstream cancels

See also [FlowOps.limit](#limit(max:Long):FlowOps.this.Repr[Out]), [FlowOps.limitWeighted](#limitWeighted[T](max:Long)(costFn:Out=>Long):FlowOps.this.Repr[Out])
121. [**](../../../akka/stream/scaladsl/FlowOps.html#takeWithin(d:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def takeWithin(d: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Terminate processing (and cancel the upstream publisher) after the given
duration.

Terminate processing (and cancel the upstream publisher) after the given
duration. Due to input buffering some elements may have been
requested from upstream publishers that will then not be processed downstream
of this step.

Note that this can be combined with [\#take](#take(n:Long):FlowOps.this.Repr[Out]) to limit the number of elements
within the duration.

**Emits when** an upstream element arrives

**Backpressures when** downstream backpressures

**Completes when** upstream completes or timer fires

**Cancels when** downstream cancels or timer fires
122. [**](../../../akka/stream/scaladsl/FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl,costCalculation:Out=>Int):FlowOps.this.Repr[Out] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html), costCalculation: (Out) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.

The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.
Sends elements downstream with speed limited to `cost/per` as defined in the `ThrottleControl`. Cost is
calculating for each element individually by calling `calculateCost` function.
This operator works for streams when elements have different cost(length).
Streams of `ByteString` for example.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](../ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
123. [**](../../../akka/stream/scaladsl/FlowOps.html#throttle(control:akka.stream.scaladsl.ThrottleControl):FlowOps.this.Repr[Out] "Permalink")  def throttle(control: [ThrottleControl](ThrottleControl.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.

The `ThrottleControl` can be updated to change the throttle rate from the outside of the stream
and share a total rate limit between several streams.
Sends elements downstream with speed limited to `elements/per` as defined in the `ThrottleControl`.
In other words, this operator sets the maximum rate for emitting messages. This operator works for streams
where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
started.

The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
\- rate \< 20/second \=\> burst size 1
\- rate 20/second \=\> burst size 2
\- rate 100/second \=\> burst size 10
\- rate 200/second \=\> burst size 20

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
124. [**](../../../akka/stream/scaladsl/FlowOps.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,costCalculation:Out=>Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), costCalculation: (Out) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](../ThrottleMode.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Sends elements downstream with speed limited to `cost/per`.

Sends elements downstream with speed limited to `cost/per`. Cost is
calculating for each element individually by calling `calculateCost` function.
This operator works for streams when elements have different cost(length).
Streams of `ByteString` for example.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](../ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
125. [**](../../../akka/stream/scaladsl/FlowOps.html#throttle(cost:Int,per:scala.concurrent.duration.FiniteDuration,costCalculation:Out=>Int):FlowOps.this.Repr[Out] "Permalink")  def throttle(cost: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), costCalculation: (Out) \=\> [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Sends elements downstream with speed limited to `cost/per`.

Sends elements downstream with speed limited to `cost/per`. Cost is
calculating for each element individually by calling `calculateCost` function.
This operator works for streams when elements have different cost(length).
Streams of `ByteString` for example.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
started.

The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
\- rate \< 20/second \=\> burst size 1
\- rate 20/second \=\> burst size 2
\- rate 100/second \=\> burst size 10
\- rate 200/second \=\> burst size 20

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
126. [**](../../../akka/stream/scaladsl/FlowOps.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration,maximumBurst:Int,mode:akka.stream.ThrottleMode):FlowOps.this.Repr[Out] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration), maximumBurst: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), mode: [ThrottleMode](../ThrottleMode.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Sends elements downstream with speed limited to `elements/per`.

Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
for emitting messages. This operator works for streams where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size or maximumBurst).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and started.

Parameter `mode` manages behavior when upstream is faster than throttle rate:

	- [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html) makes pauses before emitting messages to meet the throttle rate
	- [akka.stream.ThrottleMode.Enforcing](../ThrottleMode$$Enforcing$.html) fails with exception when upstream is faster than throttle rate. Enforcing
	 cannot emit elements that cost more than the maximumBurstIt is recommended to use non\-zero burst sizes as they improve both performance and throttling precision by allowing
the implementation to avoid using the scheduler when input rates fall below the enforced limit and to reduce
most of the inaccuracy caused by the scheduler resolution (which is in the range of milliseconds).

 WARNING: Be aware that throttle is using scheduler to slow down the stream. This scheduler has minimal time of triggering
 next push. Consequently it will slow down the stream as it has minimal pause for emitting. This can happen in
 case burst is 0 and speed is higher than 30 events per second. You need to increase the `maximumBurst` if
 elements arrive with small interval (30 milliseconds or less). Use the overloaded `throttle` method without
 `maximumBurst` parameter to automatically calculate the `maximumBurst` based on the given rate (`cost/per`).
 In other words the throttler always enforces the rate limit when `maximumBurst` parameter is given, but in
 certain cases (mostly due to limited scheduler resolution) it enforces a tighter bound than what was prescribed.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
127. [**](../../../akka/stream/scaladsl/FlowOps.html#throttle(elements:Int,per:scala.concurrent.duration.FiniteDuration):FlowOps.this.Repr[Out] "Permalink")  def throttle(elements: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), per: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Sends elements downstream with speed limited to `elements/per`.

Sends elements downstream with speed limited to `elements/per`. In other words, this operator sets the maximum rate
for emitting messages. This operator works for streams where all elements have the same cost or length.

Throttle implements the token bucket model. There is a bucket with a given token capacity (burst size).
Tokens drop into the bucket at a given rate and can be kept for later use up to bucket capacity
to allow some burstiness. Whenever the stream wants to send an element, it takes as many
tokens from the bucket as the element costs. If there isn't any, throttle waits until the
bucket accumulates enough tokens. Elements that cost more than the allowed burst will be delayed proportionally
to their cost minus available tokens, meeting the target rate. Bucket is full when the stream is first materialized and
started.

The burst size is calculated based on the given rate (`cost/per`) as 0\.1 \* rate, for example:
\- rate \< 20/second \=\> burst size 1
\- rate 20/second \=\> burst size 2
\- rate 100/second \=\> burst size 10
\- rate 200/second \=\> burst size 20

The throttle `mode` is [akka.stream.ThrottleMode.Shaping](../ThrottleMode$$Shaping$.html), which pauses before emitting messages to
meet the throttle rate.

**Emits when** upstream emits an element and configured time per each element elapsed

**Backpressures when** downstream backpressures or the incoming rate is higher than the speed limit

**Completes when** upstream completes

**Cancels when** downstream cancels
128. [**](../../../akka/stream/scaladsl/FlowOps.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
129. [**](../../../akka/stream/scaladsl/FlowOps.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
130. [**](../../../akka/stream/scaladsl/FlowOps.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
131. [**](../../../akka/stream/scaladsl/FlowOps.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
132. [**](../../../akka/stream/scaladsl/FlowOps.html#watch(ref:akka.actor.ActorRef):FlowOps.this.Repr[Out] "Permalink")  def watch(ref: [ActorRef](../../actor/ActorRef.html)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

The operator fails with an [akka.stream.WatchedActorTerminatedException](../WatchedActorTerminatedException.html) if the target actor is terminated.

**Emits when** upstream emits

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Fails when** the watched actor terminates

**Cancels when** downstream cancels
133. [**](../../../akka/stream/scaladsl/FlowOps.html#wireTap(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out] "Permalink")  def wireTap(that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], \_]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]Attaches the given [Sink](Sink.html) to this [Flow](Flow.html) as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.

Attaches the given [Sink](Sink.html) to this [Flow](Flow.html) as a wire tap, meaning that elements that pass
through will also be sent to the wire\-tap Sink, without the latter affecting the mainline flow.
If the wire\-tap Sink backpressures, elements that would've been sent to it will be dropped instead.

It is similar to [\#alsoTo](#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) which does backpressure instead of dropping elements.

**Emits when** element is available and demand exists from the downstream; the element will
also be sent to the wire\-tap Sink if there is demand.

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
134. [**](../../../akka/stream/scaladsl/FlowOps.html#wireTap(f:Out=>Unit):FlowOps.this.Repr[Out] "Permalink")  def wireTap(f: (Out) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out]This is a simplified version of `wireTap(Sink)` that takes only a simple function.

This is a simplified version of `wireTap(Sink)` that takes only a simple function.
Elements will be passed into this "side channel" function, and any of its results will be ignored.

If the wire\-tap operation is slow (it backpressures), elements that would've been sent to it will be dropped instead.
It is similar to [\#alsoTo](#alsoTo(that:akka.stream.Graph[akka.stream.SinkShape[Out],_]):FlowOps.this.Repr[Out]) which does backpressure instead of dropping elements.

This operation is useful for inspecting the passed through element, usually by means of side\-effecting
operations (such as `println`, or emitting metrics), for each element without having to modify it.

For logging signals (elements, completion, error) consider using the [log](#log(name:String,extract:Out=>Any)(implicitlog:akka.event.LoggingAdapter):FlowOps.this.Repr[Out]) operator instead,
along with appropriate `ActorAttributes.logLevels`.

**Emits when** upstream emits an element; the same element will be passed to the attached function,
 as well as to the downstream operator

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
135. [**](../../../akka/stream/scaladsl/FlowOps.html#wireTapGraph[M](that:akka.stream.Graph[akka.stream.SinkShape[Out],M]):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out],M] "Permalink")  def wireTapGraph\[M](that: [Graph](../Graph.html)\[[SinkShape](../SinkShape.html)\[Out], M]): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out], M]Attributesprotected
136. [**](../../../akka/stream/scaladsl/FlowOps.html#zip[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "Permalink")  def zip\[U](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[(Out, U)]Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
137. [**](../../../akka/stream/scaladsl/FlowOps.html#zipAll[U,A>:Out](that:akka.stream.Graph[akka.stream.SourceShape[U],_],thisElem:A,thatElem:U):FlowOps.this.Repr[(A,U)] "Permalink")  def zipAll\[U, A \>: Out](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_], thisElem: A, thatElem: U): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[(A, U)]Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

Combine the elements of current flow and the given [Source](Source.html) into a stream of tuples.

**Emits when** at first emits when both inputs emit, and then as long as any input emits (coupled to the default value of the completed input).

**Backpressures when** downstream backpressures

**Completes when** all upstream completes

**Cancels when** downstream cancels
138. [**](../../../akka/stream/scaladsl/FlowOps.html#zipAllFlow[U,A>:Out,Mat2](that:akka.stream.Graph[akka.stream.SourceShape[U],Mat2],thisElem:A,thatElem:U):akka.stream.scaladsl.Flow[Out@scala.annotation.unchecked.uncheckedVariance,(A,U),Mat2] "Permalink")  def zipAllFlow\[U, A \>: Out, Mat2](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], Mat2], thisElem: A, thatElem: U): [Flow](Flow.html)\[Out, (A, U), Mat2]Attributesprotected
139. [**](../../../akka/stream/scaladsl/FlowOps.html#zipGraph[U,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M]):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,(Out,U)],M] "Permalink")  def zipGraph\[U, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M]): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, (Out, U)], M]Attributesprotected
140. [**](../../../akka/stream/scaladsl/FlowOps.html#zipLatest[U](that:akka.stream.Graph[akka.stream.SourceShape[U],_]):FlowOps.this.Repr[(Out,U)] "Permalink")  def zipLatest\[U](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], \_]): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[(Out, U)]Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.

A `ZipLatest` has a `left` and a `right` input port and one `out` port.

No element is emitted until at least one element from each Source becomes available.

**Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
141. [**](../../../akka/stream/scaladsl/FlowOps.html#zipLatestGraph[U,M](that:akka.stream.Graph[akka.stream.SourceShape[U],M]):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,(Out,U)],M] "Permalink")  def zipLatestGraph\[U, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[U], M]): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, (Out, U)], M]Attributesprotected
142. [**](../../../akka/stream/scaladsl/FlowOps.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_],eagerComplete:Boolean)(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "Permalink")  def zipLatestWith\[Out2, Out3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], \_], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(combine: (Out, Out2) \=\> Out3): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out3]Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any upstream completes if `eagerComplete` is enabled or wait for all upstreams to complete

 **Cancels when** downstream cancels
143. [**](../../../akka/stream/scaladsl/FlowOps.html#zipLatestWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "Permalink")  def zipLatestWith\[Out2, Out3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], \_])(combine: (Out, Out2) \=\> Out3): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out3]Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

Combine the elements of multiple streams into a stream of combined elements using a combiner function,
picking always the latest of the elements of each source.

No element is emitted until at least one element from each Source becomes available. Whenever a new
element appears, the zipping function is invoked with a tuple containing the new element
and the other last seen elements.

 **Emits when** all of the inputs have at least an element available, and then each time an element becomes
 available on either of the inputs

 **Backpressures when** downstream backpressures

 **Completes when** any of the upstreams completes

 **Cancels when** downstream cancels
144. [**](../../../akka/stream/scaladsl/FlowOps.html#zipLatestWithGraph[Out2,Out3,M](that:akka.stream.Graph[akka.stream.SourceShape[Out2],M],eagerComplete:Boolean)(combine:(Out,Out2)=>Out3):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out3],M] "Permalink")  def zipLatestWithGraph\[Out2, Out3, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], M], eagerComplete: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean))(combine: (Out, Out2) \=\> Out3): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out3], M]Attributesprotected
145. [**](../../../akka/stream/scaladsl/FlowOps.html#zipLatestWithGraph[Out2,Out3,M](that:akka.stream.Graph[akka.stream.SourceShape[Out2],M])(combine:(Out,Out2)=>Out3):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out3],M] "Permalink")  def zipLatestWithGraph\[Out2, Out3, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], M])(combine: (Out, Out2) \=\> Out3): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out3], M]Attributesprotected
146. [**](../../../akka/stream/scaladsl/FlowOps.html#zipWith[Out2,Out3](that:akka.stream.Graph[akka.stream.SourceShape[Out2],_])(combine:(Out,Out2)=>Out3):FlowOps.this.Repr[Out3] "Permalink")  def zipWith\[Out2, Out3](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], \_])(combine: (Out, Out2) \=\> Out3): [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[Out3]Put together the elements of current flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function.

Put together the elements of current flow and the given [Source](Source.html)
into a stream of combined elements using a combiner function.

**Emits when** all of the inputs have an element available

**Backpressures when** downstream backpressures

**Completes when** any upstream completes

**Cancels when** downstream cancels
147. [**](../../../akka/stream/scaladsl/FlowOps.html#zipWithGraph[Out2,Out3,M](that:akka.stream.Graph[akka.stream.SourceShape[Out2],M])(combine:(Out,Out2)=>Out3):akka.stream.Graph[akka.stream.FlowShape[Out@scala.annotation.unchecked.uncheckedVariance,Out3],M] "Permalink")  def zipWithGraph\[Out2, Out3, M](that: [Graph](../Graph.html)\[[SourceShape](../SourceShape.html)\[Out2], M])(combine: (Out, Out2) \=\> Out3): [Graph](../Graph.html)\[[FlowShape](../FlowShape.html)\[Out, Out3], M]Attributesprotected
148. [**](../../../akka/stream/scaladsl/FlowOps.html#zipWithIndex:FlowOps.this.Repr[(Out,Long)] "Permalink")  def zipWithIndex: [Repr](#Repr[+O]<:akka.stream.scaladsl.FlowOps[O,Mat]{typeRepr[+OO]=FlowOps.this.Repr[OO];typeClosed=FlowOps.this.Closed})\[(Out, [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))]Combine the elements of current flow into a stream of tuples consisting
of all elements paired with their index.

Combine the elements of current flow into a stream of tuples consisting
of all elements paired with their index. Indices start at 0\.

**Emits when** upstream emits an element and is paired with their index

**Backpressures when** downstream backpressures

**Completes when** upstream completes

**Cancels when** downstream cancels
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/FlowOps.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/FlowOps.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toStringFormat\[FlowOps\[Out, Mat]] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/FlowOps.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (FlowOps\[Out, Mat], B)ImplicitThis member is added by an implicit conversion from FlowOps\[Out, Mat] toArrowAssoc\[FlowOps\[Out, Mat]] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromFlowOps\[Out, Mat] to any2stringadd\[FlowOps\[Out, Mat]]

### Inherited by implicit conversion StringFormat fromFlowOps\[Out, Mat] to StringFormat\[FlowOps\[Out, Mat]]

### Inherited by implicit conversion Ensuring fromFlowOps\[Out, Mat] to Ensuring\[FlowOps\[Out, Mat]]

### Inherited by implicit conversion ArrowAssoc fromFlowOps\[Out, Mat] to ArrowAssoc\[FlowOps\[Out, Mat]]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Actor.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LogMarker.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/MarkerLoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/pattern/AskTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorAttributes$$SupervisionStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ActorAttributes$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$LogLevels.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes$$NestedMaterializationCancellationPolicy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Attributes.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/BackpressureTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/CompletionTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/DelayOverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/FlowShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Graph.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/InitialTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/OverflowStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SinkShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SourceShape.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/StreamIdleTimeoutException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/SubstreamCancelStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$$Restart$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$$Resume$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Supervision$$Stop$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ThrottleMode$$Enforcing$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ThrottleMode$$Shaping$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/ThrottleMode.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/WatchedActorTerminatedException.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/index.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Balance$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Balance.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Broadcast$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Broadcast.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BroadcastHub$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Compression$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Concat$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Concat.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/DelayStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/DelayStrategy.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/FileIO$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow$.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/FlowOps.html](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/FlowOps.html)*