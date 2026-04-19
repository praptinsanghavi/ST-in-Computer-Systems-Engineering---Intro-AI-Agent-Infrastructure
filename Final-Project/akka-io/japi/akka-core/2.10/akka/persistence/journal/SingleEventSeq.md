---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/SingleEventSeq.html
title: SingleEventSeq
---

# SingleEventSeq

## Content

Package [akka.persistence.journal](package-summary.html)
## Class SingleEventSeq

- java.lang.Object
- - [akka.persistence.journal.EventSeq](EventSeq.html "class in akka.persistence.journal")
	- - akka.persistence.journal.SingleEventSeq

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class SingleEventSeq
extends [EventSeq](EventSeq.html "class in akka.persistence.journal")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.SingleEventSeq)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[SingleEventSeq](#%3Cinit%3E(java.lang.Object))​(java.lang.Object event)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal")` | `[apply](#apply(java.lang.Object))​(java.lang.Object event)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal")` | `[copy](#copy(java.lang.Object))​(java.lang.Object event)` |  |
	| `java.lang.Object` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `java.lang.Object` | `[event](#event())()` |  |
	| `scala.collection.immutable.Seq<java.lang.Object>` | `[events](#events())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.journal.SingleEventSeq))​([SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal") x$0)` |  |
	
	
		- ### Methods inherited from class akka.persistence.journal.[EventSeq](EventSeq.html "class in akka.persistence.journal")
		
		
		`[apply](EventSeq.html#apply(scala.collection.immutable.Seq)), [create](EventSeq.html#create(java.lang.Object...)), [create](EventSeq.html#create(scala.collection.immutable.Seq)), [empty](EventSeq.html#empty()), [single](EventSeq.html#single(java.lang.Object))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### SingleEventSeq
		
		
		
		```
		public SingleEventSeq​(java.lang.Object event)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal") apply​(java.lang.Object event)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal") x$0)
		```
		- #### event
		
		
		
		```
		public java.lang.Object event()
		```
		- #### events
		
		
		
		```
		public scala.collection.immutable.Seq<java.lang.Object> events()
		```
		
		
		Specified by:
		`[events](EventSeq.html#events())` in class `[EventSeq](EventSeq.html "class in akka.persistence.journal")`
		- #### toString
		
		
		
		```
		public java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### copy
		
		
		
		```
		public [SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal") copy​(java.lang.Object event)
		```
		- #### copy$default$1
		
		
		
		```
		public java.lang.Object copy$default$1()
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
		- #### equals
		
		
		
		```
		public boolean equals​(java.lang.Object x$1)
		```
		
		
		Specified by:
		`equals` in interface `scala.Equals`
		Overrides:
		`equals` in class `java.lang.Object`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/SingleEventSeq.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/SingleEventSeq.html)*