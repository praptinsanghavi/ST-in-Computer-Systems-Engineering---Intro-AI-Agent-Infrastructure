---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors.Supervise$.html
title: Behaviors.Supervise$
---

# Behaviors.Supervise$

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Class Behaviors.Supervise$

- java.lang.Object
- - akka.actor.typed.scaladsl.Behaviors.Supervise$

- Enclosing class:
[Behaviors](Behaviors.html "class in akka.actor.typed.scaladsl")

---

```
public static class Behaviors.Supervise$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Behaviors.Supervise$](Behaviors.Supervise$.html "class in akka.actor.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Supervise$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> boolean` | `[equals$extension](#equals$extension(akka.actor.typed.scaladsl.Behaviors.Supervise,java.lang.Object))​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this,  java.lang.Object x$1)` |  |
	| `<T> int` | `[hashCode$extension](#hashCode$extension(akka.actor.typed.scaladsl.Behaviors.Supervise))​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this)` |  |
	| `<Thr extends java.lang.Throwable,​T>scala.reflect.ClassTag<scala.runtime.Nothing$>` | `[onFailure$default$2$extension](#onFailure$default$2$extension(akka.actor.typed.scaladsl.Behaviors.Supervise,akka.actor.typed.SupervisorStrategy))​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this,  [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy)` |  |
	| `<Thr extends java.lang.Throwable,​T>[Behavior](../Behavior.html "class in akka.actor.typed")<T>` | `[onFailure$extension](#onFailure$extension(akka.actor.typed.scaladsl.Behaviors.Supervise,akka.actor.typed.SupervisorStrategy,scala.reflect.ClassTag))​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this,  [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,  scala.reflect.ClassTag<Thr> tag)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Behaviors.Supervise$](Behaviors.Supervise$.html "class in akka.actor.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Supervise$
		
		
		
		```
		public Supervise$()
		```

	- ### Method Detail
	
	
	
		- #### onFailure$extension
		
		
		
		```
		public final <Thr extends java.lang.Throwable,​T> [Behavior](../Behavior.html "class in akka.actor.typed")<T> onFailure$extension​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this,
		                                                                                       [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,
		                                                                                       scala.reflect.ClassTag<Thr> tag)
		```
		- #### onFailure$default$2$extension
		
		
		
		```
		public final <Thr extends java.lang.Throwable,​T> scala.reflect.ClassTag<scala.runtime.Nothing$> onFailure$default$2$extension​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this,
		                                                                                                                                    [SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy)
		```
		- #### hashCode$extension
		
		
		
		```
		public final <T> int hashCode$extension​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this)
		```
		- #### equals$extension
		
		
		
		```
		public final <T> boolean equals$extension​([Behaviors.Supervise](Behaviors.Supervise.html "class in akka.actor.typed.scaladsl")<T> $this,
		                                          java.lang.Object x$1)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors.Supervise$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors.Supervise.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors.Supervise$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Behaviors.Supervise$.html)*