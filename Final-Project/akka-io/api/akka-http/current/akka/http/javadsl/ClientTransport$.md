---
description: Akka HTTP 10.7.4 - akka.http.javadsl.ClientTransport
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport$.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.ClientTransport
---

# Akka HTTP 10.7.4 - akka.http.javadsl.ClientTransport

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.ClientTransport

## Content

Akka HTTP10\.7\.4 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/http/index.html "Permalink")  package [http](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/http/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[http](../index.html)
- [**](../../../akka/http/javadsl/coding/index.html "Permalink")  package [coding](coding/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/common/index.html "Permalink")  package [common](common/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/marshallers/index.html "Permalink")  package [marshallers](marshallers/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/marshalling/index.html "Permalink")  package [marshalling](marshalling/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/model/index.html "Permalink")  package [model](model/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/server/index.html "Permalink")  package [server](server/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/settings/index.html "Permalink")  package [settings](settings/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[javadsl](index.html)
- [**](../../../akka/http/javadsl/unmarshalling/index.html "Permalink")  package [unmarshalling](unmarshalling/index.html)Definition Classes[javadsl](index.html)
- [ClientTransport](ClientTransport.html "SPI for implementors of custom client transports.")
- [ConnectHttp](ConnectHttp.html)
- [ConnectHttpImpl](ConnectHttpImpl.html "INTERNAL API")
- [ConnectHttpsImpl](ConnectHttpsImpl.html "INTERNAL API")
- [ConnectWithHttps](ConnectWithHttps.html)
- [ConnectionContext](ConnectionContext.html)
- [HandlerProvider](HandlerProvider.html "A HandlerProvider can provide an asynchronous request handler given an ClassicActorSystemProvider.")
- [HostConnectionPool](HostConnectionPool.html)
- [Http](Http.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpTerminated](HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [HttpsConnectionContext](HttpsConnectionContext.html)
- [IncomingConnection](IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](OutgoingConnection.html)
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBinding](ServerBinding.html "Represents a prospective HTTP server binding.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
[o](ClientTransport.html "See companion class")[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# [ClientTransport](ClientTransport.html "See companion class")[**](../../../akka/http/javadsl/ClientTransport$.html "Permalink")

### Companion [class ClientTransport](ClientTransport.html "See companion class")

#### object ClientTransport

Entry point to create or access predefined client transports.

Source[ClientTransport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ClientTransport.scala#L34)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClientTransport
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/http/javadsl/ClientTransport$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/ClientTransport$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/ClientTransport$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/http/javadsl/ClientTransport$.html#TCP:akka.http.javadsl.ClientTransport "Permalink")  def TCP: [ClientTransport](ClientTransport.html)
5. [**](../../../akka/http/javadsl/ClientTransport$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/http/javadsl/ClientTransport$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/http/javadsl/ClientTransport$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/http/javadsl/ClientTransport$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/http/javadsl/ClientTransport$.html#fromScala(scalaTransport:akka.http.scaladsl.ClientTransport):akka.http.javadsl.ClientTransport "Permalink")  def fromScala(scalaTransport: [scaladsl.ClientTransport](../scaladsl/ClientTransport.html)): [ClientTransport](ClientTransport.html)
10. [**](../../../akka/http/javadsl/ClientTransport$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/http/javadsl/ClientTransport$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/http/javadsl/ClientTransport$.html#httpsProxy(proxyCredentials:akka.http.javadsl.model.headers.HttpCredentials,system:akka.actor.ActorSystem):akka.http.javadsl.ClientTransport "Permalink")  def httpsProxy(proxyCredentials: [HttpCredentials](model/headers/HttpCredentials.html), system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method. This method also takes HttpCredentials in order to pass along to the proxy.

Pulls the host/port pair from the application.conf: akka.client.proxy.https.{host, port}
13. [**](../../../akka/http/javadsl/ClientTransport$.html#httpsProxy(proxyAddress:java.net.InetSocketAddress,proxyCredentials:akka.http.javadsl.model.headers.HttpCredentials):akka.http.javadsl.ClientTransport "Permalink")  def httpsProxy(proxyAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), proxyCredentials: [HttpCredentials](model/headers/HttpCredentials.html)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method. This call also takes HttpCredentials to base proxy credentials along with
the request.

An HTTP(S) proxy is a proxy that will create one TCP connection to the HTTP(S) proxy for each target connection. The
proxy transparently forwards the TCP connection to the target host.

For more information about HTTP CONNECT tunnelling see https://tools.ietf.org/html/rfc7231\#section\-4\.3\.6\.
14. [**](../../../akka/http/javadsl/ClientTransport$.html#httpsProxy(implicitsystem:akka.actor.ActorSystem):akka.http.javadsl.ClientTransport "Permalink")  def httpsProxy(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Pulls the host/port pair from the application.conf: akka.client.proxy.https.{host, port}
15. [**](../../../akka/http/javadsl/ClientTransport$.html#httpsProxy(proxyAddress:java.net.InetSocketAddress):akka.http.javadsl.ClientTransport "Permalink")  def httpsProxy(proxyAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

An HTTP(S) proxy is a proxy that will create one TCP connection to the HTTP(S) proxy for each target connection. The
proxy transparently forwards the TCP connection to the target host.

For more information about HTTP CONNECT tunnelling see https://tools.ietf.org/html/rfc7231\#section\-4\.3\.6\.
16. [**](../../../akka/http/javadsl/ClientTransport$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../akka/http/javadsl/ClientTransport$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/http/javadsl/ClientTransport$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/javadsl/ClientTransport$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/http/javadsl/ClientTransport$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/http/javadsl/ClientTransport$.html#toScala(javaTransport:akka.http.javadsl.ClientTransport):akka.http.scaladsl.ClientTransport "Permalink")  def toScala(javaTransport: [ClientTransport](ClientTransport.html)): [scaladsl.ClientTransport](../scaladsl/ClientTransport.html)
22. [**](../../../akka/http/javadsl/ClientTransport$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
23. [**](../../../akka/http/javadsl/ClientTransport$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/http/javadsl/ClientTransport$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../../akka/http/javadsl/ClientTransport$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/http/javadsl/ClientTransport$.html#withCustomResolver(lookup:java.util.function.BiFunction[String,Int,java.util.concurrent.CompletionStage[java.net.InetSocketAddress]]):akka.http.javadsl.ClientTransport "Permalink")  def withCustomResolver(lookup: [BiFunction](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/BiFunction.html#java.util.function.BiFunction)\[String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]]): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that allows to customize host name resolution.

Returns a [ClientTransport](ClientTransport.html) that allows to customize host name resolution.

lookupA function that will be called with hostname and port and that should (potentially asynchronously resolve the given host/port
 to an InetSocketAddress
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/ClientTransport$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttp$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttpImpl.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectHttpsImpl.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectWithHttps.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HandlerProvider.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HostConnectionPool.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpTerminated.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/IncomingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnection.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBuilder$.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport$.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ClientTransport$.html)*