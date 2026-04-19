---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter$.html
title: IdentityEventAdapter$
---

# IdentityEventAdapter$

## Content

Package [akka.persistence.journal](package-summary.html)
## Class IdentityEventAdapter$

- java.lang.Object
- - akka.persistence.journal.IdentityEventAdapter$

- All Implemented Interfaces:
`[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")`, `[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")`, `[WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal")`, `java.io.Serializable`, `scala.Equals`, `scala.Product`

---

```
public class IdentityEventAdapter$
extends java.lang.Object
implements [EventAdapter](EventAdapter.html "interface in akka.persistence.journal"), scala.Product, java.io.Serializable
```

No\-op model adapter which passes through the incoming events as\-is.

See Also:
[Serialized Form](../../../serialized-form.html#akka.persistence.journal.IdentityEventAdapter$)

- - ### Field Summary
	
	
	
	Fields 
	| Modifier and Type | Field | Description |
	| `static [IdentityEventAdapter$](IdentityEventAdapter$.html "class in akka.persistence.journal")` | `[MODULE$](#MODULE$)` | Static reference to the singleton instance of this Scala object. |

	- ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[IdentityEventAdapter$](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `boolean` | `[canEqual](#canEqual(java.lang.Object))​(java.lang.Object x$1)` |  |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[fromJournal](#fromJournal(java.lang.Object,java.lang.String))​(java.lang.Object event,  java.lang.String manifest)` | Convert a event from its journal model to the applications domain model. |
	| `int` | `[hashCode](#hashCode())()` |  |
	| `java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object event)` | Return the manifest (type hint) that will be provided in the `fromJournal` method. |
	| `int` | `[productArity](#productArity())()` |  |
	| `java.lang.Object` | `[productElement](#productElement(int))​(int x$1)` |  |
	| `scala.collection.Iterator<java.lang.Object>` | `[productIterator](#productIterator())()` |  |
	| `java.lang.String` | `[productPrefix](#productPrefix())()` |  |
	| `java.lang.Object` | `[toJournal](#toJournal(java.lang.Object))​(java.lang.Object event)` | Convert domain event to journal event type. |
	| `java.lang.String` | `[toString](#toString())()` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, notify, notifyAll, wait, wait, wait`
		- ### Methods inherited from interface scala.Equals
		
		
		`equals`
		- ### Methods inherited from interface scala.Product
		
		
		`productElementName, productElementNames`

- - ### Field Detail
	
	
	
		- #### MODULE$
		
		
		
		```
		public static final [IdentityEventAdapter$](IdentityEventAdapter$.html "class in akka.persistence.journal") MODULE$
		```
		
		Static reference to the singleton instance of this Scala object.

	- ### Constructor Detail
	
	
	
		- #### IdentityEventAdapter$
		
		
		
		```
		public IdentityEventAdapter$()
		```

	- ### Method Detail
	
	
	
		- #### toJournal
		
		
		
		```
		public java.lang.Object toJournal​(java.lang.Object event)
		```
		
		Description copied from interface: `[WriteEventAdapter](WriteEventAdapter.html#toJournal(java.lang.Object))`
		Convert domain event to journal event type.
		 
		 Some journal may require a specific type to be returned to them,
		 for example if a primary key has to be associated with each event then a journal
		 may require adapters to return `com.example.myjournal.EventWithPrimaryKey(event, key)`.
		 
		
		
		 The `toJournal` adaptation must be an 1\-to\-1 transformation.
		 It is not allowed to drop incoming events during the `toJournal` adaptation.
		 
		
		
		
		Specified by:
		`[toJournal](WriteEventAdapter.html#toJournal(java.lang.Object))` in interface `[WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal")`
		Parameters:
		`event` \- the application\-side domain event to be adapted to the journal model
		Returns:
		the adapted event object, possibly the same object if no adaptation was performed
		- #### fromJournal
		
		
		
		```
		public [EventSeq](EventSeq.html "class in akka.persistence.journal") fromJournal​(java.lang.Object event,
		                            java.lang.String manifest)
		```
		
		Description copied from interface: `[ReadEventAdapter](ReadEventAdapter.html#fromJournal(java.lang.Object,java.lang.String))`
		Convert a event from its journal model to the applications domain model.
		 
		 One event may be adapter into multiple (or none) events which should be delivered to the [`PersistentActor`](../PersistentActor.html "interface in akka.persistence").
		 Use the specialised [`EventSeq.single(java.lang.Object)`](EventSeq.html#single(java.lang.Object)) method to emit exactly one event,
		 or [`EventSeq.empty()`](EventSeq.html#empty()) in case the adapter is not handling this event. Multiple [`EventAdapter`](EventAdapter.html "interface in akka.persistence.journal") instances are
		 applied in order as defined in configuration and their emitted event seqs are concatenated and delivered in order
		 to the PersistentActor.
		 
		
		
		
		Specified by:
		`[fromJournal](ReadEventAdapter.html#fromJournal(java.lang.Object,java.lang.String))` in interface `[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")`
		Parameters:
		`event` \- event to be adapted before delivering to the PersistentActor
		`manifest` \- optionally provided manifest (type hint) in case the Adapter has stored one for this event, `""` if none
		Returns:
		sequence containing the adapted events (possibly zero) which will be delivered to the PersistentActor
		- #### manifest
		
		
		
		```
		public java.lang.String manifest​(java.lang.Object event)
		```
		
		Description copied from interface: `[WriteEventAdapter](WriteEventAdapter.html#manifest(java.lang.Object))`
		Return the manifest (type hint) that will be provided in the `fromJournal` method.
		 Use `""` if manifest is not needed.
		
		Specified by:
		`[manifest](WriteEventAdapter.html#manifest(java.lang.Object))` in interface `[WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal")`
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

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/journal/package-summary.html
- https://doc.akka.io/japi/akka/current/serialized-form.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter$.html](https://doc.akka.io/japi/akka/current/akka/persistence/journal/IdentityEventAdapter$.html)*