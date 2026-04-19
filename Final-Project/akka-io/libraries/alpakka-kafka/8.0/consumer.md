---
description: Consume messages from Apache Kafka in Akka Streams sources and their
  commit offsets to Kafka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:38:57Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html
title: Consumer • Alpakka Kafka Documentation
---

# Consumer • Alpakka Kafka Documentation

> **Summary:** Consume messages from Apache Kafka in Akka Streams sources and their commit offsets to Kafka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Consumer

A consumer subscribes to Kafka topics and passes the messages into an Akka Stream.

The underlying implementation is using the `KafkaConsumer`, see [`Kafka API`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html "org.apache.kafka.clients.consumer.KafkaConsumer") for a description of consumer groups, offsets, and other details.

## Choosing a consumer

Alpakka Kafka offers a large variety of consumers that connect to Kafka and stream data. The tables below may help you to find the consumer best suited for your use\-case.

### Consumers

These factory methods are part of the [`Consumer`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") API.

| Offsets handling | Partition aware | Subscription | Shared consumer | Factory method | Stream element type |
| --- | --- | --- | --- | --- | --- |
| No (auto commit can be enabled) | No | Topic or Partition | No | `plainSource` | `ConsumerRecord` |
| No (auto commit can be enabled) | No | Partition | Yes | `plainExternalSource` | `ConsumerRecord` |
| Explicit committing | No | Topic or Partition | No | `committableSource` | `CommittableMessage` |
| Explicit committing | No | Partition | Yes | `committableExternalSource` | `CommittableMessage` |
| Explicit committing with metadata | No | Topic or Partition | No | `commitWithMetadataSource` | `CommittableMessage` |
| Explicit committing (with metadata) | No | Topic or Partition | No | `sourceWithOffsetContext` | `ConsumerRecord` |
| Offset committed per element | No | Topic or Partition | No | `atMostOnceSource` | `ConsumerRecord` |
| No (auto commit can be enabled) | Yes | Topic or Partition | No | `plainPartitionedSource` | `(TopicPartition, Source[ConsumerRecord, ..])` |
| External to Kafka | Yes | Topic or Partition | No | `plainPartitionedManualOffsetSource` | `(TopicPartition, Source[ConsumerRecord, ..])` |
| Explicit committing | Yes | Topic or Partition | No | `committablePartitionedSource` | `(TopicPartition, Source[CommittableMessage, ..])` |
| External to Kafka \& Explicit Committing | Yes | Topic or Partition | No | `committablePartitionedManualOffsetSource` | `(TopicPartition, Source[CommittableMessage, ..])` |
| Explicit committing with metadata | Yes | Topic or Partition | No | `commitWithMetadataPartitionedSource` | `(TopicPartition, Source[CommittableMessage, ..])` |

### Transactional consumers

These factory methods are part of the [`Transactional`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional"). For details see [Transactions](transactions.html).

| Offsets handling | Partition aware | Shared consumer | Factory method | Stream element type |
| --- | --- | --- | --- | --- |
| Transactional | No | No | `Transactional.source` | `TransactionalMessage` |
| Transactional | No | No | `Transactional.sourceWithOffsetContext` | `ConsumerRecord` |

## Settings

When creating a consumer source you need to pass in [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings")[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings") that define things like:

- de\-serializers for the keys and values
- bootstrap servers of the Kafka cluster (see [Service discovery](discovery.html) to defer the server configuration)
- group id for the consumer, note that offsets are always committed for a given consumer group
- Kafka consumer tuning parameters
- assignment strategies

Alpakka Kafka’s defaults for all settings are defined in `reference.conf` which is included in the library JAR.

Important consumer settings

| Setting | Description |
| --- | --- |
| stop\-timeout | The stage will delay stopping the internal actor to allow processing of messages already in the stream (required for successful committing). This can be set to 0 for streams using [`Consumer.DrainingControl`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$DrainingControl.html "akka.kafka.javadsl.Consumer.DrainingControl")[`Consumer.DrainingControl`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl.html "akka.kafka.scaladsl.Consumer.DrainingControl") |
| kafka\-clients | Section for properties passed unchanged to the Kafka client (see [Kafka’s Consumer Configs](https://kafka.apache.org/41/documentation.html#consumerconfigs)) |
| connection\-checker | Configuration to let the stream fail if the connection to the Kafka broker fails. |

Explicitly selecting a [Consumer Assignment Strategy](https://kafka.apache.org/documentation/#consumerconfigs_partition.assignment.strategy) such as [`CooperativeStickyAssignor`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/CooperativeStickyAssignor.html "org.apache.kafka.clients.consumer.CooperativeStickyAssignor") is recommended. They were introduced in [Kafka 3\.0](https://kafka.apache.org/33/documentation.html#upgrade_300_notable). Please check the [Kafka upgrade guide](https://cwiki.apache.org/confluence/display/KAFKA/KIP-429:+Kafka+Consumer+Incremental+Rebalance+Protocol#KIP429:KafkaConsumerIncrementalRebalanceProtocol-Consumer) before changing it.

reference.conf (HOCON)
 

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/resources/reference.conf#L56-L175 "Go to snippet source")# Properties for akka.kafka.ConsumerSettings can be
# defined in this section or a configuration section with
# the same layout.
akka.kafka.consumer {
  # Config path of Akka Discovery method
  # "akka.discovery" to use the Akka Discovery method configured for the ActorSystem
  discovery-method = akka.discovery

  # Set a service name for use with Akka Discovery
  # https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
  service-name = ""

  # Timeout for getting a reply from the discovery-method lookup
  resolve-timeout = 3 seconds

  # Tuning property of scheduled polls.
  # Controls the interval from one scheduled poll to the next.
  poll-interval = 50ms

  # Tuning property of the `KafkaConsumer.poll` parameter.
  # Note that non-zero value means that the thread that
  # is executing the stage will be blocked. See also the `wakup-timeout` setting below.
  poll-timeout = 50ms

  # The stage will delay stopping the internal actor to allow processing of
  # messages already in the stream (required for successful committing).
  # This can be set to 0 for streams using `DrainingControl`.
  stop-timeout = 30s

  # Duration to wait for `KafkaConsumer.close` to finish.
  close-timeout = 20s

  # If offset commit requests are not completed within this timeout
  # the returned Future is completed `CommitTimeoutException`.
  # The `Transactional.source` waits this ammount of time for the producer to mark messages as not
  # being in flight anymore as well as waiting for messages to drain, when rebalance is triggered.
  commit-timeout = 15s

  # If commits take longer than this time a warning is logged
  commit-time-warning = 1s

  # For transactional flows only, how often to push consumer group metadata to the producers
  # a shorter interval makes the risk of dropping batched elements smaller but at the cost
  # of more work sending those updates
  consumer-group-update-interval = 100ms

  # Not relevant for Kafka after version 2.1.0.
  # If set to a finite duration, the consumer will re-send the last committed offsets periodically
  # for all assigned partitions. See https://issues.apache.org/jira/browse/KAFKA-4682.
  commit-refresh-interval = infinite

  # Fully qualified config path which holds the dispatcher configuration
  # to be used by the KafkaConsumerActor. Some blocking may occur.
  use-dispatcher = "akka.kafka.default-dispatcher"

  # Properties defined by org.apache.kafka.clients.consumer.ConsumerConfig
  # can be defined in this configuration section.
  kafka-clients {
    # Disable auto-commit by default
    enable.auto.commit = false
  }

  # Time to wait for pending requests when a partition is closed
  wait-close-partition = 500ms

  # Limits the query to Kafka for a topic's position
  position-timeout = 5s

  # When using `AssignmentOffsetsForTimes` subscriptions: timeout for the
  # call to Kafka's API
  offset-for-times-timeout = 5s

  # Timeout for akka.kafka.Metadata requests
  # This value is used instead of Kafka's default from `default.api.timeout.ms`
  # which is 1 minute.
  metadata-request-timeout = 5s

  # Interval for checking that transaction was completed before closing the consumer.
  # Used in the transactional flow for exactly-once-semantics processing.
  eos-draining-check-interval = 30ms

  # Issue warnings when a call to a partition assignment handler method takes
  # longer than this.
  partition-handler-warning = 5s

  # Settings for checking the connection to the Kafka broker. Connection checking uses `listTopics` requests with the timeout
  # configured by `consumer.metadata-request-timeout`
  connection-checker {

    #Flag to turn on connection checker
    enable = false

    # Amount of attempts to be performed after a first connection failure occurs
    # Required, non-negative integer
    max-retries = 3

    # Interval for the connection check. Used as the base for exponential retry.
    check-interval = 15s

    # Check interval multiplier for backoff interval
    # Required, positive number
    backoff-factor = 2.0
  }

  # Protect against server-side bugs that cause Kafka to temporarily "lose" the latest offset for a consumer, which
  # then causes the Kafka consumer to follow its normal 'auto.offset.reset' behavior. For 'earliest', these settings
  # allow the client to detect and attempt to recover from this issue. For 'none' and 'latest', these settings will
  # only add overhead. See
  # for more information
  offset-reset-protection {
    # turns on reset protection
    enable = false
    # if consumer gets a record with an offset that is more than this number of offsets back from the previously
    # requested offset, it is considered a reset
    offset-threshold = 9223372036854775807
    # if the record is more than this duration earlier the last received record, it is considered a reset
    time-threshold = 100000 days
  }
}
```

The Kafka documentation [Consumer Configs](https://kafka.apache.org/41/documentation.html#consumerconfigs) lists the settings, their defaults and importance. More detailed explanations are given in the [`KafkaConsumer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html "org.apache.kafka.clients.consumer.KafkaConsumer") API and constants are defined in [`ConsumerConfig`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/ConsumerConfig.html "org.apache.kafka.clients.consumer.ConsumerConfig") API.

### Programmatic construction

Stream\-specific settings like the de\-serializers and consumer group ID should be set programmatically. Settings that apply to many consumers may be set in `application.conf` or use [config inheritance](consumer.html#config-inheritance).

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L87-L92 "Go to snippet source")val config = system.settings.config.getConfig("akka.kafka.consumer")
val consumerSettings =
  ConsumerSettings(config, new StringDeserializer, new ByteArrayDeserializer)
    .withBootstrapServers(bootstrapServers)
    .withGroupId("group1")
    .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L88-L93 "Go to snippet source")final Config config = system.settings().config().getConfig("akka.kafka.consumer");
final ConsumerSettings<String, byte[]> consumerSettings =
    ConsumerSettings.create(config, new StringDeserializer(), new ByteArrayDeserializer())
        .withBootstrapServers("localhost:9092")
        .withGroupId("group1")
        .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
```

### Config inheritance

[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html "akka.kafka.ConsumerSettings")[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html "akka.kafka.ConsumerSettings") are created from configuration in `application.conf` (with defaults in `reference.conf`). The format of these settings files are described in the [HOCON Config Documentation](https://github.com/lightbend/config#using-hocon-the-json-superset). A recommended setup is to rely on config inheritance as below:

application.conf (HOCON)
 

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/resources/application.conf#L27-L31 "Go to snippet source")our-kafka-consumer: ${akka.kafka.consumer} {
  kafka-clients {
    bootstrap.servers = "kafka-host:9092"
  }
}
```

Read the settings that inherit the defaults from “akka.kafka.consumer” settings:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L110-L111 "Go to snippet source")val config = system.settings.config.getConfig("our-kafka-consumer")
val consumerSettings = ConsumerSettings(config, new StringDeserializer, new StringDeserializer)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L165-L167 "Go to snippet source")Config config = system.settings().config().getConfig("our-kafka-consumer");
ConsumerSettings<String, String> consumerSettings =
    ConsumerSettings.create(config, new StringDeserializer(), new StringDeserializer());
```

## Offset Storage external to Kafka

The Kafka read offset can either be stored in Kafka (see below), or at a data store of your choice.

[`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html#plainSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.javadsl.Consumer.Control] "akka.kafka.javadsl.Consumer")[`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html#plainSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control] "akka.kafka.scaladsl.Consumer") and [`Consumer.plainPartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html#plainPartitionedManualOffsetSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription,getOffsetsOnAssign:java.util.function.Function[java.util.Set[org.apache.kafka.common.TopicPartition],java.util.concurrent.CompletionStage[java.util.Map[org.apache.kafka.common.TopicPartition,Long]]]):akka.stream.javadsl.Source[akka.japi.Pair[org.apache.kafka.common.TopicPartition,akka.stream.javadsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]],akka.kafka.javadsl.Consumer.Control] "akka.kafka.javadsl.Consumer")[`Consumer.plainPartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html#plainPartitionedManualOffsetSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription,getOffsetsOnAssign:Set[org.apache.kafka.common.TopicPartition]=%3Escala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,Long]],onRevoke:Set[org.apache.kafka.common.TopicPartition]=%3EUnit):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control] "akka.kafka.scaladsl.Consumer") can be used to emit [`ConsumerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/ConsumerRecord.html "org.apache.kafka.clients.consumer.ConsumerRecord") elements as received from the underlying [`KafkaConsumer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html "org.apache.kafka.clients.consumer.KafkaConsumer"). They do not have support for committing offsets to Kafka. When using these Sources, either store an offset externally, or use auto\-commit (note that auto\-commit is disabled by default).

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L101-L103 "Go to snippet source")consumerSettings
  .withProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true")
  .withProperty(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "5000")
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L98-L101 "Go to snippet source")consumerSettings
    .withProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true")
    .withProperty(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "5000");

