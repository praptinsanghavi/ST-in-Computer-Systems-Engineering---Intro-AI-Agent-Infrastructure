---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingGroup$.html
title: AdaptiveLoadBalancingGroup$
---

# AdaptiveLoadBalancingGroup$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class AdaptiveLoadBalancingGroup$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable\<java.lang.String\>,​java.lang.String,​[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")\>
	- - akka.cluster.metrics.AdaptiveLoadBalancingGroup$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String,​[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")>`

---

```
public class AdaptiveLoadBalancingGroup$
extends scala.runtime.AbstractFunction3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String,​[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.AdaptiveLoadBalancingGroup$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AdaptiveLoadBalancingGroup$](AdaptiveLoadBalancingGroup$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AdaptiveLoadBalancingGroup$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `java.lang.String` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.cluster.metrics.MetricsSelector,scala.collection.immutable.Iterable,java.lang.String))​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,  scala.collection.immutable.Iterable<java.lang.String> paths,  java.lang.String routerDispatcher)` |  |
	| `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")` | `[apply$default$1](#apply$default$1())()` |  |
	| `scala.collection.immutable.Iterable<java.lang.String>` | `[apply$default$2](#apply$default$2())()` |  |
	| `java.lang.String` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String>>` | `[unapply](#unapply(akka.cluster.metrics.AdaptiveLoadBalancingGroup))​([AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AdaptiveLoadBalancingGroup$](AdaptiveLoadBalancingGroup$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AdaptiveLoadBalancingGroup$
		
		
		
		```
		public AdaptiveLoadBalancingGroup$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") $lessinit$greater$default$1()
		```
		- #### $lessinit$greater$default$2
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> $lessinit$greater$default$2()
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
		`toString` in interface `scala.Function3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String,​[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String,​[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")>`
		- #### apply
		
		
		
		```
		public [AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") apply​([MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") metricsSelector,
		                                        scala.collection.immutable.Iterable<java.lang.String> paths,
		                                        java.lang.String routerDispatcher)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String,​[AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics")>`
		- #### apply$default$1
		
		
		
		```
		public [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics") apply$default$1()
		```
		- #### apply$default$2
		
		
		
		```
		public scala.collection.immutable.Iterable<java.lang.String> apply$default$2()
		```
		- #### apply$default$3
		
		
		
		```
		public java.lang.String apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics"),​scala.collection.immutable.Iterable<java.lang.String>,​java.lang.String>> unapply​([AdaptiveLoadBalancingGroup](AdaptiveLoadBalancingGroup.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingGroup$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingGroup.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingGroup$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/AdaptiveLoadBalancingGroup$.html)*