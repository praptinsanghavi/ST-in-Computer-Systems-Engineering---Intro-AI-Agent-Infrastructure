---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:36Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameLogger$.html
title: FrameLogger$
---

# FrameLogger$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameLogger$

- java.lang.Object
- - akka.http.impl.engine.ws.FrameLogger$

- ---

```
public class FrameLogger$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrameLogger$](FrameLogger$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameLogger$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.BidiFlow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[bidi](#bidi())()` |  |
	| `java.lang.String` | `[logEvent](#logEvent(akka.http.impl.engine.ws.FrameEventOrError))​([FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws") frameEvent)` |  |
	| `akka.stream.scaladsl.BidiFlow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[logFramesIfEnabled](#logFramesIfEnabled(boolean))​(boolean shouldLog)` |  |
	| `int` | `[maxBytes](#maxBytes())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrameLogger$](FrameLogger$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrameLogger$
		
		
		
		```
		public FrameLogger$()
		```

	- ### Method Detail
	
	
	
		- #### maxBytes
		
		
		
		```
		public final int maxBytes()
		```
		- #### logFramesIfEnabled
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> logFramesIfEnabled​(boolean shouldLog)
		```
		- #### bidi
		
		
		
		```
		public akka.stream.scaladsl.BidiFlow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​[FrameEvent](FrameEvent.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> bidi()
		```
		- #### logEvent
		
		
		
		```
		public java.lang.String logEvent​([FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws") frameEvent)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEvent.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameLogger$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameLogger$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameLogger$.html)*