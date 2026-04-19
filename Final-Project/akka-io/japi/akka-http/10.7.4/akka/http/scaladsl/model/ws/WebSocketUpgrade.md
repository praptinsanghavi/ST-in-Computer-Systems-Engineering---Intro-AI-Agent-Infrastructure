---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:11:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
title: WebSocketUpgrade
---

# WebSocketUpgrade

## Content

Package [akka.http.scaladsl.model.ws](package-summary.html)
## Interface WebSocketUpgrade

- All Superinterfaces:
`[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`

All Known Subinterfaces:
`[UpgradeToWebSocket](UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws")`

All Known Implementing Classes:
`[UpgradeToWebSocketLowLevel](../../../impl/engine/ws/UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws")`

---

```
public interface WebSocketUpgrade
extends [WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")
```

An attribute that will be added to an WebSocket upgrade HttpRequest that
 enables a request handler to upgrade this connection to a WebSocket connection and
 registers a WebSocket handler.
 
 This is a low\-level API. You might want to use `handleWebSocketMessages` instead as documented
 at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​akka.NotUsed>` | `[createScalaFlow](#createScalaFlow(akka.stream.Graph,akka.stream.Graph))​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)` | Java API |
	| `java.lang.Iterable<java.lang.String>` | `[getRequestedProtocols](#getRequestedProtocols())()` | Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessages](#handleMessages(akka.stream.Graph,scala.Option))​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> handlerFlow,  scala.Option<java.lang.String> subprotocol)` | The high\-level interface to create a WebSocket server based on "messages". |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph))​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow)` | Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,java.lang.String))​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow,  java.lang.String subprotocol)` | Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)` | Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource,  java.lang.String subprotocol)` | Java API |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleMessagesWithSinkSource](#handleMessagesWithSinkSource(akka.stream.Graph,akka.stream.Graph,scala.Option))​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> outSource,  scala.Option<java.lang.String> subprotocol)` | The high\-level interface to create a WebSocket server based on "messages". |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[requestedProtocols](#requestedProtocols())()` | A sequence of protocols the client accepts. |

- - ### Method Detail
	
	
	
		- #### createScalaFlow
		
		
		
		```
		akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​akka.NotUsed> createScalaFlow​(akka.stream.Graph<akka.stream.SinkShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,
		                                                                                                   akka.stream.Graph<akka.stream.SourceShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)
		```
		
		Java API
		
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		Returns:
		(undocumented)
		- #### getRequestedProtocols
		
		
		
		```
		java.lang.Iterable<java.lang.String> getRequestedProtocols()
		```
		
		Java API
		
		Specified by:
		`[getRequestedProtocols](../../../javadsl/model/ws/WebSocketUpgrade.html#getRequestedProtocols())` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Returns:
		(undocumented)
		- #### handleMessages
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessages​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](Message.html "interface in akka.http.scaladsl.model.ws")>,​java.lang.Object> handlerFlow,
		                            scala.Option<java.lang.String> subprotocol)
		```
		
		The high\-level interface to create a WebSocket server based on "messages".
		 
		 Returns a response to return in a request handler that will signal the
		 low\-level HTTP implementation to upgrade the connection to WebSocket and
		 use the supplied handler to handle incoming WebSocket messages.
		 
		
		
		 Optionally, a subprotocol out of the ones requested by the client can be chosen.
		
		
		
		Parameters:
		`handlerFlow` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow)
		```
		
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
		Parameters:
		`handlerFlow` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.scaladsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.FlowShape<[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws"),​[Message](../../../javadsl/model/ws/Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow,
		                                java.lang.String subprotocol)
		```
		
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,java.lang.String))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
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
		
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
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
		
		Java API
		
		Specified by:
		`[handleMessagesWith](../../../javadsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))` in interface `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`
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
		
		The high\-level interface to create a WebSocket server based on "messages".
		 
		 Returns a response to return in a request handler that will signal the
		 low\-level HTTP implementation to upgrade the connection to WebSocket and
		 use the supplied inSink to consume messages received from the client and
		 the supplied outSource to produce message to sent to the client.
		 
		
		
		 Optionally, a subprotocol out of the ones requested by the client can be chosen.
		
		
		
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
		
		A sequence of protocols the client accepts.
		 
		 See http://tools.ietf.org/html/rfc6455\#section\-1\.9
		
		
		
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html)*