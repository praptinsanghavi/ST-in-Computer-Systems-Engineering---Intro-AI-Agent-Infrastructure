---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:22Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.html
title: FSM
---

# FSM

## Content

Package [akka.actor](package-summary.html)
## Interface FSM\<S,​D\>

- All Superinterfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[ActorLogging](ActorLogging.html "interface in akka.actor")`, `[Listeners](../routing/Listeners.html "interface in akka.routing")`

All Known Subinterfaces:
`[LoggingFSM](LoggingFSM.html "interface in akka.actor")<S,​D>`

All Known Implementing Classes:
`[AbstractFSM](AbstractFSM.html "class in akka.actor")`, `[AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractLoggingFSM](AbstractLoggingFSM.html "class in akka.actor")`, `[ClusterSingletonManager](../cluster/singleton/ClusterSingletonManager.html "class in akka.cluster.singleton")`

---

```
public interface FSM<S,​D>
extends [Actor](Actor.html "interface in akka.actor"), [Listeners](../routing/Listeners.html "interface in akka.routing"), [ActorLogging](ActorLogging.html "interface in akka.actor")
```

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
         case Event(SomeOtherMsg, _) => ... // when data not needed
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

   setTimer("tock", TockMsg, 1 second, true) // repeating
   setTimer("lifetime", TerminateMsg, 1 hour, false) // single-shot
   cancelTimer("tock")
   isTimerActive("tock")
 
```

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Interface | Description |
	| `static class` | `[FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor")` | This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `static class` | `[FSM.CurrentState](FSM.CurrentState.html "class in akka.actor")<[S](FSM.CurrentState.html "type parameter in FSM.CurrentState")>` | Message type which is sent directly to the subscribed actor in  [`FSM.SubscribeTransitionCallBack`](FSM.SubscribeTransitionCallBack.html "class in akka.actor") before sending any  [`FSM.Transition`](FSM.Transition.html "class in akka.actor") messages. |
	| `static class` | `[FSM.CurrentState$](FSM.CurrentState$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.Event.html "type parameter in FSM.Event")>` | All messages sent to the [`FSM`](FSM.html "interface in akka.actor") will be wrapped inside an  `Event`, which allows pattern matching to extract both state and data. |
	| `static class` | `[FSM.Event$](FSM.Event$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.Failure](FSM.Failure.html "class in akka.actor")` | Signifies that the [`FSM`](FSM.html "interface in akka.actor") is shutting itself down because of  an error, e.g. |
	| `static class` | `[FSM.Failure$](FSM.Failure$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.FixedDelayMode$](FSM.FixedDelayMode$.html "class in akka.actor")` | INTERNAL API |
	| `static class` | `[FSM.FixedRateMode$](FSM.FixedRateMode$.html "class in akka.actor")` | INTERNAL API |
	| `static class` | `[FSM.LogEntry](FSM.LogEntry.html "class in akka.actor")<[S](FSM.LogEntry.html "type parameter in FSM.LogEntry"),​[D](FSM.LogEntry.html "type parameter in FSM.LogEntry")>` | Log Entry of the [`LoggingFSM`](LoggingFSM.html "interface in akka.actor"), can be obtained by calling `getLog`. |
	| `static class` | `[FSM.LogEntry$](FSM.LogEntry$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.Normal$](FSM.Normal$.html "class in akka.actor")` | Default reason if calling `stop()`. |
	| `static class` | `[FSM.NullFunction$](FSM.NullFunction$.html "class in akka.actor")` | A partial function value which does not match anything and can be used to  \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers. |
	| `static interface` | `[FSM.Reason](FSM.Reason.html "interface in akka.actor")` | Reason why this [`FSM`](FSM.html "interface in akka.actor") is shutting down. |
	| `static class` | `[FSM.Shutdown$](FSM.Shutdown$.html "class in akka.actor")` | Reason given when someone was calling `system.stop(fsm)` from outside;  also applies to `Stop` supervision directive. |
	| `static class` | `[FSM.SilentState](FSM.SilentState.html "class in akka.actor")<[S](FSM.SilentState.html "type parameter in FSM.SilentState"),​[D](FSM.SilentState.html "type parameter in FSM.SilentState")>` | INTERNAL API  Using a subclass for binary compatibility reasons |
	| `static class` | `[FSM.SingleMode$](FSM.SingleMode$.html "class in akka.actor")` | INTERNAL API |
	| `static class` | `[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.State.html "type parameter in FSM.State"),​[D](FSM.State.html "type parameter in FSM.State")>` |  |
	| `static class` | `[FSM.State$](FSM.State$.html "class in akka.actor")` | This captures all of the managed state of the [`FSM`](FSM.html "interface in akka.actor"): the state  name, the state data, possibly custom timeout, stop reason and replies  accumulated while processing the last message. |
	| `static class` | `[FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor")` | This case object is received in case of a state timeout. |
	| `static class` | `[FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.StopEvent.html "type parameter in FSM.StopEvent"),​[D](FSM.StopEvent.html "type parameter in FSM.StopEvent")>` | Case class representing the state of the [`FSM`](FSM.html "interface in akka.actor") within the  `onTermination` block. |
	| `static class` | `[FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.SubscribeTransitionCallBack](FSM.SubscribeTransitionCallBack.html "class in akka.actor")` | Send this to an [`FSM`](FSM.html "interface in akka.actor") to request first the [`FSM.CurrentState`](FSM.CurrentState.html "class in akka.actor")  and then a series of [`FSM.Transition`](FSM.Transition.html "class in akka.actor") updates. |
	| `static class` | `[FSM.SubscribeTransitionCallBack$](FSM.SubscribeTransitionCallBack$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.Timer](FSM.Timer.html "class in akka.actor")` | INTERNAL API |
	| `static class` | `[FSM.Timer$](FSM.Timer$.html "class in akka.actor")` |  |
	| `static interface` | `[FSM.TimerMode](FSM.TimerMode.html "interface in akka.actor")` | INTERNAL API |
	| `static class` | `[FSM.TransformHelper](FSM.TransformHelper.html "class in akka.actor")` |  |
	| `static class` | `[FSM.Transition](FSM.Transition.html "class in akka.actor")<[S](FSM.Transition.html "type parameter in FSM.Transition")>` | Message type which is used to communicate transitions between states to  all subscribed listeners (use [`FSM.SubscribeTransitionCallBack`](FSM.SubscribeTransitionCallBack.html "class in akka.actor")). |
	| `static class` | `[FSM.Transition$](FSM.Transition$.html "class in akka.actor")` |  |
	| `static class` | `[FSM.UnsubscribeTransitionCallBack](FSM.UnsubscribeTransitionCallBack.html "class in akka.actor")` | Unsubscribe from [`FSM.Transition`](FSM.Transition.html "class in akka.actor") notifications which was  effected by sending the corresponding [`FSM.SubscribeTransitionCallBack`](FSM.SubscribeTransitionCallBack.html "class in akka.actor"). |
	| `static class` | `[FSM.UnsubscribeTransitionCallBack$](FSM.UnsubscribeTransitionCallBack$.html "class in akka.actor")` |  |
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor")` | `[$minus$greater](#$minus$greater())()` | This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `void` | `[akka$actor$FSM$_setter_$Event_$eq](#akka$actor$FSM$_setter_$Event_$eq(akka.actor.FSM.Event$))​([FSM.Event$](FSM.Event$.html "class in akka.actor") x$1)` |  |
	| `void` | `[akka$actor$FSM$_setter_$StateTimeout_$eq](#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))​([FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") x$1)` | This case object is received in case of a state timeout. |
	| `void` | `[akka$actor$FSM$_setter_$StopEvent_$eq](#akka$actor$FSM$_setter_$StopEvent_$eq(akka.actor.FSM.StopEvent$))​([FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") x$1)` |  |
	| `void` | `[applyState](#applyState(akka.actor.FSM.State))​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> nextState)` |  |
	| `void` | `[cancelTimer](#cancelTimer(java.lang.String))​(java.lang.String name)` |  |
	| `void` | `[currentState_$eq](#currentState_$eq(akka.actor.FSM.State))​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> x$1)` |  |
	| `boolean` | `[debugEvent](#debugEvent())()` |  |
	| `[FSM.Event$](FSM.Event$.html "class in akka.actor")` | `[Event](#Event())()` |  |
	| `void` | `[generation_$eq](#generation_$eq(long))​(long x$1)` |  |
	| `void` | `[handleEvent_$eq](#handleEvent_$eq(scala.PartialFunction))​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> x$1)` |  |
	| `void` | `[handleTransition](#handleTransition(S,S))​([S](FSM.html "type parameter in FSM") prev,  [S](FSM.html "type parameter in FSM") next)` |  |
	| `void` | `[initialize](#initialize())()` |  |
	| `boolean` | `[isStateTimerActive](#isStateTimerActive())()` |  |
	| `boolean` | `[isTimerActive](#isTimerActive(java.lang.String))​(java.lang.String name)` |  |
	| `void` | `[logTermination](#logTermination(akka.actor.FSM.Reason))​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason)` | By default [`FSM.Failure`](FSM.Failure.html "class in akka.actor") is logged at error level and other reason  types are not logged. |
	| `void` | `[makeTransition](#makeTransition(akka.actor.FSM.State))​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> nextState)` |  |
	| `void` | `[nextState_$eq](#nextState_$eq(akka.actor.FSM.State))​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> x$1)` |  |
	| `[D](FSM.html "type parameter in FSM")` | `[nextStateData](#nextStateData())()` |  |
	| `void` | `[onTermination](#onTermination(scala.PartialFunction))​(scala.PartialFunction<[FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> terminationHandler)` |  |
	| `void` | `[onTransition](#onTransition(scala.PartialFunction))​(scala.PartialFunction<scala.Tuple2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> transitionHandler)` |  |
	| `void` | `[postStop](#postStop())()` | User overridable callback. |
	| `void` | `[processEvent](#processEvent(akka.actor.FSM.Event,java.lang.Object))​([FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")> event,  java.lang.Object source)` |  |
	| `void` | `[processMsg](#processMsg(java.lang.Object,java.lang.Object))​(java.lang.Object value,  java.lang.Object source)` |  |
	| `scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit>` | `[receive](#receive())()` | Scala API: This defines the initial actor behavior, it must return a partial function  with the actor logic. |
	| `void` | `[register](#register(S,scala.PartialFunction,scala.Option))​([S](FSM.html "type parameter in FSM") name,  scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> function,  scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` |  |
	| `void` | `[setStateTimeout](#setStateTimeout(S,scala.Option))​([S](FSM.html "type parameter in FSM") state,  scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` |  |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout,  boolean repeat)` | Deprecated. Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. |
	| `boolean` | `[setTimer$default$4](#setTimer$default$4())()` |  |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` |  |
	| `void` | `[startTimer](#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.actor.FSM.TimerMode))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout,  [FSM.TimerMode](FSM.TimerMode.html "interface in akka.actor") mode)` |  |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration interval)` |  |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration delay)` |  |
	| `void` | `[startWith](#startWith(S,D,scala.Option))​([S](FSM.html "type parameter in FSM") stateName,  [D](FSM.html "type parameter in FSM") stateData,  scala.Option<scala.concurrent.duration.FiniteDuration> timeout)` | Set initial state. |
	| `scala.Option<scala.concurrent.duration.FiniteDuration>` | `[startWith$default$3](#startWith$default$3())()` |  |
	| `[D](FSM.html "type parameter in FSM")` | `[stateData](#stateData())()` |  |
	| `[S](FSM.html "type parameter in FSM")` | `[stateName](#stateName())()` |  |
	| `[FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor")` | `[StateTimeout](#StateTimeout())()` | This case object is received in case of a state timeout. |
	| `[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>` | `[stay](#stay())()` | Produce "empty" transition descriptor. |
	| `[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>` | `[stop](#stop())()` | Produce change descriptor to stop this FSM actor with reason "Normal". |
	| `[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>` | `[stop](#stop(akka.actor.FSM.Reason))​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason)` | Produce change descriptor to stop this FSM actor including specified reason. |
	| `[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>` | `[stop](#stop(akka.actor.FSM.Reason,D))​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason,  [D](FSM.html "type parameter in FSM") stateData)` | Produce change descriptor to stop this FSM actor including specified reason. |
	| `[FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor")` | `[StopEvent](#StopEvent())()` |  |
	| `void` | `[super$postStop](#super$postStop())()` | Call `onTermination` hook; if you want to retain this behavior when  overriding make sure to call `super.postStop()`. |
	| `void` | `[terminate](#terminate(akka.actor.FSM.State))​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> nextState)` |  |
	| `void` | `[terminateEvent_$eq](#terminateEvent_$eq(scala.PartialFunction))​(scala.PartialFunction<[FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> x$1)` |  |
	| `void` | `[timeoutFuture_$eq](#timeoutFuture_$eq(scala.Option))​(scala.Option<[Cancellable](Cancellable.html "interface in akka.actor")> x$1)` |  |
	| `scala.PartialFunction<scala.Tuple2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit>` | `[total2pf](#total2pf(scala.Function2))​(scala.Function2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM"),​scala.runtime.BoxedUnit> transitionHandler)` |  |
	| `[FSM.TransformHelper](FSM.TransformHelper.html "class in akka.actor")` | `[transform](#transform(scala.PartialFunction))​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> func)` |  |
	| `void` | `[transitionEvent_$eq](#transitionEvent_$eq(scala.collection.immutable.List))​(scala.collection.immutable.List<scala.PartialFunction<scala.Tuple2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit>> x$1)` |  |
	| `void` | `[when](#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction))​([S](FSM.html "type parameter in FSM") stateName,  scala.concurrent.duration.FiniteDuration stateTimeout,  scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> stateFunction)` | Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `scala.concurrent.duration.FiniteDuration` | `[when$default$2](#when$default$2())()` |  |
	| `void` | `[whenUnhandled](#whenUnhandled(scala.PartialFunction))​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> stateFunction)` |  |
	
	
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext)), [akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef)), [aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [context](Actor.html#context()), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](Actor.html#preStart()), [self](Actor.html#self()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](ActorLogging.html#log())`
		- ### Methods inherited from interface akka.routing.[Listeners](../routing/Listeners.html "interface in akka.routing")
		
		
		`[akka$routing$Listeners$_setter_$listeners_$eq](../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set)), [gossip](../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../routing/Listeners.html#listenerManagement()), [listeners](../routing/Listeners.html#listeners())`

- - ### Method Detail
	
	
	
		- #### akka$actor$FSM$\_setter\_$Event\_$eq
		
		
		
		```
		void akka$actor$FSM$_setter_$Event_$eq​([FSM.Event$](FSM.Event$.html "class in akka.actor") x$1)
		```
		- #### akka$actor$FSM$\_setter\_$StopEvent\_$eq
		
		
		
		```
		void akka$actor$FSM$_setter_$StopEvent_$eq​([FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") x$1)
		```
		- #### akka$actor$FSM$\_setter\_$StateTimeout\_$eq
		
		
		
		```
		void akka$actor$FSM$_setter_$StateTimeout_$eq​([FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") x$1)
		```
		
		This case object is received in case of a state timeout.
		- #### super$postStop
		
		
		
		```
		void super$postStop()
		```
		
		Call `onTermination` hook; if you want to retain this behavior when
		 overriding make sure to call `super.postStop()`.
		 
		 Please note that this method is called by default from `preRestart()`,
		 so override that one if `onTermination` shall not be called during
		 restart.
		- #### Event
		
		
		
		```
		[FSM.Event$](FSM.Event$.html "class in akka.actor") Event()
		```
		- #### StopEvent
		
		
		
		```
		[FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") StopEvent()
		```
		- #### $minus$greater
		
		
		
		```
		[FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor") $minus$greater()
		```
		
		This extractor is just convenience for matching a (S, S) pair, including a
		 reminder what the new state is.
		- #### StateTimeout
		
		
		
		```
		[FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") StateTimeout()
		```
		
		This case object is received in case of a state timeout.
		- #### when
		
		
		
		```
		void when​([S](FSM.html "type parameter in FSM") stateName,
		          scala.concurrent.duration.FiniteDuration stateTimeout,
		          scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> stateFunction)
		```
		
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
		- #### startWith
		
		
		
		```
		void startWith​([S](FSM.html "type parameter in FSM") stateName,
		               [D](FSM.html "type parameter in FSM") stateData,
		               scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```
		
		Set initial state. Call this method from the constructor before the [`initialize()`](#initialize()) method.
		 If different state is needed after a restart this method, followed by [`initialize()`](#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		`timeout` \- state timeout for the initial state, overriding the default timeout for that state
		- #### startWith$default$3
		
		
		
		```
		scala.Option<scala.concurrent.duration.FiniteDuration> startWith$default$3()
		```
		- #### stay
		
		
		
		```
		[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> stay()
		```
		
		Produce "empty" transition descriptor.
		 Return this from a state function when no state change is to be effected.
		 
		 No transition event will be triggered by [`stay()`](#stay()).
		 If you want to trigger an event like `S -> S` for `onTransition` to handle use `goto` instead.
		 
		
		
		
		Returns:
		descriptor for staying in current state
		- #### stop
		
		
		
		```
		[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> stop()
		```
		
		Produce change descriptor to stop this FSM actor with reason "Normal".
		- #### stop
		
		
		
		```
		[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> stop​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason)
		```
		
		Produce change descriptor to stop this FSM actor including specified reason.
		- #### stop
		
		
		
		```
		[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> stop​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason,
		                          [D](FSM.html "type parameter in FSM") stateData)
		```
		
		Produce change descriptor to stop this FSM actor including specified reason.
		- #### transform
		
		
		
		```
		[FSM.TransformHelper](FSM.TransformHelper.html "class in akka.actor") transform​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> func)
		```
		- #### startTimerWithFixedDelay
		
		
		
		```
		void startTimerWithFixedDelay​(java.lang.String name,
		                              java.lang.Object msg,
		                              scala.concurrent.duration.FiniteDuration delay)
		```
		- #### startTimerAtFixedRate
		
		
		
		```
		void startTimerAtFixedRate​(java.lang.String name,
		                           java.lang.Object msg,
		                           scala.concurrent.duration.FiniteDuration interval)
		```
		- #### startSingleTimer
		
		
		
		```
		void startSingleTimer​(java.lang.String name,
		                      java.lang.Object msg,
		                      scala.concurrent.duration.FiniteDuration delay)
		```
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
		- #### startTimer
		
		
		
		```
		void startTimer​(java.lang.String name,
		                java.lang.Object msg,
		                scala.concurrent.duration.FiniteDuration timeout,
		                [FSM.TimerMode](FSM.TimerMode.html "interface in akka.actor") mode)
		```
		- #### cancelTimer
		
		
		
		```
		void cancelTimer​(java.lang.String name)
		```
		- #### isTimerActive
		
		
		
		```
		boolean isTimerActive​(java.lang.String name)
		```
		- #### setStateTimeout
		
		
		
		```
		void setStateTimeout​([S](FSM.html "type parameter in FSM") state,
		                     scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```
		- #### isStateTimerActive
		
		
		
		```
		boolean isStateTimerActive()
		```
		- #### onTransition
		
		
		
		```
		void onTransition​(scala.PartialFunction<scala.Tuple2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> transitionHandler)
		```
		- #### total2pf
		
		
		
		```
		scala.PartialFunction<scala.Tuple2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> total2pf​(scala.Function2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM"),​scala.runtime.BoxedUnit> transitionHandler)
		```
		- #### onTermination
		
		
		
		```
		void onTermination​(scala.PartialFunction<[FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> terminationHandler)
		```
		- #### whenUnhandled
		
		
		
		```
		void whenUnhandled​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> stateFunction)
		```
		- #### initialize
		
		
		
		```
		void initialize()
		```
		- #### stateName
		
		
		
		```
		[S](FSM.html "type parameter in FSM") stateName()
		```
		- #### stateData
		
		
		
		```
		[D](FSM.html "type parameter in FSM") stateData()
		```
		- #### nextStateData
		
		
		
		```
		[D](FSM.html "type parameter in FSM") nextStateData()
		```
		- #### debugEvent
		
		
		
		```
		boolean debugEvent()
		```
		- #### currentState\_$eq
		
		
		
		```
		void currentState_$eq​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> x$1)
		```
		- #### timeoutFuture\_$eq
		
		
		
		```
		void timeoutFuture_$eq​(scala.Option<[Cancellable](Cancellable.html "interface in akka.actor")> x$1)
		```
		- #### nextState\_$eq
		
		
		
		```
		void nextState_$eq​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> x$1)
		```
		- #### generation\_$eq
		
		
		
		```
		void generation_$eq​(long x$1)
		```
		- #### register
		
		
		
		```
		void register​([S](FSM.html "type parameter in FSM") name,
		              scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> function,
		              scala.Option<scala.concurrent.duration.FiniteDuration> timeout)
		```
		- #### handleEvent\_$eq
		
		
		
		```
		void handleEvent_$eq​(scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>> x$1)
		```
		- #### terminateEvent\_$eq
		
		
		
		```
		void terminateEvent_$eq​(scala.PartialFunction<[FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit> x$1)
		```
		- #### transitionEvent\_$eq
		
		
		
		```
		void transitionEvent_$eq​(scala.collection.immutable.List<scala.PartialFunction<scala.Tuple2<[S](FSM.html "type parameter in FSM"),​[S](FSM.html "type parameter in FSM")>,​scala.runtime.BoxedUnit>> x$1)
		```
		- #### handleTransition
		
		
		
		```
		void handleTransition​([S](FSM.html "type parameter in FSM") prev,
		                      [S](FSM.html "type parameter in FSM") next)
		```
		- #### receive
		
		
		
		```
		scala.PartialFunction<java.lang.Object,​scala.runtime.BoxedUnit> receive()
		```
		
		Description copied from interface: `[Actor](Actor.html#receive())`
		Scala API: This defines the initial actor behavior, it must return a partial function
		 with the actor logic.
		
		Specified by:
		`[receive](Actor.html#receive())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### processMsg
		
		
		
		```
		void processMsg​(java.lang.Object value,
		                java.lang.Object source)
		```
		- #### processEvent
		
		
		
		```
		void processEvent​([FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.html "type parameter in FSM")> event,
		                  java.lang.Object source)
		```
		- #### applyState
		
		
		
		```
		void applyState​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> nextState)
		```
		- #### makeTransition
		
		
		
		```
		void makeTransition​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> nextState)
		```
		- #### postStop
		
		
		
		```
		void postStop()
		```
		
		Description copied from interface: `[Actor](Actor.html#postStop())`
		User overridable callback.
		 
		 Is called asynchronously after 'actor.stop()' is invoked.
		 Empty default implementation.
		
		Specified by:
		`[postStop](Actor.html#postStop())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### terminate
		
		
		
		```
		void terminate​([FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.html "type parameter in FSM"),​[D](FSM.html "type parameter in FSM")> nextState)
		```
		- #### logTermination
		
		
		
		```
		void logTermination​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason)
		```
		
		By default [`FSM.Failure`](FSM.Failure.html "class in akka.actor") is logged at error level and other reason
		 types are not logged. It is possible to override this behavior.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Cancellable.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.$minus$greater$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.CurrentState$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.CurrentState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Event$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Event.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Failure$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Failure.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.FixedDelayMode$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.FixedRateMode$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.LogEntry$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.LogEntry.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Normal$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.NullFunction$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Reason.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Shutdown$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.SilentState.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.SingleMode$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.State$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.State.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.StateTimeout$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.StopEvent$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.StopEvent.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.SubscribeTransitionCallBack$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.SubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Timer$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Timer.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.TimerMode.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.TransformHelper.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Transition$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.Transition.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.UnsubscribeTransitionCallBack$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.UnsubscribeTransitionCallBack.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/LoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/cluster/singleton/ClusterSingletonManager.html
- https://doc.akka.io/japi/akka-core/2.6/akka/routing/Listeners.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/FSM.html)*