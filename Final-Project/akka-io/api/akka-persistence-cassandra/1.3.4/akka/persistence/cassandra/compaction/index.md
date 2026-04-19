---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:22Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/compaction/index.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.compaction

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/cleanup/index.html "Permalink")  package [cleanup](../cleanup/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package compactionDefinition Classes[cassandra](../index.html)
- [BaseCompactionStrategy](BaseCompactionStrategy.html)
- [CassandraCompactionStrategy](CassandraCompactionStrategy.html)
- [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)
- [LeveledCompactionStrategy](LeveledCompactionStrategy.html)
- [SizeTieredCompactionStrategy](SizeTieredCompactionStrategy.html)
- [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy.html)
- [**](../../../../akka/persistence/cassandra/example/index.html "Permalink")  package [example](../example/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/healthcheck/index.html "Permalink")  package [healthcheck](../healthcheck/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package [reconciler](../reconciler/index.html)Definition Classes[cassandra](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html)

# compaction[**](../../../../akka/persistence/cassandra/compaction/index.html "Permalink")

#### package compaction

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../../akka/persistence/cassandra/compaction/BaseCompactionStrategy.html "Permalink") abstract  class [BaseCompactionStrategy](BaseCompactionStrategy.html) extends [CassandraCompactionStrategy](CassandraCompactionStrategy.html)
2. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategy.html "Permalink")  trait [CassandraCompactionStrategy](CassandraCompactionStrategy.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
3. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html "Permalink")  trait [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[CSS \<: [CassandraCompactionStrategy](CassandraCompactionStrategy.html)] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
4. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy.html "Permalink")  class [LeveledCompactionStrategy](LeveledCompactionStrategy.html) extends [BaseCompactionStrategy](BaseCompactionStrategy.html)
5. [**](../../../../akka/persistence/cassandra/compaction/SizeTieredCompactionStrategy.html "Permalink")  class [SizeTieredCompactionStrategy](SizeTieredCompactionStrategy.html) extends [BaseCompactionStrategy](BaseCompactionStrategy.html)
6. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html "Permalink")  class [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy.html) extends [BaseCompactionStrategy](BaseCompactionStrategy.html)
### Value Members

1. [**](../../../../akka/persistence/cassandra/compaction/BaseCompactionStrategy$.html "Permalink")  object [BaseCompactionStrategy](BaseCompactionStrategy$.html) extends [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[BaseCompactionStrategy](BaseCompactionStrategy.html)]
2. [**](../../../../akka/persistence/cassandra/compaction/CassandraCompactionStrategy$.html "Permalink")  object [CassandraCompactionStrategy](CassandraCompactionStrategy$.html)
3. [**](../../../../akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html "Permalink")  object [LeveledCompactionStrategy](LeveledCompactionStrategy$.html) extends [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[LeveledCompactionStrategy](LeveledCompactionStrategy.html)]
4. [**](../../../../akka/persistence/cassandra/compaction/SizeTieredCompactionStrategy$.html "Permalink")  object [SizeTieredCompactionStrategy](SizeTieredCompactionStrategy$.html) extends [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[SizeTieredCompactionStrategy](SizeTieredCompactionStrategy.html)]
5. [**](../../../../akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy$.html "Permalink")  object [TimeWindowCompactionStrategy](TimeWindowCompactionStrategy$.html) extends [CassandraCompactionStrategyConfig](CassandraCompactionStrategyConfig.html)\[[TimeWindowCompactionStrategy](TimeWindowCompactionStrategy.html)]
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/BaseCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/BaseCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/CassandraCompactionStrategyConfig.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/LeveledCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/LeveledCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/SizeTieredCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/SizeTieredCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy$.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/TimeWindowCompactionStrategy.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/example/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/healthcheck/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/journal/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html)*