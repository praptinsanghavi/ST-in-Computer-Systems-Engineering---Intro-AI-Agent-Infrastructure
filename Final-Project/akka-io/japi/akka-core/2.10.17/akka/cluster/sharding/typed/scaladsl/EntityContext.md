---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:30Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityContext.html
title: EntityContext
---

# EntityContext

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Class EntityContext\<M\>

- java.lang.Object
- - akka.cluster.sharding.typed.scaladsl.EntityContext\<M\>

- ---

```
public final class EntityContext<M>
extends java.lang.Object
```

Parameter to `createBehavior` function in `Entity.apply`.
 
 Cluster Sharding is often used together with [`EventSourcedBehavior`](../../../../persistence/typed/scaladsl/EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")
 for the entities. See more considerations in [`PersistenceId`](../../../../persistence/typed/PersistenceId.html "class in akka.persistence.typed").
 The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:
 

```

 PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
 
```

 param: entityTypeKey the key of the entity type
 param: entityId the business domain identifier of the entity

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EntityContext](#%3Cinit%3E(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,java.lang.String,akka.actor.typed.ActorRef))​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](EntityContext.html "type parameter in EntityContext")> entityTypeKey,  java.lang.String entityId,  [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")> shard)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[entityId](#entityId())()` |  |
	| `[EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](EntityContext.html "type parameter in EntityContext")>` | `[entityTypeKey](#entityTypeKey())()` |  |
	| `[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")>` | `[shard](#shard())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EntityContext
		
		
		
		```
		public EntityContext​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](EntityContext.html "type parameter in EntityContext")> entityTypeKey,
		                     java.lang.String entityId,
		                     [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")> shard)
		```

	- ### Method Detail
	
	
	
		- #### entityId
		
		
		
		```
		public java.lang.String entityId()
		```
		- #### entityTypeKey
		
		
		
		```
		public [EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<[M](EntityContext.html "type parameter in EntityContext")> entityTypeKey()
		```
		- #### shard
		
		
		
		```
		public [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")> shard()
		```

## Code Examples

### Example 1: Class EntityContext<M>

```text
PersistenceId(entityContext.entityTypeKey.name, entityContext.entityId)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityContext.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/EntityContext.html)*