---
description: A plugin for storing events in an event journal akka-persistence-jdbc
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:59:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-jdbc/current/query.html
title: Persistence Query • Akka Persistence JDBC
---

# Persistence Query • Akka Persistence JDBC

> **Summary:** A plugin for storing events in an event journal akka-persistence-jdbc

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Persistence Query

## How to get the ReadJournal

The `ReadJournal` is retrieved via the `akka.persistence.query.PersistenceQuery` extension:

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/ScaladslSnippets.scala#L30-L34 "Go to snippet source")import akka.persistence.query.PersistenceQuery
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/JavadslSnippets.java#L15-L53 "Go to snippet source")import akka.persistence.query.*;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

final JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());
```

## Persistence Query Plugin

The plugin supports the following queries:

## AllPersistenceIdsQuery and CurrentPersistenceIdsQuery

`allPersistenceIds` and `currentPersistenceIds` are used for retrieving all persistenceIds of all persistent actors.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/ScaladslSnippets.scala#L42-L51 "Go to snippet source")import akka.stream.scaladsl.Source
import akka.persistence.query.PersistenceQuery
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val willNotCompleteTheStream: Source[String, NotUsed] = readJournal.persistenceIds()

val willCompleteTheStream: Source[String, NotUsed] = readJournal.currentPersistenceIds()
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/JavadslSnippets.java#L19-L68 "Go to snippet source")import akka.stream.javadsl.Source;
import akka.persistence.query.PersistenceQuery;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());

Source<String, NotUsed> willNotCompleteTheStream = readJournal.persistenceIds();

Source<String, NotUsed> willCompleteTheStream = readJournal.currentPersistenceIds();
```

The returned event stream is unordered and you can expect different order for multiple executions of the query.

When using the `persistenceIds` query, the stream is not completed when it reaches the end of the currently used persistenceIds, but it continues to push new persistenceIds when new persistent actors are created.

When using the `currentPersistenceIds` query, the stream is completed when the end of the current list of persistenceIds is reached, thus it is not a `live` query.

The stream is completed with failure if there is a failure in executing the query in the backend journal.

## EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

`eventsByPersistenceId` and `currentEventsByPersistenceId` is used for retrieving events for a specific PersistentActor identified by persistenceId.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/ScaladslSnippets.scala#L59-L70 "Go to snippet source")import akka.stream.scaladsl.Source
import akka.persistence.query.{ EventEnvelope, PersistenceQuery }
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val willNotCompleteTheStream: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByPersistenceId("some-persistence-id", 0L, Long.MaxValue)

val willCompleteTheStream: Source[EventEnvelope, NotUsed] =
  readJournal.currentEventsByPersistenceId("some-persistence-id", 0L, Long.MaxValue)
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/JavadslSnippets.java#L24-L85 "Go to snippet source")import akka.stream.javadsl.Source;
import akka.persistence.query.PersistenceQuery;
import akka.persistence.query.EventEnvelope;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());

Source<EventEnvelope, NotUsed> willNotCompleteTheStream =
    readJournal.eventsByPersistenceId("some-persistence-id", 0L, Long.MAX_VALUE);

Source<EventEnvelope, NotUsed> willCompleteTheStream =
    readJournal.currentEventsByPersistenceId("some-persistence-id", 0L, Long.MAX_VALUE);
```

You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr` or use `0L` and `Long.MaxValue` respectively to retrieve all events. Note that the corresponding sequence number of each event is provided in the `EventEnvelope`, which makes it possible to resume the stream at a later point from a given sequence number.

The returned event stream is ordered by sequence number, i.e. the same order as the PersistentActor persisted the events. The same prefix of stream elements (in same order) are returned for multiple executions of the query, except for when events have been deleted.

The stream is completed with failure if there is a failure in executing the query in the backend journal.

## EventsByTag and CurrentEventsByTag

`eventsByTag` and `currentEventsByTag` are used for retrieving events that were marked with a given `tag`, e.g. all domain events of an Aggregate Root type.

Scala

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/scala/akka/persistence/jdbc/ScaladslSnippets.scala#L77-L86 "Go to snippet source")import akka.stream.scaladsl.Source
import akka.persistence.query.{ EventEnvelope, PersistenceQuery }
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val willNotCompleteTheStream: Source[EventEnvelope, NotUsed] = readJournal.eventsByTag("apple", 0L)

