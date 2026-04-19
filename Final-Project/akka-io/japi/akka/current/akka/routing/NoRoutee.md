---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee.html
title: NoRoutee
---

# NoRoutee

## Content

Package [akka.routing](package-summary.html)
## Class NoRoutee

- java.lang.Object
- - akka.routing.NoRoutee

- ---

```
public class NoRoutee
extends java.lang.Object
```

[`Routee`](Routee.html "interface in akka.routing") that doesn't send the message to any routee.
 The [`Router`](Router.html "class in akka.routing") will send the message to `deadLetters` if
 `NoRoutee` is returned from [`RoutingLogic.select(java.lang.Object, scala.collection.immutable.IndexedSeq<akka.routing.Routee>)`](RoutingLogic.html#select(java.lang.Object,scala.collection.immutable.IndexedSeq))

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoRoutee](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static void` | `[send](#send(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### NoRoutee
		
		
		
		```
		public NoRoutee()
		```

	- ### Method Detail
	
	
	
		- #### send
		
		
		
		```
		public static void send​(java.lang.Object message,
		                        [ActorRef](../actor/ActorRef.html "class in akka.actor") sender)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/routing/Routee.html
- https://doc.akka.io/japi/akka/current/akka/routing/Router.html
- https://doc.akka.io/japi/akka/current/akka/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee.html](https://doc.akka.io/japi/akka/current/akka/routing/NoRoutee.html)*