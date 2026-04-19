---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:08:48Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntityStarter$.html
title: RememberEntityStarter$
---

# RememberEntityStarter$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class RememberEntityStarter$

- java.lang.Object
- - akka.cluster.sharding.internal.RememberEntityStarter$

- ---

```
public class RememberEntityStarter$
extends java.lang.Object
```

INTERNAL API

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RememberEntityStarter$](RememberEntityStarter$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RememberEntityStarter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../../actor/Props.html "class in akka.actor")` | `[props](#props(akka.actor.ActorRef,akka.actor.ActorRef,java.lang.String,scala.collection.immutable.Set,boolean,akka.cluster.sharding.ClusterShardingSettings))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") region,  [ActorRef](../../../actor/ActorRef.html "class in akka.actor") shard,  java.lang.String shardId,  scala.collection.immutable.Set<java.lang.String> ids,  boolean isConstantStrategy,  [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RememberEntityStarter$](RememberEntityStarter$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RememberEntityStarter$
		
		
		
		```
		public RememberEntityStarter$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../../actor/Props.html "class in akka.actor") props​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") region,
		                   [ActorRef](../../../actor/ActorRef.html "class in akka.actor") shard,
		                   java.lang.String shardId,
		                   scala.collection.immutable.Set<java.lang.String> ids,
		                   boolean isConstantStrategy,
		                   [ClusterShardingSettings](../ClusterShardingSettings.html "class in akka.cluster.sharding") settings)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/actor/Props.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntityStarter$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntityStarter$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/internal/RememberEntityStarter$.html)*