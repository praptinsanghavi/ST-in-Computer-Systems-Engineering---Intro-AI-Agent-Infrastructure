---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:17:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoundRobinRoutingLogic.html
title: RoundRobinRoutingLogic
---

# RoundRobinRoutingLogic

## Content

Package [akka.routing](package-summary.html)
## Class RoundRobinRoutingLogic

- java.lang.Object
- - akka.routing.RoundRobinRoutingLogic

- All Implemented Interfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`, `[RoutingLogic](RoutingLogic.html "interface in akka.routing")`

---

```
public final class RoundRobinRoutingLogic
extends java.lang.Object
implements [RoutingLogic](RoutingLogic.html "interface in akka.routing")
```

Uses round\-robin to select a routee. For concurrent calls,
 round robin is just a best effort.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RoundRobinRoutingLogic](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "class in akka.routing")` | `[apply](#apply())()` |  |
	| `java.util.concurrent.atomic.AtomicLong` | `[next](#next())()` |  |
	| `[Routee](Routee.html "interface in akka.routing")` | `[select](#select(java.lang.Object,scala.collection.immutable.IndexedSeq))​(java.lang.Object message,  scala.collection.immutable.IndexedSeq<[Routee](Routee.html "interface in akka.routing")> routees)` | Pick the destination for a given message. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### RoundRobinRoutingLogic
		
		
		
		```
		public RoundRobinRoutingLogic()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [RoundRobinRoutingLogic](RoundRobinRoutingLogic.html "class in akka.routing") apply()
		```
		- #### next
		
		
		
		```
		public java.util.concurrent.atomic.AtomicLong next()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoundRobinRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/Routee.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoundRobinRoutingLogic.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/RoundRobinRoutingLogic.html)*