---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:44:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef$.html
title: ActorRef$
---

# ActorRef$

## Content

Package [akka.actor](package-summary.html)
## Class ActorRef$

- java.lang.Object
- - akka.actor.ActorRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorRef$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.ActorRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorRef$](ActorRef$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[noSender](#noSender())()` | Use this value as an argument to [`ActorRef.tell(java.lang.Object, akka.actor.ActorRef)`](ActorRef.html#tell(java.lang.Object,akka.actor.ActorRef)) if there is not actor to  reply to (e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorRef$](ActorRef$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorRef$
		
		
		
		```
		public ActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### noSender
		
		
		
		```
		public final [ActorRef](ActorRef.html "class in akka.actor") noSender()
		```
		
		Use this value as an argument to [`ActorRef.tell(java.lang.Object, akka.actor.ActorRef)`](ActorRef.html#tell(java.lang.Object,akka.actor.ActorRef)) if there is not actor to
		 reply to (e.g. when sending from non\-actor code).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef$.html)*