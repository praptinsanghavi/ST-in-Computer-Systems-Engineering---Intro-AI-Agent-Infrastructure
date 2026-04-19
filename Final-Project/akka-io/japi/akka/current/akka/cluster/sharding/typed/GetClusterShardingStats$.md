---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:11:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/GetClusterShardingStats$.html
title: GetClusterShardingStats$
---

# GetClusterShardingStats$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class GetClusterShardingStats$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")\<?\>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")\<akka.cluster.sharding.ShardRegion.ClusterShardingStats\>,​[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")\>
	- - akka.cluster.sharding.typed.GetClusterShardingStats$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>,​[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")>`

---

```
public class GetClusterShardingStats$
extends scala.runtime.AbstractFunction3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>,​[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.typed.GetClusterShardingStats$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GetClusterShardingStats$](GetClusterShardingStats$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetClusterShardingStats$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,scala.concurrent.duration.FiniteDuration,akka.actor.typed.ActorRef))​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,  scala.concurrent.duration.FiniteDuration timeout,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>>>` | `[unapply](#unapply(akka.cluster.sharding.typed.GetClusterShardingStats))​([GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GetClusterShardingStats$](GetClusterShardingStats$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetClusterShardingStats$
		
		
		
		```
		public GetClusterShardingStats$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>,​[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>,​[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")>`
		- #### apply
		
		
		
		```
		public [GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") apply​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,
		                                     scala.concurrent.duration.FiniteDuration timeout,
		                                     [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>,​[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>>> unapply​([GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/GetClusterShardingStats$.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/GetClusterShardingStats$.html](https://doc.akka.io/japi/akka/current/akka/cluster/sharding/typed/GetClusterShardingStats$.html)*