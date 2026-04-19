---
description: Produce messages to Apache Kafka topics from Akka Streams with Alpakka
  Kafka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:34:26Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/producer.html
title: Producer • Alpakka Kafka Documentation
---

# Producer • Alpakka Kafka Documentation

> **Summary:** Produce messages to Apache Kafka topics from Akka Streams with Alpakka Kafka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Producer

A producer publishes messages to Kafka topics. The message itself contains information about what topic and partition to publish to so you can publish to different topics with the same producer.

The underlying implementation is using the `KafkaProducer`, see the [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") API for details.

## Choosing a producer

Alpakka Kafka offers producer flows and sinks that connect to Kafka and write data. The tables below may help you to find the producer best suited for your use\-case.

For use\-cases that don’t benefit from Akka Streams, the [Send Producer](send-producer.html) offers a `Future`\-based`CompletionStage`\-based send API.

### Producers

These factory methods are part of the [`Producer`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html "akka.kafka.javadsl.Producer")[`Producer`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html "akka.kafka.scaladsl.Producer") API.

| Factory method | May use shared producer | Stream element type | Pass\-through | Context |
| --- | --- | --- | --- | --- |
| `plainSink` | Yes | `ProducerRecord` | N/A | N/A |
| `flexiFlow` | Yes | `Envelope` | Any | N/A |
| `flowWithContext` | Yes | `Envelope` | No | Any |

### Committing producer sinks

These producers produce messages to Kafka and commit the offsets of incoming messages regularly.

| Factory method | May use shared producer | Stream element type | Pass\-through | Context |
| --- | --- | --- | --- | --- |
| `committableSink` | Yes | `Envelope` | `Committable` | N/A |
| `committableSinkWithOffsetContext` | Yes | `Envelope` | Any | `Committable` |

For details about the batched committing see [Consumer: Offset Storage in Kafka \- committing](consumer.html#offset-storage-in-kafka-committing).

### Transactional producers

These factory methods are part of the [`Transactional`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html "akka.kafka.javadsl.Transactional")[`Transactional`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html "akka.kafka.scaladsl.Transactional") API. For details see [Transactions](transactions.html). Alpakka Kafka must manage the producer when using transactions.

| Factory method | May use shared producer | Stream element type | Pass\-through |
| --- | --- | --- | --- |
| `sink` | No | `Envelope` | N/A |
| `flow` | No | `Envelope` | No |
| `sinkWithOffsetContext` | No | `Envelope` | N/A |
| `flowWithOffsetContext` | No | `Envelope` | No |

## Settings

When creating a producer stream you need to pass in [`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings")[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings") that define things like:

- bootstrap servers of the Kafka cluster (see [Service discovery](discovery.html) to defer the server configuration)
- serializers for the keys and values
- tuning parameters

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L30-L33 "Go to snippet source")val config = system.settings.config.getConfig("akka.kafka.producer")
val producerSettings =
  ProducerSettings(config, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L71-L74 "Go to snippet source")final Config config = system.settings().config().getConfig("akka.kafka.producer");
final ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(config, new StringSerializer(), new StringSerializer())
        .withBootstrapServers("localhost:9092");
```

In addition to programmatic construction of the [`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings")[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings") it can also be created from configuration (`application.conf`). 

When creating [`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings")[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings") with a classic [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html "akka.actor.ActorSystem") or typed [`ActorSystem`](https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem")[`ActorSystem`](https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html "akka.actor.typed.ActorSystem") it uses the config section `akka.kafka.producer`. The format of these settings files are described in the [Typesafe Config Documentation](https://github.com/lightbend/config#using-hocon-the-json-superset).

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/resources/reference.conf#L3-L52 "Go to snippet source")# Properties for akka.kafka.ProducerSettings can be
# defined in this section or a configuration section with
# the same layout.
akka.kafka.producer {
  # Config path of Akka Discovery method
  # "akka.discovery" to use the Akka Discovery method configured for the ActorSystem
  discovery-method = akka.discovery

  # Set a service name for use with Akka Discovery
  # https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
  service-name = ""

  # Timeout for getting a reply from the discovery-method lookup
  resolve-timeout = 3 seconds

  # Tuning parameter of how many sends that can run in parallel.
  # In 2.0.0: changed the default from 100 to 10000
  parallelism = 10000

  # Duration to wait for `KafkaProducer.close` to finish.
  close-timeout = 60s

  # Call `KafkaProducer.close` when the stream is shutdown. This is important to override to false
  # when the producer instance is shared across multiple producer stages.
  close-on-producer-stop = true

  # Fully qualified config path which holds the dispatcher configuration
  # to be used by the producer stages. Some blocking may occur.
  # When this value is empty, the dispatcher configured for the stream
  # will be used.
  use-dispatcher = "akka.kafka.default-dispatcher"

  # The time interval to commit a transaction when using the `Transactional.sink` or `Transactional.flow`
  # for exactly-once-semantics processing.
  eos-commit-interval = 100ms

  # This can be used to prepend a value to the beginning of a transaction id when using
  # the `Transactional.sink` or `Transactional.flow` for exactly-once-semantics processing.
  transaction-id-prefix = ""

  # The value of `max.in.flight.requests.per.connection` used by the transactional producer.
  # Defaults to 1 (safe for all Kafka versions). Kafka 2.5+ (KIP-360) supports up to 5 in-flight
  # requests with exactly-once semantics, which can improve throughput.
  transactional-max-in-flight-requests-per-connection = 1

  # Properties defined by org.apache.kafka.clients.producer.ProducerConfig
  # can be defined in this configuration section.
  kafka-clients {
  }
}
```

[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings")[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html "akka.kafka.ProducerSettings") can also be created from any other `Config` section with the same layout as above.

See Kafka’s [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") and [`ProducerConfig`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerConfig.html "org.apache.kafka.clients.producer.ProducerConfig") for more details regarding settings.

## Producer as a Sink

[`Producer.plainSink`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html#plainSink[K,V](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Sink[org.apache.kafka.clients.producer.ProducerRecord[K,V],java.util.concurrent.CompletionStage[akka.Done]] "akka.kafka.javadsl.Producer")[`Producer.plainSink`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html#plainSink[K,V](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.scaladsl.Sink[org.apache.kafka.clients.producer.ProducerRecord[K,V],scala.concurrent.Future[akka.Done]] "akka.kafka.scaladsl.Producer") is the easiest way to publish messages. The sink consumes the Kafka type [`ProducerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html "org.apache.kafka.clients.producer.ProducerRecord") which contains 

1. a topic name to which the record is being sent,
2. an optional partition number,
3. an optional key, and
4. a value.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L52-L56 "Go to snippet source")val done: Future[Done] =
  Source(1 to 100)
    .map(_.toString)
    .map(value => new ProducerRecord[String, String](topic, value))
    .runWith(Producer.plainSink(producerSettings))
```
 The materialized value of the sink is a `Future[Done]` which is completed with `Done` when the stream completes, or with with an exception in case an error occurs.
Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L86-L90 "Go to snippet source")CompletionStage<Done> done =
    Source.range(1, 100)
        .map(number -> number.toString())
        .map(value -> new ProducerRecord<String, String>(topic, value))
        .runWith(Producer.plainSink(producerSettings), system);
```
 The materialized value of the sink is a `CompletionStage<Done>` which is completed with `Done` when the stream completes, or with an exception in case an error occurs.

## Producing messages

Sinks and flows accept implementations of [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope") as input. They contain an extra field to pass through data, the so called `passThrough`. Its value is passed through the flow and becomes available in the [`Results`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html "akka.kafka.ProducerMessage.Results")[`Results`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html "akka.kafka.ProducerMessage.Results")’ `passThrough()`. It can for example hold a [`CommittableOffset`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html "akka.kafka.ConsumerMessage.CommittableOffset")[`CommittableOffset`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html "akka.kafka.ConsumerMessage.CommittableOffset") or [`ConsumerMessage.CommittableOffsetBatch`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "akka.kafka.ConsumerMessage.CommittableOffsetBatch")[`ConsumerMessage.CommittableOffsetBatch`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "akka.kafka.ConsumerMessage.CommittableOffsetBatch") from a [`Consumer.committableSource`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html "akka.kafka.javadsl.Consumer")[`Consumer.committableSource`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html "akka.kafka.scaladsl.Consumer") that can be committed after publishing to Kafka. 

### Produce a single message to Kafka

To create one message to a Kafka topic, use the [`ProducerMessage.Message`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html "akka.kafka.ProducerMessage.Message")[`ProducerMessage.Message`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html "akka.kafka.ProducerMessage.Message") type as in

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L122-L126 "Go to snippet source")val single: ProducerMessage.Envelope[KeyType, ValueType, PassThroughType] =
  ProducerMessage.single(
    new ProducerRecord("topicName", key, value),
    passThrough
  )
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L145-L146 "Go to snippet source")ProducerMessage.Envelope<KeyType, ValueType, PassThroughType> message =
    ProducerMessage.single(new ProducerRecord<>("topicName", key, value), passThrough);
```

For flows the [`ProducerMessage.Message`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html "akka.kafka.ProducerMessage.Message")[`ProducerMessage.Message`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html "akka.kafka.ProducerMessage.Message")s continue as [`Result`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html "akka.kafka.ProducerMessage.Result")[`Result`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html "akka.kafka.ProducerMessage.Result") elements containing: 

1. the original input message,
2. the record metadata (Kafka [`RecordMetadata`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/RecordMetadata.html "org.apache.kafka.clients.producer.RecordMetadata") API), and
3. access to the `passThrough` within the message.

### Let one stream element produce multiple messages to Kafka

The [`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage")[`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage") contains a list of [`ProducerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html "org.apache.kafka.clients.producer.ProducerRecord")s to produce multiple messages to Kafka topics.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L138-L145 "Go to snippet source")val multi: ProducerMessage.Envelope[KeyType, ValueType, PassThroughType] =
  ProducerMessage.multi(
    immutable.Seq(
      new ProducerRecord("topicName", key, value),
      new ProducerRecord("anotherTopic", key, value)
    ),
    passThrough
  )
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L155-L160 "Go to snippet source")ProducerMessage.Envelope<KeyType, ValueType, PassThroughType> multiMessage =
    ProducerMessage.multi(
        Arrays.asList(
            new ProducerRecord<>("topicName", key, value),
            new ProducerRecord<>("anotherTopic", key, value)),
        passThrough);
```

For flows the [`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage")[`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage")s continue as [`MultiResult`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html "akka.kafka.ProducerMessage.MultiResult")[`MultiResult`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html "akka.kafka.ProducerMessage.MultiResult") elements containing: 

1. a list of [`ProducerMessage.MultiResultPart`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html "akka.kafka.ProducerMessage.MultiResultPart")[`ProducerMessage.MultiResultPart`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html "akka.kafka.ProducerMessage.MultiResultPart") with
	1. the original input message,
	2. the record metadata (Kafka [`RecordMetadata`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/RecordMetadata.html "org.apache.kafka.clients.producer.RecordMetadata") API), and
2. the `passThrough` data.

### Let a stream element pass through, without producing a message to Kafka

The [`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage")[`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage") allows to let an element pass through a Kafka flow without producing a new message to a Kafka topic. This is primarily useful with Kafka commit offsets and transactions, so that these can be committed without producing new messages.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L156-L159 "Go to snippet source")val ptm: ProducerMessage.Envelope[KeyType, ValueType, PassThroughType] =
  ProducerMessage.passThrough(
    passThrough
  )
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L169-L170 "Go to snippet source")ProducerMessage.Envelope<KeyType, ValueType, PassThroughType> ptm =
    ProducerMessage.passThrough(passThrough);
```

For flows the [`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage")[`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage")s continue as [`ProducerMessage.PassThroughResult`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughResult.html "akka.kafka.ProducerMessage.PassThroughResult")[`ProducerMessage.PassThroughResult`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughResult.html "akka.kafka.ProducerMessage.PassThroughResult") elements containing the `passThrough` data. 

## Producer as a Flow

[`Producer.flexiFlow`](/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html#flexiFlow[K,V,PassThrough](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.javadsl.Flow[akka.kafka.ProducerMessage.Envelope[K,V,PassThrough],akka.kafka.ProducerMessage.Results[K,V,PassThrough],akka.NotUsed] "akka.kafka.javadsl.Producer")[`Producer.flexiFlow`](/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html#flexiFlow[K,V,PassThrough](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.scaladsl.Flow[akka.kafka.ProducerMessage.Envelope[K,V,PassThrough],akka.kafka.ProducerMessage.Results[K,V,PassThrough],akka.NotUsed] "akka.kafka.scaladsl.Producer") allows the stream to continue after publishing messages to Kafka. It accepts implementations of [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope") as input, which continue in the flow as implementations of [`ProducerMessage.Results`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html "akka.kafka.ProducerMessage.Results")[`ProducerMessage.Results`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html "akka.kafka.ProducerMessage.Results"). 

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L170-L195 "Go to snippet source")val done = Source(1 to 100)
  .map { number =>
    val partition = 0
    val value = number.toString
    ProducerMessage.single(
      new ProducerRecord(topic, partition, "key", value),
      number
    )
  }
  .via(Producer.flexiFlow(producerSettings))
  .map {
    case ProducerMessage.Result(metadata, ProducerMessage.Message(record, passThrough)) =>
      s"${metadata.topic}/${metadata.partition} ${metadata.offset}: ${record.value}"

    case ProducerMessage.MultiResult(parts, passThrough) =>
      parts
        .map {
          case MultiResultPart(metadata, record) =>
            s"${metadata.topic}/${metadata.partition} ${metadata.offset}: ${record.value}"
        }
        .mkString(", ")

    case ProducerMessage.PassThroughResult(passThrough) =>
      s"passed through"
  }
  .runWith(Sink.foreach(println(_)))
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L179-L225 "Go to snippet source")CompletionStage<Done> done =
    Source.range(1, 100)
        .map(
            number -> {
              int partition = 0;
              String value = String.valueOf(number);
              ProducerMessage.Envelope<String, String, Integer> msg =
                  ProducerMessage.single(
                      new ProducerRecord<>(topic, partition, "key", value), number);
              return msg;
            })
        .via(Producer.flexiFlow(producerSettings))
        .map(
            result -> {
              if (result instanceof ProducerMessage.Result) {
                ProducerMessage.Result<String, String, Integer> res =
                    (ProducerMessage.Result<String, String, Integer>) result;
                ProducerRecord<String, String> record = res.message().record();
                RecordMetadata meta = res.metadata();
                return meta.topic()
                    + "/"
                    + meta.partition()
                    + " "
                    + res.offset()
                    + ": "
                    + record.value();
              } else if (result instanceof ProducerMessage.MultiResult) {
                ProducerMessage.MultiResult<String, String, Integer> res =
                    (ProducerMessage.MultiResult<String, String, Integer>) result;
                return res.getParts().stream()
                    .map(
                        part -> {
                          RecordMetadata meta = part.metadata();
                          return meta.topic()
                              + "/"
                              + meta.partition()
                              + " "
                              + part.metadata().offset()
                              + ": "
                              + part.record().value();
                        })
                    .reduce((acc, s) -> acc + ", " + s);
              } else {
                return "passed through";
              }
            })
        .runWith(Sink.foreach(System.out::println), system);
