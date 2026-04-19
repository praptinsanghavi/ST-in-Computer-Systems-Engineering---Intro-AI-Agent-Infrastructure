---
description: Akka is a toolkit for building highly concurrent, distributed, and resilient
  message-driven applications for Java and Scala.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:19:58Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-core/current/persistence-query.html
title: Persistence Query • Akka Documentation
---

# Persistence Query • Akka Documentation

> **Summary:** Akka is a toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala.

## Content

# Persistence Query

## Dependency

To use Persistence Query, you must add the following dependency in your project:

sbt
```
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-query" % "2.5.32"
```
Maven
```
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```
Gradle
```
dependencies {
  implementation "com.typesafe.akka:akka-persistence-query_2.12:2.5.32"
}
```

This will also add dependency on the [Akka Persistence](persistence.html) module.

## Introduction

Akka persistence query complements [Persistence](persistence.html) by providing a universal asynchronous stream based query interface that various journal plugins can implement in order to expose their query capabilities.

The most typical use case of persistence query is implementing the so\-called query side (also known as “read side”) in the popular CQRS architecture pattern \- in which the writing side of the application (e.g. implemented using akka persistence) is completely separated from the “query side”. Akka Persistence Query itself is *not* directly the query side of an application, however it can help to migrate data from the write side to the query side database. In very simple scenarios Persistence Query may be powerful enough to fulfill the query needs of your app, however we highly recommend (in the spirit of CQRS) of splitting up the write/read sides into separate datastores as the need arises.

## Design overview

Akka persistence query is purposely designed to be a very loosely specified API. This is in order to keep the provided APIs general enough for each journal implementation to be able to expose its best features, e.g. a SQL journal can use complex SQL queries or if a journal is able to subscribe to a live event stream this should also be possible to expose the same API \- a typed stream of events.

**Each read journal must explicitly document which types of queries it supports.** Refer to your journal’s plugins documentation for details on which queries and semantics it supports.

While Akka Persistence Query does not provide actual implementations of ReadJournals, it defines a number of pre\-defined query types for the most common query scenarios, that most journals are likely to implement (however they are not required to).

## Read Journals

