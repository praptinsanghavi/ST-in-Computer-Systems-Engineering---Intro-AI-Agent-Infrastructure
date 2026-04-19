---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:17:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/JournalPerfSpec.BenchActor.html
title: JournalPerfSpec.BenchActor
---

# JournalPerfSpec.BenchActor

## Content

Package [akka.persistence.journal](package-summary.html)
## Class JournalPerfSpec.BenchActor

- java.lang.Object
- - akka.persistence.journal.JournalPerfSpec.BenchActor

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[Stash](../../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")`, `[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`, `[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](../PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](../PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../PersistentActor.html "interface in akka.persistence")`, `[Snapshotter](../Snapshotter.html "interface in akka.persistence")`

Enclosing class:
[JournalPerfSpec](JournalPerfSpec.html "class in akka.persistence.journal")

---

```
public static class JournalPerfSpec.BenchActor
extends java.lang.Object
implements [PersistentActor](../PersistentActor.html "interface in akka.persistence"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](../Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](../Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](../Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](../Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](../Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](../Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](../Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](../Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.State](../Eventsourced.State.html "interface in akka.persistence")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BenchActor](#%3Cinit%3E(java.lang.String,akka.actor.ActorRef,int))​(java.lang.String persistenceId,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo,  int replyAfter)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$actor$StashSupport$_setter_$mailbox_$eq](#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))​([DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)` |  |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `int` | `[counter](#counter())()` |  |
	| `void` | `[counter_$eq](#counter_$eq(int))​(int x$1)` |  |
	| `protected [ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[journal](#journal())()` |  |
	| `java.lang.String` | `[persistenceId](#persistenceId())()` | Id of the persistent entity for which messages should be replayed. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveCommand](#receiveCommand())()` | Command handler. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveRecover](#receiveRecover())()` | Recovery handler that receives persisted events during recovery. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `protected [ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[snapshotStore](#snapshotStore())()` | Snapshot store plugin actor. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../../actor/Actor.html#preStart()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](../Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](../Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](../Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../Eventsourced.html#aroundPostStop()), [aroundPreRestart](../Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../Eventsourced.html#aroundPreStart()), [aroundReceive](../Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [batchAtomicWrite](../Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](../Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentState_$eq](../Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](../Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](../Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](../Eventsourced.html#flushBatch()), [flushJournalBatch](../Eventsourced.html#flushJournalBatch()), [internalDefer](../Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](../Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](../Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](../Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](../Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](../Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](../Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journalBatch_$eq](../Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](../Eventsourced.html#lastSequenceNr()), [log](../Eventsourced.html#log()), [nextSequenceNr](../Eventsourced.html#nextSequenceNr()), [onPersistFailure](../Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](../Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](../Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onReplaySuccess](../Eventsourced.html#onReplaySuccess()), [peekApplyHandler](../Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](../Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [recovering](../Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](../Eventsourced.html#recoveryFinished()), [recoveryRunning](../Eventsourced.html#recoveryRunning()), [recoveryStarted](../Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](../Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](../Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](../Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](../Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](../Eventsourced.html#snapshotSequenceNr()), [snapshotterId](../Eventsourced.html#snapshotterId()), [startRecovery](../Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](../Eventsourced.html#stash()), [stashInternally](../Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](../Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPostStop](../Eventsourced.html#super$aroundPostStop()), [super$aroundPreRestart](../Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundPreStart](../Eventsourced.html#super$aroundPreStart()), [super$aroundReceive](../Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$stash](../Eventsourced.html#super$stash()), [super$unhandled](../Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](../Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](../Eventsourced.html#unstashAll()), [unstashInternally](../Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](../Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](../Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](../Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](../Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](../Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](../Eventsourced.html#writeInProgress_$eq(boolean))`
		- ### Methods inherited from interface akka.persistence.[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")
		
		
		`[journalPluginId](../PersistenceIdentity.html#journalPluginId()), [snapshotPluginId](../PersistenceIdentity.html#snapshotPluginId())`
		- ### Methods inherited from interface akka.persistence.[PersistenceRecovery](../PersistenceRecovery.html "interface in akka.persistence")
		
		
		`[recovery](../PersistenceRecovery.html#recovery())`
		- ### Methods inherited from interface akka.persistence.[PersistenceStash](../PersistenceStash.html "interface in akka.persistence")
		
		
		`[internalStashOverflowStrategy](../PersistenceStash.html#internalStashOverflowStrategy())`
		- ### Methods inherited from interface akka.persistence.[PersistentActor](../PersistentActor.html "interface in akka.persistence")
		
		
		`[defer](../PersistentActor.html#defer(A,scala.Function1)), [deferAsync](../PersistentActor.html#deferAsync(A,scala.Function1)), [persist](../PersistentActor.html#persist(A,scala.Function1)), [persistAll](../PersistentActor.html#persistAll(scala.collection.immutable.Seq,scala.Function1)), [persistAllAsync](../PersistentActor.html#persistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [persistAsync](../PersistentActor.html#persistAsync(A,scala.Function1)), [receive](../PersistentActor.html#receive())`
		- ### Methods inherited from interface akka.persistence.[Snapshotter](../Snapshotter.html "interface in akka.persistence")
		
		
		`[deleteSnapshot](../Snapshotter.html#deleteSnapshot(long)), [deleteSnapshots](../Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria)), [loadSnapshot](../Snapshotter.html#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long)), [saveSnapshot](../Snapshotter.html#saveSnapshot(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/StashSupport.html#actorCell()), [clearStash](../../actor/StashSupport.html#clearStash()), [enqueueFirst](../../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [prepend](../../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [theStash_$eq](../../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../../actor/StashSupport.html#unstash()), [unstashAll](../../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../../actor/UnrestrictedStash.html#postStop()), [preRestart](../../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Constructor Detail
	
	
	
		- #### BenchActor
		
		
		
		```
		public BenchActor​(java.lang.String persistenceId,
		                  [ActorRef](../../actor/ActorRef.html "class in akka.actor") replyTo,
		                  int replyAfter)
		```

	- ### Method Detail
	
	
	
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$StashSupport$\_setter\_$mailbox\_$eq
		
		
		
		```
		protected void akka$actor$StashSupport$_setter_$mailbox_$eq​([DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch") x$1)
		```
		
		
		Specified by:
		`[akka$actor$StashSupport$_setter_$mailbox_$eq](../../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics))` in interface `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](../../actor/ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](../../actor/AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](../../actor/Actor.html#context())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[context](../../actor/StashSupport.html#context())` in interface `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`
		- #### counter
		
		
		
		```
		public int counter()
		```
		- #### counter\_$eq
		
		
		
		```
		public void counter_$eq​(int x$1)
		```
		- #### journal
		
		
		
		```
		protected [ActorRef](../../actor/ActorRef.html "class in akka.actor") journal()
		```
		
		
		Specified by:
		`[journal](../Eventsourced.html#journal())` in interface `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`
		- #### persistenceId
		
		
		
		```
		public java.lang.String persistenceId()
		```
		
		Description copied from interface: `[PersistenceIdentity](../PersistenceIdentity.html#persistenceId())`
		Id of the persistent entity for which messages should be replayed.
		
		Specified by:
		`[persistenceId](../PersistenceIdentity.html#persistenceId())` in interface `[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")`
		- #### receiveCommand
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveCommand()
		```
		
		Description copied from interface: `[Eventsourced](../Eventsourced.html#receiveCommand())`
		Command handler. Typically validates commands against current state (and/or by
		 communication with other actors). On successful validation, one or more events are
		 derived from a command and these events are then persisted by calling `persist`.
		
		Specified by:
		`[receiveCommand](../Eventsourced.html#receiveCommand())` in interface `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`
		- #### receiveRecover
		
		
		
		```
		public scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveRecover()
		```
		
		Description copied from interface: `[Eventsourced](../Eventsourced.html#receiveRecover())`
		Recovery handler that receives persisted events during recovery. If a state snapshot
		 has been captured and saved, this handler will receive a [`SnapshotOffer`](../SnapshotOffer.html "class in akka.persistence") message
		 followed by events that are younger than the offered snapshot.
		 
		 This handler must not have side\-effects other than changing persistent actor state i.e. it
		 should not perform actions that may fail, such as interacting with external services,
		 for example.
		 
		
		
		 If there is a problem with recovering the state of the actor from the journal, the error
		 will be logged and the actor will be stopped.
		 
		
		
		
		Specified by:
		`[receiveRecover](../Eventsourced.html#receiveRecover())` in interface `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`
		See Also:
		[`Recovery`](../Recovery.html "class in akka.persistence")
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Specified by:
		`[self](../../actor/StashSupport.html#self())` in interface `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`
		- #### snapshotStore
		
		
		
		```
		protected [ActorRef](../../actor/ActorRef.html "class in akka.actor") snapshotStore()
		```
		
		Description copied from interface: `[Snapshotter](../Snapshotter.html#snapshotStore())`
		Snapshot store plugin actor.
		
		Specified by:
		`[snapshotStore](../Eventsourced.html#snapshotStore())` in interface `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`
		Specified by:
		`[snapshotStore](../Snapshotter.html#snapshotStore())` in interface `[Snapshotter](../Snapshotter.html "interface in akka.persistence")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Stash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashFactory.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/StashSupport.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/UnrestrictedStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/DequeBasedMessageQueueSemantics.html
- https://doc.akka.io/japi/akka-core/2.6/akka/dispatch/RequiresMessageQueue.html
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
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/SnapshotOffer.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/JournalPerfSpec.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/JournalPerfSpec.BenchActor.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/journal/JournalPerfSpec.BenchActor.html)*