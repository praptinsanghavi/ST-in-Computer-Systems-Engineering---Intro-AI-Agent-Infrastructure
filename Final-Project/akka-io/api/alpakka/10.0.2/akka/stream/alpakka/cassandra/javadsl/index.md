---
description: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:22:51Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka/current/akka/stream/alpakka/cassandra/javadsl/index.html
title: Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl
---

# Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl

> **Summary:** Alpakka 10.0.2 - akka.stream.alpakka.cassandra.javadsl

## Content

Alpakka10\.0\.2 \< Back****# Packages

- [**](../../../../../index.html "Permalink")  package [root](../../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/index.html "Permalink")  package [akka](../../../../index.html)Definition Classes[root](../../../../../index.html)
- [**](../../../../../akka/stream/index.html "Permalink")  package [stream](../../../index.html)Definition Classes[akka](../../../../index.html)
- [**](../../../../../akka/stream/alpakka/index.html "Permalink")  package [alpakka](../../index.html)Definition Classes[stream](../../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[alpakka](../../index.html)
- [**](../../../../../akka/stream/alpakka/cassandra/javadsl/index.html "Permalink")  package javadslDefinition Classes[cassandra](../index.html)
- [CassandraFlow](CassandraFlow$.html "Java API to create Cassandra flows.")
- [CassandraSession](CassandraSession.html "Data Access Object for Cassandra.")
- [CassandraSessionRegistry](CassandraSessionRegistry.html)
- [CassandraSource](CassandraSource$.html "Java API.")
- [**](../../../../../akka/stream/alpakka/cassandra/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[cassandra](../index.html)
p[akka](../../../../index.html).[stream](../../../index.html).[alpakka](../../index.html).[cassandra](../index.html)

# javadsl[**](../../../../../akka/stream/alpakka/cassandra/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSession.html "Permalink") final  class [CassandraSession](CassandraSession.html "Data Access Object for Cassandra.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Data Access Object for Cassandra.

Data Access Object for Cassandra. The statements are expressed in
[Apache Cassandra Query Language](https://cassandra.apache.org/doc/latest/cql/)
(CQL) syntax.

See even [CQL for Datastax Enterprise](https://docs.datastax.com/en/dse/6.7/cql/).

The `init` hook is called before the underlying session is used by other methods,
so it can be used for things like creating the keyspace and tables.

All methods are non\-blocking.
2. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry.html "Permalink") final  class [CassandraSessionRegistry](CassandraSessionRegistry.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Value Members

1. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html "Permalink")  object [CassandraFlow](CassandraFlow$.html "Java API to create Cassandra flows.")Java API to create Cassandra flows.
2. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry$.html "Permalink")  object [CassandraSessionRegistry](CassandraSessionRegistry$.html "This Cassandra session registry makes it possible to share Cassandra sessions between multiple use sites in the same ActorSystem (important for the Cassandra Akka Persistence plugin where it is shared between journal, query plugin and snapshot plugin)")This Cassandra session registry makes it possible to share Cassandra sessions between multiple use sites
in the same `ActorSystem` (important for the Cassandra Akka Persistence plugin where it is shared between journal,
query plugin and snapshot plugin)
3. [**](../../../../../akka/stream/alpakka/cassandra/javadsl/CassandraSource$.html "Permalink")  object [CassandraSource](CassandraSource$.html "Java API.")Java API.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka/10.0.2/akka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/index.html
- https://doc.akka.io/api/alpakka/10.0.2/index.html

---
*Source: [https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/index.html](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/index.html)*