In order to issue queries one has to first obtain an instance of a `ReadJournal`. Read journals are implemented as [Community plugins](http://akka.io/community/#plugins-to-akka-persistence-query), each targeting a specific datastore (for example Cassandra or JDBC databases). For example, given a library that provides a `akka.persistence.query.my-read-journal` obtaining the related journal is as simple as:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L210-L222 "Go to snippet source")// obtain read journal by plugin id
val readJournal =
  PersistenceQuery(system).readJournalFor[MyScaladslReadJournal]("akka.persistence.query.my-read-journal")

// issue query to journal
val source: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByPersistenceId("user-1337", 0, Long.MaxValue)

// materialize stream, consuming events
implicit val mat = ActorMaterializer()
source.runForeach { event =>
  println("Event: " + event)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L212-L224 "Go to snippet source")// obtain read journal by plugin id
final MyJavadslReadJournal readJournal =
    PersistenceQuery.get(system)
        .getReadJournalFor(
            MyJavadslReadJournal.class, "akka.persistence.query.my-read-journal");

// issue query to journal
Source<EventEnvelope, NotUsed> source =
    readJournal.eventsByPersistenceId("user-1337", 0, Long.MAX_VALUE);

// materialize stream, consuming events
ActorMaterializer mat = ActorMaterializer.create(system);
source.runForeach(event -> System.out.println("Event: " + event), mat);
```

Journal implementers are encouraged to put this identifier in a variable known to the user, such that one can access it via `readJournalFor[NoopJournal](NoopJournal.identifier)``getJournalFor(NoopJournal.class, NoopJournal.identifier)`, however this is not enforced.

Read journal implementations are available as [Community plugins](http://akka.io/community/#plugins-to-akka-persistence-query).

### Predefined queries

Akka persistence query comes with a number of query interfaces built in and suggests Journal implementors to implement them according to the semantics described below. It is important to notice that while these query types are very common a journal is not obliged to implement all of them \- for example because in a given journal such query would be significantly inefficient.

Note
Refer to the documentation of the `ReadJournal` plugin you are using for a specific list of supported query types. For example, Journal plugins should document their stream completion strategies.

The predefined queries are:

#### PersistenceIdsQuery and CurrentPersistenceIdsQuery

`persistenceIds` which is designed to allow users to subscribe to a stream of all persistent ids in the system. By default this stream should be assumed to be a “live” stream, which means that the journal should keep emitting new persistence ids as they come into the system:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L226 "Go to snippet source")readJournal.persistenceIds()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L235 "Go to snippet source")readJournal.persistenceIds();
```

If your usage does not require a live stream, you can use the `currentPersistenceIds` query:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L230 "Go to snippet source")readJournal.currentPersistenceIds()
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L248 "Go to snippet source")readJournal.currentPersistenceIds();
```

#### EventsByPersistenceIdQuery and CurrentEventsByPersistenceIdQuery

`eventsByPersistenceId` is a query equivalent to replaying a [PersistentActor](persistence.html#event-sourcing), however, since it is a stream it is possible to keep it alive and watch for additional incoming events persisted by the persistent actor identified by the given `persistenceId`.

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L251-L252 "Go to snippet source")readJournal.eventsByPersistenceId("user-us-1337", fromSequenceNr = 0L, toSequenceNr = Long.MaxValue)

```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L261 "Go to snippet source")readJournal.eventsByPersistenceId("user-us-1337", 0L, Long.MAX_VALUE);
```

Most journals will have to revert to polling in order to achieve this, which can typically be configured with a `refresh-interval` configuration property.

If your usage does not require a live stream, you can use the `currentEventsByPersistenceId` query.

#### EventsByTag and CurrentEventsByTag

`eventsByTag` allows querying events regardless of which `persistenceId` they are associated with. This query is hard to implement in some journals or may need some additional preparation of the used data store to be executed efficiently. The goal of this query is to allow querying for all events which are “tagged” with a specific tag. That includes the use case to query all domain events of an Aggregate Root type. Please refer to your read journal plugin’s documentation to find out if and how it is supported.

Some journals may support tagging of events via an [Event Adapters](persistence.html#event-adapters) that wraps the events in a `akka.persistence.journal.Tagged` with the given `tags`. The journal may support other ways of doing tagging \- again, how exactly this is implemented depends on the used journal. Here is an example of such a tagging event adapter:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/LeveldbPersistenceQueryDocSpec.scala#L21-L37 "Go to snippet source")import akka.persistence.journal.WriteEventAdapter
import akka.persistence.journal.Tagged

class MyTaggingEventAdapter extends WriteEventAdapter {
  val colors = Set("green", "black", "blue")
  override def toJournal(event: Any): Any = event match {
    case s: String =>
      var tags = colors.foldLeft(Set.empty[String]) { (acc, c) =>
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/query/LeveldbPersistenceQueryDocTest.java#L68-L89 "Go to snippet source")static class MyTaggingEventAdapter implements WriteEventAdapter {

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

Note
A very important thing to keep in mind when using queries spanning multiple persistenceIds, such as `EventsByTag` is that the order of events at which the events appear in the stream rarely is guaranteed (or stable between materializations).

Journals *may* choose to opt for strict ordering of the events, and should then document explicitly what kind of ordering guarantee they provide \- for example “*ordered by timestamp ascending, independently of persistenceId*” is easy to achieve on relational databases, yet may be hard to implement efficiently on plain key\-value datastores.

In the example below we query all events which have been tagged (we assume this was performed by the write\-side using an [EventAdapter](persistence.html#event-adapters), or that the journal is smart enough that it can figure out what we mean by this tag \- for example if the journal stored the events as json it may try to find those with the field `tag` set to this value etc.).

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L234-L247 "Go to snippet source")// assuming journal is able to work with numeric offsets we can:

val blueThings: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByTag("blue", Offset.noOffset)

// find top 10 blue things:
val top10BlueThings: Future[Vector[Any]] =
  blueThings
    .map(_.event)
    .take(10) // cancels the query stream after pulling 10 elements
    .runFold(Vector.empty[Any])(_ :+ _)

// start another query, from the known offset
val furtherBlueThings = readJournal.eventsByTag("blue", offset = Sequence(10))
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L275-L293 "Go to snippet source")// assuming journal is able to work with numeric offsets we can:
final Source<EventEnvelope, NotUsed> blueThings =
    readJournal.eventsByTag("blue", new Sequence(0L));

// find top 10 blue things:
final CompletionStage<List<Object>> top10BlueThings =
    blueThings
        .map(EventEnvelope::event)
        .take(10) // cancels the query stream after pulling 10 elements
        .runFold(
            new ArrayList<>(10),
            (acc, e) -> {
              acc.add(e);
              return acc;
            },
            mat);

// start another query, from the known offset
Source<EventEnvelope, NotUsed> blue = readJournal.eventsByTag("blue", new Sequence(10));
```

As you can see, we can use all the usual stream operators available from [Streams](stream/index.html) on the resulting query stream, including for example taking the first 10 and cancelling the stream. It is worth pointing out that the built\-in `EventsByTag` query has an optionally supported offset parameter (of type `Long`) which the journals can use to implement resumable\-streams. For example a journal may be able to use a WHERE clause to begin the read starting from a specific row, or in a datastore that is able to order events by insertion time it could treat the Long as a timestamp and select only older events.

If your usage does not require a live stream, you can use the `currentEventsByTag` query.

### Materialized values of queries

Journals are able to provide additional information related to a query by exposing [Materialized values](stream/stream-quickstart.html#materialized-values-quick), which are a feature of [Streams](stream/index.html) that allows to expose additional values at stream materialization time.

More advanced query journals may use this technique to expose information about the character of the materialized stream, for example if it’s finite or infinite, strictly ordered or not ordered at all. The materialized value type is defined as the second type parameter of the returned `Source`, which allows journals to provide users with their specialised query object, as demonstrated in the sample below:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L30-L33 "Go to snippet source")final case class RichEvent(tags: Set[String], payload: Any)

