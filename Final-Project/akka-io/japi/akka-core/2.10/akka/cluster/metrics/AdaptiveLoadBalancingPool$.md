---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool$.html
title: AdaptiveLoadBalancingPool$
---

# AdaptiveLoadBalancingPool$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class AdaptiveLoadBalancingPool$

- java.lang.Object
- - scala.runtime.AbstractFunction5\<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")\>
	- - akka.cluster.metrics.AdaptiveLoadBalancingPool$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")>`

---

```
public class AdaptiveLoadBalancingPool$
extends scala.runtime.AbstractFunction5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.AdaptiveLoadBalancingPool$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdaptiveLoadBalancingPool$](AdaptiveLoadBalancingPool$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptiveLoadBalancingPool$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `int` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$4](#$lessinit$greater$default$4())()` |  |
	| `boolean` | `[$lessinit$greater$default$5](#$lessinit$greater$default$5())()` |  |
	| `[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.cluster.metrics.MetricsSelector,int,akka.actor.SupervisorStrategy,java.lang.String,boolean))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  int nrOfInstances,  [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,  java.lang.String routerDispatcher,  boolean usePoolDispatcher)` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[apply$default$1](#apply$default$1())()` |  |
	| `int` | `[apply$default$2](#apply$default$2())()` |  |
	| `[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor")` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[apply$default$4](#apply$default$4())()` |  |
	| `boolean` | `[apply$default$5](#apply$default$5())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.AdaptiveLoadBalancingPool))​([AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction5
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function5
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdaptiveLoadBalancingPool$](AdaptiveLoadBalancingPool$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdaptiveLoadBalancingPool$
		
		
		
		```
		public AdaptiveLoadBalancingPool$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public int $lessinit$greater$default$2()
		```
		- #### $lessinit$greater$default$3
		
		
		
		```
		public [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") $lessinit$greater$default$3()
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
		`toString` in interface `scala.Function5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object,​[AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics")>`
		- #### apply
		
		
		
		```
		public [AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") apply​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                       int nrOfInstances,
		                                       [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") supervisorStrategy,
		                                       java.lang.String routerDispatcher,
		                                       boolean usePoolDispatcher)
		```
		- #### apply$default$1
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public int apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public [SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor") apply$default$3()
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
		public scala.Option<scala.Tuple5<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​java.lang.Object,​[SupervisorStrategy](../../actor/SupervisorStrategy.html "class in akka.actor"),​java.lang.String,​java.lang.Object>> unapply​([AdaptiveLoadBalancingPool](AdaptiveLoadBalancingPool.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/AdaptiveLoadBalancingPool$.html)*