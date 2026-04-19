---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorContextAdapter$.html
title: ActorContextAdapter$
---

# ActorContextAdapter$

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class ActorContextAdapter$

- java.lang.Object
- - akka.actor.typed.internal.adapter.ActorContextAdapter$

- ---

```
public class ActorContextAdapter$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorContextAdapter$](ActorContextAdapter$.html "class in akka.actor.typed.internal.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorContextAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<U> [ActorContext](../../../ActorContext.html "interface in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.javadsl.ActorContext))​([ActorContext](../../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<?> context)` |  |
	| `<U> [ActorContext](../../../ActorContext.html "interface in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.scaladsl.ActorContext))​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorContextAdapter$](ActorContextAdapter$.html "class in akka.actor.typed.internal.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorContextAdapter$
		
		
		
		```
		public ActorContextAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### toClassic
		
		
		
		```
		public <U> [ActorContext](../../../ActorContext.html "interface in akka.actor") toClassic​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<?> context)
		```
		- #### toClassic
		
		
		
		```
		public <U> [ActorContext](../../../ActorContext.html "interface in akka.actor") toClassic​([ActorContext](../../javadsl/ActorContext.html "interface in akka.actor.typed.javadsl")<?> context)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorContextAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorContextAdapter$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/ActorContextAdapter$.html)*