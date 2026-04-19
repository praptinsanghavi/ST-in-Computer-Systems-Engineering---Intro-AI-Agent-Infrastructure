---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:28Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/GetCurrentState$.html
title: GetCurrentState$
---

# GetCurrentState$

## Content

Package [akka.cluster.typed](package-summary.html)
## Class GetCurrentState$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")\<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")\>,​[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")\>
	- - akka.cluster.typed.GetCurrentState$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>,​[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")>`

---

```
public class GetCurrentState$
extends scala.runtime.AbstractFunction1<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>,​[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.GetCurrentState$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [GetCurrentState$](GetCurrentState$.html "class in akka.cluster.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetCurrentState$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>>` | `[unapply](#unapply(akka.cluster.typed.GetCurrentState))​([GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [GetCurrentState$](GetCurrentState$.html "class in akka.cluster.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### GetCurrentState$
		
		
		
		```
		public GetCurrentState$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>,​[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>,​[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")>`
		- #### apply
		
		
		
		```
		public [GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") apply​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>,​[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")>`
		- #### unapply
		
		
		
		```
		public scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>> unapply​([GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/typed/ActorRef.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/GetCurrentState$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/GetCurrentState$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/GetCurrentState$.html)*