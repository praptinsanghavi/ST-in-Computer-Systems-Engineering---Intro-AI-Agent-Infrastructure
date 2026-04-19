---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
title: CurrentEventsByPersistenceIdTypedQuery
---

# CurrentEventsByPersistenceIdTypedQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface CurrentEventsByPersistenceIdTypedQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[PersistenceTestKitReadJournal](../../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

---

```
public interface CurrentEventsByPersistenceIdTypedQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceIdTyped](#currentEventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |

- - ### Method Detail
	
	
	
		- #### currentEventsByPersistenceIdTyped
		
		
		
		```
		<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                                     long fromSequenceNr,
		                                                                                     long toSequenceNr)
		```
		
		Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.
		 
		 This is a new version of the `akka.persistence.query.scaladsl.EventsByPersistenceIdQuery#currentEventsByPersistenceId` using a new
		 envelope type [`EventEnvelope`](../EventEnvelope.html "class in akka.persistence.query.typed").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html)*