---
description: Akka HTTP 10.7.4 - akka.http.javadsl.ConnectionContext
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext$.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.ConnectionContext
---

# Akka HTTP 10.7.4 - akka.http.javadsl.ConnectionContext

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.ConnectionContext

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
[o](ConnectionContext.html "See companion class")[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# [ConnectionContext](ConnectionContext.html "See companion class")[**](../../../akka/http/javadsl/ConnectionContext$.html "Permalink")

### Companion [class ConnectionContext](ConnectionContext.html "See companion class")

#### object ConnectionContext

Source[ConnectionContext.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/ConnectionContext.scala#L12)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConnectionContext
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/http/javadsl/ConnectionContext$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/ConnectionContext$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/ConnectionContext$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/http/javadsl/ConnectionContext$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/http/javadsl/ConnectionContext$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/http/javadsl/ConnectionContext$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/http/javadsl/ConnectionContext$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/http/javadsl/ConnectionContext$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/http/javadsl/ConnectionContext$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
10. [**](../../../akka/http/javadsl/ConnectionContext$.html#httpsClient(createEngine:akka.japi.function.Function2[String,Integer,javax.net.ssl.SSLEngine]):akka.http.javadsl.HttpsConnectionContext "Permalink")  def httpsClient(createEngine: [Function2](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function2.html#akka.japi.function.Function2)\[String, [Integer](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Integer.html#java.lang.Integer), [SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)]): [HttpsConnectionContext](HttpsConnectionContext.html) If you want complete control over how to create the SSLEngine you can use this method.

 If you want complete control over how to create the SSLEngine you can use this method.

 Note that this means it is up to you to make sure features like SNI and hostname verification
 are enabled as needed.

Annotations@ApiMayChange()
11. [**](../../../akka/http/javadsl/ConnectionContext$.html#httpsClient(sslContext:javax.net.ssl.SSLContext):akka.http.javadsl.HttpsConnectionContext "Permalink")  def httpsClient(sslContext: [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)): [HttpsConnectionContext](HttpsConnectionContext.html)Creates an HttpsConnectionContext for client\-side use from the given SSLContext.
12. [**](../../../akka/http/javadsl/ConnectionContext$.html#httpsServer(createEngine:akka.japi.function.Creator[javax.net.ssl.SSLEngine]):akka.http.javadsl.HttpsConnectionContext "Permalink")  def httpsServer(createEngine: [Creator](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Creator.html#akka.japi.function.Creator)\[[SSLEngine](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLEngine.html#javax.net.ssl.SSLEngine)]): [HttpsConnectionContext](HttpsConnectionContext.html) If you want complete control over how to create the SSLEngine you can use this method.

 If you want complete control over how to create the SSLEngine you can use this method.

Annotations@ApiMayChange()
13. [**](../../../akka/http/javadsl/ConnectionContext$.html#httpsServer(sslContext:javax.net.ssl.SSLContext):akka.http.javadsl.HttpsConnectionContext "Permalink")  def httpsServer(sslContext: [SSLContext](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/javax/net/ssl/SSLContext.html#javax.net.ssl.SSLContext)): [HttpsConnectionContext](HttpsConnectionContext.html)Creates an HttpsConnectionContext for server\-side use from the given SSLContext.
14. [**](../../../akka/http/javadsl/ConnectionContext$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/http/javadsl/ConnectionContext$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/http/javadsl/ConnectionContext$.html#noEncryption():akka.http.javadsl.HttpConnectionContext "Permalink")  def noEncryption(): [HttpConnectionContext](HttpConnectionContext.html)Used to serve HTTP traffic.
17. [**](../../../akka/http/javadsl/ConnectionContext$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/http/javadsl/ConnectionContext$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/http/javadsl/ConnectionContext$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/http/javadsl/ConnectionContext$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/http/javadsl/ConnectionContext$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/http/javadsl/ConnectionContext$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
23. [**](../../../akka/http/javadsl/ConnectionContext$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/ConnectionContext$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Creator.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/function/Function2.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/testkit/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/current/akka/index.html
- https://doc.akka.io/api/akka-http/current/index.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext$.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/ConnectionContext$.html)*