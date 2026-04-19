---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:34Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
title: CurrentEventsBySliceQuery
---

# CurrentEventsBySliceQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface CurrentEventsBySliceQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[PersistenceTestKitDurableStateStore](../../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`, `[PersistenceTestKitReadJournal](../../../testkit/query/javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")`

---

```
public interface CurrentEventsBySliceQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlices](#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset)` | Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it  reaches the end of the "result set". |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |

- - ### Method Detail
	
	
	
		- #### currentEventsBySlices
		
		
		
		```
		<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlices​(java.lang.String entityType,
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
		java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html)*