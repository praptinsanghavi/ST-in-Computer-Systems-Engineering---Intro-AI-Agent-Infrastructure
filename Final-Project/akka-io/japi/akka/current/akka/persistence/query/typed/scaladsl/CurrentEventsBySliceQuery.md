---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:19Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
title: CurrentEventsBySliceQuery
---

# CurrentEventsBySliceQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface CurrentEventsBySliceQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`, `[PersistenceTestKitReadJournal](../../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

---

```
public interface CurrentEventsBySliceQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlices](#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset)` | Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it  reaches the end of the "result set". |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Seq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |

- - ### Method Detail
	
	
	
		- #### currentEventsBySlices
		
		
		
		```
		<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlices​(java.lang.String entityType,
		                                                                         int minSlice,
		                                                                         int maxSlice,
		                                                                         [Offset](../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it
		 reaches the end of the "result set". Depending on journal implementation, this may mean all events up to when the
		 query is started, or it may include events that are persisted while the query is still streaming results. For
		 eventually consistent stores, it may only include all events up to some point before the query is started.
		- #### sliceForPersistenceId
		
		
		
		```
		int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		- #### sliceRanges
		
		
		
		```
		scala.collection.immutable.Seq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html)*