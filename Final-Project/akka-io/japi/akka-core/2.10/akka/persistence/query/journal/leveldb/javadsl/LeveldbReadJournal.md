---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:15Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
title: LeveldbReadJournal
---

# LeveldbReadJournal

## Content

Package [akka.persistence.query.journal.leveldb.javadsl](package-summary.html)
## Class LeveldbReadJournal

- java.lang.Object
- - akka.persistence.query.journal.leveldb.javadsl.LeveldbReadJournal

- All Implemented Interfaces:
`[CurrentEventsByPersistenceIdQuery](../../../javadsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`, `[CurrentEventsByTagQuery](../../../javadsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl")`, `[CurrentPersistenceIdsQuery](../../../javadsl/CurrentPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`, `[EventsByPersistenceIdQuery](../../../javadsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`, `[EventsByTagQuery](../../../javadsl/EventsByTagQuery.html "interface in akka.persistence.query.javadsl")`, `[PersistenceIdsQuery](../../../javadsl/PersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`, `[ReadJournal](../../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl")`

---

```
public class LeveldbReadJournal
extends java.lang.Object
implements [ReadJournal](../../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl"), [PersistenceIdsQuery](../../../javadsl/PersistenceIdsQuery.html "interface in akka.persistence.query.javadsl"), [CurrentPersistenceIdsQuery](../../../javadsl/CurrentPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl"), [EventsByPersistenceIdQuery](../../../javadsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl"), [CurrentEventsByPersistenceIdQuery](../../../javadsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl"), [EventsByTagQuery](../../../javadsl/EventsByTagQuery.html "interface in akka.persistence.query.javadsl"), [CurrentEventsByTagQuery](../../../javadsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl")
```

Deprecated.
Use another journal implementation. Since 2\.6\.15\.

