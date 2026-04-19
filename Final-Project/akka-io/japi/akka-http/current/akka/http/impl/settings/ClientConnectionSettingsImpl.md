---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:34:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ClientConnectionSettingsImpl.html
title: ClientConnectionSettingsImpl
---

# ClientConnectionSettingsImpl

## Content

Package [akka.http.impl.settings](package-summary.html)
## Class ClientConnectionSettingsImpl

- java.lang.Object
- - [akka.http.javadsl.settings.ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings")
	- - [akka.http.scaladsl.settings.ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")
		- - akka.http.impl.settings.ClientConnectionSettingsImpl

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ClientConnectionSettingsImpl
extends [ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")
implements scala.Product, java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../../serialized-form.html#akka.http.impl.settings.ClientConnectionSettingsImpl)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.settings.[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[ClientConnectionSettings.LogUnencryptedNetworkBytes$](../../scaladsl/settings/ClientConnectionSettings.LogUnencryptedNetworkBytes$.html "class in akka.http.scaladsl.settings")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClientConnectionSettingsImpl](#%3Cinit%3E(scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.Duration,int,scala.Option,akka.http.scaladsl.settings.WebSocketSettings,scala.collection.immutable.Seq,akka.http.scaladsl.settings.ParserSettings,scala.concurrent.duration.FiniteDuration,scala.Option,akka.http.scaladsl.settings.Http2ClientSettings,akka.http.scaladsl.ClientTransport))​(scala.Option<[User$minusAgent](../../scaladsl/model/headers/User$minusAgent.html "class in akka.http.scaladsl.model.headers")> userAgentHeader,  scala.concurrent.duration.FiniteDuration connectingTimeout,  scala.concurrent.duration.Duration idleTimeout,  int requestHeaderSizeHint,  scala.Option<java.lang.Object> logUnencryptedNetworkBytes,  [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,  scala.collection.immutable.Seq<akka.io.Inet.SocketOption> socketOptions,  [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,  scala.concurrent.duration.FiniteDuration streamCancellationDelay,  scala.Option<java.net.InetSocketAddress> localAddress,  [Http2ClientSettings](../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") http2Settings,  [ClientTransport](../../scaladsl/ClientTransport.html "interface in akka.http.scaladsl") transport)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​(akka.actor.ActorSystem system)` |  |
	| `static T` | `[apply](#apply(com.typesafe.config.Config))​(com.typesafe.config.Config config)` |  |
	| `static T` | `[apply](#apply(java.lang.String))​(java.lang.String configOverrides)` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[connectingTimeout](#connectingTimeout())()` |  |
	| `static [ClientConnectionSettingsImpl](ClientConnectionSettingsImpl.html "class in akka.http.impl.settings")` | `[fromSubConfig](#fromSubConfig(com.typesafe.config.Config,com.typesafe.config.Config))​(com.typesafe.config.Config root,  com.typesafe.config.Config inner)` |  |
	| `[Http2ClientSettings](../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings")` | `[http2Settings](#http2Settings())()` |  |
	| `scala.concurrent.duration.Duration` | `[idleTimeout](#idleTimeout())()` |  |
	| `scala.Option<java.net.InetSocketAddress>` | `[localAddress](#localAddress())()` |  |
	| `scala.Option<java.lang.Object>` | `[logUnencryptedNetworkBytes](#logUnencryptedNetworkBytes())()` |  |
	| `[ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings")` | `[parserSettings](#parserSettings())()` |  |
	| `protected static java.lang.String` | `[prefix](#prefix())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `int` | `[requestHeaderSizeHint](#requestHeaderSizeHint())()` |  |
	| `scala.collection.immutable.Seq<akka.io.Inet.SocketOption>` | `[socketOptions](#socketOptions())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[streamCancellationDelay](#streamCancellationDelay())()` |  |
	| `[ClientTransport](../../scaladsl/ClientTransport.html "interface in akka.http.scaladsl")` | `[transport](#transport())()` | The underlying transport used to connect to hosts. |
	| `scala.Option<[User$minusAgent](../../scaladsl/model/headers/User$minusAgent.html "class in akka.http.scaladsl.model.headers")>` | `[userAgentHeader](#userAgentHeader())()` |  |
	| `scala.Function0<java.util.Random>` | `[websocketRandomFactory](#websocketRandomFactory())()` |  |
	| `[WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings")` | `[websocketSettings](#websocketSettings())()` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.settings.[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")
		
		
		`[mapHttp2Settings](../../scaladsl/settings/ClientConnectionSettings.html#mapHttp2Settings(scala.Function1)), [withConnectingTimeout](../../scaladsl/settings/ClientConnectionSettings.html#withConnectingTimeout(scala.concurrent.duration.FiniteDuration)), [withHttp2Settings](../../scaladsl/settings/ClientConnectionSettings.html#withHttp2Settings(akka.http.scaladsl.settings.Http2ClientSettings)), [withIdleTimeout](../../scaladsl/settings/ClientConnectionSettings.html#withIdleTimeout(scala.concurrent.duration.Duration)), [withLocalAddress](../../scaladsl/settings/ClientConnectionSettings.html#withLocalAddress(scala.Option)), [withLocalAddressOverride](../../scaladsl/settings/ClientConnectionSettings.html#withLocalAddressOverride(scala.Option)), [withLogUnencryptedNetworkBytes](../../scaladsl/settings/ClientConnectionSettings.html#withLogUnencryptedNetworkBytes(scala.Option)), [withParserSettings](../../scaladsl/settings/ClientConnectionSettings.html#withParserSettings(akka.http.scaladsl.settings.ParserSettings)), [withRequestHeaderSizeHint](../../scaladsl/settings/ClientConnectionSettings.html#withRequestHeaderSizeHint(int)), [withSocketOptions](../../scaladsl/settings/ClientConnectionSettings.html#withSocketOptions(scala.collection.immutable.Seq)), [withStreamCancellationDelay](../../scaladsl/settings/ClientConnectionSettings.html#withStreamCancellationDelay(scala.concurrent.duration.FiniteDuration)), [withTransport](../../scaladsl/settings/ClientConnectionSettings.html#withTransport(akka.http.scaladsl.ClientTransport)), [withUserAgentHeader](../../scaladsl/settings/ClientConnectionSettings.html#withUserAgentHeader(scala.Option)), [withWebsocketRandomFactory](../../scaladsl/settings/ClientConnectionSettings.html#withWebsocketRandomFactory(scala.Function0)), [withWebsocketSettings](../../scaladsl/settings/ClientConnectionSettings.html#withWebsocketSettings(akka.http.scaladsl.settings.WebSocketSettings))`
		- ### Methods inherited from class akka.http.javadsl.settings.[ClientConnectionSettings](../../javadsl/settings/ClientConnectionSettings.html "class in akka.http.javadsl.settings")
		
		
		`[create](../../javadsl/settings/ClientConnectionSettings.html#create(akka.actor.ActorSystem)), [create](../../javadsl/settings/ClientConnectionSettings.html#create(com.typesafe.config.Config)), [create](../../javadsl/settings/ClientConnectionSettings.html#create(java.lang.String)), [getConnectingTimeout](../../javadsl/settings/ClientConnectionSettings.html#getConnectingTimeout()), [getIdleTimeout](../../javadsl/settings/ClientConnectionSettings.html#getIdleTimeout()), [getLocalAddress](../../javadsl/settings/ClientConnectionSettings.html#getLocalAddress()), [getLogUnencryptedNetworkBytes](../../javadsl/settings/ClientConnectionSettings.html#getLogUnencryptedNetworkBytes()), [getParserSettings](../../javadsl/settings/ClientConnectionSettings.html#getParserSettings()), [getRequestHeaderSizeHint](../../javadsl/settings/ClientConnectionSettings.html#getRequestHeaderSizeHint()), [getSocketOptions](../../javadsl/settings/ClientConnectionSettings.html#getSocketOptions()), [getStreamCancellationDelay](../../javadsl/settings/ClientConnectionSettings.html#getStreamCancellationDelay()), [getTransport](../../javadsl/settings/ClientConnectionSettings.html#getTransport()), [getUserAgentHeader](../../javadsl/settings/ClientConnectionSettings.html#getUserAgentHeader()), [getWebsocketRandomFactory](../../javadsl/settings/ClientConnectionSettings.html#getWebsocketRandomFactory()), [getWebsocketSettings](../../javadsl/settings/ClientConnectionSettings.html#getWebsocketSettings()), [withLocalAddress](../../javadsl/settings/ClientConnectionSettings.html#withLocalAddress(java.util.Optional)), [withLogUnencryptedNetworkBytes](../../javadsl/settings/ClientConnectionSettings.html#withLogUnencryptedNetworkBytes(java.util.Optional)), [withParserSettings](../../javadsl/settings/ClientConnectionSettings.html#withParserSettings(akka.http.javadsl.settings.ParserSettings)), [withSocketOptions](../../javadsl/settings/ClientConnectionSettings.html#withSocketOptions(java.lang.Iterable)), [withTransport](../../javadsl/settings/ClientConnectionSettings.html#withTransport(akka.http.javadsl.ClientTransport)), [withUserAgentHeader](../../javadsl/settings/ClientConnectionSettings.html#withUserAgentHeader(java.util.Optional)), [withWebsocketRandomFactory](../../javadsl/settings/ClientConnectionSettings.html#withWebsocketRandomFactory(java.util.function.Supplier)), [withWebsocketSettings](../../javadsl/settings/ClientConnectionSettings.html#withWebsocketSettings(akka.http.javadsl.settings.WebSocketSettings))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`canEqual, equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productArity, productElement, productElementName, productElementNames, productIterator`

- - ### Constructor Detail
	
	
	
		- #### ClientConnectionSettingsImpl
		
		
		
		```
		public ClientConnectionSettingsImpl​(scala.Option<[User$minusAgent](../../scaladsl/model/headers/User$minusAgent.html "class in akka.http.scaladsl.model.headers")> userAgentHeader,
		                                    scala.concurrent.duration.FiniteDuration connectingTimeout,
		                                    scala.concurrent.duration.Duration idleTimeout,
		                                    int requestHeaderSizeHint,
		                                    scala.Option<java.lang.Object> logUnencryptedNetworkBytes,
		                                    [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,
		                                    scala.collection.immutable.Seq<akka.io.Inet.SocketOption> socketOptions,
		                                    [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings,
		                                    scala.concurrent.duration.FiniteDuration streamCancellationDelay,
		                                    scala.Option<java.net.InetSocketAddress> localAddress,
		                                    [Http2ClientSettings](../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") http2Settings,
		                                    [ClientTransport](../../scaladsl/ClientTransport.html "interface in akka.http.scaladsl") transport)
		```

	- ### Method Detail
	
	
	
		- #### fromSubConfig
		
		
		
		```
		public static [ClientConnectionSettingsImpl](ClientConnectionSettingsImpl.html "class in akka.http.impl.settings") fromSubConfig​(com.typesafe.config.Config root,
		                                                         com.typesafe.config.Config inner)
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
		- #### userAgentHeader
		
		
		
		```
		public scala.Option<[User$minusAgent](../../scaladsl/model/headers/User$minusAgent.html "class in akka.http.scaladsl.model.headers")> userAgentHeader()
		```
		
		
		Specified by:
		`[userAgentHeader](../../scaladsl/settings/ClientConnectionSettings.html#userAgentHeader())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### connectingTimeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration connectingTimeout()
		```
		
		
		Specified by:
		`[connectingTimeout](../../scaladsl/settings/ClientConnectionSettings.html#connectingTimeout())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### idleTimeout
		
		
		
		```
		public scala.concurrent.duration.Duration idleTimeout()
		```
		
		
		Specified by:
		`[idleTimeout](../../scaladsl/settings/ClientConnectionSettings.html#idleTimeout())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### requestHeaderSizeHint
		
		
		
		```
		public int requestHeaderSizeHint()
		```
		
		
		Specified by:
		`[requestHeaderSizeHint](../../scaladsl/settings/ClientConnectionSettings.html#requestHeaderSizeHint())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### logUnencryptedNetworkBytes
		
		
		
		```
		public scala.Option<java.lang.Object> logUnencryptedNetworkBytes()
		```
		
		
		Specified by:
		`[logUnencryptedNetworkBytes](../../scaladsl/settings/ClientConnectionSettings.html#logUnencryptedNetworkBytes())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### websocketSettings
		
		
		
		```
		public [WebSocketSettings](../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings()
		```
		
		
		Specified by:
		`[websocketSettings](../../scaladsl/settings/ClientConnectionSettings.html#websocketSettings())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### socketOptions
		
		
		
		```
		public scala.collection.immutable.Seq<akka.io.Inet.SocketOption> socketOptions()
		```
		
		
		Specified by:
		`[socketOptions](../../scaladsl/settings/ClientConnectionSettings.html#socketOptions())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### parserSettings
		
		
		
		```
		public [ParserSettings](../../scaladsl/settings/ParserSettings.html "class in akka.http.scaladsl.settings") parserSettings()
		```
		
		
		Specified by:
		`[parserSettings](../../scaladsl/settings/ClientConnectionSettings.html#parserSettings())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### streamCancellationDelay
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration streamCancellationDelay()
		```
		
		
		Specified by:
		`[streamCancellationDelay](../../scaladsl/settings/ClientConnectionSettings.html#streamCancellationDelay())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### localAddress
		
		
		
		```
		public scala.Option<java.net.InetSocketAddress> localAddress()
		```
		
		
		Specified by:
		`[localAddress](../../scaladsl/settings/ClientConnectionSettings.html#localAddress())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### http2Settings
		
		
		
		```
		public [Http2ClientSettings](../../scaladsl/settings/Http2ClientSettings.html "interface in akka.http.scaladsl.settings") http2Settings()
		```
		
		
		Specified by:
		`[http2Settings](../../scaladsl/settings/ClientConnectionSettings.html#http2Settings())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### transport
		
		
		
		```
		public [ClientTransport](../../scaladsl/ClientTransport.html "interface in akka.http.scaladsl") transport()
		```
		
		Description copied from class: `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html#transport())`
		The underlying transport used to connect to hosts. By default `ClientTransport.TCP` is used.
		
		Specified by:
		`[transport](../../scaladsl/settings/ClientConnectionSettings.html#transport())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### websocketRandomFactory
		
		
		
		```
		public scala.Function0<java.util.Random> websocketRandomFactory()
		```
		
		
		Specified by:
		`[websocketRandomFactory](../../scaladsl/settings/ClientConnectionSettings.html#websocketRandomFactory())` in class `[ClientConnectionSettings](../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ClientConnectionSettingsImpl.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/javadsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/ClientTransport.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/User$minusAgent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.LogUnencryptedNetworkBytes$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/Http2ClientSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ParserSettings.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html
- https://doc.akka.io/japi/akka-http/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ClientConnectionSettingsImpl.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/settings/ClientConnectionSettingsImpl.html)*