---
description: Alpakka Kafka 8.0.1 - akka.kafka.javadsl
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:11Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/javadsl/index.html
title: Alpakka Kafka 8.0.1 - akka.kafka.javadsl
---

# Alpakka Kafka 8.0.1 - akka.kafka.javadsl

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.javadsl

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/cluster/index.html "Permalink")  package [cluster](../cluster/index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/internal/index.html "Permalink")  package [internal](../internal/index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/javadsl/index.html "Permalink")  package javadslDefinition Classes[kafka](../index.html)
- [Committer](Committer$.html)
- [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- [MetadataClient](MetadataClient.html)
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](../scaladsl/index.html)Definition Classes[kafka](../index.html)
- [**](../../../akka/kafka/testkit/index.html "Permalink")  package [testkit](../testkit/index.html)Definition Classes[kafka](../index.html)
p[akka](../../index.html).[kafka](../index.html)

# javadsl[**](../../../akka/kafka/javadsl/index.html "Permalink")

#### package javadsl

****Ordering1. Alphabetic
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/kafka/javadsl/MetadataClient.html "Permalink")  class [MetadataClient](MetadataClient.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
2. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html "Permalink")  trait [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)The API is new and may change in further releases.

The API is new and may change in further releases.

Allows the user to execute user code when Kafka rebalances partitions between consumers, or an Alpakka Kafka consumer is stopped.
Use with care: These callbacks are called synchronously on the same thread Kafka's `poll()` is called.
A warning will be logged if a callback takes longer than the configured `partition-handler-warning`.

There is no point in calling `Committable`'s commit methods as their committing won't be executed as long as any of
the callbacks in this class are called. Calling `commitSync` on the passed [akka.kafka.RestrictedConsumer](../RestrictedConsumer.html) is available.

This complements the methods of Kafka's [ConsumerRebalanceListener](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html) with
an `onStop` callback which is called before `Consumer.close`.
3. [**](../../../akka/kafka/javadsl/SendProducer.html "Permalink") final  class [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Utility class for producing to Kafka without using Akka Streams.
### Value Members

1. [**](../../../akka/kafka/javadsl/Committer$.html "Permalink")  object [Committer](Committer$.html)
2. [**](../../../akka/kafka/javadsl/Consumer$.html "Permalink")  object [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")Akka Stream connector for subscribing to Kafka topics.
3. [**](../../../akka/kafka/javadsl/DiscoverySupport$.html "Permalink")  object [DiscoverySupport](DiscoverySupport$.html "Scala API.")Scala API.

Scala API.

Reads Kafka bootstrap servers from configured sources via [akka.discovery.Discovery](https://doc.akka.io/api/akka-core/2.10.11/akka/discovery/Discovery.html) configuration.
4. [**](../../../akka/kafka/javadsl/MetadataClient$.html "Permalink")  object [MetadataClient](MetadataClient$.html)
5. [**](../../../akka/kafka/javadsl/Producer$.html "Permalink")  object [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")Akka Stream connector for publishing messages to Kafka topics.
6. [**](../../../akka/kafka/javadsl/Transactional$.html "Permalink")  object [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.") Akka Stream connector to support transactions between Kafka topics.
### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/discovery/Discovery.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/cluster/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/internal/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/DiscoverySupport$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/MetadataClient$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/MetadataClient.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html)*