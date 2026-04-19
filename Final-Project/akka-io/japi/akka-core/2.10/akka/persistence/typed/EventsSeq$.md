---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T20:13:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventsSeq$.html
title: EventsSeq$
---

# EventsSeq$

## Content

Package [akka.persistence.typed](package-summary.html)
## Class EventsSeq$

- java.lang.Object
- - akka.persistence.typed.EventsSeq$

- All Implemented Interfaces:
`java.io.Serializable`

---

```
public class EventsSeq$
extends java.lang.Object
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.typed.EventsSeq$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventsSeq$](EventsSeq$.html "class in akka.persistence.typed")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsSeq$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<A> akka.persistence.typed.EventsSeq<A>` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<A> events)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `<A> scala.Option<scala.collection.immutable.Seq<A>>` | `[unapply](#unapply(akka.persistence.typed.EventsSeq))​(akka.persistence.typed.EventsSeq<A> x$0)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventsSeq$](EventsSeq$.html "class in akka.persistence.typed") MODULE$
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
		public <A> akka.persistence.typed.EventsSeq<A> apply​(scala.collection.immutable.Seq<A> events)
		```
		- #### unapply
		
		
		
		```
		public <A> scala.Option<scala.collection.immutable.Seq<A>> unapply​(akka.persistence.typed.EventsSeq<A> x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventsSeq$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventsSeq$.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/EventsSeq$.html)*