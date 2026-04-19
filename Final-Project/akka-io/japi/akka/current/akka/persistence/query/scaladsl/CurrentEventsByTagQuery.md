---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
title: CurrentEventsByTagQuery
---

# CurrentEventsByTagQuery

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface CurrentEventsByTagQuery

- All Superinterfaces:
`[ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[LeveldbReadJournal](../journal/leveldb/scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

---

```
public interface CurrentEventsByTagQuery
extends [ReadJournal](ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")>` | `[currentEventsByTag](#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../Offset.html "class in akka.persistence.query") offset)` | Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream  is completed immediately when it reaches the end of the "result set". |

- - ### Method Detail
	
	
	
		- #### currentEventsByTag
		
		
		
		```
		[Source](../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../NotUsed.html "class in akka")> currentEventsByTag​(java.lang.String tag,
		                                                       [Offset](../Offset.html "class in akka.persistence.query") offset)
		```
		
		Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream
		 is completed immediately when it reaches the end of the "result set". Depending
		 on journal implementation, this may mean all events up to when the query is
		 started, or it may include events that are persisted while the query is still
		 streaming results. For eventually consistent stores, it may only include all
		 events up to some point before the query is started.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html)*