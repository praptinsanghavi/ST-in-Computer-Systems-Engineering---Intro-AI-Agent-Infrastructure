---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html
title: akka.persistence.serialization
---

# akka.persistence.serialization

## Content

# Package akka.persistence.serialization

- Interface Summary 
| Interface | Description |
| [Message](Message.html "interface in akka.persistence.serialization") | Marker trait for all protobuf\-serializable messages in `akka.persistence`. |
| --- | --- |
| [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder](MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.AtomicWriteOrBuilder](MessageFormats.AtomicWriteOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.CompositeMetadataOrBuilder](MessageFormats.CompositeMetadataOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.PersistentFSMSnapshotOrBuilder](MessageFormats.PersistentFSMSnapshotOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.PersistentMessageOrBuilder](MessageFormats.PersistentMessageOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.PersistentPayloadOrBuilder](MessageFormats.PersistentPayloadOrBuilder.html "interface in akka.persistence.serialization") |  |
| [MessageFormats.PersistentStateChangeEventOrBuilder](MessageFormats.PersistentStateChangeEventOrBuilder.html "interface in akka.persistence.serialization") |  |
- Class Summary 
| Class | Description |
| [MessageFormats](MessageFormats.html "class in akka.persistence.serialization") |  |
| --- | --- |
| [MessageFormats.AtLeastOnceDeliverySnapshot](MessageFormats.AtLeastOnceDeliverySnapshot.html "class in akka.persistence.serialization") | Protobuf type `AtLeastOnceDeliverySnapshot` |
| [MessageFormats.AtLeastOnceDeliverySnapshot.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html "class in akka.persistence.serialization") | Protobuf type `AtLeastOnceDeliverySnapshot` |
| [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html "class in akka.persistence.serialization") | Protobuf type `AtLeastOnceDeliverySnapshot.UnconfirmedDelivery` |
| [MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder](MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html "class in akka.persistence.serialization") | Protobuf type `AtLeastOnceDeliverySnapshot.UnconfirmedDelivery` |
| [MessageFormats.AtomicWrite](MessageFormats.AtomicWrite.html "class in akka.persistence.serialization") | Protobuf type `AtomicWrite` |
| [MessageFormats.AtomicWrite.Builder](MessageFormats.AtomicWrite.Builder.html "class in akka.persistence.serialization") | Protobuf type `AtomicWrite` |
| [MessageFormats.CompositeMetadata](MessageFormats.CompositeMetadata.html "class in akka.persistence.serialization") | Protobuf type `CompositeMetadata` |
| [MessageFormats.CompositeMetadata.Builder](MessageFormats.CompositeMetadata.Builder.html "class in akka.persistence.serialization") | Protobuf type `CompositeMetadata` |
| [MessageFormats.PersistentFSMSnapshot](MessageFormats.PersistentFSMSnapshot.html "class in akka.persistence.serialization") | Protobuf type `PersistentFSMSnapshot` |
| [MessageFormats.PersistentFSMSnapshot.Builder](MessageFormats.PersistentFSMSnapshot.Builder.html "class in akka.persistence.serialization") | Protobuf type `PersistentFSMSnapshot` |
| [MessageFormats.PersistentMessage](MessageFormats.PersistentMessage.html "class in akka.persistence.serialization") | Protobuf type `PersistentMessage` |
| [MessageFormats.PersistentMessage.Builder](MessageFormats.PersistentMessage.Builder.html "class in akka.persistence.serialization") | Protobuf type `PersistentMessage` |
| [MessageFormats.PersistentPayload](MessageFormats.PersistentPayload.html "class in akka.persistence.serialization") | Protobuf type `PersistentPayload` |
| [MessageFormats.PersistentPayload.Builder](MessageFormats.PersistentPayload.Builder.html "class in akka.persistence.serialization") | Protobuf type `PersistentPayload` |
| [MessageFormats.PersistentStateChangeEvent](MessageFormats.PersistentStateChangeEvent.html "class in akka.persistence.serialization") | no longer created but needs to stay for reading persistent FSM events and snapshots |
| [MessageFormats.PersistentStateChangeEvent.Builder](MessageFormats.PersistentStateChangeEvent.Builder.html "class in akka.persistence.serialization") | no longer created but needs to stay for reading persistent FSM events and snapshots |
| [MessageSerializer](MessageSerializer.html "class in akka.persistence.serialization") | Protobuf serializer for [`PersistentRepr`](../PersistentRepr.html "interface in akka.persistence"), [`AtLeastOnceDelivery`](../AtLeastOnceDelivery.html "interface in akka.persistence") and [`PersistentFSM.StateChangeEvent`](../fsm/PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm") messages. |
| [PayloadSerializer](PayloadSerializer.html "class in akka.persistence.serialization") | INTERNAL API |
| [Snapshot](Snapshot.html "class in akka.persistence.serialization") | Wrapper for snapshot `data`. |
| [Snapshot$](Snapshot$.html "class in akka.persistence.serialization") |  |
| [SnapshotSerializer](SnapshotSerializer.html "class in akka.persistence.serialization") | [`Snapshot`](Snapshot.html "class in akka.persistence.serialization") serializer. |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka/current/akka/persistence/fsm/PersistentFSM.StateChangeEvent.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Message.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDelivery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.UnconfirmedDeliveryOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtLeastOnceDeliverySnapshotOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWrite.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.AtomicWriteOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadata.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.CompositeMetadataOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentFSMSnapshotOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentMessage.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentMessage.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentMessageOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayload.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentPayloadOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.Builder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEvent.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.PersistentStateChangeEventOrBuilder.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageFormats.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/MessageSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/PayloadSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Snapshot$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Snapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/SnapshotSerializer.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html)*