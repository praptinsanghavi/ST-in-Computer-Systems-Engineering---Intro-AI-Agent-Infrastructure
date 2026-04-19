---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:12Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq$.html
title: EventSeq$
---

# EventSeq$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventSeq$

- java.lang.Object
- - akka.persistence.journal.EventSeq$

- ---

```
public class EventSeq$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSeq$](EventSeq$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> events)` |  |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[create](#create(java.lang.Object...))​(java.lang.Object... events)` | Java API |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[create](#create(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<java.lang.Object> events)` | Java API |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[empty](#empty())()` | Java API |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[single](#single(java.lang.Object))​(java.lang.Object event)` | Java API |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSeq$](EventSeq$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSeq$
		
		
		
		```
		public EventSeq$()
		```

	- ### Method Detail
	
	
	
		- #### create
		
		
		
		```
		public final [EventSeq](EventSeq.html "class in akka.persistence.journal") create​(java.lang.Object... events)
		```
		
		Java API
		- #### empty
		
		
		
		```
		public final [EventSeq](EventSeq.html "class in akka.persistence.journal") empty()
		```
		
		Java API
		- #### single
		
		
		
		```
		public final [EventSeq](EventSeq.html "class in akka.persistence.journal") single​(java.lang.Object event)
		```
		
		Java API
		- #### create
		
		
		
		```
		public final [EventSeq](EventSeq.html "class in akka.persistence.journal") create​(scala.collection.immutable.Seq<java.lang.Object> events)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public final [EventSeq](EventSeq.html "class in akka.persistence.journal") apply​(scala.collection.immutable.Seq<java.lang.Object> events)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq$.html)*