---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:31:03Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/r2dbc.html
title: Offset in a relational DB with R2DBC • Akka Projection
---

# Offset in a relational DB with R2DBC • Akka Projection

> **Summary:** Akka Projection.

## Content

# Offset in a relational DB with R2DBC

The [`R2dbcProjection`](/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcProjection$.html "akka.projection.r2dbc.javadsl.R2dbcProjection")[`R2dbcProjection`](/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcProjection$.html "akka.projection.r2dbc.scaladsl.R2dbcProjection") has support for storing the offset in a relational database using R2DBC via [Akka Persistence R2DBC](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/overview.html).

The source of the envelopes is from a `SourceProvider`, which can be:

- events from Event Sourced entities via the [SourceProvider for eventsBySlices](eventsourced.html#sourceprovider-for-eventsbyslices) with the [eventsBySlices query](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html#eventsbyslices)
- state changes for Durable State entities via the [SourceProvider for changesBySlices](durable-state.html#sourceprovider-for-changesbyslices) with the [changesBySlices query](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html#changesbyslices)
- any other `SourceProvider` with supported [offset types](r2dbc.html#offset-types)

A [`R2dbcHandler`](/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcHandler.html "akka.projection.r2dbc.javadsl.R2dbcHandler")[`R2dbcHandler`](/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcHandler.html "akka.projection.r2dbc.scaladsl.R2dbcHandler") receives a [`R2dbcSession`](/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcSession.html "akka.projection.r2dbc.javadsl.R2dbcSession")[`R2dbcSession`](/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcSession.html "akka.projection.r2dbc.scaladsl.R2dbcSession") instance and an envelope. The `R2dbcSession` provides the means to access an open R2DBC connection that can be used to process the envelope. The target database operations can be run in the same transaction as the storage of the offset, which means that [exactly\-once](r2dbc.html#exactly-once) processing semantics is supported. It also offers [at\-least\-once](r2dbc.html#at-least-once) semantics.

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

To use the R2DBC module of Akka Projections add the following dependency in your project:

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-r2dbc_${scala.binary.version}</artifactId>
    <version>1.5.9</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.2.6</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-projection-r2dbc" % "1.5.9",
  "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.2.6"
)
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-r2dbc_${versions.ScalaBinary}:1.5.9"
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.2.6"
}
```

Note that Akka R2DBC changed configuration structure in 1\.2\.0 needed for this version of Akka Projection, if upgrading from Akka Projection 1\.4\.x you will likely need to update your configuration according to [the migration guide](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/migration-guide.html)

Akka Projections R2DBC depends on Akka 2\.9\.6 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

| Project Info: Akka Projections R2DBC | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-r2dbc 1\.5\.9 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.15, 3\.3\.4 |
| JPMS module name | akka.projection.r2dbc |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/libraries/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.4\.0, 2023\-03\-23 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.lightbend.com/c/akka/) [akka/akka Gitter channel](https://gitter.im/akka/akka) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-r2dbc`’s direct dependencies, and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-persistence\-r2dbc\_2\.13 | [1\.2\.6](https://mvnrepository.com/artifact/com.lightbend.akka/akka-persistence-r2dbc_2.13/1.2.6) |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.5\.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.5.9) |
| com.lightbend.akka | akka\-projection\-durable\-state\_2\.13 | [1\.5\.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-durable-state_2.13/1.5.9) |
| com.lightbend.akka | akka\-projection\-eventsourced\_2\.13 | [1\.5\.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-eventsourced_2.13/1.5.9) |
| com.lightbend.akka | akka\-projection\-grpc\_2\.13 | [1\.5\.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-grpc_2.13/1.5.9) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.9.6) |
| com.typesafe.akka | akka\-persistence\-typed\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.9.6) |
| com.typesafe.akka | akka\-stream\-typed\_2\.13 | [2\.9\.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.9.6) |
| org.scala\-lang | scala\-library | [2\.13\.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15) |

Dependency tree
```

com.lightbend.akka    akka-persistence-r2dbc_2.13    [1.2.6](https://mvnrepository.com/artifact/com.lightbend.akka/akka-persistence-r2dbc_2.13/1.2.6)    BUSL-1.1
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
    com.typesafe.akka    akka-persistence-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.9.6)    BUSL-1.1
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
        com.typesafe.akka    akka-remote_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.9.6)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            com.typesafe.akka    akka-pki_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.9.6)    BUSL-1.1
                com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
                com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                    com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                    org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
            com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                    com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                    org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-stream-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.9.6)    BUSL-1.1
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
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    io.r2dbc    r2dbc-pool    [1.0.1.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-pool/1.0.1.RELEASE)    Apache License 2.0
        io.projectreactor.addons    reactor-pool    [1.0.1](https://mvnrepository.com/artifact/io.projectreactor.addons/reactor-pool/1.0.1)    The Apache Software License, Version 2.0
            io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        io.r2dbc    r2dbc-spi    [1.0.0.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE)    Apache License 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    io.r2dbc    r2dbc-spi    [1.0.0.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE)    Apache License 2.0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.postgresql    r2dbc-postgresql    [1.0.6.RELEASE](https://mvnrepository.com/artifact/org.postgresql/r2dbc-postgresql/1.0.6.RELEASE)    Apache License 2.0
        com.ongres.scram    client    [2.1](https://mvnrepository.com/artifact/com.ongres.scram/client/2.1)
            com.ongres.scram    common    [2.1](https://mvnrepository.com/artifact/com.ongres.scram/common/2.1)
                com.ongres.stringprep    saslprep    [1.1](https://mvnrepository.com/artifact/com.ongres.stringprep/saslprep/1.1)
                    com.ongres.stringprep    stringprep    [1.1](https://mvnrepository.com/artifact/com.ongres.stringprep/stringprep/1.1)
        io.projectreactor.netty    reactor-netty-core    [1.1.22](https://mvnrepository.com/artifact/io.projectreactor.netty/reactor-netty-core/1.1.22)    The Apache Software License, Version 2.0
            io.netty    netty-handler-proxy    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-handler-proxy/4.1.112.Final)
                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-codec-http    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-handler    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-codec-socks    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-socks/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
            io.netty    netty-handler    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.112.Final)
                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
            io.netty    netty-resolver-dns-native-macos    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns-native-macos/4.1.112.Final)
                io.netty    netty-resolver-dns-classes-macos    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns-classes-macos/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-resolver-dns    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-codec-dns    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-dns/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-handler    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
            io.netty    netty-resolver-dns    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver-dns/4.1.112.Final)
                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-codec-dns    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-dns/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-handler    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-codec    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
            io.netty    netty-transport-native-epoll    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-epoll/4.1.112.Final)
                io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport-classes-epoll    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-classes-epoll/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                            io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                            io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                                io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport-native-unix-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                        io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                        io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                            io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                io.netty    netty-transport    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.112.Final)
                    io.netty    netty-buffer    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
                    io.netty    netty-resolver    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.112.Final)
                        io.netty    netty-common    [4.1.112.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.112.Final)
            io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        io.projectreactor    reactor-core    [3.5.20](https://mvnrepository.com/artifact/io.projectreactor/reactor-core/3.5.20)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        io.r2dbc    r2dbc-spi    [1.0.0.RELEASE](https://mvnrepository.com/artifact/io.r2dbc/r2dbc-spi/1.0.0.RELEASE)    Apache License 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
com.lightbend.akka    akka-projection-core_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.5.9)
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
com.lightbend.akka    akka-projection-durable-state_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-durable-state_2.13/1.5.9)
    com.lightbend.akka    akka-projection-core_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.5.9)
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
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
com.lightbend.akka    akka-projection-eventsourced_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-eventsourced_2.13/1.5.9)
    com.lightbend.akka    akka-projection-core_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.5.9)
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
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
com.lightbend.akka    akka-projection-grpc_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-grpc_2.13/1.5.9)
    com.lightbend.akka.grpc    akka-grpc-runtime_2.13    [2.4.4](https://mvnrepository.com/artifact/com.lightbend.akka.grpc/akka-grpc-runtime_2.13/2.4.4)    BUSL-1.1
        com.google.protobuf    protobuf-java    [3.25.5](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.5)
        com.thesamet.scalapb    scalapb-runtime_2.13    [0.11.17](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.17)    Apache 2
            com.google.protobuf    protobuf-java    [3.25.5](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.5)
            com.thesamet.scalapb    lenses_2.13    [0.11.17](https://mvnrepository.com/artifact/com.thesamet.scalapb/lenses_2.13/0.11.17)    Apache 2
                org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-discovery_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-discovery_2.13/2.9.6)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-http-core_2.13    [10.6.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.6.3)    BUSL-1.1
            com.typesafe.akka    akka-parsing_2.13    [10.6.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.6.3)    BUSL-1.1
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-http_2.13    [10.6.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http_2.13/10.6.3)    BUSL-1.1
            com.typesafe.akka    akka-http-core_2.13    [10.6.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.6.3)    BUSL-1.1
                com.typesafe.akka    akka-parsing_2.13    [10.6.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.6.3)    BUSL-1.1
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            com.typesafe.akka    akka-pki_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.9.6)    BUSL-1.1
                com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
                com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                    com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                    org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-pki_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.9.6)    BUSL-1.1
            com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
        com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        io.grpc    grpc-core    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.63.2)    Apache 2.0
            com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
            com.google.code.gson    gson    [2.10.1](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1)    Apache-2.0
            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
            com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                    com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                    org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            io.grpc    grpc-context    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.63.2)    Apache 2.0
                io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                        com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                        org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            io.perfmark    perfmark-api    [0.26.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.26.0)    Apache 2.0
            org.codehaus.mojo    animal-sniffer-annotations    [1.23](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.23)
        io.grpc    grpc-netty-shaded    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-netty-shaded/1.63.2)    Apache 2.0
            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
            com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                    com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                    org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            io.grpc    grpc-core    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.63.2)    Apache 2.0
                com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
                com.google.code.gson    gson    [2.10.1](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1)    Apache-2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                    com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                    org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                        com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                        org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                io.grpc    grpc-context    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.63.2)    Apache 2.0
                    io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                            com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                            com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                            org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                io.perfmark    perfmark-api    [0.26.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.26.0)    Apache 2.0
                org.codehaus.mojo    animal-sniffer-annotations    [1.23](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.23)
            io.grpc    grpc-util    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-util/1.63.2)    Apache 2.0
                com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                    com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                    org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                        com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                        org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                io.grpc    grpc-core    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.63.2)    Apache 2.0
                    com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
                    com.google.code.gson    gson    [2.10.1](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1)    Apache-2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                        com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                        org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                    io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                            com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                            com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                            org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                    io.grpc    grpc-context    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.63.2)    Apache 2.0
                        io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                            com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                                com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                                com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                                org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                    io.perfmark    perfmark-api    [0.26.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.26.0)    Apache 2.0
                    org.codehaus.mojo    animal-sniffer-annotations    [1.23](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.23)
                org.codehaus.mojo    animal-sniffer-annotations    [1.23](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.23)
            io.perfmark    perfmark-api    [0.26.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.26.0)    Apache 2.0
        io.grpc    grpc-protobuf    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf/1.63.2)    Apache 2.0
            com.google.api.grpc    proto-google-common-protos    [2.29.0](https://mvnrepository.com/artifact/com.google.api.grpc/proto-google-common-protos/2.29.0)    Apache-2.0
                com.google.protobuf    protobuf-java    [3.25.5](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.5)
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            com.google.protobuf    protobuf-java    [3.25.5](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.5)
            io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                    com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                    org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
            io.grpc    grpc-protobuf-lite    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf-lite/1.63.2)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                    com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                    org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
                io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                    com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                        com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                        org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    com.lightbend.akka    akka-projection-core_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.5.9)
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
    com.lightbend.akka    akka-projection-eventsourced_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-eventsourced_2.13/1.5.9)
        com.lightbend.akka    akka-projection-core_2.13    [1.5.9](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.5.9)
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
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    com.thesamet.scalapb    scalapb-runtime_2.13    [0.11.17](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.17)    Apache 2
        com.google.protobuf    protobuf-java    [3.25.5](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.5)
        com.thesamet.scalapb    lenses_2.13    [0.11.17](https://mvnrepository.com/artifact/com.thesamet.scalapb/lenses_2.13/0.11.17)    Apache 2
            org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
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
    com.typesafe.akka    akka-persistence-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.9.6)    BUSL-1.1
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
        com.typesafe.akka    akka-remote_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.9.6)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            com.typesafe.akka    akka-pki_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.9.6)    BUSL-1.1
                com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
                com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                    com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                    org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
            com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                    com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                    org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-stream-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.9.6)    BUSL-1.1
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
    io.grpc    grpc-stub    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-stub/1.63.2)    Apache 2.0
        com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
        com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
            com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
            org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
        io.grpc    grpc-api    [1.63.2](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.63.2)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
            com.google.guava    guava    [32.1.3-android](https://mvnrepository.com/artifact/com.google.guava/guava/32.1.3-android)
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.23.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.23.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.1](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.1)
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)
                com.google.j2objc    j2objc-annotations    [2.8](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/2.8)    Apache License, Version 2.0
                org.checkerframework    checker-qual    [3.37.0](https://mvnrepository.com/artifact/org.checkerframework/checker-qual/3.37.0)    The MIT License
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
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
com.typesafe.akka    akka-persistence-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.9.6)    BUSL-1.1
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
    com.typesafe.akka    akka-remote_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.9.6)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
            com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
            org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        com.typesafe.akka    akka-pki_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.9.6)    BUSL-1.1
            com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)
        com.typesafe.akka    akka-stream_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.9.6)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.9.6)    BUSL-1.1
                com.typesafe    config    [1.4.3](https://mvnrepository.com/artifact/com.typesafe/config/1.4.3)    Apache-2.0
                org.scala-lang.modules    scala-java8-compat_2.13    [1.0.2](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-java8-compat_2.13/1.0.2)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
                org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.9.6)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
        org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
        org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
    com.typesafe.akka    akka-stream-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.9.6)    BUSL-1.1
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
    org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
com.typesafe.akka    akka-stream-typed_2.13    [2.9.6](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.9.6)    BUSL-1.1
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
org.scala-lang    scala-library    [2.13.15](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.15)    Apache-2.0
```

## Schema

The `akka_projection_offset_store`, `akka_projection_timestamp_offset_store` and `akka_projection_management` tables need to be created in the configured database:

Warning
The SQL Server dialect is marked `experimental` and not yet production ready until various [issues](https://github.com/akka/akka-persistence-r2dbc/issues?q=is%3Aopen+label%3Asqlserver+label%3Abug) with the integration of the `r2dbc-mssql` plugin have been resolved.

PostgreSQL

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/ddl-scripts/create_tables_postgres.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(32) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

-- Timestamp based offsets are stored in this table.
CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

YugaByte

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/ddl-scripts/create_tables_yugabyte.sql "Go to snippet source")CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH, seq_nr ASC)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice ASC, entity_type ASC, db_timestamp ASC, seq_nr ASC, persistence_id, deleted)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id HASH)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(32) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

