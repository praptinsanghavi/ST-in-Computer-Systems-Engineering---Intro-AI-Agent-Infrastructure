---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:49Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector$.html
title: MetricsCollector$
---

# MetricsCollector$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MetricsCollector$

- java.lang.Object
- - akka.cluster.metrics.MetricsCollector$

- ---

```
public class MetricsCollector$
extends java.lang.Object
```

INTERNAL API
 
 Factory to create configured [`MetricsCollector`](MetricsCollector.html "interface in akka.cluster.metrics").
 

 Metrics collector instantiation priority order:
 1\) Provided custom collector
 2\) Internal [`SigarMetricsCollector`](SigarMetricsCollector.html "class in akka.cluster.metrics")
 3\) Internal [`JmxMetricsCollector`](JmxMetricsCollector.html "class in akka.cluster.metrics")

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MetricsCollector$](MetricsCollector$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MetricsCollector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics")` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Try to create collector instance in the order of priority. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MetricsCollector$](MetricsCollector$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MetricsCollector$
		
		
		
		```
		public MetricsCollector$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public [MetricsCollector](MetricsCollector.html "interface in akka.cluster.metrics") apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Try to create collector instance in the order of priority.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/JmxMetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/SigarMetricsCollector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsCollector$.html)*