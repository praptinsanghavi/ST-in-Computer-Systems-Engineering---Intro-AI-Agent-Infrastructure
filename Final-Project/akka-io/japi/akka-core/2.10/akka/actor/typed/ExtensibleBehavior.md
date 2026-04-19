---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:36:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html
title: ExtensibleBehavior
---

# ExtensibleBehavior

## Content

Package [akka.actor.typed](package-summary.html)
## Class ExtensibleBehavior\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](Behavior.html "class in akka.actor.typed")\<T\>
	- - akka.actor.typed.ExtensibleBehavior\<T\>

- Direct Known Subclasses:
`[AbstractBehavior](javadsl/AbstractBehavior.html "class in akka.actor.typed.javadsl")`, `[AbstractBehavior](scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")`, `[AbstractOnMessageBehavior](javadsl/AbstractOnMessageBehavior.html "class in akka.actor.typed.javadsl")`, `[BehaviorImpl.ReceiveBehavior](internal/BehaviorImpl.ReceiveBehavior.html "class in akka.actor.typed.internal")`, `[BehaviorImpl.ReceiveMessageBehavior](internal/BehaviorImpl.ReceiveMessageBehavior.html "class in akka.actor.typed.internal")`, `[BuiltBehavior](javadsl/BuiltBehavior.html "class in akka.actor.typed.javadsl")`, `[Receive](javadsl/Receive.html "class in akka.actor.typed.javadsl")`

---

```
public abstract class ExtensibleBehavior<T>
extends [Behavior](Behavior.html "class in akka.actor.typed")<T>
```

Extension point for implementing custom behaviors in addition to the existing
 set of behaviors available through the DSLs in [`Behaviors`](scaladsl/Behaviors.html "class in akka.actor.typed.scaladsl") and [`Behaviors`](javadsl/Behaviors.html "class in akka.actor.typed.javadsl")

 Note that behaviors that keep an inner behavior, and intercepts messages for it should not be implemented as
 an extensible behavior but should instead use the [`BehaviorInterceptor`](BehaviorInterceptor.html "class in akka.actor.typed")

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ExtensibleBehavior](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [Behavior](Behavior.html "class in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")>` | `[receive](#receive(akka.actor.typed.TypedActorContext,T))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")> ctx,  [T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior") msg)` | Process an incoming message and return the next behavior. |
	| `abstract [Behavior](Behavior.html "class in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")>` | `[receiveSignal](#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")> ctx,  [Signal](Signal.html "interface in akka.actor.typed") msg)` | Process an incoming [`Signal`](Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.[Behavior](Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](Behavior.html#narrow()), [start](Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### ExtensibleBehavior
		
		
		
		```
		public ExtensibleBehavior()
		```

	- ### Method Detail
	
	
	
		- #### receive
		
		
		
		```
		public abstract [Behavior](Behavior.html "class in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")> receive​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")> ctx,
		                                    [T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior") msg)
		                             throws java.lang.Exception
		```
		
		Process an incoming message and return the next behavior.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		 Code calling this method should use [`Behavior$`](Behavior$.html "class in akka.actor.typed") `canonicalize` to replace
		 the special objects with real Behaviors.
		
		
		
		Throws:
		`java.lang.Exception`
		- #### receiveSignal
		
		
		
		```
		public abstract [Behavior](Behavior.html "class in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")> receiveSignal​([TypedActorContext](TypedActorContext.html "interface in akka.actor.typed")<[T](ExtensibleBehavior.html "type parameter in ExtensibleBehavior")> ctx,
		                                          [Signal](Signal.html "interface in akka.actor.typed") msg)
		                                   throws java.lang.Exception
		```
		
		Process an incoming [`Signal`](Signal.html "interface in akka.actor.typed") and return the next behavior. This means
		 that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
		 can initiate a behavior change.
		 
		 The returned behavior can in addition to normal behaviors be one of the
		 canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		 Code calling this method should use [`Behavior$`](Behavior$.html "class in akka.actor.typed") `canonicalize` to replace
		 the special objects with real Behaviors.
		
		
		
		Throws:
		`java.lang.Exception`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/BehaviorInterceptor.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/TypedActorContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.ReceiveBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.ReceiveMessageBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/AbstractOnMessageBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Behaviors.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/BuiltBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Receive.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/Behaviors.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html)*