-- Timestamp based offsets are stored in this table.

CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice ASC, projection_name ASC, timestamp_offset ASC, persistence_id ASC, seq_nr ASC)
) SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

H2

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/main/resources/h2-default-projection-schema.conf#L7-L54 "Go to snippet source")akka.persistence.r2dbc.connection-factory {
  additional-init =
  """
  CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
    projection_name VARCHAR(255) NOT NULL,
    projection_key VARCHAR(255) NOT NULL,
    current_offset VARCHAR(255) NOT NULL,
    manifest VARCHAR(32) NOT NULL,
    mergeable BOOLEAN NOT NULL,
    last_updated BIGINT NOT NULL,
    PRIMARY KEY(projection_name, projection_key)
  );
  CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
    projection_name VARCHAR(255) NOT NULL,
    projection_key VARCHAR(255) NOT NULL,
    slice INT NOT NULL,
    persistence_id VARCHAR(255) NOT NULL,
    seq_nr BIGINT NOT NULL,
    timestamp_offset timestamp with time zone NOT NULL,
    timestamp_consumed timestamp with time zone NOT NULL,
    PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
  );
  CREATE TABLE IF NOT EXISTS akka_projection_management (
    projection_name VARCHAR(255) NOT NULL,
    projection_key VARCHAR(255) NOT NULL,
    paused BOOLEAN NOT NULL,
    last_updated BIGINT NOT NULL,
    PRIMARY KEY(projection_name, projection_key)
   );
"""
}
```

SQLServer

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/ddl-scripts/create_tables_sqlserver.sql "Go to snippet source")IF object_id('event_journal') is null
  CREATE TABLE event_journal(
    slice INT NOT NULL,
    entity_type NVARCHAR(255) NOT NULL,
    persistence_id NVARCHAR(255) NOT NULL,
    seq_nr NUMERIC(10,0) NOT NULL,
    db_timestamp datetime2(6) NOT NULL,
    event_ser_id INTEGER NOT NULL,
    event_ser_manifest NVARCHAR(255) NOT NULL,
    event_payload VARBINARY(MAX) NOT NULL,
    deleted BIT DEFAULT 0 NOT NULL,
    writer NVARCHAR(255) NOT NULL,
    adapter_manifest NVARCHAR(255) NOT NULL,
    tags NVARCHAR(255),

    meta_ser_id INTEGER,
    meta_ser_manifest NVARCHAR(255),
    meta_payload VARBINARY(MAX),
    PRIMARY KEY(persistence_id, seq_nr)
  );

IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'event_journal_slice_idx' AND object_id = OBJECT_ID('event_journal'))
    BEGIN
        CREATE INDEX event_journal_slice_idx ON event_journal (slice, entity_type, db_timestamp, seq_nr);
    END;

IF object_id('snapshot') is null
	CREATE TABLE snapshot(
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  seq_nr BIGINT NOT NULL,
	  db_timestamp  datetime2(6),
	  write_timestamp BIGINT NOT NULL,
	  ser_id INTEGER NOT NULL,
	  ser_manifest NVARCHAR(255) NOT NULL,
	  snapshot VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),
	  meta_ser_id INTEGER,
	  meta_ser_manifest NVARCHAR(255),
	  meta_payload VARBINARY(MAX),
	  PRIMARY KEY(persistence_id)
	);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'snapshot_slice_idx' AND object_id = OBJECT_ID('snapshot'))
    BEGIN
        CREATE INDEX snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);
    END;

IF object_id('durable_state') is null
	CREATE TABLE durable_state (
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  revision BIGINT NOT NULL,
	  db_timestamp datetime2(6) NOT NULL,

	  state_ser_id INTEGER NOT NULL,
	  state_ser_manifest NVARCHAR(255),
	  state_payload VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),

	  PRIMARY KEY(persistence_id, revision)
	);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'durable_state_slice_idx' AND object_id = OBJECT_ID('durable_state'))
    BEGIN
        CREATE INDEX durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp, revision);
    END;

-- during creation of all tables below, the following warning is logged:
-- ###################################################################################
-- #  Warning! The maximum key length for a clustered index is 900 bytes.            #
-- #  The index '[some name]' has maximum length of [some  number] bytes.            #
-- #  For some combination of large values, the insert/update operation will fail.   #
-- ###################################################################################

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
IF object_id('akka_projection_offset_store') is null
	CREATE TABLE akka_projection_offset_store (
        projection_name NVARCHAR(255) NOT NULL,
        projection_key NVARCHAR(255) NOT NULL,
        current_offset NVARCHAR(255) NOT NULL,
        manifest NVARCHAR(32) NOT NULL,
        mergeable BIT DEFAULT 0 NOT NULL,
        last_updated BIGINT NOT NULL,
        PRIMARY KEY(projection_name, projection_key)
	);

IF object_id('akka_projection_timestamp_offset_store') is null
    CREATE TABLE akka_projection_timestamp_offset_store (
        projection_name NVARCHAR(255) NOT NULL,
        projection_key NVARCHAR(255) NOT NULL,
        slice INT NOT NULL,
        persistence_id NVARCHAR(255) NOT NULL,
        seq_nr BIGINT NOT NULL,
        -- timestamp_offset is the db_timestamp of the original event
        timestamp_offset datetime2(6) NOT NULL,
        -- timestamp_consumed is when the offset was stored
        -- the consumer lag is timestamp_consumed - timestamp_offset
        timestamp_consumed datetime2(6) NOT NULL,
        PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
    );

IF object_id('akka_projection_management') is null
    CREATE TABLE akka_projection_management (
        projection_name NVARCHAR(255) NOT NULL,
        projection_key NVARCHAR(255) NOT NULL,
        paused BIT NOT NULL,
        last_updated BIGINT NOT NULL,
        PRIMARY KEY(projection_name, projection_key)
    );
```

