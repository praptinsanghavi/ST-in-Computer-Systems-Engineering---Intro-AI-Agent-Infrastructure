---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Protocol.Message.html
title: Protocol.Message
---

# Protocol.Message

## Content

Package [akka.persistence](package-summary.html)
## Interface Protocol.Message

- All Superinterfaces:
`[NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")`

All Known Subinterfaces:
`[JournalProtocol.Message](JournalProtocol.Message.html "interface in akka.persistence")`, `[JournalProtocol.Request](JournalProtocol.Request.html "interface in akka.persistence")`, `[JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence")`, `[SnapshotProtocol.Message](SnapshotProtocol.Message.html "interface in akka.persistence")`, `[SnapshotProtocol.Request](SnapshotProtocol.Request.html "interface in akka.persistence")`, `[SnapshotProtocol.Response](SnapshotProtocol.Response.html "interface in akka.persistence")`

All Known Implementing Classes:
`[DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence")`, `[DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence")`, `[DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence")`, `[DeleteSnapshotsFailure](DeleteSnapshotsFailure.html "class in akka.persistence")`, `[DeleteSnapshotsSuccess](DeleteSnapshotsSuccess.html "class in akka.persistence")`, `[DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence")`, `[JournalProtocol.DeleteMessagesTo](JournalProtocol.DeleteMessagesTo.html "class in akka.persistence")`, `[JournalProtocol.LoopMessageSuccess](JournalProtocol.LoopMessageSuccess.html "class in akka.persistence")`, `[JournalProtocol.RecoverySuccess](JournalProtocol.RecoverySuccess.html "class in akka.persistence")`, `[JournalProtocol.ReplayedMessage](JournalProtocol.ReplayedMessage.html "class in akka.persistence")`, `[JournalProtocol.ReplayMessages](JournalProtocol.ReplayMessages.html "class in akka.persistence")`, `[JournalProtocol.ReplayMessagesFailure](JournalProtocol.ReplayMessagesFailure.html "class in akka.persistence")`, `[JournalProtocol.WriteMessageFailure](JournalProtocol.WriteMessageFailure.html "class in akka.persistence")`, `[JournalProtocol.WriteMessageRejected](JournalProtocol.WriteMessageRejected.html "class in akka.persistence")`, `[JournalProtocol.WriteMessages](JournalProtocol.WriteMessages.html "class in akka.persistence")`, `[JournalProtocol.WriteMessagesFailed](JournalProtocol.WriteMessagesFailed.html "class in akka.persistence")`, `[JournalProtocol.WriteMessagesSuccessful$](JournalProtocol.WriteMessagesSuccessful$.html "class in akka.persistence")`, `[JournalProtocol.WriteMessageSuccess](JournalProtocol.WriteMessageSuccess.html "class in akka.persistence")`, `[SaveSnapshotFailure](SaveSnapshotFailure.html "class in akka.persistence")`, `[SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence")`, `[SnapshotProtocol.DeleteSnapshot](SnapshotProtocol.DeleteSnapshot.html "class in akka.persistence")`, `[SnapshotProtocol.DeleteSnapshots](SnapshotProtocol.DeleteSnapshots.html "class in akka.persistence")`, `[SnapshotProtocol.LoadSnapshot](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence")`, `[SnapshotProtocol.LoadSnapshotFailed](SnapshotProtocol.LoadSnapshotFailed.html "class in akka.persistence")`, `[SnapshotProtocol.LoadSnapshotResult](SnapshotProtocol.LoadSnapshotResult.html "class in akka.persistence")`, `[SnapshotProtocol.SaveSnapshot](SnapshotProtocol.SaveSnapshot.html "class in akka.persistence")`

Enclosing class:
[Protocol](Protocol.html "class in akka.persistence")

---

```
public static interface Protocol.Message
extends [NoSerializationVerificationNeeded](../actor/NoSerializationVerificationNeeded.html "interface in akka.actor")
```

INTERNAL API.
 
 Internal persistence extension messages extend this trait.
 

 Helps persistence plugin developers to differentiate
 internal persistence extension messages from their custom plugin messages.
 

 Journal messages need not be serialization verified as the Journal Actor
 should always be a local Actor (and serialization is performed by plugins).
 One notable exception to this is the shared journal used for testing.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/NoSerializationVerificationNeeded.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.DeleteMessagesTo.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.LoopMessageSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.RecoverySuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayMessagesFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.ReplayedMessage.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Request.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageRejected.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessageSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessages.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessagesFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/JournalProtocol.WriteMessagesSuccessful$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Protocol.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SaveSnapshotFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.DeleteSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.DeleteSnapshots.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshotFailed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.LoadSnapshotResult.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Message.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Request.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.Response.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/SnapshotProtocol.SaveSnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Protocol.Message.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Protocol.Message.html)*