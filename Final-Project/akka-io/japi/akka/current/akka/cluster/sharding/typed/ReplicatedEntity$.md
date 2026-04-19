---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:07Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity$.html
title: ReplicatedEntity$
---

# ReplicatedEntity$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class ReplicatedEntity$

- java.lang.Object
- - akka.cluster.sharding.typed.ReplicatedEntity$

- ---

```
public class ReplicatedEntity$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReplicatedEntity$](ReplicatedEntity$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicatedEntity$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>` | `[apply](#apply(akka.persistence.typed.ReplicaId,akka.cluster.sharding.typed.scaladsl.Entity))​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,  [Entity](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)` | Scala API: Defines the [`Entity`](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl") to use for a given replica, note that the behavior  can be a behavior created with [`ReplicatedEventSourcing`](../../../persistence/typed/scaladsl/ReplicatedEventSourcing.html "class in akka.persistence.typed.scaladsl") or an arbitrary non persistent  [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")  as that requires a single writer and that would cause it to have multiple writers. |
	| `<M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M>` | `[create](#create(akka.persistence.typed.ReplicaId,akka.cluster.sharding.typed.javadsl.Entity))​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,  [Entity](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)` | Java API: Defines the [`Entity`](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl") to use for a given replica, note that the behavior  can be a [`ReplicatedEventSourcedBehavior`](../../../persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl") or an arbitrary non persistent  [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")  as that requires a single writer and that would cause it to have multiple writers. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReplicatedEntity$](ReplicatedEntity$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReplicatedEntity$
		
		
		
		```
		public ReplicatedEntity$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public <M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M> create​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                      [Entity](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)
		```
		
		Java API: Defines the [`Entity`](javadsl/Entity.html "class in akka.cluster.sharding.typed.javadsl") to use for a given replica, note that the behavior
		 can be a [`ReplicatedEventSourcedBehavior`](../../../persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl") or an arbitrary non persistent
		 [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
		 as that requires a single writer and that would cause it to have multiple writers.
		- #### apply
		
		
		
		```
		public <M> [ReplicatedEntity](ReplicatedEntity.html "class in akka.cluster.sharding.typed")<M> apply​([ReplicaId](../../../persistence/typed/ReplicaId.html "class in akka.persistence.typed") replicaId,
		                                     [Entity](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​[ShardingEnvelope](ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> entity)
		```
		
		Scala API: Defines the [`Entity`](scaladsl/Entity.html "class in akka.cluster.sharding.typed.scaladsl") to use for a given replica, note that the behavior
		 can be a behavior created with [`ReplicatedEventSourcing`](../../../persistence/typed/scaladsl/ReplicatedEventSourcing.html "class in akka.persistence.typed.scaladsl") or an arbitrary non persistent
		 [`Behavior`](../../../actor/typed/Behavior.html "class in akka.actor.typed") but must never be a regular [`EventSourcedBehavior`](../../../persistence/typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")
		 as that requires a single writer and that would cause it to have multiple writers.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity$.html
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
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ReplicatedEntity$.html)*