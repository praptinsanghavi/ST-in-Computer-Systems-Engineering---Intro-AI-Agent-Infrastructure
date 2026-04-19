---
description: Alpakka is a Reactive Enterprise Integration library for Java and Scala,
  based on Reactive Streams and Akka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T18:23:46Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/home.html
title: Overview • Alpakka Kafka Documentation
---

# Overview • Alpakka Kafka Documentation

> **Summary:** Alpakka is a Reactive Enterprise Integration library for Java and Scala, based on Reactive Streams and Akka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Overview

The [Alpakka project](https://doc.akka.io/libraries/alpakka/current/) is an open source initiative to implement stream\-aware and reactive integration pipelines for Java and Scala. It is built on top of [Akka Streams](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html), and has been designed from the ground up to understand streaming natively and provide a DSL for reactive and stream\-oriented programming, with built\-in support for backpressure. Akka Streams is a [Reactive Streams](https://www.reactive-streams.org/) and JDK [java.util.concurrent.Flow](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/Flow.html)\-compliant implementation and therefore [fully interoperable](https://doc.akka.io/libraries/akka-core/2.10/general/stream/stream-design.html#interoperation-with-other-reactive-streams-implementations) with other implementations.

This **Alpakka Kafka connector** lets you connect [Apache Kafka](https://kafka.apache.org/) to Akka Streams. It was formerly known as **Akka Streams Kafka** and even **Reactive Kafka**.

## Project Info

| Project Info: Alpakka Kafka | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-stream\-kafka 8\.0\.1 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.kafka |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka-kafka/v8.0.1/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 0\.16, 2017\-05\-02 |
| Home page | [https://doc.akka.io/libraries/alpakka\-kafka/current](https://doc.akka.io/libraries/alpakka-kafka/current) |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) |
| Release notes | [In the documentation](https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/index.html) |
| Issues | [Github issues](https://github.com/akka/alpakka-kafka/issues) |
| Sources | [https://github.com/akka/alpakka\-kafka](https://github.com/akka/alpakka-kafka) |

## Matching Kafka Versions

See all releases in [GitHub releases](https://github.com/akka/alpakka-kafka/releases).

| Kafka client | Scala Versions | Akka version | Alpakka Kafka Connector |
| --- | --- | --- | --- |
| 4\.1\.0 | 3\.3, 2\.13 | 2\.10\.5\+ | [release 8\.0\.0](https://github.com/akka/alpakka-kafka/releases/tag/v8.0.0) |
| 3\.9\.1 | 3\.3, 2\.13 | 2\.10\.5\+ | [release 7\.0\.4](https://github.com/akka/alpakka-kafka/releases/tag/v7.0.4) |
| 3\.9\.0 | 3\.3, 2\.13 | 2\.10\.5\+ | [release 7\.0\.3](https://github.com/akka/alpakka-kafka/releases/tag/v7.0.3) |
| 3\.7\.1 | 3\.3, 2\.13 | 2\.10\.5\+ | [release 7\.0\.2](https://github.com/akka/alpakka-kafka/releases/tag/v7.0.2) |
| 3\.7\.1 | 3\.3, 2\.13 | 2\.10\.0\-2\.10\.4 | [release 7\.0\.0](https://github.com/akka/alpakka-kafka/releases/tag/v7.0.0) |
| 3\.7\.0 | 3\.3, 2\.13 | 2\.9\.0\+ | [release 6\.0\.0](https://github.com/akka/alpakka-kafka/releases/tag/v6.0.0) |
| 3\.5\.1 | 3\.3, 2\.13 | 2\.9\.0\+ | [release 5\.0\.0](https://github.com/akka/alpakka-kafka/releases/tag/v5.0.0) |
| 3\.3\.1 | 2\.13, 2\.12 | 2\.7\.0\+ | [release 4\.0\.0](https://github.com/akka/alpakka-kafka/releases/tag/v4.0.0) |
| 3\.0\.1 | 2\.13 | 2\.6\.18\+ | [release 3\.0\.1](https://github.com/akka/alpakka-kafka/releases/tag/v3.0.0) |
| [3\.0\.0](https://blogsarchive.apache.org/kafka/entry/what-s-new-in-apache6) | 2\.13 | 2\.6\.18\+ | [release 3\.0\.0 RC1](https://github.com/akka/alpakka-kafka/releases/tag/v3.0.0-RC1) |
| [2\.7\.0](https://archive.apache.org/dist/kafka/2.7.0/RELEASE_NOTES.html) | 2\.13, 2\.12 | 2\.6\.14\+ | [release 2\.1\.0](release-notes/2.1.x.html) |
| [2\.4\.1](https://archive.apache.org/dist/kafka/2.4.1/RELEASE_NOTES.html) | 2\.13, 2\.12, 2\.11 | 2\.5\.31\+, 2\.6\.6\+ | [release 2\.0\.5](release-notes/2.0.x.html) |
| [2\.4\.1](https://archive.apache.org/dist/kafka/2.4.1/RELEASE_NOTES.html) | 2\.13, 2\.12, 2\.11 | 2\.5\.30\+, 2\.6\.6\+ | [release 2\.0\.4](release-notes/2.0.x.html) |
| [2\.4\.1](https://archive.apache.org/dist/kafka/2.4.1/RELEASE_NOTES.html) | 2\.13, 2\.12, 2\.11 | 2\.5\.30\+, 2\.6\.3\+ | [release 2\.0\.3](release-notes/2.0.x.html) |
| [2\.4\.0](https://archive.apache.org/dist/kafka/2.4.0/RELEASE_NOTES.html) | 2\.13, 2\.12, 2\.11 | 2\.5\.23\+, 2\.6\.x | [release 2\.0\.0](release-notes/2.0.x.html) |
| [2\.1\.1](https://archive.apache.org/dist/kafka/2.1.1/RELEASE_NOTES.html) | 2\.13, 2\.12, 2\.11 | 2\.5\.x | [release 1\.0\.4](release-notes/1.0.x.html#1-0-4) |
| [2\.1\.1](https://archive.apache.org/dist/kafka/2.1.1/RELEASE_NOTES.html) | 2\.12, 2\.11 | 2\.5\.x | [release 1\.0\.1](release-notes/1.0.x.html#1-0-1) |
| [2\.1\.0](https://archive.apache.org/dist/kafka/2.1.0/RELEASE_NOTES.html) | 2\.12, 2\.11 | 2\.5\.x | [release 1\.0](release-notes/1.0.x.html#1-0) |
| 1\.1\.x | 2\.12, 2\.11 | 2\.5\.x | [release 0\.20\+](https://github.com/akka/alpakka-kafka/releases) |
| 1\.0\.x | 2\.12, 2\.11 | 2\.5\.x | [release 0\.20\+](https://github.com/akka/alpakka-kafka/releases) |
| 0\.11\.x | 2\.12, 2\.11 | 2\.5\.x | [release 0\.19](https://github.com/akka/alpakka-kafka/milestone/19?closed=1) |

Note
As Kafka’s client protocol negotiates the version to use with the Kafka broker, you may use a Kafka client version that is different than the Kafka broker’s version.

These clients can communicate with brokers that are version 2\.1\.0 or newer. Older or newer brokers may not support certain features. You will receive an UnsupportedVersionException when invoking an API that is not available on the running broker version.

Check even Confluent’s [Versions and Interoperability](https://docs.confluent.io/platform/current/installation/versions-interoperability.html) page for more details. 

– [Javadoc for `KafkaConsumer`](https://kafka.apache.org/41/javadoc/index.html?org/apache/kafka/clients/consumer/KafkaConsumer.html)

## Dependencies

Note
The Akka dependencies are available from Akka’s secure library repository. To access them you need to use a secure, tokenized URL as specified at <https://account.akka.io/token>.

Additionally, add the dependencies as below.

Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka_${scala.binary.version}</artifactId>
    <version>8.0.1</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka" % "8.0.1",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-kafka_${versions.ScalaBinary}:8.0.1"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

This connector depends on Akka 2\.10\.11 and note that it is important that all `akka-*` dependencies are in the same version, so it is recommended to depend on them explicitly to avoid problems with transient dependencies causing an unlucky mix of versions.

Alpakka Kafka APIs accept a typed [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") or a classic [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") because both implement the [`ClassicActorSystemProvider`](https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorSystemProvider.html "akka.actor.ClassicActorSystemProvider")[`ClassicActorSystemProvider`](https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html "akka.actor.ClassicActorSystemProvider") traitinterface. There are some Alpakka Kafka APIs that only accept classic a [`ActorRef`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef"), such as the [rebalance listener](consumer-rebalance.html) API, but otherwise there is no difference between running Alpakka Kafka and any other Akka Streams implementation with a typed [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem"). For more information on Akka classic and typed interoperability read the [Coexistence](https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html) page of the Akka Documentation.

The table below shows Alpakka Kafka’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-stream\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11) |
| org.apache.kafka | kafka\-clients | [4\.1\.0](https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients/4.1.0) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
        com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
    org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.apache.kafka    kafka-clients    [4.1.0](https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients/4.1.0)    The Apache License, Version 2.0
    com.github.luben    zstd-jni    [1.5.6-10](https://mvnrepository.com/artifact/com.github.luben/zstd-jni/1.5.6-10)    BSD 2-Clause License
    org.lz4    lz4-java    [1.8.0](https://mvnrepository.com/artifact/org.lz4/lz4-java/1.8.0)    The Apache Software License, Version 2.0
    org.slf4j    slf4j-api    [1.7.36](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/1.7.36)    MIT License
    org.xerial.snappy    snappy-java    [1.1.10.7](https://mvnrepository.com/artifact/org.xerial.snappy/snappy-java/1.1.10.7)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

- Akka Streams 2\.10\.11 [documentation](https://doc.akka.io/libraries/akka-core/2.10/stream/index.html) and [sources](https://github.com/akka/akka)
- Apache Kafka client 4\.1\.0 [documentation](https://kafka.apache.org/41/documentation#index) and [sources](https://github.com/apache/kafka)

## Scala and Java APIs

Following Akka’s conventions there are two separate packages named `akka.kafka.scaladsl` and `akka.kafka.javadsl` with the API for Scala and Java. These packages contain `Producer` and `Consumer` classes with factory methods for the various Akka Streams `Flow`, `Sink` and `Source` that are producing or consuming messages to/from Kafka.

## Examples

A few self\-contained examples using Alpakka are available as [Alpakka Samples](https://github.com/akka/alpakka-samples/).

To read and see how others use Alpakka see the [Alpakka documentation’s Webinars, Presentations and Articles](https://doc.akka.io/libraries/alpakka/current/other-docs/webinars-presentations-articles.html) listing.

## Contributing

Please feel free to contribute to Alpakka and the Alpakka Kafka connector by reporting issues you identify, or by suggesting changes to the code. Please refer to our [contributing instructions](https://github.com/akka/alpakka-kafka/blob/main/CONTRIBUTING.md) to learn how it can be done.

We want Akka and Alpakka to strive in a welcoming and open atmosphere and expect all contributors to respect our [code of conduct](https://akka.io/conduct).

## Code Examples

### Example 1: Dependencies

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka_${scala.binary.version}</artifactId>
    <version>8.0.1</version>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
  </dependency&gt
</dependencies>
```

### Example 2: Dependencies

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka" % "8.0.1",
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion
)
```

### Example 3: Dependencies

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  implementation "com.typesafe.akka:akka-stream-kafka_${versions.ScalaBinary}:8.0.1"
  implementation "com.typesafe.akka:akka-stream_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ClassicActorSystemProvider.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/libraries/akka-core/2.10/general/stream/stream-design.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/index.html
- https://doc.akka.io/libraries/akka-core/2.10/typed/coexisting.html
- https://doc.akka.io/libraries/alpakka-kafka/current
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer-rebalance.html
- https://doc.akka.io/libraries/alpakka-kafka/current/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/1.0.x.html
- https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/2.0.x.html
- https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/2.1.x.html
- https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/snapshots.html
- https://doc.akka.io/libraries/alpakka/current/
- https://doc.akka.io/libraries/alpakka/current/other-docs/webinars-presentations-articles.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/home.html](https://doc.akka.io/libraries/alpakka-kafka/current/home.html)*