// a plugin can provide:
case class QueryMetadata(deterministicOrder: Boolean, infinite: Boolean)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L40-L62 "Go to snippet source")static class RichEvent {
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L97 "Go to snippet source")def byTagsWithMeta(tags: Set[String]): Source[RichEvent, QueryMetadata] = {
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L151 "Go to snippet source")public Source<RichEvent, QueryMetadata> byTagsWithMeta(Set<String> tags) {
```

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L256-L270 "Go to snippet source")val query: Source[RichEvent, QueryMetadata] =
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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L307-L333 "Go to snippet source")  
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
    .runWith(Sink.ignore(), mat);

```

## Performance and denormalization

When building systems using [Event sourcing](persistence.html#event-sourcing) and CQRS ([Command \& Query Responsibility Segregation](https://msdn.microsoft.com/en-us/library/jj554200.aspx)) techniques it is tremendously important to realise that the write\-side has completely different needs from the read\-side, and separating those concerns into datastores that are optimised for either side makes it possible to offer the best experience for the write and read sides independently.

For example, in a bidding system it is important to “take the write” and respond to the bidder that we have accepted the bid as soon as possible, which means that write\-throughput is of highest importance for the write\-side – often this means that data stores which are able to scale to accommodate these requirements have a less expressive query side.

On the other hand the same application may have some complex statistics view or we may have analysts working with the data to figure out best bidding strategies and trends – this often requires some kind of expressive query capabilities like for example SQL or writing Spark jobs to analyse the data. Therefore the data stored in the write\-side needs to be projected into the other read\-optimised datastore.

Note
When referring to **Materialized Views** in Akka Persistence think of it as “some persistent storage of the result of a Query”. In other words, it means that the view is created once, in order to be afterwards queried multiple times, as in this format it may be more efficient or interesting to query it (instead of the source events directly).

### Materialize view to Reactive Streams compatible datastore

If the read datastore exposes a [Reactive Streams](http://reactive-streams.org) interface then implementing a simple projection is as simple as, using the read\-journal and feeding it into the databases driver interface, for example like so:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L154-L168 "Go to snippet source")implicit val system = ActorSystem()
implicit val mat = ActorMaterializer()

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
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L353-L361 "Go to snippet source")final ReactiveStreamsCompatibleDBDriver driver = new ReactiveStreamsCompatibleDBDriver();
final Subscriber<List<Object>> dbBatchWriter = driver.batchWriter();

// Using an example (Reactive Streams) Database driver
readJournal
    .eventsByPersistenceId("user-1337", 0L, Long.MAX_VALUE)
    .map(envelope -> envelope.event())
    .grouped(20) // batch inserts into groups of 20
    .runWith(Sink.fromSubscriber(dbBatchWriter), mat); // write batches to read-side database
```

### Materialize view using mapAsync

If the target database does not provide a reactive streams `Subscriber` that can perform writes, you may have to implement the write logic using plain functions or Actors instead.

In case your write logic is state\-less and you need to convert the events from one data type to another before writing into the alternative datastore, then the projection will look like this:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L314-L316 "Go to snippet source")trait ExampleStore {
  def save(event: Any): Future[Unit]
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L366-L373 "Go to snippet source")class ExampleStore {
  CompletionStage<Void> save(Object any) {
    // ...
  }
}
```

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L320-L327 "Go to snippet source")val store: ExampleStore = ???

readJournal
  .eventsByTag("bid", NoOffset)
  .mapAsync(1) { e =>
    store.save(e)
  }
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L386-L391 "Go to snippet source")final ExampleStore store = new ExampleStore();

readJournal
    .eventsByTag("bid", new Sequence(0L))
    .mapAsync(1, store::save)
    .runWith(Sink.ignore(), mat);
