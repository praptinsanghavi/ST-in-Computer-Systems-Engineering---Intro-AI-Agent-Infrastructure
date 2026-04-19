---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:19:06Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStreamUnsubscriber$.html
title: EventStreamUnsubscriber$
---

# EventStreamUnsubscriber$

## Content

Package [akka.event](package-summary.html)
## Class EventStreamUnsubscriber$

- java.lang.Object
- - akka.event.EventStreamUnsubscriber$

- ---

```
public class EventStreamUnsubscriber$
extends java.lang.Object
```

INTERNAL API
 
 Provides factory for `EventStreamUnsubscriber` actors with \*\*unique names\*\*.
 This is needed if someone spins up more [`EventStream`](EventStream.html "class in akka.event")s using the same [`ActorSystem`](../actor/ActorSystem.html "class in akka.actor"),
 each stream gets it's own unsubscriber.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventStreamUnsubscriber$](EventStreamUnsubscriber$.html "class in akka.event")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventStreamUnsubscriber$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[start](#start(akka.actor.ActorSystem,akka.event.EventStream))​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,  [EventStream](EventStream.html "class in akka.event") stream)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventStreamUnsubscriber$](EventStreamUnsubscriber$.html "class in akka.event") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventStreamUnsubscriber$
		
		
		
		```
		public EventStreamUnsubscriber$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public boolean $lessinit$greater$default$2()
		```
		- #### start
		
		
		
		```
		public [ActorRef](../actor/ActorRef.html "class in akka.actor") start​([ActorSystem](../actor/ActorSystem.html "class in akka.actor") system,
		                      [EventStream](EventStream.html "class in akka.event") stream)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStreamUnsubscriber$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/event/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStreamUnsubscriber$.html](https://doc.akka.io/japi/akka-core/2.10/akka/event/EventStreamUnsubscriber$.html)*