```

The consumer application doesn’t need to use Kafka’s built\-in offset storage, it can store offsets in a store of its own choosing. The primary use case for this is allowing the application to store both the offset and the results of the consumption in the same system in a way that both the results and offsets are stored atomically. This is not always possible, but when it is it will make the consumption fully atomic and give “exactly once” semantics that are stronger than the “at\-least\-once” semantics you get with Kafka’s offset commit functionality.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L41-L81 "Go to snippet source")  val db = new OffsetStore
  val control = db.loadOffset().map { fromOffset =>
    Consumer
      .plainSource(
        consumerSettings,
        Subscriptions.assignmentWithOffset(
          new TopicPartition(topic, /* partition = */ 0) -> fromOffset
        )
      )
      .mapAsync(1)(db.businessLogicAndStoreOffset)
      .toMat(Sink.seq)(DrainingControl.apply)
      .run()
  }

class OffsetStore {
  def businessLogicAndStoreOffset(record: ConsumerRecord[String, String]): Future[Done] = // ...
  def loadOffset(): Future[Long] = // ...
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L110-L159 "Go to snippet source")  final OffsetStorage db = new OffsetStorage();

  CompletionStage<Consumer.Control> controlCompletionStage =
      db.loadOffset()
          .thenApply(
              fromOffset ->
                  Consumer.plainSource(
                          consumerSettings,
                          Subscriptions.assignmentWithOffset(
                              new TopicPartition(topic, partition0), fromOffset))
                      .mapAsync(1, db::businessLogicAndStoreOffset)
                      .to(Sink.ignore())
                      .run(system));

class OffsetStorage {
  public CompletionStage<Done> businessLogicAndStoreOffset(
      ConsumerRecord<String, String> record) { // ... }
  public CompletionStage<Long> loadOffset() { // ... }
}

```

