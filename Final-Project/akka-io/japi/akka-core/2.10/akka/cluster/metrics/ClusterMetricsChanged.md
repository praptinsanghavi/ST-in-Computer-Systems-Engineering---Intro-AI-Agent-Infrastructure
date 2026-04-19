---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html
title: ClusterMetricsChanged
---

# ClusterMetricsChanged

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class ClusterMetricsChanged

- java.lang.Object
- - akka.cluster.metrics.ClusterMetricsChanged

- All Implemented Interfaces:
`[ClusterMetricsEvent](ClusterMetricsEvent.html "interface in akka.cluster.metrics")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ClusterMetricsChanged
extends java.lang.Object
implements [ClusterMetricsEvent](ClusterMetricsEvent.html "interface in akka.cluster.metrics"), scala.Product, java.io.Serializable
```

Current snapshot of cluster node metrics.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.ClusterMetricsChanged)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterMetricsChanged](#%3Cinit%3E(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")` | `[apply](#apply(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics")` | `[copy](#copy(scala.collection.immutable.Set))​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)` |  |
	| `scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Iterable<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>` | `[getNodeMetrics](#getNodeMetrics())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>` | `[nodeMetrics](#nodeMetrics())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>>` | `[unapply](#unapply(akka.cluster.metrics.ClusterMetricsChanged))​([ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ClusterMetricsChanged
		
		
		
		```
		public ClusterMetricsChanged​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") apply​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>> unapply​([ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") x$0)
		```
		- #### nodeMetrics
		
		
		
		```
		public scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics()
		```
		- #### getNodeMetrics
		
		
		
		```
		public java.lang.Iterable<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> getNodeMetrics()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [ClusterMetricsChanged](ClusterMetricsChanged.html "class in akka.cluster.metrics") copy​(scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> nodeMetrics)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Set<[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/ClusterMetricsChanged.html)*