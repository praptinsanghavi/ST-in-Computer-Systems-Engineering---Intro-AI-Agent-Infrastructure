---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:49:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.html
title: BehaviorInterceptor
---

# BehaviorInterceptor

## Content

Package [akka.actor.typed](package-summary.html)
## Class BehaviorInterceptor\<Outer,​Inner\>

- java.lang.Object
- - akka.actor.typed.BehaviorInterceptor\<Outer,​Inner\>

- Type Parameters:
`Outer` \- The outer message type – the type of messages the intercepting behavior will accept
`Inner` \- The inner message type \- the type of message the wrapped behavior accepts
 

Direct Known Subclasses:
`[AbstractSupervisor](internal/AbstractSupervisor.html "class in akka.actor.typed.internal")`, `[BehaviorSignalInterceptor](BehaviorSignalInterceptor.html "class in akka.actor.typed")`

---

```
public abstract class BehaviorInterceptor<Outer,​Inner>
extends java.lang.Object
```

A behavior interceptor allows for intercepting message and signal reception and perform arbitrary logic \-
 transform, filter, send to a side channel etc. It is the core API for decoration of behaviors.
 
 The `BehaviorInterceptor` API is considered a low level tool for building other features and
 shouldn't be used for "normal" application logic. Several built\-in intercepting behaviors
 are provided through factories in the respective `Behaviors`.
 

 If the interceptor does keep mutable state care must be taken to create a new instance from
 the factory function of `Behaviors.intercept` so that a new instance is created per spawned
 actor rather than shared among actor instance.
 

 param: interceptMessageClass Ensures that the interceptor will only receive `O` message types.
 If the message is not of this class or a subclass thereof
 (e.g. a private protocol) will bypass the interceptor and be
 continue to the inner behavior untouched.
 

See Also:
[`BehaviorSignalInterceptor`](BehaviorSignalInterceptor.html "class in akka.actor.typed")

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static interface` | `[BehaviorInterceptor.PreStartTarget](BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](BehaviorInterceptor.PreStartTarget.html "type parameter in BehaviorInterceptor.PreStartTarget")>` | Abstraction of passing the on further in the behavior stack in [`aroundStart(akka.actor.typed.TypedActorContext<Outer>, akka.actor.typed.BehaviorInterceptor.PreStartTarget<Inner>)`](#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget)). |
	| `static interface` | `[BehaviorInterceptor.ReceiveTarget](BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](BehaviorInterceptor.ReceiveTarget.html "type parameter in BehaviorInterceptor.ReceiveTarget")>` | Abstraction of passing the message on further in the behavior stack in [`aroundReceive(akka.actor.typed.TypedActorContext<Outer>, Outer, akka.actor.typed.BehaviorInterceptor.ReceiveTarget<Inner>)`](#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget)). |
	| `static interface` | `[BehaviorInterceptor.SignalTarget](BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")>` | Abstraction of passing the signal on further in the behavior stack in [`aroundReceive(akka.actor.typed.TypedActorContext<Outer>, Outer, akka.actor.typed.BehaviorInterceptor.ReceiveTarget<Inner>)`](#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget)). |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BehaviorInterceptor](#%3Cinit%3E(java.lang.Class))​(java.lang.Class<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> interceptMessageClass)` |  |
	| `[BehaviorInterceptor](#%3Cinit%3E(scala.reflect.ClassTag))​(scala.reflect.ClassTag<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> interceptMessageClassTag)` | Scala API: The `ClassTag` for `Outer` ensures that only messages of this class or a subclass  thereof will be intercepted. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `abstract [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")>` | `[aroundReceive](#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> ctx,  [Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor") msg,  [BehaviorInterceptor.ReceiveTarget](BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> target)` | Intercept a message sent to the running actor. |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")>` | `[aroundSignal](#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> ctx,  [Signal](Signal.html "interface in akka.actor.typed") signal,  [BehaviorInterceptor.SignalTarget](BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> target)` | Override to intercept a signal sent to the running actor. |
	| `[Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")>` | `[aroundStart](#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> ctx,  [BehaviorInterceptor.PreStartTarget](BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> target)` | Override to intercept actor startup. |
	| `java.lang.Class<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")>` | `[interceptMessageClass](#interceptMessageClass())()` |  |
	| `boolean` | `[isSame](#isSame(akka.actor.typed.BehaviorInterceptor))​([BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​java.lang.Object> other)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BehaviorInterceptor
		
		
		
		```
		public BehaviorInterceptor​(java.lang.Class<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> interceptMessageClass)
		```
		- #### BehaviorInterceptor
		
		
		
		```
		public BehaviorInterceptor​(scala.reflect.ClassTag<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> interceptMessageClassTag)
		```
		
		Scala API: The `ClassTag` for `Outer` ensures that only messages of this class or a subclass
		 thereof will be intercepted. Other message types (e.g. a private protocol) will bypass the
		 interceptor and be continue to the inner behavior untouched.

	- ### Method Detail
	
	
	
		- #### interceptMessageClass
		
		
		
		```
		public java.lang.Class<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> interceptMessageClass()
		```
		- #### aroundStart
		
		
		
		```
		public [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> aroundStart​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> ctx,
		                                   [BehaviorInterceptor.PreStartTarget](BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> target)
		```
		
		Override to intercept actor startup. To trigger startup of
		 the next behavior in the stack, call `target.start()`.
		
		Returns:
		The returned behavior will be the "started" behavior of the actor used to accept
		 the next message or signal.
		- #### aroundReceive
		
		
		
		```
		public abstract [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> aroundReceive​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> ctx,
		                                              [Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor") msg,
		                                              [BehaviorInterceptor.ReceiveTarget](BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> target)
		```
		
		Intercept a message sent to the running actor. Pass the message on to the next behavior
		 in the stack by passing it to `target.apply`, return `Behaviors.same` without invoking `target`
		 to filter out the message.
		 
		
		Returns:
		The behavior for next message or signal
		- #### aroundSignal
		
		
		
		```
		public [Behavior](Behavior.html "class in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> aroundSignal​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[Outer](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> ctx,
		                                    [Signal](Signal.html "interface in akka.actor.typed") signal,
		                                    [BehaviorInterceptor.SignalTarget](BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[Inner](BehaviorInterceptor.html "type parameter in BehaviorInterceptor")> target)
		```
		
		Override to intercept a signal sent to the running actor. Pass the signal on to the next behavior
		 in the stack by passing it to `target.apply`.
		 
		
		Returns:
		The behavior for next message or signal
		 
		See Also:
		[`BehaviorSignalInterceptor`](BehaviorSignalInterceptor.html "class in akka.actor.typed")
		- #### isSame
		
		
		
		```
		public boolean isSame​([BehaviorInterceptor](BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​java.lang.Object> other)
		```
		
		
		Returns:
		`true` if this behavior logically the same as another behavior interceptor and can therefore be eliminated
		 (to avoid building infinitely growing stacks of behaviors)? Default implementation is based on instance
		 equality. Override to provide use case specific logic.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.PreStartTarget.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.ReceiveTarget.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/internal/AbstractSupervisor.html
- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.html](https://doc.akka.io/japi/akka-core/current/akka/actor/typed/BehaviorInterceptor.html)*