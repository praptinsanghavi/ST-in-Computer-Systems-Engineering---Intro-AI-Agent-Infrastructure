---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:34:03Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingQueries.ShardsQueryResult$.html
title: ShardingQueries.ShardsQueryResult$
---

# ShardingQueries.ShardsQueryResult$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardingQueries.ShardsQueryResult$

- java.lang.Object
- - akka.cluster.sharding.ShardingQueries.ShardsQueryResult$

- All Implemented Interfaces:
`java.io.Serializable`

Enclosing class:
[ShardingQueries](ShardingQueries.html "class in akka.cluster.sharding")

---

```
public static class ShardingQueries.ShardsQueryResult$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sharding.ShardingQueries.ShardsQueryResult$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardingQueries.ShardsQueryResult$](ShardingQueries.ShardsQueryResult$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardsQueryResult$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<B> [ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")<B>` | `[apply](#apply(scala.collection.immutable.Seq,int,scala.concurrent.duration.FiniteDuration))​(scala.collection.immutable.Seq<scala.util.Either<java.lang.String,​B>> ps,  int total,  scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `<B> [ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")<B>` | `[apply](#apply(scala.collection.immutable.Set,scala.collection.immutable.Seq,int,scala.concurrent.duration.FiniteDuration))​(scala.collection.immutable.Set<java.lang.String> failed,  scala.collection.immutable.Seq<B> responses,  int total,  scala.concurrent.duration.FiniteDuration timeout)` |  |
	| `<T,​A,​B>scala.Tuple2<scala.collection.immutable.Seq<A>,​scala.collection.immutable.Seq<B>>` | `[partition](#partition(scala.collection.immutable.Seq,scala.Function1))​(scala.collection.immutable.Seq<T> ps,  scala.Function1<T,​scala.util.Either<A,​B>> f)` |  |
	| `<A,​B>scala.Tuple2<scala.collection.immutable.Seq<A>,​scala.collection.immutable.Seq<B>>` | `[prepend](#prepend(scala.Tuple2,scala.util.Either))​(scala.Tuple2<scala.collection.immutable.Seq<A>,​scala.collection.immutable.Seq<B>> acc,  scala.util.Either<A,​B> next)` |  |
	| `<B> scala.Option<scala.Tuple4<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Seq<B>,​java.lang.Object,​scala.concurrent.duration.FiniteDuration>>` | `[unapply](#unapply(akka.cluster.sharding.ShardingQueries.ShardsQueryResult))​([ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")<B> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardingQueries.ShardsQueryResult$](ShardingQueries.ShardsQueryResult$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardsQueryResult$
		
		
		
		```
		public ShardsQueryResult$()
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public <B> [ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")<B> apply​(scala.collection.immutable.Seq<scala.util.Either<java.lang.String,​B>> ps,
		                                                      int total,
		                                                      scala.concurrent.duration.FiniteDuration timeout)
		```
		
		
		Parameters:
		`ps` \- the partitioned results of actors queried that did not reply by
		 the timeout or returned another failure and those that did
		`total` \- the total number of actors tracked versus a possible subset
		- #### partition
		
		
		
		```
		public <T,​A,​B> scala.Tuple2<scala.collection.immutable.Seq<A>,​scala.collection.immutable.Seq<B>> partition​(scala.collection.immutable.Seq<T> ps,
		                                                                                                                             scala.Function1<T,​scala.util.Either<A,​B>> f)
		```
		- #### prepend
		
		
		
		```
		public <A,​B> scala.Tuple2<scala.collection.immutable.Seq<A>,​scala.collection.immutable.Seq<B>> prepend​(scala.Tuple2<scala.collection.immutable.Seq<A>,​scala.collection.immutable.Seq<B>> acc,
		                                                                                                                   scala.util.Either<A,​B> next)
		```
		- #### apply
		
		
		
		```
		public <B> [ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")<B> apply​(scala.collection.immutable.Set<java.lang.String> failed,
		                                                      scala.collection.immutable.Seq<B> responses,
		                                                      int total,
		                                                      scala.concurrent.duration.FiniteDuration timeout)
		```
		- #### unapply
		
		
		
		```
		public <B> scala.Option<scala.Tuple4<scala.collection.immutable.Set<java.lang.String>,​scala.collection.immutable.Seq<B>,​java.lang.Object,​scala.concurrent.duration.FiniteDuration>> unapply​([ShardingQueries.ShardsQueryResult](ShardingQueries.ShardsQueryResult.html "class in akka.cluster.sharding")<B> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingQueries.ShardsQueryResult$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingQueries.ShardsQueryResult.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingQueries.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingQueries.ShardsQueryResult$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/ShardingQueries.ShardsQueryResult$.html)*