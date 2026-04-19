---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:26:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/grpc.html
title: Akka Projection gRPC • Akka Projection
---

# Akka Projection gRPC • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Projection gRPC

Akka Projection gRPC can be used for implementing asynchronous event based service\-to\-service communication. It provides an implementation of an Akka Projection that uses [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/2.5/index.html) as underlying transport between event producer and consumer.

## Overview

![overview.png](images/service-to-service-overview.png)

1. An Entity stores events in its journal in service A.
2. Consumer in service B starts an Akka Projection which locally reads its offset for service A’s replication stream.
3. Service B establishes a replication stream from service A.
4. Events are read from the journal.
5. Event is emitted to the replication stream.
6. Event is handled.
7. Offset is stored.
8. Producer continues to read new events from the journal and emit to the stream. As an optimization, events can also be published directly from the entity to the producer.

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

To use the gRPC module of Akka Projections add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-grpc" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-grpc_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-grpc_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections gRPC | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-grpc 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.grpc |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.3\.0, 2020\-10\-23 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

It is currently only possible to use [akka\-projection\-r2dbc](r2dbc.html) ad offset storage and [akka\-persistence\-r2dbc](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/journal.html) as journal for this module.

sbt
```
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12",
  "com.lightbend.akka" %% "akka-projection-r2dbc" % "1.3.12"
)
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
  implementation "com.lightbend.akka:akka-projection-r2dbc_${versions.ScalaBinary}:1.3.12"
}
```

### Transitive dependencies

