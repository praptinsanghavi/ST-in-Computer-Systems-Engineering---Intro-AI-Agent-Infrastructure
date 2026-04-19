---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:29Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html
title: akka.persistence.typed.javadsl
---

# akka.persistence.typed.javadsl

## Content

# Package akka.persistence.typed.javadsl

- Interface Summary 
| Interface | Description |
| [CommandHandler](CommandHandler.html "interface in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | FunctionalInterface for reacting on commands |
| --- | --- |
| [CommandHandlerWithReply](CommandHandlerWithReply.html "interface in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | FunctionalInterface for reacting on commands |
| [Effect](Effect.html "interface in akka.persistence.typed.javadsl")\<Event,​State\> | A command handler returns an `Effect` directive that defines what event or events to persist. |
| [EventHandler](EventHandler.html "interface in akka.persistence.typed.javadsl")\<State,​Event\> | FunctionalInterface for reacting on events having been persisted |
| [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.javadsl") | Provides access to replication specific state |
| [ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.javadsl")\<Event,​State\> |  |
| [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.javadsl")\<Event,​State\> | [`EventSourcedBehaviorWithEnforcedReplies`](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl") can be used to enforce that replies are not forgotten. |
- Class Summary 
| Class | Description |
| [CommandHandlerBuilder](CommandHandlerBuilder.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> |  |
| --- | --- |
| [CommandHandlerBuilder$](CommandHandlerBuilder$.html "class in akka.persistence.typed.javadsl") |  |
| [CommandHandlerBuilderByState](CommandHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​S extends State,​State\> |  |
| [CommandHandlerBuilderByState$](CommandHandlerBuilderByState$.html "class in akka.persistence.typed.javadsl") |  |
| [CommandHandlerWithReplyBuilder](CommandHandlerWithReplyBuilder.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> |  |
| [CommandHandlerWithReplyBuilder$](CommandHandlerWithReplyBuilder$.html "class in akka.persistence.typed.javadsl") |  |
| [CommandHandlerWithReplyBuilderByState](CommandHandlerWithReplyBuilderByState.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​S extends State,​State\> |  |
| [CommandHandlerWithReplyBuilderByState$](CommandHandlerWithReplyBuilderByState$.html "class in akka.persistence.typed.javadsl") |  |
| [EffectBuilder](EffectBuilder.html "class in akka.persistence.typed.javadsl")\<Event,​State\> | A command handler returns an `Effect` directive that defines what event or events to persist. |
| [EffectFactories](EffectFactories.html "class in akka.persistence.typed.javadsl")\<Event,​State\> | Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.javadsl") directives \- how an event sourced actor reacts on a command. |
| [EffectFactories$](EffectFactories$.html "class in akka.persistence.typed.javadsl") | INTERNAL API: see `class EffectFactories` |
| [EventHandlerBuilder](EventHandlerBuilder.html "class in akka.persistence.typed.javadsl")\<State,​Event\> |  |
| [EventHandlerBuilder$](EventHandlerBuilder$.html "class in akka.persistence.typed.javadsl") |  |
| [EventHandlerBuilderByState](EventHandlerBuilderByState.html "class in akka.persistence.typed.javadsl")\<S extends State,​State,​Event\> |  |
| [EventHandlerBuilderByState$](EventHandlerBuilderByState$.html "class in akka.persistence.typed.javadsl") |  |
| [EventSourcedBehavior](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | For projects using Java 17 and newer, also see [`EventSourcedOnCommandBehavior`](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl") |
| [EventSourcedBehaviorWithEnforcedReplies](EventSourcedBehaviorWithEnforcedReplies.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | A [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") that is enforcing that replies to commands are not forgotten. |
| [EventSourcedOnCommandBehavior](EventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | Event sourced behavior for projects built with Java 17 or newer where message handling can be done  using switch pattern match. |
| [EventSourcedOnCommandWithReplyBehavior](EventSourcedOnCommandWithReplyBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | Event sourced behavior for projects built with Java 17 or newer where message handling can be done  using switch pattern match. |
| [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.javadsl")\<E\> |  |
| [EventWithMetadata$](EventWithMetadata$.html "class in akka.persistence.typed.javadsl") |  |
| [PersistentFSMMigration](PersistentFSMMigration.html "class in akka.persistence.typed.javadsl") | Helper functions for migration from PersistentFSM to Persistence Typed |
| [PersistentFSMMigration$](PersistentFSMMigration$.html "class in akka.persistence.typed.javadsl") | Helper functions for migration from PersistentFSM to Persistence Typed |
| [Recovery](Recovery.html "class in akka.persistence.typed.javadsl") | Strategy for recovery of snapshots and events. |
| [Recovery$](Recovery$.html "class in akka.persistence.typed.javadsl") | Strategy for recovery of snapshots and events. |
| [ReplicatedEventSourcedBehavior](ReplicatedEventSourcedBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | Base class for replicated event sourced behaviors. |
| [ReplicatedEventSourcedOnCommandBehavior](ReplicatedEventSourcedOnCommandBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling  can be done using switch pattern match. |
| [ReplicatedEventSourcedOnCommandWithReplyBehavior](ReplicatedEventSourcedOnCommandWithReplyBehavior.html "class in akka.persistence.typed.javadsl")\<Command,​Event,​State\> | Base class for replicated event sourced behaviors for projects built with Java 17 or newer where message handling  can be done using switch pattern match. |
| [ReplicatedEventSourcing](ReplicatedEventSourcing.html "class in akka.persistence.typed.javadsl") |  |
| [ReplicatedEventSourcing$](ReplicatedEventSourcing$.html "class in akka.persistence.typed.javadsl") |  |
| [RetentionCriteria](RetentionCriteria.html "class in akka.persistence.typed.javadsl") | Criteria for retention/deletion of snapshots and events. |
| [RetentionCriteria$](RetentionCriteria$.html "class in akka.persistence.typed.javadsl") | Criteria for retention/deletion of snapshots and events. |
| [SignalHandler](SignalHandler.html "class in akka.persistence.typed.javadsl")\<State\> |  |
| [SignalHandler$](SignalHandler$.html "class in akka.persistence.typed.javadsl") |  |
| [SignalHandlerBuilder](SignalHandlerBuilder.html "class in akka.persistence.typed.javadsl")\<State\> | Mutable builder for handling signals in [`EventSourcedBehavior`](EventSourcedBehavior.html "class in akka.persistence.typed.javadsl") |
| [SignalHandlerBuilder$](SignalHandlerBuilder$.html "class in akka.persistence.typed.javadsl") |  |
| [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "class in akka.persistence.typed.javadsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilderByState$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerBuilderByState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerWithReply.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/CommandHandlerWithReplyBuilderByState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/Effect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectFactories$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EffectFactories.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventHandlerBuilderByState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedBehaviorWithEnforcedReplies.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/PersistentFSMMigration$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/PersistentFSMMigration.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/Recovery$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/Recovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcedOnCommandWithReplyBehavior.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicatedEventSourcing.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/ReplyEffect.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandler$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandler.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandlerBuilder$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SignalHandlerBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/SnapshotCountRetentionCriteria.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/javadsl/package-summary.html)*