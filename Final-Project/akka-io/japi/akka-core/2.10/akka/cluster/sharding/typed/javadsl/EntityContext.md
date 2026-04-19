---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html
title: EntityContext
---

# EntityContext

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class EntityContext\<M\>

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.EntityContext\<M\>

- ---

```
public final class EntityContext<M>
extends java.lang.Object
```

Parameter to `createBehavior` function in `Entity.of`.
 
 Cluster Sharding is often used together with [`EventSourcedBehavior`](../../../../persistence/typed/javadsl/EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")
 for the entities. See more considerations in [`PersistenceId`](../../../../persistence/typed/PersistenceId.html "class in akka.persistence.typed").
 The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:
 

```

 PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
 
```

 param: entityTypeKey the key of the entity type
 param: entityId the business domain identifier of the entity

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityContext](#%3Cinit%3E(akka.cluster.sharding.typed.javadsl.EntityTypeKey,java.lang.String,akka.actor.typed.ActorRef))​([EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityContext.html "type parameter in EntityContext")> entityTypeKey,  java.lang.String entityId,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")> shard)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[getEntityId](#getEntityId())()` |  |
	| `[EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityContext.html "type parameter in EntityContext")>` | `[getEntityTypeKey](#getEntityTypeKey())()` |  |
	| `[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")>` | `[getShard](#getShard())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EntityContext
		
		
		
		```
		public EntityContext​([EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityContext.html "type parameter in EntityContext")> entityTypeKey,
		                     java.lang.String entityId,
		                     [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")> shard)
		```

	- ### Method Detail
	
	
	
		- #### getEntityId
		
		
		
		```
		public java.lang.String getEntityId()
		```
		- #### getEntityTypeKey
		
		
		
		```
		public [EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](EntityContext.html "type parameter in EntityContext")> getEntityTypeKey()
		```
		- #### getShard
		
		
		
		```
		public [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")> getShard()
		```

## Code Examples

### Example 1: Class EntityContext<M>

```text
PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html)*