---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/CpuMetricsSelector.html
title: CpuMetricsSelector
---

# CpuMetricsSelector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class CpuMetricsSelector

- java.lang.Object
- - akka.cluster.metrics.CpuMetricsSelector

- ---

```
public class CpuMetricsSelector
extends java.lang.Object
```

MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.
 In modern Linux kernels: CpuCombined \+ CpuStolen \+ CpuIdle \= 1\.0 or 100%.
 Combined CPU is sum of User \+ Sys \+ Nice \+ Wait times, as percentage.
 Stolen CPU is the amount of CPU taken away from this virtual machine by the hypervisor, as percentage.
 
 Low CPU capacity \=\> small node weight.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CpuMetricsSelector](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[capacity](#capacity(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	| `abstract static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object that)` |  |
	| `static double` | `[factor](#factor())()` | How much extra weight to give to the stolen time. |
	| `static [CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static int` | `[productArity](#productArity())()` |  |
	| `static java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `static java.lang.String` | `[productElementName](#productElementName(int))​(int n)` |  |
	| `static scala.collection.Iterator<java.lang.String>` | `[productElementNames](#productElementNames())()` |  |
	| `static scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `static java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `static java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity)` |  |
	| `static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### CpuMetricsSelector
		
		
		
		```
		public CpuMetricsSelector()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics") getInstance()
		```
		
		Java API: get the singleton instance
		- #### factor
		
		
		
		```
		public static double factor()
		```
		
		How much extra weight to give to the stolen time.
		- #### capacity
		
		
		
		```
		public static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		- #### productPrefix
		
		
		
		```
		public static java.lang.String productPrefix()
		```
		- #### productArity
		
		
		
		```
		public static int productArity()
		```
		- #### productElement
		
		
		
		```
		public static java.lang.Object productElement​(int x$1)
		```
		- #### productIterator
		
		
		
		```
		public static scala.collection.Iterator<java.lang.Object> productIterator()
		```
		- #### canEqual
		
		
		
		```
		public static boolean canEqual​(java.lang.Object x$1)
		```
		- #### hashCode
		
		
		
		```
		public static int hashCode()
		```
		- #### toString
		
		
		
		```
		public static java.lang.String toString()
		```
		- #### weights
		
		
		
		```
		public static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity)
		```
		- #### weights
		
		
		
		```
		public static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		- #### equals
		
		
		
		```
		public abstract static boolean equals​(java.lang.Object that)
		```
		- #### productElementName
		
		
		
		```
		public static java.lang.String productElementName​(int n)
		```
		- #### productElementNames
		
		
		
		```
		public static scala.collection.Iterator<java.lang.String> productElementNames()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/CpuMetricsSelector.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/CpuMetricsSelector.html)*