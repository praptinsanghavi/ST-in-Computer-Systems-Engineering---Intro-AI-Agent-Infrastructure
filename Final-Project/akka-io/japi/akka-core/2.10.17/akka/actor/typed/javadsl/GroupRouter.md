---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:56:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/GroupRouter.html
title: GroupRouter
---

# GroupRouter

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class GroupRouter\<T\>

- java.lang.Object
- - [akka.actor.typed.Behavior](../Behavior.html "class in akka.actor.typed")\<T\>
	- - [akka.actor.typed.internal.BehaviorImpl.DeferredBehavior](../internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")\<T\>
		- - akka.actor.typed.javadsl.GroupRouter\<T\>

- ---

```
public abstract class GroupRouter<T>
extends [BehaviorImpl.DeferredBehavior](../internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")<T>
```

Provides builder style configuration options for group routers
 
 Not for user extension. Use [`Routers.group(akka.actor.typed.receptionist.ServiceKey<T>)`](Routers.html#group(akka.actor.typed.receptionist.ServiceKey)) to create

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[Behavior.BehaviorDecorators](../Behavior.BehaviorDecorators.html "class in akka.actor.typed")<[Inner](../Behavior.BehaviorDecorators.html "type parameter in Behavior.BehaviorDecorators")>, [Behavior.BehaviorDecorators$](../Behavior.BehaviorDecorators$.html "class in akka.actor.typed")`

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GroupRouter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withConsistentHashingRouting](#withConsistentHashingRouting(int,java.util.function.Function))​(int virtualNodesFactor,  java.util.function.Function<[T](GroupRouter.html "type parameter in GroupRouter"),​java.lang.String> mapping)` | Route messages by using consistent hashing. |
	| `abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRandomRouting](#withRandomRouting())()` | Route messages by randomly selecting the routee from the available routees. |
	| `abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRandomRouting](#withRandomRouting(boolean))​(boolean preferLocalRoutees)` | Route messages by randomly selecting the routee from the available routees. |
	| `abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRoundRobinRouting](#withRoundRobinRouting())()` | Route messages by using round robin. |
	| `abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")>` | `[withRoundRobinRouting](#withRoundRobinRouting(boolean))​(boolean preferLocalRoutees)` | Route messages by using round robin. |
	
	
		- ### Methods inherited from class akka.actor.typed.internal.[BehaviorImpl.DeferredBehavior](../internal/BehaviorImpl.DeferredBehavior.html "class in akka.actor.typed.internal")
		
		
		`[apply](../internal/BehaviorImpl.DeferredBehavior.html#apply(akka.actor.typed.TypedActorContext))`
		- ### Methods inherited from class akka.actor.typed.[Behavior](../Behavior.html "class in akka.actor.typed")
		
		
		`[BehaviorDecorators](../Behavior.html#BehaviorDecorators(akka.actor.typed.Behavior)), [canonicalize](../Behavior.html#canonicalize(akka.actor.typed.Behavior,akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [existsInStack](../Behavior.html#existsInStack(akka.actor.typed.Behavior,scala.Function1)), [interpretMessage](../Behavior.html#interpretMessage(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,T)), [interpretSignal](../Behavior.html#interpretSignal(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext,akka.actor.typed.Signal)), [isAlive](../Behavior.html#isAlive(akka.actor.typed.Behavior)), [isDeferred](../Behavior.html#isDeferred(akka.actor.typed.Behavior)), [isUnhandled](../Behavior.html#isUnhandled(akka.actor.typed.Behavior)), [narrow](../Behavior.html#narrow()), [start](../Behavior.html#start(akka.actor.typed.Behavior,akka.actor.typed.TypedActorContext)), [validateAsInitial](../Behavior.html#validateAsInitial(akka.actor.typed.Behavior))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### GroupRouter
		
		
		
		```
		public GroupRouter()
		```

	- ### Method Detail
	
	
	
		- #### withConsistentHashingRouting
		
		
		
		```
		public abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withConsistentHashingRouting​(int virtualNodesFactor,
		                                                            java.util.function.Function<[T](GroupRouter.html "type parameter in GroupRouter"),​java.lang.String> mapping)
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
		public abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRandomRouting()
		```
		
		Route messages by randomly selecting the routee from the available routees.
		 
		 This is the default for group routers.
		- #### withRandomRouting
		
		
		
		```
		public abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRandomRouting​(boolean preferLocalRoutees)
		```
		
		Route messages by randomly selecting the routee from the available routees.
		 
		 This is the default for group routers.
		 
		
		
		
		Parameters:
		`preferLocalRoutees` \- if the value is false, all reachable routees will be used;
		 if the value is true and there are local routees, only local routees will be used.
		 if the value is true and there is no local routees, remote routees will be used.
		- #### withRoundRobinRouting
		
		
		
		```
		public abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRoundRobinRouting()
		```
		
		Route messages by using round robin.
		 
		 Round robin gives fair routing where every available routee gets the same amount of messages as long as the set
		 of routees stays relatively stable, but may be unfair if the set of routees changes a lot.
		- #### withRoundRobinRouting
		
		
		
		```
		public abstract [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<[T](GroupRouter.html "type parameter in GroupRouter")> withRoundRobinRouting​(boolean preferLocalRoutees)
		```
		
		Route messages by using round robin.
		 
		 Round robin gives fair routing where every available routee gets the same amount of messages as long as the set
		 of routees stays relatively stable, but may be unfair if the set of routees changes a lot.
		 
		
		
		
		Parameters:
		`preferLocalRoutees` \- if the value is false, all reachable routees will be used;
		 if the value is true and there are local routees, only local routees will be used.
		 if the value is true and there is no local routees, remote routees will be used.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.BehaviorDecorators.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/internal/BehaviorImpl.DeferredBehavior.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/Routers.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/GroupRouter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/javadsl/GroupRouter.html)*