---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:56:40Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/PoolRouter.html
title: PoolRouter
---

# PoolRouter

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Interface PoolRouter\<T\>

- ---

```
public interface PoolRouter<T>
```

Provides builder style configuration options for pool routers
 
 Not for user extension. Use [`Routers.pool(int, akka.actor.typed.Behavior<T>)`](Routers.html#pool(int,akka.actor.typed.Behavior)) to create

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withBroadcastPredicate](#withBroadcastPredicate(scala.Function1))​(scala.Function1<[T](PoolRouter.html "type parameter in PoolRouter"),​java.lang.Object> pred)` | Any message that the predicate returns true for will be broadcast to all routees. |
	| `[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withConsistentHashingRouting](#withConsistentHashingRouting(int,scala.Function1))​(int virtualNodesFactor,  scala.Function1<[T](PoolRouter.html "type parameter in PoolRouter"),​java.lang.String> mapping)` | Route messages by using consistent hashing. |
	| `[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withPoolSize](#withPoolSize(int))​(int poolSize)` | Set a new pool size from the one set at construction |
	| `[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withRandomRouting](#withRandomRouting())()` | Route messages by randomly selecting the routee from the available routees. |
	| `[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withRoundRobinRouting](#withRoundRobinRouting())()` | Route messages through round robin, providing a fair distribution of messages across the routees. |
	| `[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")>` | `[withRouteeProps](#withRouteeProps(akka.actor.typed.Props))​([Props](../Props.html "class in akka.actor.typed") routeeProps)` | Set the props used to spawn the pool's routees |

- - ### Method Detail
	
	
	
		- #### withBroadcastPredicate
		
		
		
		```
		[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withBroadcastPredicate​(scala.Function1<[T](PoolRouter.html "type parameter in PoolRouter"),​java.lang.Object> pred)
		```
		
		Any message that the predicate returns true for will be broadcast to all routees.
		- #### withConsistentHashingRouting
		
		
		
		```
		[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withConsistentHashingRouting​(int virtualNodesFactor,
		                                           scala.Function1<[T](PoolRouter.html "type parameter in PoolRouter"),​java.lang.String> mapping)
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
		[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withPoolSize​(int poolSize)
		```
		
		Set a new pool size from the one set at construction
		- #### withRandomRouting
		
		
		
		```
		[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withRandomRouting()
		```
		
		Route messages by randomly selecting the routee from the available routees.
		 
		 Random routing makes it less likely that every `poolSize` message from a single producer ends up in the same
		 mailbox of a slow actor.
		- #### withRoundRobinRouting
		
		
		
		```
		[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withRoundRobinRouting()
		```
		
		Route messages through round robin, providing a fair distribution of messages across the routees.
		 
		 Round robin gives fair routing where every available routee gets the same amount of messages
		 
		
		
		 This is the default for pool routers.
		- #### withRouteeProps
		
		
		
		```
		[PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<[T](PoolRouter.html "type parameter in PoolRouter")> withRouteeProps​([Props](../Props.html "class in akka.actor.typed") routeeProps)
		```
		
		Set the props used to spawn the pool's routees

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Props.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/Routers.html
- https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/PoolRouter.html](https://doc.akka.io/japi/akka/current/akka/actor/typed/scaladsl/PoolRouter.html)*