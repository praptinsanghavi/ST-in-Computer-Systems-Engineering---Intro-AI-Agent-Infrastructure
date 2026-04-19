---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:35:25Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingDirectReplication$.html
title: ShardingDirectReplication$
---

# ShardingDirectReplication$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ShardingDirectReplication$

- java.lang.Object
- - akka.cluster.sharding.typed.ShardingDirectReplication$

- ---

```
public class ShardingDirectReplication$
extends java.lang.Object
```

INTERNAL API
 
 Used when sharding Replicated Event Sourced entities in multiple instances of sharding, for example one per DC in a Multi DC
 Akka Cluster.
 

 This actor should be started once on each node where Replicated Event Sourced entities will run (the same nodes that you start
 sharding on). The entities should be set up with `akka.persistence.typed.scaladsl.EventSourcedBehavior.withEventPublishing`
 or [`ReplicatedEventSourcedBehavior.withEventPublishing()`](../../../persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html#withEventPublishing())
 If using [`ReplicatedSharding`](ReplicatedSharding.html "interface in akka.cluster.sharding.typed") the replication can be enabled through `ReplicatedEntityProvider.withDirectReplication`
 instead of starting this actor manually.
 

 Subscribes to locally written events through the event stream and sends the seen events to all the sharded replicas
 which can then fast forward their cross\-replica event streams to improve latency while allowing less frequent poll
 for the cross replica queries. Note that since message delivery is at\-most\-once this can not be the only
 channel for replica events \- the entities must still tail events from the journals of other replicas.
 

 The events are forwarded as [`ShardingEnvelope`](ShardingEnvelope.html "class in akka.cluster.sharding.typed") this will work out of the box both
 by default and with a custom extractor since the envelopes are handled internally.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingDirectReplication$](ShardingDirectReplication$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardingDirectReplication$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingDirectReplication.Command](ShardingDirectReplication.Command.html "interface in akka.cluster.sharding.typed")>` | `[apply](#apply(java.lang.String,scala.Option,scala.collection.immutable.Map))​(java.lang.String typeName,  scala.Option<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> selfReplica,  scala.collection.immutable.Map<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> replicaShardingProxies)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingDirectReplication$](ShardingDirectReplication$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardingDirectReplication$
		
		
		
		```
		public ShardingDirectReplication$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <T> [Behavior](../../../actor/typed/Behavior.html "class in akka.actor.typed")<[ShardingDirectReplication.Command](ShardingDirectReplication.Command.html "interface in akka.cluster.sharding.typed")> apply​(java.lang.String typeName,
		                                                             scala.Option<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")> selfReplica,
		                                                             scala.collection.immutable.Map<[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed"),​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<T>> replicaShardingProxies)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ReplicatedSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingDirectReplication$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingDirectReplication.Command.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingDirectReplication$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingDirectReplication$.html)*