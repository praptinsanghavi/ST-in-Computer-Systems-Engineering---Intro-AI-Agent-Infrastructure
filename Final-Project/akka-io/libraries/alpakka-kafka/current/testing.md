---
description: Alpakka Kafka provides a Testkit with support for running local Kafka
  brokers for integration tests.
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:54Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/testing.html
title: Testing • Alpakka Kafka Documentation
---

# Testing • Alpakka Kafka Documentation

> **Summary:** Alpakka Kafka provides a Testkit with support for running local Kafka brokers for integration tests.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Testing

To simplify testing of streaming integrations with Alpakka Kafka, it provides the **Alpakka Kafka testkit**. It provides help for

- [Using Docker to launch a local Kafka cluster with testcontainers](testing-testcontainers.html)
- [Mocking the Alpakka Kafka Consumers and Producers](testing.html#mocking-the-consumer-or-producer)

| Project Info: Alpakka Kafka testkit | |
| --- | --- |
| Artifact | com.typesafe.akka akka\-stream\-kafka\-testkit 8\.0\.1 [Snapshots are available](snapshots.html) |
| JDK versions | Eclipse Temurin JDK 11Eclipse Temurin JDK 17Eclipse Temurin JDK 21 |
| Scala versions | 2\.13\.17, 3\.3\.7 |
| JPMS module name | akka.stream.alpakka.kafka.testkit |
| License | [BUSL\-1\.1](https://raw.githubusercontent.com/akka/alpakka-kafka/v8.0.1/LICENSE) |
| Readiness level | [Incubating](https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html#incubating) Since 1\.0\-M1, 2018\-11\-06 Note: The API of the testkit may change even for minor versions. |
| Home page | [https://doc.akka.io/libraries/alpakka\-kafka/current](https://doc.akka.io/libraries/alpakka-kafka/current) |
| Forums | [Lightbend Discuss](https://discuss.akka.io) |
| Release notes | [In the documentation](https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/index.html) |
| Issues | [Github issues](https://github.com/akka/alpakka-kafka/issues) |
| Sources | [https://github.com/akka/alpakka\-kafka](https://github.com/akka/alpakka-kafka) |

Maven
```
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka-testkit_${scala.binary.version}</artifactId>
    <version>8.0.1</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```
sbt
```
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka-testkit" % "8.0.1" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test
)
```
Gradle
```
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  testImplementation "com.typesafe.akka:akka-stream-kafka-testkit_${versions.ScalaBinary}:8.0.1"
  testImplementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

Note that Akka testkits do not promise binary compatibility. The API might be changed even between patch releases.

The table below shows Alpakka Kafka testkit’s direct dependencies and the second tab shows all libraries it depends on transitively. 

Direct dependencies

| Organization | Artifact | Version |
| --- | --- | --- |
| com.typesafe.akka | akka\-stream\-kafka\_2\.13 | [8\.0\.1](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-kafka_2.13/8.0.1) |
| com.typesafe.akka | akka\-stream\-testkit\_2\.13 | [2\.10\.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-testkit_2.13/2.10.11) |
| org.scala\-lang | scala\-library | [2\.13\.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17) |

Dependency tree
```

com.typesafe.akka    akka-stream-kafka_2.13    [8.0.1](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-kafka_2.13/8.0.1)
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
com.typesafe.akka    akka-stream-testkit_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream-testkit_2.13/2.10.11)    BUSL-1.1
    com.typesafe.akka    akka-stream_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-stream_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        com.typesafe.akka    akka-protobuf-v3_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-protobuf-v3_2.13/2.10.11)    BUSL-1.1
        org.reactivestreams    reactive-streams    [1.0.4](https://mvnrepository.com/artifact/org.reactivestreams/reactive-streams/1.0.4)    MIT-0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    com.typesafe.akka    akka-testkit_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit_2.13/2.10.11)    BUSL-1.1
        com.typesafe.akka    akka-actor_2.13    [2.10.11](https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.13/2.10.11)    BUSL-1.1
            com.typesafe    config    [1.4.5](https://mvnrepository.com/artifact/com.typesafe/config/1.4.5)    Apache-2.0
            org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
        org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
    org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
org.scala-lang    scala-library    [2.13.17](https://mvnrepository.com/artifact/org.scala-lang/scala-library/2.13.17)    Apache-2.0
```

## Running Kafka with your tests

The Testkit provides a variety of ways to test your application against a real Kafka broker or cluster using [Testcontainers (Docker)](testing-testcontainers.html).

The table below helps guide you to the right Testkit implementation depending on your programming language, testing framework, and use (or not) of Docker containers. You must mix in or implement these types into your test classes to use them. See the documentation for each for more details.

| Type | Test Framework | Cluster | Lang | Lifetime |
| --- | --- | --- | --- | --- |
| [`akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test`](testing-testcontainers.html#testing-with-a-docker-kafka-cluster-from-java-code) | JUnit 4 | Yes | Java | All tests, Per class |
| [`akka.kafka.testkit.javadsl.TestcontainersKafkaTest`](testing-testcontainers.html#testing-with-a-docker-kafka-cluster-from-java-code) | JUnit 5 | Yes | Java | All tests, Per class |
| [`akka.kafka.testkit.scaladsl.TestcontainersKafkaLike`](testing-testcontainers.html#testing-with-a-docker-kafka-cluster-from-scala-code) | ScalaTest | Yes | Scala | All tests |
| [`akka.kafka.testkit.scaladsl.TestcontainersKafkaPerClassLike`](testing-testcontainers.html#testing-with-a-docker-kafka-cluster-from-scala-code) | ScalaTest | Yes | Scala | Per class |

## Alternative testing libraries

If using Maven and Java, an alternative library that provides running Kafka broker instance during testing is [kafka\-unit by salesforce](https://github.com/salesforce/kafka-junit). It has support for Junit 4 and 5 and supports many different versions of Kafka.

## Mocking the Consumer or Producer

The testkit contains factories to create the messages emitted by Consumer sources in `akka.kafka.testkit.ConsumerResultFactory` and Producer flows in `akka.kafka.testkit.ProducerResultFactory`.

To create the materialized value of Consumer sources, [`ConsumerControlFactory`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/ConsumerControlFactory$.html "akka.kafka.testkit.javadsl.ConsumerControlFactory")[`ConsumerControlFactory`](/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/ConsumerControlFactory$.html "akka.kafka.testkit.scaladsl.ConsumerControlFactory") offers a wrapped [`KillSwitch`](https://doc.akka.io/api/akka/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch")[`KillSwitch`](https://doc.akka.io/japi/akka/2.10/akka/stream/KillSwitch.html "akka.stream.KillSwitch").

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/TestkitSamplesSpec.scala#L42-L81 "Go to snippet source")import akka.kafka.testkit.scaladsl.ConsumerControlFactory
import akka.kafka.testkit.{ConsumerResultFactory, ProducerResultFactory}

// create elements emitted by the mocked Consumer
val elements = (0 to 10).map { i =>
  val nextOffset = startOffset + i
  ConsumerResultFactory.committableMessage(
    new ConsumerRecord(topic, partition, nextOffset, "key", s"value $i"),
    ConsumerResultFactory.committableOffset(groupId, topic, partition, nextOffset, s"metadata $i")
  )
}

// create a source imitating the Consumer.committableSource
val mockedKafkaConsumerSource: Source[ConsumerMessage.CommittableMessage[String, String], Consumer.Control] =
  Source(elements).viaMat(ConsumerControlFactory.controlFlow())(Keep.right)

// create a source imitating the Producer.flexiFlow
val mockedKafkaProducerFlow: Flow[ProducerMessage.Envelope[String, String, CommittableOffset],
                                  ProducerMessage.Results[String, String, CommittableOffset],
                                  NotUsed] =
  Flow[ProducerMessage.Envelope[String, String, CommittableOffset]]
    .map {
      case msg: ProducerMessage.Message[String, String, CommittableOffset] =>
        ProducerResultFactory.result(msg)
      case other => throw new Exception(s"excluded: $other")
    }

// run the flow as if it was connected to a Kafka broker
val (control, streamCompletion) = mockedKafkaConsumerSource
  .map(
    msg =>
      ProducerMessage.Message(
        new ProducerRecord[String, String](targetTopic, msg.record.value),
        msg.committableOffset
      )
  )
  .via(mockedKafkaProducerFlow)
  .map(_.passThrough)
  .toMat(Committer.sink(committerSettings))(Keep.both)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/TestkitSamplesTest.java#L32-L119 "Go to snippet source")import akka.kafka.testkit.ConsumerResultFactory;
import akka.kafka.testkit.ProducerResultFactory;
import akka.kafka.testkit.javadsl.ConsumerControlFactory;

// create elements emitted by the mocked Consumer
List<ConsumerMessage.CommittableMessage<String, String>> elements =
    Arrays.asList(
        ConsumerResultFactory.committableMessage(
            new ConsumerRecord<>(topic, partition, startOffset, "key", "value 1"),
            ConsumerResultFactory.committableOffset(
                groupId, topic, partition, startOffset, "metadata")),
        ConsumerResultFactory.committableMessage(
            new ConsumerRecord<>(topic, partition, startOffset + 1, "key", "value 2"),
            ConsumerResultFactory.committableOffset(
                groupId, topic, partition, startOffset + 1, "metadata 2")));

// create a source imitating the Consumer.committableSource
Source<ConsumerMessage.CommittableMessage<String, String>, Consumer.Control>
    mockedKafkaConsumerSource =
        Source.cycle(elements::iterator)
            .viaMat(ConsumerControlFactory.controlFlow(), Keep.right());

// create a source imitating the Producer.flexiFlow
Flow<
        ProducerMessage.Envelope<String, String, ConsumerMessage.CommittableOffset>,
        ProducerMessage.Results<String, String, ConsumerMessage.CommittableOffset>,
        NotUsed>
    mockedKafkaProducerFlow =
        Flow
            .<ProducerMessage.Envelope<String, String, ConsumerMessage.CommittableOffset>>
                create()
            .map(
                msg -> {
                  if (msg instanceof ProducerMessage.Message) {
                    ProducerMessage.Message<String, String, ConsumerMessage.CommittableOffset>
                        msg2 =
                            (ProducerMessage.Message<
                                    String, String, ConsumerMessage.CommittableOffset>)
                                msg;
                    return ProducerResultFactory.result(msg2);
                  } else throw new RuntimeException("unexpected element: " + msg);
                });

// run the flow as if it was connected to a Kafka broker
Pair<Consumer.Control, CompletionStage<Done>> stream =
    mockedKafkaConsumerSource
        .map(
            msg -> {
              ProducerMessage.Envelope<String, String, ConsumerMessage.CommittableOffset>
                  message =
                      new ProducerMessage.Message<>(
                          new ProducerRecord<>(
                              targetTopic, msg.record().key(), msg.record().value()),
                          msg.committableOffset());
              return message;
            })
        .via(mockedKafkaProducerFlow)
        .map(ProducerMessage.Results::passThrough)
        .toMat(Committer.sink(committerSettings), Keep.both())
        .run(sys);
```

## Code Examples

### Example 1: Testing

```xml
<properties>
  <akka.version>2.10.11</akka.version>
  <scala.binary.version>2.13</scala.binary.version>
</properties>
<dependencies&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-kafka-testkit_${scala.binary.version}</artifactId>
    <version>8.0.1</version>
    <scope>test</scope>
  </dependency&gt
  <dependency>
    <groupId>com.typesafe.akka</groupId>
    <artifactId>akka-stream-testkit_${scala.binary.version}</artifactId>
    <version>${akka.version}</version>
    <scope>test</scope>
  </dependency&gt
</dependencies>
```

### Example 2: Testing

```scala
val AkkaVersion = "2.10.11"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream-kafka-testkit" % "8.0.1" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % AkkaVersion % Test
)
```

### Example 3: Testing

```gradle
def versions = [
  AkkaVersion: "2.10.11",
  ScalaBinary: "2.13"
]
dependencies {
  testImplementation "com.typesafe.akka:akka-stream-kafka-testkit_${versions.ScalaBinary}:8.0.1"
  testImplementation "com.typesafe.akka:akka-stream-testkit_${versions.ScalaBinary}:${versions.AkkaVersion}"
}
```

### Example 4: Mocking the Consumer or Producer

```scala
import akka.kafka.testkit.scaladsl.ConsumerControlFactory
import akka.kafka.testkit.{ConsumerResultFactory, ProducerResultFactory}

// create elements emitted by the mocked Consumer
val elements = (0 to 10).map { i =>
  val nextOffset = startOffset + i
  ConsumerResultFactory.committableMessage(
    new ConsumerRecord(topic, partition, nextOffset, "key", s"value $i"),
    ConsumerResultFactory.committableOffset(groupId, topic, partition, nextOffset, s"metadata $i")
  )
}

// create a source imitating the Consumer.committableSource
val mockedKafkaConsumerSource: Source[ConsumerMessage.CommittableMessage[String, String], Consumer.Control] =
  Source(elements).viaMat(ConsumerControlFactory.controlFlow())(Keep.right)

// create a source imitating the Producer.flexiFlow
val mockedKafkaProducerFlow: Flow[ProducerMessage.Envelope[String, String, CommittableOffset],
                                  ProducerMessage.Results[String, String, CommittableOffset],
                                  NotUsed] =
  Flow[ProducerMessage.Envelope[String, String, CommittableOffset]]
    .map {
      case msg: ProducerMessage.Message[String, String, CommittableOffset] =>
        ProducerResultFactory.result(msg)
      case other => throw new Exception(s"excluded: $other")
    }

// run the flow as if it was connected to a Kafka broker
val (control, streamCompletion) = mockedKafkaConsumerSource
  .map(
    msg =>
      ProducerMessage.Message(
        new ProducerRecord[String, String](targetTopic, msg.record.value),
        msg.committableOffset
      )
  )
  .via(mockedKafkaProducerFlow)
  .map(_.passThrough)
  .toMat(Committer.sink(committerSettings))(Keep.both)
  .run()
```

### Example 5: Mocking the Consumer or Producer

```java
import akka.kafka.testkit.ConsumerResultFactory;
import akka.kafka.testkit.ProducerResultFactory;
import akka.kafka.testkit.javadsl.ConsumerControlFactory;

// create elements emitted by the mocked Consumer
List<ConsumerMessage.CommittableMessage<String, String>> elements =
    Arrays.asList(
        ConsumerResultFactory.committableMessage(
            new ConsumerRecord<>(topic, partition, startOffset, "key", "value 1"),
            ConsumerResultFactory.committableOffset(
                groupId, topic, partition, startOffset, "metadata")),
        ConsumerResultFactory.committableMessage(
            new ConsumerRecord<>(topic, partition, startOffset + 1, "key", "value 2"),
            ConsumerResultFactory.committableOffset(
                groupId, topic, partition, startOffset + 1, "metadata 2")));

// create a source imitating the Consumer.committableSource
Source<ConsumerMessage.CommittableMessage<String, String>, Consumer.Control>
    mockedKafkaConsumerSource =
        Source.cycle(elements::iterator)
            .viaMat(ConsumerControlFactory.controlFlow(), Keep.right());

// create a source imitating the Producer.flexiFlow
Flow<
        ProducerMessage.Envelope<String, String, ConsumerMessage.CommittableOffset>,
        ProducerMessage.Results<String, String, ConsumerMessage.CommittableOffset>,
        NotUsed>
    mockedKafkaProducerFlow =
        Flow
            .<ProducerMessage.Envelope<String, String, ConsumerMessage.CommittableOffset>>
                create()
            .map(
                msg -> {
                  if (msg instanceof ProducerMessage.Message) {
                    ProducerMessage.Message<String, String, ConsumerMessage.CommittableOffset>
                        msg2 =
                            (ProducerMessage.Message<
                                    String, String, ConsumerMessage.CommittableOffset>)
                                msg;
                    return ProducerResultFactory.result(msg2);
                  } else throw new RuntimeException("unexpected element: " + msg);
                });

// run the flow as if it was connected to a Kafka broker
Pair<Consumer.Control, CompletionStage<Done>> stream =
    mockedKafkaConsumerSource
        .map(
            msg -> {
              ProducerMessage.Envelope<String, String, ConsumerMessage.CommittableOffset>
                  message =
                      new ProducerMessage.Message<>(
                          new ProducerRecord<>(
                              targetTopic, msg.record().key(), msg.record().value()),
                          msg.committableOffset());
              return message;
            })
        .via(mockedKafkaProducerFlow)
        .map(ProducerMessage.Results::passThrough)
        .toMat(Committer.sink(committerSettings), Keep.both())
        .run(sys);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/stream/KillSwitch.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/javadsl/ConsumerControlFactory$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/scaladsl/ConsumerControlFactory$.html
- https://doc.akka.io/docs/akka-dependencies/current/support-terminology.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/KillSwitch.html
- https://doc.akka.io/libraries/alpakka-kafka/current
- https://doc.akka.io/libraries/alpakka-kafka/current/debugging.html
- https://doc.akka.io/libraries/alpakka-kafka/current/release-notes/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/snapshots.html
- https://doc.akka.io/libraries/alpakka-kafka/current/testing-testcontainers.html
- https://doc.akka.io/libraries/alpakka-kafka/current/testing.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/testing.html](https://doc.akka.io/libraries/alpakka-kafka/current/testing.html)*