---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:55:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html
title: Receive
---

# Receive

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class Receive\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - akka.actor.typed.javadsl.Receive\<T\>

- Direct Known Subclasses:
`[BuiltReceive](BuiltReceive.html "class in akka.actor.typed.javadsl")`

---

```
public abstract class Receive<T>
extends [ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<T>
```

A specialized "receive" behavior that is implemented using message matching builders,
 such as [`ReceiveBuilder`](ReceiveBuilder.html "class in akka.actor.typed.javadsl"), from [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl").

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Receive](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")>` | `[receive](#receive(akka.actor.typed.TypedActorContext,T))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> ctx,  [T](Receive.html "type parameter in Receive") msg)` | Process an incoming message and return the next behavior. |
	| `abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")>` | `[receiveMessage](#receiveMessage(T))​([T](Receive.html "type parameter in Receive") msg)` | Process an incoming message and return the next behavior. |
	| `abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.Signal))​([Signal](../Signal.html "interface in akka.actor.typed") sig)` | Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> ctx,  [Signal](../Signal.html "interface in akka.actor.typed") sig)` | Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Receive
		
		
		
		```
		public Receive()
		```

	- ### Method Detail
	
	
	
		- #### receive
		
		
		
		```
		public final [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> receive​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> ctx,
		                                 [T](Receive.html "type parameter in Receive") msg)
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
		`[receive](../ExtensibleBehavior.html#receive(akka.actor.typed.TypedActorContext,T))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")>`
		Throws:
		`java.lang.Exception`
		- #### receiveMessage
		
		
		
		```
		public abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> receiveMessage​([T](Receive.html "type parameter in Receive") msg)
		                                    throws java.lang.Exception
		```
		
		Process an incoming message and return the next behavior.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		
		Throws:
		`java.lang.Exception`
		- #### receiveSignal
		
		
		
		```
		public abstract [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> receiveSignal​([Signal](../Signal.html "interface in akka.actor.typed") sig)
		                                   throws java.lang.Exception
		```
		
		Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. This means
		 that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
		 can initiate a behavior change.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		
		
		
		Throws:
		`java.lang.Exception`
		- #### receiveSignal
		
		
		
		```
		public final [Behavior](../Behavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> receiveSignal​([TypedActorContext](../TypedActorContext.html "interface in akka.actor.typed")<[T](Receive.html "type parameter in Receive")> ctx,
		                                       [Signal](../Signal.html "interface in akka.actor.typed") sig)
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
		`[receiveSignal](../ExtensibleBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))` in class `[ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")<[T](Receive.html "type parameter in Receive")>`
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/BuiltReceive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/ReceiveBuilder.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Receive.html)*