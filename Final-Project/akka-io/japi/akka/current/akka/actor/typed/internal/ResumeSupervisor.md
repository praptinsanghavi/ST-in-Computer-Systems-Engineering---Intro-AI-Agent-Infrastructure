---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:55:27Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ResumeSupervisor.html
title: ResumeSupervisor
---

# ResumeSupervisor

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class ResumeSupervisor\<T,​Thr extends java.lang.Throwable\>

- java.lang.Object
- - [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")\<java.lang.Object,​I\>
	- - [akka.actor.typed.internal.AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr\>
		- - [akka.actor.typed.internal.SimpleSupervisor](SimpleSupervisor.html "class in akka.actor.typed.internal")\<T,​Thr\>
			- - akka.actor.typed.internal.ResumeSupervisor\<T,​Thr\>

- ---

```
public class ResumeSupervisor<T,​Thr extends java.lang.Throwable>
extends [SimpleSupervisor](SimpleSupervisor.html "class in akka.actor.typed.internal")<T,​Thr>
```

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.PreStartTarget.html "type parameter in BehaviorInterceptor.PreStartTarget")>, [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.ReceiveTarget.html "type parameter in BehaviorInterceptor.ReceiveTarget")>, [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ResumeSupervisor](#%3Cinit%3E(akka.actor.typed.SupervisorStrategy.Resume,scala.reflect.ClassTag))​(akka.actor.typed.SupervisorStrategy.Resume ss,  scala.reflect.ClassTag<[Thr](ResumeSupervisor.html "type parameter in ResumeSupervisor")> evidence$4)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ResumeSupervisor.html "type parameter in ResumeSupervisor")>>` | `[handleException](#handleException(akka.actor.typed.TypedActorContext))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx)` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.internal.[SimpleSupervisor](SimpleSupervisor.html "class in akka.actor.typed.internal")
		
		
		`[aroundReceive](SimpleSupervisor.html#aroundReceive(akka.actor.typed.TypedActorContext,java.lang.Object,akka.actor.typed.BehaviorInterceptor.ReceiveTarget)), [handleExceptionOnStart](SimpleSupervisor.html#handleExceptionOnStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget)), [handleReceiveException](SimpleSupervisor.html#handleReceiveException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.ReceiveTarget)), [handleSignalException](SimpleSupervisor.html#handleSignalException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.SignalTarget))`
		- ### Methods inherited from class akka.actor.typed.internal.[AbstractSupervisor](AbstractSupervisor.html "class in akka.actor.typed.internal")
		
		
		`[aroundSignal](AbstractSupervisor.html#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget)), [aroundStart](AbstractSupervisor.html#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget)), [dropped](AbstractSupervisor.html#dropped(akka.actor.typed.TypedActorContext,java.lang.Object)), [isInstanceOfTheThrowableClass](AbstractSupervisor.html#isInstanceOfTheThrowableClass(java.lang.Throwable)), [isSame](AbstractSupervisor.html#isSame(akka.actor.typed.BehaviorInterceptor)), [log](AbstractSupervisor.html#log(akka.actor.typed.TypedActorContext,java.lang.Throwable)), [log](AbstractSupervisor.html#log(akka.actor.typed.TypedActorContext,java.lang.Throwable,int)), [toString](AbstractSupervisor.html#toString())`
		- ### Methods inherited from class akka.actor.typed.[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[interceptMessageClass](../BehaviorInterceptor.html#interceptMessageClass())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ResumeSupervisor
		
		
		
		```
		public ResumeSupervisor​(akka.actor.typed.SupervisorStrategy.Resume ss,
		                        scala.reflect.ClassTag<[Thr](ResumeSupervisor.html "type parameter in ResumeSupervisor")> evidence$4)
		```

	- ### Method Detail
	
	
	
		- #### handleException
		
		
		
		```
		protected scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[T](ResumeSupervisor.html "type parameter in ResumeSupervisor")>> handleException​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx)
		```
		
		
		Overrides:
		`[handleException](SimpleSupervisor.html#handleException(akka.actor.typed.TypedActorContext))` in class `[SimpleSupervisor](SimpleSupervisor.html "class in akka.actor.typed.internal")<[T](ResumeSupervisor.html "type parameter in ResumeSupervisor"),​[Thr](ResumeSupervisor.html "type parameter in ResumeSupervisor") extends java.lang.Throwable>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.PreStartTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.ReceiveTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/AbstractSupervisor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ResumeSupervisor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/SimpleSupervisor.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ResumeSupervisor.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/ResumeSupervisor.html)*