```

### Resumable projections

Sometimes you may need to implement “resumable” projections, that will not start from the beginning of time each time when run. In this case you will need to store the sequence number (or `offset`) of the processed event and use it the next time this projection is started. This pattern is not built\-in, however is rather simple to implement yourself.

The example below additionally highlights how you would use Actors to implement the write side, in case you need to do some complex logic that would be best handled inside an Actor before persisting the event into the other datastore:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L286-L305 "Go to snippet source")import akka.pattern.ask
import system.dispatcher
implicit val timeout = Timeout(3.seconds)

val bidProjection = new MyResumableProjection("bid")

val writerProps = Props(classOf[TheOneWhoWritesToQueryJournal], "bid")
val writer = system.actorOf(writerProps, "bid-projection-writer")

bidProjection.latestOffset.foreach { startFromOffset =>
  readJournal
    .eventsByTag("bid", Sequence(startFromOffset))
    .mapAsync(8) { envelope =>
      (writer ? envelope.event).map(_ => envelope.offset)
    }
    .mapAsync(1) { offset =>
      bidProjection.saveProgress(offset)
    }
    .runWith(Sink.ignore)
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L429-L450 "Go to snippet source")  final Duration timeout = Duration.ofSeconds(3);

  final MyResumableProjection bidProjection = new MyResumableProjection("bid");

  final Props writerProps = Props.create(TheOneWhoWritesToQueryJournal.class, "bid");
  final ActorRef writer = system.actorOf(writerProps, "bid-projection-writer");

  long startFromOffset =
      bidProjection.latestOffset().toCompletableFuture().get(3, TimeUnit.SECONDS);

  readJournal
      .eventsByTag("bid", new Sequence(startFromOffset))
      .mapAsync(
          8,
          envelope -> {
            final CompletionStage<Object> f = ask(writer, envelope.event(), timeout);
            return f.thenApplyAsync(in -> envelope.offset(), system.dispatcher());
          })
      .mapAsync(1, offset -> bidProjection.saveProgress(offset))
      .runWith(Sink.ignore(), mat);
}

```

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L173-L189 "Go to snippet source")class TheOneWhoWritesToQueryJournal(id: String) extends Actor {
  val store = new DummyStore()

  var state: ComplexState = ComplexState()

  def receive = {
    case m =>
      state = updateState(state, m)
      if (state.readyToSave) store.save(Record(state))
  }

  def updateState(state: ComplexState, msg: Any): ComplexState = {
    // some complicated aggregation logic here ...
    state
  }
}

```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L467-L493 "Go to snippet source")final class TheOneWhoWritesToQueryJournal extends AbstractActor {
  private final ExampleStore store;

  private ComplexState state = new ComplexState();

  public TheOneWhoWritesToQueryJournal() {
    store = new ExampleStore();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            message -> {
              state = updateState(state, message);

              // example saving logic that requires state to become ready:
              if (state.readyToSave()) store.save(Record.of(state));
            })
        .build();
  }

  ComplexState updateState(ComplexState state, Object msg) {
    // some complicated aggregation logic here ...
    return state;
  }
}
```

## Query plugins

Query plugins are various (mostly community driven) `ReadJournal` implementations for all kinds of available datastores. The complete list of available plugins is maintained on the Akka Persistence Query [Community Plugins](http://akka.io/community/#plugins-to-akka-persistence-query) page.

The plugin for LevelDB is described in [Persistence Query for LevelDB](persistence-query-leveldb.html).

This section aims to provide tips and guide plugin developers through implementing a custom query plugin. Most users will not need to implement journals themselves, except if targeting a not yet supported datastore.

Note
Since different data stores provide different query capabilities journal plugins **must extensively document** their exposed semantics as well as handled query scenarios.

### ReadJournal plugin API

A read journal plugin must implement `akka.persistence.query.ReadJournalProvider` which creates instances of `akka.persistence.query.scaladsl.ReadJournal` and `akka.persistence.query.javadsl.ReadJournal`. The plugin must implement both the `scaladsl` and the `javadsl` traitsinterfaces because the `akka.stream.scaladsl.Source` and `akka.stream.javadsl.Source` are different types and even though those types can be converted to each other it is most convenient for the end user to get access to the Java or Scala `Source` directly. As illustrated below one of the implementations can delegate to the other. 

Below is a simple journal implementation:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/PersistenceQueryDocSpec.scala#L37-L134 "Go to snippet source")class MyReadJournalProvider(system: ExtendedActorSystem, config: Config) extends ReadJournalProvider {

  override val scaladslReadJournal: MyScaladslReadJournal =
    new MyScaladslReadJournal(system, config)

  override val javadslReadJournal: MyJavadslReadJournal =
    new MyJavadslReadJournal(scaladslReadJournal)
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
      val props = MyEventsByTagPublisher.props(tag, offsetValue, refreshInterval)
      Source.actorPublisher[EventEnvelope](props).mapMaterializedValue(_ => NotUsed)
    case NoOffset => eventsByTag(tag, Sequence(0L)) //recursive
    case _ =>
      throw new IllegalArgumentException("LevelDB does not support " + offset.getClass.getName + " offsets")
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
    import akka.util.ccompat.JavaConverters._
    scaladslReadJournal.byTagsWithMeta(tags.asScala.toSet).asJava
  }
}

```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/PersistenceQueryDocTest.java#L67-L205 "Go to snippet source")static class MyReadJournalProvider implements ReadJournalProvider {
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

  private final FiniteDuration refreshInterval;

  public MyJavadslReadJournal(ExtendedActorSystem system, Config config) {
    refreshInterval =
        FiniteDuration.create(
            config.getDuration("refresh-interval", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS);
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
      final Props props =
          MyEventsByTagPublisher.props(tag, sequenceOffset.value(), refreshInterval);
      return Source.<EventEnvelope>actorPublisher(props)
          .mapMaterializedValue(m -> NotUsed.getInstance());
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
    Set<String> jTags = scala.collection.JavaConverters.setAsJavaSetConverter(tags).asJava();
    return javadslReadJournal.byTagsWithMeta(jTags).asScala();
  }
}
```

And the `eventsByTag` could be backed by such an Actor for example:

