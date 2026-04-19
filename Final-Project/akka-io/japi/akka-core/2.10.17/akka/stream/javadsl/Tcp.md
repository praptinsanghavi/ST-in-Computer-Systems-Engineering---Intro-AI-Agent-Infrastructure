---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:15:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.html
title: Tcp
---

# Tcp

## Content

Package [akka.stream.javadsl](package-summary.html)
## Class Tcp

- java.lang.Object
- - akka.stream.javadsl.Tcp

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class Tcp
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl")` | Represents an accepted incoming TCP connection. |
	| `static class` | `[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")` | Represents a prospective outgoing TCP connection. |
	| `static class` | `[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")` | Represents a prospective TCP server binding. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Tcp](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>>` | `[bind](#bind(java.lang.String,int))​(java.lang.String interface_,  int port)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") without specifying options. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>>` | `[bind](#bind(java.lang.String,int,int,java.lang.Iterable,boolean,java.util.Optional))​(java.lang.String interface_,  int port,  int backlog,  java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  java.util.Optional<java.time.Duration> idleTimeout)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>>` | `[bind](#bind(java.lang.String,int,int,java.lang.Iterable,boolean,scala.concurrent.duration.Duration))​(java.lang.String interface_,  int port,  int backlog,  java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  scala.concurrent.duration.Duration idleTimeout)` | Deprecated. Use bind that takes a java.time.Duration parameter instead. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>>` | `[bindWithTls](#bindWithTls(java.lang.String,int,java.util.function.Supplier))​(java.lang.String interface_,  int port,  java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`  where all incoming and outgoing bytes are passed through TLS. |
	| `[Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>>` | `[bindWithTls](#bindWithTls(java.lang.String,int,java.util.function.Supplier,int,java.lang.Iterable,java.util.Optional,java.util.function.Function,akka.stream.TLSClosing))​(java.lang.String interface_,  int port,  java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine,  int backlog,  java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  java.util.Optional<java.time.Duration> idleTimeout,  java.util.function.Function<javax.net.ssl.SSLSession,​java.util.Optional<java.lang.Throwable>> verifySession,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing)` | Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`  where all incoming and outgoing bytes are passed through TLS. |
	| `static [Tcp](Tcp.html "class in akka.stream.javadsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Tcp](Tcp.html "class in akka.stream.javadsl")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [Tcp](Tcp.html "class in akka.stream.javadsl")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [Tcp$](Tcp$.html "class in akka.stream.javadsl")` | `[lookup](#lookup())()` |  |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>>` | `[outgoingConnection](#outgoingConnection(java.lang.String,int))​(java.lang.String host,  int port)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") without specifying options. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>>` | `[outgoingConnection](#outgoingConnection(java.net.InetSocketAddress,java.util.Optional,java.lang.Iterable,boolean,java.util.Optional,java.util.Optional))​(java.net.InetSocketAddress remoteAddress,  java.util.Optional<java.net.InetSocketAddress> localAddress,  java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  java.util.Optional<java.time.Duration> connectTimeout,  java.util.Optional<java.time.Duration> idleTimeout)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") instance representing a prospective TCP client connection to the given endpoint. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>>` | `[outgoingConnection](#outgoingConnection(java.net.InetSocketAddress,java.util.Optional,java.lang.Iterable,boolean,scala.concurrent.duration.Duration,scala.concurrent.duration.Duration))​(java.net.InetSocketAddress remoteAddress,  java.util.Optional<java.net.InetSocketAddress> localAddress,  java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  boolean halfClose,  scala.concurrent.duration.Duration connectTimeout,  scala.concurrent.duration.Duration idleTimeout)` | Deprecated. Use bind that takes a java.time.Duration parameter instead. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>>` | `[outgoingConnectionWithTls](#outgoingConnectionWithTls(java.net.InetSocketAddress,java.util.function.Supplier))​(java.net.InetSocketAddress remoteAddress,  java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") with TLS. |
	| `[Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>>` | `[outgoingConnectionWithTls](#outgoingConnectionWithTls(java.net.InetSocketAddress,java.util.function.Supplier,java.util.Optional,java.lang.Iterable,java.util.Optional,java.util.Optional,java.util.function.Function,akka.stream.TLSClosing))​(java.net.InetSocketAddress remoteAddress,  java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine,  java.util.Optional<java.net.InetSocketAddress> localAddress,  java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,  java.util.Optional<java.time.Duration> connectTimeout,  java.util.Optional<java.time.Duration> idleTimeout,  java.util.function.Function<javax.net.ssl.SSLSession,​java.util.Optional<java.lang.Throwable>> verifySession,  [TLSClosing](../TLSClosing.html "class in akka.stream") closing)` | Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") with TLS. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Tcp
		
		
		
		```
		public Tcp​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.javadsl") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.javadsl") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [Tcp$](Tcp$.html "class in akka.stream.javadsl") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [Tcp](Tcp.html "class in akka.stream.javadsl") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### bind
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>> bind​(java.lang.String interface_,
		                                                                                                         int port,
		                                                                                                         int backlog,
		                                                                                                         java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                         boolean halfClose,
		                                                                                                         java.util.Optional<java.time.Duration> idleTimeout)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`.
		 
		 Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
		 [`RunnableGraph`](../scaladsl/RunnableGraph.html "class in akka.stream.scaladsl") the server is not immediately available. Only after the materialized future
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
		- #### bind
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>> bind​(java.lang.String interface_,
		                                                                                                         int port,
		                                                                                                         int backlog,
		                                                                                                         java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                         boolean halfClose,
		                                                                                                         scala.concurrent.duration.Duration idleTimeout)
		```
		
		Deprecated.
		Use bind that takes a java.time.Duration parameter instead. Since 2\.6\.0\.
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`.
		 
		 Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
		 [`RunnableGraph`](../scaladsl/RunnableGraph.html "class in akka.stream.scaladsl") the server is not immediately available. Only after the materialized future
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
		- #### bind
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>> bind​(java.lang.String interface_,
		                                                                                                         int port)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") without specifying options.
		 It represents a prospective TCP server binding on the given `endpoint`.
		 
		 Please note that the startup of the server is asynchronous, i.e. after materializing the enclosing
		 [`RunnableGraph`](../scaladsl/RunnableGraph.html "class in akka.stream.scaladsl") the server is not immediately available. Only after the materialized future
		 completes is the server ready to accept client connections.
		- #### outgoingConnection
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>> outgoingConnection​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                               java.util.Optional<java.net.InetSocketAddress> localAddress,
		                                                                                                                               java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                                               boolean halfClose,
		                                                                                                                               java.util.Optional<java.time.Duration> connectTimeout,
		                                                                                                                               java.util.Optional<java.time.Duration> idleTimeout)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") instance representing a prospective TCP client connection to the given endpoint.
		 
		 Note that the ByteString chunk boundaries are not retained across the network,
		 to achieve application level chunks you have to introduce explicit framing in your streams,
		 for example using the [`Framing`](Framing.html "class in akka.stream.javadsl") operators.
		 
		
		
		
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>> outgoingConnection​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                               java.util.Optional<java.net.InetSocketAddress> localAddress,
		                                                                                                                               java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                                               boolean halfClose,
		                                                                                                                               scala.concurrent.duration.Duration connectTimeout,
		                                                                                                                               scala.concurrent.duration.Duration idleTimeout)
		```
		
		Deprecated.
		Use bind that takes a java.time.Duration parameter instead. Since 2\.6\.0\.
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") instance representing a prospective TCP client connection to the given endpoint.
		 
		 Note that the ByteString chunk boundaries are not retained across the network,
		 to achieve application level chunks you have to introduce explicit framing in your streams,
		 for example using the [`Framing`](Framing.html "class in akka.stream.javadsl") operators.
		 
		
		
		
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
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>> outgoingConnection​(java.lang.String host,
		                                                                                                                               int port)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") without specifying options.
		 It represents a prospective TCP client connection to the given endpoint.
		 
		 Note that the ByteString chunk boundaries are not retained across the network,
		 to achieve application level chunks you have to introduce explicit framing in your streams,
		 for example using the [`Framing`](Framing.html "class in akka.stream.javadsl") operators.
		- #### outgoingConnectionWithTls
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>> outgoingConnectionWithTls​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                                      java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") with TLS.
		 The returned flow represents a TCP client connection to the given endpoint where all bytes in and
		 out go through TLS.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 client mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.outgoingConnection`
		- #### outgoingConnectionWithTls
		
		
		
		```
		public [Flow](Flow.html "class in akka.stream.javadsl")<[ByteString](../../util/ByteString.html "class in akka.util"),​[ByteString](../../util/ByteString.html "class in akka.util"),​java.util.concurrent.CompletionStage<[Tcp.OutgoingConnection](Tcp.OutgoingConnection.html "class in akka.stream.javadsl")>> outgoingConnectionWithTls​(java.net.InetSocketAddress remoteAddress,
		                                                                                                                                      java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine,
		                                                                                                                                      java.util.Optional<java.net.InetSocketAddress> localAddress,
		                                                                                                                                      java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                                                      java.util.Optional<java.time.Duration> connectTimeout,
		                                                                                                                                      java.util.Optional<java.time.Duration> idleTimeout,
		                                                                                                                                      java.util.function.Function<javax.net.ssl.SSLSession,​java.util.Optional<java.lang.Throwable>> verifySession,
		                                                                                                                                      [TLSClosing](../TLSClosing.html "class in akka.stream") closing)
		```
		
		Creates an [`Tcp.OutgoingConnection`](Tcp.OutgoingConnection.html "class in akka.stream.javadsl") with TLS.
		 The returned flow represents a TCP client connection to the given endpoint where all bytes in and
		 out go through TLS.
		 
		 You specify a factory to create an SSLEngine that must already be configured for
		 client mode and with all the parameters for the first session.
		 
		
		
		
		See Also:
		`Tcp.outgoingConnection`
		- #### bindWithTls
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>> bindWithTls​(java.lang.String interface_,
		                                                                                                                int port,
		                                                                                                                java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 where all incoming and outgoing bytes are passed through TLS.
		 
		
		See Also:
		`Tcp.bind`
		- #### bindWithTls
		
		
		
		```
		public [Source](Source.html "class in akka.stream.javadsl")<[Tcp.IncomingConnection](Tcp.IncomingConnection.html "class in akka.stream.javadsl"),​java.util.concurrent.CompletionStage<[Tcp.ServerBinding](Tcp.ServerBinding.html "class in akka.stream.javadsl")>> bindWithTls​(java.lang.String interface_,
		                                                                                                                int port,
		                                                                                                                java.util.function.Supplier<javax.net.ssl.SSLEngine> createSSLEngine,
		                                                                                                                int backlog,
		                                                                                                                java.lang.Iterable<[Inet.SocketOption](../../io/Inet.SocketOption.html "interface in akka.io")> options,
		                                                                                                                java.util.Optional<java.time.Duration> idleTimeout,
		                                                                                                                java.util.function.Function<javax.net.ssl.SSLSession,​java.util.Optional<java.lang.Throwable>> verifySession,
		                                                                                                                [TLSClosing](../TLSClosing.html "class in akka.stream") closing)
		```
		
		Creates a [`Tcp.ServerBinding`](Tcp.ServerBinding.html "class in akka.stream.javadsl") instance which represents a prospective TCP server binding on the given `endpoint`
		 where all incoming and outgoing bytes are passed through TLS.
		 
		
		See Also:
		`Tcp.bind`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Inet.SocketOption.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/io/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/TLSClosing.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Flow.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Framing.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.IncomingConnection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.OutgoingConnection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.ServerBinding.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/scaladsl/RunnableGraph.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/util/ByteString.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/stream/javadsl/Tcp.html)*