For [`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html#plainSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.javadsl.Consumer.Control] "akka.kafka.javadsl.Consumer")[`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html#plainSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control] "akka.kafka.scaladsl.Consumer") the [`Subscriptions.assignmentWithOffset`](/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html "akka.kafka.Subscriptions")[`Subscriptions.assignmentWithOffset`](/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html "akka.kafka.Subscriptions") specifies the starting point (offset) for a given consumer group id, topic and partition. The group id is defined in the [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html "akka.kafka.ConsumerSettings")[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html "akka.kafka.ConsumerSettings").

Alternatively, with [`Consumer.plainPartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.plainPartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer"), only the consumer group id and the topic are required on creation. The starting point is fetched by calling the `getOffsetsOnAssign` function passed in by the user. This function should return a `Map` of [`TopicPartition`](https://kafka.apache.org/41/javadoc/org/apache/kafka/common/TopicPartition.html "org.apache.kafka.common.TopicPartition") to `Long`, with the `Long` representing the starting point. If a consumer is assigned a partition that is not included in the `Map` that results from `getOffsetsOnAssign`, the default starting position will be used, according to the consumer configuration value `auto.offset.reset`. Also note that [`Consumer.plainPartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.plainPartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") emits tuples of assigned topic\-partition and a corresponding source, as in [Source per partition](#source-per-partition).

## Offset Storage in Kafka \- committing

The [`Consumer.committableSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.javadsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.javadsl.Consumer.Control] "akka.kafka.javadsl.Consumer")[`Consumer.committableSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.scaladsl.Consumer.Control] "akka.kafka.scaladsl.Consumer") makes it possible to commit offset positions to Kafka. Compared to auto\-commit this gives exact control of when a message is considered consumed.

This is useful when “at\-least\-once” delivery is desired, as each message will likely be delivered one time, but in failure cases could be received more than once.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L153-L170 "Go to snippet source")  val control =
    Consumer
      .committableSource(consumerSettings, Subscriptions.topics(topic))
      .mapAsync(10) { msg =>
        business(msg.record.key, msg.record.value).map(_ => msg.committableOffset)
      }
      .via(Committer.flow(committerDefaults.withMaxBatch(1)))
      .toMat(Sink.seq)(DrainingControl.apply)
      .run()

def business(key: String, value: Array[Byte]): Future[Done] = // ???

```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L190-L212 "Go to snippet source")CompletionStage<String> business(String key, String value) { // .... }
  Consumer.DrainingControl<Done> control =
      Consumer.committableSource(consumerSettings, Subscriptions.topics(topic))
          .mapAsync(
              1,
              msg ->
                  business(msg.record().key(), msg.record().value())
                      .thenApply(done -> msg.committableOffset()))
          .toMat(
              Committer.sink(committerSettings.withMaxBatch(1)), Consumer::createDrainingControl)
          .run(system);

```

Committing the offset for each message (`withMaxBatch(1)`) as illustrated above is rather slow. It is recommended to batch the commits for better throughput, in cases when upstream fails the `Committer` will try to commit the offsets collected before the error.

### Committer sink

You can use a pre\-defined [`Committer.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html "akka.kafka.javadsl.Committer")[`Committer.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Committer$.html "akka.kafka.scaladsl.Committer") to perform commits in batches:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L216-L226 "Go to snippet source")val committerSettings = CommitterSettings(system)

val control: DrainingControl[Done] =
  Consumer
    .committableSource(consumerSettings, Subscriptions.topics(topic))
    .mapAsync(1) { msg =>
      business(msg.record.key, msg.record.value)
        .map(_ => msg.committableOffset)
    }
    .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
    .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L225-L235 "Go to snippet source")CommitterSettings committerSettings = CommitterSettings.create(config);

Consumer.DrainingControl<Done> control =
    Consumer.committableSource(consumerSettings, Subscriptions.topics(topic))
        .mapAsync(
            1,
            msg ->
                business(msg.record().key(), msg.record().value())
                    .<ConsumerMessage.Committable>thenApply(done -> msg.committableOffset()))
        .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
        .run(system);