Scala

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/scala/docs/persistence/query/MyEventsByTagPublisher.scala#L22-L100 "Go to snippet source")class MyEventsByTagPublisher(tag: String, offset: Long, refreshInterval: FiniteDuration)
    extends ActorPublisher[EventEnvelope] {

  private case object Continue

  private val connection: java.sql.Connection = ???

  private val Limit = 1000
  private var currentOffset = offset
  var buf = Vector.empty[EventEnvelope]

  import context.dispatcher
  val continueTask = context.system.scheduler.schedule(refreshInterval, refreshInterval, self, Continue)

  override def postStop(): Unit = {
    continueTask.cancel()
  }

  def receive = {
    case _: Request | Continue =>
      query()
      deliverBuf()

    case Cancel =>
      context.stop(self)
  }

  object Select {
    private def statement() = connection.prepareStatement("""
        SELECT id, persistent_repr FROM journal
        WHERE tag = ? AND id > ?
        ORDER BY id LIMIT ?
      """)

    def run(tag: String, from: Long, limit: Int): Vector[(Long, Array[Byte])] = {
      val s = statement()
      try {
        s.setString(1, tag)
        s.setLong(2, from)
        s.setLong(3, limit)
        val rs = s.executeQuery()

        val b = Vector.newBuilder[(Long, Array[Byte])]
        while (rs.next()) b += (rs.getLong(1) -> rs.getBytes(2))
        b.result()
      } finally s.close()
    }
  }

  def query(): Unit =
    if (buf.isEmpty) {
      try {
        val result = Select.run(tag, currentOffset, Limit)
        currentOffset = if (result.nonEmpty) result.last._1 else currentOffset
        val serialization = SerializationExtension(context.system)

        buf = result.map {
          case (id, bytes) =>
            val p = serialization.deserialize(bytes, classOf[PersistentRepr]).get
            EventEnvelope(offset = Sequence(id), p.persistenceId, p.sequenceNr, p.payload)
        }
      } catch {
        case e: Exception =>
          onErrorThenStop(e)
      }
    }

  final def deliverBuf(): Unit =
    if (totalDemand > 0 && buf.nonEmpty) {
      if (totalDemand <= Int.MaxValue) {
        val (use, keep) = buf.splitAt(totalDemand.toInt)
        buf = keep
        use.foreach(onNext)
      } else {
        buf.foreach(onNext)
        buf = Vector.empty
      }
    }
}
```

Java

```
[source](https://github.com/akka/akka/tree/v2.5.32/akka-docs/src/test/java/jdocs/persistence/query/MyEventsByTagJavaPublisher.java#L31-L134 "Go to snippet source")class MyEventsByTagJavaPublisher extends AbstractActorPublisher<EventEnvelope> {
  private final Serialization serialization = SerializationExtension.get(getContext().getSystem());

  private final Connection connection;

  private final String tag;

  private final String CONTINUE = "CONTINUE";
  private final int LIMIT = 1000;
  private long currentOffset;
  private List<EventEnvelope> buf = new LinkedList<>();

  private Cancellable continueTask;

  public MyEventsByTagJavaPublisher(
      Connection connection, String tag, Long offset, Duration refreshInterval) {
    this.connection = connection;
    this.tag = tag;
    this.currentOffset = offset;

    final Scheduler scheduler = getContext().getSystem().scheduler();
    this.continueTask =
        scheduler.schedule(
            refreshInterval,
            refreshInterval,
            getSelf(),
            CONTINUE,
            getContext().getDispatcher(),
            getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            CONTINUE,
            (in) -> {
              query();
              deliverBuf();
            })
        .match(
            Cancel.class,
            (in) -> {
              getContext().stop(getSelf());
            })
        .build();
  }

  public static Props props(Connection conn, String tag, Long offset, Duration refreshInterval) {
    return Props.create(
        MyEventsByTagJavaPublisher.class,
        () -> new MyEventsByTagJavaPublisher(conn, tag, offset, refreshInterval));
  }

  @Override
  public void postStop() {
    continueTask.cancel();
  }

  private void query() {
    if (buf.isEmpty()) {
      final String query =
          "SELECT id, persistent_repr "
              + "FROM journal WHERE tag = ? AND id > ? "
              + "ORDER BY id LIMIT ?";

      try (PreparedStatement s = connection.prepareStatement(query)) {
        s.setString(1, tag);
        s.setLong(2, currentOffset);
        s.setLong(3, LIMIT);
        try (ResultSet rs = s.executeQuery()) {

          final List<Pair<Long, byte[]>> res = new ArrayList<>(LIMIT);
          while (rs.next()) res.add(Pair.create(rs.getLong(1), rs.getBytes(2)));

          if (!res.isEmpty()) {
            currentOffset = res.get(res.size() - 1).first();
          }

          buf =
              res.stream()
                  .map(
                      in -> {
                        final Long id = in.first();
                        final byte[] bytes = in.second();

                        final PersistentRepr p =
                            serialization.deserialize(bytes, PersistentRepr.class).get();

                        return new EventEnvelope(
                            Offset.sequence(id), p.persistenceId(), p.sequenceNr(), p.payload());
                      })
                  .collect(toList());
        }
      } catch (Exception e) {
        onErrorThenStop(e);
      }
    }
  }

  private void deliverBuf() {
    while (totalDemand() > 0 && !buf.isEmpty()) onNext(buf.remove(0));
  }
}
```

The `ReadJournalProvider` class must have a constructor with one of these signatures:

- constructor with a `ExtendedActorSystem` parameter, a `com.typesafe.config.Config` parameter, and a `String` parameter for the config path
- constructor with a `ExtendedActorSystem` parameter, and a `com.typesafe.config.Config` parameter
- constructor with one `ExtendedActorSystem` parameter
- constructor without parameters

The plugin section of the actor system’s config will be passed in the config constructor parameter. The config path of the plugin is passed in the `String` parameter.

If the underlying datastore only supports queries that are completed when they reach the end of the “result set”, the journal has to submit new queries after a while in order to support “infinite” event streams that include events stored after the initial query has completed. It is recommended that the plugin use a configuration property named `refresh-interval` for defining such a refresh interval. 

## Scaling out

In a use case where the number of events are very high, the work needed for each event is high or where resilience is important so that if a node crashes the persistent queries are quickly started on a new node and can resume operations [Cluster Sharding](cluster-sharding.html) together with event tagging is an excellent fit to shard events over a cluster.

The [Lagom framework](https://www.lagomframework.com), which is built on top of Akka encodes many of the best practices around this. For more details see [Managing Data Persistence](https://www.lagomframework.com/documentation/current/java/ES_CQRS.html) [Managing Data Persistence](https://www.lagomframework.com/documentation/current/scala/ES_CQRS.html) and [Persistent Entity](https://www.lagomframework.com/documentation/current/java/PersistentEntity.html) [Persistent Entity](https://www.lagomframework.com/documentation/current/scala/PersistentEntity.html) in the Lagom documentation.

### Plugin TCK

TODO, not available yet.

## Code Examples

### Example 1: Dependency

```scala
libraryDependencies += "com.typesafe.akka" %% "akka-persistence-query" % "2.5.32"
```

### Example 2: Dependency

```xml
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_2.12</artifactId>
    <version>2.5.32</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependency

