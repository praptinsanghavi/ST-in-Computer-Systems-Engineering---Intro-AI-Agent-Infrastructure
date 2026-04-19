---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy$.html
title: DisabledEntityPassivationStrategy$
---

# DisabledEntityPassivationStrategy$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class DisabledEntityPassivationStrategy$

- java.lang.Object
- - akka.cluster.sharding.internal.DisabledEntityPassivationStrategy$

- ---

```
public class DisabledEntityPassivationStrategy$
extends java.lang.Object
```

INTERNAL API: No\-op passivation strategy for when automatic passivation is disabled.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DisabledEntityPassivationStrategy$](DisabledEntityPassivationStrategy$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DisabledEntityPassivationStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static akka.cluster.sharding.internal.EntityPassivationStrategy` | `[apply](#apply(akka.cluster.sharding.ClusterShardingSettings,scala.Function0))​([ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  scala.Function0<[Clock](../../../util/Clock.html "interface in akka.util")> clock)` |  |
	| `void` | `[entityTerminated](#entityTerminated(java.lang.String))​(java.lang.String id)` | An entity instance has been terminated and should be removed from active tracking. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[entityTouched](#entityTouched(java.lang.String))​(java.lang.String id)` | An entity instance has been touched. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[intervalPassed](#intervalPassed())()` | Called each time the `scheduledInterval` has passed, if defined. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[limitUpdated](#limitUpdated(int))​(int newLimit)` | The per\-region active entity limit has been updated, which can trigger passivation. |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[scheduledInterval](#scheduledInterval())()` | An optional interval for time\-based passivation strategies. |
	| `scala.collection.immutable.Seq<java.lang.String>` | `[shardsUpdated](#shardsUpdated(int))​(int activeShards)` | Active shards in this region have been updated, which can trigger passivation. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [DisabledEntityPassivationStrategy$](DisabledEntityPassivationStrategy$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DisabledEntityPassivationStrategy$
		
		
		
		```
		public DisabledEntityPassivationStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### limitUpdated
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> limitUpdated​(int newLimit)
		```
		
		The per\-region active entity limit has been updated, which can trigger passivation.
		
		Parameters:
		`newLimit` \- the new per\-region active entity limit
		Returns:
		entities to passivate in the associated shard
		- #### shardsUpdated
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> shardsUpdated​(int activeShards)
		```
		
		Active shards in this region have been updated, which can trigger passivation.
		
		Parameters:
		`activeShards` \- updated number of active shards
		Returns:
		entities to passivate in the associated shard
		- #### entityTouched
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> entityTouched​(java.lang.String id)
		```
		
		An entity instance has been touched. Recorded before message delivery.
		
		Parameters:
		`id` \- entity id for the touched entity instance
		Returns:
		entities to passivate, when active capacity has been reached
		- #### entityTerminated
		
		
		
		```
		public void entityTerminated​(java.lang.String id)
		```
		
		An entity instance has been terminated and should be removed from active tracking.
		
		Parameters:
		`id` \- entity id for the terminated entity instance
		- #### scheduledInterval
		
		
		
		```
		public scala.Option<scala.concurrent.duration.FiniteDuration> scheduledInterval()
		```
		
		An optional interval for time\-based passivation strategies.
		
		Returns:
		the scheduled interval to call the `intervalPassed` method
		- #### intervalPassed
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.String> intervalPassed()
		```
		
		Called each time the `scheduledInterval` has passed, if defined.
		
		Returns:
		entities to passivate, if deemed inactive
		- #### apply
		
		
		
		```
		public static akka.cluster.sharding.internal.EntityPassivationStrategy apply​([ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                                                                             scala.Function0<[Clock](../../../util/Clock.html "interface in akka.util")> clock)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/util/Clock.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/DisabledEntityPassivationStrategy$.html)*