```

When creating a [`Committer.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html "akka.kafka.javadsl.Committer")[`Committer.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Committer$.html "akka.kafka.scaladsl.Committer") you need to pass in [`CommitterSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/CommitterSettings$.html "akka.kafka.CommitterSettings")[`CommitterSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/CommitterSettings$.html "akka.kafka.CommitterSettings"). These may be created by passing the actor system to read the defaults from the config section `akka.kafka.committer`, or by passing a [`Config`](https://lightbend.github.io/config/latest/api/com/typesafe/config/Config.html "com.typesafe.config.Config") instance with the same structure.

Table

| Setting | Description | Default Value |
| --- | --- | --- |
| maxBatch | maximum number of messages to commit at once | 1000 |
| maxInterval | maximum interval between commits | 10 seconds |
| parallelism | maximum number of commit batches in flight | 100 |

reference.conf
 

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/resources/reference.conf#L179-L204 "Go to snippet source")# Properties for akka.kafka.CommitterSettings can be
# defined in this section or a configuration section with
# the same layout.
akka.kafka.committer {

  # Maximum number of messages in a single commit batch
  max-batch = 1000

  # Maximum interval between commits
  max-interval = 10s

  # Parallelsim for async committing
  parallelism = 100

  # API may change.
  # Delivery of commits to the internal actor
  # WaitForAck: Expect replies for commits, and backpressure the stream if replies do not arrive.
  # SendAndForget: Send off commits to the internal actor without expecting replies (experimental feature since 1.1)
  delivery = WaitForAck

  # API may change.
  # Controls when a `Committable` message is queued to be committed.
  # OffsetFirstObserved: When the offset of a message has been successfully produced.
  # NextOffsetObserved: When the next offset is observed.
  when = OffsetFirstObserved
}
```

All commit batches are aggregated internally and passed on to Kafka very often (in every poll cycle), the Committer settings configure how the stream sends the offsets to the internal actor which communicates with the Kafka broker. Increasing these values means that in case of a failure you may have to re\-process more messages.

If you use Kafka older than version 2\.1\.0 and consume from a topic with low activity, and possibly no messages arrive for more than 24 hours, consider enabling periodical commit refresh (`akka.kafka.consumer.commit-refresh-interval` configuration parameters), otherwise offsets might expire in the Kafka storage. This has been fixed in Kafka 2\.1\.0 (See [KAFKA\-4682](https://issues.apache.org/jira/browse/KAFKA-4682)).

#### Committer variants

These factory methods are part of the [`Committer`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html "akka.kafka.javadsl.Committer")[`Committer`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Committer$.html "akka.kafka.scaladsl.Committer").

| Factory method | Stream element type | Emits |
| --- | --- | --- |
| `sink` | `Committable` | N/A |
| `sinkWithOffsetContext` | Any (`CommittableOffset` in context) | N/A |
| `flow` | `Committable` | `Done` |
| `batchFlow` | `Committable` | `CommittableOffsetBatch` |
| `flowWithOffsetContext` | Any (`CommittableOffset` in context) | `NotUsed` (`CommittableOffsetBatch` in context) |

### Commit with meta\-data

The [`Consumer.commitWithMetadataSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.commitWithMetadataSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") allows you to add metadata to the committed offset based on the last consumed record.

Note that the first offset provided to the consumer during a partition assignment will not contain metadata. This offset can get committed due to a periodic commit refresh (`akka.kafka.consumer.commit-refresh-interval` configuration parameters) and the commit will not contain metadata.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L195-L206 "Go to snippet source")def metadataFromRecord(record: ConsumerRecord[String, String]): String =
  record.timestamp().toString

val control =
  Consumer
    .commitWithMetadataSource(consumerSettings, Subscriptions.topics(topic), metadataFromRecord)
    .mapAsync(1) { msg =>
      business(msg.record.key, msg.record.value)
        .map(_ => msg.committableOffset)
    }
    .toMat(Committer.sink(committerDefaults))(DrainingControl.apply)
    .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L248-L259 "Go to snippet source")Consumer.DrainingControl<Done> control =
    Consumer.commitWithMetadataSource(
            consumerSettings,
            Subscriptions.topics(topic),
            (record) -> Long.toString(record.timestamp()))
        .mapAsync(
            1,
            msg ->
                business(msg.record().key(), msg.record().value())
                    .thenApply(done -> msg.committableOffset()))
        .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
        .run(system);
```

## Offset Storage in Kafka \& external

In some cases you may wish to use external offset storage as your primary means to manage offsets, but also commit offsets to Kafka. This gives you all the benefits of controlling offsets described in [Offset Storage external to Kafka](consumer.html#offset-storage-external-to-kafka) and allows you to use tooling in the Kafka ecosystem to track consumer group lag. You can use the [`Consumer.committablePartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.committablePartitionedManualOffsetSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") source, which emits a [`ConsumerMessage.CommittableMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html "akka.kafka.ConsumerMessage.CommittableMessage")[`ConsumerMessage.CommittableMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html "akka.kafka.ConsumerMessage.CommittableMessage"), to seek to appropriate offsets on startup, do your processing, commit to external storage, and then commit offsets back to Kafka. This will only provide at\-least\-once guarantees for your consumer group lag monitoring because it’s possible for a failure between storing your offsets externally and committing to Kafka, but it will give you a more accurate representation of consumer group lag then when turning on auto commits with the `enable.auto.commit` consumer property.

## Consume “at\-most\-once”

If you commit the offset before processing the message you get “at\-most\-once” delivery semantics, this is provided by [`Consumer.atMostOnceSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.atMostOnceSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer"). However, `atMostOnceSource` **commits the offset for each message and that is rather slow**, batching of commits is recommended. If your “at\-most\-once” requirements are more relaxed, consider a [`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") and enable Kafka’s auto committing with `enable.auto.commit = true`.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L128-L143 "Go to snippet source")  val control: DrainingControl[immutable.Seq[Done]] =
    Consumer
      .atMostOnceSource(consumerSettings, Subscriptions.topics(topic))
      .mapAsync(1)(record => business(record.key, record.value()))
      .toMat(Sink.seq)(DrainingControl.apply)
      .run()

def business(key: String, value: String): Future[Done] = // ???
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L178-L183 "Go to snippet source")Consumer.Control control =
    Consumer.atMostOnceSource(consumerSettings, Subscriptions.topics(topic))
        .mapAsync(10, record -> business(record.key(), record.value()))
        .to(Sink.foreach(it -> System.out.println("Done with " + it)))
        .run(system);

```

## Consume “at\-least\-once”

How to achieve at\-least\-once delivery semantics is covered in [At\-Least\-Once Delivery](atleastonce.html).

## Connecting Producer and Consumer

For cases when you need to read messages from one topic, transform or enrich them, and then write to another topic you can use [`Consumer.committableSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.committableSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") and connect it to a [`Producer.committableSink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer.committableSink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer"). The `committableSink` will commit the offset back to the consumer regularly.

The `committableSink` accepts implementations [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope") that contain the offset to commit the consumption of the originating message (of type [`Committable`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html "akka.kafka.ConsumerMessage.Committable")[`Committable`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html "akka.kafka.ConsumerMessage.Committable")). See [Producing messages](producer.html#producing-messages) about different implementations of [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope").

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L241-L251 "Go to snippet source")val control =
  Consumer
    .committableSource(consumerSettings, Subscriptions.topics(topic1, topic2))
    .map { msg =>
      ProducerMessage.single(
        new ProducerRecord(targetTopic, msg.record.key, msg.record.value),
        msg.committableOffset
      )
    }
    .toMat(Producer.committableSink(producerSettings, committerSettings))(DrainingControl.apply)
    .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L275-L285 "Go to snippet source")Consumer.DrainingControl<Done> control =
    Consumer.committableSource(consumerSettings, Subscriptions.topics(topic1, topic2))
        .map(
            msg ->
                ProducerMessage.<String, String, ConsumerMessage.Committable>single(
                    new ProducerRecord<>(targetTopic, msg.record().key(), msg.record().value()),
                    msg.committableOffset()))
        .toMat(
            Producer.committableSink(producerSettings, committerSettings),
            Consumer::createDrainingControl)
        .run(system);
```

Note
There is a risk that something fails after publishing, but before committing, so `committableSink` has “at\-least\-once” delivery semantics.

To get delivery guarantees, please read about [transactions](transactions.html).

## Source per partition

[`Consumer.plainPartitionedSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.plainPartitionedSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") , [`Consumer.committablePartitionedSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.committablePartitionedSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer"), and [`Consumer.commitWithMetadataPartitionedSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.commitWithMetadataPartitionedSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") support tracking the automatic partition assignment from Kafka. When a topic\-partition is assigned to a consumer, this source will emit a tuple with the assigned topic\-partition and a corresponding source. When a topic\-partition is revoked, the corresponding source completes.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L298-L304 "Go to snippet source")val control = Consumer
  .committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
  .flatMapMerge(maxPartitions, _._2)
  .via(businessFlow)
  .map(_.committableOffset)
  .toMat(Committer.sink(committerDefaults))(DrainingControl.apply)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L334-L340 "Go to snippet source")Consumer.DrainingControl<Done> control =
    Consumer.committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
        .flatMapMerge(maxPartitions, Pair::second)
        .via(business())
        .map(msg -> msg.committableOffset())
        .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
        .run(system);
```

Separate streams per partition:

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L316-L326 "Go to snippet source")val control = Consumer
  .committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
  .mapAsyncUnordered(maxPartitions) {
    case (topicPartition, source) =>
      source
        .via(businessFlow)
        .map(_.committableOffset)
        .runWith(Committer.sink(committerSettings))
  }
  .toMat(Sink.ignore)(DrainingControl.apply)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L354-L367 "Go to snippet source")Consumer.DrainingControl<Done> control =
    Consumer.committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
        .mapAsyncUnordered(
            maxPartitions,
            pair -> {
              Source<ConsumerMessage.CommittableMessage<String, String>, NotUsed> source =
                  pair.second();
              return source
                  .via(business())
                  .map(message -> message.committableOffset())
                  .runWith(Committer.sink(committerSettings), system);
            })
        .toMat(Sink.ignore(), Consumer::createDrainingControl)
        .run(system);
