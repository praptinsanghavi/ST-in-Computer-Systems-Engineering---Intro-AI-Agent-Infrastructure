---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer$.html
title: NoAdmissionOptimizer$
---

# NoAdmissionOptimizer$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class NoAdmissionOptimizer$

- java.lang.Object
- - akka.cluster.sharding.internal.NoAdmissionOptimizer$

- ---

```
public class NoAdmissionOptimizer$
extends java.lang.Object
```

INTERNAL API
 
 Disabled admission window proportion optimizer.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoAdmissionOptimizer$](NoAdmissionOptimizer$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoAdmissionOptimizer$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.cluster.sharding.internal.AdmissionOptimizer` | `[apply](#apply(int,akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.AdmissionOptimizer))​(int initialLimit,  akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.AdmissionOptimizer optimizer)` |  |
	| `double` | `[calculateAdjustment](#calculateAdjustment())()` | Calculate an adjustment to the proportion of the admission window. |
	| `void` | `[recordActive](#recordActive())()` | An entity was accessed that is already active. |
	| `void` | `[recordPassive](#recordPassive())()` | An entity was accessed that was passive (needed to be activated). |
	| `void` | `[updateLimit](#updateLimit(int))​(int newLimit)` | The per\-shard limit has been updated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoAdmissionOptimizer$](NoAdmissionOptimizer$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoAdmissionOptimizer$
		
		
		
		```
		public NoAdmissionOptimizer$()
		```

	- ### Method Detail
	
	
	
		- #### recordActive
		
		
		
		```
		public void recordActive()
		```
		
		An entity was accessed that is already active.
		- #### recordPassive
		
		
		
		```
		public void recordPassive()
		```
		
		An entity was accessed that was passive (needed to be activated).
		- #### updateLimit
		
		
		
		```
		public void updateLimit​(int newLimit)
		```
		
		The per\-shard limit has been updated.
		
		Parameters:
		`newLimit` \- the new per\-shard limit
		- #### calculateAdjustment
		
		
		
		```
		public double calculateAdjustment()
		```
		
		Calculate an adjustment to the proportion of the admission window.
		 Can be positive (to grow the window) or negative (to shrink the window).
		 Returns 0\.0 if no adjustment should be made.
		
		Returns:
		the adjustment to make to the admission window proportion
		- #### apply
		
		
		
		```
		public static akka.cluster.sharding.internal.AdmissionOptimizer apply​(int initialLimit,
		                                                                      akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.AdmissionOptimizer optimizer)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoAdmissionOptimizer$.html)*