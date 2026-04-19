---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:29:55Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/WriteEventAdapter.html
title: WriteEventAdapter
---

# WriteEventAdapter

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface WriteEventAdapter

- All Known Subinterfaces:
`[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")`

All Known Implementing Classes:
`[IdentityEventAdapter$](IdentityEventAdapter$.html "class in akka.persistence.journal")`

---

```
public interface WriteEventAdapter
```

Facility to convert to specialised data models, as may be required by specialized persistence Journals.
 
 Typical use cases include (but are not limited to):
 

	- adding metadata, a.k.a. "tagging" \- by wrapping objects into tagged counterparts
	- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
	- splitting up large events into sequences of smaller ones

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `java.lang.String` | `[manifest](#manifest(java.lang.Object))​(java.lang.Object event)` | Return the manifest (type hint) that will be provided in the `fromJournal` method. |
	| `java.lang.Object` | `[toJournal](#toJournal(java.lang.Object))​(java.lang.Object event)` | Convert domain event to journal event type. |

- - ### Method Detail
	
	
	
		- #### manifest
		
		
		
		```
		java.lang.String manifest​(java.lang.Object event)
		```
		
		Return the manifest (type hint) that will be provided in the `fromJournal` method.
		 Use `""` if manifest is not needed.
		- #### toJournal
		
		
		
		```
		java.lang.Object toJournal​(java.lang.Object event)
		```
		
		Convert domain event to journal event type.
		 
		 Some journal may require a specific type to be returned to them,
		 for example if a primary key has to be associated with each event then a journal
		 may require adapters to return `com.example.myjournal.EventWithPrimaryKey(event, key)`.
		 
		
		
		 The `toJournal` adaptation must be an 1\-to\-1 transformation.
		 It is not allowed to drop incoming events during the `toJournal` adaptation.
		 
		
		
		
		Parameters:
		`event` \- the application\-side domain event to be adapted to the journal model
		Returns:
		the adapted event object, possibly the same object if no adaptation was performed

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/WriteEventAdapter.html](https://doc.akka.io/japi/akka/2.8/akka/persistence/journal/WriteEventAdapter.html)*