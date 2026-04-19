---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:33:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/Shard$.html
title: Shard$
---

# Shard$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class Shard$

- java.lang.Object
- - akka.cluster.sharding.Shard$

- ---

```
public class Shard$
extends java.lang.Object
```

INTERNAL API
 

See Also:
[`ClusterSharding extension`](ClusterSharding$.html "class in akka.cluster.sharding")

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Shard$](Shard$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Shard$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Props](../../actor/Props.html "class in akka.actor")` | `[props](#props(java.lang.String,java.lang.String,scala.Function1,akka.cluster.sharding.ClusterShardingSettings,scala.PartialFunction,scala.Function1,java.lang.Object,scala.Option,akka.actor.ActorRef))​(java.lang.String typeName,  java.lang.String shardId,  scala.Function1<java.lang.String,​[Props](../../actor/Props.html "class in akka.actor")> entityProps,  [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,  scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,  scala.Function1<java.lang.Object,​java.lang.String> extractShardId,  java.lang.Object handOffStopMessage,  scala.Option<[RememberEntitiesProvider](internal/RememberEntitiesProvider.html "interface in akka.cluster.sharding.internal")> rememberEntitiesProvider,  [ActorRef](../../actor/ActorRef.html "class in akka.actor") rememberEntityStarterManager)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [Shard$](Shard$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Shard$
		
		
		
		```
		public Shard$()
		```

	- ### Method Detail
	
	
	
		- #### props
		
		
		
		```
		public [Props](../../actor/Props.html "class in akka.actor") props​(java.lang.String typeName,
		                   java.lang.String shardId,
		                   scala.Function1<java.lang.String,​[Props](../../actor/Props.html "class in akka.actor")> entityProps,
		                   [ClusterShardingSettings](ClusterShardingSettings.html "class in akka.cluster.sharding") settings,
		                   scala.PartialFunction<java.lang.Object,​scala.Tuple2<java.lang.String,​java.lang.Object>> extractEntityId,
		                   scala.Function1<java.lang.Object,​java.lang.String> extractShardId,
		                   java.lang.Object handOffStopMessage,
		                   scala.Option<[RememberEntitiesProvider](internal/RememberEntitiesProvider.html "interface in akka.cluster.sharding.internal")> rememberEntitiesProvider,
		                   [ActorRef](../../actor/ActorRef.html "class in akka.actor") rememberEntityStarterManager)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/Props.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterSharding$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ClusterShardingSettings.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/Shard$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/RememberEntitiesProvider.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/Shard$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/Shard$.html)*