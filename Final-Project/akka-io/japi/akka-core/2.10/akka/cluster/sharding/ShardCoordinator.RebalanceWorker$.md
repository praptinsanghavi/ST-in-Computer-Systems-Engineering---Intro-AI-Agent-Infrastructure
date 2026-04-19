---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:06:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html
title: ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$
---

# ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$

## Content

Package [akka.cluster.sharding](package-summary.html)
## Class ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated\>
	- - akka.cluster.sharding.ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated>`

Enclosing class:
[ShardCoordinator.RebalanceWorker$](ShardCoordinator.RebalanceWorker$.html "class in akka.cluster.sharding")

---

```
public static class ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$
extends scala.runtime.AbstractFunction1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.sharding.ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$](ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html "class in akka.cluster.sharding")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ShardRegionTerminated$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated` | `[apply](#apply(akka.actor.ActorRef))​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")>` | `[unapply](#unapply(akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated))​(akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$](ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html "class in akka.cluster.sharding") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ShardRegionTerminated$
		
		
		
		```
		public ShardRegionTerminated$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated>`
		- #### apply
		
		
		
		```
		public akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated apply​([ActorRef](../../actor/ActorRef.html "class in akka.actor") region)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../../actor/ActorRef.html "class in akka.actor"),​akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../../actor/ActorRef.html "class in akka.actor")> unapply​(akka.cluster.sharding.ShardCoordinator.RebalanceWorker.ShardRegionTerminated x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/ShardCoordinator.RebalanceWorker$.ShardRegionTerminated$.html)*