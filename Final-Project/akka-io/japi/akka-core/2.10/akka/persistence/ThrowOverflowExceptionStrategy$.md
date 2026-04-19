---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:11:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy$.html
title: ThrowOverflowExceptionStrategy$
---

# ThrowOverflowExceptionStrategy$

## Content

Package [akka.persistence](package-summary.html)
## Class ThrowOverflowExceptionStrategy$

- java.lang.Object
- - akka.persistence.ThrowOverflowExceptionStrategy$

- All Implemented Interfaces:
`[StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class ThrowOverflowExceptionStrategy$
extends java.lang.Object
implements [StashOverflowStrategy](StashOverflowStrategy.html "interface in akka.persistence"), scala.Product, java.io.Serializable
```

Throw [`StashOverflowException`](../actor/StashOverflowException.html "class in akka.actor"), hence the persistent actor will starting recovery
 if guarded by default supervisor strategy.
 Be carefully if used together with persist/persistAll or has many messages needed
 to replay.

See Also:
[Serialized Form](../../serialized-form.html#akka.persistence.ThrowOverflowExceptionStrategy$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[ThrowOverflowExceptionStrategy$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence")` | `[getInstance](#getInstance())()` | Java API: get the singleton instance |
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
		public static final [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### ThrowOverflowExceptionStrategy$
		
		
		
		```
		public ThrowOverflowExceptionStrategy$()
		```

	- ### Method Detail
	
	
	
		- #### getInstance
		
		
		
		```
		public [ThrowOverflowExceptionStrategy$](ThrowOverflowExceptionStrategy$.html "class in akka.persistence") getInstance()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/actor/StashOverflowException.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/StashOverflowStrategy.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/ThrowOverflowExceptionStrategy$.html)*