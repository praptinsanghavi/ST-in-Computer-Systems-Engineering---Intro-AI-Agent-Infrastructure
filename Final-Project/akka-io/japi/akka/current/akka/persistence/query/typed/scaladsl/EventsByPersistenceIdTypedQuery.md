---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:23Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
title: EventsByPersistenceIdTypedQuery
---

# EventsByPersistenceIdTypedQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface EventsByPersistenceIdTypedQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[PersistenceTestKitReadJournal](../../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

---

```
public interface EventsByPersistenceIdTypedQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceIdTyped](#eventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Query events for a specific `PersistentActor` identified by `persistenceId`. |

- - ### Method Detail
	
	
	
		- #### eventsByPersistenceIdTyped
		
		
		
		```
		<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                              long fromSequenceNr,
		                                                                              long toSequenceNr)
		```
		
		Query events for a specific `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MaxValue` respectively to retrieve all events. The query will
		 return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.
		 
		
		
		 The returned event stream should be ordered by sequence number.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByPersistenceIdTypedQuery.currentEventsByPersistenceIdTyped(java.lang.String, long, long)`](CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long)).
		 
		
		
		 This is a new version of the [`CurrentEventsByPersistenceIdQuery.currentEventsByPersistenceId(java.lang.String, long, long)`](../../scaladsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long)) using a new
		 envelope type [`EventEnvelope`](../EventEnvelope.html "class in akka.persistence.query.typed").

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html)*