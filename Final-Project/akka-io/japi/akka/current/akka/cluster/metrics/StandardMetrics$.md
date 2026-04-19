---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:03:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics$.html
title: StandardMetrics$
---

# StandardMetrics$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class StandardMetrics$

- java.lang.Object
- - akka.cluster.metrics.StandardMetrics$

- ---

```
public class StandardMetrics$
extends java.lang.Object
```

Definitions of the built\-in standard metrics.
 
 The following extractors and data structures makes it easy to consume the
 [`NodeMetrics`](NodeMetrics.html "class in akka.cluster.metrics") in for example load balancers.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StandardMetrics$](StandardMetrics$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StandardMetrics$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[CpuCombined](#CpuCombined())()` | Sum of User \+ Sys \+ Nice \+ Wait. |
	| `java.lang.String` | `[CpuIdle](#CpuIdle())()` | Amount of CPU time left after combined and stolen are removed. |
	| `java.lang.String` | `[CpuStolen](#CpuStolen())()` | The amount of CPU 'stolen' from this virtual machine by the hypervisor for other tasks (such as running another virtual machine). |
	| `[StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics")` | `[extractCpu](#extractCpu(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)` |  |
	| `[StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics")` | `[extractHeapMemory](#extractHeapMemory(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)` |  |
	| `java.lang.String` | `[HeapMemoryCommitted](#HeapMemoryCommitted())()` |  |
	| `java.lang.String` | `[HeapMemoryMax](#HeapMemoryMax())()` |  |
	| `java.lang.String` | `[HeapMemoryUsed](#HeapMemoryUsed())()` |  |
	| `java.lang.String` | `[Processors](#Processors())()` |  |
	| `java.lang.String` | `[SystemLoadAverage](#SystemLoadAverage())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StandardMetrics$](StandardMetrics$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### StandardMetrics$
		
		
		
		```
		public StandardMetrics$()
		```

	- ### Method Detail
	
	
	
		- #### HeapMemoryUsed
		
		
		
		```
		public final java.lang.String HeapMemoryUsed()
		```
		- #### HeapMemoryCommitted
		
		
		
		```
		public final java.lang.String HeapMemoryCommitted()
		```
		- #### HeapMemoryMax
		
		
		
		```
		public final java.lang.String HeapMemoryMax()
		```
		- #### SystemLoadAverage
		
		
		
		```
		public final java.lang.String SystemLoadAverage()
		```
		- #### Processors
		
		
		
		```
		public final java.lang.String Processors()
		```
		- #### CpuCombined
		
		
		
		```
		public final java.lang.String CpuCombined()
		```
		
		Sum of User \+ Sys \+ Nice \+ Wait. See \`org.hyperic.sigar.CpuPerc\`
		- #### CpuStolen
		
		
		
		```
		public final java.lang.String CpuStolen()
		```
		
		The amount of CPU 'stolen' from this virtual machine by the hypervisor for other tasks (such as running another virtual machine).
		- #### CpuIdle
		
		
		
		```
		public final java.lang.String CpuIdle()
		```
		
		Amount of CPU time left after combined and stolen are removed.
		- #### extractHeapMemory
		
		
		
		```
		public [StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") extractHeapMemory​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)
		```
		- #### extractCpu
		
		
		
		```
		public [StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics") extractCpu​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.Cpu.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.HeapMemory.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics$.html)*