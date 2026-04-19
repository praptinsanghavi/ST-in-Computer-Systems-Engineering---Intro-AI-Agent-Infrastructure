---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:35:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogMarker.html
title: ActorLogMarker
---

# ActorLogMarker

## Content

Package [akka.actor](package-summary.html)
## Class ActorLogMarker

- java.lang.Object
- - akka.actor.ActorLogMarker

- ---

```
public class ActorLogMarker
extends java.lang.Object
```

This is public with the purpose to document the used markers and properties of log events.
 No guarantee that it will remain binary compatible, but the marker names and properties
 are considered public API and will not be changed without notice.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorLogMarker](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [LogMarker](../event/LogMarker.html "class in akka.event")` | `[deadLetter](#deadLetter(java.lang.String))​(java.lang.String messageClass)` | Marker "akkaDeadLetter" of log event for dead letter messages. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ActorLogMarker
		
		
		
		```
		public ActorLogMarker()
		```

	- ### Method Detail
	
	
	
		- #### deadLetter
		
		
		
		```
		public static [LogMarker](../event/LogMarker.html "class in akka.event") deadLetter​(java.lang.String messageClass)
		```
		
		Marker "akkaDeadLetter" of log event for dead letter messages.
		 
		
		Parameters:
		`messageClass` \- The message class of the DeadLetter. Included as property "akkaMessageClass".

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/LogMarker.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogMarker.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorLogMarker.html)*