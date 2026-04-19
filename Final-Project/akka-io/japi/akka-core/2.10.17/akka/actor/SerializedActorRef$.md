---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:46:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SerializedActorRef$.html
title: SerializedActorRef$
---

# SerializedActorRef$

## Content

Package [akka.actor](package-summary.html)
## Class SerializedActorRef$

- java.lang.Object
- - akka.actor.SerializedActorRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class SerializedActorRef$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.SerializedActorRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SerializedActorRef$](SerializedActorRef$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SerializedActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.actor.SerializedActorRef` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") actorRef)` |  |
	| `akka.actor.SerializedActorRef` | `[apply](#apply(java.lang.String))​(java.lang.String path)` |  |
	| `scala.Option<java.lang.String>` | `[unapply](#unapply(akka.actor.SerializedActorRef))​(akka.actor.SerializedActorRef x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SerializedActorRef$](SerializedActorRef$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SerializedActorRef$
		
		
		
		```
		public SerializedActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public akka.actor.SerializedActorRef apply​([ActorRef](ActorRef.html "class in akka.actor") actorRef)
		```
		- #### apply
		
		
		
		```
		public akka.actor.SerializedActorRef apply​(java.lang.String path)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<java.lang.String> unapply​(akka.actor.SerializedActorRef x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SerializedActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SerializedActorRef$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/SerializedActorRef$.html)*