---
description: Akka 2.10.17 - akka.persistence.query.typed.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:21:28Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/typed/scaladsl/index.html
title: Akka 2.10.17 - akka.persistence.query.typed.scaladsl
---

# Akka 2.10.17 - akka.persistence.query.typed.scaladsl

> **Summary:** Akka 2.10.17 - akka.persistence.query.typed.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/query/index.html "Permalink")  package [query](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](../index.html)Definition Classes[query](../../index.html)
- [**](../../../../../akka/persistence/query/typed/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[typed](../index.html)
- [**](../../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[typed](../index.html)
- [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "Query API for reading durable state objects.")
- [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
- [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.")
- [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.")
- [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.")
p[akka](../../../../index.html).[persistence](../../../index.html).[query](../../index.html).[typed](../index.html)

# scaladsl[**](../../../../../akka/persistence/query/typed/scaladsl/index.html "Permalink")

#### package scaladsl

Content Hierarchy****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "Permalink")  trait [CurrentEventsByPersistenceIdStartingFromSnapshotQuery](CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.

A plugin may optionally support this query by implementing this trait.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
2. [**](../../../../../akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html "Permalink")  trait [CurrentEventsByPersistenceIdTypedQuery](CurrentEventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.
3. [**](../../../../../akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html "Permalink")  trait [CurrentEventsBySliceQuery](CurrentEventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.
4. [**](../../../../../akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html "Permalink")  trait [CurrentEventsBySliceStartingFromSnapshotsQuery](CurrentEventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.
5. [**](../../../../../akka/persistence/query/typed/scaladsl/CurrentPersistenceIdsForEntityTypeQuery.html "Permalink")  trait [CurrentPersistenceIdsForEntityTypeQuery](CurrentPersistenceIdsForEntityTypeQuery.html "A plugin may optionally support this query by implementing this trait.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)A plugin may optionally support this query by implementing this trait.
6. [**](../../../../../akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html "Permalink")  trait [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html "Query API for reading durable state objects.")\[A] extends [DurableStateStore](../../../state/scaladsl/DurableStateStore.html)\[A]Query API for reading durable state objects.

Query API for reading durable state objects.

For Java API see [DurableStateStoreBySliceQuery](DurableStateStoreBySliceQuery.html).
7. [**](../../../../../akka/persistence/query/typed/scaladsl/EventTimestampQuery.html "Permalink")  trait [EventTimestampQuery](EventTimestampQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.") extends [ReadJournal](../../scaladsl/ReadJournal.html)[EventsBySliceQuery](EventsBySliceQuery.html) that is using a timestamp based offset should also implement this query.
8. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html "Permalink")  trait [EventsByPersistenceIdStartingFromSnapshotQuery](EventsByPersistenceIdStartingFromSnapshotQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.

A plugin may optionally support this query by implementing this trait.

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
9. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html "Permalink")  trait [EventsByPersistenceIdTypedQuery](EventsByPersistenceIdTypedQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.
10. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html "Permalink") final  class [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html "This wrapper of EventsBySliceQuery gives better scalability when many consumers retrieve the same events, for example many Projections of the same entity type.") extends [ReadJournal](../../scaladsl/ReadJournal.html) with [EventsBySliceQuery](EventsBySliceQuery.html) with [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html) with [EventTimestampQuery](EventTimestampQuery.html) with [LoadEventQuery](LoadEventQuery.html) with [LatestEventTimestampQuery](LatestEventTimestampQuery.html)This wrapper of [EventsBySliceQuery](EventsBySliceQuery.html) gives better scalability when many consumers retrieve the
same events, for example many Projections of the same entity type.

This wrapper of [EventsBySliceQuery](EventsBySliceQuery.html) gives better scalability when many consumers retrieve the
same events, for example many Projections of the same entity type. The purpose is to share
the stream of events from the database and fan out to connected consumer streams. Thereby fewer
queries and loading of events from the database.

It is retrieved with:

```
val queries = PersistenceQuery(system).readJournalFor[EventsBySliceQuery](EventsBySliceFirehoseQuery.Identifier)
```
Corresponding Java API is in [akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery](../javadsl/EventsBySliceFirehoseQuery.html).

Configuration settings can be defined in the configuration section with the
absolute path corresponding to the identifier, which is `"akka.persistence.query.events-by-slice-firehose"`
for the default [EventsBySliceFirehoseQuery\#Identifier](EventsBySliceFirehoseQuery$.html#Identifier:String). See `reference.conf`.

Annotations@nowarn()
11. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html "Permalink")  trait [EventsBySliceQuery](EventsBySliceQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.

A plugin may optionally support this query by implementing this trait.

`EventsBySliceQuery` that is using a timestamp based offset should also implement [EventTimestampQuery](EventTimestampQuery.html) and
[LoadEventQuery](LoadEventQuery.html).

See also [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html).
12. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html "Permalink")  trait [EventsBySliceStartingFromSnapshotsQuery](EventsBySliceStartingFromSnapshotsQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](../../scaladsl/ReadJournal.html)A plugin may optionally support this query by implementing this trait.

A plugin may optionally support this query by implementing this trait.

`EventsBySliceStartingFromSnapshotsQuery` that is using a timestamp based offset should also implement [EventTimestampQuery](EventTimestampQuery.html) and
[LoadEventQuery](LoadEventQuery.html).

See also [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery.html).

API May Change

Annotations@[ApiMayChange](../../../../annotation/ApiMayChange.html)()
13. [**](../../../../../akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html "Permalink")  trait [LatestEventTimestampQuery](LatestEventTimestampQuery.html "Retrieve the latest timestamp for an entity type and slice range.") extends [ReadJournal](../../scaladsl/ReadJournal.html)Retrieve the latest timestamp for an entity type and slice range.
14. [**](../../../../../akka/persistence/query/typed/scaladsl/LoadEventQuery.html "Permalink")  trait [LoadEventQuery](LoadEventQuery.html "EventsBySliceQuery that is using a timestamp based offset should also implement this query.") extends [ReadJournal](../../scaladsl/ReadJournal.html)[EventsBySliceQuery](EventsBySliceQuery.html) that is using a timestamp based offset should also implement this query.
### Value Members

1. [**](../../../../../akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html "Permalink")  object [EventsBySliceFirehoseQuery](EventsBySliceFirehoseQuery$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/annotation/ApiMayChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentPersistenceIdsForEntityTypeQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/DurableStateStoreBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdStartingFromSnapshotQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsByPersistenceIdTypedQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery$.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/LatestEventTimestampQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/LoadEventQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/index.html)*