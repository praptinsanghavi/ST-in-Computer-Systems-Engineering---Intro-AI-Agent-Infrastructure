---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/dynamodb.html
title: Offset in DynamoDB • Akka Projection
---

# Offset in DynamoDB • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Offset in DynamoDB

[`DynamoDBProjection`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBProjection$.html "akka.projection.dynamodb.javadsl.DynamoDBProjection")[`DynamoDBProjection`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBProjection$.html "akka.projection.dynamodb.scaladsl.DynamoDBProjection") has support for storing offsets in DynamoDB via [Akka Persistence DynamoDB](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/overview.html).

The source of the envelopes is from a `SourceProvider`, which can be:

- events from Event Sourced entities via the [SourceProvider for eventsBySlices](eventsourced.html#sourceprovider-for-eventsbyslices) with the [eventsBySlices query](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/query.html#eventsbyslices)

The target database operations can run in the same transaction as storing the offset, so that [exactly\-once](dynamodb.html#exactly-once) processing semantics are supported. It also offers [at\-least\-once](dynamodb.html#at-least-once) semantics.

## Dependencies

The Akka dependencies are available from Akka’s library repository. To access them there, you need to configure the URL for this repository.

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
sbt
```
resolvers += "Akka library repository".at("https://repo.akka.io/maven")

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

To use the DynamoDB module of Akka Projections, add the following dependencies to your project:

Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-dynamodb_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```
sbt
```
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-projection-dynamodb" % "1.6.20",
  "com.lightbend.akka" %% "akka-persistence-dynamodb" % "1.6.20"
)
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-dynamodb_${versions.ScalaBinary}:1.6.20"
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projection DynamoDB depends on Akka 2\.10\.13 or later, and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

| Project Info: Akka Projection DynamoDB | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-dynamodb 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.dynamodb |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.6\.0, 2024\-10\-17 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-dynamodb`’s direct dependencies, and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-persistence\-dynamodb\_2\.13 | [2\.0\.11](https://mvnrepository.com/artifact/com.lightbend.akka/akka-persistence-dynamodb_2.13/2.0.11) |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.lightbend.akka | akka\-projection\-eventsourced\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-eventsourced_2.13/1.6.20) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13) |
| com.typesafe.akka | akka\-persistence\-typed\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.13) |
| com.typesafe.akka | akka\-stream\-typed\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.10.13) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.lightbend.akka    akka-persistence-dynamodb_2.13    [2.0.11](https://mvnrepository.com/artifact/com.lightbend.akka/akka-persistence-dynamodb_2.13/2.0.11)    BUSL-1.1
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
    com.typesafe.akka    akka-persistence-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.13)    BUSL-1.1
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
        com.typesafe.akka    akka-remote_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-pki_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.13)    BUSL-1.1
                com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.10.13)    BUSL-1.1
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
            com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    software.amazon.awssdk    dynamodb    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/dynamodb/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/auth/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws-eventstream    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws-eventstream/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
        software.amazon.awssdk    aws-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/aws-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/auth/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws-eventstream    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws-eventstream/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
        software.amazon.awssdk    aws-json-protocol    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/aws-json-protocol/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    aws-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/aws-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/auth/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws-eventstream    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws-eventstream/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.eventstream    eventstream    [1.0.1](https://mvnrepository.com/artifact/software.amazon.eventstream/eventstream/1.0.1)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    protocol-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/protocol-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-auth    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    netty-nio-client    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/netty-nio-client/2.31.63)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec-http2    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http2/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec-http    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec-http    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec-http/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-handler    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-codec    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport-classes-epoll    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-classes-epoll/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport-native-unix-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                            io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.118.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.118.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.118.Final)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    protocol-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/protocol-core/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    regions    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/regions/2.31.63)    Apache License, Version 2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    json-utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/json-utils/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    third-party-jackson-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/third-party-jackson-core/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    sdk-core    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/sdk-core/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    endpoints-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/endpoints-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-aws    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-aws/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    checksums    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    checksums-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/checksums-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-auth-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-auth-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    http-client-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/http-client-spi/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    identity-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/identity-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    metrics-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/metrics-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    profiles    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/profiles/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    retries    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    retries-spi    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/retries-spi/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                    software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                        software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
                software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                    org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                    software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
            software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
                software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
        software.amazon.awssdk    utils    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/utils/2.31.63)    Apache License, Version 2.0
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            software.amazon.awssdk    annotations    [2.31.63](https://mvnrepository.com/artifact/software.amazon.awssdk/annotations/2.31.63)    Apache License, Version 2.0
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
com.lightbend.akka    akka-projection-eventsourced_2.13    [1.6.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-eventsourced_2.13/1.6.20)
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
com.typesafe.akka    akka-persistence-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.13)    BUSL-1.1
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
    com.typesafe.akka    akka-remote_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-pki_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.13)    BUSL-1.1
            com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-stream-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.10.13)    BUSL-1.1
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
        com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-stream-typed_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-typed_2.13/2.10.13)    BUSL-1.1
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

## Tables

