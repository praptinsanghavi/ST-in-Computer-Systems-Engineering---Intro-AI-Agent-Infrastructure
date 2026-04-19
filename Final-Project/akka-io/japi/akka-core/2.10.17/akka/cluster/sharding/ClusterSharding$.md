---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
title: ClusterSharding$
---

# ClusterSharding$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterSharding$

- java.lang.Object
- - akka.cluster.sharding.ClusterSharding$

- All Implemented Interfaces:
`[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")>`, `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`

---

```
public class ClusterSharding$
extends java.lang.Object
implements [ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")>, [ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")
```

This extension provides sharding functionality of actors in a cluster.
 The typical use case is when you have many stateful actors that together consume
 more resources (e.g. memory) than fit on one machine.
 \- Distribution: You need to distribute them across several nodes in the cluster
 \- Location Transparency: You need to interact with them using their logical identifier,
 without having to care about their physical location in the cluster, which can change over time.
 
 '''Entities''':
 It could for example be actors representing Aggregate Roots in Domain\-Driven Design
 terminology. Here we call these actors "entities" which typically have persistent
 (durable) state, but this feature is not limited to persistent state actors.
 

 '''Sharding''':
 In this context sharding means that actors with an identifier, or entities,
 can be automatically distributed across multiple nodes in the cluster.
 

 '''ShardRegion''':
 Each entity actor runs only at one place, and messages can be sent to the entity without
 requiring the sender to know the location of the destination actor. This is achieved by
 sending the messages via a `ShardRegion` actor, provided by this extension. The `ShardRegion`
 knows the shard mappings and routes inbound messages to the entity with the entity id.
 Messages to the entities are always sent via the local `ShardRegion`.
 The `ShardRegion` actor is started on each node in the cluster, or group of nodes
 tagged with a specific role. The `ShardRegion` is created with two application specific
 functions to extract the entity identifier and the shard identifier from incoming messages.
 

 Typical usage of this extension:
 1\. At system startup on each cluster node by registering the supported entity types with
 the [`ClusterSharding.start(java.lang.String, akka.actor.Props, akka.cluster.sharding.ClusterShardingSettings, scala.PartialFunction<java.lang.Object, scala.Tuple2<java.lang.String, java.lang.Object>>, scala.Function1<java.lang.Object, java.lang.String>, akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy, java.lang.Object)`](ClusterSharding.html#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ClusterShardingSettings,scala.PartialFunction,scala.Function1,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,java.lang.Object)) method
 1\. Retrieve the `ShardRegion` actor for a named entity type with [`ClusterSharding.shardRegion(java.lang.String)`](ClusterSharding.html#shardRegion(java.lang.String))
 Settings can be configured as described in the `akka.cluster.sharding` section of the `reference.conf`.
 

 '''Shard and ShardCoordinator''':
 A shard is a group of entities that will be managed together. For the first message in a
 specific shard the `ShardRegion` requests the location of the shard from a central
 [`ShardCoordinator`](ShardCoordinator.html "class in akka.cluster.sharding"). The `ShardCoordinator` decides which `ShardRegion`
 owns the shard. The `ShardRegion` receives the decided home of the shard
 and if that is the `ShardRegion` instance itself it will create a local child
 actor representing the entity and direct all messages for that entity to it.
 If the shard home is another `ShardRegion`, instance messages will be forwarded
 to that `ShardRegion` instance instead. While resolving the location of a
 shard, incoming messages for that shard are buffered and later delivered when the
 shard location is known. Subsequent messages to the resolved shard can be delivered
 to the target destination immediately without involving the `ShardCoordinator`.
 To make sure at\-most\-one instance of a specific entity actor is running somewhere
 in the cluster it is important that all nodes have the same view of where the shards
 are located. Therefore the shard allocation decisions are taken by the central
 `ShardCoordinator`, a cluster singleton, i.e. one instance on
 the oldest member among all cluster nodes or a group of nodes tagged with a specific
 role. The oldest member can be determined by [`Member.isOlderThan(akka.cluster.Member)`](../Member.html#isOlderThan(akka.cluster.Member)).
 

 '''Shard Rebalancing''':
 To be able to use newly added members in the cluster the coordinator facilitates rebalancing
 of shards, migrating entities from one node to another. In the rebalance process the
 coordinator first notifies all `ShardRegion` actors that a handoff for a shard has begun.
 `ShardRegion` actors will start buffering incoming messages for that shard, as they do when
 shard location is unknown. During the rebalance process the coordinator will not answer any
 requests for the location of shards that are being rebalanced, i.e. local buffering will
 continue until the handoff is complete. The `ShardRegion` responsible for the rebalanced shard
 will stop all entities in that shard by sending them a `PoisonPill`. When all entities have
 been terminated the `ShardRegion` owning the entities will acknowledge to the coordinator that
 the handoff has completed. Thereafter the coordinator will reply to requests for the location of
 the shard, allocate a new home for the shard and then buffered messages in the
 `ShardRegion` actors are delivered to the new location. This means that the state of the entities
 are not transferred or migrated. If the state of the entities are of importance it should be
 persistent (durable), e.g. with `akka-persistence` so that it can be recovered at the new
 location.
 

 '''Shard Allocation''':
 The logic deciding which shards to rebalance is defined in a plugable shard allocation
 strategy. The default implementation `LeastShardAllocationStrategy`
 picks shards for handoff from the `ShardRegion` with highest number of previously allocated shards.
 They will then be allocated to the `ShardRegion` with lowest number of previously allocated shards,
 i.e. new members in the cluster. This strategy can be replaced by an application
 specific implementation.
 

 '''Recovery''':
 The state of shard locations in the `ShardCoordinator` is stored with `akka-distributed-data` or
 `akka-persistence` to survive failures. When a crashed or unreachable coordinator
 node has been removed (via down) from the cluster a new `ShardCoordinator` singleton
 actor will take over and the state is recovered. During such a failure period shards
 with known location are still available, while messages for new (unknown) shards
 are buffered until the new `ShardCoordinator` becomes available.
 

 '''Delivery Semantics''':
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
 messages the entity actor can send `ShardRegion.Passivate` to its parent `ShardRegion`.
 The specified wrapped message in `Passivate` will be sent back to the entity, which is
 then supposed to stop itself. Incoming messages will be buffered by the `ShardRegion`
 between reception of `Passivate` and termination of the entity. Such buffered messages
 are thereafter delivered to a new incarnation of the entity.

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSharding$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` | Is used by Akka to instantiate the Extension identified by this ExtensionId,  internal use only. |
	| `[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` | Returns an instance of the extension identified by this ExtensionId instance. |
	| `[ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding")` | `[lookup](#lookup())()` | Returns the canonical ExtensionId for this Extension |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")
		
		
		`[apply](../../actor/ExtensionId.html#apply(akka.actor.ActorSystem)), [apply](../../actor/ExtensionId.html#apply(akka.actor.ClassicActorSystemProvider)), [equals](../../actor/ExtensionId.html#equals(java.lang.Object)), [hashCode](../../actor/ExtensionId.html#hashCode())`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ClusterSharding$
		
		
		
		```
		public ClusterSharding$()
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ActorSystem): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")>`
		- #### get
		
		
		
		```
		public [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))`
		Returns an instance of the extension identified by this ExtensionId instance.
		 Java API
		 For extensions written in Scala that are to be used from Java also,
		 this method should be overridden to get correct return type.
		 
		```
		
		 override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
		 
		```
		
		
		
		Specified by:
		`[get](../../actor/ExtensionId.html#get(akka.actor.ClassicActorSystemProvider))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")>`
		- #### lookup
		
		
		
		```
		public [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding") lookup()
		```
		
		Description copied from interface: `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html#lookup())`
		Returns the canonical ExtensionId for this Extension
		
		Specified by:
		`[lookup](../../actor/ExtensionIdProvider.html#lookup())` in interface `[ExtensionIdProvider](../../actor/ExtensionIdProvider.html "interface in akka.actor")`
		- #### createExtension
		
		
		
		```
		public [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		
		Description copied from interface: `[ExtensionId](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))`
		Is used by Akka to instantiate the Extension identified by this ExtensionId,
		 internal use only.
		
		Specified by:
		`[createExtension](../../actor/ExtensionId.html#createExtension(akka.actor.ExtendedActorSystem))` in interface `[ExtensionId](../../actor/ExtensionId.html "interface in akka.actor")<[ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")>`

## Code Examples

### Example 1: get

```text
override def get(system: ActorSystem): TheExtension = super.get(system)
```

### Example 2: get

```text
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html)*