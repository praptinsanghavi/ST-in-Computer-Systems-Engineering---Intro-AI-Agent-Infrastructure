---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:16:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
title: AbstractPersistentFSMBase
---

# AbstractPersistentFSMBase

## Content

Package [akka.persistence.fsm](package-summary.html)
## Class AbstractPersistentFSMBase\<S,​D,​E\>

- java.lang.Object
- - akka.persistence.fsm.AbstractPersistentFSMBase\<S,​D,​E\>

- All Implemented Interfaces:
`[Actor](../../actor/Actor.html "interface in akka.actor")`, `[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")`, `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>`, `[Listeners](../../routing/Listeners.html "interface in akka.routing")`

Direct Known Subclasses:
`[AbstractPersistentFSM](AbstractPersistentFSM.html "class in akka.persistence.fsm")`

---

```
public abstract class AbstractPersistentFSMBase<S,​D,​E>
extends java.lang.Object
implements [PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<S,​D,​E>
```

Deprecated.
Use EventSourcedBehavior. Since 2\.6\.0\.

Java API: compatible with lambda expressions
 
 Finite State Machine actor abstract base class.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[Actor.emptyBehavior$](../../actor/Actor.emptyBehavior$.html "class in akka.actor"), [Actor.ignoringBehavior$](../../actor/Actor.ignoringBehavior$.html "class in akka.actor")`
		- ### Nested classes/interfaces inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[PersistentFSMBase.TransformHelper](PersistentFSMBase.TransformHelper.html "class in akka.persistence.fsm")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractPersistentFSMBase](#%3Cinit%3E())()` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[PersistentFSM.$minus$greater$](PersistentFSM.$minus$greater$.html "class in akka.persistence.fsm")` | `[$minus$greater](#$minus$greater())()` | Deprecated. This extractor is just convenience for matching a (S, S) pair, including a  reminder what the new state is. |
	| `protected void` | `[akka$actor$Actor$_setter_$context_$eq](#akka$actor$Actor$_setter_$context_$eq(akka.actor.ActorContext))​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)` | Deprecated. Scala API: Stores the context for this actor, including self, and sender. |
	| `protected void` | `[akka$actor$Actor$_setter_$self_$eq](#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") x$1)` | Deprecated. The 'self' field holds the ActorRef for this actor. |
	| `protected void` | `[akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$))​([PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm") x$1)` | Deprecated. |
	| `protected void` | `[akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$))​([PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm") x$1)` | Deprecated. This case object is received in case of a state timeout. |
	| `protected void` | `[akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$))​([PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm") x$1)` | Deprecated. |
	| `protected void` | `[akka$routing$Listeners$_setter_$listeners_$eq](#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))​(java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)` | Deprecated. |
	| `[ActorContext](../../actor/ActorContext.html "interface in akka.actor")` | `[context](#context())()` | Deprecated. Scala API: Stores the context for this actor, including self, and sender. |
	| `[PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm")` | `[Event](#Event())()` | Deprecated. |
	| `[AbstractActor.ActorContext](../../actor/AbstractActor.ActorContext.html "interface in akka.actor")` | `[getContext](#getContext())()` | Deprecated. Returns this AbstractActor's ActorContext  The ActorContext is not thread safe so do not expose it outside of the  AbstractActor. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[getSelf](#getSelf())()` | Deprecated. Returns the ActorRef for this actor. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[getSender](#getSender())()` | Deprecated. The reference sender Actor of the currently processed message. |
	| `[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[goTo](#goTo(S))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") nextStateName)` | Deprecated. Produce transition to other state. |
	| `protected java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[listeners](#listeners())()` | Deprecated. |
	| `[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchAnyEvent](#matchAnyEvent(akka.japi.pf.FI.Apply2))​([FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>[UnitPFBuilder](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchData](#matchData(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply))​(java.lang.Class<DT> dataType,  [FI.TypedPredicate](../../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<DT> predicate,  [FI.UnitApply](../../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)` | Deprecated. Create a [`UnitPFBuilder`](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>[UnitPFBuilder](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchData](#matchData(java.lang.Class,akka.japi.pf.FI.UnitApply))​(java.lang.Class<DT> dataType,  [FI.UnitApply](../../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)` | Deprecated. Create a [`UnitPFBuilder`](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​([FI.TypedPredicate2](../../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> predicate,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(java.lang.Class,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  [FI.TypedPredicate2](../../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> predicate,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET,​DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(java.lang.Class,java.lang.Class,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  java.lang.Class<DT> dataType,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<ET,​DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(java.lang.Class,java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​(java.lang.Class<ET> eventType,  java.lang.Class<DT> dataType,  [FI.TypedPredicate2](../../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​DT> predicate,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(java.util.List,akka.japi.pf.FI.Apply2))​(java.util.List<java.lang.Object> eventMatches,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEvent](#matchEvent(java.util.List,java.lang.Class,akka.japi.pf.FI.Apply2))​(java.util.List<java.lang.Object> eventMatches,  java.lang.Class<DT> dataType,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<Ev> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEventEquals](#matchEventEquals(Ev,akka.japi.pf.FI.Apply2))​(Ev event,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<Ev,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<Ev,​DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>[FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchEventEquals](#matchEventEquals(Ev,java.lang.Class,akka.japi.pf.FI.Apply2))​(Ev event,  java.lang.Class<DT> dataType,  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<Ev,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)` | Deprecated. Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchState](#matchState(S,S,akka.japi.pf.FI.UnitApply2))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") fromState,  [S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") toState,  [FI.UnitApply2](../../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)` | Deprecated. Create an [`FSMTransitionHandlerBuilder`](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchState](#matchState(S,S,akka.japi.pf.FI.UnitApplyVoid))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") fromState,  [S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") toState,  [FI.UnitApplyVoid](../../japi/pf/FI.UnitApplyVoid.html "interface in akka.japi.pf") apply)` | Deprecated. Create an [`FSMTransitionHandlerBuilder`](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchStop](#matchStop(akka.persistence.fsm.PersistentFSM.Reason,akka.japi.pf.FI.UnitApply2))​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason,  [FI.UnitApply2](../../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)` | Deprecated. Create an [`FSMStopBuilder`](../../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<RT extends [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")>[FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchStop](#matchStop(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply3))​(java.lang.Class<RT> reasonType,  [FI.TypedPredicate](../../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<RT> predicate,  [FI.UnitApply3](../../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)` | Deprecated. Create an [`FSMStopBuilder`](../../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `<RT extends [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")>[FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>` | `[matchStop](#matchStop(java.lang.Class,akka.japi.pf.FI.UnitApply3))​(java.lang.Class<RT> reasonType,  [FI.UnitApply3](../../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)` | Deprecated. Create an [`FSMStopBuilder`](../../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set. |
	| `[PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")` | `[Normal](#Normal())()` | Deprecated. Default reason if calling `stop()`. |
	| `static <S,​D>scala.PartialFunction<S,​D>` | `[NullFunction](#NullFunction())()` | Deprecated. A partial function value which does not match anything and can be used to  \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers. |
	| `void` | `[onTermination](#onTermination(akka.persistence.fsm.japi.pf.FSMStopBuilder))​([FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stopBuilder)` | Deprecated. Set handler which is called upon termination of this FSM actor. |
	| `void` | `[onTransition](#onTransition(akka.japi.pf.FI.UnitApply2))​([FI.UnitApply2](../../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> transitionHandler)` | Deprecated. Add a handler which is called upon each state transition, i.e. |
	| `void` | `[onTransition](#onTransition(akka.japi.pf.FSMTransitionHandlerBuilder))​([FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> transitionHandlerBuilder)` | Deprecated. Add a handler which is called upon each state transition, i.e. |
	| `[ActorRef](../../actor/ActorRef.html "class in akka.actor")` | `[self](#self())()` | Deprecated. The 'self' field holds the ActorRef for this actor. |
	| `void` | `[setTimer](#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration))​(java.lang.String name,  java.lang.Object msg,  scala.concurrent.duration.FiniteDuration timeout)` | Deprecated. Use startSingleTimer instead. |
	| `[PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")` | `[Shutdown](#Shutdown())()` | Deprecated. Reason given when someone was calling `system.stop(fsm)` from outside;  also applies to `Stop` supervision directive. |
	| `void` | `[startSingleTimer](#startSingleTimer(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration delay)` | Deprecated. Start a timer that will send `msg` once to the `self` actor after  the given `delay`. |
	| `void` | `[startTimerAtFixedRate](#startTimerAtFixedRate(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration interval)` | Deprecated. Schedules a message to be sent repeatedly to the `self` actor with a  given frequency. |
	| `void` | `[startTimerWithFixedDelay](#startTimerWithFixedDelay(java.lang.String,java.lang.Object,java.time.Duration))​(java.lang.String name,  java.lang.Object msg,  java.time.Duration delay)` | Deprecated. Schedules a message to be sent repeatedly to the `self` actor with a  fixed `delay` between messages. |
	| `void` | `[startWith](#startWith(S,D))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,  [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateData)` | Deprecated. Set initial state. |
	| `void` | `[startWith](#startWith(S,D,scala.concurrent.duration.FiniteDuration))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,  [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateData,  scala.concurrent.duration.FiniteDuration timeout)` | Deprecated. Set initial state. |
	| `[PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm")` | `[StateTimeout](#StateTimeout())()` | Deprecated. This case object is received in case of a state timeout. |
	| `[PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm")` | `[StopEvent](#StopEvent())()` | Deprecated. |
	| `void` | `[when](#when(S,akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,  [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stateFunctionBuilder)` | Deprecated. Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[when](#when(S,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,  scala.concurrent.duration.FiniteDuration stateTimeout,  [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stateFunctionBuilder)` | Deprecated. Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[when](#when(S,scala.PartialFunction))​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,  scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> stateFunction)` | Deprecated. Insert a new StateFunction at the end of the processing chain for the  given state. |
	| `void` | `[whenUnhandled](#whenUnhandled(akka.persistence.fsm.japi.pf.FSMStateFunctionBuilder))​([FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stateFunctionBuilder)` | Deprecated. Set handler which is called upon reception of unhandled messages. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
		- ### Methods inherited from interface akka.actor.[Actor](../../actor/Actor.html "interface in akka.actor")
		
		
		`[aroundPostRestart](../../actor/Actor.html#aroundPostRestart(java.lang.Throwable)), [aroundPostStop](../../actor/Actor.html#aroundPostStop()), [aroundPreRestart](../../actor/Actor.html#aroundPreRestart(java.lang.Throwable,scala.Option)), [aroundPreStart](../../actor/Actor.html#aroundPreStart()), [aroundReceive](../../actor/Actor.html#aroundReceive(scala.PartialFunction,java.lang.Object)), [postRestart](../../actor/Actor.html#postRestart(java.lang.Throwable)), [preRestart](../../actor/Actor.html#preRestart(java.lang.Throwable,scala.Option)), [preStart](../../actor/Actor.html#preStart()), [sender](../../actor/Actor.html#sender()), [supervisorStrategy](../../actor/Actor.html#supervisorStrategy()), [unhandled](../../actor/Actor.html#unhandled(java.lang.Object))`
		- ### Methods inherited from interface akka.actor.[ActorLogging](../../actor/ActorLogging.html "interface in akka.actor")
		
		
		`[_log_$eq](../../actor/ActorLogging.html#_log_$eq(akka.event.LoggingAdapter)), [log](../../actor/ActorLogging.html#log())`
		- ### Methods inherited from interface akka.routing.[Listeners](../../routing/Listeners.html "interface in akka.routing")
		
		
		`[gossip](../../routing/Listeners.html#gossip(java.lang.Object,akka.actor.ActorRef)), [gossip$default$2](../../routing/Listeners.html#gossip$default$2(java.lang.Object)), [listenerManagement](../../routing/Listeners.html#listenerManagement())`
		- ### Methods inherited from interface akka.persistence.fsm.[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")
		
		
		`[applyState](PersistentFSMBase.html#applyState(akka.persistence.fsm.PersistentFSM.State)), [cancelTimer](PersistentFSMBase.html#cancelTimer(java.lang.String)), [currentState_$eq](PersistentFSMBase.html#currentState_$eq(akka.persistence.fsm.PersistentFSM.State)), [debugEvent](PersistentFSMBase.html#debugEvent()), [generation_$eq](PersistentFSMBase.html#generation_$eq(long)), [handleEvent_$eq](PersistentFSMBase.html#handleEvent_$eq(scala.PartialFunction)), [handleTransition](PersistentFSMBase.html#handleTransition(S,S)), [initialize](PersistentFSMBase.html#initialize()), [isStateTimerActive](PersistentFSMBase.html#isStateTimerActive()), [isTimerActive](PersistentFSMBase.html#isTimerActive(java.lang.String)), [logTermination](PersistentFSMBase.html#logTermination(akka.persistence.fsm.PersistentFSM.Reason)), [makeTransition](PersistentFSMBase.html#makeTransition(akka.persistence.fsm.PersistentFSM.State)), [nextState_$eq](PersistentFSMBase.html#nextState_$eq(akka.persistence.fsm.PersistentFSM.State)), [nextStateData](PersistentFSMBase.html#nextStateData()), [onTermination](PersistentFSMBase.html#onTermination(scala.PartialFunction)), [onTransition](PersistentFSMBase.html#onTransition(scala.PartialFunction)), [postStop](PersistentFSMBase.html#postStop()), [processEvent](PersistentFSMBase.html#processEvent(akka.persistence.fsm.PersistentFSM.Event,java.lang.Object)), [processMsg](PersistentFSMBase.html#processMsg(java.lang.Object,java.lang.Object)), [receive](PersistentFSMBase.html#receive()), [register](PersistentFSMBase.html#register(S,scala.PartialFunction,scala.Option)), [setStateTimeout](PersistentFSMBase.html#setStateTimeout(S,scala.Option)), [setTimer](PersistentFSMBase.html#setTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,boolean)), [setTimer$default$4](PersistentFSMBase.html#setTimer$default$4()), [startSingleTimer](PersistentFSMBase.html#startSingleTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimer](PersistentFSMBase.html#startTimer(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration,akka.persistence.fsm.PersistentFSM.TimerMode)), [startTimerAtFixedRate](PersistentFSMBase.html#startTimerAtFixedRate(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startTimerWithFixedDelay](PersistentFSMBase.html#startTimerWithFixedDelay(java.lang.String,java.lang.Object,scala.concurrent.duration.FiniteDuration)), [startWith](PersistentFSMBase.html#startWith(S,D,scala.Option)), [startWith$default$3](PersistentFSMBase.html#startWith$default$3()), [stateData](PersistentFSMBase.html#stateData()), [stateName](PersistentFSMBase.html#stateName()), [stateNames](PersistentFSMBase.html#stateNames()), [stay](PersistentFSMBase.html#stay()), [stop](PersistentFSMBase.html#stop()), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason)), [stop](PersistentFSMBase.html#stop(akka.persistence.fsm.PersistentFSM.Reason,D)), [super$postStop](PersistentFSMBase.html#super$postStop()), [terminate](PersistentFSMBase.html#terminate(akka.persistence.fsm.PersistentFSM.State)), [terminateEvent_$eq](PersistentFSMBase.html#terminateEvent_$eq(scala.PartialFunction)), [timeoutFuture_$eq](PersistentFSMBase.html#timeoutFuture_$eq(scala.Option)), [total2pf](PersistentFSMBase.html#total2pf(scala.Function2)), [transform](PersistentFSMBase.html#transform(scala.PartialFunction)), [transitionEvent_$eq](PersistentFSMBase.html#transitionEvent_$eq(scala.collection.immutable.List)), [when](PersistentFSMBase.html#when(S,scala.concurrent.duration.FiniteDuration,scala.PartialFunction)), [when$default$2](PersistentFSMBase.html#when$default$2()), [whenUnhandled](PersistentFSMBase.html#whenUnhandled(scala.PartialFunction))`

- - ### Constructor Detail
	
	
	
		- #### AbstractPersistentFSMBase
		
		
		
		```
		public AbstractPersistentFSMBase()
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### NullFunction
		
		
		
		```
		public static <S,​D> scala.PartialFunction<S,​D> NullFunction()
		```
		
		Deprecated.
		A partial function value which does not match anything and can be used to
		 \&ldquo;reset\&rdquo; `whenUnhandled` and `onTermination` handlers.
		 
		
		
		
		```
		
		 onTermination(FSM.NullFunction())
		 
		```
		- #### Event
		
		
		
		```
		public [PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm") Event()
		```
		
		Deprecated.
		
		Specified by:
		`[Event](PersistentFSMBase.html#Event())` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### StopEvent
		
		
		
		```
		public [PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm") StopEvent()
		```
		
		Deprecated.
		
		Specified by:
		`[StopEvent](PersistentFSMBase.html#StopEvent())` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### $minus$greater
		
		
		
		```
		public [PersistentFSM.$minus$greater$](PersistentFSM.$minus$greater$.html "class in akka.persistence.fsm") $minus$greater()
		```
		
		Deprecated.
		Description copied from interface: `[PersistentFSMBase](PersistentFSMBase.html#$minus$greater())`
		This extractor is just convenience for matching a (S, S) pair, including a
		 reminder what the new state is.
		
		Specified by:
		`[$minus$greater](PersistentFSMBase.html#$minus$greater())` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### StateTimeout
		
		
		
		```
		public [PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm") StateTimeout()
		```
		
		Deprecated.
		Description copied from interface: `[PersistentFSMBase](PersistentFSMBase.html#StateTimeout())`
		This case object is received in case of a state timeout.
		
		Specified by:
		`[StateTimeout](PersistentFSMBase.html#StateTimeout())` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### akka$persistence$fsm$PersistentFSMBase$\_setter\_$Event\_$eq
		
		
		
		```
		protected void akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq​([PersistentFSM.Event$](PersistentFSM.Event$.html "class in akka.persistence.fsm") x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$Event_$eq(akka.persistence.fsm.PersistentFSM.Event$))` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### akka$persistence$fsm$PersistentFSMBase$\_setter\_$StopEvent\_$eq
		
		
		
		```
		protected void akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq​([PersistentFSM.StopEvent$](PersistentFSM.StopEvent$.html "class in akka.persistence.fsm") x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StopEvent_$eq(akka.persistence.fsm.PersistentFSM.StopEvent$))` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### akka$persistence$fsm$PersistentFSMBase$\_setter\_$StateTimeout\_$eq
		
		
		
		```
		protected void akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq​([PersistentFSM.StateTimeout$](PersistentFSM.StateTimeout$.html "class in akka.persistence.fsm") x$1)
		```
		
		Deprecated.
		Description copied from interface: `[PersistentFSMBase](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$))`
		This case object is received in case of a state timeout.
		
		Specified by:
		`[akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq](PersistentFSMBase.html#akka$persistence$fsm$PersistentFSMBase$_setter_$StateTimeout_$eq(akka.persistence.fsm.PersistentFSM.StateTimeout$))` in interface `[PersistentFSMBase](PersistentFSMBase.html "interface in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>`
		- #### listeners
		
		
		
		```
		protected java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> listeners()
		```
		
		Deprecated.
		
		Specified by:
		`[listeners](../../routing/Listeners.html#listeners())` in interface `[Listeners](../../routing/Listeners.html "interface in akka.routing")`
		- #### akka$routing$Listeners$\_setter\_$listeners\_$eq
		
		
		
		```
		protected void akka$routing$Listeners$_setter_$listeners_$eq​(java.util.Set<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> x$1)
		```
		
		Deprecated.
		
		Specified by:
		`[akka$routing$Listeners$_setter_$listeners_$eq](../../routing/Listeners.html#akka$routing$Listeners$_setter_$listeners_$eq(java.util.Set))` in interface `[Listeners](../../routing/Listeners.html "interface in akka.routing")`
		- #### context
		
		
		
		```
		public [ActorContext](../../actor/ActorContext.html "interface in akka.actor") context()
		```
		
		Deprecated.
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
		- #### self
		
		
		
		```
		public final [ActorRef](../../actor/ActorRef.html "class in akka.actor") self()
		```
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#self())`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[self](../../actor/Actor.html#self())` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### akka$actor$Actor$\_setter\_$context\_$eq
		
		
		
		```
		protected void akka$actor$Actor$_setter_$context_$eq​([ActorContext](../../actor/ActorContext.html "interface in akka.actor") x$1)
		```
		
		Deprecated.
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
		
		Deprecated.
		Description copied from interface: `[Actor](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))`
		The 'self' field holds the ActorRef for this actor.
		 
		 Can be used to send messages to itself:
		 
		```
		
		 self ! message
		 
		```
		
		
		Specified by:
		`[akka$actor$Actor$_setter_$self_$eq](../../actor/Actor.html#akka$actor$Actor$_setter_$self_$eq(akka.actor.ActorRef))` in interface `[Actor](../../actor/Actor.html "interface in akka.actor")`
		- #### getContext
		
		
		
		```
		public [AbstractActor.ActorContext](../../actor/AbstractActor.ActorContext.html "interface in akka.actor") getContext()
		```
		
		Deprecated.
		Returns this AbstractActor's ActorContext
		 The ActorContext is not thread safe so do not expose it outside of the
		 AbstractActor.
		- #### getSelf
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") getSelf()
		```
		
		Deprecated.
		Returns the ActorRef for this actor.
		 
		 Same as `self()`.
		- #### getSender
		
		
		
		```
		public [ActorRef](../../actor/ActorRef.html "class in akka.actor") getSender()
		```
		
		Deprecated.
		The reference sender Actor of the currently processed message. This is
		 always a legal destination to send to, even if there is no logical recipient
		 for the reply, in which case it will be sent to the dead letter mailbox.
		 
		 Same as `sender()`.
		 
		
		
		 WARNING: Only valid within the Actor itself, so do not close over it and
		 publish it to other threads!
		- #### when
		
		
		
		```
		public final void when​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,
		                       scala.PartialFunction<[PersistentFSM.Event](PersistentFSM.Event.html "class in akka.persistence.fsm")<[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> stateFunction)
		```
		
		Deprecated.
		Insert a new StateFunction at the end of the processing chain for the
		 given state.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateFunction` \- partial function describing response to input
		- #### when
		
		
		
		```
		public final void when​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,
		                       [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stateFunctionBuilder)
		```
		
		Deprecated.
		Insert a new StateFunction at the end of the processing chain for the
		 given state.
		 
		
		Parameters:
		`stateName` \- designator for the state
		`stateFunctionBuilder` \- partial function builder describing response to input
		- #### when
		
		
		
		```
		public final void when​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,
		                       scala.concurrent.duration.FiniteDuration stateTimeout,
		                       [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stateFunctionBuilder)
		```
		
		Deprecated.
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
		public final void startWith​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,
		                            [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateData)
		```
		
		Deprecated.
		Set initial state. Call this method from the constructor before the [`PersistentFSMBase.initialize()`](PersistentFSMBase.html#initialize()) method.
		 If different state is needed after a restart this method, followed by [`PersistentFSMBase.initialize()`](PersistentFSMBase.html#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](../../actor/Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](../../actor/Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		- #### startWith
		
		
		
		```
		public final void startWith​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateName,
		                            [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") stateData,
		                            scala.concurrent.duration.FiniteDuration timeout)
		```
		
		Deprecated.
		Set initial state. Call this method from the constructor before the [`PersistentFSMBase.initialize()`](PersistentFSMBase.html#initialize()) method.
		 If different state is needed after a restart this method, followed by [`PersistentFSMBase.initialize()`](PersistentFSMBase.html#initialize()), can
		 be used in the actor life cycle hooks [`Actor.preStart()`](../../actor/Actor.html#preStart()) and [`Actor.postRestart(java.lang.Throwable)`](../../actor/Actor.html#postRestart(java.lang.Throwable)).
		 
		
		Parameters:
		`stateName` \- initial state designator
		`stateData` \- initial state data
		`timeout` \- state timeout for the initial state, overriding the default timeout for that state
		- #### onTransition
		
		
		
		```
		public final void onTransition​([FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> transitionHandlerBuilder)
		```
		
		Deprecated.
		Add a handler which is called upon each state transition, i.e. not when
		 staying in the same state.
		 
		**Multiple handlers may be installed, and every one of them will be
		 called, not only the first one matching.**
		- #### onTransition
		
		
		
		```
		public final void onTransition​([FI.UnitApply2](../../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> transitionHandler)
		```
		
		Deprecated.
		Add a handler which is called upon each state transition, i.e. not when
		 staying in the same state.
		 
		**Multiple handlers may be installed, and every one of them will be
		 called, not only the first one matching.**
		- #### whenUnhandled
		
		
		
		```
		public final void whenUnhandled​([FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stateFunctionBuilder)
		```
		
		Deprecated.
		Set handler which is called upon reception of unhandled messages. Calling
		 this method again will overwrite the previous contents.
		 
		 The current state may be queried using stateName.
		- #### onTermination
		
		
		
		```
		public final void onTermination​([FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> stopBuilder)
		```
		
		Deprecated.
		Set handler which is called upon termination of this FSM actor. Calling
		 this method again will overwrite the previous contents.
		- #### matchEvent
		
		
		
		```
		public final <ET,​DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                                           java.lang.Class<DT> dataType,
		                                                                                           [FI.TypedPredicate2](../../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​DT> predicate,
		                                                                                           [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
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
		public final <ET,​DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                                           java.lang.Class<DT> dataType,
		                                                                                           [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on an event and data type.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <ET> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                        [FI.TypedPredicate2](../../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<ET,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> predicate,
		                                                                        [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the event type and predicate matches.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`predicate` \- a predicate that will be evaluated on the data and the event
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <ET> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​(java.lang.Class<ET> eventType,
		                                                                        [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<ET,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the event type matches.
		 
		
		
		
		Parameters:
		`eventType` \- the event type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​([FI.TypedPredicate2](../../japi/pf/FI.TypedPredicate2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> predicate,
		                                                                   [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the predicate matches.
		 
		
		
		
		Parameters:
		`predicate` \- a predicate that will be evaluated on the data and the event
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEvent
		
		
		
		```
		public final <DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​(java.util.List<java.lang.Object> eventMatches,
		                                                                                  java.lang.Class<DT> dataType,
		                                                                                  [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
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
		public final [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEvent​(java.util.List<java.lang.Object> eventMatches,
		                                                                   [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if any of the event types in the list match or any
		 of the event instances in the list compares equal.
		 
		
		
		
		Parameters:
		`eventMatches` \- a list of types or instances to match against
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEventEquals
		
		
		
		```
		public final <Ev,​DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEventEquals​(Ev event,
		                                                                                                 java.lang.Class<DT> dataType,
		                                                                                                 [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<Ev,​DT,​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on the data type and if the event compares equal.
		 
		
		
		
		Parameters:
		`event` \- an event to compare equal against
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchEventEquals
		
		
		
		```
		public final <Ev> [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchEventEquals​(Ev event,
		                                                                              [FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<Ev,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches if the event compares equal.
		 
		
		
		
		Parameters:
		`event` \- an event to compare equal against
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchAnyEvent
		
		
		
		```
		public final [FSMStateFunctionBuilder](japi/pf/FSMStateFunctionBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchAnyEvent​([FI.Apply2](../../japi/pf/FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")>> apply)
		```
		
		Deprecated.
		Create an [`FSMStateFunctionBuilder`](../../japi/pf/FSMStateFunctionBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on any type of event.
		 
		
		
		
		Parameters:
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchState
		
		
		
		```
		public final [FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchState​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") fromState,
		                                                       [S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") toState,
		                                                       [FI.UnitApplyVoid](../../japi/pf/FI.UnitApplyVoid.html "interface in akka.japi.pf") apply)
		```
		
		Deprecated.
		Create an [`FSMTransitionHandlerBuilder`](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a from state and a to state.
		 
		
		
		
		Parameters:
		`fromState` \- the from state to match on
		`toState` \- the to state to match on
		`apply` \- an action to apply when the states match
		Returns:
		the builder with the case statement added
		- #### matchState
		
		
		
		```
		public final [FSMTransitionHandlerBuilder](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchState​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") fromState,
		                                                       [S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") toState,
		                                                       [FI.UnitApply2](../../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)
		```
		
		Deprecated.
		Create an [`FSMTransitionHandlerBuilder`](../../japi/pf/FSMTransitionHandlerBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a from state and a to state.
		 
		
		
		
		Parameters:
		`fromState` \- the from state to match on
		`toState` \- the to state to match on
		`apply` \- an action to apply when the states match
		Returns:
		the builder with the case statement added
		- #### matchStop
		
		
		
		```
		public final [FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchStop​([PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") reason,
		                                                 [FI.UnitApply2](../../japi/pf/FI.UnitApply2.html "interface in akka.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)
		```
		
		Deprecated.
		Create an [`FSMStopBuilder`](../../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on an [`PersistentFSM.Reason`](PersistentFSM.Reason.html "interface in akka.persistence.fsm").
		 
		
		
		
		Parameters:
		`reason` \- the reason for the termination
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchStop
		
		
		
		```
		public final <RT extends [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")> [FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchStop​(java.lang.Class<RT> reasonType,
		                                                                                   [FI.UnitApply3](../../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)
		```
		
		Deprecated.
		Create an [`FSMStopBuilder`](../../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a reason type.
		 
		
		
		
		Parameters:
		`reasonType` \- the reason type to match on
		`apply` \- an action to apply to the reason, event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### matchStop
		
		
		
		```
		public final <RT extends [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm")> [FSMStopBuilder](japi/pf/FSMStopBuilder.html "class in akka.persistence.fsm.japi.pf")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchStop​(java.lang.Class<RT> reasonType,
		                                                                                   [FI.TypedPredicate](../../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<RT> predicate,
		                                                                                   [FI.UnitApply3](../../japi/pf/FI.UnitApply3.html "interface in akka.japi.pf")<RT,​[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> apply)
		```
		
		Deprecated.
		Create an [`FSMStopBuilder`](../../japi/pf/FSMStopBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		 A case statement that matches on a reason type and a predicate.
		 
		
		
		
		Parameters:
		`reasonType` \- the reason type to match on
		`apply` \- an action to apply to the reason, event and state data if there is a match
		`predicate` \- a predicate that will be evaluated on the reason if the type matches
		Returns:
		the builder with the case statement added
		- #### matchData
		
		
		
		```
		public final <DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> [UnitPFBuilder](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchData​(java.lang.Class<DT> dataType,
		                                                       [FI.UnitApply](../../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)
		```
		
		Deprecated.
		Create a [`UnitPFBuilder`](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		
		Parameters:
		`dataType` \- a type to match the argument against
		`apply` \- an action to apply to the argument if the type matches
		Returns:
		a builder with the case statement added
		- #### matchData
		
		
		
		```
		public final <DT extends [D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> [UnitPFBuilder](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf")<[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> matchData​(java.lang.Class<DT> dataType,
		                                                       [FI.TypedPredicate](../../japi/pf/FI.TypedPredicate.html "interface in akka.japi.pf")<DT> predicate,
		                                                       [FI.UnitApply](../../japi/pf/FI.UnitApply.html "interface in akka.japi.pf")<DT> apply)
		```
		
		Deprecated.
		Create a [`UnitPFBuilder`](../../japi/pf/UnitPFBuilder.html "class in akka.japi.pf") with the first case statement set.
		 
		
		Parameters:
		`dataType` \- a type to match the argument against
		`predicate` \- a predicate that will be evaluated on the argument if the type matches
		`apply` \- an action to apply to the argument if the type and predicate matches
		Returns:
		a builder with the case statement added
		- #### goTo
		
		
		
		```
		public final [PersistentFSM.State](PersistentFSM.State.html "class in akka.persistence.fsm")<[S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[D](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase"),​[E](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase")> goTo​([S](AbstractPersistentFSMBase.html "type parameter in AbstractPersistentFSMBase") nextStateName)
		```
		
		Deprecated.
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
		
		Deprecated.
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
		
		Deprecated.
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
		
		Deprecated.
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
		- #### Normal
		
		
		
		```
		public [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") Normal()
		```
		
		Deprecated.
		Default reason if calling `stop()`.
		- #### Shutdown
		
		
		
		```
		public [PersistentFSM.Reason](PersistentFSM.Reason.html "interface in akka.persistence.fsm") Shutdown()
		```
		
		Deprecated.
		Reason given when someone was calling `system.stop(fsm)` from outside;
		 also applies to `Stop` supervision directive.

## Code Examples

### Example 1: NullFunction

```text
onTermination(FSM.NullFunction())
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.6/akka/actor/AbstractActor.ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.emptyBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/Actor.ignoringBehavior$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorLogging.html
- https://doc.akka.io/japi/akka-core/2.6/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.Apply2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.TypedPredicate2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApply.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApply2.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApply3.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FI.UnitApplyVoid.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/japi/pf/UnitPFBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSM.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.$minus$greater$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Event.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.Reason.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.State.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.StateTimeout$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSM.StopEvent$.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.TransformHelper.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/PersistentFSMBase.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/package-summary.html
- https://doc.akka.io/japi/akka-core/2.6/akka/routing/Listeners.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html](https://doc.akka.io/japi/akka-core/2.6/akka/persistence/fsm/AbstractPersistentFSMBase.html)*