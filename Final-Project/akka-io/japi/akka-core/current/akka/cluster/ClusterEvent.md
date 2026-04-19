---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:51:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.UnreachableDataCenter.html
title: ClusterEvent.UnreachableDataCenter
---

# ClusterEvent.UnreachableDataCenter

## Content

Package [akka.cluster](package-summary.html)
## Class ClusterEvent.UnreachableDataCenter

- java.lang.Object
- - akka.cluster.ClusterEvent.UnreachableDataCenter

- All Implemented Interfaces:
`[DeadLetterSuppression](../actor/DeadLetterSuppression.html "interface in akka.actor")`, `[ClusterEvent.ClusterDomainEvent](ClusterEvent.ClusterDomainEvent.html "interface in akka.cluster")`, `[ClusterEvent.DataCenterReachabilityEvent](ClusterEvent.DataCenterReachabilityEvent.html "interface in akka.cluster")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[ClusterEvent](ClusterEvent.html "class in akka.cluster")

---

```
public static final class ClusterEvent.UnreachableDataCenter
extends java.lang.Object
implements [ClusterEvent.DataCenterReachabilityEvent](ClusterEvent.DataCenterReachabilityEvent.html "interface in akka.cluster"), scala.Product, java.io.Serializable
```

Deprecated.
Use Akka Distributed Cluster instead. Since 2\.10\.0\.

A data center is considered as unreachable when any members from the data center are unreachable

See Also:
[Serialized Form](../../serialized-form.html#akka.cluster.ClusterEvent.UnreachableDataCenter)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[UnreachableDataCenter](#%3Cinit%3E(java.lang.String))​(java.lang.String dataCenter)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `[ClusterEvent.UnreachableDataCenter](ClusterEvent.UnreachableDataCenter.html "class in akka.cluster")` | `[copy](#copy(java.lang.String))​(java.lang.String dataCenter)` | Deprecated. |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` | Deprecated. |
	| `java.lang.String` | `[dataCenter](#dataCenter())()` | Deprecated. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` | Deprecated. |
	| `int` | `[hashCode](#hashCode())()` | Deprecated. |
	| `int` | `[productArity](#productArity())()` | Deprecated. |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` | Deprecated. |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` | Deprecated. |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` | Deprecated. |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` | Deprecated. |
	| `java.lang.String` | `[toString](#toString())()` | Deprecated. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### UnreachableDataCenter
		
		
		
		```
		public UnreachableDataCenter​(java.lang.String dataCenter)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### dataCenter
		
		
		
		```
		public java.lang.String dataCenter()
		```
		
		Deprecated.
		- #### copy
		
		
		
		```
		public [ClusterEvent.UnreachableDataCenter](ClusterEvent.UnreachableDataCenter.html "class in akka.cluster") copy​(java.lang.String dataCenter)
		```
		
		Deprecated.
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
		```
		
		Deprecated.
		- #### productPrefix
		
		
		
		```
		public java.lang.String productPrefix()
		```
		
		Deprecated.
		
		Specified by:
		`productPrefix` in interface `scala.Product`
		- #### productArity
		
		
		
		```
		public int productArity()
		```
		
		Deprecated.
		
		Specified by:
		`productArity` in interface `scala.Product`
		- #### productElement
		
		
		
		```
		public java.lang.Object productElement​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElement` in interface `scala.Product`
		- #### productIterator
		
		
		
		```
		public scala.collection.Iterator<java.lang.Object> productIterator()
		```
		
		Deprecated.
		
		Specified by:
		`productIterator` in interface `scala.Product`
		- #### canEqual
		
		
		
		```
		public boolean canEqual​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`canEqual` in interface `scala.Equals`
		- #### productElementName
		
		
		
		```
		public java.lang.String productElementName​(int x$1)
		```
		
		Deprecated.
		
		Specified by:
		`productElementName` in interface `scala.Product`
		- #### hashCode
		
		
		
		```
		public int hashCode()
		```
		
		Deprecated.
		
		Overrides:
		`hashCode` in class `java.lang.Object`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		Deprecated.
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		Deprecated.
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/actor/DeadLetterSuppression.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.ClusterDomainEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.DataCenterReachabilityEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.UnreachableDataCenter.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.html
- https://doc.akka.io/japi/akka-core/current/akka/cluster/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.UnreachableDataCenter.html](https://doc.akka.io/japi/akka-core/current/akka/cluster/ClusterEvent.UnreachableDataCenter.html)*