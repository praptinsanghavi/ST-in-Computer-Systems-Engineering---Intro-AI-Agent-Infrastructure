---
description: Akka 2.10.17 - akka.persistence.typed.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:01:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/typed/scaladsl/index.html
title: Akka 2.10.17 - akka.persistence.typed.scaladsl
---

# Akka 2.10.17 - akka.persistence.typed.scaladsl

> **Summary:** Akka 2.10.17 - akka.persistence.typed.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/typed/crdt/index.html "Permalink")  package [crdt](../crdt/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/delivery/index.html "Permalink")  package [delivery](../delivery/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[typed](../index.html)
- [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")
- [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")
- [EventWithMetadata](EventWithMetadata.html)
- [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")
- [Recovery](Recovery.html "Strategy for recovery of snapshots and events.")
- [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
- [ReplicationContext](ReplicationContext.html "Provides access to replication specific state")
- [ReplicationInterceptor](ReplicationInterceptor.html)
- [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")
- [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.")
- [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html)
- [**](../../../../akka/persistence/typed/serialization/index.html "Permalink")  package [serialization](../serialization/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/state/index.html "Permalink")  package [state](../state/index.html)Definition Classes[typed](../index.html)
- [**](../../../../akka/persistence/typed/telemetry/index.html "Permalink")  package [telemetry](../telemetry/index.html)Definition Classes[typed](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[typed](../index.html)

# scaladsl[**](../../../../akka/persistence/typed/scaladsl/index.html "Permalink")

#### package scaladsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/typed/scaladsl/Effect.html "Permalink")  trait [Effect](Effect.html "A command handler returns an Effect directive that defines what event or events to persist.")\[\+Event, State] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A command handler returns an `Effect` directive that defines what event or events to persist.

A command handler returns an `Effect` directive that defines what event or events to persist.

Instances are created through the factories in the [Effect](Effect.html) companion object.

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
2. [**](../../../../akka/persistence/typed/scaladsl/EffectBuilder.html "Permalink")  trait [EffectBuilder](EffectBuilder.html "A command handler returns an Effect directive that defines what event or events to persist.")\[\+Event, State] extends [Effect](Effect.html)\[Event, State] A command handler returns an `Effect` directive that defines what event or events to persist.

 A command handler returns an `Effect` directive that defines what event or events to persist.

Instances are created through the factories in the [Effect](Effect.html) companion object.

Additional side effects can be performed in the callback `thenRun`

Not for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
3. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior.html "Permalink")  trait [EventSourcedBehavior](EventSourcedBehavior.html "Further customization of the EventSourcedBehavior can be done with the methods defined here.")\[Command, Event, State] extends DeferredBehavior\[Command]Further customization of the `EventSourcedBehavior` can be done with the methods defined here.

Further customization of the `EventSourcedBehavior` can be done with the methods defined here.

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
4. [**](../../../../akka/persistence/typed/scaladsl/EventWithMetadata.html "Permalink") final  class [EventWithMetadata](EventWithMetadata.html)\[E] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
5. [**](../../../../akka/persistence/typed/scaladsl/Recovery.html "Permalink")  trait [Recovery](Recovery.html "Strategy for recovery of snapshots and events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Strategy for recovery of snapshots and events.
6. [**](../../../../akka/persistence/typed/scaladsl/ReplicationContext.html "Permalink")  trait [ReplicationContext](ReplicationContext.html "Provides access to replication specific state") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Provides access to replication specific state

Provides access to replication specific state

Not for user extension

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
7. [**](../../../../akka/persistence/typed/scaladsl/ReplicationInterceptor.html "Permalink")  trait [ReplicationInterceptor](ReplicationInterceptor.html)\[State, Event] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@FunctionalInterface()
8. [**](../../../../akka/persistence/typed/scaladsl/ReplyEffect.html "Permalink")  trait [ReplyEffect](ReplyEffect.html "EventSourcedBehavior.withEnforcedReplies can be used to enforce that replies are not forgotten.")\[\+Event, State] extends [Effect](Effect.html)\[Event, State][EventSourcedBehavior.withEnforcedReplies](EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]) can be used to enforce that replies are not forgotten.

[EventSourcedBehavior.withEnforcedReplies](EventSourcedBehavior$.html#withEnforcedReplies[Command,Event,State](persistenceId:akka.persistence.typed.PersistenceId,emptyState:State,commandHandler:(State,Command)=>akka.persistence.typed.scaladsl.ReplyEffect[Event,State],eventHandler:(State,Event)=>State):akka.persistence.typed.scaladsl.EventSourcedBehavior[Command,Event,State]) can be used to enforce that replies are not forgotten.
Then there will be compilation errors if the returned effect isn't a [ReplyEffect](ReplyEffect.html), which can be
created with [Effect.reply](Effect$.html#reply[ReplyMessage,Event,State](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:ReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State]), [Effect.noReply](Effect$.html#noReply[Event,State]:akka.persistence.typed.scaladsl.ReplyEffect[Event,State]), [EffectBuilder.thenReply](EffectBuilder.html#thenReply[ReplyMessage](replyTo:akka.actor.typed.ActorRef[ReplyMessage])(replyWithMessage:State=>ReplyMessage):akka.persistence.typed.scaladsl.ReplyEffect[Event,State]), or [EffectBuilder.thenNoReply](EffectBuilder.html#thenNoReply():akka.persistence.typed.scaladsl.ReplyEffect[Event,State]).

Not intended for user extension.

Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
9. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria.html "Permalink")  trait [RetentionCriteria](RetentionCriteria.html "Criteria for retention/deletion of snapshots and events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Criteria for retention/deletion of snapshots and events.
10. [**](../../../../akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html "Permalink")  trait [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html) extends [RetentionCriteria](RetentionCriteria.html)Annotations@[DoNotInherit](../../../annotation/DoNotInherit.html)()
### Value Members

1. [**](../../../../akka/persistence/typed/scaladsl/Effect$.html "Permalink")  object [Effect](Effect$.html "Factory methods for creating Effect directives - how an event sourced actor reacts on a command.")Factory methods for creating [Effect](Effect.html) directives \- how an event sourced actor reacts on a command.
2. [**](../../../../akka/persistence/typed/scaladsl/EventSourcedBehavior$.html "Permalink")  object [EventSourcedBehavior](EventSourcedBehavior$.html)
3. [**](../../../../akka/persistence/typed/scaladsl/EventWithMetadata$.html "Permalink")  object [EventWithMetadata](EventWithMetadata$.html)
4. [**](../../../../akka/persistence/typed/scaladsl/PersistentFSMMigration$.html "Permalink")  object [PersistentFSMMigration](PersistentFSMMigration$.html "Helper functions for migration from PersistentFSM to Persistence Typed")Helper functions for migration from PersistentFSM to Persistence Typed
5. [**](../../../../akka/persistence/typed/scaladsl/Recovery$.html "Permalink")  object [Recovery](Recovery$.html "Strategy for recovery of snapshots and events.")Strategy for recovery of snapshots and events.
6. [**](../../../../akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html "Permalink")  object [ReplicatedEventSourcing](ReplicatedEventSourcing$.html)
7. [**](../../../../akka/persistence/typed/scaladsl/RetentionCriteria$.html "Permalink")  object [RetentionCriteria](RetentionCriteria$.html "Criteria for retention/deletion of snapshots and events.")Criteria for retention/deletion of snapshots and events.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.17/akka/annotation/DoNotInherit.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/crdt/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/delivery/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/internal/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventWithMetadata$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/serialization/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/state/index.html
- https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/telemetry/index.html
- https://doc.akka.io/api/akka-core/2.10.17/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.10.17/akka/persistence/typed/scaladsl/index.html)*