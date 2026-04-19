---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:49:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/LoggingFSM.html
title: LoggingFSM
---

# LoggingFSM

## Content

Package [akka.actor](package-summary.html)
## Interface LoggingFSM\<S,​D\>

- All Superinterfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[ActorLogging](ActorLogging.html "interface in akka.actor")`, `[FSM](FSM.html "interface in akka.actor")<S,​D>`, `[Listeners](../routing/Listeners.html "interface in akka.routing")`

All Known Implementing Classes:
`[AbstractLoggingFSM](AbstractLoggingFSM.html "class in akka.actor")`

---

```
public interface LoggingFSM<S,​D>
extends [FSM](FSM.html "interface in akka.actor")<S,​D>
```

Stackable trait for [`FSM`](FSM.html "interface in akka.actor") which adds a rolling event log and
 debug logging capabilities (analogous to [`LoggingReceive`](../event/LoggingReceive.html "class in akka.event")).
 

Since:
1\.2

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[FSM](FSM.html "interface in akka.actor")
		
		
		`[FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor"), [FSM.CurrentState](FSM.CurrentState.html "class in akka.actor")<[S](FSM.CurrentState.html "type parameter in FSM.CurrentState")>, [FSM.CurrentState$](FSM.CurrentState$.html "class in akka.actor"), [FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.Event.html "type parameter in FSM.Event")>, [FSM.Event$](FSM.Event$.html "class in akka.actor"), [FSM.Failure](FSM.Failure.html "class in akka.actor"), [FSM.Failure$](FSM.Failure$.html "class in akka.actor"), [FSM.FixedDelayMode$](FSM.FixedDelayMode$.html "class in akka.actor"), [FSM.FixedRateMode$](FSM.FixedRateMode$.html "class in akka.actor"), [FSM.LogEntry](FSM.LogEntry.html "class in akka.actor")<[S](FSM.LogEntry.html "type parameter in FSM.LogEntry"),​[D](FSM.LogEntry.html "type parameter in FSM.LogEntry")>, [FSM.LogEntry$](FSM.LogEntry$.html "class in akka.actor"), [FSM.Normal$](FSM.Normal$.html "class in akka.actor"), [FSM.NullFunction$](FSM.NullFunction$.html "class in akka.actor"), [FSM.Reason](FSM.Reason.html "interface in akka.actor"), [FSM.Shutdown$](FSM.Shutdown$.html "class in akka.actor"), [FSM.SilentState](FSM.SilentState.html "class in akka.actor")<[S](FSM.SilentState.html "type parameter in FSM.SilentState"),​[D](FSM.SilentState.html "type parameter in FSM.SilentState")>, [FSM.SingleMode$](FSM.SingleMode$.html "class in akka.actor"), [FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.State.html "type parameter in FSM.State"),​[D](FSM.State.html "type parameter in FSM.State")>, [FSM.State$](FSM.State$.html "class in akka.actor"), [FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor"), [FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.StopEvent.html "type parameter in FSM.StopEvent"),​[D](FSM.StopEvent.html "type parameter in FSM.StopEvent")>, [FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor"), [FSM.SubscribeTransitionCallBack](FSM.SubscribeTransitionCallBack.html "class in akka.actor"), [FSM.SubscribeTransitionCallBack$](FSM.SubscribeTransitionCallBack$.html "class in akka.actor"), [FSM.Timer](FSM.Timer.html "class in akka.actor"), [FSM.Timer$](FSM.Timer$.html "class in akka.actor"), [FSM.TimerMode](FSM.TimerMode.html "interface in akka.actor"), [FSM.TransformHelper](FSM.TransformHelper.html "class in akka.actor"), [FSM.Transition](FSM.Transition.html "class in akka.actor")<[S](FSM.Transition.html "type parameter in FSM.Transition")>, [FSM.Transition$](FSM.Transition$.html "class in akka.actor"), [FSM.UnsubscribeTransitionCallBack](FSM.UnsubscribeTransitionCallBack.html "class in akka.actor"), [FSM.UnsubscribeTransitionCallBack$](FSM.UnsubscribeTransitionCallBack$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `void` | `[advance](#advance())()` |  |
	| `void` | `[akka$actor$LoggingFSM$_setter_$debugEvent_$eq](#akka$actor$LoggingFSM$_setter_$debugEvent_$eq(boolean))​(boolean x$1)` |  |
	| `boolean` | `[debugEvent](#debugEvent())()` |  |
	| `void` | `[full_$eq](#full_$eq(boolean))​(boolean x$1)` |  |
	| `scala.collection.immutable.IndexedSeq<[FSM.LogEntry](FSM.LogEntry.html "class in akka.actor")<[S](LoggingFSM.html "type parameter in LoggingFSM"),​[D](LoggingFSM.html "type parameter in LoggingFSM")>>` | `[getLog](#getLog())()` | Retrieve current rolling log in oldest\-first order. |
	| `int` | `[logDepth](#logDepth())()` |  |
	| `void` | `[pos_$eq](#pos_$eq(int))​(int x$1)` |  |
	| `void` | `[processEvent](#processEvent(akka.actor.FSM.Event,java.lang.Object))​([FSM.Event](FSM.Event.html "class in akka.actor")<[D](LoggingFSM.html "type parameter in LoggingFSM")> event,  java.lang.Object source)` |  |
	| `void` | `[super$processEvent](#super$processEvent(akka.actor.FSM.Event,java.lang.Object))​([FSM.Event](FSM.Event.html "class in akka.actor")<[D](LoggingFSM.html "type parameter in LoggingFSM")> event,  java.lang.Object source)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](Actor.html#preStart()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](ActorLogging.html#log())`
		- ### Methods inherited from interface akka.actor.[FSM](FSM.html "interface in akka.actor")
		
		
		`[$minus$greater](FSM.html#$minus$greater()), [akka$actor$FSM$_setter_$Event_$eq](FSM.html#akka$actor$FSM$_setter_$Event_$eq(akka.actor.FSM.Event$)), [akka$actor$FSM$_setter_$StateTimeout_$eq](FSM.html#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$)), [akka$actor$FSM$_setter_$StopEvent_$eq](FSM.html#akka$actor$FSM$_setter_$StopEvent_$eq(akka.actor.FSM.StopEvent$)), [applyState](FSM.html#applyState(akka.actor.FSM.State)), [cancelTimer](FSM.html#cancelTimer(java.lang.String)), [currentState_$eq](FSM.html#currentState_$eq(akka.actor.FSM.State)), [Event](FSM.html#Event()), [generation_$eq](FSM.html#generation_$eq(long)), [handleEvent_$eq](FSM.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](FSM.html#handleTransition(S,S)), [initialize](FSM.html#initialize()), [isStateTimerActive](FSM.html#isStateTimerActive()), [isTimerActive](FSM.html#isTimerActive(java.lang.String)), [logTermination](FSM.html#logTermination(akka.actor.FSM.Reason)), [makeTransition](FSM.html#makeTransition(akka.actor.FSM.State)), [nextState_$eq](FSM.html#nextState_$eq(akka.actor.FSM.State)), [nextStateData](FSM.html#nextStateData()), [onTermination](FSM.html#onTermination(scala.PartialFunction)), [onTransition](FSM.html#onTransition(scala.PartialFunction)), [postStop](FSM.html#postStop()), [processMsg](FSM.html#processMsg(java.lang.Object,java.lang.Object)), [receive](FSM.html#receive()), [register](FSM.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](FSM.html#setStateTimeout(S,scala.Option)), [setTimer](FSM.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](FSM.html#setTimer$default$4()), [startSingleTimer](FSM.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](FSM.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.actor.FSM.TimerMode)), [startTimerAtFixedRate](FSM.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](FSM.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](FSM.html#startWith(S,D,scala.Option)), [startWith$default$3](FSM.html#startWith$default$3()), [stateData](FSM.html#stateData()), [stateName](FSM.html#stateName()), [StateTimeout](FSM.html#StateTimeout()), [stay](FSM.html#stay()), [stop](FSM.html#stop()), [stop](FSM.html#stop(akka.actor.FSM.Reason)), [stop](FSM.html#stop(akka.actor.FSM.Reason,D)), [StopEvent](FSM.html#StopEvent()), [super$postStop](FSM.html#super$postStop()), [terminate](FSM.html#terminate(akka.actor.FSM.State)), [terminateEvent_$eq](FSM.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](FSM.html#timeoutFuture_$eq(scala.Option)), [total2pf](FSM.html#total2pf(scala.Function2)), [transform](FSM.html#transform(scala.PartialFunction)), [transitionEvent_$eq](FSM.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](FSM.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](FSM.html#when$default$2()), [whenUnhandled](FSM.html#whenUnhandled(scala.PartialFunction))`
		- ### Methods inherited from interface akka.routing.[Listeners](../routing/Listeners.html "interface in akka.routing")
		
		
		`[akka$routing$Listeners$_setter_$listeners_$eq](../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [gossip](../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../routing/Listeners.html#listenerManagement()), [listeners](../routing/Listeners.html#listeners())`

- - ### Method Detail
	
	
	
		- #### advance
		
		
		
		```
		void advance()
		```
		- #### akka$actor$LoggingFSM$\_setter\_$debugEvent\_$eq
		
		
		
		```
		void akka$actor$LoggingFSM$_setter_$debugEvent_$eq​(boolean x$1)
		```
		- #### debugEvent
		
		
		
		```
		boolean debugEvent()
		```
		
		
		Specified by:
		`[debugEvent](FSM.html#debugEvent())` in interface `[FSM](FSM.html "interface in akka.actor")<[S](LoggingFSM.html "type parameter in LoggingFSM"),​[D](LoggingFSM.html "type parameter in LoggingFSM")>`
		- #### full\_$eq
		
		
		
		```
		void full_$eq​(boolean x$1)
		```
		- #### getLog
		
		
		
		```
		scala.collection.immutable.IndexedSeq<[FSM.LogEntry](FSM.LogEntry.html "class in akka.actor")<[S](LoggingFSM.html "type parameter in LoggingFSM"),​[D](LoggingFSM.html "type parameter in LoggingFSM")>> getLog()
		```
		
		Retrieve current rolling log in oldest\-first order. The log is filled with
		 each incoming event before processing by the user supplied state handler.
		 The log entries are lost when this actor is restarted.
		- #### logDepth
		
		
		
		```
		int logDepth()
		```
		- #### pos\_$eq
		
		
		
		```
		void pos_$eq​(int x$1)
		```
		- #### processEvent
		
		
		
		```
		void processEvent​([FSM.Event](FSM.Event.html "class in akka.actor")<[D](LoggingFSM.html "type parameter in LoggingFSM")> event,
		                  java.lang.Object source)
		```
		
		
		Specified by:
		`[processEvent](FSM.html#processEvent(akka.actor.FSM.Event,java.lang.Object))` in interface `[FSM](FSM.html "interface in akka.actor")<[S](LoggingFSM.html "type parameter in LoggingFSM"),​[D](LoggingFSM.html "type parameter in LoggingFSM")>`
		- #### super$processEvent
		
		
		
		```
		void super$processEvent​([FSM.Event](FSM.Event.html "class in akka.actor")<[D](LoggingFSM.html "type parameter in LoggingFSM")> event,
		                        java.lang.Object source)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.html
- https://doc.akka.io/japi/akka/current/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.$minus$greater$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.CurrentState$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.CurrentState.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Event$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Event.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Failure$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Failure.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.FixedDelayMode$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.FixedRateMode$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.LogEntry$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.LogEntry.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Normal$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.NullFunction$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Reason.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Shutdown$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.SilentState.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.SingleMode$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.State$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.State.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.StateTimeout$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.StopEvent$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.StopEvent.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.SubscribeTransitionCallBack$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.SubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Timer$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Timer.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.TimerMode.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.TransformHelper.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Transition$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.Transition.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.UnsubscribeTransitionCallBack$.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.UnsubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka/current/akka/actor/FSM.html
- https://doc.akka.io/japi/akka/current/akka/actor/LoggingFSM.html
- https://doc.akka.io/japi/akka/current/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/event/LoggingReceive.html
- https://doc.akka.io/japi/akka/current/akka/routing/Listeners.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/LoggingFSM.html](https://doc.akka.io/japi/akka/current/akka/actor/LoggingFSM.html)*