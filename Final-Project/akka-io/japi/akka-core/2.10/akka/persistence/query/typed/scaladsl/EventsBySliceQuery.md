---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:45:39Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
title: EventsBySliceQuery
---

# EventsBySliceQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Interface EventsBySliceQuery

- All Superinterfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl")`, `[PersistenceTestKitDurableStateStore](../../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`

---

```
public interface EventsBySliceQuery
extends [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")
```

A plugin may optionally support this query by implementing this trait.
 
`EventsBySliceQuery` that is using a timestamp based offset should also implement [`EventTimestampQuery`](EventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl") and
 [`LoadEventQuery`](LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl").
 

 See also [`EventsBySliceFirehoseQuery`](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl").

- - ### Method Summary
	
	
	
	All Methods [Instance Methods](javascript:show(2);) [Abstract Methods](javascript:show(4);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsBySlices](#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset)` | Query events for given slices. |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Seq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |

- - ### Method Detail
	
	
	
		- #### eventsBySlices
		
		
		
		```
		<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsBySlices​(java.lang.String entityType,
		                                                                  int minSlice,
		                                                                  int maxSlice,
		                                                                  [Offset](../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Query events for given slices. A slice is deterministically defined based on the persistence id. The purpose is to
		 evenly distribute all persistence ids over the slices.
		 
		 The consumer can keep track of its current position in the event stream by storing the `offset` and restart the
		 query from a given `offset` after a crash/restart.
		 
		
		
		 The exact meaning of the `offset` depends on the journal and must be documented by the read journal plugin. It may
		 be a sequential id number that uniquely identifies the position of each event within the event stream. Distributed
		 data stores cannot easily support those semantics and they may use a weaker meaning. For example it may be a
		 timestamp (taken when the event was created or stored). Timestamps are not unique and not strictly ordered, since
		 clocks on different machines may not be synchronized.
		 
		
		
		 In strongly consistent stores, where the `offset` is unique and strictly ordered, the stream should start from the
		 next event after the `offset`. Otherwise, the read journal should ensure that between an invocation that returned
		 an event with the given `offset`, and this invocation, no events are missed. Depending on the journal
		 implementation, this may mean that this invocation will return events that were already returned by the previous
		 invocation, including the event with the passed in `offset`.
		 
		
		
		 The returned event stream should be ordered by `offset` if possible, but this can also be difficult to fulfill for
		 a distributed data store. The order must be documented by the read journal plugin.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events, but it continues to push new
		 events when new events are persisted. Corresponding query that is completed when it reaches the end of the
		 currently stored events is provided by `CurrentEventsBySliceQuery.currentEventsBySlices`.
		- #### sliceForPersistenceId
		
		
		
		```
		int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		- #### sliceRanges
		
		
		
		```
		scala.collection.immutable.Seq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html)*