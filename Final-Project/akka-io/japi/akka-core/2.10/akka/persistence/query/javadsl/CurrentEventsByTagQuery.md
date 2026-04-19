---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:02Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
title: CurrentEventsByTagQuery
---

# CurrentEventsByTagQuery

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface CurrentEventsByTagQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")`

---

```
public interface CurrentEventsByTagQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this interface.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentEventsByTag](#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../Offset.html "class in akka.persistence.query") offset)` | Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream  is completed immediately when it reaches the end of the "result set". |

- - ### Method Detail
	
	
	
		- #### currentEventsByTag
		
		
		
		```
		[Source](../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")> currentEventsByTag​(java.lang.String tag,
		                                                       [Offset](../Offset.html "class in akka.persistence.query") offset)
		```
		
		Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream
		 is completed immediately when it reaches the end of the "result set". Depending
		 on journal implementation, this may mean all events up to when the query is
		 started, or it may include events that are persisted while the query is still
		 streaming results. For eventually consistent stores, it may only include all
		 events up to some point before the query is started.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html)*