---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:18:19Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/persistence-query-leveldb.html
title: Persistence Query for LevelDB • Akka core
---

# Persistence Query for LevelDB • Akka core

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Persistence Query for LevelDB

The LevelDB journal and query plugin is deprecated and it is not advised to build new applications with it. As a replacement we recommend using [Akka Persistence JDBC](https://doc.akka.io/libraries/akka-persistence-jdbc/current/index.html).

## Dependency

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

To use Persistence Query, you must add the following dependency in your project:

sbt
```
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}"
}
```

This will also add dependency on the [akka\-persistence](persistence.html) module.

## Introduction

This is documentation for the LevelDB implementation of the [Persistence Query](persistence-query.html) API. Note that implementations for other journals may have different semantics.

## How to get the ReadJournal

The `ReadJournal` is retrieved via the `akka.persistence.query.PersistenceQuery` extension:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/LeveldbPersistenceQueryDocSpec.scala#L45-L48 "Go to snippet source")import akka.persistence.query.PersistenceQuery
import akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal

val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/query/LeveldbPersistenceQueryDocTest.java#L25-L27 "Go to snippet source")LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());
```

## Supported Queries

### EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

`eventsByPersistenceId` is used for retrieving events for a specific `PersistentActor` identified by `persistenceId`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/LeveldbPersistenceQueryDocSpec.scala#L54-L59 "Go to snippet source")val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)

val src: Source[EventEnvelope, NotUsed] =
  queries.eventsByPersistenceId("some-persistence-id", 0L, Long.MaxValue)

val events: Source[Any, NotUsed] = src.map(_.event)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/query/LeveldbPersistenceQueryDocTest.java#L33-L38 "Go to snippet source")LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());

Source<EventEnvelope, NotUsed> source =
    queries.eventsByPersistenceId("some-persistence-id", 0, Long.MAX_VALUE);
```

You can retrieve a subset of all events by specifying `fromSequenceNr` and `toSequenceNr` or use `0L` and `Long.MaxValue``Long.MAX_VALUE` respectively to retrieve all events. Note that the corresponding sequence number of each event is provided in the `EventEnvelope`, which makes it possible to resume the stream at a later point from a given sequence number.

The returned event stream is ordered by sequence number, i.e. the same order as the `PersistentActor` persisted the events. The same prefix of stream elements (in same order) are returned for multiple executions of the query, except for when events have been deleted.

The stream is not completed when it reaches the end of the currently stored events, but it continues to push new events when new events are persisted. Corresponding query that is completed when it reaches the end of the currently stored events is provided by `currentEventsByPersistenceId`.

The LevelDB write journal is notifying the query side as soon as events are persisted, but for efficiency reasons the query side retrieves the events in batches that sometimes can be delayed up to the configured `refresh-interval` or given `RefreshInterval` hint.

The stream is completed with failure if there is a failure in executing the query in the backend journal.

### PersistenceIdsQuery and CurrentPersistenceIdsQuery

`persistenceIds` is used for retrieving all `persistenceIds` of all persistent actors.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/LeveldbPersistenceQueryDocSpec.scala#L65-L67 "Go to snippet source")val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)

val src: Source[String, NotUsed] = queries.persistenceIds()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/query/LeveldbPersistenceQueryDocTest.java#L44-L48 "Go to snippet source")LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());

Source<String, NotUsed> source = queries.persistenceIds();
```

The returned event stream is unordered and you can expect different order for multiple executions of the query.

The stream is not completed when it reaches the end of the currently used *persistenceIds*, but it continues to push new *persistenceIds* when new persistent actors are created. Corresponding query that is completed when it reaches the end of the currently used *persistenceIds* is provided by `currentPersistenceIds`.

The LevelDB write journal is notifying the query side as soon as new `persistenceIds` are created and there is no periodic polling or batching involved in this query.

The stream is completed with failure if there is a failure in executing the query in the backend journal.

### EventsByTag and CurrentEventsByTag

`eventsByTag` is used for retrieving events that were marked with a given tag, e.g. all domain events of an Aggregate Root type.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/LeveldbPersistenceQueryDocSpec.scala#L73-L76 "Go to snippet source")val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)

val src: Source[EventEnvelope, NotUsed] =
  queries.eventsByTag(tag = "green", offset = Sequence(0L))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/query/LeveldbPersistenceQueryDocTest.java#L54-L58 "Go to snippet source")LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());

Source<EventEnvelope, NotUsed> source = queries.eventsByTag("green", new Sequence(0L));
```

To tag events you create an [Event Adapters](persistence.html#event-adapters) that wraps the events in a `akka.persistence.journal.Tagged` with the given `tags`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/LeveldbPersistenceQueryDocSpec.scala#L17-L33 "Go to snippet source")import akka.persistence.journal.WriteEventAdapter
import akka.persistence.journal.Tagged

class MyTaggingEventAdapter extends WriteEventAdapter {
  val colors = Set("green", "black", "blue")
  override def toJournal(event: Any): Any = event match {
    case s: String =>
      val tags = colors.foldLeft(Set.empty[String]) { (acc, c) =>
        if (s.contains(c)) acc + c else acc
      }
      if (tags.isEmpty) event
      else Tagged(event, tags)
    case _ => event
  }

  override def manifest(event: Any): String = ""
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/query/LeveldbPersistenceQueryDocTest.java#L64-L85 "Go to snippet source")static class MyTaggingEventAdapter implements WriteEventAdapter {

  @Override
  public Object toJournal(Object event) {
    if (event instanceof String) {
      String s = (String) event;
      Set<String> tags = new HashSet<String>();
      if (s.contains("green")) tags.add("green");
      if (s.contains("black")) tags.add("black");
      if (s.contains("blue")) tags.add("blue");
      if (tags.isEmpty()) return event;
      else return new Tagged(event, tags);
    } else {
      return event;
    }
  }

  @Override
  public String manifest(Object event) {
    return "";
  }
}
```

You can use `NoOffset` to retrieve all events with a given tag or retrieve a subset of all events by specifying a `Sequence` `offset`. The `offset` corresponds to an ordered sequence number for the specific tag. Note that the corresponding offset of each event is provided in the `EventEnvelope`, which makes it possible to resume the stream at a later point from a given offset.

The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included in the returned stream. This means that you can use the offset that is returned in `EventEnvelope` as the `offset` parameter in a subsequent query.

In addition to the `offset` the `EventEnvelope` also provides `persistenceId` and `sequenceNr` for each event. The `sequenceNr` is the sequence number for the persistent actor with the `persistenceId` that persisted the event. The `persistenceId` \+ `sequenceNr` is an unique identifier for the event.

The returned event stream is ordered by the offset (tag sequence number), which corresponds to the same order as the write journal stored the events. The same stream elements (in same order) are returned for multiple executions of the query. Deleted events are not deleted from the tagged event stream.

Note
Events deleted using `deleteMessages(toSequenceNr)` are not deleted from the “tagged stream”.

The stream is not completed when it reaches the end of the currently stored events, but it continues to push new events when new events are persisted. Corresponding query that is completed when it reaches the end of the currently stored events is provided by `currentEventsByTag`.

The LevelDB write journal is notifying the query side as soon as tagged events are persisted, but for efficiency reasons the query side retrieves the events in batches that sometimes can be delayed up to the configured `refresh-interval` or given `RefreshInterval` hint.

The stream is completed with failure if there is a failure in executing the query in the backend journal.

## Configuration

Configuration settings can be defined in the configuration section with the absolute path corresponding to the identifier, which is `"akka.persistence.query.journal.leveldb"` for the default `LeveldbReadJournal.Identifier`.

It can be configured with the following properties:

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-query/src/main/resources/reference.conf#L9-L28 "Go to snippet source")# Configuration for the LeveldbReadJournal
akka.persistence.query.journal.leveldb {
  # Implementation class of the LevelDB ReadJournalProvider
  class = "akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider"
  
  # Absolute path to the write journal plugin configuration entry that this 
  # query journal will connect to. That must be a LeveldbJournal or SharedLeveldbJournal.
  # If undefined (or "") it will connect to the default journal as specified by the
  # akka.persistence.journal.plugin property.
  write-plugin = ""
  
  # The LevelDB write journal is notifying the query side as soon as things
  # are persisted, but for efficiency reasons the query side retrieves the events 
  # in batches that sometimes can be delayed up to the configured `refresh-interval`.
  refresh-interval = 3s
  
  # How many events to fetch in one query (replay) and keep buffered until they
  # are delivered downstreams.
  max-buffer-size = 100
}
```

## Code Examples

### Example 1: Dependency

```scala
val AkkaVersion = "2.10.17"
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion
```

### Example 2: Dependency

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.typesafe.akka</groupId>
      <artifactId>akka-bom_${scala.binary.version}</artifactId>
      <version>2.10.17</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency&gt
  </dependencies>
</dependencyManagement>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation platform("com.typesafe.akka:akka-bom_${versions.ScalaBinary}:2.10.17")

  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}"
}
```

### Example 4: How to get the ReadJournal

```scala
import akka.persistence.query.PersistenceQuery
import akka.persistence.query.journal.leveldb.scaladsl.LeveldbReadJournal

