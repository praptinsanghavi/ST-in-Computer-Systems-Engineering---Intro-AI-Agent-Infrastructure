---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:37:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics$.html
title: NodeMetrics$
---

# NodeMetrics$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class NodeMetrics$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set\<[Metric](Metric.html "class in akka.cluster.metrics")\>,​[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")\>
	- - akka.cluster.metrics.NodeMetrics$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>,​[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>`

---

```
public class NodeMetrics$
extends scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>,​[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.NodeMetrics$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NodeMetrics$](NodeMetrics$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NodeMetrics$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[$lessinit$greater$default$3](#$lessinit$greater$default$3())()` |  |
	| `[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.actor.Address,long,scala.collection.immutable.Set))​([Address](../../actor/Address.html "class in akka.actor") address,  long timestamp,  scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)` |  |
	| `scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>` | `[apply$default$3](#apply$default$3())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>>>` | `[unapply](#unapply(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NodeMetrics$](NodeMetrics$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NodeMetrics$
		
		
		
		```
		public NodeMetrics$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$3
		
		
		
		```
		public scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> $lessinit$greater$default$3()
		```
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>,​[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>,​[NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics")>`
		- #### apply
		
		
		
		```
		public [NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") apply​([Address](../../actor/Address.html "class in akka.actor") address,
		                         long timestamp,
		                         scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> metrics)
		```
		- #### apply$default$3
		
		
		
		```
		public scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")> apply$default$3()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​scala.collection.immutable.Set<[Metric](Metric.html "class in akka.cluster.metrics")>>> unapply​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/Metric.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/metrics/NodeMetrics$.html)*