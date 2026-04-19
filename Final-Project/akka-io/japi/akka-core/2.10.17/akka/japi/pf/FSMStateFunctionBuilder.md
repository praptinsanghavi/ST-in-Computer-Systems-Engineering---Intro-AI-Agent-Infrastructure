---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:18:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FSMStateFunctionBuilder.html
title: FSMStateFunctionBuilder
---

# FSMStateFunctionBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class FSMStateFunctionBuilder\<S,​D\>

- java.lang.Object
- - akka.japi.pf.FSMStateFunctionBuilder\<S,​D\>

- Type Parameters:
`S` \- the state type
`D` \- the data type

---

```
public class FSMStateFunctionBuilder<S,​D>
extends java.lang.Object
```

Builder used to create a partial function for [`FSM.whenUnhandled(scala.PartialFunction<akka.actor.FSM.Event<D>, akka.actor.FSM.State<S, D>>)`](../../actor/FSM.html#whenUnhandled(scala.PartialFunction)).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FSMStateFunctionBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[anyEvent](#anyEvent(akka.japi.pf.FI.Apply2))​([FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches on any type of event. |
	| `scala.PartialFunction<[FSM.Event](../../actor/FSM.Event.html "class in akka.actor")<[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>>` | `[build](#build())()` | Build a `PartialFunction` from this builder. |
	| `[FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​([FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> predicate,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches if the predicate matches. |
	| `<P> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(java.lang.Class,akka.japi.pf.FI.Apply2))​(java.lang.Class<P> eventType,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches if the event type and predicate matches. |
	| `<P> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​(java.lang.Class<P> eventType,  [FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> predicate,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches if the event type and predicate matches. |
	| `<P,​Q>[FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(java.lang.Class,java.lang.Class,akka.japi.pf.FI.Apply2))​(java.lang.Class<P> eventType,  java.lang.Class<Q> dataType,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches on an event and data type. |
	| `<P,​Q>[FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(java.lang.Class,java.lang.Class,akka.japi.pf.FI.TypedPredicate2,akka.japi.pf.FI.Apply2))​(java.lang.Class<P> eventType,  java.lang.Class<Q> dataType,  [FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")<P,​Q> predicate,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches on an event and data type and a predicate. |
	| `[FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(java.util.List,akka.japi.pf.FI.Apply2))​(java.util.List<java.lang.Object> eventMatches,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches if any of the event types in the list match or any of the  event instances in the list compares equal. |
	| `<Q> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[event](#event(java.util.List,java.lang.Class,akka.japi.pf.FI.Apply2))​(java.util.List<java.lang.Object> eventMatches,  java.lang.Class<Q> dataType,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches on the data type and if any of the event types in the list  match or any of the event instances in the list compares equal. |
	| `<P> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[eventEquals](#eventEquals(P,akka.japi.pf.FI.Apply2))​(P event,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches if event compares equal. |
	| `<P,​Q>[FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>` | `[eventEquals](#eventEquals(P,java.lang.Class,akka.japi.pf.FI.Apply2))​(P event,  java.lang.Class<Q> dataType,  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)` | Add a case statement that matches on the data type and if the event compares equal. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FSMStateFunctionBuilder
		
		
		
		```
		public FSMStateFunctionBuilder()
		```

	- ### Method Detail
	
	
	
		- #### event
		
		
		
		```
		public final <P,​Q> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​(java.lang.Class<P> eventType,
		                                                                  java.lang.Class<Q> dataType,
		                                                                  [FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")<P,​Q> predicate,
		                                                                  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches on an event and data type and a predicate.
		
		Type Parameters:
		`P` \- the event type to match on
		`Q` \- the data type to match on
		Parameters:
		`eventType` \- the event type to match on
		`dataType` \- the data type to match on
		`predicate` \- a predicate to evaluate on the matched types
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### event
		
		
		
		```
		public <P,​Q> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​(java.lang.Class<P> eventType,
		                                                            java.lang.Class<Q> dataType,
		                                                            [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches on an event and data type.
		
		Type Parameters:
		`P` \- the event type to match on
		`Q` \- the data type to match on
		Parameters:
		`eventType` \- the event type to match on
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### event
		
		
		
		```
		public <P> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​(java.lang.Class<P> eventType,
		                                                    [FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> predicate,
		                                                    [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches if the event type and predicate matches.
		
		Parameters:
		`eventType` \- the event type to match on
		`predicate` \- a predicate that will be evaluated on the data and the event
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### event
		
		
		
		```
		public <P> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​(java.lang.Class<P> eventType,
		                                                    [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches if the event type and predicate matches.
		
		Parameters:
		`eventType` \- the event type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### event
		
		
		
		```
		public [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​([FI.TypedPredicate2](FI.TypedPredicate2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> predicate,
		                                                [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches if the predicate matches.
		
		Parameters:
		`predicate` \- a predicate that will be evaluated on the data and the event
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### event
		
		
		
		```
		public <Q> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​(java.util.List<java.lang.Object> eventMatches,
		                                                    java.lang.Class<Q> dataType,
		                                                    [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches on the data type and if any of the event types in the list
		 match or any of the event instances in the list compares equal.
		
		Type Parameters:
		`Q` \- the data type to match on
		Parameters:
		`eventMatches` \- a list of types or instances to match against
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### event
		
		
		
		```
		public [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> event​(java.util.List<java.lang.Object> eventMatches,
		                                                [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches if any of the event types in the list match or any of the
		 event instances in the list compares equal.
		
		Parameters:
		`eventMatches` \- a list of types or instances to match against
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### eventEquals
		
		
		
		```
		public <P,​Q> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> eventEquals​(P event,
		                                                                  java.lang.Class<Q> dataType,
		                                                                  [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​Q,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches on the data type and if the event compares equal.
		
		Type Parameters:
		`Q` \- the data type to match on
		Parameters:
		`event` \- an event to compare equal against
		`dataType` \- the data type to match on
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### eventEquals
		
		
		
		```
		public <P> [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> eventEquals​(P event,
		                                                          [FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<P,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches if event compares equal.
		
		Parameters:
		`event` \- an event to compare equal against
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### anyEvent
		
		
		
		```
		public [FSMStateFunctionBuilder](FSMStateFunctionBuilder.html "class in akka.japi.pf")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")> anyEvent​([FI.Apply2](FI.Apply2.html "interface in akka.japi.pf")<java.lang.Object,​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> apply)
		```
		
		Add a case statement that matches on any type of event.
		
		Parameters:
		`apply` \- an action to apply to the event and state data
		Returns:
		the builder with the case statement added
		- #### build
		
		
		
		```
		public scala.PartialFunction<[FSM.Event](../../actor/FSM.Event.html "class in akka.actor")<[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>,​[FSM.State](../../actor/FSM.State.html "class in akka.actor")<[S](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder"),​[D](FSMStateFunctionBuilder.html "type parameter in FSMStateFunctionBuilder")>> build()
		```
		
		Build a `PartialFunction` from this builder. After this call the builder will be
		 reset.
		
		Returns:
		a PartialFunction for this builder.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.Event.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.State.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.Apply2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FI.TypedPredicate2.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FSMStateFunctionBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FSMStateFunctionBuilder.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/japi/pf/FSMStateFunctionBuilder.html)*