---
description: Akka HTTP 10.7.4 - akka.http.javadsl.Http
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:43:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http.html
title: Akka HTTP 10.7.4 - akka.http.javadsl.Http
---

# Akka HTTP 10.7.4 - akka.http.javadsl.Http

> **Summary:** Akka HTTP 10.7.4 - akka.http.javadsl.Http

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
- Http
- [HttpConnectionContext](HttpConnectionContext.html)
- [HttpTerminated](HttpTerminated.html "Type used to carry meaningful information when server termination has completed successfully.")
- [HttpsConnectionContext](HttpsConnectionContext.html)
- [IncomingConnection](IncomingConnection.html "Represents one accepted incoming HTTP connection.")
- [OutgoingConnection](OutgoingConnection.html)
- [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "Builder for setting up a flow that will create one single connection per materialization to the specified host.")
- [ServerBinding](ServerBinding.html "Represents a prospective HTTP server binding.")
- [ServerBuilder](ServerBuilder.html "Builder API to create server bindings.")
- [TimeoutAccess](TimeoutAccess.html "Enables programmatic access to the server-side request timeout logic.")
[c](Http$.html "See companion object")[akka](../../index.html).[http](../index.html).[javadsl](index.html)

# [Http](Http$.html "See companion object")[**](../../../akka/http/javadsl/Http.html "Permalink")

### Companion [object Http](Http$.html "See companion object")

#### class Http extends [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

