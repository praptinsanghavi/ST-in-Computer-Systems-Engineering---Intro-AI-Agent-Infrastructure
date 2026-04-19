---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:54:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/GuardianStartupBehavior$.html
title: GuardianStartupBehavior$
---

# GuardianStartupBehavior$

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class GuardianStartupBehavior$

- java.lang.Object
- - akka.actor.typed.internal.adapter.GuardianStartupBehavior$

- ---

```
public class GuardianStartupBehavior$
extends java.lang.Object
```

INTERNAL API
 
 Messages to the user provided guardian must be deferred while the actor system is starting up. This
 behavior delays starting the user provided behavior until the Start command is delivered from the actor
 system, and we know that the bootstrap is completed and the actor context can be accessed.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GuardianStartupBehavior$](GuardianStartupBehavior$.html "class in akka.actor.typed.internal.adapter")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GuardianStartupBehavior$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../../Behavior.html "class in akka.actor.typed")<java.lang.Object>` | `[apply](#apply(akka.actor.typed.Behavior))​([Behavior](../../Behavior.html "class in akka.actor.typed")<T> guardianBehavior)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GuardianStartupBehavior$](GuardianStartupBehavior$.html "class in akka.actor.typed.internal.adapter") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GuardianStartupBehavior$
		
		
		
		```
		public GuardianStartupBehavior$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Behavior](../../Behavior.html "class in akka.actor.typed")<java.lang.Object> apply​([Behavior](../../Behavior.html "class in akka.actor.typed")<T> guardianBehavior)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/GuardianStartupBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/GuardianStartupBehavior$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/adapter/GuardianStartupBehavior$.html)*