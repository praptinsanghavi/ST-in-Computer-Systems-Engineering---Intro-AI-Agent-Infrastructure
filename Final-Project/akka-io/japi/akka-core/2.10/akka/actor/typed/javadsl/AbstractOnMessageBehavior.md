---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:21:44Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
title: AbstractOnMessageBehavior
---

# AbstractOnMessageBehavior

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class AbstractOnMessageBehavior\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - akka.actor.typed.javadsl.AbstractOnMessageBehavior\<T\>

- ---

```
public abstract class AbstractOnMessageBehavior<T>
extends [ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<T>
```

An actor `Behavior` can be implemented by extending this class and implementing the abstract
 method [`onMessage(T)`](#onMessage(T)). Mutable state can be defined as instance
 variables of the class.
 
 This is an object\-oriented style of defining a `Behavior`. A more functional style alternative
 is provided by the factory methods in [`Behaviors`](Behaviors.html "class in akka.actor.typed.javadsl"), for example `Behaviors.receiveMessage`.
 

 An alternative object\-oriented style is found in [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl"), which uses builders to
 define the `Behavior`. In contrast to extending [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl"), extending this class
 should have reduced overhead, though depending on the complexity of the protocol handled by
 this actor and on the Java version in use, the `onMessage` and `onSignal` methods may be overly
 complex.
 

 Instances of this behavior should be created via `Behaviors.setup` and the [`ActorContext`](ActorContext.html "interface in akka.actor.typed.javadsl") should
 be passed as a constructor parameter from the factory function. This is important because a new
 instance should be created when restart supervision is used.
 

 When switching behavior to another behavior which requires a context, the original `ActorContext` can
 be used or a `Behaviors.setup` can be used: either will end up using the same `ActorContext` instance.
 

 It must not be created with an `ActorContext` of another actor (e.g. the parent actor). Doing so
 will be detected at runtime and throw an `IllegalStateException` when the first message is received.
 

See Also:
`Behaviors.setup`

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[AbstractOnMessageBehavior](#%3Cinit%3E(akka.actor.typed.javadsl.ActorContext))​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> context)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `protected [ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>` | `[getContext](#getContext())()` |  |
	| `abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>` | `[onMessage](#onMessage(T))​([T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior") message)` | Implement this to define how messages are processed. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>` | `[onSignal](#onSignal(akka.actor.typed.Signal))​([Signal](../Signal.html "interface in akka.actor.typed") signal)` | Override this to handle a signal. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>` | `[receive](#receive(akka.actor.typed.TypedActorContext,T))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> ctx,  [T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior") msg)` | Process an incoming message and return the next behavior. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> ctx,  [Signal](../Signal.html "interface in akka.actor.typed") signal)` | Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### AbstractOnMessageBehavior
		
		
		
		```
		public AbstractOnMessageBehavior​([ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> context)
		```

	- ### Method Detail
	
	
	
		- #### getContext
		
		
		
		```
		protected final [ActorContext](ActorContext.html "interface in akka.actor.typed.javadsl")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> getContext()
		```
		- #### onMessage
		
		
		
		```
		public abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> onMessage​([T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior") message)
		                               throws java.lang.Exception
		```
		
		Implement this to define how messages are processed. To indicate no change in behavior beyond
		 changes due to updating instance variables of this class, one may return either `this` or `Behaviors.same`.
		
		Throws:
		`java.lang.Exception`
		- #### onSignal
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> onSignal​([Signal](../Signal.html "interface in akka.actor.typed") signal)
		                     throws java.lang.Exception
		```
		
		Override this to handle a signal. The default implementation handles only `MessageAdaptionFailure` and
		 otherwise ignores the signal.
		
		Throws:
		`java.lang.Exception`
		- #### receive
		
		
		
		```
		public final [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> receive​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> ctx,
		                                 [T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior") msg)
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
		`[receive](../ExtensibleBehavior.html#receive(akka.actor.typed.TypedActorContext,T))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>`
		Throws:
		`java.lang.Exception`
		- #### receiveSignal
		
		
		
		```
		public final [Behavior](../Behavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> receiveSignal​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")> ctx,
		                                       [Signal](../Signal.html "interface in akka.actor.typed") signal)
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
		`[receiveSignal](../ExtensibleBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](AbstractOnMessageBehavior.html "type parameter in AbstractOnMessageBehavior")>`
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/ActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html)*