---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/Reject.html
title: Reject
---

# Reject

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class Reject

- java.lang.Object
- - akka.persistence.testkit.Reject

- All Implemented Interfaces:
`[ProcessingFailure](ProcessingFailure.html "interface in akka.persistence.testkit")`, `[ProcessingResult](ProcessingResult.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class Reject
extends java.lang.Object
implements [ProcessingFailure](ProcessingFailure.html "interface in akka.persistence.testkit"), scala.Product, java.io.Serializable
```

Emulates rejection of operation by the journal with `error` exception.
 Has the same meaning as `StorageFailure` for snapshot storage,
 because it does not support rejections.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.Reject)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Reject](#%3Cinit%3E(java.lang.Throwable))​(java.lang.Throwable error)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static java.lang.Throwable` | `[$lessinit$greater$default$1](#$lessinit$greater$default$1())()` |  |
	| `static [Reject](Reject.html "class in akka.persistence.testkit")` | `[apply](#apply(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `static java.lang.Throwable` | `[apply$default$1](#apply$default$1())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[Reject](Reject.html "class in akka.persistence.testkit")` | `[copy](#copy(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `java.lang.Throwable` | `[copy$default$1](#copy$default$1())()` |  |
	| `static [Reject](Reject.html "class in akka.persistence.testkit")` | `[create](#create())()` |  |
	| `static [Reject](Reject.html "class in akka.persistence.testkit")` | `[create](#create(java.lang.Throwable))​(java.lang.Throwable error)` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Throwable` | `[error](#error())()` |  |
	| `java.lang.Throwable` | `[getError](#getError())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Throwable>` | `[unapply](#unapply(akka.persistence.testkit.Reject))​([Reject](Reject.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Reject
		
		
		
		```
		public Reject​(java.lang.Throwable error)
		```

	- ### Method Detail
	
	
	
		- #### $lessinit$greater$default$1
		
		
		
		```
		public static java.lang.Throwable $lessinit$greater$default$1()
		```
		- #### create
		
		
		
		```
		public static [Reject](Reject.html "class in akka.persistence.testkit") create​(java.lang.Throwable error)
		```
		- #### create
		
		
		
		```
		public static [Reject](Reject.html "class in akka.persistence.testkit") create()
		```
		- #### apply
		
		
		
		```
		public static [Reject](Reject.html "class in akka.persistence.testkit") apply​(java.lang.Throwable error)
		```
		- #### apply$default$1
		
		
		
		```
		public static java.lang.Throwable apply$default$1()
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Throwable> unapply​([Reject](Reject.html "class in akka.persistence.testkit") x$0)
		```
		- #### error
		
		
		
		```
		public java.lang.Throwable error()
		```
		
		
		Specified by:
		`[error](ProcessingFailure.html#error())` in interface `[ProcessingFailure](ProcessingFailure.html "interface in akka.persistence.testkit")`
		- #### getError
		
		
		
		```
		public java.lang.Throwable getError()
		```
		- #### copy
		
		
		
		```
		public [Reject](Reject.html "class in akka.persistence.testkit") copy​(java.lang.Throwable error)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Throwable copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingFailure.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/ProcessingResult.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/Reject.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/Reject.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/Reject.html)*