```

## Sharing the KafkaConsumer instance

If you have many streams it can be more efficient to share the underlying [`KafkaConsumer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html "org.apache.kafka.clients.consumer.KafkaConsumer") instance. It is shared by creating a [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor"). You need to create the actor and stop it by sending `KafkaConsumerActor.Stop` when it is not needed any longer. You pass the classic [`ActorRef`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef") as a parameter to the [`Consumer`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") factory methods.

When using a typed [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") you can create the [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor") by using the Akka typed adapter to create a classic [`ActorRef`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef")[`ActorRef`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html "akka.actor.ActorRef"). Then you can carry on using the existing Alpakka Kafka API.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/PartitionExamples.scala#L90-L98 "Go to snippet source")// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._

//Consumer is represented by actor
val consumer: ActorRef =
  context.actorOf(KafkaConsumerActor.props(consumerSettings), "kafka-consumer-actor")
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L23-L386 "Go to snippet source")import akka.actor.typed.javadsl.Behaviors;

// Consumer is represented by actor
ActorRef consumer = Adapter.actorOf(ctx, KafkaConsumerActor.props(consumerSettings));
```

Using the [`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor")[`KafkaConsumerActor`](/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html "akka.kafka.KafkaConsumerActor").

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/PartitionExamples.scala#L41-L78 "Go to snippet source")//Consumer is represented by actor
val consumer: ActorRef = system.actorOf(KafkaConsumerActor.props(consumerSettings))

//Manually assign topic partition to it
val (controlPartition1, result1) = Consumer
  .plainExternalSource[String, Array[Byte]](
    consumer,
    Subscriptions.assignment(new TopicPartition(topic, partition1))
  )
  .via(businessFlow)
  .toMat(Sink.seq)(Keep.both)
  .run()

//Manually assign another topic partition
val (controlPartition2, result2) = Consumer
  .plainExternalSource[String, Array[Byte]](
    consumer,
    Subscriptions.assignment(new TopicPartition(topic, partition2))
  )
  .via(businessFlow)
  .toMat(Sink.seq)(Keep.both)
  .run()

// ....

              controlPartition1.shutdown()
              controlPartition2.shutdown()
consumer ! KafkaConsumerActor.Stop
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L392-L420 "Go to snippet source")// Consumer is represented by actor
ActorRef consumer = system.actorOf((KafkaConsumerActor.props(consumerSettings)));

// Manually assign topic partition to it
Consumer.Control controlPartition1 =
    Consumer.plainExternalSource(
            consumer, Subscriptions.assignment(new TopicPartition(topic, partition0)))
        .via(business())
        .to(Sink.ignore())
        .run(system);

// Manually assign another topic partition
Consumer.Control controlPartition2 =
    Consumer.plainExternalSource(
            consumer, Subscriptions.assignment(new TopicPartition(topic, partition1)))
        .via(business())
        .to(Sink.ignore())
        .run(system);

consumer.tell(KafkaConsumerActor.stop(), self);
```

## Accessing KafkaConsumer metrics

You can access the underlying consumer metrics via the materialized `Control` instance: 

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/PartitionExamples.scala#L112-L124 "Go to snippet source")val control: Consumer.Control = Consumer
  .plainSource(consumerSettings, Subscriptions.assignment(new TopicPartition(topic, partition)))
  .via(businessFlow)
  .to(Sink.ignore)
  .run()

val metrics: Future[Map[MetricName, Metric]] = control.metrics
metrics.foreach(map => println(s"metrics: ${map.mkString("\n")}"))
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L633-L649 "Go to snippet source")// run the stream to obtain the materialized Control value
Consumer.DrainingControl<Done> control =
    Consumer.plainSource(
            consumerSettings, Subscriptions.assignment(new TopicPartition(topic, 0)))
        .via(business())
        .toMat(Sink.ignore(), Consumer::createDrainingControl)
        .run(system);

CompletionStage<Map<MetricName, Metric>> metrics = control.getMetrics();
metrics.thenAccept(map -> System.out.println("Metrics: " + map));
```

## Accessing KafkaConsumer metadata

Accessing of Kafka consumer metadata is possible as described in [Consumer Metadata](consumer-metadata.html).

## Controlled shutdown

The [`Source`](https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html "akka.stream.javadsl.Source")[`Source`](https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html "akka.stream.scaladsl.Source") created with [`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.plainSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") and similar methods materializes to a [`Consumer.Control`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html "akka.kafka.javadsl.Consumer.Control")[`Consumer.Control`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html "akka.kafka.scaladsl.Consumer.Control") instance. This can be used to stop the stream in a controlled manner.

When using external offset storage, a call to `Consumer.Control.shutdown()` suffices to complete the `Source`, which starts the completion of the stream.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L503-L513 "Go to snippet source")val (consumerControl, streamComplete) =
  Consumer
    .plainSource(consumerSettings,
                 Subscriptions.assignmentWithOffset(
                   new TopicPartition(topic, 0) -> offset
                 ))
    .via(businessFlow)
    .toMat(Sink.ignore)(Keep.both)
    .run()

consumerControl.shutdown()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L660-L679 "Go to snippet source")final OffsetStorage db = new OffsetStorage();

CompletionStage<Consumer.DrainingControl<Done>> control =
    db.loadOffset()
        .thenApply(
            fromOffset ->
                Consumer.plainSource(
                        consumerSettings,
                        Subscriptions.assignmentWithOffset(
                            new TopicPartition(topic, 0), fromOffset))
                    .mapAsync(
                        10,
                        record ->
                            business(record.key(), record.value())
                                .thenApply(res -> db.storeProcessedOffset(record.offset())))
                    .toMat(Sink.ignore(), Consumer::createDrainingControl)
                    .run(system));

// Shutdown the consumer when desired
control.thenAccept(c -> c.drainAndShutdown(executor));
```

When you are using offset storage in Kafka, the shutdown process involves several steps:

1. `Consumer.Control.stop()` to stop producing messages from the `Source`. This does not stop the underlying Kafka Consumer.
2. Wait for the stream to complete, so that a commit request has been made for all offsets of all processed messages (via `Committer.sink/flow`, `commitScaladsl()` or `commitJavadsl()`).
3. `Consumer.Control.shutdown()` to wait for all outstanding commit requests to finish and stop the Kafka Consumer.

### Draining control

To manage this shutdown process, use the [`Consumer.DrainingControl`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$DrainingControl.html "akka.kafka.javadsl.Consumer.DrainingControl")[`Consumer.DrainingControl`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl.html "akka.kafka.scaladsl.Consumer.DrainingControl") by combining the [`Consumer.Control`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html "akka.kafka.javadsl.Consumer.Control")[`Consumer.Control`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html "akka.kafka.scaladsl.Consumer.Control") with the sink’s materialized completion future in `toMat` or in `mapMaterializedValue` with `DrainingControl.apply``Consumer::createDrainingControl`. That control offers the method `drainAndShutdown` which implements the process described above. The wrapped stream completion signal is available through the `streamCompletion``streamCompletion()` accessor.

Note: The [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings")[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings") `stop-timeout` delays stopping the Kafka Consumer and the stream, but when using `drainAndShutdown` that delay is not required and can be set to zero (as below).

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L523-L532 "Go to snippet source")val drainingControl =
  Consumer
    .committableSource(consumerSettings.withStopTimeout(Duration.Zero), Subscriptions.topics(topic))
    .mapAsync(1) { msg =>
      business(msg.record).map(_ => msg.committableOffset)
    }
    .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
    .run()