```gradle
dependencies {
  implementation "com.typesafe.akka:akka-persistence-query_2.12:2.5.32"
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
implicit val mat = ActorMaterializer()
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
ActorMaterializer mat = ActorMaterializer.create(system);
source.runForeach(event -> System.out.println("Event: " + event), mat);
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
import akka.persistence.journal.WriteEventAdapter
import akka.persistence.journal.Tagged

class MyTaggingEventAdapter extends WriteEventAdapter {
  val colors = Set("green", "black", "blue")
  override def toJournal(event: Any): Any = event match {
    case s: String =>
      var tags = colors.foldLeft(Set.empty[String]) { (acc, c) =>
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

### Example 14: EventsByTag and CurrentEventsByTag

```scala
// assuming journal is able to work with numeric offsets we can:

val blueThings: Source[EventEnvelope, NotUsed] =
  readJournal.eventsByTag("blue", Offset.noOffset)

// find top 10 blue things:
val top10BlueThings: Future[Vector[Any]] =
  blueThings
    .map(_.event)
    .take(10) // cancels the query stream after pulling 10 elements
    .runFold(Vector.empty[Any])(_ :+ _)

// start another query, from the known offset
val furtherBlueThings = readJournal.eventsByTag("blue", offset = Sequence(10))
```

### Example 15: EventsByTag and CurrentEventsByTag

```java
// assuming journal is able to work with numeric offsets we can:
final Source<EventEnvelope, NotUsed> blueThings =
    readJournal.eventsByTag("blue", new Sequence(0L));

// find top 10 blue things:
final CompletionStage<List<Object>> top10BlueThings =
    blueThings
        .map(EventEnvelope::event)
        .take(10) // cancels the query stream after pulling 10 elements
        .runFold(
            new ArrayList<>(10),
            (acc, e) -> {
              acc.add(e);
              return acc;
            },
            mat);

// start another query, from the known offset
Source<EventEnvelope, NotUsed> blue = readJournal.eventsByTag("blue", new Sequence(10));
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
    .runWith(Sink.ignore(), mat);
```

### Example 22: Materialize view to Reactive Streams compatible datastore

```scala
implicit val system = ActorSystem()
implicit val mat = ActorMaterializer()

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
    .runWith(Sink.fromSubscriber(dbBatchWriter), mat); // write batches to read-side database
