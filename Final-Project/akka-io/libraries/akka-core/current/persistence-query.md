---
description: Query side to Akka Persistence allowing for building CQRS applications.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:22:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/persistence-query.html
title: Persistence Query • Akka core
---

# Persistence Query • Akka core

> **Summary:** Query side to Akka Persistence allowing for building CQRS applications.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Persistence Query

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

This will also add dependency on the [Akka Persistence](persistence.html) module.

## Introduction

Akka persistence query complements [Event Sourcing](typed/persistence.html) by providing a universal asynchronous stream based query interface that various journal plugins can implement in order to expose their query capabilities.

The most typical use case of persistence query is implementing the so\-called query side (also known as “read side”) in the popular CQRS architecture pattern \- in which the writing side of the application (e.g. implemented using Akka persistence) is completely separated from the “query side”. Akka Persistence Query itself is *not* directly the query side of an application, however it can help to migrate data from the write side to the query side database. In very simple scenarios Persistence Query may be powerful enough to fulfill the query needs of your app, however we highly recommend (in the spirit of CQRS) of splitting up the write/read sides into separate datastores as the need arises.

For a similar implementation of query interface to [Durable State Behaviors](typed/durable-state/persistence.html) please refer to [Persistence Query using Durable State](durable-state/persistence-query.html).

The [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) explains how to implement an Event Sourced CQRS application with Akka Persistence and Akka Projections.

## Design overview

Akka persistence query is purposely designed to be a very loosely specified API. This is in order to keep the provided APIs general enough for each journal implementation to be able to expose its best features, e.g. a SQL journal can use complex SQL queries or if a journal is able to subscribe to a live event stream this should also be possible to expose the same API \- a typed stream of events.

**Each read journal must explicitly document which types of queries it supports.** Refer to your journal’s plugins documentation for details on which queries and semantics it supports.

While Akka Persistence Query does not provide actual implementations of ReadJournals, it defines a number of pre\-defined query types for the most common query scenarios, that most journals are likely to implement (however they are not required to).

## Read Journals

