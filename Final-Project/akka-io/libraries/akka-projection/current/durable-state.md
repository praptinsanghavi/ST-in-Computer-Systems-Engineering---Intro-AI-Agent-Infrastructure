---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:48Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/durable-state.html
title: Changes from Durable State • Akka Projection
---

# Changes from Durable State • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Changes from Durable State

A typical source for Projections is the change stored with [`DurableStateBehavior`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehavior.html "akka.persistence.typed.state.javadsl.DurableStateBehavior")[`DurableStateBehavior`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html "akka.persistence.typed.state.scaladsl.DurableStateBehavior") in [Akka Persistence](https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html). Durable state changes can be consumed in a Projection with `changesByTag`, `changesBySlices` or `eventsBySlices` queries.

Note that NOT all changes that occur are guaranteed to be emitted, calls to these methods only guarantee that eventually, the most recent change for each object will be emitted. In particular, multiple updates to a given object in quick succession are likely to be skipped, with only the last update resulting in a change from this source.

Alternative
When using the R2DBC plugin an alternative to using a Projection is to [store the query representation](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/durable-state-store.html#storing-query-representation) directly from the write side.

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

To use the Durable State module of Akka Projections, add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-durable-state" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-durable-state_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-durable-state_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections requires Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections Durable State | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-durable\-state 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.durable\-state |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.2\.2, 2021\-08\-19 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows the `akka-projection-durable-state` direct dependencies.The second tab shows all libraries it depends on transitively.

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

## SourceProvider for changesByTag

A [`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") defines the source of the envelopes that the `Projection` will process. A `SourceProvider` for the `changes` query can be defined with the [`DurableStateStoreProvider`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/DurableStateStoreProvider.html "akka.persistence.state.DurableStateStoreProvider")[`DurableStateStoreProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/DurableStateStoreProvider.html "akka.persistence.state.DurableStateStoreProvider") like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/state/DurableStateStoreDocExample.scala#L16-L24 "Go to snippet source")import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.query.DurableStateChange
import akka.persistence.query.Offset
import akka.projection.state.scaladsl.DurableStateSourceProvider
import akka.projection.scaladsl.SourceProvider

val sourceProvider: SourceProvider[Offset, DurableStateChange[AccountEntity.Account]] =
  DurableStateSourceProvider
    .changesByTag[AccountEntity.Account](system, JdbcDurableStateStore.Identifier, "bank-accounts-1")
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/state/DurableStateStoreDocExample.java#L11-L28 "Go to snippet source")import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.Offset;
import akka.projection.state.javadsl.DurableStateSourceProvider;
import akka.projection.javadsl.SourceProvider;

SourceProvider<Offset, DurableStateChange<AccountEntity.Account>> sourceProvider =
    DurableStateSourceProvider.changesByTag(
        system, JdbcDurableStateStore.Identifier(), "bank-accounts-1");
```

This example is using the [DurableStateStore JDBC plugin for Akka Persistence](https://doc.akka.io/libraries/akka-persistence-jdbc/current/durable-state-store.html). You will use the same plugin that you configured for the write side. The one that is used by the `DurableStateBehavior`.

This source is consuming all the changes from the `Account` `DurableStateBehavior` that are tagged with `"bank-accounts-1"`. In a production application, you would need to start as many instances as the number of different tags you used. That way you consume the changes from all entities.

The `DurableStateChange[AccountEntity.Account]``DurableStateChange<AccountEntity.Account>` is what the `Projection` handler will process. It contains the `State` and additional meta data, such as the offset that will be stored by the `Projection`. See [`DurableStateChange`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange")[`DurableStateChange`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange") for full details of what it contains. 

## SourceProvider for changesBySlices

A [`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") defines the source of the envelopes that the `Projection` will process. A `SourceProvider` for the `changesBySlices` query can be defined with the [`DurableStateStoreProvider`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/DurableStateStoreProvider.html "akka.persistence.state.DurableStateStoreProvider")[`DurableStateStoreProvider`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/DurableStateStoreProvider.html "akka.persistence.state.DurableStateStoreProvider") like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/state/DurableStateStoreDocExample.scala#L34-L56 "Go to snippet source")import akka.persistence.query.DurableStateChange
import akka.persistence.query.Offset
import akka.projection.state.scaladsl.DurableStateSourceProvider
import akka.projection.scaladsl.SourceProvider

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges =
  DurableStateSourceProvider.sliceRanges(system, R2dbcDurableStateStore.Identifier, numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "Account"

val sourceProvider: SourceProvider[Offset, DurableStateChange[AccountEntity.Account]] =
  DurableStateSourceProvider
    .changesBySlices[AccountEntity.Account](
      system,
      R2dbcDurableStateStore.Identifier,
      entityType,
      minSlice,
      maxSlice)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/state/DurableStateStoreBySlicesDocExample.java#L13-L47 "Go to snippet source")import akka.japi.Pair;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.Offset;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;
import akka.projection.state.javadsl.DurableStateSourceProvider;

// Slit the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges =
    EventSourcedProvider.sliceRanges(
        system, R2dbcDurableStateStore.Identifier(), numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";

SourceProvider<Offset, DurableStateChange<AccountEntity.Account>> sourceProvider =
    DurableStateSourceProvider.changesBySlices(
        system, R2dbcDurableStateStore.Identifier(), entityType, minSlice, maxSlice);
```

This example is using the [R2DBC plugin for Akka Persistence](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html). You will use the same plugin that you configured for the write side. The one that is used by the `DurableStateBehavior`.

This source is consuming all the changes from the `Account` `DurableStateBehavior` for the given slice range. In a production application, you would need to start as many instances as the number of slice ranges. That way you consume the changes from all entities.

The `DurableStateChange[AccountEntity.Account]``DurableStateChange<AccountEntity.Account>` is what the `Projection` handler will process. It contains the `State` and additional meta data, such as the offset that will be stored by the `Projection`. See [`DurableStateChange`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange")[`DurableStateChange`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange") for full details of what it contains. 

## SourceProvider for eventsBySlices

An alternative to the [`DurableStateChange`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange")[`DurableStateChange`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/DurableStateChange.html "akka.persistence.query.DurableStateChange") emitted by `changesBySlices` is to store additional change event when the state is updated or deleted. Those events are stored in the event journal and can therefore be used with the [SourceProvider for eventsBySlices](eventsourced.html#sourceprovider-for-eventsbyslices).

Compared to `changesBySlices` the advantages of `eventsBySlices` are:

- can be used with [Akka Projection gRPC](grpc.html) for asynchronous event based service\-to\-service communication
- has support for [Publish events for lower latency](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html#publish-events-for-lower-latency-of-eventsbyslices)
- change events can represent smaller deltas than the full state
- all individual change events are received by the consumer, not only the latest as is the case for `changesBySlices`

`DurableState` with change events has the disadvantage that the events must be stored in addition to the latest state. 

You create the change events by defining a [`ChangeEventHandler`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/ChangeEventHandler.html "akka.persistence.typed.state.javadsl.ChangeEventHandler")[`ChangeEventHandler`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html "akka.persistence.typed.state.scaladsl.ChangeEventHandler") in the `DurableStateBehavior`:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/state/DurableStateChangeEventDocExample.scala#L18-L101 "Go to snippet source")import akka.persistence.typed.state.scaladsl.ChangeEventHandler
import akka.persistence.typed.state.scaladsl.DurableStateBehavior
import akka.persistence.typed.state.scaladsl.Effect

object ShoppingCart {

  val changeEventHandler = ChangeEventHandler[Command, State, ChangeEvent](
    updateHandler = {
      case (previousState, newState, AddItem(itemId, quantity, _)) =>
        ItemAdded(itemId, quantity)
      case (previousState, newState, RemoveItem(itemId, _)) =>
        ItemRemoved(itemId)
      case (_, _, command @ DiscardCart(_)) =>
        throw new IllegalStateException(s"Unexpected command ${command.getClass}")
    },
    deleteHandler = { (previousState, command) =>
      CartRemoved
    })

  def apply(cartId: String): Behavior[Command] = {
    DurableStateBehavior
      .withEnforcedReplies[Command, State](
        PersistenceId(EntityKey.name, cartId),
        State.empty,
        (state, command) =>
          command match {
            case AddItem(itemId, quantity, replyTo) =>
              val newState = state.updateItem(itemId, quantity)
              Effect.persist(newState).thenReply(replyTo)(_ => Done)
            case RemoveItem(itemId, replyTo) =>
              val newState = state.removeItem(itemId)
              Effect.persist(newState).thenReply(replyTo)(_ => Done)
            case DiscardCart(replyTo) =>
              Effect.delete().thenReply(replyTo)(_ => Done)
          })
      .withChangeEventHandler(changeEventHandler)
      .onPersistFailure(SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/state/DurableStateChangeEventDocExample.java#L14-L197 "Go to snippet source")import akka.persistence.typed.state.javadsl.ChangeEventHandler;
import akka.persistence.typed.state.javadsl.CommandHandlerWithReply;
import akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilder;
import akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies;
import akka.persistence.typed.state.javadsl.ReplyEffect;

public class ShoppingCart
    extends DurableStateBehaviorWithEnforcedReplies<ShoppingCart.Command, ShoppingCart.State> {

  @Override
  public ChangeEventHandler<Command, State, ChangeEvent> changeEventHandler() {
    return new ChangeEventHandler<Command, State, ChangeEvent>() {
      @Override
      public ChangeEvent updateHandler(State previousState, State newState, Command command) {
        if (command instanceof AddItem) {
          AddItem addItem = (AddItem) command;
          return new ItemAdded(addItem.itemId, addItem.quantity);
        } else if (command instanceof RemoveItem) {
          RemoveItem removeItem = (RemoveItem) command;
          return new ItemRemoved(removeItem.itemId);
        } else {
          throw new IllegalStateException("Unexpected command " + command.getClass());
        }
      }

      @Override
      public ChangeEvent deleteHandler(State previousState, Command command) {
        return new CartRemoved();
      }
    };
  }

  @Override
  public CommandHandlerWithReply<Command, State> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, State> b = newCommandHandlerWithReplyBuilder();

    b.forAnyState()
        .onCommand(AddItem.class, this::onAddItem)
        .onCommand(RemoveItem.class, this::onRemoveItem)
        .onCommand(DiscardCart.class, this::onDiscardCart);

    return b.build();
  }

  public ReplyEffect<State> onAddItem(State state, AddItem cmd) {
    return Effect()
        .persist(state.updateItem(cmd.itemId, cmd.quantity))
        .thenReply(cmd.replyTo, updatedCart -> Done.getInstance());
  }

  public ReplyEffect<State> onRemoveItem(State state, RemoveItem cmd) {
    return Effect()
        .persist(state.removeItem(cmd.itemId))
        .thenReply(cmd.replyTo, updatedCart -> Done.getInstance());
  }

  public ReplyEffect<State> onDiscardCart(State state, DiscardCart cmd) {
    return Effect()
        .delete()
        .thenReply(cmd.replyTo, updatedCart -> Done.getInstance());
  }

}
```

In this example we create events that represent deltas of the state changes using the command. In addition to the command the `updateHandler` is given the previous state and the new updated state as parameters. If you want to keep it simple you can use the full state as the change event.

Note
The `updateHandler` and `deleteHandler` are invoked after the ordinary command handler. Be aware of that if the state is mutable and modified by the command handler the previous state parameter of the `updateHandler` will also include the modification, since it’s the same instance. If that is problem you need to use immutable state and create a new state instance when modifying it in the command handler.

The change events are only used for the Projections and is not the source for the `DurableStateBehavior` state, as they would be with `EventSourcedBehavior`. Therefore, you might not be interested in keeping old events for too long. Also, the events are not automatically removed when the Durable State is deleted. For event deletion you can use the [cleanup tool](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/cleanup.html)

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
libraryDependencies += "com.lightbend.akka" %% "akka-projection-durable-state" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-durable-state_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-durable-state_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: SourceProvider for changesByTag

```scala
import akka.persistence.jdbc.state.scaladsl.JdbcDurableStateStore
import akka.persistence.query.DurableStateChange
import akka.persistence.query.Offset
import akka.projection.state.scaladsl.DurableStateSourceProvider
import akka.projection.scaladsl.SourceProvider

val sourceProvider: SourceProvider[Offset, DurableStateChange[AccountEntity.Account]] =
  DurableStateSourceProvider
    .changesByTag[AccountEntity.Account](system, JdbcDurableStateStore.Identifier, "bank-accounts-1")
```

### Example 8: SourceProvider for changesByTag

```java
import akka.persistence.jdbc.state.javadsl.JdbcDurableStateStore;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.Offset;
import akka.projection.state.javadsl.DurableStateSourceProvider;
import akka.projection.javadsl.SourceProvider;

SourceProvider<Offset, DurableStateChange<AccountEntity.Account>> sourceProvider =
    DurableStateSourceProvider.changesByTag(
        system, JdbcDurableStateStore.Identifier(), "bank-accounts-1");
```

### Example 9: SourceProvider for changesBySlices

```scala
import akka.persistence.query.DurableStateChange
import akka.persistence.query.Offset
import akka.projection.state.scaladsl.DurableStateSourceProvider
import akka.projection.scaladsl.SourceProvider

// Slit the slices into 4 ranges
val numberOfSliceRanges: Int = 4
val sliceRanges =
  DurableStateSourceProvider.sliceRanges(system, R2dbcDurableStateStore.Identifier, numberOfSliceRanges)

// Example of using the first slice range
val minSlice: Int = sliceRanges.head.min
val maxSlice: Int = sliceRanges.head.max
val entityType: String = "Account"

val sourceProvider: SourceProvider[Offset, DurableStateChange[AccountEntity.Account]] =
  DurableStateSourceProvider
    .changesBySlices[AccountEntity.Account](
      system,
      R2dbcDurableStateStore.Identifier,
      entityType,
      minSlice,
      maxSlice)
```

### Example 10: SourceProvider for changesBySlices

```java
import akka.japi.Pair;
import akka.persistence.query.DurableStateChange;
import akka.persistence.query.Offset;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;
import akka.projection.state.javadsl.DurableStateSourceProvider;

// Slit the slices into 4 ranges
int numberOfSliceRanges = 4;
List<Pair<Integer, Integer>> sliceRanges =
    EventSourcedProvider.sliceRanges(
        system, R2dbcDurableStateStore.Identifier(), numberOfSliceRanges);

// Example of using the first slice range
int minSlice = sliceRanges.get(0).first();
int maxSlice = sliceRanges.get(0).second();
String entityType = "MyEntity";

SourceProvider<Offset, DurableStateChange<AccountEntity.Account>> sourceProvider =
    DurableStateSourceProvider.changesBySlices(
        system, R2dbcDurableStateStore.Identifier(), entityType, minSlice, maxSlice);
```

### Example 11: SourceProvider for eventsBySlices

```scala
import akka.persistence.typed.state.scaladsl.ChangeEventHandler
import akka.persistence.typed.state.scaladsl.DurableStateBehavior
import akka.persistence.typed.state.scaladsl.Effect

object ShoppingCart {

  val changeEventHandler = ChangeEventHandler[Command, State, ChangeEvent](
    updateHandler = {
      case (previousState, newState, AddItem(itemId, quantity, _)) =>
        ItemAdded(itemId, quantity)
      case (previousState, newState, RemoveItem(itemId, _)) =>
        ItemRemoved(itemId)
      case (_, _, command @ DiscardCart(_)) =>
        throw new IllegalStateException(s"Unexpected command ${command.getClass}")
    },
    deleteHandler = { (previousState, command) =>
      CartRemoved
    })

  def apply(cartId: String): Behavior[Command] = {
    DurableStateBehavior
      .withEnforcedReplies[Command, State](
        PersistenceId(EntityKey.name, cartId),
        State.empty,
        (state, command) =>
          command match {
            case AddItem(itemId, quantity, replyTo) =>
              val newState = state.updateItem(itemId, quantity)
              Effect.persist(newState).thenReply(replyTo)(_ => Done)
            case RemoveItem(itemId, replyTo) =>
              val newState = state.removeItem(itemId)
              Effect.persist(newState).thenReply(replyTo)(_ => Done)
            case DiscardCart(replyTo) =>
              Effect.delete().thenReply(replyTo)(_ => Done)
          })
      .withChangeEventHandler(changeEventHandler)
      .onPersistFailure(SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
  }

}
```

### Example 12: SourceProvider for eventsBySlices

```java
import akka.persistence.typed.state.javadsl.ChangeEventHandler;
import akka.persistence.typed.state.javadsl.CommandHandlerWithReply;
import akka.persistence.typed.state.javadsl.CommandHandlerWithReplyBuilder;
import akka.persistence.typed.state.javadsl.DurableStateBehaviorWithEnforcedReplies;
import akka.persistence.typed.state.javadsl.ReplyEffect;

public class ShoppingCart
    extends DurableStateBehaviorWithEnforcedReplies<ShoppingCart.Command, ShoppingCart.State> {

  @Override
  public ChangeEventHandler<Command, State, ChangeEvent> changeEventHandler() {
    return new ChangeEventHandler<Command, State, ChangeEvent>() {
      @Override
      public ChangeEvent updateHandler(State previousState, State newState, Command command) {
        if (command instanceof AddItem) {
          AddItem addItem = (AddItem) command;
          return new ItemAdded(addItem.itemId, addItem.quantity);
        } else if (command instanceof RemoveItem) {
          RemoveItem removeItem = (RemoveItem) command;
          return new ItemRemoved(removeItem.itemId);
        } else {
          throw new IllegalStateException("Unexpected command " + command.getClass());
        }
      }

      @Override
      public ChangeEvent deleteHandler(State previousState, Command command) {
        return new CartRemoved();
      }
    };
  }

  @Override
  public CommandHandlerWithReply<Command, State> commandHandler() {
    CommandHandlerWithReplyBuilder<Command, State> b = newCommandHandlerWithReplyBuilder();

    b.forAnyState()
        .onCommand(AddItem.class, this::onAddItem)
        .onCommand(RemoveItem.class, this::onRemoveItem)
        .onCommand(DiscardCart.class, this::onDiscardCart);

    return b.build();
  }

  public ReplyEffect<State> onAddItem(State state, AddItem cmd) {
    return Effect()
        .persist(state.updateItem(cmd.itemId, cmd.quantity))
        .thenReply(cmd.replyTo, updatedCart -> Done.getInstance());
  }

  public ReplyEffect<State> onRemoveItem(State state, RemoveItem cmd) {
    return Effect()
        .persist(state.removeItem(cmd.itemId))
        .thenReply(cmd.replyTo, updatedCart -> Done.getInstance());
  }

  public ReplyEffect<State> onDiscardCart(State state, DiscardCart cmd) {
    return Effect()
        .delete()
        .thenReply(cmd.replyTo, updatedCart -> Done.getInstance());
  }

}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/ChangeEventHandler.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/state/scaladsl/DurableStateBehavior$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/DurableStateChange.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/state/DurableStateStoreProvider.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/ChangeEventHandler.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/state/javadsl/DurableStateBehavior.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/durable-state/persistence.html
- https://doc.akka.io/libraries/akka-persistence-jdbc/current/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/cleanup.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/durable-state-store.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html
- https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/current/grpc.html
- https://doc.akka.io/libraries/akka-projection/current/kafka.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/durable-state.html](https://doc.akka.io/libraries/akka-projection/current/durable-state.html)*