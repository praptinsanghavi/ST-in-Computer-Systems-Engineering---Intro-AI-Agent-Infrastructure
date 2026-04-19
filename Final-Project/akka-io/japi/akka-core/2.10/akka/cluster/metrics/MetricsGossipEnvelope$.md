---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:03:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsGossipEnvelope$.html
title: MetricsGossipEnvelope$
---

# MetricsGossipEnvelope$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class MetricsGossipEnvelope$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object,​akka.cluster.metrics.MetricsGossipEnvelope\>
	- - akka.cluster.metrics.MetricsGossipEnvelope$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object,​akka.cluster.metrics.MetricsGossipEnvelope>`

---

```
public class MetricsGossipEnvelope$
extends scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object,​akka.cluster.metrics.MetricsGossipEnvelope>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.MetricsGossipEnvelope$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [MetricsGossipEnvelope$](MetricsGossipEnvelope$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[MetricsGossipEnvelope$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.metrics.MetricsGossipEnvelope` | `[apply](#apply(akka.actor.Address,akka.cluster.metrics.MetricsGossip,boolean))​([Address](../../actor/Address.html "class in akka.actor") from,  akka.cluster.metrics.MetricsGossip gossip,  boolean reply)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.metrics.MetricsGossipEnvelope))​(akka.cluster.metrics.MetricsGossipEnvelope x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function3
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [MetricsGossipEnvelope$](MetricsGossipEnvelope$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### MetricsGossipEnvelope$
		
		
		
		```
		public MetricsGossipEnvelope$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object,​akka.cluster.metrics.MetricsGossipEnvelope>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object,​akka.cluster.metrics.MetricsGossipEnvelope>`
		- #### apply
		
		
		
		```
		public akka.cluster.metrics.MetricsGossipEnvelope apply​([Address](../../actor/Address.html "class in akka.actor") from,
		                                                        akka.cluster.metrics.MetricsGossip gossip,
		                                                        boolean reply)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[Address](../../actor/Address.html "class in akka.actor"),​akka.cluster.metrics.MetricsGossip,​java.lang.Object>> unapply​(akka.cluster.metrics.MetricsGossipEnvelope x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Address.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsGossipEnvelope$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsGossipEnvelope$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/metrics/MetricsGossipEnvelope$.html)*