val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)
```

### Example 5: How to get the ReadJournal

```java
LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());
```

### Example 6: EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

```scala
val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)

val src: Source[EventEnvelope, NotUsed] =
  queries.eventsByPersistenceId("some-persistence-id", 0L, Long.MaxValue)

val events: Source[Any, NotUsed] = src.map(_.event)
```

### Example 7: EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

```java
LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());

Source<EventEnvelope, NotUsed> source =
    queries.eventsByPersistenceId("some-persistence-id", 0, Long.MAX_VALUE);
```

### Example 8: PersistenceIdsQuery and CurrentPersistenceIdsQuery

```scala
val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)

val src: Source[String, NotUsed] = queries.persistenceIds()
```

### Example 9: PersistenceIdsQuery and CurrentPersistenceIdsQuery

```java
LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());

Source<String, NotUsed> source = queries.persistenceIds();
```

### Example 10: EventsByTag and CurrentEventsByTag

```scala
val queries = PersistenceQuery(system).readJournalFor[LeveldbReadJournal](LeveldbReadJournal.Identifier)

val src: Source[EventEnvelope, NotUsed] =
  queries.eventsByTag(tag = "green", offset = Sequence(0L))
```

### Example 11: EventsByTag and CurrentEventsByTag

```java
LeveldbReadJournal queries =
    PersistenceQuery.get(system)
        .getReadJournalFor(LeveldbReadJournal.class, LeveldbReadJournal.Identifier());

