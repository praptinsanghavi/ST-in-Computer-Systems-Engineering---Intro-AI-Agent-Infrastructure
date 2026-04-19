---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:56:26Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Routers$.html
title: Routers$
---

# Routers$

## Content

Package [akka.actor.typed.javadsl](package-summary.html)
## Class Routers$

- java.lang.Object
- - akka.actor.typed.javadsl.Routers$

- ---

```
public class Routers$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Routers$](Routers$.html "class in akka.actor.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Routers$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<T> [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<T>` | `[group](#group(akka.actor.typed.receptionist.ServiceKey))​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)` | A router that will keep track of the available routees registered to the [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist")  and route over those by random selection. |
	| `<T> [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<T>` | `[pool](#pool(int,akka.actor.typed.Behavior))​(int poolSize,  [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)` | Spawn `poolSize` children with the given `behavior` and forward messages to them using round robin. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Routers$](Routers$.html "class in akka.actor.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Routers$
		
		
		
		```
		public Routers$()
		```

	- ### Method Detail
	
	
	
		- #### group
		
		
		
		```
		public <T> [GroupRouter](GroupRouter.html "class in akka.actor.typed.javadsl")<T> group​([ServiceKey](../receptionist/ServiceKey.html "class in akka.actor.typed.receptionist")<T> key)
		```
		
		A router that will keep track of the available routees registered to the [`Receptionist`](../receptionist/Receptionist.html "class in akka.actor.typed.receptionist")
		 and route over those by random selection.
		 
		 In a clustered app this means the routees could live on any node in the cluster.
		 The current impl does not try to avoid sending messages to unreachable cluster nodes.
		 
		
		
		 Note that there is a delay between a routee stopping and this being detected by the receptionist, and another
		 before the group detects this, therefore it is best to deregister routees from the receptionist and not stop
		 until the deregistration is complete if you want to minimize the risk of lost messages.
		- #### pool
		
		
		
		```
		public <T> [PoolRouter](PoolRouter.html "class in akka.actor.typed.javadsl")<T> pool​(int poolSize,
		                              [Behavior](../Behavior.html "class in akka.actor.typed")<T> behavior)
		```
		
		Spawn `poolSize` children with the given `behavior` and forward messages to them using round robin.
		 If a child is stopped it is removed from the pool, to have children restart on failure use supervision.
		 When all children are stopped the pool stops itself. To stop the pool from the outside, use `ActorContext.stop`
		 from the parent actor.
		 
		 Note that if a child stops there is a slight chance that messages still get delivered to it, and get lost,
		 before the pool sees that the child stopped. Therefore it is best to \_not\_ stop children arbitrarily.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/GroupRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/PoolRouter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Routers$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/Receptionist.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/receptionist/ServiceKey.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Routers$.html](https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/javadsl/Routers$.html)*