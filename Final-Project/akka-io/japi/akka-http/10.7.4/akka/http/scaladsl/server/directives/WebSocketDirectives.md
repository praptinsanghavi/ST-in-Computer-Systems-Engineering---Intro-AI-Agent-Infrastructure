---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:09:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/WebSocketDirectives.html
title: WebSocketDirectives
---

# WebSocketDirectives

## Content

Package [akka.http.scaladsl.server.directives](package-summary.html)
## Interface WebSocketDirectives

- All Known Subinterfaces:
`[Directives](../Directives.html "interface in akka.http.scaladsl.server")`

All Known Implementing Classes:
`[Directives$](../Directives$.html "class in akka.http.scaladsl.server")`, `[HttpApp](../HttpApp.html "class in akka.http.scaladsl.server")`

---

```
public interface WebSocketDirectives
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.Seq<java.lang.String>>>` | `[extractOfferedWsProtocols](#extractOfferedWsProtocols())()` | Extract the list of WebSocket subprotocols as offered by the client in the {@link Sec\-WebSocket\-Protocol} header if  this is a WebSocket request. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[UpgradeToWebSocket](../../model/ws/UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws")>>` | `[extractUpgradeToWebSocket](#extractUpgradeToWebSocket())()` | Deprecated. use \`extractWebSocketUpgrade\` instead. |
	| `[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[WebSocketUpgrade](../../model/ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")>>` | `[extractWebSocketUpgrade](#extractWebSocketUpgrade())()` | Extract the WebSocketUpgrade attribute if this is a WebSocket request. |
	| `scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[handleWebSocketMessages](#handleWebSocketMessages(akka.stream.scaladsl.Flow))​(akka.stream.scaladsl.Flow<[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> handler)` | Handles WebSocket requests with the given handler and rejects other requests with an  `ExpectedWebSocketRequestRejection`. |
	| `scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[handleWebSocketMessagesForOptionalProtocol](#handleWebSocketMessagesForOptionalProtocol(akka.stream.scaladsl.Flow,scala.Option))​(akka.stream.scaladsl.Flow<[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> handler,  scala.Option<java.lang.String> subprotocol)` | Handles WebSocket requests with the given handler and rejects other requests with an  `ExpectedWebSocketRequestRejection`. |
	| `scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>>` | `[handleWebSocketMessagesForProtocol](#handleWebSocketMessagesForProtocol(akka.stream.scaladsl.Flow,java.lang.String))​(akka.stream.scaladsl.Flow<[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> handler,  java.lang.String subprotocol)` | Handles WebSocket requests with the given handler if the given subprotocol is offered in the request and  rejects other requests with an `ExpectedWebSocketRequestRejection` or an `UnsupportedWebSocketSubprotocolRejection`. |

- - ### Method Detail
	
	
	
		- #### extractOfferedWsProtocols
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<scala.collection.immutable.Seq<java.lang.String>>> extractOfferedWsProtocols()
		```
		
		Extract the list of WebSocket subprotocols as offered by the client in the {@link Sec\-WebSocket\-Protocol} header if
		 this is a WebSocket request. Rejects with an `ExpectedWebSocketRequestRejection`, otherwise.
		 
		
		Returns:
		(undocumented)
		- #### extractUpgradeToWebSocket
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[UpgradeToWebSocket](../../model/ws/UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws")>> extractUpgradeToWebSocket()
		```
		
		Deprecated.
		use \`extractWebSocketUpgrade\` instead. Since 10\.2\.0\.
		
		Extract the `UpgradeToWebSocket` header if existent. Rejects with an `ExpectedWebSocketRequestRejection`, otherwise.
		 
		
		Returns:
		(undocumented)
		- #### extractWebSocketUpgrade
		
		
		
		```
		[Directive](../Directive.html "class in akka.http.scaladsl.server")<scala.Tuple1<[WebSocketUpgrade](../../model/ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")>> extractWebSocketUpgrade()
		```
		
		Extract the WebSocketUpgrade attribute if this is a WebSocket request.
		 Rejects with an `ExpectedWebSocketRequestRejection`, otherwise.
		 
		
		Returns:
		(undocumented)
		- #### handleWebSocketMessages
		
		
		
		```
		scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> handleWebSocketMessages​(akka.stream.scaladsl.Flow<[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> handler)
		```
		
		Handles WebSocket requests with the given handler and rejects other requests with an
		 `ExpectedWebSocketRequestRejection`.
		 
		
		Parameters:
		`handler` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleWebSocketMessagesForOptionalProtocol
		
		
		
		```
		scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> handleWebSocketMessagesForOptionalProtocol​(akka.stream.scaladsl.Flow<[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> handler,
		                                                                                                                      scala.Option<java.lang.String> subprotocol)
		```
		
		Handles WebSocket requests with the given handler and rejects other requests with an
		 `ExpectedWebSocketRequestRejection`.
		 
		 If the `subprotocol` parameter is None any WebSocket request is accepted. If the `subprotocol` parameter is
		 `Some(protocol)` a WebSocket request is only accepted if the list of subprotocols supported by the client (as
		 announced in the WebSocket request) contains `protocol`. If the client did not offer the protocol in question
		 the request is rejected with an `UnsupportedWebSocketSubprotocolRejection` rejection.
		 
		
		
		 To support several subprotocols you may chain several `handleWebSocketMessagesForOptionalProtocol` routes.
		 
		
		
		
		Parameters:
		`handler` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)
		- #### handleWebSocketMessagesForProtocol
		
		
		
		```
		scala.Function1<[RequestContext](../RequestContext.html "interface in akka.http.scaladsl.server"),​scala.concurrent.Future<[RouteResult](../RouteResult.html "interface in akka.http.scaladsl.server")>> handleWebSocketMessagesForProtocol​(akka.stream.scaladsl.Flow<[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object> handler,
		                                                                                                              java.lang.String subprotocol)
		```
		
		Handles WebSocket requests with the given handler if the given subprotocol is offered in the request and
		 rejects other requests with an `ExpectedWebSocketRequestRejection` or an `UnsupportedWebSocketSubprotocolRejection`.
		 
		
		Parameters:
		`handler` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directive.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/Directives.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/HttpApp.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RequestContext.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/RouteResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/WebSocketDirectives.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/server/directives/WebSocketDirectives.html)*