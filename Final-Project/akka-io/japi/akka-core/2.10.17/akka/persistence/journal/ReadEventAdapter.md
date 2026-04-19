---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T15:46:52Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/ReadEventAdapter.html
title: ReadEventAdapter
---

# ReadEventAdapter

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface ReadEventAdapter

- All Known Subinterfaces:
`[EventAdapter](EventAdapter.html "interface in akka.persistence.journal")`

All Known Implementing Classes:
`[IdentityEventAdapter$](IdentityEventAdapter$.html "class in akka.persistence.journal")`

---

```
public interface ReadEventAdapter
```

Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.
 
 Typical use cases include (but are not limited to):
 

	- extracting events from "envelopes"
	- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
	- adapting incoming events from a "data model" to the "domain model"

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[EventSeq](EventSeq.html "class in akka.persistence.journal")` | `[fromJournal](#fromJournal(java.lang.Object,java.lang.String))​(java.lang.Object event,  java.lang.String manifest)` | Convert a event from its journal model to the applications domain model. |

- - ### Method Detail
	
	
	
		- #### fromJournal
		
		
		
		```
		[EventSeq](EventSeq.html "class in akka.persistence.journal") fromJournal​(java.lang.Object event,
		                     java.lang.String manifest)
		```
		
		Convert a event from its journal model to the applications domain model.
		 
		 One event may be adapter into multiple (or none) events which should be delivered to the [`PersistentActor`](../PersistentActor.html "interface in akka.persistence").
		 Use the specialised [`EventSeq.single(java.lang.Object)`](EventSeq.html#single(java.lang.Object)) method to emit exactly one event,
		 or [`EventSeq.empty()`](EventSeq.html#empty()) in case the adapter is not handling this event. Multiple [`EventAdapter`](EventAdapter.html "interface in akka.persistence.journal") instances are
		 applied in order as defined in configuration and their emitted event seqs are concatenated and delivered in order
		 to the PersistentActor.
		 
		
		
		
		Parameters:
		`event` \- event to be adapted before delivering to the PersistentActor
		`manifest` \- optionally provided manifest (type hint) in case the Adapter has stored one for this event, `""` if none
		Returns:
		sequence containing the adapted events (possibly zero) which will be delivered to the PersistentActor

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/PersistentActor.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/EventSeq.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/ReadEventAdapter.html](https://doc.akka.io/japi/akka-core/2.10.17/akka/persistence/journal/ReadEventAdapter.html)*