---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
title: FrameEvent
---

# FrameEvent

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Interface FrameEvent

- All Superinterfaces:
`[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws")`

All Known Implementing Classes:
`[FrameData](FrameData.html "class in akka.http.impl.engine.ws")`, `[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws")`

---

```
public interface FrameEvent
extends [FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws")
```

The low\-level WebSocket framing model.
 
 INTERNAL API

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `akka.util.ByteString` | `[data](#data())()` |  |
	| `boolean` | `[lastPart](#lastPart())()` |  |
	| `[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws")` | `[withData](#withData(akka.util.ByteString))​(akka.util.ByteString data)` |  |

- - ### Method Detail
	
	
	
		- #### data
		
		
		
		```
		akka.util.ByteString data()
		```
		- #### lastPart
		
		
		
		```
		boolean lastPart()
		```
		- #### withData
		
		
		
		```
		[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws") withData​(akka.util.ByteString data)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameData.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html)*