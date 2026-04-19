---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:57:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/GroupRouter.html
title: GroupRouter
---

# GroupRouter

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Interface GroupRouter\<T\>

- ---

```
public interface GroupRouter<T>
```

Provides builder style configuration options for group routers
 
 Not for user extension. Use [`Routers.group(akka.actor.typed.receptionist.ServiceKey<T>)`](Routers.html#group(akka.actor.typed.receptionist.ServiceKey)) to create

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withConsistentHashingRouting](#withConsistentHashingRouting(int,scala.Function1))​(int virtualNodesFactor,  scala.Function1<[T](GroupRouter.html "type parameter in GroupRouter"),​java.lang.String> mapping)` | Route messages by using consistent hashing. |
	| `[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRandomRouting](#withRandomRouting())()` | Route messages by randomly selecting the routee from the available routees. |
	| `[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRandomRouting](#withRandomRouting(boolean))​(boolean preferLocalRoutees)` | Route messages by randomly selecting the routee from the available routees. |
	| `[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRoundRobinRouting](#withRoundRobinRouting())()` | Route messages by using round robin. |
	| `[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRoundRobinRouting](#withRoundRobinRouting(boolean))​(boolean preferLocalRoutees)` | Route messages by using round robin. |

- - ### Method Detail
	
	
	
		- #### withConsistentHashingRouting
		
		
		
		```
		[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withConsistentHashingRouting​(int virtualNodesFactor,
		                                            scala.Function1<[T](GroupRouter.html "type parameter in GroupRouter"),​java.lang.String> mapping)
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
		 
		
		
		 Please also note that setting this number to a too big value will cause
		 reasonable overhead when new routees will be added or old one removed.
		 
		
		
		`mapping` \- Hash key extractor. This function will be used in consistent hashing process.
		 Result of this operation should possibly uniquely distinguish messages.
		- #### withRandomRouting
		
		
		
		```
		[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRandomRouting()
		```
		
		Route messages by randomly selecting the routee from the available routees. This is the default for group routers.
		- #### withRandomRouting
		
		
		
		```
		[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRandomRouting​(boolean preferLocalRoutees)
		```
		
		Route messages by randomly selecting the routee from the available routees. This is the default for group routers.
		 
		
		Parameters:
		`preferLocalRoutees` \- if the value is false, all reachable routees will be used;
		 if the value is true and there are local routees, only local routees will be used.
		 if the value is true and there is no local routees, remote routees will be used.
		- #### withRoundRobinRouting
		
		
		
		```
		[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRoundRobinRouting()
		```
		
		Route messages by using round robin.
		 
		 Round robin gives fair routing where every available routee gets the same amount of messages as long as the set
		 of routees stays relatively stable, but may be unfair if the set of routees changes a lot.
		- #### withRoundRobinRouting
		
		
		
		```
		[GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRoundRobinRouting​(boolean preferLocalRoutees)
		```
		
		Route messages by using round robin.
		 
		 Round robin gives fair routing where every available routee gets the same amount of messages as long as the set
		 of routees stays relatively stable, but may be unfair if the set of routees changes a lot.
		 
		
		
		
		Parameters:
		`preferLocalRoutees` \- if the value is false, all reachable routees will be used;
		 if the value is true and there are local routees, only local routees will be used.
		 if the value true and there is no local routees, remote routees will be used.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/Routers.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/GroupRouter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/scaladsl/GroupRouter.html)*