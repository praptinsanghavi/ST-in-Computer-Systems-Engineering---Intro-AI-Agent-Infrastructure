---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.Server$.html
title: Handshake.Server$
---

# Handshake.Server$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class Handshake.Server$

- java.lang.Object
- - akka.http.impl.engine.ws.Handshake.Server$

- Enclosing class:
[Handshake](Handshake.html "class in akka.http.impl.engine.ws")

---

```
public static class Handshake.Server$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Handshake.Server$](Handshake.Server$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Server$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[buildResponse](#buildResponse(akka.http.scaladsl.model.headers.Sec$minusWebSocket$minusKey,scala.util.Either,scala.Option,akka.http.scaladsl.settings.WebSocketSettings,akka.event.LoggingAdapter))​([Sec$minusWebSocket$minusKey](../../../scaladsl/model/headers/Sec$minusWebSocket$minusKey.html "class in akka.http.scaladsl.model.headers") key,  scala.util.Either<akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>,​java.lang.Object>,​akka.stream.Graph<akka.stream.FlowShape<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object>> handler,  scala.Option<java.lang.String> subprotocol,  [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` |  |
	| `akka.util.OptionVal<[UpgradeToWebSocketLowLevel](UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws")>` | `[websocketUpgrade](#websocketUpgrade(scala.collection.immutable.List,boolean,akka.http.scaladsl.settings.WebSocketSettings,akka.event.LoggingAdapter))​(scala.collection.immutable.List<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,  boolean hostHeaderPresent,  [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings,  akka.event.LoggingAdapter log)` | Validates a client WebSocket handshake. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Handshake.Server$](Handshake.Server$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Server$
		
		
		
		```
		public Server$()
		```

	- ### Method Detail
	
	
	
		- #### websocketUpgrade
		
		
		
		```
		public akka.util.OptionVal<[UpgradeToWebSocketLowLevel](UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws")> websocketUpgrade​(scala.collection.immutable.List<[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")> headers,
		                                                                        boolean hostHeaderPresent,
		                                                                        [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings,
		                                                                        akka.event.LoggingAdapter log)
		```
		
		Validates a client WebSocket handshake. Returns either `OptionVal.Some(UpgradeToWebSocketLowLevel)` or
		 `OptionVal.None`
		
		 From: http://tools.ietf.org/html/rfc6455\#section\-4\.2\.1
		 
		
		
		 1\. An HTTP/1\.1 or higher GET request, including a "Request\-URI"
		 \[RFC2616] that should be interpreted as a /resource name/
		 defined in Section 3 (or an absolute HTTP/HTTPS URI containing
		 the /resource name/).
		 
		
		
		 2\. A \|Host\| header field containing the server's authority.
		 
		
		
		 3\. An \|Upgrade\| header field containing the value "websocket",
		 treated as an ASCII case\-insensitive value.
		 
		
		
		 4\. A \|Connection\| header field that includes the token "Upgrade",
		 treated as an ASCII case\-insensitive value.
		 
		
		
		 5\. A \|Sec\-WebSocket\-Key\| header field with a base64\-encoded (see
		 Section 4 of \[RFC4648]) value that, when decoded, is 16 bytes in
		 length.
		 
		
		
		 6\. A \|Sec\-WebSocket\-Version\| header field, with a value of 13\.
		 
		
		
		 7\. Optionally, an \|Origin\| header field. This header field is sent
		 by all browser clients. A connection attempt lacking this
		 header field SHOULD NOT be interpreted as coming from a browser
		 client.
		 
		
		
		 8\. Optionally, a \|Sec\-WebSocket\-Protocol\| header field, with a list
		 of values indicating which protocols the client would like to
		 speak, ordered by preference.
		 
		
		
		 9\. Optionally, a \|Sec\-WebSocket\-Extensions\| header field, with a
		 list of values indicating which extensions the client would like
		 to speak. The interpretation of this header field is discussed
		 in Section 9\.1\.
		 
		
		
		 10\. Optionally, other header fields, such as those used to send
		 cookies or request authentication to a server. Unknown header
		 fields are ignored, as per \[RFC2616].
		
		
		
		Parameters:
		`headers` \- (undocumented)
		`hostHeaderPresent` \- (undocumented)
		`settings` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### buildResponse
		
		
		
		```
		public [HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") buildResponse​([Sec$minusWebSocket$minusKey](../../../scaladsl/model/headers/Sec$minusWebSocket$minusKey.html "class in akka.http.scaladsl.model.headers") key,
		                                  scala.util.Either<akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>,​java.lang.Object>,​akka.stream.Graph<akka.stream.FlowShape<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object>> handler,
		                                  scala.Option<java.lang.String> subprotocol,
		                                  [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings,
		                                  akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.Server$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/headers/Sec$minusWebSocket$minusKey.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.Server$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/Handshake.Server$.html)*