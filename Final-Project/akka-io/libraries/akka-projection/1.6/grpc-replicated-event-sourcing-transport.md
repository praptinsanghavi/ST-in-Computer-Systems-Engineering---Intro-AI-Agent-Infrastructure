---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:04:08Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/grpc-replicated-event-sourcing-transport.html
title: Akka Replicated Event Sourcing over gRPC • Akka Projection
---

# Akka Replicated Event Sourcing over gRPC • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Akka Replicated Event Sourcing over gRPC

Akka Replicated Event Sourcing extends Akka Persistence allowing multiple replicas of the same entity, all accepting writes, for example in different data centers or cloud provider regions. This makes it possible to implement patterns such as active\-active and hot standby.

Originally, Akka Replicated Event Sourcing has required cross\-replica access to the underlying replica database, which can be hard to open up for security and infrastructure reasons. It was also easiest to use in an Akka Multi DC Cluster setup where a single cluster spans multiple datacenters or regions, another thing that can be complicated to allow.

Akka Replicated Event Sourcing over gRPC builds on [Akka Projection gRPC](grpc.html) and [Akka gRPC](https://doc.akka.io/libraries/akka-grpc/2.5/index.html) to instead use gRPC as the cross\-replica transport for events.

There are no requirements that the replicas are sharing a cluster, instead it is expected that each replica is a separate Akka cluster with the gRPC replication transport as only connection in between.

## Overview

For a basic overview of Replicated Event Sourcing see the [Akka Replicated Event Sourcing docs](https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html)

Akka Replicated Event Sourcing over gRPC consists of the following three parts:

- The Replicated Event Sourced Behavior is run in each replica as a sharded entity using [Akka Cluster Sharding](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html).
- The events of each replica are published to the other replicas using [Akka Projection gRPC](grpc.html) endpoints.
- Each replica consumes a number of parallel slices of the events from each other replica by running Akka Projection gRPC in [Akka Sharded Daemon Process](https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html).

## Dependencies

The functionality is provided through the `akka-projection-grpc` module.

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

Akka Replicated Event Sourcing over gRPC requires Akka 2\.8\.0 or later and can only be run in an Akka cluster since it uses cluster components.

It is currently only possible to use [akka\-projection\-r2dbc](r2dbc.html) as the projection storage and journal for this module.

The full set of dependencies needed:

sbt
```
libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-projection-grpc" % "1.6.20",
  "com.typesafe.akka" %% "akka-cluster-typed" % "2.10.13",
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % "2.10.13",
  "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12",
  "com.lightbend.akka" %% "akka-projection-r2dbc" % "1.6.20"
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
    <artifactId>akka-projection-grpc_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-r2dbc_${scala.binary.version}</artifactId>
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
  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}:2.10.13"
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:2.10.13"
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
  implementation "com.lightbend.akka:akka-projection-r2dbc_${versions.ScalaBinary}:1.6.20"
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

## API and setup

The same API as regular `EventSourcedBehavior`s is used to define the logic. See [Replicated Event Sourcing](https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html) for more detail on designing an entity for replication.

To enable an entity for Replicated Event Sourcing over gRPC, use the [`Replication`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication$.html "akka.projection.grpc.replication.javadsl.Replication")[`Replication`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication$.html "akka.projection.grpc.replication.scaladsl.Replication") `grpcReplication` method, which takes [`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html "akka.projection.grpc.replication.javadsl.ReplicationSettings")[`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "akka.projection.grpc.replication.scaladsl.ReplicationSettings"), a factory function for the behavior, and an actor system.

The factory function will be passed a [`ReplicatedBehaviors`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicatedBehaviors.html "akka.projection.grpc.replication.javadsl.ReplicatedBehaviors")[`ReplicatedBehaviors`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicatedBehaviors.html "akka.projection.grpc.replication.scaladsl.ReplicatedBehaviors") factory that must be used to set up the replicated event sourced behavior. Its `setup` method provides a [`ReplicationContext`](https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html "akka.persistence.typed.javadsl.ReplicationContext")[`ReplicationContext`](https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html "akka.persistence.typed.scaladsl.ReplicationContext") to create an `EventSourcedBehavior` which will then be configured for replication. The behavior factory can be composed with other behavior factories, if access to the actor context or timers are needed.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L181-L192 "Go to snippet source")def init(implicit system: ActorSystem[_]): Replication[Command] = {
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
  Replication.grpcReplication(replicationSettings)(ShoppingCart.apply)
}

def apply(replicatedBehaviors: ReplicatedBehaviors[Command, Event, State]): Behavior[Command] = {
  Behaviors.setup[Command] { context =>
    replicatedBehaviors.setup { replicationContext =>
      new ShoppingCart(context, replicationContext).behavior()
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L310-L326 "Go to snippet source")public static Replication<Command> init(ActorSystem<?> system) {
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system);
  return Replication.grpcReplication(replicationSettings, ShoppingCart::create, system);
}

public static Behavior<Command> create(
    ReplicatedBehaviors<Command, Event, State> replicatedBehaviors) {
  return Behaviors.setup(
      context ->
          replicatedBehaviors.setup(
              replicationContext -> new ShoppingCart(context, replicationContext)));
}
```

### Settings

The [`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html "akka.projection.grpc.replication.javadsl.ReplicationSettings")[`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "akka.projection.grpc.replication.scaladsl.ReplicationSettings") `apply``create` factory methods can accept an entity name, a [`ReplicationProjectionProvider`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationProjectionProvider.html "akka.projection.grpc.replication.javadsl.ReplicationProjectionProvider")[`ReplicationProjectionProvider`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html "akka.projection.grpc.replication.scaladsl.ReplicationProjectionProvider") and an actor system. The configuration of that system is expected to have a top level entry with the entity name containing this structure:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc-tests/src/test/scala/akka/projection/grpc/replication/ReplicationSettingsSpec.scala#L82-L137 "Go to snippet source")# Replication configuration for the ShoppingCart. Note that config `replicated-shopping-cart`
# is the same as the ShoppingCart entity type name.
replicated-shopping-cart {
  # which of the replicas this node belongs to, should be the same
  # across the nodes of each replica Akka cluster.
  self-replica-id = us-east-1

  # Pick it up from an environment variable to re-use the same config
  # without changes across replicas
  self-replica-id = ${?SELF_REPLICA}

  # max number of parallel in-flight (sent over sharding) entity updates
  # per consumer/projection
  parallel-updates = 8

  # Fail the replication stream (and restart with backoff) if completing
  # the write of a replicated event reaching the cluster takes more time
  # than this.
  entity-event-replication-timeout = 10s

  replicas: [
    {
      # Unique identifier of the replica/datacenter, is stored in the events
      # and cannot be changed after events have been persisted.
      replica-id = "us-east-1"

      # Number of replication streams/projections to start to consume events
      # from this replica
      number-of-consumers = 4

      # Akka gRPC client config block for how to reach this replica
      # from the other replicas, note that binding the server/publishing
      # endpoint of each replica is done separately, in code.
      grpc.client {
        host = "k8s-shopping-604179632a-148180922.us-east-2.elb.amazonaws.com"
        host = ${?US_EAST_1_GRPC_HOST}
        port = 443
        port = ${?US_EAST_1_GRPC_PORT}
        use-tls = true
      }
    },
    {
      replica-id = "eu-west-1"
      number-of-consumers = 4
      # Optional - only run replication stream consumers for events from the
      # remote replica on nodes with this role
      consumers-on-cluster-role = replication-consumer
      grpc.client {
        host = "k8s-shopping-19708e1324-24617530ddc6d2cb.elb.eu-west-1.amazonaws.com"
        host = ${?EU_WEST_1_GRPC_HOST}
        port = 443
        port = ${?EU_WEST_1_GRPC_PORT}
      }
    }
  ]
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc-tests/src/test/scala/akka/projection/grpc/replication/ReplicationSettingsSpec.scala#L82-L137 "Go to snippet source")# Replication configuration for the ShoppingCart. Note that config `replicated-shopping-cart`
# is the same as the ShoppingCart entity type name.
replicated-shopping-cart {
  # which of the replicas this node belongs to, should be the same
  # across the nodes of each replica Akka cluster.
  self-replica-id = us-east-1

  # Pick it up from an environment variable to re-use the same config
  # without changes across replicas
  self-replica-id = ${?SELF_REPLICA}

  # max number of parallel in-flight (sent over sharding) entity updates
  # per consumer/projection
  parallel-updates = 8

  # Fail the replication stream (and restart with backoff) if completing
  # the write of a replicated event reaching the cluster takes more time
  # than this.
  entity-event-replication-timeout = 10s

  replicas: [
    {
      # Unique identifier of the replica/datacenter, is stored in the events
      # and cannot be changed after events have been persisted.
      replica-id = "us-east-1"

      # Number of replication streams/projections to start to consume events
      # from this replica
      number-of-consumers = 4

      # Akka gRPC client config block for how to reach this replica
      # from the other replicas, note that binding the server/publishing
      # endpoint of each replica is done separately, in code.
      grpc.client {
        host = "k8s-shopping-604179632a-148180922.us-east-2.elb.amazonaws.com"
        host = ${?US_EAST_1_GRPC_HOST}
        port = 443
        port = ${?US_EAST_1_GRPC_PORT}
        use-tls = true
      }
    },
    {
      replica-id = "eu-west-1"
      number-of-consumers = 4
      # Optional - only run replication stream consumers for events from the
      # remote replica on nodes with this role
      consumers-on-cluster-role = replication-consumer
      grpc.client {
        host = "k8s-shopping-19708e1324-24617530ddc6d2cb.elb.eu-west-1.amazonaws.com"
        host = ${?EU_WEST_1_GRPC_HOST}
        port = 443
        port = ${?EU_WEST_1_GRPC_PORT}
      }
    }
  ]
}
```

The entries in the block refer to the local replica while `replicas` is a list of all replicas, including the node itself, with details about how to reach the replicas across the network.

The `grpc.client` section for each of the replicas is used for setting up the Akka gRPC client and supports the same discovery, TLS and other connection options as when using Akka gRPC directly. For more details see [Akka gRPC configuration](https://doc.akka.io/libraries/akka-grpc/2.5/client/configuration.html#by-configuration).

It is also possible to set up [`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html "akka.projection.grpc.replication.javadsl.ReplicationSettings")[`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "akka.projection.grpc.replication.scaladsl.ReplicationSettings") through APIs only and not rely on the configuration file at all.

### Fully connected topology

In a network topology where each replica cluster can connect to each other replica cluster the configuration should list all replicas and gRPC server must be started in each replica.

#### Binding the publisher

Binding the publisher is a manual step to allow arbitrary customization of the Akka HTTP server and combining the endpoint with other HTTP and gRPC routes.

When there is only a single replicated entity and no other usage of Akka gRPC Projections in an application a convenience is provided through `createSingleServiceHandler` on [`Replication`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication.html "akka.projection.grpc.replication.javadsl.Replication")[`Replication`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication.html "akka.projection.grpc.replication.scaladsl.Replication") which will create a single handler:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/Main.scala#L31-L34 "Go to snippet source")val replicatedShoppingCart = ShoppingCart.init(system)
// alternatively
// val replicatedShoppingCart = ShoppingCart.initWithProducerFilter(system)
val replicationService = replicatedShoppingCart.createSingleServiceHandler()
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/Main.java#L37-L41 "Go to snippet source")Replication<ShoppingCart.Command> replicatedShoppingCart = ShoppingCart.init(system);
// alternatively
// Replication<ShoppingCart.Command> replicatedShoppingCart = ShoppingCart.initWithProducerFilter(system);
Function<HttpRequest, CompletionStage<HttpResponse>> replicationService =
    replicatedShoppingCart.createSingleServiceHandler();
```

This can then be bound:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCartServer.scala#L29-L40 "Go to snippet source")val service: HttpRequest => Future[HttpResponse] =
  ServiceHandler.concatOrNotFound(
    replicationService,
    proto.ShoppingCartServiceHandler.partial(grpcService),
    // ServerReflection enabled to support grpcurl without import-path and proto parameters
    ServerReflection.partial(List(proto.ShoppingCartService)))

val bound =
  Http()
    .newServerAt(interface, port)
    .bind(service)
    .map(_.addToCoordinatedShutdown(3.seconds))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCartServer.java#L30-L39 "Go to snippet source")Function<HttpRequest, CompletionStage<HttpResponse>> service =
    ServiceHandler.concatOrNotFound(
        replicationService,
        ShoppingCartServiceHandlerFactory.create(grpcService, system),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.create(
            Collections.singletonList(ShoppingCartService.description), system));

CompletionStage<ServerBinding> bound =
    Http.get(system).newServerAt(host, port).bind(service::apply);
```

When multiple producers exist, all instances of [`EventProducerSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html "akka.projection.grpc.producer.EventProducerSettings")[`EventProducerSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html "akka.projection.grpc.producer.EventProducerSettings") need to be passed at once to `EventProducer.grpcServiceHandler` to create a single producer service handling each of the event streams.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc-tests/src/test/scala/akka/projection/grpc/replication/scaladsl/ProducerApiSample.scala#L26-L37 "Go to snippet source")val replication: Replication[MyCommand] =
  Replication.grpcReplication(settings)(MyReplicatedBehavior.apply)

val allSources: Set[EventProducerSource] = {
  Set(
    replication.eventProducerSource,
    // producers from other replicated entities or gRPC projections
    otherReplication.eventProducerSource)
}
val route = EventProducer.grpcServiceHandler(allSources)

val handler = ServiceHandler.concatOrNotFound(route)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-grpc-tests/src/test/java/akka/projection/grpc/replication/javdsl/ReplicationCompileTest.java#L138-L152 "Go to snippet source")Set<EventProducerSource> allSources = new HashSet<>();

Replication<MyCommand> replication = ShoppingCart.init(system);
allSources.add(replication.eventProducerService());

// add additional EventProducerSource from other entities or
// Akka Projection gRPC
allSources.add(otherReplication.eventProducerService());

Function<HttpRequest, CompletionStage<HttpResponse>> route =
    EventProducer.grpcServiceHandler(system, allSources);

@SuppressWarnings("unchecked")
Function<HttpRequest, CompletionStage<HttpResponse>> handler =
    ServiceHandler.concatOrNotFound(route);
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

### Edge topology

In some use cases it is not possible to use a [fully connected topology](grpc-replicated-event-sourcing-transport.html#fully-connected-topology), for example because of firewalls or NAT in front of each producer. The consumer may also not know about all producers up front.

This is typical when using [Replicated Event Sourcing at the edge](https://doc.akka.io/libraries/akka-edge/1.6/feature-summary.html#replicated-event-sourcing-over-grpc). where the connection can only be established from the edge service to the cloud service.

For this purpose, Akka Replicated Event Sourcing gRPC has a mode where the replication streams for both consuming and producing events are initiated by one side. In this way a star topology can be defined, and it’s possible to combine with replicas that are fully connected.

You would still define how to connect to other replicas as described above, but it’s only needed on the edge side, and it would typically only define one or a few cloud replicas that it will connect to. A gRPC server is not needed on the edge side, because there are no incoming connections.

On the edge side you start with `Replication.grpcEdgeReplication`.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L227-L230 "Go to snippet source")def initEdge(implicit system: ActorSystem[_]): EdgeReplication[Command] = {
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
  Replication.grpcEdgeReplication(replicationSettings)(ShoppingCart.apply)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L373-L381 "Go to snippet source")public static EdgeReplication<Command> initEdge(ActorSystem<?> system) {
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
              Command.class,
              ShoppingCart.ENTITY_TYPE,
              R2dbcReplication.create(system),
              system);
  return Replication.grpcEdgeReplication(replicationSettings, ShoppingCart::create, system);
}
```

On the cloud side you would start with `Replication.grpcReplication` as described above, but with the addition `withEdgeReplication(true)` in the [`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html "akka.projection.grpc.replication.javadsl.ReplicationSettings")[`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "akka.projection.grpc.replication.scaladsl.ReplicationSettings") or enable `akka.projection.grpc.replication.accept-edge-replication` configuration.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L219-L223 "Go to snippet source")def initAllowEdge(implicit system: ActorSystem[_]): EdgeReplication[Command] = {
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
    .withEdgeReplication(true)
  Replication.grpcEdgeReplication(replicationSettings)(ShoppingCart.apply)
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L360-L369 "Go to snippet source")public static Replication<Command> initAllowEdge(ActorSystem<?> system) {
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system)
          .withEdgeReplication(true);
  return Replication.grpcReplication(replicationSettings, ShoppingCart::create, system);
}
```

## Serialization of events

The events are serialized for being passed over the wire using the same Akka serializer as configured for serializing the events for storage.

Note that having separate replicas increases the risk that two different serialized formats and versions of the serializer are running at the same time, so extra care must be taken when changing the events and their serialization and deploying new versions of the application to the replicas.

For some scenarios it may be necessary to do a two\-step deploy of format changes to not lose data, first deploy support for a new serialization format so that all replicas can deserialize it, then a second deploy where the new field is actually populated with data.

## Filters

By default, events from all Replicated Event Sourced entities are replicated.

The same kind of filters as described in [Akka Projection gRPC Filters](grpc.html#filters) can be used for Replicated Event Sourcing.

The producer filter is defined with `withProducerFilter` or `withProducerFilterTopicExpression` in [`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html "akka.projection.grpc.replication.javadsl.ReplicationSettings")[`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "akka.projection.grpc.replication.scaladsl.ReplicationSettings"):

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-scala/src/main/scala/shopping/cart/ShoppingCart.scala#L199-L215 "Go to snippet source")def initWithProducerFilter(implicit system: ActorSystem[_]): Replication[Command] = {
  val producerFilter: EventEnvelope[Event] => Boolean = { envelope =>
    envelope.tags.contains(VipCustomerTag)
  }
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
    .withProducerFilter(producerFilter)

  Replication.grpcReplication(replicationSettings)(ShoppingCart.applyWithProducerFilter)
}

def applyWithProducerFilter(replicatedBehaviors: ReplicatedBehaviors[Command, Event, State]): Behavior[Command] = {
  Behaviors.setup[Command] { context =>
    replicatedBehaviors.setup { replicationContext =>
      new ShoppingCart(context, replicationContext, onlyReplicateVip = true).behavior()
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/samples/replicated/shopping-cart-service-java/src/main/java/shopping/cart/ShoppingCart.java#L332-L356 "Go to snippet source")public static Replication<Command> initWithProducerFilter(ActorSystem<?> system) {
  Predicate<EventEnvelope<Event>> producerFilter =
      envelope -> envelope.getTags().contains(VIP_CUSTOMER_TAG);
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system)
          .withProducerFilter(producerFilter);

  return Replication.grpcReplication(replicationSettings,  ShoppingCart::createWithProducerFilter, system);
}

public static Behavior<Command> createWithProducerFilter(
    ReplicatedBehaviors<Command, Event, State> replicatedBehaviors) {
  return Behaviors.setup(
      context ->
          replicatedBehaviors.setup(
              replicationContext -> new ShoppingCart(
                  context,
                  replicationContext,
                  true // onlyReplicateVip flag
                  )));
}
```

The initial consumer filter is defined with `withInitialConsumerFilter` in [`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html "akka.projection.grpc.replication.javadsl.ReplicationSettings")[`ReplicationSettings`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html "akka.projection.grpc.replication.scaladsl.ReplicationSettings"). Consumer defined filters can be updated in runtime as described in [Akka Projection gRPC Consumer defined filter](grpc.html#consumer-defined-filter)

One thing to note is that `streamId` is always the same as the `entityType` when using Replicated Event Sourcing.

The entity id based filter criteria must include the replica id as suffix to the entity id, with `|` separator.

## Sample projects

Source code and build files for complete sample projects can be found in the [Akka Distributed Cluster Guide](https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/3-active-active.html) and [Akka Edge Guide](https://doc.akka.io/libraries/akka-edge/1.6/guide.html).

## Security

Mutual authentication with TLS can be setup according to the [Akka gRPC documentation](https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html)

## Access control

### From the consumer

The consumer can pass metadata, such as auth headers, in each request to the producer service by specifying [`Metadata`](/akka/grpc/javadsl/Metadata.html "akka.grpc.javadsl.Metadata")[`Metadata`](/akka/grpc/scaladsl/Metadata.html "akka.grpc.scaladsl.Metadata") as `additionalRequestMetadata` when creating each [`Replica`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replica.html "akka.projection.grpc.replication.javadsl.Replica")[`Replica`](/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replica.html "akka.projection.grpc.replication.scaladsl.Replica")

### In the producer

Authentication and authorization for the producer can be done by implementing an [`EventProducerInterceptor`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html "akka.projection.grpc.producer.javadsl.EventProducerInterceptor")[`EventProducerInterceptor`](/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html "akka.projection.grpc.producer.scaladsl.EventProducerInterceptor") and passing it to the `grpcServiceHandler` method during producer bootstrap. The interceptor is invoked with the stream id and gRPC request metadata for each incoming request and can return a suitable error through [`GrpcServiceException`](/akka/grpc/GrpcServiceException.html "akka.grpc.GrpcServiceException")[`GrpcServiceException`](/akka/grpc/GrpcServiceException.html "akka.grpc.GrpcServiceException")

## Migrating from non\-replicated

It is possible to migrate from an ordinary single\-writer `EventSourcedBehavior` to a `ReplicatedEventSourcedBehavior`. The events are stored in the same way, aside from some metadata that is filled in automatically if it’s missing.

The `ReplicaId` for the where the original entity was located should be empty. This makes sure that the same `PersistenceId` and same events are used for the original replica.

The aspects of [Resolving conflicting updates](https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html#resolving-conflicting-updates) must be considered in the logic of the event handler when migrating to Replicated Event Sourcing.

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
  "com.lightbend.akka" %% "akka-projection-grpc" % "1.6.20",
  "com.typesafe.akka" %% "akka-cluster-typed" % "2.10.13",
  "com.typesafe.akka" %% "akka-cluster-sharding-typed" % "2.10.13",
  "com.lightbend.akka" %% "akka-persistence-r2dbc" % "1.3.12",
  "com.lightbend.akka" %% "akka-projection-r2dbc" % "1.6.20"
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
    <artifactId>akka-projection-grpc_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-sharding-typed_${scala.binary.version}</artifactId>
    <version>2.10.13</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-persistence-r2dbc_${scala.binary.version}</artifactId>
    <version>1.3.12</version>
  </dependency&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-r2dbc_${scala.binary.version}</artifactId>
    <version>1.6.20</version>
  </dependency&gt
</dependencies>
```

### Example 9: Dependencies

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-projection-grpc_${versions.ScalaBinary}:1.6.20"
  implementation "com.typesafe.akka:akka-cluster-typed_${versions.ScalaBinary}:2.10.13"
  implementation "com.typesafe.akka:akka-cluster-sharding-typed_${versions.ScalaBinary}:2.10.13"
  implementation "com.lightbend.akka:akka-persistence-r2dbc_${versions.ScalaBinary}:1.3.12"
  implementation "com.lightbend.akka:akka-projection-r2dbc_${versions.ScalaBinary}:1.6.20"
}
```

### Example 10: API and setup

```scala
def init(implicit system: ActorSystem[_]): Replication[Command] = {
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
  Replication.grpcReplication(replicationSettings)(ShoppingCart.apply)
}

def apply(replicatedBehaviors: ReplicatedBehaviors[Command, Event, State]): Behavior[Command] = {
  Behaviors.setup[Command] { context =>
    replicatedBehaviors.setup { replicationContext =>
      new ShoppingCart(context, replicationContext).behavior()
    }
  }
}
```

### Example 11: API and setup

```java
public static Replication<Command> init(ActorSystem<?> system) {
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system);
  return Replication.grpcReplication(replicationSettings, ShoppingCart::create, system);
}

