---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:38:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/routing/BalancingPool$.html
title: BalancingPool$
---

# BalancingPool$

## Content

Package [akka.routing](package-summary.html)
## Class BalancingPool$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​[BalancingPool](BalancingPool.html "class in akka.routing")\>
	- - akka.routing.BalancingPool$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​[BalancingPool](BalancingPool.html "class in akka.routing")>`

---

```
public class BalancingPool$
extends scala.runtime.AbstractFunction3<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​[BalancingPool](BalancingPool.html "class in akka.routing")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../serialized-form.html#akka.routing.BalancingPool$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [BalancingPool$](BalancingPool$.html "class in akka.routing")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BalancingPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[BalancingPool](BalancingPool.html "class in akka.routing")` | `[apply](#apply(int,akka.actor.SupervisorStrategy,java.lang.String))​(int nrOfInstances,  [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher)` |  |
	| `[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String>>` | `[unapply](#unapply(akka.routing.BalancingPool))​([BalancingPool](BalancingPool.html "class in akka.routing") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [BalancingPool$](BalancingPool$.html "class in akka.routing") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### BalancingPool$
		
		
		
		```
		public BalancingPool$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public java.lang.String $lessinit$greater$default$3()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​[BalancingPool](BalancingPool.html "class in akka.routing")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​[BalancingPool](BalancingPool.html "class in akka.routing")>`
		- #### apply
		
		
		
		```
		public [BalancingPool](BalancingPool.html "class in akka.routing") apply​(int nrOfInstances,
		                           [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                           java.lang.String routerDispatcher)
		```
		- #### apply$default$2
		
		
		
		```
		public [SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor") apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public java.lang.String apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<java.lang.Object,​[SupervisorStrategy](../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String>> unapply​([BalancingPool](BalancingPool.html "class in akka.routing") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/routing/BalancingPool$.html
- https://doc.akka.io/japi/akka/current/akka/routing/BalancingPool.html
- https://doc.akka.io/japi/akka/current/akka/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/routing/BalancingPool$.html](https://doc.akka.io/japi/akka/current/akka/routing/BalancingPool$.html)*