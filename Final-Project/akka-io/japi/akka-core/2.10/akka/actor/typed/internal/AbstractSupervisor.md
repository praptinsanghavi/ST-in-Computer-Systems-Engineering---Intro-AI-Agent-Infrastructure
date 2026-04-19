---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AbstractSupervisor.html
title: AbstractSupervisor
---

# AbstractSupervisor

## Content

Package [akka.actor.typed.internal](package-summary.html)
## Class AbstractSupervisor\<I,​Thr extends java.lang.Throwable\>

- java.lang.Object
- - [akka.actor.typed.BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")\<java.lang.Object,​I\>
	- - akka.actor.typed.internal.AbstractSupervisor\<I,​Thr\>

- Direct Known Subclasses:
`[RestartSupervisor](RestartSupervisor.html "class in akka.actor.typed.internal")`, `[SimpleSupervisor](SimpleSupervisor.html "class in akka.actor.typed.internal")`

---

```
public abstract class AbstractSupervisor<I,​Thr extends java.lang.Throwable>
extends [BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​I>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.PreStartTarget.html "type parameter in BehaviorInterceptor.PreStartTarget")>, [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.ReceiveTarget.html "type parameter in BehaviorInterceptor.ReceiveTarget")>, [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[T](../BehaviorInterceptor.SignalTarget.html "type parameter in BehaviorInterceptor.SignalTarget")>`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractSupervisor](#%3Cinit%3E(akka.actor.typed.SupervisorStrategy,scala.reflect.ClassTag))​([SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,  scala.reflect.ClassTag<[Thr](AbstractSupervisor.html "type parameter in AbstractSupervisor")> ev)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>` | `[aroundSignal](#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [Signal](../Signal.html "interface in akka.actor.typed") signal,  [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)` | Override to intercept a signal sent to the running actor. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>` | `[aroundStart](#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)` | Override to intercept actor startup. |
	| `void` | `[dropped](#dropped(akka.actor.typed.TypedActorContext,java.lang.Object))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<?> ctx,  java.lang.Object signalOrMessage)` |  |
	| `protected abstract scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>>` | `[handleExceptionOnStart](#handleExceptionOnStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)` |  |
	| `protected abstract scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>>` | `[handleReceiveException](#handleReceiveException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.ReceiveTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)` |  |
	| `protected abstract scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>>` | `[handleSignalException](#handleSignalException(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.SignalTarget))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,  [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)` |  |
	| `protected boolean` | `[isInstanceOfTheThrowableClass](#isInstanceOfTheThrowableClass(java.lang.Throwable))​(java.lang.Throwable t)` |  |
	| `boolean` | `[isSame](#isSame(akka.actor.typed.BehaviorInterceptor))​([BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​java.lang.Object> other)` |  |
	| `void` | `[log](#log(akka.actor.typed.TypedActorContext,java.lang.Throwable))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<?> ctx,  java.lang.Throwable t)` |  |
	| `void` | `[log](#log(akka.actor.typed.TypedActorContext,java.lang.Throwable,int))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<?> ctx,  java.lang.Throwable t,  int errorCount)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.actor.typed.[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")
		
		
		`[aroundReceive](../BehaviorInterceptor.html#aroundReceive(akka.actor.typed.TypedActorContext,Outer,akka.actor.typed.BehaviorInterceptor.ReceiveTarget)), [interceptMessageClass](../BehaviorInterceptor.html#interceptMessageClass())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractSupervisor
		
		
		
		```
		public AbstractSupervisor​([SupervisorStrategy](../SupervisorStrategy.html "class in akka.actor.typed") strategy,
		                          scala.reflect.ClassTag<[Thr](AbstractSupervisor.html "type parameter in AbstractSupervisor")> ev)
		```

	- ### Method Detail
	
	
	
		- #### aroundSignal
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> aroundSignal​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                [Signal](../Signal.html "interface in akka.actor.typed") signal,
		                                [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)
		```
		
		Description copied from class: `[BehaviorInterceptor](../BehaviorInterceptor.html#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget))`
		Override to intercept a signal sent to the running actor. Pass the signal on to the next behavior
		 in the stack by passing it to `target.apply`.
		 
		
		Overrides:
		`[aroundSignal](../BehaviorInterceptor.html#aroundSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal,akka.actor.typed.BehaviorInterceptor.SignalTarget))` in class `[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>`
		Returns:
		The behavior for next message or signal
		 
		See Also:
		[`BehaviorSignalInterceptor`](../BehaviorSignalInterceptor.html "class in akka.actor.typed")
		- #### aroundStart
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> aroundStart​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                               [BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)
		```
		
		Description copied from class: `[BehaviorInterceptor](../BehaviorInterceptor.html#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))`
		Override to intercept actor startup. To trigger startup of
		 the next behavior in the stack, call `target.start()`.
		
		Overrides:
		`[aroundStart](../BehaviorInterceptor.html#aroundStart(akka.actor.typed.TypedActorContext,akka.actor.typed.BehaviorInterceptor.PreStartTarget))` in class `[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>`
		Returns:
		The returned behavior will be the "started" behavior of the actor used to accept
		 the next message or signal.
		- #### dropped
		
		
		
		```
		public void dropped​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<?> ctx,
		                    java.lang.Object signalOrMessage)
		```
		- #### handleExceptionOnStart
		
		
		
		```
		protected abstract scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>> handleExceptionOnStart​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                                                                                       [BehaviorInterceptor.PreStartTarget](../BehaviorInterceptor.PreStartTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)
		```
		- #### handleReceiveException
		
		
		
		```
		protected abstract scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>> handleReceiveException​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                                                                                       [BehaviorInterceptor.ReceiveTarget](../BehaviorInterceptor.ReceiveTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)
		```
		- #### handleSignalException
		
		
		
		```
		protected abstract scala.PartialFunction<java.lang.Throwable,​[Behavior](../Behavior.html "class in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>> handleSignalException​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<java.lang.Object> ctx,
		                                                                                                      [BehaviorInterceptor.SignalTarget](../BehaviorInterceptor.SignalTarget.html "interface in akka.actor.typed")<[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")> target)
		```
		- #### isInstanceOfTheThrowableClass
		
		
		
		```
		protected boolean isInstanceOfTheThrowableClass​(java.lang.Throwable t)
		```
		- #### isSame
		
		
		
		```
		public boolean isSame​([BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​java.lang.Object> other)
		```
		
		
		Overrides:
		`[isSame](../BehaviorInterceptor.html#isSame(akka.actor.typed.BehaviorInterceptor))` in class `[BehaviorInterceptor](../BehaviorInterceptor.html "class in akka.actor.typed")<java.lang.Object,​[I](AbstractSupervisor.html "type parameter in AbstractSupervisor")>`
		Returns:
		`true` if this behavior logically the same as another behavior interceptor and can therefore be eliminated
		 (to avoid building infinitely growing stacks of behaviors)? Default implementation is based on instance
		 equality. Override to provide use case specific logic.
		- #### log
		
		
		
		```
		public void log​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<?> ctx,
		                java.lang.Throwable t)
		```
		- #### log
		
		
		
		```
		public void log​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<?> ctx,
		                java.lang.Throwable t,
		                int errorCount)
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.PreStartTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.ReceiveTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.SignalTarget.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorSignalInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/SupervisorStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AbstractSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/RestartSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/SimpleSupervisor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AbstractSupervisor.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/AbstractSupervisor.html)*