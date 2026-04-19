---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:59Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsGossip$.html
title: MetricsGossip$
---

# MetricsGossip$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MetricsGossip$

- java.lang.Object
- - akka.cluster.metrics.MetricsGossip$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class MetricsGossip$
extends java.lang.Object
implements java.io.Serializable
```

INTERNAL API

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.MetricsGossip$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MetricsGossip$](MetricsGossip$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MetricsGossip$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.metrics.MetricsGossip` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodes)` | INTERNAL API |
	| `akka.cluster.metrics.MetricsGossip` | `[empty](#empty())()` |  |
	| `scala.Option<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.MetricsGossip))​(akka.cluster.metrics.MetricsGossip x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MetricsGossip$](MetricsGossip$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MetricsGossip$
		
		
		
		```
		public MetricsGossip$()
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public akka.cluster.metrics.MetricsGossip empty()
		```
		- #### apply
		
		
		
		```
		public akka.cluster.metrics.MetricsGossip apply​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodes)
		```
		
		INTERNAL API
		 
		
		Parameters:
		`nodes` \- metrics per node
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>> unapply​(akka.cluster.metrics.MetricsGossip x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsGossip$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsGossip$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsGossip$.html)*