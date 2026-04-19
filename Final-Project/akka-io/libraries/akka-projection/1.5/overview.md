---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:30:20Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/overview.html
title: Overview • Akka Projection
---

# Overview • Akka Projection

> **Summary:** Akka Projection.

## Content

# Overview

The purpose of Akka Projections is described in [Use Cases](use-cases.html).

In Akka Projections you process a stream of events or records from a source to a projected model or external system. Each event is associated with an offset representing the position in the stream. This offset is used for resuming the stream from that position when the projection is restarted.

As the source you can select from:

- [Events from Akka Persistence](eventsourced.html)
- [State changes from Akka Persistence](durable-state.html)
- [Events from Akka Persistence published over gRPC](grpc.html)
- [Messages from Kafka](kafka.html)
- Building your own [`SourceProvider`](/api/akka-projection/1.5.9/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.5.9/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider")

For the offset storage you can select from:

- [Offset in Cassandra](cassandra.html)
- [Offset in a relational DB with JDBC](jdbc.html)
- [Offset in a relational DB with R2DBC](r2dbc.html)
- [Offset in a relational DB with Slick](slick.html) (community\-driven module)

Those building blocks are assembled into a `Projection`. You can have many instances of it [automatically distributed and run](running.html) in an Akka Cluster.

To see a complete example of an Akka Projections implementation review the [Getting Started Guide](getting-started/index.html) or the [Microservices with Akka tutorial](https://developer.lightbend.com/docs/akka-guide/microservices-tutorial/).

## Dependencies

Akka Projections consists of several modules for specific technologies. The dependency section for each module describes which dependency you should define in your project.

- [Events from Akka Persistence](eventsourced.html)
- [State changes from Akka Persistence](durable-state.html)
- [Messages from Kafka](kafka.html)
- [Offset in Cassandra](cassandra.html)
- [Offset in a relational DB with JDBC](jdbc.html)
- [Offset in a relational DB with Slick](slick.html) (community\-driven module)

All of them share a dependency to `akka-projection-core`: 

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-core" % "1.5.9"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-core_${scala.binary.version}</artifactId>
    <version>1.5.9</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-core_${versions.ScalaBinary}:1.5.9"
}
```

| Project Info: Akka Projections Core | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-core 1\.5\.9 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.15, 3\.3\.4 |
| JPMS module name | akka.projection.core |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/libraries/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-09\-10 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.lightbend.com/c/akka/) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Akka version

Akka Projections requires **Akka 2\.9\.6** or later. See [Akka’s Binary Compatibility Rules](https://doc.akka.io/libraries/akka-core/current/common/binary-compatibility-rules.html) for details.

It is recommended to use the latest patch version of Akka. It is important all Akka dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions. For example:

sbt
```
val AkkaVersion = "2.9.6"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.9.6",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```
Maven
```
<properties>
  <akka.version>2.9.6</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Transitive dependencies

The table below shows `akka-projection-core`’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-actor\-typed\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.9.6) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.9.6) |
| com.typesafe.akka | akka\-protobuf\-v3\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6) |
| org.scala\-lang | scala\-library | [2\.13\.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15) |

Dependency tree
```

com.typesafe.akka    akka-actor-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.9.6)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
        com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
        org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    com.typesafe.akka    akka-slf4j_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-slf4j_2.13/2.9.6)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
            com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
            org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
com.typesafe.akka    akka-persistence-query_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.9.6)    BUSL-1.1
    com.typesafe.akka    akka-persistence_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.9.6)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
            com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
            org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
            com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
            org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
        com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
        org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
```

See the individual modules for their transitive dependencies.

### Akka Classic

Akka Projections can be used with the [new Actor API](https://doc.akka.io/libraries/akka-core/current/typed/actors.html) or the [classic Actor API](https://doc.akka.io/libraries/akka-core/current/index-classic.html). The documentation samples show the new Actor API, and the [Akka Classic page](classic.html) highlights how to use it with the classic Actor API.

## Contributing

Please feel free to contribute to Akka and Akka Projections by reporting issues you identify, or by suggesting changes to the code. Please refer to our [contributing instructions](https://github.com/akka/akka/blob/main/CONTRIBUTING.md) to learn how it can be done.

We want Akka to strive in a welcoming and open atmosphere and expect all contributors to respect our [code of conduct](https://www.lightbend.com/conduct).

## Code Examples

### Example 1: Dependencies

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-core" % "1.5.9"
```

### Example 2: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-core_${scala.binary.version}</artifactId>
    <version>1.5.9</version>
  </dependency&gt
</dependencies>
```

### Example 3: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-core_${versions.ScalaBinary}:1.5.9"
}
```

### Example 4: Akka version

```scala
val AkkaVersion = "2.9.6"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
)
```

### Example 5: Akka version

```gradle
def versions = [
  AkkaVersion: "2.9.6",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 6: Akka version

```xml
<properties>
  <akka.version>2.9.6</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/libraries/akka-core/current/common/binary-compatibility-rules.html
- https://doc.akka.io/libraries/akka-core/current/index-classic.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-projection/1.5/cassandra.html
- https://doc.akka.io/libraries/akka-projection/1.5/classic.html
- https://doc.akka.io/libraries/akka-projection/1.5/durable-state.html
- https://doc.akka.io/libraries/akka-projection/1.5/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/1.5/getting-started/index.html
- https://doc.akka.io/libraries/akka-projection/1.5/grpc.html
- https://doc.akka.io/libraries/akka-projection/1.5/index.html
- https://doc.akka.io/libraries/akka-projection/1.5/jdbc.html
- https://doc.akka.io/libraries/akka-projection/1.5/kafka.html
- https://doc.akka.io/libraries/akka-projection/1.5/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/1.5/running.html
- https://doc.akka.io/libraries/akka-projection/1.5/slick.html
- https://doc.akka.io/libraries/akka-projection/1.5/snapshots.html
- https://doc.akka.io/libraries/akka-projection/1.5/use-cases.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.5/overview.html](https://doc.akka.io/libraries/akka-projection/1.5/overview.html)*