Source<EventEnvelope, NotUsed> source = queries.eventsByTag("green", new Sequence(0L));
```

### Example 12: EventsByTag and CurrentEventsByTag

```scala
import akka.persistence.journal.WriteEventAdapter
import akka.persistence.journal.Tagged

class MyTaggingEventAdapter extends WriteEventAdapter {
  val colors = Set("green", "black", "blue")
  override def toJournal(event: Any): Any = event match {
    case s: String =>
      val tags = colors.foldLeft(Set.empty[String]) { (acc, c) =>
        if (s.contains(c)) acc + c else acc
      }
      if (tags.isEmpty) event
      else Tagged(event, tags)
    case _ => event
  }

  override def manifest(event: Any): String = ""
}
```

### Example 13: EventsByTag and CurrentEventsByTag

```java
static class MyTaggingEventAdapter implements WriteEventAdapter {

  @Override
  public Object toJournal(Object event) {
    if (event instanceof String) {
      String s = (String) event;
      Set<String> tags = new HashSet<String>();
      if (s.contains("green")) tags.add("green");
      if (s.contains("black")) tags.add("black");
      if (s.contains("blue")) tags.add("blue");
      if (tags.isEmpty()) return event;
      else return new Tagged(event, tags);
    } else {
      return event;
    }
  }

  @Override
  public String manifest(Object event) {
    return "";
  }
}
```

### Example 14: Configuration

```conf
# Configuration for the LeveldbReadJournal
akka.persistence.query.journal.leveldb {
  # Implementation class of the LevelDB ReadJournalProvider
  class = "akka.persistence.query.journal.leveldb.LeveldbReadJournalProvider"
  
  # Absolute path to the write journal plugin configuration entry that this 
  # query journal will connect to. That must be a LeveldbJournal or SharedLeveldbJournal.
  # If undefined (or "") it will connect to the default journal as specified by the
  # akka.persistence.journal.plugin property.
  write-plugin = ""
  
  # The LevelDB write journal is notifying the query side as soon as things
  # are persisted, but for efficiency reasons the query side retrieves the events 
  # in batches that sometimes can be delayed up to the configured `refresh-interval`.
  refresh-interval = 3s
  
  # How many events to fetch in one query (replay) and keep buffered until they
  # are delivered downstreams.
  max-buffer-size = 100
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/libraries/akka-core/2.10/persistence-plugins.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/index.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.10/persistence-query-leveldb.html](https://doc.akka.io/libraries/akka-core/2.10/persistence-query-leveldb.html)*