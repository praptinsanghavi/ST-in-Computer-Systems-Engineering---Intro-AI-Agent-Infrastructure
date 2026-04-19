---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:25:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
title: CurrentEventsBySliceStartingFromSnapshotsQuery
---

# CurrentEventsBySliceStartingFromSnapshotsQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface CurrentEventsBySliceStartingFromSnapshotsQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

---

```
public interface CurrentEventsBySliceStartingFromSnapshotsQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Snapshot,​Event>[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlicesStartingFromSnapshots](#currentEventsBySlicesStartingFromSnapshots(java.lang.String,int,int,akka.persistence.query.Offset,scala.Function1))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset,  scala.Function1<Snapshot,​Event> transformSnapshot)` | Same as [`EventsBySliceStartingFromSnapshotsQuery`](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl") but with the purpose to use snapshots as starting points  and thereby reducing number of events that have to be loaded. |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Seq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |

- - ### Method Detail
	
	
	
		- #### currentEventsBySlicesStartingFromSnapshots
		
		
		
		```
		<Snapshot,​Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlicesStartingFromSnapshots​(java.lang.String entityType,
		                                                                                                             int minSlice,
		                                                                                                             int maxSlice,
		                                                                                                             [Offset](../../Offset.html "class in akka.persistence.query") offset,
		                                                                                                             scala.Function1<Snapshot,​Event> transformSnapshot)
		```
		
		Same as [`EventsBySliceStartingFromSnapshotsQuery`](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl") but with the purpose to use snapshots as starting points
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
		scala.collection.immutable.Seq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html)*