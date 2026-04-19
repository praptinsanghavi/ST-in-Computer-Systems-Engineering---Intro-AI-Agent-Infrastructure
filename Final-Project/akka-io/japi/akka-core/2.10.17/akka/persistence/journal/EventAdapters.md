---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:37Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html
title: EventAdapters.CombinedReadEventAdapter$
---

# EventAdapters.CombinedReadEventAdapter$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class EventAdapters.CombinedReadEventAdapter$

- java.lang.Object
- - scala.runtime.AbstractFunction1\<scala.collection.immutable.Seq\<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")\>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter\>
	- - akka.persistence.journal.EventAdapters.CombinedReadEventAdapter$

- All Implemented Interfaces:
`java.io.Serializable`, `scala.Function1<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter>`

Enclosing class:
[EventAdapters](EventAdapters.html "class in akka.persistence.journal")

---

```
public static class EventAdapters.CombinedReadEventAdapter$
extends scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter>
implements java.io.Serializable
```

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.EventAdapters.CombinedReadEventAdapter$)

- - ### Nested Class Summary
	
	
		- ### Nested classes/interfaces inherited from interface scala.Function1
		
		
		`scala.Function1.UnliftOps<A extends java.lang.Object,​B extends java.lang.Object>, scala.Function1.UnliftOps$`

	- ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [EventAdapters.CombinedReadEventAdapter$](EventAdapters.CombinedReadEventAdapter$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[CombinedReadEventAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `akka.persistence.journal.EventAdapters.CombinedReadEventAdapter` | `[apply](#apply(scala.collection.immutable.Seq))​(scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")> adapters)` |  |
	| `java.lang.String` | `[toString](#toString())()` |  |
	| `scala.Option<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>>` | `[unapply](#unapply(akka.persistence.journal.EventAdapters.CombinedReadEventAdapter))​(akka.persistence.journal.EventAdapters.CombinedReadEventAdapter x$0)` |  |
	
	
		- ### Methods inherited from class scala.runtime.AbstractFunction1
		
		
		`andThen, apply$mcDD$sp, apply$mcDF$sp, apply$mcDI$sp, apply$mcDJ$sp, apply$mcFD$sp, apply$mcFF$sp, apply$mcFI$sp, apply$mcFJ$sp, apply$mcID$sp, apply$mcIF$sp, apply$mcII$sp, apply$mcIJ$sp, apply$mcJD$sp, apply$mcJF$sp, apply$mcJI$sp, apply$mcJJ$sp, apply$mcVD$sp, apply$mcVF$sp, apply$mcVI$sp, apply$mcVJ$sp, apply$mcZD$sp, apply$mcZF$sp, apply$mcZI$sp, apply$mcZJ$sp, compose`
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [EventAdapters.CombinedReadEventAdapter$](EventAdapters.CombinedReadEventAdapter$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### CombinedReadEventAdapter$
		
		
		
		```
		public CombinedReadEventAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### toString
		
		
		
		```
		public final java.lang.String toString()
		```
		
		
		Specified by:
		`toString` in interface `scala.Function1<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter>`
		Overrides:
		`toString` in class `scala.runtime.AbstractFunction1<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter>`
		- #### apply
		
		
		
		```
		public akka.persistence.journal.EventAdapters.CombinedReadEventAdapter apply​(scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")> adapters)
		```
		
		
		Specified by:
		`apply` in interface `scala.Function1<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>,​akka.persistence.journal.EventAdapters.CombinedReadEventAdapter>`
		- #### unapply
		
		
		
		```
		public scala.Option<scala.collection.immutable.Seq<[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")>> unapply​(akka.persistence.journal.EventAdapters.CombinedReadEventAdapter x$0)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10.17/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapters.CombinedReadEventAdapter$.html)*