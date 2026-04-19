---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:43:14Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DiscardToDeadLetterStrategy$.html
title: DiscardToDeadLetterStrategy$
---

# DiscardToDeadLetterStrategy$

## Content

Package [akka.persistence](package-summary.html)
## Class DiscardToDeadLetterStrategy$

- java.lang.Object
- - akka.persistence.DiscardToDeadLetterStrategy$

- All Implemented Interfaces:
`[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class DiscardToDeadLetterStrategy$
extends java.lang.Object
implements [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence"), scala.Product, java.io.Serializable
```

Discard the message to [`DeadLetter`](../actor/DeadLetter.html "class in akka.actor").

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.DiscardToDeadLetterStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DiscardToDeadLetterStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
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
		public static final [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### DiscardToDeadLetterStrategy$
		
		
		
		```
		public DiscardToDeadLetterStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [DiscardToDeadLetterStrategy$](DiscardToDeadLetterStrategy$.html "class in akka.persistence") getInstance()
		```
		
		Java API: get the singleton instance
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

- https://doc.akka.io/japi/akka-core/2.10.17/akka/actor/DeadLetter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DiscardToDeadLetterStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DiscardToDeadLetterStrategy$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/DiscardToDeadLetterStrategy$.html)*