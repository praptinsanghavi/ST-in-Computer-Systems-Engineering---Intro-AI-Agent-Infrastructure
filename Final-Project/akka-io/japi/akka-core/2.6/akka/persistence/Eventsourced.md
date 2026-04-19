---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.html
title: Eventsourced
---

# Eventsourced

## Content

Package [akka.persistence](package-summary.html)
## Interface Eventsourced

- All Superinterfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](PersistenceStash.html "interface in akka.persistence")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Snapshotter](Snapshotter.html "interface in akka.persistence")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`

All Known Subinterfaces:
`[AbstractPersistentActorLike](AbstractPersistentActorLike.html "interface in akka.persistence")`, `[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`, `[AtLeastOnceDeliveryLike](AtLeastOnceDeliveryLike.html "interface in akka.persistence")`, `[PersistentActor](PersistentActor.html "interface in akka.persistence")`, `[PersistentFSM](fsm/PersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`

All Known Implementing Classes:
`[AbstractPersistentActor](AbstractPersistentActor.html "class in akka.persistence")`, `[AbstractPersistentActorWithAtLeastOnceDelivery](AbstractPersistentActorWithAtLeastOnceDelivery.html "class in akka.persistence")`, `[AbstractPersistentActorWithTimers](AbstractPersistentActorWithTimers.html "class in akka.persistence")`, `[AbstractPersistentFSM](fsm/AbstractPersistentFSM.html "class in akka.persistence.fsm")`, `[AbstractPersistentLoggingFSM](fsm/AbstractPersistentLoggingFSM.html "class in akka.persistence.fsm")`, `[JournalPerfSpec.BenchActor](journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface Eventsourced
extends [Snapshotter](Snapshotter.html "interface in akka.persistence"), [PersistenceStash](PersistenceStash.html "interface in akka.persistence"), [PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence"), [PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")
```

INTERNAL API.
 
 Scala API and implementation details of [`PersistentActor`](PersistentActor.html "interface in akka.persistence") and [`AbstractPersistentActor`](AbstractPersistentActor.html "class in akka.persistence").

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[Eventsourced.AsyncHandlerInvocation](Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence")` | INTERNAL API: does not force the actor to stash commands; Originates from either \`persistAsync\` or \`defer\` calls |
	| `static class` | `[Eventsourced.AsyncHandlerInvocation$](Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence")` |  |
	| `static interface` | `[Eventsourced.PendingHandlerInvocation](Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence")` | INTERNAL API |
	| `static class` | `[Eventsourced.RecoveryTick](Eventsourced.RecoveryTick.html "class in akka.persistence")` | INTERNAL API: message used to detect that recovery timed out |
	| `static class` | `[Eventsourced.RecoveryTick$](Eventsourced.RecoveryTick$.html "class in akka.persistence")` |  |
	| `static class` | `[Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence")` | INTERNAL API: forces actor to stash incoming commands until all these invocations are handled |
	| `static class` | `[Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence")` |  |
	| `static interface` | `[Eventsourced.State](Eventsourced.State.html "interface in akka.persistence")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[_lastSequenceNr_$eq](#_lastSequenceNr_$eq(long))​(long x$1)` |  |
	| `void` | `[aroundPostRestart](#aroundPostRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | INTERNAL API. |
	| `void` | `[aroundPostStop](#aroundPostStop())()` | INTERNAL API. |
	| `void` | `[aroundPreRestart](#aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | INTERNAL API. |
	| `void` | `[aroundPreStart](#aroundPreStart())()` | INTERNAL API. |
	| `void` | `[aroundReceive](#aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object message)` | INTERNAL API. |
	| `void` | `[batchAtomicWrite](#batchAtomicWrite(akka.persistence.AtomicWrite))​([AtomicWrite](AtomicWrite.html "class in akka.persistence") atomicWrite)` |  |
	| `void` | `[changeState](#changeState(akka.persistence.Eventsourced.State))​([Eventsourced.State](Eventsourced.State.html "interface in akka.persistence") state)` |  |
	| `void` | `[currentState_$eq](#currentState_$eq(akka.persistence.Eventsourced.State))​([Eventsourced.State](Eventsourced.State.html "interface in akka.persistence") x$1)` |  |
	| `void` | `[deleteMessages](#deleteMessages(long))​(long toSequenceNr)` | Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`. |
	| `void` | `[eventBatch_$eq](#eventBatch_$eq(scala.collection.immutable.List))​(scala.collection.immutable.List<[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")> x$1)` |  |
	| `void` | `[flushBatch](#flushBatch())()` |  |
	| `void` | `[flushJournalBatch](#flushJournalBatch())()` |  |
	| `<A> void` | `[internalDefer](#internalDefer(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Internal API |
	| `<A> void` | `[internalDeferAsync](#internalDeferAsync(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Internal API |
	| `void` | `[internalDeleteMessagesBeforeSnapshot](#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int))​([SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence") e,  int keepNrOfBatches,  int snapshotAfter)` | INTERNAL API. |
	| `<A> void` | `[internalPersist](#internalPersist(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Internal API |
	| `<A> void` | `[internalPersistAll](#internalPersistAll(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<A> events,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Internal API |
	| `<A> void` | `[internalPersistAllAsync](#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<A> events,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Internal API |
	| `<A> void` | `[internalPersistAsync](#internalPersistAsync(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Internal API |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[journal](#journal())()` |  |
	| `void` | `[journalBatch_$eq](#journalBatch_$eq(scala.collection.immutable.Vector))​(scala.collection.immutable.Vector<[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")> x$1)` |  |
	| `long` | `[lastSequenceNr](#lastSequenceNr())()` | Highest received sequence number so far or `0L` if this actor hasn't replayed  or stored any persistent events yet. |
	| `[LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event")` | `[log](#log())()` |  |
	| `long` | `[nextSequenceNr](#nextSequenceNr())()` |  |
	| `void` | `[onPersistFailure](#onPersistFailure(java.lang.Throwable,java.lang.Object,long))​(java.lang.Throwable cause,  java.lang.Object event,  long seqNr)` | Called when persist fails. |
	| `void` | `[onPersistRejected](#onPersistRejected(java.lang.Throwable,java.lang.Object,long))​(java.lang.Throwable cause,  java.lang.Object event,  long seqNr)` | Called when the journal rejected `persist` of an event. |
	| `void` | `[onRecoveryFailure](#onRecoveryFailure(java.lang.Throwable,scala.Option))​(java.lang.Throwable cause,  scala.Option<java.lang.Object> event)` | Called whenever a message replay fails. |
	| `void` | `[onReplaySuccess](#onReplaySuccess())()` | INTERNAL API. |
	| `void` | `[peekApplyHandler](#peekApplyHandler(java.lang.Object))​(java.lang.Object payload)` |  |
	| `void` | `[pendingStashingPersistInvocations_$eq](#pendingStashingPersistInvocations_$eq(long))​(long x$1)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveCommand](#receiveCommand())()` | Command handler. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveRecover](#receiveRecover())()` | Recovery handler that receives persisted events during recovery. |
	| `java.lang.Object` | `[recovering](#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> recoveryBehavior,  scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `boolean` | `[recoveryFinished](#recoveryFinished())()` | Returns `true` if this persistent actor has successfully finished recovery. |
	| `boolean` | `[recoveryRunning](#recoveryRunning())()` | Returns `true` if this persistent actor is currently recovering. |
	| `java.lang.Object` | `[recoveryStarted](#recoveryStarted(long,scala.concurrent.duration.FiniteDuration))​(long replayMax,  scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `void` | `[requestRecoveryPermit](#requestRecoveryPermit())()` |  |
	| `void` | `[sendBatchedEventsToJournal](#sendBatchedEventsToJournal(scala.collection.immutable.Vector))​(scala.collection.immutable.Vector<[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")> journalBatch)` |  |
	| `void` | `[sequenceNr_$eq](#sequenceNr_$eq(long))​(long x$1)` |  |
	| `void` | `[setLastSequenceNr](#setLastSequenceNr(long))​(long value)` |  |
	| `long` | `[snapshotSequenceNr](#snapshotSequenceNr())()` | Returns `lastSequenceNr`. |
	| `[ActorRef](../actor/ActorRef.html "class in akka.actor")` | `[snapshotStore](#snapshotStore())()` | Snapshot store plugin actor. |
	| `java.lang.String` | `[snapshotterId](#snapshotterId())()` | Returns `persistenceId`. |
	| `void` | `[startRecovery](#startRecovery(akka.persistence.Recovery))​([Recovery](Recovery.html "class in akka.persistence") recovery)` |  |
	| `void` | `[stash](#stash())()` | Adds the current message (the message that the actor received last) to the  actor's stash. |
	| `void` | `[stashInternally](#stashInternally(java.lang.Object))​(java.lang.Object currMsg)` |  |
	| `void` | `[super$aroundPostRestart](#super$aroundPostRestart(java.lang.Throwable))​(java.lang.Throwable reason)` | INTERNAL API. |
	| `void` | `[super$aroundPostStop](#super$aroundPostStop())()` | INTERNAL API. |
	| `void` | `[super$aroundPreRestart](#super$aroundPreRestart(java.lang.Throwable,scala.Option))​(java.lang.Throwable reason,  scala.Option<java.lang.Object> message)` | INTERNAL API. |
	| `void` | `[super$aroundPreStart](#super$aroundPreStart())()` |  |
	| `void` | `[super$aroundReceive](#super$aroundReceive(scala.PartialFunction,java.lang.Object))​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,  java.lang.Object msg)` | Processes a loaded snapshot, if any. |
	| `void` | `[super$stash](#super$stash())()` | Returns `true` if this persistent actor has successfully finished recovery. |
	| `void` | `[super$unhandled](#super$unhandled(java.lang.Object))​(java.lang.Object message)` |  |
	| `void` | `[unhandled](#unhandled(java.lang.Object))​(java.lang.Object message)` | User overridable callback. |
	| `void` | `[unstashAll](#unstashAll())()` | Prepends all messages in the stash to the mailbox, and then clears the stash. |
	| `void` | `[unstashInternally](#unstashInternally(boolean))​(boolean all)` |  |
	| `void` | `[updateLastSequenceNr](#updateLastSequenceNr(akka.persistence.PersistentRepr))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent)` |  |
	| `java.lang.Object` | `[waitingRecoveryPermit](#waitingRecoveryPermit(akka.persistence.Recovery))​([Recovery](Recovery.html "class in akka.persistence") recovery)` |  |
	| `void` | `[writeEventFailed](#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") p,  java.lang.Throwable cause)` |  |
	| `void` | `[writeEventRejected](#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") p,  java.lang.Throwable cause)` |  |
	| `void` | `[writeEventSucceeded](#writeEventSucceeded(akka.persistence.PersistentRepr))​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") p)` |  |
	| `void` | `[writeInProgress_$eq](#writeInProgress_$eq(boolean))​(boolean x$1)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [receive](../actor/Actor.html#receive()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy())`
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
		
		
		`[actorCell](../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../actor/StashSupport.html#clearStash()), [context](../actor/StashSupport.html#context()), [enqueueFirst](../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../actor/StashSupport.html#mailbox()), [prepend](../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../actor/StashSupport.html#self()), [theStash_$eq](../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../actor/StashSupport.html#unstash()), [unstashAll](../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../actor/UnrestrictedStash.html#postStop()), [preRestart](../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Method Detail
	
	
	
		- #### super$aroundPreStart
		
		
		
		```
		void super$aroundPreStart()
		```
		- #### super$aroundPreRestart
		
		
		
		```
		void super$aroundPreRestart​(java.lang.Throwable reason,
		                            scala.Option<java.lang.Object> message)
		```
		
		INTERNAL API.
		- #### super$aroundPostRestart
		
		
		
		```
		void super$aroundPostRestart​(java.lang.Throwable reason)
		```
		
		INTERNAL API.
		- #### super$aroundPostStop
		
		
		
		```
		void super$aroundPostStop()
		```
		
		INTERNAL API.
		- #### super$unhandled
		
		
		
		```
		void super$unhandled​(java.lang.Object message)
		```
		- #### super$stash
		
		
		
		```
		void super$stash()
		```
		
		Returns `true` if this persistent actor has successfully finished recovery.
		- #### super$aroundReceive
		
		
		
		```
		void super$aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                         java.lang.Object msg)
		```
		
		Processes a loaded snapshot, if any. A loaded snapshot is offered with a `SnapshotOffer`
		 message to the actor's `receiveRecover`. Then initiates a message replay, either starting
		 from the loaded snapshot or from scratch, and switches to `recoveryStarted` state.
		 All incoming messages are stashed.
		 
		
		Parameters:
		`replayMax` \- maximum number of messages to replay.
		`timeout` \- recovery event timeout
		- #### journal
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") journal()
		```
		- #### snapshotStore
		
		
		
		```
		[ActorRef](../actor/ActorRef.html "class in akka.actor") snapshotStore()
		```
		
		Description copied from interface: `[Snapshotter](Snapshotter.html#snapshotStore())`
		Snapshot store plugin actor.
		
		Specified by:
		`[snapshotStore](Snapshotter.html#snapshotStore())` in interface `[Snapshotter](Snapshotter.html "interface in akka.persistence")`
		- #### journalBatch\_$eq
		
		
		
		```
		void journalBatch_$eq​(scala.collection.immutable.Vector<[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")> x$1)
		```
		- #### writeInProgress\_$eq
		
		
		
		```
		void writeInProgress_$eq​(boolean x$1)
		```
		- #### sequenceNr\_$eq
		
		
		
		```
		void sequenceNr_$eq​(long x$1)
		```
		- #### \_lastSequenceNr\_$eq
		
		
		
		```
		void _lastSequenceNr_$eq​(long x$1)
		```
		- #### currentState\_$eq
		
		
		
		```
		void currentState_$eq​([Eventsourced.State](Eventsourced.State.html "interface in akka.persistence") x$1)
		```
		- #### pendingStashingPersistInvocations\_$eq
		
		
		
		```
		void pendingStashingPersistInvocations_$eq​(long x$1)
		```
		- #### eventBatch\_$eq
		
		
		
		```
		void eventBatch_$eq​(scala.collection.immutable.List<[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")> x$1)
		```
		- #### snapshotterId
		
		
		
		```
		java.lang.String snapshotterId()
		```
		
		Returns `persistenceId`.
		
		Specified by:
		`[snapshotterId](Snapshotter.html#snapshotterId())` in interface `[Snapshotter](Snapshotter.html "interface in akka.persistence")`
		- #### lastSequenceNr
		
		
		
		```
		long lastSequenceNr()
		```
		
		Highest received sequence number so far or `0L` if this actor hasn't replayed
		 or stored any persistent events yet.
		- #### snapshotSequenceNr
		
		
		
		```
		long snapshotSequenceNr()
		```
		
		Returns `lastSequenceNr`.
		
		Specified by:
		`[snapshotSequenceNr](Snapshotter.html#snapshotSequenceNr())` in interface `[Snapshotter](Snapshotter.html "interface in akka.persistence")`
		- #### onReplaySuccess
		
		
		
		```
		void onReplaySuccess()
		```
		
		INTERNAL API.
		 Called whenever a message replay succeeds.
		 May be implemented by subclass.
		- #### onRecoveryFailure
		
		
		
		```
		void onRecoveryFailure​(java.lang.Throwable cause,
		                       scala.Option<java.lang.Object> event)
		```
		
		Called whenever a message replay fails. By default it logs the error.
		 
		 Subclass may override to customize logging.
		 
		
		
		 The actor is always stopped after this method has been invoked.
		 
		
		
		
		Parameters:
		`cause` \- failure cause.
		`event` \- the event that was processed in `receiveRecover`, if the exception
		 was thrown there
		- #### onPersistFailure
		
		
		
		```
		void onPersistFailure​(java.lang.Throwable cause,
		                      java.lang.Object event,
		                      long seqNr)
		```
		
		Called when persist fails. By default it logs the error.
		 Subclass may override to customize logging and for example send negative
		 acknowledgment to sender.
		 
		 The actor is always stopped after this method has been invoked.
		 
		
		
		 Note that the event may or may not have been saved, depending on the type of
		 failure.
		 
		
		
		
		Parameters:
		`cause` \- failure cause.
		`event` \- the event that was to be persisted
		- #### onPersistRejected
		
		
		
		```
		void onPersistRejected​(java.lang.Throwable cause,
		                       java.lang.Object event,
		                       long seqNr)
		```
		
		Called when the journal rejected `persist` of an event. The event was not
		 stored. By default this method logs the problem as an error, and the actor continues.
		 The callback handler that was passed to the `persist` method will not be invoked.
		 
		
		Parameters:
		`cause` \- failure cause
		`event` \- the event that was to be persisted
		- #### stashInternally
		
		
		
		```
		void stashInternally​(java.lang.Object currMsg)
		```
		- #### unstashInternally
		
		
		
		```
		void unstashInternally​(boolean all)
		```
		- #### startRecovery
		
		
		
		```
		void startRecovery​([Recovery](Recovery.html "class in akka.persistence") recovery)
		```
		- #### aroundReceive
		
		
		
		```
		void aroundReceive​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive,
		                   java.lang.Object message)
		```
		
		INTERNAL API.
		
		Specified by:
		`[aroundReceive](../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		Parameters:
		`receive` \- current behavior.
		`message` \- current message.
		- #### aroundPreStart
		
		
		
		```
		void aroundPreStart()
		```
		
		INTERNAL API.
		
		Specified by:
		`[aroundPreStart](../actor/Actor.html#aroundPreStart())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### requestRecoveryPermit
		
		
		
		```
		void requestRecoveryPermit()
		```
		- #### aroundPreRestart
		
		
		
		```
		void aroundPreRestart​(java.lang.Throwable reason,
		                      scala.Option<java.lang.Object> message)
		```
		
		INTERNAL API.
		
		Specified by:
		`[aroundPreRestart](../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### aroundPostRestart
		
		
		
		```
		void aroundPostRestart​(java.lang.Throwable reason)
		```
		
		INTERNAL API.
		
		Specified by:
		`[aroundPostRestart](../actor/Actor.html#aroundPostRestart(java.lang.Throwable))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### aroundPostStop
		
		
		
		```
		void aroundPostStop()
		```
		
		INTERNAL API.
		
		Specified by:
		`[aroundPostStop](../actor/Actor.html#aroundPostStop())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### unhandled
		
		
		
		```
		void unhandled​(java.lang.Object message)
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#unhandled(java.lang.Object))`
		User overridable callback.
		 
		 Is called when a message isn't handled by the current behavior of the actor
		 by default it fails with either a [`DeathPactException`](../actor/DeathPactException.html "class in akka.actor") (in
		 case of an unhandled [`Terminated`](../actor/Terminated.html "class in akka.actor") message) or publishes an [`UnhandledMessage`](../actor/UnhandledMessage.html "class in akka.actor")
		 to the actor's system's [`EventStream`](../event/EventStream.html "class in akka.event")
		
		Specified by:
		`[unhandled](../actor/Actor.html#unhandled(java.lang.Object))` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`
		- #### changeState
		
		
		
		```
		void changeState​([Eventsourced.State](Eventsourced.State.html "interface in akka.persistence") state)
		```
		- #### updateLastSequenceNr
		
		
		
		```
		void updateLastSequenceNr​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") persistent)
		```
		- #### setLastSequenceNr
		
		
		
		```
		void setLastSequenceNr​(long value)
		```
		- #### nextSequenceNr
		
		
		
		```
		long nextSequenceNr()
		```
		- #### flushJournalBatch
		
		
		
		```
		void flushJournalBatch()
		```
		- #### sendBatchedEventsToJournal
		
		
		
		```
		void sendBatchedEventsToJournal​(scala.collection.immutable.Vector<[PersistentEnvelope](PersistentEnvelope.html "interface in akka.persistence")> journalBatch)
		```
		- #### log
		
		
		
		```
		[LoggingAdapter](../event/LoggingAdapter.html "interface in akka.event") log()
		```
		- #### receiveRecover
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveRecover()
		```
		
		Recovery handler that receives persisted events during recovery. If a state snapshot
		 has been captured and saved, this handler will receive a [`SnapshotOffer`](SnapshotOffer.html "class in akka.persistence") message
		 followed by events that are younger than the offered snapshot.
		 
		 This handler must not have side\-effects other than changing persistent actor state i.e. it
		 should not perform actions that may fail, such as interacting with external services,
		 for example.
		 
		
		
		 If there is a problem with recovering the state of the actor from the journal, the error
		 will be logged and the actor will be stopped.
		 
		
		
		
		See Also:
		[`Recovery`](Recovery.html "class in akka.persistence")
		- #### receiveCommand
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveCommand()
		```
		
		Command handler. Typically validates commands against current state (and/or by
		 communication with other actors). On successful validation, one or more events are
		 derived from a command and these events are then persisted by calling `persist`.
		- #### internalPersist
		
		
		
		```
		<A> void internalPersist​(A event,
		                         scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Internal API
		- #### internalPersistAll
		
		
		
		```
		<A> void internalPersistAll​(scala.collection.immutable.Seq<A> events,
		                            scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Internal API
		- #### batchAtomicWrite
		
		
		
		```
		void batchAtomicWrite​([AtomicWrite](AtomicWrite.html "class in akka.persistence") atomicWrite)
		```
		- #### internalPersistAsync
		
		
		
		```
		<A> void internalPersistAsync​(A event,
		                              scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Internal API
		- #### internalPersistAllAsync
		
		
		
		```
		<A> void internalPersistAllAsync​(scala.collection.immutable.Seq<A> events,
		                                 scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Internal API
		- #### internalDeferAsync
		
		
		
		```
		<A> void internalDeferAsync​(A event,
		                            scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Internal API
		- #### internalDefer
		
		
		
		```
		<A> void internalDefer​(A event,
		                       scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Internal API
		- #### deleteMessages
		
		
		
		```
		void deleteMessages​(long toSequenceNr)
		```
		
		Permanently deletes all persistent messages with sequence numbers less than or equal `toSequenceNr`.
		 
		 If the delete is successful a [`DeleteMessagesSuccess`](DeleteMessagesSuccess.html "class in akka.persistence") will be sent to the actor.
		 If the delete fails a [`DeleteMessagesFailure`](DeleteMessagesFailure.html "class in akka.persistence") will be sent to the actor.
		 
		
		
		 The given `toSequenceNr` must be less than or equal to [`lastSequenceNr()`](#lastSequenceNr()), otherwise
		 [`DeleteMessagesFailure`](DeleteMessagesFailure.html "class in akka.persistence") is sent to the actor without performing the delete. All persistent
		 messages may be deleted without specifying the actual sequence number by using `Long.MaxValue`
		 as the `toSequenceNr`.
		 
		
		
		
		Parameters:
		`toSequenceNr` \- upper sequence number (inclusive) bound of persistent messages to be deleted.
		- #### internalDeleteMessagesBeforeSnapshot
		
		
		
		```
		void internalDeleteMessagesBeforeSnapshot​([SaveSnapshotSuccess](SaveSnapshotSuccess.html "class in akka.persistence") e,
		                                          int keepNrOfBatches,
		                                          int snapshotAfter)
		```
		
		INTERNAL API.
		 An [`Eventsourced`](Eventsourced.html "interface in akka.persistence") actor can request cleanup by deleting either a range of, or all persistent events.
		 For example, on successful snapshot completion, delete messages within a configurable `snapshotAfter`
		 range that are less than or equal to the given `SnapshotMetadata.sequenceNr`
		 (provided the `SnapshotMetadata.sequenceNr` is \<\= to [`lastSequenceNr()`](#lastSequenceNr())).
		 
		 Or delete all by using `Long.MaxValue` as the `toSequenceNr`
		
		
		
		```
		 m.copy(sequenceNr = Long.MaxValue) 
		```
		- #### recoveryRunning
		
		
		
		```
		boolean recoveryRunning()
		```
		
		Returns `true` if this persistent actor is currently recovering.
		- #### recoveryFinished
		
		
		
		```
		boolean recoveryFinished()
		```
		
		Returns `true` if this persistent actor has successfully finished recovery.
		- #### stash
		
		
		
		```
		void stash()
		```
		
		Description copied from interface: `[StashSupport](../actor/StashSupport.html#stash())`
		Adds the current message (the message that the actor received last) to the
		 actor's stash.
		 
		
		Specified by:
		`[stash](../actor/StashSupport.html#stash())` in interface `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`
		- #### unstashAll
		
		
		
		```
		void unstashAll()
		```
		
		Description copied from interface: `[StashSupport](../actor/StashSupport.html#unstashAll())`
		Prepends all messages in the stash to the mailbox, and then clears the stash.
		 
		 Messages from the stash are enqueued to the mailbox until the capacity of the
		 mailbox (if any) has been reached. In case a bounded mailbox overflows, a
		 `MessageQueueAppendFailedException` is thrown.
		 
		
		
		 The stash is guaranteed to be empty after calling `unstashAll()`.
		
		
		
		Specified by:
		`[unstashAll](../actor/StashSupport.html#unstashAll())` in interface `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`
		- #### waitingRecoveryPermit
		
		
		
		```
		java.lang.Object waitingRecoveryPermit​([Recovery](Recovery.html "class in akka.persistence") recovery)
		```
		- #### recoveryStarted
		
		
		
		```
		java.lang.Object recoveryStarted​(long replayMax,
		                                 scala.concurrent.duration.FiniteDuration timeout)
		```
		- #### recovering
		
		
		
		```
		java.lang.Object recovering​(scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> recoveryBehavior,
		                            scala.concurrent.duration.FiniteDuration timeout)
		```
		- #### flushBatch
		
		
		
		```
		void flushBatch()
		```
		- #### peekApplyHandler
		
		
		
		```
		void peekApplyHandler​(java.lang.Object payload)
		```
		- #### writeEventSucceeded
		
		
		
		```
		void writeEventSucceeded​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") p)
		```
		- #### writeEventRejected
		
		
		
		```
		void writeEventRejected​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") p,
		                        java.lang.Throwable cause)
		```
		- #### writeEventFailed
		
		
		
		```
		void writeEventFailed​([PersistentRepr](PersistentRepr.html "interface in akka.persistence") p,
		                      java.lang.Throwable cause)
		```

## Code Examples

### Example 1: internalDeleteMessagesBeforeSnapshot

```text
m.copy(sequenceNr = Long.MaxValue)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/DeathPactException.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Terminated.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnhandledMessage.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/EventStream.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/LoggingAdapter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActorLike.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActorWithAtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AbstractPersistentActorWithTimers.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtLeastOnceDeliveryLike.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/AtomicWrite.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/DeleteMessagesFailure.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/DeleteMessagesSuccess.html
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
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentEnvelope.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentRepr.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SaveSnapshotSuccess.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.html)*