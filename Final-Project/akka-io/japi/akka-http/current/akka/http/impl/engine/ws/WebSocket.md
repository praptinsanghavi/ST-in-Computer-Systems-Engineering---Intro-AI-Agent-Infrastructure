---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocket.html
title: WebSocket
---

# WebSocket

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class WebSocket

- java.lang.Object
- - akka.http.impl.engine.ws.WebSocket

- ---

```
public class WebSocket
extends java.lang.Object
```

INTERNAL API
 
 Defines components of the websocket stack.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[WebSocket.Tick$](WebSocket.Tick$.html "class in akka.http.impl.engine.ws")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WebSocket](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.BidiFlow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[frameHandling](#frameHandling(boolean,scala.concurrent.duration.FiniteDuration,akka.event.LoggingAdapter))​(boolean serverSide,  scala.concurrent.duration.FiniteDuration closeTimeout,  akka.event.LoggingAdapter log)` | The layer that implements all low\-level frame handling, like handling control frames, collecting messages  from frames, decoding text messages, close handling, etc. |
	| `static akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString,​akka.NotUsed>` | `[framing](#framing())()` | The lowest layer that implements the binary protocol |
	| `static akka.stream.scaladsl.BidiFlow<[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​java.lang.Object,​java.lang.Object,​akka.NotUsed>` | `[idleTimeout](#idleTimeout(akka.http.scaladsl.settings.WebSocketSettings))​([WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings)` | The layer that transparently monitors data flow in both directions and fails the flow  with `StreamIdleTimeoutException` if elements are not passed within configured time. |
	| `static akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[masking](#masking(boolean,scala.Function0))​(boolean serverSide,  scala.Function0<java.util.Random> maskingRandomFactory)` | The layer that handles masking using the rules defined in the specification |
	| `static akka.stream.scaladsl.BidiFlow<[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object,​akka.NotUsed>` | `[messageAPI](#messageAPI(boolean,scala.concurrent.duration.FiniteDuration))​(boolean serverSide,  scala.concurrent.duration.FiniteDuration closeTimeout)` | The layer that provides the high\-level user facing API on top of frame handling. |
	| `static akka.stream.scaladsl.BidiFlow<[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​java.lang.Object,​java.lang.Object,​akka.NotUsed>` | `[periodicKeepAlive](#periodicKeepAlive(akka.http.scaladsl.settings.WebSocketSettings))​([WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings)` | The layer that transparently injects (if enabled) keepAlive Ping or Pong messages when connection is idle |
	| `static akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[stack](#stack(boolean,akka.http.scaladsl.settings.WebSocketSettings,scala.concurrent.duration.FiniteDuration,akka.event.LoggingAdapter))​(boolean serverSide,  [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,  scala.concurrent.duration.FiniteDuration closeTimeout,  akka.event.LoggingAdapter log)` | A stack of all the higher WS layers between raw frames and the user API. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### WebSocket
		
		
		
		```
		public WebSocket()
		```

	- ### Method Detail
	
	
	
		- #### stack
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> stack​(boolean serverSide,
		                                                                                                                              [WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") websocketSettings,
		                                                                                                                              scala.concurrent.duration.FiniteDuration closeTimeout,
		                                                                                                                              akka.event.LoggingAdapter log)
		```
		
		A stack of all the higher WS layers between raw frames and the user API.
		
		Parameters:
		`serverSide` \- (undocumented)
		`websocketSettings` \- (undocumented)
		`closeTimeout` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### framing
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<akka.util.ByteString,​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.util.ByteString,​akka.NotUsed> framing()
		```
		
		The lowest layer that implements the binary protocol
		- #### masking
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> masking​(boolean serverSide,
		                                                                                                                                             scala.Function0<java.util.Random> maskingRandomFactory)
		```
		
		The layer that handles masking using the rules defined in the specification
		- #### periodicKeepAlive
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​java.lang.Object,​java.lang.Object,​akka.NotUsed> periodicKeepAlive​([WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		The layer that transparently injects (if enabled) keepAlive Ping or Pong messages when connection is idle
		- #### idleTimeout
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​java.lang.Object,​java.lang.Object,​akka.NotUsed> idleTimeout​([WebSocketSettings](../../../scaladsl/settings/WebSocketSettings.html "class in akka.http.scaladsl.settings") settings)
		```
		
		The layer that transparently monitors data flow in both directions and fails the flow
		 with `StreamIdleTimeoutException` if elements are not passed within configured time.
		
		Parameters:
		`settings` \- (undocumented)
		Returns:
		(undocumented)
		- #### frameHandling
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed> frameHandling​(boolean serverSide,
		                                                                                                                                                                  scala.concurrent.duration.FiniteDuration closeTimeout,
		                                                                                                                                                                  akka.event.LoggingAdapter log)
		```
		
		The layer that implements all low\-level frame handling, like handling control frames, collecting messages
		 from frames, decoding text messages, close handling, etc.
		
		Parameters:
		`serverSide` \- (undocumented)
		`closeTimeout` \- (undocumented)
		`log` \- (undocumented)
		Returns:
		(undocumented)
		- #### messageAPI
		
		
		
		```
		public static akka.stream.scaladsl.BidiFlow<[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​java.lang.Object,​akka.NotUsed> messageAPI​(boolean serverSide,
		                                                                                                                                                  scala.concurrent.duration.FiniteDuration closeTimeout)
		```
		
		The layer that provides the high\-level user facing API on top of frame handling.
		
		Parameters:
		`serverSide` \- (undocumented)
		`closeTimeout` \- (undocumented)
		Returns:
		(undocumented)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.Output.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocket.Tick$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/settings/WebSocketSettings.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocket.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/WebSocket.html)*