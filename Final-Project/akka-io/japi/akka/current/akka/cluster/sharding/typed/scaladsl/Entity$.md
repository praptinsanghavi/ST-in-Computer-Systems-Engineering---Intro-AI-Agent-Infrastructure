---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html
title: Entity$
---

# Entity$

## Content

Package [akka.cluster.sharding.typed.scaladsl](package-summary.html)
## Class Entity$

- java.lang.Object
- - akka.cluster.sharding.typed.scaladsl.Entity$

- ---

```
public class Entity$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Entity$](Entity$.html "class in akka.cluster.sharding.typed.scaladsl")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Entity$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<M> [Entity](Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>>` | `[apply](#apply(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,scala.Function1))​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,  scala.Function1<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.scaladsl")<M>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)` | Defines how the entity should be created. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Entity$](Entity$.html "class in akka.cluster.sharding.typed.scaladsl") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Entity$
		
		
		
		```
		public Entity$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <M> [Entity](Entity.html "class in akka.cluster.sharding.typed.scaladsl")<M,​[ShardingEnvelope](../ShardingEnvelope.html "class in akka.cluster.sharding.typed")<M>> apply​([EntityTypeKey](EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<M> typeKey,
		                                                     scala.Function1<[EntityContext](EntityContext.html "class in akka.cluster.sharding.typed.scaladsl")<M>,​[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<M>> createBehavior)
		```
		
		Defines how the entity should be created. Used in [`ClusterSharding.init(akka.cluster.sharding.typed.scaladsl.Entity<M, E>)`](ClusterSharding.html#init(akka.cluster.sharding.typed.scaladsl.Entity)). More optional
		 settings can be defined using the `with` methods of the returned [`Entity`](Entity.html "class in akka.cluster.sharding.typed.scaladsl").
		 
		
		Parameters:
		`typeKey` \- A key that uniquely identifies the type of entity in this cluster
		`createBehavior` \- Create the behavior for an entity given a [`EntityContext`](EntityContext.html "class in akka.cluster.sharding.typed.scaladsl") (includes entityId)

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/ShardingEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/ClusterSharding.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/Entity.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityContext.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/Entity$.html)*