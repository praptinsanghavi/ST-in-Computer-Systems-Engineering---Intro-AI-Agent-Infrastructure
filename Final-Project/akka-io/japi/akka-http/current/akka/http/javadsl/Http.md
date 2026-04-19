---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:44:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http.html
title: Http
---

# Http

## Content

Package [akka.http.javadsl](package-summary.html)
## Class Http

- java.lang.Object
- - akka.http.javadsl.Http

- All Implemented Interfaces:
`akka.actor.Extension`

---

```
public class Http
extends java.lang.Object
implements akka.actor.Extension
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>>` | `[bind](#bind(akka.http.javadsl.ConnectHttp))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).connectionSource() instead |
	| `akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>>` | `[bind](#bind(akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ServerSettings))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).connectionSource() instead |
	| `akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>>` | `[bind](#bind(akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ServerSettings,akka.event.LoggingAdapter))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).connectionSource() instead |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindAndHandle](#bindAndHandle(akka.stream.javadsl.Flow,akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​?> handler,  [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer materializer)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).bindFlow(handler) instead. |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindAndHandle](#bindAndHandle(akka.stream.javadsl.Flow,akka.http.javadsl.ConnectHttp,akka.stream.Materializer))​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​?> handler,  [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  akka.stream.Materializer materializer)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).bindFlow(handler) instead. |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindAndHandleAsync](#bindAndHandleAsync(akka.japi.Function,akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ServerSettings,int,akka.event.LoggingAdapter,akka.stream.Materializer))​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,  [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,  int parallelism,  akka.event.LoggingAdapter log,  akka.stream.Materializer materializer)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).bind(handler) instead |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindAndHandleAsync](#bindAndHandleAsync(akka.japi.Function,akka.http.javadsl.ConnectHttp,akka.stream.Materializer))​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,  [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  akka.stream.Materializer materializer)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).bind(handler) instead |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindAndHandleSync](#bindAndHandleSync(akka.japi.Function,akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler,  [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer materializer)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).bindSync(handler) instead |
	| `java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>` | `[bindAndHandleSync](#bindAndHandleSync(akka.japi.Function,akka.http.javadsl.ConnectHttp,akka.stream.Materializer))​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler,  [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,  akka.stream.Materializer materializer)` | Deprecated. since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).bindSync(handler) instead |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[cachedHostConnectionPool](#cachedHostConnectionPool(akka.http.javadsl.ConnectHttp))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to)` | Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing  HTTP connections to the given target host endpoint. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[cachedHostConnectionPool](#cachedHostConnectionPool(akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing  HTTP connections to the given target host endpoint. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[cachedHostConnectionPool](#cachedHostConnectionPool(java.lang.String))​(java.lang.String host)` | Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing  HTTP connections to the given target host endpoint. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[cachedHostConnectionPoolHttps](#cachedHostConnectionPoolHttps(akka.http.javadsl.ConnectHttp))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to)` | Same as [`<T>cachedHostConnectionPool(java.lang.String)`](#cachedHostConnectionPool(java.lang.String)) but with HTTPS encryption. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[cachedHostConnectionPoolHttps](#cachedHostConnectionPoolHttps(akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Same as [`<T>cachedHostConnectionPool(java.lang.String)`](#cachedHostConnectionPool(java.lang.String)) but with HTTPS encryption. |
	| `akka.stream.javadsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[clientLayer](#clientLayer(akka.http.javadsl.model.headers.Host))​([Host](model/headers/Host.html "class in akka.http.javadsl.model.headers") hostHeader)` | Constructs a client layer stage using the configured default [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings"). |
	| `akka.stream.javadsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[clientLayer](#clientLayer(akka.http.javadsl.model.headers.Host,akka.http.javadsl.settings.ClientConnectionSettings))​([Host](model/headers/Host.html "class in akka.http.javadsl.model.headers") hostHeader,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings)` | Constructs a client layer stage using the given [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings"). |
	| `akka.stream.javadsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[clientLayer](#clientLayer(akka.http.javadsl.model.headers.Host,akka.http.javadsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([Host](model/headers/Host.html "class in akka.http.javadsl.model.headers") hostHeader,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Constructs a client layer stage using the given `ClientConnectionSettings`. |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl")` | `[connectionTo](#connectionTo(java.lang.String))​(java.lang.String host)` | Creates a builder which will create a single connection to a host every time the built flow is materialized. |
	| `static [Http](Http.html "class in akka.http.javadsl")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​(akka.actor.ExtendedActorSystem system)` |  |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl")` | `[defaultClientHttpsContext](#defaultClientHttpsContext())()` | Gets the current default client\-side [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl"). |
	| `[ConnectionContext](ConnectionContext.html "class in akka.http.javadsl")` | `[defaultServerHttpContext](#defaultServerHttpContext())()` | Deprecated. since 10\.2\.0: set context explicitly when binding |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [Http](Http.html "class in akka.http.javadsl")` | `[get](#get(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [Http](Http.html "class in akka.http.javadsl")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​(akka.actor.ClassicActorSystemProvider system)` |  |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [Http$](Http$.html "class in akka.http.javadsl")` | `[lookup](#lookup())()` |  |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[newHostConnectionPool](#newHostConnectionPool(akka.http.javadsl.ConnectHttp,akka.http.javadsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer materializer)` | Same as [`<T>newHostConnectionPool(java.lang.String,akka.stream.Materializer)`](#newHostConnectionPool(java.lang.String,akka.stream.Materializer)) but with HTTPS encryption. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[newHostConnectionPool](#newHostConnectionPool(akka.http.javadsl.ConnectHttp,akka.stream.Materializer))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,  akka.stream.Materializer materializer)` | Starts a new connection pool to the given host and configuration and returns a `Flow` which dispatches  the requests from all its materializations across this pool. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")>` | `[newHostConnectionPool](#newHostConnectionPool(java.lang.String,akka.stream.Materializer))​(java.lang.String host,  akka.stream.Materializer materializer)` | Starts a new connection pool to the given host and configuration and returns a `Flow` which dispatches  the requests from all its materializations across this pool. |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl")` | `[newServerAt](#newServerAt(java.lang.String,int))​(java.lang.String interface_,  int port)` | Main entry point to create a server binding. |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[outgoingConnection](#outgoingConnection(akka.http.javadsl.ConnectHttp))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to)` | Creates a `Flow` representing a prospective HTTP client connection to the given endpoint. |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[outgoingConnection](#outgoingConnection(akka.http.javadsl.ConnectHttp,java.util.Optional,akka.http.javadsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,  java.util.Optional<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Creates a `Flow` representing a prospective HTTP client connection to the given endpoint. |
	| `akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>>` | `[outgoingConnection](#outgoingConnection(java.lang.String))​(java.lang.String host)` | Creates a `Flow` representing a prospective HTTP client connection to the given endpoint. |
	| `akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[serverLayer](#serverLayer())()` | Constructs a server layer stage using the configured default [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"). |
	| `akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[serverLayer](#serverLayer(akka.http.javadsl.settings.ServerSettings))​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings)` | Constructs a server layer stage using the given [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"). |
	| `akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[serverLayer](#serverLayer(akka.http.javadsl.settings.ServerSettings,java.util.Optional))​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,  java.util.Optional<java.net.InetSocketAddress> remoteAddress)` | Constructs a server layer stage using the given [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"). |
	| `akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed>` | `[serverLayer](#serverLayer(akka.http.javadsl.settings.ServerSettings,java.util.Optional,akka.event.LoggingAdapter))​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,  java.util.Optional<java.net.InetSocketAddress> remoteAddress,  akka.event.LoggingAdapter log)` | Constructs a server layer stage using the given `ServerSettings`. |
	| `void` | `[setDefaultClientHttpsContext](#setDefaultClientHttpsContext(akka.http.javadsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)` | Sets the default client\-side [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl"). |
	| `void` | `[setDefaultServerHttpContext](#setDefaultServerHttpContext(akka.http.javadsl.ConnectionContext))​([ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") context)` | Deprecated. since 10\.2\.0: set context explicitly when binding |
	| `java.util.concurrent.CompletionStage<scala.runtime.BoxedUnit>` | `[shutdownAllConnectionPools](#shutdownAllConnectionPools())()` | Triggers an orderly shutdown of all host connections pools currently maintained by the `ActorSystem`. |
	| `java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[singleRequest](#singleRequest(akka.http.javadsl.model.HttpRequest))​([HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model") request)` | Fires a single `HttpRequest` across the (cached) host connection pool for the request's  effective URI to produce a response future. |
	| `java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[singleRequest](#singleRequest(akka.http.javadsl.model.HttpRequest,akka.http.javadsl.HttpsConnectionContext))​([HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model") request,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") connectionContext)` | Fires a single `HttpRequest` across the (cached) host connection pool for the request's  effective URI to produce a response future. |
	| `java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>` | `[singleRequest](#singleRequest(akka.http.javadsl.model.HttpRequest,akka.http.javadsl.HttpsConnectionContext,akka.http.javadsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​([HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model") request,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") connectionContext,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Fires a single `HttpRequest` across the (cached) host connection pool for the request's  effective URI to produce a response future. |
	| `<T> akka.japi.Pair<java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>,​T>` | `[singleWebSocketRequest](#singleWebSocketRequest(akka.http.javadsl.model.ws.WebSocketRequest,akka.stream.javadsl.Flow,akka.http.javadsl.ConnectionContext,akka.stream.Materializer))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,  akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientFlow,  [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") connectionContext,  akka.stream.Materializer materializer)` | Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the  WebSocket conversation. |
	| `<T> akka.japi.Pair<java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>,​T>` | `[singleWebSocketRequest](#singleWebSocketRequest(akka.http.javadsl.model.ws.WebSocketRequest,akka.stream.javadsl.Flow,akka.http.javadsl.ConnectionContext,java.util.Optional,akka.http.javadsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,  akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientFlow,  [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") connectionContext,  java.util.Optional<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer materializer)` | Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the  WebSocket conversation. |
	| `<T> akka.japi.Pair<java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>,​T>` | `[singleWebSocketRequest](#singleWebSocketRequest(akka.http.javadsl.model.ws.WebSocketRequest,akka.stream.javadsl.Flow,akka.stream.Materializer))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,  akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientFlow,  akka.stream.Materializer materializer)` | Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the  WebSocket conversation. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​akka.NotUsed>` | `[superPool](#superPool())()` | Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool  depending on their respective effective URIs. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​akka.NotUsed>` | `[superPool](#superPool(akka.http.javadsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​([ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool  depending on their respective effective URIs. |
	| `<T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​akka.NotUsed>` | `[superPool](#superPool(akka.http.javadsl.settings.ConnectionPoolSettings,akka.http.javadsl.HttpsConnectionContext,akka.event.LoggingAdapter))​([ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") connectionContext,  akka.event.LoggingAdapter log)` | Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool  depending on their respective effective URIs. |
	| `akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>>` | `[webSocketClientFlow](#webSocketClientFlow(akka.http.javadsl.model.ws.WebSocketRequest))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request)` | Constructs a flow that once materialized establishes a WebSocket connection to the given Uri. |
	| `akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>>` | `[webSocketClientFlow](#webSocketClientFlow(akka.http.javadsl.model.ws.WebSocketRequest,akka.http.javadsl.ConnectionContext,java.util.Optional,akka.http.javadsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,  [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") connectionContext,  java.util.Optional<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Constructs a flow that once materialized establishes a WebSocket connection to the given Uri. |
	| `akka.stream.javadsl.BidiFlow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>>` | `[webSocketClientLayer](#webSocketClientLayer(akka.http.javadsl.model.ws.WebSocketRequest))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request)` | Constructs a WebSocket `BidiFlow`. |
	| `akka.stream.javadsl.BidiFlow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>>` | `[webSocketClientLayer](#webSocketClientLayer(akka.http.javadsl.model.ws.WebSocketRequest,akka.http.javadsl.settings.ClientConnectionSettings))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings)` | Constructs a WebSocket `BidiFlow` using the configured default `ClientConnectionSettings`,  configured using the `akka.http.client` config section. |
	| `akka.stream.javadsl.BidiFlow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>>` | `[webSocketClientLayer](#webSocketClientLayer(akka.http.javadsl.model.ws.WebSocketRequest,akka.http.javadsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,  akka.event.LoggingAdapter log)` | Constructs a WebSocket `BidiFlow` using the configured default `ClientConnectionSettings`,  configured using the `akka.http.client` config section. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http
		
		
		
		```
		public Http​(akka.actor.ExtendedActorSystem system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [Http](Http.html "class in akka.http.javadsl") get​(akka.actor.ActorSystem system)
		```
		- #### get
		
		
		
		```
		public static [Http](Http.html "class in akka.http.javadsl") get​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### lookup
		
		
		
		```
		public static [Http$](Http$.html "class in akka.http.javadsl") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [Http](Http.html "class in akka.http.javadsl") createExtension​(akka.actor.ExtendedActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ClassicActorSystemProvider system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### serverLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed> serverLayer()
		```
		
		Constructs a server layer stage using the configured default [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"). The returned `BidiFlow` isn't
		 reusable and can only be materialized once.
		
		Returns:
		(undocumented)
		- #### serverLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed> serverLayer​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		Constructs a server layer stage using the given [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"). The returned `BidiFlow` isn't reusable and
		 can only be materialized once.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### serverLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed> serverLayer​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                            java.util.Optional<java.net.InetSocketAddress> remoteAddress)
		```
		
		Constructs a server layer stage using the given [`ServerSettings`](settings/ServerSettings.html "class in akka.http.javadsl.settings"). The returned `BidiFlow` isn't reusable and
		 can only be materialized once. The `remoteAddress`, if provided, will be added as a header to each `HttpRequest`
		 this layer produces if the `akka.http.server.remote-address-header` configuration option is enabled.
		
		Parameters:
		`settings` \- (undocumented)
		`remoteAddress` \- (undocumented)
		Returns:
		(undocumented)
		- #### serverLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.NotUsed> serverLayer​([ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                            java.util.Optional<java.net.InetSocketAddress> remoteAddress,
		                                                                                                                                                                                            akka.event.LoggingAdapter log)
		```
		
		Constructs a server layer stage using the given `ServerSettings`. The returned `BidiFlow` isn't reusable and
		 can only be materialized once. The remoteAddress, if provided, will be added as a header to each `HttpRequest`
		 this layer produces if the `akka.http.server.remote-address-header` configuration option is enabled.
		
		Parameters:
		`settings` \- (undocumented)
		`remoteAddress` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### newServerAt
		
		
		
		```
		public [ServerBuilder](ServerBuilder.html "interface in akka.http.javadsl") newServerAt​(java.lang.String interface_,
		                                 int port)
		```
		
		Main entry point to create a server binding.
		 
		
		Parameters:
		`interface` \- The interface to bind to.
		`port` \- The port to bind to or `0` if the port should be automatically assigned.
		`interface_` \- (undocumented)
		Returns:
		(undocumented)
		- #### bind
		
		
		
		```
		public akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>> bind​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).connectionSource() instead
		
		Creates a `Source` of [`IncomingConnection`](IncomingConnection.html "class in akka.http.javadsl") instances which represents a prospective HTTP server binding
		 on the given `endpoint`.
		 
		 If the given port is 0 the resulting source can be materialized several times. Each materialization will
		 then be assigned a new local port by the operating system, which can then be retrieved by the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
		 fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`connect` \- (undocumented)
		Returns:
		(undocumented)
		- #### bind
		
		
		
		```
		public akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>> bind​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                                                                     [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).connectionSource() instead
		
		Creates a `Source` of [`IncomingConnection`](IncomingConnection.html "class in akka.http.javadsl") instances which represents a prospective HTTP server binding
		 on the given `endpoint`.
		 
		 If the given port is 0 the resulting source can be materialized several times. Each materialization will
		 then be assigned a new local port by the operating system, which can then be retrieved by the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
		 fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`connect` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### bind
		
		
		
		```
		public akka.stream.javadsl.Source<[IncomingConnection](IncomingConnection.html "class in akka.http.javadsl"),​java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")>> bind​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                                                                     [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                     akka.event.LoggingAdapter log)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).connectionSource() instead
		
		Creates a `Source` of [`IncomingConnection`](IncomingConnection.html "class in akka.http.javadsl") instances which represents a prospective HTTP server binding
		 on the given `endpoint`.
		 
		 If the given port is 0 the resulting source can be materialized several times. Each materialization will
		 then be assigned a new local port by the operating system, which can then be retrieved by the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
		 fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
		 [`ServerBinding`](ServerBinding.html "class in akka.http.javadsl").
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`connect` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandle
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindAndHandle​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​?> handler,
		                                                                         [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                         akka.stream.Materializer materializer)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).bindFlow(handler) instead.
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`connect` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandle
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindAndHandle​(akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​?> handler,
		                                                                         [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                         [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                         akka.event.LoggingAdapter log,
		                                                                         akka.stream.Materializer materializer)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).bindFlow(handler) instead.
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`connect` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandleSync
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindAndHandleSync​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler,
		                                                                             [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                             akka.stream.Materializer materializer)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).bindSync(handler) instead
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		 function for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`connect` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandleSync
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindAndHandleSync​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> handler,
		                                                                             [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                             [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                             akka.event.LoggingAdapter log,
		                                                                             akka.stream.Materializer materializer)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).bindSync(handler) instead
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		 function for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`connect` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandleAsync
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindAndHandleAsync​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,
		                                                                              [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                              akka.stream.Materializer materializer)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).bind(handler) instead
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		 function for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`connect` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandleAsync
		
		
		
		```
		public java.util.concurrent.CompletionStage<[ServerBinding](ServerBinding.html "class in akka.http.javadsl")> bindAndHandleAsync​(akka.japi.Function<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>> handler,
		                                                                              [ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") connect,
		                                                                              [ServerSettings](settings/ServerSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                              int parallelism,
		                                                                              akka.event.LoggingAdapter log,
		                                                                              akka.stream.Materializer materializer)
		```
		
		Deprecated.
		since 10\.2\.0: Use Http.get(system).newServerAt(interface, port).withSettings(settings).logTo(log).bind(handler) instead
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		 function for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 The server will be bound using HTTPS if the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") object is configured with an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl"),
		 or the [`defaultServerHttpContext()`](#defaultServerHttpContext()) has been configured to be an [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl").
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`connect` \- (undocumented)
		`settings` \- (undocumented)
		`parallelism` \- (undocumented)
		`log` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> clientLayer​([Host](model/headers/Host.html "class in akka.http.javadsl.model.headers") hostHeader)
		```
		
		Constructs a client layer stage using the configured default [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings").
		
		Parameters:
		`hostHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> clientLayer​([Host](model/headers/Host.html "class in akka.http.javadsl.model.headers") hostHeader,
		                                                                                                                                                                                            [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		Constructs a client layer stage using the given [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings").
		
		Parameters:
		`hostHeader` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​akka.NotUsed> clientLayer​([Host](model/headers/Host.html "class in akka.http.javadsl.model.headers") hostHeader,
		                                                                                                                                                                                            [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                            akka.event.LoggingAdapter log)
		```
		
		Constructs a client layer stage using the given `ClientConnectionSettings`.
		
		Parameters:
		`hostHeader` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### outgoingConnection
		
		
		
		```
		public akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> outgoingConnection​(java.lang.String host)
		```
		
		Creates a `Flow` representing a prospective HTTP client connection to the given endpoint.
		 Every materialization of the produced flow will attempt to establish a new outgoing connection.
		 
		 If the hostname is given with an `https://` prefix, the default [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl") will be used.
		 
		
		
		 Prefer [`connectionTo(java.lang.String)`](#connectionTo(java.lang.String)) over this method.
		
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### outgoingConnection
		
		
		
		```
		public akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> outgoingConnection​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to)
		```
		
		Creates a `Flow` representing a prospective HTTP client connection to the given endpoint.
		 Every materialization of the produced flow will attempt to establish a new outgoing connection.
		 
		 Use the [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") DSL to configure target host and whether HTTPS should be used.
		 
		
		
		 Prefer [`connectionTo(java.lang.String)`](#connectionTo(java.lang.String)) over this method.
		
		
		
		Parameters:
		`to` \- (undocumented)
		Returns:
		(undocumented)
		- #### outgoingConnection
		
		
		
		```
		public akka.stream.javadsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model"),​java.util.concurrent.CompletionStage<[OutgoingConnection](OutgoingConnection.html "class in akka.http.javadsl")>> outgoingConnection​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,
		                                                                                                                                                  java.util.Optional<java.net.InetSocketAddress> localAddress,
		                                                                                                                                                  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                  akka.event.LoggingAdapter log)
		```
		
		Creates a `Flow` representing a prospective HTTP client connection to the given endpoint.
		 Every materialization of the produced flow will attempt to establish a new outgoing connection.
		 
		 Prefer [`connectionTo(java.lang.String)`](#connectionTo(java.lang.String)) over this method.
		
		
		
		Parameters:
		`to` \- (undocumented)
		`localAddress` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### connectionTo
		
		
		
		```
		public [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.javadsl") connectionTo​(java.lang.String host)
		```
		
		Creates a builder which will create a single connection to a host every time the built flow is materialized. There
		 is no pooling and you are yourself responsible for lifecycle management of the connection. For a more convenient
		 Request level API see `singleRequest()`
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		A builder to configure more specific setup for the connection and then build a `Flow>Request, Response, CompletionStage>OutgoingConnection>>`.
		- #### newHostConnectionPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> newHostConnectionPool​(java.lang.String host,
		                                                                                                                                                                                   akka.stream.Materializer materializer)
		```
		
		Starts a new connection pool to the given host and configuration and returns a `Flow` which dispatches
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
		
		
		
		Parameters:
		`host` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### newHostConnectionPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> newHostConnectionPool​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,
		                                                                                                                                                                                   akka.stream.Materializer materializer)
		```
		
		Starts a new connection pool to the given host and configuration and returns a `Flow` which dispatches
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
		
		
		
		Parameters:
		`to` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### newHostConnectionPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> newHostConnectionPool​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,
		                                                                                                                                                                                   [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                   akka.event.LoggingAdapter log,
		                                                                                                                                                                                   akka.stream.Materializer materializer)
		```
		
		Same as [`<T>newHostConnectionPool(java.lang.String,akka.stream.Materializer)`](#newHostConnectionPool(java.lang.String,akka.stream.Materializer)) but with HTTPS encryption.
		 
		 The given [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl") will be used for encryption on the connection.
		
		
		
		Parameters:
		`to` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachedHostConnectionPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> cachedHostConnectionPool​(java.lang.String host)
		```
		
		Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
		 HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
		 configuration a separate connection pool is maintained.
		 The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
		 The returned `Flow` instances therefore remain valid throughout the lifetime of the application.
		 
		 The internal caching logic guarantees that there will never be more than a single pool running for the
		 given target host endpoint and configuration (in this ActorSystem).
		 
		
		
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests A and B enter the flow in that order the response for B might be produced before the
		 response for A.
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachedHostConnectionPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> cachedHostConnectionPool​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to)
		```
		
		Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
		 HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
		 configuration a separate connection pool is maintained.
		 The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
		 The returned `Flow` instances therefore remain valid throughout the lifetime of the application.
		 
		 The internal caching logic guarantees that there will never be more than a single pool running for the
		 given target host endpoint and configuration (in this ActorSystem).
		 
		
		
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests A and B enter the flow in that order the response for B might be produced before the
		 response for A.
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		
		
		
		Parameters:
		`to` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachedHostConnectionPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> cachedHostConnectionPool​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,
		                                                                                                                                                                                      [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                      akka.event.LoggingAdapter log)
		```
		
		Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing
		 HTTP connections to the given target host endpoint. For every ActorSystem, target host and pool
		 configuration a separate connection pool is maintained.
		 The HTTP layer transparently manages idle shutdown and restarting of connections pools as configured.
		 The returned `Flow` instances therefore remain valid throughout the lifetime of the application.
		 
		 The internal caching logic guarantees that there will never be more than a single pool running for the
		 given target host endpoint and configuration (in this ActorSystem).
		 
		
		
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests A and B enter the flow in that order the response for B might be produced before the
		 response for A.
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		 
		
		
		 To configure additional settings for the pool (and requests made using it),
		 use the `akka.http.host-connection-pool` config section or pass in a `ConnectionPoolSettings` explicitly.
		
		
		
		Parameters:
		`to` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachedHostConnectionPoolHttps
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> cachedHostConnectionPoolHttps​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to,
		                                                                                                                                                                                           [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                           akka.event.LoggingAdapter log)
		```
		
		Same as [`<T>cachedHostConnectionPool(java.lang.String)`](#cachedHostConnectionPool(java.lang.String)) but with HTTPS encryption.
		 
		 When an [`HttpConnectionContext`](HttpConnectionContext.html "class in akka.http.javadsl") is defined in the given [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") it will be used, otherwise the default client\-side context will be used.
		
		
		
		Parameters:
		`to` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachedHostConnectionPoolHttps
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​[HostConnectionPool](HostConnectionPool.html "class in akka.http.javadsl")> cachedHostConnectionPoolHttps​([ConnectHttp](ConnectHttp.html "class in akka.http.javadsl") to)
		```
		
		Same as [`<T>cachedHostConnectionPool(java.lang.String)`](#cachedHostConnectionPool(java.lang.String)) but with HTTPS encryption.
		 
		 When an [`HttpConnectionContext`](HttpConnectionContext.html "class in akka.http.javadsl") is defined in the given [`ConnectHttp`](ConnectHttp.html "class in akka.http.javadsl") it will be used, otherwise the default client\-side context will be used.
		
		
		
		Parameters:
		`to` \- (undocumented)
		Returns:
		(undocumented)
		- #### superPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​akka.NotUsed> superPool()
		```
		
		Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
		 depending on their respective effective URIs. Note that incoming requests must have either an absolute URI or
		 a valid `Host` header.
		 
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests `A` and `B` enter the flow in that order the response for `B` might be produced before the
		 response for `A`.
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		
		
		
		Returns:
		(undocumented)
		- #### superPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​akka.NotUsed> superPool​([ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                 [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") connectionContext,
		                                                                                                                                                                 akka.event.LoggingAdapter log)
		```
		
		Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
		 depending on their respective effective URIs. Note that incoming requests must have either an absolute URI or
		 a valid `Host` header.
		 
		 The given [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl") is used to configure TLS for the connection.
		 
		
		
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests `A` and `B` enter the `flow` in that order the response for `B` might be produced before the
		 response for `A`.
		 
		
		
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		
		
		
		Parameters:
		`settings` \- (undocumented)
		`connectionContext` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### superPool
		
		
		
		```
		public <T> akka.stream.javadsl.Flow<akka.japi.Pair<[HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model"),​T>,​akka.japi.Pair<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")>,​T>,​akka.NotUsed> superPool​([ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                 akka.event.LoggingAdapter log)
		```
		
		Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
		 depending on their respective effective URIs. Note that incoming requests must have either an absolute URI or
		 a valid `Host` header.
		 
		 The [`defaultClientHttpsContext()`](#defaultClientHttpsContext()) is used to configure TLS for the connection.
		 
		
		
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests `A` and `B` enter the `flow` in that order the response for `B` might be produced before the
		 response for `A`.
		 
		
		
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		
		
		
		Parameters:
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleRequest
		
		
		
		```
		public java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> singleRequest​([HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model") request)
		```
		
		Fires a single `HttpRequest` across the (cached) host connection pool for the request's
		 effective URI to produce a response future.
		 
		 The [`defaultClientHttpsContext()`](#defaultClientHttpsContext()) is used to configure TLS for the connection.
		 
		
		
		 Note that the request must have either an absolute URI or a valid `Host` header, otherwise
		 the future will be completed with an error.
		
		
		
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleRequest
		
		
		
		```
		public java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> singleRequest​([HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model") request,
		                                                                        [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") connectionContext)
		```
		
		Fires a single `HttpRequest` across the (cached) host connection pool for the request's
		 effective URI to produce a response future.
		 
		 The [`defaultClientHttpsContext()`](#defaultClientHttpsContext()) is used to configure TLS for the connection.
		 
		
		
		 Note that the request must have either an absolute URI or a valid `Host` header, otherwise
		 the future will be completed with an error.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`connectionContext` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleRequest
		
		
		
		```
		public java.util.concurrent.CompletionStage<[HttpResponse](model/HttpResponse.html "class in akka.http.javadsl.model")> singleRequest​([HttpRequest](model/HttpRequest.html "class in akka.http.javadsl.model") request,
		                                                                        [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") connectionContext,
		                                                                        [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                        akka.event.LoggingAdapter log)
		```
		
		Fires a single `HttpRequest` across the (cached) host connection pool for the request's
		 effective URI to produce a response future.
		 
		 The given [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl") will be used for encryption if the request is sent to an https endpoint.
		 
		
		
		 Note that the request must have either an absolute URI or a valid `Host` header, otherwise
		 the future will be completed with an error.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### webSocketClientLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>> webSocketClientLayer​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request)
		```
		
		Constructs a WebSocket `BidiFlow`.
		 
		 The layer is not reusable and must only be materialized once.
		
		
		
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### webSocketClientLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>> webSocketClientLayer​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,
		                                                                                                                                                                                                                                              [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings)
		```
		
		Constructs a WebSocket `BidiFlow` using the configured default `ClientConnectionSettings`,
		 configured using the `akka.http.client` config section.
		 
		 The layer is not reusable and must only be materialized once.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### webSocketClientLayer
		
		
		
		```
		public akka.stream.javadsl.BidiFlow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>> webSocketClientLayer​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,
		                                                                                                                                                                                                                                              [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                                                                                                              akka.event.LoggingAdapter log)
		```
		
		Constructs a WebSocket `BidiFlow` using the configured default `ClientConnectionSettings`,
		 configured using the `akka.http.client` config section.
		 
		 The layer is not reusable and must only be materialized once.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### webSocketClientFlow
		
		
		
		```
		public akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>> webSocketClientFlow​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request)
		```
		
		Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.
		 
		 The layer is not reusable and must only be materialized once.
		
		
		
		Parameters:
		`request` \- (undocumented)
		Returns:
		(undocumented)
		- #### webSocketClientFlow
		
		
		
		```
		public akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>> webSocketClientFlow​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,
		                                                                                                                                                [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") connectionContext,
		                                                                                                                                                java.util.Optional<java.net.InetSocketAddress> localAddress,
		                                                                                                                                                [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                                                akka.event.LoggingAdapter log)
		```
		
		Constructs a flow that once materialized establishes a WebSocket connection to the given Uri.
		 
		 The layer is not reusable and must only be materialized once.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`connectionContext` \- (undocumented)
		`localAddress` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleWebSocketRequest
		
		
		
		```
		public <T> akka.japi.Pair<java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>,​T> singleWebSocketRequest​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,
		                                                                                                                         akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientFlow,
		                                                                                                                         akka.stream.Materializer materializer)
		```
		
		Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
		 WebSocket conversation.
		 
		 The [`defaultClientHttpsContext()`](#defaultClientHttpsContext()) is used to configure TLS for the connection.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`clientFlow` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleWebSocketRequest
		
		
		
		```
		public <T> akka.japi.Pair<java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>,​T> singleWebSocketRequest​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,
		                                                                                                                         akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientFlow,
		                                                                                                                         [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") connectionContext,
		                                                                                                                         akka.stream.Materializer materializer)
		```
		
		Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
		 WebSocket conversation.
		 
		 The [`defaultClientHttpsContext()`](#defaultClientHttpsContext()) is used to configure TLS for the connection.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`clientFlow` \- (undocumented)
		`connectionContext` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleWebSocketRequest
		
		
		
		```
		public <T> akka.japi.Pair<java.util.concurrent.CompletionStage<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.javadsl.model.ws")>,​T> singleWebSocketRequest​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.javadsl.model.ws") request,
		                                                                                                                         akka.stream.javadsl.Flow<[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](model/ws/Message.html "class in akka.http.javadsl.model.ws"),​T> clientFlow,
		                                                                                                                         [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") connectionContext,
		                                                                                                                         java.util.Optional<java.net.InetSocketAddress> localAddress,
		                                                                                                                         [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings") settings,
		                                                                                                                         akka.event.LoggingAdapter log,
		                                                                                                                         akka.stream.Materializer materializer)
		```
		
		Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the
		 WebSocket conversation.
		
		Parameters:
		`request` \- (undocumented)
		`clientFlow` \- (undocumented)
		`connectionContext` \- (undocumented)
		`localAddress` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`materializer` \- (undocumented)
		Returns:
		(undocumented)
		- #### shutdownAllConnectionPools
		
		
		
		```
		public java.util.concurrent.CompletionStage<scala.runtime.BoxedUnit> shutdownAllConnectionPools()
		```
		
		Triggers an orderly shutdown of all host connections pools currently maintained by the `ActorSystem`.
		 The returned future is completed when all pools that were live at the time of this method call
		 have completed their shutdown process.
		 
		 If existing pool client flows are re\-used or new ones materialized concurrently with or after this
		 method call the respective connection pools will be restarted and not contribute to the returned future.
		
		
		
		Returns:
		(undocumented)
		- #### defaultServerHttpContext
		
		
		
		```
		public [ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") defaultServerHttpContext()
		```
		
		Deprecated.
		since 10\.2\.0: set context explicitly when binding
		
		Gets the current default server\-side [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl") – defaults to plain HTTP.
		 Can be modified using [`setDefaultServerHttpContext(akka.http.javadsl.ConnectionContext)`](#setDefaultServerHttpContext(akka.http.javadsl.ConnectionContext)), and will then apply for servers bound after that call has completed.
		 
		
		Returns:
		(undocumented)
		- #### setDefaultServerHttpContext
		
		
		
		```
		public void setDefaultServerHttpContext​([ConnectionContext](ConnectionContext.html "class in akka.http.javadsl") context)
		```
		
		Deprecated.
		since 10\.2\.0: set context explicitly when binding
		
		Sets the default server\-side [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl").
		 If it is an instance of [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.javadsl") then the server will be bound using HTTPS.
		 
		
		Parameters:
		`context` \- (undocumented)
		- #### defaultClientHttpsContext
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") defaultClientHttpsContext()
		```
		
		Gets the current default client\-side [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl").
		
		Returns:
		(undocumented)
		- #### setDefaultClientHttpsContext
		
		
		
		```
		public void setDefaultClientHttpsContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.javadsl") context)
		```
		
		Sets the default client\-side [`ConnectionContext`](ConnectionContext.html "class in akka.http.javadsl").
		
		Parameters:
		`context` \- (undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectHttp.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HostConnectionPool.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/IncomingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/Http.html)*