---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:17:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingPool$.html
title: TailChoppingPool$
---

# TailChoppingPool$

## Content

Package [akka.routing](package-summary.html)
## Class TailChoppingPool$

- java.lang.Object
- - scala.runtime.AbstractFunction7\<java.lang.Object,​scala.Option\<[Resizer](Resizer.html "interface in akka.routing")\>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[TailChoppingPool](TailChoppingPool.html "class in akka.routing")\>
	- - akka.routing.TailChoppingPool$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>`

---

```
public class TailChoppingPool$
extends scala.runtime.AbstractFunction7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.TailChoppingPool$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [TailChoppingPool$](TailChoppingPool$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[TailChoppingPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$6](#$lessinit$greater$default$6())()` |  |
	| `boolean` | `[$lessinit$greater$default$7](#$lessinit$greater$default$7())()` |  |
	| `[TailChoppingPool](TailChoppingPool.html "class in akka.routing")` | `[apply](#apply(int,scala.Option,scala.concurrent.duration.FiniteDuration,scala.concurrent.duration.FiniteDuration,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  scala.concurrent.duration.FiniteDuration within,  scala.concurrent.duration.FiniteDuration interval,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.String` | `[apply$default$6](#apply$default$6())()` |  |
	| `boolean` | `[apply$default$7](#apply$default$7())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.TailChoppingPool))​([TailChoppingPool](TailChoppingPool.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction7
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function7
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [TailChoppingPool$](TailChoppingPool$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### TailChoppingPool$
		
		
		
		```
		public TailChoppingPool$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$5()
		```
		- #### $lessinit$greater$default$6
		
		
		
		```
		public java.lang.String $lessinit$greater$default$6()
		```
		- #### $lessinit$greater$default$7
		
		
		
		```
		public boolean $lessinit$greater$default$7()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[TailChoppingPool](TailChoppingPool.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [TailChoppingPool](TailChoppingPool.html "class in akka.routing") apply​(int nrOfInstances,
		                              scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                              scala.concurrent.duration.FiniteDuration within,
		                              scala.concurrent.duration.FiniteDuration interval,
		                              [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                              java.lang.String routerDispatcher,
		                              boolean usePoolDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$2()
		```
		- #### apply$default$5
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$5()
		```
		- #### apply$default$6
		
		
		
		```
		public java.lang.String apply$default$6()
		```
		- #### apply$default$7
		
		
		
		```
		public boolean apply$default$7()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple7<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​scala.concurrent.duration.FiniteDuration,​scala.concurrent.duration.FiniteDuration,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([TailChoppingPool](TailChoppingPool.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingPool$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingPool$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/TailChoppingPool$.html)*