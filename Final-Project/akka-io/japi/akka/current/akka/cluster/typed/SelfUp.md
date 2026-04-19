---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:12:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/cluster/typed/SelfUp.html
title: SelfUp
---

# SelfUp

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SelfUp

- java.lang.Object
- - akka.cluster.typed.SelfUp

- All Implemented Interfaces:
`[DeadLetterSuppression](../../actor/DeadLetterSuppression.html "interface in akka.actor")`, `[ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SelfUp
extends java.lang.Object
implements [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster"), scala.Product, java.io.Serializable
```

Subscribe to this node being up, after sending this event the subscription is automatically
 cancelled. If the node is already up the event is also sent to the subscriber. If the node was up
 but is no more because it left or is leaving the cluster, no event is sent and the subscription
 request is ignored.
 
 Note: Only emitted for the typed cluster.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.SelfUp)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SelfUp](#%3Cinit%3E(akka.cluster.ClusterEvent.CurrentClusterState))​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SelfUp](SelfUp.html "class in akka.cluster.typed")` | `[apply](#apply(akka.cluster.ClusterEvent.CurrentClusterState))​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SelfUp](SelfUp.html "class in akka.cluster.typed")` | `[copy](#copy(akka.cluster.ClusterEvent.CurrentClusterState))​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)` |  |
	| `[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")` | `[copy$default$1](#copy$default$1())()` |  |
	| `[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")` | `[currentClusterState](#currentClusterState())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")>` | `[unapply](#unapply(akka.cluster.typed.SelfUp))​([SelfUp](SelfUp.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SelfUp
		
		
		
		```
		public SelfUp​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SelfUp](SelfUp.html "class in akka.cluster.typed") apply​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster")> unapply​([SelfUp](SelfUp.html "class in akka.cluster.typed") x$0)
		```
		- #### currentClusterState
		
		
		
		```
		public [ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState()
		```
		- #### copy
		
		
		
		```
		public [SelfUp](SelfUp.html "class in akka.cluster.typed") copy​([ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") currentClusterState)
		```
		- #### copy$default$1
		
		
		
		```
		public [ClusterEvent.CurrentClusterState](../ClusterEvent.CurrentClusterState.html "class in akka.cluster") copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka/current/akka/cluster/ClusterEvent.CurrentClusterState.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/SelfUp.html
- https://doc.akka.io/japi/akka/current/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/cluster/typed/SelfUp.html](https://doc.akka.io/japi/akka/current/akka/cluster/typed/SelfUp.html)*