---
description: ''
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:38:16Z'
section: japi
site: akka-io
source_url: https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html
title: akka.persistence.query
---

# akka.persistence.query

## Content

# Package akka.persistence.query

- Interface Summary 
| Interface | Description |
| [DurableStateChange](DurableStateChange.html "interface in akka.persistence.query")\<A\> | The `DurableStateStoreQuery` stream elements for `DurableStateStoreQuery`. |
| --- | --- |
| [ReadJournalProvider](ReadJournalProvider.html "interface in akka.persistence.query") | A query plugin must implement a class that implements this trait. |
- Class Summary 
| Class | Description |
| [DeletedDurableState](DeletedDurableState.html "class in akka.persistence.query")\<A\> | param: persistenceId The persistence id of the origin entity. |
| --- | --- |
| [DeletedDurableState$](DeletedDurableState$.html "class in akka.persistence.query") |  |
| [EventEnvelope](EventEnvelope.html "class in akka.persistence.query") | Event wrapper adding meta data for the events in the result stream of  [`EventsByTagQuery`](scaladsl/EventsByTagQuery.html "interface in akka.persistence.query.scaladsl") query, or similar queries. |
| [EventEnvelope$](EventEnvelope$.html "class in akka.persistence.query") |  |
| [NoOffset](NoOffset.html "class in akka.persistence.query") | Used when retrieving all events. |
| [NoOffset$](NoOffset$.html "class in akka.persistence.query") | Used when retrieving all events. |
| [Offset](Offset.html "class in akka.persistence.query") |  |
| [Offset$](Offset$.html "class in akka.persistence.query") |  |
| [PersistenceQuery](PersistenceQuery.html "class in akka.persistence.query") |  |
| [PersistenceQuery$](PersistenceQuery$.html "class in akka.persistence.query") | Persistence extension for queries. |
| [QueryCorrelationId](QueryCorrelationId.html "class in akka.persistence.query") | (Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and  error messages. |
| [QueryCorrelationId$](QueryCorrelationId$.html "class in akka.persistence.query") | (Optional) mechanism for query implementations to pick up a correlation id from the caller, to use in logging and  error messages. |
| [Sequence](Sequence.html "class in akka.persistence.query") | Corresponds to an ordered sequence number for the events. |
| [Sequence$](Sequence$.html "class in akka.persistence.query") |  |
| [TimeBasedUUID](TimeBasedUUID.html "class in akka.persistence.query") | Corresponds to an ordered unique identifier of the events. |
| [TimeBasedUUID$](TimeBasedUUID$.html "class in akka.persistence.query") |  |
| [TimestampOffset](TimestampOffset.html "class in akka.persistence.query") | Timestamp based offset. |
| [TimestampOffset$](TimestampOffset$.html "class in akka.persistence.query") |  |
| [TimestampOffsetBySlice](TimestampOffsetBySlice.html "class in akka.persistence.query") | Timestamp\-based offset by slice. |
| [TimestampOffsetBySlice$](TimestampOffsetBySlice$.html "class in akka.persistence.query") | Timestamp\-based offset by slice. |
| [UpdatedDurableState](UpdatedDurableState.html "class in akka.persistence.query")\<A\> | param: persistenceId The persistence id of the origin entity. |
| [UpdatedDurableState$](UpdatedDurableState$.html "class in akka.persistence.query") |  |

## Related Pages (Internal Links)

- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DeletedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/EventEnvelope.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/NoOffset$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/NoOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/PersistenceQuery$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/QueryCorrelationId$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/QueryCorrelationId.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Sequence$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/Sequence.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimeBasedUUID$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimeBasedUUID.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/TimestampOffsetBySlice.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState$.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/UpdatedDurableState.html
- https://doc.akka.io/japi/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html

---
*Source: [https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html](https://doc.akka.io/japi/akka/current/akka/persistence/query/package-summary.html)*