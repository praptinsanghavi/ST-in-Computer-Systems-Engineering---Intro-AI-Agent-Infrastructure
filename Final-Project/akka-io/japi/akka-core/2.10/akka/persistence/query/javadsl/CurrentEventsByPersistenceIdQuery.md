---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:00Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
title: CurrentEventsByPersistenceIdQuery
---

# CurrentEventsByPersistenceIdQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface CurrentEventsByPersistenceIdQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")`

---

```
public interface CurrentEventsByPersistenceIdQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceId](#currentEventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |

- - ### Method Detail
	
	
	
		- #### currentEventsByPersistenceId
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")> currentEventsByPersistenceId​(java.lang.String persistenceId,
		                                                                 long fromSequenceNr,
		                                                                 long toSequenceNr)
		```
		
		Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html)*