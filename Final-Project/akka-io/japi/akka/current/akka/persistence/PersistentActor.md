---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:21:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html
title: PersistentActor
---

# PersistentActor

## Content

Package [akka.persistence](package-summary.html)
## Interface PersistentActor

- All Superinterfaces:
`[Actor](../actor/Actor.html "interface in akka.actor")`, `[Eventsourced](Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](PersistenceStash.html "interface in akka.persistence")`, `[RequiresMessageQueue](../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Snapshotter](Snapshotter.html "interface in akka.persistence")`, `[Stash](../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../actor/UnrestrictedStash.html "interface in akka.actor")`

All Known Subinterfaces:
`[AtLeastOnceDelivery](AtLeastOnceDelivery.html "interface in akka.persistence")`

All Known Implementing Classes:
`[JournalPerfSpec.BenchActor](journal/JournalPerfSpec.BenchActor.html "class in akka.persistence.journal")`, `[PersistentShardCoordinator](../cluster/sharding/PersistentShardCoordinator.html "class in akka.cluster.sharding")`

---

```
public interface PersistentActor
extends [Eventsourced](Eventsourced.html "interface in akka.persistence"), [PersistenceIdentity](PersistenceIdentity.html "interface in akka.persistence")
```

Scala API: A persistent Actor \- can be used to implement command or Event Sourcing.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.State](Eventsourced.State.html "interface in akka.persistence")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<A> void` | `[defer](#defer(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Defer the handler execution until all pending handlers have been executed. |
	| `<A> void` | `[deferAsync](#deferAsync(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Defer the handler execution until all pending handlers have been executed. |
	| `<A> void` | `[persist](#persist(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Asynchronously persists `event`. |
	| `<A> void` | `[persistAll](#persistAll(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<A> events,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Asynchronously persists `events` in specified order. |
	| `<A> void` | `[persistAllAsync](#persistAllAsync(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<A> events,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Asynchronously persists `events` in specified order. |
	| `<A> void` | `[persistAsync](#persistAsync(A,scala.Function1))​(A event,  scala.Function1<A,​scala.runtime.BoxedUnit> handler)` | Asynchronously persists `event`. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../actor/Actor.html#context()), [postRestart](../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../actor/Actor.html#preStart()), [self](../actor/Actor.html#self()), [sender](../actor/Actor.html#sender()), [supervisorStrategy](../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Eventsourced.html#aroundPostStop()), [aroundPreRestart](Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Eventsourced.html#aroundPreStart()), [aroundReceive](Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [batchAtomicWrite](Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentCommand](Eventsourced.html#currentCommand()), [currentState_$eq](Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](Eventsourced.html#flushBatch()), [flushJournalBatch](Eventsourced.html#flushJournalBatch()), [getAndClearInstrumentationContext](Eventsourced.html#getAndClearInstrumentationContext(long)), [instrumentationContexts_$eq](Eventsourced.html#instrumentationContexts_$eq(scala.collection.immutable.Map)), [internalDefer](Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journal](Eventsourced.html#journal()), [journalBatch_$eq](Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](Eventsourced.html#lastSequenceNr()), [log](Eventsourced.html#log()), [nextSequenceNr](Eventsourced.html#nextSequenceNr()), [onPersistFailure](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onRecoveryFailureAndInstrumentation](Eventsourced.html#onRecoveryFailureAndInstrumentation(java.lang.Throwable,scala.Option)), [onReplaySuccess](Eventsourced.html#onReplaySuccess()), [peekApplyHandler](Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [receiveCommand](Eventsourced.html#receiveCommand()), [receiveRecover](Eventsourced.html#receiveRecover()), [recovering](Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](Eventsourced.html#recoveryFinished()), [recoveryRunning](Eventsourced.html#recoveryRunning()), [recoveryStarted](Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](Eventsourced.html#snapshotSequenceNr()), [snapshotStore](Eventsourced.html#snapshotStore()), [snapshotterId](Eventsourced.html#snapshotterId()), [startRecovery](Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](Eventsourced.html#stash()), [stashInternally](Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPostStop](Eventsourced.html#super$aroundPostStop()), [super$aroundPreRestart](Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundPreStart](Eventsourced.html#super$aroundPreStart()), [super$aroundReceive](Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$stash](Eventsourced.html#super$stash()), [super$unhandled](Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](Eventsourced.html#unstashAll()), [unstashInternally](Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](Eventsourced.html#writeInProgress_$eq(boolean))`
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
	
	
	
		- #### defer
		
		
		
		```
		<A> void defer​(A event,
		               scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Defer the handler execution until all pending handlers have been executed. It is guaranteed that no new commands
		 will be received by a persistent actor between a call to `defer` and the execution of its `handler`.
		 Allows to define logic within the actor, which will respect the invocation\-order\-guarantee
		 in respect to `persistAsync` or `persist` calls. That is, if `persistAsync` or `persist` was invoked before `defer`,
		 the corresponding handlers will be invoked in the same order as they were registered in.
		 
		 This call will NOT result in `event` being persisted, use `persist` or `persistAsync` instead
		 if the given event should possible to replay.
		 
		
		
		 If there are no pending persist handler calls, the handler will be called immediately.
		 
		
		
		 If persistence of an earlier event fails, the persistent actor will stop, and the `handler`
		 will not be run.
		 
		
		
		
		Parameters:
		`event` \- event to be handled in the future, when preceding persist operations have been processes
		`handler` \- handler for the given `event`
		- #### deferAsync
		
		
		
		```
		<A> void deferAsync​(A event,
		                    scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Defer the handler execution until all pending handlers have been executed.
		 Allows to define logic within the actor, which will respect the invocation\-order\-guarantee
		 in respect to `persistAsync` or `persist` calls. That is, if `persistAsync` or `persist` was invoked before `deferAsync`,
		 the corresponding handlers will be invoked in the same order as they were registered in.
		 
		 This call will NOT result in `event` being persisted, use `persist` or `persistAsync` instead
		 if the given event should possible to replay.
		 
		
		
		 If there are no pending persist handler calls, the handler will be called immediately.
		 
		
		
		 If persistence of an earlier event fails, the persistent actor will stop, and the `handler`
		 will not be run.
		 
		
		
		
		Parameters:
		`event` \- event to be handled in the future, when preceding persist operations have been processes
		`handler` \- handler for the given `event`
		- #### persist
		
		
		
		```
		<A> void persist​(A event,
		                 scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Asynchronously persists `event`. On successful persistence, `handler` is called with the
		 persisted event. It is guaranteed that no new commands will be received by a persistent actor
		 between a call to `persist` and the execution of its `handler`. This also holds for
		 multiple `persist` calls per received command. Internally, this is achieved by stashing new
		 commands and unstashing them when the `event` has been persisted and handled. The stash used
		 for that is an internal stash which doesn't interfere with the inherited user stash.
		 
		 An event `handler` may close over persistent actor state and modify it. The `sender` of a persisted
		 event is the sender of the corresponding command. This means that one can reply to a command
		 sender within an event `handler`.
		 
		
		
		 Within an event handler, applications usually update persistent actor state using persisted event
		 data, notify listeners and reply to command senders.
		 
		
		
		 If persistence of an event fails, [`Eventsourced.onPersistFailure(java.lang.Throwable, java.lang.Object, long)`](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)) will be invoked and the actor will
		 unconditionally be stopped. The reason that it cannot resume when persist fails is that it
		 is unknown if the event was actually persisted or not, and therefore it is in an inconsistent
		 state. Restarting on persistent failures will most likely fail anyway, since the journal
		 is probably unavailable. It is better to stop the actor and after a back\-off timeout start
		 it again.
		 
		
		
		
		Parameters:
		`event` \- event to be persisted
		`handler` \- handler for each persisted `event`
		- #### persistAll
		
		
		
		```
		<A> void persistAll​(scala.collection.immutable.Seq<A> events,
		                    scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Asynchronously persists `events` in specified order. This is equivalent to calling
		 `persist[A](event: A)(handler: A => Unit)` multiple times with the same `handler`,
		 except that `events` are persisted atomically with this method.
		 
		
		Parameters:
		`events` \- events to be persisted
		`handler` \- handler for each persisted `events`
		- #### persistAllAsync
		
		
		
		```
		<A> void persistAllAsync​(scala.collection.immutable.Seq<A> events,
		                         scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Asynchronously persists `events` in specified order. This is equivalent to calling
		 `persistAsync[A](event: A)(handler: A => Unit)` multiple times with the same `handler`,
		 except that `events` are persisted atomically with this method.
		 
		
		Parameters:
		`events` \- events to be persisted
		`handler` \- handler for each persisted `events`
		- #### persistAsync
		
		
		
		```
		<A> void persistAsync​(A event,
		                      scala.Function1<A,​scala.runtime.BoxedUnit> handler)
		```
		
		Asynchronously persists `event`. On successful persistence, `handler` is called with the
		 persisted event.
		 
		 Unlike `persist` the persistent actor will continue to receive incoming commands between the
		 call to `persist` and executing it's `handler`. This asynchronous, non\-stashing, version of
		 of persist should be used when you favor throughput over the "command\-2 only processed after
		 command\-1 effects' have been applied" guarantee, which is provided by the plain `persist` method.
		 
		
		
		 An event `handler` may close over persistent actor state and modify it. The `sender` of a persisted
		 event is the sender of the corresponding command. This means that one can reply to a command
		 sender within an event `handler`.
		 
		
		
		 If persistence of an event fails, [`Eventsourced.onPersistFailure(java.lang.Throwable, java.lang.Object, long)`](Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)) will be invoked and the actor will
		 unconditionally be stopped. The reason that it cannot resume when persist fails is that it
		 is unknown if the event was actually persisted or not, and therefore it is in an inconsistent
		 state. Restarting on persistent failures will most likely fail anyway, since the journal
		 is probably unavailable. It is better to stop the actor and after a back\-off timeout start
		 it again.
		 
		
		
		
		Parameters:
		`event` \- event to be persisted
		`handler` \- handler for each persisted `event`
		- #### receive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../actor/Actor.html#receive())` in interface `[Actor](../actor/Actor.html "interface in akka.actor")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Stash.html
- https://doc.akka.io/japi/akka/current/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka/current/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka/current/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/PersistentShardCoordinator.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka/current/akka/dispatch/RequiresMessageQueue.html
- https://doc.akka.io/japi/akka/current/akka/persistence/AtLeastOnceDelivery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.AsyncHandlerInvocation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.AsyncHandlerInvocation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.PendingHandlerInvocation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.RecoveryTick$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.RecoveryTick.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.StashingHandlerInvocation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.State.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka/current/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/JournalPerfSpec.BenchActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html](https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html)*