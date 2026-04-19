---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:00:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.html
title: Tcp
---

# Tcp

## Content

Package [akka.stream.scaladsl](package-summary.html)
## Class Tcp

- java.lang.Object
- - akka.stream.scaladsl.Tcp

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public final class Tcp
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl")` | Represents an accepted incoming TCP connection. |
	| `static class` | `[Tcp.IncomingConnection$](Tcp.IncomingConnection$.html "class in akka.stream.scaladsl")` |  |
	| `static class` | `[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")` | Represents a prospective outgoing TCP connection. |
	| `static class` | `[Tcp.OutgoingConnection$](Tcp.OutgoingConnection$.html "class in akka.stream.scaladsl")` |  |
	| `static class` | `[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")` | Represents a successful TCP server binding. |
	| `static class` | `[Tcp.ServerBinding$](Tcp.ServerBinding$.html "class in akka.stream.scaladsl")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tcp](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Tcp](Tcp.html "class in akka.stream.scaladsl")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl"),​scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>>` | `[bind](#bind(java.lang.String,int,int,scala.collection.immutable.Iterable,boolean,scala.concurrent.duration.Duration))​(java.lang.String interface_,  int port,  int backlog,  scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  scala.concurrent.duration.Duration idleTimeout)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`. |
	| `int` | `[bind$default$3](#bind$default$3())()` |  |
	| `scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")>` | `[bind$default$4](#bind$default$4())()` |  |
	| `boolean` | `[bind$default$5](#bind$default$5())()` |  |
	| `scala.concurrent.duration.Duration` | `[bind$default$6](#bind$default$6())()` |  |
	| `scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>` | `[bindAndHandle](#bindAndHandle(akka.stream.scaladsl.Flow,java.lang.String,int,int,scala.collection.immutable.Iterable,boolean,scala.concurrent.duration.Duration,akka.stream.Materializer))​([Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​?> handler,  java.lang.String interface_,  int port,  int backlog,  scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  scala.concurrent.duration.Duration idleTimeout,  [Materializer](../Materializer.html "class in akka.stream") m)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`  handling the incoming connections using the provided Flow. |
	| `int` | `[bindAndHandle$default$4](#bindAndHandle$default$4())()` |  |
	| `scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")>` | `[bindAndHandle$default$5](#bindAndHandle$default$5())()` |  |
	| `boolean` | `[bindAndHandle$default$6](#bindAndHandle$default$6())()` |  |
	| `scala.concurrent.duration.Duration` | `[bindAndHandle$default$7](#bindAndHandle$default$7())()` |  |
	| `scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>` | `[bindAndHandleWithTls](#bindAndHandleWithTls(akka.stream.scaladsl.Flow,java.lang.String,int,scala.Function0,int,scala.collection.immutable.Seq,scala.concurrent.duration.Duration,scala.Function1,akka.stream.TLSClosing,akka.stream.Materializer))​([Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​?> handler,  java.lang.String interface_,  int port,  scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,  int backlog,  scala.collection.immutable.Seq<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  scala.concurrent.duration.Duration idleTimeout,  scala.Function1<javax.net.ssl.SSLSession,​scala.util.Try<scala.runtime.BoxedUnit>> verifySession,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing,  [Materializer](../Materializer.html "class in akka.stream") m)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`  all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the  provided Flow. |
	| `scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>` | `[bindAndHandleWithTls](#bindAndHandleWithTls(akka.stream.scaladsl.Flow,java.lang.String,int,scala.Function0,akka.stream.Materializer))​([Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​?> handler,  java.lang.String interface_,  int port,  scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,  [Materializer](../Materializer.html "class in akka.stream") m)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`  all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the  provided Flow. |
	| `scala.concurrent.duration.FiniteDuration` | `[bindShutdownTimeout](#bindShutdownTimeout())()` |  |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl"),​scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>>` | `[bindWithTls](#bindWithTls(java.lang.String,int,scala.Function0))​(java.lang.String interface_,  int port,  scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`  where all incoming and outgoing bytes are passed through TLS. |
	| `[Source](Source.html "class in akka.stream.scaladsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl"),​scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>>` | `[bindWithTls](#bindWithTls(java.lang.String,int,scala.Function0,int,scala.collection.immutable.Seq,scala.concurrent.duration.Duration,scala.Function1,akka.stream.TLSClosing))​(java.lang.String interface_,  int port,  scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,  int backlog,  scala.collection.immutable.Seq<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  scala.concurrent.duration.Duration idleTimeout,  scala.Function1<javax.net.ssl.SSLSession,​scala.util.Try<scala.runtime.BoxedUnit>> verifySession,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`  where all incoming and outgoing bytes are passed through TLS. |
	| `static [Tcp](Tcp.html "class in akka.stream.scaladsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Tcp](Tcp.html "class in akka.stream.scaladsl")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [Tcp](Tcp.html "class in akka.stream.scaladsl")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [Tcp$](Tcp$.html "class in akka.stream.scaladsl")` | `[lookup](#lookup())()` |  |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>>` | `[outgoingConnection](#outgoingConnection(java.lang.String,int))​(java.lang.String host,  int port)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") without specifying options. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>>` | `[outgoingConnection](#outgoingConnection(java.net.InetSocketAddress,scala.Option,scala.collection.immutable.Iterable,boolean,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration))​(java.net.InetSocketAddress remoteAddress,  scala.Option<java.net.InetSocketAddress> localAddress,  scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  scala.concurrent.duration.Duration connectTimeout,  scala.concurrent.duration.Duration idleTimeout)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") instance representing a prospective TCP client connection to the given endpoint. |
	| `scala.Option<java.net.InetSocketAddress>` | `[outgoingConnection$default$2](#outgoingConnection$default$2())()` |  |
	| `scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")>` | `[outgoingConnection$default$3](#outgoingConnection$default$3())()` |  |
	| `boolean` | `[outgoingConnection$default$4](#outgoingConnection$default$4())()` |  |
	| `scala.concurrent.duration.Duration` | `[outgoingConnection$default$5](#outgoingConnection$default$5())()` |  |
	| `scala.concurrent.duration.Duration` | `[outgoingConnection$default$6](#outgoingConnection$default$6())()` |  |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>>` | `[outgoingConnectionWithTls](#outgoingConnectionWithTls(java.net.InetSocketAddress,scala.Function0))​(java.net.InetSocketAddress remoteAddress,  scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") with TLS. |
	| `[Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>>` | `[outgoingConnectionWithTls](#outgoingConnectionWithTls(java.net.InetSocketAddress,scala.Function0,scala.Option,scala.collection.immutable.Seq,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration,scala.Function1,akka.stream.TLSClosing))​(java.net.InetSocketAddress remoteAddress,  scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,  scala.Option<java.net.InetSocketAddress> localAddress,  scala.collection.immutable.Seq<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  scala.concurrent.duration.Duration connectTimeout,  scala.concurrent.duration.Duration idleTimeout,  scala.Function1<javax.net.ssl.SSLSession,​scala.util.Try<scala.runtime.BoxedUnit>> verifySession,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") with TLS. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Tcp
		
		
		
		```
		public Tcp​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.scaladsl") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.scaladsl") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.scaladsl") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [Tcp$](Tcp$.html "class in akka.stream.scaladsl") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.scaladsl") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### bindShutdownTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration bindShutdownTimeout()
		```
		- #### bind
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl"),​scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>> bind​(java.lang.String interface_,
		                                                                                            int port,
		                                                                                            int backlog,
		                                                                                            scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                            boolean halfClose,
		                                                                                            scala.concurrent.duration.Duration idleTimeout)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`.
		 
		 Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
		 [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") the server is not immediately available. Only after the materialized future
		 completes is the server ready to accept client connections.
		 
		
		
		
		Parameters:
		`interface` \- The interface to listen on
		`port` \- The port to listen on
		`backlog` \- Controls the size of the connection backlog
		`options` \- TCP options for the connections, see [`Tcp`](../../io/Tcp.html "class in akka.io") for details
		`halfClose` \- Controls whether the connection is kept open even after writing has been completed to the accepted
		 TCP connections.
		 If set to true, the connection will implement the TCP half\-close mechanism, allowing the client to
		 write to the connection even after the server has finished writing. The TCP socket is only closed
		 after both the client and server finished writing.
		 If set to false, the connection will immediately closed once the server closes its write side,
		 independently whether the client is still attempting to write. This setting is recommended
		 for servers, and therefore it is the default setting.
		- #### bind$default$3
		
		
		
		```
		public int bind$default$3()
		```
		- #### bind$default$4
		
		
		
		```
		public scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> bind$default$4()
		```
		- #### bind$default$5
		
		
		
		```
		public boolean bind$default$5()
		```
		- #### bind$default$6
		
		
		
		```
		public scala.concurrent.duration.Duration bind$default$6()
		```
		- #### bindAndHandle
		
		
		
		```
		public scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")> bindAndHandle​([Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​?> handler,
		                                                                java.lang.String interface_,
		                                                                int port,
		                                                                int backlog,
		                                                                scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                boolean halfClose,
		                                                                scala.concurrent.duration.Duration idleTimeout,
		                                                                [Materializer](../Materializer.html "class in akka.stream") m)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 handling the incoming connections using the provided Flow.
		 
		 Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
		 [`RunnableGraph`](RunnableGraph.html "class in akka.stream.scaladsl") the server is not immediately available. Only after the returned future
		 completes is the server ready to accept client connections.
		 
		
		
		
		Parameters:
		`handler` \- A Flow that represents the server logic
		`interface` \- The interface to listen on
		`port` \- The port to listen on
		`backlog` \- Controls the size of the connection backlog
		`options` \- TCP options for the connections, see [`Tcp`](../../io/Tcp.html "class in akka.io") for details
		`halfClose` \- Controls whether the connection is kept open even after writing has been completed to the accepted
		 TCP connections.
		 If set to true, the connection will implement the TCP half\-close mechanism, allowing the client to
		 write to the connection even after the server has finished writing. The TCP socket is only closed
		 after both the client and server finished writing.
		 If set to false, the connection will immediately closed once the server closes its write side,
		 independently whether the client is still attempting to write. This setting is recommended
		 for servers, and therefore it is the default setting.
		- #### bindAndHandle$default$4
		
		
		
		```
		public int bindAndHandle$default$4()
		```
		- #### bindAndHandle$default$5
		
		
		
		```
		public scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> bindAndHandle$default$5()
		```
		- #### bindAndHandle$default$6
		
		
		
		```
		public boolean bindAndHandle$default$6()
		```
		- #### bindAndHandle$default$7
		
		
		
		```
		public scala.concurrent.duration.Duration bindAndHandle$default$7()
		```
		- #### outgoingConnection
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>> outgoingConnection​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                  scala.Option<java.net.InetSocketAddress> localAddress,
		                                                                                                                  scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                                  boolean halfClose,
		                                                                                                                  scala.concurrent.duration.Duration connectTimeout,
		                                                                                                                  scala.concurrent.duration.Duration idleTimeout)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") instance representing a prospective TCP client connection to the given endpoint.
		 
		 Note that the ByteString chunk boundaries are not retained across the network,
		 to achieve application level chunks you have to introduce explicit framing in your streams,
		 for example using the [`Framing`](Framing.html "class in akka.stream.scaladsl") operators.
		 
		
		
		
		Parameters:
		`remoteAddress` \- The remote address to connect to
		`localAddress` \- Optional local address for the connection
		`options` \- TCP options for the connections, see [`Tcp`](../../io/Tcp.html "class in akka.io") for details
		`halfClose` \- Controls whether the connection is kept open even after writing has been completed to the accepted
		 TCP connections.
		 If set to true, the connection will implement the TCP half\-close mechanism, allowing the server to
		 write to the connection even after the client has finished writing. The TCP socket is only closed
		 after both the client and server finished writing. This setting is recommended for clients and
		 therefore it is the default setting.
		 If set to false, the connection will immediately closed once the client closes its write side,
		 independently whether the server is still attempting to write.
		- #### outgoingConnection
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>> outgoingConnection​(java.lang.String host,
		                                                                                                                  int port)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") without specifying options.
		 It represents a prospective TCP client connection to the given endpoint.
		 
		 Note that the ByteString chunk boundaries are not retained across the network,
		 to achieve application level chunks you have to introduce explicit framing in your streams,
		 for example using the [`Framing`](Framing.html "class in akka.stream.scaladsl") operators.
		- #### outgoingConnection$default$2
		
		
		
		```
		public scala.Option<java.net.InetSocketAddress> outgoingConnection$default$2()
		```
		- #### outgoingConnection$default$3
		
		
		
		```
		public scala.collection.immutable.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> outgoingConnection$default$3()
		```
		- #### outgoingConnection$default$4
		
		
		
		```
		public boolean outgoingConnection$default$4()
		```
		- #### outgoingConnection$default$5
		
		
		
		```
		public scala.concurrent.duration.Duration outgoingConnection$default$5()
		```
		- #### outgoingConnection$default$6
		
		
		
		```
		public scala.concurrent.duration.Duration outgoingConnection$default$6()
		```
		- #### outgoingConnectionWithTls
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>> outgoingConnectionWithTls​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                         scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") with TLS.
		 The returned flow represents a TCP client connection to the given endpoint where all bytes in and
		 out go through TLS.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 client mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.outgoingConnection`
		- #### outgoingConnectionWithTls
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​scala.concurrent.Future<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl")>> outgoingConnectionWithTls​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                         scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,
		                                                                                                                         scala.Option<java.net.InetSocketAddress> localAddress,
		                                                                                                                         scala.collection.immutable.Seq<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                                         scala.concurrent.duration.Duration connectTimeout,
		                                                                                                                         scala.concurrent.duration.Duration idleTimeout,
		                                                                                                                         scala.Function1<javax.net.ssl.SSLSession,​scala.util.Try<scala.runtime.BoxedUnit>> verifySession,
		                                                                                                                         [TLSClosing](../TLSClosing.html "class in akka.stream") closing)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.scaladsl") with TLS.
		 The returned flow represents a TCP client connection to the given endpoint where all bytes in and
		 out go through TLS.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 client mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.outgoingConnection`
		- #### bindWithTls
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl"),​scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>> bindWithTls​(java.lang.String interface_,
		                                                                                                   int port,
		                                                                                                   scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 where all incoming and outgoing bytes are passed through TLS.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 server mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.bind`
		- #### bindWithTls
		
		
		
		```
		public [Source](Source.html "class in akka.stream.scaladsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.scaladsl"),​scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")>> bindWithTls​(java.lang.String interface_,
		                                                                                                   int port,
		                                                                                                   scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,
		                                                                                                   int backlog,
		                                                                                                   scala.collection.immutable.Seq<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                   scala.concurrent.duration.Duration idleTimeout,
		                                                                                                   scala.Function1<javax.net.ssl.SSLSession,​scala.util.Try<scala.runtime.BoxedUnit>> verifySession,
		                                                                                                   [TLSClosing](../TLSClosing.html "class in akka.stream") closing)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 where all incoming and outgoing bytes are passed through TLS.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 server mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.bind`
		- #### bindAndHandleWithTls
		
		
		
		```
		public scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")> bindAndHandleWithTls​([Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​?> handler,
		                                                                       java.lang.String interface_,
		                                                                       int port,
		                                                                       scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,
		                                                                       [Materializer](../Materializer.html "class in akka.stream") m)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the
		 provided Flow.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 server mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.bindAndHandle`
		- #### bindAndHandleWithTls
		
		
		
		```
		public scala.concurrent.Future<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.scaladsl")> bindAndHandleWithTls​([Flow](Flow.html "class in akka.stream.scaladsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​?> handler,
		                                                                       java.lang.String interface_,
		                                                                       int port,
		                                                                       scala.Function0<javax.net.ssl.SSLEngine> createSSLEngine,
		                                                                       int backlog,
		                                                                       scala.collection.immutable.Seq<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                       scala.concurrent.duration.Duration idleTimeout,
		                                                                       scala.Function1<javax.net.ssl.SSLSession,​scala.util.Try<scala.runtime.BoxedUnit>> verifySession,
		                                                                       [TLSClosing](../TLSClosing.html "class in akka.stream") closing,
		                                                                       [Materializer](../Materializer.html "class in akka.stream") m)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.scaladsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 all incoming and outgoing bytes are passed through TLS and handling the incoming connections using the
		 provided Flow.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 server mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.bindAndHandle`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka-core/2.10/akka/io/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/Materializer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/TLSClosing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Framing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.IncomingConnection$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.IncomingConnection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.OutgoingConnection$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.OutgoingConnection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.ServerBinding$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.ServerBinding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.html](https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Tcp.html)*