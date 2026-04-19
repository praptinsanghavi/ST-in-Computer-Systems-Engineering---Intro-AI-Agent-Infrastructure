---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:52Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/slick.html
title: Offset in a relational DB with Slick • Akka Projection
---

# Offset in a relational DB with Slick • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Offset in a relational DB with Slick

The [`SlickProjection`](/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html "akka.projection.slick.SlickProjection")[`SlickProjection`](/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html "akka.projection.slick.SlickProjection") has support for storing the offset in a relational database using [Slick](https://scala-slick.org) (JDBC). This is only an option for Scala and for Java the [offset can be stored in relational DB with JDBC](jdbc.html). The JDBC module can also be used with Scala.

Warning
The Slick module in Akka Projections is community\-driven and not included in Lightbend support. Prefer using the [JDBC module](jdbc.html) to implement your projection handler. Slick support in Akka Projections is meant for users migrating from [`Lagom's Slick ReadSideProcessor`](https://www.lagomframework.com/documentation/1.6.x/scala/ReadSideSlick.html).

The source of the envelopes can be [events from Akka Persistence](eventsourced.html) or any other `SourceProvider` with supported [offset types](slick.html#offset-types).

The envelope handler returns a `DBIO` that will be run by the projection. This means that the target database operations can be run in the same transaction as the storage of the offset, which means that [exactly\-once](slick.html#exactly-once) processing semantics is supported. It also offers [at\-least\-once](slick.html#at-least-once) semantics.

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

To use the Slick module of Akka Projections add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-slick" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-slick_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-slick_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections Slick | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-slick 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.slick |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Community\-driven](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#community-driven) Since 0\.0, 2020\-04\-01 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-slick`’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.lightbend.akka | akka\-projection\-jdbc\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-jdbc_2.13/1.6.20) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13) |
| com.typesafe.slick | slick\_2\.13 | [3\.5\.1](https://mvnrepository.com/artifact/com.typesafe.slick/slick_2.13/3.5.1) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |
| org.slf4j | slf4j\-api | [2\.0\.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17) |

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
com.lightbend.akka    akka-projection-jdbc_2.13    [1.6.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-jdbc_2.13/1.6.20)
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
com.typesafe.slick    slick_2.13    [3.5.1](https://mvnrepository.com/artifact/com.typesafe.slick/slick_2.13/3.5.1)    Two-clause BSD-style license
    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
```

## exactly\-once

The offset is stored in the same transaction as the `DBIO` returned from the `handler`, which means exactly\-once processing semantics if the projection is restarted from previously stored offset.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L20-L25 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.slick.SlickProjection
import slick.basic.DatabaseConfig
import slick.dbio.DBIO
import slick.jdbc.H2Profile

implicit val ec: ExecutionContext = system.executionContext

val projection =
  SlickProjection.exactlyOnce(
    projectionId = ProjectionId("ShoppingCarts", "carts-1"),
    sourceProvider,
    dbConfig,
    handler = () => new ShoppingCartHandler(repository))
```

The [`ShoppingCartHandler` is shown below](slick.html#handler).

## at\-least\-once

The offset is stored after the envelope has been processed and giving at\-least\-once processing semantics. This means that if the projection is restarted from a previously stored offset some elements may be processed more than once. Therefore, the [Handler](slick.html#handler) code must be idempotent.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L135-L144 "Go to snippet source")implicit val ec: ExecutionContext = system.executionContext

val projection =
  SlickProjection
    .atLeastOnce(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      dbConfig,
      handler = () => new ShoppingCartHandler(repository))
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withSaveOffset` of the returned `AtLeastOnceProjection`. The default settings for the window is defined in configuration section `akka.projection.at-least-once`. There is a performance benefit of not storing the offset too often, but the drawback is that there can be more duplicates when the projection that will be processed again when the projection is restarted.

The [`ShoppingCartHandler` is shown below](slick.html#handler).

## groupedWithin

The envelopes can be grouped before processing, which can be useful for batch updates.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L150-L159 "Go to snippet source")implicit val ec: ExecutionContext = system.executionContext

val projection =
  SlickProjection
    .groupedWithin(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      dbConfig,
      handler = () => new GroupedShoppingCartHandler(repository))
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withGroup` of the returned `GroupedProjection`. The default settings for the window is defined in configuration section `akka.projection.grouped`.

When using `groupedWithin` the handler is a `SlickHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]]`. The [`GroupedShoppingCartHandler` is shown below](slick.html#grouped-handler).

The offset is stored in the same transaction as the `DBIO` returned from the `handler`, which means exactly\-once processing semantics if the projection is restarted from previously stored offset.

## Handler

It’s in the [`SlickHandler`](/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler.html "akka.projection.slick.SlickHandler")[`SlickHandler`](/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler.html "akka.projection.slick.SlickHandler") that you implement the processing of each envelope. It’s essentially a function from `Envelope` to `DBIO[Done]`. The returned `DBIO` is run by the projection.

A handler that is consuming `ShoppingCart.Event` from `eventsByTag` can look like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L29-L34 "Go to snippet source")import scala.concurrent.Future

import akka.Done
import akka.projection.slick.SlickHandler
import org.slf4j.LoggerFactory

class ShoppingCartHandler(repository: OrderRepository)(implicit ec: ExecutionContext)
    extends SlickHandler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): DBIO[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        repository.save(Order(cartId, time))

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        DBIO.successful(Done)
    }
  }
}
```

Hint
Such simple handlers can also be defined as plain functions via the helper `SlickHandler.apply` factory method.

where the `OrderRepository` is:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L40-L62 "Go to snippet source")case class Order(id: String, time: Instant)

class OrderRepository(val dbConfig: DatabaseConfig[H2Profile]) {

  import dbConfig.profile.api._

  private class OrdersTable(tag: Tag) extends Table[Order](tag, "ORDERS") {
    def id = column[String]("CART_ID", O.PrimaryKey)

    def time = column[Instant]("TIME")

    def * = (id, time).mapTo[Order]
  }

  private val ordersTable = TableQuery[OrdersTable]

  def save(order: Order)(implicit ec: ExecutionContext) = {
    ordersTable.insertOrUpdate(order).map(_ => Done)
  }

  def createTable(): Future[Unit] =
    dbConfig.db.run(ordersTable.schema.createIfNotExists)
}
```

with the Slick `DatabaseConfig`:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L109-L111 "Go to snippet source")val dbConfig: DatabaseConfig[H2Profile] = DatabaseConfig.forConfig("akka.projection.slick", system.settings.config)

val repository = new OrderRepository(dbConfig)
```

### Grouped handler

When using [`SlickProjection.groupedWithin`](slick.html#groupedwithin) the handler is processing a `Seq` of envelopes.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/slick/SlickProjectionDocExample.scala#L85-L103 "Go to snippet source")import scala.collection.immutable

class GroupedShoppingCartHandler(repository: OrderRepository)(implicit ec: ExecutionContext)
    extends SlickHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): DBIO[Done] = {
    val dbios = envelopes.map(_.event).map {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        repository.save(Order(cartId, time))

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        DBIO.successful(Done)
    }
    DBIO.sequence(dbios).map(_ => Done)
  }
}
```

### Stateful handler

The `SlickHandler` can be stateful, with variables and mutable data structures. It is invoked by the `Projection` machinery one envelope at a time and visibility guarantees between the invocations are handled automatically, i.e. no volatile or other concurrency primitives are needed for managing the state as long as it’s not accessed by other threads than the one that called `process`.

Note
It is important that the `Handler` instance is not shared between several `Projection` instances, because then it would be invoked concurrently, which is not how it is intended to be used. Each `Projection` instance should use a new `Handler` instance. 

### Async handler

The [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") can be used with `SlickProjection.atLeastOnceAsync` and `SlickProjection.groupedWithinAsync` if the handler is not storing the projection result in the database. The handler could [send to a Kafka topic](kafka.html#sending-to-kafka) or integrate with something else.

There are several examples of such `Handler` in the [documentation for Cassandra Projections](cassandra.html#handler). Same type of handlers can be used with `SlickProjection` instead of `CassandraProjection`.

### Actor handler

A good alternative for advanced state management is to implement the handler as an [actor](https://doc.akka.io/libraries/akka-core/current/typed/actors.html), which is described in [Processing with Actor](actor.html).

### Flow handler

An Akka Streams `FlowWithContext` can be used instead of a handler for processing the envelopes, which is described in [Processing with Akka Streams](flow.html).

### Handler lifecycle

You can override the `start` and `stop` methods of the [`SlickHandler`](/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler.html "akka.projection.slick.SlickHandler")[`SlickHandler`](/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler.html "akka.projection.slick.SlickHandler") to implement initialization before first envelope is processed and resource cleanup when the projection is stopped. Those methods are also called when the `Projection` is restarted after failure.

See also [error handling](error.html).

## Schema

The database schema for the offset storage table:

PostgreSQL

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-postgres.sql#L4-L22 "Go to snippet source")CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX IF NOT EXISTS akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

MySQL

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-mysql.sql#L3-L21 "Go to snippet source")CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

Microsoft SQL Server

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-mssql.sql#L3-L29 "Go to snippet source")IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_offset_store') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_offset_store ADD CONSTRAINT pk_projection_id PRIMARY KEY(projection_name, projection_key)

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name)
END

IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_management') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_management ADD CONSTRAINT pk_projection_management_id PRIMARY KEY(projection_name, projection_key)
END
```

Oracle

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-oracle.sql#L3-L26 "Go to snippet source")BEGIN
execute immediate 'create table "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"CURRENT_OFFSET" VARCHAR2(255) NOT NULL,"MANIFEST" VARCHAR2(4) NOT NULL,"MERGEABLE" CHAR(1) NOT NULL check ("MERGEABLE" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_OFFSET_STORE" add constraint "PK_PROJECTION_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
execute immediate 'create index "AKKA_PROJECTION_NAME_INDEX" on "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;

BEGIN
execute immediate 'create table "AKKA_PROJECTION_MANAGEMENT" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"PAUSED" CHAR(1) NOT NULL check ("PAUSED" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_MANAGEMENT" add constraint "PK_PROJECTION_MANAGEMENT_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;
```

H2

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/resources/create-table-h2.sql#L3-L21 "Go to snippet source")CREATE TABLE IF NOT EXISTS "akka_projection_offset_store" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "current_offset" VARCHAR(255) NOT NULL,
  "manifest" VARCHAR(4) NOT NULL,
  "mergeable" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);

CREATE INDEX IF NOT EXISTS "akka_projection_name_index" ON "akka_projection_offset_store" ("projection_name");

CREATE TABLE IF NOT EXISTS "akka_projection_management" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "paused" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);
```

The schema can be created and dropped using the methods `SlickProjection.createTablesIfNotExists` and `SlickProjection.dropTablesIfExists`. This is particularly useful when writting tests. For production enviornments, we recommend creating the schema before deploying the application.

Important
As of version 1\.1\.0, the schema for PostgreSQL and H2 databases has changed. It now defaults to lowercase table and column names. If you have a schema in production, we recommend applying an ALTER table script to change it accordingly.

Alternatively, you can fallback to the uppercase format. You will also need to set `akka.projection.slick.offset-store.table` as an uppercase value, as this setting is now defaulting to lowercase.

```
akka.projection.slick.offset-store {
  table = "AKKA_PROJECTION_OFFSET_STORE"
  use-lowercase-schema = false
}

```

## Offset types

The supported offset types of the `SlickProjection` are:

- [`Offset`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html "akka.persistence.query.Offset")[`Offset`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html "akka.persistence.query.Offset") types from [events from Akka Persistence](eventsourced.html)
- [`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset") that is used for [messages from Kafka](kafka.html#mergeable-offset)
- `String`
- `Int`
- `Long`
- Any other type that has a configured Akka Serializer is stored with base64 encoding of the serialized bytes.

## Configuration

Make your edits/overrides in your application.conf.

The reference configuration file with the default values:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-slick/src/main/resources/reference.conf#L5-L38 "Go to snippet source")akka.projection.slick {

  # The Slick profile to use
  # set to one of: 
  #  slick.jdbc.H2Profile$
  #  slick.jdbc.PostgresProfile$
  #  slick.jdbc.MySQLProfile$
  #  slick.jdbc.SQLServerProfile$ 
  #  slick.jdbc.OracleProfile$
  #profile = <fill this with your profile of choice>

  # add here your Slick db settings
  db {
    # url = "jdbc:h2:mem:test1;OPTIMIZE_REUSE_RESULTS=FALSE"
    # driver = org.h2.Driver
    # connectionPool = disabled
    # keepAliveConnection = true
  }

  offset-store {
    # set this to your database schema if applicable, empty by default
    schema = ""
    # the database table name for the offset store
    table = "akka_projection_offset_store"

    # the database table name for the projection manangement data
    management-table = "akka_projection_management"

    # Use lowercase table and column names. 
    # This is mostly useful for H2 and Postgres databases. MySQL and SQL Server are case insensitive. 
    # Oracle schema is case sensitive and is defined with uppercase, this property is therefore ignore when using Oracle
    use-lowercase-schema = true
  }
}
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

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-projection-slick" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-slick_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-slick_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: exactly-once

```scala
import akka.projection.ProjectionId
import akka.projection.slick.SlickProjection
import slick.basic.DatabaseConfig
import slick.dbio.DBIO
import slick.jdbc.H2Profile

implicit val ec: ExecutionContext = system.executionContext

val projection =
  SlickProjection.exactlyOnce(
    projectionId = ProjectionId("ShoppingCarts", "carts-1"),
    sourceProvider,
    dbConfig,
    handler = () => new ShoppingCartHandler(repository))
```

### Example 8: at-least-once

```scala
implicit val ec: ExecutionContext = system.executionContext

val projection =
  SlickProjection
    .atLeastOnce(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      dbConfig,
      handler = () => new ShoppingCartHandler(repository))
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

### Example 9: groupedWithin

```scala
implicit val ec: ExecutionContext = system.executionContext

val projection =
  SlickProjection
    .groupedWithin(
      projectionId = ProjectionId("ShoppingCarts", "carts-1"),
      sourceProvider,
      dbConfig,
      handler = () => new GroupedShoppingCartHandler(repository))
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

### Example 10: Handler

```scala
import scala.concurrent.Future

import akka.Done
import akka.projection.slick.SlickHandler
import org.slf4j.LoggerFactory

class ShoppingCartHandler(repository: OrderRepository)(implicit ec: ExecutionContext)
    extends SlickHandler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): DBIO[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        repository.save(Order(cartId, time))

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        DBIO.successful(Done)
    }
  }
}
```

### Example 11: Handler

```scala
case class Order(id: String, time: Instant)

class OrderRepository(val dbConfig: DatabaseConfig[H2Profile]) {

  import dbConfig.profile.api._

  private class OrdersTable(tag: Tag) extends Table[Order](tag, "ORDERS") {
    def id = column[String]("CART_ID", O.PrimaryKey)

    def time = column[Instant]("TIME")

    def * = (id, time).mapTo[Order]
  }

  private val ordersTable = TableQuery[OrdersTable]

  def save(order: Order)(implicit ec: ExecutionContext) = {
    ordersTable.insertOrUpdate(order).map(_ => Done)
  }

  def createTable(): Future[Unit] =
    dbConfig.db.run(ordersTable.schema.createIfNotExists)
}
```

### Example 12: Handler

```scala
val dbConfig: DatabaseConfig[H2Profile] = DatabaseConfig.forConfig("akka.projection.slick", system.settings.config)

val repository = new OrderRepository(dbConfig)
```

### Example 13: Grouped handler

```scala
import scala.collection.immutable

class GroupedShoppingCartHandler(repository: OrderRepository)(implicit ec: ExecutionContext)
    extends SlickHandler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): DBIO[Done] = {
    val dbios = envelopes.map(_.event).map {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")
        repository.save(Order(cartId, time))

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        DBIO.successful(Done)
    }
    DBIO.sequence(dbios).map(_ => Done)
  }
}
```

### Example 14: Schema

```sql
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX IF NOT EXISTS akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 15: Schema

```sql
CREATE TABLE IF NOT EXISTS akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name);

CREATE TABLE IF NOT EXISTS akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BOOLEAN NOT NULL,
  last_updated BIGINT NOT NULL,
  PRIMARY KEY(projection_name, projection_key)
);
```

### Example 16: Schema

```sql
IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_offset_store') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_offset_store (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  current_offset VARCHAR(255) NOT NULL,
  manifest VARCHAR(4) NOT NULL,
  mergeable BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_offset_store ADD CONSTRAINT pk_projection_id PRIMARY KEY(projection_name, projection_key)

CREATE INDEX akka_projection_name_index ON akka_projection_offset_store (projection_name)
END

IF NOT EXISTS (SELECT 1 FROM SYS.OBJECTS WHERE OBJECT_ID = OBJECT_ID(N'akka_projection_management') AND TYPE IN (N'U'))
BEGIN
CREATE TABLE akka_projection_management (
  projection_name VARCHAR(255) NOT NULL,
  projection_key VARCHAR(255) NOT NULL,
  paused BIT NOT NULL,
  last_updated BIGINT NOT NULL
)

ALTER TABLE akka_projection_management ADD CONSTRAINT pk_projection_management_id PRIMARY KEY(projection_name, projection_key)
END
```

### Example 17: Schema

```sql
BEGIN
execute immediate 'create table "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"CURRENT_OFFSET" VARCHAR2(255) NOT NULL,"MANIFEST" VARCHAR2(4) NOT NULL,"MERGEABLE" CHAR(1) NOT NULL check ("MERGEABLE" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_OFFSET_STORE" add constraint "PK_PROJECTION_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
execute immediate 'create index "AKKA_PROJECTION_NAME_INDEX" on "AKKA_PROJECTION_OFFSET_STORE" ("PROJECTION_NAME") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;

BEGIN
execute immediate 'create table "AKKA_PROJECTION_MANAGEMENT" ("PROJECTION_NAME" VARCHAR2(255) NOT NULL,"PROJECTION_KEY" VARCHAR2(255) NOT NULL,"PAUSED" CHAR(1) NOT NULL check ("PAUSED" in (0, 1)),"LAST_UPDATED" NUMBER(19) NOT NULL) ';
execute immediate 'alter table "AKKA_PROJECTION_MANAGEMENT" add constraint "PK_PROJECTION_MANAGEMENT_ID" primary key("PROJECTION_NAME","PROJECTION_KEY") ';
EXCEPTION
    WHEN OTHERS THEN
      IF SQLCODE = -955 THEN
        NULL; -- suppresses ORA-00955 exception
      ELSE
         RAISE;
      END IF;
END;
```

### Example 18: Schema

```sql
CREATE TABLE IF NOT EXISTS "akka_projection_offset_store" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "current_offset" VARCHAR(255) NOT NULL,
  "manifest" VARCHAR(4) NOT NULL,
  "mergeable" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);