For H2 the schema need to be defined as the `additional-init` setting in your config. This means it is created on first connection instead of up front (needed as there is no way to connect to the database from outside the JVM process):

When using default table names a pre\-packaged schema for H2 can be used through config:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc-integration/src/test/resources/application-h2.conf#L2-L11 "Go to snippet source")include "h2-default-projection-schema.conf"

akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory {
  additional-init = ${akka.projection.r2dbc.default-h2-schema}
}
```

## Configuration

By default, `akka-projection-r2dbc` uses the same connection pool and `dialect` as `akka-persistence-r2dbc`, see [Connection configuration](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/config.html#connection-configuration).

### Reference configuration

The following can be overridden in your `application.conf` for the Projection specific settings:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/main/resources/reference.conf#L5-L66 "Go to snippet source")akka.projection.r2dbc {

  offset-store {
    # set this to your database schema if applicable, empty by default
    schema = ""
    # the database table name for the offset store,
    # can be set to "" if only timestamp offsets are used and table is not created
    offset-table = "akka_projection_offset_store"

    # the database table name for the offset store
    timestamp-offset-table = "akka_projection_timestamp_offset_store"

    # the database table name for the projection manangement data
    management-table = "akka_projection_management"

    # The offset store will keep track of persistence ids and sequence numbers
    # within this time window from latest offset.
    time-window = 5 minutes

    # Keep this number of entries. Don't evict old entries until this threshold
    # has been reached.
    keep-number-of-entries = 10000

    # Remove old entries outside the time-window from the offset store memory
    # with this frequency.
    evict-interval = 10 seconds

    # Remove old entries outside the time-window from the offset store database
    # with this frequency. Can be disabled with `off`.
    delete-interval = 1 minute

    # Adopt latest-by-slice entries from other projection keys with this frequency.
    # Can be disabled with `off`.
    adopt-interval = 1 minute

    # Trying to batch insert offsets in batches of this size.
    offset-batch-size = 20
  }

  # By default it shares connection-factory with akka-persistence-r2dbc (write side),
  # i.e. same connection pool. To use a separate pool for projections this can be
  # set to another config path that defines the config based on one of the supported
  # akka-persistence-r2dbc dialects, for example:
  # ```
  #  my-connection-factory = ${akka.persistence.r2dbc.postgres}
  #  my-connection-factory {
  #    host = "myhost.example.com"
  #  }
  #  akka.projection.r2dbc.use-connection-factory = "my-connection-factory"
  #```
  use-connection-factory = "akka.persistence.r2dbc.connection-factory"

  # Logs database calls that take longer than this duration at INFO level.
  # Set to "off" to disable this logging.
  # Set to 0 to log all calls.
  log-db-calls-exceeding = 300 ms

  # Filtered events are not actually filtered but passed through the handling flow
  # for atLeastOnceFlow, in some applications this is fine, set to false to disable
  # the info logged when seeing such filtered events
  warn-about-filtered-events-in-flow = true
}
```

## Running with Sharded Daemon Process

The Sharded Daemon Process can be used to distribute `n` instances of a given Projection across the cluster. Therefore, it’s important that each Projection instance consumes a subset of the stream of envelopes.

When using `eventsBySlices` the initialization code looks like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L109-L152 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.projection.Projection
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.SourceProvider

def initProjections(): Unit = {
  def sourceProvider(sliceRange: Range): SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
    EventSourcedProvider
      .eventsBySlices[ShoppingCart.Event](
        system,
        readJournalPluginId = R2dbcReadJournal.Identifier,
        entityType,
        sliceRange.min,
        sliceRange.max)

  def projection(sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
    val minSlice = sliceRange.min
    val maxSlice = sliceRange.max
    val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

    R2dbcProjection
      .exactlyOnce(
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler = () => new ShoppingCartHandler)
  }

  ShardedDaemonProcess(system).initWithContext(
    name = "ShoppingCartProjection",
    initialNumberOfInstances = 4,
    behaviorFactory = { daemonContext =>
      val sliceRanges =
        EventSourcedProvider.sliceRanges(system, R2dbcReadJournal.Identifier, daemonContext.totalProcesses)
      val sliceRange = sliceRanges(daemonContext.processNumber)
      ProjectionBehavior(projection(sliceRange))
    },
    ShardedDaemonProcessSettings(system),
    stopMessage = ProjectionBehavior.Stop)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L40-L191 "Go to snippet source")import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.projection.ProjectionBehavior;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.Projection;
import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

void initProjections() {
  ShardedDaemonProcess.get(system)
      .initWithContext(
          ProjectionBehavior.Command.class,
          "ShoppingCartProjection",
          4,
          daemonContext -> {
            List<Pair<Integer, Integer>> sliceRanges =
                EventSourcedProvider.sliceRanges(
                    system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
            Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
            return ProjectionBehavior.create(createProjection(sliceRange));
          },
          ShardedDaemonProcessSettings.create(system),
          Optional.of(ProjectionBehavior.stopMessage()));
}

Projection<EventEnvelope<ShoppingCart.Event>> createProjection(
    Pair<Integer, Integer> sliceRange) {
  int minSlice = sliceRange.first();
  int maxSlice = sliceRange.second();

  String entityType = ShoppingCart.ENTITY_TYPE_KEY.name();

  SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
      EventSourcedProvider.eventsBySlices(
          system, R2dbcReadJournal.Identifier(), entityType, minSlice, maxSlice);

  ProjectionId projectionId =
      ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);
  Optional<R2dbcProjectionSettings> settings = Optional.empty();

  return R2dbcProjection.exactlyOnce(
      projectionId, settings, sourceProvider, ShoppingCartHandler::new, system);
}
```

