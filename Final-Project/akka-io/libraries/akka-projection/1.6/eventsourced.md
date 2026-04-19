---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T02:02:39Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
title: Events from Akka Persistence • Akka Projection
---

# Events from Akka Persistence • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Events from Akka Persistence

A typical source for Projections is events stored with [`EventSourcedBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html "akka.persistence.typed.javadsl.EventSourcedBehavior")[`EventSourcedBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html "akka.persistence.typed.scaladsl.EventSourcedBehavior") in [Akka Persistence](https://doc.akka.io/libraries/akka-core/current/typed/persistence.html). Events can be consumed in a Projection with `eventsByTag` or `eventsBySlices` queries.

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

```
Maven
```
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>

```
Gradle
```
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}

```

To use the Event Sourced module of Akka Projections add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-eventsourced" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-eventsourced_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-eventsourced_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections Eventsourced | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-eventsourced 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.eventsourced |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-09\-10 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-eventsourced`’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.lightbend.akka    akka-projection-core_2.13    [1.6.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20)
    com.typesafe.akka    akka-actor-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-slf4j_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
    com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-persistence-query_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-persistence_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## SourceProvider for eventsByTag

A [`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") defines the source of the event envelopes that the `Projection` will process. A `SourceProvider` for the `eventsByTag` query can be defined with the [`EventSourcedProvider`](/api/akka-projection/1.6.20/akka/projection/eventsourced/javadsl/EventSourcedProvider$.html "akka.projection.eventsourced.javadsl.EventSourcedProvider")[`EventSourcedProvider`](/api/akka-projection/1.6.20/akka/projection/eventsourced/scaladsl/EventSourcedProvider$.html "akka.projection.eventsourced.scaladsl.EventSourcedProvider") like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/eventsourced/EventSourcedDocExample.scala#L16-L24 "Go to snippet source")import akka.projection.eventsourced.EventEnvelope
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider

val sourceProvider: SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](system, readJournalPluginId = CassandraReadJournal.Identifier, tag = "carts-1")
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/eventsourced/EventSourcedDocExample.java#L11-L27 "Go to snippet source")import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
    EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), "carts-1");
```

This example is using the [Cassandra plugin for Akka Persistence](https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html), but same code can be used for other Akka Persistence plugins by replacing the `CassandraReadJournal.Identifier`. For example the [JDBC plugin](https://doc.akka.io/libraries/akka-persistence-jdbc/current/) can be used. You will use the same plugin as you have configured for the write side that is used by the `EventSourcedBehavior`.

This source is consuming all events from the `ShoppingCart` `EventSourcedBehavior` that are tagged with `"cart-1"`.

The tags are assigned as described in [Tagging Events in EventSourcedBehavior](running.html#tagging-events-in-eventsourcedbehavior).

The `EventEnvelope[ShoppingCart.Event]``EventEnvelope<ShoppingCart.Event>` is what the `Projection` handler will process. It contains the `Event` and additional meta data, such as the offset that will be stored by the `Projection`. See [`EventEnvelope`](/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html "akka.projection.eventsourced.EventEnvelope")[`EventEnvelope`](/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html "akka.projection.eventsourced.EventEnvelope") for full details of what the envelope contains. 

## SourceProvider for eventsBySlices

A [`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") defines the source of the event envelopes that the `Projection` will process. A `SourceProvider` for the `eventsBySlices` query can be defined with the [`EventSourcedProvider`](/api/akka-projection/1.6.20/akka/projection/eventsourced/javadsl/EventSourcedProvider$.html "akka.projection.eventsourced.javadsl.EventSourcedProvider")[`EventSourcedProvider`](/api/akka-projection/1.6.20/akka/projection/eventsourced/scaladsl/EventSourcedProvider$.html "akka.projection.eventsourced.scaladsl.EventSourcedProvider") like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/eventsourced/EventSourcedDocExample.scala#L34-L55 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope
import akka.persistence.query.Offset
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges = EventSourcedProvider.sliceRanges(system, R2dbcReadJournal.Identifier, numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "ShoppingCart"

val sourceProvider: SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
  EventSourcedProvider
    .eventsBySlices[ShoppingCart.Event](
      system,
      readJournalPluginId = R2dbcReadJournal.Identifier,
      entityType,
      minSlice,
      maxSlice)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/eventsourced/EventSourcedBySlicesDocExample.java#L10-L45 "Go to snippet source")import akka.japi.Pair;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;
import java.util.List;

// Slit the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges =
    EventSourcedProvider.sliceRanges(
        system, R2dbcReadJournal.Identifier(), numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
    EventSourcedProvider.eventsBySlices(
        system, R2dbcReadJournal.Identifier(), entityType, minSlice, maxSlice);
```

This example is using the [R2DBC plugin for Akka Persistence](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html). You will use the same plugin as you have configured for the write side that is used by the `EventSourcedBehavior`.

This source is consuming all events from the `ShoppingCart` `EventSourcedBehavior` for the given slice range. In a production application, you would need to start as many instances as the number of slice ranges. That way you consume the events from all entities.

The `EventEnvelope[ShoppingCart.Event]``EventEnvelope<ShoppingCart.Event>` is what the `Projection` handler will process. It contains the `Event` and additional meta data, such as the offset that will be stored by the `Projection`. See [`EventEnvelope`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope")[`EventEnvelope`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope") for full details of what the envelope contains.

## SourceProvider for eventsBySlicesStartingFromSnapshots

The Projection can use snapshots as starting points and thereby reducing number of events that have to be loaded. This can be useful if the consumer start from zero without any previously processed offset or if it has been disconnected for a long while and its offset is far behind.

You need to define the snapshot to event transformation function in `EventSourcedProvider.eventsBySlicesStartingFromSnapshots`.

The underlying read journal must implement [`EventsBySliceStartingFromSnapshotsQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html "akka.persistence.query.typed.javadsl.EventsBySliceStartingFromSnapshotsQuery")[`EventsBySliceStartingFromSnapshotsQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html "akka.persistence.query.typed.scaladsl.EventsBySliceStartingFromSnapshotsQuery"). See how to enable [eventsBySlicesStartingFromSnapshots in Akka Persistence R2DBC](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html#eventsbyslicesstartingfromsnapshots).

## Many Projections

[`EventsBySliceFirehoseQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html "akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery")[`EventsBySliceFirehoseQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html "akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery") can give better scalability when many consumers retrieve the same events, for example many Projections of the same entity type. The purpose is to share the stream of events from the database and fan out to connected consumer streams. Thereby fewer queries and loading of events from the database.

`EventsBySliceFirehoseQuery` is used in place of `EventsBySliceQuery` with the `EventSourcedProvider`.

It is typically used together with [Sharded Daemon Process with colocated processes](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html#colocate-processes).

## Code Examples

### Example 1: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
```

### Example 2: Dependencies

```xml
<project&gt
  ...
  <repositories>
    <repository>
      <id>akka-repository</id>
      <name>Akka library repository</name>
      <url>https://repo.akka.io/maven</url>
    </repository>
  </repositories&gt
</project>
```

### Example 3: Dependencies

```gradle
repositories {
    mavenCentral()
    maven {
        url "https://repo.akka.io/maven"
    }
}
```

### Example 4: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-eventsourced" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-eventsourced_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-eventsourced_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: SourceProvider for eventsByTag

```scala
import akka.projection.eventsourced.EventEnvelope
import akka.persistence.cassandra.query.scaladsl.CassandraReadJournal
import akka.persistence.query.Offset
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider

val sourceProvider: SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
  EventSourcedProvider
    .eventsByTag[ShoppingCart.Event](system, readJournalPluginId = CassandraReadJournal.Identifier, tag = "carts-1")
```

### Example 8: SourceProvider for eventsByTag

```java
import akka.persistence.cassandra.query.javadsl.CassandraReadJournal;
import akka.persistence.query.Offset;
import akka.projection.eventsourced.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
    EventSourcedProvider.eventsByTag(system, CassandraReadJournal.Identifier(), "carts-1");
```

### Example 9: SourceProvider for eventsBySlices

```scala
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.query.Offset
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges = EventSourcedProvider.sliceRanges(system, R2dbcReadJournal.Identifier, numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "ShoppingCart"

val sourceProvider: SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
  EventSourcedProvider
    .eventsBySlices[ShoppingCart.Event](
      system,
      readJournalPluginId = R2dbcReadJournal.Identifier,
      entityType,
      minSlice,
      maxSlice)
```

### Example 10: SourceProvider for eventsBySlices

```java
import akka.japi.Pair;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;
import java.util.List;

// Slit the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges =
    EventSourcedProvider.sliceRanges(
        system, R2dbcReadJournal.Identifier(), numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";

SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
    EventSourcedProvider.eventsBySlices(
        system, R2dbcReadJournal.Identifier(), entityType, minSlice, maxSlice);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/EventSourcedBehavior$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/EventEnvelope.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/javadsl/EventSourcedProvider$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/eventsourced/scaladsl/EventSourcedProvider$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceStartingFromSnapshotsQuery.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/EventSourcedBehavior.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/current/typed/persistence.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/read-journal.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html
- https://doc.akka.io/libraries/akka-projection/1.6/durable-state.html
- https://doc.akka.io/libraries/akka-projection/1.6/getting-started/running-cluster.html
- https://doc.akka.io/libraries/akka-projection/1.6/overview.html
- https://doc.akka.io/libraries/akka-projection/1.6/running.html
- https://doc.akka.io/libraries/akka-projection/1.6/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.6/eventsourced.html](https://doc.akka.io/libraries/akka-projection/1.6/eventsourced.html)*