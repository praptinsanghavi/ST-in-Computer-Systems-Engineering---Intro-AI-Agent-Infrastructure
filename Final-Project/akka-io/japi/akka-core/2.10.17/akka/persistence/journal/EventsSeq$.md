---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:41Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventsSeq$.html
title: EventsSeq$
---

# EventsSeq$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventsSeq$

- java.lang.Object
- - akka.persistence.journal.EventsSeq$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EventsSeq$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.EventsSeq$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventsSeq$](EventsSeq$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<E> [EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E>` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<E> events)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<E> scala.Option<scala.collection.immutable.Seq<E>>` | `[unapply](#unapply(akka.persistence.journal.EventsSeq))​([EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventsSeq$](EventsSeq$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventsSeq$
		
		
		
		```
		public EventsSeq$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Overrides:
		`toString` in class `java.lang.Object`
		- #### apply
		
		
		
		```
		public <E> [EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> apply​(scala.collection.immutable.Seq<E> events)
		```
		- #### unapply
		
		
		
		```
		public <E> scala.Option<scala.collection.immutable.Seq<E>> unapply​([EventsSeq](EventsSeq.html "class in akka.persistence.journal")<E> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventsSeq$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventsSeq$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventsSeq$.html)*