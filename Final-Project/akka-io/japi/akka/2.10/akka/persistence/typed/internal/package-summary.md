---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:11:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/package-summary.html
title: akka.persistence.typed.internal
---

# akka.persistence.typed.internal

## Content

# Package akka.persistence.typed.internal

- Interface Summary 
| Interface | Description |
| [EventWriter.AskMaxSeqNrReason](EventWriter.AskMaxSeqNrReason.html "interface in akka.persistence.typed.internal") |  |
| --- | --- |
| [EventWriter.Command](EventWriter.Command.html "interface in akka.persistence.typed.internal") |  |
| [InternalProtocol](InternalProtocol.html "interface in akka.persistence.typed.internal") | Protocol used internally by the eventsourced behaviors. |
| [JournalInteractions](JournalInteractions.html "interface in akka.persistence.typed.internal")\<C,​E,​S\> | INTERNAL API |
| [ReplicationStreamControl](ReplicationStreamControl.html "interface in akka.persistence.typed.internal") | INTERNAL API |
| [SnapshotInteractions](SnapshotInteractions.html "interface in akka.persistence.typed.internal")\<C,​E,​S\> | INTERNAL API |
| [StashManagement](StashManagement.html "interface in akka.persistence.typed.internal")\<C,​E,​S\> | INTERNAL API: Stash management for persistent behaviors |
| [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence.typed.internal") | INTERNAL API |
- Class Summary 
| Class | Description |
| [AsyncEffect$](AsyncEffect$.html "class in akka.persistence.typed.internal") |  |
| --- | --- |
| [BehaviorSetup$](BehaviorSetup$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [CompositeEffect$](CompositeEffect$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [DefaultRecovery](DefaultRecovery.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [DefaultRecovery$](DefaultRecovery$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [DisabledRecovery](DisabledRecovery.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [DisabledRecovery$](DisabledRecovery$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [DisabledRetentionCriteria](DisabledRetentionCriteria.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [DisabledRetentionCriteria$](DisabledRetentionCriteria$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [EventSourcedBehaviorImpl$](EventSourcedBehaviorImpl$.html "class in akka.persistence.typed.internal") |  |
| [EventSourcedSettings$](EventSourcedSettings$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [EventWriter](EventWriter.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [EventWriter.EventWriterSettings](EventWriter.EventWriterSettings.html "class in akka.persistence.typed.internal") |  |
| [EventWriter.EventWriterSettings$](EventWriter.EventWriterSettings$.html "class in akka.persistence.typed.internal") |  |
| [EventWriter.Write](EventWriter.Write.html "class in akka.persistence.typed.internal") |  |
| [EventWriter.Write$](EventWriter.Write$.html "class in akka.persistence.typed.internal") |  |
| [EventWriter.WriteAck](EventWriter.WriteAck.html "class in akka.persistence.typed.internal") |  |
| [EventWriter.WriteAck$](EventWriter.WriteAck$.html "class in akka.persistence.typed.internal") |  |
| [EventWriter$](EventWriter$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [EventWriterExtension$](EventWriterExtension$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [InternalProtocol.AsyncEffectCompleted](InternalProtocol.AsyncEffectCompleted.html "class in akka.persistence.typed.internal")\<C,​E,​S\> |  |
| [InternalProtocol.AsyncEffectCompleted$](InternalProtocol.AsyncEffectCompleted$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.AsyncReplicationInterceptCompleted](InternalProtocol.AsyncReplicationInterceptCompleted.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.AsyncReplicationInterceptCompleted$](InternalProtocol.AsyncReplicationInterceptCompleted$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.ContinueUnstash$](InternalProtocol.ContinueUnstash$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.IncomingCommand](InternalProtocol.IncomingCommand.html "class in akka.persistence.typed.internal")\<C\> |  |
| [InternalProtocol.IncomingCommand$](InternalProtocol.IncomingCommand$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.JournalResponse](InternalProtocol.JournalResponse.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.JournalResponse$](InternalProtocol.JournalResponse$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.RecoveryPermitGranted$](InternalProtocol.RecoveryPermitGranted$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.RecoveryTickEvent](InternalProtocol.RecoveryTickEvent.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.RecoveryTickEvent$](InternalProtocol.RecoveryTickEvent$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.ReplicatedEventEnvelope](InternalProtocol.ReplicatedEventEnvelope.html "class in akka.persistence.typed.internal")\<E\> |  |
| [InternalProtocol.ReplicatedEventEnvelope$](InternalProtocol.ReplicatedEventEnvelope$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.SnapshotterResponse](InternalProtocol.SnapshotterResponse.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol.SnapshotterResponse$](InternalProtocol.SnapshotterResponse$.html "class in akka.persistence.typed.internal") |  |
| [InternalProtocol$](InternalProtocol$.html "class in akka.persistence.typed.internal") |  |
| [JournalInteractions.EventToPersist](JournalInteractions.EventToPersist.html "class in akka.persistence.typed.internal") |  |
| [JournalInteractions.EventToPersist$](JournalInteractions.EventToPersist$.html "class in akka.persistence.typed.internal") |  |
| [JournalInteractions$](JournalInteractions$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [ManyVersionVector$](ManyVersionVector$.html "class in akka.persistence.typed.internal") |  |
| [NoOpSnapshotAdapter$](NoOpSnapshotAdapter$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [OneVersionVector$](OneVersionVector$.html "class in akka.persistence.typed.internal") |  |
| [Persist$](Persist$.html "class in akka.persistence.typed.internal") |  |
| [PersistAll$](PersistAll$.html "class in akka.persistence.typed.internal") |  |
| [PersistenceMdc](PersistenceMdc.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [PersistenceMdc$](PersistenceMdc$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [PersistNothing](PersistNothing.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [PersistNothing$](PersistNothing$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [PublishedEventImpl$](PublishedEventImpl$.html "class in akka.persistence.typed.internal") |  |
| [RecoveryWithSnapshotSelectionCriteria$](RecoveryWithSnapshotSelectionCriteria$.html "class in akka.persistence.typed.internal") |  |
| [ReplayingEvents$](ReplayingEvents$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [ReplayingSnapshot$](ReplayingSnapshot$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [ReplayOnlyLastRecovery](ReplayOnlyLastRecovery.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [ReplayOnlyLastRecovery$](ReplayOnlyLastRecovery$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [ReplicatedEvent$](ReplicatedEvent$.html "class in akka.persistence.typed.internal") |  |
| [ReplicatedEventAck](ReplicatedEventAck.html "class in akka.persistence.typed.internal") |  |
| [ReplicatedEventAck$](ReplicatedEventAck$.html "class in akka.persistence.typed.internal") |  |
| [ReplicatedEventMetadata](ReplicatedEventMetadata.html "class in akka.persistence.typed.internal") |  |
| [ReplicatedEventMetadata$](ReplicatedEventMetadata$.html "class in akka.persistence.typed.internal") |  |
| [ReplicatedPublishedEventMetaData](ReplicatedPublishedEventMetaData.html "class in akka.persistence.typed.internal") |  |
| [ReplicatedSnapshotMetadata$](ReplicatedSnapshotMetadata$.html "class in akka.persistence.typed.internal") |  |
| [ReplicationContextImpl$](ReplicationContextImpl$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [ReplicationSetup$](ReplicationSetup$.html "class in akka.persistence.typed.internal") |  |
| [RequestingRecoveryPermit$](RequestingRecoveryPermit$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [Running$](Running$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [SideEffect$](SideEffect$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [SnapshotCountRetentionCriteriaImpl$](SnapshotCountRetentionCriteriaImpl$.html "class in akka.persistence.typed.internal") |  |
| [Stash](Stash.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [Stash$](Stash$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [StashOverflowStrategy.Drop$](StashOverflowStrategy.Drop$.html "class in akka.persistence.typed.internal") |  |
| [StashOverflowStrategy.Fail$](StashOverflowStrategy.Fail$.html "class in akka.persistence.typed.internal") |  |
| [StashOverflowStrategy$](StashOverflowStrategy$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [Stop](Stop.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [Stop$](Stop$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [Unhandled](Unhandled.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [Unhandled$](Unhandled$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [UnstashAll](UnstashAll.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [UnstashAll$](UnstashAll$.html "class in akka.persistence.typed.internal") | INTERNAL API |
| [VersionVector$](VersionVector$.html "class in akka.persistence.typed.internal") | INTERNAL API |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/AsyncEffect$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/BehaviorSetup$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/CompositeEffect$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/DefaultRecovery$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/DefaultRecovery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/DisabledRecovery$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/DisabledRecovery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/DisabledRetentionCriteria$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/DisabledRetentionCriteria.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventSourcedBehaviorImpl$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventSourcedSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.AskMaxSeqNrReason.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.Command.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.EventWriterSettings$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.EventWriterSettings.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.Write$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.Write.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.WriteAck$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.WriteAck.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriter.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/EventWriterExtension$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.AsyncEffectCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.AsyncEffectCompleted.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.AsyncReplicationInterceptCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.AsyncReplicationInterceptCompleted.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.ContinueUnstash$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.IncomingCommand$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.IncomingCommand.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.JournalResponse$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.JournalResponse.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.RecoveryPermitGranted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.RecoveryTickEvent$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.RecoveryTickEvent.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.ReplicatedEventEnvelope$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.ReplicatedEventEnvelope.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.SnapshotterResponse.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/InternalProtocol.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/JournalInteractions$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/JournalInteractions.EventToPersist$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/JournalInteractions.EventToPersist.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/JournalInteractions.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/ManyVersionVector$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/NoOpSnapshotAdapter$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/OneVersionVector$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/Persist$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/PersistAll$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/PersistNothing$.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/internal/package-summary.html)*