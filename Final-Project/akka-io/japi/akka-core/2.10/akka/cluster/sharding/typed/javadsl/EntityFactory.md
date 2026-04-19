---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:58:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityFactory.html
title: EntityFactory
---

# EntityFactory

## Content

Package [akka.cluster.sharding.typed.javadsl](package-summary.html)
## Interface EntityFactory\<M\>

- ---

```
public interface EntityFactory<M>
```

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[M](EntityFactory.html "type parameter in EntityFactory")>` | `[apply](#apply(akka.actor.typed.ActorRef,java.lang.String))​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")> shardRegion,  java.lang.String entityId)` |  |

- - ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		[Behavior](../../../../actor/typed/Behavior.html "class in akka.actor.typed")<[M](EntityFactory.html "type parameter in EntityFactory")> apply​([ActorRef](../../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterSharding.ShardCommand](ClusterSharding.ShardCommand.html "interface in akka.cluster.sharding.typed.javadsl")> shardRegion,
		                  java.lang.String entityId)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/Behavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ClusterSharding.ShardCommand.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityFactory.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityFactory.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityFactory.html)*