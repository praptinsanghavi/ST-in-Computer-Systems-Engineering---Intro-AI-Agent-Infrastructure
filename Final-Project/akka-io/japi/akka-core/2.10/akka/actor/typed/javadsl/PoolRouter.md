---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/PoolRouter.html
title: PoolRouter
---

# PoolRouter

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class PoolRouter\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<T\>
		- - akka.actor.typed.javadsl.PoolRouter\<T\>

- ---

```
public abstract class PoolRouter<T>
extends [BehaviorImpl.DeferredBehavior](../internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<T>
```

Provides builder style configuration options for pool routers
 
 Not for user extension. Use [`Routers.pool(int, akka.actor.typed.Behavior<T>)`](Routers.html#pool(int,akka.actor.typed.Behavior)) to create

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PoolRouter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withBroadcastPredicate](#withBroadcastPredicate(java.util.function.Predicate))​(java.util.function.Predicate<[T](PoolRouter.html "type parameter in PoolRouter")> pred)` | Any message that the predicate returns true for will be broadcast to all routees. |
	| `abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withConsistentHashingRouting](#withConsistentHashingRouting(int,java.util.function.Function))​(int virtualNodesFactor,  java.util.function.Function<[T](PoolRouter.html "type parameter in PoolRouter"),​java.lang.String> mapping)` | Route messages by using consistent hashing. |
	| `abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withPoolSize](#withPoolSize(int))​(int poolSize)` | Set a new pool size from the one set at construction |
	| `abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withRandomRouting](#withRandomRouting())()` | Route messages by randomly selecting the routee from the available routees. |
	| `abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withRoundRobinRouting](#withRoundRobinRouting())()` | Route messages through round robin, providing a fair distribution of messages across the routees. |
	| `abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withRouteeProps](#withRouteeProps(akka.actor.typed.Props))​([Props](../Props.html "class in akka.actor.typed") routeeProps)` | Set the props used to spawn the pool's routees |
	
	
		- ### Methods inherited from class akka.actor.typed.internal.[BehaviorImpl.DeferredBehavior](../internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")
		
		
		`[apply](../internal/BehaviorImpl.DeferredBehavior.html#apply(akka.actor.typed.TypedActorContext))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PoolRouter
		
		
		
		```
		public PoolRouter()
		```

	- ### Method Detail
	
	
	
		- #### withBroadcastPredicate
		
		
		
		```
		public abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withBroadcastPredicate​(java.util.function.Predicate<[T](PoolRouter.html "type parameter in PoolRouter")> pred)
		```
		
		Any message that the predicate returns true for will be broadcast to all routees.
		- #### withConsistentHashingRouting
		
		
		
		```
		public abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withConsistentHashingRouting​(int virtualNodesFactor,
		                                                           java.util.function.Function<[T](PoolRouter.html "type parameter in PoolRouter"),​java.lang.String> mapping)
		```
		
		Route messages by using consistent hashing.
		 
		 From wikipedia: Consistent hashing is based on mapping each object to a point on a circle
		 (or equivalently, mapping each object to a real angle). The system maps each available machine
		 (or other storage bucket) to many pseudo\-randomly distributed points on the same circle.
		 
		
		
		
		Parameters:
		`virtualNodesFactor` \- This factor has to be greater or equal to 1\. Assuming that the reader
		 knows what consistent hashing is
		 (if not, please refer: https://www.tom\-e\-white.com/2007/11/consistent\-hashing.html or wiki).
		 This number is responsible for creating additional,
		 virtual addresses for a provided set of routees,
		 so that in the total number of points on hashing ring
		 will be equal to numberOfRoutees \* virtualNodesFactor
		 (if virtualNodesFactor is equal to 1, then no additional points will be created).
		 
		 Those virtual nodes are being created by additionally rehashing routees
		 to evenly distribute them across hashing ring.
		 Consider increasing this number when you have a small number of routees.
		 For bigger loads one can aim in having around 100\-200 total addresses.
		 
		
		
		`mapping` \- Hash key extractor. This function will be used in consistent hashing process.
		 Result of this operation should possibly uniquely distinguish messages.
		- #### withPoolSize
		
		
		
		```
		public abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withPoolSize​(int poolSize)
		```
		
		Set a new pool size from the one set at construction
		- #### withRandomRouting
		
		
		
		```
		public abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withRandomRouting()
		```
		
		Route messages by randomly selecting the routee from the available routees.
		 
		 Random routing makes it less likely that every `poolsize` message from a single producer ends up in the same
		 mailbox of a slow actor.
		- #### withRoundRobinRouting
		
		
		
		```
		public abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withRoundRobinRouting()
		```
		
		Route messages through round robin, providing a fair distribution of messages across the routees.
		 
		 Round robin gives fair routing where every available routee gets the same amount of messages
		 
		
		
		 This is the default for pool routers.
		- #### withRouteeProps
		
		
		
		```
		public abstract [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withRouteeProps​([Props](../Props.html "class in akka.actor.typed") routeeProps)
		```
		
		Set the props used to spawn the pool's routees

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Routers.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/PoolRouter.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/PoolRouter.html)*