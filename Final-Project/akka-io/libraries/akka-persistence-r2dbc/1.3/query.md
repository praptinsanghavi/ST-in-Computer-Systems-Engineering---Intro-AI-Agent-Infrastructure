---
description: An Akka Persistence backed by SQL database with R2DBC
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:29:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-r2dbc/current/query.html
title: Query Plugin • Akka Persistence R2DBC Documentation
---

# Query Plugin • Akka Persistence R2DBC Documentation

> **Summary:** An Akka Persistence backed by SQL database with R2DBC

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Query Plugin

## Event sourced queries

[`R2dbcReadJournal`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html "akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal")[`R2dbcReadJournal`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/scaladsl/R2dbcReadJournal.html "akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal") implements the following [Persistence Queries](https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html):

- `eventsByPersistenceId`, `currentEventsByPersistenceId`
- `eventsBySlices`, `currentEventsBySlices`
- `currentPersistenceIds`

Accessing the `R2dbcReadJournal`:

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/query/QueryDocCompileOnly.java#L17-L51 "Go to snippet source")import akka.persistence.query.PersistenceQuery;
import akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal;

R2dbcReadJournal eventQueries =
    PersistenceQuery.get(system)
        .getReadJournalFor(R2dbcReadJournal.class, R2dbcReadJournal.Identifier());
```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/query/QueryDocCompileOnly.scala#L18-L22 "Go to snippet source")import akka.persistence.query.PersistenceQuery
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal

val eventQueries = PersistenceQuery(system)
  .readJournalFor[R2dbcReadJournal](R2dbcReadJournal.Identifier)
```

### eventsByPersistenceId

The `eventsByPersistenceId` and `currentEventsByPersistenceId` queries are useful for retrieving events for a single entity with a given persistence id.

Example of `currentEventsByPersistenceId`:

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/query/QueryDocCompileOnly.java#L63-L67 "Go to snippet source")PersistenceId persistenceId = PersistenceId.of("MyEntity", "id1");
eventQueries
    .currentEventsByPersistenceId(persistenceId.id(), 1, 101)
    .map(envelope -> "event with seqNr " + envelope.sequenceNr() + ": " + envelope.event())
    .runWith(Sink.foreach(System.out::println), system);
```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/query/QueryDocCompileOnly.scala#L35-L39 "Go to snippet source")val persistenceId = PersistenceId("MyEntity", "id1")
eventQueries
  .currentEventsByPersistenceId(persistenceId.id, 1, 101)
  .map(envelope => s"event with seqNr ${envelope.sequenceNr}: ${envelope.event}")
  .runWith(Sink.foreach(println))
```

### eventsByPersistenceIdStartingFromSnapshot

Same as `eventsByPersistenceId` but with the purpose to use snapshot as starting point and thereby reducing number of events that have to be loaded.

First it tries to load the snapshot, if any, with sequence number within the given `fromSequenceNr` and `toSequenceNr` (inclusive) range. There is at most one snapshot per persistenceId. The snapshot is transformed to an event with the given `transformSnapshot` function.

After emitting the snapshot event the ordinary events with sequence numbers after the snapshots are emitted.

