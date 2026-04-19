---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:25:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html
title: GetClusterShardingStats
---

# GetClusterShardingStats

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class GetClusterShardingStats

- java.lang.Object
- - akka.cluster.sharding.typed.GetClusterShardingStats

- All Implemented Interfaces:
`[ClusterShardingQuery](ClusterShardingQuery.html "interface in akka.cluster.sharding.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class GetClusterShardingStats
extends java.lang.Object
implements [ClusterShardingQuery](ClusterShardingQuery.html "interface in akka.cluster.sharding.typed"), scala.Product, java.io.Serializable
```

Query the statistics about the currently running sharded entities in the
 entire cluster. If the given `timeout` is reached without answers from all
 shard regions the reply will contain an empty map of regions.
 
 Intended for testing purpose to see when cluster sharding is "ready" or to monitor
 the state of the shard regions.
 

 param: timeout the timeout applied to querying all alive regions
 param: replyTo the actor to send the result to

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.typed.GetClusterShardingStats)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetClusterShardingStats](#%3Cinit%3E(akka.cluster.sharding.typed.javadsl.EntityTypeKey,java.time.Duration,akka.actor.typed.ActorRef))​([EntityTypeKey](javadsl/EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<?> entityTypeKey,  java.time.Duration timeout,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)` | Java API |
	| `[GetClusterShardingStats](#%3Cinit%3E(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,scala.concurrent.duration.FiniteDuration,akka.actor.typed.ActorRef))​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,  scala.concurrent.duration.FiniteDuration timeout,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,scala.concurrent.duration.FiniteDuration,akka.actor.typed.ActorRef))​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,  scala.concurrent.duration.FiniteDuration timeout,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed")` | `[copy](#copy(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,scala.concurrent.duration.FiniteDuration,akka.actor.typed.ActorRef))​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,  scala.concurrent.duration.FiniteDuration timeout,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)` |  |
	| `[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[copy$default$2](#copy$default$2())()` |  |
	| `[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>` | `[copy$default$3](#copy$default$3())()` |  |
	| `[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>` | `[entityTypeKey](#entityTypeKey())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>` | `[replyTo](#replyTo())()` |  |
	| `scala.concurrent.duration.FiniteDuration` | `[timeout](#timeout())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.Tuple3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>>>` | `[unapply](#unapply(akka.cluster.sharding.typed.GetClusterShardingStats))​([GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### GetClusterShardingStats
		
		
		
		```
		public GetClusterShardingStats​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,
		                               scala.concurrent.duration.FiniteDuration timeout,
		                               [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)
		```
		- #### GetClusterShardingStats
		
		
		
		```
		public GetClusterShardingStats​([EntityTypeKey](javadsl/EntityTypeKey.html "class in akka.cluster.sharding.typed.javadsl")<?> entityTypeKey,
		                               java.time.Duration timeout,
		                               [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)
		```
		
		Java API
		 
		 Query the statistics about the currently running sharded entities in the
		 entire cluster. If the given `timeout` is reached without answers from all
		 shard regions the reply will contain an empty map of regions.

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") apply​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,
		                                            scala.concurrent.duration.FiniteDuration timeout,
		                                            [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.Tuple3<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​scala.concurrent.duration.FiniteDuration,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats>>> unapply​([GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") x$0)
		```
		- #### entityTypeKey
		
		
		
		```
		public [EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey()
		```
		- #### timeout
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration timeout()
		```
		- #### replyTo
		
		
		
		```
		public [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo()
		```
		- #### copy
		
		
		
		```
		public [GetClusterShardingStats](GetClusterShardingStats.html "class in akka.cluster.sharding.typed") copy​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,
		                                    scala.concurrent.duration.FiniteDuration timeout,
		                                    [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> replyTo)
		```
		- #### copy$default$1
		
		
		
		```
		public [EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> copy$default$1()
		```
		- #### copy$default$2
		
		
		
		```
		public scala.concurrent.duration.FiniteDuration copy$default$2()
		```
		- #### copy$default$3
		
		
		
		```
		public [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.ClusterShardingStats> copy$default$3()
		```
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/ClusterShardingQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetClusterShardingStats.html)*