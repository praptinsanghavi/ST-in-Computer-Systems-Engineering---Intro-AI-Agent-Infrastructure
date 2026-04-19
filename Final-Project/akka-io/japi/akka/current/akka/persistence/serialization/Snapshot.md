---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:11Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Snapshot.html
title: Snapshot
---

# Snapshot

## Content

Package [akka.persistence.serialization](package-summary.html)
## Class Snapshot

- java.lang.Object
- - akka.persistence.serialization.Snapshot

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Snapshot
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Wrapper for snapshot `data`. Snapshot `data` are the actual snapshot objects captured by
 the persistent actor.
 

See Also:
[`SnapshotSerializer`](SnapshotSerializer.html "class in akka.persistence.serialization"), 
[Serialized Form](../../../serialized-form.html#akka.persistence.serialization.Snapshot)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Snapshot](#%3Cinit%3E(java.lang.Object))​(java.lang.Object data)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Snapshot](Snapshot.html "class in akka.persistence.serialization")` | `[apply](#apply(java.lang.Object))​(java.lang.Object data)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Snapshot](Snapshot.html "class in akka.persistence.serialization")` | `[copy](#copy(java.lang.Object))​(java.lang.Object data)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `java.lang.Object` | `[data](#data())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.serialization.Snapshot))​([Snapshot](Snapshot.html "class in akka.persistence.serialization") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Snapshot
		
		
		
		```
		public Snapshot​(java.lang.Object data)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Snapshot](Snapshot.html "class in akka.persistence.serialization") apply​(java.lang.Object data)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([Snapshot](Snapshot.html "class in akka.persistence.serialization") x$0)
		```
		- #### data
		
		
		
		```
		public java.lang.Object data()
		```
		- #### copy
		
		
		
		```
		public [Snapshot](Snapshot.html "class in akka.persistence.serialization") copy​(java.lang.Object data)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Snapshot.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/SnapshotSerializer.html
- https://doc.akka.io/japi/akka/current/akka/persistence/serialization/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Snapshot.html](https://doc.akka.io/japi/akka/current/akka/persistence/serialization/Snapshot.html)*