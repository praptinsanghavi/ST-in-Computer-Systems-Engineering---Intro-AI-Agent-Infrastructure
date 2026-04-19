---
description: Alpakka Kafka 8.0.1 - akka.kafka.internal
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:10Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/internal/index.html
title: Alpakka Kafka 8.0.1 - akka.kafka.internal
---

# Alpakka Kafka 8.0.1 - akka.kafka.internal

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.internal

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/internal/index.html "Permalink")  package internalDefinition Classes[kafka](../index.html)
- [ConnectionChecker](ConnectionChecker$.html)
- [ConsumerAssignmentTrackingListener](ConsumerAssignmentTrackingListener.html "Listen for changes to the consumer assignments.")
- [ConsumerProgressTrackerImpl](ConsumerProgressTrackerImpl.html "Track the progress/state of the consumer.")
- [ConsumerProgressTrackerNoop](ConsumerProgressTrackerNoop$.html)
- [ConsumerProgressTracking](ConsumerProgressTracking.html "Track the current state of the consumer: what offsets it has requested, received and committed, filtering by the current assignments to the consumer.")
- [ConsumerResetProtection](ConsumerResetProtection.html "Added as part of https://github.com/akka/alpakka-kafka/issues/1286 to avoid reprocessing data in case of Kafka temporarily \"losing\" an offset.")
- [PartitionAssignmentHelpers](PartitionAssignmentHelpers$.html "Internal API.")
- [SafeOffsetAndTimestamp](SafeOffsetAndTimestamp.html "Maintain our own OffsetAndTimestamp which can tolerate negative timestamps, which happen for old clients that don't set timestamp explicitly.")
- [**](../../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](../javadsl/index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[kafka](../index.html)
p[akka](../../index.html).[kafka](../index.html)

# internal[**](../../../akka/kafka/internal/index.html "Permalink")

#### package internal

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/kafka/internal/ConsumerAssignmentTrackingListener.html "Permalink")  trait [ConsumerAssignmentTrackingListener](ConsumerAssignmentTrackingListener.html "Listen for changes to the consumer assignments.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Listen for changes to the consumer assignments.

Listen for changes to the consumer assignments.

Annotations@InternalApi()
2. [**](../../../akka/kafka/internal/ConsumerProgressTrackerImpl.html "Permalink") final  class [ConsumerProgressTrackerImpl](ConsumerProgressTrackerImpl.html "Track the progress/state of the consumer.") extends [ConsumerProgressTracking](ConsumerProgressTracking.html)Track the progress/state of the consumer.

Track the progress/state of the consumer. We generally try to be 'fast' with handling the partitions we track;
most of the smarts are expected to be handled outside this class. For example, we will update any offsets to
commit \- [commitRequested](ConsumerProgressTrackerImpl.html#commitRequested(offsets:Map[org.apache.kafka.common.TopicPartition,org.apache.kafka.clients.consumer.OffsetAndMetadata]):Unit) \- without regard for what had previously been assigned
or revoked from the consumer. Thus, care should be taken when managing state of the consumer and making updates.

The only case we try and be "smart" is during [received](ConsumerProgressTrackerImpl.html#received[K,V](received:org.apache.kafka.clients.consumer.ConsumerRecords[K,V]):Unit), where we will filter out offsets that are not
currently assigned; ensuring that we don't try to waste cycles on partitions that we no longer care about. This
matches downstream behavior where the SourceLogicBuffer filters out revoked partitions.

Annotations@InternalApi()
3. [**](../../../akka/kafka/internal/ConsumerProgressTracking.html "Permalink")  trait [ConsumerProgressTracking](ConsumerProgressTracking.html "Track the current state of the consumer: what offsets it has requested, received and committed, filtering by the current assignments to the consumer.") extends [ConsumerAssignmentTrackingListener](ConsumerAssignmentTrackingListener.html)Track the current state of the consumer: what offsets it has requested, received and committed, filtering by the
current assignments to the consumer.

Track the current state of the consumer: what offsets it has requested, received and committed, filtering by the
current assignments to the consumer. When a partition is assigned to the consumer for the first time, its
assigned offset is the current position of the partition (uses underlying Kafka Consumer to leverage the
configured offset\-reset policy).

Annotations@InternalApi()
4. [**](../../../akka/kafka/internal/ConsumerResetProtection.html "Permalink") sealed  trait [ConsumerResetProtection](ConsumerResetProtection.html "Added as part of https://github.com/akka/alpakka-kafka/issues/1286 to avoid reprocessing data in case of Kafka temporarily \"losing\" an offset.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Added as part of https://github.com/akka/alpakka\-kafka/issues/1286 to avoid reprocessing data in case of Kafka
temporarily "losing" an offset.

Added as part of https://github.com/akka/alpakka\-kafka/issues/1286 to avoid reprocessing data in case of Kafka
temporarily "losing" an offset.

Annotations@InternalApi()
5. [**](../../../akka/kafka/internal/SafeOffsetAndTimestamp.html "Permalink") final  case class [SafeOffsetAndTimestamp](SafeOffsetAndTimestamp.html "Maintain our own OffsetAndTimestamp which can tolerate negative timestamps, which happen for old clients that don't set timestamp explicitly.")(offset: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableMaintain our own OffsetAndTimestamp which can tolerate negative timestamps, which happen for old clients that
don't set timestamp explicitly.
### Value Members

1. [**](../../../akka/kafka/internal/ConnectionChecker$.html "Permalink")  object [ConnectionChecker](ConnectionChecker$.html)Annotations@InternalApi()
2. [**](../../../akka/kafka/internal/ConsumerProgressTrackerNoop$.html "Permalink")  object [ConsumerProgressTrackerNoop](ConsumerProgressTrackerNoop$.html) extends [ConsumerProgressTracking](ConsumerProgressTracking.html)Annotations@InternalApi()
3. [**](../../../akka/kafka/internal/ConsumerResetProtection$.html "Permalink")  object [ConsumerResetProtection](ConsumerResetProtection$.html)Annotations@InternalApi()
4. [**](../../../akka/kafka/internal/PartitionAssignmentHelpers$.html "Permalink")  object [PartitionAssignmentHelpers](PartitionAssignmentHelpers$.html "Internal API.")Internal API.

Internal API.

Implementations of PartitionAssignmentHandler for internal use.

Annotations@InternalApi()
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/cluster/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConnectionChecker$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConsumerAssignmentTrackingListener.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConsumerProgressTrackerImpl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConsumerProgressTrackerNoop$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConsumerProgressTracking.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConsumerResetProtection$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/ConsumerResetProtection.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/PartitionAssignmentHelpers$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/SafeOffsetAndTimestamp.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/index.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/index.html)*