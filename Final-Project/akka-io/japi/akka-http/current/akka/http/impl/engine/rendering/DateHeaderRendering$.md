---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T23:32:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering$.html
title: DateHeaderRendering$
---

# DateHeaderRendering$

## Content

Package [akka.http.impl.engine.rendering](package-summary.html)
## Class DateHeaderRendering$

- java.lang.Object
- - akka.http.impl.engine.rendering.DateHeaderRendering$

- ---

```
public class DateHeaderRendering$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DateHeaderRendering$](DateHeaderRendering$.html "class in akka.http.impl.engine.rendering")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DateHeaderRendering$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[DateHeaderRendering](DateHeaderRendering.html "interface in akka.http.impl.engine.rendering")` | `[apply](#apply(akka.actor.Scheduler,scala.Function0,scala.concurrent.ExecutionContext))​(akka.actor.Scheduler scheduler,  scala.Function0<java.lang.Object> now,  scala.concurrent.ExecutionContext ec)` |  |
	| `[DateHeaderRendering](DateHeaderRendering.html "interface in akka.http.impl.engine.rendering")` | `[apply](#apply(scala.Function0,akka.actor.ClassicActorSystemProvider))​(scala.Function0<java.lang.Object> now,  akka.actor.ClassicActorSystemProvider system)` |  |
	| `java.lang.Object` | `[Unavailable](#Unavailable())()` | Date has not been used for a while |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DateHeaderRendering$](DateHeaderRendering$.html "class in akka.http.impl.engine.rendering") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DateHeaderRendering$
		
		
		
		```
		public DateHeaderRendering$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [DateHeaderRendering](DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") apply​(scala.Function0<java.lang.Object> now,
		                                 akka.actor.ClassicActorSystemProvider system)
		```
		- #### apply
		
		
		
		```
		public [DateHeaderRendering](DateHeaderRendering.html "interface in akka.http.impl.engine.rendering") apply​(akka.actor.Scheduler scheduler,
		                                 scala.Function0<java.lang.Object> now,
		                                 scala.concurrent.ExecutionContext ec)
		```
		- #### Unavailable
		
		
		
		```
		public java.lang.Object Unavailable()
		```
		
		Date has not been used for a while

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering.html
- https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering$.html](https://doc.akka.io/japi/akka-http/current/akka/http/impl/engine/rendering/DateHeaderRendering$.html)*