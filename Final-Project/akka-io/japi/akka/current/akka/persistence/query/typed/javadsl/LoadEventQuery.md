---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html
title: LoadEventQuery
---

# LoadEventQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface LoadEventQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl")`

---

```
public interface LoadEventQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

[`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") that is using a timestamp based offset should also implement this query.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> java.util.concurrent.CompletionStage<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>>` | `[loadEnvelope](#loadEnvelope(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` | Load a single event on demand. |

- - ### Method Detail
	
	
	
		- #### loadEnvelope
		
		
		
		```
		<Event> java.util.concurrent.CompletionStage<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>> loadEnvelope​(java.lang.String persistenceId,
		                                                                                long sequenceNr)
		```
		
		Load a single event on demand. The `CompletionStage` is completed with a `NoSuchElementException` if
		 the event for the given `persistenceId` and `sequenceNr` doesn't exist.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/package-summary.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html)*