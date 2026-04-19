---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:12:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventsSeq.html
title: EventsSeq
---

# EventsSeq

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventsSeq\<E\>

- java.lang.Object
- - [akka.persistence.journal.EventSeq](EventSeq.html "class in akka.persistence.journal")
	- - akka.persistence.journal.EventsSeq\<E\>

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class EventsSeq<E>
extends [EventSeq](EventSeq.html "class in akka.persistence.journal")
implements scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.EventsSeq)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsSeq](#%3Cinit%3E(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[E](EventsSeq.html "type parameter in EventsSeq")> events)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static <E> [EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E>` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<E> events)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `<E> [EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E>` | `[copy](#copy(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<E> events)` |  |
	| `<E> scala.collection.immutable.Seq<E>` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `scala.collection.immutable.Seq<[E](EventsSeq.html "type parameter in EventsSeq")>` | `[events](#events())()` |  |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static <E> scala.Option<scala.collection.immutable.Seq<E>>` | `[unapply](#unapply(akka.persistence.journal.EventsSeq))​([EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> x$0)` |  |
	
	
		- ### Methods inherited from class akka.persistence.journal.[EventSeq](EventSeq.html "class in akka.persistence.journal")
		
		
		`[apply](EventSeq.html#apply(scala.collection.immutable.Seq)), [create](EventSeq.html#create(java.lang.Object...)), [create](EventSeq.html#create(scala.collection.immutable.Seq)), [empty](EventSeq.html#empty()), [single](EventSeq.html#single(java.lang.Object))`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### EventsSeq
		
		
		
		```
		public EventsSeq​(scala.collection.immutable.Seq<[E](EventsSeq.html "type parameter in EventsSeq")> events)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static <E> [EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> apply​(scala.collection.immutable.Seq<E> events)
		```
		- #### unapply
		
		
		
		```
		public static <E> scala.Option<scala.collection.immutable.Seq<E>> unapply​([EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> x$0)
		```
		- #### events
		
		
		
		```
		public scala.collection.immutable.Seq<[E](EventsSeq.html "type parameter in EventsSeq")> events()
		```
		- #### copy
		
		
		
		```
		public <E> [EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> copy​(scala.collection.immutable.Seq<E> events)
		```
		- #### copy$default$1
		
		
		
		```
		public <E> scala.collection.immutable.Seq<E> copy$default$1()
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

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventsSeq.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventsSeq.html)*