Akka Projection DynamoDB requires an offset table to be created in DynamoDB. The default table name is `timestamp_offset` and this can be configured (see the [reference configuration](dynamodb.html#reference-configuration) for all settings). The table should be created with the following attributes and key schema:

| Attribute name | Attribute type | Key type |
| --- | --- | --- |
| name\_slice | S (String) | HASH |
| pid | S (String) | RANGE |

Read and write capacity units should be based on expected projection activity.

An example `aws` CLI command for creating the timestamp offset table:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb/scripts/create-tables.sh#L4-L13 "Go to snippet source")aws dynamodb create-table \
  --table-name timestamp_offset \
  --attribute-definitions \
      AttributeName=name_slice,AttributeType=S \
      AttributeName=pid,AttributeType=S \
  --key-schema \
      AttributeName=name_slice,KeyType=HASH \
      AttributeName=pid,KeyType=RANGE \
  --provisioned-throughput \
      ReadCapacityUnits=5,WriteCapacityUnits=5
```

### Creating tables locally

The DynamoDB client [can be configured](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/config.html#dynamodb-client-configuration) with a local mode, for testing with DynamoDB local:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L30-L32 "Go to snippet source")akka.persistence.dynamodb {
  client.local.enabled = true
}
```

Similar to [creating tables locally](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/getting-started.html#creating-tables-locally) for Akka Persistence DynamoDB, a [`CreateTables`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/CreateTables$.html "akka.projection.dynamodb.javadsl.CreateTables")[`CreateTables`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/CreateTables$.html "akka.projection.dynamodb.scaladsl.CreateTables") utility is provided for creating projection tables locally:

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L27-L95 "Go to snippet source")import akka.persistence.dynamodb.util.ClientProvider;
import akka.projection.dynamodb.DynamoDBProjectionSettings;
import akka.projection.dynamodb.javadsl.CreateTables;
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient;

String dynamoDBConfigPath = "akka.projection.dynamodb";

DynamoDBProjectionSettings settings =
    DynamoDBProjectionSettings.create(system.settings().config().getConfig(dynamoDBConfigPath));

DynamoDbAsyncClient client = ClientProvider.get(system).clientFor(settings.useClient());

// create journal table, synchronously
CreateTables.createTimestampOffsetStoreTable(system, settings, client, /*deleteIfExists:*/ true)
    .toCompletableFuture()
    .get(10, TimeUnit.SECONDS);
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L451-L466 "Go to snippet source")import akka.persistence.dynamodb.util.ClientProvider
import akka.projection.dynamodb.DynamoDBProjectionSettings
import akka.projection.dynamodb.scaladsl.CreateTables
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

val dynamoDBConfigPath = "akka.projection.dynamodb"

val settings: DynamoDBProjectionSettings =
  DynamoDBProjectionSettings(system.settings.config.getConfig(dynamoDBConfigPath))

val client: DynamoDbAsyncClient = ClientProvider(system).clientFor(settings.useClient)

// create timestamp offset table, synchronously
Await.result(
  CreateTables.createTimestampOffsetStoreTable(system, settings, client, deleteIfExists = true),
  10.seconds)
```

## Configuration

By default, Akka Projection DynamoDB shares the [DynamoDB client configuration](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/config.html#dynamodb-client-configuration) with Akka Persistence DynamoDB.

### Batch writes

Offsets are written in batches for [at\-least\-once](dynamodb.html#at-least-once) and [at\-least\-once (grouped)](dynamodb.html#at-least-once-grouped-). To reduce the risk of write throttling it is recommended to save at most 25 offsets at a time. This is configured by: 

```
akka.projection.at-least-once.save-offset-after-envelopes = 25
akka.projection.grouped.group-after-envelopes = 25

```

### Reference configuration

The following can be overridden in your `application.conf` for projection specific settings:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb/src/main/resources/reference.conf#L5-L69 "Go to snippet source")akka.projection.dynamodb {

  offset-store {
    # the DynamoDB table name for the offset store
    timestamp-offset-table = "timestamp_offset"

    # The offset store will keep track of persistence ids and sequence numbers
    # within this time window from latest offset.
    time-window = 5 minutes

    # Backtracking window of the source (query). Should be equal to
    # the akka.persistence.dynamodb.query.backtracking.window that is used for the
    # SourceProvider.
    # It should not be larger than the akka.projection.dynamodb.offset-store.time-window.
    backtracking-window = ${akka.persistence.dynamodb.query.backtracking.window}

    # Trying to batch insert offsets in batches of this size.
    # Must be less than or equal to 25 (hard limit in DynamoDB)
    offset-batch-size = 25

    # Number of slices (within a given projection's slice range) which will be queried for
    # offsets simultaneously.  The underlying Dynamo client must be able to handle
    # (`http.max-concurrency` plus `http.max-pending-connection-acquires`) at least this number
    # of concurrent requests.
    #
    # Set to 1024 to always query for all slices simultaneously.  The minimum allowed value
    # is 1.  If there are more than 64 slices in a range (e.g. fewer than 16 projections
    # consuming events), then increasing this may result in slightly faster projection starts;
    # conversely, if there are many slices being projected using a given Dynamo client,
    # reducing this may result in fewer restarts of the projection due to failure to query
    # starting offsets.
    offset-slice-read-parallelism = 64

    # Batch writes are not automatically retried by the underlying SDK, so these settings govern those retries
    retries {
      max-retries = 3
      min-backoff = 200ms
      max-backoff = 2s
      random-factor = 0.3
    }

    # If sequence numbers have been reset (for example, by deleting events and then reusing
    # the same persistence id) and offsets have been retained for this persistence id, then
    # new events will be seen as duplicates. Detect earlier sequence numbers as resets, rather
    # than duplicates, if events are newer by this duration. Accept the first event (sequence
    # number 1), otherwise reject to trigger replay (see replay-on-rejected-sequence-numbers).
    # Set to `off`, `none`, or empty ("") to disable.
    accept-sequence-number-reset-after = off
  }

  # Replay missed events for a particular persistence id when a sequence number is rejected by validation.
  # If using Replicated Event Sourcing or Projections over gRPC with event filters this must be enabled.
  replay-on-rejected-sequence-numbers = on

  # By default it shares DynamoDB client with akka-persistence-dynamodb (write side).
  # To use a separate client for projections this can be
  # set to another config path that defines the config based on
  # akka.persistence.dynamodb.client config.
  use-client = "akka.persistence.dynamodb.client"

  # Filtered events are not actually filtered but passed through the handling flow
  # for atLeastOnceFlow, in some applications this is fine, set to false to disable
  # the info logged when seeing such filtered events
  warn-about-filtered-events-in-flow = true
}
```

## Running with Sharded Daemon Process

The Sharded Daemon Process can be used to distribute `n` instances of a given Projection across the cluster. Therefore, it’s important that each Projection instance consumes a subset of the stream of envelopes.

When using `eventsBySlices` the initialization code looks like this:

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L59-L364 "Go to snippet source")import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.dynamodb.query.javadsl.DynamoDBReadJournal;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.Projection;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;

import java.util.Optional;

void initProjections() {
  ShardedDaemonProcess.get(system)
      .initWithContext(
          ProjectionBehavior.Command.class,
          "ShoppingCartProjection",
          4,
          daemonContext -> {
            List<Pair<Integer, Integer>> sliceRanges =
                EventSourcedProvider.sliceRanges(
                    system, DynamoDBReadJournal.Identifier(), daemonContext.totalProcesses());
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
          system, DynamoDBReadJournal.Identifier(), entityType, minSlice, maxSlice);

  ProjectionId projectionId =
      ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);
  Optional<DynamoDBProjectionSettings> settings = Optional.empty();

  return DynamoDBProjection.exactlyOnce(
      projectionId, settings, sourceProvider, ShoppingCartTransactHandler::new, system);
}
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L245-L286 "Go to snippet source")import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.dynamodb.query.scaladsl.DynamoDBReadJournal
import akka.persistence.query.typed.EventEnvelope
import akka.projection.Projection
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider

def sourceProvider(sliceRange: Range): SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
  EventSourcedProvider.eventsBySlices[ShoppingCart.Event](
    system,
    readJournalPluginId = DynamoDBReadJournal.Identifier,
    ShoppingCart.EntityKey.name,
    sliceRange.min,
    sliceRange.max)

def projection(sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
  val minSlice = sliceRange.min
  val maxSlice = sliceRange.max
  val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

  DynamoDBProjection.exactlyOnce(
    projectionId,
    settings = None,
    sourceProvider(sliceRange),
    handler = () => new ShoppingCartTransactHandler)
}

ShardedDaemonProcess(system).initWithContext(
  name = "ShoppingCartProjection",
  initialNumberOfInstances = 4,
  behaviorFactory = { daemonContext =>
    val sliceRanges =
      EventSourcedProvider.sliceRanges(system, DynamoDBReadJournal.Identifier, daemonContext.totalProcesses)
    val sliceRange = sliceRanges(daemonContext.processNumber)
    ProjectionBehavior(projection(sliceRange))
  },
  ShardedDaemonProcessSettings(system),
  stopMessage = ProjectionBehavior.Stop)
