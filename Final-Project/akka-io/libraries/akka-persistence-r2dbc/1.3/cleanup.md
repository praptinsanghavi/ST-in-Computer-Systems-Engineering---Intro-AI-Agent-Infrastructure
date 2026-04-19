---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:37:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/cleanup.html
title: Database Cleanup • Akka Persistence R2DBC Documentation
---

# Database Cleanup • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Database Cleanup

## Event Sourced cleanup tool

If possible, it is best to keep all events in an event sourced system. That way new [Akka Projection R2DBC](https://doc.akka.io/libraries/akka-projection/current/r2dbc.html) can be re\-built. A [Projection can also start or continue from a snapshot](query.html#eventsbyslicesstartingfromsnapshots), and then events can be deleted before the snapshot. 

In some cases keeping all events is not possible or must be removed for regulatory reasons, such as compliance with GDPR. `EventSourcedBehavior`s can automatically snapshot state and delete events as described in the [Akka docs](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-snapshot.html#snapshot-deletion). Snapshotting is useful even if events aren’t deleted as it speeds up recovery.

Deleting all events immediately when an entity has reached its terminal deleted state would have the consequence that Projections might not have consumed all previous events yet and will not be notified of the deleted event. Instead, it’s recommended to emit a final deleted event and store the fact that the entity is deleted separately via a Projection. Then a background task can clean up the events and snapshots for the deleted entities by using the [`EventSourcedCleanup`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html "akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup")[`EventSourcedCleanup`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/EventSourcedCleanup.html "akka.persistence.r2dbc.cleanup.scaladsl.EventSourcedCleanup") tool. The entity itself knows about the terminal state from the deleted event and should not emit further events after that and typically stop itself if it receives more commands.

[`EventSourcedCleanup`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html "akka.persistence.r2dbc.cleanup.javadsl.EventSourcedCleanup")[`EventSourcedCleanup`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/EventSourcedCleanup.html "akka.persistence.r2dbc.cleanup.scaladsl.EventSourcedCleanup") operations include:

- Delete all events and snapshots for one or many persistence ids
- Delete all events for one or many persistence ids
- Delete all snapshots for one or many persistence ids
- Delete events before snapshot for one or many persistence ids
- Delete events before a timestamp

Warning
When running an operation with `EventSourcedCleanup` that deletes all events for a persistence id, the actor with that persistence id must not be running! If the actor is restarted it would in that case be recovered to the wrong state since the stored events have been deleted. Delete events before snapshot can still be used while the actor is running.

The cleanup tool can be combined with the [query plugin](query.html) which has a query to get all persistence ids.

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/cleanup/CleanupDocExample.java#L21-L35 "Go to snippet source")CurrentPersistenceIdsQuery queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(CurrentPersistenceIdsQuery.class, R2dbcReadJournal.Identifier());
EventSourcedCleanup cleanup = new EventSourcedCleanup(system);

int persistenceIdParallelism = 10;

// forall persistence ids, delete all events before the snapshot
queries
    .currentPersistenceIds()
    .mapAsync(
        persistenceIdParallelism,
        pid -> FutureConverters.asJava(cleanup.cleanupBeforeSnapshot(pid)))
    .run(system);

```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/cleanup/CleanupDocExample.scala#L9-L32 "Go to snippet source")import akka.persistence.query.PersistenceQuery
import akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery
import akka.persistence.r2dbc.cleanup.scaladsl.EventSourcedCleanup
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal

val queries = PersistenceQuery(system).readJournalFor[CurrentPersistenceIdsQuery](R2dbcReadJournal.Identifier)
val cleanup = new EventSourcedCleanup(system)

//  how many persistence ids to operate on in parallel
val persistenceIdParallelism = 10

// forall persistence ids, delete all events before the snapshot
queries
  .currentPersistenceIds()
  .mapAsync(persistenceIdParallelism)(pid => cleanup.cleanupBeforeSnapshot(pid))
  .run()

```

## Durable State cleanup tool

[`DurableStateCleanup`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/DurableStateCleanup.html "akka.persistence.r2dbc.cleanup.javadsl.DurableStateCleanup")[`DurableStateCleanup`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html "akka.persistence.r2dbc.cleanup.scaladsl.DurableStateCleanup") operations include:

- Delete state for one or many persistence ids

Warning
When running any operation with `DurableStateCleanup` for a persistence id, the actor with that persistence id must not be running! If the actor is restarted it would in that case be recovered to the wrong state since the stored state hase been deleted.

The cleanup tool can be combined with the [query plugin](query.html) which has a query to get all persistence ids.

## Code Examples

### Example 1: Event Sourced cleanup tool

```java
CurrentPersistenceIdsQuery queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(CurrentPersistenceIdsQuery.class, R2dbcReadJournal.Identifier());
EventSourcedCleanup cleanup = new EventSourcedCleanup(system);

int persistenceIdParallelism = 10;

// forall persistence ids, delete all events before the snapshot
queries
    .currentPersistenceIds()
    .mapAsync(
        persistenceIdParallelism,
        pid -> FutureConverters.asJava(cleanup.cleanupBeforeSnapshot(pid)))
    .run(system);
```

### Example 2: Event Sourced cleanup tool

```scala
import akka.persistence.query.PersistenceQuery
import akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery
import akka.persistence.r2dbc.cleanup.scaladsl.EventSourcedCleanup
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal

val queries = PersistenceQuery(system).readJournalFor[CurrentPersistenceIdsQuery](R2dbcReadJournal.Identifier)
val cleanup = new EventSourcedCleanup(system)

//  how many persistence ids to operate on in parallel
val persistenceIdParallelism = 10

// forall persistence ids, delete all events before the snapshot
queries
  .currentPersistenceIds()
  .mapAsync(persistenceIdParallelism)(pid => cleanup.cleanupBeforeSnapshot(pid))
  .run()
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/DurableStateCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/javadsl/EventSourcedCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/DurableStateCleanup.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/cleanup/scaladsl/EventSourcedCleanup.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence-snapshot.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/data-partition.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/migration.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/cleanup.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/cleanup.html)*