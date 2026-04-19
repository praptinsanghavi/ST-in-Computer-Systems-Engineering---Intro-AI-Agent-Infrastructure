---
description: Akka 2.10.17 - akka.stream.scaladsl.Tcp
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:05:05Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/scaladsl/Tcp.html
title: Akka 2.10.17 - akka.stream.scaladsl.Tcp
---

# Akka 2.10.17 - akka.stream.scaladsl.Tcp

> **Summary:** Akka 2.10.17 - akka.stream.scaladsl.Tcp

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
- Tcp
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
[c](Tcp$.html "See companion object")[akka](../../index.html).[stream](../index.html).[scaladsl](index.html)

# [Tcp](Tcp$.html "See companion object")[**](../../../akka/stream/scaladsl/Tcp.html "Permalink")

### Companion [object Tcp](Tcp$.html "See companion object")

#### final  class Tcp extends [Extension](../../actor/Extension.html)

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/scaladsl/Tcp.scala#L100)Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Tcp
2. Extension
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/stream/scaladsl/Tcp.html#<init>(system:akka.actor.ExtendedActorSystem):akka.stream.scaladsl.Tcp "Permalink")  new Tcp(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/stream/scaladsl/Tcp.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/scaladsl/Tcp.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/scaladsl/Tcp.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Tcp toany2stringadd\[Tcp] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/scaladsl/Tcp.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Tcp, B)ImplicitThis member is added by an implicit conversion from Tcp toArrowAssoc\[Tcp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/scaladsl/Tcp.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/scaladsl/Tcp.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/scaladsl/Tcp.html#bind(interface:String,port:Int,backlog:Int,options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration):akka.stream.scaladsl.Source[akka.stream.scaladsl.Tcp.IncomingConnection,scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding]] "Permalink")  def bind(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [defaultBacklog](Tcp$.html), options: Traversable\[[SocketOption](../../io/Inet$$SocketOption.html)] \= Nil, halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`.

Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
[akka.stream.scaladsl.RunnableGraph](RunnableGraph.html) the server is not immediately available. Only after the materialized future
completes is the server ready to accept client connections.

interfaceThe interface to listen on

portThe port to listen on

backlogControls the size of the connection backlog

optionsTCP options for the connections, see [akka.io.Tcp](../../io/Tcp$.html) for details

halfClose
 Controls whether the connection is kept open even after writing has been completed to the accepted
 TCP connections.
 If set to true, the connection will implement the TCP half\-close mechanism, allowing the client to
 write to the connection even after the server has finished writing. The TCP socket is only closed
 after both the client and server finished writing.
 If set to false, the connection will immediately closed once the server closes its write side,
 independently whether the client is still attempting to write. This setting is recommended
 for servers, and therefore it is the default setting.
