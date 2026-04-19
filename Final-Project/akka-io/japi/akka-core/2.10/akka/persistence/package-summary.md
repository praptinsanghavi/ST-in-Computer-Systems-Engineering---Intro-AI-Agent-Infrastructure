---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:44:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
title: akka.persistence
---

# akka.persistence

## Content

# Package akka.persistence

- Interface Summary 
| Interface | Description |
| [AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence") | INTERNAL API |
| --- | --- |
| [AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence") | Scala API: Mix\-in this trait with your `PersistentActor` to send messages with at\-least\-once  delivery semantics to destinations. |
| [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence") |  |
| [CapabilityFlags](CapabilityFlags.html "interface in akka.persistence") |  |
| [Eventsourced](Eventsourced.html "interface in akka.persistence") | INTERNAL API. |
| [Eventsourced.PendingHandlerInvocation](Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence") | INTERNAL API |
| [Eventsourced.State](Eventsourced.State.html "interface in akka.persistence") |  |
| [JournalCapabilityFlags](JournalCapabilityFlags.html "interface in akka.persistence") |  |
| [JournalProtocol.Message](JournalProtocol.Message.html "interface in akka.persistence") | Marker trait shared by internal journal messages. |
| [JournalProtocol.Request](JournalProtocol.Request.html "interface in akka.persistence") | Internal journal command. |
| [JournalProtocol.Response](JournalProtocol.Response.html "interface in akka.persistence") | Internal journal acknowledgement. |
| [PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence") | Identification of [`PersistentActor`](PersistentActor.html "interface in akka.persistence"). |
| [PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence") |  |
| [PersistenceStash](PersistenceStash.html "interface in akka.persistence") |  |
| [PersistentActor](PersistentActor.html "interface in akka.persistence") | Scala API: A persistent Actor \- can be used to implement command or Event Sourcing. |
| [PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence") | INTERNAL API |
| [PersistentRepr](PersistentRepr.html "interface in akka.persistence") | Plugin API: representation of a persistent message in the journal plugin API. |
| [PluginProvider](PluginProvider.html "interface in akka.persistence")\<T,​ScalaDsl,​JavaDsl\> | INTERNAL API |
| [Protocol.Message](Protocol.Message.html "interface in akka.persistence") | INTERNAL API. |
| [RuntimePluginConfig](RuntimePluginConfig.html "interface in akka.persistence") |  |
| [SnapshotProtocol.Message](SnapshotProtocol.Message.html "interface in akka.persistence") | Marker trait shared by internal snapshot messages. |
| [SnapshotProtocol.Request](SnapshotProtocol.Request.html "interface in akka.persistence") | Internal snapshot command. |
| [SnapshotProtocol.Response](SnapshotProtocol.Response.html "interface in akka.persistence") | Internal snapshot acknowledgement. |
| [SnapshotStoreCapabilityFlags](SnapshotStoreCapabilityFlags.html "interface in akka.persistence") |  |
| [Snapshotter](Snapshotter.html "interface in akka.persistence") | Snapshot API on top of the internal snapshot protocol. |
| [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence") | This defines how to handle the current received message which failed to stash, when the size of  Stash exceeding the capacity of Stash. |
| [StashOverflowStrategyConfigurator](StashOverflowStrategyConfigurator.html "interface in akka.persistence") | Implement this interface in order to configure the stashOverflowStrategy for  the internal stash of persistent actor. |
- Class Summary 
| Class | Description |
| [AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence") | Java API: an persistent actor \- can be used to implement command or Event Sourcing. |
| --- | --- |
| [AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence") | Java API: compatible with lambda expressions |
| [AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "class in akka.persistence") | Java API: Combination of [`AbstractPersistentActor`](AbstractPersistentActor.html "class in akka.persistence") and [`AbstractActorWithTimers`](../actor/AbstractActorWithTimers.html "class in akka.actor"). |
| [AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") | Snapshot of current `AtLeastOnceDelivery` state. |
| [AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$.html "class in akka.persistence") |  |
| [AtLeastOnceDelivery.Internal$](AtLeastOnceDelivery.Internal$.html "class in akka.persistence") | INTERNAL API |
| [AtLeastOnceDelivery.UnconfirmedDelivery](AtLeastOnceDelivery.UnconfirmedDelivery.html "class in akka.persistence") | Information about a message that has not been confirmed. |
| [AtLeastOnceDelivery.UnconfirmedDelivery$](AtLeastOnceDelivery.UnconfirmedDelivery$.html "class in akka.persistence") |  |
| [AtLeastOnceDelivery.UnconfirmedWarning](AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence") |  |
| [AtLeastOnceDelivery.UnconfirmedWarning$](AtLeastOnceDelivery.UnconfirmedWarning$.html "class in akka.persistence") |  |
| [AtLeastOnceDelivery$](AtLeastOnceDelivery$.html "class in akka.persistence") |  |
| [AtomicWrite](AtomicWrite.html "class in akka.persistence") |  |
| [AtomicWrite$](AtomicWrite$.html "class in akka.persistence") |  |
| [CapabilityFlag](CapabilityFlag.html "class in akka.persistence") |  |
| [CapabilityFlag$](CapabilityFlag$.html "class in akka.persistence") |  |
| [CompositeMetadata$](CompositeMetadata$.html "class in akka.persistence") | INTERNAL API |
| [DeleteMessagesFailure](DeleteMessagesFailure.html "class in akka.persistence") | Reply message to a failed [`JournalProtocol.DeleteMessagesTo`](JournalProtocol.DeleteMessagesTo.html "class in akka.persistence") request. |
| [DeleteMessagesFailure$](DeleteMessagesFailure$.html "class in akka.persistence") |  |
| [DeleteMessagesSuccess](DeleteMessagesSuccess.html "class in akka.persistence") | Reply message to a successful [`JournalProtocol.DeleteMessagesTo`](JournalProtocol.DeleteMessagesTo.html "class in akka.persistence") request. |
| [DeleteMessagesSuccess$](DeleteMessagesSuccess$.html "class in akka.persistence") |  |
| [DeleteSnapshotFailure](DeleteSnapshotFailure.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after failed deletion of a snapshot. |
| [DeleteSnapshotFailure$](DeleteSnapshotFailure$.html "class in akka.persistence") |  |
| [DeleteSnapshotsFailure](DeleteSnapshotsFailure.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after failed deletion of a range of snapshots. |
| [DeleteSnapshotsFailure$](DeleteSnapshotsFailure$.html "class in akka.persistence") |  |
| [DeleteSnapshotsSuccess](DeleteSnapshotsSuccess.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after successful deletion of specified range of snapshots. |
| [DeleteSnapshotsSuccess$](DeleteSnapshotsSuccess$.html "class in akka.persistence") |  |
| [DeleteSnapshotSuccess](DeleteSnapshotSuccess.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after successful deletion of a snapshot. |
| [DeleteSnapshotSuccess$](DeleteSnapshotSuccess$.html "class in akka.persistence") |  |
| [DiscardConfigurator](DiscardConfigurator.html "class in akka.persistence") |  |
| [DiscardToDeadLetterStrategy](DiscardToDeadLetterStrategy.html "class in akka.persistence") | Discard the message to [`DeadLetter`](../actor/DeadLetter.html "class in akka.actor"). |
| [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence") | Discard the message to [`DeadLetter`](../actor/DeadLetter.html "class in akka.actor"). |
| [Eventsourced.AsyncHandlerInvocation](Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence") | INTERNAL API: does not force the actor to stash commands; Originates from either \`persistAsync\` or \`defer\` calls |
| [Eventsourced.AsyncHandlerInvocation$](Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence") |  |
| [Eventsourced.RecoveryTick](Eventsourced.RecoveryTick.html "class in akka.persistence") | INTERNAL API: message used to detect that recovery timed out |
| [Eventsourced.RecoveryTick$](Eventsourced.RecoveryTick$.html "class in akka.persistence") |  |
| [Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence") | INTERNAL API: forces actor to stash incoming commands until all these invocations are handled |
| [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence") |  |
| [Eventsourced$](Eventsourced$.html "class in akka.persistence") | INTERNAL API |
| [FilteredPayload](FilteredPayload.html "class in akka.persistence") | In some use cases with projections and events by slice filtered events needs to be stored in the journal  to keep the sequence numbers for a given persistence id gap free. |
| [FilteredPayload$](FilteredPayload$.html "class in akka.persistence") | In some use cases with projections and events by slice filtered events needs to be stored in the journal  to keep the sequence numbers for a given persistence id gap free. |
| [JournalProtocol](JournalProtocol.html "class in akka.persistence") | INTERNAL API. |
| [JournalProtocol.DeleteMessagesTo](JournalProtocol.DeleteMessagesTo.html "class in akka.persistence") | Request to delete all persistent messages with sequence numbers up to `toSequenceNr`  (inclusive). |
| [JournalProtocol.DeleteMessagesTo$](JournalProtocol.DeleteMessagesTo$.html "class in akka.persistence") |  |
| [JournalProtocol.LoopMessageSuccess](JournalProtocol.LoopMessageSuccess.html "class in akka.persistence") | Reply message to a [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") with a non\-persistent message. |
| [JournalProtocol.LoopMessageSuccess$](JournalProtocol.LoopMessageSuccess$.html "class in akka.persistence") |  |
| [JournalProtocol.RecoverySuccess](JournalProtocol.RecoverySuccess.html "class in akka.persistence") | Reply message to a successful [`JournalProtocol.ReplayMessages`](JournalProtocol.ReplayMessages.html "class in akka.persistence") request. |
| [JournalProtocol.RecoverySuccess$](JournalProtocol.RecoverySuccess$.html "class in akka.persistence") |  |
| [JournalProtocol.ReplayedMessage](JournalProtocol.ReplayedMessage.html "class in akka.persistence") | Reply message to a [`JournalProtocol.ReplayMessages`](JournalProtocol.ReplayMessages.html "class in akka.persistence") request. |
| [JournalProtocol.ReplayedMessage$](JournalProtocol.ReplayedMessage$.html "class in akka.persistence") |  |
| [JournalProtocol.ReplayMessages](JournalProtocol.ReplayMessages.html "class in akka.persistence") | Request to replay messages to `persistentActor`. |
| [JournalProtocol.ReplayMessages$](JournalProtocol.ReplayMessages$.html "class in akka.persistence") |  |
| [JournalProtocol.ReplayMessagesFailure](JournalProtocol.ReplayMessagesFailure.html "class in akka.persistence") | Reply message to a failed [`JournalProtocol.ReplayMessages`](JournalProtocol.ReplayMessages.html "class in akka.persistence") request. |
| [JournalProtocol.ReplayMessagesFailure$](JournalProtocol.ReplayMessagesFailure$.html "class in akka.persistence") |  |
| [JournalProtocol.WriteMessageFailure](JournalProtocol.WriteMessageFailure.html "class in akka.persistence") | Reply message to a failed [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
| [JournalProtocol.WriteMessageFailure$](JournalProtocol.WriteMessageFailure$.html "class in akka.persistence") |  |
| [JournalProtocol.WriteMessageRejected](JournalProtocol.WriteMessageRejected.html "class in akka.persistence") | Reply message to a rejected [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
| [JournalProtocol.WriteMessageRejected$](JournalProtocol.WriteMessageRejected$.html "class in akka.persistence") |  |
| [JournalProtocol.WriteMessages](JournalProtocol.WriteMessages.html "class in akka.persistence") |  |
| [JournalProtocol.WriteMessages$](JournalProtocol.WriteMessages$.html "class in akka.persistence") |  |
| [JournalProtocol.WriteMessagesFailed](JournalProtocol.WriteMessagesFailed.html "class in akka.persistence") | Reply message to a failed [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
| [JournalProtocol.WriteMessagesFailed$](JournalProtocol.WriteMessagesFailed$.html "class in akka.persistence") |  |
| [JournalProtocol.WriteMessagesSuccessful$](JournalProtocol.WriteMessagesSuccessful$.html "class in akka.persistence") | Reply message to a successful [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
| [JournalProtocol.WriteMessageSuccess](JournalProtocol.WriteMessageSuccess.html "class in akka.persistence") | Reply message to a successful [`JournalProtocol.WriteMessages`](JournalProtocol.WriteMessages.html "class in akka.persistence") request. |
| [JournalProtocol.WriteMessageSuccess$](JournalProtocol.WriteMessageSuccess$.html "class in akka.persistence") |  |
| [JournalProtocol$](JournalProtocol$.html "class in akka.persistence") | INTERNAL API. |
| [NonPersistentRepr$](NonPersistentRepr$.html "class in akka.persistence") |  |
| [Persistence](Persistence.html "class in akka.persistence") | Persistence extension. |
| [Persistence.PluginHolder$](Persistence.PluginHolder$.html "class in akka.persistence") |  |
| [Persistence$](Persistence$.html "class in akka.persistence") | Persistence extension provider. |
| [PersistencePlugin$](PersistencePlugin$.html "class in akka.persistence") | INTERNAL API |
| [PersistenceSettings](PersistenceSettings.html "class in akka.persistence") | Persistence configuration. |
| [PersistentImpl$](PersistentImpl$.html "class in akka.persistence") |  |
| [PersistentRepr$](PersistentRepr$.html "class in akka.persistence") |  |
| [PluginSpec](PluginSpec.html "class in akka.persistence") |  |
| [Protocol](Protocol.html "class in akka.persistence") | INTERNAL API. |
| [Protocol$](Protocol$.html "class in akka.persistence") | INTERNAL API. |
| [Recovery](Recovery.html "class in akka.persistence") | Recovery mode configuration object to be returned in [`PersistenceRecovery.recovery()`](PersistenceRecovery.html#recovery()). |
| [Recovery$](Recovery$.html "class in akka.persistence") |  |
| [RecoveryCompleted](RecoveryCompleted.html "class in akka.persistence") |  |
| [RecoveryCompleted$](RecoveryCompleted$.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") when the journal replay has been finished. |
| [RecoveryPermitter$](RecoveryPermitter$.html "class in akka.persistence") | INTERNAL API |
| [ReplyToStrategy](ReplyToStrategy.html "class in akka.persistence") | Reply to sender with predefined response, and discard the received message silently. |
| [ReplyToStrategy$](ReplyToStrategy$.html "class in akka.persistence") |  |
| [SaveSnapshotFailure](SaveSnapshotFailure.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after failed saving of a snapshot. |
| [SaveSnapshotFailure$](SaveSnapshotFailure$.html "class in akka.persistence") |  |
| [SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence") | Sent to a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") after successful saving of a snapshot. |
| [SaveSnapshotSuccess$](SaveSnapshotSuccess$.html "class in akka.persistence") |  |
| [SelectedSnapshot](SelectedSnapshot.html "class in akka.persistence") | Plugin API: a selected snapshot matching [`SnapshotSelectionCriteria`](SnapshotSelectionCriteria.html "class in akka.persistence"). |
| [SelectedSnapshot$](SelectedSnapshot$.html "class in akka.persistence") |  |
| [SerializedEvent](SerializedEvent.html "class in akka.persistence") | Some journal implementations may support events of this type by writing the event payload and  serialization information without having to serialize it. |
| [SnapshotMetadata](SnapshotMetadata.html "class in akka.persistence") | Snapshot metadata. |
| [SnapshotMetadata$](SnapshotMetadata$.html "class in akka.persistence") |  |
| [SnapshotOffer](SnapshotOffer.html "class in akka.persistence") | Offers a [`PersistentActor`](PersistentActor.html "interface in akka.persistence") a previously saved `snapshot` during recovery. |
| [SnapshotOffer$](SnapshotOffer$.html "class in akka.persistence") |  |
| [SnapshotProtocol](SnapshotProtocol.html "class in akka.persistence") | INTERNAL API. |
| [SnapshotProtocol.DeleteSnapshot](SnapshotProtocol.DeleteSnapshot.html "class in akka.persistence") | Instructs snapshot store to delete a snapshot. |
| [SnapshotProtocol.DeleteSnapshot$](SnapshotProtocol.DeleteSnapshot$.html "class in akka.persistence") |  |
| [SnapshotProtocol.DeleteSnapshots](SnapshotProtocol.DeleteSnapshots.html "class in akka.persistence") | Instructs snapshot store to delete all snapshots that match `criteria`. |
| [SnapshotProtocol.DeleteSnapshots$](SnapshotProtocol.DeleteSnapshots$.html "class in akka.persistence") |  |
| [SnapshotProtocol.LoadSnapshot](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence") | Instructs a snapshot store to load a snapshot. |
| [SnapshotProtocol.LoadSnapshot$](SnapshotProtocol.LoadSnapshot$.html "class in akka.persistence") |  |
| [SnapshotProtocol.LoadSnapshotFailed](SnapshotProtocol.LoadSnapshotFailed.html "class in akka.persistence") | Reply message to a failed [`SnapshotProtocol.LoadSnapshot`](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence") request. |
| [SnapshotProtocol.LoadSnapshotFailed$](SnapshotProtocol.LoadSnapshotFailed$.html "class in akka.persistence") |  |
| [SnapshotProtocol.LoadSnapshotResult](SnapshotProtocol.LoadSnapshotResult.html "class in akka.persistence") | Response message to a [`SnapshotProtocol.LoadSnapshot`](SnapshotProtocol.LoadSnapshot.html "class in akka.persistence") message. |
| [SnapshotProtocol.LoadSnapshotResult$](SnapshotProtocol.LoadSnapshotResult$.html "class in akka.persistence") |  |
| [SnapshotProtocol.SaveSnapshot](SnapshotProtocol.SaveSnapshot.html "class in akka.persistence") | Instructs snapshot store to save a snapshot. |
| [SnapshotProtocol.SaveSnapshot$](SnapshotProtocol.SaveSnapshot$.html "class in akka.persistence") |  |
| [SnapshotProtocol$](SnapshotProtocol$.html "class in akka.persistence") | INTERNAL API. |
| [SnapshotSelectionCriteria](SnapshotSelectionCriteria.html "class in akka.persistence") | Selection criteria for loading and deleting snapshots. |
| [SnapshotSelectionCriteria$](SnapshotSelectionCriteria$.html "class in akka.persistence") |  |
| [TestPayload](TestPayload.html "class in akka.persistence") |  |
| [TestPayload$](TestPayload$.html "class in akka.persistence") |  |
| [TestSerializer](TestSerializer.html "class in akka.persistence") |  |
| [ThrowExceptionConfigurator](ThrowExceptionConfigurator.html "class in akka.persistence") |  |
| [ThrowOverflowExceptionStrategy](ThrowOverflowExceptionStrategy.html "class in akka.persistence") | Throw [`StashOverflowException`](../actor/StashOverflowException.html "class in akka.actor"), hence the persistent actor will starting recovery  if guarded by default supervisor strategy. |
| [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence") | Throw [`StashOverflowException`](../actor/StashOverflowException.html "class in akka.actor"), hence the persistent actor will starting recovery  if guarded by default supervisor strategy. |
| [TraitOrder](TraitOrder.html "class in akka.persistence") | INTERNAL API |
| [TraitOrder$](TraitOrder$.html "class in akka.persistence") | INTERNAL API |
- Exception Summary 
| Exception | Description |
| [AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence") |  |
| --- | --- |
| [RecoveryTimedOut](RecoveryTimedOut.html "class in akka.persistence") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/AbstractActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.Internal$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlag.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CapabilityFlags.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/CompositeMetadata$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteMessagesSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotsFailure$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotsFailure.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotsSuccess$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DeleteSnapshotsSuccess.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardConfigurator.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/DiscardToDeadLetterStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.AsyncHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.AsyncHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.PendingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.RecoveryTick$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.RecoveryTick.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.State.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/FilteredPayload$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html)*