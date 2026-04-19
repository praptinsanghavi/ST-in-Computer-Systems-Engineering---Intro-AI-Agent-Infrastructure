---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:08Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
title: CurrentEventsByPersistenceIdQuery
---

# CurrentEventsByPersistenceIdQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface CurrentEventsByPersistenceIdQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

---

```
public interface CurrentEventsByPersistenceIdQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceId](#currentEventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |

- - ### Method Detail
	
	
	
		- #### currentEventsByPersistenceId
		
		
		
		```
		[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")> currentEventsByPersistenceId​(java.lang.String persistenceId,
		                                                                 long fromSequenceNr,
		                                                                 long toSequenceNr)
		```
		
		Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html)*