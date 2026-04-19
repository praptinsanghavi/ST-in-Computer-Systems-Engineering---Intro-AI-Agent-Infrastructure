---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer$.html
title: MessageToFrameRenderer$
---

# MessageToFrameRenderer$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class MessageToFrameRenderer$

- java.lang.Object
- - akka.http.impl.engine.ws.MessageToFrameRenderer$

- ---

```
public class MessageToFrameRenderer$
extends java.lang.Object
```

Renders messages to full frames.
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MessageToFrameRenderer$](MessageToFrameRenderer$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MessageToFrameRenderer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[create](#create(boolean))​(boolean serverSide)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MessageToFrameRenderer$](MessageToFrameRenderer$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MessageToFrameRenderer$
		
		
		
		```
		public MessageToFrameRenderer$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public akka.stream.scaladsl.Flow<[Message](../../../scaladsl/model/ws/Message.html "interface in akka.http.scaladsl.model.ws"),​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed> create​(boolean serverSide)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/model/ws/Message.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/MessageToFrameRenderer$.html)*