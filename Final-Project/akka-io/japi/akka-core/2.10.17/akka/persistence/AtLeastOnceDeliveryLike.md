---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:42:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html
title: AtLeastOnceDeliveryLike
---

# AtLeastOnceDeliveryLike

## Content

Package [akka.persistence](package-summary.html)
## Interface AtLeastOnceDeliveryLike

- All Superinterfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](PersistenceStash.html "interface in akka.persistence")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Snapshotter](Snapshotter.html "interface in akka.persistence")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`

All Known Subinterfaces:
`[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`

All Known Implementing Classes:
`[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`

---

```
public interface AtLeastOnceDeliveryLike
extends [Eventsourced](Eventsourced.html "interface in akka.persistence")
```

See Also:
[`AtLeastOnceDelivery`](AtLeastOnceDelivery.html "interface in akka.persistence")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.State](Eventsourced.State.html "interface in akka.persistence")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[aroundPostStop](#aroundPostStop())()` | INTERNAL API |
	| `void` | `[aroundPreRestart](#aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | INTERNAL API |
	| `void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object message)` | INTERNAL API |
	| `void` | `[cancelRedeliveryTask](#cancelRedeliveryTask())()` |  |
	| `boolean` | `[confirmDelivery](#confirmDelivery(long))​(long deliveryId)` | Call this method when a message has been confirmed by the destination,  or to abort re\-sending. |
	| `void` | `[deliverySequenceNr_$eq](#deliverySequenceNr_$eq(long))​(long x$1)` |  |
	| `[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence")` | `[getDeliverySnapshot](#getDeliverySnapshot())()` | Full state of the `AtLeastOnceDelivery`. |
	| `void` | `[internalDeliver](#internalDeliver(akka.actor.ActorPath,scala.Function1))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,  scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)` | INTERNAL API |
	| `void` | `[internalDeliver](#internalDeliver(akka.actor.ActorSelection,scala.Function1))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") destination,  scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)` | INTERNAL API |
	| `int` | `[maxUnconfirmedMessages](#maxUnconfirmedMessages())()` | Maximum number of unconfirmed messages that this actor is allowed to hold in memory. |
	| `long` | `[nextDeliverySequenceNr](#nextDeliverySequenceNr())()` |  |
	| `int` | `[numberOfUnconfirmed](#numberOfUnconfirmed())()` | Number of messages that have not been confirmed yet. |
	| `void` | `[onReplaySuccess](#onReplaySuccess())()` | INTERNAL API. |
	| `scala.concurrent.duration.FiniteDuration` | `[redeliverInterval](#redeliverInterval())()` | Interval between redelivery attempts. |
	| `void` | `[redeliverOverdue](#redeliverOverdue())()` |  |
	| `void` | `[redeliverTask_$eq](#redeliverTask_$eq(scala.Option))​(scala.Option<[Cancellable](../actor/Cancellable.html "interface in akka.actor")> x$1)` |  |
	| `int` | `[redeliveryBurstLimit](#redeliveryBurstLimit())()` | Maximum number of unconfirmed messages that will be sent at each redelivery burst  (burst frequency is half of the redelivery interval). |
	| `void` | `[send](#send(long,akka.persistence.AtLeastOnceDelivery.Internal.Delivery,long))​(long deliveryId,  akka.persistence.AtLeastOnceDelivery.Internal.Delivery d,  long timestamp)` |  |
	| `void` | `[setDeliverySnapshot](#setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot))​([AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") snapshot)` | If snapshot from [`getDeliverySnapshot()`](#getDeliverySnapshot()) was saved it will be received during recovery  in a [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence") message and should be set with this method. |
	| `void` | `[startRedeliverTask](#startRedeliverTask())()` |  |
	| `void` | `[super$aroundPostStop](#super$aroundPostStop())()` | INTERNAL API |
	| `void` | `[super$aroundPreRestart](#super$aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | INTERNAL API |
	| `void` | `[super$aroundReceive](#super$aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object message)` | INTERNAL API |
	| `void` | `[super$onReplaySuccess](#super$onReplaySuccess())()` |  |
	| `void` | `[unconfirmed_$eq](#unconfirmed_$eq(scala.collection.immutable.SortedMap))​(scala.collection.immutable.SortedMap<java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery> x$1)` |  |
	| `int` | `[warnAfterNumberOfUnconfirmedAttempts](#warnAfterNumberOfUnconfirmedAttempts())()` | After this number of delivery attempts an [`AtLeastOnceDelivery.UnconfirmedWarning`](AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence") message  will be sent to `self`. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [receive](../actor/Actor.html#receive()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPreStart](Eventsourced.html#aroundPreStart()), [batchAtomicWrite](Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentCommand](Eventsourced.html#currentCommand()), [currentState_$eq](Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](Eventsourced.html#flushBatch()), [flushJournalBatch](Eventsourced.html#flushJournalBatch()), [getAndClearInstrumentationContext](Eventsourced.html#getAndClearInstrumentationContext(long)), [instrumentationContexts_$eq](Eventsourced.html#instrumentationContexts_$eq(scala.collection.immutable.Map)), [internalDefer](Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journal](Eventsourced.html#journal()), [journalBatch_$eq](Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](Eventsourced.html#lastSequenceNr()), [log](Eventsourced.html#log()), [nextSequenceNr](Eventsourced.html#nextSequenceNr()), [onPersistFailure](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onRecoveryFailureAndInstrumentation](Eventsourced.html#onRecoveryFailureAndInstrumentation(java.lang.Throwable,scala.Option)), [peekApplyHandler](Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [receiveCommand](Eventsourced.html#receiveCommand()), [receiveRecover](Eventsourced.html#receiveRecover()), [recovering](Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](Eventsourced.html#recoveryFinished()), [recoveryRunning](Eventsourced.html#recoveryRunning()), [recoveryStarted](Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](Eventsourced.html#snapshotSequenceNr()), [snapshotStore](Eventsourced.html#snapshotStore()), [snapshotterId](Eventsourced.html#snapshotterId()), [startRecovery](Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](Eventsourced.html#stash()), [stashInternally](Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPreStart](Eventsourced.html#super$aroundPreStart()), [super$stash](Eventsourced.html#super$stash()), [super$unhandled](Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](Eventsourced.html#unstashAll()), [unstashInternally](Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](Eventsourced.html#writeInProgress_$eq(boolean))`
		- ### Methods inherited from interface akka.persistence.[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")
		
		
		`[journalPluginId](PersistenceIdentity.html#journalPluginId()), [persistenceId](PersistenceIdentity.html#persistenceId()), [snapshotPluginId](PersistenceIdentity.html#snapshotPluginId())`
		- ### Methods inherited from interface akka.persistence.[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")
		
		
		`[recovery](PersistenceRecovery.html#recovery())`
		- ### Methods inherited from interface akka.persistence.[PersistenceStash](PersistenceStash.html "interface in akka.persistence")
		
		
		`[internalStashOverflowStrategy](PersistenceStash.html#internalStashOverflowStrategy())`
		- ### Methods inherited from interface akka.persistence.[Snapshotter](Snapshotter.html "interface in akka.persistence")
		
		
		`[deleteSnapshot](Snapshotter.html#deleteSnapshot(long)), [deleteSnapshots](Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria)), [loadSnapshot](Snapshotter.html#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long)), [saveSnapshot](Snapshotter.html#saveSnapshot(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../actor/StashSupport.html#clearStash()), [context](../actor/StashSupport.html#context()), [enqueueFirst](../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../actor/StashSupport.html#mailbox()), [prepend](../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../actor/StashSupport.html#self()), [stashAtHead](../actor/StashSupport.html#stashAtHead()), [theStash_$eq](../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../actor/StashSupport.html#unstash()), [unstashAll](../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../actor/UnrestrictedStash.html#postStop()), [preRestart](../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Method Detail
	
	
	
		- #### aroundPostStop
		
		
		
		```
		void aroundPostStop()
		```
		
		INTERNAL API
		
		Specified by:
		`[aroundPostStop](../actor/Actor.html#aroundPostStop())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[aroundPostStop](Eventsourced.html#aroundPostStop())` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### aroundPreRestart
		
		
		
		```
		void aroundPreRestart​(java.lang.Throwable reason,
		                      scala.Option<java.lang.Object> message)
		```
		
		INTERNAL API
		
		Specified by:
		`[aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[aroundPreRestart](Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option))` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### aroundReceive
		
		
		
		```
		void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                   java.lang.Object message)
		```
		
		INTERNAL API
		
		Specified by:
		`[aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[aroundReceive](Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		Parameters:
		`receive` \- current behavior.
		`message` \- current message.
		- #### cancelRedeliveryTask
		
		
		
		```
		void cancelRedeliveryTask()
		```
		- #### confirmDelivery
		
		
		
		```
		boolean confirmDelivery​(long deliveryId)
		```
		
		Call this method when a message has been confirmed by the destination,
		 or to abort re\-sending.
		
		Returns:
		`true` the first time the `deliveryId` is confirmed, i.e. `false` for duplicate confirm
		See Also:
		`#deliver`
		- #### deliverySequenceNr\_$eq
		
		
		
		```
		void deliverySequenceNr_$eq​(long x$1)
		```
		- #### getDeliverySnapshot
		
		
		
		```
		[AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") getDeliverySnapshot()
		```
		
		Full state of the `AtLeastOnceDelivery`. It can be saved with [`Snapshotter.saveSnapshot(java.lang.Object)`](Snapshotter.html#saveSnapshot(java.lang.Object)).
		 During recovery the snapshot received in [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence") should be set
		 with [`setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot)`](#setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot)).
		 
		 The `AtLeastOnceDeliverySnapshot` contains the full delivery state, including unconfirmed messages.
		 If you need a custom snapshot for other parts of the actor state you must also include the
		 `AtLeastOnceDeliverySnapshot`. It is serialized using protobuf with the ordinary Akka
		 serialization mechanism. It is easiest to include the bytes of the `AtLeastOnceDeliverySnapshot`
		 as a blob in your custom snapshot.
		- #### internalDeliver
		
		
		
		```
		void internalDeliver​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,
		                     scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)
		```
		
		INTERNAL API
		- #### internalDeliver
		
		
		
		```
		void internalDeliver​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") destination,
		                     scala.Function1<java.lang.Object,​java.lang.Object> deliveryIdToMessage)
		```
		
		INTERNAL API
		- #### maxUnconfirmedMessages
		
		
		
		```
		int maxUnconfirmedMessages()
		```
		
		Maximum number of unconfirmed messages that this actor is allowed to hold in memory.
		 If this number is exceed `#deliver` will not accept more messages and it will throw
		 [`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence").
		 
		 The default value can be configured with the
		 `akka.persistence.at-least-once-delivery.max-unconfirmed-messages`
		 configuration key. This method can be overridden by implementation classes to return
		 non\-default values.
		- #### nextDeliverySequenceNr
		
		
		
		```
		long nextDeliverySequenceNr()
		```
		- #### numberOfUnconfirmed
		
		
		
		```
		int numberOfUnconfirmed()
		```
		
		Number of messages that have not been confirmed yet.
		- #### onReplaySuccess
		
		
		
		```
		void onReplaySuccess()
		```
		
		Description copied from interface: `[Eventsourced](Eventsourced.html#onReplaySuccess())`
		INTERNAL API.
		 Called whenever a message replay succeeds.
		 May be implemented by subclass.
		
		Specified by:
		`[onReplaySuccess](Eventsourced.html#onReplaySuccess())` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### redeliverInterval
		
		
		
		```
		scala.concurrent.duration.FiniteDuration redeliverInterval()
		```
		
		Interval between redelivery attempts.
		 
		 The default value can be configured with the
		 `akka.persistence.at-least-once-delivery.redeliver-interval`
		 configuration key. This method can be overridden by implementation classes to return
		 non\-default values.
		- #### redeliverOverdue
		
		
		
		```
		void redeliverOverdue()
		```
		- #### redeliverTask\_$eq
		
		
		
		```
		void redeliverTask_$eq​(scala.Option<[Cancellable](../actor/Cancellable.html "interface in akka.actor")> x$1)
		```
		- #### redeliveryBurstLimit
		
		
		
		```
		int redeliveryBurstLimit()
		```
		
		Maximum number of unconfirmed messages that will be sent at each redelivery burst
		 (burst frequency is half of the redelivery interval).
		 If there's a lot of unconfirmed messages (e.g. if the destination is not available for a long time),
		 this helps to prevent an overwhelming amount of messages to be sent at once.
		 
		 The default value can be configured with the
		 `akka.persistence.at-least-once-delivery.redelivery-burst-limit`
		 configuration key. This method can be overridden by implementation classes to return
		 non\-default values.
		- #### send
		
		
		
		```
		void send​(long deliveryId,
		          akka.persistence.AtLeastOnceDelivery.Internal.Delivery d,
		          long timestamp)
		```
		- #### setDeliverySnapshot
		
		
		
		```
		void setDeliverySnapshot​([AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot](AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html "class in akka.persistence") snapshot)
		```
		
		If snapshot from [`getDeliverySnapshot()`](#getDeliverySnapshot()) was saved it will be received during recovery
		 in a [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence") message and should be set with this method.
		- #### startRedeliverTask
		
		
		
		```
		void startRedeliverTask()
		```
		- #### super$aroundPostStop
		
		
		
		```
		void super$aroundPostStop()
		```
		
		INTERNAL API
		
		Specified by:
		`[super$aroundPostStop](Eventsourced.html#super$aroundPostStop())` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### super$aroundPreRestart
		
		
		
		```
		void super$aroundPreRestart​(java.lang.Throwable reason,
		                            scala.Option<java.lang.Object> message)
		```
		
		INTERNAL API
		
		Specified by:
		`[super$aroundPreRestart](Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option))` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### super$aroundReceive
		
		
		
		```
		void super$aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                         java.lang.Object message)
		```
		
		INTERNAL API
		
		Specified by:
		`[super$aroundReceive](Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### super$onReplaySuccess
		
		
		
		```
		void super$onReplaySuccess()
		```
		- #### unconfirmed\_$eq
		
		
		
		```
		void unconfirmed_$eq​(scala.collection.immutable.SortedMap<java.lang.Object,​akka.persistence.AtLeastOnceDelivery.Internal.Delivery> x$1)
		```
		- #### warnAfterNumberOfUnconfirmedAttempts
		
		
		
		```
		int warnAfterNumberOfUnconfirmedAttempts()
		```
		
		After this number of delivery attempts an [`AtLeastOnceDelivery.UnconfirmedWarning`](AtLeastOnceDelivery.UnconfirmedWarning.html "class in akka.persistence") message
		 will be sent to `self`. The count is reset after a restart.
		 
		 The default value can be configured with the
		 `akka.persistence.at-least-once-delivery.warn-after-number-of-unconfirmed-attempts`
		 configuration key. This method can be overridden by implementation classes to return
		 non\-default values.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.UnconfirmedWarning.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.AsyncHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.AsyncHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.PendingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.RecoveryTick$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.RecoveryTick.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.State.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html)*