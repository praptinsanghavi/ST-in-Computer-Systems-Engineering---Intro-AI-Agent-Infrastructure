---
description: Akka 2.10.17 - akka.persistence.query.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-05T21:54:50Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/scaladsl/index.html
title: Akka 2.10.17 - akka.persistence.query.scaladsl
---

# Akka 2.10.17 - akka.persistence.query.scaladsl

> **Summary:** Akka 2.10.17 - akka.persistence.query.scaladsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[query](../index.html)
- [CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.")
- [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [DurableStateStorePagedPersistenceIdsQuery](DurableStateStorePagedPersistenceIdsQuery.html "A DurableStateStore may optionally support this query by implementing this trait.")
- [DurableStateStoreQuery](DurableStateStoreQuery.html "Query API for reading durable state objects.")
- [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.")
- [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.")
- [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A plugin ReadJournal may optionally support this query by implementing this trait.")
- [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.")
- [ReadJournal](ReadJournal.html "API for reading persistent events and information derived from stored persistent events.")
- [**](../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[query](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[query](../index.html)

# scaladsl[**](../../../../akka/persistence/query/scaladsl/index.html "Permalink")

#### package scaladsl

Content Hierarchy### Type Members

1. [**](../../../../akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html "Permalink")  trait [CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this trait.
2. [**](../../../../akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html "Permalink")  trait [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this trait.
3. [**](../../../../akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html "Permalink")  trait [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this trait.
4. [**](../../../../akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html "Permalink")  trait [DurableStateStorePagedPersistenceIdsQuery](DurableStateStorePagedPersistenceIdsQuery.html "A DurableStateStore may optionally support this query by implementing this trait.")\[A] extends [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A]A DurableStateStore may optionally support this query by implementing this trait.
5. [**](../../../../akka/persistence/query/scaladsl/DurableStateStoreQuery.html "Permalink")  trait [DurableStateStoreQuery](DurableStateStoreQuery.html "Query API for reading durable state objects.")\[A] extends [DurableStateStore](../../state/scaladsl/DurableStateStore.html)\[A]Query API for reading durable state objects.

Query API for reading durable state objects.

For Java API see [akka.persistence.query.javadsl.DurableStateStoreQuery](../javadsl/DurableStateStoreQuery.html).
6. [**](../../../../akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html "Permalink")  trait [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this trait.
7. [**](../../../../akka/persistence/query/scaladsl/EventsByTagQuery.html "Permalink")  trait [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this trait.
8. [**](../../../../akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html "Permalink")  trait [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A plugin ReadJournal may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin ReadJournal may optionally support this query by implementing this trait.
9. [**](../../../../akka/persistence/query/scaladsl/PersistenceIdsQuery.html "Permalink")  trait [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this trait.
10. [**](../../../../akka/persistence/query/scaladsl/ReadJournal.html "Permalink")  trait [ReadJournal](ReadJournal.html "API for reading persistent events and information derived from stored persistent events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API for reading persistent events and information derived
from stored persistent events.

API for reading persistent events and information derived
from stored persistent events.

The purpose of the API is not to enforce compatibility between different
journal implementations, because the technical capabilities may be very different.
The interface is very open so that different journals may implement specific queries.

There are a few pre\-defined queries that a query implementation may implement,
such as [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html), [PersistenceIdsQuery](PersistenceIdsQuery.html) and [EventsByTagQuery](EventsByTagQuery.html)
Implementation of these queries are optional and query (journal) plugins may define
their own specialized queries by implementing other methods.

Usage:

```
val journal = PersistenceQuery(system).readJournalFor[SomeCoolReadJournal](queryPluginConfigPath)
val events = journal.query(EventsByTag("mytag", 0L))
```
For Java API see [akka.persistence.query.javadsl.ReadJournal](../javadsl/ReadJournal.html).
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka/current/akka/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka/current/akka/persistence/state/scaladsl/DurableStateStore.html
- https://doc.akka.io/api/akka/current/index.html

---
*Source: [https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/index.html](https://doc.akka.io/api/akka/current/akka/persistence/query/scaladsl/index.html)*