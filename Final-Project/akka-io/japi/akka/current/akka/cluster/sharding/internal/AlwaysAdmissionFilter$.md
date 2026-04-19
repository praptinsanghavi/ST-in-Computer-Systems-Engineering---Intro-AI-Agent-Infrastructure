---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter$.html
title: AlwaysAdmissionFilter$
---

# AlwaysAdmissionFilter$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class AlwaysAdmissionFilter$

- java.lang.Object
- - akka.cluster.sharding.internal.AlwaysAdmissionFilter$

- ---

```
public class AlwaysAdmissionFilter$
extends java.lang.Object
```

INTERNAL API
 
 Disabled admission filter, always admit candidates to the main area.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [AlwaysAdmissionFilter$](AlwaysAdmissionFilter$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AlwaysAdmissionFilter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[admit](#admit(java.lang.String,java.lang.String))​(java.lang.String candidate,  java.lang.String selected)` | Determine whether an entity should be admitted to the main area. |
	| `static akka.cluster.sharding.internal.AdmissionFilter` | `[apply](#apply(int,akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.AdmissionFilter))​(int initialCapacity,  akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.AdmissionFilter filter)` |  |
	| `void` | `[update](#update(java.lang.String))​(java.lang.String id)` | Update the filter when an entity is accessed |
	| `void` | `[updateCapacity](#updateCapacity(int))​(int newCapacity)` | Update the capacity, the per\-shard entity limit. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [AlwaysAdmissionFilter$](AlwaysAdmissionFilter$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### AlwaysAdmissionFilter$
		
		
		
		```
		public AlwaysAdmissionFilter$()
		```

	- ### Method Detail
	
	
	
		- #### updateCapacity
		
		
		
		```
		public void updateCapacity​(int newCapacity)
		```
		
		Update the capacity, the per\-shard entity limit.
		
		Parameters:
		`newCapacity` \- the new capacity for the filter
		- #### update
		
		
		
		```
		public void update​(java.lang.String id)
		```
		
		Update the filter when an entity is accessed
		
		Parameters:
		`id` \- the entity id that has been accessed
		- #### admit
		
		
		
		```
		public boolean admit​(java.lang.String candidate,
		                     java.lang.String selected)
		```
		
		Determine whether an entity should be admitted to the main area.
		 The candidate has been removed from the admission window (according to its replacement policy)
		 and can replace an entity in the main area (selected by its replacement policy).
		 Whichever entity is not admitted or retained will be passivated.
		
		Parameters:
		`candidate` \- the candidate from the window that may be admitted to the main area
		`selected` \- the entity selected from the main area to possibly be replaced by the candidate
		Returns:
		whether to admit the candidate to the main area
		- #### apply
		
		
		
		```
		public static akka.cluster.sharding.internal.AdmissionFilter apply​(int initialCapacity,
		                                                                   akka.cluster.sharding.ClusterShardingSettings.CompositePassivationStrategy.AdmissionFilter filter)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/AlwaysAdmissionFilter$.html)*