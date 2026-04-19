---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ScalaActorRef.html
title: ScalaActorRef
---

# ScalaActorRef

## Content

Package [akka.actor](package-summary.html)
## Interface ScalaActorRef

- All Known Implementing Classes:
`[Nobody$](Nobody$.html "class in akka.actor")`

---

```
public interface ScalaActorRef
```

Deprecated.
tell method is now provided by ActorRef trait. Since 2\.6\.13\.

This trait represents the Scala Actor API
 There are implicit conversions in package.scala
 from ActorRef \-\> ScalaActorRef and back

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[$bang](#$bang(java.lang.Object,akka.actor.ActorRef))​(java.lang.Object message,  [ActorRef](ActorRef.html "class in akka.actor") sender)` | Deprecated. Sends a one\-way asynchronous message. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[$bang$default$2](#$bang$default$2(java.lang.Object))​(java.lang.Object message)` | Deprecated. |

- - ### Method Detail
	
	
	
		- #### $bang
		
		
		
		```
		void $bang​(java.lang.Object message,
		           [ActorRef](ActorRef.html "class in akka.actor") sender)
		```
		
		Deprecated.
		Sends a one\-way asynchronous message. E.g. fire\-and\-forget semantics.
		 
		
		 If invoked from within an actor then the actor reference is implicitly passed on as the implicit 'sender' argument.
		 
		
		
		
		 This actor 'sender' reference is then available in the receiving actor in the 'sender()' member variable,
		 if invoked from within an Actor. If not then no sender is available.
		 
		
		
		```
		
		   actor ! message
		 
		```
		- #### $bang$default$2
		
		
		
		```
		[ActorRef](ActorRef.html "class in akka.actor") $bang$default$2​(java.lang.Object message)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Nobody$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ScalaActorRef.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ScalaActorRef.html)*