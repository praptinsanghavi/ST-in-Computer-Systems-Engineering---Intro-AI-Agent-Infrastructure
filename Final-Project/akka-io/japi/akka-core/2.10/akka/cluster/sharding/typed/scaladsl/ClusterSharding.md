---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:24:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
title: ClusterSharding
---

# ClusterSharding

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Interface ClusterSharding

- All Superinterfaces:
`[Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")`

---

```
public interface ClusterSharding
extends [Extension](../../../../actor/typed/Extension.html "interface in akka.actor.typed")
```

This extension provides sharding functionality of actors in a cluster.
 The typical use case is when you have many stateful actors that together consume
 more resources (e.g. memory) than fit on one machine. You need to distribute them across
 several nodes in the cluster and you want to be able to interact with them using their
 logical identifier, but without having to care about their physical location in the cluster,
 which might also change over time. It could for example be actors representing Aggregate Roots in
 Domain\-Driven Design terminology. Here we call these actors "entities". These actors
 typically have persistent (durable) state, but this feature is not limited to
 actors with persistent state.
 
 In this context sharding means that actors with an identifier, so called entities,
 can be automatically distributed across multiple nodes in the cluster. Each entity
 actor runs only at one place, and messages can be sent to the entity without requiring
 the sender to know the location of the destination actor. This is achieved by sending
 the messages via a `ShardRegion` actor provided by this extension, which knows how
 to route the message with the entity id to the final destination.
 

 This extension is supposed to be used by first, typically at system startup on each node
 in the cluster, registering the supported entity types with the [`init(akka.cluster.sharding.typed.scaladsl.Entity<M, E>)`](#init(akka.cluster.sharding.typed.scaladsl.Entity))
 method, which returns the `ShardRegion` actor reference for a named entity type.
 Messages to the entities are always sent via that `ActorRef`, i.e. the local `ShardRegion`.
 Messages can also be sent via the [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") retrieved with [`entityRefFor(akka.cluster.sharding.typed.scaladsl.EntityTypeKey<M>, java.lang.String)`](#entityRefFor(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,java.lang.String)),
 which will also send via the local `ShardRegion`.
 

 Some settings can be configured as described in the `akka.cluster.sharding`
 section of the `reference.conf`.
 

 The `ShardRegion` actor is started on each node in the cluster, or group of nodes
 tagged with a specific role. The `ShardRegion` is created with a `ShardingMessageExtractor`
 to extract the entity identifier and the shard identifier from incoming messages.
 A shard is a group of entities that will be managed together. For the first message in a
 specific shard the `ShardRegion` requests the location of the shard from a central coordinator,
 the [`ShardCoordinator`](../../ShardCoordinator.html "class in akka.cluster.sharding"). The `ShardCoordinator` decides which `ShardRegion`
 owns the shard. The `ShardRegion` receives the decided home of the shard
 and if that is the `ShardRegion` instance itself it will create a local child
 actor representing the entity and direct all messages for that entity to it.
 If the shard home is another `ShardRegion` instance messages will be forwarded
 to that `ShardRegion` instance instead. While resolving the location of a
 shard incoming messages for that shard are buffered and later delivered when the
 shard location is known. Subsequent messages to the resolved shard can be delivered
 to the target destination immediately without involving the `ShardCoordinator`.
 

 To make sure that at most one instance of a specific entity actor is running somewhere
 in the cluster it is important that all nodes have the same view of where the shards
 are located. Therefore the shard allocation decisions are taken by the central
 `ShardCoordinator`, which is running as a cluster singleton, i.e. one instance on
 the oldest member among all cluster nodes or a group of nodes tagged with a specific
 role. The oldest member can be determined by [`Member.isOlderThan(akka.cluster.Member)`](../../../Member.html#isOlderThan(akka.cluster.Member)).
 

 To be able to use newly added members in the cluster the coordinator facilitates rebalancing
 of shards, i.e. migrate entities from one node to another. In the rebalance process the
 coordinator first notifies all `ShardRegion` actors that a handoff for a shard has started.
 That means they will start buffering incoming messages for that shard, in the same way as if the
 shard location is unknown. During the rebalance process the coordinator will not answer any
 requests for the location of shards that are being rebalanced, i.e. local buffering will
 continue until the handoff is completed. The `ShardRegion` responsible for the rebalanced shard
 will stop all entities in that shard by sending the `handOffMessage` to them. When all entities have
 been terminated the `ShardRegion` owning the entities will acknowledge the handoff as completed
 to the coordinator. Thereafter the coordinator will reply to requests for the location of
 the shard and thereby allocate a new home for the shard and then buffered messages in the
 `ShardRegion` actors are delivered to the new location. This means that the state of the entities
 are not transferred or migrated. If the state of the entities are of importance it should be
 persistent (durable), e.g. with `akka-persistence`, so that it can be recovered at the new
 location.
 

 The logic that decides which shards to rebalance is defined in a plugable shard
 allocation strategy. The default implementation [`ShardCoordinator.LeastShardAllocationStrategy`](../../ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding")
 picks shards for handoff from the `ShardRegion` with most number of previously allocated shards.
 They will then be allocated to the `ShardRegion` with least number of previously allocated shards,
 i.e. new members in the cluster. There is a configurable threshold of how large the difference
 must be to begin the rebalancing. This strategy can be replaced by an application specific
 implementation.
 

 The state of shard locations in the `ShardCoordinator` is stored with `akka-distributed-data` or
 `akka-persistence` to survive failures. When a crashed or unreachable coordinator
 node has been removed (via down) from the cluster a new `ShardCoordinator` singleton
 actor will take over and the state is recovered. During such a failure period shards
 with known location are still available, while messages for new (unknown) shards
 are buffered until the new `ShardCoordinator` becomes available.
 

 As long as a sender uses the same `ShardRegion` actor to deliver messages to an entity
 actor the order of the messages is preserved. As long as the buffer limit is not reached
 messages are delivered on a best effort basis, with at\-most once delivery semantics,
 in the same way as ordinary message sending. Reliable end\-to\-end messaging, with
 at\-least\-once semantics can be added by using `AtLeastOnceDelivery` in `akka-persistence`.
 

 Some additional latency is introduced for messages targeted to new or previously
 unused shards due to the round\-trip to the coordinator. Rebalancing of shards may
 also add latency. This should be considered when designing the application specific
 shard resolution, e.g. to avoid too fine grained shards.
 

 The `ShardRegion` actor can also be started in proxy only mode, i.e. it will not
 host any entities itself, but knows how to delegate messages to the right location.
 

 If the state of the entities are persistent you may stop entities that are not used to
 reduce memory consumption. This is done by the application specific implementation of
 the entity actors for example by defining receive timeout (`context.setReceiveTimeout`).
 If a message is already enqueued to the entity when it stops itself the enqueued message
 in the mailbox will be dropped. To support graceful passivation without losing such
 messages the entity actor can send [`ClusterSharding.Passivate`](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl") to the `ActorRef[ShardCommand]`
 that was passed in to the factory method when creating the entity..
 The specified `stopMessage` message will be sent back to the entity, which is
 then supposed to stop itself. Incoming messages will be buffered by the `ShardRegion`
 between reception of `Passivate` and termination of the entity. Such buffered messages
 are thereafter delivered to a new incarnation of the entity.
 

 This class is not intended for user extension other than for test purposes (e.g.
 stub implementation). More methods may be added in the future and that may break
 such implementations.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[ClusterSharding.Passivate](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl")<[M](ClusterSharding.Passivate.html "type parameter in ClusterSharding.Passivate")>` | The entity can request passivation by sending the [`ClusterSharding.Passivate`](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl") message  to the `ActorRef[ShardCommand]` that was passed in to the factory method  when creating the entity. |
	| `static class` | `[ClusterSharding.Passivate$](ClusterSharding.Passivate$.html "class in akka.cluster.sharding.typed.scaladsl")` |  |
	| `static interface` | `[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")` | When an entity is created an `ActorRef[ShardCommand]` is passed to the  factory method. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[ClusterSharding](../javadsl/ClusterSharding.html "class in akka.cluster.sharding.typed.javadsl")` | `[asJava](#asJava())()` | INTERNAL API |
	| `[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")` | `[defaultShardAllocationStrategy](#defaultShardAllocationStrategy(akka.cluster.sharding.typed.ClusterShardingSettings))​([ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") settings)` | The default `ShardAllocationStrategy` is configured by `least-shard-allocation-strategy` properties. |
	| `<M> [EntityRef](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<M>` | `[entityRefFor](#entityRefFor(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,java.lang.String))​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,  java.lang.String entityId)` | Create an `ActorRef`\-like reference to a specific sharded entity. |
	| `<M> [EntityRef](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<M>` | `[entityRefFor](#entityRefFor(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,java.lang.String,java.lang.String))​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,  java.lang.String entityId,  java.lang.String dataCenter)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `<M,​E>[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<E>` | `[init](#init(akka.cluster.sharding.typed.scaladsl.Entity))​([Entity](Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​E> entity)` | Initialize sharding for the given `entity` factory settings. |
	| `[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")>` | `[shard](#shard(akka.cluster.sharding.typed.scaladsl.EntityTypeKey))​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> typeKey)` | Access to the `ActorRef` to send `ShardCommand` for a given entity type. |
	| `[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterShardingQuery](../ClusterShardingQuery.html "interface in akka.cluster.sharding.typed")>` | `[shardState](#shardState())()` | Actor for querying Cluster Sharding state |

- - ### Method Detail
	
	
	
		- #### init
		
		
		
		```
		<M,​E> [ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<E> init​([Entity](Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​E> entity)
		```
		
		Initialize sharding for the given `entity` factory settings.
		 
		 It will start a shard region or a proxy depending on if the settings require role and if this node has
		 such a role.
		- #### entityRefFor
		
		
		
		```
		<M> [EntityRef](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<M> entityRefFor​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,
		                              java.lang.String entityId)
		```
		
		Create an `ActorRef`\-like reference to a specific sharded entity.
		 
		 You have to correctly specify the type of messages the target can handle via the `typeKey`.
		 
		
		
		 Messages sent through this [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") will be wrapped in a `ShardingEnvelope` including the
		 here provided `entityId`.
		 
		
		
		 This can only be used if the default `ShardingEnvelope` is used, when using custom envelopes or in message
		 entity ids you will need to use the `ActorRef[E]` returned by sharding init for messaging with the sharded actors.
		 
		
		
		 For in\-depth documentation of its semantics, see [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl").
		- #### entityRefFor
		
		
		
		```
		<M> [EntityRef](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl")<M> entityRefFor​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,
		                              java.lang.String entityId,
		                              java.lang.String dataCenter)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		Create an `ActorRef`\-like reference to a specific sharded entity running in another data center.
		 
		 You have to correctly specify the type of messages the target can handle via the `typeKey`.
		 
		
		
		 Messages sent through this [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl") will be wrapped in a `ShardingEnvelope` including the
		 here provided `entityId`.
		 
		
		
		 This can only be used if the default `ShardingEnvelope` is used, when using custom envelopes or in message
		 entity ids you will need to use the `ActorRef[E]` returned by sharding init for messaging with the sharded actors.
		 
		
		
		 For in\-depth documentation of its semantics, see [`EntityRef`](EntityRef.html "interface in akka.cluster.sharding.typed.scaladsl").
		- #### shardState
		
		
		
		```
		[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterShardingQuery](../ClusterShardingQuery.html "interface in akka.cluster.sharding.typed")> shardState()
		```
		
		Actor for querying Cluster Sharding state
		- #### shard
		
		
		
		```
		[ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.scaladsl")> shard​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> typeKey)
		```
		
		Access to the `ActorRef` to send `ShardCommand` for a given entity type. For example
		 [`ClusterSharding.Passivate`](ClusterSharding.Passivate.html "class in akka.cluster.sharding.typed.scaladsl") can be sent to this `ActorRef`. Note that this `ActorRef`
		 is also available in the [`EntityContext`](EntityContext.html "class in akka.cluster.sharding.typed.scaladsl"). The entity type must first be initialized
		 with the `ClusterSharding.init` method.
		- #### defaultShardAllocationStrategy
		
		
		
		```
		[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") defaultShardAllocationStrategy​([ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") settings)
		```
		
		The default `ShardAllocationStrategy` is configured by `least-shard-allocation-strategy` properties.
		- #### asJava
		
		
		
		```
		[ClusterSharding](../javadsl/ClusterSharding.html "class in akka.cluster.sharding.typed.javadsl") asJava()
		```
		
		INTERNAL API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.LeastShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.Passivate.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html)*