```

## Connecting a Producer to a Consumer

The `passThrough` can for example hold a [`Committable`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html "akka.kafka.ConsumerMessage.Committable")[`Committable`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html "akka.kafka.ConsumerMessage.Committable") that can be committed after publishing to Kafka. 

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

## Sharing the KafkaProducer instance

The underlying [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") is thread safe and sharing a single producer instance across streams will generally be faster than having multiple instances. You cannot share `KafkaProducer` with the Transactional flows and sinks.

To create a [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") from the Kafka connector settings described [above](#settings), the [`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html "akka.kafka.ProducerSettings")[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html "akka.kafka.ProducerSettings") contains the factory methods `createKafkaProducerAsync``createKafkaProducerCompletionStage` and `createKafkaProducer` (blocking for asynchronous enriching).

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L30-L40 "Go to snippet source")val config = system.settings.config.getConfig("akka.kafka.producer")
val producerSettings =
  ProducerSettings(config, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)
val kafkaProducer: Future[org.apache.kafka.clients.producer.Producer[String, String]] =
  producerSettings.createKafkaProducerAsync()

// using the kafka producer

kafkaProducer.foreach(p => p.close())
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L71-L77 "Go to snippet source")final Config config = system.settings().config().getConfig("akka.kafka.producer");
final ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(config, new StringSerializer(), new StringSerializer())
        .withBootstrapServers("localhost:9092");
