---
description: An Alpakka Kafka consumer source can subscribe to Kafka topics within
  a consumer group, or to specific partitions.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:29Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/subscription.html
title: Subscription • Alpakka Kafka Documentation
---

# Subscription • Alpakka Kafka Documentation

> **Summary:** An Alpakka Kafka consumer source can subscribe to Kafka topics within a consumer group, or to specific partitions.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Subscription

Consumer Sources are created with different types of subscriptions, which control from which topics, partitions and offsets data is to be consumed.

Subscriptions are grouped into two categories: with automatic partition assignment and with manual control of partition assignment.

Factory methods for all subscriptions can be found in the [`Subscriptions`](/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html "akka.kafka.Subscriptions")[`Subscriptions`](/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html "akka.kafka.Subscriptions") factory.

## Automatic Partition Assignment

### Topic

Subscribes to one or more topics. Partitions will be assigned automatically by the Kafka Client.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AssignmentSpec.scala#L37-L38 "Go to snippet source")val subscription = Subscriptions.topics(topic)
val consumer = Consumer.plainSource(consumerDefaults.withGroupId(group), subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AssignmentTest.java#L69-L71 "Go to snippet source")final AutoSubscription subscription = Subscriptions.topics(topic);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults().withGroupId(group), subscription);
```

### Topic Pattern

Subscribes to one or more topics which match the given pattern. Take a look at the [`subscribe​(java.util.regex.Pattern pattern,
...)`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/consumer/KafkaConsumer.html "org.apache.kafka.clients.consumer.KafkaConsumer") method documentation for more information on topic pattern matching.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AssignmentSpec.scala#L62-L64 "Go to snippet source")val pattern = s"topic-$suffix-[0-9]+"
val subscription = Subscriptions.topicPattern(pattern)
val consumer = Consumer.plainSource(consumerDefaults.withGroupId(group), subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AssignmentTest.java#L103-L106 "Go to snippet source")final String pattern = "topic-900[1|2]-[0-9]+";
final AutoSubscription subscription = Subscriptions.topicPattern(pattern);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults().withGroupId(group), subscription);
```

## Manual Partition Assignment

### Partition Assignment

Subscribes to given topics and their given partitions.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AssignmentSpec.scala#L92-L94 "Go to snippet source")val partition = 0
val subscription = Subscriptions.assignment(new TopicPartition(topic, partition))
val consumer = Consumer.plainSource(consumerDefaults, subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AssignmentTest.java#L132-L136 "Go to snippet source")final Integer partition = 0;
final ManualSubscription subscription =
    Subscriptions.assignment(new TopicPartition(topic, partition));
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults(), subscription);
```

### Partition Assignment with Offset

Subscribes to given topics and their partitions allowing to also set an offset from which messages will be read.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AssignmentSpec.scala#L114-L117 "Go to snippet source")val partition = 0
val offset: Long = totalMessages.toLong / 2
val subscription = Subscriptions.assignmentWithOffset(new TopicPartition(topic, partition) -> offset)
val consumer = Consumer.plainSource(consumerDefaults, subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AssignmentTest.java#L160-L165 "Go to snippet source")final Integer partition = 0;
final long offset = totalMessages / 2;
final ManualSubscription subscription =
    Subscriptions.assignmentWithOffset(new TopicPartition(topic, partition), offset);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults(), subscription);
```

This subscription can be used when offsets are stored in Kafka or on external storage. For more information, take a look at the [Offset Storage external to Kafka](consumer.html#offset-storage-external-to-kafka) documentation page.

### Partition Assignment with Timestamp

Subscribes to given topics and their partitions allowing to also set a timestamp which will be used to find the offset from which messages will be read.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AssignmentSpec.scala#L137-L141 "Go to snippet source")val partition = 0
val now = System.currentTimeMillis
val messagesSince: Long = now - 5000
val subscription = Subscriptions.assignmentOffsetsForTimes(new TopicPartition(topic, partition) -> messagesSince)
val consumer = Consumer.plainSource(consumerDefaults, subscription)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AssignmentTest.java#L189-L196 "Go to snippet source")final Integer partition = 0;
final Long now = System.currentTimeMillis();
final Long messagesSince = now - 5000;
final ManualSubscription subscription =
    Subscriptions.assignmentOffsetsForTimes(
        new TopicPartition(topic, partition), messagesSince);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults(), subscription);
```

## Code Examples

### Example 1: Topic

```scala
val subscription = Subscriptions.topics(topic)
val consumer = Consumer.plainSource(consumerDefaults.withGroupId(group), subscription)
```

### Example 2: Topic

```java
final AutoSubscription subscription = Subscriptions.topics(topic);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults().withGroupId(group), subscription);
```

### Example 3: Topic Pattern

```scala
val pattern = s"topic-$suffix-[0-9]+"
val subscription = Subscriptions.topicPattern(pattern)
val consumer = Consumer.plainSource(consumerDefaults.withGroupId(group), subscription)
```

### Example 4: Topic Pattern

```java
final String pattern = "topic-900[1|2]-[0-9]+";
final AutoSubscription subscription = Subscriptions.topicPattern(pattern);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults().withGroupId(group), subscription);
```

### Example 5: Partition Assignment

```scala
val partition = 0
val subscription = Subscriptions.assignment(new TopicPartition(topic, partition))
val consumer = Consumer.plainSource(consumerDefaults, subscription)
```

### Example 6: Partition Assignment

```java
final Integer partition = 0;
final ManualSubscription subscription =
    Subscriptions.assignment(new TopicPartition(topic, partition));
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults(), subscription);
```

### Example 7: Partition Assignment with Offset

```scala
val partition = 0
val offset: Long = totalMessages.toLong / 2
val subscription = Subscriptions.assignmentWithOffset(new TopicPartition(topic, partition) -> offset)
val consumer = Consumer.plainSource(consumerDefaults, subscription)
```

### Example 8: Partition Assignment with Offset

```java
final Integer partition = 0;
final long offset = totalMessages / 2;
final ManualSubscription subscription =
    Subscriptions.assignmentWithOffset(new TopicPartition(topic, partition), offset);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults(), subscription);
```

### Example 9: Partition Assignment with Timestamp

```scala
val partition = 0
val now = System.currentTimeMillis
val messagesSince: Long = now - 5000
val subscription = Subscriptions.assignmentOffsetsForTimes(new TopicPartition(topic, partition) -> messagesSince)
val consumer = Consumer.plainSource(consumerDefaults, subscription)
```

### Example 10: Partition Assignment with Timestamp

```java
final Integer partition = 0;
final Long now = System.currentTimeMillis();
final Long messagesSince = now - 5000;
final ManualSubscription subscription =
    Subscriptions.assignmentOffsetsForTimes(
        new TopicPartition(topic, partition), messagesSince);
final Source<ConsumerRecord<String, String>, Consumer.Control> consumer =
    Consumer.plainSource(consumerDefaults(), subscription);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer-rebalance.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer.html

---
*Source: [https://doc.akka.io/docs/alpakka-kafka/current/subscription.html](https://doc.akka.io/docs/alpakka-kafka/current/subscription.html)*