public static Behavior<Command> create(
    ReplicatedBehaviors<Command, Event, State> replicatedBehaviors) {
  return Behaviors.setup(
      context ->
          replicatedBehaviors.setup(
              replicationContext -> new ShoppingCart(context, replicationContext)));
}
```

### Example 12: Settings

```scala
# Replication configuration for the ShoppingCart. Note that config `replicated-shopping-cart`
# is the same as the ShoppingCart entity type name.
replicated-shopping-cart {
  # which of the replicas this node belongs to, should be the same
  # across the nodes of each replica Akka cluster.
  self-replica-id = us-east-1

  # Pick it up from an environment variable to re-use the same config
  # without changes across replicas
  self-replica-id = ${?SELF_REPLICA}

  # max number of parallel in-flight (sent over sharding) entity updates
  # per consumer/projection
  parallel-updates = 8

  # Fail the replication stream (and restart with backoff) if completing
  # the write of a replicated event reaching the cluster takes more time
  # than this.
  entity-event-replication-timeout = 10s

  replicas: [
    {
      # Unique identifier of the replica/datacenter, is stored in the events
      # and cannot be changed after events have been persisted.
      replica-id = "us-east-1"

      # Number of replication streams/projections to start to consume events
      # from this replica
      number-of-consumers = 4

      # Akka gRPC client config block for how to reach this replica
      # from the other replicas, note that binding the server/publishing
      # endpoint of each replica is done separately, in code.
      grpc.client {
        host = "k8s-shopping-604179632a-148180922.us-east-2.elb.amazonaws.com"
        host = ${?US_EAST_1_GRPC_HOST}
        port = 443
        port = ${?US_EAST_1_GRPC_PORT}
        use-tls = true
      }
    },
    {
      replica-id = "eu-west-1"
      number-of-consumers = 4
      # Optional - only run replication stream consumers for events from the
      # remote replica on nodes with this role
      consumers-on-cluster-role = replication-consumer
      grpc.client {
        host = "k8s-shopping-19708e1324-24617530ddc6d2cb.elb.eu-west-1.amazonaws.com"
        host = ${?EU_WEST_1_GRPC_HOST}
        port = 443
        port = ${?EU_WEST_1_GRPC_PORT}
      }
    }
  ]
}
```

### Example 13: Settings

```scala
# Replication configuration for the ShoppingCart. Note that config `replicated-shopping-cart`
# is the same as the ShoppingCart entity type name.
replicated-shopping-cart {
  # which of the replicas this node belongs to, should be the same
  # across the nodes of each replica Akka cluster.
  self-replica-id = us-east-1

  # Pick it up from an environment variable to re-use the same config
  # without changes across replicas
  self-replica-id = ${?SELF_REPLICA}

  # max number of parallel in-flight (sent over sharding) entity updates
  # per consumer/projection
  parallel-updates = 8

  # Fail the replication stream (and restart with backoff) if completing
  # the write of a replicated event reaching the cluster takes more time
  # than this.
  entity-event-replication-timeout = 10s

  replicas: [
    {
      # Unique identifier of the replica/datacenter, is stored in the events
      # and cannot be changed after events have been persisted.
      replica-id = "us-east-1"

      # Number of replication streams/projections to start to consume events
      # from this replica
      number-of-consumers = 4

      # Akka gRPC client config block for how to reach this replica
      # from the other replicas, note that binding the server/publishing
      # endpoint of each replica is done separately, in code.
      grpc.client {
        host = "k8s-shopping-604179632a-148180922.us-east-2.elb.amazonaws.com"
        host = ${?US_EAST_1_GRPC_HOST}
        port = 443
        port = ${?US_EAST_1_GRPC_PORT}
        use-tls = true
      }
    },
    {
      replica-id = "eu-west-1"
      number-of-consumers = 4
      # Optional - only run replication stream consumers for events from the
      # remote replica on nodes with this role
      consumers-on-cluster-role = replication-consumer
      grpc.client {
        host = "k8s-shopping-19708e1324-24617530ddc6d2cb.elb.eu-west-1.amazonaws.com"
        host = ${?EU_WEST_1_GRPC_HOST}
        port = 443
        port = ${?EU_WEST_1_GRPC_PORT}
      }
    }
  ]
}
```

### Example 14: Binding the publisher

```scala
val replicatedShoppingCart = ShoppingCart.init(system)
// alternatively
// val replicatedShoppingCart = ShoppingCart.initWithProducerFilter(system)
val replicationService = replicatedShoppingCart.createSingleServiceHandler()
```

### Example 15: Binding the publisher

```java
Replication<ShoppingCart.Command> replicatedShoppingCart = ShoppingCart.init(system);
// alternatively
// Replication<ShoppingCart.Command> replicatedShoppingCart = ShoppingCart.initWithProducerFilter(system);
Function<HttpRequest, CompletionStage<HttpResponse>> replicationService =
    replicatedShoppingCart.createSingleServiceHandler();
