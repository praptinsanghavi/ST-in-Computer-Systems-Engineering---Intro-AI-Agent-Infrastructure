---
description: Produce messages to Apache Kafka topics with a Java or Scala future API.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:21Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/send-producer.html
title: Send Producer • Alpakka Kafka Documentation
---

# Send Producer • Alpakka Kafka Documentation

> **Summary:** Produce messages to Apache Kafka topics with a Java or Scala future API.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Send Producer

A producer publishes messages to Kafka topics. The message itself contains information about what topic and partition to publish to so you can publish to different topics with the same producer.

The Alpakka Kafka [`SendProducer`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/SendProducer.html "akka.kafka.javadsl.SendProducer")[`SendProducer`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/SendProducer.html "akka.kafka.scaladsl.SendProducer") does not integrate with Akka Streams. Instead, it offers a wrapper of the Apache Kafka [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") to send data to Kafka topics in a per\-element fashion with a `Future`\-based`CompletionStage`\-based API.

It supports the same [settings](producer.html#settings) as Alpakka [`Producer`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer") flows and sinks and supports [service discovery](discovery.html).

After use, the `Producer` needs to be properly closed via the asynchronous `close()` method.

## Producing

The Send Producer offers methods for sending

- [`ProducerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html "org.apache.kafka.clients.producer.ProducerRecord") with `send`
- [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope") with `sendEnvelope` (similar to `Producer.flexiFlow`)

After use, the Send Producer should be closed with `close()`.

### ProducerRecord

Produce a [`ProducerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html "org.apache.kafka.clients.producer.ProducerRecord") to a topic.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/SendProducerSpec.scala#L26-L40 "Go to snippet source")val producer = SendProducer(producerDefaults)
try {
  val send: Future[RecordMetadata] = producer
    .send(new ProducerRecord(topic1, "key", "value"))
  // Blocking here for illustration only, you need to handle the future result
  Await.result(send, 2.seconds)
} finally {
  Await.result(producer.close(), 1.minute)
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/SendProducerTest.java#L53-L64 "Go to snippet source")SendProducer<String, String> producer = new SendProducer<>(producerSettings, system);
try {
  CompletionStage<RecordMetadata> result =
      producer.send(new ProducerRecord<>(topic, "key", "value"));
  // Blocking here for illustration only, you need to handle the future result
  RecordMetadata recordMetadata = result.toCompletableFuture().get(2, TimeUnit.SECONDS);
} finally {
  producer.close().toCompletableFuture().get(1, TimeUnit.MINUTES);
}
```

### Envelope

The [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope") can be used to send one record, or a list of of [`ProducerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html "org.apache.kafka.clients.producer.ProducerRecord")s to produce a single or multiple messages to Kafka topics. The envelope can be used to pass through an arbitrary value which will be attached to the result.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/SendProducerSpec.scala#L73-L96 "Go to snippet source")val producer = SendProducer(producerDefaults)
try {
  val envelope: ProducerMessage.Envelope[String, String, String] =
    ProducerMessage.multi(immutable.Seq(
                            new ProducerRecord(topic1, "key", "value1"),
                            new ProducerRecord(topic1, "key", "value2"),
                            new ProducerRecord(topic1, "key", "value3")
                          ),
                          "context")
  val send: Future[ProducerMessage.Results[String, String, String]] = producer.sendEnvelope(envelope)
} finally {
  Await.result(producer.close(), 1.minute)
}
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/SendProducerTest.java#L77-L99 "Go to snippet source")SendProducer<String, String> producer = new SendProducer<>(producerSettings, system);
try {
  ProducerMessage.Envelope<String, String, String> envelope =
      ProducerMessage.multi(
          Arrays.asList(
              new ProducerRecord<>(topic, "key", "value1"),
              new ProducerRecord<>(topic, "key", "value2"),
              new ProducerRecord<>(topic, "key", "value3")),
          "context");
  CompletionStage<ProducerMessage.Results<String, String, String>> send =
      producer.sendEnvelope(envelope);
  // Blocking here for illustration only, you need to handle the future result
  ProducerMessage.Results<String, String, String> result =
      send.toCompletableFuture().get(2, TimeUnit.SECONDS);
} finally {
  producer.close().toCompletableFuture().get(1, TimeUnit.MINUTES);
}
```

After successful sending, a [`ProducerMessage.Message`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html "akka.kafka.ProducerMessage.Message")[`ProducerMessage.Message`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html "akka.kafka.ProducerMessage.Message") will return a [`Result`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html "akka.kafka.ProducerMessage.Result")[`Result`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html "akka.kafka.ProducerMessage.Result") element containing:

1. the original input message,
2. the record metadata (Kafka [`RecordMetadata`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/RecordMetadata.html "org.apache.kafka.clients.producer.RecordMetadata") API), and
3. access to the `passThrough` within the message.

A [`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage")[`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage") will return a [`MultiResult`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html "akka.kafka.ProducerMessage.MultiResult")[`MultiResult`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html "akka.kafka.ProducerMessage.MultiResult") containing:

1. a list of [`ProducerMessage.MultiResultPart`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html "akka.kafka.ProducerMessage.MultiResultPart")[`ProducerMessage.MultiResultPart`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html "akka.kafka.ProducerMessage.MultiResultPart") with
	1. the original input message,
	2. the record metadata (Kafka [`RecordMetadata`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/RecordMetadata.html "org.apache.kafka.clients.producer.RecordMetadata") API), and
2. the `passThrough` data.

## Code Examples

### Example 1: ProducerRecord

```scala
val producer = SendProducer(producerDefaults)
try {
  val send: Future[RecordMetadata] = producer
    .send(new ProducerRecord(topic1, "key", "value"))
  // Blocking here for illustration only, you need to handle the future result
  Await.result(send, 2.seconds)
} finally {
  Await.result(producer.close(), 1.minute)
}
```

### Example 2: ProducerRecord

```java
SendProducer<String, String> producer = new SendProducer<>(producerSettings, system);
try {
  CompletionStage<RecordMetadata> result =
      producer.send(new ProducerRecord<>(topic, "key", "value"));
  // Blocking here for illustration only, you need to handle the future result
  RecordMetadata recordMetadata = result.toCompletableFuture().get(2, TimeUnit.SECONDS);
} finally {
  producer.close().toCompletableFuture().get(1, TimeUnit.MINUTES);
}
```

### Example 3: Envelope

```scala
val producer = SendProducer(producerDefaults)
try {
  val envelope: ProducerMessage.Envelope[String, String, String] =
    ProducerMessage.multi(immutable.Seq(
                            new ProducerRecord(topic1, "key", "value1"),
                            new ProducerRecord(topic1, "key", "value2"),
                            new ProducerRecord(topic1, "key", "value3")
                          ),
                          "context")
  val send: Future[ProducerMessage.Results[String, String, String]] = producer.sendEnvelope(envelope)
} finally {
  Await.result(producer.close(), 1.minute)
}
```

### Example 4: Envelope

```java
SendProducer<String, String> producer = new SendProducer<>(producerSettings, system);
try {
  ProducerMessage.Envelope<String, String, String> envelope =
      ProducerMessage.multi(
          Arrays.asList(
              new ProducerRecord<>(topic, "key", "value1"),
              new ProducerRecord<>(topic, "key", "value2"),
              new ProducerRecord<>(topic, "key", "value3")),
          "context");
  CompletionStage<ProducerMessage.Results<String, String, String>> send =
      producer.sendEnvelope(envelope);
  // Blocking here for illustration only, you need to handle the future result
  ProducerMessage.Results<String, String, String> result =
      send.toCompletableFuture().get(2, TimeUnit.SECONDS);
} finally {
  producer.close().toCompletableFuture().get(1, TimeUnit.MINUTES);
}
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/SendProducer.html
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html
- https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
- https://doc.akka.io/libraries/alpakka-kafka/current/producer.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/send-producer.html](https://doc.akka.io/libraries/alpakka-kafka/current/send-producer.html)*