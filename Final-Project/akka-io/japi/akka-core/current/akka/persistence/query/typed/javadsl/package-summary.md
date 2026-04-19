---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:47:13Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/package-summary.html
title: akka.persistence.query.typed.javadsl
---

# akka.persistence.query.typed.javadsl

## Content

# Package akka.persistence.query.typed.javadsl

- Interface Summary 
| Interface | Description |
| [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| --- | --- |
| [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.javadsl")\<A\> | Query API for reading durable state objects. |
| [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.javadsl") | A plugin may optionally support this query by implementing this trait. |
| [EventTimestampQuery](EventTimestampQuery.html "interface in akka.persistence.query.typed.javadsl") | [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") that is using a timestamp based offset should also implement this query. |
| [LatestEventTimestampQuery](LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.javadsl") | Retrieve the latest timestamp for an entity type and slice range. |
| [LoadEventQuery](LoadEventQuery.html "interface in akka.persistence.query.typed.javadsl") | [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") that is using a timestamp based offset should also implement this query. |
- Class Summary 
| Class | Description |
| [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.javadsl") | This wrapper of [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.javadsl") gives better scalability when many consumers retrieve the  same events, for example many Projections of the same entity type. |
| --- | --- |
| [EventsBySliceFirehoseQuery$](EventsBySliceFirehoseQuery$.html "class in akka.persistence.query.typed.javadsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/LatestEventTimestampQuery.html
- https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/LoadEventQuery.html

---
*Source: [https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/package-summary.html](https://doc.akka.io/japi/akka-core/current/akka/persistence/query/typed/javadsl/package-summary.html)*