val streamComplete = drainingControl.drainAndShutdown()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L692-L714 "Go to snippet source")final Executor ec = Executors.newCachedThreadPool();

Consumer.DrainingControl<Done> control =
    Consumer.committableSource(
            consumerSettings.withStopTimeout(Duration.ZERO), Subscriptions.topics(topic))
        .mapAsync(
            1,
            msg ->
                business(msg.record().key(), msg.record().value())
                    .thenApply(done -> msg.committableOffset()))
        .toMat(
            Committer.sink(committerSettings.withMaxBatch(1)), Consumer::createDrainingControl)
        .run(system);

control.drainAndShutdown(ec);
```

## Code Examples

### Example 1: Settings

```conf
# Properties for akka.kafka.ConsumerSettings can be
# defined in this section or a configuration section with
# the same layout.
akka.kafka.consumer {
  # Config path of Akka Discovery method
  # "akka.discovery" to use the Akka Discovery method configured for the ActorSystem
  discovery-method = akka.discovery

  # Set a service name for use with Akka Discovery
  # https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
  service-name = ""

  # Timeout for getting a reply from the discovery-method lookup
  resolve-timeout = 3 seconds

  # Tuning property of scheduled polls.
  # Controls the interval from one scheduled poll to the next.
  poll-interval = 50ms

  # Tuning property of the `KafkaConsumer.poll` parameter.
  # Note that non-zero value means that the thread that
  # is executing the stage will be blocked. See also the `wakup-timeout` setting below.
  poll-timeout = 50ms

  # The stage will delay stopping the internal actor to allow processing of
  # messages already in the stream (required for successful committing).
  # This can be set to 0 for streams using `DrainingControl`.
  stop-timeout = 30s

  # Duration to wait for `KafkaConsumer.close` to finish.
  close-timeout = 20s

  # If offset commit requests are not completed within this timeout
  # the returned Future is completed `CommitTimeoutException`.
  # The `Transactional.source` waits this ammount of time for the producer to mark messages as not
  # being in flight anymore as well as waiting for messages to drain, when rebalance is triggered.
  commit-timeout = 15s

  # If commits take longer than this time a warning is logged
  commit-time-warning = 1s

  # For transactional flows only, how often to push consumer group metadata to the producers
  # a shorter interval makes the risk of dropping batched elements smaller but at the cost
  # of more work sending those updates
  consumer-group-update-interval = 100ms

  # Not relevant for Kafka after version 2.1.0.
  # If set to a finite duration, the consumer will re-send the last committed offsets periodically
  # for all assigned partitions. See https://issues.apache.org/jira/browse/KAFKA-4682.
  commit-refresh-interval = infinite

  # Fully qualified config path which holds the dispatcher configuration
  # to be used by the KafkaConsumerActor. Some blocking may occur.
  use-dispatcher = "akka.kafka.default-dispatcher"

  # Properties defined by org.apache.kafka.clients.consumer.ConsumerConfig
  # can be defined in this configuration section.
  kafka-clients {
    # Disable auto-commit by default
    enable.auto.commit = false
  }

  # Time to wait for pending requests when a partition is closed
  wait-close-partition = 500ms

  # Limits the query to Kafka for a topic's position
  position-timeout = 5s

  # When using `AssignmentOffsetsForTimes` subscriptions: timeout for the
  # call to Kafka's API
  offset-for-times-timeout = 5s

  # Timeout for akka.kafka.Metadata requests
  # This value is used instead of Kafka's default from `default.api.timeout.ms`
  # which is 1 minute.
  metadata-request-timeout = 5s

  # Interval for checking that transaction was completed before closing the consumer.
  # Used in the transactional flow for exactly-once-semantics processing.
  eos-draining-check-interval = 30ms

  # Issue warnings when a call to a partition assignment handler method takes
  # longer than this.
  partition-handler-warning = 5s

  # Settings for checking the connection to the Kafka broker. Connection checking uses `listTopics` requests with the timeout
  # configured by `consumer.metadata-request-timeout`
  connection-checker {

    #Flag to turn on connection checker
    enable = false

    # Amount of attempts to be performed after a first connection failure occurs
    # Required, non-negative integer
    max-retries = 3

    # Interval for the connection check. Used as the base for exponential retry.
    check-interval = 15s

    # Check interval multiplier for backoff interval
    # Required, positive number
    backoff-factor = 2.0
  }

  # Protect against server-side bugs that cause Kafka to temporarily "lose" the latest offset for a consumer, which
  # then causes the Kafka consumer to follow its normal 'auto.offset.reset' behavior. For 'earliest', these settings
  # allow the client to detect and attempt to recover from this issue. For 'none' and 'latest', these settings will
  # only add overhead. See
  # for more information
  offset-reset-protection {
    # turns on reset protection
    enable = false
    # if consumer gets a record with an offset that is more than this number of offsets back from the previously
    # requested offset, it is considered a reset
    offset-threshold = 9223372036854775807
    # if the record is more than this duration earlier the last received record, it is considered a reset
    time-threshold = 100000 days
  }
}
```

### Example 2: Programmatic construction

```scala
val config = system.settings.config.getConfig("akka.kafka.consumer")
val consumerSettings =
  ConsumerSettings(config, new StringDeserializer, new ByteArrayDeserializer)
    .withBootstrapServers(bootstrapServers)
    .withGroupId("group1")
    .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest")
