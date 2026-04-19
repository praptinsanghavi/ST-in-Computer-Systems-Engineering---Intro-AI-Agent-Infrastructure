---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterImpl.html
title: PoolRouterImpl
---

# PoolRouterImpl

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class PoolRouterImpl\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - [akka.actor.typed.scaladsl.AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")\<T\>
			- - akka.actor.typed.internal.routing.PoolRouterImpl\<T\>

- ---

```
public final class PoolRouterImpl<T>
extends [AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")<T>
```

INTERNAL API

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolRouterImpl](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,int,akka.actor.typed.Behavior,akka.actor.typed.internal.routing.RoutingLogic,scala.Function1,akka.actor.typed.Props))​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> ctx,  int poolSize,  [Behavior](../../Behavior.html "class in akka.actor.typed")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> behavior,  [RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> logic,  scala.Function1<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl"),​java.lang.Object> broadcastPredicate,  [Props](../../Props.html "class in akka.actor.typed") routeeProps)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../Behavior.html "class in akka.actor.typed")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")>` | `[onMessage](#onMessage(T))​([T](PoolRouterImpl.html "type parameter in PoolRouterImpl") msg)` | Implement this method to process an incoming message and return the next behavior. |
	| `scala.PartialFunction<[Signal](../../Signal.html "interface in akka.actor.typed"),​[Behavior](../../Behavior.html "class in akka.actor.typed")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")>>` | `[onSignal](#onSignal())()` | Override this method to process an incoming [`Signal`](../../Signal.html "interface in akka.actor.typed") and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.scaladsl.[AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")
		
		
		`[context](../../scaladsl/AbstractBehavior.html#context()), [receive](../../scaladsl/AbstractBehavior.html#receive(akka.actor.typed.TypedActorContext,T)), [receiveSignal](../../scaladsl/AbstractBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../Behavior.html#narrow()), [start](../../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PoolRouterImpl
		
		
		
		```
		public PoolRouterImpl​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> ctx,
		                      int poolSize,
		                      [Behavior](../../Behavior.html "class in akka.actor.typed")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> behavior,
		                      [RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> logic,
		                      scala.Function1<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl"),​java.lang.Object> broadcastPredicate,
		                      [Props](../../Props.html "class in akka.actor.typed") routeeProps)
		```

	- ### Method Detail
	
	
	
		- #### onMessage
		
		
		
		```
		public [Behavior](../../Behavior.html "class in akka.actor.typed")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")> onMessage​([T](PoolRouterImpl.html "type parameter in PoolRouterImpl") msg)
		```
		
		Description copied from class: `[AbstractBehavior](../../scaladsl/AbstractBehavior.html#onMessage(T))`
		Implement this method to process an incoming message and return the next behavior.
		 
		 The returned behavior can in addition to normal behaviors be one of the canned special objects:
		 
		
		
			- returning `stopped` will terminate this Behavior
			- returning `this` or `same` designates to reuse the current Behavior
			- returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		
		
		Specified by:
		`[onMessage](../../scaladsl/AbstractBehavior.html#onMessage(T))` in class `[AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")>`
		- #### onSignal
		
		
		
		```
		public scala.PartialFunction<[Signal](../../Signal.html "interface in akka.actor.typed"),​[Behavior](../../Behavior.html "class in akka.actor.typed")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")>> onSignal()
		```
		
		Description copied from class: `[AbstractBehavior](../../scaladsl/AbstractBehavior.html#onSignal())`
		Override this method to process an incoming [`Signal`](../../Signal.html "interface in akka.actor.typed") and return the next behavior.
		 This means that all lifecycle hooks, ReceiveTimeout, Terminated and Failed messages
		 can initiate a behavior change.
		 
		 The returned behavior can in addition to normal behaviors be one of the canned special objects:
		 
		
		
		 \* returning `stopped` will terminate this Behavior
		 \* returning `this` or `same` designates to reuse the current Behavior
		 \* returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		 
		
		
		 By default, partial function is empty and does not handle any signals.
		
		
		
		Overrides:
		`[onSignal](../../scaladsl/AbstractBehavior.html#onSignal())` in class `[AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")<[T](PoolRouterImpl.html "type parameter in PoolRouterImpl")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterImpl.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterImpl.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/internal/routing/PoolRouterImpl.html)*