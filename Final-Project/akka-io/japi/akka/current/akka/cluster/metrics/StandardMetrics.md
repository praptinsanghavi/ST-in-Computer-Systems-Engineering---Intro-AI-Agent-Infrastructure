---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:03:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.HeapMemory$.html
title: StandardMetrics.HeapMemory$
---

# StandardMetrics.HeapMemory$

## Content

Package [akka.cluster.metrics](package-summary.html)
## Class StandardMetrics.HeapMemory$

- java.lang.Object
- - akka.cluster.metrics.StandardMetrics.HeapMemory$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[StandardMetrics](StandardMetrics.html "class in akka.cluster.metrics")

---

```
public static class StandardMetrics.HeapMemory$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.metrics.StandardMetrics.HeapMemory$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [StandardMetrics.HeapMemory$](StandardMetrics.HeapMemory$.html "class in akka.cluster.metrics")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HeapMemory$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics")` | `[apply](#apply(akka.actor.Address,long,long,long,scala.Option))​([Address](../../actor/Address.html "class in akka.actor") address,  long timestamp,  long used,  long committed,  scala.Option<java.lang.Object> max)` | The amount of used and committed memory will always be \<\= max if max is defined. |
	| `scala.Option<scala.Tuple5<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.cluster.metrics.NodeMetrics))​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)` | Given a NodeMetrics it returns the HeapMemory data if the nodeMetrics contains  necessary heap metrics. |
	| `scala.Option<scala.Tuple5<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.Object>>>` | `[unapply](#unapply(akka.cluster.metrics.StandardMetrics.HeapMemory))​([StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [StandardMetrics.HeapMemory$](StandardMetrics.HeapMemory$.html "class in akka.cluster.metrics") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HeapMemory$
		
		
		
		```
		public HeapMemory$()
		```

	- ### Method Detail
	
	
	
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.Object>>> unapply​([NodeMetrics](NodeMetrics.html "class in akka.cluster.metrics") nodeMetrics)
		```
		
		Given a NodeMetrics it returns the HeapMemory data if the nodeMetrics contains
		 necessary heap metrics.
		
		Returns:
		if possible a tuple matching the HeapMemory constructor parameters
		- #### apply
		
		
		
		```
		public [StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") apply​([Address](../../actor/Address.html "class in akka.actor") address,
		                                        long timestamp,
		                                        long used,
		                                        long committed,
		                                        scala.Option<java.lang.Object> max)
		```
		
		The amount of used and committed memory will always be \<\= max if max is defined.
		 A memory allocation may fail if it attempts to increase the used memory such that used \> committed
		 even if used \<\= max is true (e.g. when the system virtual memory is low).
		 
		
		Parameters:
		`address` \- [`Address`](../../actor/Address.html "class in akka.actor") of the node the metrics are gathered at
		`timestamp` \- the time of sampling, in milliseconds since midnight, January 1, 1970 UTC
		`used` \- the current sum of heap memory used from all heap memory pools (in bytes)
		`committed` \- the current sum of heap memory guaranteed to be available to the JVM
		 from all heap memory pools (in bytes). Committed will always be greater than or equal to used.
		`max` \- the maximum amount of memory (in bytes) that can be used for JVM memory management.
		 Can be undefined on some OS.
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple5<[Address](../../actor/Address.html "class in akka.actor"),​java.lang.Object,​java.lang.Object,​java.lang.Object,​scala.Option<java.lang.Object>>> unapply​([StandardMetrics.HeapMemory](StandardMetrics.HeapMemory.html "class in akka.cluster.metrics") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Address.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/NodeMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.HeapMemory$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.HeapMemory.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.html
- https://doc.akka.io/japi/akka/current/akka/cluster/metrics/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.HeapMemory$.html](https://doc.akka.io/japi/akka/current/akka/cluster/metrics/StandardMetrics.HeapMemory$.html)*