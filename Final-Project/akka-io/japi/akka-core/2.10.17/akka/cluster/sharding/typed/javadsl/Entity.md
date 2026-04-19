---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity.html
title: Entity
---

# Entity

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class Entity\<M,​E\>

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.Entity\<M,​E\>

- ---

```
public final class Entity<M,​E>
extends java.lang.Object
```

Defines how the entity should be created. Used in [`ClusterSharding.init(akka.cluster.sharding.typed.javadsl.Entity<M, E>)`](ClusterSharding.html#init(akka.cluster.sharding.typed.javadsl.Entity)).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Entity](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `java.util.Optional<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")>` | `[allocationStrategy](#allocationStrategy())()` |  |
	| `[Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity")>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[M](Entity.html "type parameter in Entity")>>` | `[createBehavior](#createBehavior())()` |  |
	| `java.util.Optional<java.lang.String>` | `[dataCenter](#dataCenter())()` |  |
	| `[Props](../../../../actor/typed/Props.html "class in akka.actor.typed")` | `[entityProps](#entityProps())()` |  |
	| `java.util.Optional<[ShardingMessageExtractor](../ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[E](Entity.html "type parameter in Entity"),​[M](Entity.html "type parameter in Entity")>>` | `[messageExtractor](#messageExtractor())()` |  |
	| `static <M> [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>>` | `[of](#of(akka.cluster.sharding.typed.javadsl.EntityTypeKey,akka.japi.function.Function))​([EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<M> typeKey,  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")<M>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)` | Defines how the entity should be created. |
	| `java.util.Optional<java.lang.String>` | `[role](#role())()` |  |
	| `java.util.Optional<[ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed")>` | `[settings](#settings())()` |  |
	| `java.util.Optional<[M](Entity.html "type parameter in Entity")>` | `[stopMessage](#stopMessage())()` |  |
	| `[EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity")>` | `[typeKey](#typeKey())()` |  |
	| `[Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")>` | `[withAllocationStrategy](#withAllocationStrategy(akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy))​([ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") newAllocationStrategy)` | Allocation strategy which decides on which nodes to allocate new shards,  [`ClusterSharding.defaultShardAllocationStrategy(akka.cluster.sharding.typed.ClusterShardingSettings)`](ClusterSharding.html#defaultShardAllocationStrategy(akka.cluster.sharding.typed.ClusterShardingSettings)) is used if this is not specified. |
	| `[Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")>` | `[withDataCenter](#withDataCenter(java.lang.String))​(java.lang.String newDataCenter)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")>` | `[withEntityProps](#withEntityProps(akka.actor.typed.Props))​([Props](../../../../actor/typed/Props.html "class in akka.actor.typed") newEntityProps)` | [`Props`](../../../../actor/typed/Props.html "class in akka.actor.typed") of the entity actors, such as dispatcher settings. |
	| `<Envelope> [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​Envelope>` | `[withMessageExtractor](#withMessageExtractor(akka.cluster.sharding.typed.ShardingMessageExtractor))​([ShardingMessageExtractor](../ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<Envelope,​[M](Entity.html "type parameter in Entity")> newExtractor)` | If a `messageExtractor` is not specified the messages are sent to the entities by wrapping  them in `ShardingEnvelope` with the entityId of the recipient actor. |
	| `[Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")>` | `[withRole](#withRole(java.lang.String))​(java.lang.String role)` | Run the Entity actors on nodes with the given role. |
	| `[Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")>` | `[withSettings](#withSettings(akka.cluster.sharding.typed.ClusterShardingSettings))​([ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") newSettings)` | Additional settings, typically loaded from configuration. |
	| `[Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")>` | `[withStopMessage](#withStopMessage(M))​([M](Entity.html "type parameter in Entity") newStopMessage)` | Message sent to an entity to tell it to stop, e.g. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Entity
		
		
		
		```
		public Entity()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public static <M> [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> of​([EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<M> typeKey,
		                                                         [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")<M>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)
		```
		
		Defines how the entity should be created. Used in [`ClusterSharding.init(akka.cluster.sharding.typed.javadsl.Entity<M, E>)`](ClusterSharding.html#init(akka.cluster.sharding.typed.javadsl.Entity)). More optional
		 settings can be defined using the `with` methods of the returned [`Entity`](Entity.html "class in akka.cluster.sharding.typed.javadsl").
		 
		
		Parameters:
		`typeKey` \- A key that uniquely identifies the type of entity in this cluster
		`createBehavior` \- Create the behavior for an entity given a [`EntityContext`](EntityContext.html "class in akka.cluster.sharding.typed.javadsl") (includes entityId)
		- #### createBehavior
		
		
		
		```
		public [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity")>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[M](Entity.html "type parameter in Entity")>> createBehavior()
		```
		- #### typeKey
		
		
		
		```
		public [EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity")> typeKey()
		```
		- #### stopMessage
		
		
		
		```
		public java.util.Optional<[M](Entity.html "type parameter in Entity")> stopMessage()
		```
		- #### entityProps
		
		
		
		```
		public [Props](../../../../actor/typed/Props.html "class in akka.actor.typed") entityProps()
		```
		- #### settings
		
		
		
		```
		public java.util.Optional<[ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed")> settings()
		```
		- #### messageExtractor
		
		
		
		```
		public java.util.Optional<[ShardingMessageExtractor](../ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<[E](Entity.html "type parameter in Entity"),​[M](Entity.html "type parameter in Entity")>> messageExtractor()
		```
		- #### allocationStrategy
		
		
		
		```
		public java.util.Optional<[ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")> allocationStrategy()
		```
		- #### role
		
		
		
		```
		public java.util.Optional<java.lang.String> role()
		```
		- #### dataCenter
		
		
		
		```
		public java.util.Optional<java.lang.String> dataCenter()
		```
		- #### withEntityProps
		
		
		
		```
		public [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")> withEntityProps​([Props](../../../../actor/typed/Props.html "class in akka.actor.typed") newEntityProps)
		```
		
		[`Props`](../../../../actor/typed/Props.html "class in akka.actor.typed") of the entity actors, such as dispatcher settings.
		- #### withSettings
		
		
		
		```
		public [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")> withSettings​([ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding.typed") newSettings)
		```
		
		Additional settings, typically loaded from configuration.
		- #### withStopMessage
		
		
		
		```
		public [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")> withStopMessage​([M](Entity.html "type parameter in Entity") newStopMessage)
		```
		
		Message sent to an entity to tell it to stop, e.g. when rebalanced or passivated.
		 If this is not defined it will be stopped automatically.
		 It can be useful to define a custom stop message if the entity needs to perform
		 some asynchronous cleanup or interactions before stopping.
		- #### withMessageExtractor
		
		
		
		```
		public <Envelope> [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​Envelope> withMessageExtractor​([ShardingMessageExtractor](../ShardingMessageExtractor.html "class in akka.cluster.sharding.typed")<Envelope,​[M](Entity.html "type parameter in Entity")> newExtractor)
		```
		
		If a `messageExtractor` is not specified the messages are sent to the entities by wrapping
		 them in `ShardingEnvelope` with the entityId of the recipient actor. That envelope
		 is used by the `HashCodeMessageExtractor` for extracting entityId and shardId. The number of
		 shards is then defined by `numberOfShards` in `ClusterShardingSettings`, which by default
		 is configured with `akka.cluster.sharding.number-of-shards`.
		- #### withRole
		
		
		
		```
		public [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")> withRole​(java.lang.String role)
		```
		
		Run the Entity actors on nodes with the given role.
		- #### withDataCenter
		
		
		
		```
		public [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")> withDataCenter​(java.lang.String newDataCenter)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		The data center of the cluster nodes where the cluster sharding is running.
		 If the dataCenter is not specified then the same data center as current node. If the given
		 dataCenter does not match the data center of the current node the `ShardRegion` will be started
		 in proxy mode.
		- #### withAllocationStrategy
		
		
		
		```
		public [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<[M](Entity.html "type parameter in Entity"),​[E](Entity.html "type parameter in Entity")> withAllocationStrategy​([ShardCoordinator.ShardAllocationStrategy](../../ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") newAllocationStrategy)
		```
		
		Allocation strategy which decides on which nodes to allocate new shards,
		 [`ClusterSharding.defaultShardAllocationStrategy(akka.cluster.sharding.typed.ClusterShardingSettings)`](ClusterSharding.html#defaultShardAllocationStrategy(akka.cluster.sharding.typed.ClusterShardingSettings)) is used if this is not specified.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/function/Function.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity.html)*