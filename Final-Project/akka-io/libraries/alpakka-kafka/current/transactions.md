---
description: Alpakka has support for Kafka Transactions which provide guarantees that
  messages processed in a consume-transform-produce workflow are processed exactly
  once or not at all.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:28Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/transactions.html
title: Transactions • Alpakka Kafka Documentation
---

# Transactions • Alpakka Kafka Documentation

> **Summary:** Alpakka has support for Kafka Transactions which provide guarantees that messages processed in a consume-transform-produce workflow are processed exactly once or not at all.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Transactions

Kafka Transactions provide guarantees that messages processed in a consume\-transform\-produce workflow (consumed from a source topic, transformed, and produced to a destination topic) are processed exactly once or not at all. This is achieved through coordination between the Kafka consumer group coordinator, transaction coordinator, and the consumer and producer clients used in the user application. The Kafka producer marks messages that are consumed from the source topic as “committed” only once the transformed messages are successfully produced to the sink. 

For full details on how transactions are achieved in Kafka you may wish to review the Kafka Improvement Proposal [KIP\-98: Exactly Once Delivery and Transactional Messaging](https://cwiki.apache.org/confluence/display/KAFKA/KIP-98+-+Exactly+Once+Delivery+and+Transactional+Messaging) and its associated [design document](https://docs.google.com/document/d/11Jqy_GjUGtdXJK94XGsEIK7CP1SnQGdp2eF0wSw9ra8/edit#heading=h.xq0ee1vnpz4o). 

## Transactional Source

The [`Transactional.source`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.source`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") emits a [`ConsumerMessage.TransactionalMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$TransactionalMessage.html "akka.kafka.ConsumerMessage.TransactionalMessage")[`ConsumerMessage.TransactionalMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$TransactionalMessage.html "akka.kafka.ConsumerMessage.TransactionalMessage") which contains topic, partition, and offset information required by the producer during the commit process. Unlike with [`ConsumerMessage.CommittableMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html "akka.kafka.ConsumerMessage.CommittableMessage")[`ConsumerMessage.CommittableMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html "akka.kafka.ConsumerMessage.CommittableMessage"), the user is not responsible for committing transactions, this is handled by a [`Transactional.flow`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.flow`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") or [`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional").

This source overrides the Kafka consumer property `isolation.level` to `read_committed`, so that only committed messages can be consumed.

A consumer group ID must be provided.

Only use this source if you have the intention to connect it to a [`Transactional.flow`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.flow`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") or [`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional").

## Transactional Sink and Flow

The [`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") is similar to the [`Producer.committableSink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer.committableSink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer") in that messages will be automatically committed as part of a transaction. The [`Transactional.flow`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.flow`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") or [`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.sink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") are required when connecting a consumer to a producer to achieve a transactional workflow.

They override producer properties `enable.idempotence` to `true` and `max.in.flight.requests.per.connection` to the value of `akka.kafka.producer.transactional-max-in-flight-requests-per-connection` (default `1`). Kafka 2\.5\+ ([KIP\-360](https://cwiki.apache.org/confluence/pages/viewpage.action?pageId=89068820)) supports up to `5` in\-flight requests with exactly\-once semantics, which can improve throughput. The `transaction.timeout.ms` is set to 10s as recommended in [KIP\-447](https://cwiki.apache.org/confluence/display/KAFKA/KIP-447%3A+Producer+scalability+for+exactly+once+semantics). In addition, you can optionally set `akka.kafka.producer.transaction-id-prefix` to prefix in front of the generated transaction ID should your specifications require this level of control.

## Consume\-Transform\-Produce Workflow

Kafka transactions are handled transparently to the user. The [`Transactional.source`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional.source`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") will enforce that a consumer group id is specified. All other Kafka consumer and producer properties required to enable transactions are overridden.

Transactions are committed on an interval which can be controlled with the producer config `akka.kafka.producer.eos-commit-interval`, similar to how exactly once works with Kafka Streams. The default value is `100ms`. The larger commit interval is the more records will need to be reprocessed in the event of failure and the transaction is aborted.

When the stream is materialized and the producer sees the first message it will initialize a transaction. Every commit interval (`eos-commit-interval`) we check if there are any offsets available to commit. If offsets exist then we suspend backpressured demand while we drain all outstanding messages that have not yet been successfully acknowledged (if any) and then commit the transaction. After the commit succeeds a new transaction is begun and we re\-initialize demand for upstream messages.

Messages are also drained from the stream when the consumer gets a rebalance of partitions. In that case, the consumer will wait in the `onPartitionsRevoked` callback until all of the messages have been drained from the stream and the transaction is committed before allowing the rebalance to continue. The amount of total time the consumer will wait for draining is controlled by the `akka.kafka.consumer.commit-timeout`, and the interval between checks is controlled by the `akka.kafka.consumer.eos-draining-check-interval` configuration settings.

To gracefully shutdown the stream and commit the current transaction you must call `shutdown()` on the [`Consumer.Control`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html "akka.kafka.javadsl.Consumer.Control")[`Consumer.Control`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html "akka.kafka.scaladsl.Consumer.Control") materialized value to await all produced message acknowledgements and commit the final transaction. 

### Simple Example

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/TransactionsExample.scala#L33-L56 "Go to snippet source")val control =
  Transactional
    .source(consumerSettings, Subscriptions.topics(sourceTopic))
    .via(businessFlow)
    .map { msg =>
      ProducerMessage.single(new ProducerRecord(sinkTopic, msg.record.key, msg.record.value), msg.partitionOffset)
    }
    .toMat(Transactional.sink(producerSettings))(DrainingControl.apply)
    .run()

// ...

control.drainAndShutdown()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/TransactionsExampleTest.java#L70-L90 "Go to snippet source")Consumer.DrainingControl<Done> control =
    Transactional.source(consumerSettings, Subscriptions.topics(sourceTopic))
        .via(business())
        .map(
            msg ->
                ProducerMessage.single(
                    new ProducerRecord<>(targetTopic, msg.record().key(), msg.record().value()),
                    msg.partitionOffset()))
        .toMat(Transactional.sink(producerSettings), Consumer::createDrainingControl)
        .run(system);

// ...

control.drainAndShutdown(ec);
```

### Recovery From Failure

When any stage in the stream fails the whole stream will be torn down. In the general case it’s desirable to allow transient errors to fail the whole stream because they cannot be recovered from within the application. Transient errors can be caused by network partitions, Kafka broker failures, [`ProducerFencedException`](https://kafka.apache.org/41/javadoc/org/apache/kafka/common/errors/ProducerFencedException.html "org.apache.kafka.common.errors.ProducerFencedException")’s from other application instances, and so on. When the stream encounters transient errors then the current transaction will be aborted before the stream is torn down. Any produced messages that were not committed will not be available to downstream consumers as long as those consumers are configured with `isolation.level = read_committed`.

For transient errors we can choose to rely on the Kafka producer’s configuration to retry, or we can handle it ourselves at the Akka Streams or Application layer. Using the [RestartSource](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html#delayed-restarts-with-a-backoff-stage) we can backoff connection attempts so that we don’t hammer the Kafka cluster in a tight loop.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/TransactionsExample.scala#L94-L119 "Go to snippet source")val innerControl = new AtomicReference[Control](Consumer.NoopControl)

val stream = RestartSource.onFailuresWithBackoff(
  RestartSettings(
    minBackoff = 1.seconds,
    maxBackoff = 30.seconds,
    randomFactor = 0.2
  )
) { () =>
  Transactional
    .source(consumerSettings, Subscriptions.topics(sourceTopic))
    .via(businessFlow)
    .map { msg =>
      ProducerMessage.single(new ProducerRecord(sinkTopic, msg.record.key, msg.record.value), msg.partitionOffset)
    }
    // side effect out the `Control` materialized value because it can't be propagated through the `RestartSource`
    .mapMaterializedValue(c => innerControl.set(c))
    .via(Transactional.flow(producerSettings))
}

stream.runWith(Sink.ignore)

// Add shutdown hook to respond to SIGTERM and gracefully shutdown stream
sys.ShutdownHookThread {
  Await.result(innerControl.get.shutdown(), 10.seconds)
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/TransactionsExampleTest.java#L131-L162 "Go to snippet source")AtomicReference<Consumer.Control> innerControl =
    new AtomicReference<>(Consumer.createNoopControl());

Source<ProducerMessage.Results<String, String, ConsumerMessage.PartitionOffset>, NotUsed>
    stream =
        RestartSource.onFailuresWithBackoff(
            RestartSettings.create(
                java.time.Duration.ofSeconds(3), // min backoff
                java.time.Duration.ofSeconds(30), // max backoff
                0.2), // adds 20% "noise" to vary the intervals slightly
            () ->
                Transactional.source(consumerSettings, Subscriptions.topics(sourceTopic))
                    .via(business())
                    .map(
                        msg ->
                            ProducerMessage.single(
                                new ProducerRecord<>(
                                    targetTopic, msg.record().key(), msg.record().value()),
                                msg.partitionOffset()))
                    // side effect out the `Control` materialized value because it can't be
                    // propagated through the `RestartSource`
                    .mapMaterializedValue(
                        control -> {
                          innerControl.set(control);
                          return control;
                        })
                    .via(Transactional.flow(producerSettings)));

CompletionStage<Done> streamCompletion = stream.runWith(Sink.ignore(), system);

// Add shutdown hook to respond to SIGTERM and gracefully shutdown stream
Runtime.getRuntime().addShutdownHook(new Thread(() -> innerControl.get().shutdown()));
```

## Caveats

There are several scenarios that this library’s implementation of Kafka transactions does not automatically account for.

All of the scenarios covered in the [At\-Least\-Once Delivery documentation](atleastonce.html) (Multiple Effects per Commit, Non\-Sequential Processing, and Conditional Message Processing) are applicable to transactional scenarios as well.

Any state in the transformation logic is not part of a transaction. It’s left to the user to rebuild state when applying stateful operations with transaction. It’s possible to encode state into messages produced to topics during a transaction. For example you could produce messages to a topic that represents an event log as part of a transaction. This event log can be replayed to reconstitute the correct state before the stateful stream resumes consuming again at startup.

Any side effects that occur in the transformation logic is not part of a transaction (i.e. writes to a database). 

The exactly\-once\-semantics are guaranteed only when your flow consumes from and produces to the same Kafka cluster. Producing to partitions from a 3rd\-party source or consuming partitions from one Kafka cluster and producing to another Kafka cluster are not supported.

## Further Reading

For more information on exactly once and transactions in Kafka please consult the following resources.

- [KIP\-98: Exactly Once Delivery and Transactional Messaging](https://cwiki.apache.org/confluence/display/KAFKA/KIP-98+-+Exactly+Once+Delivery+and+Transactional+Messaging) ([Design Document](https://docs.google.com/document/d/11Jqy_GjUGtdXJK94XGsEIK7CP1SnQGdp2eF0wSw9ra8/edit#heading=h.xq0ee1vnpz4o))
- [KIP\-129: Streams Exactly\-Once Semantics](https://cwiki.apache.org/confluence/display/KAFKA/KIP-129%3A+Streams+Exactly-Once+Semantics) ([Design Document](https://docs.google.com/document/d/1pGZ8xtOOyGwDYgH5vA6h19zOMMaduFK1DAB8_gBYA2c/edit#heading=h.vkrkjfth3p8p))
- [KIP\-447: EOS Scalability Design](https://cwiki.apache.org/confluence/display/KAFKA/KIP-447%3A+Producer+scalability+for+exactly+once+semantics) ([Design Document](https://docs.google.com/document/d/1LhzHGeX7_Lay4xvrEXxfciuDWATjpUXQhrEIkph9qRE/edit))
- [You Cannot Have Exactly\-Once Delivery Redux](https://bravenewgeek.com/you-cannot-have-exactly-once-delivery-redux/) by Tyler Treat
- [Exactly\-once Semantics are Possible: Here’s How Kafka Does it](https://www.confluent.io/blog/exactly-once-semantics-are-possible-heres-how-apache-kafka-does-it/)

## Code Examples

### Example 1: Simple Example

```scala
val control =
  Transactional
    .source(consumerSettings, Subscriptions.topics(sourceTopic))
    .via(businessFlow)
    .map { msg =>
      ProducerMessage.single(new ProducerRecord(sinkTopic, msg.record.key, msg.record.value), msg.partitionOffset)
    }
    .toMat(Transactional.sink(producerSettings))(DrainingControl.apply)
    .run()

// ...

control.drainAndShutdown()
```

### Example 2: Simple Example

```java
Consumer.DrainingControl<Done> control =
    Transactional.source(consumerSettings, Subscriptions.topics(sourceTopic))
        .via(business())
        .map(
            msg ->
                ProducerMessage.single(
                    new ProducerRecord<>(targetTopic, msg.record().key(), msg.record().value()),
                    msg.partitionOffset()))
        .toMat(Transactional.sink(producerSettings), Consumer::createDrainingControl)
        .run(system);

// ...

control.drainAndShutdown(ec);
```

### Example 3: Recovery From Failure

```scala
val innerControl = new AtomicReference[Control](Consumer.NoopControl)

val stream = RestartSource.onFailuresWithBackoff(
  RestartSettings(
    minBackoff = 1.seconds,
    maxBackoff = 30.seconds,
    randomFactor = 0.2
  )
) { () =>
  Transactional
    .source(consumerSettings, Subscriptions.topics(sourceTopic))
    .via(businessFlow)
    .map { msg =>
      ProducerMessage.single(new ProducerRecord(sinkTopic, msg.record.key, msg.record.value), msg.partitionOffset)
    }
    // side effect out the `Control` materialized value because it can't be propagated through the `RestartSource`
    .mapMaterializedValue(c => innerControl.set(c))
    .via(Transactional.flow(producerSettings))
}

stream.runWith(Sink.ignore)

// Add shutdown hook to respond to SIGTERM and gracefully shutdown stream
sys.ShutdownHookThread {
  Await.result(innerControl.get.shutdown(), 10.seconds)
}
```

### Example 4: Recovery From Failure

```java
AtomicReference<Consumer.Control> innerControl =
    new AtomicReference<>(Consumer.createNoopControl());

Source<ProducerMessage.Results<String, String, ConsumerMessage.PartitionOffset>, NotUsed>
    stream =
        RestartSource.onFailuresWithBackoff(
            RestartSettings.create(
                java.time.Duration.ofSeconds(3), // min backoff
                java.time.Duration.ofSeconds(30), // max backoff
                0.2), // adds 20% "noise" to vary the intervals slightly
            () ->
                Transactional.source(consumerSettings, Subscriptions.topics(sourceTopic))
                    .via(business())
                    .map(
                        msg ->
                            ProducerMessage.single(
                                new ProducerRecord<>(
                                    targetTopic, msg.record().key(), msg.record().value()),
                                msg.partitionOffset()))
                    // side effect out the `Control` materialized value because it can't be
                    // propagated through the `RestartSource`
                    .mapMaterializedValue(
                        control -> {
                          innerControl.set(control);
                          return control;
                        })
                    .via(Transactional.flow(producerSettings)));

CompletionStage<Done> streamCompletion = stream.runWith(Sink.ignore(), system);

// Add shutdown hook to respond to SIGTERM and gracefully shutdown stream
Runtime.getRuntime().addShutdownHook(new Thread(() -> innerControl.get().shutdown()));
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$TransactionalMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html
- https://doc.akka.io/libraries/alpakka-kafka/current/atleastonce.html
- https://doc.akka.io/libraries/alpakka-kafka/current/serialization.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/transactions.html](https://doc.akka.io/libraries/alpakka-kafka/current/transactions.html)*