---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity$.html
title: Entity$
---

# Entity$

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Class Entity$

- java.lang.Object
- - akka.cluster.sharding.typed.javadsl.Entity$

- ---

```
public class Entity$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Entity$](Entity$.html "class in akka.cluster.sharding.typed.javadsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Entity$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>>` | `[of](#of(akka.cluster.sharding.typed.javadsl.EntityTypeKey,akka.japi.function.Function))​([EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<M> typeKey,  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")<M>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)` | Defines how the entity should be created. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Entity$](Entity$.html "class in akka.cluster.sharding.typed.javadsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Entity$
		
		
		
		```
		public Entity$()
		```

	- ### Method Detail
	
	
	
		- #### of
		
		
		
		```
		public <M> [Entity](Entity.html "class in akka.cluster.sharding.typed.javadsl")<M,​[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> of​([EntityTypeKey](EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<M> typeKey,
		                                                  [Function](../../../../japi/function/Function.html "interface in akka.japi.function")<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.javadsl")<M>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)
		```
		
		Defines how the entity should be created. Used in [`ClusterSharding.init(akka.cluster.sharding.typed.javadsl.Entity<M, E>)`](ClusterSharding.html#init(akka.cluster.sharding.typed.javadsl.Entity)). More optional
		 settings can be defined using the `with` methods of the returned [`Entity`](Entity.html "class in akka.cluster.sharding.typed.javadsl").
		 
		
		Parameters:
		`typeKey` \- A key that uniquely identifies the type of entity in this cluster
		`createBehavior` \- Create the behavior for an entity given a [`EntityContext`](EntityContext.html "class in akka.cluster.sharding.typed.javadsl") (includes entityId)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityContext.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/function/Function.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/Entity$.html)*