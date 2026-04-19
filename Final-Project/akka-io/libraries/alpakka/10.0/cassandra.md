---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:12Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka/current/cassandra.html
title: Apache Cassandra • Alpakka Documentation
---

# Apache Cassandra • Alpakka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Apache Cassandra

Cassandra
Apache Cassandra is a free and open\-source, distributed, wide column store, NoSQL database management system designed to handle large amounts of data across many commodity servers, providing high availability with no single point of failure. Cassandra offers robust support for clusters spanning multiple datacenters, with asynchronous masterless replication allowing low latency operations for all clients.

– [Wikipedia](https://en.wikipedia.org/wiki/Apache_Cassandra)

Alpakka Cassandra offers an [Akka Streams](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html) API on top of a [`CqlSession`](https://apache.github.io/cassandra-java-driver/4.19.1/api/?com/datastax/oss/driver/api/core/CqlSession.html "com.datastax.oss.driver.api.core.CqlSession") from the [Datastax Java Driver](https://apache.github.io/cassandra-java-driver/4.19.1/) version 4\.0\+. The [driver configuration](cassandra.html#custom-session-creation) is provided in the same config format as Akka uses and can be placed in the same `application.conf` as your Akka settings.

| Project Info: Alpakka Cassandra | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-stream\-alpakka\-cassandra 10\.0\.2 [Snapshots are available](other-docs/snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.cassandra |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka/v10.0.2/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 2\.0\.0, 2020\-04\-30 |
| Home page | <https://doc.akka.io/libraries/alpakka/current> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html) |
| Forums | [Akka Discuss](https://discuss.akka.io) |
| Release notes | [GitHub releases](https://github.com/akka/alpakka/releases) |
| Issues | [Github issues](https://github.com/akka/alpakka/labels/p%3Acassandra) |
| Sources | <https://github.com/akka/alpakka> |

## Artifacts

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-stream-alpakka-cassandra" % "10.0.2"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-cassandra_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
</dependencies>
```
Gradle
```
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-cassandra_${versions.ScalaBinary}:10.0.2"
}
```

The table below shows direct dependencies of this module and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.fasterxml.jackson.core | jackson\-core | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4) |
| com.fasterxml.jackson.core | jackson\-databind | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4) |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.apache.cassandra | java\-driver\-core | [4\.19\.1](https://mvnrepository.com/artifact/org.apache.cassandra/java-driver-core/4.19.1) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

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
        org.slf4j    slf4j-api    [1.7.30](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.30)    MIT License
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
    org.slf4j    slf4j-api    [1.7.30](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.30)    MIT License
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Sessions

Cassandra is accessed through [`CassandraSession`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html "akka.stream.alpakka.cassandra.javadsl.CassandraSession")[`CassandraSession`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html "akka.stream.alpakka.cassandra.scaladsl.CassandraSession")s which are managed by the [`CassandraSessionRegistry`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry$.html "akka.stream.alpakka.cassandra.javadsl.CassandraSessionRegistry")[`CassandraSessionRegistry`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html "akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry") Akka extension. This way a session is shared across all usages within the actor system and properly shut down after the actor system is shut down.

The `CassandraSession` is provided to the stream factory methods as an `implicit` parameter.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/scala/docs/scaladsl/CassandraSourceSpec.scala#L36-L52 "Go to snippet source")import akka.stream.alpakka.cassandra.CassandraSessionSettings
import akka.stream.alpakka.cassandra.scaladsl.CassandraSession
import akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

val system: ActorSystem = // ???
val sessionSettings = CassandraSessionSettings()
implicit val cassandraSession: CassandraSession =
  CassandraSessionRegistry.get(system).sessionFor(sessionSettings)

val version: Future[String] =
  cassandraSession
    .select("SELECT release_version FROM system.local;")
    .map(_.getString("release_version"))
    .runWith(Sink.head)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/java/docs/javadsl/CassandraSourceTest.java#L8-L96 "Go to snippet source")  
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import akka.stream.alpakka.cassandra.CassandraSessionSettings;
import akka.stream.alpakka.cassandra.javadsl.CassandraSession;
import akka.stream.alpakka.cassandra.javadsl.CassandraSessionRegistry;

ActorSystem system = // ???
CassandraSessionSettings sessionSettings = CassandraSessionSettings.create();
CassandraSession cassandraSession =
    CassandraSessionRegistry.get(system).sessionFor(sessionSettings);

CompletionStage<String> version =
    cassandraSession
        .select("SELECT release_version FROM system.local;")
        .map(row -> row.getString("release_version"))
        .runWith(Sink.head(), system);
```

See [custom session creation](cassandra.html#custom-session-creation) below for tweaking this.

## Reading from Cassandra

[`CassandraSource`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSource$.html "akka.stream.alpakka.cassandra.javadsl.CassandraSource")[`CassandraSource`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html "akka.stream.alpakka.cassandra.scaladsl.CassandraSource") provides factory methods to get Akka Streams Sources from CQL queries and from [`com.datastax.oss.driver.api.core.cql.Statement`](https://apache.github.io/cassandra-java-driver/4.19.1/api/?com/datastax/oss/driver/api/core/cql/Statement.html "com.datastax.oss.driver.api.core.cql.Statement")s.

Dynamic parameters can be provided to the CQL as variable arguments.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/scala/docs/scaladsl/CassandraSourceSpec.scala#L63-L76 "Go to snippet source")import akka.stream.alpakka.cassandra.scaladsl.CassandraSource

val ids: Future[immutable.Seq[Int]] =
  CassandraSource(s"SELECT id FROM $intTable").map(row => row.getInt("id")).runWith(Sink.seq)

val idsWhere: Future[Int] =
  CassandraSource(s"SELECT * FROM $intTable WHERE id = ?", value).map(_.getInt("id")).runWith(Sink.head)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/java/docs/javadsl/CassandraSourceTest.java#L16-L126 "Go to snippet source")import akka.stream.alpakka.cassandra.javadsl.CassandraSource;

CompletionStage<List<Integer>> select =
    CassandraSource.create(cassandraSession, "SELECT id FROM " + idtable + ";")
        .map(r -> r.getInt("id"))
        .runWith(Sink.seq(), system);

CompletionStage<Integer> select =
    CassandraSource.create(
            cassandraSession, "SELECT * FROM " + idtable + " WHERE id = ?;", value)
        .map(r -> r.getInt("id"))
        .runWith(Sink.head(), system);
```

If the statement requires specific settings, you may pass any [`com.datastax.oss.driver.api.core.cql.Statement`](https://apache.github.io/cassandra-java-driver/4.19.1/api/?com/datastax/oss/driver/api/core/cql/Statement.html "com.datastax.oss.driver.api.core.cql.Statement").

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/scala/docs/scaladsl/CassandraSourceSpec.scala#L83-L87 "Go to snippet source")import com.datastax.oss.driver.api.core.cql.{Row, SimpleStatement}

val stmt = SimpleStatement.newInstance(s"SELECT * FROM $intTable").setPageSize(20)

val rows: Future[immutable.Seq[Row]] = CassandraSource(stmt).runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/java/docs/javadsl/CassandraSourceTest.java#L22-L143 "Go to snippet source")import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.core.cql.Statement;

Statement<?> stmt =
    SimpleStatement.newInstance("SELECT * FROM " + idtable + ";").setPageSize(20);

CompletionStage<List<Integer>> select =
    CassandraSource.create(cassandraSession, stmt)
        .map(r -> r.getInt("id"))
        .runWith(Sink.seq(), system);
```

Here we used a basic sink to complete the stream by collecting all of the stream elements into a collection. The power of streams comes from building larger data pipelines which leverage backpressure to ensure efficient flow control. Feel free to edit the example code and build [more advanced stream topologies](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-introduction.html).

## Writing to Cassandra

[`CassandraFlow`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html "akka.stream.alpakka.cassandra.javadsl.CassandraFlow")[`CassandraFlow`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html "akka.stream.alpakka.cassandra.scaladsl.CassandraFlow") provides factory methods to get Akka Streams flows to run CQL statements that change data (`UPDATE`, `INSERT`). Alpakka Cassandra creates a [`PreparedStatement`](https://apache.github.io/cassandra-java-driver/4.19.1/api/?com/datastax/oss/driver/api/core/cql/PreparedStatement.html "com.datastax.oss.driver.api.core.cql.PreparedStatement") and for every stream element the `statementBinder` function binds the CQL placeholders to data.

The incoming elements are emitted unchanged for further processing.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/scala/docs/scaladsl/CassandraFlowSpec.scala#L66-L84 "Go to snippet source")import akka.stream.alpakka.cassandra.CassandraWriteSettings
import akka.stream.alpakka.cassandra.scaladsl.CassandraFlow
import com.datastax.oss.driver.api.core.cql.{BoundStatement, PreparedStatement}

case class Person(id: Int, name: String, city: String)

val persons =
  immutable.Seq(Person(12, "John", "London"), Person(43, "Umberto", "Roma"), Person(56, "James", "Chicago"))

val statementBinder: (Person, PreparedStatement) => BoundStatement =
  (person, preparedStatement) => preparedStatement.bind(Int.box(person.id), person.name, person.city)

val written: Future[immutable.Seq[Person]] = Source(persons)
  .via(
    CassandraFlow.create(CassandraWriteSettings.defaults,
                         s"INSERT INTO $table(id, name, city) VALUES (?, ?, ?)",
                         statementBinder)
  )
  .runWith(Sink.seq)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/java/docs/javadsl/CassandraFlowTest.java#L9-L125 "Go to snippet source")import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.japi.Function2;
import akka.japi.Pair;
import akka.stream.alpakka.cassandra.CassandraWriteSettings;
import akka.stream.alpakka.cassandra.javadsl.CassandraFlow;
import akka.stream.alpakka.testkit.javadsl.LogCapturingJunit4;
import akka.stream.javadsl.SourceWithContext;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;

List<Person> persons =
    Arrays.asList(
        new Person(12, "John", "London"),
        new Person(43, "Umberto", "Roma"),
        new Person(56, "James", "Chicago"));

Function2<Person, PreparedStatement, BoundStatement> statementBinder =
    (person, preparedStatement) -> preparedStatement.bind(person.id, person.name, person.city);

CompletionStage<List<Person>> written =
    Source.from(persons)
        .via(
            CassandraFlow.create(
                cassandraSession,
                CassandraWriteSettings.defaults(),
                "INSERT INTO " + table + "(id, name, city) VALUES (?, ?, ?)",
                statementBinder))
        .runWith(Sink.seq(), system);
```

### Update flows with context

Alpakka Cassandra flows offer **“With Context”**\-support which integrates nicely with some other Alpakka connectors.

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/scala/docs/scaladsl/CassandraFlowSpec.scala#L119-L136 "Go to snippet source")val personsAndHandles: SourceWithContext[Person, AckHandle, NotUsed] = // ???

val written: Future[Done] = personsAndHandles
  .via(
    CassandraFlow.withContext(
      CassandraWriteSettings.defaults,
      s"INSERT INTO $table(id, name, city) VALUES (?, ?, ?)",
      (person, preparedStatement) => preparedStatement.bind(Int.box(person.id), person.name, person.city)
    )
  )
  .asSource
  .mapAsync(1) {
    case (_, handle) => handle.ack()
  }
  .runWith(Sink.ignore)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/java/docs/javadsl/CassandraFlowTest.java#L158-L172 "Go to snippet source")SourceWithContext<Person, AckHandle, NotUsed> from = // ???;
CompletionStage<Done> written =
    from.via(
            CassandraFlow.withContext(
                cassandraSession,
                CassandraWriteSettings.defaults(),
                "INSERT INTO " + table + "(id, name, city) VALUES (?, ?, ?)",
                (person, preparedStatement) ->
                    preparedStatement.bind(person.id, person.name, person.city)))
        .asSource()
        .mapAsync(1, pair -> pair.second().ack())
        .runWith(Sink.ignore(), system);
```

## Custom Session creation

Session creation and configuration is controlled via settings in `application.conf`. The [`CassandraSessionSettings`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings.html "akka.stream.alpakka.cassandra.CassandraSessionSettings")[`CassandraSessionSettings`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings.html "akka.stream.alpakka.cassandra.CassandraSessionSettings") accept a full path to a configuration section which needs to specify a `session-provider` setting. The [`CassandraSessionRegistry`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry.html "akka.stream.alpakka.cassandra.javadsl.CassandraSessionRegistry")[`CassandraSessionRegistry`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html "akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry") expects a fully qualified class name to a class implementing [`CqlSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider.html "akka.stream.alpakka.cassandra.CqlSessionProvider")[`CqlSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider.html "akka.stream.alpakka.cassandra.CqlSessionProvider").

Alpakka Cassandra includes a default implementation [`DefaultSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html "akka.stream.alpakka.cassandra.DefaultSessionProvider")[`DefaultSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html "akka.stream.alpakka.cassandra.DefaultSessionProvider"), which is referenced in the default configuration `alpakka.cassandra`.

The [`DefaultSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html "akka.stream.alpakka.cassandra.DefaultSessionProvider")[`DefaultSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html "akka.stream.alpakka.cassandra.DefaultSessionProvider") config section must contain:

- a settings section `service-discovery` which may be used to discover Cassandra contact points via [Akka Discovery](cassandra.html#using-akka-discovery),
- and a reference to a Cassandra config section in `datastax-java-driver-config` which is used to configure the Cassandra client. For details see the [Datastax Java Driver configuration](https://apache.github.io/cassandra-java-driver/4.19.1/manual/core/configuration/#quick-overview) and the driver’s [`reference.conf`](https://apache.github.io/cassandra-java-driver/4.19.1/manual/core/configuration/reference/).

reference.conf
 

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/main/resources/reference.conf "Go to snippet source")alpakka.cassandra {
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
  # See https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/#quick-overview
  # and https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/reference/
  datastax-java-driver-config = "datastax-java-driver"
}
```

In simple cases your `datastax-java-driver` section will need to define `contact-points` and `load-balancing-policy.local-datacenter`. To make the Cassandra driver retry its initial connection attempts, add `advanced.reconnect-on-init = true`.

application.conf
 

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/resources/application.conf#L8-L14 "Go to snippet source")datastax-java-driver {
  basic {
    contact-points = [ "127.0.0.1:9042" ]
    load-balancing-policy.local-datacenter = datacenter1
  }
  advanced.reconnect-on-init = true
}
```

### Using Akka Discovery

To use [Akka Discovery](https://doc.akka.io/libraries/akka-core/2.10/discovery/) make sure the `akka-discovery` dependency is on you classpath.

sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
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
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
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
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

To enable [Akka Discovery](https://doc.akka.io/libraries/akka-core/2.10/discovery/) with the [`DefaultSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html "akka.stream.alpakka.cassandra.DefaultSessionProvider")[`DefaultSessionProvider`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html "akka.stream.alpakka.cassandra.DefaultSessionProvider"), set up the desired service name in the discovery mechanism of your choice and pass that name in `service-discovery.name`. The example below extends the `alpakka.cassandra` config section and only overwrites the service name.

application.conf
 

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/resources/application.conf#L18-L44 "Go to snippet source")akka {
  discovery.method = config
}
akka.discovery.config.services = {
  cassandra-service = {
    endpoints = [
      {
        host = "127.0.0.1"
        port = 9042
      }
    ]
  }
}

// inherit defaults from `alpakka.cassandra` settings
example-with-akka-discovery: ${alpakka.cassandra} {
  service-discovery.name = "cassandra-service"
}
```

Use the full config section path to create the [`CassandraSessionSettings`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings$.html "akka.stream.alpakka.cassandra.CassandraSessionSettings")[`CassandraSessionSettings`](/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings$.html "akka.stream.alpakka.cassandra.CassandraSessionSettings").

Scala

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/scala/docs/scaladsl/AkkaDiscoverySpec.scala#L62-L63 "Go to snippet source")val sessionSettings = CassandraSessionSettings("example-with-akka-discovery")
implicit val session: CassandraSession = CassandraSessionRegistry.get(system).sessionFor(sessionSettings)
```

Java

```
[source](https://github.com/akka/alpakka/tree/v10.0.2/cassandra/src/test/java/docs/javadsl/CassandraSourceTest.java#L151-L153 "Go to snippet source")CassandraSessionSettings sessionSettings =
    CassandraSessionSettings.create("example-with-akka-discovery");
CassandraSession session = CassandraSessionRegistry.get(system).sessionFor(sessionSettings);
```

## Code Examples

### Example 1: Artifacts

```scala
libraryDependencies += "com.lightbend.akka" %% "akka-stream-alpakka-cassandra" % "10.0.2"
```

### Example 2: Artifacts

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-stream-alpakka-cassandra_${scala.binary.version}</artifactId>
    <version>10.0.2</version>
  </dependency&gt
</dependencies>
```

### Example 3: Artifacts

```gradle
def versions = [
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.lightbend.akka:akka-stream-alpakka-cassandra_${versions.ScalaBinary}:10.0.2"
}
```

### Example 4: Sessions

```scala
import akka.stream.alpakka.cassandra.CassandraSessionSettings
import akka.stream.alpakka.cassandra.scaladsl.CassandraSession
import akka.stream.alpakka.cassandra.scaladsl.CassandraSessionRegistry

val system: ActorSystem = // ???
val sessionSettings = CassandraSessionSettings()
implicit val cassandraSession: CassandraSession =
  CassandraSessionRegistry.get(system).sessionFor(sessionSettings)

val version: Future[String] =
  cassandraSession
    .select("SELECT release_version FROM system.local;")
    .map(_.getString("release_version"))
    .runWith(Sink.head)
```

### Example 5: Sessions

```java
import akka.actor.ActorSystem;
import akka.stream.Materializer;
import akka.stream.alpakka.cassandra.CassandraSessionSettings;
import akka.stream.alpakka.cassandra.javadsl.CassandraSession;
import akka.stream.alpakka.cassandra.javadsl.CassandraSessionRegistry;

ActorSystem system = // ???
CassandraSessionSettings sessionSettings = CassandraSessionSettings.create();
CassandraSession cassandraSession =
    CassandraSessionRegistry.get(system).sessionFor(sessionSettings);

CompletionStage<String> version =
    cassandraSession
        .select("SELECT release_version FROM system.local;")
        .map(row -> row.getString("release_version"))
        .runWith(Sink.head(), system);
```

### Example 6: Reading from Cassandra

```scala
import akka.stream.alpakka.cassandra.scaladsl.CassandraSource

val ids: Future[immutable.Seq[Int]] =
  CassandraSource(s"SELECT id FROM $intTable").map(row => row.getInt("id")).runWith(Sink.seq)

val idsWhere: Future[Int] =
  CassandraSource(s"SELECT * FROM $intTable WHERE id = ?", value).map(_.getInt("id")).runWith(Sink.head)
```

### Example 7: Reading from Cassandra

```java
import akka.stream.alpakka.cassandra.javadsl.CassandraSource;

CompletionStage<List<Integer>> select =
    CassandraSource.create(cassandraSession, "SELECT id FROM " + idtable + ";")
        .map(r -> r.getInt("id"))
        .runWith(Sink.seq(), system);

CompletionStage<Integer> select =
    CassandraSource.create(
            cassandraSession, "SELECT * FROM " + idtable + " WHERE id = ?;", value)
        .map(r -> r.getInt("id"))
        .runWith(Sink.head(), system);
```

### Example 8: Reading from Cassandra

```scala
import com.datastax.oss.driver.api.core.cql.{Row, SimpleStatement}

val stmt = SimpleStatement.newInstance(s"SELECT * FROM $intTable").setPageSize(20)

val rows: Future[immutable.Seq[Row]] = CassandraSource(stmt).runWith(Sink.seq)
```

### Example 9: Reading from Cassandra

```java
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.core.cql.Statement;

Statement<?> stmt =
    SimpleStatement.newInstance("SELECT * FROM " + idtable + ";").setPageSize(20);

CompletionStage<List<Integer>> select =
    CassandraSource.create(cassandraSession, stmt)
        .map(r -> r.getInt("id"))
        .runWith(Sink.seq(), system);
```

### Example 10: Writing to Cassandra

```scala
import akka.stream.alpakka.cassandra.CassandraWriteSettings
import akka.stream.alpakka.cassandra.scaladsl.CassandraFlow
import com.datastax.oss.driver.api.core.cql.{BoundStatement, PreparedStatement}

case class Person(id: Int, name: String, city: String)

val persons =
  immutable.Seq(Person(12, "John", "London"), Person(43, "Umberto", "Roma"), Person(56, "James", "Chicago"))

val statementBinder: (Person, PreparedStatement) => BoundStatement =
  (person, preparedStatement) => preparedStatement.bind(Int.box(person.id), person.name, person.city)

val written: Future[immutable.Seq[Person]] = Source(persons)
  .via(
    CassandraFlow.create(CassandraWriteSettings.defaults,
                         s"INSERT INTO $table(id, name, city) VALUES (?, ?, ?)",
                         statementBinder)
  )
  .runWith(Sink.seq)
```

### Example 11: Writing to Cassandra

```java
import akka.NotUsed;
import akka.actor.ActorSystem;
import akka.japi.Function2;
import akka.japi.Pair;
import akka.stream.alpakka.cassandra.CassandraWriteSettings;
import akka.stream.alpakka.cassandra.javadsl.CassandraFlow;
import akka.stream.alpakka.testkit.javadsl.LogCapturingJunit4;
import akka.stream.javadsl.SourceWithContext;
import com.datastax.oss.driver.api.core.cql.BoundStatement;
import com.datastax.oss.driver.api.core.cql.PreparedStatement;

List<Person> persons =
    Arrays.asList(
        new Person(12, "John", "London"),
        new Person(43, "Umberto", "Roma"),
        new Person(56, "James", "Chicago"));

Function2<Person, PreparedStatement, BoundStatement> statementBinder =
    (person, preparedStatement) -> preparedStatement.bind(person.id, person.name, person.city);

CompletionStage<List<Person>> written =
    Source.from(persons)
        .via(
            CassandraFlow.create(
                cassandraSession,
                CassandraWriteSettings.defaults(),
                "INSERT INTO " + table + "(id, name, city) VALUES (?, ?, ?)",
                statementBinder))
        .runWith(Sink.seq(), system);
```

### Example 12: Update flows with context

```scala
val personsAndHandles: SourceWithContext[Person, AckHandle, NotUsed] = // ???

val written: Future[Done] = personsAndHandles
  .via(
    CassandraFlow.withContext(
      CassandraWriteSettings.defaults,
      s"INSERT INTO $table(id, name, city) VALUES (?, ?, ?)",
      (person, preparedStatement) => preparedStatement.bind(Int.box(person.id), person.name, person.city)
    )
  )
  .asSource
  .mapAsync(1) {
    case (_, handle) => handle.ack()
  }
  .runWith(Sink.ignore)
```

### Example 13: Update flows with context

```java
SourceWithContext<Person, AckHandle, NotUsed> from = // ???;
CompletionStage<Done> written =
    from.via(
            CassandraFlow.withContext(
                cassandraSession,
                CassandraWriteSettings.defaults(),
                "INSERT INTO " + table + "(id, name, city) VALUES (?, ?, ?)",
                (person, preparedStatement) ->
                    preparedStatement.bind(person.id, person.name, person.city)))
        .asSource()
        .mapAsync(1, pair -> pair.second().ack())
        .runWith(Sink.ignore(), system);
```

### Example 14: Custom Session creation

```conf
alpakka.cassandra {
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
  # See https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/#quick-overview
  # and https://docs.datastax.com/en/developer/java-driver/latest/manual/core/configuration/reference/
  datastax-java-driver-config = "datastax-java-driver"
}
```

### Example 15: Custom Session creation

```conf
datastax-java-driver {
  basic {
    contact-points = [ "127.0.0.1:9042" ]
    load-balancing-policy.local-datacenter = datacenter1
  }
  advanced.reconnect-on-init = true
}
```

### Example 16: Using Akka Discovery

```scala
val AkkaVersion = "2.10.11"
libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % AkkaVersion
```

### Example 17: Using Akka Discovery

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-discovery_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 18: Using Akka Discovery

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-discovery_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 19: Using Akka Discovery

```conf
akka {
  discovery.method = config
}
akka.discovery.config.services = {
  cassandra-service = {
    endpoints = [
      {
        host = "127.0.0.1"
        port = 9042
      }
    ]
  }
}

// inherit defaults from `alpakka.cassandra` settings
example-with-akka-discovery: ${alpakka.cassandra} {
  service-discovery.name = "cassandra-service"
}
```

### Example 20: Using Akka Discovery

```scala
val sessionSettings = CassandraSessionSettings("example-with-akka-discovery")
implicit val session: CassandraSession = CassandraSessionRegistry.get(system).sessionFor(sessionSettings)
```

### Example 21: Using Akka Discovery

```java
CassandraSessionSettings sessionSettings =
    CassandraSessionSettings.create("example-with-akka-discovery");
CassandraSession session = CassandraSessionRegistry.get(system).sessionFor(sessionSettings);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CassandraSessionSettings.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/CqlSessionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/DefaultSessionProvider.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/index.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/javadsl/CassandraSource$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraFlow$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSession.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry$.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSessionRegistry.html
- https://doc.akka.io/api/alpakka/10.0.2/akka/stream/alpakka/cassandra/scaladsl/CassandraSource$.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/libraries/akka-core/2.10/discovery/
- https://doc.akka.io/libraries/akka-core/2.10/stream/index.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-introduction.html
- https://doc.akka.io/libraries/alpakka/10.0/cassandra.html
- https://doc.akka.io/libraries/alpakka/10.0/external/apache-camel.html
- https://doc.akka.io/libraries/alpakka/10.0/geode.html
- https://doc.akka.io/libraries/alpakka/10.0/other-docs/snapshots.html
- https://doc.akka.io/libraries/alpakka/current

---
*Source: [https://doc.akka.io/libraries/alpakka/10.0/cassandra.html](https://doc.akka.io/libraries/alpakka/10.0/cassandra.html)*