8. [**](../../../akka/stream/scaladsl/Tcp.html#bindAndHandle(handler:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,_],interface:String,port:Int,backlog:Int,options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration)(implicitm:akka.stream.Materializer):scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding] "Permalink")  def bindAndHandle(handler: [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), \_], interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= [defaultBacklog](Tcp$.html), options: Traversable\[[SocketOption](../../io/Inet$$SocketOption.html)] \= Nil, halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false, idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf)(implicit m: [Materializer](../Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Tcp$$ServerBinding.html)]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
handling the incoming connections using the provided Flow.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
handling the incoming connections using the provided Flow.

Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
[akka.stream.scaladsl.RunnableGraph](RunnableGraph.html) the server is not immediately available. Only after the returned future
completes is the server ready to accept client connections.

handlerA Flow that represents the server logic

interfaceThe interface to listen on

portThe port to listen on

backlogControls the size of the connection backlog

optionsTCP options for the connections, see [akka.io.Tcp](../../io/Tcp$.html) for details

halfClose
 Controls whether the connection is kept open even after writing has been completed to the accepted
 TCP connections.
 If set to true, the connection will implement the TCP half\-close mechanism, allowing the client to
 write to the connection even after the server has finished writing. The TCP socket is only closed
 after both the client and server finished writing.
 If set to false, the connection will immediately closed once the server closes its write side,
 independently whether the client is still attempting to write. This setting is recommended
 for servers, and therefore it is the default setting.
9. [**](../../../akka/stream/scaladsl/Tcp.html#bindAndHandleWithTls(handler:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,_],interface:String,port:Int,createSSLEngine:()=>javax.net.ssl.SSLEngine,backlog:Int,options:Seq[akka.io.Inet.SocketOption],idleTimeout:scala.concurrent.duration.Duration,verifySession:javax.net.ssl.SSLSession=>scala.util.Try[Unit],closing:akka.stream.TLSClosing)(implicitm:akka.stream.Materializer):scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding] "Permalink")  def bindAndHandleWithTls(handler: [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), \_], interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), createSSLEngine: () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), options: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[SocketOption](../../io/Inet$$SocketOption.html)], idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), verifySession: ([SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)) \=\> [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], closing: [TLSClosing](../TLSClosing.html))(implicit m: [Materializer](../Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Tcp$$ServerBinding.html)]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the
provided Flow.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the
provided Flow.

You specify a factory to create an SSLEngine that must already be configured for
server mode and with all the parameters for the first session.

See also[Tcp.bindAndHandle](#bindAndHandle(handler:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,_],interface:String,port:Int,backlog:Int,options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration)(implicitm:akka.stream.Materializer):scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding])
10. [**](../../../akka/stream/scaladsl/Tcp.html#bindAndHandleWithTls(handler:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,_],interface:String,port:Int,createSSLEngine:()=>javax.net.ssl.SSLEngine)(implicitm:akka.stream.Materializer):scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding] "Permalink")  def bindAndHandleWithTls(handler: [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), \_], interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), createSSLEngine: () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine))(implicit m: [Materializer](../Materializer.html)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Tcp$$ServerBinding.html)]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the
provided Flow.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the
provided Flow.

You specify a factory to create an SSLEngine that must already be configured for
server mode and with all the parameters for the first session.

See also[Tcp.bindAndHandle](#bindAndHandle(handler:akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,_],interface:String,port:Int,backlog:Int,options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration)(implicitm:akka.stream.Materializer):scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding])
11. [**](../../../akka/stream/scaladsl/Tcp.html#bindShutdownTimeout:scala.concurrent.duration.FiniteDuration "Permalink")  val bindShutdownTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)
12. [**](../../../akka/stream/scaladsl/Tcp.html#bindWithTls(interface:String,port:Int,createSSLEngine:()=>javax.net.ssl.SSLEngine,backlog:Int,options:Seq[akka.io.Inet.SocketOption],idleTimeout:scala.concurrent.duration.Duration,verifySession:javax.net.ssl.SSLSession=>scala.util.Try[Unit],closing:akka.stream.TLSClosing):akka.stream.scaladsl.Source[akka.stream.scaladsl.Tcp.IncomingConnection,scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding]] "Permalink")  def bindWithTls(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), createSSLEngine: () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), options: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[SocketOption](../../io/Inet$$SocketOption.html)], idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), verifySession: ([SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)) \=\> [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], closing: [TLSClosing](../TLSClosing.html)): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

You specify a factory to create an SSLEngine that must already be configured for
server mode and with all the parameters for the first session.

See also[Tcp.bind](#bind(interface:String,port:Int,backlog:Int,options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration):akka.stream.scaladsl.Source[akka.stream.scaladsl.Tcp.IncomingConnection,scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding]])
13. [**](../../../akka/stream/scaladsl/Tcp.html#bindWithTls(interface:String,port:Int,createSSLEngine:()=>javax.net.ssl.SSLEngine):akka.stream.scaladsl.Source[akka.stream.scaladsl.Tcp.IncomingConnection,scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding]] "Permalink")  def bindWithTls(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), createSSLEngine: () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

You specify a factory to create an SSLEngine that must already be configured for
server mode and with all the parameters for the first session.

See also[Tcp.bind](#bind(interface:String,port:Int,backlog:Int,options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration):akka.stream.scaladsl.Source[akka.stream.scaladsl.Tcp.IncomingConnection,scala.concurrent.Future[akka.stream.scaladsl.Tcp.ServerBinding]])
14. [**](../../../akka/stream/scaladsl/Tcp.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/stream/scaladsl/Tcp.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Tcp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/scaladsl/Tcp.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Tcp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/stream/scaladsl/Tcp.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/stream/scaladsl/Tcp.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/stream/scaladsl/Tcp.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/stream/scaladsl/Tcp.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
21. [**](../../../akka/stream/scaladsl/Tcp.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/stream/scaladsl/Tcp.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/scaladsl/Tcp.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
24. [**](../../../akka/stream/scaladsl/Tcp.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
25. [**](../../../akka/stream/scaladsl/Tcp.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/stream/scaladsl/Tcp.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
27. [**](../../../akka/stream/scaladsl/Tcp.html#outgoingConnection(host:String,port:Int):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.stream.scaladsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnection(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) without specifying options.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) without specifying options.
It represents a prospective TCP client connection to the given endpoint.

Note that the ByteString chunk boundaries are not retained across the network,
to achieve application level chunks you have to introduce explicit framing in your streams,
for example using the [Framing](Framing$.html) operators.
28. [**](../../../akka/stream/scaladsl/Tcp.html#outgoingConnection(remoteAddress:java.net.InetSocketAddress,localAddress:Option[java.net.InetSocketAddress],options:scala.collection.immutable.Traversable[akka.io.Inet.SocketOption],halfClose:Boolean,connectTimeout:scala.concurrent.duration.Duration,idleTimeout:scala.concurrent.duration.Duration):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.stream.scaladsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnection(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, options: Traversable\[[SocketOption](../../io/Inet$$SocketOption.html)] \= Nil, halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= true, connectTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf, idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration) \= Duration.Inf): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) instance representing a prospective TCP client connection to the given endpoint.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) instance representing a prospective TCP client connection to the given endpoint.

Note that the ByteString chunk boundaries are not retained across the network,
to achieve application level chunks you have to introduce explicit framing in your streams,
for example using the [Framing](Framing$.html) operators.

remoteAddressThe remote address to connect to

localAddressOptional local address for the connection

optionsTCP options for the connections, see [akka.io.Tcp](../../io/Tcp$.html) for details

halfClose
 Controls whether the connection is kept open even after writing has been completed to the accepted
 TCP connections.
 If set to true, the connection will implement the TCP half\-close mechanism, allowing the server to
 write to the connection even after the client has finished writing. The TCP socket is only closed
 after both the client and server finished writing. This setting is recommended for clients and
 therefore it is the default setting.
 If set to false, the connection will immediately closed once the client closes its write side,
 independently whether the server is still attempting to write.
29. [**](../../../akka/stream/scaladsl/Tcp.html#outgoingConnectionWithTls(remoteAddress:java.net.InetSocketAddress,createSSLEngine:()=>javax.net.ssl.SSLEngine,localAddress:Option[java.net.InetSocketAddress],options:Seq[akka.io.Inet.SocketOption],connectTimeout:scala.concurrent.duration.Duration,idleTimeout:scala.concurrent.duration.Duration,verifySession:javax.net.ssl.SSLSession=>scala.util.Try[Unit],closing:akka.stream.TLSClosing):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.stream.scaladsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnectionWithTls(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), createSSLEngine: () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], options: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[SocketOption](../../io/Inet$$SocketOption.html)], connectTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), verifySession: ([SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession)) \=\> [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], closing: [TLSClosing](../TLSClosing.html)): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.
The returned flow represents a TCP client connection to the given endpoint where all bytes in and
out go through TLS.

You specify a factory to create an SSLEngine that must already be configured for
client mode and with all the parameters for the first session.

See also[Tcp.outgoingConnection](#outgoingConnection(host:String,port:Int):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.stream.scaladsl.Tcp.OutgoingConnection]])
30. [**](../../../akka/stream/scaladsl/Tcp.html#outgoingConnectionWithTls(remoteAddress:java.net.InetSocketAddress,createSSLEngine:()=>javax.net.ssl.SSLEngine):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.stream.scaladsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnectionWithTls(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), createSSLEngine: () \=\> [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.
The returned flow represents a TCP client connection to the given endpoint where all bytes in and
out go through TLS.

You specify a factory to create an SSLEngine that must already be configured for
client mode and with all the parameters for the first session.

See also[Tcp.outgoingConnection](#outgoingConnection(host:String,port:Int):akka.stream.scaladsl.Flow[akka.util.ByteString,akka.util.ByteString,scala.concurrent.Future[akka.stream.scaladsl.Tcp.OutgoingConnection]])
31. [**](../../../akka/stream/scaladsl/Tcp.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
32. [**](../../../akka/stream/scaladsl/Tcp.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
33. [**](../../../akka/stream/scaladsl/Tcp.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
34. [**](../../../akka/stream/scaladsl/Tcp.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
35. [**](../../../akka/stream/scaladsl/Tcp.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/scaladsl/Tcp.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/stream/scaladsl/Tcp.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Tcp toStringFormat\[Tcp] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/stream/scaladsl/Tcp.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Tcp, B)ImplicitThis member is added by an implicit conversion from Tcp toArrowAssoc\[Tcp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTcp to any2stringadd\[Tcp]

### Inherited by implicit conversion StringFormat fromTcp to StringFormat\[Tcp]

### Inherited by implicit conversion Ensuring fromTcp to Ensuring\[Tcp]

### Inherited by implicit conversion ArrowAssoc fromTcp to ArrowAssoc\[Tcp]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/Actor.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/Extension.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka/current/akka/io/Tcp$.html
- https://doc.akka.io/api/akka/current/akka/stream/Materializer.html
- https://doc.akka.io/api/akka/current/akka/stream/TLSClosing.html
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
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeSequence.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/MergeSorted.html
- https://doc.akka.io/api/akka/current/akka/stream/scaladsl/OrElse$.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Tcp.html](https://doc.akka.io/api/akka/current/akka/stream/scaladsl/Tcp.html)*