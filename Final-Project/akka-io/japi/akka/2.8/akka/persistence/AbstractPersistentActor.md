---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:28:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActor.html
title: AbstractPersistentActor
---

# AbstractPersistentActor

## Content

Package [akka.persistence](package-summary.html)
## Class AbstractPersistentActor

- java.lang.Object
- - [akka.actor.AbstractActor](../actor/AbstractActor.html "class in akka.actor")
	- - akka.persistence.AbstractPersistentActor

- All Implemented Interfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](PersistenceStash.html "interface in akka.persistence")`, `[Snapshotter](Snapshotter.html "interface in akka.persistence")`

Direct Known Subclasses:
`[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`

---

```
public abstract class AbstractPersistentActor
extends [AbstractActor](../actor/AbstractActor.html "class in akka.actor")
implements [AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")
```

Java API: an persistent actor \- can be used to implement command or Event Sourcing.

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
	| `[AbstractPersistentActor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$StashSupport$_setter_$mailbox_$eq](#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))​([DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)` |  |
	| `abstract [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor")` | `[createReceive](#createReceive())()` | An persistent actor has to define its initial receive behavior by implementing  the `createReceive` method, also known as the command handler. |
	| `abstract [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor")` | `[createReceiveRecover](#createReceiveRecover())()` | Recovery handler that receives persisted events during recovery. |
	| `protected [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[journal](#journal())()` |  |
	| `protected [ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[snapshotStore](#snapshotStore())()` | Snapshot store plugin actor. |
	
	
		- ### Methods inherited from class akka.actor.[AbstractActor](../actor/AbstractActor.html "class in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/AbstractActor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/AbstractActor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/AbstractActor.html#context()), [emptyBehavior](../actor/AbstractActor.html#emptyBehavior()), [getContext](../actor/AbstractActor.html#getContext()), [getSelf](../actor/AbstractActor.html#getSelf()), [getSender](../actor/AbstractActor.html#getSender()), [postRestart](../actor/AbstractActor.html#postRestart(java.lang.Throwable)), [postStop](../actor/AbstractActor.html#postStop()), [preRestart](../actor/AbstractActor.html#preRestart(java.lang.Throwable,java.util.Optional)), [preRestart](../actor/AbstractActor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../actor/AbstractActor.html#preStart()), [receive](../actor/AbstractActor.html#receive()), [receiveBuilder](../actor/AbstractActor.html#receiveBuilder()), [self](../actor/AbstractActor.html#self()), [supervisorStrategy](../actor/AbstractActor.html#supervisorStrategy())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.persistence.[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")
		
		
		`[defer](AbstractPersistentActorLike.html#defer(A,akka.japi.Procedure)), [deferAsync](AbstractPersistentActorLike.html#deferAsync(A,akka.japi.Procedure)), [persist](AbstractPersistentActorLike.html#persist(A,akka.japi.Procedure)), [persistAll](AbstractPersistentActorLike.html#persistAll(java.lang.Iterable,akka.japi.Procedure)), [persistAllAsync](AbstractPersistentActorLike.html#persistAllAsync(java.lang.Iterable,akka.japi.Procedure)), [persistAsync](AbstractPersistentActorLike.html#persistAsync(A,akka.japi.Procedure)), [receiveCommand](AbstractPersistentActorLike.html#receiveCommand()), [receiveRecover](AbstractPersistentActorLike.html#receiveRecover())`
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [receive](../actor/Actor.html#receive()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Eventsourced.html#aroundPostStop()), [aroundPreRestart](Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Eventsourced.html#aroundPreStart()), [aroundReceive](Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [batchAtomicWrite](Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentState_$eq](Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](Eventsourced.html#flushBatch()), [flushJournalBatch](Eventsourced.html#flushJournalBatch()), [internalDefer](Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journalBatch_$eq](Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](Eventsourced.html#lastSequenceNr()), [log](Eventsourced.html#log()), [nextSequenceNr](Eventsourced.html#nextSequenceNr()), [onPersistFailure](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onReplaySuccess](Eventsourced.html#onReplaySuccess()), [peekApplyHandler](Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [recovering](Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](Eventsourced.html#recoveryFinished()), [recoveryRunning](Eventsourced.html#recoveryRunning()), [recoveryStarted](Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](Eventsourced.html#snapshotSequenceNr()), [snapshotterId](Eventsourced.html#snapshotterId()), [startRecovery](Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](Eventsourced.html#stash()), [stashInternally](Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPostStop](Eventsourced.html#super$aroundPostStop()), [super$aroundPreRestart](Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundPreStart](Eventsourced.html#super$aroundPreStart()), [super$aroundReceive](Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$stash](Eventsourced.html#super$stash()), [super$unhandled](Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](Eventsourced.html#unstashAll()), [unstashInternally](Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](Eventsourced.html#writeInProgress_$eq(boolean))`
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
		
		
		`[actorCell](../actor/StashSupport.html#actorCell()), [clearStash](../actor/StashSupport.html#clearStash()), [context](../actor/StashSupport.html#context()), [enqueueFirst](../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [prepend](../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../actor/StashSupport.html#self()), [theStash_$eq](../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../actor/StashSupport.html#unstash()), [unstashAll](../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../actor/UnrestrictedStash.html#postStop()), [preRestart](../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Constructor Detail
	
	
	
		- #### AbstractPersistentActor
		
		
		
		```
		public AbstractPersistentActor()
		```

	- ### Method Detail
	
	
	
		- #### akka$actor$StashSupport$\_setter\_$mailbox\_$eq
		
		
		
		```
		protected void akka$actor$StashSupport$_setter_$mailbox_$eq​([DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)
		```
		
		
		Specified by:
		`[akka$actor$StashSupport$_setter_$mailbox_$eq](../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))` in interface `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`
		- #### createReceive
		
		
		
		```
		public abstract [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") createReceive()
		```
		
		An persistent actor has to define its initial receive behavior by implementing
		 the `createReceive` method, also known as the command handler. Typically
		 validates commands against current state (and/or by communication with other actors).
		 On successful validation, one or more events are derived from a command and
		 these events are then persisted by calling `persist`.
		
		Specified by:
		`[createReceive](AbstractPersistentActorLike.html#createReceive())` in interface `[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`
		Specified by:
		`[createReceive](../actor/AbstractActor.html#createReceive())` in class `[AbstractActor](../actor/AbstractActor.html "class in akka.actor")`
		- #### createReceiveRecover
		
		
		
		```
		public abstract [AbstractActor.Receive](../actor/AbstractActor.Receive.html "class in akka.actor") createReceiveRecover()
		```
		
		Recovery handler that receives persisted events during recovery. If a state snapshot
		 has been captured and saved, this handler will receive a [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence") message
		 followed by events that are younger than the offered snapshot.
		 
		 This handler must not have side\-effects other than changing persistent actor state i.e. it
		 should not perform actions that may fail, such as interacting with external services,
		 for example.
		 
		
		
		 If there is a problem with recovering the state of the actor from the journal, the error
		 will be logged and the actor will be stopped.
		 
		
		
		
		Specified by:
		`[createReceiveRecover](AbstractPersistentActorLike.html#createReceiveRecover())` in interface `[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### journal
		
		
		
		```
		protected [ActorRef](../actor/ActorRef.html "class in akka.actor") journal()
		```
		
		
		Specified by:
		`[journal](Eventsourced.html#journal())` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		- #### snapshotStore
		
		
		
		```
		protected [ActorRef](../actor/ActorRef.html "class in akka.actor") snapshotStore()
		```
		
		Description copied from interface: `[Snapshotter](Snapshotter.html#snapshotStore())`
		Snapshot store plugin actor.
		
		Specified by:
		`[snapshotStore](Eventsourced.html#snapshotStore())` in interface `[Eventsourced](Eventsourced.html "interface in akka.persistence")`
		Specified by:
		`[snapshotStore](Snapshotter.html#snapshotStore())` in interface `[Snapshotter](Snapshotter.html "interface in akka.persistence")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/AbstractActor.Receive.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/AbstractActor.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/Stash.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka/2.8/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka/2.8/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/2.8/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.AsyncHandlerInvocation$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.AsyncHandlerInvocation.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.PendingHandlerInvocation.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.RecoveryTick$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.RecoveryTick.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.State.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActor.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/AbstractPersistentActor.html)*