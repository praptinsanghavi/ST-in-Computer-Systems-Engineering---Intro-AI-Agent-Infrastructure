---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection$.html
title: ActorSelection$
---

# ActorSelection$

## Content

Package [akka.actor](package-summary.html)
## Class ActorSelection$

- java.lang.Object
- - akka.actor.ActorSelection$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorSelection$
extends java.lang.Object
implements java.io.Serializable
```

An ActorSelection is a logical view of a section of an ActorSystem's tree of Actors,
 allowing for broadcasting of messages to that section.

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorSelection$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSelection$](ActorSelection$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSelection$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorSelection](ActorSelection.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,java.lang.String))​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,  java.lang.String path)` | Construct an ActorSelection from the given string representing a path  relative to the given target. |
	| `[ActorSelection](ActorSelection.html "class in akka.actor")` | `[apply](#apply(akka.actor.ActorRef,scala.collection.Iterable))​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,  scala.collection.Iterable<java.lang.String> elements)` | Construct an ActorSelection from the given string representing a path  relative to the given target. |
	| `[ScalaActorSelection](ScalaActorSelection.html "interface in akka.actor")` | `[toScala](#toScala(akka.actor.ActorSelection))​([ActorSelection](ActorSelection.html "class in akka.actor") sel)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSelection$](ActorSelection$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSelection$
		
		
		
		```
		public ActorSelection$()
		```

	- ### Method Detail
	
	
	
		- #### toScala
		
		
		
		```
		public [ScalaActorSelection](ScalaActorSelection.html "interface in akka.actor") toScala​([ActorSelection](ActorSelection.html "class in akka.actor") sel)
		```
		- #### apply
		
		
		
		```
		public [ActorSelection](ActorSelection.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,
		                            java.lang.String path)
		```
		
		Construct an ActorSelection from the given string representing a path
		 relative to the given target. This operation has to create all the
		 matching magic, so it is preferable to cache its result if the
		 intention is to send messages frequently.
		- #### apply
		
		
		
		```
		public [ActorSelection](ActorSelection.html "class in akka.actor") apply​([ActorRef](ActorRef.html "class in akka.actor") anchorRef,
		                            scala.collection.Iterable<java.lang.String> elements)
		```
		
		Construct an ActorSelection from the given string representing a path
		 relative to the given target. This operation has to create all the
		 matching magic, so it is preferable to cache its result if the
		 intention is to send messages frequently.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/actor/ScalaActorSelection.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection$.html](https://doc.akka.io/japi/akka/current/akka/actor/ActorSelection$.html)*