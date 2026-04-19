---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:45Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/Sequence.html
title: Sequence
---

# Sequence

## Content

Package [akka.persistence.query](package-summary.html)
## Class Sequence

- java.lang.Object
- - [akka.persistence.query.Offset](Offset.html "class in akka.persistence.query")
	- - akka.persistence.query.Sequence

- All Implemented Interfaces:
`java.io.Serializable`, `java.lang.Comparable<[Sequence](Sequence.html "class in akka.persistence.query")>`, `scala.Equals`, `scala.math.Ordered<[Sequence](Sequence.html "class in akka.persistence.query")>`, `scala.Product`

---

```
public final class Sequence
extends [Offset](Offset.html "class in akka.persistence.query")
implements scala.math.Ordered<[Sequence](Sequence.html "class in akka.persistence.query")>, scala.Product, java.io.Serializable
```

Corresponds to an ordered sequence number for the events. Note that the corresponding
 offset of each event is provided in the [`EventEnvelope`](EventEnvelope.html "class in akka.persistence.query"),
 which makes it possible to resume the stream at a later point from a given offset.
 
 The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
 in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
 as the `offset` parameter in a subsequent query.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.query.Sequence)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[Sequence](#%3Cinit%3E(long))​(long value)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [Sequence](Sequence.html "class in akka.persistence.query")` | `[apply](#apply(long))​(long value)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[compare](#compare(akka.persistence.query.Sequence))​([Sequence](Sequence.html "class in akka.persistence.query") that)` |  |
	| `[Sequence](Sequence.html "class in akka.persistence.query")` | `[copy](#copy(long))​(long value)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.query.Sequence))​([Sequence](Sequence.html "class in akka.persistence.query") x$0)` |  |
	| `long` | `[value](#value())()` |  |
	
	
		- ### Methods inherited from class akka.persistence.query.[Offset](Offset.html "class in akka.persistence.query")
		
		
		`[noOffset](Offset.html#noOffset()), [sequence](Offset.html#sequence(long)), [timeBasedUUID](Offset.html#timeBasedUUID(java.util.UUID)), [timestamp](Offset.html#timestamp(java.time.Instant))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.math.Ordered
		
		
		`$greater, $greater$eq, $less, $less$eq, compareTo`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### Sequence
		
		
		
		```
		public Sequence​(long value)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [Sequence](Sequence.html "class in akka.persistence.query") apply​(long value)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([Sequence](Sequence.html "class in akka.persistence.query") x$0)
		```
		- #### value
		
		
		
		```
		public long value()
		```
		- #### compare
		
		
		
		```
		public int compare​([Sequence](Sequence.html "class in akka.persistence.query") that)
		```
		
		
		Specified by:
		`compare` in interface `scala.math.Ordered<[Sequence](Sequence.html "class in akka.persistence.query")>`
		- #### copy
		
		
		
		```
		public [Sequence](Sequence.html "class in akka.persistence.query") copy​(long value)
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

- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Sequence.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/Sequence.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/Sequence.html)*