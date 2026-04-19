---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSM.html
title: AbstractFSM
---

# AbstractFSM

## Content

Package [akka.actor](package-summary.html)
## Class AbstractFSM\<S,​D\>

- java.lang.Object
- - akka.actor.AbstractFSM\<S,​D\>

- All Implemented Interfaces:
`[Actor](Actor.html "interface in akka.actor")`, `[ActorLogging](ActorLogging.html "interface in akka.actor")`, `[FSM](FSM.html "interface in akka.actor")<S,​D>`, `[Listeners](../routing/Listeners.html "interface in akka.routing")`

Direct Known Subclasses:
`[AbstractFSMWithStash](AbstractFSMWithStash.html "class in akka.actor")`, `[AbstractLoggingFSM](AbstractLoggingFSM.html "class in akka.actor")`

---

```
public abstract class AbstractFSM<S,​D>
extends java.lang.Object
implements [FSM](FSM.html "interface in akka.actor")<S,​D>
```

Java API: compatible with lambda expressions
 
 Finite State Machine actor abstract base class.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.actor.[FSM](FSM.html "interface in akka.actor")
		
		
		`[FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor"), [FSM.CurrentState](FSM.CurrentState.html "class in akka.actor")<[S](FSM.CurrentState.html "type parameter in FSM.CurrentState")>, [FSM.CurrentState$](FSM.CurrentState$.html "class in akka.actor"), [FSM.Event](FSM.Event.html "class in akka.actor")<[D](FSM.Event.html "type parameter in FSM.Event")>, [FSM.Event$](FSM.Event$.html "class in akka.actor"), [FSM.Failure](FSM.Failure.html "class in akka.actor"), [FSM.Failure$](FSM.Failure$.html "class in akka.actor"), [FSM.FixedDelayMode$](FSM.FixedDelayMode$.html "class in akka.actor"), [FSM.FixedRateMode$](FSM.FixedRateMode$.html "class in akka.actor"), [FSM.LogEntry](FSM.LogEntry.html "class in akka.actor")<[S](FSM.LogEntry.html "type parameter in FSM.LogEntry"),​[D](FSM.LogEntry.html "type parameter in FSM.LogEntry")>, [FSM.LogEntry$](FSM.LogEntry$.html "class in akka.actor"), [FSM.Normal$](FSM.Normal$.html "class in akka.actor"), [FSM.NullFunction$](FSM.NullFunction$.html "class in akka.actor"), [FSM.Reason](FSM.Reason.html "interface in akka.actor"), [FSM.Shutdown$](FSM.Shutdown$.html "class in akka.actor"), [FSM.SilentState](FSM.SilentState.html "class in akka.actor")<[S](FSM.SilentState.html "type parameter in FSM.SilentState"),​[D](FSM.SilentState.html "type parameter in FSM.SilentState")>, [FSM.SingleMode$](FSM.SingleMode$.html "class in akka.actor"), [FSM.State](FSM.State.html "class in akka.actor")<[S](FSM.State.html "type parameter in FSM.State"),​[D](FSM.State.html "type parameter in FSM.State")>, [FSM.State$](FSM.State$.html "class in akka.actor"), [FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor"), [FSM.StopEvent](FSM.StopEvent.html "class in akka.actor")<[S](FSM.StopEvent.html "type parameter in FSM.StopEvent"),​[D](FSM.StopEvent.html "type parameter in FSM.StopEvent")>, [FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor"), [FSM.SubscribeTransitionCallBack](FSM.SubscribeTransitionCallBack.html "class in akka.actor"), [FSM.SubscribeTransitionCallBack$](FSM.SubscribeTransitionCallBack$.html "class in akka.actor"), [FSM.Timer](FSM.Timer.html "class in akka.actor"), [FSM.Timer$](FSM.Timer$.html "class in akka.actor"), [FSM.TimerMode](FSM.TimerMode.html "interface in akka.actor"), [FSM.TransformHelper](FSM.TransformHelper.html "class in akka.actor"), [FSM.Transition](FSM.Transition.html "class in akka.actor")<[S](FSM.Transition.html "type parameter in FSM.Transition")>, [FSM.Transition$](FSM.Transition$.html "class in akka.actor"), [FSM.UnsubscribeTransitionCallBack](FSM.UnsubscribeTransitionCallBack.html "class in akka.actor"), [FSM.UnsubscribeTransitionCallBack$](FSM.UnsubscribeTransitionCallBack$.html "class in akka.actor")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractFSM](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor")` | `[$minus$greater](#$minus$greater())()` | This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](ActorContext.html "interface in akka.actor") x$1)` | Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](ActorRef.html "class in akka.actor") x$1)` | The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$actor$FSM$_setter_$Event_$eq](#akka$actor$FSM$_setter_$Event_$eq(akka.actor.FSM.Event$))​([FSM.Event$](FSM.Event$.html "class in akka.actor") x$1)` |  |
	| `protected void` | `[akka$actor$FSM$_setter_$StateTimeout_$eq](#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))​([FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") x$1)` | This case object is received in case of a state timeout. |
	| `protected void` | `[akka$actor$FSM$_setter_$StopEvent_$eq](#akka$actor$FSM$_setter_$StopEvent_$eq(akka.actor.FSM.StopEvent$))​([FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") x$1)` |  |
	| `protected void` | `[akka$routing$Listeners$_setter_$listeners_$eq](#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))​(java.util.Set<[ActorRef](ActorRef.html "class in akka.actor")> x$1)` |  |
	| `[ActorContext](ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Scala API: Stores the context for this actor, including self, and sender. |
	| `[FSM.Event$](FSM.Event$.html "class in akka.actor")` | `[Event](#Event())()` |  |
	| `[AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor")` | `[getContext](#getContext())()` | Returns this AbstractActor's ActorContext  The ActorContext is not thread safe so do not expose it outside of the  AbstractActor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSelf](#getSelf())()` | Returns the ActorRef for this actor. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[getSender](#getSender())()` | The reference sender Actor of the currently processed message. |
	| `[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[goTo](#goTo(S))​([S](AbstractFSM.html "type parameter in AbstractFSM") nextStateName)` | Produce transition to other state. |
	| `protected java.util.Set<[ActorRef](ActorRef.html "class in akka.actor")>` | `[listeners](#listeners())()` |  |
	| `[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchAnyEvent](#matchAnyEvent(akka.japi.pf.FI.Apply2))​([FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")>[UnitPFBuilder](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchData](#matchData(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<DT> dataType,  [FI.TypedPredicate](../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<DT> predicate,  [FI.UnitApply](../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)` | Create a [`UnitPFBuilder`](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")>[UnitPFBuilder](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchData](#matchData(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<DT> dataType,  [FI.UnitApply](../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)` | Create a [`UnitPFBuilder`](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​([FI.TypedPredicate2](../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM")> predicate,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(java.lang.Class,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  [FI.TypedPredicate2](../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​[D](AbstractFSM.html "type parameter in AbstractFSM")> predicate,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET,​DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")>[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(java.lang.Class,java.lang.Class,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  java.lang.Class<DT> dataType,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET,​DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")>[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(java.lang.Class,java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  java.lang.Class<DT> dataType,  [FI.TypedPredicate2](../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​DT> predicate,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(java.util.List,akka.japi.pf.FI.Apply2))​(java.util.List<java.lang.Object> eventMatches,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")>[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEvent](#matchEvent(java.util.List,java.lang.Class,akka.japi.pf.FI.Apply2))​(java.util.List<java.lang.Object> eventMatches,  java.lang.Class<DT> dataType,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<E> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEventEquals](#matchEventEquals(E,akka.japi.pf.FI.Apply2))​(E event,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<E,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<E,​DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")>[FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchEventEquals](#matchEventEquals(E,java.lang.Class,akka.japi.pf.FI.Apply2))​(E event,  java.lang.Class<DT> dataType,  [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<E,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)` | Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMTransitionHandlerBuilder](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchState](#matchState(S,S,akka.japi.pf.FI.UnitApply2))​([S](AbstractFSM.html "type parameter in AbstractFSM") fromState,  [S](AbstractFSM.html "type parameter in AbstractFSM") toState,  [FI.UnitApply2](../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[S](AbstractFSM.html "type parameter in AbstractFSM")> apply)` | Create an [`FSMTransitionHandlerBuilder`](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMTransitionHandlerBuilder](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchState](#matchState(S,S,akka.japi.pf.FI.UnitApplyVoid))​([S](AbstractFSM.html "type parameter in AbstractFSM") fromState,  [S](AbstractFSM.html "type parameter in AbstractFSM") toState,  [FI.UnitApplyVoid](../japi/pf/FI.UnitApplyVoid.html "interface in akka.japi.pf") apply)` | Create an [`FSMTransitionHandlerBuilder`](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchStop](#matchStop(akka.actor.FSM.Reason,akka.japi.pf.FI.UnitApply2))​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason,  [FI.UnitApply2](../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> apply)` | Create an [`FSMStopBuilder`](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<RT extends [FSM.Reason](FSM.Reason.html "interface in akka.actor")>[FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchStop](#matchStop(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply3))​(java.lang.Class<RT> reasonType,  [FI.TypedPredicate](../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<RT> predicate,  [FI.UnitApply3](../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> apply)` | Create an [`FSMStopBuilder`](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<RT extends [FSM.Reason](FSM.Reason.html "interface in akka.actor")>[FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>` | `[matchStop](#matchStop(java.lang.Class,akka.japi.pf.FI.UnitApply3))​(java.lang.Class<RT> reasonType,  [FI.UnitApply3](../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> apply)` | Create an [`FSMStopBuilder`](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSM.Reason](FSM.Reason.html "interface in akka.actor")` | `[Normal](#Normal())()` | Default reason if calling `stop()`. |
	| `static <S,​D>scala.PartialFunction<S,​D>` | `[NullFunction](#NullFunction())()` | A partial function value which does not match anything and can be used to  \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers. |
	| `void` | `[onTermination](#onTermination(akka.japi.pf.FSMStopBuilder))​([FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stopBuilder)` | Set handler which is called upon termination of this FSM actor. |
	| `void` | `[onTransition](#onTransition(akka.japi.pf.FI.UnitApply2))​([FI.UnitApply2](../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[S](AbstractFSM.html "type parameter in AbstractFSM")> transitionHandler)` | Add a handler which is called upon each state transition, i.e. |
	| `void` | `[onTransition](#onTransition(akka.japi.pf.FSMTransitionHandlerBuilder))​([FSMTransitionHandlerBuilder](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM")> transitionHandlerBuilder)` | Add a handler which is called upon each state transition, i.e. |
	| `[ActorRef](ActorRef.html "class in akka.actor")` | `[self](#self())()` | The 'self' field holds the ActorRef for this actor. |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration timeout)` | Deprecated. Use startSingleTimer instead. |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,java.time.Duration,boolean))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration timeout,  boolean repeat)` | Deprecated. Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout)` | Deprecated. Use startSingleTimer instead. |
	| `[FSM.Reason](FSM.Reason.html "interface in akka.actor")` | `[Shutdown](#Shutdown())()` | Reason given when someone was calling `system.stop(fsm)` from outside;  also applies to `Stop` supervision directive. |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration delay)` | Start a timer that will send `msg` once to the `self` actor after  the given `delay`. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration interval)` | Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration delay)` | Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages. |
	| `void` | `[startWith](#startWith(S,D))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  [D](AbstractFSM.html "type parameter in AbstractFSM") stateData)` | Set initial state. |
	| `void` | `[startWith](#startWith(S,D,java.time.Duration))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  [D](AbstractFSM.html "type parameter in AbstractFSM") stateData,  java.time.Duration timeout)` | Set initial state. |
	| `void` | `[startWith](#startWith(S,D,scala.concurrent.duration.FiniteDuration))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  [D](AbstractFSM.html "type parameter in AbstractFSM") stateData,  scala.concurrent.duration.FiniteDuration timeout)` | Set initial state. |
	| `[FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor")` | `[StateTimeout](#StateTimeout())()` | This case object is received in case of a state timeout. |
	| `[FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor")` | `[StopEvent](#StopEvent())()` |  |
	| `void` | `[when](#when(S,akka.japi.pf.FSMStateFunctionBuilder))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)` | Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[when](#when(S,java.time.Duration,akka.japi.pf.FSMStateFunctionBuilder))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  java.time.Duration stateTimeout,  [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)` | Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[when](#when(S,scala.concurrent.duration.FiniteDuration,akka.japi.pf.FSMStateFunctionBuilder))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  scala.concurrent.duration.FiniteDuration stateTimeout,  [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)` | Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[when](#when(S,scala.PartialFunction))​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,  scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](AbstractFSM.html "type parameter in AbstractFSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> stateFunction)` | Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[whenUnhandled](#whenUnhandled(akka.japi.pf.FSMStateFunctionBuilder))​([FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)` | Set handler which is called upon reception of unhandled messages. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](Actor.html#aroundPostStop()), [aroundPreRestart](Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](Actor.html#aroundPreStart()), [aroundReceive](Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](Actor.html#postRestart(java.lang.Throwable)), [preRestart](Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](Actor.html#preStart()), [sender](Actor.html#sender()), [supervisorStrategy](Actor.html#supervisorStrategy()), [unhandled](Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](ActorLogging.html#log())`
		- ### Methods inherited from interface akka.actor.[FSM](FSM.html "interface in akka.actor")
		
		
		`[applyState](FSM.html#applyState(akka.actor.FSM.State)), [cancelTimer](FSM.html#cancelTimer(java.lang.String)), [currentState_$eq](FSM.html#currentState_$eq(akka.actor.FSM.State)), [debugEvent](FSM.html#debugEvent()), [generation_$eq](FSM.html#generation_$eq(long)), [handleEvent_$eq](FSM.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](FSM.html#handleTransition(S,S)), [initialize](FSM.html#initialize()), [isStateTimerActive](FSM.html#isStateTimerActive()), [isTimerActive](FSM.html#isTimerActive(java.lang.String)), [logTermination](FSM.html#logTermination(akka.actor.FSM.Reason)), [makeTransition](FSM.html#makeTransition(akka.actor.FSM.State)), [nextState_$eq](FSM.html#nextState_$eq(akka.actor.FSM.State)), [nextStateData](FSM.html#nextStateData()), [onTermination](FSM.html#onTermination(scala.PartialFunction)), [onTransition](FSM.html#onTransition(scala.PartialFunction)), [postStop](FSM.html#postStop()), [processEvent](FSM.html#processEvent(akka.actor.FSM.Event,java.lang.Object)), [processMsg](FSM.html#processMsg(java.lang.Object,java.lang.Object)), [receive](FSM.html#receive()), [register](FSM.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](FSM.html#setStateTimeout(S,scala.Option)), [setTimer](FSM.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](FSM.html#setTimer$default$4()), [startSingleTimer](FSM.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](FSM.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.actor.FSM.TimerMode)), [startTimerAtFixedRate](FSM.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](FSM.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](FSM.html#startWith(S,D,scala.Option)), [startWith$default$3](FSM.html#startWith$default$3()), [stateData](FSM.html#stateData()), [stateName](FSM.html#stateName()), [stay](FSM.html#stay()), [stop](FSM.html#stop()), [stop](FSM.html#stop(akka.actor.FSM.Reason)), [stop](FSM.html#stop(akka.actor.FSM.Reason,D)), [super$postStop](FSM.html#super$postStop()), [terminate](FSM.html#terminate(akka.actor.FSM.State)), [terminateEvent_$eq](FSM.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](FSM.html#timeoutFuture_$eq(scala.Option)), [total2pf](FSM.html#total2pf(scala.Function2)), [transform](FSM.html#transform(scala.PartialFunction)), [transitionEvent_$eq](FSM.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](FSM.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](FSM.html#when$default$2()), [whenUnhandled](FSM.html#whenUnhandled(scala.PartialFunction))`
		- ### Methods inherited from interface akka.routing.[Listeners](../routing/Listeners.html "interface in akka.routing")
		
		
		`[gossip](../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../routing/Listeners.html#listenerManagement())`

- - ### Constructor Detail
	
	
	
		- #### AbstractFSM
		
		
		
		```
		public AbstractFSM()
		```

	- ### Method Detail
	
	
	
		- #### NullFunction
		
		
		
		```
		public static <S,​D> scala.PartialFunction<S,​D> NullFunction()
		```
		
		A partial function value which does not match anything and can be used to
		 \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers.
		 
		
		
		
		```
		
		 onTermination(FSM.NullFunction())
		 
		```
		- #### Event
		
		
		
		```
		public [FSM.Event$](FSM.Event$.html "class in akka.actor") Event()
		```
		
		
		Specified by:
		`[Event](FSM.html#Event())` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### StopEvent
		
		
		
		```
		public [FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") StopEvent()
		```
		
		
		Specified by:
		`[StopEvent](FSM.html#StopEvent())` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### $minus$greater
		
		
		
		```
		public [FSM.$minus$greater$](FSM.$minus$greater$.html "class in akka.actor") $minus$greater()
		```
		
		Description copied from interface: `[FSM](FSM.html#$minus$greater())`
		This extractor is just convenience for matching a (S, S) pair, including a
		 reminder what the new state is.
		
		Specified by:
		`[$minus$greater](FSM.html#$minus$greater())` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### StateTimeout
		
		
		
		```
		public [FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") StateTimeout()
		```
		
		Description copied from interface: `[FSM](FSM.html#StateTimeout())`
		This case object is received in case of a state timeout.
		
		Specified by:
		`[StateTimeout](FSM.html#StateTimeout())` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### akka$actor$FSM$\_setter\_$Event\_$eq
		
		
		
		```
		protected void akka$actor$FSM$_setter_$Event_$eq​([FSM.Event$](FSM.Event$.html "class in akka.actor") x$1)
		```
		
		
		Specified by:
		`[akka$actor$FSM$_setter_$Event_$eq](FSM.html#akka$actor$FSM$_setter_$Event_$eq(akka.actor.FSM.Event$))` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### akka$actor$FSM$\_setter\_$StopEvent\_$eq
		
		
		
		```
		protected void akka$actor$FSM$_setter_$StopEvent_$eq​([FSM.StopEvent$](FSM.StopEvent$.html "class in akka.actor") x$1)
		```
		
		
		Specified by:
		`[akka$actor$FSM$_setter_$StopEvent_$eq](FSM.html#akka$actor$FSM$_setter_$StopEvent_$eq(akka.actor.FSM.StopEvent$))` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### akka$actor$FSM$\_setter\_$StateTimeout\_$eq
		
		
		
		```
		protected void akka$actor$FSM$_setter_$StateTimeout_$eq​([FSM.StateTimeout$](FSM.StateTimeout$.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[FSM](FSM.html#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))`
		This case object is received in case of a state timeout.
		
		Specified by:
		`[akka$actor$FSM$_setter_$StateTimeout_$eq](FSM.html#akka$actor$FSM$_setter_$StateTimeout_$eq(akka.actor.FSM.StateTimeout$))` in interface `[FSM](FSM.html "interface in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>`
		- #### listeners
		
		
		
		```
		protected java.util.Set<[ActorRef](ActorRef.html "class in akka.actor")> listeners()
		```
		
		
		Specified by:
		`[listeners](../routing/Listeners.html#listeners())` in interface `[Listeners](../routing/Listeners.html "interface in akka.routing")`
		- #### akka$routing$Listeners$\_setter\_$listeners\_$eq
		
		
		
		```
		protected void akka$routing$Listeners$_setter_$listeners_$eq​(java.util.Set<[ActorRef](ActorRef.html "class in akka.actor")> x$1)
		```
		
		
		Specified by:
		`[akka$routing$Listeners$_setter_$listeners_$eq](../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))` in interface `[Listeners](../routing/Listeners.html "interface in akka.routing")`
		- #### context
		
		
		
		```
		public [ActorContext](ActorContext.html "interface in akka.actor") context()
		```
		
		Description copied from interface: `[Actor](Actor.html#context())`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[context](Actor.html#context())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### self
		
		
		
		```
		public final [ActorRef](ActorRef.html "class in akka.actor") self()
		```
		
		Description copied from interface: `[Actor](Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](Actor.html#self())` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](ActorContext.html "interface in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))`
		Scala API: Stores the context for this actor, including self, and sender.
		 It is implicit to support operations such as `forward`.
		 
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		 
		
		
		[`ActorContext`](ActorContext.html "interface in akka.actor") is the Scala API. `getContext` returns a
		 [`AbstractActor.ActorContext`](AbstractActor.ActorContext.html "interface in akka.actor"), which is the Java API of the actor
		 context.
		
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$context_$eq](Actor.html#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$self\_$eq
		
		
		
		```
		protected final void akka$actor$Actor$_setter_$self_$eq​([ActorRef](ActorRef.html "class in akka.actor") x$1)
		```
		
		Description copied from interface: `[Actor](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](Actor.html "interface in akka.actor")`
		- #### getContext
		
		
		
		```
		public [AbstractActor.ActorContext](AbstractActor.ActorContext.html "interface in akka.actor") getContext()
		```
		
		Returns this AbstractActor's ActorContext
		 The ActorContext is not thread safe so do not expose it outside of the
		 AbstractActor.
		- #### getSelf
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getSelf()
		```
		
		Returns the ActorRef for this actor.
		 
		 Same as `self()`.
		- #### getSender
		
		
		
		```
		public [ActorRef](ActorRef.html "class in akka.actor") getSender()
		```
		
		The reference sender Actor of the currently processed message. This is
		 always a legal destination to send to, even if there is no logical recipient
		 for the reply, in which case it will be sent to the dead letter mailbox.
		 
		 Same as `sender()`.
		 
		
		
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		- #### when
		
		
		
		```
		public final void when​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                       scala.PartialFunction<[FSM.Event](FSM.Event.html "class in akka.actor")<[D](AbstractFSM.html "type parameter in AbstractFSM")>,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> stateFunction)
		```
		
		Insert a new StateFunction at the end of the processing chain for the
		 given state.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateFunction` \- partial function describing response to input
		- #### when
		
		
		
		```
		public final void when​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                       [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)
		```
		
		Insert a new StateFunction at the end of the processing chain for the
		 given state.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateFunctionBuilder` \- partial function builder describing response to input
		- #### when
		
		
		
		```
		public final void when​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                       scala.concurrent.duration.FiniteDuration stateTimeout,
		                       [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)
		```
		
		Insert a new StateFunction at the end of the processing chain for the
		 given state. If the stateTimeout parameter is set, entering this state
		 without a differing explicit timeout setting will trigger a StateTimeout
		 event; the same is true when using \#stay.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateTimeout` \- default state timeout for this state
		`stateFunctionBuilder` \- partial function builder describing response to input
		- #### when
		
		
		
		```
		public final void when​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                       java.time.Duration stateTimeout,
		                       [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)
		```
		
		Insert a new StateFunction at the end of the processing chain for the
		 given state. If the stateTimeout parameter is set, entering this state
		 without a differing explicit timeout setting will trigger a StateTimeout
		 event; the same is true when using \#stay.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateTimeout` \- default state timeout for this state
		`stateFunctionBuilder` \- partial function builder describing response to input
		- #### startWith
		
		
		
		```
		public final void startWith​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                            [D](AbstractFSM.html "type parameter in AbstractFSM") stateData)
		```
		
		Set initial state. Call this method from the constructor before the [`FSM.initialize()`](FSM.html#initialize()) method.
		 If different state is needed after a restart this method, followed by [`FSM.initialize()`](FSM.html#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		- #### startWith
		
		
		
		```
		public final void startWith​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                            [D](AbstractFSM.html "type parameter in AbstractFSM") stateData,
		                            scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Set initial state. Call this method from the constructor before the [`FSM.initialize()`](FSM.html#initialize()) method.
		 If different state is needed after a restart this method, followed by [`FSM.initialize()`](FSM.html#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		`timeout` \- state timeout for the initial state, overriding the default timeout for that state
		- #### startWith
		
		
		
		```
		public final void startWith​([S](AbstractFSM.html "type parameter in AbstractFSM") stateName,
		                            [D](AbstractFSM.html "type parameter in AbstractFSM") stateData,
		                            java.time.Duration timeout)
		```
		
		Set initial state. Call this method from the constructor before the [`FSM.initialize()`](FSM.html#initialize()) method.
		 If different state is needed after a restart this method, followed by [`FSM.initialize()`](FSM.html#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		`timeout` \- state timeout for the initial state, overriding the default timeout for that state
		- #### onTransition
		
		
		
		```
		public final void onTransition​([FSMTransitionHandlerBuilder](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM")> transitionHandlerBuilder)
		```
		
		Add a handler which is called upon each state transition, i.e. not when
		 staying in the same state.
		 
		**Multiple handlers may be installed, and every one of them will be
		 called, not only the first one matching.**
		- #### onTransition
		
		
		
		```
		public final void onTransition​([FI.UnitApply2](../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[S](AbstractFSM.html "type parameter in AbstractFSM")> transitionHandler)
		```
		
		Add a handler which is called upon each state transition, i.e. not when
		 staying in the same state.
		 
		**Multiple handlers may be installed, and every one of them will be
		 called, not only the first one matching.**
		- #### whenUnhandled
		
		
		
		```
		public final void whenUnhandled​([FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stateFunctionBuilder)
		```
		
		Set handler which is called upon reception of unhandled messages. Calling
		 this method again will overwrite the previous contents.
		 
		 The current state may be queried using stateName.
		- #### onTermination
		
		
		
		```
		public final void onTermination​([FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> stopBuilder)
		```
		
		Set handler which is called upon termination of this FSM actor. Calling
		 this method again will overwrite the previous contents.
		- #### matchEvent
		
		
		
		```
		public final <ET,​DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                                   java.lang.Class<DT> dataType,
		                                                                                   [FI.TypedPredicate2](../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​DT> predicate,
		                                                                                   [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on an event and data type and a predicate.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`dataType` \- the data type to match on
		`predicate` \- a predicate to evaluate on the matched types
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <ET,​DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                                   java.lang.Class<DT> dataType,
		                                                                                   [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on an event and data type.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <ET> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                [FI.TypedPredicate2](../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​[D](AbstractFSM.html "type parameter in AbstractFSM")> predicate,
		                                                                [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the event type and predicate matches.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`predicate` \- a predicate that will be evaluated on the data and the event
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <ET> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the event type matches.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​([FI.TypedPredicate2](../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM")> predicate,
		                                                           [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the predicate matches.
		 
		
		
		
		Parameters:
		`predicate` \- a predicate that will be evaluated on the data and the event
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​(java.util.List<java.lang.Object> eventMatches,
		                                                                          java.lang.Class<DT> dataType,
		                                                                          [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on the data type and if any of the event types
		 in the list match or any of the event instances in the list compares equal.
		 
		
		
		
		Parameters:
		`eventMatches` \- a list of types or instances to match against
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEvent​(java.util.List<java.lang.Object> eventMatches,
		                                                           [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if any of the event types in the list match or any
		 of the event instances in the list compares equal.
		 
		
		
		
		Parameters:
		`eventMatches` \- a list of types or instances to match against
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEventEquals
		
		
		
		```
		public final <E,​DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEventEquals​(E event,
		                                                                                        java.lang.Class<DT> dataType,
		                                                                                        [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<E,​DT,​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on the data type and if the event compares equal.
		 
		
		
		
		Parameters:
		`event` \- an event to compare equal against
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEventEquals
		
		
		
		```
		public final <E> [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchEventEquals​(E event,
		                                                                     [FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<E,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the event compares equal.
		 
		
		
		
		Parameters:
		`event` \- an event to compare equal against
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchAnyEvent
		
		
		
		```
		public final [FSMStateFunctionBuilder](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchAnyEvent​([FI.Apply2](../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractFSM.html "type parameter in AbstractFSM"),​[FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")>> apply)
		```
		
		Create an [`FSMStateFunctionBuilder`](../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on any type of event.
		 
		
		
		
		Parameters:
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchState
		
		
		
		```
		public final [FSMTransitionHandlerBuilder](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM")> matchState​([S](AbstractFSM.html "type parameter in AbstractFSM") fromState,
		                                                       [S](AbstractFSM.html "type parameter in AbstractFSM") toState,
		                                                       [FI.UnitApplyVoid](../japi/pf/FI.UnitApplyVoid.html "interface in akka.japi.pf") apply)
		```
		
		Create an [`FSMTransitionHandlerBuilder`](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a from state and a to state.
		 
		
		
		
		Parameters:
		`fromState` \- the from state to match on
		`toState` \- the to state to match on
		`apply` \- an action to apply when the states match
		Returns:
		the builder with the case statement added
		- #### matchState
		
		
		
		```
		public final [FSMTransitionHandlerBuilder](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM")> matchState​([S](AbstractFSM.html "type parameter in AbstractFSM") fromState,
		                                                       [S](AbstractFSM.html "type parameter in AbstractFSM") toState,
		                                                       [FI.UnitApply2](../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[S](AbstractFSM.html "type parameter in AbstractFSM")> apply)
		```
		
		Create an [`FSMTransitionHandlerBuilder`](../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a from state and a to state.
		 
		
		
		
		Parameters:
		`fromState` \- the from state to match on
		`toState` \- the to state to match on
		`apply` \- an action to apply when the states match
		Returns:
		the builder with the case statement added
		- #### matchStop
		
		
		
		```
		public final [FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchStop​([FSM.Reason](FSM.Reason.html "interface in akka.actor") reason,
		                                                 [FI.UnitApply2](../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> apply)
		```
		
		Create an [`FSMStopBuilder`](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on an [`FSM.Reason`](FSM.Reason.html "interface in akka.actor").
		 
		
		
		
		Parameters:
		`reason` \- the reason for the termination
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchStop
		
		
		
		```
		public final <RT extends [FSM.Reason](FSM.Reason.html "interface in akka.actor")> [FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchStop​(java.lang.Class<RT> reasonType,
		                                                                         [FI.UnitApply3](../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> apply)
		```
		
		Create an [`FSMStopBuilder`](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a reason type.
		 
		
		
		
		Parameters:
		`reasonType` \- the reason type to match on
		`apply` \- an action to apply to the reason, event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchStop
		
		
		
		```
		public final <RT extends [FSM.Reason](FSM.Reason.html "interface in akka.actor")> [FSMStopBuilder](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> matchStop​(java.lang.Class<RT> reasonType,
		                                                                         [FI.TypedPredicate](../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<RT> predicate,
		                                                                         [FI.UnitApply3](../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> apply)
		```
		
		Create an [`FSMStopBuilder`](../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a reason type and a predicate.
		 
		
		
		
		Parameters:
		`reasonType` \- the reason type to match on
		`apply` \- an action to apply to the reason, event and state data if there is a match
		`predicate` \- a predicate that will be evaluated on the reason if the type matches
		Returns:
		the builder with the case statement added
		- #### matchData
		
		
		
		```
		public final <DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")> [UnitPFBuilder](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractFSM.html "type parameter in AbstractFSM")> matchData​(java.lang.Class<DT> dataType,
		                                                       [FI.UnitApply](../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)
		```
		
		Create a [`UnitPFBuilder`](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		
		Parameters:
		`dataType` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### matchData
		
		
		
		```
		public final <DT extends [D](AbstractFSM.html "type parameter in AbstractFSM")> [UnitPFBuilder](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractFSM.html "type parameter in AbstractFSM")> matchData​(java.lang.Class<DT> dataType,
		                                                       [FI.TypedPredicate](../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<DT> predicate,
		                                                       [FI.UnitApply](../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)
		```
		
		Create a [`UnitPFBuilder`](../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		
		Parameters:
		`dataType` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type and predicate matches
		Returns:
		a builder with the case statement added
		- #### goTo
		
		
		
		```
		public final [FSM.State](FSM.State.html "class in akka.actor")<[S](AbstractFSM.html "type parameter in AbstractFSM"),​[D](AbstractFSM.html "type parameter in AbstractFSM")> goTo​([S](AbstractFSM.html "type parameter in AbstractFSM") nextStateName)
		```
		
		Produce transition to other state. Return this from a state function in
		 order to effect the transition.
		 
		
		Parameters:
		`nextStateName` \- state designator for the next state
		Returns:
		state transition descriptor
		- #### startTimerWithFixedDelay
		
		
		
		```
		public void startTimerWithFixedDelay​(java.lang.String name,
		                                     java.lang.Object msg,
		                                     java.time.Duration delay)
		```
		
		Schedules a message to be sent repeatedly to the `self` actor with a
		 fixed `delay` between messages.
		 
		 It will not compensate the delay between messages if scheduling is delayed
		 longer than specified for some reason. The delay between sending of subsequent
		 messages will always be (at least) the given `delay`.
		 
		
		
		 In the long run, the frequency of messages will generally be slightly lower than
		 the reciprocal of the specified `delay`.
		 
		
		
		 Each timer has a `name` and if a new timer with same `name` is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		- #### startTimerAtFixedRate
		
		
		
		```
		public void startTimerAtFixedRate​(java.lang.String name,
		                                  java.lang.Object msg,
		                                  java.time.Duration interval)
		```
		
		Schedules a message to be sent repeatedly to the `self` actor with a
		 given frequency.
		 
		 It will compensate the delay for a subsequent message if the sending of previous
		 message was delayed more than specified. In such cases, the actual message interval
		 will differ from the interval passed to the method.
		 
		
		
		 If the execution is delayed longer than the `interval`, the subsequent message will
		 be sent immediately after the prior one. This also has the consequence that after
		 long garbage collection pauses or other reasons when the JVM was suspended all
		 "missed" messages will be sent when the process wakes up again.
		 
		
		
		 In the long run, the frequency of messages will be exactly the reciprocal of the
		 specified `interval`.
		 
		
		
		 Warning: `startTimerAtFixedRate` can result in bursts of scheduled messages after long
		 garbage collection pauses, which may in worst case cause undesired load on the system.
		 Therefore `startTimerWithFixedDelay` is often preferred.
		 
		
		
		 Each timer has a `name` and if a new timer with same `name` is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		- #### startSingleTimer
		
		
		
		```
		public void startSingleTimer​(java.lang.String name,
		                             java.lang.Object msg,
		                             java.time.Duration delay)
		```
		
		Start a timer that will send `msg` once to the `self` actor after
		 the given `delay`.
		 
		 Each timer has a `name` and if a new timer with same `name` is started
		 the previous is cancelled. It is guaranteed that a message from the
		 previous timer is not received, even if it was already enqueued
		 in the mailbox when the new timer was started.
		- #### setTimer
		
		
		
		```
		public final void setTimer​(java.lang.String name,
		                           java.lang.Object msg,
		                           scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Deprecated.
		Use startSingleTimer instead. Since 2\.6\.0\.
		
		Schedule named timer to deliver message after given delay, possibly repeating.
		 Any existing timer with the same name will automatically be canceled before
		 adding the new timer.
		
		Parameters:
		`name` \- identifier to be used with cancelTimer()
		`msg` \- message to be delivered
		`timeout` \- delay of first message delivery and between subsequent messages
		- #### setTimer
		
		
		
		```
		public final void setTimer​(java.lang.String name,
		                           java.lang.Object msg,
		                           java.time.Duration timeout)
		```
		
		Deprecated.
		Use startSingleTimer instead. Since 2\.6\.0\.
		
		Schedule named timer to deliver message after given delay, possibly repeating.
		 Any existing timer with the same name will automatically be canceled before
		 adding the new timer.
		
		Parameters:
		`name` \- identifier to be used with cancelTimer()
		`msg` \- message to be delivered
		`timeout` \- delay of first message delivery and between subsequent messages
		- #### setTimer
		
		
		
		```
		public final void setTimer​(java.lang.String name,
		                           java.lang.Object msg,
		                           java.time.Duration timeout,
		                           boolean repeat)
		```
		
		Deprecated.
		Use startSingleTimer, startTimerWithFixedDelay or startTimerAtFixedRate instead. This has the same semantics as startTimerAtFixedRate, but startTimerWithFixedDelay is often preferred. Since 2\.6\.0\.
		
		Schedule named timer to deliver message after given delay, possibly repeating.
		 Any existing timer with the same name will automatically be canceled before
		 adding the new timer.
		
		Parameters:
		`name` \- identifier to be used with cancelTimer()
		`msg` \- message to be delivered
		`timeout` \- delay of first message delivery and between subsequent messages
		`repeat` \- send once if false, scheduleAtFixedRate if true
		- #### Normal
		
		
		
		```
		public [FSM.Reason](FSM.Reason.html "interface in akka.actor") Normal()
		```
		
		Default reason if calling `stop()`.
		- #### Shutdown
		
		
		
		```
		public [FSM.Reason](FSM.Reason.html "interface in akka.actor") Shutdown()
		```
		
		Reason given when someone was calling `system.stop(fsm)` from outside;
		 also applies to `Stop` supervision directive.

## Code Examples

### Example 1: NullFunction

```text
onTermination(FSM.NullFunction())
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSMWithStash.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractLoggingFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
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
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.Apply2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.TypedPredicate2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApply.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApply2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApply3.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSM.html](https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractFSM.html)*