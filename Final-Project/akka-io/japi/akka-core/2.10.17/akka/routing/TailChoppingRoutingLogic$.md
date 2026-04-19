---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:54:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic$.html
title: TailChoppingRoutingLogic$
---

# TailChoppingRoutingLogic$

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingRoutingLogic$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")\>
	- - akka.routing.TailChoppingRoutingLogic$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")>`

---

```
public class TailChoppingRoutingLogic$
extends scala.runtime.AbstractFunction4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingRoutingLogic$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TailChoppingRoutingLogic$](TailChoppingRoutingLogic$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingRoutingLogic$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")` | `[apply](#apply(akka.actor.Scheduler,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,scala.concurrent.ExecutionContext))​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  scala.concurrent.ExecutionContext context)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext>>` | `[unapply](#unapply(akka.routing.TailChoppingRoutingLogic))​([TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TailChoppingRoutingLogic$](TailChoppingRoutingLogic$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TailChoppingRoutingLogic$
		
		
		
		```
		public TailChoppingRoutingLogic$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") apply​([Scheduler](../actor/Scheduler.html "interface in akka.actor") scheduler,
		                                      scala.concurrent.duration.FiniteDuration within,
		                                      scala.concurrent.duration.FiniteDuration interval,
		                                      scala.concurrent.ExecutionContext context)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext,​[TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<[Scheduler](../actor/Scheduler.html "interface in akka.actor"),​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.ExecutionContext>> unapply​([TailChoppingRoutingLogic](TailChoppingRoutingLogic.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Scheduler.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/routing/TailChoppingRoutingLogic$.html)*