In order to issue queries one has to first obtain an instance of a [`ReadJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html "akka.persistence.query.javadsl.ReadJournal")[`ReadJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html "akka.persistence.query.scaladsl.ReadJournal"). Read journals are implemented as [Community plugins](https://akka.io/community/#plugins-to-akka-persistence-query), each targeting a specific datastore (for example Cassandra or JDBC databases). For example, given a library that provides a `akka.persistence.query.my-read-journal` obtaining the related journal is as simple as:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L189-L200 "Go to snippet source")// obtain read journal by plugin id
val readJournal =
  PersistenceQuery(system).readJournalFor[MyScaladslReadJournal]("akka.persistence.query.my-read-journal")

// issue query to journal
val source: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByPersistenceId("user-1337", 0, Long.MaxValue)

// materialize stream, consuming events
source.runForeach { event =>
  println("Event: " + event)
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L202-L213 "Go to snippet source")// obtain read journal by plugin id
final MyJavadslReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(
            MyJavadslReadJournal.class, "akka.persistence.query.my-read-journal");

// issue query to journal
Source<EventEnvelope, NotUsed> source =
    readJournal.eventsByPersistenceId("user-1337", 0, Long.MAX_VALUE);

// materialize stream, consuming events
source.runForeach(event -> System.out.println("Event: " + event), system);
```

Journal implementers are encouraged to put this identifier in a variable known to the user, such that one can access it via [`readJournalFor[NoopJournal](NoopJournal.identifier)`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/PersistenceQuery.html#readJournalFor[T%3C:akka.persistence.query.scaladsl.ReadJournal](readJournalPluginId:String):T "akka.persistence.query.PersistenceQuery")[`getJournalFor(NoopJournal.class, NoopJournal.identifier)`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html#getReadJournalFor(java.lang.Class,java.lang.String) "akka.persistence.query.PersistenceQuery"), however this is not enforced.

Read journal implementations are available as [Community plugins](https://akka.io/community/#plugins-to-akka-persistence-query).

### Predefined queries

Akka persistence query comes with a number of query interfaces built in and suggests Journal implementors to implement them according to the semantics described below. It is important to notice that while these query types are very common a journal is not obliged to implement all of them \- for example because in a given journal such query would be significantly inefficient.

Note
Refer to the documentation of the [`ReadJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html "akka.persistence.query.javadsl.ReadJournal")[`ReadJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html "akka.persistence.query.scaladsl.ReadJournal") plugin you are using for a specific list of supported query types. For example, Journal plugins should document their stream completion strategies.

The predefined queries are:

#### PersistenceIdsQuery and CurrentPersistenceIdsQuery

[`persistenceIds`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/PersistenceIdsQuery.html "akka.persistence.query.javadsl.PersistenceIdsQuery")[`persistenceIds`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/PersistenceIdsQuery.html "akka.persistence.query.scaladsl.PersistenceIdsQuery") which is designed to allow users to subscribe to a stream of all persistent ids in the system. By default this stream should be assumed to be a “live” stream, which means that the journal should keep emitting new persistence ids as they come into the system:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L204 "Go to snippet source")readJournal.persistenceIds()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L224 "Go to snippet source")readJournal.persistenceIds();
```

If your usage does not require a live stream, you can use the [`currentPersistenceIds`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html "akka.persistence.query.javadsl.CurrentPersistenceIdsQuery")[`currentPersistenceIds`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html "akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery") query:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L208 "Go to snippet source")readJournal.currentPersistenceIds()
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L237 "Go to snippet source")readJournal.currentPersistenceIds();
```

#### EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

[`eventsByPersistenceId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html "akka.persistence.query.javadsl.EventsByPersistenceIdQuery")[`eventsByPersistenceId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html "akka.persistence.query.scaladsl.EventsByPersistenceIdQuery") is a query equivalent to replaying an [event sourced actor](typed/persistence.html#event-sourcing-concepts), however, since it is a stream it is possible to keep it alive and watch for additional incoming events persisted by the persistent actor identified by the given `persistenceId`.

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L232-L233 "Go to snippet source")readJournal.eventsByPersistenceId("user-us-1337", fromSequenceNr = 0L, toSequenceNr = Long.MaxValue)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L250 "Go to snippet source")readJournal.eventsByPersistenceId("user-us-1337", 0L, Long.MAX_VALUE);
```

Most journals will have to revert to polling in order to achieve this, which can typically be configured with a `refresh-interval` configuration property.

If your usage does not require a live stream, you can use the [`currentEventsByPersistenceId`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html "akka.persistence.query.javadsl.CurrentEventsByPersistenceIdQuery")[`currentEventsByPersistenceId`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html "akka.persistence.query.scaladsl.CurrentEventsByPersistenceIdQuery") query.

#### EventsByTag and CurrentEventsByTag

[`eventsByTag`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html "akka.persistence.query.javadsl.EventsByTagQuery")[`eventsByTag`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html "akka.persistence.query.scaladsl.EventsByTagQuery") allows querying events regardless of which `persistenceId` they are associated with. This query is hard to implement in some journals or may need some additional preparation of the used data store to be executed efficiently. The goal of this query is to allow querying for all events which are “tagged” with a specific tag. That includes the use case to query all domain events of an Aggregate Root type. Please refer to your read journal plugin’s documentation to find out if and how it is supported.

Some journals may support [tagging of events](typed/persistence.html#tagging) or [Event Adapters](persistence.html#event-adapters) that wraps the events in a [`akka.persistence.journal.Tagged`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/Tagged.html "akka.persistence.journal.Tagged")[`akka.persistence.journal.Tagged`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html "akka.persistence.journal.Tagged") with the given `tags`. The journal may support other ways of doing tagging \- again, how exactly this is implemented depends on the used journal. Here is an example of such a tagging with an [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html "akka.persistence.typed.scaladsl.EventSourcedBehavior"):

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/scala/docs/akka/persistence/typed/BasicPersistentBehaviorCompileOnly.scala#L164-L181 "Go to snippet source")val NumberOfEntityGroups = 10

def tagEvent(entityId: String, event: Event): Set[String] = {
  val entityGroup = s"group-${math.abs(entityId.hashCode % NumberOfEntityGroups)}"
  event match {
    case _: OrderCompleted => Set(entityGroup, "order-completed")
    case _                 => Set(entityGroup)
  }
}

def apply(entityId: String): Behavior[Command] = {
  EventSourcedBehavior[Command, Event, State](
    persistenceId = PersistenceId("ShoppingCart", entityId),
    emptyState = State(),
    commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
    eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
    .withTagger(event => tagEvent(entityId, event))
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-persistence-typed/src/test/java/jdocs/akka/persistence/typed/BasicPersistentBehaviorTest.java#L462-L473 "Go to snippet source")private final String entityId;

public static final int NUMBER_OF_ENTITY_GROUPS = 10;

@Override
public Set<String> tagsFor(Event event) {
  String entityGroup = "group-" + Math.abs(entityId.hashCode() % NUMBER_OF_ENTITY_GROUPS);
  Set<String> tags = new HashSet<>();
  tags.add(entityGroup);
  if (event instanceof OrderCompleted) tags.add("order-completed");
  return tags;
}
```

Note
A very important thing to keep in mind when using queries spanning multiple persistenceIds, such as [`EventsByTag`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html "akka.persistence.query.javadsl.EventsByTagQuery")[`EventsByTag`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html "akka.persistence.query.scaladsl.EventsByTagQuery") is that the order of events at which the events appear in the stream rarely is guaranteed (or stable between materializations).

Journals *may* choose to opt for strict ordering of the events, and should then document explicitly what kind of ordering guarantee they provide \- for example “*ordered by timestamp ascending, independently of persistenceId*” is easy to achieve on relational databases, yet may be hard to implement efficiently on plain key\-value datastores.

In the example below we query all events which have been tagged (we assume this was performed by the write\-side using [tagging of events](typed/persistence.html#tagging) or [Event Adapters](persistence.html#event-adapters), or that the journal is smart enough that it can figure out what we mean by this tag \- for example if the journal stored the events as json it may try to find those with the field `tag` set to this value etc.).

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L214-L228 "Go to snippet source")// assuming journal is able to work with numeric offsets we can:

val completedOrders: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByTag("order-completed", Offset.noOffset)

// find first 10 completed orders:
val firstCompleted: Future[Vector[OrderCompleted]] =
  completedOrders
    .map(_.event)
    .collectType[OrderCompleted]
    .take(10) // cancels the query stream after pulling 10 elements
    .runFold(Vector.empty[OrderCompleted])(_ :+ _)

// start another query, from the known offset
val furtherOrders = readJournal.eventsByTag("order-completed", offset = Sequence(10))
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L263-L283 "Go to snippet source")// assuming journal is able to work with numeric offsets we can:
final Source<EventEnvelope, NotUsed> completedOrders =
    readJournal.eventsByTag("order-completed", new Sequence(0L));

// find first 10 completed orders:
final CompletionStage<List<OrderCompleted>> firstCompleted =
    completedOrders
        .map(EventEnvelope::event)
        .collectType(OrderCompleted.class)
        .take(10) // cancels the query stream after pulling 10 elements
        .runFold(
            new ArrayList<>(10),
            (acc, e) -> {
              acc.add(e);
              return acc;
            },
            system);

// start another query, from the known offset
Source<EventEnvelope, NotUsed> furtherOrders =
    readJournal.eventsByTag("order-completed", new Sequence(10));
```

As you can see, we can use all the usual stream operators available from [Streams](stream/index.html) on the resulting query stream, including for example taking the first 10 and cancelling the stream. It is worth pointing out that the built\-in `EventsByTag` query has an optionally supported offset parameter (of type `Long`) which the journals can use to implement resumable\-streams. For example a journal may be able to use a WHERE clause to begin the read starting from a specific row, or in a datastore that is able to order events by insertion time it could treat the Long as a timestamp and select only older events.

If your usage does not require a live stream, you can use the [`currentEventsByTag`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html "akka.persistence.query.javadsl.CurrentEventsByTagQuery")[`currentEventsByTag`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html "akka.persistence.query.scaladsl.CurrentEventsByTagQuery") query.

#### EventsBySlice and CurrentEventsBySlice

Query events for given entity type and slices. A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all persistence ids over the slices.

See [`EventsBySliceQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html "akka.persistence.query.typed.javadsl.EventsBySliceQuery")[`EventsBySliceQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html "akka.persistence.query.typed.scaladsl.EventsBySliceQuery") and [`CurrentEventsBySliceQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html "akka.persistence.query.typed.javadsl.CurrentEventsBySliceQuery")[`CurrentEventsBySliceQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html "akka.persistence.query.typed.scaladsl.CurrentEventsBySliceQuery").

A variation of these are [`EventsBySliceStartingFromSnapshotsQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html "akka.persistence.query.typed.javadsl.EventsBySliceStartingFromSnapshotsQuery")[`EventsBySliceStartingFromSnapshotsQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html "akka.persistence.query.typed.scaladsl.EventsBySliceStartingFromSnapshotsQuery") and [`CurrentEventsBySliceStartingFromSnapshotsQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html "akka.persistence.query.typed.javadsl.CurrentEventsBySliceStartingFromSnapshotsQuery")[`CurrentEventsBySliceStartingFromSnapshotsQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html "akka.persistence.query.typed.scaladsl.CurrentEventsBySliceStartingFromSnapshotsQuery").

[`EventsBySliceFirehoseQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html "akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery")[`EventsBySliceFirehoseQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html "akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery") can give better scalability when many consumers retrieve the same events, for example many Projections of the same entity type. The purpose is to share the stream of events from the database and fan out to connected consumer streams. Thereby fewer queries and loading of events from the database. It is typically used together with [Sharded Daemon Process with colocated processes](typed/cluster-sharded-daemon-process.html#colocate-processes).

### Materialized values of queries

Journals are able to provide additional information related to a query by exposing [Materialized values](stream/stream-quickstart.html#materialized-values-quick), which are a feature of [Streams](stream/index.html) that allows to expose additional values at stream materialization time.

More advanced query journals may use this technique to expose information about the character of the materialized stream, for example if it’s finite or infinite, strictly ordered or not ordered at all. The materialized value type is defined as the second type parameter of the returned [`Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source"), which allows journals to provide users with their specialised query object, as demonstrated in the sample below:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L30-L33 "Go to snippet source")final case class RichEvent(tags: Set[String], payload: Any)

// a plugin can provide:
case class QueryMetadata(deterministicOrder: Boolean, infinite: Boolean)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L31-L53 "Go to snippet source")static class RichEvent {
  public final Set<String> tags;
  public final Object payload;

  public RichEvent(Set<String> tags, Object payload) {
    this.tags = tags;
    this.payload = payload;
  }
}
// a plugin can provide:
static final class QueryMetadata {
  public final boolean deterministicOrder;
  public final boolean infinite;

  public QueryMetadata(boolean deterministicOrder, boolean infinite) {
    this.deterministicOrder = deterministicOrder;
    this.infinite = infinite;
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L99 "Go to snippet source")def byTagsWithMeta(tags: Set[String]): Source[RichEvent, QueryMetadata] = {
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L141 "Go to snippet source")public Source<RichEvent, QueryMetadata> byTagsWithMeta(Set<String> tags) {
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L237-L251 "Go to snippet source")val query: Source[RichEvent, QueryMetadata] =
  readJournal.byTagsWithMeta(Set("red", "blue"))

query
  .mapMaterializedValue { meta =>
    println(
      s"The query is: " +
      s"ordered deterministically: ${meta.deterministicOrder}, " +
      s"infinite: ${meta.infinite}")
  }
  .map { event =>
    println(s"Event payload: ${event.payload}")
  }
  .runWith(Sink.ignore)

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L296-L322 "Go to snippet source")  
Set<String> tags = new HashSet<String>();
tags.add("red");
tags.add("blue");
final Source<RichEvent, QueryMetadata> events =
    readJournal
        .byTagsWithMeta(tags)
        .mapMaterializedValue(
            meta -> {
              System.out.println(
                  "The query is: "
                      + "ordered deterministically: "
                      + meta.deterministicOrder
                      + " "
                      + "infinite: "
                      + meta.infinite);
              return meta;
            });

events
    .map(
        event -> {
          System.out.println("Event payload: " + event.payload);
          return event.payload;
        })
    .runWith(Sink.ignore(), system);

```

## Performance and denormalization

When building systems using [Event Sourcing](typed/persistence.html#event-sourcing-concepts) and CQRS ([Command \& Query Responsibility Segregation](https://docs.microsoft.com/en-us/previous-versions/msp-n-p/jj554200%28v=pandp.10%29)) techniques it is tremendously important to realise that the write\-side has completely different needs from the read\-side, and separating those concerns into datastores that are optimised for either side makes it possible to offer the best experience for the write and read sides independently.

For example, in a bidding system it is important to “take the write” and respond to the bidder that we have accepted the bid as soon as possible, which means that write\-throughput is of highest importance for the write\-side – often this means that data stores which are able to scale to accommodate these requirements have a less expressive query side.

On the other hand the same application may have some complex statistics view or we may have analysts working with the data to figure out best bidding strategies and trends – this often requires some kind of expressive query capabilities like for example SQL or writing Spark jobs to analyse the data. Therefore the data stored in the write\-side needs to be projected into the other read\-optimised datastore.

Note
When referring to **Materialized Views** in Akka Persistence think of it as “some persistent storage of the result of a Query”. In other words, it means that the view is created once, in order to be afterwards queried multiple times, as in this format it may be more efficient or interesting to query it (instead of the source events directly).

### Materialize view to Reactive Streams compatible datastore

If the read datastore exposes a [Reactive Streams](https://www.reactive-streams.org) interface then implementing a simple projection is as simple as, using the read\-journal and feeding it into the databases driver interface, for example like so:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L156-L169 "Go to snippet source")implicit val system: ActorSystem = ActorSystem()

val readJournal =
  PersistenceQuery(system).readJournalFor[MyScaladslReadJournal](JournalId)
val dbBatchWriter: Subscriber[immutable.Seq[Any]] =
  ReactiveStreamsCompatibleDBDriver.batchWriter

// Using an example (Reactive Streams) Database driver
readJournal
  .eventsByPersistenceId("user-1337", fromSequenceNr = 0L, toSequenceNr = Long.MaxValue)
  .map(envelope => envelope.event)
  .map(convertToReadSideTypes) // convert to datatype
  .grouped(20) // batch inserts into groups of 20
  .runWith(Sink.fromSubscriber(dbBatchWriter)) // write batches to read-side database
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L341-L349 "Go to snippet source")final ReactiveStreamsCompatibleDBDriver driver = new ReactiveStreamsCompatibleDBDriver();
final Subscriber<List<Object>> dbBatchWriter = driver.batchWriter();

// Using an example (Reactive Streams) Database driver
readJournal
    .eventsByPersistenceId("user-1337", 0L, Long.MAX_VALUE)
    .map(envelope -> envelope.event())
    .grouped(20) // batch inserts into groups of 20
    .runWith(Sink.fromSubscriber(dbBatchWriter), system); // write batches to read-side database
```

### Materialize view using mapAsync

If the target database does not provide a reactive streams `Subscriber` that can perform writes, you may have to implement the write logic using plain functions or Actors instead.

In case your write logic is state\-less and you need to convert the events from one data type to another before writing into the alternative datastore, then the projection will look like this:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L267-L269 "Go to snippet source")trait ExampleStore {
  def save(event: Any): Future[Unit]
}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L354-L361 "Go to snippet source")static class ExampleStore {
  CompletionStage<Void> save(Object any) {
    // ...
  }
}
```

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L273-L280 "Go to snippet source")val store: ExampleStore = ???

readJournal
  .eventsByTag("bid", NoOffset)
  .mapAsync(1) { e =>
    store.save(e)
  }
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L373-L378 "Go to snippet source")final ExampleStore store = new ExampleStore();

readJournal
    .eventsByTag("bid", new Sequence(0L))
    .mapAsync(1, store::save)
    .runWith(Sink.ignore(), system);
```

### Resumable projections

Sometimes you may need to use “resumable” projections, which will not start from the beginning of time each time when run. In such case, the sequence number (or `offset`) of the processed event will be stored and used the next time this projection is started. This pattern is implemented in the [Akka Projections](https://doc.akka.io/libraries/akka-projection/current/) module.

## Query plugins

Query plugins are various (mostly community driven) [`ReadJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html "akka.persistence.query.javadsl.ReadJournal")[`ReadJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html "akka.persistence.query.scaladsl.ReadJournal") implementations for all kinds of available datastores. The complete list of available plugins is maintained on the Akka Persistence Query [Community Plugins](https://akka.io/community/#plugins-to-akka-persistence-query) page.

This section aims to provide tips and guide plugin developers through implementing a custom query plugin. Most users will not need to implement journals themselves, except if targeting a not yet supported datastore.

Note
Since different data stores provide different query capabilities journal plugins **must extensively document** their exposed semantics as well as handled query scenarios.

### ReadJournal plugin API

A read journal plugin must implement [`akka.persistence.query.ReadJournalProvider`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html "akka.persistence.query.ReadJournalProvider")[`akka.persistence.query.ReadJournalProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html "akka.persistence.query.ReadJournalProvider") which creates instances of [`akka.persistence.query.scaladsl.ReadJournal`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html "akka.persistence.query.scaladsl.ReadJournal") and [`akka.persistence.query.javadsl.ReadJournal`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html "akka.persistence.query.javadsl.ReadJournal"). The plugin must implement both the `scaladsl` and the `javadsl` traitsinterfaces because the [`akka.stream.scaladsl.Source`](https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") and [`akka.stream.javadsl.Source`](https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source") are different types and even though those types can be converted to each other it is most convenient for the end user to get access to the Java or Scala `Source` directly. As illustrated below one of the implementations can delegate to the other. 

Below is a simple journal implementation:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L37-L136 "Go to snippet source")class MyReadJournalProvider(system: ExtendedActorSystem, config: Config) extends ReadJournalProvider {

  private val readJournal: MyScaladslReadJournal =
    new MyScaladslReadJournal(system, config)

  override def scaladslReadJournal(): MyScaladslReadJournal =
    readJournal

  override def javadslReadJournal(): MyJavadslReadJournal =
    new MyJavadslReadJournal(readJournal)
}

class MyScaladslReadJournal(system: ExtendedActorSystem, config: Config)
    extends akka.persistence.query.scaladsl.ReadJournal
    with akka.persistence.query.scaladsl.EventsByTagQuery
    with akka.persistence.query.scaladsl.EventsByPersistenceIdQuery
    with akka.persistence.query.scaladsl.PersistenceIdsQuery
    with akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery {

  private val refreshInterval: FiniteDuration =
    config.getDuration("refresh-interval", MILLISECONDS).millis

  /**
   * You can use `NoOffset` to retrieve all events with a given tag or retrieve a subset of all
   * events by specifying a `Sequence` `offset`. The `offset` corresponds to an ordered sequence number for
   * the specific tag. Note that the corresponding offset of each event is provided in the
   * [[akka.persistence.query.EventEnvelope]], which makes it possible to resume the
   * stream at a later point from a given offset.
   *
   * The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
   * in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
   * as the `offset` parameter in a subsequent query.
   */
  override def eventsByTag(tag: String, offset: Offset): Source[EventEnvelope, NotUsed] = offset match {
    case Sequence(offsetValue) =>
      Source.fromGraph(new MyEventsByTagSource(tag, offsetValue, refreshInterval))
    case NoOffset => eventsByTag(tag, Sequence(0L)) //recursive
    case _ =>
      throw new IllegalArgumentException("MyJournal does not support " + offset.getClass.getName + " offsets")
  }

  override def eventsByPersistenceId(
      persistenceId: String,
      fromSequenceNr: Long,
      toSequenceNr: Long): Source[EventEnvelope, NotUsed] = {
    // implement in a similar way as eventsByTag
    ???
  }

  override def persistenceIds(): Source[String, NotUsed] = {
    // implement in a similar way as eventsByTag
    ???
  }

  override def currentPersistenceIds(): Source[String, NotUsed] = {
    // implement in a similar way as eventsByTag
    ???
  }

  // possibility to add more plugin specific queries

  def byTagsWithMeta(tags: Set[String]): Source[RichEvent, QueryMetadata] = {
    // implement in a similar way as eventsByTag
    ???
  }

}

class MyJavadslReadJournal(scaladslReadJournal: MyScaladslReadJournal)
    extends akka.persistence.query.javadsl.ReadJournal
    with akka.persistence.query.javadsl.EventsByTagQuery
    with akka.persistence.query.javadsl.EventsByPersistenceIdQuery
    with akka.persistence.query.javadsl.PersistenceIdsQuery
    with akka.persistence.query.javadsl.CurrentPersistenceIdsQuery {

  override def eventsByTag(tag: String, offset: Offset = Sequence(0L)): javadsl.Source[EventEnvelope, NotUsed] =
    scaladslReadJournal.eventsByTag(tag, offset).asJava

  override def eventsByPersistenceId(
      persistenceId: String,
      fromSequenceNr: Long = 0L,
      toSequenceNr: Long = Long.MaxValue): javadsl.Source[EventEnvelope, NotUsed] =
    scaladslReadJournal.eventsByPersistenceId(persistenceId, fromSequenceNr, toSequenceNr).asJava

  override def persistenceIds(): javadsl.Source[String, NotUsed] =
    scaladslReadJournal.persistenceIds().asJava

  override def currentPersistenceIds(): javadsl.Source[String, NotUsed] =
    scaladslReadJournal.currentPersistenceIds().asJava

  // possibility to add more plugin specific queries

  def byTagsWithMeta(tags: java.util.Set[String]): javadsl.Source[RichEvent, QueryMetadata] = {
    import scala.jdk.CollectionConverters._
    scaladslReadJournal.byTagsWithMeta(tags.asScala.toSet).asJava
  }
}

```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L60-L195 "Go to snippet source")static class MyReadJournalProvider implements ReadJournalProvider {
  private final MyJavadslReadJournal javadslReadJournal;

  public MyReadJournalProvider(ExtendedActorSystem system, Config config) {
    this.javadslReadJournal = new MyJavadslReadJournal(system, config);
  }

  @Override
  public MyScaladslReadJournal scaladslReadJournal() {
    return new MyScaladslReadJournal(javadslReadJournal);
  }

  @Override
  public MyJavadslReadJournal javadslReadJournal() {
    return this.javadslReadJournal;
  }
}
static class MyJavadslReadJournal
    implements akka.persistence.query.javadsl.ReadJournal,
        akka.persistence.query.javadsl.EventsByTagQuery,
        akka.persistence.query.javadsl.EventsByPersistenceIdQuery,
        akka.persistence.query.javadsl.PersistenceIdsQuery,
        akka.persistence.query.javadsl.CurrentPersistenceIdsQuery {

  private final Duration refreshInterval;
  private Connection conn;

  public MyJavadslReadJournal(ExtendedActorSystem system, Config config) {
    refreshInterval = config.getDuration("refresh-interval");
  }

  /**
   * You can use `NoOffset` to retrieve all events with a given tag or retrieve a subset of all
   * events by specifying a `Sequence` `offset`. The `offset` corresponds to an ordered sequence
   * number for the specific tag. Note that the corresponding offset of each event is provided in
   * the [[akka.persistence.query.EventEnvelope]], which makes it possible to resume the stream at
   * a later point from a given offset.
   *
   * <p>The `offset` is exclusive, i.e. the event with the exact same sequence number will not be
   * included in the returned stream. This means that you can use the offset that is returned in
   * `EventEnvelope` as the `offset` parameter in a subsequent query.
   */
  @Override
  public Source<EventEnvelope, NotUsed> eventsByTag(String tag, Offset offset) {
    if (offset instanceof Sequence) {
      Sequence sequenceOffset = (Sequence) offset;
      return Source.fromGraph(
          new MyEventsByTagSource(conn, tag, sequenceOffset.value(), refreshInterval));
    } else if (offset == NoOffset.getInstance())
      return eventsByTag(tag, Offset.sequence(0L)); // recursive
    else
      throw new IllegalArgumentException(
          "MyJavadslReadJournal does not support " + offset.getClass().getName() + " offsets");
  }

  @Override
  public Source<EventEnvelope, NotUsed> eventsByPersistenceId(
      String persistenceId, long fromSequenceNr, long toSequenceNr) {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public Source<String, NotUsed> persistenceIds() {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public Source<String, NotUsed> currentPersistenceIds() {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }

  // possibility to add more plugin specific queries

  public Source<RichEvent, QueryMetadata> byTagsWithMeta(Set<String> tags) {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }
}
static class MyScaladslReadJournal
    implements akka.persistence.query.scaladsl.ReadJournal,
        akka.persistence.query.scaladsl.EventsByTagQuery,
        akka.persistence.query.scaladsl.EventsByPersistenceIdQuery,
        akka.persistence.query.scaladsl.PersistenceIdsQuery,
        akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery {

  private final MyJavadslReadJournal javadslReadJournal;

  public MyScaladslReadJournal(MyJavadslReadJournal javadslReadJournal) {
    this.javadslReadJournal = javadslReadJournal;
  }

  @Override
  public akka.stream.scaladsl.Source<EventEnvelope, NotUsed> eventsByTag(
      String tag, akka.persistence.query.Offset offset) {
    return javadslReadJournal.eventsByTag(tag, offset).asScala();
  }

  @Override
  public akka.stream.scaladsl.Source<EventEnvelope, NotUsed> eventsByPersistenceId(
      String persistenceId, long fromSequenceNr, long toSequenceNr) {
    return javadslReadJournal
        .eventsByPersistenceId(persistenceId, fromSequenceNr, toSequenceNr)
        .asScala();
  }

  @Override
  public akka.stream.scaladsl.Source<String, NotUsed> persistenceIds() {
    return javadslReadJournal.persistenceIds().asScala();
  }

  @Override
  public akka.stream.scaladsl.Source<String, NotUsed> currentPersistenceIds() {
    return javadslReadJournal.currentPersistenceIds().asScala();
  }

  // possibility to add more plugin specific queries

  public akka.stream.scaladsl.Source<RichEvent, QueryMetadata> byTagsWithMeta(
      scala.collection.Set<String> tags) {
    Set<String> jTags = scala.jdk.javaapi.CollectionConverters.asJava(tags);
    return javadslReadJournal.byTagsWithMeta(jTags).asScala();
  }
}
```

And the [`eventsByTag`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html "akka.persistence.query.javadsl.EventsByTagQuery")[`eventsByTag`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html "akka.persistence.query.scaladsl.EventsByTagQuery") could be backed by a GraphStage for example:

Scala

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/scala/docs/persistence/query/MyEventsByTagSource.scala#L16-L106 "Go to snippet source")class MyEventsByTagSource(tag: String, offset: Long, refreshInterval: FiniteDuration)
    extends GraphStage[SourceShape[EventEnvelope]] {

  private case object Continue
  val out: Outlet[EventEnvelope] = Outlet("MyEventByTagSource.out")
  override def shape: SourceShape[EventEnvelope] = SourceShape(out)

  override protected def initialAttributes: Attributes = Attributes(ActorAttributes.IODispatcher)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic =
    new TimerGraphStageLogic(shape) with OutHandler {
      lazy val system = materializer.system
      private val Limit = 1000
      private val connection: java.sql.Connection = ???
      private var currentOffset = offset
      private var buf = Vector.empty[EventEnvelope]
      private val serialization = SerializationExtension(system)

      override def preStart(): Unit = {
        scheduleWithFixedDelay(Continue, refreshInterval, refreshInterval)
      }

      override def onPull(): Unit = {
        query()
        tryPush()
      }

      override def onDownstreamFinish(cause: Throwable): Unit = {
        // close connection if responsible for doing so
      }

      private def query(): Unit = {
        if (buf.isEmpty) {
          try {
            buf = Select.run(tag, currentOffset, Limit)
          } catch {
            case NonFatal(e) =>
              failStage(e)
          }
        }
      }

      private def tryPush(): Unit = {
        if (buf.nonEmpty && isAvailable(out)) {
          push(out, buf.head)
          buf = buf.tail
        }
      }

      override protected def onTimer(timerKey: Any): Unit = timerKey match {
        case Continue =>
          query()
          tryPush()
      }

      object Select {
        private def statement() =
          connection.prepareStatement("""
            SELECT id, persistence_id, seq_nr, serializer_id, serializer_manifest, payload 
            FROM journal WHERE tag = ? AND id > ? 
            ORDER BY id LIMIT ?
      """)

        def run(tag: String, from: Long, limit: Int): Vector[EventEnvelope] = {
          val s = statement()
          try {
            s.setString(1, tag)
            s.setLong(2, from)
            s.setLong(3, limit)
            val rs = s.executeQuery()

            val b = Vector.newBuilder[EventEnvelope]
            while (rs.next()) {
              val deserialized = serialization
                .deserialize(rs.getBytes("payload"), rs.getInt("serializer_id"), rs.getString("serializer_manifest"))
                .get
              currentOffset = rs.getLong("id")
              b += EventEnvelope(
                Offset.sequence(currentOffset),
                rs.getString("persistence_id"),
                rs.getLong("seq_nr"),
                deserialized,
                System.currentTimeMillis())
            }
            b.result()
          } finally s.close()
        }
      }
    }

}
```

Java

```
[source](https://github.com/akka/akka-core/tree/v2.10.17/akka-docs/src/test/java/jdocs/persistence/query/MyEventsByTagSource.java#L23-L131 "Go to snippet source")public class MyEventsByTagSource extends GraphStage<SourceShape<EventEnvelope>> {
  public Outlet<EventEnvelope> out = Outlet.create("MyEventByTagSource.out");
  private static final String QUERY =
      "SELECT id, persistence_id, seq_nr, serializer_id, serializer_manifest, payload "
          + "FROM journal WHERE tag = ? AND id > ? "
          + "ORDER BY id LIMIT ?";

  enum Continue {
    INSTANCE;
  }

  private static final int LIMIT = 1000;
  private final Connection connection;
  private final String tag;
  private final long initialOffset;
  private final Duration refreshInterval;

  // assumes a shared connection, could also be a factory for creating connections/pool
  public MyEventsByTagSource(
      Connection connection, String tag, long initialOffset, Duration refreshInterval) {
    this.connection = connection;
    this.tag = tag;
    this.initialOffset = initialOffset;
    this.refreshInterval = refreshInterval;
  }

  @Override
  public Attributes initialAttributes() {
    return Attributes.apply(ActorAttributes.IODispatcher());
  }

  @Override
  public SourceShape<EventEnvelope> shape() {
    return SourceShape.of(out);
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new TimerGraphStageLogic(shape()) {
      private ActorSystem system = materializer().system();
      private long currentOffset = initialOffset;
      private List<EventEnvelope> buf = new LinkedList<>();
      private final Serialization serialization = SerializationExtension.get(system);

      @Override
      public void preStart() {
        scheduleWithFixedDelay(Continue.INSTANCE, refreshInterval, refreshInterval);
      }

      @Override
      public void onTimer(Object timerKey) {
        query();
        deliver();
      }

      private void deliver() {
        if (isAvailable(out) && !buf.isEmpty()) {
          push(out, buf.remove(0));
        }
      }

      private void query() {
        if (buf.isEmpty()) {

          try (PreparedStatement s = connection.prepareStatement(QUERY)) {
            s.setString(1, tag);
            s.setLong(2, currentOffset);
            s.setLong(3, LIMIT);
            try (ResultSet rs = s.executeQuery()) {
              final List<EventEnvelope> res = new ArrayList<>(LIMIT);
              while (rs.next()) {
                Object deserialized =
                    serialization
                        .deserialize(
                            rs.getBytes("payload"),
                            rs.getInt("serializer_id"),
                            rs.getString("serializer_manifest"))
                        .get();
                currentOffset = rs.getLong("id");
                res.add(
                    new EventEnvelope(
                        Offset.sequence(currentOffset),
                        rs.getString("persistence_id"),
                        rs.getLong("seq_nr"),
                        deserialized,
                        System.currentTimeMillis()));
              }
              buf = res;
            }
          } catch (Exception e) {
            failStage(e);
          }
        }
      }

      {
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() {
                query();
                deliver();
              }
            });
      }
    };
  }
}
```

The [`ReadJournalProvider`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html "akka.persistence.query.ReadJournalProvider")[`ReadJournalProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html "akka.persistence.query.ReadJournalProvider") class must have a constructor with one of these signatures:

- constructor with a [`ExtendedActorSystem`](https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html "akka.actor.ExtendedActorSystem")[`ExtendedActorSystem`](https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html "akka.actor.ExtendedActorSystem") parameter, a [`com.typesafe.config.Config`](https://javadoc.io/doc/com.typesafe/config/latest/com/typesafe/config/Config.html "com.typesafe.config.Config") parameter, and a `String` parameter for the config path
- constructor with a `ExtendedActorSystem` parameter, and a `com.typesafe.config.Config` parameter
- constructor with one `ExtendedActorSystem` parameter
- constructor without parameters

The plugin section of the actor system’s config will be passed in the config constructor parameter. The config path of the plugin is passed in the `String` parameter.

If the underlying datastore only supports queries that are completed when they reach the end of the “result set”, the journal has to submit new queries after a while in order to support “infinite” event streams that include events stored after the initial query has completed. It is recommended that the plugin use a configuration property named `refresh-interval` for defining such a refresh interval. 

## Scaling out

In a use case where the number of events are very high, the work needed for each event is high or where resilience is important so that if a node crashes the persistent queries are quickly started on a new node and can resume operations [Cluster Sharding](cluster-sharding.html) together with event tagging is an excellent fit to shard events over a cluster.

## Example project

The [Microservices with Akka tutorial](https://doc.akka.io/libraries/guide/microservices-tutorial/) explains how to use Event Sourcing and Projections together. The events are tagged to be consumed by even processors to build other representations from the events, or publish the events to other services.

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

### Example 4: Read Journals

```scala
// obtain read journal by plugin id
val readJournal =
  PersistenceQuery(system).readJournalFor[MyScaladslReadJournal]("akka.persistence.query.my-read-journal")

// issue query to journal
val source: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByPersistenceId("user-1337", 0, Long.MaxValue)

// materialize stream, consuming events
source.runForeach { event =>
  println("Event: " + event)
}
```

### Example 5: Read Journals

```java
// obtain read journal by plugin id
final MyJavadslReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(
            MyJavadslReadJournal.class, "akka.persistence.query.my-read-journal");

// issue query to journal
Source<EventEnvelope, NotUsed> source =
    readJournal.eventsByPersistenceId("user-1337", 0, Long.MAX_VALUE);

// materialize stream, consuming events
source.runForeach(event -> System.out.println("Event: " + event), system);
```

### Example 6: PersistenceIdsQuery and CurrentPersistenceIdsQuery

```scala
readJournal.persistenceIds()
```

### Example 7: PersistenceIdsQuery and CurrentPersistenceIdsQuery

```java
readJournal.persistenceIds();
```

### Example 8: PersistenceIdsQuery and CurrentPersistenceIdsQuery

```scala
readJournal.currentPersistenceIds()
```

### Example 9: PersistenceIdsQuery and CurrentPersistenceIdsQuery

```java
readJournal.currentPersistenceIds();
```

### Example 10: EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

```scala
readJournal.eventsByPersistenceId("user-us-1337", fromSequenceNr = 0L, toSequenceNr = Long.MaxValue)
```

### Example 11: EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

```java
readJournal.eventsByPersistenceId("user-us-1337", 0L, Long.MAX_VALUE);
```

### Example 12: EventsByTag and CurrentEventsByTag

```scala
val NumberOfEntityGroups = 10

def tagEvent(entityId: String, event: Event): Set[String] = {
  val entityGroup = s"group-${math.abs(entityId.hashCode % NumberOfEntityGroups)}"
  event match {
    case _: OrderCompleted => Set(entityGroup, "order-completed")
    case _                 => Set(entityGroup)
  }
}

def apply(entityId: String): Behavior[Command] = {
  EventSourcedBehavior[Command, Event, State](
    persistenceId = PersistenceId("ShoppingCart", entityId),
    emptyState = State(),
    commandHandler = (state, cmd) => throw new NotImplementedError("TODO: process the command & return an Effect"),
    eventHandler = (state, evt) => throw new NotImplementedError("TODO: process the event return the next state"))
    .withTagger(event => tagEvent(entityId, event))
}
```

### Example 13: EventsByTag and CurrentEventsByTag

```java
private final String entityId;

public static final int NUMBER_OF_ENTITY_GROUPS = 10;

@Override
public Set<String> tagsFor(Event event) {
  String entityGroup = "group-" + Math.abs(entityId.hashCode() % NUMBER_OF_ENTITY_GROUPS);
  Set<String> tags = new HashSet<>();
  tags.add(entityGroup);
  if (event instanceof OrderCompleted) tags.add("order-completed");
  return tags;
}
```

### Example 14: EventsByTag and CurrentEventsByTag

```scala
// assuming journal is able to work with numeric offsets we can:

val completedOrders: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByTag("order-completed", Offset.noOffset)

// find first 10 completed orders:
val firstCompleted: Future[Vector[OrderCompleted]] =
  completedOrders
    .map(_.event)
    .collectType[OrderCompleted]
    .take(10) // cancels the query stream after pulling 10 elements
    .runFold(Vector.empty[OrderCompleted])(_ :+ _)

// start another query, from the known offset
val furtherOrders = readJournal.eventsByTag("order-completed", offset = Sequence(10))
```

### Example 15: EventsByTag and CurrentEventsByTag

```java
// assuming journal is able to work with numeric offsets we can:
final Source<EventEnvelope, NotUsed> completedOrders =
    readJournal.eventsByTag("order-completed", new Sequence(0L));

// find first 10 completed orders:
final CompletionStage<List<OrderCompleted>> firstCompleted =
    completedOrders
        .map(EventEnvelope::event)
        .collectType(OrderCompleted.class)
        .take(10) // cancels the query stream after pulling 10 elements
        .runFold(
            new ArrayList<>(10),
            (acc, e) -> {
              acc.add(e);
              return acc;
            },
            system);

// start another query, from the known offset
Source<EventEnvelope, NotUsed> furtherOrders =
    readJournal.eventsByTag("order-completed", new Sequence(10));
```

### Example 16: Materialized values of queries

```scala
final case class RichEvent(tags: Set[String], payload: Any)

// a plugin can provide:
case class QueryMetadata(deterministicOrder: Boolean, infinite: Boolean)
```

### Example 17: Materialized values of queries

```java
static class RichEvent {
  public final Set<String> tags;
  public final Object payload;

  public RichEvent(Set<String> tags, Object payload) {
    this.tags = tags;
    this.payload = payload;
  }
}
// a plugin can provide:
static final class QueryMetadata {
  public final boolean deterministicOrder;
  public final boolean infinite;

  public QueryMetadata(boolean deterministicOrder, boolean infinite) {
    this.deterministicOrder = deterministicOrder;
    this.infinite = infinite;
  }
}
```

### Example 18: Materialized values of queries

```scala
def byTagsWithMeta(tags: Set[String]): Source[RichEvent, QueryMetadata] = {
```

### Example 19: Materialized values of queries

```java
public Source<RichEvent, QueryMetadata> byTagsWithMeta(Set<String> tags) {
```

### Example 20: Materialized values of queries

```scala
val query: Source[RichEvent, QueryMetadata] =
  readJournal.byTagsWithMeta(Set("red", "blue"))

query
  .mapMaterializedValue { meta =>
    println(
      s"The query is: " +
      s"ordered deterministically: ${meta.deterministicOrder}, " +
      s"infinite: ${meta.infinite}")
  }
  .map { event =>
    println(s"Event payload: ${event.payload}")
  }
  .runWith(Sink.ignore)
```

### Example 21: Materialized values of queries

```java
Set<String> tags = new HashSet<String>();
tags.add("red");
tags.add("blue");
final Source<RichEvent, QueryMetadata> events =
    readJournal
        .byTagsWithMeta(tags)
        .mapMaterializedValue(
            meta -> {
              System.out.println(
                  "The query is: "
                      + "ordered deterministically: "
                      + meta.deterministicOrder
                      + " "
                      + "infinite: "
                      + meta.infinite);
              return meta;
            });

events
    .map(
        event -> {
          System.out.println("Event payload: " + event.payload);
          return event.payload;
        })
    .runWith(Sink.ignore(), system);
```

### Example 22: Materialize view to Reactive Streams compatible datastore

```scala
implicit val system: ActorSystem = ActorSystem()

val readJournal =
  PersistenceQuery(system).readJournalFor[MyScaladslReadJournal](JournalId)
val dbBatchWriter: Subscriber[immutable.Seq[Any]] =
  ReactiveStreamsCompatibleDBDriver.batchWriter

// Using an example (Reactive Streams) Database driver
readJournal
  .eventsByPersistenceId("user-1337", fromSequenceNr = 0L, toSequenceNr = Long.MaxValue)
  .map(envelope => envelope.event)
  .map(convertToReadSideTypes) // convert to datatype
  .grouped(20) // batch inserts into groups of 20
  .runWith(Sink.fromSubscriber(dbBatchWriter)) // write batches to read-side database
```

### Example 23: Materialize view to Reactive Streams compatible datastore

```java
final ReactiveStreamsCompatibleDBDriver driver = new ReactiveStreamsCompatibleDBDriver();
final Subscriber<List<Object>> dbBatchWriter = driver.batchWriter();

// Using an example (Reactive Streams) Database driver
readJournal
    .eventsByPersistenceId("user-1337", 0L, Long.MAX_VALUE)
    .map(envelope -> envelope.event())
    .grouped(20) // batch inserts into groups of 20
    .runWith(Sink.fromSubscriber(dbBatchWriter), system); // write batches to read-side database
```

### Example 24: Materialize view using mapAsync

```scala
trait ExampleStore {
  def save(event: Any): Future[Unit]
}
```

### Example 25: Materialize view using mapAsync

```java
static class ExampleStore {
  CompletionStage<Void> save(Object any) {
    // ...
  }
}
```

### Example 26: Materialize view using mapAsync

```scala
val store: ExampleStore = ???

readJournal
  .eventsByTag("bid", NoOffset)
  .mapAsync(1) { e =>
    store.save(e)
  }
  .runWith(Sink.ignore)
```

### Example 27: Materialize view using mapAsync

```java
final ExampleStore store = new ExampleStore();

readJournal
    .eventsByTag("bid", new Sequence(0L))
    .mapAsync(1, store::save)
    .runWith(Sink.ignore(), system);
```

### Example 28: ReadJournal plugin API

```scala
class MyReadJournalProvider(system: ExtendedActorSystem, config: Config) extends ReadJournalProvider {

  private val readJournal: MyScaladslReadJournal =
    new MyScaladslReadJournal(system, config)

  override def scaladslReadJournal(): MyScaladslReadJournal =
    readJournal

  override def javadslReadJournal(): MyJavadslReadJournal =
    new MyJavadslReadJournal(readJournal)
}

class MyScaladslReadJournal(system: ExtendedActorSystem, config: Config)
    extends akka.persistence.query.scaladsl.ReadJournal
    with akka.persistence.query.scaladsl.EventsByTagQuery
    with akka.persistence.query.scaladsl.EventsByPersistenceIdQuery
    with akka.persistence.query.scaladsl.PersistenceIdsQuery
    with akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery {

  private val refreshInterval: FiniteDuration =
    config.getDuration("refresh-interval", MILLISECONDS).millis

  /**
   * You can use `NoOffset` to retrieve all events with a given tag or retrieve a subset of all
   * events by specifying a `Sequence` `offset`. The `offset` corresponds to an ordered sequence number for
   * the specific tag. Note that the corresponding offset of each event is provided in the
   * [[akka.persistence.query.EventEnvelope]], which makes it possible to resume the
   * stream at a later point from a given offset.
   *
   * The `offset` is exclusive, i.e. the event with the exact same sequence number will not be included
   * in the returned stream. This means that you can use the offset that is returned in `EventEnvelope`
   * as the `offset` parameter in a subsequent query.
   */
  override def eventsByTag(tag: String, offset: Offset): Source[EventEnvelope, NotUsed] = offset match {
    case Sequence(offsetValue) =>
      Source.fromGraph(new MyEventsByTagSource(tag, offsetValue, refreshInterval))
    case NoOffset => eventsByTag(tag, Sequence(0L)) //recursive
    case _ =>
      throw new IllegalArgumentException("MyJournal does not support " + offset.getClass.getName + " offsets")
  }

  override def eventsByPersistenceId(
      persistenceId: String,
      fromSequenceNr: Long,
      toSequenceNr: Long): Source[EventEnvelope, NotUsed] = {
    // implement in a similar way as eventsByTag
    ???
  }

  override def persistenceIds(): Source[String, NotUsed] = {
    // implement in a similar way as eventsByTag
    ???
  }

  override def currentPersistenceIds(): Source[String, NotUsed] = {
    // implement in a similar way as eventsByTag
    ???
  }

  // possibility to add more plugin specific queries

  def byTagsWithMeta(tags: Set[String]): Source[RichEvent, QueryMetadata] = {
    // implement in a similar way as eventsByTag
    ???
  }

}

class MyJavadslReadJournal(scaladslReadJournal: MyScaladslReadJournal)
    extends akka.persistence.query.javadsl.ReadJournal
    with akka.persistence.query.javadsl.EventsByTagQuery
    with akka.persistence.query.javadsl.EventsByPersistenceIdQuery
    with akka.persistence.query.javadsl.PersistenceIdsQuery
    with akka.persistence.query.javadsl.CurrentPersistenceIdsQuery {

  override def eventsByTag(tag: String, offset: Offset = Sequence(0L)): javadsl.Source[EventEnvelope, NotUsed] =
    scaladslReadJournal.eventsByTag(tag, offset).asJava

  override def eventsByPersistenceId(
      persistenceId: String,
      fromSequenceNr: Long = 0L,
      toSequenceNr: Long = Long.MaxValue): javadsl.Source[EventEnvelope, NotUsed] =
    scaladslReadJournal.eventsByPersistenceId(persistenceId, fromSequenceNr, toSequenceNr).asJava

  override def persistenceIds(): javadsl.Source[String, NotUsed] =
    scaladslReadJournal.persistenceIds().asJava

  override def currentPersistenceIds(): javadsl.Source[String, NotUsed] =
    scaladslReadJournal.currentPersistenceIds().asJava

  // possibility to add more plugin specific queries

  def byTagsWithMeta(tags: java.util.Set[String]): javadsl.Source[RichEvent, QueryMetadata] = {
    import scala.jdk.CollectionConverters._
    scaladslReadJournal.byTagsWithMeta(tags.asScala.toSet).asJava
  }
}
```

### Example 29: ReadJournal plugin API

```java
static class MyReadJournalProvider implements ReadJournalProvider {
  private final MyJavadslReadJournal javadslReadJournal;

  public MyReadJournalProvider(ExtendedActorSystem system, Config config) {
    this.javadslReadJournal = new MyJavadslReadJournal(system, config);
  }

  @Override
  public MyScaladslReadJournal scaladslReadJournal() {
    return new MyScaladslReadJournal(javadslReadJournal);
  }

  @Override
  public MyJavadslReadJournal javadslReadJournal() {
    return this.javadslReadJournal;
  }
}
static class MyJavadslReadJournal
    implements akka.persistence.query.javadsl.ReadJournal,
        akka.persistence.query.javadsl.EventsByTagQuery,
        akka.persistence.query.javadsl.EventsByPersistenceIdQuery,
        akka.persistence.query.javadsl.PersistenceIdsQuery,
        akka.persistence.query.javadsl.CurrentPersistenceIdsQuery {

  private final Duration refreshInterval;
  private Connection conn;

  public MyJavadslReadJournal(ExtendedActorSystem system, Config config) {
    refreshInterval = config.getDuration("refresh-interval");
  }

  /**
   * You can use `NoOffset` to retrieve all events with a given tag or retrieve a subset of all
   * events by specifying a `Sequence` `offset`. The `offset` corresponds to an ordered sequence
   * number for the specific tag. Note that the corresponding offset of each event is provided in
   * the [[akka.persistence.query.EventEnvelope]], which makes it possible to resume the stream at
   * a later point from a given offset.
   *
   * <p>The `offset` is exclusive, i.e. the event with the exact same sequence number will not be
   * included in the returned stream. This means that you can use the offset that is returned in
   * `EventEnvelope` as the `offset` parameter in a subsequent query.
   */
  @Override
  public Source<EventEnvelope, NotUsed> eventsByTag(String tag, Offset offset) {
    if (offset instanceof Sequence) {
      Sequence sequenceOffset = (Sequence) offset;
      return Source.fromGraph(
          new MyEventsByTagSource(conn, tag, sequenceOffset.value(), refreshInterval));
    } else if (offset == NoOffset.getInstance())
      return eventsByTag(tag, Offset.sequence(0L)); // recursive
    else
      throw new IllegalArgumentException(
          "MyJavadslReadJournal does not support " + offset.getClass().getName() + " offsets");
  }

  @Override
  public Source<EventEnvelope, NotUsed> eventsByPersistenceId(
      String persistenceId, long fromSequenceNr, long toSequenceNr) {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public Source<String, NotUsed> persistenceIds() {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }

  @Override
  public Source<String, NotUsed> currentPersistenceIds() {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }

  // possibility to add more plugin specific queries

  public Source<RichEvent, QueryMetadata> byTagsWithMeta(Set<String> tags) {
    // implement in a similar way as eventsByTag
    throw new UnsupportedOperationException("Not implemented yet");
  }
}
static class MyScaladslReadJournal
    implements akka.persistence.query.scaladsl.ReadJournal,
        akka.persistence.query.scaladsl.EventsByTagQuery,
        akka.persistence.query.scaladsl.EventsByPersistenceIdQuery,
        akka.persistence.query.scaladsl.PersistenceIdsQuery,
        akka.persistence.query.scaladsl.CurrentPersistenceIdsQuery {

  private final MyJavadslReadJournal javadslReadJournal;

  public MyScaladslReadJournal(MyJavadslReadJournal javadslReadJournal) {
    this.javadslReadJournal = javadslReadJournal;
  }

  @Override
  public akka.stream.scaladsl.Source<EventEnvelope, NotUsed> eventsByTag(
      String tag, akka.persistence.query.Offset offset) {
    return javadslReadJournal.eventsByTag(tag, offset).asScala();
  }

  @Override
  public akka.stream.scaladsl.Source<EventEnvelope, NotUsed> eventsByPersistenceId(
      String persistenceId, long fromSequenceNr, long toSequenceNr) {
    return javadslReadJournal
        .eventsByPersistenceId(persistenceId, fromSequenceNr, toSequenceNr)
        .asScala();
  }

  @Override
  public akka.stream.scaladsl.Source<String, NotUsed> persistenceIds() {
    return javadslReadJournal.persistenceIds().asScala();
  }

  @Override
  public akka.stream.scaladsl.Source<String, NotUsed> currentPersistenceIds() {
    return javadslReadJournal.currentPersistenceIds().asScala();
  }

  // possibility to add more plugin specific queries

  public akka.stream.scaladsl.Source<RichEvent, QueryMetadata> byTagsWithMeta(
      scala.collection.Set<String> tags) {
    Set<String> jTags = scala.jdk.javaapi.CollectionConverters.asJava(tags);
    return javadslReadJournal.byTagsWithMeta(jTags).asScala();
  }
}
```

### Example 30: ReadJournal plugin API

```scala
class MyEventsByTagSource(tag: String, offset: Long, refreshInterval: FiniteDuration)
    extends GraphStage[SourceShape[EventEnvelope]] {

  private case object Continue
  val out: Outlet[EventEnvelope] = Outlet("MyEventByTagSource.out")
  override def shape: SourceShape[EventEnvelope] = SourceShape(out)

  override protected def initialAttributes: Attributes = Attributes(ActorAttributes.IODispatcher)

  override def createLogic(inheritedAttributes: Attributes): GraphStageLogic =
    new TimerGraphStageLogic(shape) with OutHandler {
      lazy val system = materializer.system
      private val Limit = 1000
      private val connection: java.sql.Connection = ???
      private var currentOffset = offset
      private var buf = Vector.empty[EventEnvelope]
      private val serialization = SerializationExtension(system)

      override def preStart(): Unit = {
        scheduleWithFixedDelay(Continue, refreshInterval, refreshInterval)
      }

      override def onPull(): Unit = {
        query()
        tryPush()
      }

      override def onDownstreamFinish(cause: Throwable): Unit = {
        // close connection if responsible for doing so
      }

      private def query(): Unit = {
        if (buf.isEmpty) {
          try {
            buf = Select.run(tag, currentOffset, Limit)
          } catch {
            case NonFatal(e) =>
              failStage(e)
          }
        }
      }

      private def tryPush(): Unit = {
        if (buf.nonEmpty && isAvailable(out)) {
          push(out, buf.head)
          buf = buf.tail
        }
      }

      override protected def onTimer(timerKey: Any): Unit = timerKey match {
        case Continue =>
          query()
          tryPush()
      }

      object Select {
        private def statement() =
          connection.prepareStatement("""
            SELECT id, persistence_id, seq_nr, serializer_id, serializer_manifest, payload 
            FROM journal WHERE tag = ? AND id > ? 
            ORDER BY id LIMIT ?
      """)

        def run(tag: String, from: Long, limit: Int): Vector[EventEnvelope] = {
          val s = statement()
          try {
            s.setString(1, tag)
            s.setLong(2, from)
            s.setLong(3, limit)
            val rs = s.executeQuery()

            val b = Vector.newBuilder[EventEnvelope]
            while (rs.next()) {
              val deserialized = serialization
                .deserialize(rs.getBytes("payload"), rs.getInt("serializer_id"), rs.getString("serializer_manifest"))
                .get
              currentOffset = rs.getLong("id")
              b += EventEnvelope(
                Offset.sequence(currentOffset),
                rs.getString("persistence_id"),
                rs.getLong("seq_nr"),
                deserialized,
                System.currentTimeMillis())
            }
            b.result()
          } finally s.close()
        }
      }
    }

}
```

### Example 31: ReadJournal plugin API

```java
public class MyEventsByTagSource extends GraphStage<SourceShape<EventEnvelope>> {
  public Outlet<EventEnvelope> out = Outlet.create("MyEventByTagSource.out");
  private static final String QUERY =
      "SELECT id, persistence_id, seq_nr, serializer_id, serializer_manifest, payload "
          + "FROM journal WHERE tag = ? AND id > ? "
          + "ORDER BY id LIMIT ?";

  enum Continue {
    INSTANCE;
  }

  private static final int LIMIT = 1000;
  private final Connection connection;
  private final String tag;
  private final long initialOffset;
  private final Duration refreshInterval;

  // assumes a shared connection, could also be a factory for creating connections/pool
  public MyEventsByTagSource(
      Connection connection, String tag, long initialOffset, Duration refreshInterval) {
    this.connection = connection;
    this.tag = tag;
    this.initialOffset = initialOffset;
    this.refreshInterval = refreshInterval;
  }

  @Override
  public Attributes initialAttributes() {
    return Attributes.apply(ActorAttributes.IODispatcher());
  }

  @Override
  public SourceShape<EventEnvelope> shape() {
    return SourceShape.of(out);
  }

  @Override
  public GraphStageLogic createLogic(Attributes inheritedAttributes) {
    return new TimerGraphStageLogic(shape()) {
      private ActorSystem system = materializer().system();
      private long currentOffset = initialOffset;
      private List<EventEnvelope> buf = new LinkedList<>();
      private final Serialization serialization = SerializationExtension.get(system);

      @Override
      public void preStart() {
        scheduleWithFixedDelay(Continue.INSTANCE, refreshInterval, refreshInterval);
      }

      @Override
      public void onTimer(Object timerKey) {
        query();
        deliver();
      }

      private void deliver() {
        if (isAvailable(out) && !buf.isEmpty()) {
          push(out, buf.remove(0));
        }
      }

      private void query() {
        if (buf.isEmpty()) {

          try (PreparedStatement s = connection.prepareStatement(QUERY)) {
            s.setString(1, tag);
            s.setLong(2, currentOffset);
            s.setLong(3, LIMIT);
            try (ResultSet rs = s.executeQuery()) {
              final List<EventEnvelope> res = new ArrayList<>(LIMIT);
              while (rs.next()) {
                Object deserialized =
                    serialization
                        .deserialize(
                            rs.getBytes("payload"),
                            rs.getInt("serializer_id"),
                            rs.getString("serializer_manifest"))
                        .get();
                currentOffset = rs.getLong("id");
                res.add(
                    new EventEnvelope(
                        Offset.sequence(currentOffset),
                        rs.getString("persistence_id"),
                        rs.getLong("seq_nr"),
                        deserialized,
                        System.currentTimeMillis()));
              }
              buf = res;
            }
          } catch (Exception e) {
            failStage(e);
          }
        }
      }

      {
        setHandler(
            out,
            new AbstractOutHandler() {
              @Override
              public void onPull() {
                query();
                deliver();
              }
            });
      }
    };
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/EventsByTagQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/PersistenceIdsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/scaladsl/ReadJournal.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior.html
- https://doc.akka.io/api/akka-core/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/japi/akka-core/2.10/akka/actor/ExtendedActorSystem.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/journal/Tagged.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/PersistenceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/ReadJournalProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentEventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/CurrentPersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByPersistenceIdQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/EventsByTagQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/PersistenceIdsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/javadsl/ReadJournal.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/CurrentEventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/japi/akka-core/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/akka-core/current/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/current/durable-state/persistence-query.html
- https://doc.akka.io/libraries/akka-core/current/persistence-query-leveldb.html
- https://doc.akka.io/libraries/akka-core/current/persistence-schema-evolution.html
- https://doc.akka.io/libraries/akka-core/current/persistence.html
- https://doc.akka.io/libraries/akka-core/current/stream/index.html
- https://doc.akka.io/libraries/akka-core/current/stream/stream-quickstart.html
- https://doc.akka.io/libraries/akka-core/current/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/current/typed/durable-state/persistence.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-projection/current/
- https://doc.akka.io/libraries/guide/microservices-tutorial/

---
*Source: [https://doc.akka.io/libraries/akka-core/current/persistence-query.html](https://doc.akka.io/libraries/akka-core/current/persistence-query.html)*