```

### Example 16: Binding the publisher

```scala
val service: HttpRequest => Future[HttpResponse] =
  ServiceHandler.concatOrNotFound(
    replicationService,
    proto.ShoppingCartServiceHandler.partial(grpcService),
    // ServerReflection enabled to support grpcurl without import-path and proto parameters
    ServerReflection.partial(List(proto.ShoppingCartService)))

val bound =
  Http()
    .newServerAt(interface, port)
    .bind(service)
    .map(_.addToCoordinatedShutdown(3.seconds))
```

### Example 17: Binding the publisher

```java
Function<HttpRequest, CompletionStage<HttpResponse>> service =
    ServiceHandler.concatOrNotFound(
        replicationService,
        ShoppingCartServiceHandlerFactory.create(grpcService, system),
        // ServerReflection enabled to support grpcurl without import-path and proto parameters
        ServerReflection.create(
            Collections.singletonList(ShoppingCartService.description), system));

CompletionStage<ServerBinding> bound =
    Http.get(system).newServerAt(host, port).bind(service::apply);
```

### Example 18: Binding the publisher

```scala
val replication: Replication[MyCommand] =
  Replication.grpcReplication(settings)(MyReplicatedBehavior.apply)

val allSources: Set[EventProducerSource] = {
  Set(
    replication.eventProducerSource,
    // producers from other replicated entities or gRPC projections
    otherReplication.eventProducerSource)
}
val route = EventProducer.grpcServiceHandler(allSources)

