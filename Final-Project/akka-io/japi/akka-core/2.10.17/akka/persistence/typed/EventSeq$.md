---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:02:18Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSeq$.html
title: EventSeq$
---

# EventSeq$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class EventSeq$

- java.lang.Object
- - akka.persistence.typed.EventSeq$

- ---

```
public class EventSeq$
extends java.lang.Object
```

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventSeq$](EventSeq$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A>` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<A> events)` | Scala API |
	| `<A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A>` | `[create](#create(java.util.List))​(java.util.List<A> events)` | Java API |
	| `<A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A>` | `[empty](#empty())()` |  |
	| `<A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A>` | `[many](#many(java.lang.Object...))​(java.lang.Object... events)` |  |
	| `<A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A>` | `[many](#many(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<A> events)` |  |
	| `<A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A>` | `[single](#single(A))​(A event)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventSeq$](EventSeq$.html "class in akka.persistence.typed") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### EventSeq$
		
		
		
		```
		public EventSeq$()
		```

	- ### Method Detail
	
	
	
		- #### many
		
		
		
		```
		public final <A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A> many​(java.lang.Object... events)
		```
		- #### empty
		
		
		
		```
		public final <A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A> empty()
		```
		- #### single
		
		
		
		```
		public final <A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A> single​(A event)
		```
		- #### many
		
		
		
		```
		public final <A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A> many​(scala.collection.immutable.Seq<A> events)
		```
		- #### create
		
		
		
		```
		public final <A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A> create​(java.util.List<A> events)
		```
		
		Java API
		- #### apply
		
		
		
		```
		public final <A> [EventSeq](EventSeq.html "interface in akka.persistence.typed")<A> apply​(scala.collection.immutable.Seq<A> events)
		```
		
		Scala API

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSeq$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSeq$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/typed/EventSeq$.html)*