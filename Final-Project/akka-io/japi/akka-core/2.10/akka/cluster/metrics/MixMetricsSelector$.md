---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:58Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html
title: MixMetricsSelector$
---

# MixMetricsSelector$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MixMetricsSelector$

- java.lang.Object
- - [akka.cluster.metrics.CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
	- - [akka.cluster.metrics.MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")
		- - akka.cluster.metrics.MixMetricsSelector$

- All Implemented Interfaces:
`[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`, `java.io.Serializable`

---

```
public class MixMetricsSelector$
extends [MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")
```

Singleton instance of the default MixMetricsSelector, which uses \[akka.cluster.routing.HeapMetricsSelector],
 \[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector]

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.MixMetricsSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MixMetricsSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics")` | `[apply](#apply(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)` | MetricsSelector that combines other selectors and aggregates their capacity  values. |
	| `[MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics")` | `[getInstance](#getInstance())()` | Java API: get the default singleton instance |
	| `scala.Option<scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.MixMetricsSelector))​([MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class akka.cluster.metrics.[MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")
		
		
		`[capacity](MixMetricsSelectorBase.html#capacity(scala.collection.immutable.Set))`
		- ### Methods inherited from class akka.cluster.metrics.[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
		
		
		`[weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Map)), [weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Set))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MixMetricsSelector$
		
		
		
		```
		public MixMetricsSelector$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics") getInstance()
		```
		
		Java API: get the default singleton instance
		- #### apply
		
		
		
		```
		public [MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") apply​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)
		```
		
		MetricsSelector that combines other selectors and aggregates their capacity
		 values. By default it uses \[akka.cluster.routing.HeapMetricsSelector],
		 \[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector]
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")>> unapply​([MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html)*