val handler = ServiceHandler.concatOrNotFound(route)
```

### Example 19: Binding the publisher

```java
Set<EventProducerSource> allSources = new HashSet<>();

Replication<MyCommand> replication = ShoppingCart.init(system);
allSources.add(replication.eventProducerService());

// add additional EventProducerSource from other entities or
// Akka Projection gRPC
allSources.add(otherReplication.eventProducerService());

Function<HttpRequest, CompletionStage<HttpResponse>> route =
    EventProducer.grpcServiceHandler(system, allSources);

@SuppressWarnings("unchecked")
Function<HttpRequest, CompletionStage<HttpResponse>> handler =
    ServiceHandler.concatOrNotFound(route);
```

### Example 20: Binding the publisher

```conf
akka.http.server.enable-http2 = on
```

### Example 21: Binding the publisher

```conf
akka.http.server.enable-http2 = on
```

### Example 22: Edge topology

```scala
def initEdge(implicit system: ActorSystem[_]): EdgeReplication[Command] = {
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
  Replication.grpcEdgeReplication(replicationSettings)(ShoppingCart.apply)
}
```

### Example 23: Edge topology

```java
public static EdgeReplication<Command> initEdge(ActorSystem<?> system) {
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
              Command.class,
              ShoppingCart.ENTITY_TYPE,
              R2dbcReplication.create(system),
              system);
  return Replication.grpcEdgeReplication(replicationSettings, ShoppingCart::create, system);
}
```

### Example 24: Edge topology

```scala
def initAllowEdge(implicit system: ActorSystem[_]): EdgeReplication[Command] = {
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
    .withEdgeReplication(true)
  Replication.grpcEdgeReplication(replicationSettings)(ShoppingCart.apply)
}
```

### Example 25: Edge topology

```java
public static Replication<Command> initAllowEdge(ActorSystem<?> system) {
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system)
          .withEdgeReplication(true);
  return Replication.grpcReplication(replicationSettings, ShoppingCart::create, system);
}
```

### Example 26: Filters

```scala
def initWithProducerFilter(implicit system: ActorSystem[_]): Replication[Command] = {
  val producerFilter: EventEnvelope[Event] => Boolean = { envelope =>
    envelope.tags.contains(VipCustomerTag)
  }
  val replicationSettings = ReplicationSettings[Command](EntityType, R2dbcReplication())
    .withProducerFilter(producerFilter)

  Replication.grpcReplication(replicationSettings)(ShoppingCart.applyWithProducerFilter)
}

