---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:35Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html
title: Query Plugin • Akka Persistence Cassandra
---

# Query Plugin • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Query Plugin

It implements the following [Persistence Queries](https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html):

- eventsByPersistenceId, currentEventsByPersistenceId
- eventsByTag, currentEventsByTag
- persistenceIds, currentPersistenceIds

See API details in [`CassandraReadJournal`](/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/CassandraReadJournal.html "akka.persistence.cassandra.query.javadsl.CassandraReadJournal")[`CassandraReadJournal`](/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html "akka.persistence.cassandra.query.scaladsl.CassandraReadJournal") and [eventsByTag documentation](events-by-tag.html). 

Persistence Query usage example to obtain a stream with all events tagged with “someTag” with Persistence Query:

```
val queries = PersistenceQuery(system).readJournalFor[CassandraReadJournal](CassandraReadJournal.Identifier)
queries.eventsByTag("someTag", Offset.noOffset)

```

## Configuration

The default settings can be changed with the configuration properties defined in [reference.conf](configuration.html#default-configuration).

Query configuration is under `akka.persistence.cassandra.query`.

Events by tag configuration is under `akka.persistence.cassandra.events-by-tag` and shared by `journal` and `query`.

If using events by tag query it is important to set the [first time bucket](events-by-tag.html#first-time-bucket)

## Code Examples

### Example 1: Query Plugin

```text
val queries = PersistenceQuery(system).readJournalFor[CassandraReadJournal](CassandraReadJournal.Identifier)
queries.eventsByTag("someTag", Offset.noOffset)
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/CassandraReadJournal.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/CassandraReadJournal.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/configuration.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/events-by-tag.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/journal.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html)*