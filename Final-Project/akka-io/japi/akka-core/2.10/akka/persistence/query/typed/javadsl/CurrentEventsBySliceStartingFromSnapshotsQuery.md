---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:09Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
title: CurrentEventsBySliceStartingFromSnapshotsQuery
---

# CurrentEventsBySliceStartingFromSnapshotsQuery

## Content

Package [akka.persistence.query.typed.javadsl](package-summary.html)
## Interface CurrentEventsBySliceStartingFromSnapshotsQuery

- All Superinterfaces:
`[ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

---

```
public interface CurrentEventsBySliceStartingFromSnapshotsQuery
extends [ReadJournal](../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")
```

A plugin may optionally support this query by implementing this trait.
 
 API May Change

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Snapshot,​Event>[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlicesStartingFromSnapshots](#currentEventsBySlicesStartingFromSnapshots(java.lang.String,int,int,akka.persistence.query.Offset,java.util.function.Function))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset,  java.util.function.Function<Snapshot,​Event> transformSnapshot)` | Same as [`EventsBySliceStartingFromSnapshotsQuery`](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.javadsl") but with the purpose to use snapshots as starting points  and thereby reducing number of events that have to be loaded. |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |

- - ### Method Detail
	
	
	
		- #### currentEventsBySlicesStartingFromSnapshots
		
		
		
		```
		<Snapshot,​Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlicesStartingFromSnapshots​(java.lang.String entityType,
		                                                                                                             int minSlice,
		                                                                                                             int maxSlice,
		                                                                                                             [Offset](../../Offset.html "class in akka.persistence.query") offset,
		                                                                                                             java.util.function.Function<Snapshot,​Event> transformSnapshot)
		```
		
		Same as [`EventsBySliceStartingFromSnapshotsQuery`](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.javadsl") but with the purpose to use snapshots as starting points
		 and thereby reducing number of events that have to be loaded. This can be useful if the consumer start
		 from zero without any previously processed offset or if it has been disconnected for a long while and
		 its offset is far behind.
		 
		 Same type of query as `EventsBySliceStartingFromSnapshotsQuery.eventsBySlicesStartingFromSnapshots` but
		 the event stream is completed immediately when it reaches the end of the "result set".
		- #### sliceForPersistenceId
		
		
		
		```
		int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		- #### sliceRanges
		
		
		
		```
		java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/japi/Pair.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html)*