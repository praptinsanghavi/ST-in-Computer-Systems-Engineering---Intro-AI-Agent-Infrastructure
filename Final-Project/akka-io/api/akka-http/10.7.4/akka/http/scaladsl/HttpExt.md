---
description: Akka HTTP 10.7.4 - akka.http.scaladsl.HttpExt
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:00Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/scaladsl/HttpExt.html
title: Akka HTTP 10.7.4 - akka.http.scaladsl.HttpExt
---

# Akka HTTP 10.7.4 - akka.http.scaladsl.HttpExt

> **Summary:** Akka HTTP 10.7.4 - akka.http.scaladsl.HttpExt

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
- HttpExt
- [HttpsConnectionContext](HttpsConnectionContext.html "Context with all information needed to set up a HTTPS connection")
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
c[akka](../../index.html).[http](../index.html).[scaladsl](index.html)

# HttpExt[**](../../../akka/http/scaladsl/HttpExt.html "Permalink")

### 

#### class HttpExt extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

Akka extension for HTTP which serves as the main entry point into akka\-http.

Use as `Http().bindAndHandle` etc. with an implicit ActorSystem in scope.

Annotations@DoNotInherit() Source[Http.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/scaladsl/Http.scala#L52)Linear Supertypes[Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. HttpExt
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
### Type Members

1. [**](../../../akka/http/scaladsl/HttpExt.html#ClientLayer=akka.http.scaladsl.Http.ClientLayer "Permalink")  type ClientLayer \= [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html#akka.stream.scaladsl.BidiFlow)\[[HttpRequest](model/HttpRequest.html), SslTlsOutbound, SslTlsInbound, [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]
2. [**](../../../akka/http/scaladsl/HttpExt.html#ServerLayer=akka.http.scaladsl.Http.ServerLayer "Permalink")  type ServerLayer \= [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html#akka.stream.scaladsl.BidiFlow)\[[HttpResponse](model/HttpResponse.html), SslTlsOutbound, SslTlsInbound, [HttpRequest](model/HttpRequest.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]
### Value Members

1. [**](../../../akka/http/scaladsl/HttpExt.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/scaladsl/HttpExt.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/scaladsl/HttpExt.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from HttpExt toany2stringadd\[HttpExt] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/scaladsl/HttpExt.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (HttpExt, B)ImplicitThis member is added by an implicit conversion from HttpExt toArrowAssoc\[HttpExt] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/scaladsl/HttpExt.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/scaladsl/HttpExt.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/scaladsl/HttpExt.html#cachedHostConnectionPool[T](host:String,port:Int,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool] "Permalink")  def cachedHostConnectionPool\[T](host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 80, settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html) \= defaultConnectionPoolSettings, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[([HttpRequest](model/HttpRequest.html), T), ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T), [HostConnectionPool](Http$$HostConnectionPool.html)]Returns a [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint.

Returns a [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
configuration a separate connection pool is maintained.
The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
The returned [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) instances therefore remain valid throughout the lifetime of the application.

The internal caching logic guarantees that there will never be more than a single pool running for the
given target host endpoint and configuration (in this ActorSystem).

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests A and B enter the flow in that order the response for B might be produced before the
response for A.
In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.

To configure additional settings for the pool (and requests made using it),
use the `akka.http.host-connection-pool` config section or pass in a ConnectionPoolSettings explicitly.
8. [**](../../../akka/http/scaladsl/HttpExt.html#cachedHostConnectionPoolHttps[T](host:String,port:Int,connectionContext:akka.http.scaladsl.HttpsConnectionContext,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool] "Permalink")  def cachedHostConnectionPoolHttps\[T](host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 443, connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html) \= defaultConnectionPoolSettings, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[([HttpRequest](model/HttpRequest.html), T), ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T), [HostConnectionPool](Http$$HostConnectionPool.html)]Same as [\#cachedHostConnectionPool](#cachedHostConnectionPool[T](host:String,port:Int,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool]) but for encrypted (HTTPS) connections.

Same as [\#cachedHostConnectionPool](#cachedHostConnectionPool[T](host:String,port:Int,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool]) but for encrypted (HTTPS) connections.

If an explicit [ConnectionContext](ConnectionContext.html) is given then it rather than the configured default [ConnectionContext](ConnectionContext.html) will be used
for encryption on the connections.

To configure additional settings for the pool (and requests made using it),
use the `akka.http.host-connection-pool` config section or pass in a ConnectionPoolSettings explicitly.
9. [**](../../../akka/http/scaladsl/HttpExt.html#clientLayer(hostHeader:akka.http.scaladsl.model.headers.Host,settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):HttpExt.this.ClientLayer "Permalink")  def clientLayer(hostHeader: [Host](model/headers/Host.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [ClientLayer](#ClientLayer=akka.http.scaladsl.Http.ClientLayer)Constructs a [akka.http.scaladsl.Http.ClientLayer](Http$.html#ClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.HttpRequest,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.HttpResponse,akka.NotUsed]) stage using the given [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html).
10. [**](../../../akka/http/scaladsl/HttpExt.html#clientLayer(hostHeader:akka.http.scaladsl.model.headers.Host):HttpExt.this.ClientLayer "Permalink")  def clientLayer(hostHeader: [Host](model/headers/Host.html)): [ClientLayer](#ClientLayer=akka.http.scaladsl.Http.ClientLayer)Constructs a [akka.http.scaladsl.Http.ClientLayer](Http$.html#ClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.HttpRequest,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.HttpResponse,akka.NotUsed]) stage using the configured default [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html),
configured using the `akka.http.client` config section.
11. [**](../../../akka/http/scaladsl/HttpExt.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
12. [**](../../../akka/http/scaladsl/HttpExt.html#connectionTo(host:String):akka.http.scaladsl.OutgoingConnectionBuilder "Permalink")  def connectionTo(host: String): [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html)Creates a builder which will create a single connection to a host every time the built flow is materialized.

Creates a builder which will create a single connection to a host every time the built flow is materialized. There
is no pooling and you are yourself responsible for lifecycle management of the connection. For a more convenient
Request level API see singleRequest()

returnsA builder to configure more specific setup for the connection and then build a `Flow[Request, Response, Future[OutgoingConnection]]`.
13. [**](../../../akka/http/scaladsl/HttpExt.html#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext "Permalink")  def defaultClientHttpsContext: [HttpsConnectionContext](HttpsConnectionContext.html)Gets the current default client\-side [HttpsConnectionContext](HttpsConnectionContext.html).

Gets the current default client\-side [HttpsConnectionContext](HttpsConnectionContext.html).
Defaults used here can be configured through JSSE config (uses `javax.net.ssl.SSLContext.getDefault`).
The context can also be programmatically replaced using [setDefaultClientHttpsContext](#setDefaultClientHttpsContext(context:akka.http.scaladsl.HttpsConnectionContext):Unit)
14. [**](../../../akka/http/scaladsl/HttpExt.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (HttpExt) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpExtImplicitThis member is added by an implicit conversion from HttpExt toEnsuring\[HttpExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
15. [**](../../../akka/http/scaladsl/HttpExt.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (HttpExt) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpExtImplicitThis member is added by an implicit conversion from HttpExt toEnsuring\[HttpExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
16. [**](../../../akka/http/scaladsl/HttpExt.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpExtImplicitThis member is added by an implicit conversion from HttpExt toEnsuring\[HttpExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
17. [**](../../../akka/http/scaladsl/HttpExt.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpExtImplicitThis member is added by an implicit conversion from HttpExt toEnsuring\[HttpExt] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
18. [**](../../../akka/http/scaladsl/HttpExt.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/http/scaladsl/HttpExt.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
20. [**](../../../akka/http/scaladsl/HttpExt.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/http/scaladsl/HttpExt.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/http/scaladsl/HttpExt.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
23. [**](../../../akka/http/scaladsl/HttpExt.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
24. [**](../../../akka/http/scaladsl/HttpExt.html#newHostConnectionPool[T](host:String,port:Int,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool] "Permalink")  def newHostConnectionPool\[T](host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 80, settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html) \= defaultConnectionPoolSettings, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[([HttpRequest](model/HttpRequest.html), T), ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T), [HostConnectionPool](Http$$HostConnectionPool.html)]Starts a new connection pool to the given host and configuration and returns a [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) which dispatches
the requests from all its materializations across this pool.

Starts a new connection pool to the given host and configuration and returns a [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) which dispatches
the requests from all its materializations across this pool.
While the started host connection pool internally shuts itself down automatically after the configured idle
timeout it will spin itself up again if more requests arrive from an existing or a new client flow
materialization. The returned flow therefore remains usable for the full lifetime of the application.

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests A and B enter the flow in that order the response for B might be produced before the
response for A.
In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.

To configure additional settings for the pool (and requests made using it),
use the `akka.http.host-connection-pool` config section or pass in a ConnectionPoolSettings explicitly.
25. [**](../../../akka/http/scaladsl/HttpExt.html#newHostConnectionPoolHttps[T](host:String,port:Int,connectionContext:akka.http.scaladsl.HttpsConnectionContext,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool] "Permalink")  def newHostConnectionPoolHttps\[T](host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 443, connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html) \= defaultConnectionPoolSettings, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[([HttpRequest](model/HttpRequest.html), T), ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T), [HostConnectionPool](Http$$HostConnectionPool.html)]Same as [\#newHostConnectionPool](#newHostConnectionPool[T](host:String,port:Int,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool]) but for encrypted (HTTPS) connections.

Same as [\#newHostConnectionPool](#newHostConnectionPool[T](host:String,port:Int,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.http.scaladsl.Http.HostConnectionPool]) but for encrypted (HTTPS) connections.

If an explicit [ConnectionContext](ConnectionContext.html) is given then it rather than the configured default [ConnectionContext](ConnectionContext.html) will be used
for encryption on the connections.

To configure additional settings for the pool (and requests made using it),
use the `akka.http.host-connection-pool` config section or pass in a ConnectionPoolSettings explicitly.
26. [**](../../../akka/http/scaladsl/HttpExt.html#newServerAt(interface:String,port:Int):akka.http.scaladsl.ServerBuilder "Permalink")  def newServerAt(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ServerBuilder](ServerBuilder.html)Main entry point to create a server binding.

Main entry point to create a server binding.

interfaceThe interface to bind to.

portThe port to bind to or `0` if the port should be automatically assigned.
27. [**](../../../akka/http/scaladsl/HttpExt.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
28. [**](../../../akka/http/scaladsl/HttpExt.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
29. [**](../../../akka/http/scaladsl/HttpExt.html#outgoingConnection(host:String,port:Int,localAddress:Option[java.net.InetSocketAddress],settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,scala.concurrent.Future[akka.http.scaladsl.Http.OutgoingConnection]] "Permalink")  def outgoingConnection(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 80, localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html) \= [ClientConnectionSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Http$$OutgoingConnection.html)]]Creates a [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.

Creates a [akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.
Every materialization of the produced flow will attempt to establish a new outgoing connection.

To configure additional settings for requests made using this method,
use the `akka.http.client` config section or pass in a [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html) explicitly.

Prefer [connectionTo](#connectionTo(host:String):akka.http.scaladsl.OutgoingConnectionBuilder) over this method.
30. [**](../../../akka/http/scaladsl/HttpExt.html#outgoingConnectionHttps(host:String,port:Int,connectionContext:akka.http.scaladsl.HttpsConnectionContext,localAddress:Option[java.net.InetSocketAddress],settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,scala.concurrent.Future[akka.http.scaladsl.Http.OutgoingConnection]] "Permalink")  def outgoingConnectionHttps(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 443, connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html) \= [ClientConnectionSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Http$$OutgoingConnection.html)]]Same as [\#outgoingConnection](#outgoingConnection(host:String,port:Int,localAddress:Option[java.net.InetSocketAddress],settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,scala.concurrent.Future[akka.http.scaladsl.Http.OutgoingConnection]]) but for encrypted (HTTPS) connections.

Same as [\#outgoingConnection](#outgoingConnection(host:String,port:Int,localAddress:Option[java.net.InetSocketAddress],settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,scala.concurrent.Future[akka.http.scaladsl.Http.OutgoingConnection]]) but for encrypted (HTTPS) connections.

If an explicit [HttpsConnectionContext](HttpsConnectionContext.html) is given then it rather than the configured default [HttpsConnectionContext](HttpsConnectionContext.html) will be used
for encryption on the connection.

To configure additional settings for requests made using this method,
use the `akka.http.client` config section or pass in a [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html) explicitly.

Prefer [connectionTo](#connectionTo(host:String):akka.http.scaladsl.OutgoingConnectionBuilder) over this method.
31. [**](../../../akka/http/scaladsl/HttpExt.html#outgoingConnectionUsingContext(host:String,port:Int,connectionContext:akka.http.scaladsl.ConnectionContext,settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,scala.concurrent.Future[akka.http.scaladsl.Http.OutgoingConnection]] "Permalink")  def outgoingConnectionUsingContext(host: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), connectionContext: [ConnectionContext](ConnectionContext.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html) \= [ClientConnectionSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OutgoingConnection](Http$$OutgoingConnection.html)]]Similar to `outgoingConnection` but allows to specify a user\-defined context to run the connection on.

Similar to `outgoingConnection` but allows to specify a user\-defined context to run the connection on.

Depending on the kind of `ConnectionContext` the implementation will add TLS between the given transport and the HTTP
implementation

To configure additional settings for requests made using this method,
use the `akka.http.client` config section or pass in a [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html) explicitly.

Prefer [connectionTo](#connectionTo(host:String):akka.http.scaladsl.OutgoingConnectionBuilder) over this method.
32. [**](../../../akka/http/scaladsl/HttpExt.html#serverLayer(settings:akka.http.scaladsl.settings.ServerSettings,remoteAddress:Option[java.net.InetSocketAddress],log:akka.event.LoggingAdapter,isSecureConnection:Boolean):HttpExt.this.ServerLayer "Permalink")  def serverLayer(settings: [ServerSettings](settings/ServerSettings.html) \= [ServerSettings(system)](#system:akka.actor.ExtendedActorSystem), remoteAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem), isSecureConnection: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean) \= false): [ServerLayer](#ServerLayer=akka.http.scaladsl.Http.ServerLayer)Constructs a [akka.http.scaladsl.Http.ServerLayer](Http$.html#ServerLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.HttpRequest,akka.NotUsed]) stage using the given [akka.http.scaladsl.settings.ServerSettings](settings/ServerSettings.html).

Constructs a [akka.http.scaladsl.Http.ServerLayer](Http$.html#ServerLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.HttpRequest,akka.NotUsed]) stage using the given [akka.http.scaladsl.settings.ServerSettings](settings/ServerSettings.html). The returned [akka.stream.scaladsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html) isn't reusable and
can only be materialized once. The `remoteAddress`, if provided, will be added as a header to each [akka.http.scaladsl.model.HttpRequest](model/HttpRequest.html)
this layer produces if the `akka.http.server.remote-address-header` configuration option is enabled.
33. [**](../../../akka/http/scaladsl/HttpExt.html#setDefaultClientHttpsContext(context:akka.http.scaladsl.HttpsConnectionContext):Unit "Permalink")  def setDefaultClientHttpsContext(context: [HttpsConnectionContext](HttpsConnectionContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sets the default client\-side [HttpsConnectionContext](HttpsConnectionContext.html).
34. [**](../../../akka/http/scaladsl/HttpExt.html#shutdownAllConnectionPools():scala.concurrent.Future[Unit] "Permalink")  def shutdownAllConnectionPools(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Triggers an orderly shutdown of all host connections pools currently maintained by the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html).

Triggers an orderly shutdown of all host connections pools currently maintained by the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html).
The returned future is completed when all pools that were live at the time of this method call
have completed their shutdown process.

If existing pool client flows are re\-used or new ones materialized concurrently with or after this
method call the respective connection pools will be restarted and not contribute to the returned future.
35. [**](../../../akka/http/scaladsl/HttpExt.html#singleRequest(request:akka.http.scaladsl.model.HttpRequest,connectionContext:akka.http.scaladsl.HttpsConnectionContext,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse] "Permalink")  def singleRequest(request: [HttpRequest](model/HttpRequest.html), connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html) \= defaultConnectionPoolSettings, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](model/HttpResponse.html)]Fires a single [akka.http.scaladsl.model.HttpRequest](model/HttpRequest.html) across the (cached) host connection pool for the request's
effective URI to produce a response future.

Fires a single [akka.http.scaladsl.model.HttpRequest](model/HttpRequest.html) across the (cached) host connection pool for the request's
effective URI to produce a response future.

If an explicit [ConnectionContext](ConnectionContext.html) is given then it rather than the configured default [ConnectionContext](ConnectionContext.html) will be used
for setting up the HTTPS connection pool, if the request is targeted towards an `https` endpoint.

Note that the request must have an absolute URI, otherwise the future will be completed with an error.
36. [**](../../../akka/http/scaladsl/HttpExt.html#singleWebSocketRequest[T](request:akka.http.scaladsl.model.ws.WebSocketRequest,clientFlow:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,T],connectionContext:akka.http.scaladsl.ConnectionContext,localAddress:Option[java.net.InetSocketAddress],settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter)(implicitmat:akka.stream.Materializer):(scala.concurrent.Future[akka.http.scaladsl.model.ws.WebSocketUpgradeResponse],T) "Permalink")  def singleWebSocketRequest\[T](request: [WebSocketRequest](model/ws/WebSocketRequest.html), clientFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), T], connectionContext: [ConnectionContext](ConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html) \= [ClientConnectionSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem))(implicit mat: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): ([Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)], T)Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
WebSocket conversation.
37. [**](../../../akka/http/scaladsl/HttpExt.html#superPool[T](connectionContext:akka.http.scaladsl.HttpsConnectionContext,settings:akka.http.scaladsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[(akka.http.scaladsl.model.HttpRequest,T),(scala.util.Try[akka.http.scaladsl.model.HttpResponse],T),akka.NotUsed] "Permalink")  def superPool\[T](connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html) \= defaultConnectionPoolSettings, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[([HttpRequest](model/HttpRequest.html), T), ([Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs.

Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs. Note that incoming requests must have an absolute URI.

If an explicit [ConnectionContext](ConnectionContext.html) is given then it rather than the configured default [ConnectionContext](ConnectionContext.html) will be used
for setting up HTTPS connection pools, if required.

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests A and B enter the flow in that order the response for B might be produced before the
response for A.
In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.

To configure additional settings for the pool (and requests made using it),
use the `akka.http.host-connection-pool` config section or pass in a ConnectionPoolSettings explicitly.
38. [**](../../../akka/http/scaladsl/HttpExt.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
39. [**](../../../akka/http/scaladsl/HttpExt.html#system:akka.actor.ExtendedActorSystem "Permalink") implicit  val system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem)
40. [**](../../../akka/http/scaladsl/HttpExt.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
41. [**](../../../akka/http/scaladsl/HttpExt.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
42. [**](../../../akka/http/scaladsl/HttpExt.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
43. [**](../../../akka/http/scaladsl/HttpExt.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
44. [**](../../../akka/http/scaladsl/HttpExt.html#webSocketClientFlow(request:akka.http.scaladsl.model.ws.WebSocketRequest,connectionContext:akka.http.scaladsl.ConnectionContext,localAddress:Option[java.net.InetSocketAddress],settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Flow[akka.http.scaladsl.model.ws.Message,akka.http.scaladsl.model.ws.Message,scala.concurrent.Future[akka.http.scaladsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  def webSocketClientFlow(request: [WebSocketRequest](model/ws/WebSocketRequest.html), connectionContext: [ConnectionContext](ConnectionContext.html) \= [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.scaladsl.HttpsConnectionContext), localAddress: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)] \= None, settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html) \= [ClientConnectionSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.

Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.

The layer is not reusable and must only be materialized once.
45. [**](../../../akka/http/scaladsl/HttpExt.html#webSocketClientLayer(request:akka.http.scaladsl.model.ws.WebSocketRequest,settings:akka.http.scaladsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.http.scaladsl.Http.WebSocketClientLayer "Permalink")  def webSocketClientLayer(request: [WebSocketRequest](model/ws/WebSocketRequest.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html) \= [ClientConnectionSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [WebSocketClientLayer](Http$.html#WebSocketClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.ws.Message,scala.concurrent.Future[akka.http.scaladsl.model.ws.WebSocketUpgradeResponse]])Constructs a [akka.http.scaladsl.Http.WebSocketClientLayer](Http$.html#WebSocketClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.ws.Message,scala.concurrent.Future[akka.http.scaladsl.model.ws.WebSocketUpgradeResponse]]) stage using the configured default [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html),
configured using the `akka.http.client` config section.

Constructs a [akka.http.scaladsl.Http.WebSocketClientLayer](Http$.html#WebSocketClientLayer=akka.stream.scaladsl.BidiFlow[akka.http.scaladsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.scaladsl.model.ws.Message,scala.concurrent.Future[akka.http.scaladsl.model.ws.WebSocketUpgradeResponse]]) stage using the configured default [akka.http.scaladsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html),
configured using the `akka.http.client` config section.

The layer is not reusable and must only be materialized once.
### Deprecated Value Members

1. [**](../../../akka/http/scaladsl/HttpExt.html#bind(interface:String,port:Int,connectionContext:akka.http.scaladsl.ConnectionContext,settings:akka.http.scaladsl.settings.ServerSettings,log:akka.event.LoggingAdapter):akka.stream.scaladsl.Source[akka.http.scaladsl.Http.IncomingConnection,scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding]] "Permalink")  def bind(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= DefaultPortForProtocol, connectionContext: [ConnectionContext](ConnectionContext.html) \= [defaultServerHttpContext](#defaultServerHttpContext:akka.http.scaladsl.ConnectionContext), settings: [ServerSettings](settings/ServerSettings.html) \= [ServerSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[IncomingConnection](Http$$IncomingConnection.html), [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]]Creates a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of [akka.http.scaladsl.Http.IncomingConnection](Http$$IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Creates a [akka.stream.scaladsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html) of [akka.http.scaladsl.Http.IncomingConnection](Http$$IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

If the given port is 0 the resulting source can be materialized several times. Each materialization will
then be assigned a new local port by the operating system, which can then be retrieved by the materialized
[akka.http.scaladsl.Http.ServerBinding](Http$$ServerBinding.html).

If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
[akka.http.scaladsl.Http.ServerBinding](Http$$ServerBinding.html).

If an [ConnectionContext](ConnectionContext.html) is given it will be used for setting up TLS encryption on the binding.
Otherwise the binding will be unencrypted.

If no `port` is explicitly given (or the port value is negative) the protocol's default port will be used,
which is 80 for HTTP and 443 for HTTPS.

To configure additional settings for a server started using this method,
use the `akka.http.server` config section or pass in a [akka.http.scaladsl.settings.ServerSettings](settings/ServerSettings.html) explicitly.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use Http().newServerAt(...)...connectionSource() to create a source that can be materialized to a binding.
2. [**](../../../akka/http/scaladsl/HttpExt.html#bindAndHandle(handler:akka.stream.scaladsl.Flow[akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.model.HttpResponse,Any],interface:String,port:Int,connectionContext:akka.http.scaladsl.ConnectionContext,settings:akka.http.scaladsl.settings.ServerSettings,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding] "Permalink")  def bindAndHandle(handler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html#akka.stream.scaladsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)], interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= DefaultPortForProtocol, connectionContext: [ConnectionContext](ConnectionContext.html) \= [defaultServerHttpContext](#defaultServerHttpContext:akka.http.scaladsl.ConnectionContext), settings: [ServerSettings](settings/ServerSettings.html) \= [ServerSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer) \= systemMaterializer): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

To configure additional settings for a server started using this method,
use the `akka.http.server` config section or pass in a [akka.http.scaladsl.settings.ServerSettings](settings/ServerSettings.html) explicitly.

Annotations@deprecated @nowarn() Deprecated*(Since version 10\.2\.0\)* Use Http().newServerAt(...)...bindFlow() to create server bindings.
3. [**](../../../akka/http/scaladsl/HttpExt.html#bindAndHandleAsync(handler:akka.http.scaladsl.model.HttpRequest=>scala.concurrent.Future[akka.http.scaladsl.model.HttpResponse],interface:String,port:Int,connectionContext:akka.http.scaladsl.ConnectionContext,settings:akka.http.scaladsl.settings.ServerSettings,parallelism:Int,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding] "Permalink")  def bindAndHandleAsync(handler: ([HttpRequest](model/HttpRequest.html)) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[HttpResponse](model/HttpResponse.html)], interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= DefaultPortForProtocol, connectionContext: [ConnectionContext](ConnectionContext.html) \= [defaultServerHttpContext](#defaultServerHttpContext:akka.http.scaladsl.ConnectionContext), settings: [ServerSettings](settings/ServerSettings.html) \= [ServerSettings(system)](#system:akka.actor.ExtendedActorSystem), parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= 0, log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer) \= systemMaterializer): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

To configure additional settings for a server started using this method,
use the `akka.http.server` config section or pass in a [akka.http.scaladsl.settings.ServerSettings](settings/ServerSettings.html) explicitly.

Parameter `parallelism` specifies how many requests are attempted to be handled concurrently per connection. In HTTP/1
this makes only sense if HTTP pipelining is enabled (which is not recommended). The default value of `0` means that
the value is taken from the `akka.http.server.pipelining-limit` setting from the configuration. In HTTP/2,
the default value is taken from `akka.http.server.http2.max-concurrent-streams`.

Any other value for `parallelism` overrides the setting.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Use Http().newServerAt(...)...bind() to create server bindings.
4. [**](../../../akka/http/scaladsl/HttpExt.html#bindAndHandleSync(handler:akka.http.scaladsl.model.HttpRequest=>akka.http.scaladsl.model.HttpResponse,interface:String,port:Int,connectionContext:akka.http.scaladsl.ConnectionContext,settings:akka.http.scaladsl.settings.ServerSettings,log:akka.event.LoggingAdapter)(implicitfm:akka.stream.Materializer):scala.concurrent.Future[akka.http.scaladsl.Http.ServerBinding] "Permalink")  def bindAndHandleSync(handler: ([HttpRequest](model/HttpRequest.html)) \=\> [HttpResponse](model/HttpResponse.html), interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int) \= DefaultPortForProtocol, connectionContext: [ConnectionContext](ConnectionContext.html) \= [defaultServerHttpContext](#defaultServerHttpContext:akka.http.scaladsl.ConnectionContext), settings: [ServerSettings](settings/ServerSettings.html) \= [ServerSettings(system)](#system:akka.actor.ExtendedActorSystem), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter) \= [system.log](#system:akka.actor.ExtendedActorSystem))(implicit fm: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer) \= systemMaterializer): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[ServerBinding](Http$$ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.scaladsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

To configure additional settings for a server started using this method,
use the `akka.http.server` config section or pass in a [akka.http.scaladsl.settings.ServerSettings](settings/ServerSettings.html) explicitly.

Annotations@deprecated @nowarn() Deprecated*(Since version 10\.2\.0\)* Use Http().newServerAt(...)...bindSync() to create server bindings.
5. [**](../../../akka/http/scaladsl/HttpExt.html#defaultServerHttpContext:akka.http.scaladsl.ConnectionContext "Permalink")  def defaultServerHttpContext: [ConnectionContext](ConnectionContext.html)Gets the current default server\-side [ConnectionContext](ConnectionContext.html) – defaults to plain HTTP.

Gets the current default server\-side [ConnectionContext](ConnectionContext.html) – defaults to plain HTTP.
Can be modified using [setDefaultServerHttpContext](#setDefaultServerHttpContext(context:akka.http.scaladsl.ConnectionContext):Unit), and will then apply for servers bound after that call has completed.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Set context explicitly when binding
6. [**](../../../akka/http/scaladsl/HttpExt.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
7. [**](../../../akka/http/scaladsl/HttpExt.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from HttpExt toStringFormat\[HttpExt] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
8. [**](../../../akka/http/scaladsl/HttpExt.html#setDefaultServerHttpContext(context:akka.http.scaladsl.ConnectionContext):Unit "Permalink")  def setDefaultServerHttpContext(context: [ConnectionContext](ConnectionContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sets the default server\-side [ConnectionContext](ConnectionContext.html).

Sets the default server\-side [ConnectionContext](ConnectionContext.html).
If it is an instance of [HttpsConnectionContext](HttpsConnectionContext.html) then the server will be bound using HTTPS.

Annotations@deprecated Deprecated*(Since version 10\.2\.0\)* Set context explicitly when binding
9. [**](../../../akka/http/scaladsl/HttpExt.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (HttpExt, B)ImplicitThis member is added by an implicit conversion from HttpExt toArrowAssoc\[HttpExt] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttpExt to any2stringadd\[HttpExt]

### Inherited by implicit conversion StringFormat fromHttpExt to StringFormat\[HttpExt]

### Inherited by implicit conversion Ensuring fromHttpExt to Ensuring\[HttpExt]

### Inherited by implicit conversion ArrowAssoc fromHttpExt to ArrowAssoc\[HttpExt]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext$.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/Http$$HostConnectionPool.html
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
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/server/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/settings/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/testkit/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/unmarshalling/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/util/index.html
- https://doc.akka.io/api/akka-http/10.7.4/akka/index.html
- https://doc.akka.io/api/akka-http/10.7.4/index.html

---
*Source: [https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html](https://doc.akka.io/api/akka-http/10.7.4/akka/http/scaladsl/HttpExt.html)*