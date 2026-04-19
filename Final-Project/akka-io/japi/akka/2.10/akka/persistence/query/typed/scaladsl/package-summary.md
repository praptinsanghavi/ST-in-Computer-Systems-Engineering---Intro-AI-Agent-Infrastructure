---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:11:21Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/package-summary.html
title: akka.persistence.query.typed.scaladsl
---

# akka.persistence.query.typed.scaladsl

## Content

# Package akka.persistence.query.typed.scaladsl

- Interface Summary 
| Interface | Description |
| [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| --- | --- |
| [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl")\<A\> | Query API for reading durable state objects. |
| [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [EventsBySliceQuery](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "interface in akka.persistence.query.typed.scaladsl") | A plugin may optionally support this query by implementing this trait. |
| [EventTimestampQuery](EventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl") | [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") that is using a timestamp based offset should also implement this query. |
| [LatestEventTimestampQuery](LatestEventTimestampQuery.html "interface in akka.persistence.query.typed.scaladsl") | Retrieve the latest timestamp for an entity type and slice range. |
| [LoadEventQuery](LoadEventQuery.html "interface in akka.persistence.query.typed.scaladsl") | [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") that is using a timestamp based offset should also implement this query. |
- Class Summary 
| Class | Description |
| [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "class in akka.persistence.query.typed.scaladsl") | This wrapper of [`EventsBySliceQuery`](EventsBySliceQuery.html "interface in akka.persistence.query.typed.scaladsl") gives better scalability when many consumers retrieve the  same events, for example many Projections of the same entity type. |
| --- | --- |
| [EventsBySliceFirehoseQuery$](EventsBySliceFirehoseQuery$.html "class in akka.persistence.query.typed.scaladsl") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html

---
*Source: [https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/package-summary.html](https://doc.akka.io/japi/akka/2.10/akka/persistence/query/typed/scaladsl/package-summary.html)*