The table below shows `akka-projection-grpc`’s direct dependencies, and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka.grpc | akka\-grpc\-runtime\_2\.13 | [2\.5\.10](https://mvnrepository.com/artifact/com.lightbend.akka.grpc/akka-grpc-runtime_2.13/2.5.10) |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.lightbend.akka | akka\-projection\-eventsourced\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-eventsourced_2.13/1.6.20) |
| com.thesamet.scalapb | scalapb\-runtime\_2\.13 | [0\.11\.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.18) |
| com.typesafe.akka | akka\-actor\-typed\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor-typed_2.13/2.10.13) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.13) |
| com.typesafe.akka | akka\-persistence\-typed\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-typed_2.13/2.10.13) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13) |
| io.grpc | grpc\-stub | [1\.77\.0](https://mvnrepository.com/artifact/io.grpc/grpc-stub/1.77.0) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.lightbend.akka.grpc    akka-grpc-runtime_2.13    [2.5.10](https://mvnrepository.com/artifact/com.lightbend.akka.grpc/akka-grpc-runtime_2.13/2.5.10)    BUSL-1.1
    com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
    com.thesamet.scalapb    scalapb-runtime_2.13    [0.11.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.18)    Apache 2
        com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
        com.thesamet.scalapb    lenses_2.13    [0.11.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/lenses_2.13/0.11.18)    Apache 2
            org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-discovery_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-discovery_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-http-core_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.7.3)    BUSL-1.1
        com.typesafe.akka    akka-parsing_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.7.3)    BUSL-1.1
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-http_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http_2.13/10.7.3)    BUSL-1.1
        com.typesafe.akka    akka-http-core_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-http-core_2.13/10.7.3)    BUSL-1.1
            com.typesafe.akka    akka-parsing_2.13    [10.7.3](https://mvnrepository.com/artifact/com.typesafe.akka/akka-parsing_2.13/10.7.3)    BUSL-1.1
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-pki_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.13)    BUSL-1.1
            com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
            com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
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
    io.grpc    grpc-core    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0)    Apache 2.0
        com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
        com.google.code.gson    gson    [2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)    Apache-2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-context    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.77.0)    Apache 2.0
            io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
        org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
    io.grpc    grpc-netty-shaded    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-netty-shaded/1.77.0)    Apache 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-core    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0)    Apache 2.0
            com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
            com.google.code.gson    gson    [2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)    Apache-2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-context    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.77.0)    Apache 2.0
                io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
            org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
        io.grpc    grpc-util    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-util/1.77.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-core    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-core/1.77.0)    Apache 2.0
                com.google.android    annotations    [4.1.1.4](https://mvnrepository.com/artifact/com.google.android/annotations/4.1.1.4)    Apache 2.0
                com.google.code.gson    gson    [2.11.0](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)    Apache-2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
                io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                    com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
                io.grpc    grpc-context    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-context/1.77.0)    Apache 2.0
                    io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
                io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
                org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
            org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
        io.perfmark    perfmark-api    [0.27.0](https://mvnrepository.com/artifact/io.perfmark/perfmark-api/0.27.0)    Apache 2.0
        org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
    io.grpc    grpc-protobuf    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf/1.77.0)    Apache 2.0
        com.google.api.grpc    proto-google-common-protos    [2.59.2](https://mvnrepository.com/artifact/com.google.api.grpc/proto-google-common-protos/2.59.2)    Apache-2.0
            com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
        io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
        io.grpc    grpc-protobuf-lite    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-protobuf-lite/1.77.0)    Apache 2.0
            com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
            com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
            io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
                com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
                com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
                    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
                    com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
                    com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
                    com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
                    org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
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
com.thesamet.scalapb    scalapb-runtime_2.13    [0.11.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/scalapb-runtime_2.13/0.11.18)    Apache 2
    com.google.protobuf    protobuf-java    [3.25.8](https://mvnrepository.com/artifact/com.google.protobuf/protobuf-java/3.25.8)    BSD-3-Clause
    com.thesamet.scalapb    lenses_2.13    [0.11.18](https://mvnrepository.com/artifact/com.thesamet.scalapb/lenses_2.13/0.11.18)    Apache 2
        org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang.modules    scala-collection-compat_2.13    [2.12.0](https://mvnrepository.com/artifact/org.scala-lang.modules/scala-collection-compat_2.13/2.12.0)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
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
com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
io.grpc    grpc-stub    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-stub/1.77.0)    Apache 2.0
    com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
    com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
        com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
        com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
        org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    io.grpc    grpc-api    [1.77.0](https://mvnrepository.com/artifact/io.grpc/grpc-api/1.77.0)    Apache 2.0
        com.google.code.findbugs    jsr305    [3.0.2](https://mvnrepository.com/artifact/com.google.code.findbugs/jsr305/3.0.2)    The Apache Software License, Version 2.0
        com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
        com.google.guava    guava    [33.4.8-android](https://mvnrepository.com/artifact/com.google.guava/guava/33.4.8-android)    Apache License, Version 2.0
            com.google.errorprone    error_prone_annotations    [2.36.0](https://mvnrepository.com/artifact/com.google.errorprone/error_prone_annotations/2.36.0)    Apache 2.0
            com.google.guava    failureaccess    [1.0.3](https://mvnrepository.com/artifact/com.google.guava/failureaccess/1.0.3)    Apache License, Version 2.0
            com.google.guava    listenablefuture    [9999.0-empty-to-avoid-conflict-with-guava](https://mvnrepository.com/artifact/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava)    The Apache Software License, Version 2.0
            com.google.j2objc    j2objc-annotations    [3.0.0](https://mvnrepository.com/artifact/com.google.j2objc/j2objc-annotations/3.0.0)    Apache License, Version 2.0
            org.jspecify    jspecify    [1.0.0](https://mvnrepository.com/artifact/org.jspecify/jspecify/1.0.0)    The Apache License, Version 2.0
    org.codehaus.mojo    animal-sniffer-annotations    [1.24](https://mvnrepository.com/artifact/org.codehaus.mojo/animal-sniffer-annotations/1.24)    MIT license
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Consumer

On the consumer side the `Projection` is an ordinary [SourceProvider for eventsBySlices](eventsourced.html#sourceprovider-for-eventsbyslices) that is using `eventsBySlices` from the [`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "akka.projection.grpc.consumer.javadsl.GrpcReadJournal")[`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html "akka.projection.grpc.consumer.scaladsl.GrpcReadJournal").

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-scala/src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala#L4-L148 "Go to snippet source")import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.Persistence
import akka.persistence.query.typed.EventEnvelope
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.grpc.consumer.ConsumerFilter
import akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory
import shoppingcart.CheckedOut
import shoppingcart.ItemQuantityAdjusted
import shoppingcart.ShoppingCartEventsProto

object ShoppingCartEventConsumer {
  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    val numberOfProjectionInstances = 4
    val projectionName: String = "cart-events"
    val sliceRanges =
      Persistence(system).sliceRanges(numberOfProjectionInstances)

    val eventsBySlicesQuery =
      GrpcReadJournal(List(ShoppingCartEventsProto.javaDescriptor))

    ShardedDaemonProcess(system).init(
      projectionName,
      numberOfProjectionInstances,
      { idx =>
        val sliceRange = sliceRanges(idx)
        val projectionKey =
          s"${eventsBySlicesQuery.streamId}-${sliceRange.min}-${sliceRange.max}"
        val projectionId = ProjectionId.of(projectionName, projectionKey)

        val sourceProvider = EventSourcedProvider.eventsBySlices[AnyRef](
          system,
          eventsBySlicesQuery,
          eventsBySlicesQuery.streamId,
          sliceRange.min,
          sliceRange.max)

        ProjectionBehavior(
          R2dbcProjection.atLeastOnceAsync(
            projectionId,
            None,
            sourceProvider,
            () =>
              new EventHandler(
                projectionId,
                eventsBySlicesQuery.streamId,
                sys)))
      })
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/java/shopping/analytics/ShoppingCartEventConsumer.java#L4-L154 "Go to snippet source")import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.Persistence;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.grpc.consumer.javadsl.GrpcReadJournal;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import shopping.cart.proto.ShoppingCartEvents;

class ShoppingCartEventConsumer {
  public static void init(ActorSystem<?> system) {
    int numberOfProjectionInstances = 4;
    String projectionName = "cart-events";
    List<Pair<Integer, Integer>> sliceRanges = Persistence.get(system).getSliceRanges(numberOfProjectionInstances);

    GrpcReadJournal eventsBySlicesQuery = GrpcReadJournal.create(
        system,
        List.of(ShoppingCartEvents.getDescriptor()));

    ShardedDaemonProcess.get(system).init(
        ProjectionBehavior.Command.class,
        projectionName,
        numberOfProjectionInstances,
        idx -> {
          Pair<Integer, Integer> sliceRange = sliceRanges.get(idx);
          String projectionKey = eventsBySlicesQuery.streamId() + "-" + sliceRange.first() + "-" + sliceRange.second();
          ProjectionId projectionId = ProjectionId.of(projectionName, projectionKey);

          SourceProvider<Offset, EventEnvelope<Object>> sourceProvider = EventSourcedProvider.eventsBySlices(
              system,
              eventsBySlicesQuery,
              eventsBySlicesQuery.streamId(),
              sliceRange.first(),
              sliceRange.second());

          return ProjectionBehavior.create(
              R2dbcProjection.atLeastOnceAsync(
                  projectionId,
                  Optional.empty(),
                  sourceProvider,
                  () -> new EventHandler(projectionId),
                  system));

        },
        ProjectionBehavior.stopMessage());
  }

}
```

The Protobuf descriptors are defined when the [`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "akka.projection.grpc.consumer.javadsl.GrpcReadJournal")[`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html "akka.projection.grpc.consumer.scaladsl.GrpcReadJournal") is created. The descriptors are used when deserializing the received events. The `protobufDescriptors` is a list of the `javaDescriptor` for the used protobuf messages. It is defined in the ScalaPB generated `Proto` companion object. Note that GrpcReadJournal should be created with the [`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html "akka.projection.grpc.consumer.javadsl.GrpcReadJournal")[`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html "akka.projection.grpc.consumer.scaladsl.GrpcReadJournal") `apply``create` factory method and not from configuration via `GrpcReadJournalProvider` when using Protobuf serialization.

The gRPC connection to the producer is defined in the [consumer configuration](#consumer-configuration).

The [R2dbcProjection](r2dbc.html) has support for storing the offset in a relational database using R2DBC.

The above example is using the [ShardedDaemonProcess](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html) to distribute the instances of the Projection across the cluster. There are alternative ways of running the `ProjectionBehavior` as described in [Running a Projection](running.html)

How to implement the `EventHandler` and choose between different processing semantics is described in the [R2dbcProjection documentation](r2dbc.html).

### Start from custom offset

By default, a `SourceProvider` uses the stored offset when starting the Projection. For some cases, especially with Projections over gRPC, it can be useful to adjust the start offset. The consumer might only be interested in new events, or only most recent events. 

The start offset can be adjusted by using the `EventSourcedProvider.eventsBySlices` method that takes an `adjustStartOffset` function, which is a function from loaded offset (if any) to the adjusted offset that will be used to by the `eventsBySlicesQuery`.

This can also be useful in combination with [Starting from snapshots](grpc.html#starting-from-snapshots), which is enabled on the producer side. In that way the consumer can start without any stored offset and only load snapshots for the most recently used entities.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc-tests/src/test/scala/akka/projection/grpc/consumer/ConsumerDocSpec.scala#L34-L45 "Go to snippet source")val sourceProvider =
  EventSourcedProvider
    .eventsBySlices[String](
      system,
      eventsBySlicesQuery,
      eventsBySlicesQuery.streamId,
      sliceRange.min,
      sliceRange.max,
      adjustStartOffset = { (storedOffset: Option[Offset]) =>
        val startOffset = Offset.timestamp(Instant.now().minusSeconds(3600))
        Future.successful(Some(startOffset))
      })
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc-tests/src/test/java/akka/projection/grpc/consumer/javadsl/ConsumerCompileTest.java#L123-L133 "Go to snippet source")SourceProvider<Offset, EventEnvelope<String>> sourceProvider =
    EventSourcedProvider.eventsBySlices(
        system,
        eventsBySlicesQuery,
        eventsBySlicesQuery.streamId(),
        sliceRange.first(),
        sliceRange.second(),
        (Optional<Offset> storedOffset) -> {
          TimestampOffset startOffset = Offset.timestamp(Instant.now().minusSeconds(3600));
          return CompletableFuture.completedFuture(Optional.of(startOffset));
        });
```

### gRPC client lifecycle

When creating the [`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "akka.projection.grpc.consumer.javadsl.GrpcReadJournal")[`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html "akka.projection.grpc.consumer.scaladsl.GrpcReadJournal") a gRPC client is created for the target producer. The same `GrpcReadJournal` instance and its gRPC client should be shared for the same target producer. The code examples above will share the instance between different Projection instances running in the same `ActorSystem`. The gRPC clients will automatically be closed when the `ActorSystem` is terminated.

If there is a need to close the gRPC client before `ActorSystem` termination the `close()` method of the [`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "akka.projection.grpc.consumer.javadsl.GrpcReadJournal")[`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html "akka.projection.grpc.consumer.scaladsl.GrpcReadJournal") can be called. After closing the `GrpcReadJournal` instance cannot be used again.

## Producer

Akka Projections gRPC provides the gRPC service implementation that is used by the consumer side. It is created with the [`EventProducer`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducer$.html "akka.projection.grpc.producer.javadsl.EventProducer")[`EventProducer`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$.html "akka.projection.grpc.producer.scaladsl.EventProducer"):

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/PublishEvents.scala#L4-L61 "Go to snippet source")import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import akka.persistence.query.typed
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.typed.PersistenceId
import akka.projection.grpc.producer.EventProducerSettings
import akka.projection.grpc.producer.scaladsl.EventProducer
import akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

import scala.concurrent.Future

object PublishEvents {

  def eventProducerService(system: ActorSystem[_])
      : PartialFunction[HttpRequest, Future[HttpResponse]] = {
    val transformation = Transformation.empty
      .registerAsyncEnvelopeMapper[ShoppingCart.ItemUpdated, proto.ItemQuantityAdjusted](envelope =>
        Future.successful(Some(transformItemUpdated(envelope))))
      .registerAsyncEnvelopeMapper[ShoppingCart.CheckedOut, proto.CheckedOut](envelope =>
        Future.successful(Some(transformCheckedOut(envelope))))

    val eventProducerSource = EventProducer
      .EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings(system))

    EventProducer.grpcServiceHandler(eventProducerSource)(system)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/PublishEvents.java#L4-L71 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.typed.PersistenceId;
import akka.projection.grpc.producer.EventProducerSettings;
import akka.projection.grpc.producer.javadsl.EventProducer;
import akka.projection.grpc.producer.javadsl.EventProducerSource;
import akka.projection.grpc.producer.javadsl.Transformation;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class PublishEvents {

  public static Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService(ActorSystem<?> system) {
    Transformation transformation =
        Transformation.empty()
            .registerAsyncEnvelopeMapper(ShoppingCart.ItemUpdated.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformItemQuantityAdjusted(envelope))))
            .registerAsyncEnvelopeMapper(ShoppingCart.CheckedOut.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformCheckedOut(envelope))));

    EventProducerSource eventProducerSource = new EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings.create(system)
    );

    return EventProducer.grpcServiceHandler(system, eventProducerSource);
  }
}
```

Events can be transformed by application specific code on the producer side. The purpose is to be able to have a different public representation from the internal representation (stored in journal). The transformation functions are registered when creating the `EventProducer` service. Here is an example of one of those transformation functions accessing the projection envelope to include the shopping cart id in the public message type passed to consumers:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/PublishEvents.scala#L47-L54 "Go to snippet source")def transformItemUpdated(
    envelope: EventEnvelope[ShoppingCart.ItemUpdated]): proto.ItemQuantityAdjusted = {
  val event = envelope.event
  proto.ItemQuantityAdjusted(
    cartId = PersistenceId.extractEntityId(envelope.persistenceId),
    itemId = event.itemId,
    quantity = event.quantity)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/PublishEvents.java#L55-L62 "Go to snippet source")private static shopping.cart.proto.ItemQuantityAdjusted transformItemQuantityAdjusted(EventEnvelope<ShoppingCart.ItemUpdated> envelope) {
  var itemUpdated = envelope.event();
  return shopping.cart.proto.ItemQuantityAdjusted.newBuilder()
      .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
      .setItemId(itemUpdated.itemId)
      .setQuantity(itemUpdated.quantity)
      .build();
}
```

To omit an event the transformation function can return `None``Optional.empty()`.

Use `Transformation.identity``Transformation.identity()` to pass through each event as is.

That `EventProducer` service is started in an Akka gRPC server like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCartServer.scala#L4-L98 "Go to snippet source")import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure
import scala.util.Success

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.ServerReflection
import akka.grpc.scaladsl.ServiceHandler
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse

object ShoppingCartServer {

  def start(
      interface: String,
      port: Int,
      system: ActorSystem[_],
      grpcService: proto.ShoppingCartService,
      eventProducerService: PartialFunction[HttpRequest, Future[HttpResponse]])
      : Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      ServiceHandler.concatOrNotFound(
        eventProducerService,
        proto.ShoppingCartServiceHandler.partial(grpcService),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingCartService)))

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping online at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCartServer.java#L4-L91 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletionStage;
import shopping.cart.proto.ShoppingCartService;
import shopping.cart.proto.ShoppingCartServiceHandlerFactory;

public final class ShoppingCartServer {

  private ShoppingCartServer() {}

  static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService, Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            eventProducerService,
            ShoppingCartServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create(
                Collections.singletonList(ShoppingCartService.description), system));

    CompletionStage<ServerBinding> bound =
        Http.get(system).newServerAt(host, port).bind(service::apply);

    bound.whenComplete(
        (binding, ex) -> {
          if (binding != null) {
            binding.addToCoordinatedShutdown(Duration.ofSeconds(3), system);
            InetSocketAddress address = binding.localAddress();
            system
                .log()
                .info(
                    "Shopping online at gRPC server {}:{}",
                    address.getHostString(),
                    address.getPort());
          } else {
            system.log().error("Failed to bind gRPC endpoint, terminating system", ex);
            system.terminate();
          }
        });
  }

}
```

The Akka HTTP server must be running with HTTP/2, this is done through config:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/resources/grpc.conf#L2 "Go to snippet source")akka.http.server.enable-http2 = on
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/resources/grpc.conf#L2 "Go to snippet source")akka.http.server.enable-http2 = on
```

This example includes an application specific `ShoppingCartService`, which is unrelated to Akka Projections gRPC, but it illustrates how to combine the `EventProducer` service with other gRPC services.

### Durable State as source of events

Projections over gRPC requires events, and are therefore typically used with `EventSourcedBehavior`. `DurableStateBehavior` can also be the source of events and be used with Projections over gRPC. For `DurableStateBehavior` you need to use change events as described in [Changes from Durable State](durable-state.html#sourceprovider-for-eventsbyslices).

## Filters

By default, events from all entities of the given entity type and slice range are emitted from the producer to the consumer. The transformation function on the producer side can omit certain events, but the offsets for these events are still transferred to the consumer, to ensure sequence number validations and offset storage.

Filters can be used when a consumer is only interested in a subset of the entities. The filters can be defined on both the producer side and on the consumer side, and they can be changed at runtime.

By default, all events are emitted, and filters selectively choose what events to filter out. For some of the filters it is useful to first define a [`ConsumerFilter.excludeAll`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html "akka.projection.grpc.consumer.ConsumerFilter")[`ConsumerFilter.excludeAll`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html "akka.projection.grpc.consumer.ConsumerFilter") filter and then selectively include events. For example to only include events from topics matching topic filters.

Note
The purpose of filters is to toggle if all events for the entity are to be emitted or not. If the purpose is to filter out certain events you should instead use the [transformation function of the producer](grpc.html#producer).

### Tags

Tags are typically used for the filters, so first an example of how to tag events in the entity. Here, the tag is based on total quantity of the shopping cart, i.e. the state of the cart. The tags are included in the [`EventEnvelope`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope")[`EventEnvelope`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope").

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L38-L279 "Go to snippet source")object ShoppingCart {
  final case class State(
      items: Map[String, Int],
      checkoutDate: Option[Instant])
      extends CborSerializable {

    def totalQuantity: Int =
      items.map { case (_, quantity) => quantity }.sum

    def tags: Set[String] = {
      val total = totalQuantity
      if (total == 0) Set.empty
      else if (total >= 100) Set(LargeQuantityTag)
      else if (total >= 10) Set(MediumQuantityTag)
      else Set(SmallQuantityTag)
    }

  }

  val SmallQuantityTag = "small"
  val MediumQuantityTag = "medium"
  val LargeQuantityTag = "large"

  def apply(cartId: String): Behavior[Command] = {
    EventSourcedBehavior
      .withEnforcedReplies[Command, Event, State](
        persistenceId = PersistenceId(EntityKey.name, cartId),
        emptyState = State.empty,
        commandHandler =
          (state, command) => handleCommand(state, command),
        eventHandler = (state, event) => handleEvent(state, event))
      .withTaggerForState { case (state, _) =>
        state.tags
      }
      .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
      .onPersistFailure(
        SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L36-L373 "Go to snippet source")public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {

  static final String SMALL_QUANTITY_TAG = "small";
  static final String MEDIUM_QUANTITY_TAG = "medium";
  static final String LARGE_QUANTITY_TAG = "large";

  static final class State implements CborSerializable {
    final Map<String, Integer> items;

    public int totalQuantity() {
      return items.values().stream().reduce(0, Integer::sum);
    }

    public Set<String> tags() {
      int total = totalQuantity();
      if (total == 0)
        return Collections.emptySet();
      else if (total >= 100)
        return Collections.singleton(LARGE_QUANTITY_TAG);
      else if (total >= 10)
        return Collections.singleton(MEDIUM_QUANTITY_TAG);
      else
        return Collections.singleton(SMALL_QUANTITY_TAG);
    }
  }

  @Override
  public Set<String> tagsFor(State state, Event event) {
    return state.tags();
  }
}
```

### Topics

Topics are typically used in publish\-subscribe systems, such as [MQTT Topics](https://www.hivemq.com/blog/mqtt-essentials-part-5-mqtt-topics-best-practices/). Event filters can be defined as topic match expressions, with topic hierarchies and wildcards according to the MQTT specification.

A topic consists of one or more levels separated by a forward slash, for example:

```
myhome/groundfloor/livingroom/temperature

```

The topic of an event is defined by a tag with a `t:` prefix. See [above example of how to set tags in the entity](grpc.html#tags). You should typically tag all events for a certain entity instance with the same topic tag. The tag prefix can be configured:

```
akka.projection.grpc.producer.filter.topic-tag-prefix = "t:"

```

It is not recommended to use:

- `+` or `#` in the topic names
- a leading slash in topic names, e.g. `/myhome/groundfloor/livingroom`

#### Single level wildcard: `+`

The single\-level wildcard is represented by the plus symbol (`+`) and allows the replacement of a single topic level. By subscribing to a topic with a single\-level wildcard, any topic that contains an arbitrary string in place of the wildcard will be matched.

`myhome/groundfloor/+/temperature` will match these topics:

- `myhome/groundfloor/livingroom/temperature`
- `myhome/groundfloor/kitchen/temperature`

but it will not match:

- `myhome/groundfloor/kitchen/brightness`
- `myhome/firstfloor/kitchen/temperature`
- `myhome/groundfloor/kitchen/fridge/temperature`

#### Multi level wildcard: `#`

The multi\-level wildcard covers multiple topic levels. It is represented by the hash symbol (`#`) and must be placed as the last character in the topic expression, preceded by a forward slash.

By subscribing to a topic with a multi\-level wildcard, you will receive all events of a topic that begins with the pattern before the wildcard character, regardless of the length or depth of the topic. If the topic expression is specified as `#` alone, all events will be received.

`myhome/groundfloor/#` will match these topics:

- `myhome/groundfloor/livingroom/temperature`
- `myhome/groundfloor/kitchen/temperature`
- `myhome/groundfloor/kitchen/brightness`

but it will not match:

- `myhome/firstfloor/kitchen/temperature`

### Producer defined filter

The producer may define a filter function on the `EventProducerSource`.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-scala/src/main/scala/shopping/cart/PublishEvents.scala#L27-L38 "Go to snippet source")val eventProducerSource = EventProducer
  .EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings(system))
  .withProducerFilter[ShoppingCart.Event] { envelope =>
    val tags = envelope.tags
    tags.contains(ShoppingCart.MediumQuantityTag) ||
    tags.contains(ShoppingCart.LargeQuantityTag)
  }
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-cart-service-java/src/main/java/shopping/cart/PublishEvents.java#L29-L40 "Go to snippet source")EventProducerSource eventProducerSource = new EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings.create(system)
)
.withProducerFilter(envelope -> {
  Set<String> tags = envelope.getTags();
  return tags.contains(ShoppingCart.MEDIUM_QUANTITY_TAG) ||
      tags.contains(ShoppingCart.LARGE_QUANTITY_TAG);
});
```

In this example the decision is based on tags, but the filter function can use anything in the [`EventEnvelope`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope")[`EventEnvelope`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html "akka.persistence.query.typed.EventEnvelope") parameter or the event itself. Here, the entity sets the tag based on the total quantity of the shopping cart, which requires the full state of the shopping cart and is not known from an individual event.

[Topic filters](grpc.html#topics) can be defined in similar way, using `withTopicProducerFilter`. 

Note that the purpose of `withProducerFilter` and `withTopicProducerFilter` is to toggle if all events for the entity are to be emitted or not. If the purpose is to filter out certain events you should instead use the `Transformation`.

The producer filter is evaluated before the transformation function, i.e. the event is the original event and not the transformed event.

A producer filter that excludes an event wins over any consumer defined filter, i.e. if the producer filter function returns `false` the event will not be emitted.

### Consumer defined filter

The consumer may define declarative filters that are sent to the producer and evaluated on the producer side before emitting the events.

Consumer filters consists of exclude and include criteria. In short, the exclude criteria are evaluated first and may be overridden by an include criteria. More precisely, they are evaluated according to the following rules: 

- Exclude criteria are evaluated first.
- If no matching exclude criteria the event is emitted.
- If an exclude criteria is matching the include criteria are evaluated.
- If no matching include criteria the event is discarded.
- If matching include criteria the event is emitted.

The exclude criteria can be a combination of:

- `ExcludeTags` \- exclude events with any of the given tags
- `ExcludeRegexEntityIds` \- exclude events for entities with entity ids matching the given regular expressions
- `ExcludeEntityIds` \- exclude events for entities with the given entity ids

To exclude all events you can use `ExcludeRegexEntityIds` with `.*`.

The include criteria can be a combination of:

- `IncludeTopics` \- include events with any of the given matching topics
- `IncludeTags` \- include events with any of the given tags
- `IncludeRegexEntityIds` \- include events for entities with entity ids matching the given regular expressions
- `IncludeEntityIds` \- include events for entities with the given entity ids

#### Static consumer filters

For a static filter that never changes during the life of the consumer, an initial filter can be set by configuring it with [`GrpcQuerySettings.withInitialConsumerFilter`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html "akka.projection.grpc.consumer.GrpcQuerySettings")[`GrpcQuerySettings.withInitialConsumerFilter`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html "akka.projection.grpc.consumer.GrpcQuerySettings") on the `GrpcQuerySettings` that the `GrpcReadJournal` is constructed with.

#### Dynamic consumer filters

For dynamic filters, that changes during the life of the consumer, the filter is updated with the [`ConsumerFilter`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter")[`ConsumerFilter`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter") extension:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-scala/src/main/scala/shopping/analytics/ShoppingCartEventConsumer.scala#L134-L144 "Go to snippet source")def updateConsumerFilter(
    system: ActorSystem[_],
    excludeTags: Set[String],
    includeTags: Set[String]): Unit = {
  val streamId = system.settings.config
    .getString("akka.projection.grpc.consumer.stream-id")
  val criteria = Vector(
    ConsumerFilter.ExcludeTags(excludeTags),
    ConsumerFilter.IncludeTags(includeTags))
  ConsumerFilter(system).ref ! ConsumerFilter.UpdateFilter(streamId, criteria)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/java/shopping/analytics/ShoppingCartEventConsumer.java#L19-L150 "Go to snippet source")import akka.projection.grpc.consumer.ConsumerFilter;

static void updateConsumerFilter(
    ActorSystem<?> system,
    Set<String> excludeTags,
    Set<String> includeTags) {
  String streamId = system.settings().config()
      .getString("akka.projection.grpc.consumer.stream-id");

  List<ConsumerFilter.FilterCriteria> criteria = List.of(
      new ConsumerFilter.ExcludeTags(excludeTags),
      new ConsumerFilter.IncludeTags(includeTags));

  ConsumerFilter.get(system).ref().tell(new ConsumerFilter.UpdateFilter(streamId, criteria));
}
```

Note that the `streamId` must match what is used when initializing the `GrpcReadJournal`, which by default is from the config property `akka.projection.grpc.consumer.stream-id`.

The filters can be dynamically changed in runtime without restarting the Projections or the `GrpcReadJournal`. The updates are incremental. For example if you first add an `IncludeTags` of tag `"medium"` and then update the filter with another `IncludeTags` of tag `"large"`, the full filter consists of both `"medium"` and `"large"`.

To remove a filter criteria you would use the corresponding [`ConsumerFilter.RemoveCriteria`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html "akka.projection.grpc.consumer.ConsumerFilter.RemoveCriteria")[`ConsumerFilter.RemoveCriteria`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html "akka.projection.grpc.consumer.ConsumerFilter.RemoveCriteria"), for example `RemoveIncludeTags`.

The updated filter is kept and remains after restarts of the Projection instances. If the consumer side is running with Akka Cluster the filter is propagated to other nodes in the cluster automatically with Akka Distributed Data. You only have to update at one place and it will be applied to all running Projections with the given `streamId`.

Warning
The filters will be cleared in case of a full Cluster stop, which means that you need to take care of populating the initial filters at startup.

See [`ConsumerFilter`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter")[`ConsumerFilter`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html "akka.projection.grpc.consumer.ConsumerFilter") for full API documentation.

### Event replay

When the consumer receives an event that is not the first event for the entity, and it hasn’t processed and stored the offset for the preceding event (previous sequence number) a replay of previous events will be triggered. The reason is that the consumer is typically interested in all events for an entity and must process them in the original order. Even though this is completely automatic it can be good to be aware of since it may have a substantial performance impact to replay many events for many entities.

The event replay is triggered “lazily” when a new event with unexpected sequence number is received, but with the `ConsumerFilter.IncludeEntityIds` it is possible to explicitly define a sequence number from which the replay will start immediately. You have the following choices for the sequence number in the `IncludeEntityIds` criteria:

- if the previously processed sequence number is known, the next (\+1\) sequence number can be defined
- `1` can be used to for replaying all events of the entity
- `0` can be used to not replay events immediately, but they will be replayed lazily as described previously

Any duplicate events are filtered out by the Projection on the consumer side. This deduplication mechanism depends on how long the Projection will keep old offsets. You may have to increase the configuration for this, but that has the drawback of more memory usage.

```
akka.projection.r2dbc.offset-store.time-window = 15 minutes

```

Application level deduplication of idempotency may be needed if the Projection can’t keep enough offsets in memory.

## Sample projects

Source code and build files for complete sample projects can be found in the [Akka Distributed Cluster Guide](https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide.html) and [Akka Edge Guide](https://doc.akka.io/libraries/akka-edge/1.6/guide.html).

## Security

Mutual authentication with TLS can be setup according to the [Akka gRPC documentation](https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html)

## Access control

### From the consumer

The consumer can pass metadata, such as auth headers, in each request to the producer service by passing [`Metadata`](/akka/grpc/javadsl/Metadata.html "akka.grpc.javadsl.Metadata")[`Metadata`](/akka/grpc/scaladsl/Metadata.html "akka.grpc.scaladsl.Metadata") to the [`GrpcQuerySettings`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html "akka.projection.grpc.consumer.GrpcQuerySettings")[`GrpcQuerySettings`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html "akka.projection.grpc.consumer.GrpcQuerySettings") when constructing the read journal.

### In the producer

Authentication and authorization for the producer can be done by implementing a [`EventProducerInterceptor`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html "akka.projection.grpc.producer.javadsl.EventProducerInterceptor")[`EventProducerInterceptor`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html "akka.projection.grpc.producer.scaladsl.EventProducerInterceptor") and pass it to the `grpcServiceHandler` method during producer bootstrap. The interceptor is invoked with the stream id and gRPC request metadata for each incoming request and can return a suitable error through [`GrpcServiceException`](/akka/grpc/GrpcServiceException.html "akka.grpc.GrpcServiceException")[`GrpcServiceException`](/akka/grpc/GrpcServiceException.html "akka.grpc.GrpcServiceException")

## Performance considerations

### Lower latency

See [Publish events for lower latency of eventsBySlices](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html#publish-events-for-lower-latency-of-eventsbyslices) for low latency use cases.

### Many consumers

Each connected consumer will start a `eventsBySlices` query that will periodically poll and read events from the journal. That means that the journal database will become a bottleneck, unless it can be scaled out, when number of consumers increase. 

For the case of many consumers of the same event stream it is recommended to use [`EventsBySliceFirehoseQuery`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html "akka.persistence.query.typed.javadsl.EventsBySliceFirehoseQuery")[`EventsBySliceFirehoseQuery`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html "akka.persistence.query.typed.scaladsl.EventsBySliceFirehoseQuery"). The purpose is to share the stream of events from the database and fan out to connected consumer streams. Thereby fewer queries and loading of events from the database.

The producer service itself can easily be scaled out to more instances.

### Starting from snapshots

The producer can use snapshots as starting points and thereby reducing number of events that have to be loaded. This can be useful if the consumer start from zero without any previously processed offset or if it has been disconnected for a long while and its offset is far behind.

To enable starting from snapshots you need to enable [eventsBySlicesStartingFromSnapshots in Akka Persistence R2DBC](https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html#eventsbyslicesstartingfromsnapshots).

Then you need to define the snapshot to event transformation function in `EventProducerSource.withStartingFromSnapshots` when registering the [Producer](grpc.html#producer).

## Configuration

### Consumer configuration

The configuration for the `GrpcReadJournal` may look like this:

```
[source](https://github.com/akka/akka-projection/tree/master/samples/grpc/shopping-analytics-service-java/src/main/resources/grpc.conf "Go to snippet source")akka.http.server.enable-http2 = on

akka.projection.grpc.consumer {
  client {
    host = "127.0.0.1"
    host = ${?SHOPPING_CART_SERVICE_GRPC_HOST}
    port = 8101
    port = ${?SHOPPING_CART_SERVICE_GRPC_PORT}
    use-tls = false
  }
  stream-id = "cart"
}
```

The `client` section in the configuration defines where the producer is running. It is an [Akka gRPC configuration](https://doc.akka.io/libraries/akka-grpc/2.5/client/configuration.html#by-configuration) with several connection options.

### Reference configuration

The following can be overridden in your `application.conf` for the Projection specific settings:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc/src/main/resources/reference.conf "Go to snippet source")akka.projection.grpc {
  consumer {
    class = "akka.projection.grpc.consumer.GrpcReadJournalProvider"

    # Note: these settings are only applied when constructing the consumer from config
    #       if creating the GrpcQuerySettings programmatically these settings are ignored

    # Configuration of gRPC client.
    # See https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html#by-configuration
    client = ${akka.grpc.client."*"}
    client {
    }

    # Mandatory field identifying the stream to consume/type of entity, must be a stream id
    # exposed by the producing/publishing side
    stream-id = ""

    # Pass these additional request headers as string values in each request to the producer
    # can be used for example for authorization in combination with an interceptor in the producer.
    # Example "x-auth-header": "secret"
    additional-request-headers {}

    filter {
      ddata-read-timeout = 3s
      ddata-write-timeout = 3s
    }

    push-destination {
      # Parallelism per connected push producer
      parallelism = 100
      # Disconnect a producer flow if an event is not written to database within this timeout
      # producer will reconnect, possibly after backoff.
      journal-write-timeout = 5s
    }
  }

  producer {
    # Query plugin for eventsBySlices, such as "akka.persistence.r2dbc.query".
    query-plugin-id = ""

    # When using async transformations it can be good to increase this.
    transformation-parallelism = 1

    filter {
      replay-parallelism = 3
      # Topic of an event is defined by an event tag with this prefix
      topic-tag-prefix = "t:"
    }

    # Interval to send keep alives to keep firewalls etc from closing connections with
    # large pauses between events going through. Set to 0 to disable keep alive messages.
    #
    # Note: Currently only used by the event producer push
    keep-alive-interval = 5s

    # See event-origin-filter-enabled
    max-ack-cache-entries = 1000

  }

  replication {

    # Allow edge replicas to connect and replicate updates
    accept-edge-replication = off

    # Replicated event sourcing from edge sends each event over sharding, in case that delivery
    # fails or times out, retry this number of times, with an increasing backoff conntrolled by
    # the min and max backoff settings
    edge-replication-delivery-retries = 3
    edge-replication-delivery-min-backoff = 250ms
    edge-replication-delivery-max-backoff = 5s

    # By default, the origin of the event is taken into account in a way that the consumer will
    # only receive the event directly from the origin replica if it's configured to be connected
    # to it. If the consumer isn't directly connected to the origin replica, it will receive those
    # events indirectly via other replicas that it is consuming from. This is an efficient way to
    # avoid sending duplicates from all replicas.
    #
    # However, one consequence of this is that event causality isn't preserved when using more than
    # 2 replicas. This may not matter when using CRDTs that can compensate for the lack of ordering.
    # Set this property to off if you want to preserve causal ordering. There is still an best effort
    # acknowledgement and deduplication mechanism to avoid transfer of full event payloads from all
    # replicas.
    event-origin-filter-enabled = on
  }

}

akka {
  actor {
    serializers {
      akka-projection-grpc-consumer = "akka.projection.grpc.internal.ConsumerSerializer"
    }
    serialization-identifiers {
      "akka.projection.grpc.internal.ConsumerSerializer" = 1558148901
    }
    serialization-bindings {
      "akka.projection.grpc.internal.DdataConsumerFilterStore$State" = akka-projection-grpc-consumer
      "akka.projection.grpc.internal.DdataConsumerFilterStore$ConsumerFilterKey" = akka-projection-grpc-consumer
      "akka.projection.grpc.internal.ConsumerFilterRegistry$PubSubAck" = akka-projection-grpc-consumer
    }
  }
}
```

### Connecting to more than one producer

If you have several Projections that are connecting to different producer services they can be configured as separate [`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html "akka.projection.grpc.consumer.javadsl.GrpcReadJournal")[`GrpcReadJournal`](/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html "akka.projection.grpc.consumer.scaladsl.GrpcReadJournal") configuration sections.

```
consumer1 = ${akka.projection.grpc.consumer}
consumer1 {
  client {
    host = "127.0.0.1"
    port = 8101
  }
}

consumer2 = ${akka.projection.grpc.consumer}
consumer2 {
  client {
    host = "127.0.0.1"
    port = 8202
  }
}

```

The `GrpcReadJournal` plugin id is then `consumer1` and `consumer2` instead of the default `akka.projection.grpc.consumer`.

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
libraryDependencies += "com.lightbend.akka" %% "akka-projection-grpc" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-grpc_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-grpc_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: Dependencies

```scala
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12",
  "com.lightbend.akka" %% "akka-projection-r2dbc" % "1.3.12"
)
```

### Example 8: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
</dependencies>
```

### Example 9: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
  implementation "com.lightbend.akka:akka-projection-r2dbc_${versions.ScalaBinary}:1.3.12"
}
```

### Example 10: Consumer

```scala
import scala.concurrent.Future

import akka.Done
import akka.actor.typed.ActorSystem
import akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess
import akka.persistence.Persistence
import akka.persistence.query.typed.EventEnvelope
import akka.projection.ProjectionBehavior
import akka.projection.ProjectionId
import akka.projection.eventsourced.scaladsl.EventSourcedProvider
import akka.projection.grpc.consumer.ConsumerFilter
import akka.projection.grpc.consumer.scaladsl.GrpcReadJournal
import akka.projection.r2dbc.scaladsl.R2dbcProjection
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory
import shoppingcart.CheckedOut
import shoppingcart.ItemQuantityAdjusted
import shoppingcart.ShoppingCartEventsProto

object ShoppingCartEventConsumer {
  def init(system: ActorSystem[_]): Unit = {
    implicit val sys: ActorSystem[_] = system
    val numberOfProjectionInstances = 4
    val projectionName: String = "cart-events"
    val sliceRanges =
      Persistence(system).sliceRanges(numberOfProjectionInstances)

    val eventsBySlicesQuery =
      GrpcReadJournal(List(ShoppingCartEventsProto.javaDescriptor))

    ShardedDaemonProcess(system).init(
      projectionName,
      numberOfProjectionInstances,
      { idx =>
        val sliceRange = sliceRanges(idx)
        val projectionKey =
          s"${eventsBySlicesQuery.streamId}-${sliceRange.min}-${sliceRange.max}"
        val projectionId = ProjectionId.of(projectionName, projectionKey)

        val sourceProvider = EventSourcedProvider.eventsBySlices[AnyRef](
          system,
          eventsBySlicesQuery,
          eventsBySlicesQuery.streamId,
          sliceRange.min,
          sliceRange.max)

        ProjectionBehavior(
          R2dbcProjection.atLeastOnceAsync(
            projectionId,
            None,
            sourceProvider,
            () =>
              new EventHandler(
                projectionId,
                eventsBySlicesQuery.streamId,
                sys)))
      })
  }


}
```

### Example 11: Consumer

```java
import akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess;
import akka.japi.Pair;
import akka.persistence.Persistence;
import akka.persistence.query.typed.EventEnvelope;
import akka.projection.ProjectionBehavior;
import akka.projection.ProjectionId;
import akka.projection.eventsourced.javadsl.EventSourcedProvider;
import akka.projection.grpc.consumer.javadsl.GrpcReadJournal;
import akka.projection.javadsl.SourceProvider;
import akka.projection.r2dbc.javadsl.R2dbcProjection;
import shopping.cart.proto.ShoppingCartEvents;

class ShoppingCartEventConsumer {
  public static void init(ActorSystem<?> system) {
    int numberOfProjectionInstances = 4;
    String projectionName = "cart-events";
    List<Pair<Integer, Integer>> sliceRanges = Persistence.get(system).getSliceRanges(numberOfProjectionInstances);

    GrpcReadJournal eventsBySlicesQuery = GrpcReadJournal.create(
        system,
        List.of(ShoppingCartEvents.getDescriptor()));

    ShardedDaemonProcess.get(system).init(
        ProjectionBehavior.Command.class,
        projectionName,
        numberOfProjectionInstances,
        idx -> {
          Pair<Integer, Integer> sliceRange = sliceRanges.get(idx);
          String projectionKey = eventsBySlicesQuery.streamId() + "-" + sliceRange.first() + "-" + sliceRange.second();
          ProjectionId projectionId = ProjectionId.of(projectionName, projectionKey);

          SourceProvider<Offset, EventEnvelope<Object>> sourceProvider = EventSourcedProvider.eventsBySlices(
              system,
              eventsBySlicesQuery,
              eventsBySlicesQuery.streamId(),
              sliceRange.first(),
              sliceRange.second());

          return ProjectionBehavior.create(
              R2dbcProjection.atLeastOnceAsync(
                  projectionId,
                  Optional.empty(),
                  sourceProvider,
                  () -> new EventHandler(projectionId),
                  system));

        },
        ProjectionBehavior.stopMessage());
  }


}
```

### Example 12: Start from custom offset

```scala
val sourceProvider =
  EventSourcedProvider
    .eventsBySlices[String](
      system,
      eventsBySlicesQuery,
      eventsBySlicesQuery.streamId,
      sliceRange.min,
      sliceRange.max,
      adjustStartOffset = { (storedOffset: Option[Offset]) =>
        val startOffset = Offset.timestamp(Instant.now().minusSeconds(3600))
        Future.successful(Some(startOffset))
      })
```

### Example 13: Start from custom offset

```java
SourceProvider<Offset, EventEnvelope<String>> sourceProvider =
    EventSourcedProvider.eventsBySlices(
        system,
        eventsBySlicesQuery,
        eventsBySlicesQuery.streamId(),
        sliceRange.first(),
        sliceRange.second(),
        (Optional<Offset> storedOffset) -> {
          TimestampOffset startOffset = Offset.timestamp(Instant.now().minusSeconds(3600));
          return CompletableFuture.completedFuture(Optional.of(startOffset));
        });
```

### Example 14: Producer

```scala
import akka.actor.typed.ActorSystem
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse
import akka.persistence.query.typed
import akka.persistence.query.typed.EventEnvelope
import akka.persistence.typed.PersistenceId
import akka.projection.grpc.producer.EventProducerSettings
import akka.projection.grpc.producer.scaladsl.EventProducer
import akka.projection.grpc.producer.scaladsl.EventProducer.Transformation

import scala.concurrent.Future

object PublishEvents {

  def eventProducerService(system: ActorSystem[_])
      : PartialFunction[HttpRequest, Future[HttpResponse]] = {
    val transformation = Transformation.empty
      .registerAsyncEnvelopeMapper[ShoppingCart.ItemUpdated, proto.ItemQuantityAdjusted](envelope =>
        Future.successful(Some(transformItemUpdated(envelope))))
      .registerAsyncEnvelopeMapper[ShoppingCart.CheckedOut, proto.CheckedOut](envelope =>
        Future.successful(Some(transformCheckedOut(envelope))))

    val eventProducerSource = EventProducer
      .EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings(system))

    EventProducer.grpcServiceHandler(eventProducerSource)(system)
  }
}
```

### Example 15: Producer

```java
import akka.actor.typed.ActorSystem;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import akka.persistence.query.typed.EventEnvelope;
import akka.persistence.typed.PersistenceId;
import akka.projection.grpc.producer.EventProducerSettings;
import akka.projection.grpc.producer.javadsl.EventProducer;
import akka.projection.grpc.producer.javadsl.EventProducerSource;
import akka.projection.grpc.producer.javadsl.Transformation;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class PublishEvents {

  public static Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService(ActorSystem<?> system) {
    Transformation transformation =
        Transformation.empty()
            .registerAsyncEnvelopeMapper(ShoppingCart.ItemUpdated.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformItemQuantityAdjusted(envelope))))
            .registerAsyncEnvelopeMapper(ShoppingCart.CheckedOut.class, envelope -> CompletableFuture.completedFuture(Optional.of(transformCheckedOut(envelope))));

    EventProducerSource eventProducerSource = new EventProducerSource(
        "ShoppingCart",
        "cart",
        transformation,
        EventProducerSettings.create(system)
    );

    return EventProducer.grpcServiceHandler(system, eventProducerSource);
  }
}
```

### Example 16: Producer

```scala
def transformItemUpdated(
    envelope: EventEnvelope[ShoppingCart.ItemUpdated]): proto.ItemQuantityAdjusted = {
  val event = envelope.event
  proto.ItemQuantityAdjusted(
    cartId = PersistenceId.extractEntityId(envelope.persistenceId),
    itemId = event.itemId,
    quantity = event.quantity)
}
```

### Example 17: Producer

```java
private static shopping.cart.proto.ItemQuantityAdjusted transformItemQuantityAdjusted(EventEnvelope<ShoppingCart.ItemUpdated> envelope) {
  var itemUpdated = envelope.event();
  return shopping.cart.proto.ItemQuantityAdjusted.newBuilder()
      .setCartId(PersistenceId.extractEntityId(envelope.persistenceId()))
      .setItemId(itemUpdated.itemId)
      .setQuantity(itemUpdated.quantity)
      .build();
}
```

### Example 18: Producer

```scala
import scala.concurrent.ExecutionContext
import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.Failure
import scala.util.Success

import akka.actor.typed.ActorSystem
import akka.grpc.scaladsl.ServerReflection
import akka.grpc.scaladsl.ServiceHandler
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.http.scaladsl.model.HttpResponse

object ShoppingCartServer {

  def start(
      interface: String,
      port: Int,
      system: ActorSystem[_],
      grpcService: proto.ShoppingCartService,
      eventProducerService: PartialFunction[HttpRequest, Future[HttpResponse]])
      : Unit = {
    implicit val sys: ActorSystem[_] = system
    implicit val ec: ExecutionContext =
      system.executionContext

    val service: HttpRequest => Future[HttpResponse] =
      ServiceHandler.concatOrNotFound(
        eventProducerService,
        proto.ShoppingCartServiceHandler.partial(grpcService),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.partial(List(proto.ShoppingCartService)))

    val bound =
      Http()
        .newServerAt(interface, port)
        .bind(service)
        .map(_.addToCoordinatedShutdown(3.seconds))

    bound.onComplete {
      case Success(binding) =>
        val address = binding.localAddress
        system.log.info(
          "Shopping online at gRPC server {}:{}",
          address.getHostString,
          address.getPort)
      case Failure(ex) =>
        system.log.error("Failed to bind gRPC endpoint, terminating system", ex)
        system.terminate()
    }
  }


}
```

### Example 19: Producer

```java
import akka.actor.typed.ActorSystem;
import akka.grpc.javadsl.ServerReflection;
import akka.grpc.javadsl.ServiceHandler;
import akka.http.javadsl.Http;
import akka.http.javadsl.ServerBinding;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;
import akka.japi.function.Function;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.CompletionStage;
import shopping.cart.proto.ShoppingCartService;
import shopping.cart.proto.ShoppingCartServiceHandlerFactory;

public final class ShoppingCartServer {

  private ShoppingCartServer() {}

  static void start(String host, int port, ActorSystem<?> system, ShoppingCartService grpcService, Function<HttpRequest, CompletionStage<HttpResponse>> eventProducerService) {
    @SuppressWarnings("unchecked")
    Function<HttpRequest, CompletionStage<HttpResponse>> service =
        ServiceHandler.concatOrNotFound(
            eventProducerService,
            ShoppingCartServiceHandlerFactory.create(grpcService, system),
            // ServerReflection enabled to support grpcurl without import-path and proto parameters
            ServerReflection.create(
                Collections.singletonList(ShoppingCartService.description), system));

    CompletionStage<ServerBinding> bound =
        Http.get(system).newServerAt(host, port).bind(service::apply);

    bound.whenComplete(
        (binding, ex) -> {
          if (binding != null) {
            binding.addToCoordinatedShutdown(Duration.ofSeconds(3), system);
            InetSocketAddress address = binding.localAddress();
            system
                .log()
                .info(
                    "Shopping online at gRPC server {}:{}",
                    address.getHostString(),
                    address.getPort());
          } else {
            system.log().error("Failed to bind gRPC endpoint, terminating system", ex);
            system.terminate();
          }
        });
  }

}
```

### Example 20: Producer

```conf
akka.http.server.enable-http2 = on
```

### Example 21: Producer

```conf
akka.http.server.enable-http2 = on
```

### Example 22: Tags

```scala
object ShoppingCart {
  final case class State(
      items: Map[String, Int],
      checkoutDate: Option[Instant])
      extends CborSerializable {

    def totalQuantity: Int =
      items.map { case (_, quantity) => quantity }.sum

    def tags: Set[String] = {
      val total = totalQuantity
      if (total == 0) Set.empty
      else if (total >= 100) Set(LargeQuantityTag)
      else if (total >= 10) Set(MediumQuantityTag)
      else Set(SmallQuantityTag)
    }

  }

  val SmallQuantityTag = "small"
  val MediumQuantityTag = "medium"
  val LargeQuantityTag = "large"

  def apply(cartId: String): Behavior[Command] = {
    EventSourcedBehavior
      .withEnforcedReplies[Command, Event, State](
        persistenceId = PersistenceId(EntityKey.name, cartId),
        emptyState = State.empty,
        commandHandler =
          (state, command) => handleCommand(state, command),
        eventHandler = (state, event) => handleEvent(state, event))
      .withTaggerForState { case (state, _) =>
        state.tags
      }
      .withRetention(RetentionCriteria.snapshotEvery(numberOfEvents = 100))
      .onPersistFailure(
        SupervisorStrategy.restartWithBackoff(200.millis, 5.seconds, 0.1))
  }
}
```

### Example 23: Tags

```java
public final class ShoppingCart
    extends EventSourcedBehaviorWithEnforcedReplies<
        ShoppingCart.Command, ShoppingCart.Event, ShoppingCart.State> {

  static final String SMALL_QUANTITY_TAG = "small";
  static final String MEDIUM_QUANTITY_TAG = "medium";
  static final String LARGE_QUANTITY_TAG = "large";

  static final class State implements CborSerializable {
    final Map<String, Integer> items;

    public int totalQuantity() {
      return items.values().stream().reduce(0, Integer::sum);
    }

    public Set<String> tags() {
      int total = totalQuantity();
      if (total == 0)
        return Collections.emptySet();
      else if (total >= 100)
        return Collections.singleton(LARGE_QUANTITY_TAG);
      else if (total >= 10)
        return Collections.singleton(MEDIUM_QUANTITY_TAG);
      else
        return Collections.singleton(SMALL_QUANTITY_TAG);
    }
  }

  @Override
  public Set<String> tagsFor(State state, Event event) {
    return state.tags();
  }
}
```

### Example 24: Topics

```text
myhome/groundfloor/livingroom/temperature
```

### Example 25: Topics

```hcon
akka.projection.grpc.producer.filter.topic-tag-prefix = "t:"
```

### Example 26: Producer defined filter

```scala
val eventProducerSource = EventProducer
  .EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings(system))
  .withProducerFilter[ShoppingCart.Event] { envelope =>
    val tags = envelope.tags
    tags.contains(ShoppingCart.MediumQuantityTag) ||
    tags.contains(ShoppingCart.LargeQuantityTag)
  }
```

### Example 27: Producer defined filter

```java
EventProducerSource eventProducerSource = new EventProducerSource(
    "ShoppingCart",
    "cart",
    transformation,
    EventProducerSettings.create(system)
)
.withProducerFilter(envelope -> {
  Set<String> tags = envelope.getTags();
  return tags.contains(ShoppingCart.MEDIUM_QUANTITY_TAG) ||
      tags.contains(ShoppingCart.LARGE_QUANTITY_TAG);
});
```

### Example 28: Dynamic consumer filters

```scala
def updateConsumerFilter(
    system: ActorSystem[_],
    excludeTags: Set[String],
    includeTags: Set[String]): Unit = {
  val streamId = system.settings.config
    .getString("akka.projection.grpc.consumer.stream-id")
  val criteria = Vector(
    ConsumerFilter.ExcludeTags(excludeTags),
    ConsumerFilter.IncludeTags(includeTags))
  ConsumerFilter(system).ref ! ConsumerFilter.UpdateFilter(streamId, criteria)
}
```

### Example 29: Dynamic consumer filters

```java
import akka.projection.grpc.consumer.ConsumerFilter;

static void updateConsumerFilter(
    ActorSystem<?> system,
    Set<String> excludeTags,
    Set<String> includeTags) {
  String streamId = system.settings().config()
      .getString("akka.projection.grpc.consumer.stream-id");

  List<ConsumerFilter.FilterCriteria> criteria = List.of(
      new ConsumerFilter.ExcludeTags(excludeTags),
      new ConsumerFilter.IncludeTags(includeTags));

  ConsumerFilter.get(system).ref().tell(new ConsumerFilter.UpdateFilter(streamId, criteria));
}
```

### Example 30: Event replay

```text
akka.projection.r2dbc.offset-store.time-window = 15 minutes
```

### Example 31: Consumer configuration

```conf
akka.http.server.enable-http2 = on

akka.projection.grpc.consumer {
  client {
    host = "127.0.0.1"
    host = ${?SHOPPING_CART_SERVICE_GRPC_HOST}
    port = 8101
    port = ${?SHOPPING_CART_SERVICE_GRPC_PORT}
    use-tls = false
  }
  stream-id = "cart"
}
```

### Example 32: Reference configuration

```conf
akka.projection.grpc {
  consumer {
    class = "akka.projection.grpc.consumer.GrpcReadJournalProvider"

    # Note: these settings are only applied when constructing the consumer from config
    #       if creating the GrpcQuerySettings programmatically these settings are ignored

    # Configuration of gRPC client.
    # See https://doc.akka.io/libraries/akka-grpc/current/client/configuration.html#by-configuration
    client = ${akka.grpc.client."*"}
    client {
    }

    # Mandatory field identifying the stream to consume/type of entity, must be a stream id
    # exposed by the producing/publishing side
    stream-id = ""

    # Pass these additional request headers as string values in each request to the producer
    # can be used for example for authorization in combination with an interceptor in the producer.
    # Example "x-auth-header": "secret"
    additional-request-headers {}

    filter {
      ddata-read-timeout = 3s
      ddata-write-timeout = 3s
    }

    push-destination {
      # Parallelism per connected push producer
      parallelism = 100
      # Disconnect a producer flow if an event is not written to database within this timeout
      # producer will reconnect, possibly after backoff.
      journal-write-timeout = 5s
    }
  }

  producer {
    # Query plugin for eventsBySlices, such as "akka.persistence.r2dbc.query".
    query-plugin-id = ""

    # When using async transformations it can be good to increase this.
    transformation-parallelism = 1

    filter {
      replay-parallelism = 3
      # Topic of an event is defined by an event tag with this prefix
      topic-tag-prefix = "t:"
    }

    # Interval to send keep alives to keep firewalls etc from closing connections with
    # large pauses between events going through. Set to 0 to disable keep alive messages.
    #
    # Note: Currently only used by the event producer push
    keep-alive-interval = 5s

    # See event-origin-filter-enabled
    max-ack-cache-entries = 1000

  }

  replication {

    # Allow edge replicas to connect and replicate updates
    accept-edge-replication = off

    # Replicated event sourcing from edge sends each event over sharding, in case that delivery
    # fails or times out, retry this number of times, with an increasing backoff conntrolled by
    # the min and max backoff settings
    edge-replication-delivery-retries = 3
    edge-replication-delivery-min-backoff = 250ms
    edge-replication-delivery-max-backoff = 5s

    # By default, the origin of the event is taken into account in a way that the consumer will
    # only receive the event directly from the origin replica if it's configured to be connected
    # to it. If the consumer isn't directly connected to the origin replica, it will receive those
    # events indirectly via other replicas that it is consuming from. This is an efficient way to
    # avoid sending duplicates from all replicas.
    #
    # However, one consequence of this is that event causality isn't preserved when using more than
    # 2 replicas. This may not matter when using CRDTs that can compensate for the lack of ordering.
    # Set this property to off if you want to preserve causal ordering. There is still an best effort
    # acknowledgement and deduplication mechanism to avoid transfer of full event payloads from all
    # replicas.
    event-origin-filter-enabled = on
  }

}

akka {
  actor {
    serializers {
      akka-projection-grpc-consumer = "akka.projection.grpc.internal.ConsumerSerializer"
    }
    serialization-identifiers {
      "akka.projection.grpc.internal.ConsumerSerializer" = 1558148901
    }
    serialization-bindings {
      "akka.projection.grpc.internal.DdataConsumerFilterStore$State" = akka-projection-grpc-consumer
      "akka.projection.grpc.internal.DdataConsumerFilterStore$ConsumerFilterKey" = akka-projection-grpc-consumer
      "akka.projection.grpc.internal.ConsumerFilterRegistry$PubSubAck" = akka-projection-grpc-consumer
    }
  }
}
```

### Example 33: Connecting to more than one producer

```text
consumer1 = ${akka.projection.grpc.consumer}
consumer1 {
  client {
    host = "127.0.0.1"
    port = 8101
  }
}

consumer2 = ${akka.projection.grpc.consumer}
consumer2 {
  client {
    host = "127.0.0.1"
    port = 8202
  }
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/akka/grpc/GrpcServiceException.html
- https://doc.akka.io/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/query/typed/scaladsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$$RemoveCriteria.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/ConsumerFilter.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/GrpcQuerySettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/javadsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/consumer/scaladsl/GrpcReadJournal.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducer$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/EventEnvelope.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/query/typed/javadsl/EventsBySliceFirehoseQuery.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide.html
- https://doc.akka.io/libraries/akka-edge/1.6/guide.html
- https://doc.akka.io/libraries/akka-grpc/2.5/client/configuration.html
- https://doc.akka.io/libraries/akka-grpc/2.5/index.html
- https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/journal.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/1.3/query.html
- https://doc.akka.io/libraries/akka-projection/current/durable-state.html
- https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/current/grpc-producer-push.html
- https://doc.akka.io/libraries/akka-projection/current/grpc.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/projection-settings.html
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/current/running.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/grpc.html](https://doc.akka.io/libraries/akka-projection/current/grpc.html)*