---
description: Akka 2.10.17 - akka.cluster.sharding.ClusterSharding
knowledge_type: official_documentation
scraped_at: '2026-04-05T22:02:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/ClusterSharding$.html
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
- [ShardRegion](ShardRegion$.html)
- [ShardingLogMarker](ShardingLogMarker$.html "This is public with the purpose to document the used markers and properties of log events.")
[o](ClusterSharding.html "See companion class")[akka](../../index.html).[cluster](../index.html).[sharding](index.html)

# [ClusterSharding](ClusterSharding.html "See companion class")[**](../../../akka/cluster/sharding/ClusterSharding$.html "Permalink")

### Companion [class ClusterSharding](ClusterSharding.html "See companion class")

#### object ClusterSharding extends [ExtensionId](../../actor/ExtensionId.html)\[[ClusterSharding](ClusterSharding.html)] with [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

This extension provides sharding functionality of actors in a cluster.
The typical use case is when you have many stateful actors that together consume
more resources (e.g. memory) than fit on one machine.

- Distribution: You need to distribute them across several nodes in the cluster
- Location Transparency: You need to interact with them using their logical identifier,
without having to care about their physical location in the cluster, which can change over time.

**Entities**:
It could for example be actors representing Aggregate Roots in Domain\-Driven Design
terminology. Here we call these actors "entities" which typically have persistent
(durable) state, but this feature is not limited to persistent state actors.

**Sharding**:
In this context sharding means that actors with an identifier, or entities,
can be automatically distributed across multiple nodes in the cluster.

**ShardRegion**:
Each entity actor runs only at one place, and messages can be sent to the entity without
requiring the sender to know the location of the destination actor. This is achieved by
sending the messages via a ShardRegion actor, provided by this extension. The ShardRegion
knows the shard mappings and routes inbound messages to the entity with the entity id.
Messages to the entities are always sent via the local `ShardRegion`.
The `ShardRegion` actor is started on each node in the cluster, or group of nodes
tagged with a specific role. The `ShardRegion` is created with two application specific
functions to extract the entity identifier and the shard identifier from incoming messages.

Typical usage of this extension:

