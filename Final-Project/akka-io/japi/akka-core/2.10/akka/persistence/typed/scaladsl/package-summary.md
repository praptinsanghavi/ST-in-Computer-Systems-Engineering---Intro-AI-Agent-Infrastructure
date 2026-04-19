---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:09:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html
title: akka.persistence.typed.scaladsl
---

# akka.persistence.typed.scaladsl

## Content

# Package akka.persistence.typed.scaladsl

- Interface Summary 
| Interface | Description |
| [Effect](Effect.html "interface in akka.persistence.typed.scaladsl")\<Event,​State\> | A command handler returns an `Effect` directive that defines what event or events to persist. |
| --- | --- |
| [EffectBuilder](EffectBuilder.html "interface in akka.persistence.typed.scaladsl")\<Event,​State\> | A command handler returns an `Effect` directive that defines what event or events to persist. |
| [EventSourcedBehavior](EventSourcedBehavior.html "interface in akka.persistence.typed.scaladsl")\<Command,​Event,​State\> | Further customization of the `EventSourcedBehavior` can be done with the methods defined here. |
| [Recovery](Recovery.html "interface in akka.persistence.typed.scaladsl") | Strategy for recovery of snapshots and events. |
| [ReplicationContext](ReplicationContext.html "interface in akka.persistence.typed.scaladsl") | Provides access to replication specific state |
| [ReplicationInterceptor](ReplicationInterceptor.html "interface in akka.persistence.typed.scaladsl")\<State,​Event\> |  |
| [ReplyEffect](ReplyEffect.html "interface in akka.persistence.typed.scaladsl")\<Event,​State\> | `EventSourcedBehavior.withEnforcedReplies` can be used to enforce that replies are not forgotten. |
| [RetentionCriteria](RetentionCriteria.html "interface in akka.persistence.typed.scaladsl") | Criteria for retention/deletion of snapshots and events. |
| [SnapshotCountRetentionCriteria](SnapshotCountRetentionCriteria.html "interface in akka.persistence.typed.scaladsl") |  |
- Class Summary 
| Class | Description |
| [Effect$](Effect$.html "class in akka.persistence.typed.scaladsl") | Factory methods for creating [`Effect`](Effect.html "interface in akka.persistence.typed.scaladsl") directives \- how an event sourced actor reacts on a command. |
| --- | --- |
| [EventSourcedBehavior.CommandHandler$](EventSourcedBehavior.CommandHandler$.html "class in akka.persistence.typed.scaladsl") | The `CommandHandler` defines how to act on commands. |
| [EventSourcedBehavior$](EventSourcedBehavior$.html "class in akka.persistence.typed.scaladsl") |  |
| [EventWithMetadata](EventWithMetadata.html "class in akka.persistence.typed.scaladsl")\<E\> |  |
| [EventWithMetadata$](EventWithMetadata$.html "class in akka.persistence.typed.scaladsl") |  |
| [PersistentFSMMigration](PersistentFSMMigration.html "class in akka.persistence.typed.scaladsl") | Helper functions for migration from PersistentFSM to Persistence Typed |
| [PersistentFSMMigration$](PersistentFSMMigration$.html "class in akka.persistence.typed.scaladsl") | Helper functions for migration from PersistentFSM to Persistence Typed |
| [Recovery$](Recovery$.html "class in akka.persistence.typed.scaladsl") | Strategy for recovery of snapshots and events. |
| [ReplicatedEventSourcing](ReplicatedEventSourcing.html "class in akka.persistence.typed.scaladsl") |  |
| [ReplicatedEventSourcing$](ReplicatedEventSourcing$.html "class in akka.persistence.typed.scaladsl") |  |
| [RetentionCriteria$](RetentionCriteria$.html "class in akka.persistence.typed.scaladsl") | Criteria for retention/deletion of snapshots and events. |
| [SnapshotWhenPredicate$](SnapshotWhenPredicate$.html "class in akka.persistence.typed.scaladsl") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Effect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EffectBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.CommandHandler$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/EventWithMetadata.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/PersistentFSMMigration$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/PersistentFSMMigration.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/Recovery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicatedEventSourcing.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/ReplyEffect.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/RetentionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/SnapshotCountRetentionCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/SnapshotWhenPredicate$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/scaladsl/package-summary.html)*