---
description: Akka Projection.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:00:51Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/akka-projection/current/kafka.html
title: Messages from and to Kafka • Akka Projection
---

# Messages from and to Kafka • Akka Projection

> **Summary:** Akka Projection.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Messages from and to Kafka

A typical source for Projections is messages from Kafka. Akka Projections supports integration with Kafka using [Alpakka Kafka](https://doc.akka.io/libraries/alpakka-kafka/8.0/).

The [`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/javadsl/KafkaSourceProvider$.html "akka.projection.kafka.javadsl.KafkaSourceProvider")[`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/scaladsl/KafkaSourceProvider$.html "akka.projection.kafka.scaladsl.KafkaSourceProvider") uses consumer group assignments from Kafka and can resume from offsets stored in a database.

Akka Projections can store the offsets from Kafka in a [relational DB with JDBC](jdbc.html) or in [relational DB with Slick](slick.html).

The `JdbcProjection` or `SlickProjection` envelope handler will be run by the projection. This means that the target database operations can be run in the same transaction as the storage of the offset, which means when used with [exactly\-once](jdbc.html#exactly-once) the offsets will be persisted on the same transaction as the projected model (see [Committing offset outside Kafka](kafka.html#committing-offset-outside-kafka)). It also offers [at\-least\-once](jdbc.html#at-least-once) semantics.

Note
Offset storage of Kafka offsets are not implemented for Cassandra yet, see [issue \#97](https://github.com/akka/akka-projection/issues/97).

A `Projection` can also [send messages to Kafka](kafka.html#sending-to-kafka).

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

To use the Kafka module of Akka Projections add the following dependency in your project:

sbt
```
libraryDependencies += "com.lightbend.akka" %% "akka-projection-kafka" % "1.6.20"
```
Maven
```
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-kafka_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-kafka_${versions.ScalaBinary}:1.6.20"
}
```

Akka Projections require Akka 2\.10\.13 or later, see [Akka version](overview.html#akka-version).

| Project Info: Akka Projections Kafka | |
| --- | --- |
| Artifact | com.lightbend.akka akka\-projection\-kafka 1\.6\.20 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.projection.kafka |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/akka-projection/main/LICENSE) |
| Readiness level | [Supported](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#supported), support is available from [Lightbend](https://www.lightbend.com/akka) Since 1\.0\.0, 2020\-09\-10 |
| Home page | <https://akka.io> |
| API documentation | [API (Scaladoc)](https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/) |
| Forums | [Lightbend Discuss](https://discuss.akka.io/c/akka/) |
| Release notes | [GitHub releases](https://github.com/akka/akka-projection/releases) |
| Issues | [GitHub issues](https://github.com/akka/akka-projection/issues) |
| Sources | [https://github.com/akka/akka\-projection](https://github.com/akka/akka-projection) |

### Transitive dependencies

The table below shows `akka-projection-kafka`’s direct dependencies and the second tab shows all libraries it depends on transitively.

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.fasterxml.jackson.core | jackson\-databind | [2\.18\.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4) |
| com.lightbend.akka | akka\-projection\-core\_2\.13 | [1\.6\.20](https://mvnrepository.com/artifact/com.lightbend.akka/akka-projection-core_2.13/1.6.20) |
| com.typesafe.akka | akka\-stream\-kafka\_2\.13 | [8\.0\.0](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-kafka_2.13/8.0.0) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.fasterxml.jackson.core    jackson-databind    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-annotations    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-annotations/2.18.4)    The Apache Software License, Version 2.0
    com.fasterxml.jackson.core    jackson-core    [2.18.4](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core/2.18.4)    The Apache Software License, Version 2.0
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
com.typesafe.akka    akka-stream-kafka_2.13    [8.0.0](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-kafka_2.13/8.0.0)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.13)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.13)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.13](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.13)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.apache.kafka    kafka-clients    [4.1.0](https://mvnrepository.com/artifact/org.apache.kafka/kafka-clients/4.1.0)    The Apache License, Version 2.0
        com.github.luben    zstd-jni    [1.5.6-10](https://mvnrepository.com/artifact/com.github.luben/zstd-jni/1.5.6-10)    BSD 2-Clause License
        org.lz4    lz4-java    [1.8.0](https://mvnrepository.com/artifact/org.lz4/lz4-java/1.8.0)    The Apache Software License, Version 2.0
        org.slf4j    slf4j-api    [2.0.17](https://mvnrepository.com/artifact/org.slf4j/slf4j-api/2.0.17)    MIT
        org.xerial.snappy    snappy-java    [1.1.10.7](https://mvnrepository.com/artifact/org.xerial.snappy/snappy-java/1.1.10.7)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## KafkaSourceProvider

Important
Due to the mutable state inside [`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/javadsl/KafkaSourceProvider$.html "akka.projection.kafka.javadsl.KafkaSourceProvider")[`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/scaladsl/KafkaSourceProvider$.html "akka.projection.kafka.scaladsl.KafkaSourceProvider"), DO NOT share the instance of provider across projections.

For example, if you distribute projection via [`ShardedDaemonProcess`](https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html "akka.cluster.sharding.typed.javadsl.ShardedDaemonProcess")[`ShardedDaemonProcess`](https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html "akka.cluster.sharding.typed.scaladsl.ShardedDaemonProcess"), instantiate each provider inside the behavior factory.

A [`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") defines the source of the envelopes that the `Projection` will process. A `SourceProvider` for messages from Kafka can be defined with the [`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/javadsl/KafkaSourceProvider$.html "akka.projection.kafka.javadsl.KafkaSourceProvider")[`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/scaladsl/KafkaSourceProvider$.html "akka.projection.kafka.scaladsl.KafkaSourceProvider") like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L41-L44 "Go to snippet source")import akka.kafka.ConsumerSettings
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.StringDeserializer
val bootstrapServers = "localhost:9092"
val groupId = "group-wordcount"
val topicName = "words"
val consumerSettings =
  ConsumerSettings(system, new StringDeserializer, new StringDeserializer)
    .withBootstrapServers(bootstrapServers)
    .withGroupId(groupId)
    .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")

val sourceProvider: SourceProvider[MergeableOffset[JLong], ConsumerRecord[String, String]] =
  KafkaSourceProvider(system, consumerSettings, Set(topicName))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L37-L41 "Go to snippet source")import akka.kafka.ConsumerSettings;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;

String bootstrapServers = "localhost:9092";
String groupId = "group-wordcount";
String topicName = "words";
ConsumerSettings<String, String> consumerSettings =
    ConsumerSettings.create(system, new StringDeserializer(), new StringDeserializer())
        .withBootstrapServers(bootstrapServers)
        .withGroupId(groupId)
        .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

SourceProvider<MergeableOffset<Long>, ConsumerRecord<String, String>> sourceProvider =
    KafkaSourceProvider.create(system, consumerSettings, Collections.singleton(topicName));
```

Please consult the [Alpakka Kafka documentation](https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer.html) for specifics around the `ConsumerSettings`. The `KafkaSourceProvider` is using `Consumer.plainPartitionedManualOffsetSource`.

The `Projection` can then be defined as:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L174-L182 "Go to snippet source")val sessionProvider = new HibernateSessionFactory

val projectionId = ProjectionId("WordCount", "wordcount-1")
val projection =
  JdbcProjection.exactlyOnce(
    projectionId,
    sourceProvider,
    () => sessionProvider.newInstance(),
    handler = () => new WordCountJdbcHandler(wordRepository))
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L211-L220 "Go to snippet source")final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

ProjectionId projectionId = ProjectionId.of("WordCount", "wordcount-1");
ExactlyOnceProjection<MergeableOffset<Long>, ConsumerRecord<String, String>> projection =
    JdbcProjection.exactlyOnce(
        projectionId,
        sourceProvider,
        sessionProvider::newInstance,
        () -> new WordCountJdbcHandler(wordRepository),
        system);
```

and the `WordCountJdbcHandler`:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L186-L195 "Go to snippet source")class WordCountJdbcHandler(val wordRepository: WordRepository)
    extends JdbcHandler[ConsumerRecord[String, String], HibernateJdbcSession] {

  @throws[Exception]
  override def process(session: HibernateJdbcSession, envelope: ConsumerRecord[String, String]): Unit = {
    val word = envelope.value
    wordRepository.increment(session.entityManager, word)
  }
}

```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L225-L240 "Go to snippet source")public class WordCountJdbcHandler
    extends JdbcHandler<ConsumerRecord<String, String>, HibernateJdbcSession> {
  private Logger logger = LoggerFactory.getLogger(getClass());
  private WordRepository wordRepository;

  public WordCountJdbcHandler(WordRepository wordRepository) {
    this.wordRepository = wordRepository;
  }

  @Override
  public void process(HibernateJdbcSession session, ConsumerRecord<String, String> envelope)
      throws Exception {
    String word = envelope.value();
    wordRepository.increment(session.entityManager, word);
  }
}
```

Where the `WordRepository` is an implementation of:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L199-L201 "Go to snippet source")trait WordRepository {
  def increment(entityManager: EntityManager, word: String): Unit
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L244-L246 "Go to snippet source")interface WordRepository {
  void increment(EntityManager entityManager, String word);
}
```

## Committing offset outside Kafka

The `KafkaSourceProvider` described above stores the Kafka offsets in a database. The main advantage of storing the offsets in a database is that exactly\-once processing semantics can be achieved if the target database operations of the projection can be run in the same transaction as the storage of the offset.

However, there is a caveat when choosing for `exactly-once`. When the Kafka Consumer Group rebalance occurs it’s possible that some messages from a revoked partitions are still in\-flight and have not yet been committed to the offset store. Projections will attempt to filter out such messages, but it’s not possible to guarantee it all the time.

To mitigate that risk, you can increase the value of `akka.projection.kafka.read-offset-delay` (defaults to 500ms). This delay adds a buffer of time between when the Kafka Source Provider starts up, or when it’s assigned a new partition, to retrieve the map of partitions to offsets to give any projections running in parallel a chance to drain in\-flight messages.

## Committing offset in Kafka

When using the approach of committing the offsets back to Kafka the [Alpakka Kafka comittableSource](https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer.html) can be used, and Akka Projections is not needed for that usage.

## Sending to Kafka

To send events to Kafka one can use [`SendProducer`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/javadsl/SendProducer.html "akka.kafka.javadsl.SendProducer")[`SendProducer`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/SendProducer.html "akka.kafka.scaladsl.SendProducer") or [`Producer.flowWithContext`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer.flowWithContext`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer") method in Alpakka Kafka.

### Sending to Kafka using the SendProducer

An async `Handler` that is sending to Kafka may look like this:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L110-L126 "Go to snippet source")class WordPublisher(topic: String, sendProducer: SendProducer[String, String])(implicit ec: ExecutionContext)
    extends Handler[WordEnvelope] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: WordEnvelope): Future[Done] = {
    val word = envelope.word
    // using the word as the key and `DefaultPartitioner` will select partition based on the key
    // so that same word always ends up in same partition
    val key = word
    val producerRecord = new ProducerRecord(topic, key, word)
    val result = sendProducer.send(producerRecord).map { recordMetadata =>
      logger.info("Published word [{}] to topic/partition {}/{}", word, topic, recordMetadata.partition)
      Done
    }
    result
  }
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L150-L180 "Go to snippet source")class WordPublisher extends Handler<WordEnvelope> {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final String topic;
  private final SendProducer<String, String> sendProducer;

  public WordPublisher(String topic, SendProducer<String, String> sendProducer) {
    this.topic = topic;
    this.sendProducer = sendProducer;
  }

  @Override
  public CompletionStage<Done> process(WordEnvelope envelope) {
    String word = envelope.word;
    // using the word as the key and `DefaultPartitioner` will select partition based on the key
    // so that same word always ends up in same partition
    String key = word;
    ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, key, word);
    CompletionStage<RecordMetadata> result = sendProducer.send(producerRecord);
    CompletionStage<Done> done =
        result.thenApply(
            recordMetadata -> {
              logger.info(
                  "Published word [{}] to topic/partition {}/{}",
                  word,
                  topic,
                  recordMetadata.partition());
              return Done.getInstance();
            });
    return done;
  }
}
```

The `SendProducer` is constructed with:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L36-L37 "Go to snippet source")import org.apache.kafka.common.serialization.StringSerializer
import akka.kafka.ProducerSettings
import akka.kafka.scaladsl.SendProducer
val bootstrapServers = "localhost:9092"
val topicName = "words"
private val producerSettings =
  ProducerSettings(system, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)
import akka.actor.typed.scaladsl.adapter._ // FIXME might not be needed in later Alpakka Kafka version?
private val sendProducer = SendProducer(producerSettings)(system.toClassic)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L45-L46 "Go to snippet source")import org.apache.kafka.common.serialization.StringSerializer;
import akka.kafka.ProducerSettings;
import akka.kafka.javadsl.SendProducer;

String bootstrapServers = "localhost:9092";
String topicName = "words";
ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(system, new StringSerializer(), new StringSerializer())
        .withBootstrapServers(bootstrapServers);
SendProducer<String, String> sendProducer = new SendProducer<>(producerSettings, system);
```

Please consult the for specifics around the `ProducerSettings` and `SendProducer`.

The `Projection` is defined as:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L221-L232 "Go to snippet source")val sourceProvider = new WordSource
val sessionProvider = new HibernateSessionFactory

val projectionId = ProjectionId("PublishWords", "words")
val projection =
  JdbcProjection
    .atLeastOnceAsync(
      projectionId,
      sourceProvider,
      () => sessionProvider.newInstance(),
      handler = () => new WordPublisher(topicName, sendProducer))

```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L262-L272 "Go to snippet source")WordSource sourceProvider = new WordSource();
HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

ProjectionId projectionId = ProjectionId.of("PublishWords", "words");
Projection<WordEnvelope> projection =
    JdbcProjection.atLeastOnceAsync(
        projectionId,
        sourceProvider,
        sessionProvider::newInstance,
        () -> new WordPublisher(topicName, sendProducer),
        system);
```

where the `SourceProvider` in this example is:

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L63-L106 "Go to snippet source")type Word = String
type Count = Int
final case class WordEnvelope(offset: Long, word: Word)

class WordSource(implicit ec: ExecutionContext) extends SourceProvider[Long, WordEnvelope] {

  private val src = Source(
    List(WordEnvelope(1L, "abc"), WordEnvelope(2L, "def"), WordEnvelope(3L, "ghi"), WordEnvelope(4L, "abc")))

  override def source(offset: () => Future[Option[Long]]): Future[Source[WordEnvelope, NotUsed]] = {
    offset()
      .map {
        case Some(o) => src.dropWhile(_.offset <= o)
        case _       => src
      }
      .map(_.throttle(1, 1.second))
  }

  override def extractOffset(env: WordEnvelope): Long = env.offset

  override def extractCreationTime(env: WordEnvelope): Long = 0L
}
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L103-L146 "Go to snippet source")public class WordEnvelope {
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
              if (o.isPresent())
                return src.dropWhile(envelope -> envelope.offset <= o.get())
                    .throttle(1, Duration.ofSeconds(1));
              else return src.throttle(1, Duration.ofSeconds(1));
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

### Sending to Kafka using a Producer Flow

Alternatively, we can define the same projection using [`Producer.flowWithContext`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer.flowWithContext`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer") in combination with `atLeastOnceFlow`.

The `WordSource` emits `WordEnvelope`s, therefore we will build a flow that takes every single emitted `WordEnvelope` and map it into an Alpakka Kafka [`ProducerMessage`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html "akka.kafka.ProducerMessage")[`ProducerMessage`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html "akka.kafka.ProducerMessage"). The `ProducerMessage` factory methods can be used to produce a single message, multiple messages, or pass through a message (skip a message from being produced). The [`ProducerMessage`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html "akka.kafka.ProducerMessage")[`ProducerMessage`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html "akka.kafka.ProducerMessage") will pass through [`Producer.flowWithContext`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer.flowWithContext`](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer") that will publish it to the Kafka Topic and finally we map the result to `Done`.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L36-L37 "Go to snippet source")import org.apache.kafka.common.serialization.StringSerializer
import akka.kafka.ProducerSettings
import org.apache.kafka.clients.producer.ProducerRecord
import akka.kafka.ProducerMessage
import akka.kafka.scaladsl.Producer
import akka.stream.scaladsl.FlowWithContext
import akka.projection.ProjectionContext

val bootstrapServers = "localhost:9092"
val topicName = "words"

private val producerSettings =
  ProducerSettings(system, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)

val producerFlow =
  FlowWithContext[WordEnvelope, ProjectionContext]
    .map(wordEnv => ProducerMessage.single(new ProducerRecord(topicName, wordEnv.word, wordEnv.word)))
    .via(Producer.flowWithContext(producerSettings))
    .map(_ => Done)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L45-L46 "Go to snippet source")import org.apache.kafka.common.serialization.StringSerializer;
import akka.kafka.ProducerSettings;
import org.apache.kafka.clients.producer.ProducerRecord;
import akka.kafka.ProducerMessage;
import akka.kafka.javadsl.Producer;
import akka.stream.javadsl.FlowWithContext;
import akka.projection.ProjectionContext;

String bootstrapServers = "localhost:9092";
String topicName = "words";

ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(system, new StringSerializer(), new StringSerializer())
        .withBootstrapServers(bootstrapServers);

FlowWithContext<WordEnvelope, ProjectionContext, Done, ProjectionContext, NotUsed>
    producerFlow =
        FlowWithContext.<WordEnvelope, ProjectionContext>create()
            .map(
                wordEnv ->
                    ProducerMessage.single(
                        new ProducerRecord<String, String>(
                            topicName, wordEnv.word, wordEnv.word)))
            .via(Producer.flowWithContext(producerSettings))
            .map(__ -> Done.getInstance());

```

The resulting flow is then used in the `atLeastOnceFlow` factory method to build the Projection.

Scala

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/scala/docs/kafka/KafkaDocExample.scala#L257-L263 "Go to snippet source")val sourceProvider = new WordSource
val sessionProvider = new HibernateSessionFactory

val projectionId = ProjectionId("PublishWords", "words")
val projection =
  JdbcProjection
    .atLeastOnceFlow(projectionId, sourceProvider, () => sessionProvider.newInstance(), producerFlow)
```

Java

```
[source](https://github.com/akka/akka-projection/tree/master/examples/src/test/java/jdocs/kafka/KafkaDocExample.java#L301-L307 "Go to snippet source")WordSource sourceProvider = new WordSource();
HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

ProjectionId projectionId = ProjectionId.of("PublishWords", "words");
Projection<WordEnvelope> projection =
    JdbcProjection.atLeastOnceFlow(
        projectionId, sourceProvider, sessionProvider::newInstance, producerFlow, system);
```

## Mergeable Offset

The offset type for a projection is determined by the [`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html "akka.projection.javadsl.SourceProvider")[`SourceProvider`](/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html "akka.projection.scaladsl.SourceProvider") that’s used. Akka Projections supports a variety of offset types. In most cases an event is associated with a single offset row in the projection implementation’s offset store, but the [`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/javadsl/KafkaSourceProvider$.html "akka.projection.kafka.javadsl.KafkaSourceProvider")[`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/scaladsl/KafkaSourceProvider$.html "akka.projection.kafka.scaladsl.KafkaSourceProvider") uses a special type of offset called a [`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset").

[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset")[`MergeableOffset`](/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html "akka.projection.MergeableOffset") allows us to read and write a map of offsets to the projection offset store. This is required because a subscription to consume from Kafka normally spans more than 1 Kafka Partition (see the [Apache Kafka documentation](https://kafka.apache.org/documentation/#intro_topics) for more information on Kafka’s partitioning model). To begin consuming from Kafka using offsets stored in a projection’s offset store we must provide the Kafka Consumer with a map of topic partitions to offset map (a `java.util.Map[org.apache.kafka.common.TopicPartition, java.lang.Long]``java.util.Map<org.apache.kafka.common.TopicPartition, java.lang.Long>`). The Kafka offset map is modelled as multiple rows in the projection offset table, where each row includes the projection name, a surrogate projection key that represents the Kafka topic partition, and the offset as a `java.lang.Long`. When a projection with [`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/javadsl/KafkaSourceProvider$.html "akka.projection.kafka.javadsl.KafkaSourceProvider")[`KafkaSourceProvider`](/api/akka-projection/1.6.20/akka/projection/kafka/scaladsl/KafkaSourceProvider$.html "akka.projection.kafka.scaladsl.KafkaSourceProvider") is started, or when a Kafka consumer group rebalance occurs, we read all the rows from the offset table for a projection name. When an offset is committed we persist one or more rows of the Kafka offset map back to the projection offset table.

## Configuration

Make your edits/overrides in your application.conf.

The reference configuration file with the default values:

```
[source](https://github.com/akka/akka-projection/tree/master/akka-projection-kafka/src/main/resources/reference.conf#L3-L12 "Go to snippet source")akka.projection.kafka {
  # The time to wait before retrieving the last saved offsets. Due to the asynchronous nature of Akka Streams, 
  # when a Kafka Consumer Group rebalance occurs it's possible that some messages from a revoked partitions 
  # are still in-flight and have not yet been committed to the offset store. Projections will attempt to 
  # filter out such messages, but it's not possible to guarantee it all the time. This delay adds a small 
  # buffer of time between when the Kafka Source Provider starts up, or when it's assigned a new partition, 
  # to retrieve the map of partitions to offsets to give any projections running in parallel a chance 
  # to drain in-flight messages.
  read-offset-delay = 500 ms
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
libraryDependencies += "com.lightbend.akka" %% "akka-projection-kafka" % "1.6.20"
```

### Example 5: Dependencies

```xml
<properties>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.lightbend.akka</groupId>
    <artifactId>akka-projection-kafka_${scala.binary.version}</artifactId>
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
  implementation "com.lightbend.akka:akka-projection-kafka_${versions.ScalaBinary}:1.6.20"
}
```

### Example 7: KafkaSourceProvider

```scala
import akka.kafka.ConsumerSettings
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.apache.kafka.common.serialization.StringDeserializer
val bootstrapServers = "localhost:9092"
val groupId = "group-wordcount"
val topicName = "words"
val consumerSettings =
  ConsumerSettings(system, new StringDeserializer, new StringDeserializer)
    .withBootstrapServers(bootstrapServers)
    .withGroupId(groupId)
    .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")

val sourceProvider: SourceProvider[MergeableOffset[JLong], ConsumerRecord[String, String]] =
  KafkaSourceProvider(system, consumerSettings, Set(topicName))
```

### Example 8: KafkaSourceProvider

```java
import akka.kafka.ConsumerSettings;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;

String bootstrapServers = "localhost:9092";
String groupId = "group-wordcount";
String topicName = "words";
ConsumerSettings<String, String> consumerSettings =
    ConsumerSettings.create(system, new StringDeserializer(), new StringDeserializer())
        .withBootstrapServers(bootstrapServers)
        .withGroupId(groupId)
        .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

SourceProvider<MergeableOffset<Long>, ConsumerRecord<String, String>> sourceProvider =
    KafkaSourceProvider.create(system, consumerSettings, Collections.singleton(topicName));
```

### Example 9: KafkaSourceProvider

```scala
val sessionProvider = new HibernateSessionFactory

val projectionId = ProjectionId("WordCount", "wordcount-1")
val projection =
  JdbcProjection.exactlyOnce(
    projectionId,
    sourceProvider,
    () => sessionProvider.newInstance(),
    handler = () => new WordCountJdbcHandler(wordRepository))
```

### Example 10: KafkaSourceProvider

```java
final HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

ProjectionId projectionId = ProjectionId.of("WordCount", "wordcount-1");
ExactlyOnceProjection<MergeableOffset<Long>, ConsumerRecord<String, String>> projection =
    JdbcProjection.exactlyOnce(
        projectionId,
        sourceProvider,
        sessionProvider::newInstance,
        () -> new WordCountJdbcHandler(wordRepository),
        system);
```

### Example 11: KafkaSourceProvider

```scala
class WordCountJdbcHandler(val wordRepository: WordRepository)
    extends JdbcHandler[ConsumerRecord[String, String], HibernateJdbcSession] {

  @throws[Exception]
  override def process(session: HibernateJdbcSession, envelope: ConsumerRecord[String, String]): Unit = {
    val word = envelope.value
    wordRepository.increment(session.entityManager, word)
  }
}
```

### Example 12: KafkaSourceProvider

```java
public class WordCountJdbcHandler
    extends JdbcHandler<ConsumerRecord<String, String>, HibernateJdbcSession> {
  private Logger logger = LoggerFactory.getLogger(getClass());
  private WordRepository wordRepository;

  public WordCountJdbcHandler(WordRepository wordRepository) {
    this.wordRepository = wordRepository;
  }

  @Override
  public void process(HibernateJdbcSession session, ConsumerRecord<String, String> envelope)
      throws Exception {
    String word = envelope.value();
    wordRepository.increment(session.entityManager, word);
  }
}
```

### Example 13: KafkaSourceProvider

```scala
trait WordRepository {
  def increment(entityManager: EntityManager, word: String): Unit
}
```

### Example 14: KafkaSourceProvider

```java
interface WordRepository {
  void increment(EntityManager entityManager, String word);
}
```

### Example 15: Sending to Kafka using the SendProducer

```scala
class WordPublisher(topic: String, sendProducer: SendProducer[String, String])(implicit ec: ExecutionContext)
    extends Handler[WordEnvelope] {
  private val logger = LoggerFactory.getLogger(getClass)

  override def process(envelope: WordEnvelope): Future[Done] = {
    val word = envelope.word
    // using the word as the key and `DefaultPartitioner` will select partition based on the key
    // so that same word always ends up in same partition
    val key = word
    val producerRecord = new ProducerRecord(topic, key, word)
    val result = sendProducer.send(producerRecord).map { recordMetadata =>
      logger.info("Published word [{}] to topic/partition {}/{}", word, topic, recordMetadata.partition)
      Done
    }
    result
  }
}
```

### Example 16: Sending to Kafka using the SendProducer

```java
class WordPublisher extends Handler<WordEnvelope> {
  private final Logger logger = LoggerFactory.getLogger(getClass());
  private final String topic;
  private final SendProducer<String, String> sendProducer;

  public WordPublisher(String topic, SendProducer<String, String> sendProducer) {
    this.topic = topic;
    this.sendProducer = sendProducer;
  }

  @Override
  public CompletionStage<Done> process(WordEnvelope envelope) {
    String word = envelope.word;
    // using the word as the key and `DefaultPartitioner` will select partition based on the key
    // so that same word always ends up in same partition
    String key = word;
    ProducerRecord<String, String> producerRecord = new ProducerRecord<>(topic, key, word);
    CompletionStage<RecordMetadata> result = sendProducer.send(producerRecord);
    CompletionStage<Done> done =
        result.thenApply(
            recordMetadata -> {
              logger.info(
                  "Published word [{}] to topic/partition {}/{}",
                  word,
                  topic,
                  recordMetadata.partition());
              return Done.getInstance();
            });
    return done;
  }
}
```

### Example 17: Sending to Kafka using the SendProducer

```scala
import org.apache.kafka.common.serialization.StringSerializer
import akka.kafka.ProducerSettings
import akka.kafka.scaladsl.SendProducer
val bootstrapServers = "localhost:9092"
val topicName = "words"
private val producerSettings =
  ProducerSettings(system, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)
import akka.actor.typed.scaladsl.adapter._ // FIXME might not be needed in later Alpakka Kafka version?
private val sendProducer = SendProducer(producerSettings)(system.toClassic)
```

### Example 18: Sending to Kafka using the SendProducer

```java
import org.apache.kafka.common.serialization.StringSerializer;
import akka.kafka.ProducerSettings;
import akka.kafka.javadsl.SendProducer;

String bootstrapServers = "localhost:9092";
String topicName = "words";
ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(system, new StringSerializer(), new StringSerializer())
        .withBootstrapServers(bootstrapServers);
SendProducer<String, String> sendProducer = new SendProducer<>(producerSettings, system);
```

### Example 19: Sending to Kafka using the SendProducer

```scala
val sourceProvider = new WordSource
val sessionProvider = new HibernateSessionFactory

val projectionId = ProjectionId("PublishWords", "words")
val projection =
  JdbcProjection
    .atLeastOnceAsync(
      projectionId,
      sourceProvider,
      () => sessionProvider.newInstance(),
      handler = () => new WordPublisher(topicName, sendProducer))
```

### Example 20: Sending to Kafka using the SendProducer

```java
WordSource sourceProvider = new WordSource();
HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

ProjectionId projectionId = ProjectionId.of("PublishWords", "words");
Projection<WordEnvelope> projection =
    JdbcProjection.atLeastOnceAsync(
        projectionId,
        sourceProvider,
        sessionProvider::newInstance,
        () -> new WordPublisher(topicName, sendProducer),
        system);
```

### Example 21: Sending to Kafka using the SendProducer

```scala
type Word = String
type Count = Int
final case class WordEnvelope(offset: Long, word: Word)

class WordSource(implicit ec: ExecutionContext) extends SourceProvider[Long, WordEnvelope] {

  private val src = Source(
    List(WordEnvelope(1L, "abc"), WordEnvelope(2L, "def"), WordEnvelope(3L, "ghi"), WordEnvelope(4L, "abc")))

  override def source(offset: () => Future[Option[Long]]): Future[Source[WordEnvelope, NotUsed]] = {
    offset()
      .map {
        case Some(o) => src.dropWhile(_.offset <= o)
        case _       => src
      }
      .map(_.throttle(1, 1.second))
  }

  override def extractOffset(env: WordEnvelope): Long = env.offset

  override def extractCreationTime(env: WordEnvelope): Long = 0L
}
```

### Example 22: Sending to Kafka using the SendProducer

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
              if (o.isPresent())
                return src.dropWhile(envelope -> envelope.offset <= o.get())
                    .throttle(1, Duration.ofSeconds(1));
              else return src.throttle(1, Duration.ofSeconds(1));
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

### Example 23: Sending to Kafka using a Producer Flow

```scala
import org.apache.kafka.common.serialization.StringSerializer
import akka.kafka.ProducerSettings
import org.apache.kafka.clients.producer.ProducerRecord
import akka.kafka.ProducerMessage
import akka.kafka.scaladsl.Producer
import akka.stream.scaladsl.FlowWithContext
import akka.projection.ProjectionContext

val bootstrapServers = "localhost:9092"
val topicName = "words"

private val producerSettings =
  ProducerSettings(system, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)

val producerFlow =
  FlowWithContext[WordEnvelope, ProjectionContext]
    .map(wordEnv => ProducerMessage.single(new ProducerRecord(topicName, wordEnv.word, wordEnv.word)))
    .via(Producer.flowWithContext(producerSettings))
    .map(_ => Done)
```

### Example 24: Sending to Kafka using a Producer Flow

```java
import org.apache.kafka.common.serialization.StringSerializer;
import akka.kafka.ProducerSettings;
import org.apache.kafka.clients.producer.ProducerRecord;
import akka.kafka.ProducerMessage;
import akka.kafka.javadsl.Producer;
import akka.stream.javadsl.FlowWithContext;
import akka.projection.ProjectionContext;

String bootstrapServers = "localhost:9092";
String topicName = "words";

ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(system, new StringSerializer(), new StringSerializer())
        .withBootstrapServers(bootstrapServers);

FlowWithContext<WordEnvelope, ProjectionContext, Done, ProjectionContext, NotUsed>
    producerFlow =
        FlowWithContext.<WordEnvelope, ProjectionContext>create()
            .map(
                wordEnv ->
                    ProducerMessage.single(
                        new ProducerRecord<String, String>(
                            topicName, wordEnv.word, wordEnv.word)))
            .via(Producer.flowWithContext(producerSettings))
            .map(__ -> Done.getInstance());
```

### Example 25: Sending to Kafka using a Producer Flow

```scala
val sourceProvider = new WordSource
val sessionProvider = new HibernateSessionFactory

val projectionId = ProjectionId("PublishWords", "words")
val projection =
  JdbcProjection
    .atLeastOnceFlow(projectionId, sourceProvider, () => sessionProvider.newInstance(), producerFlow)
```

### Example 26: Sending to Kafka using a Producer Flow

```java
WordSource sourceProvider = new WordSource();
HibernateSessionFactory sessionProvider = new HibernateSessionFactory();

ProjectionId projectionId = ProjectionId.of("PublishWords", "words");
Projection<WordEnvelope> projection =
    JdbcProjection.atLeastOnceFlow(
        projectionId, sourceProvider, sessionProvider::newInstance, producerFlow, system);
```

### Example 27: Configuration

```conf
akka.projection.kafka {
  # The time to wait before retrieving the last saved offsets. Due to the asynchronous nature of Akka Streams, 
  # when a Kafka Consumer Group rebalance occurs it's possible that some messages from a revoked partitions 
  # are still in-flight and have not yet been committed to the offset store. Projections will attempt to 
  # filter out such messages, but it's not possible to guarantee it all the time. This delay adds a small 
  # buffer of time between when the Kafka Source Provider starts up, or when it's assigned a new partition, 
  # to retrieve the map of partitions to offsets to give any projections running in parallel a chance 
  # to drain in-flight messages.
  read-offset-delay = 500 ms
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka-core/2.10/akka/cluster/sharding/typed/scaladsl/ShardedDaemonProcess.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/MergeableOffset.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/javadsl/SourceProvider.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/kafka/javadsl/KafkaSourceProvider$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/kafka/scaladsl/KafkaSourceProvider$.html
- https://doc.akka.io/api/akka-projection/1.6.20/akka/projection/scaladsl/SourceProvider.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/javadsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/SendProducer.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka-core/2.10/akka/cluster/sharding/typed/javadsl/ShardedDaemonProcess.html
- https://doc.akka.io/libraries/akka-projection/current/durable-state.html
- https://doc.akka.io/libraries/akka-projection/current/jdbc.html
- https://doc.akka.io/libraries/akka-projection/current/kafka.html
- https://doc.akka.io/libraries/akka-projection/current/overview.html
- https://doc.akka.io/libraries/akka-projection/current/r2dbc.html
- https://doc.akka.io/libraries/akka-projection/current/slick.html
- https://doc.akka.io/libraries/akka-projection/current/snapshots.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/
- https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer.html

---
*Source: [https://doc.akka.io/libraries/akka-projection/current/kafka.html](https://doc.akka.io/libraries/akka-projection/current/kafka.html)*