Java API: [`ReadJournal`](../../../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl") implementation for LevelDB.
 
 It is retrieved with:
 

```

 LeveldbReadJournal queries =
   PersistenceQuery.get(system).getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());
 
```

 Corresponding Scala API is in [`LeveldbReadJournal`](../scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl").
 

 Configuration settings can be defined in the configuration section with the
 absolute path corresponding to the identifier, which is `"akka.persistence.query.journal.leveldb"`
 for the default [`Identifier()`](#Identifier()). See `reference.conf`.

- - ### Constructor Summary
	
	
	
	Constructors 
	| Constructor | Description |
	| `[LeveldbReadJournal](#%3Cinit%3E(akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal))​([LeveldbReadJournal](../scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl") scaladslReadJournal)` | Deprecated. |

	- ### Method Summary
	
	
	
	All Methods [Static Methods](javascript:show(1);) [Instance Methods](javascript:show(2);) [Concrete Methods](javascript:show(8);) [Deprecated Methods](javascript:show(32);) 
	| Modifier and Type | Method | Description |
	| `[Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")>` | `[currentEventsByPersistenceId](#currentEventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Deprecated. Same type of query as [`eventsByPersistenceId(java.lang.String, long, long)`](#eventsByPersistenceId(java.lang.String,long,long)) but the event stream  is completed immediately when it reaches the end of the "result set". |
	| `[Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")>` | `[currentEventsByTag](#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../Offset.html "class in akka.persistence.query") offset)` | Deprecated. Same type of query as [`eventsByTag(java.lang.String, akka.persistence.query.Offset)`](#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream  is completed immediately when it reaches the end of the "result set". |
	| `[Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../../NotUsed.html "class in akka")>` | `[currentPersistenceIds](#currentPersistenceIds())()` | Deprecated. Same type of query as [`persistenceIds()`](#persistenceIds()) but the stream  is completed immediately when it reaches the end of the "result set". |
	| `[Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")>` | `[eventsByPersistenceId](#eventsByPersistenceId(java.lang.String,long,long))​(java.lang.String persistenceId,  long fromSequenceNr,  long toSequenceNr)` | Deprecated. `eventsByPersistenceId` is used for retrieving events for a specific  `PersistentActor` identified by `persistenceId`. |
	| `[Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")>` | `[eventsByTag](#eventsByTag(java.lang.String,akka.persistence.query.Offset))​(java.lang.String tag,  [Offset](../../../Offset.html "class in akka.persistence.query") offset)` | Deprecated. `eventsByTag` is used for retrieving events that were marked with  a given tag, e.g. |
	| `static java.lang.String` | `[Identifier](#Identifier())()` | Deprecated. The default identifier for [`LeveldbReadJournal`](LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl") to be used with  [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../../../PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)). |
	| `[Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../../NotUsed.html "class in akka")>` | `[persistenceIds](#persistenceIds())()` | Deprecated. `persistenceIds` is used for retrieving all `persistenceIds` of all  persistent actors. |
	
	
		- ### Methods inherited from class java.lang.Object
		
		
		`clone, equals, finalize, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

- - ### Constructor Detail
	
	
	
		- #### LeveldbReadJournal
		
		
		
		```
		public LeveldbReadJournal​([LeveldbReadJournal](../scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl") scaladslReadJournal)
		```
		
		Deprecated.

	- ### Method Detail
	
	
	
		- #### Identifier
		
		
		
		```
		public static final java.lang.String Identifier()
		```
		
		Deprecated.
		The default identifier for [`LeveldbReadJournal`](LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl") to be used with
		 [`PersistenceQuery.getReadJournalFor(java.lang.Class<T>, java.lang.String, com.typesafe.config.Config)`](../../../PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String,com.typesafe.config.Config)).
		 
		 The value is `"akka.persistence.query.journal.leveldb"` and corresponds
		 to the absolute path to the read journal configuration entry.
		- #### persistenceIds
		
		
		
		```
		public [Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../../NotUsed.html "class in akka")> persistenceIds()
		```
		
		Deprecated.
		`persistenceIds` is used for retrieving all `persistenceIds` of all
		 persistent actors.
		 
		 The returned event stream is unordered and you can expect different order for multiple
		 executions of the query.
		 
		
		
		 The stream is not completed when it reaches the end of the currently used `persistenceIds`,
		 but it continues to push new `persistenceIds` when new persistent actors are created.
		 Corresponding query that is completed when it reaches the end of the currently
		 currently used `persistenceIds` is provided by [`currentPersistenceIds()`](#currentPersistenceIds()).
		 
		
		
		 The LevelDB write journal is notifying the query side as soon as new `persistenceIds` are
		 created and there is no periodic polling or batching involved in this query.
		 
		
		
		 The stream is completed with failure if there is a failure in executing the query in the
		 backend journal.
		
		
		
		Specified by:
		`[persistenceIds](../../../javadsl/PersistenceIdsQuery.html#persistenceIds())` in interface `[PersistenceIdsQuery](../../../javadsl/PersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`
		- #### currentPersistenceIds
		
		
		
		```
		public [Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<java.lang.String,​[NotUsed](../../../../../NotUsed.html "class in akka")> currentPersistenceIds()
		```
		
		Deprecated.
		Same type of query as [`persistenceIds()`](#persistenceIds()) but the stream
		 is completed immediately when it reaches the end of the "result set". Persistent
		 actors that are created after the query is completed are not included in the stream.
		
		Specified by:
		`[currentPersistenceIds](../../../javadsl/CurrentPersistenceIdsQuery.html#currentPersistenceIds())` in interface `[CurrentPersistenceIdsQuery](../../../javadsl/CurrentPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`
		- #### eventsByPersistenceId
		
		
		
		```
		public [Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")> eventsByPersistenceId​(java.lang.String persistenceId,
		                                                                 long fromSequenceNr,
		                                                                 long toSequenceNr)
		```
		
		Deprecated.
		`eventsByPersistenceId` is used for retrieving events for a specific
		 `PersistentActor` identified by `persistenceId`.
		 
		 You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr`
		 or use `0L` and `Long.MaxValue` respectively to retrieve all events. Note that
		 the corresponding sequence number of each event is provided in the
		 [`EventEnvelope`](../../../EventEnvelope.html "class in akka.persistence.query"), which makes it possible to resume the
		 stream at a later point from a given sequence number.
		 
		
		
		 The returned event stream is ordered by sequence number, i.e. the same order as the
		 `PersistentActor` persisted the events. The same prefix of stream elements (in same order)
		 are returned for multiple executions of the query, except for when events have been deleted.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`currentEventsByPersistenceId(java.lang.String, long, long)`](#currentEventsByPersistenceId(java.lang.String,long,long)).
		 
		
		
		 The LevelDB write journal is notifying the query side as soon as events are persisted, but for
		 efficiency reasons the query side retrieves the events in batches that sometimes can
		 be delayed up to the configured `refresh-interval`.
		 
		
		
		 The stream is completed with failure if there is a failure in executing the query in the
		 backend journal.
		
		
		
		Specified by:
		`[eventsByPersistenceId](../../../javadsl/EventsByPersistenceIdQuery.html#eventsByPersistenceId(java.lang.String,long,long))` in interface `[EventsByPersistenceIdQuery](../../../javadsl/EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`
		- #### currentEventsByPersistenceId
		
		
		
		```
		public [Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")> currentEventsByPersistenceId​(java.lang.String persistenceId,
		                                                                        long fromSequenceNr,
		                                                                        long toSequenceNr)
		```
		
		Deprecated.
		Same type of query as [`eventsByPersistenceId(java.lang.String, long, long)`](#eventsByPersistenceId(java.lang.String,long,long)) but the event stream
		 is completed immediately when it reaches the end of the "result set". Events that are
		 stored after the query is completed are not included in the event stream.
		
		Specified by:
		`[currentEventsByPersistenceId](../../../javadsl/CurrentEventsByPersistenceIdQuery.html#currentEventsByPersistenceId(java.lang.String,long,long))` in interface `[CurrentEventsByPersistenceIdQuery](../../../javadsl/CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`
		- #### eventsByTag
		
		
		
		```
		public [Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")> eventsByTag​(java.lang.String tag,
		                                                       [Offset](../../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Deprecated.
		`eventsByTag` is used for retrieving events that were marked with
		 a given tag, e.g. all events of an Aggregate Root type.
		 
		 To tag events you create an [`EventAdapter`](../../../../journal/EventAdapter.html "interface in akka.persistence.journal") that wraps the events
		 in a [`Tagged`](../../../../journal/Tagged.html "class in akka.persistence.journal") with the given `tags`.
		 
		
		
		 You can retrieve a subset of all events by specifying `offset`, or use `0L` to retrieve all
		 events with a given tag. The `offset` corresponds to an ordered sequence number for
		 the specific tag. Note that the corresponding offset of each event is provided in the
		 [`EventEnvelope`](../../../EventEnvelope.html "class in akka.persistence.query"), which makes it possible to resume the
		 stream at a later point from a given offset.
		 
		
		
		 In addition to the `offset` the `EventEnvelope` also provides `persistenceId` and `sequenceNr`
		 for each event. The `sequenceNr` is the sequence number for the persistent actor with the
		 `persistenceId` that persisted the event. The `persistenceId` \+ `sequenceNr` is an unique
		 identifier for the event.
		 
		
		
		 The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
		 in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
		 as the `offset` parameter in a subsequent query.
		 
		
		
		 The returned event stream is ordered by the offset (tag sequence number), which corresponds
		 to the same order as the write journal stored the events. The same stream elements (in same order)
		 are returned for multiple executions of the query. Deleted events are not deleted from the
		 tagged event stream.
		 
		
		
		 The stream is not completed when it reaches the end of the currently stored events,
		 but it continues to push new events when new events are persisted.
		 Corresponding query that is completed when it reaches the end of the currently
		 stored events is provided by [`currentEventsByTag(java.lang.String, akka.persistence.query.Offset)`](#currentEventsByTag(java.lang.String,akka.persistence.query.Offset)).
		 
		
		
		 The LevelDB write journal is notifying the query side as soon as tagged events are persisted, but for
		 efficiency reasons the query side retrieves the events in batches that sometimes can
		 be delayed up to the configured `refresh-interval`.
		 
		
		
		 The stream is completed with failure if there is a failure in executing the query in the
		 backend journal.
		
		
		
		Specified by:
		`[eventsByTag](../../../javadsl/EventsByTagQuery.html#eventsByTag(java.lang.String,akka.persistence.query.Offset))` in interface `[EventsByTagQuery](../../../javadsl/EventsByTagQuery.html "interface in akka.persistence.query.javadsl")`
		- #### currentEventsByTag
		
		
		
		```
		public [Source](../../../../../stream/javadsl/Source.html "class in akka.stream.javadsl")<[EventEnvelope](../../../EventEnvelope.html "class in akka.persistence.query"),​[NotUsed](../../../../../NotUsed.html "class in akka")> currentEventsByTag​(java.lang.String tag,
		                                                              [Offset](../../../Offset.html "class in akka.persistence.query") offset)
		```
		
		Deprecated.
		Same type of query as [`eventsByTag(java.lang.String, akka.persistence.query.Offset)`](#eventsByTag(java.lang.String,akka.persistence.query.Offset)) but the event stream
		 is completed immediately when it reaches the end of the "result set". Events that are
		 stored after the query is completed are not included in the event stream.
		
		Specified by:
		`[currentEventsByTag](../../../javadsl/CurrentEventsByTagQuery.html#currentEventsByTag(java.lang.String,akka.persistence.query.Offset))` in interface `[CurrentEventsByTagQuery](../../../javadsl/CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl")`

## Code Examples

### Example 1: Class LeveldbReadJournal

```text
LeveldbReadJournal queries =
   PersistenceQuery.get(system).getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/NotUsed.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/EventAdapter.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/PersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html)*