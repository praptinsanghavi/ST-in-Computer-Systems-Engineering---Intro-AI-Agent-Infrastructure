---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
title: LoadEventQuery
---

# LoadEventQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface LoadEventQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl")`

---

```
public interface LoadEventQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

[`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") that is using a timestamp based offset should also implement this query.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> scala.concurrent.Future<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>>` | `[loadEnvelope](#loadEnvelope(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` | Load a single event on demand. |

- - ### Method Detail
	
	
	
		- #### loadEnvelope
		
		
		
		```
		<Event> scala.concurrent.Future<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>> loadEnvelope​(java.lang.String persistenceId,
		                                                                   long sequenceNr)
		```
		
		Load a single event on demand. The `Future` is completed with a `NoSuchElementException` if
		 the event for the given `persistenceId` and `sequenceNr` doesn't exist.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html)*