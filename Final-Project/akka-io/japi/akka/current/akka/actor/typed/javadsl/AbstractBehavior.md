---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html
title: AbstractBehavior
---

# AbstractBehavior

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class AbstractBehavior\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - akka.actor.typed.javadsl.AbstractBehavior\<T\>

- ---

```
public abstract class AbstractBehavior<T>
extends [ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<T>
```

An actor `Behavior` can be implemented by extending this class and implement the
 abstract method [`createReceive()`](#createReceive()). Mutable state can be defined
 as instance variables of the class.
 
 This is an Object\-oriented style of defining a `Behavior`. A more functional style
 alternative is provided by the factory methods in [`Behaviors`](Behaviors.html "class in akka.actor.typed.javadsl"), for example
 `Behaviors.receiveMessage`.
 

 Instances of this behavior should be created via `Behaviors.setup` and
 the [`ActorContext`](ActorContext.html "interface in akka.actor.typed.javadsl") should be passed as a constructor parameter
 from the factory function. This is important because a new instance
 should be created when restart supervision is used.
 

 When switching `Behavior` to another `AbstractBehavior` the original `ActorContext`
 can be used as the `context` parameter instead of wrapping in a new `Behaviors.setup`,
 but it wouldn't be wrong to use `context` from `Behaviors.setup` since that is the same
 `ActorContext` instance.
 

 It must not be created with an `ActorContext` of another actor, such as the parent actor.
 Such mistake will be detected at runtime and throw `IllegalStateException` when the
 first message is received.
 

See Also:
`Behaviors.setup`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractBehavior](#%3Cinit%3E(akka.actor.typed.javadsl.ActorContext))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> context)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected abstract [Receive](Receive.html "class in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>` | `[createReceive](#createReceive())()` | Implement this to define how messages and signals are processed. |
	| `protected [ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>` | `[getContext](#getContext())()` |  |
	| `protected [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>` | `[newReceiveBuilder](#newReceiveBuilder())()` | Create a new [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.actor.typed.javadsl") to define the message dispatch of the `Behavior`. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>` | `[receive](#receive(akka.actor.typed.TypedActorContext,T))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> ctx,  [T](AbstractBehavior.html "type parameter in AbstractBehavior") msg)` | Process an incoming message and return the next behavior. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> ctx,  [Signal](../Signal.html "interface in akka.actor.typed") msg)` | Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractBehavior
		
		
		
		```
		public AbstractBehavior​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> context)
		```

	- ### Method Detail
	
	
	
		- #### createReceive
		
		
		
		```
		protected abstract [Receive](Receive.html "class in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> createReceive()
		```
		
		Implement this to define how messages and signals are processed. Use the
		 `AbstractBehavior.newReceiveBuilder` to define the message dispatch.
		- #### getContext
		
		
		
		```
		protected [ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> getContext()
		```
		- #### newReceiveBuilder
		
		
		
		```
		protected [ReceiveBuilder](ReceiveBuilder.html "class in akka.actor.typed.javadsl")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> newReceiveBuilder()
		```
		
		Create a new [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.actor.typed.javadsl") to define the message dispatch of the `Behavior`.
		 Typically used from `AbstractBehavior.createReceive`.
		- #### receive
		
		
		
		```
		public final [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> receive​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> ctx,
		                                 [T](AbstractBehavior.html "type parameter in AbstractBehavior") msg)
		                          throws java.lang.Exception
		```
		
		Description copied from class: `[ExtensibleBehavior](../ExtensibleBehavior.html#receive(akka.actor.typed.TypedActorContext,T))`
		Process an incoming message and return the next behavior.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		 Code calling this method should use [`Behavior$`](../Behavior$.html "class in akka.actor.typed") `canonicalize` to replace
		 the special objects with real Behaviors.
		
		
		
		Specified by:
		`[receive](../ExtensibleBehavior.html#receive(akka.actor.typed.TypedActorContext,T))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>`
		Throws:
		`java.lang.Exception`
		- #### receiveSignal
		
		
		
		```
		public final [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> receiveSignal​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")> ctx,
		                                       [Signal](../Signal.html "interface in akka.actor.typed") msg)
		                                throws java.lang.Exception
		```
		
		Description copied from class: `[ExtensibleBehavior](../ExtensibleBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))`
		Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. This means
		 that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
		 can initiate a behavior change.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		 Code calling this method should use [`Behavior$`](../Behavior$.html "class in akka.actor.typed") `canonicalize` to replace
		 the special objects with real Behaviors.
		
		
		
		Specified by:
		`[receiveSignal](../ExtensibleBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](AbstractBehavior.html "type parameter in AbstractBehavior")>`
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html)*