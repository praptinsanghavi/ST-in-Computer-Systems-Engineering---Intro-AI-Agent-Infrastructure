---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsChanged$.html
title: ClusterMetricsChanged$
---

# ClusterMetricsChanged$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class ClusterMetricsChanged$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Set\<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")\>,​[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")\>
	- - akka.cluster.metrics.ClusterMetricsChanged$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>,​[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")>`

---

```
public class ClusterMetricsChanged$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>,​[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.ClusterMetricsChanged$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterMetricsChanged$](ClusterMetricsChanged$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMetricsChanged$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.ClusterMetricsChanged))​([ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterMetricsChanged$](ClusterMetricsChanged$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterMetricsChanged$
		
		
		
		```
		public ClusterMetricsChanged$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>,​[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>,​[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")>`
		- #### apply
		
		
		
		```
		public [ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") apply​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>,​[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>> unapply​([ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsChanged$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsChanged$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/ClusterMetricsChanged$.html)*