---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:50:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html
title: akka.persistence.testkit
---

# akka.persistence.testkit

## Content

# Package akka.persistence.testkit

- Interface Summary 
| Interface | Description |
| [EventStorage](EventStorage.html "interface in akka.persistence.testkit") | INTERNAL API |
| --- | --- |
| [JournalOperation](JournalOperation.html "interface in akka.persistence.testkit") | INTERNAL API |
| [ProcessingFailure](ProcessingFailure.html "interface in akka.persistence.testkit") |  |
| [ProcessingPolicy](ProcessingPolicy.html "interface in akka.persistence.testkit")\<U\> | Policies allow to emulate behavior of the storage (failures and rejections). |
| [ProcessingPolicy.DefaultPolicies](ProcessingPolicy.DefaultPolicies.html "interface in akka.persistence.testkit")\<U\> | INTERNAL API |
| [ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit") | INTERNAL API |
| [SnapshotOperation](SnapshotOperation.html "interface in akka.persistence.testkit") | INTERNAL API  Operations supported by snapshot plugin |
| [SnapshotStorage](SnapshotStorage.html "interface in akka.persistence.testkit") | INTERNAL API |
- Class Summary 
| Class | Description |
| [DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit") | Delete events in the journal up to `toSeqNumber` operation. |
| --- | --- |
| [DeleteEvents$](DeleteEvents$.html "class in akka.persistence.testkit") |  |
| [DeleteSnapshot](DeleteSnapshot.html "class in akka.persistence.testkit") | INTERNAL API |
| [DeleteSnapshotByMeta](DeleteSnapshotByMeta.html "class in akka.persistence.testkit") | Delete particular snapshot from storage by its metadata. |
| [DeleteSnapshotByMeta$](DeleteSnapshotByMeta$.html "class in akka.persistence.testkit") |  |
| [DeleteSnapshotsByCriteria](DeleteSnapshotsByCriteria.html "class in akka.persistence.testkit") | Delete snapshots from storage by criteria. |
| [DeleteSnapshotsByCriteria$](DeleteSnapshotsByCriteria$.html "class in akka.persistence.testkit") |  |
| [EventStorage.JournalPolicies$](EventStorage.JournalPolicies$.html "class in akka.persistence.testkit") |  |
| [EventStorage$](EventStorage$.html "class in akka.persistence.testkit") |  |
| [ExpectedFailure](ExpectedFailure.html "class in akka.persistence.testkit") |  |
| [ExpectedFailure$](ExpectedFailure$.html "class in akka.persistence.testkit") |  |
| [ExpectedRejection](ExpectedRejection.html "class in akka.persistence.testkit") |  |
| [ExpectedRejection$](ExpectedRejection$.html "class in akka.persistence.testkit") |  |
| [PersistenceTestKitDurableStateStorePlugin](PersistenceTestKitDurableStateStorePlugin.html "class in akka.persistence.testkit") |  |
| [PersistenceTestKitDurableStateStorePlugin$](PersistenceTestKitDurableStateStorePlugin$.html "class in akka.persistence.testkit") |  |
| [PersistenceTestKitPlugin](PersistenceTestKitPlugin.html "class in akka.persistence.testkit") | INTERNAL API |
| [PersistenceTestKitPlugin.Write$](PersistenceTestKitPlugin.Write$.html "class in akka.persistence.testkit") |  |
| [PersistenceTestKitPlugin$](PersistenceTestKitPlugin$.html "class in akka.persistence.testkit") |  |
| [PersistenceTestKitSnapshotPlugin](PersistenceTestKitSnapshotPlugin.html "class in akka.persistence.testkit") | INTERNAL API |
| [PersistenceTestKitSnapshotPlugin$](PersistenceTestKitSnapshotPlugin$.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.CountNextNCond](ProcessingPolicy.DefaultPolicies.CountNextNCond.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.FailNextN](ProcessingPolicy.DefaultPolicies.FailNextN.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.FailNextN$](ProcessingPolicy.DefaultPolicies.FailNextN$.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.FailNextNCond](ProcessingPolicy.DefaultPolicies.FailNextNCond.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.FailNextNCond$](ProcessingPolicy.DefaultPolicies.FailNextNCond$.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.PassAll](ProcessingPolicy.DefaultPolicies.PassAll.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.PassAll$](ProcessingPolicy.DefaultPolicies.PassAll$.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.RejectNextN](ProcessingPolicy.DefaultPolicies.RejectNextN.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.RejectNextN$](ProcessingPolicy.DefaultPolicies.RejectNextN$.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.RejectNextNCond](ProcessingPolicy.DefaultPolicies.RejectNextNCond.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.RejectNextNCond$](ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond](ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html "class in akka.persistence.testkit") |  |
| [ProcessingPolicy$](ProcessingPolicy$.html "class in akka.persistence.testkit") | INTERNAL API |
| [ProcessingSuccess](ProcessingSuccess.html "class in akka.persistence.testkit") |  |
| [ProcessingSuccess$](ProcessingSuccess$.html "class in akka.persistence.testkit") | Emulates successful processing of some operation. |
| [ReadEvents](ReadEvents.html "class in akka.persistence.testkit") | Read from journal operation with events that were read. |
| [ReadEvents$](ReadEvents$.html "class in akka.persistence.testkit") |  |
| [ReadSeqNum](ReadSeqNum.html "class in akka.persistence.testkit") | Read persistent actor's sequence number operation. |
| [ReadSeqNum$](ReadSeqNum$.html "class in akka.persistence.testkit") | Read persistent actor's sequence number operation. |
| [ReadSnapshot](ReadSnapshot.html "class in akka.persistence.testkit") | Storage read operation for recovery of the persistent actor. |
| [ReadSnapshot$](ReadSnapshot$.html "class in akka.persistence.testkit") |  |
| [Reject](Reject.html "class in akka.persistence.testkit") | Emulates rejection of operation by the journal with `error` exception. |
| [Reject$](Reject$.html "class in akka.persistence.testkit") |  |
| [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") | Snapshot metainformation. |
| [SnapshotMeta$](SnapshotMeta$.html "class in akka.persistence.testkit") |  |
| [SnapshotStorage.SnapshotPolicies$](SnapshotStorage.SnapshotPolicies$.html "class in akka.persistence.testkit") |  |
| [SnapshotStorage$](SnapshotStorage$.html "class in akka.persistence.testkit") |  |
| [StorageFailure](StorageFailure.html "class in akka.persistence.testkit") | Emulates exception thrown by the storage on the attempt to perform some operation. |
| [StorageFailure$](StorageFailure$.html "class in akka.persistence.testkit") |  |
| [WriteEvents](WriteEvents.html "class in akka.persistence.testkit") | Write in journal operation with events to be written. |
| [WriteEvents$](WriteEvents$.html "class in akka.persistence.testkit") |  |
| [WriteSnapshot](WriteSnapshot.html "class in akka.persistence.testkit") | Storage write operation to persist snapshot in the storage. |
| [WriteSnapshot$](WriteSnapshot$.html "class in akka.persistence.testkit") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteEvents$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotByMeta.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/DeleteSnapshotsByCriteria.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/EventStorage$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/EventStorage.JournalPolicies$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/EventStorage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedRejection$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ExpectedRejection.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitDurableStateStorePlugin$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitDurableStateStorePlugin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.Write$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitPlugin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/PersistenceTestKitSnapshotPlugin.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.CountNextNCond.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextN$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextN.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextNCond$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.FailNextNCond.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.PassAll.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextN$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextN.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.RejectNextNCond.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.ReturnAfterNextNCond.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.DefaultPolicies.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingPolicy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ProcessingSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadEvents$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadEvents.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSeqNum$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSeqNum.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/ReadSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/Reject$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/Reject.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/SnapshotMeta$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/package-summary.html)*