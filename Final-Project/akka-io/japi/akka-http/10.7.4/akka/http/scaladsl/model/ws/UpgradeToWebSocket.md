---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
title: UpgradeToWebSocket
---

# UpgradeToWebSocket

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Interface UpgradeToWebSocket

- All Superinterfaces:
`[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`, `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`, `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`

All Known Implementing Classes:
`[UpgradeToWebSocketLowLevel](../../../impl/engine/ws/UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws")`

---

```
public interface UpgradeToWebSocket
extends [UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws"), [WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")
```

Deprecated.
This low\-level API has been replaced by an attribute. Since 10\.2\.0\.

A custom header that will be added to an WebSocket upgrade HttpRequest that
 enables a request handler to upgrade this connection to a WebSocket connection and
 registers a WebSocket handler.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​akka.NotUsed>` | `[createScalaFlow](#createScalaFlow(akka.stream.Graph,akka.stream.Graph))​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)` | Deprecated. Java API |
	| `java.lang.Iterable<java.lang.String>` | `[getRequestedProtocols](#getRequestedProtocols())()` | Deprecated. Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessages](#handleMessages(akka.stream.Graph,scala.Option))​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> handlerFlow,  scala.Option<java.lang.String> subprotocol)` | Deprecated. The high\-level interface to create a WebSocket server based on "messages". |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph))​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow)` | Deprecated. Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,java.lang.String))​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow,  java.lang.String subprotocol)` | Deprecated. Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)` | Deprecated. Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource,  java.lang.String subprotocol)` | Deprecated. Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWithSinkSource](#handleMessagesWithSinkSource(akka.stream.Graph,akka.stream.Graph,scala.Option))​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> outSource,  scala.Option<java.lang.String> subprotocol)` | Deprecated. The high\-level interface to create a WebSocket server based on "messages". |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[requestedProtocols](#requestedProtocols())()` | Deprecated. A sequence of protocols the client accepts. |

- - ### Method Detail
	
	
	
		- #### createScalaFlow
		
		
		
		```
		akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​akka.NotUsed> createScalaFlow​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,
		                                                                                                   akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)
		```
		
		Deprecated.
		Java API
		
		Specified by:
		`[createScalaFlow](WebSocketUpgrade.html#createScalaFlow(akka.stream.Graph,akka.stream.Graph))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		Returns:
		(undocumented)
		- #### getRequestedProtocols
		
		
		
		```
		java.lang.Iterable<java.lang.String> getRequestedProtocols()
		```
		
		Deprecated.
		Java API
		
		Specified by:
		`[getRequestedProtocols](../../../javadsl/model/ws/UpgradeToWebSocket.html#getRequestedProtocols())` in interface `[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[getRequestedProtocols](../../../javadsl/model/ws/WebSocketUpgrade.html#getRequestedProtocols())` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[getRequestedProtocols](WebSocketUpgrade.html#getRequestedProtocols())` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Returns:
		(undocumented)
		- #### handleMessages
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessages​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> handlerFlow,
		                            scala.Option<java.lang.String> subprotocol)
		```
		
		Deprecated.
		The high\-level interface to create a WebSocket server based on "messages".
		 
		 Returns a response to return in a request handler that will signal the
		 low\-level HTTP implementation to upgrade the connection to WebSocket and
		 use the supplied handler to handle incoming WebSocket messages.
		 
		
		
		 Optionally, a subprotocol out of the ones requested by the client can be chosen.
		
		
		
		Specified by:
		`[handleMessages](WebSocketUpgrade.html#handleMessages(akka.stream.Graph,scala.Option))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`handlerFlow` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow)
		```
		
		Deprecated.
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph))` in interface `[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`handlerFlow` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow,
		                                java.lang.String subprotocol)
		```
		
		Deprecated.
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph,java.lang.String))` in interface `[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,java.lang.String))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,java.lang.String))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`handlerFlow` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,
		                                akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)
		```
		
		Deprecated.
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))` in interface `[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,
		                                akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource,
		                                java.lang.String subprotocol)
		```
		
		Deprecated.
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))` in interface `[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Specified by:
		`[handleMessagesWith](WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWithSinkSource
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWithSinkSource​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> inSink,
		                                          akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> outSource,
		                                          scala.Option<java.lang.String> subprotocol)
		```
		
		Deprecated.
		The high\-level interface to create a WebSocket server based on "messages".
		 
		 Returns a response to return in a request handler that will signal the
		 low\-level HTTP implementation to upgrade the connection to WebSocket and
		 use the supplied inSink to consume messages received from the client and
		 the supplied outSource to produce message to sent to the client.
		 
		
		
		 Optionally, a subprotocol out of the ones requested by the client can be chosen.
		
		
		
		Specified by:
		`[handleMessagesWithSinkSource](WebSocketUpgrade.html#handleMessagesWithSinkSource(akka.stream.Graph,akka.stream.Graph,scala.Option))` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### requestedProtocols
		
		
		
		```
		scala.collection.immutable.Seq<java.lang.String> requestedProtocols()
		```
		
		Deprecated.
		A sequence of protocols the client accepts.
		 
		 See http://tools.ietf.org/html/rfc6455\#section\-1\.9
		
		
		
		Specified by:
		`[requestedProtocols](WebSocketUpgrade.html#requestedProtocols())` in interface `[WebSocketUpgrade](WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html)*