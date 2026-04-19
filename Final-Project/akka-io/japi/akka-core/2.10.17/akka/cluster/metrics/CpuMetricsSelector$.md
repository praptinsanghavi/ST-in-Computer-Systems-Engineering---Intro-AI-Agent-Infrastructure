---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:51Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CpuMetricsSelector$.html
title: CpuMetricsSelector$
---

# CpuMetricsSelector$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class CpuMetricsSelector$

- java.lang.Object
- - [akka.cluster.metrics.CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
	- - akka.cluster.metrics.CpuMetricsSelector$

- All Implemented Interfaces:
`[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class CpuMetricsSelector$
extends [CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
implements scala.Product, java.io.Serializable
```

MetricsSelector that uses the combined CPU time metrics and stolen CPU time metrics.
 In modern Linux kernels: CpuCombined \+ CpuStolen \+ CpuIdle \= 1\.0 or 100%.
 Combined CPU is sum of User \+ Sys \+ Nice \+ Wait times, as percentage.
 Stolen CPU is the amount of CPU taken away from this virtual machine by the hypervisor, as percentage.
 
 Low CPU capacity \=\> small node weight.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.CpuMetricsSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CpuMetricsSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[capacity](#capacity(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` | Remaining capacity for each node. |
	| `double` | `[factor](#factor())()` | How much extra weight to give to the stolen time. |
	| `[CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.cluster.metrics.[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
		
		
		`[weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Map)), [weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Set))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CpuMetricsSelector$
		
		
		
		```
		public CpuMetricsSelector$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [CpuMetricsSelector$](CpuMetricsSelector$.html "class in akka.cluster.metrics") getInstance()
		```
		
		Java API: get the singleton instance
		- #### factor
		
		
		
		```
		public double factor()
		```
		
		How much extra weight to give to the stolen time.
		- #### capacity
		
		
		
		```
		public scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		
		Description copied from class: `[CapacityMetricsSelector](CapacityMetricsSelector.html#capacity(scala.collection.immutable.Set))`
		Remaining capacity for each node. The value is between
		 0\.0 and 1\.0, where 0\.0 means no remaining capacity (full
		 utilization) and 1\.0 means full remaining capacity (zero
		 utilization).
		
		Specified by:
		`[capacity](CapacityMetricsSelector.html#capacity(scala.collection.immutable.Set))` in class `[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")`
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CpuMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CpuMetricsSelector$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/CpuMetricsSelector$.html)*