---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:03:50Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapter.html
title: EventAdapter
---

# EventAdapter

## Content

Package [akka.persistence.journal](package-summary.html)
## Interface EventAdapter

- All Superinterfaces:
`[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")`, `[WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal")`

All Known Implementing Classes:
`[IdentityEventAdapter$](IdentityEventAdapter$.html "class in akka.persistence.journal")`

---

```
public interface EventAdapter
extends [WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal"), [ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")
```

An [`EventAdapter`](EventAdapter.html "interface in akka.persistence.journal") is both a [`WriteEventAdapter`](WriteEventAdapter.html "interface in akka.persistence.journal") and a [`ReadEventAdapter`](ReadEventAdapter.html "interface in akka.persistence.journal").
 Facility to convert from and to specialised data models, as may be required by specialized persistence Journals.
 
 Typical use cases include (but are not limited to):
 

	- adding metadata, a.k.a. "tagging" \- by wrapping objects into tagged counterparts
	- manually converting to the Journals storage format, such as JSON, BSON or any specialised binary format
	- adapting incoming events in any way before persisting them by the journal

- - ### Method Summary
	
	
		- ### Methods inherited from interface akka.persistence.journal.[ReadEventAdapter](ReadEventAdapter.html "interface in akka.persistence.journal")
		
		
		`[fromJournal](ReadEventAdapter.html#fromJournal(java.lang.Object,java.lang.String))`
		- ### Methods inherited from interface akka.persistence.journal.[WriteEventAdapter](WriteEventAdapter.html "interface in akka.persistence.journal")
		
		
		`[manifest](WriteEventAdapter.html#manifest(java.lang.Object)), [toJournal](WriteEventAdapter.html#toJournal(java.lang.Object))`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/IdentityEventAdapter$.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/ReadEventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/WriteEventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapter.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapter.html)*