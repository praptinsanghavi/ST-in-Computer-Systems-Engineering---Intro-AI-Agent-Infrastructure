---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:16:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/routing/BroadcastPool$.html
title: BroadcastPool$
---

# BroadcastPool$

## Content

Package [akka.routing](package-summary.html)
## Class BroadcastPool$

- java.lang.Object
- - scala.runtime.AbstractFunction5\<java.lang.Object,​scala.Option\<[Resizer](Resizer.html "interface in akka.routing")\>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[BroadcastPool](BroadcastPool.html "class in akka.routing")\>
	- - akka.routing.BroadcastPool$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[BroadcastPool](BroadcastPool.html "class in akka.routing")>`

---

```
public class BroadcastPool$
extends scala.runtime.AbstractFunction5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[BroadcastPool](BroadcastPool.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.BroadcastPool$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BroadcastPool$](BroadcastPool$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BroadcastPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `boolean` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `[BroadcastPool](BroadcastPool.html "class in akka.routing")` | `[apply](#apply(int,scala.Option,akka.actor.SupervisorStrategy,java.lang.String,boolean))​(int nrOfInstances,  scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `scala.Option<[Resizer](Resizer.html "interface in akka.routing")>` | `[apply$default$2](#apply$default$2())()` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `boolean` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.routing.BroadcastPool))​([BroadcastPool](BroadcastPool.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction5
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function5
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BroadcastPool$](BroadcastPool$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BroadcastPool$
		
		
		
		```
		public BroadcastPool$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$3()
		```
		- #### $lessinit$greater$default$4
		
		
		
		```
		public java.lang.String $lessinit$greater$default$4()
		```
		- #### $lessinit$greater$default$5
		
		
		
		```
		public boolean $lessinit$greater$default$5()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[BroadcastPool](BroadcastPool.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[BroadcastPool](BroadcastPool.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [BroadcastPool](BroadcastPool.html "class in akka.routing") apply​(int nrOfInstances,
		                           scala.Option<[Resizer](Resizer.html "interface in akka.routing")> resizer,
		                           [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                           java.lang.String routerDispatcher,
		                           boolean usePoolDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public scala.Option<[Resizer](Resizer.html "interface in akka.routing")> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$3()
		```
		- #### apply$default$4
		
		
		
		```
		public java.lang.String apply$default$4()
		```
		- #### apply$default$5
		
		
		
		```
		public boolean apply$default$5()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<java.lang.Object,​scala.Option<[Resizer](Resizer.html "interface in akka.routing")>,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([BroadcastPool](BroadcastPool.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/BroadcastPool$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/BroadcastPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/Resizer.html
- https://doc.akka.io/japi/akka-core/2.10/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/routing/BroadcastPool$.html](https://doc.akka.io/japi/akka-core/2.10/akka/routing/BroadcastPool$.html)*