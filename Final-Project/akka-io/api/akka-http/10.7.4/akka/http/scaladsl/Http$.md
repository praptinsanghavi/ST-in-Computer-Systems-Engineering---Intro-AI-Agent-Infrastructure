---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.Http
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:54Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.Http
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.Http

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.Http

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/scaladsl/client/index.html "Permalink")  package [client](client/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/coding/index.html "Permalink")  package [coding](coding/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/common/index.html "Permalink")  package [common](common/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/model/index.html "Permalink")  package [model](model/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/server/index.html "Permalink")  package [server](server/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/settings/index.html "Permalink")  package [settings](settings/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)Definition Classes[scaladsl](index.html)
- [**](../../../akka/http/scaladsl/util/index.html "Permalink")  package [util](util/index.html)Definition Classes[scaladsl](index.html)
- [ClientTransport](ClientTransport.html "Abstraction to allow the creation of alternative transports to run HTTP on.")
- [ConnectionContext](ConnectionContext.html)
- Http
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.")
- [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection")
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
o[akka](../../index.html).[http](../index.html).[scaladsl](index.html)

# Http[**](../../../akka/http/scaladsl/Http$.html "Permalink")

### 

#### object Http extends [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)] with [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

Source[Http.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L830)Linear Supertypes[ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider), [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Http
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/http/scaladsl/Http$.html#ClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.HttpRequest,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.HttpResponse,akka.NotUsed] "Permalink")  type ClientLayer \= [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html#akka.stream.scaladsl.BidiFlow)\[[HttpRequest](model/HttpRequest.html), SslTlsOutbound, SslTlsInbound, [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]The type of the client\-side HTTP layer as a stand\-alone BidiFlow
that can be put atop the TCP layer to form an HTTP client.

The type of the client\-side HTTP layer as a stand\-alone BidiFlow
that can be put atop the TCP layer to form an HTTP client.

```
               +------+
HttpRequest  ~>|      |~> SslTlsOutbound
               | bidi |
HttpResponse <~|      |<~ SslTlsInbound
               +------+
```
2. [**](../../../akka/http/scaladsl/Http$$HostConnectionPool.html "Permalink") sealed abstract  class [HostConnectionPool](Http$$HostConnectionPool.html "Represents a connection pool to a specific target host and pool configuration.") extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)Represents a connection pool to a specific target host and pool configuration.

Represents a connection pool to a specific target host and pool configuration.

Not for user extension.

Annotations@DoNotInherit()
3. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated.html "Permalink") sealed abstract  class [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html) extends [HttpTerminated](Http$$HttpTerminated.html)
4. [**](../../../akka/http/scaladsl/Http$$HttpServerTerminated.html "Permalink") sealed abstract  class [HttpServerTerminated](Http$$HttpServerTerminated.html) extends [HttpTerminated](Http$$HttpTerminated.html)
5. [**](../../../akka/http/scaladsl/Http$$HttpTerminated.html "Permalink") sealed abstract  class [HttpTerminated](Http$$HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.") extends [javadsl.HttpTerminated](../javadsl/HttpTerminated.html)Type used to carry meaningful information when server termination has completed successfully.

Type used to carry meaningful information when server termination has completed successfully.

Annotations@DoNotInherit()
6. [**](../../../akka/http/scaladsl/Http$$IncomingConnection.html "Permalink") final  case class [IncomingConnection](Http$$IncomingConnection.html "Represents one accepted incoming HTTP connection.")(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), \_flow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpResponse](model/HttpResponse.html), [HttpRequest](model/HttpRequest.html), ServerTerminator]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresents one accepted incoming HTTP connection.
7. [**](../../../akka/http/scaladsl/Http$$OutgoingConnection.html "Permalink") final  case class [OutgoingConnection](Http$$OutgoingConnection.html "Represents a prospective outgoing HTTP connection.")(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), remoteAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresents a prospective outgoing HTTP connection.
8. [**](../../../akka/http/scaladsl/Http$$ServerBinding.html "Permalink") final  case class [ServerBinding](Http$$ServerBinding.html "Represents a prospective HTTP server binding.")(localAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress))(unbindAction: () \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)], terminateAction: ([FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpTerminated](Http$$HttpTerminated.html)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableRepresents a prospective HTTP server binding.

Represents a prospective HTTP server binding.

localAddressThe local address of the endpoint bound by the materialization of the `connections` [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html)
9. [**](../../../akka/http/scaladsl/Http$.html#ServerLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.HttpRequest,akka.NotUsed] "Permalink")  type ServerLayer \= [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html#akka.stream.scaladsl.BidiFlow)\[[HttpResponse](model/HttpResponse.html), SslTlsOutbound, SslTlsInbound, [HttpRequest](model/HttpRequest.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]The type of the server\-side HTTP layer as a stand\-alone BidiFlow
that can be put atop the TCP layer to form an HTTP server.

The type of the server\-side HTTP layer as a stand\-alone BidiFlow
that can be put atop the TCP layer to form an HTTP server.

```
               +------+
HttpResponse ~>|      |~> SslTlsOutbound
               | bidi |
HttpRequest  <~|      |<~ SslTlsInbound
               +------+
```
10. [**](../../../akka/http/scaladsl/Http$.html#WebSocketClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.ws.Message,scala.concurrent.Future[akka.http.scaladsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  type WebSocketClientLayer \= [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html#akka.stream.scaladsl.BidiFlow)\[[Message](model/ws/Message.html), SslTlsOutbound, SslTlsInbound, [Message](model/ws/Message.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]The type of the client\-side WebSocket layer as a stand\-alone BidiFlow
that can be put atop the TCP layer to form an HTTP client.

The type of the client\-side WebSocket layer as a stand\-alone BidiFlow
that can be put atop the TCP layer to form an HTTP client.

```
               +------+
ws.Message   ~>|      |~> SslTlsOutbound
               | bidi |
ws.Message   <~|      |<~ SslTlsInbound
               +------+
```
### Value Members

1. [**](../../../akka/http/scaladsl/Http$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/Http$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/Http$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/http/scaladsl/Http$.html#apply(system:akka.actor.ActorSystem):akka.http.scaladsl.HttpExt "Permalink")  def apply(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [HttpExt](HttpExt.html)Definition ClassesHttp → ExtensionId
5. [**](../../../akka/http/scaladsl/Http$.html#apply()(implicitsystem:akka.actor.ClassicActorSystemProvider):akka.http.scaladsl.HttpExt "Permalink")  def apply()(implicit system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [HttpExt](HttpExt.html)
6. [**](../../../akka/http/scaladsl/Http$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [HttpExt](HttpExt.html)Definition ClassesExtensionId
7. [**](../../../akka/http/scaladsl/Http$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
8. [**](../../../akka/http/scaladsl/Http$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/http/scaladsl/Http$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.http.scaladsl.HttpExt "Permalink")  def createExtension(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem)): [HttpExt](HttpExt.html)Definition ClassesHttp → ExtensionId
10. [**](../../../akka/http/scaladsl/Http$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
11. [**](../../../akka/http/scaladsl/Http$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesExtensionId → AnyRef → Any
12. [**](../../../akka/http/scaladsl/Http$.html#get(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def get(system: [ClassicActorSystemProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html#akka.actor.ClassicActorSystemProvider)): [HttpExt](HttpExt.html)Definition ClassesExtensionId
13. [**](../../../akka/http/scaladsl/Http$.html#get(system:akka.actor.ActorSystem):T "Permalink")  def get(system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [HttpExt](HttpExt.html)Definition ClassesExtensionId
14. [**](../../../akka/http/scaladsl/Http$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../akka/http/scaladsl/Http$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesExtensionId → AnyRef → Any
16. [**](../../../akka/http/scaladsl/Http$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/http/scaladsl/Http$.html#lookup:akka.http.scaladsl.Http.type "Permalink")  def lookup: HttpDefinition ClassesHttp → ExtensionIdProvider
18. [**](../../../akka/http/scaladsl/Http$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/http/scaladsl/Http$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/scaladsl/Http$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/http/scaladsl/Http$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
22. [**](../../../akka/http/scaladsl/Http$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/http/scaladsl/Http$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/http/scaladsl/Http$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/http/scaladsl/Http$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/http/scaladsl/Http$$HttpConnectionTerminated$.html "Permalink")  object [HttpConnectionTerminated](Http$$HttpConnectionTerminated$.html) extends [HttpConnectionTerminated](Http$$HttpConnectionTerminated.html)
27. [**](../../../akka/http/scaladsl/Http$$HttpServerTerminated$.html "Permalink")  object [HttpServerTerminated](Http$$HttpServerTerminated$.html) extends [HttpServerTerminated](Http$$HttpServerTerminated.html)
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/Http$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html#akka.actor.ExtensionIdProvider)

### Inherited from [ExtensionId](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html#akka.actor.ExtensionId)\[[HttpExt](HttpExt.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HostConnectionPool.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpConnectionTerminated$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpConnectionTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpServerTerminated$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpServerTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HttpTerminated.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$IncomingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$OutgoingConnection.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$ServerBinding.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$.html)*