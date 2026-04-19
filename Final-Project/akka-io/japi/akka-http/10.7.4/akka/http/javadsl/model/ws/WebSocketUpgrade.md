---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:05:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
title: WebSocketUpgrade
---

# WebSocketUpgrade

## Content

Package [akka.http.javadsl.model.ws](package-summary.html)
## Interface WebSocketUpgrade

- All Known Subinterfaces:
`[UpgradeToWebSocket](UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`, `[UpgradeToWebSocket](../../../scaladsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws")`, `[WebSocketUpgrade](../../../scaladsl/model/ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`

All Known Implementing Classes:
`[UpgradeToWebSocketLowLevel](../../../impl/engine/ws/UpgradeToWebSocketLowLevel.html "class in akka.http.impl.engine.ws")`

---

```
public interface WebSocketUpgrade
```

An attribute that WebSocket requests will contain. Use `WebSocketUpgrade.handleMessagesWith` to
 create a WebSocket handshake response and handle the WebSocket message stream with the given handler.
 
 This is a low\-level API. You might want to use `handleWebSocketMessages` instead as documented
 at https://doc.akka.io/libraries/akka\-http/current/server\-side/websocket\-support.html\#routing\-support

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.Iterable<java.lang.String>` | `[getRequestedProtocols](#getRequestedProtocols())()` | Returns the sequence of protocols the client accepts. |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph))​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "class in akka.http.javadsl.model.ws"),​[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow)` | Returns a response that can be used to answer a WebSocket handshake request. |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,java.lang.String))​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "class in akka.http.javadsl.model.ws"),​[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow,  java.lang.String subprotocol)` | Returns a response that can be used to answer a WebSocket handshake request. |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,akka.stream.Graph))​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)` | Returns a response that can be used to answer a WebSocket handshake request. |
	| `[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model")` | `[handleMessagesWith](#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,  akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource,  java.lang.String subprotocol)` | Returns a response that can be used to answer a WebSocket handshake request. |

- - ### Method Detail
	
	
	
		- #### getRequestedProtocols
		
		
		
		```
		java.lang.Iterable<java.lang.String> getRequestedProtocols()
		```
		
		Returns the sequence of protocols the client accepts.
		 
		 See http://tools.ietf.org/html/rfc6455\#section\-1\.9
		
		
		
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "class in akka.http.javadsl.model.ws"),​[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow)
		```
		
		Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
		 use the given handlerFlow to handle WebSocket messages from the client.
		
		Parameters:
		`handlerFlow` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.FlowShape<[Message](Message.html "class in akka.http.javadsl.model.ws"),​[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> handlerFlow,
		                                java.lang.String subprotocol)
		```
		
		Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
		 use the given handlerFlow to handle WebSocket messages from the client. The given subprotocol must be one
		 of the ones offered by the client.
		
		Parameters:
		`handlerFlow` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,
		                                akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource)
		```
		
		Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
		 use the given inSink to handle WebSocket messages from the client and the given outSource to send messages to the client.
		
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleMessagesWith
		
		
		
		```
		[HttpResponse](../HttpResponse.html "class in akka.http.javadsl.model") handleMessagesWith​(akka.stream.Graph<akka.stream.SinkShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> inSink,
		                                akka.stream.Graph<akka.stream.SourceShape<[Message](Message.html "class in akka.http.javadsl.model.ws")>,​?> outSource,
		                                java.lang.String subprotocol)
		```
		
		Returns a response that can be used to answer a WebSocket handshake request. The connection will afterwards
		 use the given inSink to handle WebSocket messages from the client and the given outSource to send messages to the client.
		 
		 The given subprotocol must be one of the ones offered by the client.
		
		
		
		Parameters:
		`inSink` \- (undocumented)
		`outSource` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html)*