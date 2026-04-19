---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.html
title: AtLeastOnceDelivery
---

# AtLeastOnceDelivery

## Content

Package [akka.persistence](package-summary.html)
## Interface AtLeastOnceDelivery

- All Superinterfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](PersistentActor.html "interface in akka.persistence")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Snapshotter](Snapshotter.html "interface in akka.persistence")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`

---

```
public interface AtLeastOnceDelivery
extends [PersistentActor](PersistentActor.html "interface in akka.persistence"), [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")
```

Scala API: Mix\-in this trait with your `PersistentActor` to send messages with at\-least\-once
 delivery semantics to destinations. It takes care of re\-sending messages when they
 have not been confirmed within a configurable timeout. Use the `AtLeastOnceDeliveryLike#deliver` method to
 send a message to a destination. Call the [`AtLeastOnceDeliveryLike.confirmDelivery(long)`](AtLeastOnceDeliveryLike.html#confirmDelivery(long)) method when the destination
 has replied with a confirmation message.
 
 At\-least\-once delivery implies that original message send order is not always retained
 and the destination may receive duplicate messages due to possible resends.
 

 The interval between redelivery attempts can be defined by [`AtLeastOnceDeliveryLike.redeliverInterval()`](AtLeastOnceDeliveryLike.html#redeliverInterval()).
 After a number of delivery attempts a [`AtLeastOnceDelivery.UnconfirmedWarning`](AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence") message
 will be sent to `self`. The re\-sending will still continue, but you can choose to call
 [`AtLeastOnceDeliveryLike.confirmDelivery(long)`](AtLeastOnceDeliveryLike.html#confirmDelivery(long)) to cancel the re\-sending.
 

 The `AtLeastOnceDelivery` trait has a state consisting of unconfirmed messages and a
 sequence number. It does not store this state itself. You must persist events corresponding
 to the `deliver` and `confirmDelivery` invocations from your `PersistentActor` so that the
 state can be restored by calling the same methods during the recovery phase of the
 `PersistentActor`. Sometimes these events can be derived from other business level events,
 and sometimes you must create separate events. During recovery calls to `deliver`
 will not send out the message, but it will be sent later if no matching `confirmDelivery`
 was performed.
 

 Support for snapshots is provided by [`AtLeastOnceDeliveryLike.getDeliverySnapshot()`](AtLeastOnceDeliveryLike.html#getDeliverySnapshot()) and [`AtLeastOnceDeliveryLike.setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot)`](AtLeastOnceDeliveryLike.html#setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot)).
 The `AtLeastOnceDeliverySnapshot` contains the full delivery state, including unconfirmed messages.
 If you need a custom snapshot for other parts of the actor state you must also include the
 `AtLeastOnceDeliverySnapshot`. It is serialized using protobuf with the ordinary Akka
 serialization mechanism. It is easiest to include the bytes of the `AtLeastOnceDeliverySnapshot`
 as a blob in your custom snapshot.
 

See Also:
[`AtLeastOnceDeliveryLike`](AtLeastOnceDeliveryLike.html "interface in akka.persistence")

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")` | Snapshot of current `AtLeastOnceDelivery` state. |
	| `static class` | `[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$.html "class in akka.persistence")` |  |
	| `static class` | `[AtLeastOnceDelivery.Internal$](AtLeastOnceDelivery.Internal$.html "class in akka.persistence")` | INTERNAL API |
	| `static class` | `[AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence")` |  |
	| `static class` | `[AtLeastOnceDelivery.UnconfirmedDelivery](AtLeastOnceDelivery.UnconfirmedDelivery.html "class in akka.persistence")` | Information about a message that has not been confirmed. |
	| `static class` | `[AtLeastOnceDelivery.UnconfirmedDelivery$](AtLeastOnceDelivery.UnconfirmedDelivery$.html "class in akka.persistence")` |  |
	| `static class` | `[AtLeastOnceDelivery.UnconfirmedWarning](AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence")` |  |
	| `static class` | `[AtLeastOnceDelivery.UnconfirmedWarning$](AtLeastOnceDelivery.UnconfirmedWarning$.html "class in akka.persistence")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.State](Eventsourced.State.html "interface in akka.persistence")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[deliver](#deliver(akka.actor.ActorPath,scala.Function1))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,  scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)` | Scala API: Send the message created by the `deliveryIdToMessage` function to  the `destination` actor. |
	| `void` | `[deliver](#deliver(akka.actor.ActorSelection,scala.Function1))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") destination,  scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)` | Scala API: Send the message created by the `deliveryIdToMessage` function to  the `destination` actor. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.persistence.[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")
		
		
		`[aroundPostStop](AtLeastOnceDeliveryLike.html#aroundPostStop()), [aroundPreRestart](AtLeastOnceDeliveryLike.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundReceive](AtLeastOnceDeliveryLike.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [cancelRedeliveryTask](AtLeastOnceDeliveryLike.html#cancelRedeliveryTask()), [confirmDelivery](AtLeastOnceDeliveryLike.html#confirmDelivery(long)), [deliverySequenceNr_$eq](AtLeastOnceDeliveryLike.html#deliverySequenceNr_$eq(long)), [getDeliverySnapshot](AtLeastOnceDeliveryLike.html#getDeliverySnapshot()), [internalDeliver](AtLeastOnceDeliveryLike.html#internalDeliver(akka.actor.ActorPath,scala.Function1)), [internalDeliver](AtLeastOnceDeliveryLike.html#internalDeliver(akka.actor.ActorSelection,scala.Function1)), [maxUnconfirmedMessages](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages()), [nextDeliverySequenceNr](AtLeastOnceDeliveryLike.html#nextDeliverySequenceNr()), [numberOfUnconfirmed](AtLeastOnceDeliveryLike.html#numberOfUnconfirmed()), [onReplaySuccess](AtLeastOnceDeliveryLike.html#onReplaySuccess()), [redeliverInterval](AtLeastOnceDeliveryLike.html#redeliverInterval()), [redeliverOverdue](AtLeastOnceDeliveryLike.html#redeliverOverdue()), [redeliverTask_$eq](AtLeastOnceDeliveryLike.html#redeliverTask_$eq(scala.Option)), [redeliveryBurstLimit](AtLeastOnceDeliveryLike.html#redeliveryBurstLimit()), [send](AtLeastOnceDeliveryLike.html#send(long,akka.persistence.AtLeastOnceDelivery.Internal.Delivery,long)), [setDeliverySnapshot](AtLeastOnceDeliveryLike.html#setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot)), [startRedeliverTask](AtLeastOnceDeliveryLike.html#startRedeliverTask()), [super$aroundPostStop](AtLeastOnceDeliveryLike.html#super$aroundPostStop()), [super$aroundPreRestart](AtLeastOnceDeliveryLike.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundReceive](AtLeastOnceDeliveryLike.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$onReplaySuccess](AtLeastOnceDeliveryLike.html#super$onReplaySuccess()), [unconfirmed_$eq](AtLeastOnceDeliveryLike.html#unconfirmed_$eq(scala.collection.immutable.SortedMap)), [warnAfterNumberOfUnconfirmedAttempts](AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPreStart](Eventsourced.html#aroundPreStart()), [batchAtomicWrite](Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentState_$eq](Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](Eventsourced.html#flushBatch()), [flushJournalBatch](Eventsourced.html#flushJournalBatch()), [internalDefer](Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journal](Eventsourced.html#journal()), [journalBatch_$eq](Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](Eventsourced.html#lastSequenceNr()), [log](Eventsourced.html#log()), [nextSequenceNr](Eventsourced.html#nextSequenceNr()), [onPersistFailure](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [peekApplyHandler](Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [receiveCommand](Eventsourced.html#receiveCommand()), [receiveRecover](Eventsourced.html#receiveRecover()), [recovering](Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](Eventsourced.html#recoveryFinished()), [recoveryRunning](Eventsourced.html#recoveryRunning()), [recoveryStarted](Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](Eventsourced.html#snapshotSequenceNr()), [snapshotStore](Eventsourced.html#snapshotStore()), [snapshotterId](Eventsourced.html#snapshotterId()), [startRecovery](Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](Eventsourced.html#stash()), [stashInternally](Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPreStart](Eventsourced.html#super$aroundPreStart()), [super$stash](Eventsourced.html#super$stash()), [super$unhandled](Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](Eventsourced.html#unstashAll()), [unstashInternally](Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](Eventsourced.html#writeInProgress_$eq(boolean))`
		- ### Methods inherited from interface akka.persistence.[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")
		
		
		`[journalPluginId](PersistenceIdentity.html#journalPluginId()), [persistenceId](PersistenceIdentity.html#persistenceId()), [snapshotPluginId](PersistenceIdentity.html#snapshotPluginId())`
		- ### Methods inherited from interface akka.persistence.[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")
		
		
		`[recovery](PersistenceRecovery.html#recovery())`
		- ### Methods inherited from interface akka.persistence.[PersistenceStash](PersistenceStash.html "interface in akka.persistence")
		
		
		`[internalStashOverflowStrategy](PersistenceStash.html#internalStashOverflowStrategy())`
		- ### Methods inherited from interface akka.persistence.[PersistentActor](PersistentActor.html "interface in akka.persistence")
		
		
		`[defer](PersistentActor.html#defer(A,scala.Function1)), [deferAsync](PersistentActor.html#deferAsync(A,scala.Function1)), [persist](PersistentActor.html#persist(A,scala.Function1)), [persistAll](PersistentActor.html#persistAll(scala.collection.immutable.Seq,scala.Function1)), [persistAllAsync](PersistentActor.html#persistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [persistAsync](PersistentActor.html#persistAsync(A,scala.Function1)), [receive](PersistentActor.html#receive())`
		- ### Methods inherited from interface akka.persistence.[Snapshotter](Snapshotter.html "interface in akka.persistence")
		
		
		`[deleteSnapshot](Snapshotter.html#deleteSnapshot(long)), [deleteSnapshots](Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria)), [loadSnapshot](Snapshotter.html#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long)), [saveSnapshot](Snapshotter.html#saveSnapshot(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../actor/StashSupport.html#clearStash()), [context](../actor/StashSupport.html#context()), [enqueueFirst](../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../actor/StashSupport.html#mailbox()), [prepend](../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../actor/StashSupport.html#self()), [theStash_$eq](../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../actor/StashSupport.html#unstash()), [unstashAll](../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../actor/UnrestrictedStash.html#postStop()), [preRestart](../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Method Detail
	
	
	
		- #### deliver
		
		
		
		```
		void deliver​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,
		             scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)
		```
		
		Scala API: Send the message created by the `deliveryIdToMessage` function to
		 the `destination` actor. It will retry sending the message until
		 the delivery is confirmed with [`AtLeastOnceDeliveryLike.confirmDelivery(long)`](AtLeastOnceDeliveryLike.html#confirmDelivery(long)). Correlation
		 between `deliver` and `confirmDelivery` is performed with the
		 `deliveryId` that is provided as parameter to the `deliveryIdToMessage`
		 function. The `deliveryId` is typically passed in the message to the
		 destination, which replies with a message containing the same `deliveryId`.
		 
		 The `deliveryId` is a strictly monotonically increasing sequence number without
		 gaps. The same sequence is used for all destinations of the actor, i.e. when sending
		 to multiple destinations the destinations will see gaps in the sequence if no
		 translation is performed.
		 
		
		
		 During recovery this method will not send out the message, but it will be sent
		 later if no matching `confirmDelivery` was performed.
		 
		
		
		 This method will throw [`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence")
		 if [`AtLeastOnceDeliveryLike.numberOfUnconfirmed()`](AtLeastOnceDeliveryLike.html#numberOfUnconfirmed()) is greater than or equal to [`AtLeastOnceDeliveryLike.maxUnconfirmedMessages()`](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages()).
		- #### deliver
		
		
		
		```
		void deliver​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") destination,
		             scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)
		```
		
		Scala API: Send the message created by the `deliveryIdToMessage` function to
		 the `destination` actor. It will retry sending the message until
		 the delivery is confirmed with [`AtLeastOnceDeliveryLike.confirmDelivery(long)`](AtLeastOnceDeliveryLike.html#confirmDelivery(long)). Correlation
		 between `deliver` and `confirmDelivery` is performed with the
		 `deliveryId` that is provided as parameter to the `deliveryIdToMessage`
		 function. The `deliveryId` is typically passed in the message to the
		 destination, which replies with a message containing the same `deliveryId`.
		 
		 The `deliveryId` is a strictly monotonically increasing sequence number without
		 gaps. The same sequence is used for all destinations of the actor, i.e. when sending
		 to multiple destinations the destinations will see gaps in the sequence if no
		 translation is performed.
		 
		
		
		 During recovery this method will not send out the message, but it will be sent
		 later if no matching `confirmDelivery` was performed.
		 
		
		
		 This method will throw [`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence")
		 if [`AtLeastOnceDeliveryLike.numberOfUnconfirmed()`](AtLeastOnceDeliveryLike.html#numberOfUnconfirmed()) is greater than or equal to [`AtLeastOnceDeliveryLike.maxUnconfirmedMessages()`](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.Internal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.UnconfirmedDelivery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.AsyncHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.AsyncHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.PendingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.RecoveryTick$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.RecoveryTick.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.State.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.html)*