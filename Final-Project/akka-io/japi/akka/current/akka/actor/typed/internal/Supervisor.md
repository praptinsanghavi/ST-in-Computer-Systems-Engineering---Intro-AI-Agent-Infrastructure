---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/Supervisor.html
title: Supervisor
---

# Supervisor

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class Supervisor

- java.lang.Object
- - akka.actor.typed.internal.Supervisor

- ---

```
public class Supervisor
extends java.lang.Object
```

INTERNAL API

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Supervisor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T,​Thr extends java.lang.Throwable>[Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[apply](#apply(akka.actor.typed.Behavior,akka.actor.typed.SupervisorStrategy,scala.reflect.ClassTag))​([Behavior](../Behavior.html "class in akka.actor.typed")<T> initialBehavior,  [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,  scala.reflect.ClassTag<Thr> evidence$1)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Supervisor
		
		
		
		```
		public Supervisor()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <T,​Thr extends java.lang.Throwable> [Behavior](../Behavior.html "class in akka.actor.typed")<T> apply​([Behavior](../Behavior.html "class in akka.actor.typed")<T> initialBehavior,
		                                                                          [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,
		                                                                          scala.reflect.ClassTag<Thr> evidence$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/Supervisor.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/Supervisor.html)*