```

### Example 24: Materialize view using mapAsync

```scala
trait ExampleStore {
  def save(event: Any): Future[Unit]
}
```

### Example 25: Materialize view using mapAsync

```java
class ExampleStore {
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
    .runWith(Sink.ignore(), mat);
```

### Example 28: Resumable projections

```scala
import akka.pattern.ask
import system.dispatcher
implicit val timeout = Timeout(3.seconds)

val bidProjection = new MyResumableProjection("bid")

val writerProps = Props(classOf[TheOneWhoWritesToQueryJournal], "bid")
val writer = system.actorOf(writerProps, "bid-projection-writer")

bidProjection.latestOffset.foreach { startFromOffset =>
  readJournal
    .eventsByTag("bid", Sequence(startFromOffset))
    .mapAsync(8) { envelope =>
      (writer ? envelope.event).map(_ => envelope.offset)
    }
    .mapAsync(1) { offset =>
      bidProjection.saveProgress(offset)
    }
    .runWith(Sink.ignore)
}
```

### Example 29: Resumable projections

```java
final Duration timeout = Duration.ofSeconds(3);

  final MyResumableProjection bidProjection = new MyResumableProjection("bid");

  final Props writerProps = Props.create(TheOneWhoWritesToQueryJournal.class, "bid");
  final ActorRef writer = system.actorOf(writerProps, "bid-projection-writer");

  long startFromOffset =
      bidProjection.latestOffset().toCompletableFuture().get(3, TimeUnit.SECONDS);

  readJournal
      .eventsByTag("bid", new Sequence(startFromOffset))
      .mapAsync(
          8,
          envelope -> {
            final CompletionStage<Object> f = ask(writer, envelope.event(), timeout);
            return f.thenApplyAsync(in -> envelope.offset(), system.dispatcher());
          })
      .mapAsync(1, offset -> bidProjection.saveProgress(offset))
      .runWith(Sink.ignore(), mat);
}
```

### Example 30: Resumable projections

```scala
class TheOneWhoWritesToQueryJournal(id: String) extends Actor {
  val store = new DummyStore()

  var state: ComplexState = ComplexState()

  def receive = {
    case m =>
      state = updateState(state, m)
      if (state.readyToSave) store.save(Record(state))
  }

  def updateState(state: ComplexState, msg: Any): ComplexState = {
    // some complicated aggregation logic here ...
    state
  }
}
```

### Example 31: Resumable projections

```java
final class TheOneWhoWritesToQueryJournal extends AbstractActor {
  private final ExampleStore store;

  private ComplexState state = new ComplexState();

  public TheOneWhoWritesToQueryJournal() {
    store = new ExampleStore();
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchAny(
            message -> {
              state = updateState(state, message);

              // example saving logic that requires state to become ready:
              if (state.readyToSave()) store.save(Record.of(state));
            })
        .build();
  }

  ComplexState updateState(ComplexState state, Object msg) {
    // some complicated aggregation logic here ...
    return state;
  }
}
```

### Example 32: ReadJournal plugin API

```scala
class MyReadJournalProvider(system: ExtendedActorSystem, config: Config) extends ReadJournalProvider {

  override val scaladslReadJournal: MyScaladslReadJournal =
    new MyScaladslReadJournal(system, config)

  override val javadslReadJournal: MyJavadslReadJournal =
    new MyJavadslReadJournal(scaladslReadJournal)
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
      val props = MyEventsByTagPublisher.props(tag, offsetValue, refreshInterval)
      Source.actorPublisher[EventEnvelope](props).mapMaterializedValue(_ => NotUsed)
    case NoOffset => eventsByTag(tag, Sequence(0L)) //recursive
    case _ =>
      throw new IllegalArgumentException("LevelDB does not support " + offset.getClass.getName + " offsets")
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
    import akka.util.ccompat.JavaConverters._
    scaladslReadJournal.byTagsWithMeta(tags.asScala.toSet).asJava
  }
}
```

### Example 33: ReadJournal plugin API

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

  private final FiniteDuration refreshInterval;

  public MyJavadslReadJournal(ExtendedActorSystem system, Config config) {
    refreshInterval =
        FiniteDuration.create(
            config.getDuration("refresh-interval", TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS);
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
      final Props props =
          MyEventsByTagPublisher.props(tag, sequenceOffset.value(), refreshInterval);
      return Source.<EventEnvelope>actorPublisher(props)
          .mapMaterializedValue(m -> NotUsed.getInstance());
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
    Set<String> jTags = scala.collection.JavaConverters.setAsJavaSetConverter(tags).asJava();
    return javadslReadJournal.byTagsWithMeta(jTags).asScala();
  }
}
```

### Example 34: ReadJournal plugin API

