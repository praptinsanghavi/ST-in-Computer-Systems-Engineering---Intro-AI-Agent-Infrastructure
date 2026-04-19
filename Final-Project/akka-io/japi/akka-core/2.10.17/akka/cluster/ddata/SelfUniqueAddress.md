---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:28:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html
title: SelfUniqueAddress
---

# SelfUniqueAddress

## Content

Package [akka.cluster.ddata](package-summary.html)
## Class SelfUniqueAddress

- java.lang.Object
- - akka.cluster.ddata.SelfUniqueAddress

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SelfUniqueAddress
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Cluster non\-specific (typed vs classic) wrapper for [`UniqueAddress`](../UniqueAddress.html "class in akka.cluster").

See Also:
[Serialized Form](../../../serialized-form.html#akka.cluster.ddata.SelfUniqueAddress)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SelfUniqueAddress](#%3Cinit%3E(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata")` | `[apply](#apply(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata")` | `[copy](#copy(akka.cluster.UniqueAddress))​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.cluster")` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")>` | `[unapply](#unapply(akka.cluster.ddata.SelfUniqueAddress))​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") x$0)` |  |
	| `[UniqueAddress](../UniqueAddress.html "class in akka.cluster")` | `[uniqueAddress](#uniqueAddress())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SelfUniqueAddress
		
		
		
		```
		public SelfUniqueAddress​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") apply​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<[UniqueAddress](../UniqueAddress.html "class in akka.cluster")> unapply​([SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") x$0)
		```
		- #### uniqueAddress
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress()
		```
		- #### copy
		
		
		
		```
		public [SelfUniqueAddress](SelfUniqueAddress.html "class in akka.cluster.ddata") copy​([UniqueAddress](../UniqueAddress.html "class in akka.cluster") uniqueAddress)
		```
		- #### copy$default$1
		
		
		
		```
		public [UniqueAddress](../UniqueAddress.html "class in akka.cluster") copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/UniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/cluster/ddata/SelfUniqueAddress.html)*