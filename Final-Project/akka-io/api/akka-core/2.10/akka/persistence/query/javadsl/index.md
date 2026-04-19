---
description: Akka 2.10.17 - akka.persistence.query.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:20:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-core/current/akka/persistence/query/javadsl/index.html
title: Akka 2.10.17 - akka.persistence.query.javadsl
---

# Akka 2.10.17 - akka.persistence.query.javadsl

> **Summary:** Akka 2.10.17 - akka.persistence.query.javadsl

## Content

Akka2\.10\.17 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/query/index.html "Permalink")  package [query](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/query/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/javadsl/index.html "Permalink")  package javadslDefinition Classes[query](../index.html)
- [CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this interface.")
- [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "A plugin may optionally support this query by implementing this interface.")
- [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "A plugin may optionally support this query by implementing this interface.")
- [DurableStateStorePagedPersistenceIdsQuery](DurableStateStorePagedPersistenceIdsQuery.html "A DurableStateStore may optionally support this query by implementing this trait.")
- [DurableStateStoreQuery](DurableStateStoreQuery.html "Query API for reading durable state objects.")
- [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this interface.")
- [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this interface.")
- [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A ReadJournal may optionally support this query by implementing this trait.")
- [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this interface.")
- [ReadJournal](ReadJournal.html "API for reading persistent events and information derived from stored persistent events.")
- [**](../../../../akka/persistence/query/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[query](../index.html)
- [**](../../../../akka/persistence/query/typed/index.html "Permalink")  package [typed](../typed/index.html)Definition Classes[query](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[query](../index.html)

# javadsl[**](../../../../akka/persistence/query/javadsl/index.html "Permalink")

#### package javadsl

Content Hierarchy### Type Members

1. [**](../../../../akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html "Permalink")  trait [CurrentEventsByPersistenceIdQuery](CurrentEventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this interface.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this interface.
2. [**](../../../../akka/persistence/query/javadsl/CurrentEventsByTagQuery.html "Permalink")  trait [CurrentEventsByTagQuery](CurrentEventsByTagQuery.html "A plugin may optionally support this query by implementing this interface.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this interface.
3. [**](../../../../akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html "Permalink")  trait [CurrentPersistenceIdsQuery](CurrentPersistenceIdsQuery.html "A plugin may optionally support this query by implementing this interface.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this interface.
4. [**](../../../../akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html "Permalink")  trait [DurableStateStorePagedPersistenceIdsQuery](DurableStateStorePagedPersistenceIdsQuery.html "A DurableStateStore may optionally support this query by implementing this trait.")\[A] extends [DurableStateStore](../../state/javadsl/DurableStateStore.html)\[A]A DurableStateStore may optionally support this query by implementing this trait.
5. [**](../../../../akka/persistence/query/javadsl/DurableStateStoreQuery.html "Permalink")  trait [DurableStateStoreQuery](DurableStateStoreQuery.html "Query API for reading durable state objects.")\[A] extends [DurableStateStore](../../state/javadsl/DurableStateStore.html)\[A]Query API for reading durable state objects.

Query API for reading durable state objects.

For Scala API see [akka.persistence.query.scaladsl.DurableStateStoreQuery](../scaladsl/DurableStateStoreQuery.html).
6. [**](../../../../akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html "Permalink")  trait [EventsByPersistenceIdQuery](EventsByPersistenceIdQuery.html "A plugin may optionally support this query by implementing this interface.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this interface.
7. [**](../../../../akka/persistence/query/javadsl/EventsByTagQuery.html "Permalink")  trait [EventsByTagQuery](EventsByTagQuery.html "A plugin may optionally support this query by implementing this interface.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this interface.
8. [**](../../../../akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html "Permalink")  trait [PagedPersistenceIdsQuery](PagedPersistenceIdsQuery.html "A ReadJournal may optionally support this query by implementing this trait.") extends [ReadJournal](ReadJournal.html)A ReadJournal may optionally support this query by implementing this trait.
9. [**](../../../../akka/persistence/query/javadsl/PersistenceIdsQuery.html "Permalink")  trait [PersistenceIdsQuery](PersistenceIdsQuery.html "A plugin may optionally support this query by implementing this interface.") extends [ReadJournal](ReadJournal.html)A plugin may optionally support this query by implementing this interface.
10. [**](../../../../akka/persistence/query/javadsl/ReadJournal.html "Permalink")  trait [ReadJournal](ReadJournal.html "API for reading persistent events and information derived from stored persistent events.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)API for reading persistent events and information derived
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
SomeCoolReadJournal journal =
  PersistenceQuery.get(system).getReadJournalFor(SomeCoolReadJournal.class, queryPluginConfigPath);
Source<EventEnvolope, Unit> events = journal.eventsByTag("mytag", 0L);
```
For Scala API see [akka.persistence.query.scaladsl.ReadJournal](../scaladsl/ReadJournal.html).
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10/akka/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/internal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/DurableStateStorePagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/PagedPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/journal/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/DurableStateStoreQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/index.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/javadsl/DurableStateStore.html
- https://doc.akka.io/api/akka-core/2.10/index.html

---
*Source: [https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/index.html](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/javadsl/index.html)*