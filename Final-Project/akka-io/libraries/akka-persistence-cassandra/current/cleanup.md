---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:50Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/cleanup.html
title: Database Cleanup • Akka Persistence Cassandra
---

# Database Cleanup • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Database Cleanup

If possible, it is best to keep all events in an event sourced system. That way new [projections](https://doc.akka.io/libraries/akka-projection/current/index.html) and the `tag_view` table can be re\-built if it is corrupted (e.g. due to a two persistence ids writing events from two nodes in a split brain).

In some cases keeping all events is not possible. `EventSourcedBehavior`s can automatically snapshot state and delete events as described in the [Akka docs](https://doc.akka.io/libraries/akka-core/current/typed/persistence-snapshot.html#snapshot-deletion). Snapshotting is useful even if events aren’t deleted as it speeds up recovery.

The [`Cleanup`](/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html "akka.persistence.cassandra.cleanup.Cleanup")[`Cleanup`](/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html "akka.persistence.cassandra.cleanup.Cleanup") tool can retrospectively clean up the journal. Its operations include:

- Delete all events for a persistence id
- Delete all events and tagged events for the `eventsByTag` query
- Delete all snapshots for a persistence id
- Delete all snapshots and events for a persistence id keeping the latest N snapshots and all the events after them.

The cleanup tool can be combined with the [query plugin](read-journal.html) which has a query to get all persistence ids.

Warning
When running an operation with `Cleanup` that deletes all events for a persistence id, the actor with that persistence id must not be running! If the actor is restarted it would in that case be recovered to the wrong state since the stored events have been deleted. Delete events before snapshot can still be used while the actor is running.

Scala

```
[source](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/docs/src/test/scala/doc/cleanup/CleanupDocExample.scala#L16-L33 "Go to snippet source")val queries = PersistenceQuery(system).readJournalFor[CassandraReadJournal](CassandraReadJournal.Identifier)
val cleanup = new Cleanup(system)

//  how many persistence ids to operate on in parallel
val persistenceIdParallelism = 10

// forall persistence ids, keep two snapshots and delete all events before the oldest kept snapshot
queries.currentPersistenceIds().mapAsync(persistenceIdParallelism)(pid => cleanup.cleanupBeforeSnapshot(pid, 2)).run()

// forall persistence ids, keep everything after the provided unix timestamp, if there aren't enough snapshots after this time
// go back before the timestamp to find snapshot to delete before
// this operation is more expensive that the one above
val keepAfter = ZonedDateTime.now().minus(1, ChronoUnit.MONTHS);
queries
  .currentPersistenceIds()
  .mapAsync(persistenceIdParallelism)(pid => cleanup.cleanupBeforeSnapshot(pid, 2, keepAfter.toInstant.toEpochMilli))
  .run()

```

Java

```
[source](https://github.com/akka/akka-persistence-cassandra/tree/v1.3.4/docs/src/test/java/jdoc/cleanup/CleanupDocExample.java#L23-L40 "Go to snippet source")CassandraReadJournal queries = PersistenceQuery.get(system).getReadJournalFor(CassandraReadJournal.class, CassandraReadJournal.Identifier());
Cleanup cleanup = new Cleanup(system);

int persistenceIdParallelism = 10;

// forall persistence ids, keep two snapshots and delete all events before the oldest kept snapshot
queries.currentPersistenceIds().mapAsync(persistenceIdParallelism, pid -> FutureConverters.asJava(cleanup.cleanupBeforeSnapshot(pid, 2))).run(system);

// forall persistence ids, keep everything after the provided unix timestamp, if there aren't enough snapshots after this time
// go back before the timestamp to find snapshot to delete before
// this operation is more expensive that the one above
ZonedDateTime keepAfter = ZonedDateTime.now().minus(1, ChronoUnit.MONTHS);
queries
        .currentPersistenceIds()
        .mapAsync(persistenceIdParallelism, pid -> FutureConverters.asJava(cleanup.cleanupBeforeSnapshot(pid, 2, keepAfter.toInstant().toEpochMilli())))
        .run(system);

```

By default, all operations only print what they were going to do. Once you’re happy with what the cleanup tool is going to do set `akka.persistence.cassandra.cleanup.dry-run = false`

## Code Examples

### Example 1: Database Cleanup

```scala
val queries = PersistenceQuery(system).readJournalFor[CassandraReadJournal](CassandraReadJournal.Identifier)
val cleanup = new Cleanup(system)

//  how many persistence ids to operate on in parallel
val persistenceIdParallelism = 10

// forall persistence ids, keep two snapshots and delete all events before the oldest kept snapshot
queries.currentPersistenceIds().mapAsync(persistenceIdParallelism)(pid => cleanup.cleanupBeforeSnapshot(pid, 2)).run()

// forall persistence ids, keep everything after the provided unix timestamp, if there aren't enough snapshots after this time
// go back before the timestamp to find snapshot to delete before
// this operation is more expensive that the one above
val keepAfter = ZonedDateTime.now().minus(1, ChronoUnit.MONTHS);
queries
  .currentPersistenceIds()
  .mapAsync(persistenceIdParallelism)(pid => cleanup.cleanupBeforeSnapshot(pid, 2, keepAfter.toInstant.toEpochMilli))
  .run()
```

### Example 2: Database Cleanup

```java
CassandraReadJournal queries = PersistenceQuery.get(system).getReadJournalFor(CassandraReadJournal.class, CassandraReadJournal.Identifier());
Cleanup cleanup = new Cleanup(system);

int persistenceIdParallelism = 10;


// forall persistence ids, keep two snapshots and delete all events before the oldest kept snapshot
queries.currentPersistenceIds().mapAsync(persistenceIdParallelism, pid -> FutureConverters.asJava(cleanup.cleanupBeforeSnapshot(pid, 2))).run(system);

// forall persistence ids, keep everything after the provided unix timestamp, if there aren't enough snapshots after this time
// go back before the timestamp to find snapshot to delete before
// this operation is more expensive that the one above
ZonedDateTime keepAfter = ZonedDateTime.now().minus(1, ChronoUnit.MONTHS);
queries
        .currentPersistenceIds()
        .mapAsync(persistenceIdParallelism, pid -> FutureConverters.asJava(cleanup.cleanupBeforeSnapshot(pid, 2, keepAfter.toInstant().toEpochMilli())))
        .run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/cleanup/Cleanup.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence-snapshot.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/migrations.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html
- https://doc.akka.io/libraries/akka-projection/current/index.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/cleanup.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/cleanup.html)*