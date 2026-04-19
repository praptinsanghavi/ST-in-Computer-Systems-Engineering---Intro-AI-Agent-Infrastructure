---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.html
title: ServerSettingsImpl
---

# ServerSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ServerSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.ServerSettings](../../javadsl/settings/ServerSettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.ServerSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ServerSettingsImpl
extends [ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ServerSettingsImpl)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[ServerSettingsImpl.Timeouts](ServerSettingsImpl.Timeouts.html "class in akka.http.impl.settings")` |  |
	| `static class` | `[ServerSettingsImpl.Timeouts$](ServerSettingsImpl.Timeouts$.html "class in akka.http.impl.settings")` |  |
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.settings.[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[ServerSettings.LogUnencryptedNetworkBytes$](../../scaladsl/settings/ServerSettings.LogUnencryptedNetworkBytes$.html "class in akka.http.scaladsl.settings")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSettingsImpl](#%3Cinit%3E(scala.Option,akka.http.scaladsl.settings.PreviewServerSettings,akka.http.scaladsl.settings.ServerSettings.Timeouts,int,int,boolean,boolean,boolean,boolean,boolean,int,int,scala.Option,scala.collection.immutable.Seq,akka.http.scaladsl.model.headers.Host,akka.http.scaladsl.settings.WebSocketSettings,akka.http.scaladsl.settings.ParserSettings,akka.http.scaladsl.settings.Http2ServerSettings,int,int,akka.http.scaladsl.model.HttpResponse,java.lang.String,scala.concurrent.duration.FiniteDuration,boolean))​(scala.Option<[Server](../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")> serverHeader,  [PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings") previewServerSettings,  [ServerSettings.Timeouts](../../scaladsl/settings/ServerSettings.Timeouts.html "interface in akka.http.scaladsl.settings") timeouts,  int maxConnections,  int pipeliningLimit,  boolean remoteAddressHeader,  boolean remoteAddressAttribute,  boolean rawRequestUriHeader,  boolean transparentHeadRequests,  boolean verboseErrorMessages,  int responseHeaderSizeHint,  int backlog,  scala.Option<java.lang.Object> logUnencryptedNetworkBytes,  scala.collection.immutable.Seq<akka.io.Inet.SocketOption> socketOptions,  [Host](../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader,  [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,  [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  [Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") http2Settings,  int defaultHttpPort,  int defaultHttpsPort,  [HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") terminationDeadlineExceededResponse,  java.lang.String parsingErrorHandler,  scala.concurrent.duration.FiniteDuration streamCancellationDelay,  boolean http2Enabled)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `int` | `[backlog](#backlog())()` |  |
	| `[Host](../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers")` | `[defaultHostHeader](#defaultHostHeader())()` |  |
	| `int` | `[defaultHttpPort](#defaultHttpPort())()` |  |
	| `int` | `[defaultHttpsPort](#defaultHttpsPort())()` |  |
	| `static [ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config c)` |  |
	| `boolean` | `[http2Enabled](#http2Enabled())()` |  |
	| `[Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings")` | `[http2Settings](#http2Settings())()` |  |
	| `scala.Option<java.lang.Object>` | `[logUnencryptedNetworkBytes](#logUnencryptedNetworkBytes())()` |  |
	| `int` | `[maxConnections](#maxConnections())()` |  |
	| `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")` | `[parserSettings](#parserSettings())()` |  |
	| `java.lang.String` | `[parsingErrorHandler](#parsingErrorHandler())()` |  |
	| `[ParsingErrorHandler](../../ParsingErrorHandler.html "class in akka.http")` | `[parsingErrorHandlerInstance](#parsingErrorHandlerInstance(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` | INTERNAL API |
	| `int` | `[pipeliningLimit](#pipeliningLimit())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `[PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings")` | `[previewServerSettings](#previewServerSettings())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `boolean` | `[rawRequestUriHeader](#rawRequestUriHeader())()` |  |
	| `boolean` | `[remoteAddressAttribute](#remoteAddressAttribute())()` |  |
	| `boolean` | `[remoteAddressHeader](#remoteAddressHeader())()` |  |
	| `int` | `[responseHeaderSizeHint](#responseHeaderSizeHint())()` |  |
	| `scala.Option<[Server](../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")>` | `[serverHeader](#serverHeader())()` |  |
	| `scala.collection.immutable.Seq<akka.io.Inet.SocketOption>` | `[socketOptions](#socketOptions())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[streamCancellationDelay](#streamCancellationDelay())()` |  |
	| `[HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[terminationDeadlineExceededResponse](#terminationDeadlineExceededResponse())()` |  |
	| `[ServerSettings.Timeouts](../../scaladsl/settings/ServerSettings.Timeouts.html "interface in akka.http.scaladsl.settings")` | `[timeouts](#timeouts())()` |  |
	| `static [ServerSettings.Timeouts](../../javadsl/settings/ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings")` | `[timeoutsShortcut](#timeoutsShortcut(akka.http.javadsl.settings.ServerSettings))​([ServerSettings](../../javadsl/settings/ServerSettings.html "class in akka.http.javadsl.settings") s)` |  |
	| `boolean` | `[transparentHeadRequests](#transparentHeadRequests())()` |  |
	| `boolean` | `[verboseErrorMessages](#verboseErrorMessages())()` |  |
	| `scala.Function0<java.util.Random>` | `[websocketRandomFactory](#websocketRandomFactory())()` |  |
	| `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[websocketSettings](#websocketSettings())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[getBacklog](../../scaladsl/settings/ServerSettings.html#getBacklog()), [getDefaultHostHeader](../../scaladsl/settings/ServerSettings.html#getDefaultHostHeader()), [getDefaultHttpPort](../../scaladsl/settings/ServerSettings.html#getDefaultHttpPort()), [getDefaultHttpsPort](../../scaladsl/settings/ServerSettings.html#getDefaultHttpsPort()), [getLogUnencryptedNetworkBytes](../../scaladsl/settings/ServerSettings.html#getLogUnencryptedNetworkBytes()), [getMaxConnections](../../scaladsl/settings/ServerSettings.html#getMaxConnections()), [getParserSettings](../../scaladsl/settings/ServerSettings.html#getParserSettings()), [getParsingErrorHandler](../../scaladsl/settings/ServerSettings.html#getParsingErrorHandler()), [getPipeliningLimit](../../scaladsl/settings/ServerSettings.html#getPipeliningLimit()), [getPreviewServerSettings](../../scaladsl/settings/ServerSettings.html#getPreviewServerSettings()), [getRawRequestUriHeader](../../scaladsl/settings/ServerSettings.html#getRawRequestUriHeader()), [getRemoteAddressAttribute](../../scaladsl/settings/ServerSettings.html#getRemoteAddressAttribute()), [getRemoteAddressHeader](../../scaladsl/settings/ServerSettings.html#getRemoteAddressHeader()), [getResponseHeaderSizeHint](../../scaladsl/settings/ServerSettings.html#getResponseHeaderSizeHint()), [getServerHeader](../../scaladsl/settings/ServerSettings.html#getServerHeader()), [getSocketOptions](../../scaladsl/settings/ServerSettings.html#getSocketOptions()), [getStreamCancellationDelay](../../scaladsl/settings/ServerSettings.html#getStreamCancellationDelay()), [getTerminationDeadlineExceededResponse](../../scaladsl/settings/ServerSettings.html#getTerminationDeadlineExceededResponse()), [getTimeouts](../../scaladsl/settings/ServerSettings.html#getTimeouts()), [getTransparentHeadRequests](../../scaladsl/settings/ServerSettings.html#getTransparentHeadRequests()), [getVerboseErrorMessages](../../scaladsl/settings/ServerSettings.html#getVerboseErrorMessages()), [getWebsocketRandomFactory](../../scaladsl/settings/ServerSettings.html#getWebsocketRandomFactory()), [getWebsocketSettings](../../scaladsl/settings/ServerSettings.html#getWebsocketSettings()), [mapHttp2Settings](../../scaladsl/settings/ServerSettings.html#mapHttp2Settings(scala.Function1)), [mapParserSettings](../../scaladsl/settings/ServerSettings.html#mapParserSettings(scala.Function1)), [mapPreviewServerSettings](../../scaladsl/settings/ServerSettings.html#mapPreviewServerSettings(scala.Function1)), [mapTimeouts](../../scaladsl/settings/ServerSettings.html#mapTimeouts(scala.Function1)), [mapWebsocketSettings](../../scaladsl/settings/ServerSettings.html#mapWebsocketSettings(scala.Function1)), [timeoutsShortcut](../../scaladsl/settings/ServerSettings.html#timeoutsShortcut(akka.http.scaladsl.settings.ServerSettings)), [withBacklog](../../scaladsl/settings/ServerSettings.html#withBacklog(int)), [withDefaultHostHeader](../../scaladsl/settings/ServerSettings.html#withDefaultHostHeader(akka.http.scaladsl.model.headers.Host)), [withDefaultHttpPort](../../scaladsl/settings/ServerSettings.html#withDefaultHttpPort(int)), [withDefaultHttpsPort](../../scaladsl/settings/ServerSettings.html#withDefaultHttpsPort(int)), [withHttp2Enabled](../../scaladsl/settings/ServerSettings.html#withHttp2Enabled(boolean)), [withHttp2Settings](../../scaladsl/settings/ServerSettings.html#withHttp2Settings(akka.http.scaladsl.settings.Http2ServerSettings)), [withLogUnencryptedNetworkBytes](../../scaladsl/settings/ServerSettings.html#withLogUnencryptedNetworkBytes(scala.Option)), [withMaxConnections](../../scaladsl/settings/ServerSettings.html#withMaxConnections(int)), [withParserSettings](../../scaladsl/settings/ServerSettings.html#withParserSettings(akka.http.scaladsl.settings.ParserSettings)), [withParsingErrorHandler](../../scaladsl/settings/ServerSettings.html#withParsingErrorHandler(java.lang.String)), [withPipeliningLimit](../../scaladsl/settings/ServerSettings.html#withPipeliningLimit(int)), [withPreviewServerSettings](../../scaladsl/settings/ServerSettings.html#withPreviewServerSettings(akka.http.scaladsl.settings.PreviewServerSettings)), [withRawRequestUriHeader](../../scaladsl/settings/ServerSettings.html#withRawRequestUriHeader(boolean)), [withRemoteAddressAttribute](../../scaladsl/settings/ServerSettings.html#withRemoteAddressAttribute(boolean)), [withRemoteAddressHeader](../../scaladsl/settings/ServerSettings.html#withRemoteAddressHeader(boolean)), [withResponseHeaderSizeHint](../../scaladsl/settings/ServerSettings.html#withResponseHeaderSizeHint(int)), [withServerHeader](../../scaladsl/settings/ServerSettings.html#withServerHeader(scala.Option)), [withSocketOptions](../../scaladsl/settings/ServerSettings.html#withSocketOptions(java.lang.Iterable)), [withSocketOptions](../../scaladsl/settings/ServerSettings.html#withSocketOptions(scala.collection.immutable.Seq)), [withStreamCancellationDelay](../../scaladsl/settings/ServerSettings.html#withStreamCancellationDelay(scala.concurrent.duration.FiniteDuration)), [withTerminationDeadlineExceededResponse](../../scaladsl/settings/ServerSettings.html#withTerminationDeadlineExceededResponse(akka.http.javadsl.model.HttpResponse)), [withTimeouts](../../scaladsl/settings/ServerSettings.html#withTimeouts(akka.http.scaladsl.settings.ServerSettings.Timeouts)), [withTransparentHeadRequests](../../scaladsl/settings/ServerSettings.html#withTransparentHeadRequests(boolean)), [withVerboseErrorMessages](../../scaladsl/settings/ServerSettings.html#withVerboseErrorMessages(boolean)), [withWebsocketRandomFactory](../../scaladsl/settings/ServerSettings.html#withWebsocketRandomFactory(java.util.function.Supplier)), [withWebsocketRandomFactory](../../scaladsl/settings/ServerSettings.html#withWebsocketRandomFactory(scala.Function0)), [withWebsocketSettings](../../scaladsl/settings/ServerSettings.html#withWebsocketSettings(akka.http.scaladsl.settings.WebSocketSettings))`
		- ### Methods inherited from class akka.http.javadsl.settings.[ServerSettings](../../javadsl/settings/ServerSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/ServerSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/ServerSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/ServerSettings.html#create(java.lang.String)), [getHttp2Settings](../../javadsl/settings/ServerSettings.html#getHttp2Settings()), [withDefaultHostHeader](../../javadsl/settings/ServerSettings.html#withDefaultHostHeader(akka.http.javadsl.model.headers.Host)), [withHttp2Settings](../../javadsl/settings/ServerSettings.html#withHttp2Settings(akka.http.javadsl.settings.Http2ServerSettings)), [withLogUnencryptedNetworkBytes](../../javadsl/settings/ServerSettings.html#withLogUnencryptedNetworkBytes(java.util.Optional)), [withParserSettings](../../javadsl/settings/ServerSettings.html#withParserSettings(akka.http.javadsl.settings.ParserSettings)), [withPreviewServerSettings](../../javadsl/settings/ServerSettings.html#withPreviewServerSettings(akka.http.javadsl.settings.PreviewServerSettings)), [withServerHeader](../../javadsl/settings/ServerSettings.html#withServerHeader(java.util.Optional)), [withTimeouts](../../javadsl/settings/ServerSettings.html#withTimeouts(akka.http.javadsl.settings.ServerSettings.Timeouts)), [withWebsocketSettings](../../javadsl/settings/ServerSettings.html#withWebsocketSettings(akka.http.javadsl.settings.WebSocketSettings))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### ServerSettingsImpl
		
		
		
		```
		public ServerSettingsImpl​(scala.Option<[Server](../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")> serverHeader,
		                          [PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings") previewServerSettings,
		                          [ServerSettings.Timeouts](../../scaladsl/settings/ServerSettings.Timeouts.html "interface in akka.http.scaladsl.settings") timeouts,
		                          int maxConnections,
		                          int pipeliningLimit,
		                          boolean remoteAddressHeader,
		                          boolean remoteAddressAttribute,
		                          boolean rawRequestUriHeader,
		                          boolean transparentHeadRequests,
		                          boolean verboseErrorMessages,
		                          int responseHeaderSizeHint,
		                          int backlog,
		                          scala.Option<java.lang.Object> logUnencryptedNetworkBytes,
		                          scala.collection.immutable.Seq<akka.io.Inet.SocketOption> socketOptions,
		                          [Host](../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader,
		                          [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,
		                          [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                          [Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") http2Settings,
		                          int defaultHttpPort,
		                          int defaultHttpsPort,
		                          [HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") terminationDeadlineExceededResponse,
		                          java.lang.String parsingErrorHandler,
		                          scala.concurrent.duration.FiniteDuration streamCancellationDelay,
		                          boolean http2Enabled)
		```

	- ### Method Detail
	
	
	
		- #### timeoutsShortcut
		
		
		
		```
		public static [ServerSettings.Timeouts](../../javadsl/settings/ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings") timeoutsShortcut​([ServerSettings](../../javadsl/settings/ServerSettings.html "class in akka.http.javadsl.settings") s)
		```
		- #### fromSubConfig
		
		
		
		```
		public static [ServerSettingsImpl](ServerSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                               com.typesafe.config.Config c)
		```
		- #### prefix
		
		
		
		```
		protected static java.lang.String prefix()
		```
		- #### apply
		
		
		
		```
		public static T apply​(akka.actor.ActorSystem system)
		```
		- #### apply
		
		
		
		```
		public static T apply​(java.lang.String configOverrides)
		```
		- #### apply
		
		
		
		```
		public static T apply​(com.typesafe.config.Config config)
		```
		- #### serverHeader
		
		
		
		```
		public scala.Option<[Server](../../scaladsl/model/headers/Server.html "class in akka.http.scaladsl.model.headers")> serverHeader()
		```
		
		
		Specified by:
		`[serverHeader](../../scaladsl/settings/ServerSettings.html#serverHeader())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### previewServerSettings
		
		
		
		```
		public [PreviewServerSettings](../../scaladsl/settings/PreviewServerSettings.html "class in akka.http.scaladsl.settings") previewServerSettings()
		```
		
		
		Specified by:
		`[previewServerSettings](../../scaladsl/settings/ServerSettings.html#previewServerSettings())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### timeouts
		
		
		
		```
		public [ServerSettings.Timeouts](../../scaladsl/settings/ServerSettings.Timeouts.html "interface in akka.http.scaladsl.settings") timeouts()
		```
		
		
		Specified by:
		`[timeouts](../../scaladsl/settings/ServerSettings.html#timeouts())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### maxConnections
		
		
		
		```
		public int maxConnections()
		```
		
		
		Specified by:
		`[maxConnections](../../scaladsl/settings/ServerSettings.html#maxConnections())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### pipeliningLimit
		
		
		
		```
		public int pipeliningLimit()
		```
		
		
		Specified by:
		`[pipeliningLimit](../../scaladsl/settings/ServerSettings.html#pipeliningLimit())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### remoteAddressHeader
		
		
		
		```
		public boolean remoteAddressHeader()
		```
		
		
		Specified by:
		`[remoteAddressHeader](../../scaladsl/settings/ServerSettings.html#remoteAddressHeader())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### remoteAddressAttribute
		
		
		
		```
		public boolean remoteAddressAttribute()
		```
		
		
		Specified by:
		`[remoteAddressAttribute](../../scaladsl/settings/ServerSettings.html#remoteAddressAttribute())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### rawRequestUriHeader
		
		
		
		```
		public boolean rawRequestUriHeader()
		```
		
		
		Specified by:
		`[rawRequestUriHeader](../../scaladsl/settings/ServerSettings.html#rawRequestUriHeader())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### transparentHeadRequests
		
		
		
		```
		public boolean transparentHeadRequests()
		```
		
		
		Specified by:
		`[transparentHeadRequests](../../scaladsl/settings/ServerSettings.html#transparentHeadRequests())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### verboseErrorMessages
		
		
		
		```
		public boolean verboseErrorMessages()
		```
		
		
		Specified by:
		`[verboseErrorMessages](../../scaladsl/settings/ServerSettings.html#verboseErrorMessages())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### responseHeaderSizeHint
		
		
		
		```
		public int responseHeaderSizeHint()
		```
		
		
		Specified by:
		`[responseHeaderSizeHint](../../scaladsl/settings/ServerSettings.html#responseHeaderSizeHint())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### backlog
		
		
		
		```
		public int backlog()
		```
		
		
		Specified by:
		`[backlog](../../scaladsl/settings/ServerSettings.html#backlog())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### logUnencryptedNetworkBytes
		
		
		
		```
		public scala.Option<java.lang.Object> logUnencryptedNetworkBytes()
		```
		
		
		Specified by:
		`[logUnencryptedNetworkBytes](../../scaladsl/settings/ServerSettings.html#logUnencryptedNetworkBytes())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### socketOptions
		
		
		
		```
		public scala.collection.immutable.Seq<akka.io.Inet.SocketOption> socketOptions()
		```
		
		
		Specified by:
		`[socketOptions](../../scaladsl/settings/ServerSettings.html#socketOptions())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### defaultHostHeader
		
		
		
		```
		public [Host](../../scaladsl/model/headers/Host.html "class in akka.http.scaladsl.model.headers") defaultHostHeader()
		```
		
		
		Specified by:
		`[defaultHostHeader](../../scaladsl/settings/ServerSettings.html#defaultHostHeader())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### websocketSettings
		
		
		
		```
		public [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings()
		```
		
		
		Specified by:
		`[websocketSettings](../../scaladsl/settings/ServerSettings.html#websocketSettings())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### parserSettings
		
		
		
		```
		public [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings()
		```
		
		
		Specified by:
		`[parserSettings](../../scaladsl/settings/ServerSettings.html#parserSettings())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### http2Settings
		
		
		
		```
		public [Http2ServerSettings](../../scaladsl/settings/Http2ServerSettings.html "interface in akka.http.scaladsl.settings") http2Settings()
		```
		
		
		Specified by:
		`[http2Settings](../../scaladsl/settings/ServerSettings.html#http2Settings())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### defaultHttpPort
		
		
		
		```
		public int defaultHttpPort()
		```
		
		
		Specified by:
		`[defaultHttpPort](../../scaladsl/settings/ServerSettings.html#defaultHttpPort())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### defaultHttpsPort
		
		
		
		```
		public int defaultHttpsPort()
		```
		
		
		Specified by:
		`[defaultHttpsPort](../../scaladsl/settings/ServerSettings.html#defaultHttpsPort())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### terminationDeadlineExceededResponse
		
		
		
		```
		public [HttpResponse](../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") terminationDeadlineExceededResponse()
		```
		
		
		Specified by:
		`[terminationDeadlineExceededResponse](../../scaladsl/settings/ServerSettings.html#terminationDeadlineExceededResponse())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### parsingErrorHandler
		
		
		
		```
		public java.lang.String parsingErrorHandler()
		```
		
		
		Specified by:
		`[parsingErrorHandler](../../scaladsl/settings/ServerSettings.html#parsingErrorHandler())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### streamCancellationDelay
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration streamCancellationDelay()
		```
		
		
		Specified by:
		`[streamCancellationDelay](../../scaladsl/settings/ServerSettings.html#streamCancellationDelay())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### http2Enabled
		
		
		
		```
		public boolean http2Enabled()
		```
		
		
		Specified by:
		`[http2Enabled](../../scaladsl/settings/ServerSettings.html#http2Enabled())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### websocketRandomFactory
		
		
		
		```
		public scala.Function0<java.util.Random> websocketRandomFactory()
		```
		
		
		Specified by:
		`[websocketRandomFactory](../../scaladsl/settings/ServerSettings.html#websocketRandomFactory())` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### parsingErrorHandlerInstance
		
		
		
		```
		public [ParsingErrorHandler](../../ParsingErrorHandler.html "class in akka.http") parsingErrorHandlerInstance​(akka.actor.ActorSystem system)
		```
		
		Description copied from class: `[ServerSettings](../../scaladsl/settings/ServerSettings.html#parsingErrorHandlerInstance(akka.actor.ActorSystem))`
		INTERNAL API
		 
		 Returns an instance of the ParsingErrorHandler as specified by `parsingErrorHandler`
		
		
		
		Specified by:
		`[parsingErrorHandlerInstance](../../scaladsl/settings/ServerSettings.html#parsingErrorHandlerInstance(akka.actor.ActorSystem))` in class `[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`
		Parameters:
		`system` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/ParsingErrorHandler.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.Timeouts$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.Timeouts.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.Timeouts.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Server.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.LogUnencryptedNetworkBytes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.Timeouts.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ServerSettingsImpl.html)*