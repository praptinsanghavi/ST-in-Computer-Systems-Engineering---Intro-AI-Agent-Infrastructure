---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:59:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/ActorSystemAdapter$.html
title: ActorSystemAdapter$
---

# ActorSystemAdapter$

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class ActorSystemAdapter$

- java.lang.Object
- - akka.actor.typed.internal.adapter.ActorSystemAdapter$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ActorSystemAdapter$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../../serialized-form.html#akka.actor.typed.internal.adapter.ActorSystemAdapter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ActorSystemAdapter$](ActorSystemAdapter$.html "class in akka.actor.typed.internal.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ActorSystemAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$>` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../../ActorSystem.html "class in akka.actor") system)` |  |
	| `<U> [ActorSystem](../../../ActorSystem.html "class in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.ActorSystem))​([ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?> sys)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ActorSystemAdapter$](ActorSystemAdapter$.html "class in akka.actor.typed.internal.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ActorSystemAdapter$
		
		
		
		```
		public ActorSystemAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<scala.runtime.Nothing$> apply​([ActorSystem](../../../ActorSystem.html "class in akka.actor") system)
		```
		- #### toClassic
		
		
		
		```
		public <U> [ActorSystem](../../../ActorSystem.html "class in akka.actor") toClassic​([ActorSystem](../../ActorSystem.html "class in akka.actor.typed")<?> sys)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/ActorSystemAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/ActorSystemAdapter$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/ActorSystemAdapter$.html)*