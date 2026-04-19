---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
title: LoggingPersistentFSM
---

# LoggingPersistentFSM

## Content

Package [akka.persistence.fsm](package-summary.html)
## Interface LoggingPersistentFSM\<S,​D,​E\>

- All Superinterfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[Listeners](../../routing/Listeners.html "interface in akka.routing")`, `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>`

All Known Implementing Classes:
`[AbstractPersistentLoggingFSM](AbstractPersistentLoggingFSM.html "class in akka.persistence.fsm")`

---

```
public interface LoggingPersistentFSM<S,​D,​E>
extends [PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>
```

Deprecated.
Use EventSourcedBehavior. Since 2\.6\.0\.

Stackable trait for [`FSM`](../../actor/FSM.html "interface in akka.actor") which adds a rolling event log and
 debug logging capabilities (analogous to [`LoggingReceive`](../../event/LoggingReceive.html "class in akka.event")).

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `void` | `[advance](#advance())()` | Deprecated. |
	| `void` | `[akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq](#akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq(boolean))​(boolean x$1)` | Deprecated. |
	| `boolean` | `[debugEvent](#debugEvent())()` | Deprecated. |
	| `void` | `[full_$eq](#full_$eq(boolean))​(boolean x$1)` | Deprecated. |
	| `scala.collection.immutable.IndexedSeq<[PersistentFSM.LogEntry](PersistentFSM.LogEntry.html "class in akka.persistence.fsm")<[S](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM"),​[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")>>` | `[getLog](#getLog())()` | Deprecated. Retrieve current rolling log in oldest\-first order. |
	| `int` | `[logDepth](#logDepth())()` | Deprecated. |
	| `void` | `[pos_$eq](#pos_$eq(int))​(int x$1)` | Deprecated. |
	| `void` | `[processEvent](#processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object))​([PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")> event,  java.lang.Object source)` | Deprecated. |
	| `void` | `[super$processEvent](#super$processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object))​([PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")> event,  java.lang.Object source)` | Deprecated. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.routing.[Listeners](../../routing/Listeners.html "interface in akka.routing")
		
		
		`[akka$routing$Listeners$_setter_$listeners_$eq](../../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [gossip](../../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../../routing/Listeners.html#listenerManagement()), [listeners](../../routing/Listeners.html#listeners())`
		- ### Methods inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[$minus$greater](PersistentFSMBase.html#$minus$greater()), [akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$)), [akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$)), [applyState](PersistentFSMBase.html#applyState(akka.persistence.fsm.PersistentFSM.State)), [cancelTimer](PersistentFSMBase.html#cancelTimer(java.lang.String)), [currentState_$eq](PersistentFSMBase.html#currentState_$eq(akka.persistence.fsm.PersistentFSM.State)), [Event](PersistentFSMBase.html#Event()), [generation_$eq](PersistentFSMBase.html#generation_$eq(long)), [handleEvent_$eq](PersistentFSMBase.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](PersistentFSMBase.html#handleTransition(S,S)), [initialize](PersistentFSMBase.html#initialize()), [isStateTimerActive](PersistentFSMBase.html#isStateTimerActive()), [isTimerActive](PersistentFSMBase.html#isTimerActive(java.lang.String)), [logTermination](PersistentFSMBase.html#logTermination(akka.persistence.fsm.PersistentFSM.Reason)), [makeTransition](PersistentFSMBase.html#makeTransition(akka.persistence.fsm.PersistentFSM.State)), [nextState_$eq](PersistentFSMBase.html#nextState_$eq(akka.persistence.fsm.PersistentFSM.State)), [nextStateData](PersistentFSMBase.html#nextStateData()), [onTermination](PersistentFSMBase.html#onTermination(scala.PartialFunction)), [onTransition](PersistentFSMBase.html#onTransition(scala.PartialFunction)), [postStop](PersistentFSMBase.html#postStop()), [processMsg](PersistentFSMBase.html#processMsg(java.lang.Object,java.lang.Object)), [receive](PersistentFSMBase.html#receive()), [register](PersistentFSMBase.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](PersistentFSMBase.html#setStateTimeout(S,scala.Option)), [setTimer](PersistentFSMBase.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](PersistentFSMBase.html#setTimer$default$4()), [startSingleTimer](PersistentFSMBase.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](PersistentFSMBase.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.PersistentFSM.TimerMode)), [startTimerAtFixedRate](PersistentFSMBase.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](PersistentFSMBase.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](PersistentFSMBase.html#startWith(S,D,scala.Option)), [startWith$default$3](PersistentFSMBase.html#startWith$default$3()), [stateData](PersistentFSMBase.html#stateData()), [stateName](PersistentFSMBase.html#stateName()), [stateNames](PersistentFSMBase.html#stateNames()), [StateTimeout](PersistentFSMBase.html#StateTimeout()), [stay](PersistentFSMBase.html#stay()), [stop](PersistentFSMBase.html#stop()), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason)), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason,D)), [StopEvent](PersistentFSMBase.html#StopEvent()), [super$postStop](PersistentFSMBase.html#super$postStop()), [terminate](PersistentFSMBase.html#terminate(akka.persistence.fsm.PersistentFSM.State)), [terminateEvent_$eq](PersistentFSMBase.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](PersistentFSMBase.html#timeoutFuture_$eq(scala.Option)), [total2pf](PersistentFSMBase.html#total2pf(scala.Function2)), [transform](PersistentFSMBase.html#transform(scala.PartialFunction)), [transitionEvent_$eq](PersistentFSMBase.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](PersistentFSMBase.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](PersistentFSMBase.html#when$default$2()), [whenUnhandled](PersistentFSMBase.html#whenUnhandled(scala.PartialFunction))`

- - ### Method Detail
	
	
	
		- #### advance
		
		
		
		```
		void advance()
		```
		
		Deprecated.
		- #### akka$persistence$fsm$LoggingPersistentFSM$\_setter\_$debugEvent\_$eq
		
		
		
		```
		void akka$persistence$fsm$LoggingPersistentFSM$_setter_$debugEvent_$eq​(boolean x$1)
		```
		
		Deprecated.
		- #### debugEvent
		
		
		
		```
		boolean debugEvent()
		```
		
		Deprecated.
		
		Specified by:
		`[debugEvent](PersistentFSMBase.html#debugEvent())` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM"),​[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM"),​[E](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")>`
		- #### full\_$eq
		
		
		
		```
		void full_$eq​(boolean x$1)
		```
		
		Deprecated.
		- #### getLog
		
		
		
		```
		scala.collection.immutable.IndexedSeq<[PersistentFSM.LogEntry](PersistentFSM.LogEntry.html "class in akka.persistence.fsm")<[S](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM"),​[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")>> getLog()
		```
		
		Deprecated.
		Retrieve current rolling log in oldest\-first order. The log is filled with
		 each incoming event before processing by the user supplied state handler.
		 The log entries are lost when this actor is restarted.
		- #### logDepth
		
		
		
		```
		int logDepth()
		```
		
		Deprecated.
		- #### pos\_$eq
		
		
		
		```
		void pos_$eq​(int x$1)
		```
		
		Deprecated.
		- #### processEvent
		
		
		
		```
		void processEvent​([PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")> event,
		                  java.lang.Object source)
		```
		
		Deprecated.
		
		Specified by:
		`[processEvent](PersistentFSMBase.html#processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object))` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM"),​[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM"),​[E](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")>`
		- #### super$processEvent
		
		
		
		```
		void super$processEvent​([PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](LoggingPersistentFSM.html "type parameter in LoggingPersistentFSM")> event,
		                        java.lang.Object source)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/event/LoggingReceive.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.LogEntry.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.TransformHelper.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/routing/Listeners.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html)*