```

The [`ShoppingCartTransactHandler` is shown below](dynamodb.html#transact-handler).

It is possible to dynamically scale the number of Projection instances as described in the [Sharded Daemon Process documentation](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html#dynamic-scaling-of-number-of-workers).

There are alternative ways of running the `ProjectionBehavior` as described in [Running a Projection](running.html).

## Slices

The `SourceProvider` for Event Sourced actors has historically been using `eventsByTag` but the DynamoDB plugin is instead providing `eventsBySlices` as an improved solution.

The usage of `eventsByTag` for Projections has the drawback that the number of tags must be decided up\-front and can’t easily be changed afterwards. Starting with too many tags means a lot of overhead, since many projection instances would be running on each node in a small Akka Cluster, with each projection instance polling the database periodically. Starting with too few tags means that it can’t be scaled later to more Akka nodes.

With `eventsBySlices` more Projection instances can be added when needed and still reuse the offsets for the previous slice distributions.

A slice is deterministically defined based on the persistence id. The purpose is to evenly distribute all persistence ids over the slices. The `eventsBySlices` query is for a range of the slices. For example if using 1024 slices and running 4 Projection instances the slice ranges would be 0\-255, 256\-511, 512\-767, 768\-1023\. Changing to 8 slice ranges means that the ranges would be 0\-127, 128\-255, 256\-383, …, 768\-895, 896\-1023\.

However, when changing the number of slices the projections with the old slice distribution must be stopped before starting new projections. That can be done at runtime when [Running with Sharded Daemon Process](dynamodb.html#running-with-sharded-daemon-process).

When using `DynamoDBProjection` together with the `EventSourcedProvider.eventsBySlices` the events will be delivered in sequence number order without duplicates.

## exactly\-once

The offset is stored in the same transaction as items returned by the projection handler, providing exactly\-once processing semantics if the projection is restarted from a previously stored offset. A [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") is implemented, returning a collection of DynamoDB `TransactWriteItem`s which will be stored in the same transaction.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L68-L77 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.exactlyOnce(
        projectionId, settings, sourceProvider, ShoppingCartTransactHandler::new, system);
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L297-L306 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection = DynamoDBProjection.exactlyOnce(
  projectionId,
  settings = None,
  sourceProvider,
  handler = () => new ShoppingCartTransactHandler)
```

The [`ShoppingCartTransactHandler` is shown below](dynamodb.html#transact-handler).

## at\-least\-once

The offset is stored after the envelope has been processed, providing at\-least\-once processing semantics. This means that if the projection is restarted from a previously stored offset some elements may be processed more than once. Therefore, the [Handler](dynamodb.html#handler) code must be idempotent.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L68-L77 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

int saveOffsetAfterEnvelopes = 25;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.atLeastOnce(
            projectionId,
            settings,
            sourceProvider,
            () -> new ShoppingCartHandler(client),
            system)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L320-L328 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  DynamoDBProjection
    .atLeastOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler(client))
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withSaveOffset` of the returned `AtLeastOnceProjection`. The default settings for the window is defined in the configuration section `akka.projection.at-least-once`. There is a performance benefit of not storing the offset too often, but the drawback is that there can be more duplicates that will be processed again when the projection is restarted.

Offsets are written in batches. To reduce the risk of write throttling it is recommended to save at most 25 offsets at a time.

The [`ShoppingCartHandler` is shown below](dynamodb.html#generic-handler).

## exactly\-once (grouped)

The envelopes can be grouped before processing, which can be useful for batch updates.

The offset is stored in the same transaction as items returned by the projection handler, providing exactly\-once processing semantics if the projection is restarted from a previously stored offset. A [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") is implemented, returning a collection of DynamoDB `TransactWriteItem`s which will be stored in the same transaction.

The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This window can be defined using `withGroup` of the returned `GroupedProjection`. The default settings for the window is defined in the configuration section `akka.projection.grouped`.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L68-L77 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

int groupAfterEnvelopes = 25;
Duration groupAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.exactlyOnceGroupedWithin(
            projectionId,
            settings,
            sourceProvider,
            GroupedShoppingCartTransactHandler::new,
            system)
        .withGroup(groupAfterEnvelopes, groupAfterDuration);
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L341-L353 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  DynamoDBProjection
    .exactlyOnceGroupedWithin(
      projectionId,
      settings = None,
      sourceProvider,
      handler = () => new GroupedShoppingCartTransactHandler)
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

The [`GroupedShoppingCartTransactHandler` is shown below](dynamodb.html#grouped-transact-handler).

## at\-least\-once (grouped)

The envelopes can be grouped before processing, which can be useful for batch updates.

The offsets are stored after the envelopes have been processed, providing at\-least\-once processing semantics. This means that if the projection is restarted from a previously stored offset some elements may be processed more than once. Therefore, the [Handler](dynamodb.html#handler) code must be idempotent.

The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This window can be defined using `withGroup` of the returned `GroupedProjection`. The default settings for the window is defined in the configuration section `akka.projection.grouped`.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L68-L77 "Go to snippet source")import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

int groupAfterEnvelopes = 25;
Duration groupAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.atLeastOnceGroupedWithin(
            projectionId,
            settings,
            sourceProvider,
            () -> new GroupedShoppingCartHandler(client, system),
            system)
        .withGroup(groupAfterEnvelopes, groupAfterDuration);
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L367-L379 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  DynamoDBProjection
    .atLeastOnceGroupedWithin(
      projectionId,
      settings = None,
      sourceProvider,
      handler = () => new GroupedShoppingCartHandler(client))
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

Offsets are written immediately after the group of envelopes has been processed. To reduce the risk of write throttling it is recommended to save at most 25 offsets at a time, and therefore not exceed this for the group size.

The [`GroupedShoppingCartHandler` is shown below](dynamodb.html#grouped-handler).

## Handler

For at\-least\-once processing, a generic projection [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") is implemented and projections can do any processing, with or without DynamoDB.

For exactly\-once processing, a [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") is implemented, returning a collection of DynamoDB `TransactWriteItem`s which will be written in the same transaction as storing the offsets.

### Generic handler

A generic [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") that is consuming `ShoppingCart.Event` from `eventsBySlices` can look like this:

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L36-L166 "Go to snippet source")import akka.projection.dynamodb.javadsl.Requests;
import akka.projection.javadsl.Handler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class ShoppingCartHandler extends Handler<EventEnvelope<ShoppingCart.Event>> {

  private final DynamoDbAsyncClient client;

  private final Logger logger = LoggerFactory.getLogger(getClass());

  public ShoppingCartHandler(DynamoDbAsyncClient client) {
    this.client = client;
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      Map<String, AttributeValue> attributes =
          Map.of(
              "id", AttributeValue.fromS(checkedOut.cartId),
              "time", AttributeValue.fromN(String.valueOf(checkedOut.eventTime.toEpochMilli())));

      CompletableFuture<PutItemResponse> response =
          client.putItem(PutItemRequest.builder().tableName("orders").item(attributes).build());

      return response.thenApply(__ -> Done.getInstance());

    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }
}

```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L53-L90 "Go to snippet source")import akka.Done
import akka.persistence.query.typed.EventEnvelope
import akka.projection.scaladsl.Handler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest

import scala.concurrent.Future
import scala.jdk.CollectionConverters._
import scala.jdk.FutureConverters._

