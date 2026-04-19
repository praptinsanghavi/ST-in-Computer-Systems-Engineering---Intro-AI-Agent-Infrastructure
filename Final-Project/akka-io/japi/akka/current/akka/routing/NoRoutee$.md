---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee$.html
title: NoRoutee$
---

# NoRoutee$

## Content

Package [akka.routing](package-summary.html)
## Class NoRoutee$

- java.lang.Object
- - akka.routing.NoRoutee$

- All Implemented Interfaces:
`[Routee](Routee.html "interface in akka.routing")`

---

```
public class NoRoutee$
extends java.lang.Object
implements [Routee](Routee.html "interface in akka.routing")
```

[`Routee`](Routee.html "interface in akka.routing") that doesn't send the message to any routee.
 The [`Router`](Router.html "class in akka.routing") will send the message to `deadLetters` if
 `NoRoutee` is returned from [`RoutingLogic.select(java.lang.Object, scala.collection.immutable.IndexedSeq<akka.routing.Routee>)`](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoRoutee$](NoRoutee$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoRoutee$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[send](#send(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoRoutee$](NoRoutee$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoRoutee$
		
		
		
		```
		public NoRoutee$()
		```

	- ### Method Detail
	
	
	
		- #### send
		
		
		
		```
		public void send​(java.lang.Object message,
		                 [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```
		
		
		Specified by:
		`[send](Routee.html#send(java.lang.Object,akka.actor.ActorRef))` in interface `[Routee](Routee.html "interface in akka.routing")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee$.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/Router.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee$.html](https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee$.html)*