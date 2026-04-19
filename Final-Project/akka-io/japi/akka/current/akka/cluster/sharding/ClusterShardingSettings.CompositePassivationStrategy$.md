---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:07:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html
title: ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$
---

# ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$

- java.lang.Object
- - scala.runtime.AbstractFunction4\<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer\>
	- - akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer>`

Enclosing class:
[ClusterShardingSettings.CompositePassivationStrategy$](ClusterShardingSettings.CompositePassivationStrategy$.html "class in akka.cluster.sharding")

---

```
public static class ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$
extends scala.runtime.AbstractFunction4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$](ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[HillClimbingAdmissionOptimizer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer` | `[apply](#apply(double,double,double,double))​(double adjustMultiplier,  double initialStep,  double restartThreshold,  double stepDecay)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer))​(akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction4
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Function4
		
		
		`apply`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$](ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### HillClimbingAdmissionOptimizer$
		
		
		
		```
		public HillClimbingAdmissionOptimizer$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object,​akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer>`
		- #### apply
		
		
		
		```
		public akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer apply​(double adjustMultiplier,
		                                                                                                                       double initialStep,
		                                                                                                                       double restartThreshold,
		                                                                                                                       double stepDecay)
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple4<java.lang.Object,​java.lang.Object,​java.lang.Object,​java.lang.Object>> unapply​(akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.HillClimbingAdmissionOptimizer x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.CompositePassivationStrategy$.HillClimbingAdmissionOptimizer$.html)*