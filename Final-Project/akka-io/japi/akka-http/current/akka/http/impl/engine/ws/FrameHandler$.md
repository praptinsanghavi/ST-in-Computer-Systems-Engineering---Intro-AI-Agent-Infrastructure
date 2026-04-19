---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler$.html
title: FrameHandler$
---

# FrameHandler$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameHandler$

- java.lang.Object
- - akka.http.impl.engine.ws.FrameHandler$

- ---

```
public class FrameHandler$
extends java.lang.Object
```

The frame handler validates frames, multiplexes data to the user handler or to the bypass and
 UTF\-8 decodes text frames.
 
 INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrameHandler$](FrameHandler$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[create](#create(boolean))​(boolean server)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrameHandler$](FrameHandler$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrameHandler$
		
		
		
		```
		public FrameHandler$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public akka.stream.scaladsl.Flow<[FrameEventOrError](FrameEventOrError.html "interface in akka.http.impl.engine.ws"),​[FrameHandler.Output](FrameHandler.Output.html "interface in akka.http.impl.engine.ws"),​akka.NotUsed> create​(boolean server)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameEventOrError.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler.Output.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameHandler$.html)*