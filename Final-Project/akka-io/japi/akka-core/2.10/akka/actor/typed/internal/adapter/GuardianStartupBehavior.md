---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:00:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/GuardianStartupBehavior.html
title: GuardianStartupBehavior
---

# GuardianStartupBehavior

## Content

Package [akka.actor.typed.internal.adapter](package-summary.html)
## Class GuardianStartupBehavior

- java.lang.Object
- - akka.actor.typed.internal.adapter.GuardianStartupBehavior

- ---

```
public class GuardianStartupBehavior
extends java.lang.Object
```

INTERNAL API
 
 Messages to the user provided guardian must be deferred while the actor system is starting up. This
 behavior delays starting the user provided behavior until the Start command is delivered from the actor
 system, and we know that the bootstrap is completed and the actor context can be accessed.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[GuardianStartupBehavior.Start$](GuardianStartupBehavior.Start$.html "class in akka.actor.typed.internal.adapter")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GuardianStartupBehavior](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [Behavior](../../Behavior.html "class in akka.actor.typed")<java.lang.Object>` | `[apply](#apply(akka.actor.typed.Behavior))​([Behavior](../../Behavior.html "class in akka.actor.typed")<T> guardianBehavior)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GuardianStartupBehavior
		
		
		
		```
		public GuardianStartupBehavior()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T> [Behavior](../../Behavior.html "class in akka.actor.typed")<java.lang.Object> apply​([Behavior](../../Behavior.html "class in akka.actor.typed")<T> guardianBehavior)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/GuardianStartupBehavior.Start$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/GuardianStartupBehavior.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/adapter/GuardianStartupBehavior.html)*