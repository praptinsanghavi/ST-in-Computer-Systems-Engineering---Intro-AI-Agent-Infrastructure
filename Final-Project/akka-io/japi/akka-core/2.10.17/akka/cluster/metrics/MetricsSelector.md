---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html
title: MetricsSelector
---

# MetricsSelector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Interface MetricsSelector

- All Superinterfaces:
`java.io.Serializable`

All Known Implementing Classes:
`[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")`, `[CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics")`, `[HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics")`, `[MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics")`, `[MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics")`, `[MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")`, `[SystemLoadAverageMetricsSelector$](SystemLoadAverageMetricsSelector$.html "class in akka.cluster.metrics")`

---

```
public interface MetricsSelector
extends java.io.Serializable
```

A MetricsSelector is responsible for producing weights from the node metrics.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` | The weights per address, based on the nodeMetrics. |

- - ### Method Detail
	
	
	
		- #### weights
		
		
		
		```
		scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		
		The weights per address, based on the nodeMetrics.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/SystemLoadAverageMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html)*