---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:03:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.html
title: StandardMetrics
---

# StandardMetrics

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class StandardMetrics

- java.lang.Object
- - akka.cluster.metrics.StandardMetrics

- ---

```
public class StandardMetrics
extends java.lang.Object
```

Definitions of the built\-in standard metrics.
 
 The following extractors and data structures makes it easy to consume the
 [`NodeMetrics`](NodeMetrics.html "class in akka.cluster.metrics") in for example load balancers.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics")` |  |
	| `static class` | `[StandardMetrics.Cpu$](StandardMetrics.Cpu$.html "class in akka.cluster.metrics")` |  |
	| `static class` | `[StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics")` |  |
	| `static class` | `[StandardMetrics.HeapMemory$](StandardMetrics.HeapMemory$.html "class in akka.cluster.metrics")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[StandardMetrics](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.String` | `[CpuCombined](#CpuCombined())()` | Sum of User \+ Sys \+ Nice \+ Wait. |
	| `static java.lang.String` | `[CpuIdle](#CpuIdle())()` | Amount of CPU time left after combined and stolen are removed. |
	| `static java.lang.String` | `[CpuStolen](#CpuStolen())()` | The amount of CPU 'stolen' from this virtual machine by the hypervisor for other tasks (such as running another virtual machine). |
	| `static [StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics")` | `[extractCpu](#extractCpu(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)` |  |
	| `static [StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics")` | `[extractHeapMemory](#extractHeapMemory(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)` |  |
	| `static java.lang.String` | `[HeapMemoryCommitted](#HeapMemoryCommitted())()` |  |
	| `static java.lang.String` | `[HeapMemoryMax](#HeapMemoryMax())()` |  |
	| `static java.lang.String` | `[HeapMemoryUsed](#HeapMemoryUsed())()` |  |
	| `static java.lang.String` | `[Processors](#Processors())()` |  |
	| `static java.lang.String` | `[SystemLoadAverage](#SystemLoadAverage())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### StandardMetrics
		
		
		
		```
		public StandardMetrics()
		```

	- ### Method Detail
	
	
	
		- #### HeapMemoryUsed
		
		
		
		```
		public static final java.lang.String HeapMemoryUsed()
		```
		- #### HeapMemoryCommitted
		
		
		
		```
		public static final java.lang.String HeapMemoryCommitted()
		```
		- #### HeapMemoryMax
		
		
		
		```
		public static final java.lang.String HeapMemoryMax()
		```
		- #### SystemLoadAverage
		
		
		
		```
		public static final java.lang.String SystemLoadAverage()
		```
		- #### Processors
		
		
		
		```
		public static final java.lang.String Processors()
		```
		- #### CpuCombined
		
		
		
		```
		public static final java.lang.String CpuCombined()
		```
		
		Sum of User \+ Sys \+ Nice \+ Wait. See \`org.hyperic.sigar.CpuPerc\`
		- #### CpuStolen
		
		
		
		```
		public static final java.lang.String CpuStolen()
		```
		
		The amount of CPU 'stolen' from this virtual machine by the hypervisor for other tasks (such as running another virtual machine).
		- #### CpuIdle
		
		
		
		```
		public static final java.lang.String CpuIdle()
		```
		
		Amount of CPU time left after combined and stolen are removed.
		- #### extractHeapMemory
		
		
		
		```
		public static [StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") extractHeapMemory​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)
		```
		- #### extractCpu
		
		
		
		```
		public static [StandardMetrics.Cpu](StandardMetrics.Cpu.html "class in akka.cluster.metrics") extractCpu​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.Cpu$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.Cpu.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.HeapMemory$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.HeapMemory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/StandardMetrics.html)*