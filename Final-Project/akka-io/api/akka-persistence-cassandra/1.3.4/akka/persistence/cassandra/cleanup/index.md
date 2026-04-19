---
description: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:21Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/akka-persistence-cassandra/current/akka/persistence/cassandra/cleanup/index.html
title: Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup
---

# Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup

> **Summary:** Akka Persistence Cassandra 1.3.4 - akka.persistence.cassandra.cleanup

## Content

Akka Persistence Cassandra1\.3\.4 \< Back****# Packages

- [**](../../../../index.html "Permalink")  package [root](../../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/index.html "Permalink")  package [akka](../../../index.html)Definition Classes[root](../../../../index.html)
- [**](../../../../akka/persistence/index.html "Permalink")  package [persistence](../../index.html)Definition Classes[akka](../../../index.html)
- [**](../../../../akka/persistence/cassandra/index.html "Permalink")  package [cassandra](../index.html)Definition Classes[persistence](../../index.html)
- [**](../../../../akka/persistence/cassandra/cleanup/index.html "Permalink")  package cleanupDefinition Classes[cassandra](../index.html)
- [Cleanup](Cleanup.html "Tool for deleting all events and/or snapshots for a given list of persistenceIds without using persistent actors.")
- [CleanupSettings](CleanupSettings.html)
- [**](../../../../akka/persistence/cassandra/compaction/index.html "Permalink")  package [compaction](../compaction/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/example/index.html "Permalink")  package [example](../example/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/healthcheck/index.html "Permalink")  package [healthcheck](../healthcheck/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/journal/index.html "Permalink")  package [journal](../journal/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/query/index.html "Permalink")  package [query](../query/index.html)Definition Classes[cassandra](../index.html)
- [**](../../../../akka/persistence/cassandra/reconciler/index.html "Permalink")  package [reconciler](../reconciler/index.html)Definition Classes[cassandra](../index.html)
p[akka](../../../index.html).[persistence](../../index.html).[cassandra](../index.html)

# cleanup[**](../../../../akka/persistence/cassandra/cleanup/index.html "Permalink")

#### package cleanup

### Type Members

1. [**](../../../../akka/persistence/cassandra/cleanup/Cleanup.html "Permalink") final  class [Cleanup](Cleanup.html "Tool for deleting all events and/or snapshots for a given list of persistenceIds without using persistent actors.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Tool for deleting all events and/or snapshots for a given list of `persistenceIds` without using persistent actors.

Tool for deleting all events and/or snapshots for a given list of `persistenceIds` without using persistent actors.
It's important that the actors with corresponding `persistenceId` are not running
at the same time as using the tool.

If `neverUsePersistenceIdAgain` is `true` then the highest used sequence number is deleted and
the `persistenceId` should not be used again, since it would be confusing to reuse the same sequence
numbers for new events.

When a list of `persistenceIds` are given they are deleted sequentially in the order
of the list. It's possible to parallelize the deletes by running several cleanup operations
at the same time operating on different sets of `persistenceIds`.

Annotations@ApiMayChange()
2. [**](../../../../akka/persistence/cassandra/cleanup/CleanupSettings.html "Permalink")  class [CleanupSettings](CleanupSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@ApiMayChange()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/index.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/CleanupSettings.html
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html
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
*Source: [https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/index.html)*