class ShoppingCartHandler(client: DynamoDbAsyncClient)(implicit ec: ExecutionContext)
    extends Handler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")

        val attributes = Map(
          "id" -> AttributeValue.fromS(cartId),
          "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

        client
          .putItem(
            PutItemRequest.builder
              .tableName("orders")
              .item(attributes)
              .build())
          .asScala
          .map(_ => Done)

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        Future.successful(Done)
    }
  }
}
```

Hint
Simple handlers can also be defined as plain functions via the helper `Handler.apply``Handler.fromFunction` factory method.

### Transact handler

A [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") that is consuming `ShoppingCart.Event` from `eventsBySlices` can look like this:

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L43-L204 "Go to snippet source")import akka.projection.dynamodb.javadsl.DynamoDBTransactHandler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class ShoppingCartTransactHandler
    implements DynamoDBTransactHandler<EventEnvelope<ShoppingCart.Event>> {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Collection<TransactWriteItem>> process(
      EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      Map<String, AttributeValue> attributes =
          Map.of(
              "id", AttributeValue.fromS(checkedOut.cartId),
              "time", AttributeValue.fromN(String.valueOf(checkedOut.eventTime.toEpochMilli())));

      List<TransactWriteItem> items =
          List.of(
              TransactWriteItem.builder()
                  .put(Put.builder().tableName("orders").item(attributes).build())
                  .build());

      return CompletableFuture.completedFuture(items);

    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Collections.emptyList());
    }
  }
}

```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L96-L132 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope
import akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem

import scala.concurrent.Future
import scala.jdk.CollectionConverters._

class ShoppingCartTransactHandler extends DynamoDBTransactHandler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): Future[Iterable[TransactWriteItem]] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")

        val attributes = Map(
          "id" -> AttributeValue.fromS(cartId),
          "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

        Future.successful(
          Seq(
            TransactWriteItem.builder
              .put(
                Put.builder
                  .tableName("orders")
                  .item(attributes)
                  .build())
              .build()))

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        Future.successful(Seq.empty)
    }
  }
}
```

Hint
Simple handlers can also be defined as plain functions via the helper `DynamoDBTransactHandler.apply``DynamoDBTransactHandler.fromFunction` factory method.

### Grouped handler

When using [`DynamoDBProjection.atLeastOnceGroupedWithin`](dynamodb.html#at-least-once-grouped-) the handler is processing a `Seq``List` of envelopes.

If a [batch write](https://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_BatchWriteItem.html) to DynamoDB is being used, it’s possible for items in the batch to fail to be written, and the response should be checked for unprocessed items. A [`Requests`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/Requests$.html "akka.projection.dynamodb.javadsl.Requests")[`Requests`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/Requests$.html "akka.projection.dynamodb.scaladsl.Requests") utility is provided, to retry batch writes (with exponential backoff) for any unprocessed items.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L36-L272 "Go to snippet source")import akka.projection.dynamodb.javadsl.Requests;
import akka.projection.javadsl.Handler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class GroupedShoppingCartHandler extends Handler<List<EventEnvelope<ShoppingCart.Event>>> {

  private final DynamoDbAsyncClient client;
  private final ActorSystem<?> system;

  private final Logger logger = LoggerFactory.getLogger(getClass());

  public GroupedShoppingCartHandler(DynamoDbAsyncClient client, ActorSystem<?> system) {
    this.client = client;
    this.system = system;
  }

  @Override
  public CompletionStage<Done> process(List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    List<WriteRequest> items =
        envelopes.stream()
            .flatMap(
                envelope -> {
                  ShoppingCart.Event event = envelope.event();

                  if (event instanceof ShoppingCart.CheckedOut) {
                    ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

                    logger.info(
                        "Shopping cart {} was checked out at {}",
                        checkedOut.cartId,
                        checkedOut.eventTime);

                    Map<String, AttributeValue> attributes =
                        Map.of(
                            "id",
                            AttributeValue.fromS(checkedOut.cartId),
                            "time",
                            AttributeValue.fromN(
                                String.valueOf(checkedOut.eventTime.toEpochMilli())));

                    return Stream.of(
                        WriteRequest.builder()
                            .putRequest(PutRequest.builder().item(attributes).build())
                            .build());

                  } else {
                    logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
                    return Stream.empty();
                  }
                })
            .collect(Collectors.toList());

    BatchWriteItemRequest request =
        BatchWriteItemRequest.builder().requestItems(Map.of("orders", items)).build();

    int maxRetries = 3;
    Duration minBackoff = Duration.ofMillis(200);
    Duration maxBackoff = Duration.ofSeconds(2);
    double randomFactor = 0.3;

    // batch write, retrying writes for any unprocessed items (with exponential backoff)
    CompletionStage<List<BatchWriteItemResponse>> result =
        Requests.batchWriteWithRetries(
            client, request, maxRetries, minBackoff, maxBackoff, randomFactor, system);

    return result.thenApply(__ -> Done.getInstance());
  }
}

```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L138-L193 "Go to snippet source")import akka.Done
import akka.persistence.query.typed.EventEnvelope
import akka.projection.dynamodb.scaladsl.Requests
import akka.projection.scaladsl.Handler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.BatchWriteItemRequest
import software.amazon.awssdk.services.dynamodb.model.PutRequest
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.jdk.CollectionConverters._

class GroupedShoppingCartHandler(client: DynamoDbAsyncClient)(implicit system: ActorSystem[_], ec: ExecutionContext)
    extends Handler[Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: Seq[EventEnvelope[ShoppingCart.Event]]): Future[Done] = {
    val items = envelopes.flatMap { envelope =>
      envelope.event match {
        case ShoppingCart.CheckedOut(cartId, time) =>
          logger.info(s"Shopping cart $cartId was checked out at $time")

          val attributes =
            Map("id" -> AttributeValue.fromS(cartId), "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

          Some(
            WriteRequest.builder
              .putRequest(
                PutRequest.builder
                  .item(attributes)
                  .build())
              .build())

        case otherEvent =>
          logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
          None
      }
    }.asJava

    val request = BatchWriteItemRequest.builder
      .requestItems(Map("orders" -> items).asJava)
      .build()

    // batch write, retrying writes for any unprocessed items (with exponential backoff)
    Requests
      .batchWriteWithRetries(
        client,
        request,
        maxRetries = 3,
        minBackoff = 200.millis,
        maxBackoff = 2.seconds,
        randomFactor = 0.3)
      .map(_ => Done)
  }
}
```

### Grouped transact handler

When using [`DynamoDBProjection.exactlyOnceGroupedWithin`](dynamodb.html#exactly-once-grouped-) the [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") is processing a `Seq``List` of envelopes.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L43-L319 "Go to snippet source")import akka.projection.dynamodb.javadsl.DynamoDBTransactHandler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class GroupedShoppingCartTransactHandler
    implements DynamoDBTransactHandler<List<EventEnvelope<ShoppingCart.Event>>> {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Collection<TransactWriteItem>> process(
      List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    List<TransactWriteItem> items =
        envelopes.stream()
            .flatMap(
                envelope -> {
                  ShoppingCart.Event event = envelope.event();
                  if (event instanceof ShoppingCart.CheckedOut) {
                    ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

                    logger.info(
                        "Shopping cart {} was checked out at {}",
                        checkedOut.cartId,
                        checkedOut.eventTime);

                    Map<String, AttributeValue> attributes =
                        Map.of(
                            "id", AttributeValue.fromS(checkedOut.cartId),
                            "time",
                                AttributeValue.fromN(
                                    String.valueOf(checkedOut.eventTime.toEpochMilli())));

                    return Stream.of(
                        TransactWriteItem.builder()
                            .put(Put.builder().tableName("orders").item(attributes).build())
                            .build());

                  } else {
                    logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
                    return Stream.empty();
                  }
                })
            .collect(Collectors.toList());

    return CompletableFuture.completedFuture(items);
  }
}

```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L199-L237 "Go to snippet source")import akka.persistence.query.typed.EventEnvelope
import akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem

import scala.concurrent.Future
import scala.jdk.CollectionConverters._

