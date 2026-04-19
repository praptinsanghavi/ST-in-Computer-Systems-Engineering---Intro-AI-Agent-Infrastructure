---
description: Access Kafka consumer metadata by sending messages to the actor provided
  by Alpakka Kafka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:26Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/consumer-metadata.html
title: Consumer Metadata • Alpakka Kafka Documentation
---

# Consumer Metadata • Alpakka Kafka Documentation

> **Summary:** Access Kafka consumer metadata by sending messages to the actor provided by Alpakka Kafka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Consumer Metadata

## Metadata Client

`MetadataClient` is a thin wrapper for [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor") hiding the ask calls and mapping to the correct response types.

To access the Kafka consumer metadata you need to create the [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor") as described in the [Consumer documentation](consumer.html#sharing-the-kafkaconsumer-instance) pass it to `MetadataClient`’s factory method `create`.

Another approach to create metadata client is passing the `ConsumerSettings` and `ActorSystem` objects to the factory method. Then the metadata client manages the internal actor and stops it when the `close` method is called.

The metadata the `MetadataClient` provides is documented in the [`Kafka Consumer API`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html "org.apache.kafka.clients.consumer.KafkaConsumer") API.

## Supported metadata by MetadataClient

The supported metadata are

| Metadata | Response type |
| --- | --- |
| Topics list | Future\[Map\[String, List\[PartitionInfo]]]CompletionStage\[java.util.Map\[java.lang.String, java.util.List\[PartitionInfo]]] |
| Partitions | Future\[List\[PartitionInfo]]CompletionStage\[java.util.List\[PartitionInfo]] |
| Beginning offsets | Future\[Map\[TopicPartition, Long]]CompletionStage\[java.util.Map\[TopicPartition, java.lang.Long]] |
| End offsets | Future\[Map\[TopicPartition, Long]]CompletionStage\[java.util.Map\[TopicPartition, java.lang.Long]] |
| Committed offsets | Future\[Map\[TopicPartition, OffsetAndMetadata]]CompletionStage\[java.util.Map\[TopicPartition, OffsetAndMetadata]] |

Warning
Processing of these requests blocks the actor loop. The [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor") is configured to run on its own dispatcher, so just as the other remote calls to Kafka, the blocking happens within a designated thread pool.

However, calling these during consuming might affect performance and even cause timeouts in extreme cases.

Please consider to use a dedicated [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor") to create metadata client requests against.

Example:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/FetchMetadata.scala#L16-L78 "Go to snippet source")import akka.actor.ActorRef
import akka.kafka.{KafkaConsumerActor, Metadata}
import akka.pattern.ask
import akka.util.Timeout
import org.apache.kafka.common.TopicPartition

import scala.concurrent.Future
import scala.concurrent.duration._

val metadataClient = MetadataClient.create(consumerSettings, 1.second)

val beginningOffsets = metadataClient
  .getBeginningOffsets(Set(partition0))
  .futureValue
metadataClient.close()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/MetadataClientTest.java#L9-L75 "Go to snippet source")import static java.util.stream.Collectors.toSet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;

import akka.actor.ActorSystem;
import akka.kafka.ConsumerSettings;
import akka.kafka.javadsl.MetadataClient;
import akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test;
import akka.kafka.tests.javadsl.LogCapturingJunit4;
import akka.testkit.javadsl.TestKit;
import akka.util.Timeout;
final TopicPartition partition = new TopicPartition(topic1, 0);
final ConsumerSettings<String, String> consumerSettings =
    consumerDefaults().withGroupId(group1);
final Set<TopicPartition> partitions = Collections.singleton(partition);
final MetadataClient metadataClient =
    MetadataClient.create(consumerSettings, timeout, sys, executor);

final CompletionStage<Map<TopicPartition, Long>> response =
    metadataClient.getBeginningOffsets(partitions);
final Map<TopicPartition, Long> beginningOffsets = response.toCompletableFuture().join();
metadataClient.close();
```

## Accessing metadata using KafkaConsumerActor

To access the Kafka consumer metadata you need to create the [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor") as described in the [Consumer documentation](consumer.html#sharing-the-kafkaconsumer-instance) and send messages from [`Metadata`](/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$.html "akka.kafka.Metadata")[`Metadata`](/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$.html "akka.kafka.Metadata") to it.

## Supported metadata by KafkaConsumerActor

The supported metadata are

| Request | Reply |
| --- | --- |
| ListTopics | Topics |
| GetPartitionsFor | PartitionsFor |
| GetBeginningOffsets | BeginningOffsets |
| GetEndOffsets | EndOffsets |
| GetOffsetsForTimes | OffsetsForTimes |
| GetCommittedOffsets | CommittedOffsets |

These requests are blocking within the Kafka client library up to a timeout configured by `metadata-request-timeout` or `ConsumerSettings.withMetadataRequestTimeout` respectively.

Warning
Accessing the Kafka consumer metadata using the `KafkaConsumerActor` is not a recommended approach. It is reasonable only when you need to perform a request `GetOffsetsForTimes` which is not supported by the `MetadataClient` yet.

Example:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/FetchMetadata.scala#L16-L53 "Go to snippet source")import akka.actor.ActorRef
import akka.kafka.{KafkaConsumerActor, Metadata}
import akka.pattern.ask
import akka.util.Timeout
import org.apache.kafka.common.TopicPartition

import scala.concurrent.Future
import scala.concurrent.duration._

val timeout: FiniteDuration = 5.seconds
val settings = consumerSettings.withMetadataRequestTimeout(timeout)
implicit val askTimeout = Timeout(timeout)

val consumer: ActorRef = system.actorOf(KafkaConsumerActor.props(settings))

val topicsFuture: Future[Metadata.Topics] = (consumer ? Metadata.ListTopics).mapTo[Metadata.Topics]

topicsFuture.map(_.response.foreach { map =>
  println("Found topics:")
  map.foreach {
    case (topic, partitionInfo) =>
      partitionInfo.foreach { info =>
        println(s"  $topic: $info")
      }
  }
})
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/FetchMetadataTest.java#L9-L80 "Go to snippet source")import akka.actor.ActorRef;
import akka.kafka.ConsumerSettings;
import akka.kafka.KafkaConsumerActor;
import akka.kafka.Metadata;
import akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test;
import akka.kafka.tests.javadsl.LogCapturingJunit4;
import akka.pattern.Patterns;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import org.apache.kafka.common.PartitionInfo;

Duration timeout = Duration.ofSeconds(2);
ConsumerSettings<String, String> settings =
    consumerSettings.withMetadataRequestTimeout(timeout);

ActorRef consumer = system().actorOf((KafkaConsumerActor.props(settings)));

CompletionStage<Metadata.Topics> topicsStage =
    Patterns.ask(consumer, Metadata.createListTopics(), timeout)
        .thenApply(reply -> ((Metadata.Topics) reply));

// convert response
CompletionStage<Optional<List<String>>> response =
    topicsStage
        .thenApply(Metadata.Topics::getResponse)
        .thenApply(
            responseOptional ->
                responseOptional.map(
                    map ->
                        map.entrySet().stream()
                            .flatMap(
                                entry -> {
                                  String topic = entry.getKey();
                                  List<PartitionInfo> partitionInfos = entry.getValue();
                                  return partitionInfos.stream()
                                      .map(info -> topic + ": " + info.toString());
                                })
                            .collect(Collectors.toList())));

```

## Code Examples

### Example 1: Supported metadata by MetadataClient

```scala
import akka.actor.ActorRef
import akka.kafka.{KafkaConsumerActor, Metadata}
import akka.pattern.ask
import akka.util.Timeout
import org.apache.kafka.common.TopicPartition

import scala.concurrent.Future
import scala.concurrent.duration._

val metadataClient = MetadataClient.create(consumerSettings, 1.second)

val beginningOffsets = metadataClient
  .getBeginningOffsets(Set(partition0))
  .futureValue
metadataClient.close()
```

### Example 2: Supported metadata by MetadataClient

```java
import static java.util.stream.Collectors.toSet;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.core.Is.is;

import akka.actor.ActorSystem;
import akka.kafka.ConsumerSettings;
import akka.kafka.javadsl.MetadataClient;
import akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test;
import akka.kafka.tests.javadsl.LogCapturingJunit4;
import akka.testkit.javadsl.TestKit;
import akka.util.Timeout;
final TopicPartition partition = new TopicPartition(topic1, 0);
final ConsumerSettings<String, String> consumerSettings =
    consumerDefaults().withGroupId(group1);
final Set<TopicPartition> partitions = Collections.singleton(partition);
final MetadataClient metadataClient =
    MetadataClient.create(consumerSettings, timeout, sys, executor);

final CompletionStage<Map<TopicPartition, Long>> response =
    metadataClient.getBeginningOffsets(partitions);
final Map<TopicPartition, Long> beginningOffsets = response.toCompletableFuture().join();
metadataClient.close();
```

### Example 3: Supported metadata by KafkaConsumerActor

```scala
import akka.actor.ActorRef
import akka.kafka.{KafkaConsumerActor, Metadata}
import akka.pattern.ask
import akka.util.Timeout
import org.apache.kafka.common.TopicPartition

import scala.concurrent.Future
import scala.concurrent.duration._

val timeout: FiniteDuration = 5.seconds
val settings = consumerSettings.withMetadataRequestTimeout(timeout)
implicit val askTimeout = Timeout(timeout)

val consumer: ActorRef = system.actorOf(KafkaConsumerActor.props(settings))

val topicsFuture: Future[Metadata.Topics] = (consumer ? Metadata.ListTopics).mapTo[Metadata.Topics]

topicsFuture.map(_.response.foreach { map =>
  println("Found topics:")
  map.foreach {
    case (topic, partitionInfo) =>
      partitionInfo.foreach { info =>
        println(s"  $topic: $info")
      }
  }
})
```

### Example 4: Supported metadata by KafkaConsumerActor

```java
import akka.actor.ActorRef;
import akka.kafka.ConsumerSettings;
import akka.kafka.KafkaConsumerActor;
import akka.kafka.Metadata;
import akka.kafka.testkit.javadsl.TestcontainersKafkaJunit4Test;
import akka.kafka.tests.javadsl.LogCapturingJunit4;
import akka.pattern.Patterns;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import org.apache.kafka.common.PartitionInfo;

Duration timeout = Duration.ofSeconds(2);
ConsumerSettings<String, String> settings =
    consumerSettings.withMetadataRequestTimeout(timeout);

ActorRef consumer = system().actorOf((KafkaConsumerActor.props(settings)));

CompletionStage<Metadata.Topics> topicsStage =
    Patterns.ask(consumer, Metadata.createListTopics(), timeout)
        .thenApply(reply -> ((Metadata.Topics) reply));

// convert response
CompletionStage<Optional<List<String>>> response =
    topicsStage
        .thenApply(Metadata.Topics::getResponse)
        .thenApply(
            responseOptional ->
                responseOptional.map(
                    map ->
                        map.entrySet().stream()
                            .flatMap(
                                entry -> {
                                  String topic = entry.getKey();
                                  List<PartitionInfo> partitionInfos = entry.getValue();
                                  return partitionInfos.stream()
                                      .map(info -> topic + ": " + info.toString());
                                })
                            .collect(Collectors.toList())));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer-rebalance.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer.html
- https://doc.akka.io/docs/alpakka-kafka/current/discovery.html

---
*Source: [https://doc.akka.io/docs/alpakka-kafka/current/consumer-metadata.html](https://doc.akka.io/docs/alpakka-kafka/current/consumer-metadata.html)*