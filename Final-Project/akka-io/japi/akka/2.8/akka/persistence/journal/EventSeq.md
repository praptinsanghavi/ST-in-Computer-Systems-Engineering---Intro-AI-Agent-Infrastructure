---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:30:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EventSeq.html
title: EventSeq
---

# EventSeq

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventSeq

- java.lang.Object
- - akka.persistence.journal.EventSeq

- Direct Known Subclasses:
`[EmptyEventSeq$](EmptyEventSeq$.html "class in akka.persistence.journal")`, `[EventsSeq](EventsSeq.html "class in akka.persistence.journal")`, `[SingleEventSeq](SingleEventSeq.html "class in akka.persistence.journal")`

---

```
public abstract class EventSeq
extends java.lang.Object
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSeq](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `static [EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> events)` |  |
	| `static [EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[create](#create(java.lang.Object...))​(java.lang.Object... events)` | Java API |
	| `static [EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[create](#create(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> events)` | Java API |
	| `static [EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[empty](#empty())()` | Java API |
	| `abstract scala.collection.immutable.Seq<java.lang.Object>` | `[events](#events())()` |  |
	| `static [EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[single](#single(java.lang.Object))​(java.lang.Object event)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventSeq
		
		
		
		```
		public EventSeq()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public static final [EventSeq](EventSeq.html "class in akka.persistence.journal") create​(java.lang.Object... events)
		```
		
		Java API
		- #### empty
		
		
		
		```
		public static final [EventSeq](EventSeq.html "class in akka.persistence.journal") empty()
		```
		
		Java API
		- #### single
		
		
		
		```
		public static final [EventSeq](EventSeq.html "class in akka.persistence.journal") single​(java.lang.Object event)
		```
		
		Java API
		- #### create
		
		
		
		```
		public static final [EventSeq](EventSeq.html "class in akka.persistence.journal") create​(scala.collection.immutable.Seq<java.lang.Object> events)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public static final [EventSeq](EventSeq.html "class in akka.persistence.journal") apply​(scala.collection.immutable.Seq<java.lang.Object> events)
		```
		- #### events
		
		
		
		```
		public abstract scala.collection.immutable.Seq<java.lang.Object> events()
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EmptyEventSeq$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EventsSeq.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/SingleEventSeq.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EventSeq.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EventSeq.html)*