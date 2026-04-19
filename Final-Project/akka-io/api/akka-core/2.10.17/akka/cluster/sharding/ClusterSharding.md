---
description: Akka 2.10.17 - akka.cluster.sharding.ClusterSharding
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:22:53Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ClusterSharding.html
title: Akka 2.10.17 - akka.cluster.sharding.ClusterSharding
---

# Akka 2.10.17 - akka.cluster.sharding.ClusterSharding

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ClusterSharding

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/cluster/index.html "Permalink")  package [cluster](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](index.html)Definition Classes[cluster](../index.html)
- [**](../../../akka/cluster/sharding/external/index.html "Permalink")  package [external](external/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/protobuf/index.html "Permalink")  package [protobuf](protobuf/index.html)Definition Classes[sharding](index.html)
- [**](../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](typed/index.html)Definition Classes[sharding](index.html)
- ClusterSharding
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[c](ClusterSharding$.html "See companion object")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ClusterSharding](ClusterSharding$.html "See companion object")[**](../../../akka/cluster/sharding/ClusterSharding.html "Permalink")

### Companion [object ClusterSharding](ClusterSharding$.html "See companion object")

#### class ClusterSharding extends [Extension](../../actor/Extension.html)

Annotations@nowarn() Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ClusterSharding.scala#L175)See also[ClusterSharding companion object](ClusterSharding$.html)

