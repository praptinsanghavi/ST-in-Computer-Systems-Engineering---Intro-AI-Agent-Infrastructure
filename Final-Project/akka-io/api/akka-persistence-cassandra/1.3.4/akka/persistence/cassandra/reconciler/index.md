---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:23Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/reconciler/index.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.reconciler

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
- [**](../../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package reconcilerDefinition Classes[cassandra](../index.html)
- [Reconciliation](Reconciliation.html "For reconciling the tag_views table with the messages table.")
- [ReconciliationSettings](ReconciliationSettings.html)
p[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html)

# reconciler[**](../../../../akka/persistence/cassandra/reconciler/index.html "Permalink")

#### package reconciler

### Type Members

1. [**](../../../../akka/persistence/cassandra/reconciler/Reconciliation.html "Permalink") final  class [Reconciliation](Reconciliation.html "For reconciling the tag_views table with the messages table.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)For reconciling the `tag_views` table with the messages table.

For reconciling the `tag_views` table with the messages table. Can be used to:

\- Fix data issues caused by split brains or persistence ids running in multiple locations
\- Continue tag writes after a node crash (using [continueTagWritesForPersistenceId](Reconciliation.html#continueTagWritesForPersistenceId(persistenceId:String):scala.concurrent.Future[akka.Done]))
\- Rebuild tag views from scratch (using [rebuildTagViewForPersistenceIds](Reconciliation.html#rebuildTagViewForPersistenceIds(persistenceId:String):scala.concurrent.Future[akka.Done]))

**Important**: Most operations (delete, truncate, rebuild) should only be run when the
affected persistence ids are NOT running. Running these while actors are actively persisting
can cause data corruption or gaps in tag sequences. The exception is [continueTagWritesForPersistenceId](Reconciliation.html#continueTagWritesForPersistenceId(persistenceId:String):scala.concurrent.Future[akka.Done])
which is safe to run while the application is running.

API likely to change when a java/scaladsl is added.

Annotations@ApiMayChange()
2. [**](../../../../akka/persistence/cassandra/reconciler/ReconciliationSettings.html "Permalink") final  class [ReconciliationSettings](ReconciliationSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/compaction/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/example/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/healthcheck/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/journal/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/query/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/Reconciliation.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/ReconciliationSettings.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/index.html

---
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/reconciler/index.html)*