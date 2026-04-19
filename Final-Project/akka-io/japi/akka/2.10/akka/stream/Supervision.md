---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:04:04Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/stream/Supervision.Restart$.html
title: Supervision.Restart$
---

# Supervision.Restart$

## Content

Package [akka.stream](package-summary.html)
## Class Supervision.Restart$

- java.lang.Object
- - akka.stream.Supervision.Restart$

- All Implemented Interfaces:
`[Supervision.Directive](Supervision.Directive.html "interface in akka.stream")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[Supervision](Supervision.html "class in akka.stream")

---

```
public static class Supervision.Restart$
extends java.lang.Object
implements [Supervision.Directive](Supervision.Directive.html "interface in akka.stream"), scala.Product, java.io.Serializable
```

Scala API: The element is dropped and the stream continues after restarting the operator
 if application code for processing an element throws an exception.
 Restarting an operator means that any accumulated state is cleared. This is typically
 performed by creating a new instance of the operator.

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.Supervision.Restart$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [Supervision.Restart$](Supervision.Restart$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Restart$](#%3Cinit%3E())()` |  |

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
		public static final [Supervision.Restart$](Supervision.Restart$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### Restart$
		
		
		
		```
		public Restart$()
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

- https://doc.akka.io/japi/akka/2.10/akka/stream/Supervision.Directive.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Supervision.Restart$.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/Supervision.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/stream/Supervision.Restart$.html](https://doc.akka.io/japi/akka/2.10/akka/stream/Supervision.Restart$.html)*