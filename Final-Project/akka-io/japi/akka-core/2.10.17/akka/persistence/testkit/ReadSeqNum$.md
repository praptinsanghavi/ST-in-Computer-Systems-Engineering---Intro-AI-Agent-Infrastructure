---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:47:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ReadSeqNum$.html
title: ReadSeqNum$
---

# ReadSeqNum$

## Content

Package [akka.persistence.testkit](package-summary.html)
## Class ReadSeqNum$

- java.lang.Object
- - akka.persistence.testkit.ReadSeqNum$

- All Implemented Interfaces:
`[JournalOperation](JournalOperation.html "interface in akka.persistence.testkit")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ReadSeqNum$
extends java.lang.Object
implements [JournalOperation](JournalOperation.html "interface in akka.persistence.testkit"), scala.Product, java.io.Serializable
```

Read persistent actor's sequence number operation.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.testkit.ReadSeqNum$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ReadSeqNum$](ReadSeqNum$.html "class in akka.persistence.testkit")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ReadSeqNum$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ReadSeqNum$](ReadSeqNum$.html "class in akka.persistence.testkit")` | `[getInstance](#getInstance())()` | Java API: the singleton instance. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [ReadSeqNum$](ReadSeqNum$.html "class in akka.persistence.testkit") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ReadSeqNum$
		
		
		
		```
		public ReadSeqNum$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [ReadSeqNum$](ReadSeqNum$.html "class in akka.persistence.testkit") getInstance()
		```
		
		Java API: the singleton instance.
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/JournalOperation.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ReadSeqNum$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ReadSeqNum$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/testkit/ReadSeqNum$.html)*