class GroupedShoppingCartTransactHandler extends DynamoDBTransactHandler[Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: Seq[EventEnvelope[ShoppingCart.Event]]): Future[Iterable[TransactWriteItem]] = {
    val items = envelopes.flatMap { envelope =>
      envelope.event match {
        case ShoppingCart.CheckedOut(cartId, time) =>
          logger.info(s"Shopping cart $cartId was checked out at $time")

          val attributes = Map(
            "id" -> AttributeValue.fromS(cartId),
            "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

          Seq(
            TransactWriteItem.builder
              .put(
                Put.builder
                  .tableName("orders")
                  .item(attributes)
                  .build())
              .build())

        case otherEvent =>
          logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
          Seq.empty
      }
    }
    Future.successful(items)
  }
}
```

### Stateful handler

The [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") or [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") can be stateful, with variables and mutable data structures. It is invoked by the `Projection` machinery one envelope or group of envelopes at a time and visibility guarantees between the invocations are handled automatically, i.e. no volatile or other concurrency primitives are needed for managing the state as long as it’s not accessed by other threads than the one that called `process`.

Note
It is important that the handler instance is not shared between several projection instances, because then it would be invoked concurrently, which is not how it is intended to be used. Each projection instance should use a new handler instance.

### Flow handler

An Akka Streams `FlowWithContext` can be used instead of a handler for processing the envelopes, which is described in [Processing with Akka Streams](flow.html).

In addition to the caveats described there a `DynamoDBProjection.atLeastOnceFlow` must not filter out envelopes. Always emit a `Done` element for each completed envelope, even if application processing was skipped for the envelope.

### Handler lifecycle

You can override the `start` and `stop` methods of the [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") or [`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.javadsl.DynamoDBTransactHandler")[`DynamoDBTransactHandler`](/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html "akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler") to implement initialization before the first envelope is processed and resource cleanup when the projection is stopped. Those methods are also called when the projection is restarted after failure.

See also [error handling](error.html).

## Publish events for lower latency

See [eventsBySlices documentation](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/query.html#publish-events-for-lower-latency-of-eventsbyslices).

## Multiple plugins

Similar to how multiple plugins can be configured for the [DynamoDB persistence plugin](https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/config.html#multiple-plugins), multiple projection configurations are also possible.

For the projection offset store you need an additional config section:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L389-L395 "Go to snippet source")second-projection-dynamodb = $${akka.projection.dynamodb}
second-projection-dynamodb {
  offset-store {
    # specific projection offset store settings here
  }
  use-client = "second-dynamodb.client"
}
```

Note that the `use-client` property references the same client settings as used for the `second-dynamodb` plugins, but it could also have been a separate client configured as:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L399-L409 "Go to snippet source")second-projection-dynamodb = $${akka.projection.dynamodb}
second-projection-dynamodb {
  offset-store {
    # specific projection offset store settings here
  }
  client = $${akka.persistence.dynamodb.client}
  client {
    # specific client settings for offset store and projection handler here
  }
  use-client = "second-projection-dynamodb.client"
}
```

In this way, you can use the default plugins for the write side and projection `SourceProvider`, but use a separate configuration for the projection handlers and offset storage.

You start the projections with [`DynamoDBProjectionSettings`](/api/akka-projection/1.6.20/akka/projection/dynamodb/DynamoDBProjectionSettings.html "akka.projection.dynamodb.DynamoDBProjectionSettings")[`DynamoDBProjectionSettings`](/api/akka-projection/1.6.20/akka/projection/dynamodb/DynamoDBProjectionSettings.html "akka.projection.dynamodb.DynamoDBProjectionSettings") loaded from `"second-projection-dynamodb"`.

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/java/projection/docs/javadsl/ProjectionDocExample.java#L469-L479 "Go to snippet source")ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings =
    Optional.of(
        DynamoDBProjectionSettings.create(
            system.settings().config().getConfig("second-projection-dynamodb")));

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.atLeastOnce(
        projectionId, settings, sourceProvider, () -> new ShoppingCartHandler(client), system);
```

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/scaladsl/ProjectionDocExample.scala#L421-L434 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.dynamodb.DynamoDBProjectionSettings
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val settings = Some(DynamoDBProjectionSettings(system.settings.config.getConfig("second-projection-dynamodb")))

val projection =
  DynamoDBProjection.atLeastOnce(
    projectionId,
    settings,
    sourceProvider,
    handler = () => new ShoppingCartHandler(client))
```

## Time to Live (TTL)

Offsets are never deleted by default. To have offsets deleted for inactive projections, an expiration timestamp can be set. DynamoDB’s [Time to Live (TTL)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html) feature can then be enabled, to automatically delete items after they have expired. A new expiration timestamp will be set each time an offset for a particular projection slice or persistence id is updated.

The TTL attribute to use for the timestamp offset table is named `expiry`.

Time\-to\-live settings are configured per projection. The projection name can also be matched by prefix by using a `*` at the end of the key. For example, offsets can be configured to expire in 7 days for a particular projection, and in 14 days for all projection names that start with a particular prefix:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb-integration/src/test/scala/projection/docs/config/ProjectionTimeToLiveSettingsDocExample.scala#L19-L28 "Go to snippet source")akka.projection.dynamodb.time-to-live {
  projections {
    "some-projection" {
      offset-time-to-live = 7 days
    }
    "projection-*" {
      offset-time-to-live = 14 days
    }
  }
}
```

### Time to Live reference configuration

The following can be overridden in your `application.conf` for the time\-to\-live specific settings:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-dynamodb/src/main/resources/reference.conf#L73-L95 "Go to snippet source")akka.projection.dynamodb {
  # Time to Live (TTL) settings
  time-to-live {
    projection-defaults {
      # Set a time-to-live duration on all offsets when they are updated.
      # Disabled when set to `off` or `none`.
      offset-time-to-live = off
    }

    # Time-to-live settings per projection name.
    # See `projection-defaults` for possible settings and default values.
    # Prefix matching is supported by using * at the end of a projection name.
    projections {
      # Example configuration:
      # "some-projection" {
      #   offset-time-to-live = 7 days
      # }
      # "projection-*" {
      #   offset-time-to-live = 14 days
      # }
    }
  }
}
```

## Code Examples

### Example 1: Dependencies

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

### Example 2: Dependencies

```scala
resolvers += "Akka library repository".at("https://repo.akka.io/maven")
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
    <artifactId>akka-projection-dynamodb_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-dynamodb_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```

### Example 5: Dependencies

```scala
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-projection-dynamodb" % "1.6.20",
  "com.lightbend.akka" %% "akka-persistence-dynamodb" % "1.6.20"
)
```

### Example 6: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-dynamodb_${versions.ScalaBinary}:1.6.20"
  implementation "com.lightbend.akka:akka-persistence-dynamodb_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: Tables

```sh
aws dynamodb create-table \
  --table-name timestamp_offset \
  --attribute-definitions \
      AttributeName=name_slice,AttributeType=S \
      AttributeName=pid,AttributeType=S \
  --key-schema \
      AttributeName=name_slice,KeyType=HASH \
      AttributeName=pid,KeyType=RANGE \
  --provisioned-throughput \
      ReadCapacityUnits=5,WriteCapacityUnits=5
```

### Example 8: Creating tables locally

```scala
akka.persistence.dynamodb {
  client.local.enabled = true
}
```

### Example 9: Creating tables locally

