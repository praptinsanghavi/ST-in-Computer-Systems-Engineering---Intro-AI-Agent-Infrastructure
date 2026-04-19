---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities$.html
title: NoActiveEntities$
---

# NoActiveEntities$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class NoActiveEntities$

- java.lang.Object
- - akka.cluster.sharding.internal.NoActiveEntities$

- ---

```
public class NoActiveEntities$
extends java.lang.Object
```

INTERNAL API
 
 Disabled ActiveEntities (for no window in composite passivation strategies).

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [NoActiveEntities$](NoActiveEntities$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[NoActiveEntities$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.cluster.sharding.internal.ActiveEntities` | `[apply](#apply(akka.cluster.sharding.ClusterShardingSettings.PassivationStrategy,boolean,scala.Function0))​([ClusterShardingSettings.PassivationStrategy](../ClusterShardingSettings.PassivationStrategy.html "interface in akka.cluster.sharding") strategy,  boolean idleEnabled,  scala.Function0<[Clock](../../../util/Clock.html "interface in akka.util")> clock)` |  |
	| `boolean` | `[isActive](#isActive(java.lang.String))​(java.lang.String id)` | Check whether the entity id is currently tracked as active. |
	| `void` | `[remove](#remove(java.lang.String))​(java.lang.String id)` | An entity instance should be removed from active tracking. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[removeIdle](#removeIdle(scala.concurrent.duration.FiniteDuration))​(scala.concurrent.duration.FiniteDuration timeout)` | Remove entity instances that have not been active for the given timeout. |
	| `<any>` | `[select](#select())()` | Select the entity that would be passivated by the replacement policy, when active capacity has been reached. |
	| `int` | `[size](#size())()` | The current number of active entities being tracked. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[update](#update(java.lang.String))​(java.lang.String id)` | An entity instance has been touched. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[updateLimit](#updateLimit(int))​(int newLimit)` | The per\-shard active entity limit has been updated, which can trigger passivation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [NoActiveEntities$](NoActiveEntities$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### NoActiveEntities$
		
		
		
		```
		public NoActiveEntities$()
		```

	- ### Method Detail
	
	
	
		- #### size
		
		
		
		```
		public int size()
		```
		
		The current number of active entities being tracked.
		
		Returns:
		size of active entities
		- #### isActive
		
		
		
		```
		public boolean isActive​(java.lang.String id)
		```
		
		Check whether the entity id is currently tracked as active.
		
		Parameters:
		`id` \- the entity id to check
		Returns:
		whether the entity is active
		- #### updateLimit
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> updateLimit​(int newLimit)
		```
		
		The per\-shard active entity limit has been updated, which can trigger passivation.
		
		Parameters:
		`newLimit` \- the new per\-shard active entity limit
		Returns:
		entities to passivate in the associated shard
		- #### update
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> update​(java.lang.String id)
		```
		
		An entity instance has been touched. Recorded before message delivery.
		
		Parameters:
		`id` \- entity id for the touched entity instance
		Returns:
		entities to passivate, when active capacity has been reached
		- #### select
		
		
		
		```
		public <any> select()
		```
		
		Select the entity that would be passivated by the replacement policy, when active capacity has been reached.
		
		Returns:
		entity that would be passivated
		- #### remove
		
		
		
		```
		public void remove​(java.lang.String id)
		```
		
		An entity instance should be removed from active tracking.
		
		Parameters:
		`id` \- entity id for the removed entity instance
		- #### removeIdle
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> removeIdle​(scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Remove entity instances that have not been active for the given timeout.
		
		Parameters:
		`timeout` \- the idle timeout for entities
		Returns:
		entities to passivate, if deemed inactive
		- #### apply
		
		
		
		```
		public static akka.cluster.sharding.internal.ActiveEntities apply​([ClusterShardingSettings.PassivationStrategy](../ClusterShardingSettings.PassivationStrategy.html "interface in akka.cluster.sharding") strategy,
		                                                                  boolean idleEnabled,
		                                                                  scala.Function0<[Clock](../../../util/Clock.html "interface in akka.util")> clock)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.PassivationStrategy.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Clock.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/NoActiveEntities$.html)*