---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:05Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity.html
title: ReplicatedEntity
---

# ReplicatedEntity

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ReplicatedEntity\<M\>

- java.lang.Object
- - akka.cluster.sharding.typed.ReplicatedEntity\<M\>

- ---

```
public final class ReplicatedEntity<M>
extends java.lang.Object
```

Settings for a specific replica id in replicated sharding
 Currently only Entity's with ShardingEnvelope are supported but this may change in the future

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEntity](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>` | `[apply](#apply(akka.persistence.typed.ReplicaId,akka.cluster.sharding.typed.scaladsl.Entity))​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,  [Entity](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)` | Scala API: Defines the [`Entity`](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl") to use for a given replica, note that the behavior  can be a behavior created with [`ReplicatedEventSourcing`](../../../persistence/typed/scaladsl/ReplicatedEventSourcing.html "class in akka.persistence.typed.scaladsl") or an arbitrary non persistent  [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")  as that requires a single writer and that would cause it to have multiple writers. |
	| `static <M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>` | `[create](#create(akka.persistence.typed.ReplicaId,akka.cluster.sharding.typed.javadsl.Entity))​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,  [Entity](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)` | Java API: Defines the [`Entity`](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl") to use for a given replica, note that the behavior  can be a [`ReplicatedEventSourcedBehavior`](../../../persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl") or an arbitrary non persistent  [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")  as that requires a single writer and that would cause it to have multiple writers. |
	| `[Entity](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl")<[M](ReplicatedEntity.html "type parameter in ReplicatedEntity"),​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](ReplicatedEntity.html "type parameter in ReplicatedEntity")>>` | `[entity](#entity())()` |  |
	| `[ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed")` | `[replicaId](#replicaId())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ReplicatedEntity
		
		
		
		```
		public ReplicatedEntity()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static <M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M> create​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                             [Entity](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)
		```
		
		Java API: Defines the [`Entity`](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl") to use for a given replica, note that the behavior
		 can be a [`ReplicatedEventSourcedBehavior`](../../../persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl") or an arbitrary non persistent
		 [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
		 as that requires a single writer and that would cause it to have multiple writers.
		- #### apply
		
		
		
		```
		public static <M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M> apply​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                            [Entity](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)
		```
		
		Scala API: Defines the [`Entity`](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl") to use for a given replica, note that the behavior
		 can be a behavior created with [`ReplicatedEventSourcing`](../../../persistence/typed/scaladsl/ReplicatedEventSourcing.html "class in akka.persistence.typed.scaladsl") or an arbitrary non persistent
		 [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")
		 as that requires a single writer and that would cause it to have multiple writers.
		- #### replicaId
		
		
		
		```
		public [ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId()
		```
		- #### entity
		
		
		
		```
		public [Entity](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl")<[M](ReplicatedEntity.html "type parameter in ReplicatedEntity"),​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<[M](ReplicatedEntity.html "type parameter in ReplicatedEntity")>> entity()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity.html)*