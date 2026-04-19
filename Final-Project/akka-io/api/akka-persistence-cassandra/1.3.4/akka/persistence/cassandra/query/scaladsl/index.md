---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:13:27Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/query/scaladsl/index.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query.scaladsl

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/persistence/index.html "Permalink")  package [persistence](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../../index.html)Definition Classes[persistence](../../../index.html)
- [**](../../../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](../index.html)Definition Classes[cassandra](../../index.html)
- [**](../../../../../akka/persistence/cassandra/query/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[query](../index.html)
- [**](../../../../../akka/persistence/cassandra/query/scaladsl/index.html "Permalink")  package scaladslDefinition Classes[query](../index.html)
- [CassandraReadJournal](CassandraReadJournal.html "Scala API akka.persistence.query.scaladsl.ReadJournal implementation for Cassandra.")
p[akka](../../../../index.html).[persistence](../../../index.html).[cassandra](../../index.html).[query](../index.html)

# scaladsl[**](../../../../../akka/persistence/cassandra/query/scaladsl/index.html "Permalink")

#### package scaladsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html "Permalink")  class [CassandraReadJournal](CassandraReadJournal.html "Scala API akka.persistence.query.scaladsl.ReadJournal implementation for Cassandra.") extends [ReadJournal](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/ReadJournal.html#akka.persistence.query.scaladsl.ReadJournal) with [PersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/PersistenceIdsQuery.html#akka.persistence.query.scaladsl.PersistenceIdsQuery) with [CurrentPersistenceIdsQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html#akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery) with [EventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.EventsByPersistenceIdQuery) with [CurrentEventsByPersistenceIdQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html#akka.persistence.query.scaladsl.CurrentEventsByPersistenceIdQuery) with [EventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByTagQuery.html#akka.persistence.query.scaladsl.EventsByTagQuery) with [CurrentEventsByTagQuery](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html#akka.persistence.query.scaladsl.CurrentEventsByTagQuery)Scala API `akka.persistence.query.scaladsl.ReadJournal` implementation for Cassandra.

Scala API `akka.persistence.query.scaladsl.ReadJournal` implementation for Cassandra.

It is retrieved with:

```
val queries = PersistenceQuery(system).readJournalFor[CassandraReadJournal](CassandraReadJournal.Identifier)
```
Corresponding Java API is in [akka.persistence.cassandra.query.javadsl.CassandraReadJournal](../javadsl/CassandraReadJournal.html).

Configuration settings can be defined in the configuration section with the
absolute path corresponding to the identifier, which is `"akka.persistence.cassandra.query"`
for the default [CassandraReadJournal\#Identifier](CassandraReadJournal$.html#Identifier:String("akka.persistence.cassandra.query")). See `reference.conf`.
### Value Members

1. [**](../../../../../akka/persistence/cassandra/query/scaladsl/CassandraReadJournal$.html "Permalink")  object [CassandraReadJournal](CassandraReadJournal$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/CassandraReadJournal.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/index.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/index.html)*