---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:18Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.ClientTransport

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
- [Http](Http$.html)
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpExt](HttpExt.html "Akka extension for HTTP which serves as the main entry point into akka-http.")
- [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection")
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
[o](ClientTransport.html "See companion trait")[akka](../../index.html).[http](../index.html).[scaladsl](index.html)

# [ClientTransport](ClientTransport.html "See companion trait")[**](../../../akka/http/scaladsl/ClientTransport$.html "Permalink")

### Companion [trait ClientTransport](ClientTransport.html "See companion trait")

#### object ClientTransport

Entry point to create or access predefined client transports.

Source[ClientTransport.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/ClientTransport.scala#L34)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
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

1. [**](../../../akka/http/scaladsl/ClientTransport$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/ClientTransport$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/ClientTransport$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/http/scaladsl/ClientTransport$.html#TCP:akka.http.scaladsl.ClientTransport "Permalink")  val TCP: [ClientTransport](ClientTransport.html)
5. [**](../../../akka/http/scaladsl/ClientTransport$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../../akka/http/scaladsl/ClientTransport$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
7. [**](../../../akka/http/scaladsl/ClientTransport$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/http/scaladsl/ClientTransport$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/http/scaladsl/ClientTransport$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/http/scaladsl/ClientTransport$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
11. [**](../../../akka/http/scaladsl/ClientTransport$.html#httpsProxy(proxyCredentials:akka.http.scaladsl.model.headers.HttpCredentials)(implicitsystem:akka.actor.ActorSystem):akka.http.scaladsl.ClientTransport "Permalink")  def httpsProxy(proxyCredentials: [HttpCredentials](model/headers/HttpCredentials.html))(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method. This method also takes HttpCredentials in order to pass along to the proxy.

Pulls the host/port pair from the application.conf: akka.client.proxy.https.{host, port}
12. [**](../../../akka/http/scaladsl/ClientTransport$.html#httpsProxy(proxyAddress:java.net.InetSocketAddress,proxyCredentials:akka.http.scaladsl.model.headers.HttpCredentials):akka.http.scaladsl.ClientTransport "Permalink")  def httpsProxy(proxyAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress), proxyCredentials: [HttpCredentials](model/headers/HttpCredentials.html)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method. This method also takes HttpCredentials in order to pass along to the proxy.

An HTTP(S) proxy is a proxy that will create one TCP connection to the HTTP(S) proxy for each target connection. The
proxy transparently forwards the TCP connection to the target host.

For more information about HTTP CONNECT tunnelling see https://tools.ietf.org/html/rfc7231\#section\-4\.3\.6\.
13. [**](../../../akka/http/scaladsl/ClientTransport$.html#httpsProxy()(implicitsystem:akka.actor.ActorSystem):akka.http.scaladsl.ClientTransport "Permalink")  def httpsProxy()(implicit system: [ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html#akka.actor.ActorSystem)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Pulls the host/port pair from the application.conf: akka.client.proxy.https.{host, port}
14. [**](../../../akka/http/scaladsl/ClientTransport$.html#httpsProxy(proxyAddress:java.net.InetSocketAddress):akka.http.scaladsl.ClientTransport "Permalink")  def httpsProxy(proxyAddress: [InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

Returns a [ClientTransport](ClientTransport.html) that runs all connection through the given HTTP(S) proxy using the
HTTP CONNECT method.

An HTTP(S) proxy is a proxy that will create one TCP connection to the HTTP(S) proxy for each target connection. The
proxy transparently forwards the TCP connection to the target host.

For more information about HTTP CONNECT tunnelling see https://tools.ietf.org/html/rfc7231\#section\-4\.3\.6\.
15. [**](../../../akka/http/scaladsl/ClientTransport$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/http/scaladsl/ClientTransport$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../../akka/http/scaladsl/ClientTransport$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/http/scaladsl/ClientTransport$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/scaladsl/ClientTransport$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/http/scaladsl/ClientTransport$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/http/scaladsl/ClientTransport$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/http/scaladsl/ClientTransport$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/http/scaladsl/ClientTransport$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../../akka/http/scaladsl/ClientTransport$.html#withCustomResolver(lookup:(String,Int)=>scala.concurrent.Future[java.net.InetSocketAddress]):akka.http.scaladsl.ClientTransport "Permalink")  def withCustomResolver(lookup: (String, [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]): [ClientTransport](ClientTransport.html)Returns a [ClientTransport](ClientTransport.html) that allows to customize host name resolution.

Returns a [ClientTransport](ClientTransport.html) that allows to customize host name resolution.

lookupA function that will be called with hostname and port and that should (potentially asynchronously resolve the given host/port
 to an InetSocketAddress
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/ClientTransport$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-http/current/akka/http/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/Http$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpConnectionContext$.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/TimeoutAccess.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/client/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/coding/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/common/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshallers/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/marshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/headers/HttpCredentials.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html](https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/ClientTransport$.html)*