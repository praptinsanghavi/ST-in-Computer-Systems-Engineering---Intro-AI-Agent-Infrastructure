---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:32Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
title: EventsBySliceFirehoseQuery
---

# EventsBySliceFirehoseQuery

## Content

Package [akka.persistence.query.typed.scaladsl](package-summary.html)
## Class EventsBySliceFirehoseQuery

- java.lang.Object
- - akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery

- All Implemented Interfaces:
`[ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`, `[EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventTimestampQuery](EventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[LatestEventTimestampQuery](LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[LoadEventQuery](LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl")`

---

```
public final class EventsBySliceFirehoseQuery
extends java.lang.Object
implements [ReadJournal](../../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl"), [EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl"), [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl"), [EventTimestampQuery](EventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl"), [LoadEventQuery](LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl"), [LatestEventTimestampQuery](LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")
```

This wrapper of [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") gives better scalability when many consumers retrieve the
 same events, for example many Projections of the same entity type. The purpose is to share
 the stream of events from the database and fan out to connected consumer streams. Thereby fewer
 queries and loading of events from the database.
 
 It is retrieved with:
 

```

 val queries = PersistenceQuery(system).readJournalFor[EventsBySliceQuery](EventsBySliceFirehoseQuery.Identifier)
 
```

 Corresponding Java API is in [`EventsBySliceFirehoseQuery`](../javadsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl").
 

 Configuration settings can be defined in the configuration section with the
 absolute path corresponding to the identifier, which is `"akka.persistence.query.events-by-slice-firehose"`
 for the default [`Identifier()`](#Identifier()). See `reference.conf`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[EventsBySliceFirehoseQuery](#%3Cinit%3E(akka.actor.ExtendedActorSystem,com.typesafe.config.Config,java.lang.String))​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config,  java.lang.String cfgPath)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsBySlices](#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset)` | Query events for given slices. |
	| `<Snapshot,​Event>[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsBySlicesStartingFromSnapshots](#eventsBySlicesStartingFromSnapshots(java.lang.String,int,int,akka.persistence.query.Offset,scala.Function1))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../Offset.html "class in akka.persistence.query") offset,  scala.Function1<Snapshot,​Event> transformSnapshot)` | Same as [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") but with the purpose to use snapshots as starting points and thereby reducing number of  events that have to be loaded. |
	| `static java.lang.String` | `[Identifier](#Identifier())()` |  |
	| `scala.concurrent.Future<scala.Option<java.time.Instant>>` | `[latestEventTimestamp](#latestEventTimestamp(java.lang.String,int,int))​(java.lang.String entityType,  int minSlice,  int maxSlice)` |  |
	| `<Event> scala.concurrent.Future<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>>` | `[loadEnvelope](#loadEnvelope(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` | Load a single event on demand. |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Seq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |
	| `scala.concurrent.Future<scala.Option<java.time.Instant>>` | `[timestampOf](#timestampOf(java.lang.String,long))​(java.lang.String persistenceId,  long sequenceNr)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### EventsBySliceFirehoseQuery
		
		
		
		```
		public EventsBySliceFirehoseQuery​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                  com.typesafe.config.Config config,
		                                  java.lang.String cfgPath)
		```

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public static java.lang.String Identifier()
		```
		- #### eventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsBySlices​(java.lang.String entityType,
		                                                                         int minSlice,
		                                                                         int maxSlice,
		                                                                         [Offset](../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[EventsBySliceQuery](EventsBySliceQuery.html#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
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
		
		
		
		Specified by:
		`[eventsBySlices](EventsBySliceQuery.html#eventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### eventsBySlicesStartingFromSnapshots
		
		
		
		```
		public <Snapshot,​Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsBySlicesStartingFromSnapshots​(java.lang.String entityType,
		                                                                                                             int minSlice,
		                                                                                                             int maxSlice,
		                                                                                                             [Offset](../../Offset.html "class in akka.persistence.query") offset,
		                                                                                                             scala.Function1<Snapshot,​Event> transformSnapshot)
		```
		
		Description copied from interface: `[EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html#eventsBySlicesStartingFromSnapshots(java.lang.String,int,int,akka.persistence.query.Offset,scala.Function1))`
		Same as [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") but with the purpose to use snapshots as starting points and thereby reducing number of
		 events that have to be loaded. This can be useful if the consumer start from zero without any previously processed
		 offset or if it has been disconnected for a long while and its offset is far behind.
		
		Specified by:
		`[eventsBySlicesStartingFromSnapshots](EventsBySliceStartingFromSnapshotsQuery.html#eventsBySlicesStartingFromSnapshots(java.lang.String,int,int,akka.persistence.query.Offset,scala.Function1))` in interface `[EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### sliceForPersistenceId
		
		
		
		```
		public int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[sliceForPersistenceId](EventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		Specified by:
		`[sliceForPersistenceId](EventsBySliceStartingFromSnapshotsQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### sliceRanges
		
		
		
		```
		public scala.collection.immutable.Seq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```
		
		
		Specified by:
		`[sliceRanges](EventsBySliceQuery.html#sliceRanges(int))` in interface `[EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		Specified by:
		`[sliceRanges](EventsBySliceStartingFromSnapshotsQuery.html#sliceRanges(int))` in interface `[EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### timestampOf
		
		
		
		```
		public scala.concurrent.Future<scala.Option<java.time.Instant>> timestampOf​(java.lang.String persistenceId,
		                                                                            long sequenceNr)
		```
		
		
		Specified by:
		`[timestampOf](EventTimestampQuery.html#timestampOf(java.lang.String,long))` in interface `[EventTimestampQuery](EventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### loadEnvelope
		
		
		
		```
		public <Event> scala.concurrent.Future<[EventEnvelope](../EventEnvelope.html "class in akka.persistence.query.typed")<Event>> loadEnvelope​(java.lang.String persistenceId,
		                                                                          long sequenceNr)
		```
		
		Description copied from interface: `[LoadEventQuery](LoadEventQuery.html#loadEnvelope(java.lang.String,long))`
		Load a single event on demand. The `Future` is completed with a `NoSuchElementException` if
		 the event for the given `persistenceId` and `sequenceNr` doesn't exist.
		
		Specified by:
		`[loadEnvelope](LoadEventQuery.html#loadEnvelope(java.lang.String,long))` in interface `[LoadEventQuery](LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### latestEventTimestamp
		
		
		
		```
		public scala.concurrent.Future<scala.Option<java.time.Instant>> latestEventTimestamp​(java.lang.String entityType,
		                                                                                     int minSlice,
		                                                                                     int maxSlice)
		```
		
		
		Specified by:
		`[latestEventTimestamp](LatestEventTimestampQuery.html#latestEventTimestamp(java.lang.String,int,int))` in interface `[LatestEventTimestampQuery](LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")`

## Code Examples

### Example 1: Class EventsBySliceFirehoseQuery

```text
val queries = PersistenceQuery(system).readJournalFor[EventsBySliceQuery](EventsBySliceFirehoseQuery.Identifier)
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html)*