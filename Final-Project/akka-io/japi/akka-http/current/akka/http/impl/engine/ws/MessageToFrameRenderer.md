---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer.html
title: MessageToFrameRenderer
---

# MessageToFrameRenderer

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class MessageToFrameRenderer

- java.lang.Object
- - akka.http.impl.engine.ws.MessageToFrameRenderer

- ---

```
public class MessageToFrameRenderer
extends java.lang.Object
```

Renders messages to full frames.
 
 INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageToFrameRenderer](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.stream.scaladsl.Flow<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[create](#create(boolean))​(boolean serverSide)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MessageToFrameRenderer
		
		
		
		```
		public MessageToFrameRenderer()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static akka.stream.scaladsl.Flow<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed> create​(boolean serverSide)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer.html)*