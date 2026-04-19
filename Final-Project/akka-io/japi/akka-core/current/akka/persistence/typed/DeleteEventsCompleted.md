---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:56:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/DeleteEventsCompleted.html
title: DeleteEventsCompleted
---

# DeleteEventsCompleted

## Content

Package [akka.persistence.typed](package-summary.html)
## Class DeleteEventsCompleted

- java.lang.Object
- - akka.persistence.typed.DeleteEventsCompleted

- All Implemented Interfaces:
`[Signal](../../actor/typed/Signal.html "interface in akka.actor.typed")`, `[EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public final class DeleteEventsCompleted
extends java.lang.Object
implements [EventSourcedSignal](EventSourcedSignal.html "interface in akka.persistence.typed"), scala.Product, java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.DeleteEventsCompleted)

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[DeleteEventsCompleted](#%3Cinit%3E(long))​(long toSequenceNr)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed")` | `[apply](#apply(long))​(long toSequenceNr)` |  |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed")` | `[copy](#copy(long))​(long toSequenceNr)` |  |
	| `long` | `[copy$default$1](#copy$default$1())()` |  |
	| `boolean` | `[equals](#equals(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `long` | `[getToSequenceNr](#getToSequenceNr())()` | Java API |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `java.lang.String` | `[productElementName](#productElementName(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `long` | `[toSequenceNr](#toSequenceNr())()` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `static scala.Option<java.lang.Object>` | `[unapply](#unapply(akka.persistence.typed.DeleteEventsCompleted))​([DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed") x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementNames`

- - ### Constructor Detail
	
	
	
		- #### DeleteEventsCompleted
		
		
		
		```
		public DeleteEventsCompleted​(long toSequenceNr)
		```

	- ### Method Detail
	
	
	
		- #### apply
		
		
		
		```
		public static [DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed") apply​(long toSequenceNr)
		```
		- #### unapply
		
		
		
		```
		public static scala.Option<java.lang.Object> unapply​([DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed") x$0)
		```
		- #### toSequenceNr
		
		
		
		```
		public long toSequenceNr()
		```
		- #### getToSequenceNr
		
		
		
		```
		public long getToSequenceNr()
		```
		
		Java API
		- #### copy
		
		
		
		```
		public [DeleteEventsCompleted](DeleteEventsCompleted.html "class in akka.persistence.typed") copy​(long toSequenceNr)
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

- https://doc.akka.io/japi/akka-core/current/akka/actor/typed/Signal.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/DeleteEventsCompleted.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/EventSourcedSignal.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/DeleteEventsCompleted.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/typed/DeleteEventsCompleted.html)*