```java
import akka.persistence.dynamodb.util.ClientProvider;
import akka.projection.dynamodb.DynamoDBProjectionSettings;
import akka.projection.dynamodb.javadsl.CreateTables;
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient;

String dynamoDBConfigPath = "akka.projection.dynamodb";

DynamoDBProjectionSettings settings =
    DynamoDBProjectionSettings.create(system.settings().config().getConfig(dynamoDBConfigPath));

DynamoDbAsyncClient client = ClientProvider.get(system).clientFor(settings.useClient());

// create journal table, synchronously
CreateTables.createTimestampOffsetStoreTable(system, settings, client, /*deleteIfExists:*/ true)
    .toCompletableFuture()
    .get(10, TimeUnit.SECONDS);
```

### Example 10: Creating tables locally

```scala
import akka.persistence.dynamodb.util.ClientProvider
import akka.projection.dynamodb.DynamoDBProjectionSettings
import akka.projection.dynamodb.scaladsl.CreateTables
import software.amazon.awssdk.services.dynamodb.DynamoDbAsyncClient

val dynamoDBConfigPath = "akka.projection.dynamodb"

val settings: DynamoDBProjectionSettings =
  DynamoDBProjectionSettings(system.settings.config.getConfig(dynamoDBConfigPath))

val client: DynamoDbAsyncClient = ClientProvider(system).clientFor(settings.useClient)

// create timestamp offset table, synchronously
Await.result(
  CreateTables.createTimestampOffsetStoreTable(system, settings, client, deleteIfExists = true),
  10.seconds)
```

### Example 11: Batch writes

```hcon
akka.projection.at-least-once.save-offset-after-envelopes = 25
akka.projection.grouped.group-after-envelopes = 25
```

### Example 12: Reference configuration

```conf
akka.projection.dynamodb {

  offset-store {
    # the DynamoDB table name for the offset store
    timestamp-offset-table = "timestamp_offset"

    # The offset store will keep track of persistence ids and sequence numbers
    # within this time window from latest offset.
    time-window = 5 minutes

    # Backtracking window of the source (query). Should be equal to
    # the akka.persistence.dynamodb.query.backtracking.window that is used for the
    # SourceProvider.
    # It should not be larger than the akka.projection.dynamodb.offset-store.time-window.
    backtracking-window = ${akka.persistence.dynamodb.query.backtracking.window}

    # Trying to batch insert offsets in batches of this size.
    # Must be less than or equal to 25 (hard limit in DynamoDB)
    offset-batch-size = 25

    # Number of slices (within a given projection's slice range) which will be queried for
    # offsets simultaneously.  The underlying Dynamo client must be able to handle
    # (`http.max-concurrency` plus `http.max-pending-connection-acquires`) at least this number
    # of concurrent requests.
    #
    # Set to 1024 to always query for all slices simultaneously.  The minimum allowed value
    # is 1.  If there are more than 64 slices in a range (e.g. fewer than 16 projections
    # consuming events), then increasing this may result in slightly faster projection starts;
    # conversely, if there are many slices being projected using a given Dynamo client,
    # reducing this may result in fewer restarts of the projection due to failure to query
    # starting offsets.
    offset-slice-read-parallelism = 64

    # Batch writes are not automatically retried by the underlying SDK, so these settings govern those retries
    retries {
      max-retries = 3
      min-backoff = 200ms
      max-backoff = 2s
      random-factor = 0.3
    }

    # If sequence numbers have been reset (for example, by deleting events and then reusing
    # the same persistence id) and offsets have been retained for this persistence id, then
    # new events will be seen as duplicates. Detect earlier sequence numbers as resets, rather
    # than duplicates, if events are newer by this duration. Accept the first event (sequence
    # number 1), otherwise reject to trigger replay (see replay-on-rejected-sequence-numbers).
    # Set to `off`, `none`, or empty ("") to disable.
    accept-sequence-number-reset-after = off
  }

  # Replay missed events for a particular persistence id when a sequence number is rejected by validation.
  # If using Replicated Event Sourcing or Projections over gRPC with event filters this must be enabled.
  replay-on-rejected-sequence-numbers = on

  # By default it shares DynamoDB client with akka-persistence-dynamodb (write side).
  # To use a separate client for projections this can be
  # set to another config path that defines the config based on
  # akka.persistence.dynamodb.client config.
  use-client = "akka.persistence.dynamodb.client"

  # Filtered events are not actually filtered but passed through the handling flow
  # for atLeastOnceFlow, in some applications this is fine, set to false to disable
  # the info logged when seeing such filtered events
  warn-about-filtered-events-in-flow = true
}
```

### Example 13: Running with Sharded Daemon Process

```java
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings;
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.dynamodb.query.javadsl.DynamoDBReadJournal;
import akka.persistence.query.Offset;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.Projection;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.javadsl.SourceProvider;

import java.util.Optional;


void initProjections() {
  ShardedDaemonProcess.get(system)
      .initWithContext(
          ProjectionBehavior.Command.class,
          "ShoppingCartProjection",
          4,
          daemonContext -> {
            List<Pair<Integer, Integer>> sliceRanges =
                EventSourcedProvider.sliceRanges(
                    system, DynamoDBReadJournal.Identifier(), daemonContext.totalProcesses());
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
          system, DynamoDBReadJournal.Identifier(), entityType, minSlice, maxSlice);

  ProjectionId projectionId =
      ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);
  Optional<DynamoDBProjectionSettings> settings = Optional.empty();

  return DynamoDBProjection.exactlyOnce(
      projectionId, settings, sourceProvider, ShoppingCartTransactHandler::new, system);
}
```

### Example 14: Running with Sharded Daemon Process

```scala
import akka.cluster.sharding.typed.ShardedDaemonProcessSettings
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.dynamodb.query.scaladsl.DynamoDBReadJournal
import akka.persistence.query.typed.EventEnvelope
import akka.projection.Projection
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.scaladsl.SourceProvider

def sourceProvider(sliceRange: Range): SourceProvider[Offset, EventEnvelope[ShoppingCart.Event]] =
  EventSourcedProvider.eventsBySlices[ShoppingCart.Event](
    system,
    readJournalPluginId = DynamoDBReadJournal.Identifier,
    ShoppingCart.EntityKey.name,
    sliceRange.min,
    sliceRange.max)

def projection(sliceRange: Range): Projection[EventEnvelope[ShoppingCart.Event]] = {
  val minSlice = sliceRange.min
  val maxSlice = sliceRange.max
  val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

  DynamoDBProjection.exactlyOnce(
    projectionId,
    settings = None,
    sourceProvider(sliceRange),
    handler = () => new ShoppingCartTransactHandler)
}

ShardedDaemonProcess(system).initWithContext(
  name = "ShoppingCartProjection",
  initialNumberOfInstances = 4,
  behaviorFactory = { daemonContext =>
    val sliceRanges =
      EventSourcedProvider.sliceRanges(system, DynamoDBReadJournal.Identifier, daemonContext.totalProcesses)
    val sliceRange = sliceRanges(daemonContext.processNumber)
    ProjectionBehavior(projection(sliceRange))
  },
  ShardedDaemonProcessSettings(system),
  stopMessage = ProjectionBehavior.Stop)
```

### Example 15: exactly-once

```java
import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.exactlyOnce(
        projectionId, settings, sourceProvider, ShoppingCartTransactHandler::new, system);
```

### Example 16: exactly-once

```scala
import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection = DynamoDBProjection.exactlyOnce(
  projectionId,
  settings = None,
  sourceProvider,
  handler = () => new ShoppingCartTransactHandler)
```

