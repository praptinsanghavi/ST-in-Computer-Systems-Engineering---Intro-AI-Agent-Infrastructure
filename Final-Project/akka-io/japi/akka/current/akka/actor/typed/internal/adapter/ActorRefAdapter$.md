---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefAdapter$.html
title: ActorRefAdapter$
---

# ActorRefAdapter$

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class ActorRefAdapter$

- java.lang.Object
- - akka.actor.typed.internal.adapter.ActorRefAdapter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorRefAdapter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.adapter.ActorRefAdapter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorRefAdapter$](ActorRefAdapter$.html "class in akka.actor.typed.internal.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRefAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../../../ActorRef.html "class in akka.actor") ref)` |  |
	| `void` | `[sendSystemMessage](#sendSystemMessage(akka.actor.InternalActorRef,akka.actor.typed.internal.SystemMessage))​(akka.actor.InternalActorRef classicRef,  [SystemMessage](../SystemMessage.html "interface in akka.actor.typed.internal") signal)` |  |
	| `<U> akka.actor.InternalActorRef` | `[toClassic](#toClassic(akka.actor.typed.ActorRef))​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<U> ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorRefAdapter$](ActorRefAdapter$.html "class in akka.actor.typed.internal.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorRefAdapter$
		
		
		
		```
		public ActorRefAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [ActorRef](../../ActorRef.html "interface in akka.actor.typed")<T> apply​([ActorRef](../../../ActorRef.html "class in akka.actor") ref)
		```
		- #### toClassic
		
		
		
		```
		public <U> akka.actor.InternalActorRef toClassic​([ActorRef](../../ActorRef.html "interface in akka.actor.typed")<U> ref)
		```
		- #### sendSystemMessage
		
		
		
		```
		public void sendSystemMessage​(akka.actor.InternalActorRef classicRef,
		                              [SystemMessage](../SystemMessage.html "interface in akka.actor.typed.internal") signal)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/SystemMessage.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefAdapter$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorRefAdapter$.html)*