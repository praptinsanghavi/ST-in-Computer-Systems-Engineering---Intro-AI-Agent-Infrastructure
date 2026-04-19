---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:11:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/package-summary.html
title: akka.persistence.typed
---

# akka.persistence.typed

## Content

# Package akka.persistence.typed

- Interface Summary 
| Interface | Description |
| [DeletionTarget](DeletionTarget.html "interface in akka.persistence.typed") | Not for user extension |
| --- | --- |
| [EventSeq](EventSeq.html "interface in akka.persistence.typed")\<A\> |  |
| [EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed") | Supertype for all Akka Persistence Typed specific signals |
| [PublishedEvent](PublishedEvent.html "interface in akka.persistence.typed") | When using event publishing the events published to the system event stream will be in this form. |
| [SnapshotAdapter](SnapshotAdapter.html "interface in akka.persistence.typed")\<State\> | Facility to convert snapshots from and to a specialized data model. |
- Class Summary 
| Class | Description |
| [DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed") |  |
| --- | --- |
| [DeleteEventsCompleted$](DeleteEventsCompleted$.html "class in akka.persistence.typed") |  |
| [DeleteEventsFailed](DeleteEventsFailed.html "class in akka.persistence.typed") |  |
| [DeleteEventsFailed$](DeleteEventsFailed$.html "class in akka.persistence.typed") |  |
| [DeleteSnapshotsCompleted](DeleteSnapshotsCompleted.html "class in akka.persistence.typed") |  |
| [DeleteSnapshotsCompleted$](DeleteSnapshotsCompleted$.html "class in akka.persistence.typed") |  |
| [DeleteSnapshotsFailed](DeleteSnapshotsFailed.html "class in akka.persistence.typed") |  |
| [DeleteSnapshotsFailed$](DeleteSnapshotsFailed$.html "class in akka.persistence.typed") |  |
| [DeletionTarget.Criteria](DeletionTarget.Criteria.html "class in akka.persistence.typed") |  |
| [DeletionTarget.Criteria$](DeletionTarget.Criteria$.html "class in akka.persistence.typed") |  |
| [DeletionTarget.Individual](DeletionTarget.Individual.html "class in akka.persistence.typed") |  |
| [DeletionTarget.Individual$](DeletionTarget.Individual$.html "class in akka.persistence.typed") |  |
| [DeletionTarget$](DeletionTarget$.html "class in akka.persistence.typed") |  |
| [EmptyEventSeq](EmptyEventSeq.html "class in akka.persistence.typed") | INTERNAL API |
| [EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.typed") | INTERNAL API |
| [EventAdapter](EventAdapter.html "class in akka.persistence.typed")\<E,​P\> | Facility to convert from and to specialised data models, as may be required by specialized persistence Journals. |
| [EventSeq$](EventSeq$.html "class in akka.persistence.typed") |  |
| [EventsSeq$](EventsSeq$.html "class in akka.persistence.typed") |  |
| [NoOpEventAdapter$](NoOpEventAdapter$.html "class in akka.persistence.typed") | INTERNAL API |
| [PersistenceId](PersistenceId.html "class in akka.persistence.typed") | Unique identifier in the backend data store (journal and snapshot store) of the  persistent actor. |
| [PersistenceId$](PersistenceId$.html "class in akka.persistence.typed") |  |
| [PersistFailed](PersistFailed.html "class in akka.persistence.typed")\<Command,​Event\> | param: failure the original cause  param: command the command that persisted the event, may be undefined if it is a replicated event |
| [PersistFailed$](PersistFailed$.html "class in akka.persistence.typed") |  |
| [PersistRejected](PersistRejected.html "class in akka.persistence.typed")\<Command,​Event\> | param: failure the original cause  param: command the command that persisted the event, may be undefined if it is a replicated event |
| [PersistRejected$](PersistRejected$.html "class in akka.persistence.typed") |  |
| [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence.typed") |  |
| [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence.typed") |  |
| [RecoveryFailed](RecoveryFailed.html "class in akka.persistence.typed") |  |
| [RecoveryFailed$](RecoveryFailed$.html "class in akka.persistence.typed") |  |
| [ReplicaId](ReplicaId.html "class in akka.persistence.typed") |  |
| [ReplicaId$](ReplicaId$.html "class in akka.persistence.typed") |  |
| [ReplicationId](ReplicationId.html "class in akka.persistence.typed") | param: typeName The name of the entity type e.g. |
| [ReplicationId$](ReplicationId$.html "class in akka.persistence.typed") |  |
| [SingleEventSeq$](SingleEventSeq$.html "class in akka.persistence.typed") |  |
| [SnapshotCompleted](SnapshotCompleted.html "class in akka.persistence.typed") |  |
| [SnapshotCompleted$](SnapshotCompleted$.html "class in akka.persistence.typed") |  |
| [SnapshotFailed](SnapshotFailed.html "class in akka.persistence.typed") |  |
| [SnapshotFailed$](SnapshotFailed$.html "class in akka.persistence.typed") |  |
| [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence.typed") | Snapshot metadata. |
| [SnapshotMetadata$](SnapshotMetadata$.html "class in akka.persistence.typed") |  |
| [SnapshotRecovered](SnapshotRecovered.html "class in akka.persistence.typed") |  |
| [SnapshotRecovered$](SnapshotRecovered$.html "class in akka.persistence.typed") |  |
| [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence.typed") | Selection criteria for loading and deleting snapshots. |
| [SnapshotSelectionCriteria$](SnapshotSelectionCriteria$.html "class in akka.persistence.typed") |  |
- Exception Summary 
| Exception | Description |
| [EventRejectedException](EventRejectedException.html "class in akka.persistence.typed") | Thrown if a journal rejects an event e.g. |
| --- | --- |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteEventsCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteEventsFailed$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteEventsFailed.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteSnapshotsCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteSnapshotsCompleted.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteSnapshotsFailed$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeleteSnapshotsFailed.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeletionTarget$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeletionTarget.Criteria$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeletionTarget.Criteria.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeletionTarget.Individual$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeletionTarget.Individual.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/DeletionTarget.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EmptyEventSeq$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EmptyEventSeq.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EventRejectedException.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/EventsSeq$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/NoOpEventAdapter$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PersistFailed$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PersistFailed.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PersistRejected$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PersistRejected.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PersistenceId$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PersistenceId.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/PublishedEvent.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/RecoveryCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/RecoveryCompleted.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/RecoveryFailed$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/RecoveryFailed.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/ReplicaId$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/ReplicationId$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/ReplicationId.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SingleEventSeq$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotAdapter.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotCompleted$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotCompleted.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotFailed$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotFailed.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotMetadata$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotMetadata.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotRecovered$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotRecovered.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotSelectionCriteria$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/SnapshotSelectionCriteria.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/persistence/typed/package-summary.html)*