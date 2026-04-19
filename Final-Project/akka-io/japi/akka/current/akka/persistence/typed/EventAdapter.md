---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:43:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventAdapter.html
title: EventAdapter
---

# EventAdapter

## Content

Package [akka.persistence.typed](package-summary.html)
## Class EventAdapter\<E,​P\>

- java.lang.Object
- - akka.persistence.typed.EventAdapter\<E,​P\>

- ---

```
public abstract class EventAdapter<E,​P>
extends java.lang.Object
```

Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.
 Typical use cases include (but are not limited to):
 
	- extracting events from "envelopes"
	- adapting events from a "domain model" to the "data model", e.g. converting to the Journals storage format,
	 such as JSON, BSON or any specialised binary format
	- adapting events from a "data model" to the "domain model"
	- adding metadata that is understood by the journal
	- migration by splitting up events into sequences of other events
	- migration filtering out unused events, or replacing an event with another

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventAdapter](#%3Cinit%3E())()` |  |

	- ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `abstract [EventSeq](EventSeq.html "interface in akka.persistence.typed")<[E](EventAdapter.html "type parameter in EventAdapter")>` | `[fromJournal](#fromJournal(P,java.lang.String))​([P](EventAdapter.html "type parameter in EventAdapter") p,  java.lang.String manifest)` | Transform the event on recovery from the journal. |
	| `abstract java.lang.String` | `[manifest](#manifest(E))​([E](EventAdapter.html "type parameter in EventAdapter") event)` | Return the manifest (type hint) that will be provided in the `fromJournal` method. |
	| `abstract [P](EventAdapter.html "type parameter in EventAdapter")` | `[toJournal](#toJournal(E))​([E](EventAdapter.html "type parameter in EventAdapter") e)` | Convert domain event to journal event type. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventAdapter
		
		
		
		```
		public EventAdapter()
		```

	- ### Method Detail
	
	
	
		- #### fromJournal
		
		
		
		```
		public abstract [EventSeq](EventSeq.html "interface in akka.persistence.typed")<[E](EventAdapter.html "type parameter in EventAdapter")> fromJournal​([P](EventAdapter.html "type parameter in EventAdapter") p,
		                                        java.lang.String manifest)
		```
		
		Transform the event on recovery from the journal.
		 Note that this is not called in any read side so will need to be applied
		 manually when using Query.
		 
		 Convert a event from its journal model to the applications domain model.
		 
		
		
		 One event may be adapter into multiple (or none) events which should be delivered to the `EventSourcedBehavior`.
		 Use the specialised `EventSeq.single` method to emit exactly one event,
		 or `EventSeq.empty` in case the adapter is not handling this event.
		 
		
		
		
		Parameters:
		`p` \- event to be adapted before delivering to the `EventSourcedBehavior`
		`manifest` \- optionally provided manifest (type hint) in case the Adapter has stored one
		 for this event, `""` if none
		Returns:
		sequence containing the adapted events (possibly zero) which will be delivered to
		 the `EventSourcedBehavior`
		- #### manifest
		
		
		
		```
		public abstract java.lang.String manifest​([E](EventAdapter.html "type parameter in EventAdapter") event)
		```
		
		Return the manifest (type hint) that will be provided in the `fromJournal` method.
		 Use `""` if manifest is not needed.
		- #### toJournal
		
		
		
		```
		public abstract [P](EventAdapter.html "type parameter in EventAdapter") toJournal​([E](EventAdapter.html "type parameter in EventAdapter") e)
		```
		
		Convert domain event to journal event type.
		 
		 Some journal may require a specific type to be returned to them,
		 for example if a primary key has to be associated with each event then a journal
		 may require adapters to return `com.example.myjournal.EventWithPrimaryKey(event, key)`.
		 
		
		
		 The `toJournal` adaptation must be an 1\-to\-1 transformation.
		 It is not allowed to drop incoming events during the `toJournal` adaptation.
		 
		
		
		
		Parameters:
		`e` \- the application\-side domain event to be adapted to the journal model
		Returns:
		the adapted event object, possibly the same object if no adaptation was performed

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventAdapter.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventSeq.html
- https://doc.akka.io/japi/akka/current/akka/persistence/typed/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventAdapter.html](https://doc.akka.io/japi/akka/current/akka/persistence/typed/EventAdapter.html)*