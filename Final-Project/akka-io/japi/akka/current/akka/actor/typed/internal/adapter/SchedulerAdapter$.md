---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/SchedulerAdapter$.html
title: SchedulerAdapter$
---

# SchedulerAdapter$

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class SchedulerAdapter$

- java.lang.Object
- - akka.actor.typed.internal.adapter.SchedulerAdapter$

- ---

```
public class SchedulerAdapter$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SchedulerAdapter$](SchedulerAdapter$.html "class in akka.actor.typed.internal.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SchedulerAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Scheduler](../../../Scheduler.html "interface in akka.actor")` | `[toClassic](#toClassic(akka.actor.typed.Scheduler))​([Scheduler](../../Scheduler.html "interface in akka.actor.typed") scheduler)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SchedulerAdapter$](SchedulerAdapter$.html "class in akka.actor.typed.internal.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SchedulerAdapter$
		
		
		
		```
		public SchedulerAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### toClassic
		
		
		
		```
		public [Scheduler](../../../Scheduler.html "interface in akka.actor") toClassic​([Scheduler](../../Scheduler.html "interface in akka.actor.typed") scheduler)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Scheduler.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/SchedulerAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/SchedulerAdapter$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/SchedulerAdapter$.html)*