Linear Supertypes[Extension](../../actor/Extension.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSharding
2. Extension
3. AnyRef
4. Any
Implicitly  
1. by any2stringadd
2. by StringFormat
3. by Ensuring
4. by ArrowAssoc
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../../akka/cluster/sharding/ClusterSharding.html#<init>(system:akka.actor.ExtendedActorSystem):akka.cluster.sharding.ClusterSharding "Permalink")  new ClusterSharding(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html))
### Value Members

1. [**](../../../akka/cluster/sharding/ClusterSharding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ClusterSharding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ClusterSharding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSharding toany2stringadd\[ClusterSharding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../akka/cluster/sharding/ClusterSharding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSharding, B)ImplicitThis member is added by an implicit conversion from ClusterSharding toArrowAssoc\[ClusterSharding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../akka/cluster/sharding/ClusterSharding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../akka/cluster/sharding/ClusterSharding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ClusterSharding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ClusterSharding.html#defaultShardAllocationStrategy(settings:akka.cluster.sharding.ClusterShardingSettings):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy "Permalink")  def defaultShardAllocationStrategy(settings: [ClusterShardingSettings](ClusterShardingSettings.html)): [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html)The default `ShardAllocationStrategy` is configured by `least-shard-allocation-strategy` properties.
9. [**](../../../akka/cluster/sharding/ClusterSharding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSharding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../akka/cluster/sharding/ClusterSharding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSharding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../akka/cluster/sharding/ClusterSharding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../akka/cluster/sharding/ClusterSharding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
13. [**](../../../akka/cluster/sharding/ClusterSharding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/cluster/sharding/ClusterSharding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/cluster/sharding/ClusterSharding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../akka/cluster/sharding/ClusterSharding.html#getShardTypeNames:java.util.Set[String] "Permalink")  def getShardTypeNames: [Set](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]Java API: get all currently defined sharding type names.
17. [**](../../../akka/cluster/sharding/ClusterSharding.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ClusterSharding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
19. [**](../../../akka/cluster/sharding/ClusterSharding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/cluster/sharding/ClusterSharding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
21. [**](../../../akka/cluster/sharding/ClusterSharding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
22. [**](../../../akka/cluster/sharding/ClusterSharding.html#shardRegion(typeName:String):akka.actor.ActorRef "Permalink")  def shardRegion(typeName: String): [ActorRef](../../actor/ActorRef.html)Retrieve the actor reference of the ShardRegion actor responsible for the named entity type.

Retrieve the actor reference of the ShardRegion actor responsible for the named entity type.
The entity type must be registered with the [\#start](#start(typeName:String,entityProps:akka.actor.Props,messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef) or [\#startProxy](#startProxy(typeName:String,role:java.util.Optional[String],messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef) method before it
can be used here. Messages to the entity is always sent via the `ShardRegion`.
23. [**](../../../akka/cluster/sharding/ClusterSharding.html#shardTypeNames:scala.collection.immutable.Set[String] "Permalink")  def shardTypeNames: [Set](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Set.html#scala.collection.immutable.Set)\[String]Scala API: get all currently defined sharding type names.
24. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), messageExtractor: [MessageExtractor](ShardRegion$$MessageExtractor.html)): [ActorRef](../../actor/ActorRef.html)Java/Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages.

Java/Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

The default shard allocation strategy [ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html)
is used. [akka.actor.PoisonPill](../../actor/PoisonPill.html) is used as `handOffStopMessage`.

This method will start a ShardRegion in proxy mode when there is no match between the
node roles and the role specified in the [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

messageExtractorfunctions to extract the entity id, shard id, and the message to send to the
 entity from the incoming message

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
25. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,settings:akka.cluster.sharding.ClusterShardingSettings,messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), settings: [ClusterShardingSettings](ClusterShardingSettings.html), messageExtractor: [MessageExtractor](ShardRegion$$MessageExtractor.html)): [ActorRef](../../actor/ActorRef.html)Java/Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages.

Java/Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

The default shard allocation strategy [ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html)
is used. [akka.actor.PoisonPill](../../actor/PoisonPill.html) is used as `handOffStopMessage`.

This method will start a ShardRegion in proxy mode when there is no match between the
node roles and the role specified in the [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

settingsconfiguration settings, see [ClusterShardingSettings](ClusterShardingSettings.html)

messageExtractorfunctions to extract the entity id, shard id, and the message to send to the
 entity from the incoming message

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
26. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,settings:akka.cluster.sharding.ClusterShardingSettings,messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor,allocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,handOffStopMessage:Any):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), settings: [ClusterShardingSettings](ClusterShardingSettings.html), messageExtractor: [MessageExtractor](ShardRegion$$MessageExtractor.html), allocationStrategy: [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html), handOffStopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [ActorRef](../../actor/ActorRef.html)Java/Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages.

Java/Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

This method will start a ShardRegion in proxy mode when there is no match between the
node roles and the role specified in the [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

settingsconfiguration settings, see [ClusterShardingSettings](ClusterShardingSettings.html)

messageExtractorfunctions to extract the entity id, shard id, and the message to send to the
 entity from the incoming message, see [ShardRegion.MessageExtractor](ShardRegion$$MessageExtractor.html)

allocationStrategypossibility to use a custom shard allocation and
 rebalancing logic

handOffStopMessagethe message that will be sent to entities when they are to be stopped
 for a rebalance or graceful shutdown of a `ShardRegion`, e.g. `PoisonPill`.

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
27. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,extractEntityId:akka.cluster.sharding.ShardRegion.ExtractEntityId,extractShardId:akka.cluster.sharding.ShardRegion.ExtractShardId):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), extractEntityId: [ExtractEntityId](ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]), extractShardId: [ExtractShardId](ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId)): [ActorRef](../../actor/ActorRef.html)Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor and
functions to extract entity and shard identifier from messages.

Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor and
functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

The default shard allocation strategy [ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html)
is used. [akka.actor.PoisonPill](../../actor/PoisonPill.html) is used as `handOffStopMessage`.

This method will start a ShardRegion in proxy mode when there is no match between the
node roles and the role specified in the [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

extractEntityIdpartial function to extract the entity id and the message to send to the
 entity from the incoming message, if the partial function does not match the message will
 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

extractShardIdfunction to determine the shard id for an incoming message, only messages
 that passed the `extractEntityId` will be used

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
28. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,settings:akka.cluster.sharding.ClusterShardingSettings,extractEntityId:akka.cluster.sharding.ShardRegion.ExtractEntityId,extractShardId:akka.cluster.sharding.ShardRegion.ExtractShardId):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), settings: [ClusterShardingSettings](ClusterShardingSettings.html), extractEntityId: [ExtractEntityId](ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]), extractShardId: [ExtractShardId](ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId)): [ActorRef](../../actor/ActorRef.html)Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor and
functions to extract entity and shard identifier from messages.

Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor and
functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

The default shard allocation strategy [ShardCoordinator.LeastShardAllocationStrategy](ShardCoordinator$$LeastShardAllocationStrategy.html)
is used. [akka.actor.PoisonPill](../../actor/PoisonPill.html) is used as `handOffStopMessage`.

This method will start a ShardRegion in proxy mode when there is no match between the
node roles and the role specified in the [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

settingsconfiguration settings, see [ClusterShardingSettings](ClusterShardingSettings.html)

extractEntityIdpartial function to extract the entity id and the message to send to the
 entity from the incoming message, if the partial function does not match the message will
 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

extractShardIdfunction to determine the shard id for an incoming message, only messages
 that passed the `extractEntityId` will be used

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
29. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,extractEntityId:akka.cluster.sharding.ShardRegion.ExtractEntityId,extractShardId:akka.cluster.sharding.ShardRegion.ExtractShardId,allocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,handOffStopMessage:Any):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), extractEntityId: [ExtractEntityId](ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]), extractShardId: [ExtractShardId](ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId), allocationStrategy: [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html), handOffStopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [ActorRef](../../actor/ActorRef.html)Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages.

Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