1. At system startup on each cluster node by registering the supported entity types with
the [ClusterSharding\#start](ClusterSharding.html#start(typeName:String,entityProps:akka.actor.Props,messageExtractor:akka.cluster.sharding.ShardRegion.MessageExtractor):akka.actor.ActorRef) method
2. Retrieve the `ShardRegion` actor for a named entity type with [ClusterSharding\#shardRegion](ClusterSharding.html#shardRegion(typeName:String):akka.actor.ActorRef)
Settings can be configured as described in the `akka.cluster.sharding` section of the `reference.conf`.

**Shard and ShardCoordinator**:
A shard is a group of entities that will be managed together. For the first message in a
specific shard the `ShardRegion` requests the location of the shard from a central
[ShardCoordinator](ShardCoordinator.html). The `ShardCoordinator` decides which `ShardRegion`
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
role. The oldest member can be determined by [akka.cluster.Member\#isOlderThan](../Member.html#isOlderThan(other:akka.cluster.Member):Boolean).

**Shard Rebalancing**:
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

**Shard Allocation**:
The logic deciding which shards to rebalance is defined in a plugable shard allocation
strategy. The default implementation `LeastShardAllocationStrategy`
picks shards for handoff from the `ShardRegion` with highest number of previously allocated shards.
They will then be allocated to the `ShardRegion` with lowest number of previously allocated shards,
i.e. new members in the cluster. This strategy can be replaced by an application
specific implementation.

**Recovery**:
The state of shard locations in the `ShardCoordinator` is stored with `akka-distributed-data` or
`akka-persistence` to survive failures. When a crashed or unreachable coordinator
node has been removed (via down) from the cluster a new `ShardCoordinator` singleton
actor will take over and the state is recovered. During such a failure period shards
with known location are still available, while messages for new (unknown) shards
are buffered until the new `ShardCoordinator` becomes available.

**Delivery Semantics**:
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
messages the entity actor can send [ShardRegion.Passivate](ShardRegion$$Passivate.html) to its parent `ShardRegion`.
The specified wrapped message in `Passivate` will be sent back to the entity, which is
then supposed to stop itself. Incoming messages will be buffered by the `ShardRegion`
between reception of `Passivate` and termination of the entity. Such buffered messages
are thereafter delivered to a new incarnation of the entity.

Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding/src/main/scala/akka/cluster/sharding/ClusterSharding.scala#L159)Linear Supertypes[ExtensionIdProvider](../../actor/ExtensionIdProvider.html), [ExtensionId](../../actor/ExtensionId.html)\[[ClusterSharding](ClusterSharding.html)], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSharding
2. ExtensionIdProvider
3. ExtensionId
4. AnyRef
5. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/cluster/sharding/ClusterSharding$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/cluster/sharding/ClusterSharding$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/cluster/sharding/ClusterSharding$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/cluster/sharding/ClusterSharding$.html#apply(system:akka.actor.ClassicActorSystemProvider):T "Permalink")  def apply(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [ClusterSharding](ClusterSharding.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
5. [**](../../../akka/cluster/sharding/ClusterSharding$.html#apply(system:akka.actor.ActorSystem):T "Permalink")  def apply(system: [ActorSystem](../../actor/ActorSystem.html)): [ClusterSharding](ClusterSharding.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.

Definition Classes[ExtensionId](../../actor/ExtensionId.html)
6. [**](../../../akka/cluster/sharding/ClusterSharding$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../akka/cluster/sharding/ClusterSharding$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../akka/cluster/sharding/ClusterSharding$.html#createExtension(system:akka.actor.ExtendedActorSystem):akka.cluster.sharding.ClusterSharding "Permalink")  def createExtension(system: [ExtendedActorSystem](../../actor/ExtendedActorSystem.html)): [ClusterSharding](ClusterSharding.html)Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Is used by Akka to instantiate the Extension identified by this ExtensionId,
internal use only.

Definition ClassesClusterSharding → [ExtensionId](../../actor/ExtensionId.html)
9. [**](../../../akka/cluster/sharding/ClusterSharding$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../../akka/cluster/sharding/ClusterSharding$.html#equals(other:Any):Boolean "Permalink") final  def equals(other: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
11. [**](../../../akka/cluster/sharding/ClusterSharding$.html#get(system:akka.actor.ClassicActorSystemProvider):akka.cluster.sharding.ClusterSharding "Permalink")  def get(system: [ClassicActorSystemProvider](../../actor/ClassicActorSystemProvider.html)): [ClusterSharding](ClusterSharding.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ClassicActorSystemProvider): TheExtension = super.get(system)
```
Definition ClassesClusterSharding → [ExtensionId](../../actor/ExtensionId.html)
12. [**](../../../akka/cluster/sharding/ClusterSharding$.html#get(system:akka.actor.ActorSystem):akka.cluster.sharding.ClusterSharding "Permalink")  def get(system: [ActorSystem](../../actor/ActorSystem.html)): [ClusterSharding](ClusterSharding.html)Returns an instance of the extension identified by this ExtensionId instance.

Returns an instance of the extension identified by this ExtensionId instance.
Java API
For extensions written in Scala that are to be used from Java also,
this method should be overridden to get correct return type.

```
override def get(system: ActorSystem): TheExtension = super.get(system)
```
Definition ClassesClusterSharding → [ExtensionId](../../actor/ExtensionId.html)
13. [**](../../../akka/cluster/sharding/ClusterSharding$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
14. [**](../../../akka/cluster/sharding/ClusterSharding$.html#hashCode():Int "Permalink") final  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition Classes[ExtensionId](../../actor/ExtensionId.html) → AnyRef → Any
15. [**](../../../akka/cluster/sharding/ClusterSharding$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../../akka/cluster/sharding/ClusterSharding$.html#lookup:akka.cluster.sharding.ClusterSharding.type "Permalink")  def lookup: ClusterShardingReturns the canonical ExtensionId for this Extension

Returns the canonical ExtensionId for this Extension

Definition ClassesClusterSharding → [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)
17. [**](../../../akka/cluster/sharding/ClusterSharding$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../akka/cluster/sharding/ClusterSharding$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../akka/cluster/sharding/ClusterSharding$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../akka/cluster/sharding/ClusterSharding$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../akka/cluster/sharding/ClusterSharding$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../akka/cluster/sharding/ClusterSharding$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/cluster/sharding/ClusterSharding$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../akka/cluster/sharding/ClusterSharding$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../akka/cluster/sharding/ClusterSharding$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [ExtensionIdProvider](../../actor/ExtensionIdProvider.html)

### Inherited from [ExtensionId](../../actor/ExtensionId.html)\[[ClusterSharding](ClusterSharding.html)]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionId.html
- https://doc.akka.io/api/akka/current/akka/actor/ExtensionIdProvider.html
- https://doc.akka.io/api/akka/current/akka/cluster/Member.html
- https://doc.akka.io/api/akka/current/akka/cluster/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingHealthCheck.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingHealthCheckSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSerializable.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSettings$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ConsistentHashingShardAllocationStrategy.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/JoinConfigCompatCheckSharding.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/RemoveInternalClusterShardingData$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/RemoveInternalClusterShardingData.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$$Passivate.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardRegion$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/ShardingLogMarker$.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/external/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/internal/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/protobuf/index.html
- https://doc.akka.io/api/akka/current/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html](https://doc.akka.io/api/akka/current/akka/cluster/sharding/ClusterSharding$.html)*