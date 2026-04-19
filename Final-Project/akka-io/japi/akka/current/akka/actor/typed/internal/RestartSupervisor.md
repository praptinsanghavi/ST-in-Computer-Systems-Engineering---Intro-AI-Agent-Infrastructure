---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/RestartSupervisor.ResetRestartCount$.html
title: RestartSupervisor.ResetRestartCount$
---

# RestartSupervisor.ResetRestartCount$

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class RestartSupervisor.ResetRestartCount$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")\<?,​? extends java.lang.Throwable\>,​[RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")\>
	- - akka.actor.typed.internal.RestartSupervisor.ResetRestartCount$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")>`

Enclosing class:
[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")\<[T](RestartSupervisor.html "type parameter in RestartSupervisor"),​[Thr](RestartSupervisor.html "type parameter in RestartSupervisor") extends java.lang.Throwable\>

---

```
public static class RestartSupervisor.ResetRestartCount$
extends scala.runtime.AbstractFunction2<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.actor.typed.internal.RestartSupervisor.ResetRestartCount$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RestartSupervisor.ResetRestartCount$](RestartSupervisor.ResetRestartCount$.html "class in akka.actor.typed.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResetRestartCount$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")` | `[apply](#apply(int,akka.actor.typed.internal.RestartSupervisor))​(int current,  [RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable> owner)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>>>` | `[unapply](#unapply(akka.actor.typed.internal.RestartSupervisor.ResetRestartCount))​([RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function2
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RestartSupervisor.ResetRestartCount$](RestartSupervisor.ResetRestartCount$.html "class in akka.actor.typed.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ResetRestartCount$
		
		
		
		```
		public ResetRestartCount$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>,​[RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal")>`
		- #### apply
		
		
		
		```
		public [RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal") apply​(int current,
		                                                 [RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable> owner)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")<?,​? extends java.lang.Throwable>>> unapply​([RestartSupervisor.ResetRestartCount](RestartSupervisor.ResetRestartCount.html "class in akka.actor.typed.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/RestartSupervisor.ResetRestartCount$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/RestartSupervisor.ResetRestartCount.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/RestartSupervisor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/RestartSupervisor.ResetRestartCount$.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/RestartSupervisor.ResetRestartCount$.html)*