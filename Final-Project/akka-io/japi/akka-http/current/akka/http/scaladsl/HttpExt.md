---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:28:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpExt.html
title: HttpExt
---

# HttpExt

## Content

Package [akka.http.scaladsl](package-summary.html)
## Class HttpExt

- java.lang.Object
- - akka.http.scaladsl.HttpExt

- All Implemented Interfaces:
`akka.actor.Extension`

---

```
public class HttpExt
extends java.lang.Object
implements akka.actor.Extension
```

Akka extension for HTTP which serves as the main entry point into akka\-http.
 
 Use as `Http().bindAndHandle` etc. with an implicit `ActorSystem` in scope.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HttpExt](#%3Cinit%3E(com.typesafe.config.Config,akka.actor.ExtendedActorSystem))​(com.typesafe.config.Config config,  akka.actor.ExtendedActorSystem system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Source<[Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl"),​scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>>` | `[bind](#bind(java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter))​(java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Deprecated. Use Http().newServerAt(...)...connectionSource() to create a source that can be materialized to a binding. |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindAndHandle](#bindAndHandle(akka.stream.scaladsl.Flow,java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​java.lang.Object> handler,  java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` | Deprecated. Use Http().newServerAt(...)...bindFlow() to create server bindings. |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindAndHandleAsync](#bindAndHandleAsync(scala.Function1,java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,int,akka.event.LoggingAdapter,akka.stream.Materializer))​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,  java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  int parallelism,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` | Deprecated. Use Http().newServerAt(...)...bind() to create server bindings. |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindAndHandleAsyncImpl](#bindAndHandleAsyncImpl(scala.Function1,java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,int,akka.event.LoggingAdapter,akka.stream.Materializer))​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,  java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  int parallelism,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` |  |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindAndHandleImpl](#bindAndHandleImpl(akka.stream.scaladsl.Flow,java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​java.lang.Object> handler,  java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` |  |
	| `scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindAndHandleSync](#bindAndHandleSync(scala.Function1,java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> handler,  java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` | Deprecated. Use Http().newServerAt(...)...bindSync() to create server bindings. |
	| `akka.stream.scaladsl.Source<[Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl"),​scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>>` | `[bindImpl](#bindImpl(java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter))​(java.lang.String interface_,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	| `<T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")>` | `[cachedHostConnectionPool](#cachedHostConnectionPool(java.lang.String,int,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Returns a `Flow` which dispatches incoming HTTP requests to the per\-ActorSystem pool of outgoing  HTTP connections to the given target host endpoint. |
	| `<T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")>` | `[cachedHostConnectionPoolHttps](#cachedHostConnectionPoolHttps(java.lang.String,int,akka.http.scaladsl.HttpsConnectionContext,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Same as [`cachedHostConnectionPool(java.lang.String, int, akka.http.scaladsl.settings.ConnectionPoolSettings, akka.event.LoggingAdapter)`](#cachedHostConnectionPool(java.lang.String,int,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter)) but for encrypted (HTTPS) connections. |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[clientLayer](#clientLayer(akka.http.scaladsl.model.headers.Host))​([Host](model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader)` | Constructs a `akka.http.scaladsl.Http.ClientLayer` stage using the configured default [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),  configured using the `akka.http.client` config section. |
	| `akka.stream.scaladsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[clientLayer](#clientLayer(akka.http.scaladsl.model.headers.Host,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([Host](model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Constructs a `akka.http.scaladsl.Http.ClientLayer` stage using the given [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"). |
	| `[OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl")` | `[connectionTo](#connectionTo(java.lang.String))​(java.lang.String host)` | Creates a builder which will create a single connection to a host every time the built flow is materialized. |
	| `[DateHeaderRendering](../impl/engine/rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering")` | `[dateHeaderRendering](#dateHeaderRendering())()` |  |
	| `[HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl")` | `[defaultClientHttpsContext](#defaultClientHttpsContext())()` | Gets the current default client\-side [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl"). |
	| `[ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl")` | `[defaultServerHttpContext](#defaultServerHttpContext())()` | Deprecated. Set context explicitly when binding. |
	| `<T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")>` | `[newHostConnectionPool](#newHostConnectionPool(akka.http.impl.settings.HostConnectionPoolSetup,akka.stream.Materializer))​([HostConnectionPoolSetup](../impl/settings/HostConnectionPoolSetup.html "class in akka.http.impl.settings") setup,  akka.stream.Materializer fm)` | INTERNAL API |
	| `<T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")>` | `[newHostConnectionPool](#newHostConnectionPool(java.lang.String,int,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(java.lang.String host,  int port,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` | Starts a new connection pool to the given host and configuration and returns a `Flow` which dispatches  the requests from all its materializations across this pool. |
	| `<T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")>` | `[newHostConnectionPoolHttps](#newHostConnectionPoolHttps(java.lang.String,int,akka.http.scaladsl.HttpsConnectionContext,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(java.lang.String host,  int port,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` | Same as [`newHostConnectionPool(java.lang.String, int, akka.http.scaladsl.settings.ConnectionPoolSettings, akka.event.LoggingAdapter, akka.stream.Materializer)`](#newHostConnectionPool(java.lang.String,int,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter,akka.stream.Materializer)) but for encrypted (HTTPS) connections. |
	| `[ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl")` | `[newServerAt](#newServerAt(java.lang.String,int))​(java.lang.String interface_,  int port)` | Main entry point to create a server binding. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[outgoingConnection](#outgoingConnection(java.lang.String,int,scala.Option,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  scala.Option<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Creates a `Flow` representing a prospective HTTP client connection to the given endpoint. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[outgoingConnectionHttps](#outgoingConnectionHttps(java.lang.String,int,akka.http.scaladsl.HttpsConnectionContext,scala.Option,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,  scala.Option<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Same as [`outgoingConnection(java.lang.String, int, scala.Option<java.net.InetSocketAddress>, akka.http.scaladsl.settings.ClientConnectionSettings, akka.event.LoggingAdapter)`](#outgoingConnection(java.lang.String,int,scala.Option,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter)) but for encrypted (HTTPS) connections. |
	| `akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[outgoingConnectionUsingContext](#outgoingConnectionUsingContext(java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Similar to `outgoingConnection` but allows to specify a user\-defined context to run the connection on. |
	| `[PoolMaster](../impl/engine/client/PoolMaster.html "class in akka.http.impl.engine.client")` | `[poolMaster](#poolMaster())()` |  |
	| `scala.concurrent.Future<java.lang.Object>` | `[poolSize](#poolSize())()` | INTERNAL API |
	| `akka.stream.scaladsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed>` | `[serverLayer](#serverLayer(akka.http.scaladsl.settings.ServerSettings,scala.Option,akka.event.LoggingAdapter,boolean))​([ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  scala.Option<java.net.InetSocketAddress> remoteAddress,  akka.event.LoggingAdapter log,  boolean isSecureConnection)` | Constructs a `akka.http.scaladsl.Http.ServerLayer` stage using the given [`ServerSettings`](settings/ServerSettings.html "class in akka.http.scaladsl.settings"). |
	| `void` | `[setDefaultClientHttpsContext](#setDefaultClientHttpsContext(akka.http.scaladsl.HttpsConnectionContext))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") context)` | Sets the default client\-side [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl"). |
	| `void` | `[setDefaultServerHttpContext](#setDefaultServerHttpContext(akka.http.scaladsl.ConnectionContext))​([ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") context)` | Deprecated. Set context explicitly when binding. |
	| `scala.concurrent.Future<scala.runtime.BoxedUnit>` | `[shutdownAllConnectionPools](#shutdownAllConnectionPools())()` | Triggers an orderly shutdown of all host connections pools currently maintained by the `ActorSystem`. |
	| `scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>` | `[singleRequest](#singleRequest(akka.http.scaladsl.model.HttpRequest,akka.http.scaladsl.HttpsConnectionContext,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​([HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model") request,  [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Fires a single [`HttpRequest`](model/HttpRequest.html "class in akka.http.scaladsl.model") across the (cached) host connection pool for the request's  effective URI to produce a response future. |
	| `<T> scala.Tuple2<scala.concurrent.Future<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>,​T>` | `[singleWebSocketRequest](#singleWebSocketRequest(akka.http.scaladsl.model.ws.WebSocketRequest,akka.stream.scaladsl.Flow,akka.http.scaladsl.ConnectionContext,scala.Option,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,  akka.stream.scaladsl.Flow<[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​T> clientFlow,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  scala.Option<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer mat)` | Runs a single WebSocket conversation given a Uri and a flow that represents the client side of the  WebSocket conversation. |
	| `akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.util.ByteString,​akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed>` | `[sslTlsClientStage](#sslTlsClientStage(akka.http.scaladsl.ConnectionContext,java.lang.String,int))​([ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  java.lang.String host,  int port)` | Creates real or placebo SslTls stage based on if ConnectionContext is HTTPS or not. |
	| `akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.util.ByteString,​akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed>` | `[sslTlsServerStage](#sslTlsServerStage(akka.http.scaladsl.ConnectionContext))​([ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext)` |  |
	| `<T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​akka.NotUsed>` | `[superPool](#superPool(akka.http.scaladsl.HttpsConnectionContext,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter))​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,  [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool  depending on their respective effective URIs. |
	| `akka.actor.ExtendedActorSystem` | `[system](#system())()` |  |
	| `akka.stream.scaladsl.Flow<[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​scala.concurrent.Future<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>>` | `[webSocketClientFlow](#webSocketClientFlow(akka.http.scaladsl.model.ws.WebSocketRequest,akka.http.scaladsl.ConnectionContext,scala.Option,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,  [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  scala.Option<java.net.InetSocketAddress> localAddress,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Constructs a flow that once materialized establishes a WebSocket connection to the given Uri. |
	| `akka.stream.scaladsl.BidiFlow<[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​scala.concurrent.Future<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>>` | `[webSocketClientLayer](#webSocketClientLayer(akka.http.scaladsl.model.ws.WebSocketRequest,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Constructs a `akka.http.scaladsl.Http.WebSocketClientLayer` stage using the configured default [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),  configured using the `akka.http.client` config section. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### HttpExt
		
		
		
		```
		public HttpExt​(com.typesafe.config.Config config,
		               akka.actor.ExtendedActorSystem system)
		```

	- ### Method Detail
	
	
	
		- #### bind
		
		
		
		```
		public akka.stream.scaladsl.Source<[Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl"),​scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>> bind​(java.lang.String interface_,
		                                                                                                                   int port,
		                                                                                                                   [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                                                                   [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                   akka.event.LoggingAdapter log)
		```
		
		Deprecated.
		Use Http().newServerAt(...)...connectionSource() to create a source that can be materialized to a binding. Since 10\.2\.0\.
		
		Creates a `Source` of [`Http.IncomingConnection`](Http.IncomingConnection.html "class in akka.http.scaladsl") instances which represents a prospective HTTP server binding
		 on the given `endpoint`.
		 
		 If the given port is 0 the resulting source can be materialized several times. Each materialization will
		 then be assigned a new local port by the operating system, which can then be retrieved by the materialized
		 [`Http.ServerBinding`](Http.ServerBinding.html "class in akka.http.scaladsl").
		 
		
		
		 If the given port is non\-zero subsequent materialization attempts of the produced source will immediately
		 fail, unless the first materialization has already been unbound. Unbinding can be triggered via the materialized
		 [`Http.ServerBinding`](Http.ServerBinding.html "class in akka.http.scaladsl").
		 
		
		
		 If an [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") is given it will be used for setting up TLS encryption on the binding.
		 Otherwise the binding will be unencrypted.
		 
		
		
		 If no `port` is explicitly given (or the port value is negative) the protocol's default port will be used,
		 which is 80 for HTTP and 443 for HTTPS.
		 
		
		
		 To configure additional settings for a server started using this method,
		 use the `akka.http.server` config section or pass in a [`ServerSettings`](settings/ServerSettings.html "class in akka.http.scaladsl.settings") explicitly.
		
		
		
		Parameters:
		`interface_` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandle
		
		
		
		```
		public scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindAndHandle​(akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​java.lang.Object> handler,
		                                                                 java.lang.String interface_,
		                                                                 int port,
		                                                                 [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                 [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                 akka.event.LoggingAdapter log,
		                                                                 akka.stream.Materializer fm)
		```
		
		Deprecated.
		Use Http().newServerAt(...)...bindFlow() to create server bindings. Since 10\.2\.0\.
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 To configure additional settings for a server started using this method,
		 use the `akka.http.server` config section or pass in a [`ServerSettings`](settings/ServerSettings.html "class in akka.http.scaladsl.settings") explicitly.
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`interface_` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandleAsync
		
		
		
		```
		public scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindAndHandleAsync​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,
		                                                                      java.lang.String interface_,
		                                                                      int port,
		                                                                      [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                      [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                      int parallelism,
		                                                                      akka.event.LoggingAdapter log,
		                                                                      akka.stream.Materializer fm)
		```
		
		Deprecated.
		Use Http().newServerAt(...)...bind() to create server bindings. Since 10\.2\.0\.
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 To configure additional settings for a server started using this method,
		 use the `akka.http.server` config section or pass in a [`ServerSettings`](settings/ServerSettings.html "class in akka.http.scaladsl.settings") explicitly.
		 
		
		
		 Parameter `parallelism` specifies how many requests are attempted to be handled concurrently per connection. In HTTP/1
		 this makes only sense if HTTP pipelining is enabled (which is not recommended). The default value of `0` means that
		 the value is taken from the `akka.http.server.pipelining-limit` setting from the configuration. In HTTP/2,
		 the default value is taken from `akka.http.server.http2.max-concurrent-streams`.
		 
		
		
		 Any other value for `parallelism` overrides the setting.
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`interface_` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`parallelism` \- (undocumented)
		`log` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindAndHandleAsyncImpl
		
		
		
		```
		public scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindAndHandleAsyncImpl​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,
		                                                                          java.lang.String interface_,
		                                                                          int port,
		                                                                          [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                          [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                          int parallelism,
		                                                                          akka.event.LoggingAdapter log,
		                                                                          akka.stream.Materializer fm)
		```
		- #### bindAndHandleImpl
		
		
		
		```
		public scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindAndHandleImpl​(akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​java.lang.Object> handler,
		                                                                     java.lang.String interface_,
		                                                                     int port,
		                                                                     [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                     [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                     akka.event.LoggingAdapter log,
		                                                                     akka.stream.Materializer fm)
		```
		- #### bindAndHandleSync
		
		
		
		```
		public scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")> bindAndHandleSync​(scala.Function1<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> handler,
		                                                                     java.lang.String interface_,
		                                                                     int port,
		                                                                     [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                     [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                     akka.event.LoggingAdapter log,
		                                                                     akka.stream.Materializer fm)
		```
		
		Deprecated.
		Use Http().newServerAt(...)...bindSync() to create server bindings. Since 10\.2\.0\.
		
		Convenience method which starts a new HTTP server at the given endpoint and uses the given `handler`
		`Flow` for processing all incoming connections.
		 
		 The number of concurrently accepted connections can be configured by overriding
		 the `akka.http.server.max-connections` setting. Please see the documentation in the reference.conf for more
		 information about what kind of guarantees to expect.
		 
		
		
		 To configure additional settings for a server started using this method,
		 use the `akka.http.server` config section or pass in a [`ServerSettings`](settings/ServerSettings.html "class in akka.http.scaladsl.settings") explicitly.
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`interface_` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### bindImpl
		
		
		
		```
		public akka.stream.scaladsl.Source<[Http.IncomingConnection](Http.IncomingConnection.html "class in akka.http.scaladsl"),​scala.concurrent.Future<[Http.ServerBinding](Http.ServerBinding.html "class in akka.http.scaladsl")>> bindImpl​(java.lang.String interface_,
		                                                                                                                       int port,
		                                                                                                                       [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                                                                       [ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                       akka.event.LoggingAdapter log)
		```
		- #### cachedHostConnectionPool
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")> cachedHostConnectionPool​(java.lang.String host,
		                                                                                                                                                                                        int port,
		                                                                                                                                                                                        [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
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
		`host` \- (undocumented)
		`port` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### cachedHostConnectionPoolHttps
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")> cachedHostConnectionPoolHttps​(java.lang.String host,
		                                                                                                                                                                                             int port,
		                                                                                                                                                                                             [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,
		                                                                                                                                                                                             [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                             akka.event.LoggingAdapter log)
		```
		
		Same as [`cachedHostConnectionPool(java.lang.String, int, akka.http.scaladsl.settings.ConnectionPoolSettings, akka.event.LoggingAdapter)`](#cachedHostConnectionPool(java.lang.String,int,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter)) but for encrypted (HTTPS) connections.
		 
		 If an explicit [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") is given then it rather than the configured default [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") will be used
		 for encryption on the connections.
		 
		
		
		 To configure additional settings for the pool (and requests made using it),
		 use the `akka.http.host-connection-pool` config section or pass in a `ConnectionPoolSettings` explicitly.
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientLayer
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> clientLayer​([Host](model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader)
		```
		
		Constructs a `akka.http.scaladsl.Http.ClientLayer` stage using the configured default [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),
		 configured using the `akka.http.client` config section.
		
		Parameters:
		`hostHeader` \- (undocumented)
		Returns:
		(undocumented)
		- #### clientLayer
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.NotUsed> clientLayer​([Host](model/headers/Host.html "class in akka.http.scaladsl.model.headers") hostHeader,
		                                                                                                                                                                                             [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                             akka.event.LoggingAdapter log)
		```
		
		Constructs a `akka.http.scaladsl.Http.ClientLayer` stage using the given [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings").
		
		Parameters:
		`hostHeader` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### connectionTo
		
		
		
		```
		public [OutgoingConnectionBuilder](OutgoingConnectionBuilder.html "interface in akka.http.scaladsl") connectionTo​(java.lang.String host)
		```
		
		Creates a builder which will create a single connection to a host every time the built flow is materialized. There
		 is no pooling and you are yourself responsible for lifecycle management of the connection. For a more convenient
		 Request level API see `singleRequest()`
		
		
		Parameters:
		`host` \- (undocumented)
		Returns:
		A builder to configure more specific setup for the connection and then build a `Flow[Request, Response, Future[OutgoingConnection}`.
		- #### dateHeaderRendering
		
		
		
		```
		public [DateHeaderRendering](../impl/engine/rendering/DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") dateHeaderRendering()
		```
		- #### defaultClientHttpsContext
		
		
		
		```
		public [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") defaultClientHttpsContext()
		```
		
		Gets the current default client\-side [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl").
		 Defaults used here can be configured through JSSE config (uses `javax.net.ssl.SSLContext.getDefault`).
		 The context can also be programmatically replaced using [`setDefaultClientHttpsContext(akka.http.scaladsl.HttpsConnectionContext)`](#setDefaultClientHttpsContext(akka.http.scaladsl.HttpsConnectionContext))
		
		Returns:
		(undocumented)
		- #### defaultServerHttpContext
		
		
		
		```
		public [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") defaultServerHttpContext()
		```
		
		Deprecated.
		Set context explicitly when binding. Since 10\.2\.0\.
		
		Gets the current default server\-side [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") – defaults to plain HTTP.
		 Can be modified using [`setDefaultServerHttpContext(akka.http.scaladsl.ConnectionContext)`](#setDefaultServerHttpContext(akka.http.scaladsl.ConnectionContext)), and will then apply for servers bound after that call has completed.
		
		Returns:
		(undocumented)
		- #### newHostConnectionPool
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")> newHostConnectionPool​(java.lang.String host,
		                                                                                                                                                                                     int port,
		                                                                                                                                                                                     [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                     akka.event.LoggingAdapter log,
		                                                                                                                                                                                     akka.stream.Materializer fm)
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
		 
		
		
		 To configure additional settings for the pool (and requests made using it),
		 use the `akka.http.host-connection-pool` config section or pass in a `ConnectionPoolSettings` explicitly.
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### newHostConnectionPool
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")> newHostConnectionPool​([HostConnectionPoolSetup](../impl/settings/HostConnectionPoolSetup.html "class in akka.http.impl.settings") setup,
		                                                                                                                                                                                     akka.stream.Materializer fm)
		```
		
		INTERNAL API
		
		Parameters:
		`setup` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### newHostConnectionPoolHttps
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​[Http.HostConnectionPool](Http.HostConnectionPool.html "class in akka.http.scaladsl")> newHostConnectionPoolHttps​(java.lang.String host,
		                                                                                                                                                                                          int port,
		                                                                                                                                                                                          [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,
		                                                                                                                                                                                          [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                          akka.event.LoggingAdapter log,
		                                                                                                                                                                                          akka.stream.Materializer fm)
		```
		
		Same as [`newHostConnectionPool(java.lang.String, int, akka.http.scaladsl.settings.ConnectionPoolSettings, akka.event.LoggingAdapter, akka.stream.Materializer)`](#newHostConnectionPool(java.lang.String,int,akka.http.scaladsl.settings.ConnectionPoolSettings,akka.event.LoggingAdapter,akka.stream.Materializer)) but for encrypted (HTTPS) connections.
		 
		 If an explicit [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") is given then it rather than the configured default [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") will be used
		 for encryption on the connections.
		 
		
		
		 To configure additional settings for the pool (and requests made using it),
		 use the `akka.http.host-connection-pool` config section or pass in a `ConnectionPoolSettings` explicitly.
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		`fm` \- (undocumented)
		Returns:
		(undocumented)
		- #### newServerAt
		
		
		
		```
		public [ServerBuilder](ServerBuilder.html "interface in akka.http.scaladsl") newServerAt​(java.lang.String interface_,
		                                 int port)
		```
		
		Main entry point to create a server binding.
		 
		
		Parameters:
		`interface` \- The interface to bind to.
		`port` \- The port to bind to or `0` if the port should be automatically assigned.
		`interface_` \- (undocumented)
		Returns:
		(undocumented)
		- #### outgoingConnection
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> outgoingConnection​(java.lang.String host,
		                                                                                                                                           int port,
		                                                                                                                                           scala.Option<java.net.InetSocketAddress> localAddress,
		                                                                                                                                           [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                           akka.event.LoggingAdapter log)
		```
		
		Creates a `Flow` representing a prospective HTTP client connection to the given endpoint.
		 Every materialization of the produced flow will attempt to establish a new outgoing connection.
		 
		 To configure additional settings for requests made using this method,
		 use the `akka.http.client` config section or pass in a [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") explicitly.
		 
		
		
		 Prefer [`connectionTo(java.lang.String)`](#connectionTo(java.lang.String)) over this method.
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`localAddress` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### outgoingConnectionHttps
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> outgoingConnectionHttps​(java.lang.String host,
		                                                                                                                                                int port,
		                                                                                                                                                [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,
		                                                                                                                                                scala.Option<java.net.InetSocketAddress> localAddress,
		                                                                                                                                                [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                akka.event.LoggingAdapter log)
		```
		
		Same as [`outgoingConnection(java.lang.String, int, scala.Option<java.net.InetSocketAddress>, akka.http.scaladsl.settings.ClientConnectionSettings, akka.event.LoggingAdapter)`](#outgoingConnection(java.lang.String,int,scala.Option,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter)) but for encrypted (HTTPS) connections.
		 
		 If an explicit [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl") is given then it rather than the configured default [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl") will be used
		 for encryption on the connection.
		 
		
		
		 To configure additional settings for requests made using this method,
		 use the `akka.http.client` config section or pass in a [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") explicitly.
		 
		
		
		 Prefer [`connectionTo(java.lang.String)`](#connectionTo(java.lang.String)) over this method.
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`localAddress` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### outgoingConnectionUsingContext
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](Http.OutgoingConnection.html "class in akka.http.scaladsl")>> outgoingConnectionUsingContext​(java.lang.String host,
		                                                                                                                                                       int port,
		                                                                                                                                                       [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                                                                                                       [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                       akka.event.LoggingAdapter log)
		```
		
		Similar to `outgoingConnection` but allows to specify a user\-defined context to run the connection on.
		 
		 Depending on the kind of `ConnectionContext` the implementation will add TLS between the given transport and the HTTP
		 implementation
		 
		
		
		 To configure additional settings for requests made using this method,
		 use the `akka.http.client` config section or pass in a [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") explicitly.
		 
		
		
		 Prefer [`connectionTo(java.lang.String)`](#connectionTo(java.lang.String)) over this method.
		
		
		
		Parameters:
		`host` \- (undocumented)
		`port` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### poolMaster
		
		
		
		```
		public [PoolMaster](../impl/engine/client/PoolMaster.html "class in akka.http.impl.engine.client") poolMaster()
		```
		- #### poolSize
		
		
		
		```
		public scala.concurrent.Future<java.lang.Object> poolSize()
		```
		
		INTERNAL API
		 
		 For testing only
		
		
		
		Returns:
		(undocumented)
		- #### serverLayer
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​akka.NotUsed> serverLayer​([ServerSettings](settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                             scala.Option<java.net.InetSocketAddress> remoteAddress,
		                                                                                                                                                                                             akka.event.LoggingAdapter log,
		                                                                                                                                                                                             boolean isSecureConnection)
		```
		
		Constructs a `akka.http.scaladsl.Http.ServerLayer` stage using the given [`ServerSettings`](settings/ServerSettings.html "class in akka.http.scaladsl.settings"). The returned `BidiFlow` isn't reusable and
		 can only be materialized once. The `remoteAddress`, if provided, will be added as a header to each [`HttpRequest`](model/HttpRequest.html "class in akka.http.scaladsl.model")
		 this layer produces if the `akka.http.server.remote-address-header` configuration option is enabled.
		
		Parameters:
		`settings` \- (undocumented)
		`remoteAddress` \- (undocumented)
		`log` \- (undocumented)
		`isSecureConnection` \- (undocumented)
		Returns:
		(undocumented)
		- #### setDefaultClientHttpsContext
		
		
		
		```
		public void setDefaultClientHttpsContext​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") context)
		```
		
		Sets the default client\-side [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl").
		
		Parameters:
		`context` \- (undocumented)
		- #### setDefaultServerHttpContext
		
		
		
		```
		public void setDefaultServerHttpContext​([ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") context)
		```
		
		Deprecated.
		Set context explicitly when binding. Since 10\.2\.0\.
		
		Sets the default server\-side [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl").
		 If it is an instance of [`HttpsConnectionContext`](HttpsConnectionContext.html "class in akka.http.scaladsl") then the server will be bound using HTTPS.
		
		Parameters:
		`context` \- (undocumented)
		- #### shutdownAllConnectionPools
		
		
		
		```
		public scala.concurrent.Future<scala.runtime.BoxedUnit> shutdownAllConnectionPools()
		```
		
		Triggers an orderly shutdown of all host connections pools currently maintained by the `ActorSystem`.
		 The returned future is completed when all pools that were live at the time of this method call
		 have completed their shutdown process.
		 
		 If existing pool client flows are re\-used or new ones materialized concurrently with or after this
		 method call the respective connection pools will be restarted and not contribute to the returned future.
		
		
		
		Returns:
		(undocumented)
		- #### singleRequest
		
		
		
		```
		public scala.concurrent.Future<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")> singleRequest​([HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model") request,
		                                                           [HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,
		                                                           [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                           akka.event.LoggingAdapter log)
		```
		
		Fires a single [`HttpRequest`](model/HttpRequest.html "class in akka.http.scaladsl.model") across the (cached) host connection pool for the request's
		 effective URI to produce a response future.
		 
		 If an explicit [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") is given then it rather than the configured default [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") will be used
		 for setting up the HTTPS connection pool, if the request is targeted towards an `https` endpoint.
		 
		
		
		 Note that the request must have an absolute URI, otherwise the future will be completed with an error.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### singleWebSocketRequest
		
		
		
		```
		public <T> scala.Tuple2<scala.concurrent.Future<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>,​T> singleWebSocketRequest​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,
		                                                                                                          akka.stream.scaladsl.Flow<[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​T> clientFlow,
		                                                                                                          [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                                                          scala.Option<java.net.InetSocketAddress> localAddress,
		                                                                                                          [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                          akka.event.LoggingAdapter log,
		                                                                                                          akka.stream.Materializer mat)
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
		`mat` \- (undocumented)
		Returns:
		(undocumented)
		- #### sslTlsClientStage
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.util.ByteString,​akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed> sslTlsClientStage​([ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                                                                                                                                                                    java.lang.String host,
		                                                                                                                                                                                                                    int port)
		```
		
		Creates real or placebo SslTls stage based on if ConnectionContext is HTTPS or not.
		- #### sslTlsServerStage
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsOutbound,​akka.util.ByteString,​akka.util.ByteString,​akka.stream.TLSProtocol.SslTlsInbound,​akka.NotUsed> sslTlsServerStage​([ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext)
		```
		- #### superPool
		
		
		
		```
		public <T> akka.stream.scaladsl.Flow<scala.Tuple2<[HttpRequest](model/HttpRequest.html "class in akka.http.scaladsl.model"),​T>,​scala.Tuple2<scala.util.Try<[HttpResponse](model/HttpResponse.html "class in akka.http.scaladsl.model")>,​T>,​akka.NotUsed> superPool​([HttpsConnectionContext](HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,
		                                                                                                                                                              [ConnectionPoolSettings](settings/ConnectionPoolSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                              akka.event.LoggingAdapter log)
		```
		
		Creates a new "super connection pool flow", which routes incoming requests to a (cached) host connection pool
		 depending on their respective effective URIs. Note that incoming requests must have an absolute URI.
		 
		 If an explicit [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") is given then it rather than the configured default [`ConnectionContext`](ConnectionContext.html "interface in akka.http.scaladsl") will be used
		 for setting up HTTPS connection pools, if required.
		 
		
		
		 Since the underlying transport usually comprises more than a single connection the produced flow might generate
		 responses in an order that doesn't directly match the consumed requests.
		 For example, if two requests A and B enter the flow in that order the response for B might be produced before the
		 response for A.
		 In order to allow for easy response\-to\-request association the flow takes in a custom, opaque context
		 object of type `T` from the application which is emitted together with the corresponding response.
		 
		
		
		 To configure additional settings for the pool (and requests made using it),
		 use the `akka.http.host-connection-pool` config section or pass in a `ConnectionPoolSettings` explicitly.
		
		
		
		Parameters:
		`connectionContext` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### system
		
		
		
		```
		public akka.actor.ExtendedActorSystem system()
		```
		- #### webSocketClientFlow
		
		
		
		```
		public akka.stream.scaladsl.Flow<[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​scala.concurrent.Future<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>> webSocketClientFlow​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,
		                                                                                                                                    [ConnectionContext](ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                                                                                    scala.Option<java.net.InetSocketAddress> localAddress,
		                                                                                                                                    [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
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
		- #### webSocketClientLayer
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​scala.concurrent.Future<[WebSocketUpgradeResponse](model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>> webSocketClientLayer​([WebSocketRequest](model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,
		                                                                                                                                                                                                                                  [ClientConnectionSettings](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                                                                  akka.event.LoggingAdapter log)
		```
		
		Constructs a `akka.http.scaladsl.Http.WebSocketClientLayer` stage using the configured default [`ClientConnectionSettings`](settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings"),
		 configured using the `akka.http.client` config section.
		 
		 The layer is not reusable and must only be materialized once.
		
		
		
		Parameters:
		`request` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/client/PoolMaster.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/HostConnectionPoolSetup.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.HostConnectionPool.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.IncomingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/OutgoingConnectionBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ServerBuilder.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ConnectionPoolSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpExt.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpExt.html)*