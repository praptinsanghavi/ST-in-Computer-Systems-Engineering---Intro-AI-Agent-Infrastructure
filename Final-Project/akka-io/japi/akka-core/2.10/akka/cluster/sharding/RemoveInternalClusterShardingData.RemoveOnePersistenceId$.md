---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:05:42Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html
title: RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$
---

# RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.util.Try\<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals\>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result\>
	- - akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result>`

Enclosing class:
[RemoveInternalClusterShardingData.RemoveOnePersistenceId$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.html "class in akka.cluster.sharding")

---

```
public static class RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$
extends scala.runtime.AbstractFunction1<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Result$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result` | `[apply](#apply(scala.util.Try))​(scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals> removals)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>>` | `[unapply](#unapply(akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result))​(akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$](RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Result$
		
		
		
		```
		public Result$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result>`
		- #### apply
		
		
		
		```
		public akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result apply​(scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals> removals)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>,​akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.util.Try<akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Removals>> unapply​(akka.cluster.sharding.RemoveInternalClusterShardingData.RemoveOnePersistenceId.Result x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/RemoveInternalClusterShardingData.RemoveOnePersistenceId$.Result$.html)*