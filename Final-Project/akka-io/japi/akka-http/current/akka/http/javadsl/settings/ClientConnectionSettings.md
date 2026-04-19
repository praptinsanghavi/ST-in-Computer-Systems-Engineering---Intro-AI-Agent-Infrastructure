---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:48:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
title: ClientConnectionSettings
---

# ClientConnectionSettings

## Content

Package [akka.http.javadsl.settings](package-summary.html)
## Class ClientConnectionSettings

- java.lang.Object
- - akka.http.javadsl.settings.ClientConnectionSettings

- Direct Known Subclasses:
`[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`

---

```
public abstract class ClientConnectionSettings
extends java.lang.Object
```

Public API but not intended for subclassing

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientConnectionSettings](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[create](#create(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[getConnectingTimeout](#getConnectingTimeout())()` |  |
	| `scala.concurrent.duration.Duration` | `[getIdleTimeout](#getIdleTimeout())()` |  |
	| `java.util.Optional<java.net.InetSocketAddress>` | `[getLocalAddress](#getLocalAddress())()` |  |
	| `java.util.Optional<java.lang.Object>` | `[getLogUnencryptedNetworkBytes](#getLogUnencryptedNetworkBytes())()` |  |
	| `[ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings")` | `[getParserSettings](#getParserSettings())()` |  |
	| `int` | `[getRequestHeaderSizeHint](#getRequestHeaderSizeHint())()` |  |
	| `java.lang.Iterable<akka.io.Inet.SocketOption>` | `[getSocketOptions](#getSocketOptions())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[getStreamCancellationDelay](#getStreamCancellationDelay())()` |  |
	| `[ClientTransport](../ClientTransport.html "class in akka.http.javadsl")` | `[getTransport](#getTransport())()` | The underlying transport used to connect to hosts. |
	| `java.util.Optional<[UserAgent](../model/headers/UserAgent.html "class in akka.http.javadsl.model.headers")>` | `[getUserAgentHeader](#getUserAgentHeader())()` |  |
	| `java.util.function.Supplier<java.util.Random>` | `[getWebsocketRandomFactory](#getWebsocketRandomFactory())()` |  |
	| `[WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings")` | `[getWebsocketSettings](#getWebsocketSettings())()` |  |
	| `abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withConnectingTimeout](#withConnectingTimeout(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withIdleTimeout](#withIdleTimeout(scala.concurrent.duration.Duration))​(scala.concurrent.duration.Duration newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withLocalAddress](#withLocalAddress(java.util.Optional))​(java.util.Optional<java.net.InetSocketAddress> newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withLogUnencryptedNetworkBytes](#withLogUnencryptedNetworkBytes(java.util.Optional))​(java.util.Optional<java.lang.Object> newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withParserSettings](#withParserSettings(akka.http.javadsl.settings.ParserSettings))​([ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") newValue)` |  |
	| `abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withRequestHeaderSizeHint](#withRequestHeaderSizeHint(int))​(int newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withSocketOptions](#withSocketOptions(java.lang.Iterable))​(java.lang.Iterable<akka.io.Inet.SocketOption> newValue)` |  |
	| `abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withStreamCancellationDelay](#withStreamCancellationDelay(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withTransport](#withTransport(akka.http.javadsl.ClientTransport))​([ClientTransport](../ClientTransport.html "class in akka.http.javadsl") newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withUserAgentHeader](#withUserAgentHeader(java.util.Optional))​(java.util.Optional<[UserAgent](../model/headers/UserAgent.html "class in akka.http.javadsl.model.headers")> newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withWebsocketRandomFactory](#withWebsocketRandomFactory(java.util.function.Supplier))​(java.util.function.Supplier<java.util.Random> newValue)` |  |
	| `[ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings")` | `[withWebsocketSettings](#withWebsocketSettings(akka.http.javadsl.settings.WebSocketSettings))​([WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") newValue)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClientConnectionSettings
		
		
		
		```
		public ClientConnectionSettings()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") create​(com.typesafe.config.Config config)
		```
		- #### create
		
		
		
		```
		public static [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") create​(java.lang.String configOverrides)
		```
		- #### create
		
		
		
		```
		public static [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") create​(akka.actor.ActorSystem system)
		```
		- #### getConnectingTimeout
		
		
		
		```
		public final scala.concurrent.duration.FiniteDuration getConnectingTimeout()
		```
		- #### getParserSettings
		
		
		
		```
		public final [ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") getParserSettings()
		```
		- #### getIdleTimeout
		
		
		
		```
		public final scala.concurrent.duration.Duration getIdleTimeout()
		```
		- #### getSocketOptions
		
		
		
		```
		public final java.lang.Iterable<akka.io.Inet.SocketOption> getSocketOptions()
		```
		- #### getUserAgentHeader
		
		
		
		```
		public final java.util.Optional<[UserAgent](../model/headers/UserAgent.html "class in akka.http.javadsl.model.headers")> getUserAgentHeader()
		```
		- #### getLogUnencryptedNetworkBytes
		
		
		
		```
		public final java.util.Optional<java.lang.Object> getLogUnencryptedNetworkBytes()
		```
		- #### getStreamCancellationDelay
		
		
		
		```
		public final scala.concurrent.duration.FiniteDuration getStreamCancellationDelay()
		```
		- #### getRequestHeaderSizeHint
		
		
		
		```
		public final int getRequestHeaderSizeHint()
		```
		- #### getWebsocketSettings
		
		
		
		```
		public final [WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") getWebsocketSettings()
		```
		- #### getWebsocketRandomFactory
		
		
		
		```
		public final java.util.function.Supplier<java.util.Random> getWebsocketRandomFactory()
		```
		- #### getLocalAddress
		
		
		
		```
		public final java.util.Optional<java.net.InetSocketAddress> getLocalAddress()
		```
		- #### getTransport
		
		
		
		```
		public [ClientTransport](../ClientTransport.html "class in akka.http.javadsl") getTransport()
		```
		
		The underlying transport used to connect to hosts. By default `ClientTransport.TCP` is used.
		- #### withConnectingTimeout
		
		
		
		```
		public abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withConnectingTimeout​(scala.concurrent.duration.FiniteDuration newValue)
		```
		- #### withIdleTimeout
		
		
		
		```
		public abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withIdleTimeout​(scala.concurrent.duration.Duration newValue)
		```
		- #### withRequestHeaderSizeHint
		
		
		
		```
		public abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withRequestHeaderSizeHint​(int newValue)
		```
		- #### withStreamCancellationDelay
		
		
		
		```
		public abstract [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withStreamCancellationDelay​(scala.concurrent.duration.FiniteDuration newValue)
		```
		- #### withUserAgentHeader
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withUserAgentHeader​(java.util.Optional<[UserAgent](../model/headers/UserAgent.html "class in akka.http.javadsl.model.headers")> newValue)
		```
		- #### withLogUnencryptedNetworkBytes
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withLogUnencryptedNetworkBytes​(java.util.Optional<java.lang.Object> newValue)
		```
		- #### withWebsocketRandomFactory
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withWebsocketRandomFactory​(java.util.function.Supplier<java.util.Random> newValue)
		```
		- #### withWebsocketSettings
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withWebsocketSettings​([WebSocketSettings](WebSocketSettings.html "interface in akka.http.javadsl.settings") newValue)
		```
		- #### withSocketOptions
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withSocketOptions​(java.lang.Iterable<akka.io.Inet.SocketOption> newValue)
		```
		- #### withParserSettings
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withParserSettings​([ParserSettings](ParserSettings.html "class in akka.http.javadsl.settings") newValue)
		```
		- #### withLocalAddress
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withLocalAddress​(java.util.Optional<java.net.InetSocketAddress> newValue)
		```
		- #### withTransport
		
		
		
		```
		public [ClientConnectionSettings](ClientConnectionSettings.html "class in akka.http.javadsl.settings") withTransport​([ClientTransport](../ClientTransport.html "class in akka.http.javadsl") newValue)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/model/headers/UserAgent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html](https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html)*