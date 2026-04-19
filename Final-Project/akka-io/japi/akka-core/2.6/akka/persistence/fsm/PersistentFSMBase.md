---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:33Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html
title: PersistentFSMBase
---

# PersistentFSMBase

## Content

Package [akka.persistence.fsm](package-summary.html)
## Interface PersistentFSMBase\<S,​D,​E\>

- All Superinterfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[Listeners](../../routing/Listeners.html "interface in akka.routing")`

All Known Subinterfaces:
`[LoggingPersistentFSM](LoggingPersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[PersistentFSM](PersistentFSM.html "interface in akka.persistence.fsm")<S,​D,​E>`

All Known Implementing Classes:
`[AbstractPersistentFSM](AbstractPersistentFSM.html "class in akka.persistence.fsm")`, `[AbstractPersistentFSMBase](AbstractPersistentFSMBase.html "class in akka.persistence.fsm")`, `[AbstractPersistentLoggingFSM](AbstractPersistentLoggingFSM.html "class in akka.persistence.fsm")`

---

```
public interface PersistentFSMBase<S,​D,​E>
extends [Actor](../../actor/Actor.html "interface in akka.actor"), [Listeners](../../routing/Listeners.html "interface in akka.routing"), [ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
```

Deprecated.
Use EventSourcedBehavior. Since 2\.6\.0\.

Finite State Machine actor trait. Use as follows:
 

```

   object A {
     trait State
     case class One extends State
     case class Two extends State

     case class Data(i : Int)
   }

   class A extends Actor with FSM[A.State, A.Data] {
     import A._

     startWith(One, Data(42))
     when(One) {
         case Event(SomeMsg, Data(x)) => ...
         case Event(SomeOtherMsg, _) => ... // convenience when data not needed
     }
     when(Two, stateTimeout = 5 seconds) { ... }
     initialize()
   }
 
```

 Within the partial function the following values are returned for effecting
 state transitions:
 

 \- `stay` for staying in the same state
 \- `stay using Data(...)` for staying in the same state, but with
 different data
 \- `stay forMax 5.millis` for staying with a state timeout; can be
 combined with `using`
 \- `goto(...)` for changing into a different state; also supports
 `using` and `forMax`
 \- `stop` for terminating this FSM actor
 

 Each of the above also supports the method `replying(AnyRef)` for
 sending a reply before changing state.
 

 While changing state, custom handlers may be invoked which are registered
 using `onTransition`. This is meant to enable concentrating
 different concerns in different places; you may choose to use
 `when` for describing the properties of a state, including of
 course initiating transitions, but you can describe the transitions using
 `onTransition` to avoid having to duplicate that code among
 multiple paths which lead to a transition:
 

```

 onTransition {
   case Active -> _ => cancelTimer("activeTimer")
 }
 
```

 Multiple such blocks are supported and all of them will be called, not only
 the first matching one.
 

 Another feature is that other actors may subscribe for transition events by
 sending a `SubscribeTransitionCallback` message to this actor.
 Stopping a listener without unregistering will not remove the listener from the
 subscription list; use `UnsubscribeTransitionCallback` before stopping
 the listener.
 

 State timeouts set an upper bound to the time which may pass before another
 message is received in the current state. If no external message is
 available, then upon expiry of the timeout a StateTimeout message is sent.
 Note that this message will only be received in the state for which the
 timeout was set and that any message received will cancel the timeout
 (possibly to be started again by the next transition).
 

 Another feature is the ability to install and cancel single\-shot as well as
 repeated timers which arrange for the sending of a user\-specified message:
 

```

   startTimerWithFixedDelay("tock", TockMsg, 1 second) // repeating
   startSingleTimer("lifetime", TerminateMsg, 1 hour) // single-shot
   cancelTimer("tock")
   isTimerActive("tock")
 
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm")` | Deprecated. |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[PersistentFSM.$minus$greater$](PersistentFSM.$minus$greater$.html "class in akka.persistence.fsm")` | `[$minus$greater](#$minus$greater())()` | Deprecated. This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `void` | `[akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$))​([PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm") x$1)` | Deprecated. |
	| `void` | `[akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$))​([PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm") x$1)` | Deprecated. This case object is received in case of a state timeout. |
	| `void` | `[akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$))​([PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm") x$1)` | Deprecated. |
	| `void` | `[applyState](#applyState(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> nextState)` | Deprecated. |
	| `void` | `[cancelTimer](#cancelTimer(java.lang.String))​(java.lang.String name)` | Deprecated. |
	| `void` | `[currentState_$eq](#currentState_$eq(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> x$1)` | Deprecated. |
	| `boolean` | `[debugEvent](#debugEvent())()` | Deprecated. |
	| `[PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm")` | `[Event](#Event())()` | Deprecated. |
	| `void` | `[generation_$eq](#generation_$eq(long))​(long x$1)` | Deprecated. |
	| `void` | `[handleEvent_$eq](#handleEvent_$eq(scala.PartialFunction))​(scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> x$1)` | Deprecated. |
	| `void` | `[handleTransition](#handleTransition(S,S))​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") prev,  [S](PersistentFSMBase.html "type parameter in PersistentFSMBase") next)` | Deprecated. |
	| `void` | `[initialize](#initialize())()` | Deprecated. Removed from API, called internally. |
	| `boolean` | `[isStateTimerActive](#isStateTimerActive())()` | Deprecated. |
	| `boolean` | `[isTimerActive](#isTimerActive(java.lang.String))​(java.lang.String name)` | Deprecated. |
	| `void` | `[logTermination](#logTermination(akka.persistence.fsm.PersistentFSM.Reason))​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason)` | Deprecated. By default [`PersistentFSM.Failure`](PersistentFSM.Failure.html "class in akka.persistence.fsm") is logged at error level and other reason  types are not logged. |
	| `void` | `[makeTransition](#makeTransition(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> nextState)` | Deprecated. |
	| `void` | `[nextState_$eq](#nextState_$eq(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> x$1)` | Deprecated. |
	| `[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")` | `[nextStateData](#nextStateData())()` | Deprecated. |
	| `void` | `[onTermination](#onTermination(scala.PartialFunction))​(scala.PartialFunction<[PersistentFSM.StopEvent](PersistentFSM.StopEvent.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> terminationHandler)` | Deprecated. |
	| `void` | `[onTransition](#onTransition(scala.PartialFunction))​(scala.PartialFunction<scala.Tuple2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> transitionHandler)` | Deprecated. |
	| `void` | `[postStop](#postStop())()` | Deprecated. User overridable callback. |
	| `void` | `[processEvent](#processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object))​([PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")> event,  java.lang.Object source)` | Deprecated. |
	| `void` | `[processMsg](#processMsg(java.lang.Object,java.lang.Object))​(java.lang.Object value,  java.lang.Object source)` | Deprecated. |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Deprecated. Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[register](#register(S,scala.PartialFunction,scala.Option))​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") name,  scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> function,  scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` | Deprecated. |
	| `void` | `[setStateTimeout](#setStateTimeout(S,scala.Option))​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") state,  scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` | Deprecated. |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout,  boolean repeat)` | Deprecated. Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. |
	| `boolean` | `[setTimer$default$4](#setTimer$default$4())()` | Deprecated. |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` | Deprecated. |
	| `void` | `[startTimer](#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.PersistentFSM.TimerMode))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout,  [PersistentFSM.TimerMode](PersistentFSM.TimerMode.html "interface in akka.persistence.fsm") mode)` | Deprecated. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration interval)` | Deprecated. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` | Deprecated. |
	| `void` | `[startWith](#startWith(S,D,scala.Option))​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateName,  [D](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateData,  scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` | Deprecated. Set initial state. |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[startWith$default$3](#startWith$default$3())()` | Deprecated. |
	| `[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")` | `[stateData](#stateData())()` | Deprecated. |
	| `[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")` | `[stateName](#stateName())()` | Deprecated. |
	| `scala.collection.Iterable<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>` | `[stateNames](#stateNames())()` | Deprecated. |
	| `[PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm")` | `[StateTimeout](#StateTimeout())()` | Deprecated. This case object is received in case of a state timeout. |
	| `[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>` | `[stay](#stay())()` | Deprecated. Produce "empty" transition descriptor. |
	| `[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>` | `[stop](#stop())()` | Deprecated. Produce change descriptor to stop this FSM actor with reason "Normal". |
	| `[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>` | `[stop](#stop(akka.persistence.fsm.PersistentFSM.Reason))​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason)` | Deprecated. Produce change descriptor to stop this FSM actor including specified reason. |
	| `[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>` | `[stop](#stop(akka.persistence.fsm.PersistentFSM.Reason,D))​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason,  [D](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateData)` | Deprecated. Produce change descriptor to stop this FSM actor including specified reason. |
	| `[PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm")` | `[StopEvent](#StopEvent())()` | Deprecated. |
	| `void` | `[super$postStop](#super$postStop())()` | Deprecated. Call `onTermination` hook; if you want to retain this behavior when  overriding make sure to call `super.postStop()`. |
	| `void` | `[terminate](#terminate(akka.persistence.fsm.PersistentFSM.State))​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> nextState)` | Deprecated. |
	| `void` | `[terminateEvent_$eq](#terminateEvent_$eq(scala.PartialFunction))​(scala.PartialFunction<[PersistentFSM.StopEvent](PersistentFSM.StopEvent.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> x$1)` | Deprecated. |
	| `void` | `[timeoutFuture_$eq](#timeoutFuture_$eq(scala.Option))​(scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> x$1)` | Deprecated. |
	| `scala.PartialFunction<scala.Tuple2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit>` | `[total2pf](#total2pf(scala.Function2))​(scala.Function2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​scala.runtime.BoxedUnit> transitionHandler)` | Deprecated. |
	| `[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm")` | `[transform](#transform(scala.PartialFunction))​(scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> func)` | Deprecated. |
	| `void` | `[transitionEvent_$eq](#transitionEvent_$eq(scala.collection.immutable.List))​(scala.collection.immutable.List<scala.PartialFunction<scala.Tuple2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit>> x$1)` | Deprecated. |
	| `void` | `[when](#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction))​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateName,  scala.concurrent.duration.FiniteDuration stateTimeout,  scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> stateFunction)` | Deprecated. Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `scala.concurrent.duration.FiniteDuration` | `[when$default$2](#when$default$2())()` | Deprecated. |
	| `void` | `[whenUnhandled](#whenUnhandled(scala.PartialFunction))​(scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> stateFunction)` | Deprecated. |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](../../actor/Actor.html#context()), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [self](../../actor/Actor.html#self()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.routing.[Listeners](../../routing/Listeners.html "interface in akka.routing")
		
		
		`[akka$routing$Listeners$_setter_$listeners_$eq](../../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [gossip](../../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../../routing/Listeners.html#listenerManagement()), [listeners](../../routing/Listeners.html#listeners())`

- - ### Method Detail
	
	
	
		- #### $minus$greater
		
		
		
		```
		[PersistentFSM.$minus$greater$](PersistentFSM.$minus$greater$.html "class in akka.persistence.fsm") $minus$greater()
		```
		
		Deprecated.
		This extractor is just convenience for matching a (S, S) pair, including a
		 reminder what the new state is.
		- #### Event
		
		
		
		```
		[PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm") Event()
		```
		
		Deprecated.
		- #### StateTimeout
		
		
		
		```
		[PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm") StateTimeout()
		```
		
		Deprecated.
		This case object is received in case of a state timeout.
		- #### StopEvent
		
		
		
		```
		[PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm") StopEvent()
		```
		
		Deprecated.
		- #### akka$persistence$fsm$PersistentFSMBase$\_setter\_$Event\_$eq
		
		
		
		```
		void akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq​([PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm") x$1)
		```
		
		Deprecated.
		- #### akka$persistence$fsm$PersistentFSMBase$\_setter\_$StateTimeout\_$eq
		
		
		
		```
		void akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq​([PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm") x$1)
		```
		
		Deprecated.
		This case object is received in case of a state timeout.
		- #### akka$persistence$fsm$PersistentFSMBase$\_setter\_$StopEvent\_$eq
		
		
		
		```
		void akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq​([PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm") x$1)
		```
		
		Deprecated.
		- #### applyState
		
		
		
		```
		void applyState​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> nextState)
		```
		
		Deprecated.
		- #### cancelTimer
		
		
		
		```
		void cancelTimer​(java.lang.String name)
		```
		
		Deprecated.
		- #### currentState\_$eq
		
		
		
		```
		void currentState_$eq​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> x$1)
		```
		
		Deprecated.
		- #### debugEvent
		
		
		
		```
		boolean debugEvent()
		```
		
		Deprecated.
		- #### generation\_$eq
		
		
		
		```
		void generation_$eq​(long x$1)
		```
		
		Deprecated.
		- #### handleEvent\_$eq
		
		
		
		```
		void handleEvent_$eq​(scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> x$1)
		```
		
		Deprecated.
		- #### handleTransition
		
		
		
		```
		void handleTransition​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") prev,
		                      [S](PersistentFSMBase.html "type parameter in PersistentFSMBase") next)
		```
		
		Deprecated.
		- #### initialize
		
		
		
		```
		void initialize()
		```
		
		Deprecated.
		Removed from API, called internally. Since 2\.4\.5\.
		- #### isStateTimerActive
		
		
		
		```
		boolean isStateTimerActive()
		```
		
		Deprecated.
		- #### isTimerActive
		
		
		
		```
		boolean isTimerActive​(java.lang.String name)
		```
		
		Deprecated.
		- #### logTermination
		
		
		
		```
		void logTermination​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason)
		```
		
		Deprecated.
		By default [`PersistentFSM.Failure`](PersistentFSM.Failure.html "class in akka.persistence.fsm") is logged at error level and other reason
		 types are not logged. It is possible to override this behavior.
		- #### makeTransition
		
		
		
		```
		void makeTransition​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> nextState)
		```
		
		Deprecated.
		- #### nextStateData
		
		
		
		```
		[D](PersistentFSMBase.html "type parameter in PersistentFSMBase") nextStateData()
		```
		
		Deprecated.
		- #### nextState\_$eq
		
		
		
		```
		void nextState_$eq​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> x$1)
		```
		
		Deprecated.
		- #### onTermination
		
		
		
		```
		void onTermination​(scala.PartialFunction<[PersistentFSM.StopEvent](PersistentFSM.StopEvent.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> terminationHandler)
		```
		
		Deprecated.
		- #### onTransition
		
		
		
		```
		void onTransition​(scala.PartialFunction<scala.Tuple2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> transitionHandler)
		```
		
		Deprecated.
		- #### postStop
		
		
		
		```
		void postStop()
		       throws java.lang.Exception
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](../../actor/Actor.html#postStop())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		Throws:
		`java.lang.Exception`
		- #### processEvent
		
		
		
		```
		void processEvent​([PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")> event,
		                  java.lang.Object source)
		```
		
		Deprecated.
		- #### processMsg
		
		
		
		```
		void processMsg​(java.lang.Object value,
		                java.lang.Object source)
		```
		
		Deprecated.
		- #### receive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](../../actor/Actor.html#receive())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### register
		
		
		
		```
		void register​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") name,
		              scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> function,
		              scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```
		
		Deprecated.
		- #### setStateTimeout
		
		
		
		```
		void setStateTimeout​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") state,
		                     scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```
		
		Deprecated.
		- #### setTimer
		
		
		
		```
		void setTimer​(java.lang.String name,
		              java.lang.Object msg,
		              scala.concurrent.duration.FiniteDuration timeout,
		              boolean repeat)
		```
		
		Deprecated.
		Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred. Since 2\.6\.0\.
		- #### setTimer$default$4
		
		
		
		```
		boolean setTimer$default$4()
		```
		
		Deprecated.
		- #### startSingleTimer
		
		
		
		```
		void startSingleTimer​(java.lang.String name,
		                      java.lang.Object msg,
		                      scala.concurrent.duration.FiniteDuration delay)
		```
		
		Deprecated.
		- #### startTimer
		
		
		
		```
		void startTimer​(java.lang.String name,
		                java.lang.Object msg,
		                scala.concurrent.duration.FiniteDuration timeout,
		                [PersistentFSM.TimerMode](PersistentFSM.TimerMode.html "interface in akka.persistence.fsm") mode)
		```
		
		Deprecated.
		- #### startTimerAtFixedRate
		
		
		
		```
		void startTimerAtFixedRate​(java.lang.String name,
		                           java.lang.Object msg,
		                           scala.concurrent.duration.FiniteDuration interval)
		```
		
		Deprecated.
		- #### startTimerWithFixedDelay
		
		
		
		```
		void startTimerWithFixedDelay​(java.lang.String name,
		                              java.lang.Object msg,
		                              scala.concurrent.duration.FiniteDuration delay)
		```
		
		Deprecated.
		- #### startWith
		
		
		
		```
		void startWith​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateName,
		               [D](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateData,
		               scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```
		
		Deprecated.
		Set initial state. Call this method from the constructor before the [`initialize()`](#initialize()) method.
		 If different state is needed after a restart this method, followed by [`initialize()`](#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](../../actor/Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](../../actor/Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		`timeout` \- state timeout for the initial state, overriding the default timeout for that state
		- #### startWith$default$3
		
		
		
		```
		scala.Option<scala.concurrent.duration.FiniteDuration> startWith$default$3()
		```
		
		Deprecated.
		- #### stateData
		
		
		
		```
		[D](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateData()
		```
		
		Deprecated.
		- #### stateName
		
		
		
		```
		[S](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateName()
		```
		
		Deprecated.
		- #### stateNames
		
		
		
		```
		scala.collection.Iterable<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")> stateNames()
		```
		
		Deprecated.
		- #### stay
		
		
		
		```
		[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> stay()
		```
		
		Deprecated.
		Produce "empty" transition descriptor.
		 Return this from a state function when no state change is to be effected.
		 
		 No transition event will be triggered by [`stay()`](#stay()).
		 If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.
		 
		
		
		
		Returns:
		descriptor for staying in current state
		- #### stop
		
		
		
		```
		[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> stop()
		```
		
		Deprecated.
		Produce change descriptor to stop this FSM actor with reason "Normal".
		- #### stop
		
		
		
		```
		[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> stop​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason)
		```
		
		Deprecated.
		Produce change descriptor to stop this FSM actor including specified reason.
		- #### stop
		
		
		
		```
		[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> stop​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason,
		                                            [D](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateData)
		```
		
		Deprecated.
		Produce change descriptor to stop this FSM actor including specified reason.
		- #### super$postStop
		
		
		
		```
		void super$postStop()
		```
		
		Deprecated.
		Call `onTermination` hook; if you want to retain this behavior when
		 overriding make sure to call `super.postStop()`.
		 
		 Please note that this method is called by default from `preRestart()`,
		 so override that one if `onTermination` shall not be called during
		 restart.
		- #### terminate
		
		
		
		```
		void terminate​([PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")> nextState)
		```
		
		Deprecated.
		- #### terminateEvent\_$eq
		
		
		
		```
		void terminateEvent_$eq​(scala.PartialFunction<[PersistentFSM.StopEvent](PersistentFSM.StopEvent.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> x$1)
		```
		
		Deprecated.
		- #### timeoutFuture\_$eq
		
		
		
		```
		void timeoutFuture_$eq​(scala.Option<[Cancellable](../../actor/Cancellable.html "interface in akka.actor")> x$1)
		```
		
		Deprecated.
		- #### total2pf
		
		
		
		```
		scala.PartialFunction<scala.Tuple2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit> total2pf​(scala.Function2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​scala.runtime.BoxedUnit> transitionHandler)
		```
		
		Deprecated.
		- #### transform
		
		
		
		```
		[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm") transform​(scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> func)
		```
		
		Deprecated.
		- #### transitionEvent\_$eq
		
		
		
		```
		void transitionEvent_$eq​(scala.collection.immutable.List<scala.PartialFunction<scala.Tuple2<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[S](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​scala.runtime.BoxedUnit>> x$1)
		```
		
		Deprecated.
		- #### when
		
		
		
		```
		void when​([S](PersistentFSMBase.html "type parameter in PersistentFSMBase") stateName,
		          scala.concurrent.duration.FiniteDuration stateTimeout,
		          scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> stateFunction)
		```
		
		Deprecated.
		Insert a new StateFunction at the end of the processing chain for the
		 given state. If the stateTimeout parameter is set, entering this state
		 without a differing explicit timeout setting will trigger a StateTimeout
		 event; the same is true when using \#stay.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateTimeout` \- default state timeout for this state
		`stateFunction` \- partial function describing response to input
		- #### when$default$2
		
		
		
		```
		scala.concurrent.duration.FiniteDuration when$default$2()
		```
		
		Deprecated.
		- #### whenUnhandled
		
		
		
		```
		void whenUnhandled​(scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](PersistentFSMBase.html "type parameter in PersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[D](PersistentFSMBase.html "type parameter in PersistentFSMBase"),​[E](PersistentFSMBase.html "type parameter in PersistentFSMBase")>> stateFunction)
		```
		
		Deprecated.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/LoggingPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.$minus$greater$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Failure.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Reason.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.State.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.StateTimeout$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.StopEvent$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.StopEvent.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.TimerMode.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.TransformHelper.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/routing/Listeners.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html)*