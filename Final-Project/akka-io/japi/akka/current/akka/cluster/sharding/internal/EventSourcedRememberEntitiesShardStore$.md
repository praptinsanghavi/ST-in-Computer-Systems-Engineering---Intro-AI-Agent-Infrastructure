---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EventSourcedRememberEntitiesShardStore$.html
title: EventSourcedRememberEntitiesShardStore$
---

# EventSourcedRememberEntitiesShardStore$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class EventSourcedRememberEntitiesShardStore$

- java.lang.Object
- - akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore$

- ---

```
public class EventSourcedRememberEntitiesShardStore$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSourcedRememberEntitiesShardStore$](EventSourcedRememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSourcedRememberEntitiesShardStore$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.collection.immutable.List<akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.StateChange>` | `[createEntityEvents](#createEntityEvents(scala.collection.immutable.Set,scala.Function1,int))​(scala.collection.immutable.Set<java.lang.String> entityIds,  scala.Function1<scala.collection.immutable.Set<java.lang.String>,​akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.StateChange> eventConstructor,  int batchSize)` |  |
	| `[Props](../../../actor/Props.html "class in akka.actor")` | `[props](#props(java.lang.String,java.lang.String,akka.cluster.sharding.ClusterShardingSettings))​(java.lang.String typeName,  java.lang.String shardId,  [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSourcedRememberEntitiesShardStore$](EventSourcedRememberEntitiesShardStore$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSourcedRememberEntitiesShardStore$
		
		
		
		```
		public EventSourcedRememberEntitiesShardStore$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../../actor/Props.html "class in akka.actor") props​(java.lang.String typeName,
		                   java.lang.String shardId,
		                   [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings)
		```
		- #### createEntityEvents
		
		
		
		```
		public scala.collection.immutable.List<akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.StateChange> createEntityEvents​(scala.collection.immutable.Set<java.lang.String> entityIds,
		                                                                                                                                             scala.Function1<scala.collection.immutable.Set<java.lang.String>,​akka.cluster.sharding.internal.EventSourcedRememberEntitiesShardStore.StateChange> eventConstructor,
		                                                                                                                                             int batchSize)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EventSourcedRememberEntitiesShardStore$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EventSourcedRememberEntitiesShardStore$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/EventSourcedRememberEntitiesShardStore$.html)*