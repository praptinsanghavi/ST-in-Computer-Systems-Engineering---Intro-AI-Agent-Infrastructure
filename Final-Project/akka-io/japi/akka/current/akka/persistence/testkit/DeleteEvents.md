---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:26:35Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/DeleteEvents.html
title: DeleteEvents
---

# DeleteEvents

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class DeleteEvents

- java.lang.Object
- - akka.persistence.testkit.DeleteEvents

- All Implemented Interfaces:
`[JournalOperation](JournalOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteEvents
extends java.lang.Object
implements [JournalOperation](JournalOperation.html "interface in akka.persistence.testkit"), scala.Product, java.io.Serializable
```

Delete events in the journal up to `toSeqNumber` operation.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.DeleteEvents)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteEvents](#%3Cinit%3E(long))​(long toSeqNumber)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit")` | `[apply](#apply(long))​(long toSeqNumber)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit")` | `[copy](#copy(long))​(long toSeqNumber)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `long` | `[getToSeqNumber](#getToSeqNumber())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[toSeqNumber](#toSeqNumber())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.testkit.DeleteEvents))​([DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteEvents
		
		
		
		```
		public DeleteEvents​(long toSeqNumber)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit") apply​(long toSeqNumber)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit") x$0)
		```
		- #### toSeqNumber
		
		
		
		```
		public long toSeqNumber()
		```
		- #### getToSeqNumber
		
		
		
		```
		public long getToSeqNumber()
		```
		- #### copy
		
		
		
		```
		public [DeleteEvents](DeleteEvents.html "class in akka.persistence.testkit") copy​(long toSeqNumber)
		```
		- #### copy$default$1
		
		
		
		```
		public long copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/DeleteEvents.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/DeleteEvents.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/DeleteEvents.html)*