---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:27:46Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
title: PersistenceTestKitReadJournal
---

# PersistenceTestKitReadJournal

## Content

Package [akka.persistence.testkit.query.scaladsl](package-summary.html)
## Class PersistenceTestKitReadJournal

- java.lang.Object
- - akka.persistence.testkit.query.scaladsl.PersistenceTestKitReadJournal

- All Implemented Interfaces:
`[CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl")`, `[CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.scaladsl")`, `[EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl")`, `[PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")`, `[ReadJournal](../../../query/scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl")`, `[CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl")`

---

```
public final class PersistenceTestKitReadJournal
extends java.lang.Object
implements [ReadJournal](../../../query/scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl"), [EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl"), [EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl"), [CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl"), [CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl"), [CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.scaladsl"), [CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl"), [PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")
```

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[PersistenceTestKitReadJournal](#%3Cinit%3E(akka.actor.ExtendedActorSystem,com.typesafe.config.Config,java.lang.String))​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system,  com.typesafe.config.Config config,  java.lang.String configPath)` |  |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceId](#currentEventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](../../../query/scaladsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |
	| `long` | `[currentEventsByPersistenceId$default$2](#currentEventsByPersistenceId$default$2())()` |  |
	| `long` | `[currentEventsByPersistenceId$default$3](#currentEventsByPersistenceId$default$3())()` |  |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceIdTyped](#currentEventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))  but the event stream is completed immediately when it reaches the end of  the "result set". |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsBySlices](#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))​(java.lang.String entityType,  int minSlice,  int maxSlice,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it  reaches the end of the "result set". |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentEventsByTag](#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)` | Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](../../../query/scaladsl/EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream  is completed immediately when it reaches the end of the "result set". |
	| `[Offset](../../../query/Offset.html "class in akka.persistence.query")` | `[currentEventsByTag$default$2](#currentEventsByTag$default$2())()` |  |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds(scala.Option,long))​(scala.Option<java.lang.String> afterId,  long limit)` | Get the current persistence ids. |
	| `[Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceId](#eventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Query events for a specific `PersistentActor` identified by `persistenceId`. |
	| `long` | `[eventsByPersistenceId$default$2](#eventsByPersistenceId$default$2())()` |  |
	| `long` | `[eventsByPersistenceId$default$3](#eventsByPersistenceId$default$3())()` |  |
	| `<Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceIdTyped](#eventsByPersistenceIdTyped(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Query events for a specific `PersistentActor` identified by `persistenceId`. |
	| `static java.lang.String` | `[Identifier](#Identifier())()` |  |
	| `int` | `[sliceForPersistenceId](#sliceForPersistenceId(java.lang.String))​(java.lang.String persistenceId)` |  |
	| `scala.collection.immutable.Seq<scala.collection.immutable.Range>` | `[sliceRanges](#sliceRanges(int))​(int numberOfRanges)` |  |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### PersistenceTestKitReadJournal
		
		
		
		```
		public PersistenceTestKitReadJournal​([ExtendedActorSystem](../../../../actor/ExtendedActorSystem.html "class in akka.actor") system,
		                                     com.typesafe.config.Config config,
		                                     java.lang.String configPath)
		```

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public static java.lang.String Identifier()
		```
		- #### eventsByPersistenceId
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")> eventsByPersistenceId​(java.lang.String persistenceId,
		                                                                 long fromSequenceNr,
		                                                                 long toSequenceNr)
		```
		
		Description copied from interface: `[EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))`
		Query events for a specific `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MaxValue` respectively to retrieve all events. The query will
		 return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.
		 
		
		
		 The returned event stream should be ordered by sequence number.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByPersistenceIdQuery.currentEventsByPersistenceId(java.lang.String, long, long)`](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long)).
		
		
		
		Specified by:
		`[eventsByPersistenceId](../../../query/scaladsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))` in interface `[EventsByPersistenceIdQuery](../../../query/scaladsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl")`
		- #### eventsByPersistenceId$default$2
		
		
		
		```
		public long eventsByPersistenceId$default$2()
		```
		- #### eventsByPersistenceId$default$3
		
		
		
		```
		public long eventsByPersistenceId$default$3()
		```
		- #### eventsByPersistenceIdTyped
		
		
		
		```
		public <Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> eventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                                     long fromSequenceNr,
		                                                                                     long toSequenceNr)
		```
		
		Description copied from interface: `[EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))`
		Query events for a specific `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MaxValue` respectively to retrieve all events. The query will
		 return all the events inclusive of the `fromSequenceNr` and `toSequenceNr` values.
		 
		
		
		 The returned event stream should be ordered by sequence number.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`CurrentEventsByPersistenceIdTypedQuery.currentEventsByPersistenceIdTyped(java.lang.String, long, long)`](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long)).
		 
		
		
		 This is a new version of the [`CurrentEventsByPersistenceIdQuery.currentEventsByPersistenceId(java.lang.String, long, long)`](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long)) using a new
		 envelope type [`EventEnvelope`](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed").
		 
		
		
		
		Specified by:
		`[eventsByPersistenceIdTyped](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))` in interface `[EventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### currentEventsByPersistenceId
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceId​(java.lang.String persistenceId,
		                                                                        long fromSequenceNr,
		                                                                        long toSequenceNr)
		```
		
		Description copied from interface: `[CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long))`
		Same type of query as [`EventsByPersistenceIdQuery.eventsByPersistenceId(java.lang.String, long, long)`](../../../query/scaladsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.
		
		Specified by:
		`[currentEventsByPersistenceId](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long))` in interface `[CurrentEventsByPersistenceIdQuery](../../../query/scaladsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl")`
		- #### currentEventsByPersistenceId$default$2
		
		
		
		```
		public long currentEventsByPersistenceId$default$2()
		```
		- #### currentEventsByPersistenceId$default$3
		
		
		
		```
		public long currentEventsByPersistenceId$default$3()
		```
		- #### currentEventsByPersistenceIdTyped
		
		
		
		```
		public <Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByPersistenceIdTyped​(java.lang.String persistenceId,
		                                                                                            long fromSequenceNr,
		                                                                                            long toSequenceNr)
		```
		
		Description copied from interface: `[CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long))`
		Same type of query as [`EventsByPersistenceIdTypedQuery.eventsByPersistenceIdTyped(java.lang.String, long, long)`](../../../query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html#eventsByPersistenceIdTyped(java.lang.String,long,long))
		 but the event stream is completed immediately when it reaches the end of
		 the "result set". Events that are stored after the query is completed are
		 not included in the event stream.
		 
		 This is a new version of the `akka.persistence.query.scaladsl.EventsByPersistenceIdQuery#currentEventsByPersistenceId` using a new
		 envelope type [`EventEnvelope`](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed").
		 
		
		
		
		Specified by:
		`[currentEventsByPersistenceIdTyped](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html#currentEventsByPersistenceIdTyped(java.lang.String,long,long))` in interface `[CurrentEventsByPersistenceIdTypedQuery](../../../query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### currentEventsByTag
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsByTag​(java.lang.String tag,
		                                                              [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))`
		Same type of query as [`EventsByTagQuery.eventsByTag(java.lang.String, akka.persistence.query.Offset)`](../../../query/scaladsl/EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream
		 is completed immediately when it reaches the end of the "result set". Depending
		 on journal implementation, this may mean all events up to when the query is
		 started, or it may include events that are persisted while the query is still
		 streaming results. For eventually consistent stores, it may only include all
		 events up to some point before the query is started.
		
		Specified by:
		`[currentEventsByTag](../../../query/scaladsl/CurrentEventsByTagQuery.html#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))` in interface `[CurrentEventsByTagQuery](../../../query/scaladsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.scaladsl")`
		- #### currentEventsByTag$default$2
		
		
		
		```
		public [Offset](../../../query/Offset.html "class in akka.persistence.query") currentEventsByTag$default$2()
		```
		- #### currentEventsBySlices
		
		
		
		```
		public <Event> [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<[EventEnvelope](../../../query/typed/EventEnvelope.html "class in akka.persistence.query.typed")<Event>,​[NotUsed](../../../../NotUsed.html "class in akka")> currentEventsBySlices​(java.lang.String entityType,
		                                                                                int minSlice,
		                                                                                int maxSlice,
		                                                                                [Offset](../../../query/Offset.html "class in akka.persistence.query") offset)
		```
		
		Description copied from interface: `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))`
		Same type of query as `EventsBySliceQuery.eventsBySlices` but the event stream is completed immediately when it
		 reaches the end of the "result set". Depending on journal implementation, this may mean all events up to when the
		 query is started, or it may include events that are persisted while the query is still streaming results. For
		 eventually consistent stores, it may only include all events up to some point before the query is started.
		
		Specified by:
		`[currentEventsBySlices](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#currentEventsBySlices(java.lang.String,int,int,akka.persistence.query.Offset))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### sliceForPersistenceId
		
		
		
		```
		public int sliceForPersistenceId​(java.lang.String persistenceId)
		```
		
		
		Specified by:
		`[sliceForPersistenceId](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#sliceForPersistenceId(java.lang.String))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### sliceRanges
		
		
		
		```
		public scala.collection.immutable.Seq<scala.collection.immutable.Range> sliceRanges​(int numberOfRanges)
		```
		
		
		Specified by:
		`[sliceRanges](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html#sliceRanges(int))` in interface `[CurrentEventsBySliceQuery](../../../query/typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`
		- #### currentPersistenceIds
		
		
		
		```
		public [Source](../../../../stream/scaladsl/Source.html "class in akka.stream.scaladsl")<java.lang.String,​[NotUsed](../../../../NotUsed.html "class in akka")> currentPersistenceIds​(scala.Option<java.lang.String> afterId,
		                                                                    long limit)
		```
		
		Get the current persistence ids.
		 
		 Not all plugins may support in database paging, and may simply use drop/take Akka streams operators
		 to manipulate the result set according to the paging parameters.
		 
		
		
		
		Specified by:
		`[currentPersistenceIds](../../../query/scaladsl/PagedPersistenceIdsQuery.html#currentPersistenceIds(scala.Option,long))` in interface `[PagedPersistenceIdsQuery](../../../query/scaladsl/PagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")`
		Parameters:
		`afterId` \- The ID to start returning results from, or `None` to return all ids. This should be an id
		 returned from a previous invocation of this command. Callers should not assume that ids are
		 returned in sorted order.
		`limit` \- The maximum results to return. Use Long.MaxValue to return all results. Must be greater than zero.
		Returns:
		A source containing all the persistence ids, limited as specified.

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/NotUsed.html
- https://doc.akka.io/japi/akka/current/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/stream/scaladsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html](https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html)*