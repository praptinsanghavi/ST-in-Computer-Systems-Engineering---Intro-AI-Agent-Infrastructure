---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
title: ServerSettings
---

# ServerSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ServerSettings

- java.lang.Object
- - akka.http.javadsl.settings.ServerSettings

- Direct Known Subclasses:
`[ServerSettings](../../scaladsl/settings/ServerSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class ServerSettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[ServerSettings.Timeouts](ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ServerSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `abstract int` | `[getBacklog](#getBacklog())()` |  |
	| `abstract [Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers")` | `[getDefaultHostHeader](#getDefaultHostHeader())()` |  |
	| `abstract int` | `[getDefaultHttpPort](#getDefaultHttpPort())()` |  |
	| `abstract int` | `[getDefaultHttpsPort](#getDefaultHttpsPort())()` |  |
	| `[Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings")` | `[getHttp2Settings](#getHttp2Settings())()` |  |
	| `abstract java.util.Optional<java.lang.Object>` | `[getLogUnencryptedNetworkBytes](#getLogUnencryptedNetworkBytes())()` |  |
	| `abstract int` | `[getMaxConnections](#getMaxConnections())()` |  |
	| `abstract [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[getParserSettings](#getParserSettings())()` |  |
	| `abstract java.lang.String` | `[getParsingErrorHandler](#getParsingErrorHandler())()` |  |
	| `abstract int` | `[getPipeliningLimit](#getPipeliningLimit())()` |  |
	| `abstract [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings")` | `[getPreviewServerSettings](#getPreviewServerSettings())()` |  |
	| `abstract boolean` | `[getRawRequestUriHeader](#getRawRequestUriHeader())()` |  |
	| `abstract boolean` | `[getRemoteAddressAttribute](#getRemoteAddressAttribute())()` |  |
	| `abstract boolean` | `[getRemoteAddressHeader](#getRemoteAddressHeader())()` | Deprecated. since 10\.2\.0, use remoteAddressAttribute instead |
	| `abstract int` | `[getResponseHeaderSizeHint](#getResponseHeaderSizeHint())()` |  |
	| `abstract java.util.Optional<[Server](../model/headers/Server.html "class in akka.http.javadsl.model.headers")>` | `[getServerHeader](#getServerHeader())()` |  |
	| `abstract java.lang.Iterable<akka.io.Inet.SocketOption>` | `[getSocketOptions](#getSocketOptions())()` |  |
	| `abstract scala.concurrent.duration.FiniteDuration` | `[getStreamCancellationDelay](#getStreamCancellationDelay())()` |  |
	| `abstract [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model")` | `[getTerminationDeadlineExceededResponse](#getTerminationDeadlineExceededResponse())()` |  |
	| `abstract [ServerSettings.Timeouts](ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings")` | `[getTimeouts](#getTimeouts())()` |  |
	| `abstract boolean` | `[getTransparentHeadRequests](#getTransparentHeadRequests())()` |  |
	| `abstract boolean` | `[getVerboseErrorMessages](#getVerboseErrorMessages())()` |  |
	| `abstract java.util.function.Supplier<java.util.Random>` | `[getWebsocketRandomFactory](#getWebsocketRandomFactory())()` | Deprecated. Kept for binary compatibility; Use websocketSettings.getRandomFactory instead. |
	| `abstract [WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[getWebsocketSettings](#getWebsocketSettings())()` |  |
	| `abstract boolean` | `[http2Enabled](#http2Enabled())()` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withBacklog](#withBacklog(int))​(int newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withDefaultHostHeader](#withDefaultHostHeader(akka.http.javadsl.model.headers.Host))​([Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers") newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withDefaultHttpPort](#withDefaultHttpPort(int))​(int newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withDefaultHttpsPort](#withDefaultHttpsPort(int))​(int newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withHttp2Enabled](#withHttp2Enabled(boolean))​(boolean enabled)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withHttp2Settings](#withHttp2Settings(akka.http.javadsl.settings.Http2ServerSettings))​([Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withLogUnencryptedNetworkBytes](#withLogUnencryptedNetworkBytes(java.util.Optional))​(java.util.Optional<java.lang.Object> newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withMaxConnections](#withMaxConnections(int))​(int newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withParserSettings](#withParserSettings(akka.http.javadsl.settings.ParserSettings))​([ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withParsingErrorHandler](#withParsingErrorHandler(java.lang.String))​(java.lang.String newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withPipeliningLimit](#withPipeliningLimit(int))​(int newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withPreviewServerSettings](#withPreviewServerSettings(akka.http.javadsl.settings.PreviewServerSettings))​([PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withRawRequestUriHeader](#withRawRequestUriHeader(boolean))​(boolean newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withRemoteAddressAttribute](#withRemoteAddressAttribute(boolean))​(boolean newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withRemoteAddressHeader](#withRemoteAddressHeader(boolean))​(boolean newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withResponseHeaderSizeHint](#withResponseHeaderSizeHint(int))​(int newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withServerHeader](#withServerHeader(java.util.Optional))​(java.util.Optional<[Server](../model/headers/Server.html "class in akka.http.javadsl.model.headers")> newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withSocketOptions](#withSocketOptions(java.lang.Iterable))​(java.lang.Iterable<akka.io.Inet.SocketOption> newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withStreamCancellationDelay](#withStreamCancellationDelay(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withTerminationDeadlineExceededResponse](#withTerminationDeadlineExceededResponse(akka.http.javadsl.model.HttpResponse))​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withTimeouts](#withTimeouts(akka.http.javadsl.settings.ServerSettings.Timeouts))​([ServerSettings.Timeouts](ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings") newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withTransparentHeadRequests](#withTransparentHeadRequests(boolean))​(boolean newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withVerboseErrorMessages](#withVerboseErrorMessages(boolean))​(boolean newValue)` |  |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withWebsocketRandomFactory](#withWebsocketRandomFactory(java.util.function.Supplier))​(java.util.function.Supplier<java.util.Random> newValue)` | Deprecated. Kept for binary compatibility; Use websocketSettings.withRandomFactoryFactory instead. |
	| `[ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings")` | `[withWebsocketSettings](#withWebsocketSettings(akka.http.javadsl.settings.WebSocketSettings))​([WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") newValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ServerSettings
		
		
		
		```
		public ServerSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		- #### getServerHeader
		
		
		
		```
		public abstract java.util.Optional<[Server](../model/headers/Server.html "class in akka.http.javadsl.model.headers")> getServerHeader()
		```
		- #### getPreviewServerSettings
		
		
		
		```
		public abstract [PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") getPreviewServerSettings()
		```
		- #### getTimeouts
		
		
		
		```
		public abstract [ServerSettings.Timeouts](ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings") getTimeouts()
		```
		- #### getMaxConnections
		
		
		
		```
		public abstract int getMaxConnections()
		```
		- #### getPipeliningLimit
		
		
		
		```
		public abstract int getPipeliningLimit()
		```
		- #### getRemoteAddressHeader
		
		
		
		```
		public abstract boolean getRemoteAddressHeader()
		```
		
		Deprecated.
		since 10\.2\.0, use remoteAddressAttribute instead
		
		
		Returns:
		(undocumented)
		- #### getRemoteAddressAttribute
		
		
		
		```
		public abstract boolean getRemoteAddressAttribute()
		```
		- #### getRawRequestUriHeader
		
		
		
		```
		public abstract boolean getRawRequestUriHeader()
		```
		- #### getTransparentHeadRequests
		
		
		
		```
		public abstract boolean getTransparentHeadRequests()
		```
		- #### getVerboseErrorMessages
		
		
		
		```
		public abstract boolean getVerboseErrorMessages()
		```
		- #### getResponseHeaderSizeHint
		
		
		
		```
		public abstract int getResponseHeaderSizeHint()
		```
		- #### getBacklog
		
		
		
		```
		public abstract int getBacklog()
		```
		- #### getSocketOptions
		
		
		
		```
		public abstract java.lang.Iterable<akka.io.Inet.SocketOption> getSocketOptions()
		```
		- #### getDefaultHostHeader
		
		
		
		```
		public abstract [Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers") getDefaultHostHeader()
		```
		- #### getWebsocketRandomFactory
		
		
		
		```
		public abstract java.util.function.Supplier<java.util.Random> getWebsocketRandomFactory()
		```
		
		Deprecated.
		Kept for binary compatibility; Use websocketSettings.getRandomFactory instead. Since 10\.2\.0\.
		- #### getWebsocketSettings
		
		
		
		```
		public abstract [WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") getWebsocketSettings()
		```
		- #### getParserSettings
		
		
		
		```
		public abstract [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") getParserSettings()
		```
		- #### getLogUnencryptedNetworkBytes
		
		
		
		```
		public abstract java.util.Optional<java.lang.Object> getLogUnencryptedNetworkBytes()
		```
		- #### getHttp2Settings
		
		
		
		```
		public [Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") getHttp2Settings()
		```
		- #### getDefaultHttpPort
		
		
		
		```
		public abstract int getDefaultHttpPort()
		```
		- #### getDefaultHttpsPort
		
		
		
		```
		public abstract int getDefaultHttpsPort()
		```
		- #### getTerminationDeadlineExceededResponse
		
		
		
		```
		public abstract [HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") getTerminationDeadlineExceededResponse()
		```
		- #### getParsingErrorHandler
		
		
		
		```
		public abstract java.lang.String getParsingErrorHandler()
		```
		- #### getStreamCancellationDelay
		
		
		
		```
		public abstract scala.concurrent.duration.FiniteDuration getStreamCancellationDelay()
		```
		- #### http2Enabled
		
		
		
		```
		public abstract boolean http2Enabled()
		```
		- #### withServerHeader
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withServerHeader​(java.util.Optional<[Server](../model/headers/Server.html "class in akka.http.javadsl.model.headers")> newValue)
		```
		- #### withPreviewServerSettings
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withPreviewServerSettings​([PreviewServerSettings](PreviewServerSettings.html "class in akka.http.javadsl.settings") newValue)
		```
		- #### withTimeouts
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withTimeouts​([ServerSettings.Timeouts](ServerSettings.Timeouts.html "interface in akka.http.javadsl.settings") newValue)
		```
		- #### withMaxConnections
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withMaxConnections​(int newValue)
		```
		- #### withPipeliningLimit
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withPipeliningLimit​(int newValue)
		```
		- #### withRemoteAddressHeader
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withRemoteAddressHeader​(boolean newValue)
		```
		- #### withRemoteAddressAttribute
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withRemoteAddressAttribute​(boolean newValue)
		```
		- #### withRawRequestUriHeader
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withRawRequestUriHeader​(boolean newValue)
		```
		- #### withTransparentHeadRequests
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withTransparentHeadRequests​(boolean newValue)
		```
		- #### withVerboseErrorMessages
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withVerboseErrorMessages​(boolean newValue)
		```
		- #### withResponseHeaderSizeHint
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withResponseHeaderSizeHint​(int newValue)
		```
		- #### withBacklog
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withBacklog​(int newValue)
		```
		- #### withSocketOptions
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withSocketOptions​(java.lang.Iterable<akka.io.Inet.SocketOption> newValue)
		```
		- #### withDefaultHostHeader
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withDefaultHostHeader​([Host](../model/headers/Host.html "class in akka.http.javadsl.model.headers") newValue)
		```
		- #### withParserSettings
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withParserSettings​([ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") newValue)
		```
		- #### withWebsocketRandomFactory
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withWebsocketRandomFactory​(java.util.function.Supplier<java.util.Random> newValue)
		```
		
		Deprecated.
		Kept for binary compatibility; Use websocketSettings.withRandomFactoryFactory instead. Since 10\.2\.0\.
		- #### withWebsocketSettings
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withWebsocketSettings​([WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") newValue)
		```
		- #### withLogUnencryptedNetworkBytes
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withLogUnencryptedNetworkBytes​(java.util.Optional<java.lang.Object> newValue)
		```
		- #### withHttp2Settings
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withHttp2Settings​([Http2ServerSettings](Http2ServerSettings.html "interface in akka.http.javadsl.settings") newValue)
		```
		- #### withDefaultHttpPort
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withDefaultHttpPort​(int newValue)
		```
		- #### withDefaultHttpsPort
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withDefaultHttpsPort​(int newValue)
		```
		- #### withTerminationDeadlineExceededResponse
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withTerminationDeadlineExceededResponse​([HttpResponse](../model/HttpResponse.html "class in akka.http.javadsl.model") response)
		```
		- #### withParsingErrorHandler
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withParsingErrorHandler​(java.lang.String newValue)
		```
		- #### withStreamCancellationDelay
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withStreamCancellationDelay​(scala.concurrent.duration.FiniteDuration newValue)
		```
		- #### withHttp2Enabled
		
		
		
		```
		public [ServerSettings](ServerSettings.html "class in akka.http.javadsl.settings") withHttp2Enabled​(boolean enabled)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Host.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/Server.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/Http2ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/PreviewServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.Timeouts.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ServerSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ServerSettings.html)*