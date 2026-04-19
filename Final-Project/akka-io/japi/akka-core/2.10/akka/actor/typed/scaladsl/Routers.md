---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T16:20:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/Routers.html
title: Routers
---

# Routers

## Content

Package [akka.actor.typed.scaladsl](package-summary.html)
## Class Routers

- java.lang.Object
- - akka.actor.typed.scaladsl.Routers

- ---

```
public class Routers
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Routers](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <T> [GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<T>` | `[group](#group(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)` | A router that will keep track of the available routees registered to the [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist")  and route over those by random selection. |
	| `static <T> [PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<T>` | `[pool](#pool(int,akka.actor.typed.Behavior))​(int poolSize,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Spawn `poolSize` children with the given `behavior` and forward messages to them using round robin. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### Routers
		
		
		
		```
		public Routers()
		```

	- ### Method Detail
	
	
	
		- #### group
		
		
		
		```
		public static <T> [GroupRouter](GroupRouter.html "interface in akka.actor.typed.scaladsl")<T> group​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)
		```
		
		A router that will keep track of the available routees registered to the [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist")
		 and route over those by random selection.
		 
		 In a clustered app this means the routees could live on any node in the cluster.
		 The current impl does not try to avoid sending messages to unreachable cluster nodes.
		 
		
		
		 Note that there is a delay between a routee stopping and this being detected by the receptionist and another
		 before the group detects this. Because of this it is best to deregister routees from the receptionist and not stop
		 until the deregistration is complete if you want to minimize the risk of lost messages.
		- #### pool
		
		
		
		```
		public static <T> [PoolRouter](PoolRouter.html "interface in akka.actor.typed.scaladsl")<T> pool​(int poolSize,
		                                     [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Spawn `poolSize` children with the given `behavior` and forward messages to them using round robin.
		 If a child is stopped it is removed from the pool. To have children restart on failure, use supervision.
		 When all children are stopped the pool stops itself. To stop the pool from the outside, use `ActorContext.stop`
		 from the parent actor.
		 
		 Note that if a child stops, there is a slight chance that messages still get delivered to it, and get lost,
		 before the pool sees that the child stopped. Therefore it is best to \_not\_ stop children arbitrarily.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/GroupRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/PoolRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/Routers.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/scaladsl/Routers.html)*