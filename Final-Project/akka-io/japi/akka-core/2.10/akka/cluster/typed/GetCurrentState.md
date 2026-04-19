---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:24:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/GetCurrentState.html
title: GetCurrentState
---

# GetCurrentState

## Content

Package [akka.cluster.typed](package-summary.html)
## Class GetCurrentState

- java.lang.Object
- - akka.cluster.typed.GetCurrentState

- All Implemented Interfaces:
`[ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class GetCurrentState
extends java.lang.Object
implements [ClusterStateSubscription](ClusterStateSubscription.html "interface in akka.cluster.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.GetCurrentState)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[GetCurrentState](#%3Cinit%3E(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")` | `[apply](#apply(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[GetCurrentState](GetCurrentState.html "class in akka.cluster.typed")` | `[copy](#copy(akka.actor.typed.ActorRef))​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)` |  |
	| `[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>` | `[recipient](#recipient())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>>` | `[unapply](#unapply(akka.cluster.typed.GetCurrentState))​([GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### GetCurrentState
		
		
		
		```
		public GetCurrentState​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") apply​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>> unapply​([GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") x$0)
		```
		- #### recipient
		
		
		
		```
		public [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient()
		```
		- #### copy
		
		
		
		```
		public [GetCurrentState](GetCurrentState.html "class in akka.cluster.typed") copy​([ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> recipient)
		```
		- #### copy$default$1
		
		
		
		```
		public [ActorRef](../../actor/typed/ActorRef.html "interface in akka.actor.typed")<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> copy$default$1()
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
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/ClusterStateSubscription.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/GetCurrentState.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/GetCurrentState.html](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/typed/GetCurrentState.html)*