---
description: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:21:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/cluster/sharding/typed/javadsl/index.html
title: Akka 2.10.17 - akka.cluster.sharding.typed.javadsl
---

# Akka 2.10.17 - akka.cluster.sharding.typed.javadsl

> **Summary:** Akka 2.10.17 - akka.cluster.sharding.typed.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/cluster/index.html "Permalink")  package [cluster](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/cluster/sharding/index.html "Permalink")  package [sharding](../../index.html)Definition Classes[cluster](../../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[sharding](../../index.html)
- [**](../../../../../akka/cluster/sharding/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")  package javadslDefinition Classes[typed](../index.html)
- [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.")
- [Entity](Entity.html "Defines how the entity should be created.")
- [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.of.")
- [EntityFactory](EntityFactory.html)
- [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")
- [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")
- [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.")
- [StartEntity](StartEntity$.html)
- [**](../../../../../akka/cluster/sharding/typed/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/cluster/sharding/typed/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[typed](../index.html)
p[akka](../../../../index.html).[cluster](../../../index.html).[sharding](../../index.html).[typed](../index.html)

# javadsl[**](../../../../../akka/cluster/sharding/typed/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding.html "Permalink") abstract  class [ClusterSharding](ClusterSharding.html "This extension provides sharding functionality of actors in a cluster.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This extension provides sharding functionality of actors in a cluster.

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
in the cluster, registering the supported entity types with the [ClusterSharding\#init](ClusterSharding.html#init[M,E](entity:akka.cluster.sharding.typed.javadsl.Entity[M,E]):akka.actor.typed.ActorRef[E])
method, which returns the `ShardRegion` actor reference for a named entity type.
Messages to the entities are always sent via that `ActorRef`, i.e. the local `ShardRegion`.
Messages can also be sent via the [EntityRef](EntityRef.html) retrieved with [ClusterSharding\#entityRefFor](ClusterSharding.html#entityRefFor[M](typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],entityId:String):akka.cluster.sharding.typed.javadsl.EntityRef[M]),
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

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/Entity.html "Permalink") final  class [Entity](Entity.html "Defines how the entity should be created.")\[M, E] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Defines how the entity should be created.

Defines how the entity should be created. Used in [ClusterSharding\#init](ClusterSharding.html#init[M,E](entity:akka.cluster.sharding.typed.javadsl.Entity[M,E]):akka.actor.typed.ActorRef[E]).
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityContext.html "Permalink") final  class [EntityContext](EntityContext.html "Parameter to createBehavior function in Entity.of.")\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Parameter to `createBehavior` function in [Entity.of](Entity$.html#of[M](typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],createBehavior:akka.japi.function.Function[akka.cluster.sharding.typed.javadsl.EntityContext[M],akka.actor.typed.Behavior[M]]):akka.cluster.sharding.typed.javadsl.Entity[M,akka.cluster.sharding.typed.ShardingEnvelope[M]]).

Parameter to `createBehavior` function in [Entity.of](Entity$.html#of[M](typeKey:akka.cluster.sharding.typed.javadsl.EntityTypeKey[M],createBehavior:akka.japi.function.Function[akka.cluster.sharding.typed.javadsl.EntityContext[M],akka.actor.typed.Behavior[M]]):akka.cluster.sharding.typed.javadsl.Entity[M,akka.cluster.sharding.typed.ShardingEnvelope[M]]).

Cluster Sharding is often used together with [akka.persistence.typed.javadsl.EventSourcedBehavior](../../../../persistence/typed/javadsl/EventSourcedBehavior.html)
for the entities. See more considerations in [akka.persistence.typed.PersistenceId](../../../../persistence/typed/PersistenceId.html).
The `PersistenceId` of the `EventSourcedBehavior` can typically be constructed with:

```
PersistenceId.of(entityContext.getEntityTypeKey().name(), entityContext.getEntityId())
```
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityFactory.html "Permalink")  trait [EntityFactory](EntityFactory.html)\[M] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@FunctionalInterface()
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityRef.html "Permalink") abstract  class [EntityRef](EntityRef.html "A reference to an sharded Entity, which allows ActorRef-like usage.")\[\-M] extends [RecipientRef](../../../../actor/typed/RecipientRef.html)\[M]A reference to an sharded Entity, which allows `ActorRef`\-like usage.

A reference to an sharded Entity, which allows `ActorRef`\-like usage.

An [EntityRef](EntityRef.html) is NOT an ActorRef–by design–in order to be explicit about the fact that the life\-cycle
of a sharded Entity is very different than a plain Actor. Most notably, this is shown by features of Entities
such as re\-balancing (an active Entity to a different node) or passivation. Both of which are aimed to be completely
transparent to users of such Entity. In other words, if this were to be a plain ActorRef, it would be possible to
apply DeathWatch to it, which in turn would then trigger when the sharded Actor stopped, breaking the illusion that
Entity refs are "always there". Please note that while not encouraged, it is possible to expose an Actor's `self`
ActorRef and watch it in case such notification is desired.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
6. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityTypeKey.html "Permalink") abstract  class [EntityTypeKey](EntityTypeKey.html "The key of an entity type, the name must be unique.")\[\-T] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The key of an entity type, the `name` must be unique.

The key of an entity type, the `name` must be unique.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
7. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html "Permalink") abstract  class [ShardedDaemonProcess](ShardedDaemonProcess.html "This extension runs a pre set number of actors in a cluster.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)This extension runs a pre set number of actors in a cluster.

This extension runs a pre set number of actors in a cluster.

The typical use case is when you have a task that can be divided in a number of workers, each doing a
sharded part of the work, for example consuming the read side events from Akka Persistence through
tagged events where each tag decides which consumer that should consume the event.

Each named set needs to be started on all the nodes of the cluster on start up.

The processes are spread out across the cluster, when the cluster topology changes the processes may be stopped
and started anew on a new node to rebalance them.

Not for user extension.

Annotations@[DoNotInherit](../../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../../akka/cluster/sharding/typed/javadsl/ClusterSharding$.html "Permalink")  object [ClusterSharding](ClusterSharding$.html)
2. [**](../../../../../akka/cluster/sharding/typed/javadsl/Entity$.html "Permalink")  object [Entity](Entity$.html)
3. [**](../../../../../akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html "Permalink")  object [EntityTypeKey](EntityTypeKey$.html)
4. [**](../../../../../akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html "Permalink")  object [ShardedDaemonProcess](ShardedDaemonProcess$.html)
5. [**](../../../../../akka/cluster/sharding/typed/javadsl/StartEntity$.html "Permalink")  object [StartEntity](StartEntity$.html)Annotations@nowarn()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/actor/typed/RecipientRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/ShardCoordinator.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/ShardingMessageExtractor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$$Passivate.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityRef.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityTypeKey$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/StartEntity$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/testkit/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/cluster/sharding/typed/javadsl/index.html)*