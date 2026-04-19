---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/cassandra.html
title: Offset in Cassandra • Akka Projection
---

# Offset in Cassandra • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Offset in Cassandra

The [`CassandraProjection`](/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/CassandraProjection$.html "akka.projection.cassandra.javadsl.CassandraProjection")[`CassandraProjection`](/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/CassandraProjection$.html "akka.projection.cassandra.scaladsl.CassandraProjection") has support for storing the offset in Cassandra.

The source of the envelopes can be [events from Akka Persistence](eventsourced.html) or any other `SourceProvider` with supported [offset types](cassandra.html#offset-types).

The envelope handler can integrate with anything, such as publishing to a message broker, or updating a read model in Cassandra.

The `CassandraProjection` offers [at\-least\-once](cassandra.html#at-least-once) and [at\-most\-once](cassandra.html#at-most-once) processing semantics, but not exactly\-once.

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

To use the Cassandra module of Akka Projections add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-cassandra" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-cassandra_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-cassandra_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections requires Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections Cassandra | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-cassandra 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.cassandra |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-09\-10 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-cassandra`’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.lightbend.akka | akka\-stream\-alpakka\-cassandra\_2\.13 | [10\.0\.0](https://mvnrepository.com/artifact/com.lightbend.akka/akka-stream-alpakka-cassandra_2.13/10.0.0) |
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
com.lightbend.akka    akka-stream-alpakka-cassandra_2.13    [10.0.0](https://mvnrepository.com/artifact/com.lightbend.akka/akka-stream-alpakka-cassandra_2.13/10.0.0)    BUSL-1.1
    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.apache.cassandra    java-driver-core    [4.19.1](https://mvnrepository.com/artifact/org.apache.cassandra/java-driver-core/4.19.1)    Apache 2
        com.datastax.oss    native-protocol    [1.5.2](https://mvnrepository.com/artifact/com.datastax.oss/native-protocol/1.5.2)    Apache 2
        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
            com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
        com.github.jnr    jnr-posix    [3.1.15](https://mvnrepository.com/artifact/com.github.jnr/jnr-posix/3.1.15)    Eclipse Public License - v 2.0
            com.github.jnr    jnr-constants    [0.10.3](https://mvnrepository.com/artifact/com.github.jnr/jnr-constants/0.10.3)    The Apache Software License, Version 2.0
            com.github.jnr    jnr-ffi    [2.2.11](https://mvnrepository.com/artifact/com.github.jnr/jnr-ffi/2.2.11)    The Apache Software License, Version 2.0
                com.github.jnr    jffi    [1.3.9](https://mvnrepository.com/artifact/com.github.jnr/jffi/1.3.9)    The Apache Software License, Version 2.0
                com.github.jnr    jnr-a64asm    [1.0.0](https://mvnrepository.com/artifact/com.github.jnr/jnr-a64asm/1.0.0)    The Apache Software License, Version 2.0
                com.github.jnr    jnr-x86asm    [1.0.2](https://mvnrepository.com/artifact/com.github.jnr/jnr-x86asm/1.0.2)    MIT License
                org.ow2.asm    asm-analysis    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-analysis/9.2)    BSD-3-Clause
                    org.ow2.asm    asm-tree    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-tree/9.2)    BSD-3-Clause
                        org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                org.ow2.asm    asm-commons    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-commons/9.2)    BSD-3-Clause
                    org.ow2.asm    asm-analysis    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-analysis/9.2)    BSD-3-Clause
                        org.ow2.asm    asm-tree    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-tree/9.2)    BSD-3-Clause
                            org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                    org.ow2.asm    asm-tree    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-tree/9.2)    BSD-3-Clause
                        org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                    org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                org.ow2.asm    asm-tree    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-tree/9.2)    BSD-3-Clause
                    org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                org.ow2.asm    asm-util    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-util/9.2)    BSD-3-Clause
                    org.ow2.asm    asm-analysis    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-analysis/9.2)    BSD-3-Clause
                        org.ow2.asm    asm-tree    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-tree/9.2)    BSD-3-Clause
                            org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                    org.ow2.asm    asm-tree    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm-tree/9.2)    BSD-3-Clause
                        org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                    org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
                org.ow2.asm    asm    [9.2](https://mvnrepository.com/artifact/org.ow2.asm/asm/9.2)    BSD-3-Clause
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        io.dropwizard.metrics    metrics-core    [4.1.18](https://mvnrepository.com/artifact/io.dropwizard.metrics/metrics-core/4.1.18)    Apache License 2.0
            org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        io.netty    netty-handler    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-handler/4.1.119.Final)    Apache License, Version 2.0
            io.netty    netty-buffer    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
            io.netty    netty-codec    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-codec/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.119.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.119.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
            io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
            io.netty    netty-resolver    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
            io.netty    netty-transport-native-unix-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-transport-native-unix-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-transport    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-buffer    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.119.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-resolver    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.119.Final)    Apache License, Version 2.0
                        io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
            io.netty    netty-transport    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-transport/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-buffer    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-buffer/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
                io.netty    netty-resolver    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-resolver/4.1.119.Final)    Apache License, Version 2.0
                    io.netty    netty-common    [4.1.119.Final](https://mvnrepository.com/artifact/io.netty/netty-common/4.1.119.Final)    Apache License, Version 2.0
        org.apache.cassandra    java-driver-guava-shaded    [4.19.1](https://mvnrepository.com/artifact/org.apache.cassandra/java-driver-guava-shaded/4.19.1)    Apache 2
        org.hdrhistogram    HdrHistogram    [2.1.12](https://mvnrepository.com/artifact/org.hdrhistogram/HdrHistogram/2.1.12)    Public Domain, per Creative Commons CC0
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
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

## at\-least\-once

The offset is stored after the envelope has been processed and giving at\-least\-once processing semantics. This means that if the projection is restarted from a previously stored offset some elements may be processed more than once. Therefore, the [Handler](cassandra.html#handler) code must be idempotent.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L26-L28 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L41-L44 "Go to snippet source")import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.Projection;
import akka.projection.ProjectionId;

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            () -> new ShoppingCartHandler())
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

The offset is stored after a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withSaveOffset` of the returned `AtLeastOnceProjection`. The default settings for the window is defined in configuration section `akka.projection.at-least-once`. There is a performance benefit of not storing the offset too often, but the drawback is that there can be more duplicates when the projection that will be processed again when the projection is restarted.

The [`ShoppingCartHandler` is shown below](cassandra.html#handler).

## at\-most\-once

The offset for each envelope is stored before the envelope has been processed and giving at\-most\-once processing semantics. This means that if the projection is restarted from previously stored offset one envelope may not have been processed.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L26-L28 "Go to snippet source")import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

val projection =
  CassandraProjection.atMostOnce(
    projectionId = ProjectionId("shopping-carts", "carts-1"),
    sourceProvider,
    handler = () => new ShoppingCartHandler)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L149-L151 "Go to snippet source")Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atMostOnce(
        ProjectionId.of("shopping-carts", "carts-1"), sourceProvider, ShoppingCartHandler::new);
```

Since the offset must be stored for each envelope this is slower than [at\-least\-once](cassandra.html#at-least-once), which can batch offsets before storing.

The [`ShoppingCartHandler` is shown below](cassandra.html#handler).

## groupedWithin

The envelopes can be grouped before processing, which can be useful for batch updates.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L112-L118 "Go to snippet source")val projection =
  CassandraProjection
    .groupedWithin(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new GroupedShoppingCartHandler)
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L163-L171 "Go to snippet source")int groupAfterEnvelopes = 20;
Duration groupAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.groupedWithin(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            GroupedShoppingCartHandler::new)
        .withGroup(groupAfterEnvelopes, groupAfterDuration);
```

The envelopes are grouped within a time window, or limited by a number of envelopes, whatever happens first. This window can be defined with `withGroup` of the returned `GroupedProjection`. The default settings for the window is defined in configuration section `akka.projection.grouped`.

When using `groupedWithin` the handler is a `Handler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]]``Handler<List<EventEnvelope<ShoppingCart.Event>>>`. The [`GroupedShoppingCartHandler` is shown below](cassandra.html#grouped-handler).

It stores the offset in Cassandra immediately after the `handler` has processed the envelopes, but that is still with at\-least\-once processing semantics. This means that if the projection is restarted from previously stored offset the previous group of envelopes may be processed more than once.

## Handler

It’s in the [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") that you implement the processing of each envelope. It’s essentially a function from `Envelope` to `Future[Done]``CompletionStage<Done>`. This means that the envelope handler can integrate with anything, such as publishing to a message broker, or updating a read model in Cassandra.

A handler that is consuming `ShoppingCart.Event` from `eventsByTag` can look like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L32-L38 "Go to snippet source")import scala.concurrent.duration._
import scala.concurrent.Future

import akka.Done
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory

class ShoppingCartHandler extends Handler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info("Shopping cart {} was checked out at {}", cartId, time)
        Future.successful(Done)

      case otherEvent =>
        logger.debug("Shopping cart {} changed by {}", otherEvent.cartId, otherEvent)
        Future.successful(Done)
    }
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L48-L56 "Go to snippet source")import akka.projection.javadsl.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ShoppingCartHandler extends Handler<EventEnvelope<ShoppingCart.Event>> {
  private Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);
      return CompletableFuture.completedFuture(Done.getInstance());
    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }
}
```

Hint
Such simple handlers can also be defined as plain functionslambdas via the helper `Handler.apply``Handler.fromFunction` factory method.

### Grouped handler

When using [`CassandraProjection.groupedWithin`](cassandra.html#groupedwithin) the handler is processing a `Seq``List` of envelopes.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/CassandraProjectionDocExample.scala#L64-L79 "Go to snippet source")import scala.collection.immutable

class GroupedShoppingCartHandler extends Handler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): Future[Done] = {
    envelopes.map(_.event).foreach {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info("Shopping cart {} was checked out at {}", cartId, time)

      case otherEvent =>
        logger.debug("Shopping cart {} changed by {}", otherEvent.cartId, otherEvent)
    }
    Future.successful(Done)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/CassandraProjectionDocExample.java#L97-L117 "Go to snippet source")public class GroupedShoppingCartHandler extends Handler<List<EventEnvelope<ShoppingCart.Event>>> {
  private Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    envelopes.forEach(
        env -> {
          ShoppingCart.Event event = env.event();
          if (event instanceof ShoppingCart.CheckedOut) {
            ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
            logger.info(
                "Shopping cart {} was checked out at {}",
                checkedOut.cartId,
                checkedOut.eventTime);
          } else {
            logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
          }
        });
    return CompletableFuture.completedFuture(Done.getInstance());
  }
}
```

### Stateful handler

The `Handler` can be stateful, with variables and mutable data structures. It is invoked by the `Projection` machinery one envelope at a time and visibility guarantees between the invocations are handled automatically, i.e. no volatile or other concurrency primitives are needed for managing the state.

The returned `Future[Done]``CompletionStage<Done>` is to be completed when the processing of the `envelope` has finished. The handler will not be invoked with the next envelope until after the returned `Future[Done]``CompletionStage<Done>` has been completed.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L104-L115 "Go to snippet source")class WordCountHandler extends Handler[WordEnvelope] {
  private val logger = LoggerFactory.getLogger(getClass)
  private var state: Map[Word, Count] = Map.empty

  override def process(envelope: WordEnvelope): Future[Done] = {
    val word = envelope.word
    val newCount = state.getOrElse(word, 0) + 1
    logger.info("Word count for {} is {}", word, newCount)
    state = state.updated(word, newCount)
    Future.successful(Done)
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L172-L184 "Go to snippet source")public class WordCountHandler extends Handler<WordEnvelope> {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final Map<String, Integer> state = new HashMap<>();

  @Override
  public CompletionStage<Done> process(WordEnvelope envelope) {
    String word = envelope.word;
    int newCount = state.getOrDefault(word, 0) + 1;
    logger.info("Word count for {} is {}", word, newCount);
    state.put(word, newCount);
    return CompletableFuture.completedFuture(Done.getInstance());
  }
}
```

