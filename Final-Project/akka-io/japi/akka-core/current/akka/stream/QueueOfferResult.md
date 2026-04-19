---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:02:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.QueueClosed$.html
title: QueueOfferResult.QueueClosed$
---

# QueueOfferResult.QueueClosed$

## Content

Package [akka.stream](package-summary.html)
## Class QueueOfferResult.QueueClosed$

- java.lang.Object
- - [akka.stream.QueueOfferResult](QueueOfferResult.html "class in akka.stream")
	- - [akka.stream.QueueCompletionResult](QueueCompletionResult.html "class in akka.stream")
		- - akka.stream.QueueOfferResult.QueueClosed$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

Enclosing class:
[QueueOfferResult](QueueOfferResult.html "class in akka.stream")

---

```
public static class QueueOfferResult.QueueClosed$
extends [QueueCompletionResult](QueueCompletionResult.html "class in akka.stream")
implements scala.Product, java.io.Serializable
```

Type is used to indicate that stream is completed before call

See Also:
[Serialized Form](../../serialized-form.html#akka.stream.QueueOfferResult.QueueClosed$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from class akka.stream.[QueueOfferResult](QueueOfferResult.html "class in akka.stream")
		
		
		`[QueueOfferResult.Dropped$](QueueOfferResult.Dropped$.html "class in akka.stream"), [QueueOfferResult.Enqueued$](QueueOfferResult.Enqueued$.html "class in akka.stream"), [QueueOfferResult.Failure](QueueOfferResult.Failure.html "class in akka.stream"), [QueueOfferResult.Failure$](QueueOfferResult.Failure$.html "class in akka.stream"), [QueueOfferResult.QueueClosed$](QueueOfferResult.QueueClosed$.html "class in akka.stream")`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [QueueOfferResult.QueueClosed$](QueueOfferResult.QueueClosed$.html "class in akka.stream")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[QueueClosed$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `boolean` | `[isEnqueued](#isEnqueued())()` | Return ture if the element was already enqueued, otherwise false. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class akka.stream.[QueueOfferResult](QueueOfferResult.html "class in akka.stream")
		
		
		`[dropped](QueueOfferResult.html#dropped()), [enqueued](QueueOfferResult.html#enqueued())`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [QueueOfferResult.QueueClosed$](QueueOfferResult.QueueClosed$.html "class in akka.stream") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### QueueClosed$
		
		
		
		```
		public QueueClosed$()
		```

	- ### Method Detail
	
	
	
		- #### isEnqueued
		
		
		
		```
		public boolean isEnqueued()
		```
		
		Description copied from class: `[QueueOfferResult](QueueOfferResult.html#isEnqueued())`
		Return ture if the element was already enqueued, otherwise false.
		
		Specified by:
		`[isEnqueued](QueueOfferResult.html#isEnqueued())` in class `[QueueOfferResult](QueueOfferResult.html "class in akka.stream")`
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

- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueCompletionResult.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.Dropped$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.Enqueued$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.Failure$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.Failure.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.QueueClosed$.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.html
- https://doc.akka.io/japi/akka-core/current/akka/stream/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.QueueClosed$.html](https://doc.akka.io/japi/akka-core/current/akka/stream/QueueOfferResult.QueueClosed$.html)*