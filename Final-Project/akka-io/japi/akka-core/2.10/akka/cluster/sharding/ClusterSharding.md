---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:59:53Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html
title: ClusterSharding
---

# ClusterSharding

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ClusterSharding

- java.lang.Object
- - akka.cluster.sharding.ClusterSharding

- All Implemented Interfaces:
`[Extension](../../actor/Extension.html "interface in akka.actor")`

---

```
public class ClusterSharding
extends java.lang.Object
implements [Extension](../../actor/Extension.html "interface in akka.actor")
```

See Also:
[`ClusterSharding companion object`](ClusterSharding$.html "class in akka.cluster.sharding")

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ClusterSharding](#%3Cinit%3E(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `static T` | `[apply](#apply(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static T` | `[apply](#apply(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `static [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")` | `[createExtension](#createExtension(akka.actor.ExtendedActorSystem))​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)` |  |
	| `[ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding")` | `[defaultShardAllocationStrategy](#defaultShardAllocationStrategy(akka.cluster.sharding.ClusterShardingSettings))​([ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings)` | The default `ShardAllocationStrategy` is configured by `least-shard-allocation-strategy` properties. |
	| `static boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object other)` |  |
	| `static [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")` | `[get](#get(akka.actor.ActorSystem))​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)` |  |
	| `static [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding")` | `[get](#get(akka.actor.ClassicActorSystemProvider))​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)` |  |
	| `java.util.Set<java.lang.String>` | `[getShardTypeNames](#getShardTypeNames())()` | Java API: get all currently defined sharding type names. |
	| `static int` | `[hashCode](#hashCode())()` |  |
	| `static [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding")` | `[lookup](#lookup())()` |  |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[shardRegion](#shardRegion(java.lang.String))​(java.lang.String typeName)` | Retrieve the actor reference of the `ShardRegion` actor responsible for the named entity type. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[shardRegionProxy](#shardRegionProxy(java.lang.String,java.lang.String))​(java.lang.String typeName,  java.lang.String dataCenter)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `scala.collection.immutable.Set<java.lang.String>` | `[shardTypeNames](#shardTypeNames())()` | Scala API: get all currently defined sharding type names. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ClusterShardingSettings,akka.cluster.sharding.ShardRegion.MessageExtractor))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)` | Java/Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor  and functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ClusterShardingSettings,akka.cluster.sharding.ShardRegion.MessageExtractor,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,java.lang.Object))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor,  [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy,  java.lang.Object handOffStopMessage)` | Java/Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor  and functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ClusterShardingSettings,scala.PartialFunction,scala.Function1))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId)` | Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor and  functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ClusterShardingSettings,scala.PartialFunction,scala.Function1,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,java.lang.Object))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId,  [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy,  java.lang.Object handOffStopMessage)` | Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor  and functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ShardRegion.MessageExtractor))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)` | Java/Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor  and functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,scala.PartialFunction,scala.Function1))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId)` | Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor and  functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[start](#start(java.lang.String,akka.actor.Props,scala.PartialFunction,scala.Function1,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,java.lang.Object))​(java.lang.String typeName,  [Props](../../actor/Props.html "class in akka.actor") entityProps,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId,  [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy,  java.lang.Object handOffStopMessage)` | Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor  and functions to extract entity and shard identifier from messages. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[startProxy](#startProxy(java.lang.String,java.util.Optional,akka.cluster.sharding.ShardRegion.MessageExtractor))​(java.lang.String typeName,  java.util.Optional<java.lang.String> role,  akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)` | Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,  i.e. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[startProxy](#startProxy(java.lang.String,java.util.Optional,java.util.Optional,akka.cluster.sharding.ShardRegion.MessageExtractor))​(java.lang.String typeName,  java.util.Optional<java.lang.String> role,  java.util.Optional<java.lang.String> dataCenter,  akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[startProxy](#startProxy(java.lang.String,scala.Option,scala.Option,scala.PartialFunction,scala.Function1))​(java.lang.String typeName,  scala.Option<java.lang.String> role,  scala.Option<java.lang.String> dataCenter,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId)` | Deprecated. Use Akka Distributed Cluster instead. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[startProxy](#startProxy(java.lang.String,scala.Option,scala.PartialFunction,scala.Function1))​(java.lang.String typeName,  scala.Option<java.lang.String> role,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId)` | Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,  i.e. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ClusterSharding
		
		
		
		```
		public ClusterSharding​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```

	- ### Method Detail
	
	
	
		- #### get
		
		
		
		```
		public static [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") get​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### get
		
		
		
		```
		public static [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") get​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### lookup
		
		
		
		```
		public static [ClusterSharding$](ClusterSharding$.html "class in akka.cluster.sharding") lookup()
		```
		- #### createExtension
		
		
		
		```
		public static [ClusterSharding](ClusterSharding.html "class in akka.cluster.sharding") createExtension​([ExtendedActorSystem](../../actor/ExtendedActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ActorSystem](../../actor/ActorSystem.html "class in akka.actor") system)
		```
		- #### apply
		
		
		
		```
		public static T apply​([ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html "interface in akka.actor") system)
		```
		- #### hashCode
		
		
		
		```
		public static final int hashCode()
		```
		- #### equals
		
		
		
		```
		public static final boolean equals​(java.lang.Object other)
		```
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                      scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                      scala.Function1<java.lang.Object,​java.lang.String> extractShardId,
		                      [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy,
		                      java.lang.Object handOffStopMessage)
		```
		
		Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor
		 and functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 This method will start a `ShardRegion` in proxy mode when there is no match between the roles of
		 the current cluster node and the role specified in [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`settings` \- configuration settings, see [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding")
		`extractEntityId` \- partial function to extract the entity id and the message to send to the
		 entity from the incoming message, if the partial function does not match the message will
		 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		`extractShardId` \- function to determine the shard id for an incoming message, only messages
		 that passed the `extractEntityId` will be used
		`allocationStrategy` \- possibility to use a custom shard allocation and
		 rebalancing logic
		`handOffStopMessage` \- the message that will be sent to entities when they are to be stopped
		 for a rebalance or graceful shutdown of a `ShardRegion`, e.g. `PoisonPill`.
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                      scala.Function1<java.lang.Object,​java.lang.String> extractShardId,
		                      [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy,
		                      java.lang.Object handOffStopMessage)
		```
		
		Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor
		 and functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 This method will start a `ShardRegion` in proxy mode when there is no match between the roles of
		 the current cluster node and the role specified in [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`extractEntityId` \- partial function to extract the entity id and the message to send to the
		 entity from the incoming message, if the partial function does not match the message will
		 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		`extractShardId` \- function to determine the shard id for an incoming message, only messages
		 that passed the `extractEntityId` will be used
		`allocationStrategy` \- possibility to use a custom shard allocation and
		 rebalancing logic
		`handOffStopMessage` \- the message that will be sent to entities when they are to be stopped
		 for a rebalance or graceful shutdown of a `ShardRegion`, e.g. `PoisonPill`.
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                      scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                      scala.Function1<java.lang.Object,​java.lang.String> extractShardId)
		```
		
		Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor and
		 functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 The default shard allocation strategy [`ShardCoordinator.LeastShardAllocationStrategy`](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding")
		 is used. [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") is used as `handOffStopMessage`.
		 
		
		
		 This method will start a `ShardRegion` in proxy mode when there is no match between the
		 node roles and the role specified in the [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`settings` \- configuration settings, see [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding")
		`extractEntityId` \- partial function to extract the entity id and the message to send to the
		 entity from the incoming message, if the partial function does not match the message will
		 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		`extractShardId` \- function to determine the shard id for an incoming message, only messages
		 that passed the `extractEntityId` will be used
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                      scala.Function1<java.lang.Object,​java.lang.String> extractShardId)
		```
		
		Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor and
		 functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 The default shard allocation strategy [`ShardCoordinator.LeastShardAllocationStrategy`](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding")
		 is used. [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") is used as `handOffStopMessage`.
		 
		
		
		 This method will start a `ShardRegion` in proxy mode when there is no match between the
		 node roles and the role specified in the [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`extractEntityId` \- partial function to extract the entity id and the message to send to the
		 entity from the incoming message, if the partial function does not match the message will
		 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		`extractShardId` \- function to determine the shard id for an incoming message, only messages
		 that passed the `extractEntityId` will be used
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                      akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor,
		                      [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") allocationStrategy,
		                      java.lang.Object handOffStopMessage)
		```
		
		Java/Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor
		 and functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 This method will start a `ShardRegion` in proxy mode when there is no match between the
		 node roles and the role specified in the [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`settings` \- configuration settings, see [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding")
		`messageExtractor` \- functions to extract the entity id, shard id, and the message to send to the
		 entity from the incoming message, see `ShardRegion.MessageExtractor`
		`allocationStrategy` \- possibility to use a custom shard allocation and
		 rebalancing logic
		`handOffStopMessage` \- the message that will be sent to entities when they are to be stopped
		 for a rebalance or graceful shutdown of a `ShardRegion`, e.g. `PoisonPill`.
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                      akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)
		```
		
		Java/Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor
		 and functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 The default shard allocation strategy [`ShardCoordinator.LeastShardAllocationStrategy`](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding")
		 is used. [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") is used as `handOffStopMessage`.
		 
		
		
		 This method will start a `ShardRegion` in proxy mode when there is no match between the
		 node roles and the role specified in the [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`settings` \- configuration settings, see [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding")
		`messageExtractor` \- functions to extract the entity id, shard id, and the message to send to the
		 entity from the incoming message
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### start
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") start​(java.lang.String typeName,
		                      [Props](../../actor/Props.html "class in akka.actor") entityProps,
		                      akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)
		```
		
		Java/Scala API: Register a named entity type by defining the [`Props`](../../actor/Props.html "class in akka.actor") of the entity actor
		 and functions to extract entity and shard identifier from messages. The `ShardRegion` actor
		 for this type can later be retrieved with the [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 The default shard allocation strategy [`ShardCoordinator.LeastShardAllocationStrategy`](ShardCoordinator.LeastShardAllocationStrategy.html "class in akka.cluster.sharding")
		 is used. [`PoisonPill`](../../actor/PoisonPill.html "class in akka.actor") is used as `handOffStopMessage`.
		 
		
		
		 This method will start a `ShardRegion` in proxy mode when there is no match between the
		 node roles and the role specified in the [`ClusterShardingSettings`](ClusterShardingSettings.html "class in akka.cluster.sharding") passed to this method.
		 
		
		
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`entityProps` \- the `Props` of the entity actors that will be created by the `ShardRegion`
		`messageExtractor` \- functions to extract the entity id, shard id, and the message to send to the
		 entity from the incoming message
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### startProxy
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") startProxy​(java.lang.String typeName,
		                           scala.Option<java.lang.String> role,
		                           scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                           scala.Function1<java.lang.Object,​java.lang.String> extractShardId)
		```
		
		Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
		 i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
		 entity actors itself. The `ShardRegion` actor for this type can later be retrieved with the
		 [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`role` \- specifies that this entity type is located on cluster nodes with a specific role.
		 If the role is not specified all nodes in the cluster are used.
		`extractEntityId` \- partial function to extract the entity id and the message to send to the
		 entity from the incoming message, if the partial function does not match the message will
		 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		`extractShardId` \- function to determine the shard id for an incoming message, only messages
		 that passed the `extractEntityId` will be used
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### startProxy
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") startProxy​(java.lang.String typeName,
		                           scala.Option<java.lang.String> role,
		                           scala.Option<java.lang.String> dataCenter,
		                           scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                           scala.Function1<java.lang.Object,​java.lang.String> extractShardId)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
		 i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
		 entity actors itself. The `ShardRegion` actor for this type can later be retrieved with the
		 [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`role` \- specifies that this entity type is located on cluster nodes with a specific role.
		 If the role is not specified all nodes in the cluster are used.
		`dataCenter` \- The data center of the cluster nodes where the cluster sharding is running.
		 If None then the same data center as current node.
		`extractEntityId` \- partial function to extract the entity id and the message to send to the
		 entity from the incoming message, if the partial function does not match the message will
		 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream
		`extractShardId` \- function to determine the shard id for an incoming message, only messages
		 that passed the `extractEntityId` will be used
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### startProxy
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") startProxy​(java.lang.String typeName,
		                           java.util.Optional<java.lang.String> role,
		                           akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)
		```
		
		Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
		 i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
		 entity actors itself. The `ShardRegion` actor for this type can later be retrieved with the
		 [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`role` \- specifies that this entity type is located on cluster nodes with a specific role.
		 If the role is not specified all nodes in the cluster are used.
		`messageExtractor` \- functions to extract the entity id, shard id, and the message to send to the
		 entity from the incoming message
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### startProxy
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") startProxy​(java.lang.String typeName,
		                           java.util.Optional<java.lang.String> role,
		                           java.util.Optional<java.lang.String> dataCenter,
		                           akka.cluster.sharding.ShardRegion.MessageExtractor messageExtractor)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
		 i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
		 entity actors itself. The `ShardRegion` actor for this type can later be retrieved with the
		 [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) method.
		 
		 Some settings can be configured as described in the `akka.cluster.sharding` section
		 of the `reference.conf`.
		 
		
		
		
		Parameters:
		`typeName` \- the name of the entity type
		`role` \- specifies that this entity type is located on cluster nodes with a specific role.
		 If the role is not specified all nodes in the cluster are used.
		`dataCenter` \- The data center of the cluster nodes where the cluster sharding is running.
		 If None then the same data center as current node.
		`messageExtractor` \- functions to extract the entity id, shard id, and the message to send to the
		 entity from the incoming message
		Returns:
		the actor ref of the `ShardRegion` that is to be responsible for the shard
		- #### shardTypeNames
		
		
		
		```
		public scala.collection.immutable.Set<java.lang.String> shardTypeNames()
		```
		
		Scala API: get all currently defined sharding type names.
		- #### getShardTypeNames
		
		
		
		```
		public java.util.Set<java.lang.String> getShardTypeNames()
		```
		
		Java API: get all currently defined sharding type names.
		- #### shardRegion
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") shardRegion​(java.lang.String typeName)
		```
		
		Retrieve the actor reference of the `ShardRegion` actor responsible for the named entity type.
		 The entity type must be registered with the [`start(java.lang.String, akka.actor.Props, akka.cluster.sharding.ClusterShardingSettings, scala.PartialFunction<java.lang.Object, scala.Tuple2<java.lang.String, java.lang.Object>>, scala.Function1<java.lang.Object, java.lang.String>, akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy, java.lang.Object)`](#start(java.lang.String,akka.actor.Props,akka.cluster.sharding.ClusterShardingSettings,scala.PartialFunction,scala.Function1,akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,java.lang.Object)) or [`startProxy(java.lang.String, scala.Option<java.lang.String>, scala.PartialFunction<java.lang.Object, scala.Tuple2<java.lang.String, java.lang.Object>>, scala.Function1<java.lang.Object, java.lang.String>)`](#startProxy(java.lang.String,scala.Option,scala.PartialFunction,scala.Function1)) method before it
		 can be used here. Messages to the entity is always sent via the `ShardRegion`.
		- #### shardRegionProxy
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") shardRegionProxy​(java.lang.String typeName,
		                                 java.lang.String dataCenter)
		```
		
		Deprecated.
		Use Akka Distributed Cluster instead. Since 2\.10\.0\.
		
		Retrieve the actor reference of the `ShardRegion` actor that will act as a proxy to the
		 named entity type running in another data center. A proxy within the same data center can be accessed
		 with [`shardRegion(java.lang.String)`](#shardRegion(java.lang.String)) instead of this method. The entity type must be registered with the
		 [`startProxy(java.lang.String, scala.Option<java.lang.String>, scala.PartialFunction<java.lang.Object, scala.Tuple2<java.lang.String, java.lang.Object>>, scala.Function1<java.lang.Object, java.lang.String>)`](#startProxy(java.lang.String,scala.Option,scala.PartialFunction,scala.Function1)) method before it can be used here. Messages to the entity is always sent
		 via the `ShardRegion`.
		- #### defaultShardAllocationStrategy
		
		
		
		```
		public [ShardCoordinator.ShardAllocationStrategy](ShardCoordinator.ShardAllocationStrategy.html "interface in akka.cluster.sharding") defaultShardAllocationStrategy​([ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings)
		```
		
		The default `ShardAllocationStrategy` is configured by `least-shard-allocation-strategy` properties.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Extension.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/PoisonPill.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.LeastShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.ShardAllocationStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ClusterSharding.html)*