Note
It is important that the `Handler` instance is not shared between several `Projection` instances, because then it would be invoked concurrently, which is not how it is intended to be used. Each `Projection` instance should use a new `Handler` instance. This is the reason why the handler parameter is a factory (`() =>`)(`Supplier`) of the handler. A new handler instance is also created when the projection is restarted. 

However, the state must typically be loaded and updated by asynchronous operations and then it can be error prone to manage the state in variables of the `Handler`. For that purpose a [`StatefulHandler`](/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html "akka.projection.javadsl.StatefulHandler")[`StatefulHandler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/StatefulHandler.html "akka.projection.scaladsl.StatefulHandler") is provided.

Let us look at how a `StatefulHandler` can be implemented in the context of a “word count” domain. The purpose is to process a stream of words and for each word keep track of how many times it has occurred. 

Given an envelope and `SourceProvider` for this example:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L28-L32 "Go to snippet source")type Word = String
type Count = Int

final case class WordEnvelope(offset: Long, word: Word)

class WordSource(implicit ec: ExecutionContext) extends SourceProvider[Long, WordEnvelope] {

  private val src = Source(
    List(WordEnvelope(1L, "abc"), WordEnvelope(2L, "def"), WordEnvelope(3L, "ghi"), WordEnvelope(4L, "abc")))

  override def source(offset: () => Future[Option[Long]]): Future[Source[WordEnvelope, NotUsed]] = {
    offset().map {
      case Some(o) => src.dropWhile(_.offset <= o)
      case _       => src
    }
  }

  override def extractOffset(env: WordEnvelope): Long = env.offset

  override def extractCreationTime(env: WordEnvelope): Long = 0L
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L54-L63 "Go to snippet source")public class WordEnvelope {
  public final Long offset;
  public final String word;

  public WordEnvelope(Long offset, String word) {
    this.offset = offset;
    this.word = word;
  }
}

class WordSource extends SourceProvider<Long, WordEnvelope> {

  private final Source<WordEnvelope, NotUsed> src =
      Source.from(
          Arrays.asList(
              new WordEnvelope(1L, "abc"),
              new WordEnvelope(2L, "def"),
              new WordEnvelope(3L, "ghi"),
              new WordEnvelope(4L, "abc")));

  @Override
  public CompletionStage<Source<WordEnvelope, NotUsed>> source(
      Supplier<CompletionStage<Optional<Long>>> offset) {
    return offset
        .get()
        .thenApply(
            o -> {
              if (o.isPresent()) return src.dropWhile(envelope -> envelope.offset <= o.get());
              else return src;
            });
  }

  @Override
  public Long extractOffset(WordEnvelope envelope) {
    return envelope.offset;
  }

  @Override
  public long extractCreationTime(WordEnvelope envelope) {
    return 0L;
  }
}
```

and a repository for the interaction with the database:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L36-L40 "Go to snippet source")trait WordCountRepository {
  def load(id: String, word: Word): Future[Count]
  def loadAll(id: String): Future[Map[Word, Count]]
  def save(id: String, word: Word, count: Count): Future[Done]
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L67-L73 "Go to snippet source")public interface WordCountRepository {
  CompletionStage<Integer> load(String id, String word);

  CompletionStage<Map<String, Integer>> loadAll(String id);

  CompletionStage<Done> save(String id, String word, int count);
}
```

The `Projection` can be definined as:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExampleSpec.scala#L78-L83 "Go to snippet source")val projection =
  CassandraProjection
    .atLeastOnce[Long, WordEnvelope](
      projectionId,
      sourceProvider = new WordSource,
      handler = () => new WordCountHandler(projectionId, repository))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExampleTest.java#L99-L101 "Go to snippet source")Projection<WordEnvelope> projection =
    CassandraProjection.atLeastOnce(
        projectionId, new WordSource(), () -> new WordCountHandler(projectionId, repository));
```

