---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMStopBuilder.html
title: FSMStopBuilder
---

# FSMStopBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class FSMStopBuilder\<S,​D\>

- java.lang.Object
- - akka.japi.pf.FSMStopBuilder\<S,​D\>

- Type Parameters:
`S` \- the state type
`D` \- the data type

---

```
public class FSMStopBuilder<S,​D>
extends java.lang.Object
```

Builder used to create a partial function for [`FSM.onTermination(scala.PartialFunction<akka.actor.FSM.StopEvent<S, D>, scala.runtime.BoxedUnit>)`](../../actor/FSM.html#onTermination(scala.PartialFunction)).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FSMStopBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<[FSM.StopEvent](../../actor/FSM.StopEvent.html "class in akka.actor")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")>,​scala.runtime.BoxedUnit>` | `[build](#build())()` | Build a `PartialFunction` from this builder. |
	| `[FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")>` | `[stop](#stop(akka.actor.FSM.Reason,akka.japi.pf.FI.UnitApply2))​([FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor") reason,  [FI.UnitApply2](FI.UnitApply2.html "interface in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> apply)` | Add a case statement that matches on an [`FSM.Reason`](../../actor/FSM.Reason.html "interface in akka.actor"). |
	| `<P extends [FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor")>[FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")>` | `[stop](#stop(java.lang.Class,akka.japi.pf.FI.TypedPredicate,akka.japi.pf.FI.UnitApply3))​(java.lang.Class<P> reasonType,  [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,  [FI.UnitApply3](FI.UnitApply3.html "interface in akka.japi.pf")<P,​[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> apply)` | Add a case statement that matches on a reason type and a predicate. |
	| `<P extends [FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor")>[FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")>` | `[stop](#stop(java.lang.Class,akka.japi.pf.FI.UnitApply3))​(java.lang.Class<P> reasonType,  [FI.UnitApply3](FI.UnitApply3.html "interface in akka.japi.pf")<P,​[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> apply)` | Add a case statement that matches on a reason type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FSMStopBuilder
		
		
		
		```
		public FSMStopBuilder()
		```

	- ### Method Detail
	
	
	
		- #### stop
		
		
		
		```
		public [FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> stop​([FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor") reason,
		                                      [FI.UnitApply2](FI.UnitApply2.html "interface in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> apply)
		```
		
		Add a case statement that matches on an [`FSM.Reason`](../../actor/FSM.Reason.html "interface in akka.actor").
		
		Parameters:
		`reason` \- the reason for the termination
		`apply` \- an action to apply to the event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### stop
		
		
		
		```
		public <P extends [FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor")> [FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> stop​(java.lang.Class<P> reasonType,
		                                                             [FI.UnitApply3](FI.UnitApply3.html "interface in akka.japi.pf")<P,​[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> apply)
		```
		
		Add a case statement that matches on a reason type.
		
		Type Parameters:
		`P` \- the reason type to match on
		Parameters:
		`reasonType` \- the reason type to match on
		`apply` \- an action to apply to the reason, event and state data if there is a match
		Returns:
		the builder with the case statement added
		- #### stop
		
		
		
		```
		public <P extends [FSM.Reason](../../actor/FSM.Reason.html "interface in akka.actor")> [FSMStopBuilder](FSMStopBuilder.html "class in akka.japi.pf")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> stop​(java.lang.Class<P> reasonType,
		                                                             [FI.TypedPredicate](FI.TypedPredicate.html "interface in akka.japi.pf")<P> predicate,
		                                                             [FI.UnitApply3](FI.UnitApply3.html "interface in akka.japi.pf")<P,​[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")> apply)
		```
		
		Add a case statement that matches on a reason type and a predicate.
		
		Type Parameters:
		`P` \- the reason type to match on
		Parameters:
		`reasonType` \- the reason type to match on
		`apply` \- an action to apply to the reason, event and state data if there is a match
		`predicate` \- a predicate that will be evaluated on the reason if the type matches
		Returns:
		the builder with the case statement added
		- #### build
		
		
		
		```
		public scala.PartialFunction<[FSM.StopEvent](../../actor/FSM.StopEvent.html "class in akka.actor")<[S](FSMStopBuilder.html "type parameter in FSMStopBuilder"),​[D](FSMStopBuilder.html "type parameter in FSMStopBuilder")>,​scala.runtime.BoxedUnit> build()
		```
		
		Build a `PartialFunction` from this builder. After this call the builder will be
		 reset.
		
		Returns:
		a PartialFunction for this builder.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.Reason.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.StopEvent.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.TypedPredicate.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.UnitApply2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.UnitApply3.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMStopBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMStopBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMStopBuilder.html)*