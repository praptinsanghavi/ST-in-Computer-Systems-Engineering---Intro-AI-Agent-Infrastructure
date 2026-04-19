---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:24:57Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html
title: ReadJournal
---

# ReadJournal

## Content

Package [akka.persistence.query.javadsl](package-summary.html)
## Interface ReadJournal

- All Known Subinterfaces:
`[CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`, `[CurrentEventsByPersistenceIdStartingFromSnapshotQuery](../typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[CurrentEventsByPersistenceIdTypedQuery](../typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[CurrentEventsBySliceQuery](../typed/javadsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[CurrentEventsBySliceStartingFromSnapshotsQuery](../typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "interface in akka.persistence.query.javadsl")`, `[CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`, `[EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl")`, `[EventsByPersistenceIdStartingFromSnapshotQuery](../typed/javadsl/EventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[EventsByPersistenceIdTypedQuery](../typed/javadsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[EventsBySliceQuery](../typed/javadsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[EventsBySliceStartingFromSnapshotsQuery](../typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[EventsByTagQuery](EventsByTagQuery.html "interface in akka.persistence.query.javadsl")`, `[EventTimestampQuery](../typed/javadsl/EventTimestampQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[LatestEventTimestampQuery](../typed/javadsl/LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[LoadEventQuery](../typed/javadsl/LoadEventQuery.html "interface in akka.persistence.query.typed.javadsl")`, `[PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`, `[PersistenceIdsQuery](PersistenceIdsQuery.html "interface in akka.persistence.query.javadsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](../typed/javadsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl")`, `[LeveldbReadJournal](../journal/leveldb/javadsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.javadsl")`, `[PersistenceTestKitDurableStateStore](../../testkit/state/javadsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.javadsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/javadsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.javadsl")`

---

```
public interface ReadJournal
```

API for reading persistent events and information derived
 from stored persistent events.
 
 The purpose of the API is not to enforce compatibility between different
 journal implementations, because the technical capabilities may be very different.
 The interface is very open so that different journals may implement specific queries.
 

 There are a few pre\-defined queries that a query implementation may implement,
 such as [`EventsByPersistenceIdQuery`](EventsByPersistenceIdQuery.html "interface in akka.persistence.query.javadsl"), [`PersistenceIdsQuery`](PersistenceIdsQuery.html "interface in akka.persistence.query.javadsl") and [`EventsByTagQuery`](EventsByTagQuery.html "interface in akka.persistence.query.javadsl")
 Implementation of these queries are optional and query (journal) plugins may define
 their own specialized queries by implementing other methods.
 

 Usage:
 

```

 SomeCoolReadJournal journal =
   PersistenceQuery.get(system).getReadJournalFor(SomeCoolReadJournal.class, queryPluginConfigPath);
 Source<EventEnvolope, Unit> events = journal.eventsByTag("mytag", 0L);
 
```

 For Scala API see [`ReadJournal`](../scaladsl/ReadJournal.html "interface in akka.persistence.query.scaladsl").

## Code Examples

### Example 1: Interface ReadJournal

```text
SomeCoolReadJournal journal =
   PersistenceQuery.get(system).getReadJournalFor(SomeCoolReadJournal.class, queryPluginConfigPath);
 Source<EventEnvolope, Unit> events = journal.eventsByTag("mytag", 0L);
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/PersistenceIdsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/package-summary.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/journal/leveldb/javadsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/query/javadsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka/current/akka/persistence/testkit/state/javadsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/javadsl/ReadJournal.html)*