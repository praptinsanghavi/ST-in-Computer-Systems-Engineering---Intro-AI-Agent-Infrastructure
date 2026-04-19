---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:58:47Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SimpleSupervisor.html
title: SimpleSupervisor
---

# SimpleSupervisor

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class SimpleSupervisor\<T,​Thr extends java.lang.Throwable\>

- java.lang.Object
- - [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")\<java.lang.Object,​I\>
	- - [akka.actor.typed.internal.AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr\>
		- - akka.actor.typed.internal.SimpleSupervisor\<T,​Thr\>

- Direct Known Subclasses:
`[ResumeSupervisor](ResumeSupervisor.html "class in akka.actor.typed.internal")`, `[StopSupervisor](StopSupervisor.html "class in akka.actor.typed.internal")`

---

```
public abstract class SimpleSupervisor<T,​Thr extends java.lang.Throwable>
extends [AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")<T,​Thr>
```

For cases where O \=\= I for BehaviorInterceptor.

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.PreStartTarget.html "type parameter in BehaviorInterceptor.PreStartTarget")>, [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.ReceiveTarget.html "type parameter in BehaviorInterceptor.ReceiveTarget")>, [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SimpleSupervisor](#%3Cinit%3E(akka.actor.typed.SupervisorStrategy,scala.reflect.ClassTag))​([SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") ss,  scala.reflect.ClassTag<[Thr](SimpleSupervisor.html "type parameter in SimpleSupervisor")> evidence$2)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>` | `[aroundReceive](#aroundReceive(akka.actor.typed.TypedActorContext,java.lang.Object,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  java.lang.Object msg,  [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)` | Intercept a message sent to the running actor. |
	| `protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>>` | `[handleException](#handleException(akka.actor.typed.TypedActorContext))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx)` |  |
	| `protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>>` | `[handleExceptionOnStart](#handleExceptionOnStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)` |  |
	| `protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>>` | `[handleReceiveException](#handleReceiveException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)` |  |
	| `protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>>` | `[handleSignalException](#handleSignalException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.SignalTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.internal.[AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")
		
		
		`[aroundSignal](AbstractSupervisor.html#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget)), [aroundStart](AbstractSupervisor.html#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget)), [dropped](AbstractSupervisor.html#dropped(akka.actor.typed.TypedActorContext,java.lang.Object)), [isInstanceOfTheThrowableClass](AbstractSupervisor.html#isInstanceOfTheThrowableClass(java.lang.Throwable)), [isSame](AbstractSupervisor.html#isSame(akka.actor.typed.BehaviorInterceptor)), [log](AbstractSupervisor.html#log(akka.actor.typed.TypedActorContext,java.lang.Throwable)), [log](AbstractSupervisor.html#log(akka.actor.typed.TypedActorContext,java.lang.Throwable,int)), [toString](AbstractSupervisor.html#toString())`
		- ### Methods inherited from class akka.actor.typed.[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[interceptMessageClass](../BehaviorInterceptor.html#interceptMessageClass())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### SimpleSupervisor
		
		
		
		```
		public SimpleSupervisor​([SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") ss,
		                        scala.reflect.ClassTag<[Thr](SimpleSupervisor.html "type parameter in SimpleSupervisor")> evidence$2)
		```

	- ### Method Detail
	
	
	
		- #### aroundReceive
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> aroundReceive​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                 java.lang.Object msg,
		                                 [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)
		```
		
		Description copied from class: `[BehaviorInterceptor](../BehaviorInterceptor.html#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))`
		Intercept a message sent to the running actor. Pass the message on to the next behavior
		 in the stack by passing it to `target.apply`, return `Behaviors.same` without invoking `target`
		 to filter out the message.
		 
		
		Specified by:
		`[aroundReceive](../BehaviorInterceptor.html#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))` in class `[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>`
		Returns:
		The behavior for next message or signal
		- #### handleException
		
		
		
		```
		protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>> handleException​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx)
		```
		- #### handleExceptionOnStart
		
		
		
		```
		protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>> handleExceptionOnStart​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                                                                              [BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)
		```
		
		
		Specified by:
		`[handleExceptionOnStart](AbstractSupervisor.html#handleExceptionOnStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))` in class `[AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor"),​[Thr](SimpleSupervisor.html "type parameter in SimpleSupervisor") extends java.lang.Throwable>`
		- #### handleReceiveException
		
		
		
		```
		protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>> handleReceiveException​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                                                                              [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)
		```
		
		
		Specified by:
		`[handleReceiveException](AbstractSupervisor.html#handleReceiveException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))` in class `[AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor"),​[Thr](SimpleSupervisor.html "type parameter in SimpleSupervisor") extends java.lang.Throwable>`
		- #### handleSignalException
		
		
		
		```
		protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")>> handleSignalException​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                                                                             [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor")> target)
		```
		
		
		Specified by:
		`[handleSignalException](AbstractSupervisor.html#handleSignalException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.SignalTarget))` in class `[AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")<[T](SimpleSupervisor.html "type parameter in SimpleSupervisor"),​[Thr](SimpleSupervisor.html "type parameter in SimpleSupervisor") extends java.lang.Throwable>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.PreStartTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.ReceiveTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AbstractSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/ResumeSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SimpleSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/StopSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SimpleSupervisor.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SimpleSupervisor.html)*