This method will start a ShardRegion in proxy mode when there is no match between the roles of
the current cluster node and the role specified in [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

extractEntityIdpartial function to extract the entity id and the message to send to the
 entity from the incoming message, if the partial function does not match the message will
 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

extractShardIdfunction to determine the shard id for an incoming message, only messages
 that passed the `extractEntityId` will be used

allocationStrategypossibility to use a custom shard allocation and
 rebalancing logic

handOffStopMessagethe message that will be sent to entities when they are to be stopped
 for a rebalance or graceful shutdown of a `ShardRegion`, e.g. `PoisonPill`.

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
30. [**](../../../akka/cluster/sharding/ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,settings:akka.cluster.sharding.ClusterShardingSettings,extractEntityId:akka.cluster.sharding.ShardRegion.ExtractEntityId,extractShardId:akka.cluster.sharding.ShardRegion.ExtractShardId,allocationStrategy:akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy,handOffStopMessage:Any):akka.actor.ActorRef "Permalink")  def start(typeName: String, entityProps: [Props](../../actor/Props.html), settings: [ClusterShardingSettings](ClusterShardingSettings.html), extractEntityId: [ExtractEntityId](ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]), extractShardId: [ExtractShardId](ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId), allocationStrategy: [ShardAllocationStrategy](ShardCoordinator$$ShardAllocationStrategy.html), handOffStopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [ActorRef](../../actor/ActorRef.html)Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages.

