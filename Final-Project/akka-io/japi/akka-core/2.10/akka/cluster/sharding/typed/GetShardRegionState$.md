---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:06:56Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetShardRegionState$.html
title: GetShardRegionState$
---

# GetShardRegionState$

## Content

Package [akka.cluster.sharding.typed](package-summary.html)
## Class GetShardRegionState$

- java.lang.Object
- - scala.runtime.AbstractFunction2\<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")\<?\>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")\<akka.cluster.sharding.ShardRegion.CurrentShardRegionState\>,​[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")\>
	- - akka.cluster.sharding.typed.GetShardRegionState$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>,​[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")>`

---

```
public class GetShardRegionState$
extends scala.runtime.AbstractFunction2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>,​[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.cluster.sharding.typed.GetShardRegionState$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GetShardRegionState$](GetShardRegionState$.html "class in akka.cluster.sharding.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetShardRegionState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")` | `[apply](#apply(akka.cluster.sharding.typed.scaladsl.EntityTypeKey,akka.actor.typed.ActorRef))​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,  [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState> replyTo)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>>>` | `[unapply](#unapply(akka.cluster.sharding.typed.GetShardRegionState))​([GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction2
		
		
		`apply$mcDDD$sp, apply$mcDDI$sp, apply$mcDDJ$sp, apply$mcDID$sp, apply$mcDII$sp, apply$mcDIJ$sp, apply$mcDJD$sp, apply$mcDJI$sp, apply$mcDJJ$sp, apply$mcFDD$sp, apply$mcFDI$sp, apply$mcFDJ$sp, apply$mcFID$sp, apply$mcFII$sp, apply$mcFIJ$sp, apply$mcFJD$sp, apply$mcFJI$sp, apply$mcFJJ$sp, apply$mcIDD$sp, apply$mcIDI$sp, apply$mcIDJ$sp, apply$mcIID$sp, apply$mcIII$sp, apply$mcIIJ$sp, apply$mcIJD$sp, apply$mcIJI$sp, apply$mcIJJ$sp, apply$mcJDD$sp, apply$mcJDI$sp, apply$mcJDJ$sp, apply$mcJID$sp, apply$mcJII$sp, apply$mcJIJ$sp, apply$mcJJD$sp, apply$mcJJI$sp, apply$mcJJJ$sp, apply$mcVDD$sp, apply$mcVDI$sp, apply$mcVDJ$sp, apply$mcVID$sp, apply$mcVII$sp, apply$mcVIJ$sp, apply$mcVJD$sp, apply$mcVJI$sp, apply$mcVJJ$sp, apply$mcZDD$sp, apply$mcZDI$sp, apply$mcZDJ$sp, apply$mcZID$sp, apply$mcZII$sp, apply$mcZIJ$sp, apply$mcZJD$sp, apply$mcZJI$sp, apply$mcZJJ$sp, curried, tupled`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GetShardRegionState$](GetShardRegionState$.html "class in akka.cluster.sharding.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetShardRegionState$
		
		
		
		```
		public GetShardRegionState$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>,​[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>,​[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")>`
		- #### apply
		
		
		
		```
		public [GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed") apply​([EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?> entityTypeKey,
		                                 [ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState> replyTo)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>,​[GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<[EntityTypeKey](scaladsl/EntityTypeKey.html "interface in akka.cluster.sharding.typed.scaladsl")<?>,​[ActorRef](../../../actor/typed/ActorRef.html "interface in akka.actor.typed")<akka.cluster.sharding.ShardRegion.CurrentShardRegionState>>> unapply​([GetShardRegionState](GetShardRegionState.html "class in akka.cluster.sharding.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetShardRegionState$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetShardRegionState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/EntityTypeKey.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetShardRegionState$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/GetShardRegionState$.html)*