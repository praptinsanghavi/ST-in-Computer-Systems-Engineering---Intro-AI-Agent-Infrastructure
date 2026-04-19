---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/InitialGroupRouterImpl.html
title: InitialGroupRouterImpl
---

# InitialGroupRouterImpl

## Content

Package [akka.actor.typed.internal.routing](package-summary.html)
## Class InitialGroupRouterImpl\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.ExtensibleBehavior](../../ExtensibleBehavior.html "class in akka.actor.typed")\<T\>
		- - [akka.actor.typed.scaladsl.AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")\<T\>
			- - akka.actor.typed.internal.routing.InitialGroupRouterImpl\<T\>

- ---

```
public final class InitialGroupRouterImpl<T>
extends [AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")<T>
```

INTERNAL API
 
 Starting behavior for a group router before it got a first listing back from the receptionist

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[InitialGroupRouterImpl](#%3Cinit%3E(akka.actor.typed.scaladsl.ActorContext,akka.actor.typed.receptionist.ServiceKey,boolean,akka.actor.typed.internal.routing.RoutingLogic))​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> ctx,  [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> serviceKey,  boolean preferLocalRoutees,  [RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> routingLogic)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../Behavior.html "class in akka.actor.typed")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")>` | `[onMessage](#onMessage(T))​([T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl") msg)` | Implement this method to process an incoming message and return the next behavior. |
	
	
		- ### Methods inherited from class akka.actor.typed.scaladsl.[AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")
		
		
		`[context](../../scaladsl/AbstractBehavior.html#context()), [onSignal](../../scaladsl/AbstractBehavior.html#onSignal()), [receive](../../scaladsl/AbstractBehavior.html#receive(akka.actor.typed.TypedActorContext,T)), [receiveSignal](../../scaladsl/AbstractBehavior.html#receiveSignal(akka.actor.typed.TypedActorContext,akka.actor.typed.Signal))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../../Behavior.html#narrow()), [start](../../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### InitialGroupRouterImpl
		
		
		
		```
		public InitialGroupRouterImpl​([ActorContext](../../scaladsl/ActorContext.html "interface in akka.actor.typed.scaladsl")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> ctx,
		                              [ServiceKey](../../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> serviceKey,
		                              boolean preferLocalRoutees,
		                              [RoutingLogic](RoutingLogic.html "interface in akka.actor.typed.internal.routing")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> routingLogic)
		```

	- ### Method Detail
	
	
	
		- #### onMessage
		
		
		
		```
		public [Behavior](../../Behavior.html "class in akka.actor.typed")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")> onMessage​([T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl") msg)
		```
		
		Description copied from class: `[AbstractBehavior](../../scaladsl/AbstractBehavior.html#onMessage(T))`
		Implement this method to process an incoming message and return the next behavior.
		 
		 The returned behavior can in addition to normal behaviors be one of the canned special objects:
		 
		
		
			- returning `stopped` will terminate this Behavior
			- returning `this` or `same` designates to reuse the current Behavior
			- returning `unhandled` keeps the same Behavior and signals that the message was not yet handled
		
		
		Specified by:
		`[onMessage](../../scaladsl/AbstractBehavior.html#onMessage(T))` in class `[AbstractBehavior](../../scaladsl/AbstractBehavior.html "class in akka.actor.typed.scaladsl")<[T](InitialGroupRouterImpl.html "type parameter in InitialGroupRouterImpl")>`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ExtensibleBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/InitialGroupRouterImpl.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/RoutingLogic.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/AbstractBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/ActorContext.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/InitialGroupRouterImpl.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/routing/InitialGroupRouterImpl.html)*