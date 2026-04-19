---
description: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:22:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding
---

# Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.javadsl.ClusterSharding

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[typed](../index.html)
- ClusterSharding
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.of.")
- [EntityFactory](EntityFactory.html)
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html)
[c](ClusterSharding$.html "See companion object")[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html).[javadsl](index.html)

# [ClusterSharding](ClusterSharding$.html "See companion object")[**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html "Permalink")

### Companion [object ClusterSharding](ClusterSharding$.html "See companion object")

#### abstract  class ClusterSharding extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

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
in the cluster, registering the supported entity types with the [ClusterSharding\#init](#init[M,E](entity:akka.cluster.sharding.typed.javadsl.Entity[M,E]):akka.actor.typed.ActorRef[E])
method, which returns the `ShardRegion` actor reference for a named entity type.
Messages to the entities are always sent via that `ActorRef`, i.e. the local `ShardRegion`.
Messages can also be sent via the [EntityRef](EntityRef.html) retrieved with [ClusterSharding\#entityRefFor](#entityRefFor[M](typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],entityId:String):akka.cluster.sharding.typed.javadsl.EntityRef[M]),
which will also send via the local `ShardRegion`.

Some settings can be configured as described in the `akka.cluster.sharding`
section of the `reference.conf`.

The `ShardRegion` actor is started on each node in the cluster, or group of nodes
tagged with a specific role. The `ShardRegion` is created with a [ShardingMessageExtractor](../ShardingMessageExtractor.html)
to extract the entity identifier and the shard identifier from incoming messages.
A shard is a group of entities that will be managed together. For the first message in a
specific shard the `ShardRegion` requests the location of the shard from a central coordinator,
the [akka.cluster.sharding.ShardCoordinator](../../ShardCoordinator.html). The `ShardCoordinator` decides which `ShardRegion`
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
role. The oldest member can be determined by [akka.cluster.Member\#isOlderThan](../../../Member.html#isOlderThan(other:akka.cluster.Member):Boolean).

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
allocation strategy. The default implementation `LeastShardAllocationStrategy`
picks shards for handoff from the ShardRegion `with most number of previously allocated shards.
They will then be allocated to the` ShardRegion `with least number of previously allocated shards,
i.e. new members in the cluster. This strategy can be replaced by an application specific
implementation.`

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
messages the entity actor can send [ClusterSharding\#Passivate](ClusterSharding$$Passivate.html) to the `ActorRef[ShardCommand]`
that was passed in to the factory method when creating the entity..
The specified `stopMessage` message will be sent back to the entity, which is
then supposed to stop itself. Incoming messages will be buffered by the `ShardRegion`
between reception of `Passivate` and termination of the entity. Such buffered messages
are thereafter delivered to a new incarnation of the entity.

This class is not intended for user extension other than for test purposes (e.g.
stub implementation). More methods may be added in the future and that may break
such implementations.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)() Source[ClusterSharding.scala](https://github.com/akka/akka-core/tree/v2.10.17/akka-cluster-sharding-typed/src/main/scala/akka/cluster/sharding/typed/javadsl/ClusterSharding.scala#L167)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Type Hierarchy****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ClusterSharding
2. AnyRef
3. Any
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

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#<init>():akka.cluster.sharding.typed.javadsl.ClusterSharding "Permalink")  new ClusterSharding()
### Abstract Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#defaultShardAllocationStrategy(settings:akka.cluster.sharding.typed.ClusterShardingSettings):akka.cluster.sharding.ShardCoordinator.ShardAllocationStrategy "Permalink") abstract  def defaultShardAllocationStrategy(settings: [ClusterShardingSettings](../ClusterShardingSettings.html)): [ShardAllocationStrategy](../../ShardCoordinator$$ShardAllocationStrategy.html)The default `ShardAllocationStrategy` is configured by `least-shard-allocation-strategy` properties.
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#entityRefFor[M](typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],entityId:String):akka.cluster.sharding.typed.javadsl.EntityRef[M] "Permalink") abstract  def entityRefFor\[M](typeKey: [EntityTypeKey](EntityTypeKey.html)\[M], entityId: String): [EntityRef](EntityRef.html)\[M]Create an `ActorRef`\-like reference to a specific sharded entity.

Create an `ActorRef`\-like reference to a specific sharded entity.

You have to correctly specify the type of messages the target can handle via the `typeKey`.

Messages sent through this [EntityRef](EntityRef.html) will be wrapped in a [ShardingEnvelope](../ShardingEnvelope.html) including the
here provided `entityId`.

This can only be used if the default [ShardingEnvelope](../ShardingEnvelope.html) is used, when using custom envelopes or in message
entity ids you will need to use the `ActorRef<E>` returned by sharding init for messaging with the sharded actors.

For in\-depth documentation of its semantics, see [EntityRef](EntityRef.html).
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#init[M,E](entity:akka.cluster.sharding.typed.javadsl.Entity[M,E]):akka.actor.typed.ActorRef[E] "Permalink") abstract  def init\[M, E](entity: [Entity](Entity.html)\[M, E]): [ActorRef](../../../../actor/typed/ActorRef.html)\[E]Initialize sharding for the given `entity` factory settings.

Initialize sharding for the given `entity` factory settings.

It will start a shard region or a proxy depending on if the settings require role and if this node has
such a role.

MThe type of message the entity accepts

EA possible envelope around the message the entity accepts
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#shard(typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[_]):akka.actor.typed.ActorRef[akka.cluster.sharding.typed.javadsl.ClusterSharding.ShardCommand] "Permalink") abstract  def shard(typeKey: [EntityTypeKey](EntityTypeKey.html)\[\_]): [ActorRef](../../../../actor/typed/ActorRef.html)\[[ShardCommand](ClusterSharding$$ShardCommand.html)]Access to the `ActorRef` to send `ShardCommand` for a given entity type.

Access to the `ActorRef` to send `ShardCommand` for a given entity type. For example
[ClusterSharding.Passivate](ClusterSharding$$Passivate.html) can be sent to this `ActorRef`. Note that this `ActorRef`
is also available in the [EntityContext](EntityContext.html). The entity type must first be initialized
with the [ClusterSharding.init](#init[M,E](entity:akka.cluster.sharding.typed.javadsl.Entity[M,E]):akka.actor.typed.ActorRef[E]) method.
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#shardState:akka.actor.typed.ActorRef[akka.cluster.sharding.typed.ClusterShardingQuery] "Permalink") abstract  def shardState: [ActorRef](../../../../actor/typed/ActorRef.html)\[[ClusterShardingQuery](../ClusterShardingQuery.html)]Actor for querying Cluster Sharding state
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#entityRefFor[M](typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],entityId:String,dataCenter:String):akka.cluster.sharding.typed.javadsl.EntityRef[M] "Permalink") abstract  def entityRefFor\[M](typeKey: [EntityTypeKey](EntityTypeKey.html)\[M], entityId: String, dataCenter: String): [EntityRef](EntityRef.html)\[M]Create an `ActorRef`\-like reference to a specific sharded entity running in another data center.

Create an `ActorRef`\-like reference to a specific sharded entity running in another data center.

You have to correctly specify the type of messages the target can handle via the `typeKey`.

Messages sent through this [EntityRef](EntityRef.html) will be wrapped in a [ShardingEnvelope](../ShardingEnvelope.html) including the
provided `entityId`.

This can only be used if the default [ShardingEnvelope](../ShardingEnvelope.html) is used, when using custom envelopes or in message
entity ids you will need to use the `ActorRef[E]` returned by sharding init for messaging with the sharded actors.

For in\-depth documentation of its semantics, see [EntityRef](EntityRef.html).

Annotations@deprecated Deprecated*(Since version 2\.10\.0\)* Use Akka Distributed Cluster instead
### Concrete Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#+(other:String):String "Permalink")  def \+(other: String): StringImplicitThis member is added by an implicit conversion from ClusterSharding toany2stringadd\[ClusterSharding] performed by method any2stringadd in scala.Predef.Definition Classesany2stringadd
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#->[B](y:B):(A,B) "Permalink")  def \-\>\[B](y: B): (ClusterSharding, B)ImplicitThis member is added by an implicit conversion from ClusterSharding toArrowAssoc\[ClusterSharding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@inline()
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
7. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @HotSpotIntrinsicCandidate() @native()
8. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#ensuring(cond:A=>Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: (ClusterSharding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
9. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#ensuring(cond:A=>Boolean):A "Permalink")  def ensuring(cond: (ClusterSharding) \=\> [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
10. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#ensuring(cond:Boolean,msg:=>Any):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean), msg: \=\> [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
11. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#ensuring(cond:Boolean):A "Permalink")  def ensuring(cond: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)): ClusterShardingImplicitThis member is added by an implicit conversion from ClusterSharding toEnsuring\[ClusterSharding] performed by method Ensuring in scala.Predef.Definition ClassesEnsuring
12. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
15. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@HotSpotIntrinsicCandidate() @native()
16. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
19. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@HotSpotIntrinsicCandidate() @native()
20. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
24. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
### Deprecated Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#formatted(fmtstr:String):String "Permalink")  def formatted(fmtstr: String): StringImplicitThis member is added by an implicit conversion from ClusterSharding toStringFormat\[ClusterSharding] performed by method StringFormat in scala.Predef.Definition ClassesStringFormatAnnotations@deprecated @inline() Deprecated*(Since version 2\.12\.16\)* Use `formatString.format(value)` instead of `value.formatted(formatString)`,
or use the `f""` string interpolator. In Java 15 and later, `formatted` resolves to the new method in String which has reversed parameters.
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html#→[B](y:B):(A,B) "Permalink")  def →\[B](y: B): (ClusterSharding, B)ImplicitThis member is added by an implicit conversion from ClusterSharding toArrowAssoc\[ClusterSharding] performed by method ArrowAssoc in scala.Predef.Definition ClassesArrowAssocAnnotations@deprecated Deprecated*(Since version 2\.13\.0\)* Use `->` instead. If you still wish to display it as one character, consider using a font with programming ligatures such as Fira Code.
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Inherited by implicit conversion any2stringadd fromClusterSharding to any2stringadd\[ClusterSharding]

### Inherited by implicit conversion StringFormat fromClusterSharding to StringFormat\[ClusterSharding]

### Inherited by implicit conversion Ensuring fromClusterSharding to Ensuring\[ClusterSharding]

### Inherited by implicit conversion ArrowAssoc fromClusterSharding to ArrowAssoc\[ClusterSharding]

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator$$ShardAllocationStrategy.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingSettings.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding$$Passivate.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding$$ShardCommand.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/StartEntity$.html
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.html](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.html)*