### Example 17: at-least-once

```java
import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

int saveOffsetAfterEnvelopes = 25;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.atLeastOnce(
            projectionId,
            settings,
            sourceProvider,
            () -> new ShoppingCartHandler(client),
            system)
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 18: at-least-once

```scala
import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  DynamoDBProjection
    .atLeastOnce(projectionId, settings = None, sourceProvider, handler = () => new ShoppingCartHandler(client))
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

### Example 19: exactly-once (grouped)

```java
import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

int groupAfterEnvelopes = 25;
Duration groupAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.exactlyOnceGroupedWithin(
            projectionId,
            settings,
            sourceProvider,
            GroupedShoppingCartTransactHandler::new,
            system)
        .withGroup(groupAfterEnvelopes, groupAfterDuration);
```

### Example 20: exactly-once (grouped)

```scala
import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  DynamoDBProjection
    .exactlyOnceGroupedWithin(
      projectionId,
      settings = None,
      sourceProvider,
      handler = () => new GroupedShoppingCartTransactHandler)
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

### Example 21: at-least-once (grouped)

```java
import akka.projection.ProjectionId;
import akka.projection.dynamodb.javadsl.DynamoDBProjection;

ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings = Optional.empty();

int groupAfterEnvelopes = 25;
Duration groupAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.atLeastOnceGroupedWithin(
            projectionId,
            settings,
            sourceProvider,
            () -> new GroupedShoppingCartHandler(client, system),
            system)
        .withGroup(groupAfterEnvelopes, groupAfterDuration);
```

### Example 22: at-least-once (grouped)

```scala
import akka.projection.ProjectionId
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val projection =
  DynamoDBProjection
    .atLeastOnceGroupedWithin(
      projectionId,
      settings = None,
      sourceProvider,
      handler = () => new GroupedShoppingCartHandler(client))
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

### Example 23: Generic handler

```java
import akka.projection.dynamodb.javadsl.Requests;
import akka.projection.javadsl.Handler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class ShoppingCartHandler extends Handler<EventEnvelope<ShoppingCart.Event>> {

  private final DynamoDbAsyncClient client;

  private final Logger logger = LoggerFactory.getLogger(getClass());

  public ShoppingCartHandler(DynamoDbAsyncClient client) {
    this.client = client;
  }

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      Map<String, AttributeValue> attributes =
          Map.of(
              "id", AttributeValue.fromS(checkedOut.cartId),
              "time", AttributeValue.fromN(String.valueOf(checkedOut.eventTime.toEpochMilli())));

      CompletableFuture<PutItemResponse> response =
          client.putItem(PutItemRequest.builder().tableName("orders").item(attributes).build());

      return response.thenApply(__ -> Done.getInstance());

    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }
}
```

### Example 24: Generic handler

```scala
import akka.Done
import akka.persistence.query.typed.EventEnvelope
import akka.projection.scaladsl.Handler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.PutItemRequest

import scala.concurrent.Future
import scala.jdk.CollectionConverters._
import scala.jdk.FutureConverters._

class ShoppingCartHandler(client: DynamoDbAsyncClient)(implicit ec: ExecutionContext)
    extends Handler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")

        val attributes = Map(
          "id" -> AttributeValue.fromS(cartId),
          "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

        client
          .putItem(
            PutItemRequest.builder
              .tableName("orders")
              .item(attributes)
              .build())
          .asScala
          .map(_ => Done)

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        Future.successful(Done)
    }
  }
}
```

### Example 25: Transact handler

```java
import akka.projection.dynamodb.javadsl.DynamoDBTransactHandler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class ShoppingCartTransactHandler
    implements DynamoDBTransactHandler<EventEnvelope<ShoppingCart.Event>> {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Collection<TransactWriteItem>> process(
      EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);

      Map<String, AttributeValue> attributes =
          Map.of(
              "id", AttributeValue.fromS(checkedOut.cartId),
              "time", AttributeValue.fromN(String.valueOf(checkedOut.eventTime.toEpochMilli())));

      List<TransactWriteItem> items =
          List.of(
              TransactWriteItem.builder()
                  .put(Put.builder().tableName("orders").item(attributes).build())
                  .build());

      return CompletableFuture.completedFuture(items);

    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Collections.emptyList());
    }
  }
}
```

### Example 26: Transact handler

```scala
import akka.persistence.query.typed.EventEnvelope
import akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem

import scala.concurrent.Future
import scala.jdk.CollectionConverters._

class ShoppingCartTransactHandler extends DynamoDBTransactHandler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): Future[Iterable[TransactWriteItem]] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info(s"Shopping cart $cartId was checked out at $time")

        val attributes = Map(
          "id" -> AttributeValue.fromS(cartId),
          "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

        Future.successful(
          Seq(
            TransactWriteItem.builder
              .put(
                Put.builder
                  .tableName("orders")
                  .item(attributes)
                  .build())
              .build()))

      case otherEvent =>
        logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
        Future.successful(Seq.empty)
    }
  }
}
```

### Example 27: Grouped handler

```java
import akka.projection.dynamodb.javadsl.Requests;
import akka.projection.javadsl.Handler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class GroupedShoppingCartHandler extends Handler<List<EventEnvelope<ShoppingCart.Event>>> {

  private final DynamoDbAsyncClient client;
  private final ActorSystem<?> system;

  private final Logger logger = LoggerFactory.getLogger(getClass());

  public GroupedShoppingCartHandler(DynamoDbAsyncClient client, ActorSystem<?> system) {
    this.client = client;
    this.system = system;
  }

  @Override
  public CompletionStage<Done> process(List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    List<WriteRequest> items =
        envelopes.stream()
            .flatMap(
                envelope -> {
                  ShoppingCart.Event event = envelope.event();

                  if (event instanceof ShoppingCart.CheckedOut) {
                    ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

                    logger.info(
                        "Shopping cart {} was checked out at {}",
                        checkedOut.cartId,
                        checkedOut.eventTime);

                    Map<String, AttributeValue> attributes =
                        Map.of(
                            "id",
                            AttributeValue.fromS(checkedOut.cartId),
                            "time",
                            AttributeValue.fromN(
                                String.valueOf(checkedOut.eventTime.toEpochMilli())));

                    return Stream.of(
                        WriteRequest.builder()
                            .putRequest(PutRequest.builder().item(attributes).build())
                            .build());

                  } else {
                    logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
                    return Stream.empty();
                  }
                })
            .collect(Collectors.toList());

    BatchWriteItemRequest request =
        BatchWriteItemRequest.builder().requestItems(Map.of("orders", items)).build();

    int maxRetries = 3;
    Duration minBackoff = Duration.ofMillis(200);
    Duration maxBackoff = Duration.ofSeconds(2);
    double randomFactor = 0.3;

    // batch write, retrying writes for any unprocessed items (with exponential backoff)
    CompletionStage<List<BatchWriteItemResponse>> result =
        Requests.batchWriteWithRetries(
            client, request, maxRetries, minBackoff, maxBackoff, randomFactor, system);

    return result.thenApply(__ -> Done.getInstance());
  }
}
```

### Example 28: Grouped handler

