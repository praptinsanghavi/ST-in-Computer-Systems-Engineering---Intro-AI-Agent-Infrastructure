---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:42:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
title: AbstractPersistentActorWithAtLeastOnceDelivery
---

# AbstractPersistentActorWithAtLeastOnceDelivery

## Content

Package [akka.persistence](package-summary.html)
## Class AbstractPersistentActorWithAtLeastOnceDelivery

- java.lang.Object
- - [akka.actor.AbstractActor](../actor/AbstractActor.html "class in akka.actor")
	- - [akka.persistence.AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")
		- - akka.persistence.AbstractPersistentActorWithAtLeastOnceDelivery

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](PersistenceStash.html "interface in akka.persistence")`, `[Snapshotter](Snapshotter.html "interface in akka.persistence")`

---

```
public abstract class AbstractPersistentActorWithAtLeastOnceDelivery
extends [AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")
implements [AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")
```

Java API: compatible with lambda expressions
 
 Use this class instead of `AbstractPersistentActor` to send messages
 with at\-least\-once delivery semantics to destinations.
 Full documentation in [`AtLeastOnceDelivery`](AtLeastOnceDelivery.html "interface in akka.persistence").
 

See Also:
[`AtLeastOnceDelivery`](AtLeastOnceDelivery.html "interface in akka.persistence"), 
[`AtLeastOnceDeliveryLike`](AtLeastOnceDeliveryLike.html "interface in akka.persistence")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.[AbstractActor](../actor/AbstractActor.html "class in akka.actor")
		
		
		`[AbstractActor.ActorContext](../actor/AbstractActor.ActorContext.html "interface in akka.actor"), [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.State](Eventsourced.State.html "interface in akka.persistence")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractPersistentActorWithAtLeastOnceDelivery](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `void` | `[deliver](#deliver(akka.actor.ActorPath,akka.japi.Function))​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,  [Function](../japi/Function.html "interface in akka.japi")<java.lang.Long,​java.lang.Object> deliveryIdToMessage)` | Java API: Send the message created by the `deliveryIdToMessage` function to  the `destination` actor. |
	| `void` | `[deliver](#deliver(akka.actor.ActorSelection,akka.japi.Function))​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") destination,  [Function](../japi/Function.html "interface in akka.japi")<java.lang.Long,​java.lang.Object> deliveryIdToMessage)` | Java API: Send the message created by the `deliveryIdToMessage` function to  the `destination` actor. |
	
	
		- ### Methods inherited from class akka.persistence.[AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")
		
		
		`[akka$actor$StashSupport$_setter_$mailbox_$eq](AbstractPersistentActor.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [createReceive](AbstractPersistentActor.html#createReceive()), [createReceiveRecover](AbstractPersistentActor.html#createReceiveRecover()), [journal](AbstractPersistentActor.html#journal()), [snapshotStore](AbstractPersistentActor.html#snapshotStore())`
		- ### Methods inherited from class akka.actor.[AbstractActor](../actor/AbstractActor.html "class in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/AbstractActor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/AbstractActor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/AbstractActor.html#context()), [emptyBehavior](../actor/AbstractActor.html#emptyBehavior()), [getContext](../actor/AbstractActor.html#getContext()), [getSelf](../actor/AbstractActor.html#getSelf()), [getSender](../actor/AbstractActor.html#getSender()), [postRestart](../actor/AbstractActor.html#postRestart(java.lang.Throwable)), [postStop](../actor/AbstractActor.html#postStop()), [preRestart](../actor/AbstractActor.html#preRestart(java.lang.Throwable,java.util.Optional)), [preRestart](../actor/AbstractActor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/AbstractActor.html#preStart()), [receive](../actor/AbstractActor.html#receive()), [receiveBuilder](../actor/AbstractActor.html#receiveBuilder()), [self](../actor/AbstractActor.html#self()), [supervisorStrategy](../actor/AbstractActor.html#supervisorStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.persistence.[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")
		
		
		`[defer](AbstractPersistentActorLike.html#defer(A,akka.japi.Procedure)), [deferAsync](AbstractPersistentActorLike.html#deferAsync(A,akka.japi.Procedure)), [persist](AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure)), [persistAll](AbstractPersistentActorLike.html#persistAll(java.lang.Iterable,akka.japi.Procedure)), [persistAllAsync](AbstractPersistentActorLike.html#persistAllAsync(java.lang.Iterable,akka.japi.Procedure)), [persistAsync](AbstractPersistentActorLike.html#persistAsync(A,akka.japi.Procedure)), [receiveCommand](AbstractPersistentActorLike.html#receiveCommand()), [receiveRecover](AbstractPersistentActorLike.html#receiveRecover())`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [receive](../actor/Actor.html#receive()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.persistence.[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")
		
		
		`[aroundPostStop](AtLeastOnceDeliveryLike.html#aroundPostStop()), [aroundPreRestart](AtLeastOnceDeliveryLike.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundReceive](AtLeastOnceDeliveryLike.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [cancelRedeliveryTask](AtLeastOnceDeliveryLike.html#cancelRedeliveryTask()), [confirmDelivery](AtLeastOnceDeliveryLike.html#confirmDelivery(long)), [deliverySequenceNr_$eq](AtLeastOnceDeliveryLike.html#deliverySequenceNr_$eq(long)), [getDeliverySnapshot](AtLeastOnceDeliveryLike.html#getDeliverySnapshot()), [internalDeliver](AtLeastOnceDeliveryLike.html#internalDeliver(akka.actor.ActorPath,scala.Function1)), [internalDeliver](AtLeastOnceDeliveryLike.html#internalDeliver(akka.actor.ActorSelection,scala.Function1)), [maxUnconfirmedMessages](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages()), [nextDeliverySequenceNr](AtLeastOnceDeliveryLike.html#nextDeliverySequenceNr()), [numberOfUnconfirmed](AtLeastOnceDeliveryLike.html#numberOfUnconfirmed()), [onReplaySuccess](AtLeastOnceDeliveryLike.html#onReplaySuccess()), [redeliverInterval](AtLeastOnceDeliveryLike.html#redeliverInterval()), [redeliverOverdue](AtLeastOnceDeliveryLike.html#redeliverOverdue()), [redeliverTask_$eq](AtLeastOnceDeliveryLike.html#redeliverTask_$eq(scala.Option)), [redeliveryBurstLimit](AtLeastOnceDeliveryLike.html#redeliveryBurstLimit()), [send](AtLeastOnceDeliveryLike.html#send(long,akka.persistence.AtLeastOnceDelivery.Internal.Delivery,long)), [setDeliverySnapshot](AtLeastOnceDeliveryLike.html#setDeliverySnapshot(akka.persistence.AtLeastOnceDelivery.AtLeastOnceDeliverySnapshot)), [startRedeliverTask](AtLeastOnceDeliveryLike.html#startRedeliverTask()), [super$aroundPostStop](AtLeastOnceDeliveryLike.html#super$aroundPostStop()), [super$aroundPreRestart](AtLeastOnceDeliveryLike.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundReceive](AtLeastOnceDeliveryLike.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$onReplaySuccess](AtLeastOnceDeliveryLike.html#super$onReplaySuccess()), [unconfirmed_$eq](AtLeastOnceDeliveryLike.html#unconfirmed_$eq(scala.collection.immutable.SortedMap)), [warnAfterNumberOfUnconfirmedAttempts](AtLeastOnceDeliveryLike.html#warnAfterNumberOfUnconfirmedAttempts())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPreStart](Eventsourced.html#aroundPreStart()), [batchAtomicWrite](Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentCommand](Eventsourced.html#currentCommand()), [currentState_$eq](Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](Eventsourced.html#flushBatch()), [flushJournalBatch](Eventsourced.html#flushJournalBatch()), [getAndClearInstrumentationContext](Eventsourced.html#getAndClearInstrumentationContext(long)), [instrumentationContexts_$eq](Eventsourced.html#instrumentationContexts_$eq(scala.collection.immutable.Map)), [internalDefer](Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journal](Eventsourced.html#journal()), [journalBatch_$eq](Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](Eventsourced.html#lastSequenceNr()), [log](Eventsourced.html#log()), [nextSequenceNr](Eventsourced.html#nextSequenceNr()), [onPersistFailure](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onRecoveryFailureAndInstrumentation](Eventsourced.html#onRecoveryFailureAndInstrumentation(java.lang.Throwable,scala.Option)), [peekApplyHandler](Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [recovering](Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](Eventsourced.html#recoveryFinished()), [recoveryRunning](Eventsourced.html#recoveryRunning()), [recoveryStarted](Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](Eventsourced.html#snapshotSequenceNr()), [snapshotStore](Eventsourced.html#snapshotStore()), [snapshotterId](Eventsourced.html#snapshotterId()), [startRecovery](Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](Eventsourced.html#stash()), [stashInternally](Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPreStart](Eventsourced.html#super$aroundPreStart()), [super$stash](Eventsourced.html#super$stash()), [super$unhandled](Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](Eventsourced.html#unstashAll()), [unstashInternally](Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](Eventsourced.html#writeInProgress_$eq(boolean))`
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

- - ### Constructor Detail
	
	
	
		- #### AbstractPersistentActorWithAtLeastOnceDelivery
		
		
		
		```
		public AbstractPersistentActorWithAtLeastOnceDelivery()
		```

	- ### Method Detail
	
	
	
		- #### deliver
		
		
		
		```
		public void deliver​([ActorPath](../actor/ActorPath.html "interface in akka.actor") destination,
		                    [Function](../japi/Function.html "interface in akka.japi")<java.lang.Long,​java.lang.Object> deliveryIdToMessage)
		```
		
		Java API: Send the message created by the `deliveryIdToMessage` function to
		 the `destination` actor. It will retry sending the message until
		 the delivery is confirmed with [`AtLeastOnceDeliveryLike.confirmDelivery(long)`](AtLeastOnceDeliveryLike.html#confirmDelivery(long)). Correlation
		 between `deliver` and `confirmDelivery` is performed with the
		 `deliveryId` that is provided as parameter to the `deliveryIdToMessage`
		 function. The `deliveryId` is typically passed in the message to the
		 destination, which replies with a message containing the same `deliveryId`.
		 
		 The `deliveryId` is a strictly monotonically increasing sequence number without
		 gaps. The same sequence is used for all destinations, i.e. when sending to
		 multiple destinations the destinations will see gaps in the sequence if no
		 translation is performed.
		 
		
		
		 During recovery this method will not send out the message, but it will be sent
		 later if no matching `confirmDelivery` was performed.
		 
		
		
		 This method will throw [`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence")
		 if [`AtLeastOnceDeliveryLike.numberOfUnconfirmed()`](AtLeastOnceDeliveryLike.html#numberOfUnconfirmed()) is greater than or equal to [`AtLeastOnceDeliveryLike.maxUnconfirmedMessages()`](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages()).
		- #### deliver
		
		
		
		```
		public void deliver​([ActorSelection](../actor/ActorSelection.html "class in akka.actor") destination,
		                    [Function](../japi/Function.html "interface in akka.japi")<java.lang.Long,​java.lang.Object> deliveryIdToMessage)
		```
		
		Java API: Send the message created by the `deliveryIdToMessage` function to
		 the `destination` actor. It will retry sending the message until
		 the delivery is confirmed with [`AtLeastOnceDeliveryLike.confirmDelivery(long)`](AtLeastOnceDeliveryLike.html#confirmDelivery(long)). Correlation
		 between `deliver` and `confirmDelivery` is performed with the
		 `deliveryId` that is provided as parameter to the `deliveryIdToMessage`
		 function. The `deliveryId` is typically passed in the message to the
		 destination, which replies with a message containing the same `deliveryId`.
		 
		 The `deliveryId` is a strictly monotonically increasing sequence number without
		 gaps. The same sequence is used for all destinations, i.e. when sending to
		 multiple destinations the destinations will see gaps in the sequence if no
		 translation is performed.
		 
		
		
		 During recovery this method will not send out the message, but it will be sent
		 later if no matching `confirmDelivery` was performed.
		 
		
		
		 This method will throw [`AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException`](AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html "class in akka.persistence")
		 if [`AtLeastOnceDeliveryLike.numberOfUnconfirmed()`](AtLeastOnceDeliveryLike.html#numberOfUnconfirmed()) is greater than or equal to [`AtLeastOnceDeliveryLike.maxUnconfirmedMessages()`](AtLeastOnceDeliveryLike.html#maxUnconfirmedMessages()).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorPath.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorSelection.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/Function.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.MaxUnconfirmedMessagesExceededException.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AtLeastOnceDeliveryLike.html
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
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html)*