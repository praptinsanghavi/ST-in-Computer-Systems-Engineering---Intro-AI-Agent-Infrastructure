---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html
title: MetricsCollector
---

# MetricsCollector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Interface MetricsCollector

- All Superinterfaces:
`java.lang.AutoCloseable`, `java.io.Closeable`

All Known Implementing Classes:
`[JmxMetricsCollector](JmxMetricsCollector.html "class in akka.cluster.metrics")`, `[SigarMetricsCollector](SigarMetricsCollector.html "class in akka.cluster.metrics")`

---

```
public interface MetricsCollector
extends java.io.Closeable
```

Metrics sampler.
 
 Implementations of cluster system metrics collectors extend this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[sample](#sample())()` | Samples and collects new data points. |
	
	
		- ### Methods inherited from interface java.io.Closeable
		
		
		`close`

- - ### Method Detail
	
	
	
		- #### sample
		
		
		
		```
		[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") sample()
		```
		
		Samples and collects new data points.
		 This method is invoked periodically and should return
		 current metrics for this node.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html)*