val willCompleteTheStream: Source[EventEnvelope, NotUsed] = readJournal.currentEventsByTag("apple", 0L)
```

Java

```
[source](https://github.com/akka/akka-persistence-jdbc/tree/master/core/src/test/java/akka/persistence/jdbc/JavadslSnippets.java#L30-L101 "Go to snippet source")import akka.stream.javadsl.Source;
import akka.persistence.query.PersistenceQuery;
import akka.persistence.query.EventEnvelope;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());

Source<EventEnvelope, NotUsed> willNotCompleteTheStream =
    readJournal.eventsByTag("apple", Offset.sequence(0L));

Source<EventEnvelope, NotUsed> willCompleteTheStream =
    readJournal.currentEventsByTag("apple", Offset.sequence(0L));
```

## Code Examples

### Example 1: How to get the ReadJournal

```scala
import akka.persistence.query.PersistenceQuery
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)
```

### Example 2: How to get the ReadJournal

```java
import akka.persistence.query.*;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

final JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());
```

### Example 3: AllPersistenceIdsQuery and CurrentPersistenceIdsQuery

```scala
import akka.stream.scaladsl.Source
import akka.persistence.query.PersistenceQuery
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val willNotCompleteTheStream: Source[String, NotUsed] = readJournal.persistenceIds()

val willCompleteTheStream: Source[String, NotUsed] = readJournal.currentPersistenceIds()
```

### Example 4: AllPersistenceIdsQuery and CurrentPersistenceIdsQuery

```java
import akka.stream.javadsl.Source;
import akka.persistence.query.PersistenceQuery;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());

Source<String, NotUsed> willNotCompleteTheStream = readJournal.persistenceIds();

Source<String, NotUsed> willCompleteTheStream = readJournal.currentPersistenceIds();
```

### Example 5: EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

```scala
import akka.stream.scaladsl.Source
import akka.persistence.query.{ EventEnvelope, PersistenceQuery }
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val willNotCompleteTheStream: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByPersistenceId("some-persistence-id", 0L, Long.MaxValue)

val willCompleteTheStream: Source[EventEnvelope, NotUsed] =
  readJournal.currentEventsByPersistenceId("some-persistence-id", 0L, Long.MaxValue)
```

### Example 6: EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

```java
import akka.stream.javadsl.Source;
import akka.persistence.query.PersistenceQuery;
import akka.persistence.query.EventEnvelope;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());

Source<EventEnvelope, NotUsed> willNotCompleteTheStream =
    readJournal.eventsByPersistenceId("some-persistence-id", 0L, Long.MAX_VALUE);

Source<EventEnvelope, NotUsed> willCompleteTheStream =
    readJournal.currentEventsByPersistenceId("some-persistence-id", 0L, Long.MAX_VALUE);
```

### Example 7: EventsByTag and CurrentEventsByTag

```scala
import akka.stream.scaladsl.Source
import akka.persistence.query.{ EventEnvelope, PersistenceQuery }
import akka.persistence.jdbc.query.scaladsl.JdbcReadJournal

val readJournal: JdbcReadJournal =
  PersistenceQuery(system).readJournalFor[JdbcReadJournal](JdbcReadJournal.Identifier)

val willNotCompleteTheStream: Source[EventEnvelope, NotUsed] = readJournal.eventsByTag("apple", 0L)

val willCompleteTheStream: Source[EventEnvelope, NotUsed] = readJournal.currentEventsByTag("apple", 0L)
```

### Example 8: EventsByTag and CurrentEventsByTag

```java
import akka.stream.javadsl.Source;
import akka.persistence.query.PersistenceQuery;
import akka.persistence.query.EventEnvelope;
import akka.persistence.jdbc.query.javadsl.JdbcReadJournal;

JdbcReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(JdbcReadJournal.class, JdbcReadJournal.Identifier());

Source<EventEnvelope, NotUsed> willNotCompleteTheStream =
    readJournal.eventsByTag("apple", Offset.sequence(0L));

Source<EventEnvelope, NotUsed> willCompleteTheStream =
    readJournal.currentEventsByTag("apple", Offset.sequence(0L));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/custom-dao.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/migration.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-jdbc/current/query.html](https://doc.akka.io/libraries/akka-persistence-jdbc/current/query.html)*