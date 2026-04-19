---
description: Akka 2.10.17 - akka.cluster.sharding.ShardRegion
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:23:07Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ShardRegion$.html
title: Akka 2.10.17 - akka.cluster.sharding.ShardRegion
---

# Akka 2.10.17 - akka.cluster.sharding.ShardRegion

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.ShardRegion

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
- [ClusterSharding](ClusterSharding.html)
- [ClusterShardingHealthCheck](ClusterShardingHealthCheck.html "INTERNAL API (ctr)")
- [ClusterShardingHealthCheckSettings](ClusterShardingHealthCheckSettings.html)
- [ClusterShardingSerializable](ClusterShardingSerializable.html "Marker trait for remote messages and persistent events/snapshots with special serializer.")
- [ClusterShardingSettings](ClusterShardingSettings.html)
- [ConsistentHashingShardAllocationStrategy](ConsistentHashingShardAllocationStrategy.html "akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy that is using consistent hashing.")
- [JoinConfigCompatCheckSharding](JoinConfigCompatCheckSharding.html "INTERNAL API")
- [PersistentShardCoordinator](PersistentShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- [RemoveInternalClusterShardingData](RemoveInternalClusterShardingData.html)
- [ShardCoordinator](ShardCoordinator.html "Singleton coordinator that decides where to allocate shards.")
- ShardRegion
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
o[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# ShardRegion[**](../../../akka/cluster/sharding/ShardRegion$.html "Permalink")

### 

#### object ShardRegion

Source[ShardRegion.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ShardRegion.scala#L41)See also[ClusterSharding extension](ClusterSharding$.html)

Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Content Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ShardRegion
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html "Permalink") final  case class [ClusterShardingStats](ShardRegion$$ClusterShardingStats.html "Reply to GetClusterShardingStats, contains statistics about all the sharding regions in the cluster.")(regions: Map\[[Address](../../actor/Address.html), [ShardRegionStats](ShardRegion$$ShardRegionStats.html)]) extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply to [GetClusterShardingStats](ShardRegion$$GetClusterShardingStats.html), contains statistics about all the sharding regions
in the cluster.

Reply to [GetClusterShardingStats](ShardRegion$$GetClusterShardingStats.html), contains statistics about all the sharding regions
in the cluster.

Annotations@SerialVersionUID()
2. [**](../../../akka/cluster/sharding/ShardRegion$$CurrentRegions.html "Permalink") final  case class [CurrentRegions](ShardRegion$$CurrentRegions.html "Reply to GetCurrentRegions")(regions: Set\[[Address](../../actor/Address.html)]) extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableReply to `GetCurrentRegions`

Reply to `GetCurrentRegions`

Annotations@SerialVersionUID()
3. [**](../../../akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html "Permalink") final  class [CurrentShardRegionState](ShardRegion$$CurrentShardRegionState.html "Reply to GetShardRegionState$") extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)Reply to [GetShardRegionState$](ShardRegion$$GetShardRegionState$.html)

Reply to [GetShardRegionState$](ShardRegion$$GetShardRegionState$.html)

If gathering the shard information times out the set of shards will be empty.

Annotations@SerialVersionUID()
4. [**](../../../akka/cluster/sharding/ShardRegion$.html#EntityId=String "Permalink")  type EntityId \= [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Marker type of entity identifier (`String`).
5. [**](../../../akka/cluster/sharding/ShardRegion$.html#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)] "Permalink")  type ExtractEntityId \= [PartialFunction](https://www.scala-lang.org/api/2.13.17/scala/PartialFunction.html#scala.PartialFunction)\[[Msg](#Msg=Any), ([EntityId](#EntityId=String), [Msg](#Msg=Any))]Interface of the partial function used by the ShardRegion to
extract the entity id and the message to send to the entity from an
incoming message.

Interface of the partial function used by the ShardRegion to
extract the entity id and the message to send to the entity from an
incoming message. The implementation is application specific.
If the partial function does not match the message will be
`unhandled`, i.e. posted as `Unhandled` messages on the event stream.
Note that the extracted message does not have to be the same as the incoming
message to support wrapping in message envelope that is unwrapped before
sending to the entity actor.
6. [**](../../../akka/cluster/sharding/ShardRegion$.html#ExtractShardId=akka.cluster.sharding.ShardRegion.Msg=>akka.cluster.sharding.ShardRegion.ShardId "Permalink")  type ExtractShardId \= ([Msg](#Msg=Any)) \=\> [ShardId](#ShardId=String)Interface of the function used by the ShardRegion to
extract the shard id from an incoming message.

Interface of the function used by the ShardRegion to
extract the shard id from an incoming message.
Only messages that passed the [ExtractEntityId](#ExtractEntityId=PartialFunction[akka.cluster.sharding.ShardRegion.Msg,(akka.cluster.sharding.ShardRegion.EntityId,akka.cluster.sharding.ShardRegion.Msg)]) will be used
as input to this function.
7. [**](../../../akka/cluster/sharding/ShardRegion$$GetClusterShardingStats.html "Permalink")  case class [GetClusterShardingStats](ShardRegion$$GetClusterShardingStats.html "Send this message to the ShardRegion actor to request for ClusterShardingStats, which contains statistics about the currently running sharded entities in the entire cluster.")(timeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)) extends [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html) with [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the `ShardRegion` actor to request for [ClusterShardingStats](ShardRegion$$ClusterShardingStats.html),
which contains statistics about the currently running sharded entities in the
entire cluster.

Send this message to the `ShardRegion` actor to request for [ClusterShardingStats](ShardRegion$$ClusterShardingStats.html),
which contains statistics about the currently running sharded entities in the
entire cluster. If the `timeout` is reached without answers from all shard regions
the reply will contain an empty map of regions.

Intended for testing purpose to see when cluster sharding is "ready" or to monitor
the state of the shard regions.

Annotations@SerialVersionUID()
8. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html "Permalink") abstract  class [HashCodeMessageExtractor](ShardRegion$$HashCodeMessageExtractor.html "Convenience implementation of ShardRegion.MessageExtractor that construct shardId based on the hashCode of the entityId.") extends [MessageExtractor](ShardRegion$$MessageExtractor.html)Convenience implementation of [ShardRegion.MessageExtractor](ShardRegion$$MessageExtractor.html) that
construct `shardId` based on the `hashCode` of the `entityId`.

Convenience implementation of [ShardRegion.MessageExtractor](ShardRegion$$MessageExtractor.html) that
construct `shardId` based on the `hashCode` of the `entityId`. The number
of unique shards is limited by the given `maxNumberOfShards`.
9. [**](../../../akka/cluster/sharding/ShardRegion$$MessageExtractor.html "Permalink")  trait [MessageExtractor](ShardRegion$$MessageExtractor.html "Java API: Interface of functions to extract entity id, shard id, and the message to send to the entity from an incoming message.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Java API: Interface of functions to extract entity id,
shard id, and the message to send to the entity from an
incoming message.
10. [**](../../../akka/cluster/sharding/ShardRegion$.html#Msg=Any "Permalink")  type Msg \= [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Marker type of application messages (`Any`).
11. [**](../../../akka/cluster/sharding/ShardRegion$$Passivate.html "Permalink") final  case class [Passivate](ShardRegion$$Passivate.html "If the state of the entities are persistent you may stop entities that are not used to reduce memory consumption.")(stopMessage: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)) extends [ShardRegionCommand](ShardRegion$$ShardRegionCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableIf the state of the entities are persistent you may stop entities that are not used to
reduce memory consumption.

If the state of the entities are persistent you may stop entities that are not used to
reduce memory consumption. This is done by the application specific implementation of
the entity actors for example by defining receive timeout (`context.setReceiveTimeout`).
If a message is already enqueued to the entity when it stops itself the enqueued message
in the mailbox will be dropped. To support graceful passivation without losing such
messages the entity actor can send this `Passivate` message to its parent `ShardRegion`.
The specified wrapped `stopMessage` will be sent back to the entity, which is
then supposed to stop itself. Incoming messages will be buffered by the `ShardRegion`
between reception of `Passivate` and termination of the entity. Such buffered messages
are thereafter delivered to a new incarnation of the entity.

[akka.actor.PoisonPill](../../actor/PoisonPill.html) is a perfectly fine `stopMessage`.

Annotations@SerialVersionUID()
12. [**](../../../akka/cluster/sharding/ShardRegion$$SetActiveEntityLimit.html "Permalink") final  case class [SetActiveEntityLimit](ShardRegion$$SetActiveEntityLimit.html "API MAY CHANGE: Messages for passivation strategies may change after additional testing and feedback.")(perRegionLimit: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAPI MAY CHANGE: Messages for passivation strategies may change after additional testing and feedback.

API MAY CHANGE: Messages for passivation strategies may change after additional testing and feedback.

When limit\-based automatic passivation is enabled, set a new active entity limit for a shard region.

Annotations@[ApiMayChange](../../annotation/ApiMayChange.html)()
13. [**](../../../akka/cluster/sharding/ShardRegion$.html#ShardId=String "Permalink")  type ShardId \= [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Marker type of shard identifier (`String`).
14. [**](../../../akka/cluster/sharding/ShardRegion$$ShardInitialized.html "Permalink") final  case class [ShardInitialized](ShardRegion$$ShardInitialized.html "We must be sure that a shard is initialized before to start send messages to it.")(shardId: [ShardId](#ShardId=String)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWe must be sure that a shard is initialized before to start send messages to it.

We must be sure that a shard is initialized before to start send messages to it.
Shard could be terminated during initialization.
15. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html "Permalink") sealed  trait [ShardRegionCommand](ShardRegion$$ShardRegionCommand.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
16. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionQuery.html "Permalink") sealed  trait [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
17. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats.html "Permalink") final  class [ShardRegionStats](ShardRegion$$ShardRegionStats.html) extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)Annotations@SerialVersionUID()
18. [**](../../../akka/cluster/sharding/ShardRegion$$ShardState.html "Permalink") final  case class [ShardState](ShardRegion$$ShardState.html)(shardId: [ShardId](#ShardId=String), entityIds: Set\[[EntityId](#EntityId=String)]) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
19. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntity.html "Permalink") final  case class [StartEntity](ShardRegion$$StartEntity.html "When remembering entities and a shard is started, each entity id that needs to be running will trigger this message being sent through sharding.")(entityId: [EntityId](#EntityId=String)) extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableWhen remembering entities and a shard is started, each entity id that needs to
be running will trigger this message being sent through sharding.

When remembering entities and a shard is started, each entity id that needs to
be running will trigger this message being sent through sharding. For this to work
the message \*must\* be handled by the shard id extractor.
20. [**](../../../akka/cluster/sharding/ShardRegion$$StartEntityAck.html "Permalink") final  case class [StartEntityAck](ShardRegion$$StartEntityAck.html "Sent back when a ShardRegion.StartEntity message was received and triggered the entity to start (it does not guarantee the entity successfully started)")(entityId: [EntityId](#EntityId=String), shardId: [ShardId](#ShardId=String)) extends [ClusterShardingSerializable](ClusterShardingSerializable.html) with [DeadLetterSuppression](../../actor/DeadLetterSuppression.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSent back when a `ShardRegion.StartEntity` message was received and triggered the entity
to start (it does not guarantee the entity successfully started)
### Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ShardRegion$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ShardRegion$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/sharding/ShardRegion$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/cluster/sharding/ShardRegion$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
6. [**](../../../akka/cluster/sharding/ShardRegion$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/cluster/sharding/ShardRegion$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/cluster/sharding/ShardRegion$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
9. [**](../../../akka/cluster/sharding/ShardRegion$.html#getCurrentRegionsInstance:akka.cluster.sharding.ShardRegion.GetCurrentRegions.type "Permalink")  def getCurrentRegionsInstance: [GetCurrentRegions](ShardRegion$$GetCurrentRegions$.html).typeJava API: Send this message to the `ShardRegion` actor to request for [CurrentRegions](ShardRegion$$CurrentRegions.html),
which contains the addresses of all registered regions.

Java API: Send this message to the `ShardRegion` actor to request for [CurrentRegions](ShardRegion$$CurrentRegions.html),
which contains the addresses of all registered regions.

Intended for testing purpose to see when cluster sharding is "ready" or to monitor
the state of the shard regions.
10. [**](../../../akka/cluster/sharding/ShardRegion$.html#getRegionStatsInstance:akka.cluster.sharding.ShardRegion.GetShardRegionStats.type "Permalink")  def getRegionStatsInstance: [GetShardRegionStats](ShardRegion$$GetShardRegionStats$.html)Java API:
11. [**](../../../akka/cluster/sharding/ShardRegion$.html#getShardRegionStateInstance:akka.cluster.sharding.ShardRegion.GetShardRegionState.type "Permalink")  def getShardRegionStateInstance: [GetShardRegionState](ShardRegion$$GetShardRegionState$.html)Java API:
12. [**](../../../akka/cluster/sharding/ShardRegion$.html#gracefulShutdownInstance:akka.cluster.sharding.ShardRegion.GracefulShutdown.type "Permalink")  def gracefulShutdownInstance: [GracefulShutdown](ShardRegion$$GracefulShutdown$.html)Java API: Send this message to the `ShardRegion` actor to handoff all shards that are hosted by
the `ShardRegion` and then the `ShardRegion` actor will be stopped.

Java API: Send this message to the `ShardRegion` actor to handoff all shards that are hosted by
the `ShardRegion` and then the `ShardRegion` actor will be stopped. You can `watch`
it to know when it is completed.
13. [**](../../../akka/cluster/sharding/ShardRegion$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/sharding/ShardRegion$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
15. [**](../../../akka/cluster/sharding/ShardRegion$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../../akka/cluster/sharding/ShardRegion$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
17. [**](../../../akka/cluster/sharding/ShardRegion$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
18. [**](../../../akka/cluster/sharding/ShardRegion$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/cluster/sharding/ShardRegion$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
20. [**](../../../akka/cluster/sharding/ShardRegion$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/cluster/sharding/ShardRegion$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../../akka/cluster/sharding/ShardRegion$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/sharding/ShardRegion$$CurrentShardRegionState$.html "Permalink")  object [CurrentShardRegionState](ShardRegion$$CurrentShardRegionState$.html) extends [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[Set\[[ShardState](ShardRegion$$ShardState.html)], [CurrentShardRegionState](ShardRegion$$CurrentShardRegionState.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
24. [**](../../../akka/cluster/sharding/ShardRegion$$GetCurrentRegions$.html "Permalink")  case object [GetCurrentRegions](ShardRegion$$GetCurrentRegions$.html "Send this message to the ShardRegion actor to request for CurrentRegions, which contains the addresses of all registered regions.") extends [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html) with [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the `ShardRegion` actor to request for [CurrentRegions](ShardRegion$$CurrentRegions.html),
which contains the addresses of all registered regions.

Send this message to the `ShardRegion` actor to request for [CurrentRegions](ShardRegion$$CurrentRegions.html),
which contains the addresses of all registered regions.

Intended for testing purpose to see when cluster sharding is "ready" or to monitor
the state of the shard regions.

Annotations@SerialVersionUID()
25. [**](../../../akka/cluster/sharding/ShardRegion$$GetShardRegionState$.html "Permalink")  case object [GetShardRegionState](ShardRegion$$GetShardRegionState$.html "Send this message to a ShardRegion actor instance to request a CurrentShardRegionState which describes the current state of the region.") extends [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html) with [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to a `ShardRegion` actor instance to request a
[CurrentShardRegionState](ShardRegion$$CurrentShardRegionState.html) which describes the current state of the region.

Send this message to a `ShardRegion` actor instance to request a
[CurrentShardRegionState](ShardRegion$$CurrentShardRegionState.html) which describes the current state of the region.
The state contains information about what shards are running in this region
and what entities are running on each of those shards.

Annotations@SerialVersionUID()
26. [**](../../../akka/cluster/sharding/ShardRegion$$GetShardRegionStats$.html "Permalink")  case object [GetShardRegionStats](ShardRegion$$GetShardRegionStats$.html "Send this message to the ShardRegion actor to request for ShardRegionStats, which contains statistics about the currently running sharded entities in the entire region.") extends [ShardRegionQuery](ShardRegion$$ShardRegionQuery.html) with [ClusterShardingSerializable](ClusterShardingSerializable.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableSend this message to the `ShardRegion` actor to request for [ShardRegionStats](ShardRegion$$ShardRegionStats.html),
which contains statistics about the currently running sharded entities in the
entire region.

Send this message to the `ShardRegion` actor to request for [ShardRegionStats](ShardRegion$$ShardRegionStats.html),
which contains statistics about the currently running sharded entities in the
entire region.

Intended for testing purpose to see when cluster sharding is "ready" or to monitor
the state of the shard regions.

For the statistics for the entire cluster, see GetClusterShardingStats$.

Annotations@SerialVersionUID()
27. [**](../../../akka/cluster/sharding/ShardRegion$$GracefulShutdown$.html "Permalink")  case object [GracefulShutdown](ShardRegion$$GracefulShutdown$.html) extends [ShardRegionCommand](ShardRegion$$ShardRegionCommand.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@SerialVersionUID()
28. [**](../../../akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor$.html "Permalink")  object [HashCodeMessageExtractor](ShardRegion$$HashCodeMessageExtractor$.html)
29. [**](../../../akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html "Permalink")  object [ShardRegionStats](ShardRegion$$ShardRegionStats$.html) extends [AbstractFunction1](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction1.html#scala.runtime.AbstractFunction1)\[Map\[[ShardId](#ShardId=String), [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)], [ShardRegionStats](ShardRegion$$ShardRegionStats.html)] with [Serializable](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ShardRegion$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/Address.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/PoisonPill.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/ApiMayChange.html
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
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$CurrentRegions.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$CurrentShardRegionState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetClusterShardingStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetCurrentRegions$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetShardRegionState$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GetShardRegionStats$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$GracefulShutdown$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$HashCodeMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$MessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$Passivate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$SetActiveEntityLimit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardInitialized.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardRegionCommand.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardRegionQuery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardRegionStats$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardRegionStats.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$ShardState.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$StartEntity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$$StartEntityAck.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardRegion$.html)*