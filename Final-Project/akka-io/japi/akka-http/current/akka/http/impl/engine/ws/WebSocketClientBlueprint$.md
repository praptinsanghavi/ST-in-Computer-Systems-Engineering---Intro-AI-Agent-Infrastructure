---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocketClientBlueprint$.html
title: WebSocketClientBlueprint$
---

# WebSocketClientBlueprint$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class WebSocketClientBlueprint$

- java.lang.Object
- - akka.http.impl.engine.ws.WebSocketClientBlueprint$

- ---

```
public class WebSocketClientBlueprint$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [WebSocketClientBlueprint$](WebSocketClientBlueprint$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocketClientBlueprint$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​scala.concurrent.Future<[WebSocketUpgradeResponse](../../../scaladsl/model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>>` | `[apply](#apply(akka.http.scaladsl.model.ws.WebSocketRequest,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Returns a WebSocketClientLayer that can be materialized once. |
	| `akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[WebSocketUpgradeResponse](../../../scaladsl/model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>>` | `[handshake](#handshake(akka.http.scaladsl.model.ws.WebSocketRequest,akka.http.scaladsl.settings.ClientConnectionSettings,akka.event.LoggingAdapter))​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,  [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | A bidi flow that injects and inspects the WS handshake and then goes out of the way. |
	| `akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsInbound,​akka.util.ByteString,​akka.util.ByteString,​akka.stream.TLSProtocol.SendBytes,​akka.NotUsed>` | `[simpleTls](#simpleTls())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [WebSocketClientBlueprint$](WebSocketClientBlueprint$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### WebSocketClientBlueprint$
		
		
		
		```
		public WebSocketClientBlueprint$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​akka.stream.TLSProtocol.SslTlsOutbound,​akka.stream.TLSProtocol.SslTlsInbound,​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​scala.concurrent.Future<[WebSocketUpgradeResponse](../../../scaladsl/model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>> apply​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,
		                                                                                                                                                                                                                   [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                                                   akka.event.LoggingAdapter log)
		```
		
		Returns a WebSocketClientLayer that can be materialized once.
		
		Parameters:
		`request` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### handshake
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​akka.util.ByteString,​scala.concurrent.Future<[WebSocketUpgradeResponse](../../../scaladsl/model/ws/WebSocketUpgradeResponse.html "interface in akka.http.scaladsl.model.ws")>> handshake​([WebSocketRequest](../../../scaladsl/model/ws/WebSocketRequest.html "class in akka.http.scaladsl.model.ws") request,
		                                                                                                                                                                                                              [ClientConnectionSettings](../../../scaladsl/settings/ClientConnectionSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                                                                                                                                                              akka.event.LoggingAdapter log)
		```
		
		A bidi flow that injects and inspects the WS handshake and then goes out of the way. This BidiFlow
		 can only be materialized once.
		
		Parameters:
		`request` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### simpleTls
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<akka.stream.TLSProtocol.SslTlsInbound,​akka.util.ByteString,​akka.util.ByteString,​akka.stream.TLSProtocol.SendBytes,​akka.NotUsed> simpleTls()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocketClientBlueprint$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketRequest.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/WebSocketUpgradeResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/ClientConnectionSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocketClientBlueprint$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocketClientBlueprint$.html)*