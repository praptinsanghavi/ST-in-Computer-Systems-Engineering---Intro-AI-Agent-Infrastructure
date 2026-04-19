---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/Supervisor$.html
title: Supervisor$
---

# Supervisor$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class Supervisor$

- java.lang.Object
- - akka.actor.typed.internal.Supervisor$

- ---

```
public class Supervisor$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Supervisor$](Supervisor$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Supervisor$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T,​Thr extends java.lang.Throwable>[Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,akka.actor.typed.SupervisorStrategy,scala.reflect.ClassTag))​([Behavior](../Behavior.html "class in akka.actor.typed")<T> initialBehavior,  [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,  scala.reflect.ClassTag<Thr> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Supervisor$](Supervisor$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Supervisor$
		
		
		
		```
		public Supervisor$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T,​Thr extends java.lang.Throwable> [Behavior](../Behavior.html "class in akka.actor.typed")<T> apply​([Behavior](../Behavior.html "class in akka.actor.typed")<T> initialBehavior,
		                                                                   [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,
		                                                                   scala.reflect.ClassTag<Thr> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/Supervisor$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/Supervisor$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/Supervisor$.html)*