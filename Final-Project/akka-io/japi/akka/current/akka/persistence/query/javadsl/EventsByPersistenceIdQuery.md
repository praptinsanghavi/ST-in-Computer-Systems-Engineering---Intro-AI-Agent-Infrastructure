---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:54Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
title: EventsByPersistenceIdQuery
---

# EventsByPersistenceIdQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface EventsByPersistenceIdQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")`

---

```
public interface EventsByPersistenceIdQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceId](#eventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Query events for a specific `PersistentActor` identified by `persistenceId`. |

- - ### Method Detail
	
	
	
		- #### eventsByPersistenceId
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")> eventsByPersistenceId​(java.lang.String persistenceId,
		                                                          long fromSequenceNr,
		                                                          long toSequenceNr)
		```
		
		Query events for a specific `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MAX_VALUE` respectively to retrieve all events. The query will
		 return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.
		 
		
		
		 The returned event stream should be ordered by sequence number.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByPersistenceIdQuery.currentEventsByPersistenceId(java.lang.String, long, long)`](CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long)).

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html)*