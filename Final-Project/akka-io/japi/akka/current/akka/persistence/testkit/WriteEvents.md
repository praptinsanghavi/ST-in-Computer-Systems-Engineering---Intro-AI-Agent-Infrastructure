---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents.html
title: WriteEvents
---

# WriteEvents

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class WriteEvents

- java.lang.Object
- - akka.persistence.testkit.WriteEvents

- All Implemented Interfaces:
`[JournalOperation](JournalOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class WriteEvents
extends java.lang.Object
implements [JournalOperation](JournalOperation.html "interface in akka.persistence.testkit"), scala.Product, java.io.Serializable
```

Write in journal operation with events to be written.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.WriteEvents)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[WriteEvents](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> batch)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [WriteEvents](WriteEvents.html "class in akka.persistence.testkit")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> batch)` |  |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[batch](#batch())()` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[WriteEvents](WriteEvents.html "class in akka.persistence.testkit")` | `[copy](#copy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> batch)` |  |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.util.List<java.lang.Object>` | `[getBatch](#getBatch())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<scala.collection.immutable.Seq<java.lang.Object>>` | `[unapply](#unapply(akka.persistence.testkit.WriteEvents))​([WriteEvents](WriteEvents.html "class in akka.persistence.testkit") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### WriteEvents
		
		
		
		```
		public WriteEvents​(scala.collection.immutable.Seq<java.lang.Object> batch)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [WriteEvents](WriteEvents.html "class in akka.persistence.testkit") apply​(scala.collection.immutable.Seq<java.lang.Object> batch)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<scala.collection.immutable.Seq<java.lang.Object>> unapply​([WriteEvents](WriteEvents.html "class in akka.persistence.testkit") x$0)
		```
		- #### batch
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Object> batch()
		```
		- #### getBatch
		
		
		
		```
		public java.util.List<java.lang.Object> getBatch()
		```
		- #### copy
		
		
		
		```
		public [WriteEvents](WriteEvents.html "class in akka.persistence.testkit") copy​(scala.collection.immutable.Seq<java.lang.Object> batch)
		```
		- #### copy$default$1
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Object> copy$default$1()
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

- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/WriteEvents.html)*