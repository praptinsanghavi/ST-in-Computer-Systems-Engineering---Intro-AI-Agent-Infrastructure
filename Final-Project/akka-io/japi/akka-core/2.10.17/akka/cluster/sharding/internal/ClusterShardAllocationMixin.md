---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:35:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html
title: ClusterShardAllocationMixin.RegionEntry$
---

# ClusterShardAllocationMixin.RegionEntry$

## Content

Package [akka.cluster.sharding.internal](package-summary.html)
## Class ClusterShardAllocationMixin.RegionEntry$

- java.lang.Object
- - scala.runtime.AbstractFunction3\<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq\<java.lang.String\>,​[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")\>
	- - akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>,​[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`

Enclosing interface:
[ClusterShardAllocationMixin](ClusterShardAllocationMixin.html "interface in akka.cluster.sharding.internal")

---

```
public static class ClusterShardAllocationMixin.RegionEntry$
extends scala.runtime.AbstractFunction3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>,​[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ClusterShardAllocationMixin.RegionEntry$](ClusterShardAllocationMixin.RegionEntry$.html "class in akka.cluster.sharding.internal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[RegionEntry$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")` | `[apply](#apply(akka.actor.ActorRef,akka.cluster.Member,scala.collection.immutable.IndexedSeq))​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") region,  [Member](../../Member.html "class in akka.cluster") member,  scala.collection.immutable.IndexedSeq<java.lang.String> shardIds)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>>>` | `[unapply](#unapply(akka.cluster.sharding.internal.ClusterShardAllocationMixin.RegionEntry))​([ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction3
		
		
		`curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ClusterShardAllocationMixin.RegionEntry$](ClusterShardAllocationMixin.RegionEntry$.html "class in akka.cluster.sharding.internal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### RegionEntry$
		
		
		
		```
		public RegionEntry$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>,​[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>,​[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`
		- #### apply
		
		
		
		```
		public [ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal") apply​([ActorRef](../../../actor/ActorRef.html "class in akka.actor") region,
		                                                     [Member](../../Member.html "class in akka.cluster") member,
		                                                     scala.collection.immutable.IndexedSeq<java.lang.String> shardIds)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>,​[ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple3<[ActorRef](../../../actor/ActorRef.html "class in akka.actor"),​[Member](../../Member.html "class in akka.cluster"),​scala.collection.immutable.IndexedSeq<java.lang.String>>> unapply​([ClusterShardAllocationMixin.RegionEntry](ClusterShardAllocationMixin.RegionEntry.html "class in akka.cluster.sharding.internal") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/Member.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardAllocationMixin.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/sharding/internal/ClusterShardAllocationMixin.RegionEntry$.html)*