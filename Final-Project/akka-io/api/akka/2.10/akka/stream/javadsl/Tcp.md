---
description: Akka 2.10.17 - akka.stream.javadsl.Tcp
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:59:12Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/stream/javadsl/Tcp.html
title: Akka 2.10.17 - akka.stream.javadsl.Tcp
---

# Akka 2.10.17 - akka.stream.javadsl.Tcp

> **Summary:** Akka 2.10.17 - akka.stream.javadsl.Tcp

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
- Tcp
- [ThrottleControl](ThrottleControl.html "Control the throttle rate from the outside of the stream, or share a common throttle rate across several streams.")
- [Unzip](Unzip$.html "Takes a stream of pair elements and splits each pair to two output streams.")
- [UnzipWith](UnzipWith$.html "Split one stream into several streams using a splitting function.")
- [Zip](Zip$.html "Combine the elements of 2 streams into a stream of tuples.")
- [ZipLatest](ZipLatest$.html "Combine the elements of 2 streams into a stream of tuples, picking always the latest element of each.")
- [ZipLatestWith](ZipLatestWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function, picking always the latest of the elements of each source.")
- [ZipN](ZipN$.html "Combine the elements of multiple streams into a stream of lists.")
- [ZipWith](ZipWith$.html "Combine the elements of multiple streams into a stream of combined elements using a combiner function.")
- [ZipWithN](ZipWithN$.html "Combine the elements of multiple streams into a stream of lists using a combiner function.")
[c](Tcp$.html "See companion object")[akka](../../index.html).[stream](../index.html).[javadsl](index.html)

# [Tcp](Tcp$.html "See companion object")[**](../../../akka/stream/javadsl/Tcp.html "Permalink")

### Companion [object Tcp](Tcp$.html "See companion object")

#### class Tcp extends [Extension](../../actor/Extension.html)

Source[Tcp.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-stream/src/main/scala/akka/stream/javadsl/Tcp.scala#L138)Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
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

1. [**](../../../akka/stream/javadsl/Tcp.html#<init>(system:akka.actor.ExtendedActorSystem):akka.stream.javadsl.Tcp "Permalink")  new Tcp(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/stream/javadsl/Tcp.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/stream/javadsl/Tcp.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/stream/javadsl/Tcp.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Tcp toany2stringadd\[Tcp] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/stream/javadsl/Tcp.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Tcp, B)ImplicitThis member is added by an implicit conversion from Tcp toArrowAssoc\[Tcp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/stream/javadsl/Tcp.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/stream/javadsl/Tcp.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/stream/javadsl/Tcp.html#bind(interface:String,port:Int):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]] "Permalink")  def bind(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) without specifying options.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) without specifying options.
It represents a prospective TCP server binding on the given `endpoint`.

Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
[akka.stream.scaladsl.RunnableGraph](../scaladsl/RunnableGraph.html) the server is not immediately available. Only after the materialized future
completes is the server ready to accept client connections.
8. [**](../../../akka/stream/javadsl/Tcp.html#bind(interface:String,port:Int,backlog:Int,options:Iterable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:java.util.Optional[java.time.Duration]):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]] "Permalink")  def bind(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](../../io/Inet$$SocketOption.html)], halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), idleTimeout: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`.

Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
[akka.stream.scaladsl.RunnableGraph](../scaladsl/RunnableGraph.html) the server is not immediately available. Only after the materialized future
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
9. [**](../../../akka/stream/javadsl/Tcp.html#bindWithTls(interface:String,port:Int,createSSLEngine:java.util.function.Supplier[javax.net.ssl.SSLEngine],backlog:Int,options:Iterable[akka.io.Inet.SocketOption],idleTimeout:java.util.Optional[java.time.Duration],verifySession:java.util.function.Function[javax.net.ssl.SSLSession,java.util.Optional[Throwable]],closing:akka.stream.TLSClosing):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]] "Permalink")  def bindWithTls(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), createSSLEngine: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)], backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](../../io/Inet$$SocketOption.html)], idleTimeout: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)], verifySession: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]], closing: [TLSClosing](../TLSClosing.html)): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

See also[Tcp.bind](#bind(interface:String,port:Int):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]])
10. [**](../../../akka/stream/javadsl/Tcp.html#bindWithTls(interface:String,port:Int,createSSLEngine:java.util.function.Supplier[javax.net.ssl.SSLEngine]):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]] "Permalink")  def bindWithTls(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), createSSLEngine: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)]): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`
where all incoming and outgoing bytes are passed through TLS.

See also[Tcp.bind](#bind(interface:String,port:Int):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]])
11. [**](../../../akka/stream/javadsl/Tcp.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/stream/javadsl/Tcp.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Tcp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/stream/javadsl/Tcp.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Tcp) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
14. [**](../../../akka/stream/javadsl/Tcp.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/stream/javadsl/Tcp.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): TcpImplicitThis member is added by an implicit conversion from Tcp toEnsuring\[Tcp] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/stream/javadsl/Tcp.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/stream/javadsl/Tcp.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
18. [**](../../../akka/stream/javadsl/Tcp.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/stream/javadsl/Tcp.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/stream/javadsl/Tcp.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
21. [**](../../../akka/stream/javadsl/Tcp.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
22. [**](../../../akka/stream/javadsl/Tcp.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
23. [**](../../../akka/stream/javadsl/Tcp.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
24. [**](../../../akka/stream/javadsl/Tcp.html#outgoingConnection(host:String,port:Int):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnection(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) without specifying options.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) without specifying options.
It represents a prospective TCP client connection to the given endpoint.

Note that the ByteString chunk boundaries are not retained across the network,
to achieve application level chunks you have to introduce explicit framing in your streams,
for example using the [Framing](Framing$.html) operators.
25. [**](../../../akka/stream/javadsl/Tcp.html#outgoingConnection(remoteAddress:java.net.InetSocketAddress,localAddress:java.util.Optional[java.net.InetSocketAddress],options:Iterable[akka.io.Inet.SocketOption],halfClose:Boolean,connectTimeout:java.util.Optional[java.time.Duration],idleTimeout:java.util.Optional[java.time.Duration]):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnection(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](../../io/Inet$$SocketOption.html)], halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), connectTimeout: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)], idleTimeout: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)]): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) instance representing a prospective TCP client connection to the given endpoint.

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
26. [**](../../../akka/stream/javadsl/Tcp.html#outgoingConnectionWithTls(remoteAddress:java.net.InetSocketAddress,createSSLEngine:java.util.function.Supplier[javax.net.ssl.SSLEngine],localAddress:java.util.Optional[java.net.InetSocketAddress],options:Iterable[akka.io.Inet.SocketOption],connectTimeout:java.util.Optional[java.time.Duration],idleTimeout:java.util.Optional[java.time.Duration],verifySession:java.util.function.Function[javax.net.ssl.SSLSession,java.util.Optional[Throwable]],closing:akka.stream.TLSClosing):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnectionWithTls(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), createSSLEngine: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)], localAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](../../io/Inet$$SocketOption.html)], connectTimeout: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)], idleTimeout: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[Duration](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/Duration.html#java.time.Duration)], verifySession: [Function](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Function.html#java.util.function.Function)\[[SSLSession](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLSession.html#javax.net.ssl.SSLSession), [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[Throwable]], closing: [TLSClosing](../TLSClosing.html)): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.
The returned flow represents a TCP client connection to the given endpoint where all bytes in and
out go through TLS.

You specify a factory to create an SSLEngine that must already be configured for
client mode and with all the parameters for the first session.

See also[Tcp.outgoingConnection](#outgoingConnection(host:String,port:Int):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]])
27. [**](../../../akka/stream/javadsl/Tcp.html#outgoingConnectionWithTls(remoteAddress:java.net.InetSocketAddress,createSSLEngine:java.util.function.Supplier[javax.net.ssl.SSLEngine]):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnectionWithTls(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), createSSLEngine: [Supplier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/Supplier.html#java.util.function.Supplier)\[[SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)]): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.

Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) with TLS.
The returned flow represents a TCP client connection to the given endpoint where all bytes in and
out go through TLS.

You specify a factory to create an SSLEngine that must already be configured for
client mode and with all the parameters for the first session.

See also[Tcp.outgoingConnection](#outgoingConnection(host:String,port:Int):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]])
28. [**](../../../akka/stream/javadsl/Tcp.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
29. [**](../../../akka/stream/javadsl/Tcp.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
30. [**](../../../akka/stream/javadsl/Tcp.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/stream/javadsl/Tcp.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/stream/javadsl/Tcp.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/stream/javadsl/Tcp.html#bind(interface:String,port:Int,backlog:Int,options:Iterable[akka.io.Inet.SocketOption],halfClose:Boolean,idleTimeout:scala.concurrent.duration.Duration):akka.stream.javadsl.Source[akka.stream.javadsl.Tcp.IncomingConnection,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.ServerBinding]] "Permalink")  def bind(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), backlog: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](../../io/Inet$$SocketOption.html)], halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Source](Source.html)\[[IncomingConnection](Tcp$$IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](Tcp$$ServerBinding.html)]]Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`.

Creates a [Tcp.ServerBinding](Tcp$$ServerBinding.html) instance which represents a prospective TCP server binding on the given `endpoint`.

Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
[akka.stream.scaladsl.RunnableGraph](../scaladsl/RunnableGraph.html) the server is not immediately available. Only after the materialized future
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

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use bind that takes a java.time.Duration parameter instead.
2. [**](../../../akka/stream/javadsl/Tcp.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
3. [**](../../../akka/stream/javadsl/Tcp.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Tcp toStringFormat\[Tcp] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
4. [**](../../../akka/stream/javadsl/Tcp.html#outgoingConnection(remoteAddress:java.net.InetSocketAddress,localAddress:java.util.Optional[java.net.InetSocketAddress],options:Iterable[akka.io.Inet.SocketOption],halfClose:Boolean,connectTimeout:scala.concurrent.duration.Duration,idleTimeout:scala.concurrent.duration.Duration):akka.stream.javadsl.Flow[akka.util.ByteString,akka.util.ByteString,java.util.concurrent.CompletionStage[akka.stream.javadsl.Tcp.OutgoingConnection]] "Permalink")  def outgoingConnection(remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), localAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], options: [Iterable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Iterable.html#java.lang.Iterable)\[[SocketOption](../../io/Inet$$SocketOption.html)], halfClose: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), connectTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration), idleTimeout: [Duration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/Duration.html#scala.concurrent.duration.Duration)): [Flow](Flow.html)\[[ByteString](../../util/ByteString.html), [ByteString](../../util/ByteString.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](Tcp$$OutgoingConnection.html)]]Creates an [Tcp.OutgoingConnection](Tcp$$OutgoingConnection.html) instance representing a prospective TCP client connection to the given endpoint.

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

Annotations@deprecated Deprecated*(Since version 2\.6\.0\)* Use bind that takes a java.time.Duration parameter instead.
5. [**](../../../akka/stream/javadsl/Tcp.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Tcp, B)ImplicitThis member is added by an implicit conversion from Tcp toArrowAssoc\[Tcp] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromTcp to any2stringadd\[Tcp]

### Inherited by implicit conversion StringFormat fromTcp to StringFormat\[Tcp]

### Inherited by implicit conversion Ensuring fromTcp to Ensuring\[Tcp]

### Inherited by implicit conversion ArrowAssoc fromTcp to ArrowAssoc\[Tcp]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/Extension.html
- https://doc.akka.io/api/akka/2.10/akka/index.html
- https://doc.akka.io/api/akka/2.10/akka/io/Inet$$SocketOption.html
- https://doc.akka.io/api/akka/2.10/akka/io/Tcp$.html
- https://doc.akka.io/api/akka/2.10/akka/stream/TLSClosing.html
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

---
*Source: [https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Tcp.html](https://doc.akka.io/api/akka/2.10/akka/stream/javadsl/Tcp.html)*