Source[Http.scala](https://github.com/akka/akka-http/tree/v10.7.4/akka-http-core/src/main/scala/akka/http/javadsl/Http.scala#L40)Linear Supertypes[Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Http
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

1. [**](../../../akka/http/javadsl/Http.html#<init>(system:akka.actor.ExtendedActorSystem):akka.http.javadsl.Http "Permalink")  new Http(system: [ExtendedActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html#akka.actor.ExtendedActorSystem))
### Value Members

1. [**](../../../akka/http/javadsl/Http.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/http/javadsl/Http.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/http/javadsl/Http.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from Http toany2stringadd\[Http] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/http/javadsl/Http.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (Http, B)ImplicitThis member is added by an implicit conversion from Http toArrowAssoc\[Http] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/http/javadsl/Http.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/http/javadsl/Http.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/http/javadsl/Http.html#cachedHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def cachedHostConnectionPool\[T](to: [ConnectHttp](ConnectHttp.html), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint.

Returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
configuration a separate connection pool is maintained.
The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
The returned [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) instances therefore remain valid throughout the lifetime of the application.

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
8. [**](../../../akka/http/javadsl/Http.html#cachedHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def cachedHostConnectionPool\[T](to: [ConnectHttp](ConnectHttp.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint.

Returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
configuration a separate connection pool is maintained.
The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
The returned [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) instances therefore remain valid throughout the lifetime of the application.

The internal caching logic guarantees that there will never be more than a single pool running for the
given target host endpoint and configuration (in this ActorSystem).

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests A and B enter the flow in that order the response for B might be produced before the
response for A.
In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.
9. [**](../../../akka/http/javadsl/Http.html#cachedHostConnectionPool[T](host:String):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def cachedHostConnectionPool\[T](host: String): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint.

Returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
configuration a separate connection pool is maintained.
The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
The returned [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) instances therefore remain valid throughout the lifetime of the application.

The internal caching logic guarantees that there will never be more than a single pool running for the
given target host endpoint and configuration (in this ActorSystem).

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests A and B enter the flow in that order the response for B might be produced before the
response for A.
In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.
10. [**](../../../akka/http/javadsl/Http.html#cachedHostConnectionPoolHttps[T](to:akka.http.javadsl.ConnectHttp):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def cachedHostConnectionPoolHttps\[T](to: [ConnectHttp](ConnectHttp.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Same as [cachedHostConnectionPool](#cachedHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool]) but with HTTPS encryption.

Same as [cachedHostConnectionPool](#cachedHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool]) but with HTTPS encryption.

When an [HttpConnectionContext](HttpConnectionContext.html) is defined in the given [ConnectHttp](ConnectHttp.html) it will be used, otherwise the default client\-side context will be used.
11. [**](../../../akka/http/javadsl/Http.html#cachedHostConnectionPoolHttps[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def cachedHostConnectionPoolHttps\[T](to: [ConnectHttp](ConnectHttp.html), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Same as [cachedHostConnectionPool](#cachedHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool]) but with HTTPS encryption.

Same as [cachedHostConnectionPool](#cachedHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool]) but with HTTPS encryption.

When an [HttpConnectionContext](HttpConnectionContext.html) is defined in the given [ConnectHttp](ConnectHttp.html) it will be used, otherwise the default client\-side context will be used.
12. [**](../../../akka/http/javadsl/Http.html#clientLayer(hostHeader:akka.http.javadsl.model.headers.Host,settings:akka.http.javadsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpRequest,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink")  def clientLayer(hostHeader: [Host](model/headers/Host.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpRequest](model/HttpRequest.html), SslTlsOutbound, SslTlsInbound, [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a client layer stage using the given ClientConnectionSettings.
13. [**](../../../akka/http/javadsl/Http.html#clientLayer(hostHeader:akka.http.javadsl.model.headers.Host,settings:akka.http.javadsl.settings.ClientConnectionSettings):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpRequest,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink")  def clientLayer(hostHeader: [Host](model/headers/Host.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpRequest](model/HttpRequest.html), SslTlsOutbound, SslTlsInbound, [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a client layer stage using the given [akka.http.javadsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html).
14. [**](../../../akka/http/javadsl/Http.html#clientLayer(hostHeader:akka.http.javadsl.model.headers.Host):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpRequest,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpResponse,akka.NotUsed] "Permalink")  def clientLayer(hostHeader: [Host](model/headers/Host.html)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpRequest](model/HttpRequest.html), SslTlsOutbound, SslTlsInbound, [HttpResponse](model/HttpResponse.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a client layer stage using the configured default [akka.http.javadsl.settings.ClientConnectionSettings](settings/ClientConnectionSettings.html).
15. [**](../../../akka/http/javadsl/Http.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/http/javadsl/Http.html#connectionTo(host:String):akka.http.javadsl.OutgoingConnectionBuilder "Permalink")  def connectionTo(host: String): [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html)Creates a builder which will create a single connection to a host every time the built flow is materialized.

Creates a builder which will create a single connection to a host every time the built flow is materialized. There
is no pooling and you are yourself responsible for lifecycle management of the connection. For a more convenient
Request level API see singleRequest()

returnsA builder to configure more specific setup for the connection and then build a `Flow>Request, Response, CompletionStage>OutgoingConnection>>`.
17. [**](../../../akka/http/javadsl/Http.html#defaultClientHttpsContext:akka.http.javadsl.HttpsConnectionContext "Permalink")  def defaultClientHttpsContext: [HttpsConnectionContext](HttpsConnectionContext.html)Gets the current default client\-side [ConnectionContext](ConnectionContext.html).
18. [**](../../../akka/http/javadsl/Http.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (Http) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpImplicitThis member is added by an implicit conversion from Http toEnsuring\[Http] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
19. [**](../../../akka/http/javadsl/Http.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (Http) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpImplicitThis member is added by an implicit conversion from Http toEnsuring\[Http] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
20. [**](../../../akka/http/javadsl/Http.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): HttpImplicitThis member is added by an implicit conversion from Http toEnsuring\[Http] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
21. [**](../../../akka/http/javadsl/Http.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): HttpImplicitThis member is added by an implicit conversion from Http toEnsuring\[Http] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
22. [**](../../../akka/http/javadsl/Http.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../../akka/http/javadsl/Http.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
24. [**](../../../akka/http/javadsl/Http.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
25. [**](../../../akka/http/javadsl/Http.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
26. [**](../../../akka/http/javadsl/Http.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
27. [**](../../../akka/http/javadsl/Http.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
28. [**](../../../akka/http/javadsl/Http.html#newHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def newHostConnectionPool\[T](to: [ConnectHttp](ConnectHttp.html), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Same as [newHostConnectionPool](#newHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool]) but with HTTPS encryption.

Same as [newHostConnectionPool](#newHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool]) but with HTTPS encryption.

The given [ConnectionContext](ConnectionContext.html) will be used for encryption on the connection.
29. [**](../../../akka/http/javadsl/Http.html#newHostConnectionPool[T](to:akka.http.javadsl.ConnectHttp,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def newHostConnectionPool\[T](to: [ConnectHttp](ConnectHttp.html), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Starts a new connection pool to the given host and configuration and returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches
the requests from all its materializations across this pool.

Starts a new connection pool to the given host and configuration and returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches
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
30. [**](../../../akka/http/javadsl/Http.html#newHostConnectionPool[T](host:String,materializer:akka.stream.Materializer):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.http.javadsl.HostConnectionPool] "Permalink")  def newHostConnectionPool\[T](host: String, materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [HostConnectionPool](HostConnectionPool.html)]Starts a new connection pool to the given host and configuration and returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches
the requests from all its materializations across this pool.

Starts a new connection pool to the given host and configuration and returns a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) which dispatches
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
31. [**](../../../akka/http/javadsl/Http.html#newServerAt(interface:String,port:Int):akka.http.javadsl.ServerBuilder "Permalink")  def newServerAt(interface: String, port: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [ServerBuilder](ServerBuilder.html)Main entry point to create a server binding.

Main entry point to create a server binding.

interfaceThe interface to bind to.

portThe port to bind to or `0` if the port should be automatically assigned.
32. [**](../../../akka/http/javadsl/Http.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
33. [**](../../../akka/http/javadsl/Http.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
34. [**](../../../akka/http/javadsl/Http.html#outgoingConnection(to:akka.http.javadsl.ConnectHttp,localAddress:java.util.Optional[java.net.InetSocketAddress],settings:akka.http.javadsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink")  def outgoingConnection(to: [ConnectHttp](ConnectHttp.html), localAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Creates a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.

Creates a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.
Every materialization of the produced flow will attempt to establish a new outgoing connection.

Prefer [connectionTo](#connectionTo(host:String):akka.http.javadsl.OutgoingConnectionBuilder) over this method.
35. [**](../../../akka/http/javadsl/Http.html#outgoingConnection(to:akka.http.javadsl.ConnectHttp):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink")  def outgoingConnection(to: [ConnectHttp](ConnectHttp.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Creates a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.

Creates a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.
Every materialization of the produced flow will attempt to establish a new outgoing connection.

Use the [ConnectHttp](ConnectHttp.html) DSL to configure target host and whether HTTPS should be used.

Prefer [connectionTo](#connectionTo(host:String):akka.http.javadsl.OutgoingConnectionBuilder) over this method.
36. [**](../../../akka/http/javadsl/Http.html#outgoingConnection(host:String):akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,java.util.concurrent.CompletionStage[akka.http.javadsl.OutgoingConnection]] "Permalink")  def outgoingConnection(host: String): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[OutgoingConnection](OutgoingConnection.html)]]Creates a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.

Creates a [akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) representing a prospective HTTP client connection to the given endpoint.
Every materialization of the produced flow will attempt to establish a new outgoing connection.

If the hostname is given with an `https://` prefix, the default [HttpsConnectionContext](HttpsConnectionContext.html) will be used.

Prefer [connectionTo](#connectionTo(host:String):akka.http.javadsl.OutgoingConnectionBuilder) over this method.
37. [**](../../../akka/http/javadsl/Http.html#serverLayer(settings:akka.http.javadsl.settings.ServerSettings,remoteAddress:java.util.Optional[java.net.InetSocketAddress],log:akka.event.LoggingAdapter):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpRequest,akka.NotUsed] "Permalink")  def serverLayer(settings: [ServerSettings](settings/ServerSettings.html), remoteAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpResponse](model/HttpResponse.html), SslTlsOutbound, SslTlsInbound, [HttpRequest](model/HttpRequest.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a server layer stage using the given ServerSettings.

Constructs a server layer stage using the given ServerSettings. The returned [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) isn't reusable and
can only be materialized once. The remoteAddress, if provided, will be added as a header to each HttpRequest
this layer produces if the `akka.http.server.remote-address-header` configuration option is enabled.
38. [**](../../../akka/http/javadsl/Http.html#serverLayer(settings:akka.http.javadsl.settings.ServerSettings,remoteAddress:java.util.Optional[java.net.InetSocketAddress]):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpRequest,akka.NotUsed] "Permalink")  def serverLayer(settings: [ServerSettings](settings/ServerSettings.html), remoteAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)]): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpResponse](model/HttpResponse.html), SslTlsOutbound, SslTlsInbound, [HttpRequest](model/HttpRequest.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a server layer stage using the given [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html).

Constructs a server layer stage using the given [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html). The returned [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) isn't reusable and
can only be materialized once. The `remoteAddress`, if provided, will be added as a header to each HttpRequest
this layer produces if the `akka.http.server.remote-address-header` configuration option is enabled.
39. [**](../../../akka/http/javadsl/Http.html#serverLayer(settings:akka.http.javadsl.settings.ServerSettings):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpRequest,akka.NotUsed] "Permalink")  def serverLayer(settings: [ServerSettings](settings/ServerSettings.html)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpResponse](model/HttpResponse.html), SslTlsOutbound, SslTlsInbound, [HttpRequest](model/HttpRequest.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a server layer stage using the given [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html).

Constructs a server layer stage using the given [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html). The returned [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) isn't reusable and
can only be materialized once.
40. [**](../../../akka/http/javadsl/Http.html#serverLayer():akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.HttpResponse,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.HttpRequest,akka.NotUsed] "Permalink")  def serverLayer(): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[HttpResponse](model/HttpResponse.html), SslTlsOutbound, SslTlsInbound, [HttpRequest](model/HttpRequest.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Constructs a server layer stage using the configured default [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html).

Constructs a server layer stage using the configured default [akka.http.javadsl.settings.ServerSettings](settings/ServerSettings.html). The returned [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) isn't
reusable and can only be materialized once.
41. [**](../../../akka/http/javadsl/Http.html#setDefaultClientHttpsContext(context:akka.http.javadsl.HttpsConnectionContext):Unit "Permalink")  def setDefaultClientHttpsContext(context: [HttpsConnectionContext](HttpsConnectionContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sets the default client\-side [ConnectionContext](ConnectionContext.html).
42. [**](../../../akka/http/javadsl/Http.html#shutdownAllConnectionPools():java.util.concurrent.CompletionStage[Unit] "Permalink")  def shutdownAllConnectionPools(): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)]Triggers an orderly shutdown of all host connections pools currently maintained by the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html).

Triggers an orderly shutdown of all host connections pools currently maintained by the [akka.actor.ActorSystem](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html).
The returned future is completed when all pools that were live at the time of this method call
have completed their shutdown process.

If existing pool client flows are re\-used or new ones materialized concurrently with or after this
method call the respective connection pools will be restarted and not contribute to the returned future.
43. [**](../../../akka/http/javadsl/Http.html#singleRequest(request:akka.http.javadsl.model.HttpRequest,connectionContext:akka.http.javadsl.HttpsConnectionContext,settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse] "Permalink")  def singleRequest(request: [HttpRequest](model/HttpRequest.html), connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html), settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](model/HttpResponse.html)]Fires a single HttpRequest across the (cached) host connection pool for the request's
effective URI to produce a response future.

Fires a single HttpRequest across the (cached) host connection pool for the request's
effective URI to produce a response future.

The given [HttpsConnectionContext](HttpsConnectionContext.html) will be used for encryption if the request is sent to an https endpoint.

Note that the request must have either an absolute URI or a valid `Host` header, otherwise
the future will be completed with an error.
44. [**](../../../akka/http/javadsl/Http.html#singleRequest(request:akka.http.javadsl.model.HttpRequest,connectionContext:akka.http.javadsl.HttpsConnectionContext):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse] "Permalink")  def singleRequest(request: [HttpRequest](model/HttpRequest.html), connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](model/HttpResponse.html)]Fires a single HttpRequest across the (cached) host connection pool for the request's
effective URI to produce a response future.

Fires a single HttpRequest across the (cached) host connection pool for the request's
effective URI to produce a response future.

The [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.javadsl.HttpsConnectionContext) is used to configure TLS for the connection.

Note that the request must have either an absolute URI or a valid `Host` header, otherwise
the future will be completed with an error.
45. [**](../../../akka/http/javadsl/Http.html#singleRequest(request:akka.http.javadsl.model.HttpRequest):java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse] "Permalink")  def singleRequest(request: [HttpRequest](model/HttpRequest.html)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](model/HttpResponse.html)]Fires a single HttpRequest across the (cached) host connection pool for the request's
effective URI to produce a response future.

Fires a single HttpRequest across the (cached) host connection pool for the request's
effective URI to produce a response future.

The [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.javadsl.HttpsConnectionContext) is used to configure TLS for the connection.

Note that the request must have either an absolute URI or a valid `Host` header, otherwise
the future will be completed with an error.
46. [**](../../../akka/http/javadsl/Http.html#singleWebSocketRequest[T](request:akka.http.javadsl.model.ws.WebSocketRequest,clientFlow:akka.stream.javadsl.Flow[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message,T],connectionContext:akka.http.javadsl.ConnectionContext,localAddress:java.util.Optional[java.net.InetSocketAddress],settings:akka.http.javadsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):akka.japi.Pair[java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse],T] "Permalink")  def singleWebSocketRequest\[T](request: [WebSocketRequest](model/ws/WebSocketRequest.html), clientFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), T], connectionContext: [ConnectionContext](ConnectionContext.html), localAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)], T]Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
WebSocket conversation.
47. [**](../../../akka/http/javadsl/Http.html#singleWebSocketRequest[T](request:akka.http.javadsl.model.ws.WebSocketRequest,clientFlow:akka.stream.javadsl.Flow[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message,T],connectionContext:akka.http.javadsl.ConnectionContext,materializer:akka.stream.Materializer):akka.japi.Pair[java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse],T] "Permalink")  def singleWebSocketRequest\[T](request: [WebSocketRequest](model/ws/WebSocketRequest.html), clientFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), T], connectionContext: [ConnectionContext](ConnectionContext.html), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)], T]Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
WebSocket conversation.

Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
WebSocket conversation.

The [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.javadsl.HttpsConnectionContext) is used to configure TLS for the connection.
48. [**](../../../akka/http/javadsl/Http.html#singleWebSocketRequest[T](request:akka.http.javadsl.model.ws.WebSocketRequest,clientFlow:akka.stream.javadsl.Flow[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message,T],materializer:akka.stream.Materializer):akka.japi.Pair[java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse],T] "Permalink")  def singleWebSocketRequest\[T](request: [WebSocketRequest](model/ws/WebSocketRequest.html), clientFlow: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), T], materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)], T]Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
WebSocket conversation.

Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
WebSocket conversation.

The [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.javadsl.HttpsConnectionContext) is used to configure TLS for the connection.
49. [**](../../../akka/http/javadsl/Http.html#superPool[T](settings:akka.http.javadsl.settings.ConnectionPoolSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.NotUsed] "Permalink")  def superPool\[T](settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs.

Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs. Note that incoming requests must have either an absolute URI or
a valid `Host` header.

The [defaultClientHttpsContext](#defaultClientHttpsContext:akka.http.javadsl.HttpsConnectionContext) is used to configure TLS for the connection.

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests `A` and `B` enter the `flow` in that order the response for `B` might be produced before the
response for `A`.

In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.
50. [**](../../../akka/http/javadsl/Http.html#superPool[T](settings:akka.http.javadsl.settings.ConnectionPoolSettings,connectionContext:akka.http.javadsl.HttpsConnectionContext,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.NotUsed] "Permalink")  def superPool\[T](settings: [ConnectionPoolSettings](settings/ConnectionPoolSettings.html), connectionContext: [HttpsConnectionContext](HttpsConnectionContext.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs.

Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs. Note that incoming requests must have either an absolute URI or
a valid `Host` header.

The given [HttpsConnectionContext](HttpsConnectionContext.html) is used to configure TLS for the connection.

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests `A` and `B` enter the `flow` in that order the response for `B` might be produced before the
response for `A`.

In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.
51. [**](../../../akka/http/javadsl/Http.html#superPool[T]():akka.stream.javadsl.Flow[akka.japi.Pair[akka.http.javadsl.model.HttpRequest,T],akka.japi.Pair[scala.util.Try[akka.http.javadsl.model.HttpResponse],T],akka.NotUsed] "Permalink")  def superPool\[T](): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[HttpRequest](model/HttpRequest.html), T], [Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[[Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[HttpResponse](model/HttpResponse.html)], T], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs.

Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
depending on their respective effective URIs. Note that incoming requests must have either an absolute URI or
a valid `Host` header.

Since the underlying transport usually comprises more than a single connection the produced flow might generate
responses in an order that doesn't directly match the consumed requests.
For example, if two requests `A` and `B` enter the flow in that order the response for `B` might be produced before the
response for `A`.
In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
object of type `T` from the application which is emitted together with the corresponding response.
52. [**](../../../akka/http/javadsl/Http.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
53. [**](../../../akka/http/javadsl/Http.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
54. [**](../../../akka/http/javadsl/Http.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
55. [**](../../../akka/http/javadsl/Http.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
56. [**](../../../akka/http/javadsl/Http.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
57. [**](../../../akka/http/javadsl/Http.html#webSocketClientFlow(request:akka.http.javadsl.model.ws.WebSocketRequest,connectionContext:akka.http.javadsl.ConnectionContext,localAddress:java.util.Optional[java.net.InetSocketAddress],settings:akka.http.javadsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Flow[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message,java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  def webSocketClientFlow(request: [WebSocketRequest](model/ws/WebSocketRequest.html), connectionContext: [ConnectionContext](ConnectionContext.html), localAddress: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[[InetSocketAddress](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/InetSocketAddress.html#java.net.InetSocketAddress)], settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.

Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.

The layer is not reusable and must only be materialized once.
58. [**](../../../akka/http/javadsl/Http.html#webSocketClientFlow(request:akka.http.javadsl.model.ws.WebSocketRequest):akka.stream.javadsl.Flow[akka.http.javadsl.model.ws.Message,akka.http.javadsl.model.ws.Message,java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  def webSocketClientFlow(request: [WebSocketRequest](model/ws/WebSocketRequest.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[Message](model/ws/Message.html), [Message](model/ws/Message.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.

Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.

The layer is not reusable and must only be materialized once.
59. [**](../../../akka/http/javadsl/Http.html#webSocketClientLayer(request:akka.http.javadsl.model.ws.WebSocketRequest,settings:akka.http.javadsl.settings.ClientConnectionSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.ws.Message,java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  def webSocketClientLayer(request: [WebSocketRequest](model/ws/WebSocketRequest.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[Message](model/ws/Message.html), SslTlsOutbound, SslTlsInbound, [Message](model/ws/Message.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]Constructs a WebSocket [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) using the configured default ClientConnectionSettings,
configured using the `akka.http.client` config section.

Constructs a WebSocket [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) using the configured default ClientConnectionSettings,
configured using the `akka.http.client` config section.

The layer is not reusable and must only be materialized once.
60. [**](../../../akka/http/javadsl/Http.html#webSocketClientLayer(request:akka.http.javadsl.model.ws.WebSocketRequest,settings:akka.http.javadsl.settings.ClientConnectionSettings):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.ws.Message,java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  def webSocketClientLayer(request: [WebSocketRequest](model/ws/WebSocketRequest.html), settings: [ClientConnectionSettings](settings/ClientConnectionSettings.html)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[Message](model/ws/Message.html), SslTlsOutbound, SslTlsInbound, [Message](model/ws/Message.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]Constructs a WebSocket [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) using the configured default ClientConnectionSettings,
configured using the `akka.http.client` config section.

Constructs a WebSocket [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html) using the configured default ClientConnectionSettings,
configured using the `akka.http.client` config section.

The layer is not reusable and must only be materialized once.
61. [**](../../../akka/http/javadsl/Http.html#webSocketClientLayer(request:akka.http.javadsl.model.ws.WebSocketRequest):akka.stream.javadsl.BidiFlow[akka.http.javadsl.model.ws.Message,akka.stream.TLSProtocol.SslTlsOutbound,akka.stream.TLSProtocol.SslTlsInbound,akka.http.javadsl.model.ws.Message,java.util.concurrent.CompletionStage[akka.http.javadsl.model.ws.WebSocketUpgradeResponse]] "Permalink")  def webSocketClientLayer(request: [WebSocketRequest](model/ws/WebSocketRequest.html)): [BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html#akka.stream.javadsl.BidiFlow)\[[Message](model/ws/Message.html), SslTlsOutbound, SslTlsInbound, [Message](model/ws/Message.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html)]]Constructs a WebSocket [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html).

Constructs a WebSocket [akka.stream.javadsl.BidiFlow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html).

The layer is not reusable and must only be materialized once.
### Deprecated Value Members

1. [**](../../../akka/http/javadsl/Http.html#bind(connect:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ServerSettings,log:akka.event.LoggingAdapter):akka.stream.javadsl.Source[akka.http.javadsl.IncomingConnection,java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding]] "Permalink")  def bind(connect: [ConnectHttp](ConnectHttp.html), settings: [ServerSettings](settings/ServerSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[IncomingConnection](IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]]Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

If the given port is 0 the resulting source can be materialized several times. Each materialization will
then be assigned a new local port by the operating system, which can then be retrieved by the materialized
[ServerBinding](ServerBinding.html).

If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
[ServerBinding](ServerBinding.html).

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
2. [**](../../../akka/http/javadsl/Http.html#bind(connect:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ServerSettings):akka.stream.javadsl.Source[akka.http.javadsl.IncomingConnection,java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding]] "Permalink")  def bind(connect: [ConnectHttp](ConnectHttp.html), settings: [ServerSettings](settings/ServerSettings.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[IncomingConnection](IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]]Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

If the given port is 0 the resulting source can be materialized several times. Each materialization will
then be assigned a new local port by the operating system, which can then be retrieved by the materialized
[ServerBinding](ServerBinding.html).

If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
[ServerBinding](ServerBinding.html).

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
3. [**](../../../akka/http/javadsl/Http.html#bind(connect:akka.http.javadsl.ConnectHttp):akka.stream.javadsl.Source[akka.http.javadsl.IncomingConnection,java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding]] "Permalink")  def bind(connect: [ConnectHttp](ConnectHttp.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html#akka.stream.javadsl.Source)\[[IncomingConnection](IncomingConnection.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]]Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

Creates a [akka.stream.javadsl.Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html) of [IncomingConnection](IncomingConnection.html) instances which represents a prospective HTTP server binding
on the given `endpoint`.

If the given port is 0 the resulting source can be materialized several times. Each materialization will
then be assigned a new local port by the operating system, which can then be retrieved by the materialized
[ServerBinding](ServerBinding.html).

If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
[ServerBinding](ServerBinding.html).

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
4. [**](../../../akka/http/javadsl/Http.html#bindAndHandle(handler:akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,_],connect:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ServerSettings,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink")  def bindAndHandle(handler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), \_], connect: [ConnectHttp](ConnectHttp.html), settings: [ServerSettings](settings/ServerSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
5. [**](../../../akka/http/javadsl/Http.html#bindAndHandle(handler:akka.stream.javadsl.Flow[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse,_],connect:akka.http.javadsl.ConnectHttp,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink")  def bindAndHandle(handler: [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html), \_], connect: [ConnectHttp](ConnectHttp.html), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
[akka.stream.javadsl.Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html) for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
6. [**](../../../akka/http/javadsl/Http.html#bindAndHandleAsync(handler:akka.japi.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]],connect:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ServerSettings,parallelism:Int,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink")  def bindAndHandleAsync(handler: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html#akka.japi.Function)\[[HttpRequest](model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](model/HttpResponse.html)]], connect: [ConnectHttp](ConnectHttp.html), settings: [ServerSettings](settings/ServerSettings.html), parallelism: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
7. [**](../../../akka/http/javadsl/Http.html#bindAndHandleAsync(handler:akka.japi.Function[akka.http.javadsl.model.HttpRequest,java.util.concurrent.CompletionStage[akka.http.javadsl.model.HttpResponse]],connect:akka.http.javadsl.ConnectHttp,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink")  def bindAndHandleAsync(handler: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html#akka.japi.Function)\[[HttpRequest](model/HttpRequest.html), [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[HttpResponse](model/HttpResponse.html)]], connect: [ConnectHttp](ConnectHttp.html), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
8. [**](../../../akka/http/javadsl/Http.html#bindAndHandleSync(handler:akka.japi.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse],connect:akka.http.javadsl.ConnectHttp,settings:akka.http.javadsl.settings.ServerSettings,log:akka.event.LoggingAdapter,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink")  def bindAndHandleSync(handler: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html#akka.japi.Function)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html)], connect: [ConnectHttp](ConnectHttp.html), settings: [ServerSettings](settings/ServerSettings.html), log: [LoggingAdapter](https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html#akka.event.LoggingAdapter), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
9. [**](../../../akka/http/javadsl/Http.html#bindAndHandleSync(handler:akka.japi.Function[akka.http.javadsl.model.HttpRequest,akka.http.javadsl.model.HttpResponse],connect:akka.http.javadsl.ConnectHttp,materializer:akka.stream.Materializer):java.util.concurrent.CompletionStage[akka.http.javadsl.ServerBinding] "Permalink")  def bindAndHandleSync(handler: [Function](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html#akka.japi.Function)\[[HttpRequest](model/HttpRequest.html), [HttpResponse](model/HttpResponse.html)], connect: [ConnectHttp](ConnectHttp.html), materializer: [Materializer](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html#akka.stream.Materializer)): [CompletionStage](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[ServerBinding](ServerBinding.html)]Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
function for processing all incoming connections.

The number of concurrently accepted connections can be configured by overriding
the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
information about what kind of guarantees to expect.

The server will be bound using HTTPS if the [ConnectHttp](ConnectHttp.html) object is configured with an [HttpsConnectionContext](HttpsConnectionContext.html),
or the [defaultServerHttpContext](#defaultServerHttpContext:akka.http.javadsl.ConnectionContext) has been configured to be an [HttpsConnectionContext](HttpsConnectionContext.html).

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Use newServerAt instead
10. [**](../../../akka/http/javadsl/Http.html#defaultServerHttpContext:akka.http.javadsl.ConnectionContext "Permalink")  def defaultServerHttpContext: [ConnectionContext](ConnectionContext.html)Gets the current default server\-side [ConnectionContext](ConnectionContext.html) – defaults to plain HTTP.

Gets the current default server\-side [ConnectionContext](ConnectionContext.html) – defaults to plain HTTP.
Can be modified using [setDefaultServerHttpContext](#setDefaultServerHttpContext(context:akka.http.javadsl.ConnectionContext):Unit), and will then apply for servers bound after that call has completed.

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Set context explicitly when binding
11. [**](../../../akka/http/javadsl/Http.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
12. [**](../../../akka/http/javadsl/Http.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from Http toStringFormat\[Http] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
13. [**](../../../akka/http/javadsl/Http.html#setDefaultServerHttpContext(context:akka.http.javadsl.ConnectionContext):Unit "Permalink")  def setDefaultServerHttpContext(context: [ConnectionContext](ConnectionContext.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Sets the default server\-side [ConnectionContext](ConnectionContext.html).

Sets the default server\-side [ConnectionContext](ConnectionContext.html).
If it is an instance of [HttpsConnectionContext](HttpsConnectionContext.html) then the server will be bound using HTTPS.

Annotations@Deprecated @deprecated Deprecated*(Since version 10\.2\.0\)* Set context explicitly when binding
14. [**](../../../akka/http/javadsl/Http.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (Http, B)ImplicitThis member is added by an implicit conversion from Http toArrowAssoc\[Http] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html#akka.actor.Extension)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromHttp to any2stringadd\[Http]

### Inherited by implicit conversion StringFormat fromHttp to StringFormat\[Http]

### Inherited by implicit conversion Ensuring fromHttp to Ensuring\[Http]

### Inherited by implicit conversion ArrowAssoc fromHttp to ArrowAssoc\[Http]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/event/LoggingAdapter.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Function.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/Materializer.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/BidiFlow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Source.html
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
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/server/index.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/api/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html

---
*Source: [https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http.html](https://doc.akka.io/api/akka-http/current/akka/http/javadsl/Http.html)*