```

### Example 3: Programmatic construction

```java
final Config config = system.settings().config().getConfig("akka.kafka.consumer");
final ConsumerSettings<String, byte[]> consumerSettings =
    ConsumerSettings.create(config, new StringDeserializer(), new ByteArrayDeserializer())
        .withBootstrapServers("localhost:9092")
        .withGroupId("group1")
        .withProperty(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
```

### Example 4: Config inheritance

```conf
our-kafka-consumer: ${akka.kafka.consumer} {
  kafka-clients {
    bootstrap.servers = "kafka-host:9092"
  }
}
```

### Example 5: Config inheritance

```scala
val config = system.settings.config.getConfig("our-kafka-consumer")
val consumerSettings = ConsumerSettings(config, new StringDeserializer, new StringDeserializer)
```

### Example 6: Config inheritance

```java
Config config = system.settings().config().getConfig("our-kafka-consumer");
ConsumerSettings<String, String> consumerSettings =
    ConsumerSettings.create(config, new StringDeserializer(), new StringDeserializer());
```

### Example 7: Offset Storage external to Kafka

```scala
consumerSettings
  .withProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true")
  .withProperty(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "5000")
```

### Example 8: Offset Storage external to Kafka

```java
consumerSettings
    .withProperty(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true")
    .withProperty(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "5000");
```

### Example 9: Offset Storage external to Kafka

```scala
val db = new OffsetStore
  val control = db.loadOffset().map { fromOffset =>
    Consumer
      .plainSource(
        consumerSettings,
        Subscriptions.assignmentWithOffset(
          new TopicPartition(topic, /* partition = */ 0) -> fromOffset
        )
      )
      .mapAsync(1)(db.businessLogicAndStoreOffset)
      .toMat(Sink.seq)(DrainingControl.apply)
      .run()
  }

class OffsetStore {
  def businessLogicAndStoreOffset(record: ConsumerRecord[String, String]): Future[Done] = // ...
  def loadOffset(): Future[Long] = // ...
}
```

### Example 10: Offset Storage external to Kafka

```java
final OffsetStorage db = new OffsetStorage();

  CompletionStage<Consumer.Control> controlCompletionStage =
      db.loadOffset()
          .thenApply(
              fromOffset ->
                  Consumer.plainSource(
                          consumerSettings,
                          Subscriptions.assignmentWithOffset(
                              new TopicPartition(topic, partition0), fromOffset))
                      .mapAsync(1, db::businessLogicAndStoreOffset)
                      .to(Sink.ignore())
                      .run(system));

class OffsetStorage {
  public CompletionStage<Done> businessLogicAndStoreOffset(
      ConsumerRecord<String, String> record) { // ... }
  public CompletionStage<Long> loadOffset() { // ... }
}
```

### Example 11: Offset Storage in Kafka - committing

```scala
val control =
    Consumer
      .committableSource(consumerSettings, Subscriptions.topics(topic))
      .mapAsync(10) { msg =>
        business(msg.record.key, msg.record.value).map(_ => msg.committableOffset)
      }
      .via(Committer.flow(committerDefaults.withMaxBatch(1)))
      .toMat(Sink.seq)(DrainingControl.apply)
      .run()

def business(key: String, value: Array[Byte]): Future[Done] = // ???
```

### Example 12: Offset Storage in Kafka - committing

```java
CompletionStage<String> business(String key, String value) { // .... }
  Consumer.DrainingControl<Done> control =
      Consumer.committableSource(consumerSettings, Subscriptions.topics(topic))
          .mapAsync(
              1,
              msg ->
                  business(msg.record().key(), msg.record().value())
                      .thenApply(done -> msg.committableOffset()))
          .toMat(
              Committer.sink(committerSettings.withMaxBatch(1)), Consumer::createDrainingControl)
          .run(system);
```

### Example 13: Committer sink

```scala
val committerSettings = CommitterSettings(system)

val control: DrainingControl[Done] =
  Consumer
    .committableSource(consumerSettings, Subscriptions.topics(topic))
    .mapAsync(1) { msg =>
      business(msg.record.key, msg.record.value)
        .map(_ => msg.committableOffset)
    }
    .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
    .run()
```

### Example 14: Committer sink

```java
CommitterSettings committerSettings = CommitterSettings.create(config);

Consumer.DrainingControl<Done> control =
    Consumer.committableSource(consumerSettings, Subscriptions.topics(topic))
        .mapAsync(
            1,
            msg ->
                business(msg.record().key(), msg.record().value())
                    .<ConsumerMessage.Committable>thenApply(done -> msg.committableOffset()))
        .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
        .run(system);
```

### Example 15: Committer sink

```conf
# Properties for akka.kafka.CommitterSettings can be
# defined in this section or a configuration section with
# the same layout.
akka.kafka.committer {

  # Maximum number of messages in a single commit batch
  max-batch = 1000

  # Maximum interval between commits
  max-interval = 10s

  # Parallelsim for async committing
  parallelism = 100

  # API may change.
  # Delivery of commits to the internal actor
  # WaitForAck: Expect replies for commits, and backpressure the stream if replies do not arrive.
  # SendAndForget: Send off commits to the internal actor without expecting replies (experimental feature since 1.1)
  delivery = WaitForAck

  # API may change.
  # Controls when a `Committable` message is queued to be committed.
  # OffsetFirstObserved: When the offset of a message has been successfully produced.
  # NextOffsetObserved: When the next offset is observed.
  when = OffsetFirstObserved
}
```

### Example 16: Commit with meta-data

```scala
def metadataFromRecord(record: ConsumerRecord[String, String]): String =
  record.timestamp().toString

val control =
  Consumer
    .commitWithMetadataSource(consumerSettings, Subscriptions.topics(topic), metadataFromRecord)
    .mapAsync(1) { msg =>
      business(msg.record.key, msg.record.value)
        .map(_ => msg.committableOffset)
    }
    .toMat(Committer.sink(committerDefaults))(DrainingControl.apply)
    .run()
```

### Example 17: Commit with meta-data

```java
Consumer.DrainingControl<Done> control =
    Consumer.commitWithMetadataSource(
            consumerSettings,
            Subscriptions.topics(topic),
            (record) -> Long.toString(record.timestamp()))
        .mapAsync(
            1,
            msg ->
                business(msg.record().key(), msg.record().value())
                    .thenApply(done -> msg.committableOffset()))
        .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
        .run(system);
```

### Example 18: Consume “at-most-once”

```scala
val control: DrainingControl[immutable.Seq[Done]] =
    Consumer
      .atMostOnceSource(consumerSettings, Subscriptions.topics(topic))
      .mapAsync(1)(record => business(record.key, record.value()))
      .toMat(Sink.seq)(DrainingControl.apply)
      .run()

def business(key: String, value: String): Future[Done] = // ???
```

### Example 19: Consume “at-most-once”

```java
Consumer.Control control =
    Consumer.atMostOnceSource(consumerSettings, Subscriptions.topics(topic))
        .mapAsync(10, record -> business(record.key(), record.value()))
        .to(Sink.foreach(it -> System.out.println("Done with " + it)))
        .run(system);
```

### Example 20: Connecting Producer and Consumer

```scala
val control =
  Consumer
    .committableSource(consumerSettings, Subscriptions.topics(topic1, topic2))
    .map { msg =>
      ProducerMessage.single(
        new ProducerRecord(targetTopic, msg.record.key, msg.record.value),
        msg.committableOffset
      )
    }
    .toMat(Producer.committableSink(producerSettings, committerSettings))(DrainingControl.apply)
    .run()
```

### Example 21: Connecting Producer and Consumer

```java
Consumer.DrainingControl<Done> control =
    Consumer.committableSource(consumerSettings, Subscriptions.topics(topic1, topic2))
        .map(
            msg ->
                ProducerMessage.<String, String, ConsumerMessage.Committable>single(
                    new ProducerRecord<>(targetTopic, msg.record().key(), msg.record().value()),
                    msg.committableOffset()))
        .toMat(
            Producer.committableSink(producerSettings, committerSettings),
            Consumer::createDrainingControl)
        .run(system);
```

### Example 22: Source per partition

```scala
val control = Consumer
  .committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
  .flatMapMerge(maxPartitions, _._2)
  .via(businessFlow)
  .map(_.committableOffset)
  .toMat(Committer.sink(committerDefaults))(DrainingControl.apply)
  .run()
```

### Example 23: Source per partition

```java
Consumer.DrainingControl<Done> control =
    Consumer.committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
        .flatMapMerge(maxPartitions, Pair::second)
        .via(business())
        .map(msg -> msg.committableOffset())
        .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
        .run(system);
```

### Example 24: Source per partition

```scala
val control = Consumer
  .committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
  .mapAsyncUnordered(maxPartitions) {
    case (topicPartition, source) =>
      source
        .via(businessFlow)
        .map(_.committableOffset)
        .runWith(Committer.sink(committerSettings))
  }
  .toMat(Sink.ignore)(DrainingControl.apply)
  .run()
```

### Example 25: Source per partition

```java
Consumer.DrainingControl<Done> control =
    Consumer.committablePartitionedSource(consumerSettings, Subscriptions.topics(topic))
        .mapAsyncUnordered(
            maxPartitions,
            pair -> {
              Source<ConsumerMessage.CommittableMessage<String, String>, NotUsed> source =
                  pair.second();
              return source
                  .via(business())
                  .map(message -> message.committableOffset())
                  .runWith(Committer.sink(committerSettings), system);
            })
        .toMat(Sink.ignore(), Consumer::createDrainingControl)
        .run(system);
```

### Example 26: Sharing the KafkaConsumer instance

```scala
// adds support for actors to a classic actor system and context
import akka.actor.typed.scaladsl.adapter._

//Consumer is represented by actor
val consumer: ActorRef =
  context.actorOf(KafkaConsumerActor.props(consumerSettings), "kafka-consumer-actor")
```

### Example 27: Sharing the KafkaConsumer instance

```java
import akka.actor.typed.javadsl.Behaviors;

// Consumer is represented by actor
ActorRef consumer = Adapter.actorOf(ctx, KafkaConsumerActor.props(consumerSettings));
```

### Example 28: Sharing the KafkaConsumer instance

```scala
//Consumer is represented by actor
val consumer: ActorRef = system.actorOf(KafkaConsumerActor.props(consumerSettings))

//Manually assign topic partition to it
val (controlPartition1, result1) = Consumer
  .plainExternalSource[String, Array[Byte]](
    consumer,
    Subscriptions.assignment(new TopicPartition(topic, partition1))
  )
  .via(businessFlow)
  .toMat(Sink.seq)(Keep.both)
  .run()

//Manually assign another topic partition
val (controlPartition2, result2) = Consumer
  .plainExternalSource[String, Array[Byte]](
    consumer,
    Subscriptions.assignment(new TopicPartition(topic, partition2))
  )
  .via(businessFlow)
  .toMat(Sink.seq)(Keep.both)
  .run()

// ....

              controlPartition1.shutdown()
              controlPartition2.shutdown()
consumer ! KafkaConsumerActor.Stop
```

### Example 29: Sharing the KafkaConsumer instance

```java
// Consumer is represented by actor
ActorRef consumer = system.actorOf((KafkaConsumerActor.props(consumerSettings)));

// Manually assign topic partition to it
Consumer.Control controlPartition1 =
    Consumer.plainExternalSource(
            consumer, Subscriptions.assignment(new TopicPartition(topic, partition0)))
        .via(business())
        .to(Sink.ignore())
        .run(system);

// Manually assign another topic partition
Consumer.Control controlPartition2 =
    Consumer.plainExternalSource(
            consumer, Subscriptions.assignment(new TopicPartition(topic, partition1)))
        .via(business())
        .to(Sink.ignore())
        .run(system);


consumer.tell(KafkaConsumerActor.stop(), self);
```

### Example 30: Accessing KafkaConsumer metrics

```scala
val control: Consumer.Control = Consumer
  .plainSource(consumerSettings, Subscriptions.assignment(new TopicPartition(topic, partition)))
  .via(businessFlow)
  .to(Sink.ignore)
  .run()


val metrics: Future[Map[MetricName, Metric]] = control.metrics
metrics.foreach(map => println(s"metrics: ${map.mkString("\n")}"))
```

### Example 31: Accessing KafkaConsumer metrics

```java
// run the stream to obtain the materialized Control value
Consumer.DrainingControl<Done> control =
    Consumer.plainSource(
            consumerSettings, Subscriptions.assignment(new TopicPartition(topic, 0)))
        .via(business())
        .toMat(Sink.ignore(), Consumer::createDrainingControl)
        .run(system);

CompletionStage<Map<MetricName, Metric>> metrics = control.getMetrics();
metrics.thenAccept(map -> System.out.println("Metrics: " + map));
```

### Example 32: Controlled shutdown

```scala
val (consumerControl, streamComplete) =
  Consumer
    .plainSource(consumerSettings,
                 Subscriptions.assignmentWithOffset(
                   new TopicPartition(topic, 0) -> offset
                 ))
    .via(businessFlow)
    .toMat(Sink.ignore)(Keep.both)
    .run()

consumerControl.shutdown()
```

### Example 33: Controlled shutdown

```java
final OffsetStorage db = new OffsetStorage();

CompletionStage<Consumer.DrainingControl<Done>> control =
    db.loadOffset()
        .thenApply(
            fromOffset ->
                Consumer.plainSource(
                        consumerSettings,
                        Subscriptions.assignmentWithOffset(
                            new TopicPartition(topic, 0), fromOffset))
                    .mapAsync(
                        10,
                        record ->
                            business(record.key(), record.value())
                                .thenApply(res -> db.storeProcessedOffset(record.offset())))
                    .toMat(Sink.ignore(), Consumer::createDrainingControl)
                    .run(system));

// Shutdown the consumer when desired
control.thenAccept(c -> c.drainAndShutdown(executor));
```

### Example 34: Draining control

```scala
val drainingControl =
  Consumer
    .committableSource(consumerSettings.withStopTimeout(Duration.Zero), Subscriptions.topics(topic))
    .mapAsync(1) { msg =>
      business(msg.record).map(_ => msg.committableOffset)
    }
    .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
    .run()

val streamComplete = drainingControl.drainAndShutdown()
```

### Example 35: Draining control

```java
final Executor ec = Executors.newCachedThreadPool();

Consumer.DrainingControl<Done> control =
    Consumer.committableSource(
            consumerSettings.withStopTimeout(Duration.ZERO), Subscriptions.topics(topic))
        .mapAsync(
            1,
            msg ->
                business(msg.record().key(), msg.record().value())
                    .thenApply(done -> msg.committableOffset()))
        .toMat(
            Committer.sink(committerSettings.withMaxBatch(1)), Consumer::createDrainingControl)
        .run(system);

control.drainAndShutdown(ec);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitterSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$DrainingControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorRef.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/stream/javadsl/Source.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/atleastonce.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer-metadata.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/discovery.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/producer.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/send-producer.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/subscription.html
- https://doc.akka.io/libraries/alpakka-kafka/8.0/transactions.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer.html](https://doc.akka.io/libraries/alpakka-kafka/8.0/consumer.html)*