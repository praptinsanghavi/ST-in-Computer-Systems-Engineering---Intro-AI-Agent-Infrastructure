---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:20:10Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMTransitionHandlerBuilder.html
title: FSMTransitionHandlerBuilder
---

# FSMTransitionHandlerBuilder

## Content

Package [akka.japi.pf](package-summary.html)
## Class FSMTransitionHandlerBuilder\<S\>

- java.lang.Object
- - akka.japi.pf.FSMTransitionHandlerBuilder\<S\>

- Type Parameters:
`S` \- the state type

---

```
public class FSMTransitionHandlerBuilder<S>
extends java.lang.Object
```

Builder used to create a partial function for [`FSM.onTransition(scala.PartialFunction<scala.Tuple2<S, S>, scala.runtime.BoxedUnit>)`](../../actor/FSM.html#onTransition(scala.PartialFunction)).

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FSMTransitionHandlerBuilder](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `scala.PartialFunction<scala.Tuple2<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder"),​[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")>,​scala.runtime.BoxedUnit>` | `[build](#build())()` | Build a `PartialFunction` from this builder. |
	| `[FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")>` | `[state](#state(S,S,akka.japi.pf.FI.UnitApply2))​([S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") fromState,  [S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") toState,  [FI.UnitApply2](FI.UnitApply2.html "interface in akka.japi.pf")<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder"),​[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")> apply)` | Add a case statement that matches on a from state and a to state. |
	| `[FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")>` | `[state](#state(S,S,akka.japi.pf.FI.UnitApplyVoid))​([S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") fromState,  [S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") toState,  [FI.UnitApplyVoid](FI.UnitApplyVoid.html "interface in akka.japi.pf") apply)` | Add a case statement that matches on a from state and a to state. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### FSMTransitionHandlerBuilder
		
		
		
		```
		public FSMTransitionHandlerBuilder()
		```

	- ### Method Detail
	
	
	
		- #### state
		
		
		
		```
		public [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")> state​([S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") fromState,
		                                            [S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") toState,
		                                            [FI.UnitApplyVoid](FI.UnitApplyVoid.html "interface in akka.japi.pf") apply)
		```
		
		Add a case statement that matches on a from state and a to state.
		
		Parameters:
		`fromState` \- the from state to match on, or null for any
		`toState` \- the to state to match on, or null for any
		`apply` \- an action to apply when the states match
		Returns:
		the builder with the case statement added
		- #### state
		
		
		
		```
		public [FSMTransitionHandlerBuilder](FSMTransitionHandlerBuilder.html "class in akka.japi.pf")<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")> state​([S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") fromState,
		                                            [S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder") toState,
		                                            [FI.UnitApply2](FI.UnitApply2.html "interface in akka.japi.pf")<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder"),​[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")> apply)
		```
		
		Add a case statement that matches on a from state and a to state.
		
		Parameters:
		`fromState` \- the from state to match on, or null for any
		`toState` \- the to state to match on, or null for any
		`apply` \- an action to apply when the states match
		Returns:
		the builder with the case statement added
		- #### build
		
		
		
		```
		public scala.PartialFunction<scala.Tuple2<[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder"),​[S](FSMTransitionHandlerBuilder.html "type parameter in FSMTransitionHandlerBuilder")>,​scala.runtime.BoxedUnit> build()
		```
		
		Build a `PartialFunction` from this builder. After this call the builder will be
		 reset.
		
		Returns:
		a PartialFunction for this builder.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/FSM.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.UnitApply2.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FI.UnitApplyVoid.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMTransitionHandlerBuilder.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMTransitionHandlerBuilder.html](https://doc.akka.io/japi/akka-core/2.10/akka/japi/pf/FSMTransitionHandlerBuilder.html)*