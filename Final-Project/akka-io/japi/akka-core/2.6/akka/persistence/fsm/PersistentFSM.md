---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html
title: PersistentFSM
---

# PersistentFSM

## Content

Package [akka.persistence.fsm](package-summary.html)
## Interface PersistentFSM\<S extends [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"),​D,​E\>

- All Superinterfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`, `[Listeners](../../routing/Listeners.html "interface in akka.routing")`, `[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](../PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](../PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../PersistentActor.html "interface in akka.persistence")`, `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Snapshotter](../Snapshotter.html "interface in akka.persistence")`, `[Stash](../../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")`

All Known Implementing Classes:
`[AbstractPersistentFSM](AbstractPersistentFSM.html "class in akka.persistence.fsm")`, `[AbstractPersistentLoggingFSM](AbstractPersistentLoggingFSM.html "class in akka.persistence.fsm")`

---

```
public interface PersistentFSM<S extends [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"),​D,​E>
extends [PersistentActor](../PersistentActor.html "interface in akka.persistence"), [PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>, [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

Deprecated.
Use EventSourcedBehavior. Since 2\.6\.0\.

A FSM implementation with persistent state.
 
 Supports the usual [`FSM`](../../actor/FSM.html "interface in akka.actor") functionality with additional persistence features.
 `PersistentFSM` is identified by 'persistenceId' value.
 State changes are persisted atomically together with domain events, which means that either both succeed or both fail,
 i.e. a state transition event will not be stored if persistence of an event related to that change fails.
 Persistence execution order is: persist \-\> wait for ack \-\> apply state.
 Incoming messages are deferred until the state is applied.
 State Data is constructed based on domain events, according to user's implementation of applyEvent function.

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[PersistentFSM.$minus$greater$](PersistentFSM.$minus$greater$.html "class in akka.persistence.fsm")` | Deprecated. This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `static class` | `[PersistentFSM.CurrentState](PersistentFSM.CurrentState.html "class in akka.persistence.fsm")<[S](PersistentFSM.CurrentState.html "type parameter in PersistentFSM.CurrentState")>` | Deprecated. Message type which is sent directly to the subscribed actor in  [`FSM.SubscribeTransitionCallBack`](../../actor/FSM.SubscribeTransitionCallBack.html "class in akka.actor") before sending any  [`FSM.Transition`](../../actor/FSM.Transition.html "class in akka.actor") messages. |
	| `static class` | `[PersistentFSM.CurrentState$](PersistentFSM.CurrentState$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSM.Event.html "type parameter in PersistentFSM.Event")>` | Deprecated. All messages sent to the [`FSM`](../../actor/FSM.html "interface in akka.actor") will be wrapped inside an  `Event`, which allows pattern matching to extract both state and data. |
	| `static class` | `[PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.Failure](PersistentFSM.Failure.html "class in akka.persistence.fsm")` | Deprecated. Signifies that the [`FSM`](../../actor/FSM.html "interface in akka.actor") is shutting itself down because of  an error, e.g. |
	| `static class` | `[PersistentFSM.Failure$](PersistentFSM.Failure$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.FixedDelayMode$](PersistentFSM.FixedDelayMode$.html "class in akka.persistence.fsm")` | Deprecated. INTERNAL API |
	| `static class` | `[PersistentFSM.FixedRateMode$](PersistentFSM.FixedRateMode$.html "class in akka.persistence.fsm")` | Deprecated. INTERNAL API |
	| `static interface` | `[PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm")` | Deprecated. FSMState base trait, makes possible for simple default serialization by conversion to String |
	| `static class` | `[PersistentFSM.LogEntry](PersistentFSM.LogEntry.html "class in akka.persistence.fsm")<[S](PersistentFSM.LogEntry.html "type parameter in PersistentFSM.LogEntry"),​[D](PersistentFSM.LogEntry.html "type parameter in PersistentFSM.LogEntry")>` | Deprecated. Log Entry of the [`LoggingFSM`](../../actor/LoggingFSM.html "interface in akka.actor"), can be obtained by calling `getLog`. |
	| `static class` | `[PersistentFSM.LogEntry$](PersistentFSM.LogEntry$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.Normal$](PersistentFSM.Normal$.html "class in akka.persistence.fsm")` | Deprecated. Default reason if calling `stop()`. |
	| `static class` | `[PersistentFSM.NullFunction$](PersistentFSM.NullFunction$.html "class in akka.persistence.fsm")` | Deprecated. A partial function value which does not match anything and can be used to  \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers. |
	| `static interface` | `[PersistentFSM.PersistentFsmEvent](PersistentFSM.PersistentFsmEvent.html "interface in akka.persistence.fsm")` | Deprecated. Base persistent event class |
	| `static class` | `[PersistentFSM.PersistentFSMSnapshot](PersistentFSM.PersistentFSMSnapshot.html "class in akka.persistence.fsm")<[D](PersistentFSM.PersistentFSMSnapshot.html "type parameter in PersistentFSM.PersistentFSMSnapshot")>` | Deprecated. FSM state and data snapshot |
	| `static class` | `[PersistentFSM.PersistentFSMSnapshot$](PersistentFSM.PersistentFSMSnapshot$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static interface` | `[PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")` | Deprecated. Reason why this [`FSM`](../../actor/FSM.html "interface in akka.actor") is shutting down. |
	| `static class` | `[PersistentFSM.Shutdown$](PersistentFSM.Shutdown$.html "class in akka.persistence.fsm")` | Deprecated. Reason given when someone was calling `system.stop(fsm)` from outside;  also applies to `Stop` supervision directive. |
	| `static class` | `[PersistentFSM.SingleMode$](PersistentFSM.SingleMode$.html "class in akka.persistence.fsm")` | Deprecated. INTERNAL API |
	| `static class` | `[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSM.State.html "type parameter in PersistentFSM.State"),​[D](PersistentFSM.State.html "type parameter in PersistentFSM.State"),​[E](PersistentFSM.State.html "type parameter in PersistentFSM.State")>` | Deprecated. This captures all of the managed state of the [`FSM`](../../actor/FSM.html "interface in akka.actor"): the state  name, the state data, possibly custom timeout, stop reason, replies  accumulated while processing the last message, possibly domain event and handler  to be executed after FSM moves to the new state (also triggered when staying in the same state) |
	| `static class` | `[PersistentFSM.State$](PersistentFSM.State$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.StateChangeEvent](PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm")` | Deprecated. Persisted on state change  Not deprecated as used for users migrating from PersistentFSM to EventSourcedBehavior |
	| `static class` | `[PersistentFSM.StateChangeEvent$](PersistentFSM.StateChangeEvent$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm")` | Deprecated. This case object is received in case of a state timeout. |
	| `static class` | `[PersistentFSM.StopEvent](PersistentFSM.StopEvent.html "class in akka.persistence.fsm")<[S](PersistentFSM.StopEvent.html "type parameter in PersistentFSM.StopEvent"),​[D](PersistentFSM.StopEvent.html "type parameter in PersistentFSM.StopEvent")>` | Deprecated. Case class representing the state of the [`FSM`](../../actor/FSM.html "interface in akka.actor") whithin the  `onTermination` block. |
	| `static class` | `[PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.SubscribeTransitionCallBack](PersistentFSM.SubscribeTransitionCallBack.html "class in akka.persistence.fsm")` | Deprecated. Send this to an [`FSM`](../../actor/FSM.html "interface in akka.actor") to request first the [`PersistentFSM.CurrentState`](PersistentFSM.CurrentState.html "class in akka.persistence.fsm")  and then a series of [`PersistentFSM.Transition`](PersistentFSM.Transition.html "class in akka.persistence.fsm") updates. |
	| `static class` | `[PersistentFSM.SubscribeTransitionCallBack$](PersistentFSM.SubscribeTransitionCallBack$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.TimeoutMarker](PersistentFSM.TimeoutMarker.html "class in akka.persistence.fsm")` | Deprecated. INTERNAL API |
	| `static class` | `[PersistentFSM.TimeoutMarker$](PersistentFSM.TimeoutMarker$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.Timer](PersistentFSM.Timer.html "class in akka.persistence.fsm")` | Deprecated. INTERNAL API |
	| `static class` | `[PersistentFSM.Timer$](PersistentFSM.Timer$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static interface` | `[PersistentFSM.TimerMode](PersistentFSM.TimerMode.html "interface in akka.persistence.fsm")` | Deprecated. INTERNAL API |
	| `static class` | `[PersistentFSM.Transition](PersistentFSM.Transition.html "class in akka.persistence.fsm")<[S](PersistentFSM.Transition.html "type parameter in PersistentFSM.Transition")>` | Deprecated. Message type which is used to communicate transitions between states to  all subscribed listeners (use [`FSM.SubscribeTransitionCallBack`](../../actor/FSM.SubscribeTransitionCallBack.html "class in akka.actor")). |
	| `static class` | `[PersistentFSM.Transition$](PersistentFSM.Transition$.html "class in akka.persistence.fsm")` | Deprecated. |
	| `static class` | `[PersistentFSM.UnsubscribeTransitionCallBack](PersistentFSM.UnsubscribeTransitionCallBack.html "class in akka.persistence.fsm")` | Deprecated. Unsubscribe from [`FSM.Transition`](../../actor/FSM.Transition.html "class in akka.actor") notifications which was  effected by sending the corresponding [`FSM.SubscribeTransitionCallBack`](../../actor/FSM.SubscribeTransitionCallBack.html "class in akka.actor"). |
	| `static class` | `[PersistentFSM.UnsubscribeTransitionCallBack$](PersistentFSM.UnsubscribeTransitionCallBack$.html "class in akka.persistence.fsm")` | Deprecated. |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](../Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](../Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](../Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](../Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](../Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](../Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](../Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](../Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq](#akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq(scala.reflect.ClassTag))​(scala.reflect.ClassTag<[E](PersistentFSM.html "type parameter in PersistentFSM")> x$1)` | Deprecated. Domain event's `ClassTag`  Used for identifying domain events during recovery |
	| `[D](PersistentFSM.html "type parameter in PersistentFSM")` | `[applyEvent](#applyEvent(E,D))​([E](PersistentFSM.html "type parameter in PersistentFSM") domainEvent,  [D](PersistentFSM.html "type parameter in PersistentFSM") currentData)` | Deprecated. Override this handler to define the action on Domain Event |
	| `void` | `[applyState](#applyState(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSM.html "type parameter in PersistentFSM"),​[D](PersistentFSM.html "type parameter in PersistentFSM"),​[E](PersistentFSM.html "type parameter in PersistentFSM")> nextState)` | Deprecated. Persist FSM State and FSM State Data |
	| `void` | `[currentStateTimeout_$eq](#currentStateTimeout_$eq(scala.Option))​(scala.Option<scala.concurrent.duration.FiniteDuration> x$1)` | Deprecated. |
	| `scala.reflect.ClassTag<[E](PersistentFSM.html "type parameter in PersistentFSM")>` | `[domainEventClassTag](#domainEventClassTag())()` | Deprecated. Enables to pass a ClassTag of a domain event base type from the implementing class |
	| `scala.reflect.ClassTag<[E](PersistentFSM.html "type parameter in PersistentFSM")>` | `[domainEventTag](#domainEventTag())()` | Deprecated. Domain event's `ClassTag`  Used for identifying domain events during recovery |
	| `void` | `[onRecoveryCompleted](#onRecoveryCompleted())()` | Deprecated. Override this handler to define the action on recovery completion |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveCommand](#receiveCommand())()` | Deprecated. After recovery events are handled as in usual FSM actor |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receiveRecover](#receiveRecover())()` | Deprecated. Discover the latest recorded state |
	| `void` | `[saveStateSnapshot](#saveStateSnapshot())()` | Deprecated. Save the current state as a snapshot |
	| `scala.collection.immutable.Map<java.lang.String,​[S](PersistentFSM.html "type parameter in PersistentFSM")>` | `[statesMap](#statesMap())()` | Deprecated. Map from state identifier to state instance |
	| `void` | `[super$applyState](#super$applyState(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSM.html "type parameter in PersistentFSM"),​[D](PersistentFSM.html "type parameter in PersistentFSM"),​[E](PersistentFSM.html "type parameter in PersistentFSM")> nextState)` | Deprecated. Persist FSM State and FSM State Data |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](../Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](../Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](../Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../Eventsourced.html#aroundPostStop()), [aroundPreRestart](../Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../Eventsourced.html#aroundPreStart()), [aroundReceive](../Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [batchAtomicWrite](../Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](../Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentState_$eq](../Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](../Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](../Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](../Eventsourced.html#flushBatch()), [flushJournalBatch](../Eventsourced.html#flushJournalBatch()), [internalDefer](../Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](../Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](../Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](../Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](../Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](../Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](../Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journal](../Eventsourced.html#journal()), [journalBatch_$eq](../Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](../Eventsourced.html#lastSequenceNr()), [log](../Eventsourced.html#log()), [nextSequenceNr](../Eventsourced.html#nextSequenceNr()), [onPersistFailure](../Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](../Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](../Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onReplaySuccess](../Eventsourced.html#onReplaySuccess()), [peekApplyHandler](../Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](../Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [recovering](../Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](../Eventsourced.html#recoveryFinished()), [recoveryRunning](../Eventsourced.html#recoveryRunning()), [recoveryStarted](../Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](../Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](../Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](../Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](../Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](../Eventsourced.html#snapshotSequenceNr()), [snapshotStore](../Eventsourced.html#snapshotStore()), [snapshotterId](../Eventsourced.html#snapshotterId()), [startRecovery](../Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](../Eventsourced.html#stash()), [stashInternally](../Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](../Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPostStop](../Eventsourced.html#super$aroundPostStop()), [super$aroundPreRestart](../Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundPreStart](../Eventsourced.html#super$aroundPreStart()), [super$aroundReceive](../Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$stash](../Eventsourced.html#super$stash()), [super$unhandled](../Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](../Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](../Eventsourced.html#unstashAll()), [unstashInternally](../Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](../Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](../Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](../Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](../Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](../Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](../Eventsourced.html#writeInProgress_$eq(boolean))`
		- ### Methods inherited from interface akka.routing.[Listeners](../../routing/Listeners.html "interface in akka.routing")
		
		
		`[akka$routing$Listeners$_setter_$listeners_$eq](../../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [gossip](../../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../../routing/Listeners.html#listenerManagement()), [listeners](../../routing/Listeners.html#listeners())`
		- ### Methods inherited from interface akka.persistence.[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")
		
		
		`[journalPluginId](../PersistenceIdentity.html#journalPluginId()), [persistenceId](../PersistenceIdentity.html#persistenceId()), [snapshotPluginId](../PersistenceIdentity.html#snapshotPluginId())`
		- ### Methods inherited from interface akka.persistence.[PersistenceRecovery](../PersistenceRecovery.html "interface in akka.persistence")
		
		
		`[recovery](../PersistenceRecovery.html#recovery())`
		- ### Methods inherited from interface akka.persistence.[PersistenceStash](../PersistenceStash.html "interface in akka.persistence")
		
		
		`[internalStashOverflowStrategy](../PersistenceStash.html#internalStashOverflowStrategy())`
		- ### Methods inherited from interface akka.persistence.[PersistentActor](../PersistentActor.html "interface in akka.persistence")
		
		
		`[defer](../PersistentActor.html#defer(A,scala.Function1)), [deferAsync](../PersistentActor.html#deferAsync(A,scala.Function1)), [persist](../PersistentActor.html#persist(A,scala.Function1)), [persistAll](../PersistentActor.html#persistAll(scala.collection.immutable.Seq,scala.Function1)), [persistAllAsync](../PersistentActor.html#persistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [persistAsync](../PersistentActor.html#persistAsync(A,scala.Function1)), [receive](../PersistentActor.html#receive())`
		- ### Methods inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[$minus$greater](PersistentFSMBase.html#$minus$greater()), [akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$)), [cancelTimer](PersistentFSMBase.html#cancelTimer(java.lang.String)), [currentState_$eq](PersistentFSMBase.html#currentState_$eq(akka.persistence.fsm.PersistentFSM.State)), [debugEvent](PersistentFSMBase.html#debugEvent()), [Event](PersistentFSMBase.html#Event()), [generation_$eq](PersistentFSMBase.html#generation_$eq(long)), [handleEvent_$eq](PersistentFSMBase.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](PersistentFSMBase.html#handleTransition(S,S)), [initialize](PersistentFSMBase.html#initialize()), [isStateTimerActive](PersistentFSMBase.html#isStateTimerActive()), [isTimerActive](PersistentFSMBase.html#isTimerActive(java.lang.String)), [logTermination](PersistentFSMBase.html#logTermination(akka.persistence.fsm.PersistentFSM.Reason)), [makeTransition](PersistentFSMBase.html#makeTransition(akka.persistence.fsm.PersistentFSM.State)), [nextState_$eq](PersistentFSMBase.html#nextState_$eq(akka.persistence.fsm.PersistentFSM.State)), [nextStateData](PersistentFSMBase.html#nextStateData()), [onTermination](PersistentFSMBase.html#onTermination(scala.PartialFunction)), [onTransition](PersistentFSMBase.html#onTransition(scala.PartialFunction)), [postStop](PersistentFSMBase.html#postStop()), [processEvent](PersistentFSMBase.html#processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object)), [processMsg](PersistentFSMBase.html#processMsg(java.lang.Object,java.lang.Object)), [receive](PersistentFSMBase.html#receive()), [register](PersistentFSMBase.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](PersistentFSMBase.html#setStateTimeout(S,scala.Option)), [setTimer](PersistentFSMBase.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](PersistentFSMBase.html#setTimer$default$4()), [startSingleTimer](PersistentFSMBase.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](PersistentFSMBase.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.PersistentFSM.TimerMode)), [startTimerAtFixedRate](PersistentFSMBase.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](PersistentFSMBase.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](PersistentFSMBase.html#startWith(S,D,scala.Option)), [startWith$default$3](PersistentFSMBase.html#startWith$default$3()), [stateData](PersistentFSMBase.html#stateData()), [stateName](PersistentFSMBase.html#stateName()), [stateNames](PersistentFSMBase.html#stateNames()), [StateTimeout](PersistentFSMBase.html#StateTimeout()), [stay](PersistentFSMBase.html#stay()), [stop](PersistentFSMBase.html#stop()), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason)), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason,D)), [StopEvent](PersistentFSMBase.html#StopEvent()), [super$postStop](PersistentFSMBase.html#super$postStop()), [terminate](PersistentFSMBase.html#terminate(akka.persistence.fsm.PersistentFSM.State)), [terminateEvent_$eq](PersistentFSMBase.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](PersistentFSMBase.html#timeoutFuture_$eq(scala.Option)), [total2pf](PersistentFSMBase.html#total2pf(scala.Function2)), [transform](PersistentFSMBase.html#transform(scala.PartialFunction)), [transitionEvent_$eq](PersistentFSMBase.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](PersistentFSMBase.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](PersistentFSMBase.html#when$default$2()), [whenUnhandled](PersistentFSMBase.html#whenUnhandled(scala.PartialFunction))`
		- ### Methods inherited from interface akka.persistence.[Snapshotter](../Snapshotter.html "interface in akka.persistence")
		
		
		`[deleteSnapshot](../Snapshotter.html#deleteSnapshot(long)), [deleteSnapshots](../Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria)), [loadSnapshot](../Snapshotter.html#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long)), [saveSnapshot](../Snapshotter.html#saveSnapshot(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../../actor/StashSupport.html#clearStash()), [context](../../actor/StashSupport.html#context()), [enqueueFirst](../../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../../actor/StashSupport.html#mailbox()), [prepend](../../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../../actor/StashSupport.html#self()), [theStash_$eq](../../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../../actor/StashSupport.html#unstash()), [unstashAll](../../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../../actor/UnrestrictedStash.html#postStop()), [preRestart](../../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Method Detail
	
	
	
		- #### akka$persistence$fsm$PersistentFSM$\_setter\_$domainEventTag\_$eq
		
		
		
		```
		void akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq​(scala.reflect.ClassTag<[E](PersistentFSM.html "type parameter in PersistentFSM")> x$1)
		```
		
		Deprecated.
		Domain event's `ClassTag`
		 Used for identifying domain events during recovery
		- #### super$applyState
		
		
		
		```
		void super$applyState​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSM.html "type parameter in PersistentFSM"),​[D](PersistentFSM.html "type parameter in PersistentFSM"),​[E](PersistentFSM.html "type parameter in PersistentFSM")> nextState)
		```
		
		Deprecated.
		Persist FSM State and FSM State Data
		- #### domainEventClassTag
		
		
		
		```
		scala.reflect.ClassTag<[E](PersistentFSM.html "type parameter in PersistentFSM")> domainEventClassTag()
		```
		
		Deprecated.
		Enables to pass a ClassTag of a domain event base type from the implementing class
		 
		
		Returns:
		`ClassTag` of domain event base type
		- #### domainEventTag
		
		
		
		```
		scala.reflect.ClassTag<[E](PersistentFSM.html "type parameter in PersistentFSM")> domainEventTag()
		```
		
		Deprecated.
		Domain event's `ClassTag`
		 Used for identifying domain events during recovery
		- #### statesMap
		
		
		
		```
		scala.collection.immutable.Map<java.lang.String,​[S](PersistentFSM.html "type parameter in PersistentFSM")> statesMap()
		```
		
		Deprecated.
		Map from state identifier to state instance
		- #### currentStateTimeout\_$eq
		
		
		
		```
		void currentStateTimeout_$eq​(scala.Option<scala.concurrent.duration.FiniteDuration> x$1)
		```
		
		Deprecated.
		- #### applyEvent
		
		
		
		```
		[D](PersistentFSM.html "type parameter in PersistentFSM") applyEvent​([E](PersistentFSM.html "type parameter in PersistentFSM") domainEvent,
		             [D](PersistentFSM.html "type parameter in PersistentFSM") currentData)
		```
		
		Deprecated.
		Override this handler to define the action on Domain Event
		 
		
		Parameters:
		`domainEvent` \- domain event to apply
		`currentData` \- state data of the previous state
		Returns:
		updated state data
		- #### onRecoveryCompleted
		
		
		
		```
		void onRecoveryCompleted()
		```
		
		Deprecated.
		Override this handler to define the action on recovery completion
		- #### saveStateSnapshot
		
		
		
		```
		void saveStateSnapshot()
		```
		
		Deprecated.
		Save the current state as a snapshot
		- #### receiveCommand
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveCommand()
		```
		
		Deprecated.
		After recovery events are handled as in usual FSM actor
		
		Specified by:
		`[receiveCommand](../Eventsourced.html#receiveCommand())` in interface `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`
		- #### receiveRecover
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receiveRecover()
		```
		
		Deprecated.
		Discover the latest recorded state
		
		Specified by:
		`[receiveRecover](../Eventsourced.html#receiveRecover())` in interface `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`
		See Also:
		[`Recovery`](../Recovery.html "class in akka.persistence")
		- #### applyState
		
		
		
		```
		void applyState​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSM.html "type parameter in PersistentFSM"),​[D](PersistentFSM.html "type parameter in PersistentFSM"),​[E](PersistentFSM.html "type parameter in PersistentFSM")> nextState)
		```
		
		Deprecated.
		Persist FSM State and FSM State Data
		
		Specified by:
		`[applyState](PersistentFSMBase.html#applyState(akka.persistence.fsm.PersistentFSM.State))` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](PersistentFSM.html "type parameter in PersistentFSM") extends [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"),​[D](PersistentFSM.html "type parameter in PersistentFSM"),​[E](PersistentFSM.html "type parameter in PersistentFSM")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.SubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Transition.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/LoggingFSM.html
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
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Eventsourced.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceIdentity.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceRecovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistenceStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Recovery.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.$minus$greater$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.CurrentState$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.CurrentState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.FSMState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Failure$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Failure.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.FixedDelayMode$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.FixedRateMode$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.LogEntry$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.LogEntry.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Normal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.NullFunction$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.PersistentFSMSnapshot$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.PersistentFSMSnapshot.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.PersistentFsmEvent.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Reason.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Shutdown$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.SingleMode$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html)*