The [`ShoppingCartHandler` is shown below](r2dbc.html#handler).

It is possible to dynamically scale the number of Projection instances as described in [Sharded Daemon Process documentation](https://doc.akka.io/libraries/akka-core/2.9/typed/cluster-sharded-daemon-process.html#dynamic-scaling-of-number-of-workers). 

There are alternative ways of running the `ProjectionBehavior` as described in [Running a Projection](running.html), but note that when using the R2DBC plugin as `SourceProvider` it is recommended to use `eventsBySlices` and not `eventsByTag`.

## Slices

The `SourceProvider` for Event Sourced actors has historically been using `eventsByTag` but the R2DBC plugin is instead providing `eventsBySlices` as an improved solution.

The usage of `eventsByTag` for Projections has the drawback that the number of tags must be decided up\-front and can’t easily be changed afterwards. Starting with too many tags means much overhead since many projection instances would be running on each node in a small Akka Cluster. Each projection instance polling the database periodically. Starting with too few tags means that it can’t be scaled later to more Akka nodes.

With `eventsBySlices` more Projection instances can be added when needed and still reuse the offsets for the previous slice distributions.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all persistence ids over the slices. The `eventsBySlices` query is for a range of the slices. For example if using 1024 slices and running 4 Projection instances the slice ranges would be 0\-255, 256\-511, 512\-767, 768\-1023\. Changing to 8 slice ranges means that the ranges would be 0\-127, 128\-255, 256\-383, …, 768\-895, 896\-1023\.

However, when changing the number of slices the projections with the old slice distribution must be stopped before starting new projections. That can be done at runtime when [Running with Sharded Daemon Process](r2dbc.html#running-with-sharded-daemon-process).

When using `R2dbcProjection` together with the `EventSourcedProvider.eventsBySlices` the events will be delivered in sequence number order without duplicates.

When using `R2dbcProjection` together with `DurableStateSourceProvider.changesBySlices` the changes will be delivered in revision number order without duplicates.

## exactly\-once

The offset is stored in the same transaction used for the user defined `handler`, which means exactly\-once processing semantics if the projection is restarted from previously stored offset.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L182-L189 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  R2dbcProjection
    .exactlyOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L50-L219 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.empty();

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.exactlyOnce(
        projectionId, settings, sourceProvider, ShoppingCartHandler::new, system);
```

The [`ShoppingCartHandler` is shown below](r2dbc.html#handler).

## at\-least\-once

The offset is stored after the envelope has been processed and giving at\-least\-once processing semantics. This means that if the projection is restarted from a previously stored offset some elements may be processed more than once. Therefore, the [Handler](r2dbc.html#handler) code must be idempotent.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L195-L203 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  R2dbcProjection
    .atLeastOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler)
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L50-L236 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.empty();

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.atLeastOnce(
            projectionId, settings, sourceProvider, ShoppingCartHandler::new, system)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withSaveOffset` of the returned `AtLeastOnceProjection`. The default settings for the window is defined in configuration section `akka.projection.at-least-once`. There is a performance benefit of not storing the offset too often, but the drawback is that there can be more duplicates when the projection that will be processed again when the projection is restarted.

The [`ShoppingCartHandler` is shown below](r2dbc.html#handler).

## groupedWithin

The envelopes can be grouped before processing, which can be useful for batch updates.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L209-L217 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  R2dbcProjection
    .groupedWithin(projectionId, settings = None, sourceProvider, handler = () => new GroupedShoppingCartHandler)
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L50-L253 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.empty();

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.groupedWithin(
            projectionId, settings, sourceProvider, GroupedShoppingCartHandler::new, system)
        .withGroup(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withGroup` of the returned `GroupedProjection`. The default settings for the window is defined in configuration section `akka.projection.grouped`.

When using `groupedWithin` the handler is a `R2dbcHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]]``R2dbcHandler<List<EventEnvelope<ShoppingCart.Event>>>`. The [`GroupedShoppingCartHandler` is shown below](r2dbc.html#grouped-handler).

The offset is stored in the same transaction used for the user defined `handler`, which means exactly\-once processing semantics if the projection is restarted from previously stored offset.

## Handler

It’s in the [`R2dbcHandler`](/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcHandler.html "akka.projection.r2dbc.javadsl.R2dbcHandler")[`R2dbcHandler`](/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcHandler.html "akka.projection.r2dbc.scaladsl.R2dbcHandler") that you implement the processing of each envelope. It’s essentially a consumer function from `(R2dbcSession, Envelope)` to `Future[Done]``CompletionStage<Done>`.

A handler that is consuming `ShoppingCart.Event` from `eventsBySlices` can look like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L26-L70 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.R2dbcHandler
import akka.projection.r2dbc.scaladsl.R2dbcSession

class ShoppingCartHandler()(implicit ec: ExecutionContext) extends R2dbcHandler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(session: R2dbcSession, envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        val stmt = session
          .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
          .bind(0, cartId)
          .bind(1, time)
        session
          .updateOne(stmt)
          .map(_ => Done)

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        Future.successful(Done)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L27-L119 "Go to snippet source")import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import io.r2dbc.spi.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ShoppingCartHandler extends R2dbcHandler<EventEnvelope<ShoppingCart.Event>> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      Statement stmt =
          session
              .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
              .bind(0, checkedOut.cartId)
              .bind(1, checkedOut.eventTime);
      return session.updateOne(stmt).thenApply(rowsUpdated -> Done.getInstance());

    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }
}
```

Hint
Such simple handlers can also be defined as plain functions via the helper `R2dbcHandler.apply``R2dbcHandler.fromFunction` factory method.

### Grouped handler

When using [`R2dbcProjection.groupedWithin`](r2dbc.html#groupedwithin) the handler is processing a `Seq``List` of envelopes.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L26-L101 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.R2dbcHandler
import akka.projection.r2dbc.scaladsl.R2dbcSession

import scala.collection.immutable

class GroupedShoppingCartHandler()(implicit ec: ExecutionContext)
    extends R2dbcHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(
      session: R2dbcSession,
      envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): Future[Done] = {

    // save all events in DB
    val stmts = envelopes
      .map(_.event)
      .collect {
        case ShoppingCart.CheckedOut(cartId, time) =>
          logger.info(s"Shopping cart $cartId was checked out at $time")

          session
            .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
            .bind(0, cartId)
            .bind(1, time)

      }
      .toVector

    session.update(stmts).map(_ => Done)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L27-L151 "Go to snippet source")import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import io.r2dbc.spi.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class GroupedShoppingCartHandler
    extends R2dbcHandler<List<EventEnvelope<ShoppingCart.Event>>> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    List<Statement> stmts = new ArrayList<>();
    for (EventEnvelope<ShoppingCart.Event> envelope : envelopes) {
      ShoppingCart.Event event = envelope.event();
      if (event instanceof ShoppingCart.CheckedOut) {
        ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
        logger.info(
            "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

        Statement stmt =
            session
                .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
                .bind(0, checkedOut.cartId)
                .bind(1, checkedOut.eventTime);
        stmts.add(stmt);
      } else {
        logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      }
    }

    return session.update(stmts).thenApply(rowsUpdated -> Done.getInstance());
  }
}
```

### Stateful handler

The [`R2dbcHandler`](/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcHandler.html "akka.projection.r2dbc.javadsl.R2dbcHandler")[`R2dbcHandler`](/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcHandler.html "akka.projection.r2dbc.scaladsl.R2dbcHandler") can be stateful, with variables and mutable data structures. It is invoked by the `Projection` machinery one envelope at a time and visibility guarantees between the invocations are handled automatically, i.e. no volatile or other concurrency primitives are needed for managing the state as long as it’s not accessed by other threads than the one that called `process`.

Note
It is important that the `Handler` instance is not shared between several `Projection` instances, because then it would be invoked concurrently, which is not how it is intended to be used. Each `Projection` instance should use a new `Handler` instance.

### Async handler

The [`Handler`](/api/akka-projection/1.5.9/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.5.9/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") can be used with `R2dbcProjection.atLeastOnceAsync` and `R2dbcProjection.groupedWithinAsync` if the handler is not storing the projection result in the database. The handler could send to a Kafka topic or integrate with something else.

There are several examples of such `Handler` in the [documentation for Cassandra Projections](cassandra.html#handler). Same type of handlers can be used with `R2dbcProjection` instead of `CassandraProjection`.

### Actor handler

A good alternative for advanced state management is to implement the handler as an [actor](https://doc.akka.io/libraries/akka-core/2.9/typed/typed/actors.html) which is described in [Processing with Actor](actor.html).

### Flow handler

An Akka Streams `FlowWithContext` can be used instead of a handler for processing the envelopes, which is described in [Processing with Akka Streams](flow.html).

### Handler lifecycle

You can override the `start` and `stop` methods of the `R2dbcHandler` to implement initialization before first envelope is processed and resource cleanup when the projection is stopped. Those methods are also called when the `Projection` is restarted after failure.

See also [error handling](error.html).

## Offset types

The supported offset types of the `R2dbcProjection` are:

- [`TimestampOffset`](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimestampOffset.html "akka.persistence.query.TimestampOffset")[`TimestampOffset`](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/TimestampOffset.html "akka.persistence.query.TimestampOffset") that is used for [SourceProvider for eventsBySlices](eventsourced.html#sourceprovider-for-eventsbyslices) and [SourceProvider for changesBySlices](durable-state.html#sourceprovider-for-changesbyslices)
- other [`Offset`](https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset.html "akka.persistence.query.Offset")[`Offset`](https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/Offset.html "akka.persistence.query.Offset") types
- [`MergeableOffset`](/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset") that is used for [messages from Kafka](kafka.html#mergeable-offset)
- `String`
- `Int`
- `Long`
- Any other type that has a configured Akka Serializer is stored with base64 encoding of the serialized bytes.

## Publish events for lower latency

See [eventsBySlices documentation](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html#publish-events-for-lower-latency-of-eventsbyslices).

## Multiple plugins

Just like how multiple plugins can be configured as described for [the R2DBC persistence plugin](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/config.html#multiple-plugins) multiple projection configurations are possible.

For Projection offset store you need another config section:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L225-L231 "Go to snippet source")second-projection-r2dbc = ${akka.projection.r2dbc}
second-projection-r2dbc {
  offset-store {
    # specific projection offset store properties here
  }
  use-connection-factory = "second-r2dbc.connection-factory"
}
```

Note that the `use-connection-factory` property references the same connection settings as is used for the `second-r2dbc` plugins, but it could also have been a separate connection pool configured as:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L235-L246 "Go to snippet source")second-projection-r2dbc = ${akka.projection.r2dbc}
second-projection-r2dbc {
  connection-factory = ${akka.persistence.r2dbc.connection-factory}
  connection-factory {
    # specific connection properties for offset store and projection handler here 
  }
  
  offset-store {
    # specific projection offset store properties here
  }
  use-connection-factory = "second-projection-r2dbc.connection-factory"
}
```

In that way you can use the default plugins for the write side and Projection `SourceProvider`, but use a separate database for the Projection handlers and offset storage.

You start the Projections with the `ProjectionSettings` loaded from `"second-projection-r2dbc"`.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/scala/docs/home/projection/R2dbcProjectionDocExample.scala#L251-L261 "Go to snippet source")  
import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val settings = Some(R2dbcProjectionSettings(system.settings.config.getConfig("second-projection-r2dbc")))

val projection =
  R2dbcProjection
    .atLeastOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-r2dbc/src/test/java/jdocs/home/projection/R2dbcProjectionDocExample.java#L259-L267 "Go to snippet source")ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.of(
    R2dbcProjectionSettings.create(system.settings().config().getConfig("second-projection-r2dbc")));

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.atLeastOnce(
        projectionId, settings, sourceProvider, ShoppingCartHandler::new, system);
```

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

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-r2dbc_${scala.binary.version}</artifactId>
    <version>1.5.9</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.2.6</version>
  </dependency&gt
</dependencies>
```

### Example 5: Dependencies

```scala
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-projection-r2dbc" % "1.5.9",
  "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.2.6"
)
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-r2dbc_${versions.ScalaBinary}:1.5.9"
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.2.6"
}
```

### Example 7: Schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id, seq_nr)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice, entity_type, db_timestamp, seq_nr);

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp);

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(32) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

-- Timestamp based offsets are stored in this table.
CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 8: Schema

```sql
CREATE TABLE IF NOT EXISTS event_journal(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  event_ser_id INTEGER NOT NULL,
  event_ser_manifest VARCHAR(255) NOT NULL,
  event_payload BYTEA NOT NULL,

  deleted BOOLEAN DEFAULT FALSE NOT NULL,
  writer VARCHAR(255) NOT NULL,
  adapter_manifest VARCHAR(255),
  tags TEXT ARRAY,

  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH, seq_nr ASC)
);

