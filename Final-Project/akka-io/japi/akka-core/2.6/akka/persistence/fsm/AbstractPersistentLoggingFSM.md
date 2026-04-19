---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
title: AbstractPersistentLoggingFSM
---

# AbstractPersistentLoggingFSM

## Content

Package [akka.persistence.fsm](package-summary.html)
## Class AbstractPersistentLoggingFSM\<S extends [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"),​D,​E\>

- java.lang.Object
- - [akka.persistence.fsm.AbstractPersistentFSMBase](AbstractPersistentFSMBase.html "class in akka.persistence.fsm")\<S,​D,​E\>
	- - [akka.persistence.fsm.AbstractPersistentFSM](AbstractPersistentFSM.html "class in akka.persistence.fsm")\<S,​D,​E\>
		- - akka.persistence.fsm.AbstractPersistentLoggingFSM\<S,​D,​E\>

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[Stash](../../actor/Stash.html "interface in akka.actor")`, `[StashFactory](../../actor/StashFactory.html "interface in akka.actor")`, `[StashSupport](../../actor/StashSupport.html "interface in akka.actor")`, `[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")`, `[RequiresMessageQueue](../../dispatch/RequiresMessageQueue.html "interface in akka.dispatch")<[DequeBasedMessageQueueSemantics](../../dispatch/DequeBasedMessageQueueSemantics.html "interface in akka.dispatch")>`, `[Eventsourced](../Eventsourced.html "interface in akka.persistence")`, `[LoggingPersistentFSM](LoggingPersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[PersistentFSM](PersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")`, `[PersistenceRecovery](../PersistenceRecovery.html "interface in akka.persistence")`, `[PersistenceStash](../PersistenceStash.html "interface in akka.persistence")`, `[PersistentActor](../PersistentActor.html "interface in akka.persistence")`, `[Snapshotter](../Snapshotter.html "interface in akka.persistence")`, `[Listeners](../../routing/Listeners.html "interface in akka.routing")`

---

```
public abstract class AbstractPersistentLoggingFSM<S extends [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"),​D,​E>
extends [AbstractPersistentFSM](AbstractPersistentFSM.html "class in akka.persistence.fsm")<S,​D,​E>
implements [LoggingPersistentFSM](LoggingPersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>, [PersistentFSM](PersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>
```

Deprecated.
Use EventSourcedBehavior. Since 2\.6\.0\.

Java API: compatible with lambda expressions
 
 Persistent Finite State Machine actor abstract base class with FSM Logging

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.[Eventsourced](../Eventsourced.html "interface in akka.persistence")
		
		
		`[Eventsourced.AsyncHandlerInvocation](../Eventsourced.AsyncHandlerInvocation.html "class in akka.persistence"), [Eventsourced.AsyncHandlerInvocation$](../Eventsourced.AsyncHandlerInvocation$.html "class in akka.persistence"), [Eventsourced.PendingHandlerInvocation](../Eventsourced.PendingHandlerInvocation.html "interface in akka.persistence"), [Eventsourced.RecoveryTick](../Eventsourced.RecoveryTick.html "class in akka.persistence"), [Eventsourced.RecoveryTick$](../Eventsourced.RecoveryTick$.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation](../Eventsourced.StashingHandlerInvocation.html "class in akka.persistence"), [Eventsourced.StashingHandlerInvocation$](../Eventsourced.StashingHandlerInvocation$.html "class in akka.persistence")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.fsm.[PersistentFSM](PersistentFSM.html "interface in akka.persistence.fsm")
		
		
		`[PersistentFSM.$minus$greater$](PersistentFSM.$minus$greater$.html "class in akka.persistence.fsm"), [PersistentFSM.CurrentState](PersistentFSM.CurrentState.html "class in akka.persistence.fsm")<[S](PersistentFSM.CurrentState.html "type parameter in PersistentFSM.CurrentState")>, [PersistentFSM.CurrentState$](PersistentFSM.CurrentState$.html "class in akka.persistence.fsm"), [PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSM.Event.html "type parameter in PersistentFSM.Event")>, [PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm"), [PersistentFSM.Failure](PersistentFSM.Failure.html "class in akka.persistence.fsm"), [PersistentFSM.Failure$](PersistentFSM.Failure$.html "class in akka.persistence.fsm"), [PersistentFSM.FixedDelayMode$](PersistentFSM.FixedDelayMode$.html "class in akka.persistence.fsm"), [PersistentFSM.FixedRateMode$](PersistentFSM.FixedRateMode$.html "class in akka.persistence.fsm"), [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"), [PersistentFSM.LogEntry](PersistentFSM.LogEntry.html "class in akka.persistence.fsm")<[S](PersistentFSM.LogEntry.html "type parameter in PersistentFSM.LogEntry"),​[D](PersistentFSM.LogEntry.html "type parameter in PersistentFSM.LogEntry")>, [PersistentFSM.LogEntry$](PersistentFSM.LogEntry$.html "class in akka.persistence.fsm"), [PersistentFSM.Normal$](PersistentFSM.Normal$.html "class in akka.persistence.fsm"), [PersistentFSM.NullFunction$](PersistentFSM.NullFunction$.html "class in akka.persistence.fsm"), [PersistentFSM.PersistentFsmEvent](PersistentFSM.PersistentFsmEvent.html "interface in akka.persistence.fsm"), [PersistentFSM.PersistentFSMSnapshot](PersistentFSM.PersistentFSMSnapshot.html "class in akka.persistence.fsm")<[D](PersistentFSM.PersistentFSMSnapshot.html "type parameter in PersistentFSM.PersistentFSMSnapshot")>, [PersistentFSM.PersistentFSMSnapshot$](PersistentFSM.PersistentFSMSnapshot$.html "class in akka.persistence.fsm"), [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm"), [PersistentFSM.Shutdown$](PersistentFSM.Shutdown$.html "class in akka.persistence.fsm"), [PersistentFSM.SingleMode$](PersistentFSM.SingleMode$.html "class in akka.persistence.fsm"), [PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSM.State.html "type parameter in PersistentFSM.State"),​[D](PersistentFSM.State.html "type parameter in PersistentFSM.State"),​[E](PersistentFSM.State.html "type parameter in PersistentFSM.State")>, [PersistentFSM.State$](PersistentFSM.State$.html "class in akka.persistence.fsm"), [PersistentFSM.StateChangeEvent](PersistentFSM.StateChangeEvent.html "class in akka.persistence.fsm"), [PersistentFSM.StateChangeEvent$](PersistentFSM.StateChangeEvent$.html "class in akka.persistence.fsm"), [PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm"), [PersistentFSM.StopEvent](PersistentFSM.StopEvent.html "class in akka.persistence.fsm")<[S](PersistentFSM.StopEvent.html "type parameter in PersistentFSM.StopEvent"),​[D](PersistentFSM.StopEvent.html "type parameter in PersistentFSM.StopEvent")>, [PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm"), [PersistentFSM.SubscribeTransitionCallBack](PersistentFSM.SubscribeTransitionCallBack.html "class in akka.persistence.fsm"), [PersistentFSM.SubscribeTransitionCallBack$](PersistentFSM.SubscribeTransitionCallBack$.html "class in akka.persistence.fsm"), [PersistentFSM.TimeoutMarker](PersistentFSM.TimeoutMarker.html "class in akka.persistence.fsm"), [PersistentFSM.TimeoutMarker$](PersistentFSM.TimeoutMarker$.html "class in akka.persistence.fsm"), [PersistentFSM.Timer](PersistentFSM.Timer.html "class in akka.persistence.fsm"), [PersistentFSM.Timer$](PersistentFSM.Timer$.html "class in akka.persistence.fsm"), [PersistentFSM.TimerMode](PersistentFSM.TimerMode.html "interface in akka.persistence.fsm"), [PersistentFSM.Transition](PersistentFSM.Transition.html "class in akka.persistence.fsm")<[S](PersistentFSM.Transition.html "type parameter in PersistentFSM.Transition")>, [PersistentFSM.Transition$](PersistentFSM.Transition$.html "class in akka.persistence.fsm"), [PersistentFSM.UnsubscribeTransitionCallBack](PersistentFSM.UnsubscribeTransitionCallBack.html "class in akka.persistence.fsm"), [PersistentFSM.UnsubscribeTransitionCallBack$](PersistentFSM.UnsubscribeTransitionCallBack$.html "class in akka.persistence.fsm")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractPersistentLoggingFSM](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `protected void` | `[akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq](#akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq(boolean))​(boolean x$1)` | Deprecated. |
	
	
		- ### Methods inherited from class akka.persistence.fsm.[AbstractPersistentFSM](AbstractPersistentFSM.html "class in akka.persistence.fsm")
		
		
		`[akka$actor$StashSupport$_setter_$mailbox_$eq](AbstractPersistentFSM.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq](AbstractPersistentFSM.html#akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq(scala.reflect.ClassTag)), [domainEventClass](AbstractPersistentFSM.html#domainEventClass()), [domainEventClassTag](AbstractPersistentFSM.html#domainEventClassTag()), [domainEventTag](AbstractPersistentFSM.html#domainEventTag()), [exec](AbstractPersistentFSM.html#exec(java.util.function.Consumer)), [journal](AbstractPersistentFSM.html#journal()), [postStop](AbstractPersistentFSM.html#postStop()), [receive](AbstractPersistentFSM.html#receive()), [snapshotStore](AbstractPersistentFSM.html#snapshotStore()), [statesMap](AbstractPersistentFSM.html#statesMap())`
		- ### Methods inherited from class akka.persistence.fsm.[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html "class in akka.persistence.fsm")
		
		
		`[$minus$greater](AbstractPersistentFSMBase.html#$minus$greater()), [akka$actor$Actor$_setter_$context_$eq](AbstractPersistentFSMBase.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](AbstractPersistentFSMBase.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](AbstractPersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](AbstractPersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](AbstractPersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$)), [akka$routing$Listeners$_setter_$listeners_$eq](AbstractPersistentFSMBase.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [context](AbstractPersistentFSMBase.html#context()), [Event](AbstractPersistentFSMBase.html#Event()), [getContext](AbstractPersistentFSMBase.html#getContext()), [getSelf](AbstractPersistentFSMBase.html#getSelf()), [getSender](AbstractPersistentFSMBase.html#getSender()), [goTo](AbstractPersistentFSMBase.html#goTo(S)), [listeners](AbstractPersistentFSMBase.html#listeners()), [matchAnyEvent](AbstractPersistentFSMBase.html#matchAnyEvent(akka.japi.pf.FI.Apply2)), [matchData](AbstractPersistentFSMBase.html#matchData(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply)), [matchData](AbstractPersistentFSMBase.html#matchData(java.lang.Class,akka.japi.pf.FI.UnitApply)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(java.lang.Class,akka.japi.pf.FI.Apply2)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(java.lang.Class,java.lang.Class,akka.japi.pf.FI.Apply2)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(java.lang.Class,java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(java.util.List,akka.japi.pf.FI.Apply2)), [matchEvent](AbstractPersistentFSMBase.html#matchEvent(java.util.List,java.lang.Class,akka.japi.pf.FI.Apply2)), [matchEventEquals](AbstractPersistentFSMBase.html#matchEventEquals(Ev,akka.japi.pf.FI.Apply2)), [matchEventEquals](AbstractPersistentFSMBase.html#matchEventEquals(Ev,java.lang.Class,akka.japi.pf.FI.Apply2)), [matchState](AbstractPersistentFSMBase.html#matchState(S,S,akka.japi.pf.FI.UnitApply2)), [matchState](AbstractPersistentFSMBase.html#matchState(S,S,akka.japi.pf.FI.UnitApplyVoid)), [matchStop](AbstractPersistentFSMBase.html#matchStop(akka.persistence.fsm.PersistentFSM.Reason,akka.japi.pf.FI.UnitApply2)), [matchStop](AbstractPersistentFSMBase.html#matchStop(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply3)), [matchStop](AbstractPersistentFSMBase.html#matchStop(java.lang.Class,akka.japi.pf.FI.UnitApply3)), [Normal](AbstractPersistentFSMBase.html#Normal()), [NullFunction](AbstractPersistentFSMBase.html#NullFunction()), [onTermination](AbstractPersistentFSMBase.html#onTermination(akka.persistence.fsm.japi.pf.FSMStopBuilder)), [onTransition](AbstractPersistentFSMBase.html#onTransition(akka.japi.pf.FI.UnitApply2)), [onTransition](AbstractPersistentFSMBase.html#onTransition(akka.japi.pf.FSMTransitionHandlerBuilder)), [self](AbstractPersistentFSMBase.html#self()), [setTimer](AbstractPersistentFSMBase.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [Shutdown](AbstractPersistentFSMBase.html#Shutdown()), [startSingleTimer](AbstractPersistentFSMBase.html#startSingleTimer(java.lang.String,java.lang.Object,java.time.Duration)), [startTimerAtFixedRate](AbstractPersistentFSMBase.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,java.time.Duration)), [startTimerWithFixedDelay](AbstractPersistentFSMBase.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,java.time.Duration)), [startWith](AbstractPersistentFSMBase.html#startWith(S,D)), [startWith](AbstractPersistentFSMBase.html#startWith(S,D,scala.concurrent.duration.FiniteDuration)), [StateTimeout](AbstractPersistentFSMBase.html#StateTimeout()), [StopEvent](AbstractPersistentFSMBase.html#StopEvent()), [when](AbstractPersistentFSMBase.html#when(S,akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder)), [when](AbstractPersistentFSMBase.html#when(S,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder)), [when](AbstractPersistentFSMBase.html#when(S,scala.PartialFunction)), [whenUnhandled](AbstractPersistentFSMBase.html#whenUnhandled(akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy())`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.persistence.[Eventsourced](../Eventsourced.html "interface in akka.persistence")
		
		
		`[_lastSequenceNr_$eq](../Eventsourced.html#_lastSequenceNr_$eq(long)), [aroundPostRestart](../Eventsourced.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../Eventsourced.html#aroundPostStop()), [aroundPreRestart](../Eventsourced.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../Eventsourced.html#aroundPreStart()), [aroundReceive](../Eventsourced.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [batchAtomicWrite](../Eventsourced.html#batchAtomicWrite(akka.persistence.AtomicWrite)), [changeState](../Eventsourced.html#changeState(akka.persistence.Eventsourced.State)), [currentState_$eq](../Eventsourced.html#currentState_$eq(akka.persistence.Eventsourced.State)), [deleteMessages](../Eventsourced.html#deleteMessages(long)), [eventBatch_$eq](../Eventsourced.html#eventBatch_$eq(scala.collection.immutable.List)), [flushBatch](../Eventsourced.html#flushBatch()), [flushJournalBatch](../Eventsourced.html#flushJournalBatch()), [internalDefer](../Eventsourced.html#internalDefer(A,scala.Function1)), [internalDeferAsync](../Eventsourced.html#internalDeferAsync(A,scala.Function1)), [internalDeleteMessagesBeforeSnapshot](../Eventsourced.html#internalDeleteMessagesBeforeSnapshot(akka.persistence.SaveSnapshotSuccess,int,int)), [internalPersist](../Eventsourced.html#internalPersist(A,scala.Function1)), [internalPersistAll](../Eventsourced.html#internalPersistAll(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAllAsync](../Eventsourced.html#internalPersistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [internalPersistAsync](../Eventsourced.html#internalPersistAsync(A,scala.Function1)), [journal](../Eventsourced.html#journal()), [journalBatch_$eq](../Eventsourced.html#journalBatch_$eq(scala.collection.immutable.Vector)), [lastSequenceNr](../Eventsourced.html#lastSequenceNr()), [log](../Eventsourced.html#log()), [nextSequenceNr](../Eventsourced.html#nextSequenceNr()), [onPersistFailure](../Eventsourced.html#onPersistFailure(java.lang.Throwable,java.lang.Object,long)), [onPersistRejected](../Eventsourced.html#onPersistRejected(java.lang.Throwable,java.lang.Object,long)), [onRecoveryFailure](../Eventsourced.html#onRecoveryFailure(java.lang.Throwable,scala.Option)), [onReplaySuccess](../Eventsourced.html#onReplaySuccess()), [peekApplyHandler](../Eventsourced.html#peekApplyHandler(java.lang.Object)), [pendingStashingPersistInvocations_$eq](../Eventsourced.html#pendingStashingPersistInvocations_$eq(long)), [recovering](../Eventsourced.html#recovering(scala.PartialFunction,scala.concurrent.duration.FiniteDuration)), [recoveryFinished](../Eventsourced.html#recoveryFinished()), [recoveryRunning](../Eventsourced.html#recoveryRunning()), [recoveryStarted](../Eventsourced.html#recoveryStarted(long,scala.concurrent.duration.FiniteDuration)), [requestRecoveryPermit](../Eventsourced.html#requestRecoveryPermit()), [sendBatchedEventsToJournal](../Eventsourced.html#sendBatchedEventsToJournal(scala.collection.immutable.Vector)), [sequenceNr_$eq](../Eventsourced.html#sequenceNr_$eq(long)), [setLastSequenceNr](../Eventsourced.html#setLastSequenceNr(long)), [snapshotSequenceNr](../Eventsourced.html#snapshotSequenceNr()), [snapshotStore](../Eventsourced.html#snapshotStore()), [snapshotterId](../Eventsourced.html#snapshotterId()), [startRecovery](../Eventsourced.html#startRecovery(akka.persistence.Recovery)), [stash](../Eventsourced.html#stash()), [stashInternally](../Eventsourced.html#stashInternally(java.lang.Object)), [super$aroundPostRestart](../Eventsourced.html#super$aroundPostRestart(java.lang.Throwable)), [super$aroundPostStop](../Eventsourced.html#super$aroundPostStop()), [super$aroundPreRestart](../Eventsourced.html#super$aroundPreRestart(java.lang.Throwable,scala.Option)), [super$aroundPreStart](../Eventsourced.html#super$aroundPreStart()), [super$aroundReceive](../Eventsourced.html#super$aroundReceive(scala.PartialFunction,java.lang.Object)), [super$stash](../Eventsourced.html#super$stash()), [super$unhandled](../Eventsourced.html#super$unhandled(java.lang.Object)), [unhandled](../Eventsourced.html#unhandled(java.lang.Object)), [unstashAll](../Eventsourced.html#unstashAll()), [unstashInternally](../Eventsourced.html#unstashInternally(boolean)), [updateLastSequenceNr](../Eventsourced.html#updateLastSequenceNr(akka.persistence.PersistentRepr)), [waitingRecoveryPermit](../Eventsourced.html#waitingRecoveryPermit(akka.persistence.Recovery)), [writeEventFailed](../Eventsourced.html#writeEventFailed(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventRejected](../Eventsourced.html#writeEventRejected(akka.persistence.PersistentRepr,java.lang.Throwable)), [writeEventSucceeded](../Eventsourced.html#writeEventSucceeded(akka.persistence.PersistentRepr)), [writeInProgress_$eq](../Eventsourced.html#writeInProgress_$eq(boolean))`
		- ### Methods inherited from interface akka.routing.[Listeners](../../routing/Listeners.html "interface in akka.routing")
		
		
		`[akka$routing$Listeners$_setter_$listeners_$eq](../../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [gossip](../../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../../routing/Listeners.html#listenerManagement()), [listeners](../../routing/Listeners.html#listeners())`
		- ### Methods inherited from interface akka.persistence.fsm.[LoggingPersistentFSM](LoggingPersistentFSM.html "interface in akka.persistence.fsm")
		
		
		`[advance](LoggingPersistentFSM.html#advance()), [full_$eq](LoggingPersistentFSM.html#full_$eq(boolean)), [getLog](LoggingPersistentFSM.html#getLog()), [logDepth](LoggingPersistentFSM.html#logDepth()), [pos_$eq](LoggingPersistentFSM.html#pos_$eq(int)), [processEvent](LoggingPersistentFSM.html#processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object)), [super$processEvent](LoggingPersistentFSM.html#super$processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object))`
		- ### Methods inherited from interface akka.persistence.[PersistenceIdentity](../PersistenceIdentity.html "interface in akka.persistence")
		
		
		`[journalPluginId](../PersistenceIdentity.html#journalPluginId()), [persistenceId](../PersistenceIdentity.html#persistenceId()), [snapshotPluginId](../PersistenceIdentity.html#snapshotPluginId())`
		- ### Methods inherited from interface akka.persistence.[PersistenceRecovery](../PersistenceRecovery.html "interface in akka.persistence")
		
		
		`[recovery](../PersistenceRecovery.html#recovery())`
		- ### Methods inherited from interface akka.persistence.[PersistenceStash](../PersistenceStash.html "interface in akka.persistence")
		
		
		`[internalStashOverflowStrategy](../PersistenceStash.html#internalStashOverflowStrategy())`
		- ### Methods inherited from interface akka.persistence.[PersistentActor](../PersistentActor.html "interface in akka.persistence")
		
		
		`[defer](../PersistentActor.html#defer(A,scala.Function1)), [deferAsync](../PersistentActor.html#deferAsync(A,scala.Function1)), [persist](../PersistentActor.html#persist(A,scala.Function1)), [persistAll](../PersistentActor.html#persistAll(scala.collection.immutable.Seq,scala.Function1)), [persistAllAsync](../PersistentActor.html#persistAllAsync(scala.collection.immutable.Seq,scala.Function1)), [persistAsync](../PersistentActor.html#persistAsync(A,scala.Function1)), [receive](../PersistentActor.html#receive())`
		- ### Methods inherited from interface akka.persistence.fsm.[PersistentFSM](PersistentFSM.html "interface in akka.persistence.fsm")
		
		
		`[akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq](PersistentFSM.html#akka$persistence$fsm$PersistentFSM$_setter_$domainEventTag_$eq(scala.reflect.ClassTag)), [applyEvent](PersistentFSM.html#applyEvent(E,D)), [applyState](PersistentFSM.html#applyState(akka.persistence.fsm.PersistentFSM.State)), [currentStateTimeout_$eq](PersistentFSM.html#currentStateTimeout_$eq(scala.Option)), [domainEventClassTag](PersistentFSM.html#domainEventClassTag()), [domainEventTag](PersistentFSM.html#domainEventTag()), [onRecoveryCompleted](PersistentFSM.html#onRecoveryCompleted()), [receiveCommand](PersistentFSM.html#receiveCommand()), [receiveRecover](PersistentFSM.html#receiveRecover()), [saveStateSnapshot](PersistentFSM.html#saveStateSnapshot()), [statesMap](PersistentFSM.html#statesMap()), [super$applyState](PersistentFSM.html#super$applyState(akka.persistence.fsm.PersistentFSM.State))`
		- ### Methods inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[$minus$greater](PersistentFSMBase.html#$minus$greater()), [akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$)), [cancelTimer](PersistentFSMBase.html#cancelTimer(java.lang.String)), [currentState_$eq](PersistentFSMBase.html#currentState_$eq(akka.persistence.fsm.PersistentFSM.State)), [Event](PersistentFSMBase.html#Event()), [generation_$eq](PersistentFSMBase.html#generation_$eq(long)), [handleEvent_$eq](PersistentFSMBase.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](PersistentFSMBase.html#handleTransition(S,S)), [initialize](PersistentFSMBase.html#initialize()), [isStateTimerActive](PersistentFSMBase.html#isStateTimerActive()), [isTimerActive](PersistentFSMBase.html#isTimerActive(java.lang.String)), [logTermination](PersistentFSMBase.html#logTermination(akka.persistence.fsm.PersistentFSM.Reason)), [makeTransition](PersistentFSMBase.html#makeTransition(akka.persistence.fsm.PersistentFSM.State)), [nextState_$eq](PersistentFSMBase.html#nextState_$eq(akka.persistence.fsm.PersistentFSM.State)), [nextStateData](PersistentFSMBase.html#nextStateData()), [onTermination](PersistentFSMBase.html#onTermination(scala.PartialFunction)), [onTransition](PersistentFSMBase.html#onTransition(scala.PartialFunction)), [postStop](PersistentFSMBase.html#postStop()), [processMsg](PersistentFSMBase.html#processMsg(java.lang.Object,java.lang.Object)), [receive](PersistentFSMBase.html#receive()), [register](PersistentFSMBase.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](PersistentFSMBase.html#setStateTimeout(S,scala.Option)), [setTimer](PersistentFSMBase.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](PersistentFSMBase.html#setTimer$default$4()), [startSingleTimer](PersistentFSMBase.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](PersistentFSMBase.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.PersistentFSM.TimerMode)), [startTimerAtFixedRate](PersistentFSMBase.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](PersistentFSMBase.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](PersistentFSMBase.html#startWith(S,D,scala.Option)), [startWith$default$3](PersistentFSMBase.html#startWith$default$3()), [stateData](PersistentFSMBase.html#stateData()), [stateName](PersistentFSMBase.html#stateName()), [stateNames](PersistentFSMBase.html#stateNames()), [StateTimeout](PersistentFSMBase.html#StateTimeout()), [stay](PersistentFSMBase.html#stay()), [stop](PersistentFSMBase.html#stop()), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason)), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason,D)), [StopEvent](PersistentFSMBase.html#StopEvent()), [super$postStop](PersistentFSMBase.html#super$postStop()), [terminate](PersistentFSMBase.html#terminate(akka.persistence.fsm.PersistentFSM.State)), [terminateEvent_$eq](PersistentFSMBase.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](PersistentFSMBase.html#timeoutFuture_$eq(scala.Option)), [total2pf](PersistentFSMBase.html#total2pf(scala.Function2)), [transform](PersistentFSMBase.html#transform(scala.PartialFunction)), [transitionEvent_$eq](PersistentFSMBase.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](PersistentFSMBase.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](PersistentFSMBase.html#when$default$2()), [whenUnhandled](PersistentFSMBase.html#whenUnhandled(scala.PartialFunction))`
		- ### Methods inherited from interface akka.persistence.[Snapshotter](../Snapshotter.html "interface in akka.persistence")
		
		
		`[deleteSnapshot](../Snapshotter.html#deleteSnapshot(long)), [deleteSnapshots](../Snapshotter.html#deleteSnapshots(akka.persistence.SnapshotSelectionCriteria)), [loadSnapshot](../Snapshotter.html#loadSnapshot(java.lang.String,akka.persistence.SnapshotSelectionCriteria,long)), [saveSnapshot](../Snapshotter.html#saveSnapshot(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[StashFactory](../../actor/StashFactory.html "interface in akka.actor")
		
		
		`[createStash](../../actor/StashFactory.html#createStash(akka.actor.ActorContext,akka.actor.ActorRef))`
		- ### Methods inherited from interface akka.actor.[StashSupport](../../actor/StashSupport.html "interface in akka.actor")
		
		
		`[actorCell](../../actor/StashSupport.html#actorCell()), [akka$actor$StashSupport$_setter_$mailbox_$eq](../../actor/StashSupport.html#akka$actor$StashSupport$_setter_$mailbox_$eq(akka.dispatch.DequeBasedMessageQueueSemantics)), [clearStash](../../actor/StashSupport.html#clearStash()), [context](../../actor/StashSupport.html#context()), [enqueueFirst](../../actor/StashSupport.html#enqueueFirst(akka.dispatch.Envelope)), [mailbox](../../actor/StashSupport.html#mailbox()), [prepend](../../actor/StashSupport.html#prepend(scala.collection.immutable.Seq)), [self](../../actor/StashSupport.html#self()), [theStash_$eq](../../actor/StashSupport.html#theStash_$eq(scala.collection.immutable.Vector)), [unstash](../../actor/StashSupport.html#unstash()), [unstashAll](../../actor/StashSupport.html#unstashAll(scala.Function1))`
		- ### Methods inherited from interface akka.actor.[UnrestrictedStash](../../actor/UnrestrictedStash.html "interface in akka.actor")
		
		
		`[postStop](../../actor/UnrestrictedStash.html#postStop()), [preRestart](../../actor/UnrestrictedStash.html#preRestart(java.lang.Throwable,scala.Option)), [super$postStop](../../actor/UnrestrictedStash.html#super$postStop()), [super$preRestart](../../actor/UnrestrictedStash.html#super$preRestart(java.lang.Throwable,scala.Option))`

- - ### Constructor Detail
	
	
	
		- #### AbstractPersistentLoggingFSM
		
		
		
		```
		public AbstractPersistentLoggingFSM()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### akka$persistence$fsm$LoggingPersistentFSM$\_setter\_$debugEvent\_$eq
		
		
		
		```
		protected void akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq​(boolean x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq](LoggingPersistentFSM.html#akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq(boolean))` in interface `[LoggingPersistentFSM](LoggingPersistentFSM.html "interface in akka.persistence.fsm")<[S](AbstractPersistentLoggingFSM.html "type parameter in AbstractPersistentLoggingFSM") extends [PersistentFSM.FSMState](PersistentFSM.FSMState.html "interface in akka.persistence.fsm"),​[D](AbstractPersistentLoggingFSM.html "type parameter in AbstractPersistentLoggingFSM"),​[E](AbstractPersistentLoggingFSM.html "type parameter in AbstractPersistentLoggingFSM")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
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
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/Snapshotter.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
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
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.State$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.State.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.StateChangeEvent$.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html)*