To use `eventsByPersistenceIdStartingFromSnapshot` or `currentEventsByPersistenceIdStartingFromSnapshot` you must follow instructions in [migration guide](migration-guide.html#eventsBySlicesStartingFromSnapshots) and enable configuration:

```
akka.persistence.r2dbc.query.start-from-snapshot.enabled = true

```

### eventsBySlices

The `eventsBySlices` and `currentEventsBySlices` queries are useful for retrieving all events for a given entity type. `eventsBySlices` should be used via Akka Projection.

Note
This has historically been done with `eventsByTag` but the R2DBC plugin is instead providing `eventsBySlices` as an improved solution.

The usage of `eventsByTag` for Projections has the drawback that the number of tags must be decided up\-front and can’t easily be changed afterwards. Starting with too many tags means much overhead since many projection instances would be running on each node in a small Akka Cluster. Each projection instance polling the database periodically. Starting with too few tags means that it can’t be scaled later to more Akka nodes.

With `eventsBySlices` more Projection instances can be added when needed and still reuse the offsets for the previous slice distributions.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all persistence ids over the slices. The `eventsBySlices` query is for a range of the slices. For example if using 1024 slices and running 4 Projection instances the slice ranges would be 0\-255, 256\-511, 512\-767, 768\-1023\. Changing to 8 slice ranges means that the ranges would be 0\-127, 128\-255, 256\-383, …, 768\-895, 896\-1023\.

Example of `currentEventsBySlices`:

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/query/QueryDocCompileOnly.java#L29-L92 "Go to snippet source")import akka.stream.javadsl.Source;
import akka.persistence.query.typed.EventEnvelope;

// Split the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges = eventQueries.sliceRanges(numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";
Source<EventEnvelope<MyEvent>, NotUsed> source =
    eventQueries.currentEventsBySlices(entityType, minSlice, maxSlice, NoOffset.getInstance());
source
    .map(
        envelope ->
            "event from persistenceId "
                + envelope.persistenceId()
                + " with seqNr "
                + envelope.sequenceNr()
                + ": "
                + envelope.event())
    .runWith(Sink.foreach(System.out::println), system);
```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/query/QueryDocCompileOnly.scala#L45-L60 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges = eventQueries.sliceRanges(numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "MyEntity"
eventQueries
  .currentEventsBySlices[MyEvent](entityType, minSlice, maxSlice, NoOffset.getInstance)
  .map(envelope =>
    s"event from persistenceId ${envelope.persistenceId} with " +
    s"seqNr ${envelope.sequenceNr}: ${envelope.event}")
  .runWith(Sink.foreach(println))
```

`eventsBySlices` should be used via [R2dbcProjection](projection.html), which will automatically handle the following difficulties. When using `R2dbcProjection` the events will be delivered in sequence number order without duplicates.

The consumer can keep track of its current position in the event stream by storing the `offset` and restart the query from a given `offset` after a crash/restart.

The offset is a `TimestampOffset` and it is based on the database `CURRENT_TIMESTAMP` when the event was stored. `CURRENT_TIMESTAMP` is the time when the transaction started, not when it was committed. This means that a “later” event may be visible first and when retrieving events after the previously seen timestamp we may miss some events and emit event with a later sequence number for a persistence id without emitting all preceding events. In distributed SQL databases there can also be clock skews for the database timestamps. For that reason `eventsBySlices` will perform additional backtracking queries to catch missed events. Events from backtracking will typically be duplicates of previously emitted events. It’s the responsibility of the consumer to filter duplicates and make sure that events are processed in exact sequence number order for each persistence id. Such deduplication is provided by the R2DBC Projection.

Events emitted by the backtracking don’t contain the event payload (`EventBySliceEnvelope.event` is None) and the consumer can load the full `EventBySliceEnvelope` with [R2dbcReadJournal.loadEnvelope](./R2dbcReadJournal.loadEnvelope.html).

The events will be emitted in the timestamp order with the caveat of duplicate events as described above. Events with the same timestamp are ordered by sequence number.

`currentEventsBySlices` doesn’t perform these backtracking queries and will not emit duplicates and the event payload is always full loaded.

### eventsBySlicesStartingFromSnapshots

Same as `eventsBySlices` but with the purpose to use snapshots as starting points and thereby reducing number of events that have to be processed. This can be useful if the consumer start from zero without any previously processed offset or if it has been disconnected for a long while and its offset is far behind.

The snapshot is transformed to an event with the given `transformSnapshot` function.

Snapshot events and ordinary events are interleaved, skipping events before known snapshots. After emitting the snapshot events the ordinary events with sequence numbers after the snapshots are emitted.

To use `eventsBySlicesStartingFromSnapshots` or `currentEventsBySlicesStartingFromSnapshots` you must follow instructions in [migration guide](migration-guide.html#eventsBySlicesStartingFromSnapshots) and enable configuration:

```
akka.persistence.r2dbc.query.start-from-snapshot.enabled = true

```

### Publish events for lower latency of eventsBySlices

The `eventsBySlices` query polls the database periodically to find new events. By default, this interval is a few seconds, see `akka.persistence.r2dbc.query.refresh-interval` in the [Configuration](query.html#configuration). This interval can be reduced for lower latency, with the drawback of querying the database more frequently.

To reduce the latency there is a feature that will publish the events within the Akka Cluster. Running `eventsBySlices` will subscribe to the events and emit them directly without waiting for next query poll. The tradeoff is that more CPU and network resources are used. The events must still be retrieved from the database, but at a lower polling frequency, because delivery of published messages are not guaranteed.

This feature is enabled by default and it will measure the throughput and automatically disable/enable if the exponentially weighted moving average of measured throughput exceeds the configured threshold.

```
akka.persistence.r2dbc.journal.publish-events-dynamic.throughput-threshold = 400

```

Disable publishing of events with configuration:

```
akka.persistence.r2dbc.journal.publish-events = off

```

If you use many queries or Projection instances you should consider adjusting the `akka.persistence.r2dbc.journal.publish-events-number-of-topics` configuration, see [Configuration](query.html#configuration).

## Durable state queries

[`R2dbcDurableStateStore`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore.html "akka.persistence.r2dbc.state.javadsl.R2dbcDurableStateStore")[`R2dbcDurableStateStore`](/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html "akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore") implements the following [Persistence Queries](https://doc.akka.io/libraries/akka-core/2.10/durable-state/persistence-query.html):

- `getObject`
- `changesBySlices`, `currentChangesBySlices`
- `currentPersistenceIds`

Accessing the `R2dbcDurableStateStore`:

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/query/QueryDocCompileOnly.java#L23-L58 "Go to snippet source")import akka.persistence.r2dbc.state.javadsl.R2dbcDurableStateStore;
import akka.persistence.state.DurableStateStoreRegistry;

R2dbcDurableStateStore<MyState> stateQueries =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            R2dbcDurableStateStore.class, R2dbcDurableStateStore.Identifier());
```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/query/QueryDocCompileOnly.scala#L26-L30 "Go to snippet source")import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore

val stateQueries = DurableStateStoreRegistry(system)
  .durableStateStoreFor[R2dbcDurableStateStore[MyState]](R2dbcDurableStateStore.Identifier)
```

### changesBySlices

The `changesBySlices` and `currentChangesBySlices` queries are useful for retrieving updates of the latest durable state for a given entity type.

Example of `currentChangesBySlices`:

Java

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/java/jdocs/home/query/QueryDocCompileOnly.java#L35-L118 "Go to snippet source")import akka.persistence.query.DurableStateChange;
import akka.persistence.query.UpdatedDurableState;

// Split the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges = stateQueries.sliceRanges(numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";
Source<DurableStateChange<MyState>, NotUsed> source =
    stateQueries.currentChangesBySlices(entityType, minSlice, maxSlice, NoOffset.getInstance());
source
    .collectType(UpdatedDurableState.class)
    .map(
        change ->
            "state change from persistenceId "
                + change.persistenceId()
                + " with revision "
                + change.revision()
                + ": "
                + change.value())
    .runWith(Sink.foreach(System.out::println), system);
```

Scala

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/docs/src/test/scala/docs/home/query/QueryDocCompileOnly.scala#L66-L82 "Go to snippet source")import akka.persistence.query.UpdatedDurableState

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges = stateQueries.sliceRanges(numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "MyEntity"
stateQueries
  .currentChangesBySlices(entityType, minSlice, maxSlice, NoOffset.getInstance)
  .collect { case change: UpdatedDurableState[MyState] => change }
  .map(change =>
    s"state change from persistenceId ${change.persistenceId} with " +
    s"revision ${change.revision}: ${change.value}")
  .runWith(Sink.foreach(println))
```

The emitted `DurableStateChange` can be a `UpdatedDurableState` or `DeletedDurableState`.

It will emit an `UpdatedDurableState` when the durable state is updated. When the state is updated again another `UpdatedDurableState` is emitted. It will always emit an `UpdatedDurableState` for the latest revision of the state, but there is no guarantee that all intermediate changes are emitted if the state is updated several times. Note that `UpdatedDurableState` contains the full current state, and it is not a delta from previous revision of state.

It will emit an `DeletedDurableState` when the durable state is deleted. When the state is updated again a new `UpdatedDurableState` is emitted. There is no guarantee that all intermediate changes are emitted if the state is updated or deleted several times.

`changesBySlices` should be used via [R2dbcProjection](projection.html), which will automatically handle the similar difficulties with duplicates as described for [eventsBySlices](query.html#eventsbyslices). When using `R2dbcProjection` the changes will be delivered in revision number order without duplicates.

## Configuration

Query configuration is under `akka.persistence.r2dbc.query`. Here’s the default configuration values for the query plugin:

```
[source](https://github.com/akka/akka-persistence-r2dbc/tree/v1.3.12/core/src/main/resources/reference.conf#L122-L190 "Go to snippet source")akka.persistence.r2dbc {
  query {
    class = "akka.persistence.r2dbc.query.R2dbcReadJournalProvider"

    # When live queries return no results or <= 10% of buffer-size, the next query
    # to db will be delayed for this duration.
    # When the number of rows from previous query is >= 90% of buffer-size, the next
    # query will be emitted immediately.
    # Otherwise, between 10% - 90% of buffer-size, the next query will be delayed
    # for half of this duration.
    refresh-interval = 3s

    # Live queries read events up to this duration from the current database time.
    behind-current-time = 100 millis

    backtracking {
      enabled = on
      # Backtracking queries will look back for this amount of time. It should
      # not be larger than the akka.projection.r2dbc.offset-store.time-window.
      window = 2 minutes
      # Backtracking queries read events up to this duration from the current database time.
      behind-current-time = 10 seconds
    }

    # In-memory buffer holding events when reading from database.
    buffer-size = 1000

    persistence-ids {
      buffer-size = 1000
    }

    # When journal publish-events is enabled a best effort deduplication can be enabled by setting
    # this property to the size of the deduplication buffer in the `eventsBySlices` query.
    # It keeps track of this number of entries and 5000 is recommended capacity. The drawback
    # of enabling this is that when the sequence numbers received via publish-events are out of sync
    # after some error scenarios it will take longer to receive those events, since it will rely on
    # the backtracking queries.
    deduplicate-capacity = 0

    # Settings for eventsBySlicesStartingFromSnapshots and currentEventsBySlicesStartingFromSnapshots
    start-from-snapshot {
      # Set this to on true if eventsBySlicesStartingFromSnapshots or
      # currentEventsBySlicesStartingFromSnapshots are used. That has a small overhead when storing
      # snapshots because the timestamp and tags of the corresponding event is retrieved when storing
      # a snapshot.
      enabled = false

      # For filtering the events before the snapshots it keeps track of sequence numbers for
      # the snapshots. This is the max size of the cache for these sequence numbers. When missing
      # in the cache it will load the sequence number from the database.
      cache-capacity = 10000

      # When filtering many events before the snapshots it is still good to occasionally emit
      # fictive heartbeat events for progress observations and offset storage downstreams.
      # This is the number of filtered events until a heartbeat is emitted.
      heartbeat-after = 1000
    }

    # Cache TTL for latestEventTimestamp queries. Setting this to a positive duration enables caching of
    # query results to reduce database load for projection backlog status checks.
    # Set to off, none, or 0 to disable caching.
    cache-latest-event-timestamp = off

    # Estimate time ranges to optimize slice-based query performance.
    # Uses additional queries to count events or state changes into time buckets.
    estimate-time-range = on
  }
}
```

The query plugin shares the connection pool as the rest of the plugin, see [Connection configuration](config.html#connection-configuration).

## Code Examples

### Example 1: Event sourced queries

```java
import akka.persistence.query.PersistenceQuery;
import akka.persistence.r2dbc.query.javadsl.R2dbcReadJournal;

R2dbcReadJournal eventQueries =
    PersistenceQuery.get(system)
        .getReadJournalFor(R2dbcReadJournal.class, R2dbcReadJournal.Identifier());
```

### Example 2: Event sourced queries

```scala
import akka.persistence.query.PersistenceQuery
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal

val eventQueries = PersistenceQuery(system)
  .readJournalFor[R2dbcReadJournal](R2dbcReadJournal.Identifier)
```

### Example 3: eventsByPersistenceId

```java
PersistenceId persistenceId = PersistenceId.of("MyEntity", "id1");
eventQueries
    .currentEventsByPersistenceId(persistenceId.id(), 1, 101)
    .map(envelope -> "event with seqNr " + envelope.sequenceNr() + ": " + envelope.event())
    .runWith(Sink.foreach(System.out::println), system);
```

### Example 4: eventsByPersistenceId

```scala
val persistenceId = PersistenceId("MyEntity", "id1")
eventQueries
  .currentEventsByPersistenceId(persistenceId.id, 1, 101)
  .map(envelope => s"event with seqNr ${envelope.sequenceNr}: ${envelope.event}")
  .runWith(Sink.foreach(println))
```

### Example 5: eventsByPersistenceIdStartingFromSnapshot

```hcon
akka.persistence.r2dbc.query.start-from-snapshot.enabled = true
```

### Example 6: eventsBySlices

```java
import akka.stream.javadsl.Source;
import akka.persistence.query.typed.EventEnvelope;

// Split the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges = eventQueries.sliceRanges(numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";
Source<EventEnvelope<MyEvent>, NotUsed> source =
    eventQueries.currentEventsBySlices(entityType, minSlice, maxSlice, NoOffset.getInstance());
source
    .map(
        envelope ->
            "event from persistenceId "
                + envelope.persistenceId()
                + " with seqNr "
                + envelope.sequenceNr()
                + ": "
                + envelope.event())
    .runWith(Sink.foreach(System.out::println), system);
```

### Example 7: eventsBySlices

```scala
import akka.persistence.query.typed.EventEnvelope

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges = eventQueries.sliceRanges(numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "MyEntity"
eventQueries
  .currentEventsBySlices[MyEvent](entityType, minSlice, maxSlice, NoOffset.getInstance)
  .map(envelope =>
    s"event from persistenceId ${envelope.persistenceId} with " +
    s"seqNr ${envelope.sequenceNr}: ${envelope.event}")
  .runWith(Sink.foreach(println))
```

### Example 8: eventsBySlicesStartingFromSnapshots

```hcon
akka.persistence.r2dbc.query.start-from-snapshot.enabled = true
```

### Example 9: Publish events for lower latency of eventsBySlices

```text
akka.persistence.r2dbc.journal.publish-events-dynamic.throughput-threshold = 400
```

### Example 10: Publish events for lower latency of eventsBySlices

```text
akka.persistence.r2dbc.journal.publish-events = off
```

### Example 11: Durable state queries

```java
import akka.persistence.r2dbc.state.javadsl.R2dbcDurableStateStore;
import akka.persistence.state.DurableStateStoreRegistry;

R2dbcDurableStateStore<MyState> stateQueries =
    DurableStateStoreRegistry.get(system)
        .getDurableStateStoreFor(
            R2dbcDurableStateStore.class, R2dbcDurableStateStore.Identifier());
```

### Example 12: Durable state queries

```scala
import akka.persistence.state.DurableStateStoreRegistry
import akka.persistence.r2dbc.state.scaladsl.R2dbcDurableStateStore

val stateQueries = DurableStateStoreRegistry(system)
  .durableStateStoreFor[R2dbcDurableStateStore[MyState]](R2dbcDurableStateStore.Identifier)
```

### Example 13: changesBySlices

```java
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.UpdatedDurableState;

// Split the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges = stateQueries.sliceRanges(numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";
Source<DurableStateChange<MyState>, NotUsed> source =
    stateQueries.currentChangesBySlices(entityType, minSlice, maxSlice, NoOffset.getInstance());
source
    .collectType(UpdatedDurableState.class)
    .map(
        change ->
            "state change from persistenceId "
                + change.persistenceId()
                + " with revision "
                + change.revision()
                + ": "
                + change.value())
    .runWith(Sink.foreach(System.out::println), system);
```

### Example 14: changesBySlices

```scala
import akka.persistence.query.UpdatedDurableState

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges = stateQueries.sliceRanges(numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "MyEntity"
stateQueries
  .currentChangesBySlices(entityType, minSlice, maxSlice, NoOffset.getInstance)
  .collect { case change: UpdatedDurableState[MyState] => change }
  .map(change =>
    s"state change from persistenceId ${change.persistenceId} with " +
    s"revision ${change.revision}: ${change.value}")
  .runWith(Sink.foreach(println))
```

### Example 15: Configuration

```conf
akka.persistence.r2dbc {
  query {
    class = "akka.persistence.r2dbc.query.R2dbcReadJournalProvider"

    # When live queries return no results or <= 10% of buffer-size, the next query
    # to db will be delayed for this duration.
    # When the number of rows from previous query is >= 90% of buffer-size, the next
    # query will be emitted immediately.
    # Otherwise, between 10% - 90% of buffer-size, the next query will be delayed
    # for half of this duration.
    refresh-interval = 3s

    # Live queries read events up to this duration from the current database time.
    behind-current-time = 100 millis

    backtracking {
      enabled = on
      # Backtracking queries will look back for this amount of time. It should
      # not be larger than the akka.projection.r2dbc.offset-store.time-window.
      window = 2 minutes
      # Backtracking queries read events up to this duration from the current database time.
      behind-current-time = 10 seconds
    }

    # In-memory buffer holding events when reading from database.
    buffer-size = 1000

    persistence-ids {
      buffer-size = 1000
    }

    # When journal publish-events is enabled a best effort deduplication can be enabled by setting
    # this property to the size of the deduplication buffer in the `eventsBySlices` query.
    # It keeps track of this number of entries and 5000 is recommended capacity. The drawback
    # of enabling this is that when the sequence numbers received via publish-events are out of sync
    # after some error scenarios it will take longer to receive those events, since it will rely on
    # the backtracking queries.
    deduplicate-capacity = 0

    # Settings for eventsBySlicesStartingFromSnapshots and currentEventsBySlicesStartingFromSnapshots
    start-from-snapshot {
      # Set this to on true if eventsBySlicesStartingFromSnapshots or
      # currentEventsBySlicesStartingFromSnapshots are used. That has a small overhead when storing
      # snapshots because the timestamp and tags of the corresponding event is retrieved when storing
      # a snapshot.
      enabled = false

      # For filtering the events before the snapshots it keeps track of sequence numbers for
      # the snapshots. This is the max size of the cache for these sequence numbers. When missing
      # in the cache it will load the sequence number from the database.
      cache-capacity = 10000

      # When filtering many events before the snapshots it is still good to occasionally emit
      # fictive heartbeat events for progress observations and offset storage downstreams.
      # This is the number of filtered events until a heartbeat is emitted.
      heartbeat-after = 1000
    }

    # Cache TTL for latestEventTimestamp queries. Setting this to a positive duration enables caching of
    # query results to reduce database load for projection backlog status checks.
    # Set to off, none, or 0 to disable caching.
    cache-latest-event-timestamp = off

    # Estimate time ranges to optimize slice-based query performance.
    # Uses additional queries to count events or state changes into time buckets.
    estimate-time-range = on
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/javadsl/R2dbcReadJournal.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/query/scaladsl/R2dbcReadJournal.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/javadsl/R2dbcDurableStateStore.html
- https://doc.akka.io/api/akka-persistence-r2dbc/1.3.12/akka/persistence/r2dbc/state/scaladsl/R2dbcDurableStateStore.html
- https://doc.akka.io/libraries/akka-core/2.10/durable-state/persistence-query.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/R2dbcReadJournal.loadEnvelope.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/migration-guide.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/postgres_json.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/projection.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html

---
*Source: [https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html)*