final org.apache.kafka.clients.producer.Producer<String, String> kafkaProducer =
    producerSettings.createKafkaProducer();
```

The [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") instance (or FutureCompletionStage) is passed as a parameter to [`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html "akka.kafka.ProducerSettings")[`ProducerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html "akka.kafka.ProducerSettings") using the methods `withProducer` and `withProducerFactory`.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L73-L93 "Go to snippet source")// create a producer
val kafkaProducer = producerSettings.createKafkaProducer()
val settingsWithProducer = producerSettings.withProducer(kafkaProducer)

val done = Source(1 to 100)
  .map(_.toString)
  .map(value => new ProducerRecord[String, String](topic, value))
  .runWith(Producer.plainSink(settingsWithProducer))

// close the producer after use
kafkaProducer.close()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L108-L115 "Go to snippet source")ProducerSettings<String, String> settingsWithProducer =
    producerSettings.withProducer(kafkaProducer);

CompletionStage<Done> done =
    Source.range(1, 100)
        .map(number -> number.toString())
        .map(value -> new ProducerRecord<String, String>(topic, value))
        .runWith(Producer.plainSink(settingsWithProducer), system);
```

## Accessing KafkaProducer metrics

By passing an explicit reference to a [`KafkaProducer`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/KafkaProducer.html "org.apache.kafka.clients.producer.KafkaProducer") (as shown in the previous section) its metrics become accessible. Refer to the Kafka [`MetricName`](https://kafka.apache.org/41/javadoc/org/apache/kafka/common/MetricName.html "org.apache.kafka.common.MetricName") API for more details.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ProducerExample.scala#L106-L107 "Go to snippet source")val metrics: java.util.Map[org.apache.kafka.common.MetricName, _ <: org.apache.kafka.common.Metric] =
  kafkaProducer.metrics() // observe metrics
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ProducerTest.java#L134-L135 "Go to snippet source")Map<org.apache.kafka.common.MetricName, ? extends org.apache.kafka.common.Metric> metrics =
    kafkaProducer.metrics(); // observe metrics
```

## Code Examples

### Example 1: Settings

```scala
val config = system.settings.config.getConfig("akka.kafka.producer")
val producerSettings =
  ProducerSettings(config, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)
```

### Example 2: Settings

```java
final Config config = system.settings().config().getConfig("akka.kafka.producer");
final ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(config, new StringSerializer(), new StringSerializer())
        .withBootstrapServers("localhost:9092");
```

### Example 3: Settings

```conf
# Properties for akka.kafka.ProducerSettings can be
# defined in this section or a configuration section with
# the same layout.
akka.kafka.producer {
  # Config path of Akka Discovery method
  # "akka.discovery" to use the Akka Discovery method configured for the ActorSystem
  discovery-method = akka.discovery

  # Set a service name for use with Akka Discovery
  # https://doc.akka.io/libraries/alpakka-kafka/current/discovery.html
  service-name = ""

  # Timeout for getting a reply from the discovery-method lookup
  resolve-timeout = 3 seconds

  # Tuning parameter of how many sends that can run in parallel.
  # In 2.0.0: changed the default from 100 to 10000
  parallelism = 10000

  # Duration to wait for `KafkaProducer.close` to finish.
  close-timeout = 60s

  # Call `KafkaProducer.close` when the stream is shutdown. This is important to override to false
  # when the producer instance is shared across multiple producer stages.
  close-on-producer-stop = true

  # Fully qualified config path which holds the dispatcher configuration
  # to be used by the producer stages. Some blocking may occur.
  # When this value is empty, the dispatcher configured for the stream
  # will be used.
  use-dispatcher = "akka.kafka.default-dispatcher"

  # The time interval to commit a transaction when using the `Transactional.sink` or `Transactional.flow`
  # for exactly-once-semantics processing.
  eos-commit-interval = 100ms

  # This can be used to prepend a value to the beginning of a transaction id when using
  # the `Transactional.sink` or `Transactional.flow` for exactly-once-semantics processing.
  transaction-id-prefix = ""

  # The value of `max.in.flight.requests.per.connection` used by the transactional producer.
  # Defaults to 1 (safe for all Kafka versions). Kafka 2.5+ (KIP-360) supports up to 5 in-flight
  # requests with exactly-once semantics, which can improve throughput.
  transactional-max-in-flight-requests-per-connection = 1

  # Properties defined by org.apache.kafka.clients.producer.ProducerConfig
  # can be defined in this configuration section.
  kafka-clients {
  }
}
```

### Example 4: Producer as a Sink

```scala
val done: Future[Done] =
  Source(1 to 100)
    .map(_.toString)
    .map(value => new ProducerRecord[String, String](topic, value))
    .runWith(Producer.plainSink(producerSettings))
```

### Example 5: Producer as a Sink

```java
CompletionStage<Done> done =
    Source.range(1, 100)
        .map(number -> number.toString())
        .map(value -> new ProducerRecord<String, String>(topic, value))
        .runWith(Producer.plainSink(producerSettings), system);
```

### Example 6: Produce a single message to Kafka

```scala
val single: ProducerMessage.Envelope[KeyType, ValueType, PassThroughType] =
  ProducerMessage.single(
    new ProducerRecord("topicName", key, value),
    passThrough
  )
```

### Example 7: Produce a single message to Kafka

```java
ProducerMessage.Envelope<KeyType, ValueType, PassThroughType> message =
    ProducerMessage.single(new ProducerRecord<>("topicName", key, value), passThrough);
```

### Example 8: Let one stream element produce multiple messages to Kafka

```scala
val multi: ProducerMessage.Envelope[KeyType, ValueType, PassThroughType] =
  ProducerMessage.multi(
    immutable.Seq(
      new ProducerRecord("topicName", key, value),
      new ProducerRecord("anotherTopic", key, value)
    ),
    passThrough
  )
```

### Example 9: Let one stream element produce multiple messages to Kafka

```java
ProducerMessage.Envelope<KeyType, ValueType, PassThroughType> multiMessage =
    ProducerMessage.multi(
        Arrays.asList(
            new ProducerRecord<>("topicName", key, value),
            new ProducerRecord<>("anotherTopic", key, value)),
        passThrough);
```

### Example 10: Let a stream element pass through, without producing a message to Kafka

```scala
val ptm: ProducerMessage.Envelope[KeyType, ValueType, PassThroughType] =
  ProducerMessage.passThrough(
    passThrough
  )
```

### Example 11: Let a stream element pass through, without producing a message to Kafka

```java
ProducerMessage.Envelope<KeyType, ValueType, PassThroughType> ptm =
    ProducerMessage.passThrough(passThrough);
```

### Example 12: Producer as a Flow

```scala
val done = Source(1 to 100)
  .map { number =>
    val partition = 0
    val value = number.toString
    ProducerMessage.single(
      new ProducerRecord(topic, partition, "key", value),
      number
    )
  }
  .via(Producer.flexiFlow(producerSettings))
  .map {
    case ProducerMessage.Result(metadata, ProducerMessage.Message(record, passThrough)) =>
      s"${metadata.topic}/${metadata.partition} ${metadata.offset}: ${record.value}"

    case ProducerMessage.MultiResult(parts, passThrough) =>
      parts
        .map {
          case MultiResultPart(metadata, record) =>
            s"${metadata.topic}/${metadata.partition} ${metadata.offset}: ${record.value}"
        }
        .mkString(", ")

    case ProducerMessage.PassThroughResult(passThrough) =>
      s"passed through"
  }
  .runWith(Sink.foreach(println(_)))
```

### Example 13: Producer as a Flow

```java
CompletionStage<Done> done =
    Source.range(1, 100)
        .map(
            number -> {
              int partition = 0;
              String value = String.valueOf(number);
              ProducerMessage.Envelope<String, String, Integer> msg =
                  ProducerMessage.single(
                      new ProducerRecord<>(topic, partition, "key", value), number);
              return msg;
            })
        .via(Producer.flexiFlow(producerSettings))
        .map(
            result -> {
              if (result instanceof ProducerMessage.Result) {
                ProducerMessage.Result<String, String, Integer> res =
                    (ProducerMessage.Result<String, String, Integer>) result;
                ProducerRecord<String, String> record = res.message().record();
                RecordMetadata meta = res.metadata();
                return meta.topic()
                    + "/"
                    + meta.partition()
                    + " "
                    + res.offset()
                    + ": "
                    + record.value();
              } else if (result instanceof ProducerMessage.MultiResult) {
                ProducerMessage.MultiResult<String, String, Integer> res =
                    (ProducerMessage.MultiResult<String, String, Integer>) result;
                return res.getParts().stream()
                    .map(
                        part -> {
                          RecordMetadata meta = part.metadata();
                          return meta.topic()
                              + "/"
                              + meta.partition()
                              + " "
                              + part.metadata().offset()
                              + ": "
                              + part.record().value();
                        })
                    .reduce((acc, s) -> acc + ", " + s);
              } else {
                return "passed through";
              }
            })
        .runWith(Sink.foreach(System.out::println), system);
```

### Example 14: Connecting a Producer to a Consumer

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

### Example 15: Connecting a Producer to a Consumer

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

### Example 16: Sharing the KafkaProducer instance

```scala
val config = system.settings.config.getConfig("akka.kafka.producer")
val producerSettings =
  ProducerSettings(config, new StringSerializer, new StringSerializer)
    .withBootstrapServers(bootstrapServers)
val kafkaProducer: Future[org.apache.kafka.clients.producer.Producer[String, String]] =
  producerSettings.createKafkaProducerAsync()

// using the kafka producer

kafkaProducer.foreach(p => p.close())
```

### Example 17: Sharing the KafkaProducer instance

```java
final Config config = system.settings().config().getConfig("akka.kafka.producer");
final ProducerSettings<String, String> producerSettings =
    ProducerSettings.create(config, new StringSerializer(), new StringSerializer())
        .withBootstrapServers("localhost:9092");
final org.apache.kafka.clients.producer.Producer<String, String> kafkaProducer =
    producerSettings.createKafkaProducer();
```

### Example 18: Sharing the KafkaProducer instance

```scala
// create a producer
val kafkaProducer = producerSettings.createKafkaProducer()
val settingsWithProducer = producerSettings.withProducer(kafkaProducer)

val done = Source(1 to 100)
  .map(_.toString)
  .map(value => new ProducerRecord[String, String](topic, value))
  .runWith(Producer.plainSink(settingsWithProducer))

// close the producer after use
kafkaProducer.close()
```

### Example 19: Sharing the KafkaProducer instance

```java
ProducerSettings<String, String> settingsWithProducer =
    producerSettings.withProducer(kafkaProducer);

CompletionStage<Done> done =
    Source.range(1, 100)
        .map(number -> number.toString())
        .map(value -> new ProducerRecord<String, String>(topic, value))
        .runWith(Producer.plainSink(settingsWithProducer), system);
```

### Example 20: Accessing KafkaProducer metrics

```scala
val metrics: java.util.Map[org.apache.kafka.common.MetricName, _ <: org.apache.kafka.common.Metric] =
  kafkaProducer.metrics() // observe metrics
```

### Example 21: Accessing KafkaProducer metrics

```java
Map<org.apache.kafka.common.MetricName, ? extends org.apache.kafka.common.Metric> metrics =
    kafkaProducer.metrics(); // observe metrics
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/api/akka/2.10/akka/actor/typed/ActorSystem.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html
- https://doc.akka.io/docs/alpakka-kafka/current/consumer.html
- https://doc.akka.io/docs/alpakka-kafka/current/discovery.html
- https://doc.akka.io/docs/alpakka-kafka/current/release-notes/1.0.x.html
- https://doc.akka.io/docs/alpakka-kafka/current/send-producer.html
- https://doc.akka.io/docs/alpakka-kafka/current/transactions.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/ActorSystem.html
- https://doc.akka.io/japi/akka/2.10/akka/actor/typed/ActorSystem.html

---
*Source: [https://doc.akka.io/docs/alpakka-kafka/current/producer.html](https://doc.akka.io/docs/alpakka-kafka/current/producer.html)*