---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltReceive.html
title: BuiltReceive
---

# BuiltReceive

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class BuiltReceive\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - [akka.actor.typed.javadsl.Receive](Receive.html "class in akka.actor.typed.javadsl")\<T\>
			- - akka.actor.typed.javadsl.BuiltReceive\<T\>

- ---

```
public final class BuiltReceive<T>
extends [Receive](Receive.html "class in akka.actor.typed.javadsl")<T>
```

Receive type for [`AbstractBehavior`](AbstractBehavior.html "class in akka.actor.typed.javadsl")

 INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[BuiltReceive](#%3Cinit%3E(akka.actor.typed.javadsl.ReceiveBuilder.Case%5B%5D,akka.actor.typed.javadsl.ReceiveBuilder.Case%5B%5D))​(akka.actor.typed.javadsl.ReceiveBuilder.Case<[T](BuiltReceive.html "type parameter in BuiltReceive"),​[T](BuiltReceive.html "type parameter in BuiltReceive")>[] messageHandlers,  akka.actor.typed.javadsl.ReceiveBuilder.Case<[T](BuiltReceive.html "type parameter in BuiltReceive"),​[Signal](../Signal.html "interface in akka.actor.typed")>[] signalHandlers)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltReceive.html "type parameter in BuiltReceive")>` | `[receiveMessage](#receiveMessage(T))​([T](BuiltReceive.html "type parameter in BuiltReceive") msg)` | Process an incoming message and return the next behavior. |
	| `[Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltReceive.html "type parameter in BuiltReceive")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.Signal))​([Signal](../Signal.html "interface in akka.actor.typed") msg)` | Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.javadsl.[Receive](Receive.html "class in akka.actor.typed.javadsl")
		
		
		`[receive](Receive.html#receive(akka.actor.typed.TypedActorContext,T)), [receiveSignal](Receive.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### BuiltReceive
		
		
		
		```
		public BuiltReceive​(akka.actor.typed.javadsl.ReceiveBuilder.Case<[T](BuiltReceive.html "type parameter in BuiltReceive"),​[T](BuiltReceive.html "type parameter in BuiltReceive")>[] messageHandlers,
		                    akka.actor.typed.javadsl.ReceiveBuilder.Case<[T](BuiltReceive.html "type parameter in BuiltReceive"),​[Signal](../Signal.html "interface in akka.actor.typed")>[] signalHandlers)
		```

	- ### Method Detail
	
	
	
		- #### receiveMessage
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltReceive.html "type parameter in BuiltReceive")> receiveMessage​([T](BuiltReceive.html "type parameter in BuiltReceive") msg)
		```
		
		Description copied from class: `[Receive](Receive.html#receiveMessage(T))`
		Process an incoming message and return the next behavior.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		
		Specified by:
		`[receiveMessage](Receive.html#receiveMessage(T))` in class `[Receive](Receive.html "class in akka.actor.typed.javadsl")<[T](BuiltReceive.html "type parameter in BuiltReceive")>`
		- #### receiveSignal
		
		
		
		```
		public [Behavior](../Behavior.html "class in akka.actor.typed")<[T](BuiltReceive.html "type parameter in BuiltReceive")> receiveSignal​([Signal](../Signal.html "interface in akka.actor.typed") msg)
		```
		
		Description copied from class: `[Receive](Receive.html#receiveSignal(akka.actor.typed.Signal))`
		Process an incoming [`Signal`](../Signal.html "interface in akka.actor.typed") and return the next behavior. This means
		 that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
		 can initiate a behavior change.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		
		
		
		Specified by:
		`[receiveSignal](Receive.html#receiveSignal(akka.actor.typed.Signal))` in class `[Receive](Receive.html "class in akka.actor.typed.javadsl")<[T](BuiltReceive.html "type parameter in BuiltReceive")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltReceive.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltReceive.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/javadsl/BuiltReceive.html)*