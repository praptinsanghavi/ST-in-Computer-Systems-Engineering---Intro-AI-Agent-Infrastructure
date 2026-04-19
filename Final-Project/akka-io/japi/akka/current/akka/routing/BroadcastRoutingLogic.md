---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/BroadcastRoutingLogic.html
title: BroadcastRoutingLogic
---

# BroadcastRoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Class BroadcastRoutingLogic

- java.lang.Object
- - akka.routing.BroadcastRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`

---

```
public final class BroadcastRoutingLogic
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.routing")
```

Broadcasts a message to all its routees.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BroadcastRoutingLogic](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [BroadcastRoutingLogic](BroadcastRoutingLogic.html "class in akka.routing")` | `[apply](#apply())()` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BroadcastRoutingLogic
		
		
		
		```
		public BroadcastRoutingLogic()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [BroadcastRoutingLogic](BroadcastRoutingLogic.html "class in akka.routing") apply()
		```
		- #### select
		
		
		
		```
		public [Routee](Routee.html "interface in akka.routing") select​(java.lang.Object message,
		                     scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)
		```
		
		Description copied from interface: `[RoutingLogic](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))`
		Pick the destination for a given message. Normally it picks one of the
		 passed `routees`, but in the end it is up to the implementation to
		 return whatever [`Routee`](Routee.html "interface in akka.routing") to use for sending a specific message.
		 
		 When implemented from Java it can be good to know that
		 `routees.apply(index)` can be used to get an element
		 from the `IndexedSeq`.
		
		
		
		Specified by:
		`[select](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))` in interface `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka/current/akka/routing/BroadcastRoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/BroadcastRoutingLogic.html](https://doc.akka.io/japi/akka/current/akka/routing/BroadcastRoutingLogic.html)*