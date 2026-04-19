---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:24Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
title: ReplicaId
---

# ReplicaId

## Content

Package [akka.persistence.typed](package-summary.html)
## Class ReplicaId

- java.lang.Object
- - akka.persistence.typed.ReplicaId

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class ReplicaId
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.ReplicaId)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReplicaId](#%3Cinit%3E(java.lang.String))​(java.lang.String id)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [ReplicaId](ReplicaId.html "class in akka.persistence.typed")` | `[apply](#apply(java.lang.String))​(java.lang.String id)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ReplicaId](ReplicaId.html "class in akka.persistence.typed")` | `[copy](#copy(java.lang.String))​(java.lang.String id)` |  |
	| `java.lang.String` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [ReplicaId](ReplicaId.html "class in akka.persistence.typed")` | `[empty](#empty())()` | When migrating from non\-replicated to replicated the ReplicaId of where the original entity  was located should be empty. |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[id](#id())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.String>` | `[unapply](#unapply(akka.persistence.typed.ReplicaId))​([ReplicaId](ReplicaId.html "class in akka.persistence.typed") x$0)` | Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### ReplicaId
		
		
		
		```
		public ReplicaId​(java.lang.String id)
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [ReplicaId](ReplicaId.html "class in akka.persistence.typed") empty()
		```
		
		When migrating from non\-replicated to replicated the ReplicaId of where the original entity
		 was located should be empty.
		- #### apply
		
		
		
		```
		public static [ReplicaId](ReplicaId.html "class in akka.persistence.typed") apply​(java.lang.String id)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.String> unapply​([ReplicaId](ReplicaId.html "class in akka.persistence.typed") x$0)
		```
		
		Identifies a replica in Replicated Event Sourcing, could be a datacenter name or a logical identifier.
		- #### id
		
		
		
		```
		public java.lang.String id()
		```
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [ReplicaId](ReplicaId.html "class in akka.persistence.typed") copy​(java.lang.String id)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.String copy$default$1()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/ReplicaId.html)*