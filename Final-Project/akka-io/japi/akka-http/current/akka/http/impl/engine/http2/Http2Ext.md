---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:31:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Ext.html
title: Http2Ext
---

# Http2Ext

## Content

Package [akka.http.impl.engine.http2](package-summary.html)
## Class Http2Ext

- java.lang.Object
- - akka.http.impl.engine.http2\.Http2Ext

- All Implemented Interfaces:
`akka.actor.Extension`

---

```
public final class Http2Ext
extends java.lang.Object
implements akka.actor.Extension
```

INTERNAL API
 
 Internal entry points for Http/2 server

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Http2Ext](#%3Cinit%3E(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.concurrent.Future<[Http.ServerBinding](../../../scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl")>` | `[bindAndHandleAsync](#bindAndHandleAsync(scala.Function1,java.lang.String,int,akka.http.scaladsl.ConnectionContext,akka.http.scaladsl.settings.ServerSettings,akka.event.LoggingAdapter,akka.stream.Materializer))​(scala.Function1<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,  java.lang.String interface_,  int port,  [ConnectionContext](../../../scaladsl/ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,  [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log,  akka.stream.Materializer fm)` |  |
	| `[Connection](../../../scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers")` | `[ConnectionUpgradeHeader](#ConnectionUpgradeHeader())()` |  |
	| `[HttpExt](../../../scaladsl/HttpExt.html "class in akka.http.scaladsl")` | `[http](#http())()` |  |
	| `akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>>` | `[httpsWithAlpn](#httpsWithAlpn(akka.http.scaladsl.HttpsConnectionContext,akka.stream.scaladsl.Flow,akka.stream.scaladsl.Flow))​([HttpsConnectionContext](../../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl") httpsContext,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1,  akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2)` |  |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[outgoingConnection](#outgoingConnection(java.lang.String,int,akka.http.scaladsl.HttpsConnectionContext,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  [HttpsConnectionContext](../../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") clientConnectionSettings,  akka.event.LoggingAdapter log)` |  |
	| `akka.stream.scaladsl.Flow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>>` | `[outgoingConnectionPriorKnowledge](#outgoingConnectionPriorKnowledge(java.lang.String,int,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​(java.lang.String host,  int port,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") clientConnectionSettings,  akka.event.LoggingAdapter log)` |  |
	| `akka.actor.ActorSystem` | `[system](#system())()` |  |
	| `[TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2")` | `[telemetry](#telemetry())()` |  |
	| `[Upgrade](../../../scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers")` | `[UpgradeHeader](#UpgradeHeader())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Http2Ext
		
		
		
		```
		public Http2Ext​(akka.actor.ActorSystem system)
		```

	- ### Method Detail
	
	
	
		- #### ConnectionUpgradeHeader
		
		
		
		```
		public [Connection](../../../scaladsl/model/headers/Connection.html "class in akka.http.scaladsl.model.headers") ConnectionUpgradeHeader()
		```
		- #### UpgradeHeader
		
		
		
		```
		public [Upgrade](../../../scaladsl/model/headers/Upgrade.html "class in akka.http.scaladsl.model.headers") UpgradeHeader()
		```
		- #### bindAndHandleAsync
		
		
		
		```
		public scala.concurrent.Future<[Http.ServerBinding](../../../scaladsl/Http.ServerBinding.html "class in akka.http.scaladsl")> bindAndHandleAsync​(scala.Function1<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")>> handler,
		                                                                      java.lang.String interface_,
		                                                                      int port,
		                                                                      [ConnectionContext](../../../scaladsl/ConnectionContext.html "interface in akka.http.scaladsl") connectionContext,
		                                                                      [ServerSettings](../../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                      akka.event.LoggingAdapter log,
		                                                                      akka.stream.Materializer fm)
		```
		- #### http
		
		
		
		```
		public [HttpExt](../../../scaladsl/HttpExt.html "class in akka.http.scaladsl") http()
		```
		- #### httpsWithAlpn
		
		
		
		```
		public akka.stream.scaladsl.Flow<akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")>> httpsWithAlpn​([HttpsConnectionContext](../../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl") httpsContext,
		                                                                                                                                                akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http1,
		                                                                                                                                                akka.stream.scaladsl.Flow<akka.stream.TLSProtocol.SslTlsInbound,​akka.stream.TLSProtocol.SslTlsOutbound,​[ServerTerminator](../server/ServerTerminator.html "interface in akka.http.impl.engine.server")> http2)
		```
		- #### outgoingConnection
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>> outgoingConnection​(java.lang.String host,
		                                                                                                                                           int port,
		                                                                                                                                           [HttpsConnectionContext](../../../scaladsl/HttpsConnectionContext.html "class in akka.http.scaladsl") connectionContext,
		                                                                                                                                           [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") clientConnectionSettings,
		                                                                                                                                           akka.event.LoggingAdapter log)
		```
		- #### outgoingConnectionPriorKnowledge
		
		
		
		```
		public akka.stream.scaladsl.Flow<[HttpRequest](../../../scaladsl/model/HttpRequest.html "class in akka.http.scaladsl.model"),​[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model"),​scala.concurrent.Future<[Http.OutgoingConnection](../../../scaladsl/Http.OutgoingConnection.html "class in akka.http.scaladsl")>> outgoingConnectionPriorKnowledge​(java.lang.String host,
		                                                                                                                                                         int port,
		                                                                                                                                                         [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") clientConnectionSettings,
		                                                                                                                                                         akka.event.LoggingAdapter log)
		```
		- #### system
		
		
		
		```
		public akka.actor.ActorSystem system()
		```
		- #### telemetry
		
		
		
		```
		public [TelemetrySpi](TelemetrySpi.html "interface in akka.http.impl.engine.http2") telemetry()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/TelemetrySpi.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/server/ServerTerminator.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.OutgoingConnection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/Http.ServerBinding.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpExt.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/HttpsConnectionContext.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Connection.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Upgrade.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Ext.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/http2/Http2Ext.html)*