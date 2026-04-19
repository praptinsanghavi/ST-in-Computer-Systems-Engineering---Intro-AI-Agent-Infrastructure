---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:33:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler$.html
title: FrameOutHandler$
---

# FrameOutHandler$

## Content

Package [akka.http.impl.engine.ws](package-summary.html)
## Class FrameOutHandler$

- java.lang.Object
- - akka.http.impl.engine.ws.FrameOutHandler$

- ---

```
public class FrameOutHandler$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [FrameOutHandler$](FrameOutHandler$.html "class in akka.http.impl.engine.ws")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FrameOutHandler$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.stream.scaladsl.Flow<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed>` | `[create](#create(boolean,scala.concurrent.duration.FiniteDuration,akka.event.LoggingAdapter))​(boolean serverSide,  scala.concurrent.duration.FiniteDuration closeTimeout,  akka.event.LoggingAdapter log)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [FrameOutHandler$](FrameOutHandler$.html "class in akka.http.impl.engine.ws") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FrameOutHandler$
		
		
		
		```
		public FrameOutHandler$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public akka.stream.scaladsl.Flow<java.lang.Object,​[FrameStart](FrameStart.html "class in akka.http.impl.engine.ws"),​akka.NotUsed> create​(boolean serverSide,
		                                                                                              scala.concurrent.duration.FiniteDuration closeTimeout,
		                                                                                              akka.event.LoggingAdapter log)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameStart.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/ws/FrameOutHandler$.html)*