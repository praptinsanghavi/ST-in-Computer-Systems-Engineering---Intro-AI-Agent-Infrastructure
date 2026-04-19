---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:28:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html
title: UpgradeToWebSocketLowLevel
---

# UpgradeToWebSocketLowLevel

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class UpgradeToWebSocketLowLevel

- java.lang.Object
- - [akka.http.javadsl.model.HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
	- - [akka.http.scaladsl.model.HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		- - [akka.http.javadsl.model.headers.CustomHeader](../../../javadsl/model/headers/CustomHeader.html "class in akka.http.javadsl.model.headers")
			- - [akka.http.scaladsl.model.headers.CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
				- - [akka.http.impl.engine.server.InternalCustomHeader](../server/InternalCustomHeader.html "class in akka.http.impl.engine.server")
					- - akka.http.impl.engine.ws.UpgradeToWebSocketLowLevel

- All Implemented Interfaces:
`[Renderable](../../util/Renderable.html "interface in akka.http.impl.util")`, `[ToStringRenderable](../../util/ToStringRenderable.html "interface in akka.http.impl.util")`, `[UpgradeToWebSocket](../../../javadsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.javadsl.model.ws")`, `[WebSocketUpgrade](../../../javadsl/model/ws/WebSocketUpgrade.html "interface in akka.http.javadsl.model.ws")`, `[UpgradeToWebSocket](../../../scaladsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws")`, `[WebSocketUpgrade](../../../scaladsl/model/ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")`

---

```
public abstract class UpgradeToWebSocketLowLevel
extends [InternalCustomHeader](../server/InternalCustomHeader.html "class in akka.http.impl.engine.server")
implements [UpgradeToWebSocket](../../../scaladsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws"), [WebSocketUpgrade](../../../scaladsl/model/ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")
```

Currently internal API to handle FrameEvents directly.
 
 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[HttpHeader.ParsingResult](../../../scaladsl/model/HttpHeader.ParsingResult.html "interface in akka.http.scaladsl.model"), [HttpHeader.ParsingResult$](../../../scaladsl/model/HttpHeader.ParsingResult$.html "class in akka.http.scaladsl.model")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UpgradeToWebSocketLowLevel](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model")` | `[handleFrames](#handleFrames(akka.stream.Graph,scala.Option))​(akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>,​java.lang.Object> handlerFlow,  scala.Option<java.lang.String> subprotocol)` | The low\-level interface to create WebSocket server based on "frames". |
	
	
		- ### Methods inherited from class akka.http.impl.engine.server.[InternalCustomHeader](../server/InternalCustomHeader.html "class in akka.http.impl.engine.server")
		
		
		`[name](../server/InternalCustomHeader.html#name()), [renderInRequests](../server/InternalCustomHeader.html#renderInRequests()), [renderInResponses](../server/InternalCustomHeader.html#renderInResponses()), [value](../server/InternalCustomHeader.html#value())`
		- ### Methods inherited from class akka.http.scaladsl.model.headers.[CustomHeader](../../../scaladsl/model/headers/CustomHeader.html "class in akka.http.scaladsl.model.headers")
		
		
		`[lowercaseName](../../../scaladsl/model/headers/CustomHeader.html#lowercaseName()), [render](../../../scaladsl/model/headers/CustomHeader.html#render(R))`
		- ### Methods inherited from class akka.http.scaladsl.model.[HttpHeader](../../../scaladsl/model/HttpHeader.html "class in akka.http.scaladsl.model")
		
		
		`[fastFind](../../../scaladsl/model/HttpHeader.html#fastFind(java.lang.Class,scala.collection.immutable.Seq)), [is](../../../scaladsl/model/HttpHeader.html#is(java.lang.String)), [isNot](../../../scaladsl/model/HttpHeader.html#isNot(java.lang.String)), [parse](../../../scaladsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String,akka.http.impl.model.parser.HeaderParser.Settings)), [unapply](../../../scaladsl/model/HttpHeader.html#unapply(akka.http.scaladsl.model.HttpHeader)), [unsafeToString](../../../scaladsl/model/HttpHeader.html#unsafeToString())`
		- ### Methods inherited from class akka.http.javadsl.model.[HttpHeader](../../../javadsl/model/HttpHeader.html "class in akka.http.javadsl.model")
		
		
		`[parse](../../../javadsl/model/HttpHeader.html#parse(java.lang.String,java.lang.String))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.http.impl.util.[ToStringRenderable](../../util/ToStringRenderable.html "interface in akka.http.impl.util")
		
		
		`[toString](../../util/ToStringRenderable.html#toString())`
		- ### Methods inherited from interface akka.http.scaladsl.model.ws.[UpgradeToWebSocket](../../../scaladsl/model/ws/UpgradeToWebSocket.html "interface in akka.http.scaladsl.model.ws")
		
		
		`[createScalaFlow](../../../scaladsl/model/ws/UpgradeToWebSocket.html#createScalaFlow(akka.stream.Graph,akka.stream.Graph)), [getRequestedProtocols](../../../scaladsl/model/ws/UpgradeToWebSocket.html#getRequestedProtocols()), [handleMessages](../../../scaladsl/model/ws/UpgradeToWebSocket.html#handleMessages(akka.stream.Graph,scala.Option)), [handleMessagesWith](../../../scaladsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph)), [handleMessagesWith](../../../scaladsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph,java.lang.String)), [handleMessagesWith](../../../scaladsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph)), [handleMessagesWith](../../../scaladsl/model/ws/UpgradeToWebSocket.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String)), [handleMessagesWithSinkSource](../../../scaladsl/model/ws/UpgradeToWebSocket.html#handleMessagesWithSinkSource(akka.stream.Graph,akka.stream.Graph,scala.Option)), [requestedProtocols](../../../scaladsl/model/ws/UpgradeToWebSocket.html#requestedProtocols())`
		- ### Methods inherited from interface akka.http.scaladsl.model.ws.[WebSocketUpgrade](../../../scaladsl/model/ws/WebSocketUpgrade.html "interface in akka.http.scaladsl.model.ws")
		
		
		`[getRequestedProtocols](../../../scaladsl/model/ws/WebSocketUpgrade.html#getRequestedProtocols()), [handleMessagesWith](../../../scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph)), [handleMessagesWith](../../../scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,java.lang.String)), [handleMessagesWith](../../../scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph)), [handleMessagesWith](../../../scaladsl/model/ws/WebSocketUpgrade.html#handleMessagesWith(akka.stream.Graph,akka.stream.Graph,java.lang.String))`

- - ### Constructor Detail
	
	
	
		- #### UpgradeToWebSocketLowLevel
		
		
		
		```
		public UpgradeToWebSocketLowLevel()
		```

	- ### Method Detail
	
	
	
		- #### handleFrames
		
		
		
		```
		public abstract [HttpResponse](../../../scaladsl/model/HttpResponse.html "class in akka.http.scaladsl.model") handleFrames​(akka.stream.Graph<akka.stream.FlowShape<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")>,​java.lang.Object> handlerFlow,
		                                          scala.Option<java.lang.String> subprotocol)
		```
		
		The low\-level interface to create WebSocket server based on "frames".
		 The user needs to handle control frames manually in this case.
		 
		 Returns a response to return in a request handler that will signal the
		 low\-level HTTP implementation to upgrade the connection to WebSocket and
		 use the supplied handler to handle incoming WebSocket frames.
		 
		
		
		 INTERNAL API (for now)
		
		
		
		Parameters:
		`handlerFlow` \- (undocumented)
		`subprotocol` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/server/InternalCustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/Renderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/util/ToStringRenderable.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/javadsl/model/ws/WebSocketUpgrade.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult$.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.ParsingResult.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/HttpResponse.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/headers/CustomHeader.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/UpgradeToWebSocket.html
- https://doc.akka.io/japi/akka-http/10.7.4/akka/http/scaladsl/model/ws/WebSocketUpgrade.html

---
*Source: [https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html](https://doc.akka.io/japi/akka-http/10.7.4/akka/http/impl/engine/ws/UpgradeToWebSocketLowLevel.html)*