The `handler` can be implemented as follows.

A naive approach would be to have one row per word for storing the current count in the database. The handler could be implemented as a completely stateless handler that for each processed envelope loads the current count from the database, increment the count by 1 and saved it again. Typically there will be several instances of the `Projection` with different `ProjectionId.id`. Each `Projection` instance would be responsible for processing a subset of all words. This stateless approach wouldn’t be very efficient and you would have to use optimistic database locking to make sure that one `Projection` instance is not overwriting the stored value from another instance without reading the right value first.

Better would be that each `Projection` instance is a single\-writer so that it can keep the current word count in memory and only load it on startup or on demand.

A handler that is loading the state from the database when it’s starting up:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L122-L138 "Go to snippet source")import akka.projection.scaladsl.StatefulHandler

class WordCountHandler(projectionId: ProjectionId, repository: WordCountRepository)(implicit ec: ExecutionContext)
    extends StatefulHandler[Map[Word, Count], WordEnvelope] {

  override def initialState(): Future[Map[Word, Count]] = repository.loadAll(projectionId.id)

  override def process(state: Map[Word, Count], envelope: WordEnvelope): Future[Map[Word, Count]] = {
    val word = envelope.word
    val newCount = state.getOrElse(word, 0) + 1
    val newState = for {
      _ <- repository.save(projectionId.id, word, newCount)
    } yield state.updated(word, newCount)

    newState
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L8-L15 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.AskPattern;
import akka.actor.typed.javadsl.StashBuffer;
import akka.projection.cassandra.CassandraProjectionTest;
import akka.projection.javadsl.ActorHandler;
import akka.projection.javadsl.StatefulHandler;

public class WordCountHandler extends StatefulHandler<Map<String, Integer>, WordEnvelope> {
  private final ProjectionId projectionId;
  private final WordCountRepository repository;

  public WordCountHandler(ProjectionId projectionId, WordCountRepository repository) {
    this.projectionId = projectionId;
    this.repository = repository;
  }

  @Override
  public CompletionStage<Map<String, Integer>> initialState() {
    return repository.loadAll(projectionId.id());
  }

  @Override
  public CompletionStage<Map<String, Integer>> process(
      Map<String, Integer> state, WordEnvelope envelope) {
    String word = envelope.word;
    int newCount = state.getOrDefault(word, 0) + 1;
    CompletionStage<Map<String, Integer>> newState =
        repository
            .save(projectionId.id(), word, newCount)
            .thenApply(
                done -> {
                  state.put(word, newCount);
                  return state;
                });

    return newState;
  }
}
```

The `StatefulHandler` has two methods that needs to be implemented. 

- `initialState` \- Invoked to load the initial state when the projection is started or if previous `process` failed.
- `process(state, envelope)` \- Invoked for each `Envelope`, one at a time. The `state` parameter is the completed value of the previously returned `Future[State]``CompletionStage<State>` or the `initialState`.

If the previously returned `Future[State]``CompletionStage<State>` failed it will call `initialState` again and use that value.

Another implementation would be a handler that is loading the current count for a word on demand, and thereafter caches it in the in\-memory state:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/cassandra/WordCountDocExample.scala#L145-L173 "Go to snippet source")import akka.projection.scaladsl.StatefulHandler

class WordCountHandler(projectionId: ProjectionId, repository: WordCountRepository)(implicit ec: ExecutionContext)
    extends StatefulHandler[Map[Word, Count], WordEnvelope] {

  override def initialState(): Future[Map[Word, Count]] =
    Future.successful(Map.empty)

  override def process(state: Map[Word, Count], envelope: WordEnvelope): Future[Map[Word, Count]] = {
    val word = envelope.word

    val currentCount =
      state.get(word) match {
        case None =>
          repository.load(projectionId.id, word)
        case Some(count) =>
          Future.successful(count)
      }

    val newState = for {
      c <- currentCount
      newCount = c + 1
      _ <- repository.save(projectionId.id, word, newCount)
    } yield state.updated(word, newCount)

    newState
  }

}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/cassandra/WordCountDocExample.java#L8-L15 "Go to snippet source")import akka.actor.typed.ActorSystem;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.AskPattern;
import akka.actor.typed.javadsl.StashBuffer;
import akka.projection.cassandra.CassandraProjectionTest;
import akka.projection.javadsl.ActorHandler;
import akka.projection.javadsl.StatefulHandler;

public class WordCountHandler extends StatefulHandler<Map<String, Integer>, WordEnvelope> {
  private final ProjectionId projectionId;
  private final WordCountRepository repository;

  public WordCountHandler(ProjectionId projectionId, WordCountRepository repository) {
    this.projectionId = projectionId;
    this.repository = repository;
  }

  @Override
  public CompletionStage<Map<String, Integer>> initialState() {
    return CompletableFuture.completedFuture(new HashMap<>());
  }

  @Override
  public CompletionStage<Map<String, Integer>> process(
      Map<String, Integer> state, WordEnvelope envelope) {
    String word = envelope.word;

    CompletionStage<Integer> currentCount;
    if (state.containsKey(word))
      currentCount = CompletableFuture.completedFuture(state.get(word));
    else currentCount = repository.load(projectionId.id(), word);

    CompletionStage<Map<String, Integer>> newState =
        currentCount.thenCompose(
            n -> {
              return repository
                  .save(projectionId.id(), word, n + 1)
                  .thenApply(
                      done -> {
                        state.put(word, n + 1);
                        return state;
                      });
            });

    return newState;
  }
}
```

### Actor handler

A good alternative for advanced state management is to implement the handler as an [actor](https://doc.akka.io/libraries/akka-core/current/typed/actors.html), which is described in [Processing with Actor](actor.html).

### Flow handler

An Akka Streams `FlowWithContext` can be used instead of a handler for processing the envelopes, which is described in [Processing with Akka Streams](flow.html).

### Handler lifecycle

You can override the `start` and `stop` methods of the [`Handler`](/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html "akka.projection.javadsl.Handler")[`Handler`](/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html "akka.projection.scaladsl.Handler") to implement initialization before first envelope is processed and resource cleanup when the projection is stopped. Those methods are also called when the `Projection` is restarted after failure.

See also [error handling](error.html).

## Schema

The database schema for the offset storage table.

Note
The `partition` field is used to distribute projection rows across cassandra nodes while also allowing us to query all rows for a projection name. For most offset types we return only one row that matches the provided projection key, but the [`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset") requires all rows.

```
CREATE TABLE IF NOT EXISTS akka_projection.offset_store (
  projection_name text,
  partition int,
  projection_key text,
  offset text,
  manifest text,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));

CREATE TABLE IF NOT EXISTS akka_projection.projection_management (
  projection_name text,
  partition int,
  projection_key text,
  paused boolean,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));

```

## Offset types

The supported offset types of the `CassandraProjection` are:

- `akka.persistence.query.Offset` types from [events from Akka Persistence](eventsourced.html)
- `String`
- `Int`Integer
- `Long`
- Any other type that has a configured Akka Serializer is stored with base64 encoding of the serialized bytes.

Note
The [`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset") that is used for [messages from Kafka](kafka.html) is not implemented for the `CassandraProjection` yet, see [issue \#97](https://github.com/akka/akka-projection/issues/97).

The schema can be created using the method `CassandraProjection.createTablesIfNotExists`. This is particularly useful when writting tests. For production enviornments, we recommend creating the schema before deploying the application.

## Configuration

Make your edits/overrides in your application.conf.

The reference configuration file with the default values:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-cassandra/src/main/resources/reference.conf#L5-L39 "Go to snippet source")akka.projection.cassandra {

  session-config-path = "akka.projection.cassandra.session-config"

  session-config {
    # The implementation of `akka.stream.alpakka.cassandra.CqlSessionProvider`
    # used for creating the `CqlSession`.
    # It may optionally have a constructor with an `ClassicActorSystemProvider` and `Config` parameters.
    session-provider = "akka.stream.alpakka.cassandra.DefaultSessionProvider"

    # Configure Akka Discovery by setting a service name
    service-discovery {
      name = ""
      lookup-timeout = 1 s
    }

    # The ExecutionContext to use for the session tasks and future composition.
    session-dispatcher = "akka.actor.default-dispatcher"

    # Full config path to the Datastax Java driver's configuration section.
    # When connecting to more than one Cassandra cluster different session configuration can be
    # defined with this property.
    # and https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/reference/
    datastax-java-driver-config = "datastax-java-driver"
  }

  offset-store {
    keyspace = "akka_projection"
    # the database table name for the offset store
    table = "offset_store"
    # the database table name for the projection manangement data
    management-table = "projection_management"
  }
}
```

### Cassandra driver configuration

All Cassandra driver settings are via its [standard profile mechanism](https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/).

One important setting is to configure the database driver to retry the initial connection:

`datastax-java-driver.advanced.reconnect-on-init = true`

It is not enabled automatically as it is in the driver’s reference.conf and is not overridable in a profile.

It is possible to share the same Cassandra session as [Akka Persistence Cassandra](https://doc.akka.io/libraries/akka-persistence-cassandra/current/) by setting the `session-config-path`:

```
akka.projection.cassandra {
  session-config-path = "akka.persistence.cassandra"
}

```

or share the same Cassandra session as [Alpakka Cassandra](https://doc.akka.io/libraries/alpakka/10.0/cassandra.html):

```
akka.projection.cassandra {
  session-config-path = "alpakka.cassandra"
}

```

### Cassandra driver overrides

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-cassandra/src/main/resources/reference.conf#L43-L61 "Go to snippet source")# See reference configuration at
# https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/reference/
# (check which exact version Akka Projections uses)
datastax-java-driver {

  # always set this to allow reconnection on startup if cassandra is down
  # not overridiable profile so this plugin can't override it for you
  # advanced.reconnect-on-init = true

  profiles {
    akka-projection-cassandra-profile {
      basic.request {
        consistency = QUORUM
        # the offset store does not use any counters or collections
        default-idempotence = true
      }
    }
  }
}
```

### Contact points configuration

The Cassandra server contact points can be defined with the [Cassandra driver configuration](https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/)

```
datastax-java-driver {
  basic.contact-points = ["127.0.0.1:9042"]
  basic.load-balancing-policy.local-datacenter = "datacenter1"
}

```

Alternatively, Akka Discovery can be used for finding the Cassandra server contact points as described in the [Alpakka Cassandra documentation](https://doc.akka.io/libraries/alpakka/10.0/cassandra.html#using-akka-discovery).

Without any configuration it will use `localhost:9042` as default.

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
libraryDependencies += "com.lightbend.akka" %% "akka-projection-cassandra" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-cassandra_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-cassandra_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: at-least-once

```scala
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

val projection =
  CassandraProjection
    .atLeastOnce(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new ShoppingCartHandler)
    .withSaveOffset(afterEnvelopes = 100, afterDuration = 500.millis)
```

### Example 8: at-least-once

```java
import akka.projection.cassandra.javadsl.CassandraProjection;
import akka.projection.Projection;
import akka.projection.ProjectionId;

int saveOffsetAfterEnvelopes = 100;
Duration saveOffsetAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atLeastOnce(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            () -> new ShoppingCartHandler())
        .withSaveOffset(saveOffsetAfterEnvelopes, saveOffsetAfterDuration);
```

### Example 9: at-most-once

```scala
import akka.projection.ProjectionId
import akka.projection.cassandra.scaladsl.CassandraProjection

val projection =
  CassandraProjection.atMostOnce(
    projectionId = ProjectionId("shopping-carts", "carts-1"),
    sourceProvider,
    handler = () => new ShoppingCartHandler)
```

### Example 10: at-most-once

```java
Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.atMostOnce(
        ProjectionId.of("shopping-carts", "carts-1"), sourceProvider, ShoppingCartHandler::new);
```

### Example 11: groupedWithin

```scala
val projection =
  CassandraProjection
    .groupedWithin(
      projectionId = ProjectionId("shopping-carts", "carts-1"),
      sourceProvider,
      handler = () => new GroupedShoppingCartHandler)
    .withGroup(groupAfterEnvelopes = 20, groupAfterDuration = 500.millis)
```

### Example 12: groupedWithin

```java
int groupAfterEnvelopes = 20;
Duration groupAfterDuration = Duration.ofMillis(500);

Projection<EventEnvelope<ShoppingCart.Event>> projection =
    CassandraProjection.groupedWithin(
            ProjectionId.of("shopping-carts", "carts-1"),
            sourceProvider,
            GroupedShoppingCartHandler::new)
        .withGroup(groupAfterEnvelopes, groupAfterDuration);
```

### Example 13: Handler

```scala
import scala.concurrent.duration._
import scala.concurrent.Future

import akka.Done
import akka.projection.scaladsl.Handler
import org.slf4j.LoggerFactory

class ShoppingCartHandler extends Handler[EventEnvelope[ShoppingCart.Event]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: EventEnvelope[ShoppingCart.Event]): Future[Done] = {
    envelope.event match {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info("Shopping cart {} was checked out at {}", cartId, time)
        Future.successful(Done)

      case otherEvent =>
        logger.debug("Shopping cart {} changed by {}", otherEvent.cartId, otherEvent)
        Future.successful(Done)
    }
  }
}
```

### Example 14: Handler

```java
import akka.projection.javadsl.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class ShoppingCartHandler extends Handler<EventEnvelope<ShoppingCart.Event>> {
  private Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(EventEnvelope<ShoppingCart.Event> envelope) {
    ShoppingCart.Event event = envelope.event();
    if (event instanceof ShoppingCart.CheckedOut) {
      ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
      logger.info(
          "Shopping cart {} was checked out at {}", checkedOut.cartId, checkedOut.eventTime);
      return CompletableFuture.completedFuture(Done.getInstance());
    } else {
      logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
      return CompletableFuture.completedFuture(Done.getInstance());
    }
  }
}
```

### Example 15: Grouped handler

```scala
import scala.collection.immutable

class GroupedShoppingCartHandler extends Handler[immutable.Seq[EventEnvelope[ShoppingCart.Event]]] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelopes: immutable.Seq[EventEnvelope[ShoppingCart.Event]]): Future[Done] = {
    envelopes.map(_.event).foreach {
      case ShoppingCart.CheckedOut(cartId, time) =>
        logger.info("Shopping cart {} was checked out at {}", cartId, time)

      case otherEvent =>
        logger.debug("Shopping cart {} changed by {}", otherEvent.cartId, otherEvent)
    }
    Future.successful(Done)
  }
}
```

### Example 16: Grouped handler

```java
public class GroupedShoppingCartHandler extends Handler<List<EventEnvelope<ShoppingCart.Event>>> {
  private Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public CompletionStage<Done> process(List<EventEnvelope<ShoppingCart.Event>> envelopes) {
    envelopes.forEach(
        env -> {
          ShoppingCart.Event event = env.event();
          if (event instanceof ShoppingCart.CheckedOut) {
            ShoppingCart.CheckedOut checkedOut = (ShoppingCart.CheckedOut) event;
            logger.info(
                "Shopping cart {} was checked out at {}",
                checkedOut.cartId,
                checkedOut.eventTime);
          } else {
            logger.debug("Shopping cart {} changed by {}", event.getCartId(), event);
          }
        });
    return CompletableFuture.completedFuture(Done.getInstance());
  }
}
```

### Example 17: Stateful handler

```scala
class WordCountHandler extends Handler[WordEnvelope] {
  private val logger = LoggerFactory.getLogger(getClass)
  private var state: Map[Word, Count] = Map.empty

  override def process(envelope: WordEnvelope): Future[Done] = {
    val word = envelope.word
    val newCount = state.getOrElse(word, 0) + 1
    logger.info("Word count for {} is {}", word, newCount)
    state = state.updated(word, newCount)
    Future.successful(Done)
  }
}
```

### Example 18: Stateful handler

```java
public class WordCountHandler extends Handler<WordEnvelope> {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final Map<String, Integer> state = new HashMap<>();

  @Override
  public CompletionStage<Done> process(WordEnvelope envelope) {
    String word = envelope.word;
    int newCount = state.getOrDefault(word, 0) + 1;
    logger.info("Word count for {} is {}", word, newCount);
    state.put(word, newCount);
    return CompletableFuture.completedFuture(Done.getInstance());
  }
}
```

### Example 19: Stateful handler

```scala
type Word = String
type Count = Int

final case class WordEnvelope(offset: Long, word: Word)

class WordSource(implicit ec: ExecutionContext) extends SourceProvider[Long, WordEnvelope] {

  private val src = Source(
    List(WordEnvelope(1L, "abc"), WordEnvelope(2L, "def"), WordEnvelope(3L, "ghi"), WordEnvelope(4L, "abc")))

  override def source(offset: () => Future[Option[Long]]): Future[Source[WordEnvelope, NotUsed]] = {
    offset().map {
      case Some(o) => src.dropWhile(_.offset <= o)
      case _       => src
    }
  }

  override def extractOffset(env: WordEnvelope): Long = env.offset

  override def extractCreationTime(env: WordEnvelope): Long = 0L
}
```

### Example 20: Stateful handler

```java
public class WordEnvelope {
  public final Long offset;
  public final String word;

  public WordEnvelope(Long offset, String word) {
    this.offset = offset;
    this.word = word;
  }
}

class WordSource extends SourceProvider<Long, WordEnvelope> {

  private final Source<WordEnvelope, NotUsed> src =
      Source.from(
          Arrays.asList(
              new WordEnvelope(1L, "abc"),
              new WordEnvelope(2L, "def"),
              new WordEnvelope(3L, "ghi"),
              new WordEnvelope(4L, "abc")));

  @Override
  public CompletionStage<Source<WordEnvelope, NotUsed>> source(
      Supplier<CompletionStage<Optional<Long>>> offset) {
    return offset
        .get()
        .thenApply(
            o -> {
              if (o.isPresent()) return src.dropWhile(envelope -> envelope.offset <= o.get());
              else return src;
            });
  }

  @Override
  public Long extractOffset(WordEnvelope envelope) {
    return envelope.offset;
  }

  @Override
  public long extractCreationTime(WordEnvelope envelope) {
    return 0L;
  }
}
```

### Example 21: Stateful handler

```scala
trait WordCountRepository {
  def load(id: String, word: Word): Future[Count]
  def loadAll(id: String): Future[Map[Word, Count]]
  def save(id: String, word: Word, count: Count): Future[Done]
}
```

### Example 22: Stateful handler

```java
public interface WordCountRepository {
  CompletionStage<Integer> load(String id, String word);

  CompletionStage<Map<String, Integer>> loadAll(String id);

  CompletionStage<Done> save(String id, String word, int count);
}
```

### Example 23: Stateful handler

```scala
val projection =
  CassandraProjection
    .atLeastOnce[Long, WordEnvelope](
      projectionId,
      sourceProvider = new WordSource,
      handler = () => new WordCountHandler(projectionId, repository))
```

### Example 24: Stateful handler

```java
Projection<WordEnvelope> projection =
    CassandraProjection.atLeastOnce(
        projectionId, new WordSource(), () -> new WordCountHandler(projectionId, repository));
```

### Example 25: Stateful handler

```scala
import akka.projection.scaladsl.StatefulHandler

class WordCountHandler(projectionId: ProjectionId, repository: WordCountRepository)(implicit ec: ExecutionContext)
    extends StatefulHandler[Map[Word, Count], WordEnvelope] {

  override def initialState(): Future[Map[Word, Count]] = repository.loadAll(projectionId.id)

  override def process(state: Map[Word, Count], envelope: WordEnvelope): Future[Map[Word, Count]] = {
    val word = envelope.word
    val newCount = state.getOrElse(word, 0) + 1
    val newState = for {
      _ <- repository.save(projectionId.id, word, newCount)
    } yield state.updated(word, newCount)

    newState
  }
}
```

### Example 26: Stateful handler

```java
import akka.actor.typed.ActorSystem;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.AskPattern;
import akka.actor.typed.javadsl.StashBuffer;
import akka.projection.cassandra.CassandraProjectionTest;
import akka.projection.javadsl.ActorHandler;
import akka.projection.javadsl.StatefulHandler;

public class WordCountHandler extends StatefulHandler<Map<String, Integer>, WordEnvelope> {
  private final ProjectionId projectionId;
  private final WordCountRepository repository;

  public WordCountHandler(ProjectionId projectionId, WordCountRepository repository) {
    this.projectionId = projectionId;
    this.repository = repository;
  }

  @Override
  public CompletionStage<Map<String, Integer>> initialState() {
    return repository.loadAll(projectionId.id());
  }

  @Override
  public CompletionStage<Map<String, Integer>> process(
      Map<String, Integer> state, WordEnvelope envelope) {
    String word = envelope.word;
    int newCount = state.getOrDefault(word, 0) + 1;
    CompletionStage<Map<String, Integer>> newState =
        repository
            .save(projectionId.id(), word, newCount)
            .thenApply(
                done -> {
                  state.put(word, newCount);
                  return state;
                });

    return newState;
  }
}
```

### Example 27: Stateful handler

```scala
import akka.projection.scaladsl.StatefulHandler

class WordCountHandler(projectionId: ProjectionId, repository: WordCountRepository)(implicit ec: ExecutionContext)
    extends StatefulHandler[Map[Word, Count], WordEnvelope] {

  override def initialState(): Future[Map[Word, Count]] =
    Future.successful(Map.empty)

  override def process(state: Map[Word, Count], envelope: WordEnvelope): Future[Map[Word, Count]] = {
    val word = envelope.word

    val currentCount =
      state.get(word) match {
        case None =>
          repository.load(projectionId.id, word)
        case Some(count) =>
          Future.successful(count)
      }

    val newState = for {
      c <- currentCount
      newCount = c + 1
      _ <- repository.save(projectionId.id, word, newCount)
    } yield state.updated(word, newCount)

    newState
  }

}
```

### Example 28: Stateful handler

```java
import akka.actor.typed.ActorSystem;
import akka.actor.typed.SupervisorStrategy;
import akka.actor.typed.javadsl.AskPattern;
import akka.actor.typed.javadsl.StashBuffer;
import akka.projection.cassandra.CassandraProjectionTest;
import akka.projection.javadsl.ActorHandler;
import akka.projection.javadsl.StatefulHandler;

public class WordCountHandler extends StatefulHandler<Map<String, Integer>, WordEnvelope> {
  private final ProjectionId projectionId;
  private final WordCountRepository repository;

  public WordCountHandler(ProjectionId projectionId, WordCountRepository repository) {
    this.projectionId = projectionId;
    this.repository = repository;
  }

  @Override
  public CompletionStage<Map<String, Integer>> initialState() {
    return CompletableFuture.completedFuture(new HashMap<>());
  }

  @Override
  public CompletionStage<Map<String, Integer>> process(
      Map<String, Integer> state, WordEnvelope envelope) {
    String word = envelope.word;

    CompletionStage<Integer> currentCount;
    if (state.containsKey(word))
      currentCount = CompletableFuture.completedFuture(state.get(word));
    else currentCount = repository.load(projectionId.id(), word);

    CompletionStage<Map<String, Integer>> newState =
        currentCount.thenCompose(
            n -> {
              return repository
                  .save(projectionId.id(), word, n + 1)
                  .thenApply(
                      done -> {
                        state.put(word, n + 1);
                        return state;
                      });
            });

    return newState;
  }
}
```

### Example 29: Schema

```text
CREATE TABLE IF NOT EXISTS akka_projection.offset_store (
  projection_name text,
  partition int,
  projection_key text,
  offset text,
  manifest text,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));

CREATE TABLE IF NOT EXISTS akka_projection.projection_management (
  projection_name text,
  partition int,
  projection_key text,
  paused boolean,
  last_updated timestamp,
  PRIMARY KEY ((projection_name, partition), projection_key));
```

### Example 30: Configuration

```conf
akka.projection.cassandra {

  session-config-path = "akka.projection.cassandra.session-config"

  session-config {
    # The implementation of `akka.stream.alpakka.cassandra.CqlSessionProvider`
    # used for creating the `CqlSession`.
    # It may optionally have a constructor with an `ClassicActorSystemProvider` and `Config` parameters.
    session-provider = "akka.stream.alpakka.cassandra.DefaultSessionProvider"

    # Configure Akka Discovery by setting a service name
    service-discovery {
      name = ""
      lookup-timeout = 1 s
    }

    # The ExecutionContext to use for the session tasks and future composition.
    session-dispatcher = "akka.actor.default-dispatcher"

    # Full config path to the Datastax Java driver's configuration section.
    # When connecting to more than one Cassandra cluster different session configuration can be
    # defined with this property.
    # and https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/reference/
    datastax-java-driver-config = "datastax-java-driver"
  }

  offset-store {
    keyspace = "akka_projection"
    # the database table name for the offset store
    table = "offset_store"
    # the database table name for the projection manangement data
    management-table = "projection_management"
  }
}
```

### Example 31: Cassandra driver configuration

```text
akka.projection.cassandra {
  session-config-path = "akka.persistence.cassandra"
}
```

### Example 32: Cassandra driver configuration

```text
akka.projection.cassandra {
  session-config-path = "alpakka.cassandra"
}
```

### Example 33: Cassandra driver overrides

```conf
# See reference configuration at
# https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/reference/
# (check which exact version Akka Projections uses)
datastax-java-driver {

  # always set this to allow reconnection on startup if cassandra is down
  # not overridiable profile so this plugin can't override it for you
  # advanced.reconnect-on-init = true

  profiles {
    akka-projection-cassandra-profile {
      basic.request {
        consistency = QUORUM
        # the offset store does not use any counters or collections
        default-idempotence = true
      }
    }
  }
}
```

### Example 34: Contact points configuration

```text
datastax-java-driver {
  basic.contact-points = ["127.0.0.1:9042"]
  basic.load-balancing-policy.local-datacenter = "datacenter1"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/javadsl/CassandraProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/cassandra/scaladsl/CassandraProjection$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/StatefulHandler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/Handler.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/StatefulHandler.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/current/typed/actors.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/
- https://doc.akka.io/libraries/akka-projection/current/actor.html
- https://doc.akka.io/libraries/akka-projection/current/cassandra.html
- https://doc.akka.io/libraries/akka-projection/current/error.html
- https://doc.akka.io/libraries/akka-projection/current/eventsourced.html
- https://doc.akka.io/libraries/akka-projection/current/flow.html
- https://doc.akka.io/libraries/akka-projection/current/jdbc.html
- https://doc.akka.io/libraries/akka-projection/current/kafka.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html
- https://doc.akka.io/libraries/alpakka/10.0/cassandra.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/cassandra.html](https://doc.akka.io/libraries/akka-projection/current/cassandra.html)*