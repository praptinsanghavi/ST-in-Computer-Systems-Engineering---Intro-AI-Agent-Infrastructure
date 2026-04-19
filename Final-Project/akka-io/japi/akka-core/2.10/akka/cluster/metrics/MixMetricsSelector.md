---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html
title: MixMetricsSelector
---

# MixMetricsSelector

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MixMetricsSelector

- java.lang.Object
- - [akka.cluster.metrics.CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
	- - [akka.cluster.metrics.MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")
		- - akka.cluster.metrics.MixMetricsSelector

- All Implemented Interfaces:
`[MetricsSelector](MetricsSelector.html "interface in akka.cluster.metrics")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class MixMetricsSelector
extends [MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.MixMetricsSelector)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MixMetricsSelector](#%3Cinit%3E(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics")` | `[apply](#apply(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)` | MetricsSelector that combines other selectors and aggregates their capacity  values. |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[capacity](#capacity(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	| `[MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics")` | `[copy](#copy(scala.collection.immutable.IndexedSeq))​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)` |  |
	| `scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `static [MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics")` | `[getInstance](#getInstance())()` | Java API: get the default singleton instance |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")>` | `[selectors](#selectors())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.MixMetricsSelector))​([MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") x$0)` |  |
	| `static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Map))​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity)` |  |
	| `static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object>` | `[weights](#weights(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	
	
		- ### Methods inherited from class akka.cluster.metrics.[MixMetricsSelectorBase](MixMetricsSelectorBase.html "class in akka.cluster.metrics")
		
		
		`[capacity](MixMetricsSelectorBase.html#capacity(scala.collection.immutable.Set))`
		- ### Methods inherited from class akka.cluster.metrics.[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")
		
		
		`[weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Map)), [weights](CapacityMetricsSelector.html#weights(scala.collection.immutable.Set))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### MixMetricsSelector
		
		
		
		```
		public MixMetricsSelector​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public static [MixMetricsSelector$](MixMetricsSelector$.html "class in akka.cluster.metrics") getInstance()
		```
		
		Java API: get the default singleton instance
		- #### apply
		
		
		
		```
		public static [MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") apply​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)
		```
		
		MetricsSelector that combines other selectors and aggregates their capacity
		 values. By default it uses \[akka.cluster.routing.HeapMetricsSelector],
		 \[akka.cluster.routing.CpuMetricsSelector], and \[akka.cluster.routing.SystemLoadAverageMetricsSelector]
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")>> unapply​([MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") x$0)
		```
		- #### weights
		
		
		
		```
		public static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity)
		```
		- #### weights
		
		
		
		```
		public static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> weights​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		- #### capacity
		
		
		
		```
		public static scala.collection.immutable.Map<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object> capacity​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		- #### selectors
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors()
		```
		- #### copy
		
		
		
		```
		public [MixMetricsSelector](MixMetricsSelector.html "class in akka.cluster.metrics") copy​(scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> selectors)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.IndexedSeq<[CapacityMetricsSelector](CapacityMetricsSelector.html "class in akka.cluster.metrics")> copy$default$1()
		```
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
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/CapacityMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelectorBase.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MixMetricsSelector.html)*