---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta$.html
title: SnapshotMeta$
---

# SnapshotMeta$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class SnapshotMeta$

- java.lang.Object
- - akka.persistence.testkit.SnapshotMeta$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class SnapshotMeta$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.SnapshotMeta$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [SnapshotMeta$](SnapshotMeta$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SnapshotMeta$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `long` | `[$lessinit$greater$default$2](#$lessinit$greater$default$2())()` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[apply](#apply(long,long))​(long sequenceNr,  long timestamp)` |  |
	| `long` | `[apply$default$2](#apply$default$2())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[create](#create(long))​(long sequenceNr)` |  |
	| `[SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit")` | `[create](#create(long,long))​(long sequenceNr,  long timestamp)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.SnapshotMeta))​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [SnapshotMeta$](SnapshotMeta$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### SnapshotMeta$
		
		
		
		```
		public SnapshotMeta$()
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$2
		
		
		
		```
		public long $lessinit$greater$default$2()
		```
		- #### create
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") create​(long sequenceNr,
		                           long timestamp)
		```
		- #### create
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") create​(long sequenceNr)
		```
		- #### apply
		
		
		
		```
		public [SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") apply​(long sequenceNr,
		                          long timestamp)
		```
		- #### apply$default$2
		
		
		
		```
		public long apply$default$2()
		```
		- #### unapply
		
		
		
		```
		public scala.Option<scala.Tuple2<java.lang.Object,​java.lang.Object>> unapply​([SnapshotMeta](SnapshotMeta.html "class in akka.persistence.testkit") x$0)
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/SnapshotMeta$.html)*