Scala API: Register a named entity type by defining the [akka.actor.Props](../../actor/Props.html) of the entity actor
and functions to extract entity and shard identifier from messages. The ShardRegion actor
for this type can later be retrieved with the [shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

This method will start a ShardRegion in proxy mode when there is no match between the roles of
the current cluster node and the role specified in [ClusterShardingSettings](ClusterShardingSettings.html) passed to this method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

entityPropsthe `Props` of the entity actors that will be created by the `ShardRegion`

settingsconfiguration settings, see [ClusterShardingSettings](ClusterShardingSettings.html)

extractEntityIdpartial function to extract the entity id and the message to send to the
 entity from the incoming message, if the partial function does not match the message will
 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

extractShardIdfunction to determine the shard id for an incoming message, only messages
 that passed the `extractEntityId` will be used

allocationStrategypossibility to use a custom shard allocation and
 rebalancing logic

handOffStopMessagethe message that will be sent to entities when they are to be stopped
 for a rebalance or graceful shutdown of a `ShardRegion`, e.g. `PoisonPill`.

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
31. [**](../../../akka/cluster/sharding/ClusterSharding.html#startProxy(typeName:String,role:java.util.Optional[String],messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef "Permalink")  def startProxy(typeName: String, role: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], messageExtractor: [MessageExtractor](ShardRegion$$MessageExtractor.html)): [ActorRef](../../actor/ActorRef.html)Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e.

Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
entity actors itself. The ShardRegion actor for this type can later be retrieved with the
[\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

rolespecifies that this entity type is located on cluster nodes with a specific role.
 If the role is not specified all nodes in the cluster are used.

messageExtractorfunctions to extract the entity id, shard id, and the message to send to the
 entity from the incoming message

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
32. [**](../../../akka/cluster/sharding/ClusterSharding.html#startProxy(typeName:String,role:Option[String],extractEntityId:akka.cluster.sharding.ShardRegion.ExtractEntityId,extractShardId:akka.cluster.sharding.ShardRegion.ExtractShardId):akka.actor.ActorRef "Permalink")  def startProxy(typeName: String, role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], extractEntityId: [ExtractEntityId](ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]), extractShardId: [ExtractShardId](ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId)): [ActorRef](../../actor/ActorRef.html)Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e.

Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
entity actors itself. The ShardRegion actor for this type can later be retrieved with the
[\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

rolespecifies that this entity type is located on cluster nodes with a specific role.
 If the role is not specified all nodes in the cluster are used.

extractEntityIdpartial function to extract the entity id and the message to send to the
 entity from the incoming message, if the partial function does not match the message will
 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

extractShardIdfunction to determine the shard id for an incoming message, only messages
 that passed the `extractEntityId` will be used

returnsthe actor ref of the ShardRegion that is to be responsible for the shard
33. [**](../../../akka/cluster/sharding/ClusterSharding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
34. [**](../../../akka/cluster/sharding/ClusterSharding.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
35. [**](../../../akka/cluster/sharding/ClusterSharding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
36. [**](../../../akka/cluster/sharding/ClusterSharding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
37. [**](../../../akka/cluster/sharding/ClusterSharding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ClusterSharding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/cluster/sharding/ClusterSharding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSharding toStringFormat\[ClusterSharding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../akka/cluster/sharding/ClusterSharding.html#shardRegionProxy(typeName:String,dataCenter:akka.cluster.ClusterSettings.DataCenter):akka.actor.ActorRef "Permalink")  def shardRegionProxy(typeName: String, dataCenter: [DataCenter](../ClusterSettings$.html#DataCenter=String)): [ActorRef](../../actor/ActorRef.html)Retrieve the actor reference of the ShardRegion actor that will act as a proxy to the
named entity type running in another data center.

Retrieve the actor reference of the ShardRegion actor that will act as a proxy to the
named entity type running in another data center. A proxy within the same data center can be accessed
with [\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) instead of this method. The entity type must be registered with the
[\#startProxy](#startProxy(typeName:String,role:java.util.Optional[String],messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef) method before it can be used here. Messages to the entity is always sent
via the `ShardRegion`.

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
4. [**](../../../akka/cluster/sharding/ClusterSharding.html#startProxy(typeName:String,role:java.util.Optional[String],dataCenter:java.util.Optional[String],messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef "Permalink")  def startProxy(typeName: String, role: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], dataCenter: [Optional](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html#java.util.Optional)\[String], messageExtractor: [MessageExtractor](ShardRegion$$MessageExtractor.html)): [ActorRef](../../actor/ActorRef.html)Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e.

Java/Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
entity actors itself. The ShardRegion actor for this type can later be retrieved with the
[\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

rolespecifies that this entity type is located on cluster nodes with a specific role.
 If the role is not specified all nodes in the cluster are used.

dataCenterThe data center of the cluster nodes where the cluster sharding is running.
 If None then the same data center as current node.

messageExtractorfunctions to extract the entity id, shard id, and the message to send to the
 entity from the incoming message

returnsthe actor ref of the ShardRegion that is to be responsible for the shard

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
5. [**](../../../akka/cluster/sharding/ClusterSharding.html#startProxy(typeName:String,role:Option[String],dataCenter:Option[akka.cluster.ClusterSettings.DataCenter],extractEntityId:akka.cluster.sharding.ShardRegion.ExtractEntityId,extractShardId:akka.cluster.sharding.ShardRegion.ExtractShardId):akka.actor.ActorRef "Permalink")  def startProxy(typeName: String, role: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[String], dataCenter: [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[[DataCenter](../ClusterSettings$.html#DataCenter=String)], extractEntityId: [ExtractEntityId](ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]), extractShardId: [ExtractShardId](ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId)): [ActorRef](../../actor/ActorRef.html)Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e.

Scala API: Register a named entity type `ShardRegion` on this node that will run in proxy only mode,
i.e. it will delegate messages to other `ShardRegion` actors on other nodes, but not host any
entity actors itself. The ShardRegion actor for this type can later be retrieved with the
[\#shardRegion](#shardRegion(typeName:String):akka.actor.ActorRef) method.

Some settings can be configured as described in the `akka.cluster.sharding` section
of the `reference.conf`.

typeNamethe name of the entity type

rolespecifies that this entity type is located on cluster nodes with a specific role.
 If the role is not specified all nodes in the cluster are used.

dataCenterThe data center of the cluster nodes where the cluster sharding is running.
 If None then the same data center as current node.

extractEntityIdpartial function to extract the entity id and the message to send to the
 entity from the incoming message, if the partial function does not match the message will
 be `unhandled`, i.e. posted as `Unhandled` messages on the event stream

extractShardIdfunction to determine the shard id for an incoming message, only messages
 that passed the `extractEntityId` will be used

returnsthe actor ref of the ShardRegion that is to be responsible for the shard

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
6. [**](../../../akka/cluster/sharding/ClusterSharding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSharding, B)ImplicitThis member is added by an implicit conversion from ClusterSharding toArrowAssoc\[ClusterSharding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [Extension](../../actor/Extension.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSharding to any2stringadd\[ClusterSharding]

### Inherited by implicit conversion StringFormat fromClusterSharding to StringFormat\[ClusterSharding]

### Inherited by implicit conversion Ensuring fromClusterSharding to Ensuring\[ClusterSharding]

### Inherited by implicit conversion ArrowAssoc fromClusterSharding to ArrowAssoc\[ClusterSharding]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Extension.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/ClusterSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$LeastShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$MessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding.html)*