---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:43Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
title: CapacityMetricsSelector
---

# CapacityMetricsSelector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class CapacityMetricsSelector

- java.lang.Object
- - akka.cluster.metrics.CapacityMetricsSelector

- All Implemented Interfaces:
`[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`, `java.io.Serializable`

Direct Known Subclasses:
`[CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics")`, `[HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics")`, `[MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")`, `[SystemLoadAverageMetricsSelector$](SystemLoadAverageMetricsSelector$.html "class in akka.cluster.metrics")`

---

```
public abstract class CapacityMetricsSelector
extends java.lang.Object
implements [MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")
```

A MetricsSelector producing weights from remaining capacity.
 The weights are typically proportional to the remaining capacity.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.CapacityMetricsSelector)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CapacityMetricsSelector](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[capacity](#capacity(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` | Remaining capacity for each node. |
	| `scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity)` | Converts the capacity values to weights. |
	| `scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` | The weights per address, based on the capacity produced by  the nodeMetrics. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CapacityMetricsSelector
		
		
		
		```
		public CapacityMetricsSelector()
		```

	- ### Method Detail
	
	
	
		- #### capacity
		
		
		
		```
		public abstract scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		
		Remaining capacity for each node. The value is between
		 0\.0 and 1\.0, where 0\.0 means no remaining capacity (full
		 utilization) and 1\.0 means full remaining capacity (zero
		 utilization).
		- #### weights
		
		
		
		```
		public scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity)
		```
		
		Converts the capacity values to weights. The node with lowest
		 capacity gets weight 1 (lowest usable capacity is 1%) and other
		 nodes gets weights proportional to their capacity compared to
		 the node with lowest capacity.
		- #### weights
		
		
		
		```
		public scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		
		The weights per address, based on the capacity produced by
		 the nodeMetrics.
		
		Specified by:
		`[weights](MetricsSelector.html#weights(scala.collection.immutable.Set))` in interface `[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html)*