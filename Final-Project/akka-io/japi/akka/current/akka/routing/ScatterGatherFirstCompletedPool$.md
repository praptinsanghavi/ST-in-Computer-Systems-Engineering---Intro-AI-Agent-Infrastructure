---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:39:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool$.html
title: ScatterGatherFirstCompletedPool$
---

# ScatterGatherFirstCompletedPool$

## Content

Package [akka.routing](package-summary.html)
## Class ScatterGatherFirstCompletedPool$

- java.lang.Object
- - scala.runtime.AbstractFunction6\<java.lang.Object,​scala.Option\<[Resizer](Resizer.html "interface in akka.routing")\>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")\>
	- - akka.routing.ScatterGatherFirstCompletedPool$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function6<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")>`

---

```
public class ScatterGatherFirstCompletedPool$
extends scala.runtime.AbstractFunction6<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.ScatterGatherFirstCompletedPool$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ScatterGatherFirstCompletedPool$](ScatterGatherFirstCompletedPool$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ScatterGatherFirstCompletedPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `boolean` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")` | `[apply](#apply(int,scala.Option,scala.concurrent.duration.FiniteDuration,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  scala.concurrent.duration.FiniteDuration within,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$4](#apply$default$4())()` |  |
	| `java.lang.String` | `[apply$default$5](#apply$default$5())()` |  |
	| `boolean` | `[apply$default$6](#apply$default$6())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple6<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.ScatterGatherFirstCompletedPool))​([ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction6
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function6
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ScatterGatherFirstCompletedPool$](ScatterGatherFirstCompletedPool$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ScatterGatherFirstCompletedPool$
		
		
		
		```
		public ScatterGatherFirstCompletedPool$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public java.lang.String $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public boolean $lessinit$greater$default$6()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function6<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction6<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing") apply​(int nrOfInstances,
		                                             scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                                             scala.concurrent.duration.FiniteDuration within,
		                                             [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                             java.lang.String routerDispatcher,
		                                             boolean usePoolDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$2()
		```
		- #### apply$default$4
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public java.lang.String apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public boolean apply$default$6()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([ScatterGatherFirstCompletedPool](ScatterGatherFirstCompletedPool.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool$.html
- https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool$.html](https://doc.akka.io/japi/akka/current/akka/routing/ScatterGatherFirstCompletedPool$.html)*