-- `event_journal_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS event_journal_slice_idx ON event_journal(slice ASC, entity_type ASC, db_timestamp ASC, seq_nr ASC, persistence_id, deleted)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS snapshot(
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  db_timestamp timestamp with time zone,
  write_timestamp BIGINT NOT NULL,
  ser_id INTEGER NOT NULL,
  ser_manifest VARCHAR(255) NOT NULL,
  snapshot BYTEA NOT NULL,
  tags TEXT ARRAY,
  meta_ser_id INTEGER,
  meta_ser_manifest VARCHAR(255),
  meta_payload BYTEA,

  PRIMARY KEY(persistence_id HASH)
);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
CREATE INDEX IF NOT EXISTS snapshot_slice_idx ON snapshot(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS durable_state (
  slice INT NOT NULL,
  entity_type VARCHAR(255) NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  revision BIGINT NOT NULL,
  db_timestamp timestamp with time zone NOT NULL,

  state_ser_id INTEGER NOT NULL,
  state_ser_manifest VARCHAR(255),
  state_payload BYTEA NOT NULL,
  tags TEXT ARRAY,

  PRIMARY KEY(persistence_id HASH)
);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
CREATE INDEX IF NOT EXISTS durable_state_slice_idx ON durable_state(slice ASC, entity_type ASC, db_timestamp ASC, persistence_id)
  SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(32) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

-- Timestamp based offsets are stored in this table.

CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  slice INT NOT NULL,
  persistence_id VARCHAR(255) NOT NULL,
  seq_nr BIGINT NOT NULL,
  -- timestamp_offset is the db_timestamp of the original event
  timestamp_offset timestamp with time zone NOT NULL,
  -- timestamp_consumed is when the offset was stored
  -- the consumer lag is timestamp_consumed - timestamp_offset
  timestamp_consumed timestamp with time zone NOT NULL,
  PRIMARY KEY(slice ASC, projection_name ASC, timestamp_offset ASC, persistence_id ASC, seq_nr ASC)
) SPLIT AT VALUES ((127), (255), (383), (511), (639), (767), (895));

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 9: Schema

```conf
akka.persistence.r2dbc.connection-factory {
  additional-init =
  """
  CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
    projection_name VARCHAR(255) NOT NULL,
    projection_key VARCHAR(255) NOT NULL,
    current_offset VARCHAR(255) NOT NULL,
    manifest VARCHAR(32) NOT NULL,
    mergeable BOOLEAN NOT NULL,
    last_updated BIGINT NOT NULL,
    PRIMARY KEY(projection_name, projection_key)
  );
  CREATE TABLE IF NOT EXISTS akka_projection_timestamp_offset_store (
    projection_name VARCHAR(255) NOT NULL,
    projection_key VARCHAR(255) NOT NULL,
    slice INT NOT NULL,
    persistence_id VARCHAR(255) NOT NULL,
    seq_nr BIGINT NOT NULL,
    timestamp_offset timestamp with time zone NOT NULL,
    timestamp_consumed timestamp with time zone NOT NULL,
    PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
  );
  CREATE TABLE IF NOT EXISTS akka_projection_management (
    projection_name VARCHAR(255) NOT NULL,
    projection_key VARCHAR(255) NOT NULL,
    paused BOOLEAN NOT NULL,
    last_updated BIGINT NOT NULL,
    PRIMARY KEY(projection_name, projection_key)
   );
"""
}
```

### Example 10: Schema

```sql
IF object_id('event_journal') is null
  CREATE TABLE event_journal(
    slice INT NOT NULL,
    entity_type NVARCHAR(255) NOT NULL,
    persistence_id NVARCHAR(255) NOT NULL,
    seq_nr NUMERIC(10,0) NOT NULL,
    db_timestamp datetime2(6) NOT NULL,
    event_ser_id INTEGER NOT NULL,
    event_ser_manifest NVARCHAR(255) NOT NULL,
    event_payload VARBINARY(MAX) NOT NULL,
    deleted BIT DEFAULT 0 NOT NULL,
    writer NVARCHAR(255) NOT NULL,
    adapter_manifest NVARCHAR(255) NOT NULL,
    tags NVARCHAR(255),

    meta_ser_id INTEGER,
    meta_ser_manifest NVARCHAR(255),
    meta_payload VARBINARY(MAX),
    PRIMARY KEY(persistence_id, seq_nr)
  );

IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'event_journal_slice_idx' AND object_id = OBJECT_ID('event_journal'))
    BEGIN
        CREATE INDEX event_journal_slice_idx ON event_journal (slice, entity_type, db_timestamp, seq_nr);
    END;

IF object_id('snapshot') is null
	CREATE TABLE snapshot(
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  seq_nr BIGINT NOT NULL,
	  db_timestamp  datetime2(6),
	  write_timestamp BIGINT NOT NULL,
	  ser_id INTEGER NOT NULL,
	  ser_manifest NVARCHAR(255) NOT NULL,
	  snapshot VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),
	  meta_ser_id INTEGER,
	  meta_ser_manifest NVARCHAR(255),
	  meta_payload VARBINARY(MAX),
	  PRIMARY KEY(persistence_id)
	);

-- `snapshot_slice_idx` is only needed if the slice based queries are used together with snapshot as starting point
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'snapshot_slice_idx' AND object_id = OBJECT_ID('snapshot'))
    BEGIN
        CREATE INDEX snapshot_slice_idx ON snapshot(slice, entity_type, db_timestamp);
    END;

IF object_id('durable_state') is null
	CREATE TABLE durable_state (
	  slice INT NOT NULL,
	  entity_type NVARCHAR(255) NOT NULL,
	  persistence_id NVARCHAR(255) NOT NULL,
	  revision BIGINT NOT NULL,
	  db_timestamp datetime2(6) NOT NULL,

	  state_ser_id INTEGER NOT NULL,
	  state_ser_manifest NVARCHAR(255),
	  state_payload VARBINARY(MAX) NOT NULL,
	  tags NVARCHAR(255),

	  PRIMARY KEY(persistence_id, revision)
	);

