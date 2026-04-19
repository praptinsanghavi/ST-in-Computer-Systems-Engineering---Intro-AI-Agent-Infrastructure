---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:37:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics.Cpu$.html
title: StandardMetrics.Cpu$
---

# StandardMetrics.Cpu$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class StandardMetrics.Cpu$

- java.lang.Object
- - akka.cluster.metrics.StandardMetrics.Cpu$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[StandardMetrics](StandardMetrics.html "class in akka.cluster.metrics")

---

```
public static class StandardMetrics.Cpu$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.StandardMetrics.Cpu$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StandardMetrics.Cpu$](StandardMetrics.Cpu$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Cpu$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.actor.Address,long,scala.Option,scala.Option,scala.Option,int))​([Address](../../actor/Address.html "class in akka.actor") address,  long timestamp,  scala.Option<java.lang.Object> systemLoadAverage,  scala.Option<java.lang.Object> cpuCombined,  scala.Option<java.lang.Object> cpuStolen,  int processors)` |  |
	| `scala.Option<scala.Tuple6<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)` | Given a NodeMetrics it returns the Cpu data if the nodeMetrics contains  necessary cpu metrics. |
	| `scala.Option<scala.Tuple6<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.StandardMetrics.Cpu))​([StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StandardMetrics.Cpu$](StandardMetrics.Cpu$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Cpu$
		
		
		
		```
		public Cpu$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​java.lang.Object>> unapply​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)
		```
		
		Given a NodeMetrics it returns the Cpu data if the nodeMetrics contains
		 necessary cpu metrics.
		
		Returns:
		if possible a tuple matching the Cpu constructor parameters
		- #### apply
		
		
		
		```
		public [StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics") apply​([Address](../../actor/Address.html "class in akka.actor") address,
		                                 long timestamp,
		                                 scala.Option<java.lang.Object> systemLoadAverage,
		                                 scala.Option<java.lang.Object> cpuCombined,
		                                 scala.Option<java.lang.Object> cpuStolen,
		                                 int processors)
		```
		
		
		Parameters:
		`address` \- [`Address`](../../actor/Address.html "class in akka.actor") of the node the metrics are gathered at
		`timestamp` \- the time of sampling, in milliseconds since midnight, January 1, 1970 UTC
		`systemLoadAverage` \- OS\-specific average load on the CPUs in the system, for the past 1 minute,
		 The system is possibly nearing a bottleneck if the system load average is nearing number of cpus/cores.
		`cpuCombined` \- combined CPU sum of User \+ Sys \+ Nice \+ Wait, in percentage (\[0\.0 \- 1\.0]. This
		 metric can describe the amount of time the CPU spent executing code during n\-interval and how
		 much more it could theoretically.
		`cpuStolen` \- stolen CPU time, in percentage (\[0\.0 \- 1\.0].
		`processors` \- the number of available processors
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple6<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​scala.Option<java.lang.Object>,​java.lang.Object>> unapply​([StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics.Cpu$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics.Cpu.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics.Cpu$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/StandardMetrics.Cpu$.html)*