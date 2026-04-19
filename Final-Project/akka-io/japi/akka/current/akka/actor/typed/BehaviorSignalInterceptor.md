---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:39:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorSignalInterceptor.html
title: BehaviorSignalInterceptor
---

# BehaviorSignalInterceptor

## Content

Package [akka.actor.typed](package-summary.html)
## Class BehaviorSignalInterceptor\<Inner\>

- java.lang.Object
- - [akka.actor.typed.BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")\<Inner,​Inner\>
	- - akka.actor.typed.BehaviorSignalInterceptor\<Inner\>

- Type Parameters:
`Inner` \- The inner message type \- the type of message the wrapped behavior accepts
 

---

```
public abstract class BehaviorSignalInterceptor<Inner>
extends [BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")<Inner,​Inner>
```

A behavior interceptor allows for intercepting signals reception and perform arbitrary logic \-
 transform, filter, send to a side channel etc.
 
 The `BehaviorSignalInterceptor` API is considered a low level tool for building other features and
 shouldn't be used for "normal" application logic. Several built\-in intercepting behaviors
 are provided through factories in the respective `Behaviors`.
 

 If the interceptor does keep mutable state care must be taken to create a new instance from
 the factory function of `Behaviors.intercept` so that a new instance is created per spawned
 actor rather than shared among actor instance.
 

See Also:
[`BehaviorInterceptor`](BehaviorInterceptor.html "class in akka.actor.typed")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[BehaviorInterceptor.PreStartTarget](BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](BehaviorInterceptor.PreStartTarget.html "type parameter in BehaviorInterceptor.PreStartTarget")>, [BehaviorInterceptor.ReceiveTarget](BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](BehaviorInterceptor.ReceiveTarget.html "type parameter in BehaviorInterceptor.ReceiveTarget")>, [BehaviorInterceptor.SignalTarget](BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorSignalInterceptor](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")>` | `[aroundReceive](#aroundReceive(akka.actor.typed.TypedActorContext,Inner,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> ctx,  [Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor") msg,  [BehaviorInterceptor.ReceiveTarget](BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> target)` | Only signals and not messages are intercepted by `BehaviorSignalInterceptor`. |
	| `abstract [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")>` | `[aroundSignal](#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> ctx,  [Signal](Signal.html "interface in akka.actor.typed") signal,  [BehaviorInterceptor.SignalTarget](BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> target)` | Intercept a signal sent to the running actor. |
	
	
		- ### Methods inherited from class akka.actor.typed.[BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[aroundStart](BehaviorInterceptor.html#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget)), [interceptMessageClass](BehaviorInterceptor.html#interceptMessageClass()), [isSame](BehaviorInterceptor.html#isSame(akka.actor.typed.BehaviorInterceptor))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BehaviorSignalInterceptor
		
		
		
		```
		public BehaviorSignalInterceptor()
		```

	- ### Method Detail
	
	
	
		- #### aroundReceive
		
		
		
		```
		public final [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> aroundReceive​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> ctx,
		                                           [Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor") msg,
		                                           [BehaviorInterceptor.ReceiveTarget](BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> target)
		```
		
		Only signals and not messages are intercepted by `BehaviorSignalInterceptor`.
		
		Specified by:
		`[aroundReceive](BehaviorInterceptor.html#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))` in class `[BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor"),​[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")>`
		Returns:
		The behavior for next message or signal
		- #### aroundSignal
		
		
		
		```
		public abstract [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> aroundSignal​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> ctx,
		                                             [Signal](Signal.html "interface in akka.actor.typed") signal,
		                                             [BehaviorInterceptor.SignalTarget](BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")> target)
		```
		
		Intercept a signal sent to the running actor. Pass the signal on to the next behavior
		 in the stack by passing it to `target.apply`.
		 
		
		Overrides:
		`[aroundSignal](BehaviorInterceptor.html#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget))` in class `[BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")<[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor"),​[Inner](BehaviorSignalInterceptor.html "type parameter in BehaviorSignalInterceptor")>`
		Returns:
		The behavior for next message or signal
		See Also:
		[`BehaviorSignalInterceptor`](BehaviorSignalInterceptor.html "class in akka.actor.typed")

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.PreStartTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.ReceiveTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorSignalInterceptor.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorSignalInterceptor.html)*