-- `durable_state_slice_idx` is only needed if the slice based queries are used
IF NOT EXISTS(SELECT * FROM sys.indexes WHERE name = 'durable_state_slice_idx' AND object_id = OBJECT_ID('durable_state'))
    BEGIN
        CREATE INDEX durable_state_slice_idx ON durable_state(slice, entity_type, db_timestamp, revision);
    END;

-- during creation of all tables below, the following warning is logged:
-- ###################################################################################
-- #  Warning! The maximum key length for a clustered index is 900 bytes.            #
-- #  The index '[some name]' has maximum length of [some  number] bytes.            #
-- #  For some combination of large values, the insert/update operation will fail.   #
-- ###################################################################################

-- Primitive offset types are stored in this table.
-- If only timestamp based offsets are used this table is optional.
-- Configure akka.projection.r2dbc.offset-store.offset-table="" if the table is not created.
IF object_id('akka_projection_offset_store') is null
	CREATE TABLE akka_projection_offset_store (
        projection_name NVARCHAR(255) NOT NULL,
        projection_key NVARCHAR(255) NOT NULL,
        current_offset NVARCHAR(255) NOT NULL,
        manifest NVARCHAR(32) NOT NULL,
        mergeable BIT DEFAULT 0 NOT NULL,
        last_updated BIGINT NOT NULL,
        PRIMARY KEY(projection_name, projection_key)
	);

IF object_id('akka_projection_timestamp_offset_store') is null
    CREATE TABLE akka_projection_timestamp_offset_store (
        projection_name NVARCHAR(255) NOT NULL,
        projection_key NVARCHAR(255) NOT NULL,
        slice INT NOT NULL,
        persistence_id NVARCHAR(255) NOT NULL,
        seq_nr BIGINT NOT NULL,
        -- timestamp_offset is the db_timestamp of the original event
        timestamp_offset datetime2(6) NOT NULL,
        -- timestamp_consumed is when the offset was stored
        -- the consumer lag is timestamp_consumed - timestamp_offset
        timestamp_consumed datetime2(6) NOT NULL,
        PRIMARY KEY(slice, projection_name, timestamp_offset, persistence_id, seq_nr)
    );

IF object_id('akka_projection_management') is null
    CREATE TABLE akka_projection_management (
        projection_name NVARCHAR(255) NOT NULL,
        projection_key NVARCHAR(255) NOT NULL,
        paused BIT NOT NULL,
        last_updated BIGINT NOT NULL,
        PRIMARY KEY(projection_name, projection_key)
    );
```

### Example 11: Schema

```conf
include "h2-default-projection-schema.conf"

akka.persistence.r2dbc.connection-factory = ${akka.persistence.r2dbc.h2}
akka.persistence.r2dbc.connection-factory {
  additional-init = ${akka.projection.r2dbc.default-h2-schema}
}
```

### Example 12: Reference configuration

```conf
akka.projection.r2dbc {

  offset-store {
    # set this to your database schema if applicable, empty by default
    schema = ""
    # the database table name for the offset store,
    # can be set to "" if only timestamp offsets are used and table is not created
    offset-table = "akka_projection_offset_store"

    # the database table name for the offset store
    timestamp-offset-table = "akka_projection_timestamp_offset_store"

    # the database table name for the projection manangement data
    management-table = "akka_projection_management"

    # The offset store will keep track of persistence ids and sequence numbers
    # within this time window from latest offset.
    time-window = 5 minutes

    # Keep this number of entries. Don't evict old entries until this threshold
    # has been reached.
    keep-number-of-entries = 10000

    # Remove old entries outside the time-window from the offset store memory
    # with this frequency.
    evict-interval = 10 seconds

    # Remove old entries outside the time-window from the offset store database
    # with this frequency. Can be disabled with `off`.
    delete-interval = 1 minute

    # Adopt latest-by-slice entries from other projection keys with this frequency.
    # Can be disabled with `off`.
    adopt-interval = 1 minute

    # Trying to batch insert offsets in batches of this size.
    offset-batch-size = 20
  }

  # By default it shares connection-factory with akka-persistence-r2dbc (write side),
  # i.e. same connection pool. To use a separate pool for projections this can be
  # set to another config path that defines the config based on one of the supported
  # akka-persistence-r2dbc dialects, for example:
  # ```
  #  my-connection-factory = ${akka.persistence.r2dbc.postgres}
  #  my-connection-factory {
  #    host = "myhost.example.com"
  #  }
  #  akka.projection.r2dbc.use-connection-factory = "my-connection-factory"
  #```
  use-connection-factory = "akka.persistence.r2dbc.connection-factory"

  # Logs database calls that take longer than this duration at INFO level.
  # Set to "off" to disable this logging.
  # Set to 0 to log all calls.
  log-db-calls-exceeding = 300 ms

  # Filtered events are not actually filtered but passed through the handling flow
  # for atLeastOnceFlow, in some applications this is fine, set to false to disable
  # the info logged when seeing such filtered events
  warn-about-filtered-events-in-flow = true
}
```

### Example 13: Running with Sharded Daemon Process

```scala
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.r2dbc.query.scaladsl.R2dbcReadJournal
import akka.projection.Projection
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.SourceProvider

def initProjections(): Unit = {
  def sourceProvider(sliceRange: Range): SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
    EventSourcedProvider
      .eventsBySlices[ShoppingCart.Event](
        system,
        readJournalPluginId = R2dbcReadJournal.Identifier,
        entityType,
        sliceRange.min,
        sliceRange.max)

  def projection(sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
    val minSlice = sliceRange.min
    val maxSlice = sliceRange.max
    val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

    R2dbcProjection
      .exactlyOnce(
        projectionId,
        settings = None,
        sourceProvider(sliceRange),
        handler = () => new ShoppingCartHandler)
  }

  ShardedDaemonProcess(system).initWithContext(
    name = "ShoppingCartProjection",
    initialNumberOfInstances = 4,
    behaviorFactory = { daemonContext =>
      val sliceRanges =
        EventSourcedProvider.sliceRanges(system, R2dbcReadJournal.Identifier, daemonContext.totalProcesses)
      val sliceRange = sliceRanges(daemonContext.processNumber)
      ProjectionBehavior(projection(sliceRange))
    },
    ShardedDaemonProcessSettings(system),
    stopMessage = ProjectionBehavior.Stop)
}
```

### Example 14: Running with Sharded Daemon Process

```java
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.projection.ProjectionBehavior;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.Projection;
import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

