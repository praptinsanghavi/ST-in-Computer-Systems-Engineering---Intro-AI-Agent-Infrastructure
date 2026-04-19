---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltBehavior.html
title: BuiltBehavior
---

# BuiltBehavior

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class BuiltBehavior\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - akka.actor.typed.javadsl.BuiltBehavior\<T\>

- ---

```
public final class BuiltBehavior<T>
extends [ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<T>
```

The concrete behavior
 
 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BuiltBehavior](#%3Cinit%3E(akka.actor.typed.javadsl.BehaviorBuilder.Case%5B%5D,akka.actor.typed.javadsl.BehaviorBuilder.Case%5B%5D))​(akka.actor.typed.javadsl.BehaviorBuilder.Case<[T](BuiltBehavior.html "type parameter in BuiltBehavior"),​[T](BuiltBehavior.html "type parameter in BuiltBehavior")>[] messageHandlers,  akka.actor.typed.javadsl.BehaviorBuilder.Case<[T](BuiltBehavior.html "type parameter in BuiltBehavior"),​[Signal](../Signal.html "interface in akka.actor.typed")>[] signalHandlers)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")>` | `[receive](#receive(akka.actor.typed.TypedActorContext,T))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")> ctx,  [T](BuiltBehavior.html "type parameter in BuiltBehavior") msg)` | Process an incoming message and return the next behavior. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")> ctx,  [Signal](../Signal.html "interface in akka.actor.typed") msg)` | Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BuiltBehavior
		
		
		
		```
		public BuiltBehavior​(akka.actor.typed.javadsl.BehaviorBuilder.Case<[T](BuiltBehavior.html "type parameter in BuiltBehavior"),​[T](BuiltBehavior.html "type parameter in BuiltBehavior")>[] messageHandlers,
		                     akka.actor.typed.javadsl.BehaviorBuilder.Case<[T](BuiltBehavior.html "type parameter in BuiltBehavior"),​[Signal](../Signal.html "interface in akka.actor.typed")>[] signalHandlers)
		```

	- ### Method Detail
	
	
	
		- #### receive
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")> receive​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")> ctx,
		                           [T](BuiltBehavior.html "type parameter in BuiltBehavior") msg)
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
		`[receive](../ExtensibleBehavior.html#receive(akka.actor.typed.TypedActorContext,T))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")>`
		- #### receiveSignal
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")> receiveSignal​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")> ctx,
		                                 [Signal](../Signal.html "interface in akka.actor.typed") msg)
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
		`[receiveSignal](../ExtensibleBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](BuiltBehavior.html "type parameter in BuiltBehavior")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltBehavior.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltBehavior.html)*