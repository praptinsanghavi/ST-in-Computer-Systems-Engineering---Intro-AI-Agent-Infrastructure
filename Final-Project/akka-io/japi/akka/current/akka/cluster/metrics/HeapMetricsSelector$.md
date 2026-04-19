---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:02:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/HeapMetricsSelector$.html
title: HeapMetricsSelector$
---

# HeapMetricsSelector$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class HeapMetricsSelector$

- java.lang.Object
- - [akka.cluster.metrics.CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
	- - akka.cluster.metrics.HeapMetricsSelector$

- All Implemented Interfaces:
`[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class HeapMetricsSelector$
extends [CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
implements scala.Product, java.io.Serializable
```

MetricsSelector that uses the heap metrics.
 Low heap capacity \=\> small weight.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.HeapMetricsSelector$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeapMetricsSelector$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[capacity](#capacity(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` | Remaining capacity for each node. |
	| `[HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
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
		public static final [HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeapMetricsSelector$
		
		
		
		```
		public HeapMetricsSelector$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [HeapMetricsSelector$](HeapMetricsSelector$.html "class in akka.cluster.metrics") getInstance()
		```
		
		Java API: get the singleton instance
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

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/HeapMetricsSelector$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/HeapMetricsSelector$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/HeapMetricsSelector$.html)*