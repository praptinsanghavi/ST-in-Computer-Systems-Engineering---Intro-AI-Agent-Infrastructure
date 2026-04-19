---
description: A Cassandra plugin for Akka Persistence.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:19:14Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-persistence-cassandra/current/overview.html
title: Overview • Akka Persistence Cassandra
---

# Overview • Akka Persistence Cassandra

> **Summary:** A Cassandra plugin for Akka Persistence.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

The Akka Persistence Cassandra plugin allows for using [Apache Cassandra](https://cassandra.apache.org) as a backend for [Akka Persistence](https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html) and [Akka Persistence Query](https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html). It uses [Alpakka Cassandra](https://doc.akka.io/docs/alpakka/10.0/cassandra.html) for Cassandra access which is based on the [Datastax Java Driver](https://docs.datastax.com/en/developer/java-driver/4.14/).

## Project Info

| Project Info: Akka Persistence Cassandra | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-persistence\-cassandra 1\.3\.4 [Akka library snapshot repository](https://repo.akka.io/snapshots) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.persistence.cassandra |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-persistence-cassandra/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-04\-30 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-persistence-cassandra/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-persistence-cassandra/issues) |
| Sources | [https://github.com/akka/akka\-persistence\-cassandra](https://github.com/akka/akka-persistence-cassandra) |

## Dependencies

This plugin requires **Akka 2\.10\.11** or later. See [Akka’s Binary Compatibility Rules](https://doc.akka.io/libraries/akka-core/current/common/binary-compatibility-rules.html) for details.

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

Additionally, add the dependencies as below.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.3.4",
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
)
```
Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-cassandra_${scala.binary.version}</artifactId>
    <version>1.3.4</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-persistence-cassandra_${versions.ScalaBinary}:1.3.4"
  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

Note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

The table below shows Akka Persistence Cassandra’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.lightbend.akka | akka\-stream\-alpakka\-cassandra\_2\.13 | [10\.0\.0](https://mvnrepository.com/artifact/com.lightbend.akka/akka-stream-alpakka-cassandra_2.13/10.0.0) |
| com.typesafe.akka | akka\-cluster\-tools\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-cluster-tools_2.13/2.10.11) |
| com.typesafe.akka | akka\-persistence\-query\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.11) |
| com.typesafe.akka | akka\-persistence\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.11) |
| org.apache.cassandra | java\-driver\-core | [4\.19\.1](https://mvnrepository.com/artifact/org.apache.cassandra/java-driver-core/4.19.1) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.lightbend.akka    akka-stream-alpakka-cassandra_2.13    [10.0.0](https://mvnrepository.com/artifact/com.lightbend.akka/akka-stream-alpakka-cassandra_2.13/10.0.0)    BUSL-1.1
    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
        com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
    com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
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
com.typesafe.akka    akka-cluster-tools_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-cluster-tools_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-cluster_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-cluster_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-coordination_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-coordination_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-remote_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-remote_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-pki_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-pki_2.13/2.10.11)    BUSL-1.1
                com.hierynomus    asn-one    [0.6.0](https://mvnrepository.com/artifact/com.hierynomus/asn-one/0.6.0)    The Apache License, Version 2.0
                com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
            com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
                com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                    com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
                com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
                org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            org.agrona    agrona    [1.22.0](https://mvnrepository.com/artifact/org.agrona/agrona/1.22.0)    The Apache License, Version 2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-coordination_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-coordination_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-persistence-query_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence-query_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-persistence_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
            com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
                com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
                org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
            com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
            org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
com.typesafe.akka    akka-persistence_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
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
```

To use the plugin with **Akka 2\.5\.x** you must use version 0\.103 or later in the 0\.x series. 

## Supported features

Be aware of that many of the new features of [Akka Distributed Cluster](https://doc.akka.io/libraries/akka-distributed-cluster/current/) and [Akka Edge](https://doc.akka.io/libraries/akka-edge/current/) are only implemented by the [Akka Persistence R2DBC plugin](https://doc.akka.io/libraries/akka-persistence-r2dbc/current/) and are not supported by the Cassandra plugin.

Those features were developed for Distributed Cluster and Edge, but they are also useful in other contexts. Example of concrete features not supported by the Cassandra plugin: 

- `eventsBySlices` query
- Projections over gRPC
- Replicated Event Sourcing over gRPC
- Dynamic scaling of number of Projection instances
- Low latency Projections
- Projections starting from snapshots
- Scalability of many Projections
- Durable State entities

## History

This [Apache Cassandra](https://cassandra.apache.org/) plugin to Akka Persistence was initiated [originally](https://github.com/krasserm/akka-persistence-cassandra) by Martin Krasser, [@krasserm](https://github.com/krasserm) in 2014\.

It moved to the [Akka](https://github.com/akka/) organisation in 2016 and the first release after that move was 0\.7 in January 2016\.

## Contributing

Please feel free to contribute to Akka and Akka Persistence Cassandra by reporting issues you identify, or by suggesting changes to the code. Please refer to our [contributing instructions](https://github.com/akka/akka/blob/main/CONTRIBUTING.md) to learn how it can be done.

We want Akka to strive in a welcoming and open atmosphere and expect all contributors to respect our [code of conduct](https://www.lightbend.com/conduct).

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
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.3.4",
  "com.typesafe.akka" %% "akka-persistence" % AkkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % AkkaVersion
)
```

### Example 5: Dependencies

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-cassandra_${scala.binary.version}</artifactId>
    <version>1.3.4</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-persistence-query_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-cluster-tools_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 6: Dependencies

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-persistence-cassandra_${versions.ScalaBinary}:1.3.4"
  implementation "com.typesafe.akka:akka-persistence_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-persistence-query_${versions.ScalaBinary}:${versions.AkkaVersion}"
  implementation "com.typesafe.akka:akka-cluster-tools_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-persistence-cassandra/1.3.4/akka/persistence/cassandra/
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/docs/alpakka/10.0/cassandra.html
- https://doc.akka.io/libraries/akka-core/2.10/persistence-query.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/persistence.html
- https://doc.akka.io/libraries/akka-core/current/common/binary-compatibility-rules.html
- https://doc.akka.io/libraries/akka-distributed-cluster/current/
- https://doc.akka.io/libraries/akka-edge/current/
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/index.html
- https://doc.akka.io/libraries/akka-persistence-cassandra/current/journal.html
- https://doc.akka.io/libraries/akka-persistence-r2dbc/current/

---
*Source: [https://doc.akka.io/libraries/akka-persistence-cassandra/current/overview.html](https://doc.akka.io/libraries/akka-persistence-cassandra/current/overview.html)*