def applyWithProducerFilter(replicatedBehaviors: ReplicatedBehaviors[Command, Event, State]): Behavior[Command] = {
  Behaviors.setup[Command] { context =>
    replicatedBehaviors.setup { replicationContext =>
      new ShoppingCart(context, replicationContext, onlyReplicateVip = true).behavior()
    }
  }
}
```

### Example 27: Filters

```java
public static Replication<Command> initWithProducerFilter(ActorSystem<?> system) {
  Predicate<EventEnvelope<Event>> producerFilter =
      envelope -> envelope.getTags().contains(VIP_CUSTOMER_TAG);
  ReplicationSettings<Command> replicationSettings =
      ReplicationSettings.create(
          Command.class,
          ShoppingCart.ENTITY_TYPE,
          R2dbcReplication.create(system),
          system)
          .withProducerFilter(producerFilter);

  return Replication.grpcReplication(replicationSettings,  ShoppingCart::createWithProducerFilter, system);
}

public static Behavior<Command> createWithProducerFilter(
    ReplicatedBehaviors<Command, Event, State> replicatedBehaviors) {
  return Behaviors.setup(
      context ->
          replicatedBehaviors.setup(
              replicationContext -> new ShoppingCart(
                  context,
                  replicationContext,
                  true // onlyReplicateVip flag
                  )));
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/akka/grpc/GrpcServiceException.html
- https://doc.akka.io/akka/grpc/javadsl/Metadata.html
- https://doc.akka.io/akka/grpc/scaladsl/Metadata.html
- https://doc.akka.io/api/akka-core/2.10/akka/persistence/typed/scaladsl/ReplicationContext.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/EventProducerSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/javadsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/producer/scaladsl/EventProducerInterceptor.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replica.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicatedBehaviors.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/Replication.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationProjectionProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/javadsl/ReplicationSettings.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replica.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicatedBehaviors.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/Replication.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationProjectionProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/grpc/replication/scaladsl/ReplicationSettings.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/persistence/typed/javadsl/ReplicationContext.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharded-daemon-process.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/cluster-sharding.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/replicated-eventsourcing.html
- https://doc.akka.io/libraries/akka-distributed-cluster/1.6/guide/3-active-active.html
- https://doc.akka.io/libraries/akka-edge/1.6/feature-summary.html
- https://doc.akka.io/libraries/akka-edge/1.6/guide.html
- https://doc.akka.io/libraries/akka-grpc/2.5/client/configuration.html
- https://doc.akka.io/libraries/akka-grpc/2.5/index.html
- https://doc.akka.io/libraries/akka-grpc/2.5/mtls.html
- https://doc.akka.io/libraries/akka-projection/1.6/grpc-producer-push.html
- https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html
- https://doc.akka.io/libraries/akka-projection/1.6/grpc.html
- https://doc.akka.io/libraries/akka-projection/1.6/management.html
- https://doc.akka.io/libraries/akka-projection/1.6/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/1.6/snapshots.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html](https://doc.akka.io/libraries/akka-projection/1.6/grpc-replicated-event-sourcing-transport.html)*