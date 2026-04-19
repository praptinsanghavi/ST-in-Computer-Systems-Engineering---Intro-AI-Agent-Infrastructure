---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:46:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/stream/Attributes.CancellationStrategy$.FailStage$.html
title: Attributes.CancellationStrategy$.FailStage$
---

# Attributes.CancellationStrategy$.FailStage$

## Content

Package [akka.stream](package-summary.html)
## Class Attributes.CancellationStrategy$.FailStage$

- java.lang.Object
- - akka.stream.Attributes.CancellationStrategy$.FailStage$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Attributes.CancellationStrategy$](Attributes.CancellationStrategy$.html "class in akka.stream")

---

```
public static class Attributes.CancellationStrategy$.FailStage$
extends java.lang.Object
implements scala.Product, java.io.Serializable
```

Strategy that treats `cancelStage` the same as `failStage`, i.e. all inlets are cancelled (propagating the
 cancellation cause) and all outlets are failed propagating the cause from cancellation.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.Attributes.CancellationStrategy$.FailStage$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Attributes.CancellationStrategy$.FailStage$](Attributes.CancellationStrategy$.FailStage$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[FailStage$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
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
		public static final [Attributes.CancellationStrategy$.FailStage$](Attributes.CancellationStrategy$.FailStage$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### FailStage$
		
		
		
		```
		public FailStage$()
		```

	- ### Method Detail
	
	
	
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

- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.CancellationStrategy$.FailStage$.html
- https://doc.akka.io/japi/akka/current/akka/stream/Attributes.CancellationStrategy$.html
- https://doc.akka.io/japi/akka/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/stream/Attributes.CancellationStrategy$.FailStage$.html](https://doc.akka.io/japi/akka/current/akka/stream/Attributes.CancellationStrategy$.FailStage$.html)*