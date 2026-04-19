---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsStrategy$.html
title: ClusterMetricsStrategy$
---

# ClusterMetricsStrategy$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class ClusterMetricsStrategy$

- java.lang.Object
- - akka.cluster.metrics.ClusterMetricsStrategy$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class ClusterMetricsStrategy$
extends java.lang.Object
implements java.io.Serializable
```

Provide custom metrics strategy resources.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.ClusterMetricsStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterMetricsStrategy$](ClusterMetricsStrategy$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMetricsStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")>` | `[metricsDecider](#metricsDecider())()` | [`SupervisorStrategy`](../../actor/SupervisorStrategy.html "class in akka.actor") `Decider` which allows to survive intermittent Sigar native method calls failures. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterMetricsStrategy$](ClusterMetricsStrategy$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterMetricsStrategy$
		
		
		
		```
		public ClusterMetricsStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### metricsDecider
		
		
		
		```
		public scala.PartialFunction<java.lang.Throwable,​[SupervisorStrategy.Directive](../../actor/SupervisorStrategy.Directive.html "interface in akka.actor")> metricsDecider()
		```
		
		[`SupervisorStrategy`](../../actor/SupervisorStrategy.html "class in akka.actor") `Decider` which allows to survive intermittent Sigar native method calls failures.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.Directive.html
- https://doc.akka.io/japi/akka/current/akka/actor/SupervisorStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsStrategy$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/ClusterMetricsStrategy$.html)*