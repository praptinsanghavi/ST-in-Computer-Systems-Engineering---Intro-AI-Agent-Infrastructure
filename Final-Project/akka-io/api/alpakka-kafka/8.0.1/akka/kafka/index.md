---
description: Alpakka Kafka 8.0.1 - akka.kafka
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:17:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/index.html
title: Alpakka Kafka 8.0.1 - akka.kafka
---

# Alpakka Kafka 8.0.1 - akka.kafka

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/kafka/index.html "Permalink")  package kafkaDefinition Classes[akka](../index.html)
- [**](../../akka/kafka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)
- [**](../../akka/kafka/internal/index.html "Permalink")  package [internal](internal/index.html)
- [**](../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
- [**](../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
- [**](../../akka/kafka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
- [AutoSubscription](AutoSubscription.html "Kafka-speak for these is \"Subscriptions\".")
- [CommitDelivery](CommitDelivery.html)
- [CommitTimeoutException](CommitTimeoutException.html "Commits will be failed with this exception if Kafka doesn't respond within commit-timeout")
- [CommitWhen](CommitWhen.html)
- [CommitterSettings](CommitterSettings.html "Settings for committer.")
- [ConnectionCheckerSettings](ConnectionCheckerSettings.html)
- [ConsumerFailed](ConsumerFailed.html "Kafka consumer stages fail with this exception.")
- [ConsumerMessage](ConsumerMessage$.html "Classes that are used in both javadsl.Consumer and scaladsl.Consumer.")
- [ConsumerRebalanceEvent](ConsumerRebalanceEvent.html)
- [ConsumerSettings](ConsumerSettings.html "Settings for consumers.")
- [InitialPollFailed](InitialPollFailed.html)
- [KafkaConnectionFailed](KafkaConnectionFailed.html)
- [KafkaConsumerActor](KafkaConsumerActor$.html)
- [ManualSubscription](ManualSubscription.html "Kafka-speak for these is \"Assignments\".")
- [Metadata](Metadata$.html "Messages for Kafka metadata fetching via KafkaConsumerActor.")
- [OffsetResetProtectionSettings](OffsetResetProtectionSettings.html)
- [ProducerMessage](ProducerMessage$.html "Classes that are used in both javadsl.Producer and scaladsl.Producer.")
- [ProducerSettings](ProducerSettings.html "Settings for producers.")
- [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.")
- [Subscription](Subscription.html)
- [Subscriptions](Subscriptions$.html)
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
p[akka](../index.html)

# kafka[**](../../akka/kafka/index.html "Permalink")

#### package kafka

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Package Members

1. [**](../../akka/kafka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)
2. [**](../../akka/kafka/internal/index.html "Permalink")  package [internal](internal/index.html)
3. [**](../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)
4. [**](../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)
5. [**](../../akka/kafka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)
### Type Members

1. [**](../../akka/kafka/AutoSubscription.html "Permalink") sealed  trait [AutoSubscription](AutoSubscription.html "Kafka-speak for these is \"Subscriptions\".") extends [Subscription](Subscription.html)Kafka\-speak for these is "Subscriptions".
2. [**](../../akka/kafka/CommitDelivery.html "Permalink") sealed  trait [CommitDelivery](CommitDelivery.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@ApiMayChange()
3. [**](../../akka/kafka/CommitTimeoutException.html "Permalink")  class [CommitTimeoutException](CommitTimeoutException.html "Commits will be failed with this exception if Kafka doesn't respond within commit-timeout") extends [TimeoutException](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/TimeoutException.html#java.util.concurrent.TimeoutException)Commits will be failed with this exception if Kafka doesn't respond within `commit-timeout`
4. [**](../../akka/kafka/CommitWhen.html "Permalink") sealed  trait [CommitWhen](CommitWhen.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@ApiMayChange()
5. [**](../../akka/kafka/CommitterSettings.html "Permalink")  class [CommitterSettings](CommitterSettings.html "Settings for committer.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings for committer.

Settings for committer. See `akka.kafka.committer` section in
reference.conf. Note that the [companion](CommitterSettings$.html) object provides
`apply` and `create` functions for convenient construction of the settings, together with
the `with` methods.
6. [**](../../akka/kafka/ConnectionCheckerSettings.html "Permalink")  class [ConnectionCheckerSettings](ConnectionCheckerSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
7. [**](../../akka/kafka/ConsumerFailed.html "Permalink")  class [ConsumerFailed](ConsumerFailed.html "Kafka consumer stages fail with this exception.") extends RuntimeExceptionKafka consumer stages fail with this exception.
8. [**](../../akka/kafka/ConsumerRebalanceEvent.html "Permalink") sealed  trait [ConsumerRebalanceEvent](ConsumerRebalanceEvent.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Annotations@ApiMayChange()
9. [**](../../akka/kafka/ConsumerSettings.html "Permalink")  class [ConsumerSettings](ConsumerSettings.html "Settings for consumers.")\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings for consumers.

Settings for consumers. See `akka.kafka.consumer` section in
`reference.conf`. Note that the [companion](ConsumerSettings$.html) object provides
`apply` and `create` functions for convenient construction of the settings, together with
the `with` methods.

The constructor is Internal API.
10. [**](../../akka/kafka/InitialPollFailed.html "Permalink")  class [InitialPollFailed](InitialPollFailed.html) extends [ConsumerFailed](ConsumerFailed.html)
11. [**](../../akka/kafka/KafkaConnectionFailed.html "Permalink") final  case class [KafkaConnectionFailed](KafkaConnectionFailed.html)(te: [TimeoutException](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/errors/TimeoutException.html#org.apache.kafka.common.errors.TimeoutException), attempts: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends Exception with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
12. [**](../../akka/kafka/ManualSubscription.html "Permalink") sealed  trait [ManualSubscription](ManualSubscription.html "Kafka-speak for these is \"Assignments\".") extends [Subscription](Subscription.html)Kafka\-speak for these is "Assignments".
13. [**](../../akka/kafka/OffsetResetProtectionSettings.html "Permalink")  class [OffsetResetProtectionSettings](OffsetResetProtectionSettings.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
14. [**](../../akka/kafka/ProducerSettings.html "Permalink")  class [ProducerSettings](ProducerSettings.html "Settings for producers.")\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Settings for producers.

Settings for producers. See `akka.kafka.producer` section in
reference.conf. Note that the [companion](ProducerSettings$.html) object provides
`apply` and `create` functions for convenient construction of the settings, together with
the `with` methods.

The constructor is Internal API.
15. [**](../../akka/kafka/RestrictedConsumer.html "Permalink") final  class [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Offers parts of the [org.apache.kafka.clients.consumer.Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) API which becomes available to
the [akka.kafka.scaladsl.PartitionAssignmentHandler](scaladsl/PartitionAssignmentHandler.html) callbacks.

Offers parts of the [org.apache.kafka.clients.consumer.Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) API which becomes available to
the [akka.kafka.scaladsl.PartitionAssignmentHandler](scaladsl/PartitionAssignmentHandler.html) callbacks.

Annotations@ApiMayChange()
16. [**](../../akka/kafka/Subscription.html "Permalink") sealed  trait [Subscription](Subscription.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
17. [**](../../akka/kafka/TopicPartitionsAssigned.html "Permalink") final  case class [TopicPartitionsAssigned](TopicPartitionsAssigned.html)(sub: [Subscription](Subscription.html), topicPartitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) extends [ConsumerRebalanceEvent](ConsumerRebalanceEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@ApiMayChange()
18. [**](../../akka/kafka/TopicPartitionsRevoked.html "Permalink") final  case class [TopicPartitionsRevoked](TopicPartitionsRevoked.html)(sub: [Subscription](Subscription.html), topicPartitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) extends [ConsumerRebalanceEvent](ConsumerRebalanceEvent.html) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@ApiMayChange()
19. [**](../../akka/kafka/WakeupsExceeded.html "Permalink")  class [WakeupsExceeded](WakeupsExceeded.html) extends [ConsumerFailed](ConsumerFailed.html)
### Value Members

1. [**](../../akka/kafka/CommitDelivery$.html "Permalink")  object [CommitDelivery](CommitDelivery$.html "Selects how the stream delivers commits to the internal actor.")Selects how the stream delivers commits to the internal actor.

Selects how the stream delivers commits to the internal actor.

Annotations@ApiMayChange()
2. [**](../../akka/kafka/CommitWhen$.html "Permalink")  object [CommitWhen](CommitWhen$.html "Selects when the stream will commit an offset.")Selects when the stream will commit an offset.

Selects when the stream will commit an offset.

Annotations@ApiMayChange()
3. [**](../../akka/kafka/CommitterSettings$.html "Permalink")  object [CommitterSettings](CommitterSettings$.html)
4. [**](../../akka/kafka/ConnectionCheckerSettings$.html "Permalink")  object [ConnectionCheckerSettings](ConnectionCheckerSettings$.html)
5. [**](../../akka/kafka/ConsumerMessage$.html "Permalink")  object [ConsumerMessage](ConsumerMessage$.html "Classes that are used in both javadsl.Consumer and scaladsl.Consumer.")Classes that are used in both [javadsl.Consumer](javadsl/Consumer$.html) and
[scaladsl.Consumer](scaladsl/Consumer$.html).
6. [**](../../akka/kafka/ConsumerSettings$.html "Permalink")  object [ConsumerSettings](ConsumerSettings$.html)
7. [**](../../akka/kafka/KafkaConsumerActor$.html "Permalink")  object [KafkaConsumerActor](KafkaConsumerActor$.html)
8. [**](../../akka/kafka/Metadata$.html "Permalink")  object [Metadata](Metadata$.html "Messages for Kafka metadata fetching via KafkaConsumerActor.")Messages for Kafka metadata fetching via [KafkaConsumerActor](KafkaConsumerActor$.html).

Messages for Kafka metadata fetching via [KafkaConsumerActor](KafkaConsumerActor$.html).

NOTE: Processing of these requests blocks the actor loop. The KafkaConsumerActor is configured to run on its
own dispatcher, so just as the other remote calls to Kafka, the blocking happens within a designated thread pool.
However, calling these during consuming might affect performance and even cause timeouts in extreme cases.
9. [**](../../akka/kafka/OffsetResetProtectionSettings$.html "Permalink")  object [OffsetResetProtectionSettings](OffsetResetProtectionSettings$.html "The thresholds after which reset protection is enabled.")The thresholds after which reset protection is enabled.

The thresholds after which reset protection is enabled. Offsets, time, or both can be provided.
10. [**](../../akka/kafka/ProducerMessage$.html "Permalink")  object [ProducerMessage](ProducerMessage$.html "Classes that are used in both javadsl.Producer and scaladsl.Producer.")Classes that are used in both [javadsl.Producer](javadsl/Producer$.html) and
[scaladsl.Producer](scaladsl/Producer$.html).
11. [**](../../akka/kafka/ProducerSettings$.html "Permalink")  object [ProducerSettings](ProducerSettings$.html)
12. [**](../../akka/kafka/Subscriptions$.html "Permalink")  object [Subscriptions](Subscriptions$.html)
13. [**](../../akka/kafka/Version$.html "Permalink")  object [Version](Version$.html)
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/AutoSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitDelivery$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitDelivery.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitTimeoutException.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitWhen$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitWhen.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitterSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitterSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConnectionCheckerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConnectionCheckerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerRebalanceEvent.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/InitialPollFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConnectionFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ManualSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/OffsetResetProtectionSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/OffsetResetProtectionSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsAssigned.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/TopicPartitionsRevoked.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Version$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/WakeupsExceeded.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/cluster/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html)*