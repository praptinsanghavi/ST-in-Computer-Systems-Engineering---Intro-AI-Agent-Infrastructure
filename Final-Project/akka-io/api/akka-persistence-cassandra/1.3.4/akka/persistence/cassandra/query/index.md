---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/query/index.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.query

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/cleanup/index.html "Permalink")  package [cleanup](../cleanup/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package [compaction](../compaction/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/example/index.html "Permalink")  package [example](../example/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/healthcheck/index.html "Permalink")  package [healthcheck](../healthcheck/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/query/index.html "Permalink")  package queryDefinition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../../../akka/persistence/cassandra/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [CassandraReadJournalProvider](CassandraReadJournalProvider.html)
- [MissingTaggedEventException](MissingTaggedEventException.html "Events by tag query was unable all the events for some persistence ids.")
- [**](../../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package [reconciler](../reconciler/index.html)Definition Classes[cassandra](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html)

# query[**](../../../../akka/persistence/cassandra/query/index.html "Permalink")

#### package query

Source[package.scala](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/core/src/main/scala/akka/persistence/cassandra/query/package.scala#L15)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)### Package Members

1. [**](../../../../akka/persistence/cassandra/query/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
2. [**](../../../../akka/persistence/cassandra/query/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
### Type Members

1. [**](../../../../akka/persistence/cassandra/query/CassandraReadJournalProvider.html "Permalink")  class [CassandraReadJournalProvider](CassandraReadJournalProvider.html) extends [ReadJournalProvider](https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/ReadJournalProvider.html#akka.persistence.query.ReadJournalProvider)
2. [**](../../../../akka/persistence/cassandra/query/MissingTaggedEventException.html "Permalink") final  class [MissingTaggedEventException](MissingTaggedEventException.html "Events by tag query was unable all the events for some persistence ids.") extends RuntimeExceptionEvents by tag query was unable all the events for some persistence ids.

Events by tag query was unable all the events for some persistence ids.

Consider restarting the query from the minOffset if downstream processing is idempotent
as it may re\-deliver previously delivered events.

Annotations@ApiMayChange()
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/example/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/healthcheck/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/journal/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/CassandraReadJournalProvider.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/MissingTaggedEventException.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/javadsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/scaladsl/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html)*