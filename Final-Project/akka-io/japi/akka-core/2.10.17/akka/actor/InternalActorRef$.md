---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:45:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/InternalActorRef$.html
title: InternalActorRef$
---

# InternalActorRef$

## Content

Package [akka.actor](package-summary.html)
## Class InternalActorRef$

- java.lang.Object
- - akka.actor.InternalActorRef$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class InternalActorRef$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../serialized-form.html#akka.actor.InternalActorRef$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [InternalActorRef$](InternalActorRef$.html "class in akka.actor")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InternalActorRef$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[isTemporaryRef](#isTemporaryRef(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") ref)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [InternalActorRef$](InternalActorRef$.html "class in akka.actor") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### InternalActorRef$
		
		
		
		```
		public InternalActorRef$()
		```

	- ### Method Detail
	
	
	
		- #### isTemporaryRef
		
		
		
		```
		public boolean isTemporaryRef​([ActorRef](ActorRef.html "class in akka.actor") ref)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/InternalActorRef$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/InternalActorRef$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/InternalActorRef$.html)*