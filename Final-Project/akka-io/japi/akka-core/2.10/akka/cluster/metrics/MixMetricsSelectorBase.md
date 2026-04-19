---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
title: MixMetricsSelectorBase
---

# MixMetricsSelectorBase

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MixMetricsSelectorBase

- java.lang.Object
- - [akka.cluster.metrics.CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
	- - akka.cluster.metrics.MixMetricsSelectorBase

- All Implemented Interfaces:
`[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`, `java.io.Serializable`

Direct Known Subclasses:
`[MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics")`, `[MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics")`

---

```
public abstract class MixMetricsSelectorBase
extends [CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
```

Base class for MetricsSelector that combines other selectors and aggregates their capacity.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.MixMetricsSelectorBase)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MixMetricsSelectorBase](#%3Cinit%3E(java.lang.Iterable))​(java.lang.Iterable<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)` | Java API: construct a mix\-selector from a sequence of selectors |
	| `[MixMetricsSelectorBase](#%3Cinit%3E(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[capacity](#capacity(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` | Remaining capacity for each node. |
	
	
		- ### Methods inherited from class akka.cluster.metrics.[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
		
		
		`[weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Map)), [weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Set))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### MixMetricsSelectorBase
		
		
		
		```
		public MixMetricsSelectorBase​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)
		```
		- #### MixMetricsSelectorBase
		
		
		
		```
		public MixMetricsSelectorBase​(java.lang.Iterable<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)
		```
		
		Java API: construct a mix\-selector from a sequence of selectors

	- ### Method Detail
	
	
	
		- #### capacity
		
		
		
		```
		public scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		
		Description copied from class: `[CapacityMetricsSelector](CapacityMetricsSelector.html#capacity(scala.collection.immutable.Set))`
		Remaining capacity for each node. The value is between
		 0\.0 and 1\.0, where 0\.0 means no remaining capacity (full
		 utilization) and 1\.0 means full remaining capacity (zero
		 utilization).
		
		Specified by:
		`[capacity](CapacityMetricsSelector.html#capacity(scala.collection.immutable.Set))` in class `[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html)*