---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.Updated.html
title: Counter.Updated
---

# Counter.Updated

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class Counter.Updated

- java.lang.Object
- - akka.persistence.typed.crdt.Counter.Updated

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Counter](Counter.html "class in akka.persistence.typed.crdt")

---

```
public static final class Counter.Updated
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.crdt.Counter.Updated)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Updated](#%3Cinit%3E(int))​(int delta)` | JAVA API |
	| `[Updated](#%3Cinit%3E(java.math.BigInteger))​(java.math.BigInteger delta)` | JAVA API |
	| `[Updated](#%3Cinit%3E(scala.math.BigInt))​(scala.math.BigInt delta)` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")` | `[copy](#copy(scala.math.BigInt))​(scala.math.BigInt delta)` |  |
	| `scala.math.BigInt` | `[copy$default$1](#copy$default$1())()` |  |
	| `scala.math.BigInt` | `[delta](#delta())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Updated
		
		
		
		```
		public Updated​(scala.math.BigInt delta)
		```
		- #### Updated
		
		
		
		```
		public Updated​(java.math.BigInteger delta)
		```
		
		JAVA API
		- #### Updated
		
		
		
		```
		public Updated​(int delta)
		```
		
		JAVA API

	- ### Method Detail
	
	
	
		- #### delta
		
		
		
		```
		public scala.math.BigInt delta()
		```
		- #### copy
		
		
		
		```
		public [Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt") copy​(scala.math.BigInt delta)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.math.BigInt copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.Updated.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.Updated.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/crdt/Counter.Updated.html)*