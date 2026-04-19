---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:20Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
title: PersistenceTestKitReadJournal
---

# PersistenceTestKitReadJournal

## Content

Package [akka.persistence.testkit.query.javadsl](package-summary.html)
## Class PersistenceTestKitReadJournal

- java.lang.Object
- - akka.persistence.testkit.query.javadsl.PersistenceTestKitReadJournal

- All Implemented Interfaces:
`[CurrentEventsByPersistenceIdQuery](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`, `[CurrentEventsByTagQuery](../../../query/javadsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl")`, `[EventsByPersistenceIdQuery](../../../query/javadsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`, `[ReadJournal](../../../query/javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`, `[CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[EventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl")`

---

```
public final class PersistenceTestKitReadJournal
extends java.lang.Object
implements [ReadJournal](../../../query/javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl"), [EventsByPersistenceIdQuery](../../../query/javadsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl"), [CurrentEventsByPersistenceIdQuery](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl"), [EventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl"), [CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl"), [CurrentEventsByTagQuery](../../../query/javadsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl"), [CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitReadJournal](#%3Cinit%3E(akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal))​([PersistenceTestKitReadJournal](../scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl") delegate)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceId](#currentEventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](../../../query/javadsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceIdTyped](#currentEventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlices](#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it  reaches the end of the "result set". |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByTag](#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](../../../query/javadsl/EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream  is completed immediately when it reaches the end of the "result set". |
	| `[Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceId](#eventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Query events for a specific `PersistentActor` identified by `persistenceId`. |
	| `<Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceIdTyped](#eventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Query events for a specific `PersistentActor` identified by `persistenceId`. |
	| `static java.lang.String` | `[Identifier](#Identifier())()` |  |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitReadJournal
		
		
		
		```
		public PersistenceTestKitReadJournal​([PersistenceTestKitReadJournal](../scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl") delegate)
		```

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public static java.lang.String Identifier()
		```
		- #### eventsByPersistenceId
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")> eventsByPersistenceId​(java.lang.String persistenceId,
		                                                                 long fromSequenceNr,
		                                                                 long toSequenceNr)
		```
		
		Description copied from interface: `[EventsByPersistenceIdQuery](../../../query/javadsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))`
		Query events for a specific `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MAX_VALUE` respectively to retrieve all events. The query will
		 return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.
		 
		
		
		 The returned event stream should be ordered by sequence number.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByPersistenceIdQuery.currentEventsByPersistenceId(java.lang.String, long, long)`](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long)).
		
		
		
		Specified by:
		`[eventsByPersistenceId](../../../query/javadsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))` in interface `[EventsByPersistenceIdQuery](../../../query/javadsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`
		- #### currentEventsByPersistenceId
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceId​(java.lang.String persistenceId,
		                                                                        long fromSequenceNr,
		                                                                        long toSequenceNr)
		```
		
		Description copied from interface: `[CurrentEventsByPersistenceIdQuery](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long))`
		Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](../../../query/javadsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.
		
		Specified by:
		`[currentEventsByPersistenceId](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long))` in interface `[CurrentEventsByPersistenceIdQuery](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`
		- #### eventsByPersistenceIdTyped
		
		
		
		```
		public <Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                                     long fromSequenceNr,
		                                                                                     long toSequenceNr)
		```
		
		Description copied from interface: `[EventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))`
		Query events for a specific `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MaxValue` respectively to retrieve all events. The query will
		 return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.
		 
		
		
		 The returned event stream should be ordered by sequence number.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByPersistenceIdTypedQuery.currentEventsByPersistenceIdTyped(java.lang.String, long, long)`](../../../query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long)).
		 
		
		
		 This is a new version of the [`CurrentEventsByPersistenceIdQuery.currentEventsByPersistenceId(java.lang.String, long, long)`](../../../query/javadsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long)) using a new
		 envelope type [`EventEnvelope`](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed").
		 
		
		
		
		Specified by:
		`[eventsByPersistenceIdTyped](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))` in interface `[EventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### currentEventsByPersistenceIdTyped
		
		
		
		```
		public <Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                                            long fromSequenceNr,
		                                                                                            long toSequenceNr)
		```
		
		Description copied from interface: `[CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long))`
		Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](../../../query/typed/javadsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.
		 
		 This is a new version of the `akka.persistence.query.javadsl.EventsByPersistenceIdQuery#currentEventsByPersistenceId` using a new
		 envelope type [`EventEnvelope`](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed").
		 
		
		
		
		Specified by:
		`[currentEventsByPersistenceIdTyped](../../../query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long))` in interface `[CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### currentEventsByTag
		
		
		
		```
		public [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByTag​(java.lang.String tag,
		                                                              [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[CurrentEventsByTagQuery](../../../query/javadsl/CurrentEventsByTagQuery.html#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))`
		Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](../../../query/javadsl/EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream
		 is completed immediately when it reaches the end of the "result set". Depending
		 on journal implementation, this may mean all events up to when the query is
		 started, or it may include events that are persisted while the query is still
		 streaming results. For eventually consistent stores, it may only include all
		 events up to some point before the query is started.
		
		Specified by:
		`[currentEventsByTag](../../../query/javadsl/CurrentEventsByTagQuery.html#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))` in interface `[CurrentEventsByTagQuery](../../../query/javadsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl")`
		- #### currentEventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlices​(java.lang.String entityType,
		                                                                                int minSlice,
		                                                                                int maxSlice,
		                                                                                [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
		Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it
		 reaches the end of the "result set". Depending on journal implementation, this may mean all events up to when the
		 query is started, or it may include events that are persisted while the query is still streaming results. For
		 eventually consistent stores, it may only include all events up to some point before the query is started.
		
		Specified by:
		`[currentEventsBySlices](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### sliceForPersistenceId
		
		
		
		```
		public int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`
		- #### sliceRanges
		
		
		
		```
		public java.util.List<[Pair](../../../../japi/Pair.html "class in akka.japi")<java.lang.Integer,​java.lang.Integer>> sliceRanges​(int numberOfRanges)
		```
		
		
		Specified by:
		`[sliceRanges](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html#sliceRanges(int))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/japi/Pair.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html)*