```scala
import akka.Done
import akka.persistence.query.typed.EventEnvelope
import akka.projection.dynamodb.scaladsl.Requests
import akka.projection.scaladsl.Handler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.BatchWriteItemRequest
import software.amazon.awssdk.services.dynamodb.model.PutRequest
import software.amazon.awssdk.services.dynamodb.model.WriteRequest

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.jdk.CollectionConverters._

class GroupedShoppingCartHandler(client: DynamoDbAsyncClient)(implicit system: ActorSystem[_], ec: ExecutionContext)
    extends Handler[Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: Seq[EventEnvelope[ShoppingCart.Event]]): Future[Done] = {
    val items = envelopes.flatMap { envelope =>
      envelope.event match {
        case ShoppingCart.CheckedOut(cartId, time) =>
          logger.info(s"Shopping cart $cartId was checked out at $time")

          val attributes =
            Map("id" -> AttributeValue.fromS(cartId), "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

          Some(
            WriteRequest.builder
              .putRequest(
                PutRequest.builder
                  .item(attributes)
                  .build())
              .build())

        case otherEvent =>
          logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
          None
      }
    }.asJava

    val request = BatchWriteItemRequest.builder
      .requestItems(Map("orders" -> items).asJava)
      .build()

    // batch write, retrying writes for any unprocessed items (with exponential backoff)
    Requests
      .batchWriteWithRetries(
        client,
        request,
        maxRetries = 3,
        minBackoff = 200.millis,
        maxBackoff = 2.seconds,
        randomFactor = 0.3)
      .map(_ => Done)
  }
}
```

### Example 29: Grouped transact handler

```java
import akka.projection.dynamodb.javadsl.DynamoDBTransactHandler;
import software.amazon.awssdk.services.dynamodb.model.*;

public class GroupedShoppingCartTransactHandler
    implements DynamoDBTransactHandler<List<EventEnvelope<ShoppingCart.Event>>> {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Collection<TransactWriteItem>> process(
      List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    List<TransactWriteItem> items =
        envelopes.stream()
            .flatMap(
                envelope -> {
                  ShoppingCart.Event event = envelope.event();
                  if (event instanceof ShoppingCart.CheckedOut) {
                    ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;

                    logger.info(
                        "Shopping cart {} was checked out at {}",
                        checkedOut.cartId,
                        checkedOut.eventTime);

                    Map<String, AttributeValue> attributes =
                        Map.of(
                            "id", AttributeValue.fromS(checkedOut.cartId),
                            "time",
                                AttributeValue.fromN(
                                    String.valueOf(checkedOut.eventTime.toEpochMilli())));

                    return Stream.of(
                        TransactWriteItem.builder()
                            .put(Put.builder().tableName("orders").item(attributes).build())
                            .build());

                  } else {
                    logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
                    return Stream.empty();
                  }
                })
            .collect(Collectors.toList());

    return CompletableFuture.completedFuture(items);
  }
}
```

### Example 30: Grouped transact handler

```scala
import akka.persistence.query.typed.EventEnvelope
import akka.projection.dynamodb.scaladsl.DynamoDBTransactHandler
import software.amazon.awssdk.services.dynamodb.model.AttributeValue
import software.amazon.awssdk.services.dynamodb.model.Put
import software.amazon.awssdk.services.dynamodb.model.TransactWriteItem

import scala.concurrent.Future
import scala.jdk.CollectionConverters._

class GroupedShoppingCartTransactHandler extends DynamoDBTransactHandler[Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: Seq[EventEnvelope[ShoppingCart.Event]]): Future[Iterable[TransactWriteItem]] = {
    val items = envelopes.flatMap { envelope =>
      envelope.event match {
        case ShoppingCart.CheckedOut(cartId, time) =>
          logger.info(s"Shopping cart $cartId was checked out at $time")

          val attributes = Map(
            "id" -> AttributeValue.fromS(cartId),
            "time" -> AttributeValue.fromN(time.toEpochMilli.toString)).asJava

          Seq(
            TransactWriteItem.builder
              .put(
                Put.builder
                  .tableName("orders")
                  .item(attributes)
                  .build())
              .build())

        case otherEvent =>
          logger.debug(s"Shopping cart ${otherEvent.cartId} changed by $otherEvent")
          Seq.empty
      }
    }
    Future.successful(items)
  }
}
```

### Example 31: Multiple plugins

```scala
second-projection-dynamodb = $${akka.projection.dynamodb}
second-projection-dynamodb {
  offset-store {
    # specific projection offset store settings here
  }
  use-client = "second-dynamodb.client"
}
```

### Example 32: Multiple plugins

```scala
second-projection-dynamodb = $${akka.projection.dynamodb}
second-projection-dynamodb {
  offset-store {
    # specific projection offset store settings here
  }
  client = $${akka.persistence.dynamodb.client}
  client {
    # specific client settings for offset store and projection handler here
  }
  use-client = "second-projection-dynamodb.client"
}
```

### Example 33: Multiple plugins

```java
ProjectionId projectionId =
    ProjectionId.of("ShoppingCarts", "carts-" + minSlice + "-" + maxSlice);

Optional<DynamoDBProjectionSettings> settings =
    Optional.of(
        DynamoDBProjectionSettings.create(
            system.settings().config().getConfig("second-projection-dynamodb")));

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    DynamoDBProjection.atLeastOnce(
        projectionId, settings, sourceProvider, () -> new ShoppingCartHandler(client), system);
```

### Example 34: Multiple plugins

```scala
import akka.projection.ProjectionId
import akka.projection.dynamodb.DynamoDBProjectionSettings
import akka.projection.dynamodb.scaladsl.DynamoDBProjection

val projectionId = ProjectionId("ShoppingCarts", s"carts-$minSlice-$maxSlice")

val settings = Some(DynamoDBProjectionSettings(system.settings.config.getConfig("second-projection-dynamodb")))

val projection =
  DynamoDBProjection.atLeastOnce(
    projectionId,
    settings,
    sourceProvider,
    handler = () => new ShoppingCartHandler(client))
```

### Example 35: Time to Live (TTL)

```conf
akka.projection.dynamodb.time-to-live {
  projections {
    "some-projection" {
      offset-time-to-live = 7 days
    }
    "projection-*" {
      offset-time-to-live = 14 days
    }
  }
}
```

### Example 36: Time to Live reference configuration

```conf
akka.projection.dynamodb {
  # Time to Live (TTL) settings
  time-to-live {
    projection-defaults {
      # Set a time-to-live duration on all offsets when they are updated.
      # Disabled when set to `off` or `none`.
      offset-time-to-live = off
    }

    # Time-to-live settings per projection name.
    # See `projection-defaults` for possible settings and default values.
    # Prefix matching is supported by using * at the end of a projection name.
    projections {
      # Example configuration:
      # "some-projection" {
      #   offset-time-to-live = 7 days
      # }
      # "projection-*" {
      #   offset-time-to-live = 14 days
      # }
    }
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/DynamoDBProjectionSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/CreateTables$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/DynamoDBTransactHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/javadsl/Requests$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/CreateTables$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/DynamoDBTransactHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/dynamodb/scaladsl/Requests$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/config.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/getting-started.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/overview.html
- https://doc.akka.io/libraries/akka-persistence-dynamodb/2.0/query.html
- https://doc.akka.io/libraries/akka-projection/current/dynamodb.html
- https://doc.akka.io/libraries/akka-projection/current/error.html
- https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/current/flow.html
- https://doc.akka.io/libraries/akka-projection/current/running.html
- https://doc.akka.io/libraries/akka-projection/current/slick.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/dynamodb.html](https://doc.akka.io/libraries/akka-projection/current/dynamodb.html)*