```scala
class MyEventsByTagPublisher(tag: String, offset: Long, refreshInterval: FiniteDuration)
    extends ActorPublisher[EventEnvelope] {

  private case object Continue

  private val connection: java.sql.Connection = ???

  private val Limit = 1000
  private var currentOffset = offset
  var buf = Vector.empty[EventEnvelope]

  import context.dispatcher
  val continueTask = context.system.scheduler.schedule(refreshInterval, refreshInterval, self, Continue)

  override def postStop(): Unit = {
    continueTask.cancel()
  }

  def receive = {
    case _: Request | Continue =>
      query()
      deliverBuf()

    case Cancel =>
      context.stop(self)
  }

  object Select {
    private def statement() = connection.prepareStatement("""
        SELECT id, persistent_repr FROM journal
        WHERE tag = ? AND id > ?
        ORDER BY id LIMIT ?
      """)

    def run(tag: String, from: Long, limit: Int): Vector[(Long, Array[Byte])] = {
      val s = statement()
      try {
        s.setString(1, tag)
        s.setLong(2, from)
        s.setLong(3, limit)
        val rs = s.executeQuery()

        val b = Vector.newBuilder[(Long, Array[Byte])]
        while (rs.next()) b += (rs.getLong(1) -> rs.getBytes(2))
        b.result()
      } finally s.close()
    }
  }

  def query(): Unit =
    if (buf.isEmpty) {
      try {
        val result = Select.run(tag, currentOffset, Limit)
        currentOffset = if (result.nonEmpty) result.last._1 else currentOffset
        val serialization = SerializationExtension(context.system)

        buf = result.map {
          case (id, bytes) =>
            val p = serialization.deserialize(bytes, classOf[PersistentRepr]).get
            EventEnvelope(offset = Sequence(id), p.persistenceId, p.sequenceNr, p.payload)
        }
      } catch {
        case e: Exception =>
          onErrorThenStop(e)
      }
    }

  final def deliverBuf(): Unit =
    if (totalDemand > 0 && buf.nonEmpty) {
      if (totalDemand <= Int.MaxValue) {
        val (use, keep) = buf.splitAt(totalDemand.toInt)
        buf = keep
        use.foreach(onNext)
      } else {
        buf.foreach(onNext)
        buf = Vector.empty
      }
    }
}
```

### Example 35: ReadJournal plugin API

```java
class MyEventsByTagJavaPublisher extends AbstractActorPublisher<EventEnvelope> {
  private final Serialization serialization = SerializationExtension.get(getContext().getSystem());

  private final Connection connection;

  private final String tag;

  private final String CONTINUE = "CONTINUE";
  private final int LIMIT = 1000;
  private long currentOffset;
  private List<EventEnvelope> buf = new LinkedList<>();

  private Cancellable continueTask;

  public MyEventsByTagJavaPublisher(
      Connection connection, String tag, Long offset, Duration refreshInterval) {
    this.connection = connection;
    this.tag = tag;
    this.currentOffset = offset;

    final Scheduler scheduler = getContext().getSystem().scheduler();
    this.continueTask =
        scheduler.schedule(
            refreshInterval,
            refreshInterval,
            getSelf(),
            CONTINUE,
            getContext().getDispatcher(),
            getSelf());
  }

  @Override
  public Receive createReceive() {
    return receiveBuilder()
        .matchEquals(
            CONTINUE,
            (in) -> {
              query();
              deliverBuf();
            })
        .match(
            Cancel.class,
            (in) -> {
              getContext().stop(getSelf());
            })
        .build();
  }

  public static Props props(Connection conn, String tag, Long offset, Duration refreshInterval) {
    return Props.create(
        MyEventsByTagJavaPublisher.class,
        () -> new MyEventsByTagJavaPublisher(conn, tag, offset, refreshInterval));
  }

  @Override
  public void postStop() {
    continueTask.cancel();
  }

  private void query() {
    if (buf.isEmpty()) {
      final String query =
          "SELECT id, persistent_repr "
              + "FROM journal WHERE tag = ? AND id > ? "
              + "ORDER BY id LIMIT ?";

      try (PreparedStatement s = connection.prepareStatement(query)) {
        s.setString(1, tag);
        s.setLong(2, currentOffset);
        s.setLong(3, LIMIT);
        try (ResultSet rs = s.executeQuery()) {

          final List<Pair<Long, byte[]>> res = new ArrayList<>(LIMIT);
          while (rs.next()) res.add(Pair.create(rs.getLong(1), rs.getBytes(2)));

          if (!res.isEmpty()) {
            currentOffset = res.get(res.size() - 1).first();
          }

          buf =
              res.stream()
                  .map(
                      in -> {
                        final Long id = in.first();
                        final byte[] bytes = in.second();

                        final PersistentRepr p =
                            serialization.deserialize(bytes, PersistentRepr.class).get();

                        return new EventEnvelope(
                            Offset.sequence(id), p.persistenceId(), p.sequenceNr(), p.payload());
                      })
                  .collect(toList());
        }
      } catch (Exception e) {
        onErrorThenStop(e);
      }
    }
  }

  private void deliverBuf() {
    while (totalDemand() > 0 && !buf.isEmpty()) onNext(buf.remove(0));
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/libraries/akka-core/2.5/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.5/persistence-query-leveldb.html
- https://doc.akka.io/libraries/akka-core/2.5/persistence-schema-evolution.html
- https://doc.akka.io/libraries/akka-core/2.5/persistence.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/index.html
- https://doc.akka.io/libraries/akka-core/2.5/stream/stream-quickstart.html

---
*Source: [https://doc.akka.io/libraries/akka-core/2.5/persistence-query.html](https://doc.akka.io/libraries/akka-core/2.5/persistence-query.html)*