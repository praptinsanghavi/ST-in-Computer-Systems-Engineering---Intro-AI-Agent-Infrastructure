---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:30:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ScheduledRestart$.html
title: RestartSupervisor.ScheduledRestart$
---

# RestartSupervisor.ScheduledRestart$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class RestartSupervisor.ScheduledRestart$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")\<?,​? extends java.lang.Throwable\>,​[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")\>
	- - akka.actor.typed.internal.RestartSupervisor.ScheduledRestart$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")>`

Enclosing class:
[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")\<[T](RestartSupervisor.html "type parameter in RestartSupervisor"),​[Thr](RestartSupervisor.html "type parameter in RestartSupervisor") extends java.lang.Throwable\>

---

```
public static class RestartSupervisor.ScheduledRestart$
extends scala.runtime.AbstractFunction1<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.RestartSupervisor.ScheduledRestart$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSupervisor.ScheduledRestart$](RestartSupervisor.ScheduledRestart$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScheduledRestart$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")` | `[apply](#apply(akka.actor.typed.internal.RestartSupervisor))​([RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable> owner)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>>` | `[unapply](#unapply(akka.actor.typed.internal.RestartSupervisor.ScheduledRestart))​([RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSupervisor.ScheduledRestart$](RestartSupervisor.ScheduledRestart$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ScheduledRestart$
		
		
		
		```
		public ScheduledRestart$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")>`
		- #### apply
		
		
		
		```
		public [RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal") apply​([RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable> owner)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>> unapply​([RestartSupervisor.ScheduledRestart](RestartSupervisor.ScheduledRestart.html "class in akka.actor.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ScheduledRestart$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ScheduledRestart.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ScheduledRestart$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/RestartSupervisor.ScheduledRestart$.html)*