CREATE INDEX IF NOT EXISTS "akka_projection_name_index" ON "akka_projection_offset_store" ("projection_name");

CREATE TABLE IF NOT EXISTS "akka_projection_management" (
  "projection_name" VARCHAR(255) NOT NULL,
  "projection_key" VARCHAR(255) NOT NULL,
  "paused" BOOLEAN NOT NULL,
  "last_updated" BIGINT NOT NULL,
  PRIMARY KEY("projection_name", "projection_key")
);
```

### Example 19: Schema

```hocon
akka.projection.slick.offset-store {
  table = "AKKA_PROJECTION_OFFSET_STORE"
  use-lowercase-schema = false
}
```

### Example 20: Configuration

```conf
akka.projection.slick {

  # The Slick profile to use
  # set to one of: 
  #  slick.jdbc.H2Profile$
  #  slick.jdbc.PostgresProfile$
  #  slick.jdbc.MySQLProfile$
  #  slick.jdbc.SQLServerProfile$ 
  #  slick.jdbc.OracleProfile$
  #profile = <fill this with your profile of choice>

  # add here your Slick db settings
  db {
    # url = "jdbc:h2:mem:test1;OPTIMIZE_REUSE_RESULTS=FALSE"
    # driver = org.h2.Driver
    # connectionPool = disabled
    # keepAliveConnection = true
  }

  offset-store {
    # set this to your database schema if applicable, empty by default
    schema = ""
    # the database table name for the offset store
    table = "akka_projection_offset_store"

    # the database table name for the projection manangement data
    management-table = "akka_projection_management"

    # Use lowercase table and column names. 
    # This is mostly useful for H2 and Postgres databases. MySQL and SQL Server are case insensitive. 
    # Oracle schema is case sensitive and is defined with uppercase, this property is therefore ignore when using Oracle
    use-lowercase-schema = true
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/slick/SlickProjection$.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/Offset.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-projection/current/actor.html
- https://doc.akka.io/libraries/akka-projection/current/cassandra.html
- https://doc.akka.io/libraries/akka-projection/current/dynamodb.html
- https://doc.akka.io/libraries/akka-projection/current/error.html
- https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/current/flow.html
- https://doc.akka.io/libraries/akka-projection/current/jdbc.html
- https://doc.akka.io/libraries/akka-projection/current/kafka.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/slick.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/slick.html](https://doc.akka.io/libraries/akka-projection/current/slick.html)*