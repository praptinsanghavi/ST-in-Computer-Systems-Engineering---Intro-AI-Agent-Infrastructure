---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:17Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
title: ReadJournal
---

# ReadJournal

## Content

Package [akka.persistence.query.scaladsl](package-summary.html)
## Interface ReadJournal

- All Known Subinterfaces:
`[CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl")`, `[CurrentEventsByPersistenceIdStartingFromSnapshotQuery](../typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[CurrentEventsByPersistenceIdTypedQuery](../typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[CurrentEventsBySliceQuery](../typed/scaladsl/CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[CurrentEventsBySliceStartingFromSnapshotsQuery](../typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "interface in akka.persistence.query.scaladsl")`, `[CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")`, `[EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl")`, `[EventsByPersistenceIdStartingFromSnapshotQuery](../typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventsByPersistenceIdTypedQuery](../typed/scaladsl/EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventsBySliceQuery](../typed/scaladsl/EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventsBySliceStartingFromSnapshotsQuery](../typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[EventsByTagQuery](EventsByTagQuery.html "interface in akka.persistence.query.scaladsl")`, `[EventTimestampQuery](../typed/scaladsl/EventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[LatestEventTimestampQuery](../typed/scaladsl/LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[LoadEventQuery](../typed/scaladsl/LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl")`, `[PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")`, `[PersistenceIdsQuery](PersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl")`

All Known Implementing Classes:
`[EventsBySliceFirehoseQuery](../typed/scaladsl/EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl")`, `[LeveldbReadJournal](../journal/leveldb/scaladsl/LeveldbReadJournal.html "class in akka.persistence.query.journal.leveldb.scaladsl")`, `[PersistenceTestKitDurableStateStore](../../testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html "class in akka.persistence.testkit.state.scaladsl")`, `[PersistenceTestKitReadJournal](../../testkit/query/scaladsl/PersistenceTestKitReadJournal.html "class in akka.persistence.testkit.query.scaladsl")`

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
 such as [`EventsByPersistenceIdQuery`](EventsByPersistenceIdQuery.html "interface in akka.persistence.query.scaladsl"), [`PersistenceIdsQuery`](PersistenceIdsQuery.html "interface in akka.persistence.query.scaladsl") and [`EventsByTagQuery`](EventsByTagQuery.html "interface in akka.persistence.query.scaladsl")
 Implementation of these queries are optional and query (journal) plugins may define
 their own specialized queries by implementing other methods.
 

 Usage:
 

```

 val journal = PersistenceQuery(system).readJournalFor[SomeCoolReadJournal](queryPluginConfigPath)
 val events = journal.query(EventsByTag("mytag", 0L))
 
```

 For Java API see [`ReadJournal`](../javadsl/ReadJournal.html "interface in akka.persistence.query.javadsl").

## Code Examples

### Example 1: Interface ReadJournal

```text
val journal = PersistenceQuery(system).readJournalFor[SomeCoolReadJournal](queryPluginConfigPath)
 val events = journal.query(EventsByTag("mytag", 0L))
```

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/journal/leveldb/scaladsl/LeveldbReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/package-summary.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/query/scaladsl/PersistenceTestKitReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/testkit/state/scaladsl/PersistenceTestKitDurableStateStore.html

---
*Source: [https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html)*