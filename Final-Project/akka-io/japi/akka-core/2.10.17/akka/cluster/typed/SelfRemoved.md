---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:19:31Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SelfRemoved.html
title: SelfRemoved
---

# SelfRemoved

## Content

Package [akka.cluster.typed](package-summary.html)
## Class SelfRemoved

- java.lang.Object
- - akka.cluster.typed.SelfRemoved

- All Implemented Interfaces:
`[DeadLetterSuppression](../../actor/DeadLetterSuppression.html "interface in akka.actor")`, `[ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SelfRemoved
extends java.lang.Object
implements [ClusterEvent.ClusterDomainEvent](../ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster"), scala.Product, java.io.Serializable
```

Subscribe to this node being removed from the cluster. If the node was already removed from the cluster
 when this subscription is created it will be responded to immediately from the subscriptions actor.
 
 Note: Only emitted for the typed cluster.

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.typed.SelfRemoved)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SelfRemoved](#%3Cinit%3E(akka.cluster.MemberStatus))​([MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SelfRemoved](SelfRemoved.html "class in akka.cluster.typed")` | `[apply](#apply(akka.cluster.MemberStatus))​([MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SelfRemoved](SelfRemoved.html "class in akka.cluster.typed")` | `[copy](#copy(akka.cluster.MemberStatus))​([MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus)` |  |
	| `[MemberStatus](../MemberStatus.html "class in akka.cluster")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `[MemberStatus](../MemberStatus.html "class in akka.cluster")` | `[previousStatus](#previousStatus())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[MemberStatus](../MemberStatus.html "class in akka.cluster")>` | `[unapply](#unapply(akka.cluster.typed.SelfRemoved))​([SelfRemoved](SelfRemoved.html "class in akka.cluster.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SelfRemoved
		
		
		
		```
		public SelfRemoved​([MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SelfRemoved](SelfRemoved.html "class in akka.cluster.typed") apply​([MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[MemberStatus](../MemberStatus.html "class in akka.cluster")> unapply​([SelfRemoved](SelfRemoved.html "class in akka.cluster.typed") x$0)
		```
		- #### previousStatus
		
		
		
		```
		public [MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus()
		```
		- #### copy
		
		
		
		```
		public [SelfRemoved](SelfRemoved.html "class in akka.cluster.typed") copy​([MemberStatus](../MemberStatus.html "class in akka.cluster") previousStatus)
		```
		- #### copy$default$1
		
		
		
		```
		public [MemberStatus](../MemberStatus.html "class in akka.cluster") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/MemberStatus.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SelfRemoved.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SelfRemoved.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/typed/SelfRemoved.html)*