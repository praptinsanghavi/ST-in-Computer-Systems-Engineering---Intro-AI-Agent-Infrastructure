---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:48:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.html
title: Counter
---

# Counter

## Content

Package [akka.persistence.typed.crdt](package-summary.html)
## Class Counter

- java.lang.Object
- - akka.persistence.typed.crdt.Counter

- All Implemented Interfaces:
`[OpCrdt](OpCrdt.html "interface in akka.persistence.typed.crdt")<[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Counter
extends java.lang.Object
implements [OpCrdt](OpCrdt.html "interface in akka.persistence.typed.crdt")<[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>, scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../../serialized-form.html#akka.persistence.typed.crdt.Counter)

- - ### Nested Class Summary
	
	
	
	Nested Classes 
	| Modifier and Type | Class | Description |
	| `static class` | `[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")` |  |
	| `static class` | `[Counter.Updated$](Counter.Updated$.html "class in akka.persistence.typed.crdt")` |  |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Counter](#%3Cinit%3E(scala.math.BigInt))​(scala.math.BigInt value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Counter](Counter.html "class in akka.persistence.typed.crdt")` | `[apply](#apply(scala.math.BigInt))​(scala.math.BigInt value)` |  |
	| `[Counter](Counter.html "class in akka.persistence.typed.crdt")` | `[applyOperation](#applyOperation(akka.persistence.typed.crdt.Counter.Updated))​([Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt") event)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Counter](Counter.html "class in akka.persistence.typed.crdt")` | `[copy](#copy(scala.math.BigInt))​(scala.math.BigInt value)` |  |
	| `scala.math.BigInt` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Counter](Counter.html "class in akka.persistence.typed.crdt")` | `[empty](#empty())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.math.BigInt>` | `[unapply](#unapply(akka.persistence.typed.crdt.Counter))​([Counter](Counter.html "class in akka.persistence.typed.crdt") x$0)` |  |
	| `scala.math.BigInt` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Counter
		
		
		
		```
		public Counter​(scala.math.BigInt value)
		```

	- ### Method Detail
	
	
	
		- #### empty
		
		
		
		```
		public static [Counter](Counter.html "class in akka.persistence.typed.crdt") empty()
		```
		- #### apply
		
		
		
		```
		public static [Counter](Counter.html "class in akka.persistence.typed.crdt") apply​(scala.math.BigInt value)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.math.BigInt> unapply​([Counter](Counter.html "class in akka.persistence.typed.crdt") x$0)
		```
		- #### value
		
		
		
		```
		public scala.math.BigInt value()
		```
		- #### applyOperation
		
		
		
		```
		public [Counter](Counter.html "class in akka.persistence.typed.crdt") applyOperation​([Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt") event)
		```
		
		
		Specified by:
		`[applyOperation](OpCrdt.html#applyOperation(Operation))` in interface `[OpCrdt](OpCrdt.html "interface in akka.persistence.typed.crdt")<[Counter.Updated](Counter.Updated.html "class in akka.persistence.typed.crdt")>`
		- #### copy
		
		
		
		```
		public [Counter](Counter.html "class in akka.persistence.typed.crdt") copy​(scala.math.BigInt value)
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.Updated$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.Updated.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/OpCrdt.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/crdt/Counter.html)*