void initProjections() {
  ShardedDaemonProcess.get(system)
      .initWithContext(
          ProjectionBehavior.Command.class,
          "ShoppingCartProjection",
          4,
          daemonContext -> {
            List<Pair<Integer, Integer>> sliceRanges =
                EventSourcedProvider.sliceRanges(
                    system, R2dbcReadJournal.Identifier(), daemonContext.totalProcesses());
            Pair<Integer, Integer> sliceRange = sliceRanges.get(daemonContext.processNumber());
            return ProjectionBehavior.create(createProjection(sliceRange));
          },
          ShardedDaemonProcessSettings.create(system),
          Optional.of(ProjectionBehavior.stopMessage()));
}

Projection<EventEnvelope<ShoppingCart.Event>> createProjection(
    Pair<Integer, Integer> sliceRange) {
  int minSlice = sliceRange.first();
  int maxSlice = sliceRange.second();

  String entityType = ShoppingCart.ENTITY_TYPE_KEY.name();

  SourceProvider<Offset, EventEnvelope<ShoppingCart.Event>> sourceProvider =
      EventSourcedProvider.eventsBySlices(
          system, R2dbcReadJournal.Identifier(), entityType, minSlice, maxSlice);

  ProjectionId projectionId =
      ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);
  Optional<R2dbcProjectionSettings> settings = Optional.empty();

  return R2dbcProjection.exactlyOnce(
      projectionId, settings, sourceProvider, ShoppingCartHandler::new, system);
}
```

### Example 15: exactly-once

```scala
import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  R2dbcProjection
    .exactlyOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler)
```

### Example 16: exactly-once

```java
import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.empty();

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.exactlyOnce(
        projectionId, settings, sourceProvider, ShoppingCartHandler::new, system);
```

### Example 17: at-least-once

```scala
import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  R2dbcProjection
    .atLeastOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler)
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

### Example 18: at-least-once

```java
import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.empty();

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.atLeastOnce(
            projectionId, settings, sourceProvider, ShoppingCartHandler::new, system)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 19: groupedWithin

```scala
import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  R2dbcProjection
    .groupedWithin(projectionId, settings = None, sourceProvider, handler = () => new GroupedShoppingCartHandler)
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

### Example 20: groupedWithin

```java
import akka.projection.ProjectionId;
import akka.projection.r2dbc.R2dbcProjectionSettings;
import akka.projection.r2dbc.javadsl.R2dbcProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.empty();

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.groupedWithin(
            projectionId, settings, sourceProvider, GroupedShoppingCartHandler::new, system)
        .withGroup(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 21: Handler

```scala
import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.R2dbcHandler
import akka.projection.r2dbc.scaladsl.R2dbcSession

class ShoppingCartHandler()(implicit ec: ExecutionContext) extends R2dbcHandler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(session: R2dbcSession, envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        val stmt = session
          .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
          .bind(0, cartId)
          .bind(1, time)
        session
          .updateOne(stmt)
          .map(_ => Done)

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        Future.successful(Done)
    }
  }
}
```

### Example 22: Handler

```java
import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import io.r2dbc.spi.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ShoppingCartHandler extends R2dbcHandler<EventEnvelope<ShoppingCart.Event>> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      Statement stmt =
          session
              .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
              .bind(0, checkedOut.cartId)
              .bind(1, checkedOut.eventTime);
      return session.updateOne(stmt).thenApply(rowsUpdated -> Done.getInstance());

    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }
}
```

### Example 23: Grouped handler

```scala
import akka.persistence.query.typed.EventEnvelope
import akka.projection.r2dbc.scaladsl.R2dbcHandler
import akka.projection.r2dbc.scaladsl.R2dbcSession

import scala.collection.immutable

class GroupedShoppingCartHandler()(implicit ec: ExecutionContext)
    extends R2dbcHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(
      session: R2dbcSession,
      envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): Future[Done] = {

    // save all events in DB
    val stmts = envelopes
      .map(_.event)
      .collect {
        case ShoppingCart.CheckedOut(cartId, time) =>
          logger.info(s"Shopping cart $cartId was checked out at $time")

          session
            .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
            .bind(0, cartId)
            .bind(1, time)

      }
      .toVector

    session.update(stmts).map(_ => Done)
  }
}
```

### Example 24: Grouped handler

```java
import akka.projection.r2dbc.javadsl.R2dbcHandler;
import akka.projection.r2dbc.javadsl.R2dbcSession;
import io.r2dbc.spi.Statement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class GroupedShoppingCartHandler
    extends R2dbcHandler<List<EventEnvelope<ShoppingCart.Event>>> {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(
      R2dbcSession session, List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    List<Statement> stmts = new ArrayList<>();
    for (EventEnvelope<ShoppingCart.Event> envelope : envelopes) {
      ShoppingCart.Event event = envelope.event();
      if (event instanceof ShoppingCart.CheckedOut) {
        ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
        logger.info(
            "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

        Statement stmt =
            session
                .createStatement("INSERT into order (id, time) VALUES ($1, $2)")
                .bind(0, checkedOut.cartId)
                .bind(1, checkedOut.eventTime);
        stmts.add(stmt);
      } else {
        logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      }
    }

    return session.update(stmts).thenApply(rowsUpdated -> Done.getInstance());
  }
}
```

### Example 25: Multiple plugins

```scala
second-projection-r2dbc = ${akka.projection.r2dbc}
second-projection-r2dbc {
  offset-store {
    # specific projection offset store properties here
  }
  use-connection-factory = "second-r2dbc.connection-factory"
}
```

### Example 26: Multiple plugins

```scala
second-projection-r2dbc = ${akka.projection.r2dbc}
second-projection-r2dbc {
  connection-factory = ${akka.persistence.r2dbc.connection-factory}
  connection-factory {
    # specific connection properties for offset store and projection handler here 
  }
  
  offset-store {
    # specific projection offset store properties here
  }
  use-connection-factory = "second-projection-r2dbc.connection-factory"
}
```

### Example 27: Multiple plugins

```scala
import akka.projection.ProjectionId
import akka.projection.r2dbc.scaladsl.R2dbcProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val settings = Some(R2dbcProjectionSettings(system.settings.config.getConfig("second-projection-r2dbc")))

val projection =
  R2dbcProjection
    .atLeastOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler)
```

### Example 28: Multiple plugins

```java
ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<R2dbcProjectionSettings> settings = Optional.of(
    R2dbcProjectionSettings.create(system.settings().config().getConfig("second-projection-r2dbc")));

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    R2dbcProjection.atLeastOnce(
        projectionId, settings, sourceProvider, ShoppingCartHandler::new, system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-core/2.9/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/javadsl/R2dbcSession.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcHandler.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcProjection$.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/r2dbc/scaladsl/R2dbcSession.html
- https://doc.akka.io/api/akka-projection/1.5.9/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/Offset.html
- https://doc.akka.io/japi/akka-core/2.9/akka/persistence/query/TimestampOffset.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/2.9/typed/typed/actors.html
- https://doc.akka.io/libraries/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/config.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/migration-guide.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/overview.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.2.6/query.html
- https://doc.akka.io/libraries/akka-projection/1.5/actor.html
- https://doc.akka.io/libraries/akka-projection/1.5/cassandra.html
- https://doc.akka.io/libraries/akka-projection/1.5/durable-state.html
- https://doc.akka.io/libraries/akka-projection/1.5/error.html
- https://doc.akka.io/libraries/akka-projection/1.5/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/1.5/flow.html
- https://doc.akka.io/libraries/akka-projection/1.5/kafka.html
- https://doc.akka.io/libraries/akka-projection/1.5/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/1.5/running.html
- https://doc.akka.io/libraries/akka-projection/1.5/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.5/r2dbc.html](https://doc.akka.io/libraries/akka-projection/1.5/r2dbc.html)*