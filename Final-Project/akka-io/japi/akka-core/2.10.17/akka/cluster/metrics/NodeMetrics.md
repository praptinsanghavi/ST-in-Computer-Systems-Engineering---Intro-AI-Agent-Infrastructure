---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:36:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
title: NodeMetrics
---

# NodeMetrics

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class NodeMetrics

- java.lang.Object
- - akka.cluster.metrics.NodeMetrics

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class NodeMetrics
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

The snapshot of current sampled health metrics for any monitored process.
 Collected and gossipped at regular intervals for dynamic cluster management strategies.
 
 Equality of NodeMetrics is based on its address.
 

 param: address [`Address`](../../actor/Address.html "class in akka.actor") of the node the metrics are gathered at
 param: timestamp the time of sampling, in milliseconds since midnight, January 1, 1970 UTC
 param: metrics the set of sampled [`Metric`](Metric.html "class in akka.cluster.metrics")

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.NodeMetrics)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NodeMetrics](#%3Cinit%3E(akka.actor.Address,long,scala.collection.immutable.Set))​([Address](../../actor/Address.html "class in akka.actor") address,  long timestamp,  scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[address](#address())()` |  |
	| `static [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.actor.Address,long,scala.collection.immutable.Set))​([Address](../../actor/Address.html "class in akka.actor") address,  long timestamp,  scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)` |  |
	| `static scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[apply$default$3](#apply$default$3())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[copy](#copy(akka.actor.Address,long,scala.collection.immutable.Set))​([Address](../../actor/Address.html "class in akka.actor") address,  long timestamp,  scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)` |  |
	| `[Address](../../actor/Address.html "class in akka.actor")` | `[copy$default$1](#copy$default$1())()` |  |
	| `long` | `[copy$default$2](#copy$default$2())()` |  |
	| `scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[copy$default$3](#copy$default$3())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object obj)` |  |
	| `java.lang.Iterable<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[getMetrics](#getMetrics())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[merge](#merge(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") that)` | Returns the most recent data. |
	| `scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[metric](#metric(java.lang.String))​(java.lang.String key)` |  |
	| `scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[metrics](#metrics())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `boolean` | `[sameAs](#sameAs(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") that)` | Returns true if `that` address is the same as this |
	| `long` | `[timestamp](#timestamp())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>>>` | `[unapply](#unapply(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") x$0)` |  |
	| `[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[update](#update(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") that)` | Returns the most recent data with [`EWMA`](EWMA.html "class in akka.cluster.metrics") averaging. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### NodeMetrics
		
		
		
		```
		public NodeMetrics​([Address](../../actor/Address.html "class in akka.actor") address,
		                   long timestamp,
		                   scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$3
		
		
		
		```
		public static scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> $lessinit$greater$default$3()
		```
		- #### apply
		
		
		
		```
		public static [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") apply​([Address](../../actor/Address.html "class in akka.actor") address,
		                                long timestamp,
		                                scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)
		```
		- #### apply$default$3
		
		
		
		```
		public static scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>>> unapply​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") x$0)
		```
		- #### address
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") address()
		```
		- #### timestamp
		
		
		
		```
		public long timestamp()
		```
		- #### metrics
		
		
		
		```
		public scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics()
		```
		- #### merge
		
		
		
		```
		public [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") merge​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") that)
		```
		
		Returns the most recent data.
		- #### update
		
		
		
		```
		public [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") update​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") that)
		```
		
		Returns the most recent data with [`EWMA`](EWMA.html "class in akka.cluster.metrics") averaging.
		- #### metric
		
		
		
		```
		public scala.Option<[Metric](Metric.html "class in akka.cluster.metrics")> metric​(java.lang.String key)
		```
		- #### getMetrics
		
		
		
		```
		public java.lang.Iterable<[Metric](Metric.html "class in akka.cluster.metrics")> getMetrics()
		```
		
		Java API
		- #### sameAs
		
		
		
		```
		public boolean sameAs​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") that)
		```
		
		Returns true if `that` address is the same as this
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object obj)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") copy​([Address](../../actor/Address.html "class in akka.actor") address,
		                        long timestamp,
		                        scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)
		```
		- #### copy$default$1
		
		
		
		```
		public [Address](../../actor/Address.html "class in akka.actor") copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public long copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> copy$default$3()
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
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/EWMA.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html)*