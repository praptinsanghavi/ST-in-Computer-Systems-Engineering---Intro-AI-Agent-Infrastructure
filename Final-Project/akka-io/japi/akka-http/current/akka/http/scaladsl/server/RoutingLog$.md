---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T00:39:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog$.html
title: RoutingLog$
---

# RoutingLog$

## Content

Package [akka.http.scaladsl.server](package-summary.html)
## Class RoutingLog$

- java.lang.Object
- - [akka.http.scaladsl.server.LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html "class in akka.http.scaladsl.server")
	- - akka.http.scaladsl.server.RoutingLog$

- ---

```
public class RoutingLog$
extends [LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html "class in akka.http.scaladsl.server")
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RoutingLog$](RoutingLog$.html "class in akka.http.scaladsl.server")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RoutingLog$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server")` | `[apply](#apply(akka.event.LoggingAdapter))​(akka.event.LoggingAdapter defaultLog)` |  |
	| `[RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server")` | `[fromActorContext](#fromActorContext(akka.actor.ActorContext))​(akka.actor.ActorContext ac)` |  |
	
	
		- ### Methods inherited from class akka.http.scaladsl.server.[LowerPriorityRoutingLogImplicits](LowerPriorityRoutingLogImplicits.html "class in akka.http.scaladsl.server")
		
		
		`[fromActorSystem](LowerPriorityRoutingLogImplicits.html#fromActorSystem(akka.actor.ActorSystem))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RoutingLog$](RoutingLog$.html "class in akka.http.scaladsl.server") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RoutingLog$
		
		
		
		```
		public RoutingLog$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") apply​(akka.event.LoggingAdapter defaultLog)
		```
		- #### fromActorContext
		
		
		
		```
		public [RoutingLog](RoutingLog.html "interface in akka.http.scaladsl.server") fromActorContext​(akka.actor.ActorContext ac)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/LowerPriorityRoutingLogImplicits.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog$.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog.html
- https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog$.html](https://doc.akka.io/japi/akka-http/current/akka/http/scaladsl/server/RoutingLog$.html)*