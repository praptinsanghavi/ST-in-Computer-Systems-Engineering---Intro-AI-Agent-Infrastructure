---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:45:01Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
title: EventsBySliceStartingFromSnapshotsQuery
---

# EventsBySliceStartingFromSnapshotsQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface EventsBySliceStartingFromSnapshotsQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl")`

---

```
public interface EventsBySliceStartingFromSnapshotsQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this trait.
 
`EventsBySliceQuery` that is using a timestamp based offset should also implement [`EventTimestampQuery`](EventTimestampQuery.html "interface in akka.persistence.query.typed.javadsl") and
 [`LoadEventQuery`](LoadEventQuery.html "interface in akka.persistence.query.typed.javadsl").
 

 See also [`EventsBySliceFirehoseQuery`](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl").
 

 API May Change

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Snapshot,​Event>[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsBySlicesStartingFromSnapshots](#eventsBySlicesStartingFromSnapshots(java.lang.String,int,int,akka.persistence.query.Offset,java.util.function.Function))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset,  java.util.function.Function<Snapshot,​Event> transformSnapshot)` | Same as [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") but with the purpose to use snapshots as starting points and thereby reducing number of  events that have to be loaded. |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |

- - ### Method Detail
	
	
	
		- #### eventsBySlicesStartingFromSnapshots
		
		
		
		```
		<Snapshot,​Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsBySlicesStartingFromSnapshots​(java.lang.String entityType,
		                                                                                                      int minSlice,
		                                                                                                      int maxSlice,
		                                                                                                      [Offset](../../Offset.html "class in akka.persistence.query") offset,
		                                                                                                      java.util.function.Function<Snapshot,​Event> transformSnapshot)
		```
		
		Same as [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") but with the purpose to use snapshots as starting points and thereby reducing number of
		 events that have to be loaded. This can be useful if the consumer start from zero without any previously processed
		 offset or if it has been disconnected for a long while and its offset is far behind.
		- #### sliceForPersistenceId
		
		
		
		```
		int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		- #### sliceRanges
		
		
		
		```
		java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.9/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.9/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/LoadEventQuery.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.9/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html)*