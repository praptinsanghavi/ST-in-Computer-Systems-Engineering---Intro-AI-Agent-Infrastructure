---
description: Handle errors from the Kafka API in Alpakka Kafka.
knowledge_type: official_documentation
scraped_at: '2026-04-06T14:50:44Z'
section: docs
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/errorhandling.html
title: Error handling • Alpakka Kafka Documentation
---

# Error handling • Alpakka Kafka Documentation

> **Summary:** Handle errors from the Kafka API in Alpakka Kafka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# Error handling

## Failing consumer

Errors from the Kafka consumer will be forwarded to the Alpakka sources that use it, the sources will fail their streams.

### Lost connection to the Kafka broker

To fail a Alpakka Kafka consumer in case the Kafka broker is not available, configure a **Connection Checker** via [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings")[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html "akka.kafka.ConsumerSettings"). If not **Connection Checker** is configured, Alpakka will continue to poll the broker indefinitely.

## Failing producer

Retry handling for producers is built\-in into Kafka. In case of failure when sending a message, an exception will be thrown, which should fail the stream. 

## Restarting the stream with a backoff stage

Akka streams [provides graph stages](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html#delayed-restarts-with-a-backoff-stage) to gracefully restart a stream on failure, with a configurable backoff. This can be taken advantage of to restart a failing stream and its consumer with an exponential backoff, by wrapping it in a `RestartSource`.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/ConsumerExample.scala#L541-L558 "Go to snippet source")val control = new AtomicReference[Consumer.Control](Consumer.NoopControl)

val restartSettings = RestartSettings(minBackoff = 3.seconds, maxBackoff = 30.seconds, randomFactor = 0.2)
val streamCompletion = RestartSource
  .onFailuresWithBackoff(restartSettings) { () =>
    Consumer
      .plainSource(consumerSettings, Subscriptions.topics(topic))
      // this is a hack to get access to the Consumer.Control
      // instances of the latest Kafka Consumer source
      .mapMaterializedValue(c => control.set(c))
      .via(businessFlow)
  }
  .runWith(Sink.seq)

control.get().drainAndShutdown(streamCompletion)
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/ConsumerExampleTest.java#L430-L452 "Go to snippet source")AtomicReference<Consumer.Control> control = new AtomicReference<>(Consumer.createNoopControl());

RestartSettings restartSettings =
    RestartSettings.create(Duration.ofSeconds(3), Duration.ofSeconds(30), 0.2);
CompletionStage<Done> streamCompletion =
    RestartSource.onFailuresWithBackoff(
            restartSettings,
            () ->
                Consumer.plainSource(consumerSettings, Subscriptions.topics(topic))
                    .mapMaterializedValue(
                        c -> {
                          // this is a hack to get access to the Consumer.Control
                          // instances of the latest Kafka Consumer source
                          control.set(c);
                          return c;
                        })
                    .via(business()))
        .runWith(Sink.ignore(), system);

control.get().drainAndShutdown(streamCompletion, system.getDispatcher());
```

When a stream fails, library internals will handle all underlying resources.

(de)serialization
If reading from Kafka failure is caused by other reasons, like **deserialization problems**, then the stage will fail immediately. If you expect such cases, consider consuming raw byte arrays and deserializing in a subsequent `map` stage where you can use supervision to skip failed elements. See also [Serialization](serialization.html) and [“At least once”](atleastonce.html) pages for more suggestions.

## Unexpected consumer offset reset

Sometimes, due to various Kafka server bugs (see below) the consumer will fail to fetch on offset that exists. In this case, the consumer has three approaches to handling the missing offset:

- No action: consumer fails and stops attempting to make progress.
- Latest: consumer skips to the end of the partition and starts reading from there.
	- **NOTE**: consumer can skip processing some data in the topic by going to the latest data
- Earliest: consumer restarts from the beginning of the partition.
	- **NOTE**: consumer will never skip data, but may reprocess many days of data, up to the topic’s configured retention

Alpakka Kafka cannot do anything for the first two approaches. However, the `offset-reset-protection` configuration in the `ConsumerSettings` can help detect the inadvertent loss of offsets and subsequent reset. You can configure `akka.kafka.consumer.offset-reset-protection.offset-threshold` to a number of offsets back from the *latest requested offset* that would indicate one of these reset bugs has occurred. Similarly, setting `akka.kafka.consumer.offset-reset-protection.time-threshold` will reset the consumer back to the latest committed offset when a record is older than `now - time-threshold`; that is, `time-threshold` older than the last received offset.

When the client notices that the offset from the next fetched batch is outside the threshold for a given partition, the consumer will be re\-seeked back the latest committed offset; the last known ‘safe’ point in the data. The consumer will then start consuming from that offset forward. This can avoid a significant amount of wasted data processing and keep your consumers’ progress moving forward (and avoid being paged for high consumer lag).

For example, lets assume there is a consumer that has committed offset 1000 on partition 1\. The consumer is doing work in batches, so it doesn’t commit and fetch every record, so now it attempts to fetch offset 1100\. However, due to a server\-side bug, Kafka returns offset 1 for partition 1\. Without consumer reset protection, the consumer would then need to reprocess all the offsets from 1 to 1000 (this can often look like a consumer “rewinding”). With consumer reset protection enabled with a threshold of, for example, 200 the consumer would notice the reset and then fetch again from the latest offset. That means, the consumer would only need to process 100 messages to catch up, a 10x improvement from the 1000 messages it would have had to process with offset\-reset\-protection enabled.

By default, consumer reset protection is **off**. You must set `akka.kafka.consumer.offset-reset-protection.enable = true`, and set one of the thresholds, to enable it.

Internally, the consumer attempts to avoid too much overhead in checking each batch, so it verifies only that the first and the last offset in each received batch for each partition are within the threshold. This should have a minimal impact on consumer performance, but as always, be sure to benchmark for your use case before enabling. 

### Setting offset threshold appropriately

Generally speaking offsets should only be used to define reset thresholds when consuming records whose timestamps are `-1` (often only seen with old, 0\.11 consumers); instead prefer to use `time-threshold`consumer reset protection configuration. 

If you set the offset threshold to less than the frequency at which you commit, any reset protection that takes place will likely cause you reprocess more data than necessary. For example, assume you commit every 1000 records, but have `offset-reset-protection.offset-threshold` set to 500 records then a reset could then cause you to\-reprocess up to 999 records in the worst case. 

You should set the consumer reset protection to the number of offsets near the topic’s configured retention. Alternatively, you can (a) increase the frequency with which you commit or (b) increase the offset protection window.

### Kafka broker offset reset issues

- [KAFKA\-7414](https://issues.apache.org/jira/browse/KAFKA-7414)
- [KAFKA\-7447](https://issues.apache.org/jira/browse/KAFKA-7447)
- [KAFKA\-8896](https://issues.apache.org/jira/browse/KAFKA-8896)
- [KAFKA\-9543](https://issues.apache.org/jira/browse/KAFKA-9543)
- [KAFKA\-9807](https://issues.apache.org/jira/browse/KAFKA-9807)
- [KAFKA\-9824](https://issues.apache.org/jira/browse/KAFKA-9824)
- [KAFKA\-9835](https://issues.apache.org/jira/browse/KAFKA-9835)
- [KAFKA\-10313](https://issues.apache.org/jira/browse/KAFKA-10313)

## Code Examples

### Example 1: Restarting the stream with a backoff stage

```scala
val control = new AtomicReference[Consumer.Control](Consumer.NoopControl)

val restartSettings = RestartSettings(minBackoff = 3.seconds, maxBackoff = 30.seconds, randomFactor = 0.2)
val streamCompletion = RestartSource
  .onFailuresWithBackoff(restartSettings) { () =>
    Consumer
      .plainSource(consumerSettings, Subscriptions.topics(topic))
      // this is a hack to get access to the Consumer.Control
      // instances of the latest Kafka Consumer source
      .mapMaterializedValue(c => control.set(c))
      .via(businessFlow)
  }
  .runWith(Sink.seq)

control.get().drainAndShutdown(streamCompletion)
```

### Example 2: Restarting the stream with a backoff stage

```java
AtomicReference<Consumer.Control> control = new AtomicReference<>(Consumer.createNoopControl());

RestartSettings restartSettings =
    RestartSettings.create(Duration.ofSeconds(3), Duration.ofSeconds(30), 0.2);
CompletionStage<Done> streamCompletion =
    RestartSource.onFailuresWithBackoff(
            restartSettings,
            () ->
                Consumer.plainSource(consumerSettings, Subscriptions.topics(topic))
                    .mapMaterializedValue(
                        c -> {
                          // this is a hack to get access to the Consumer.Control
                          // instances of the latest Kafka Consumer source
                          control.set(c);
                          return c;
                        })
                    .via(business()))
        .runWith(Sink.ignore(), system);

control.get().drainAndShutdown(streamCompletion, system.getDispatcher());
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/docs/alpakka-kafka/current/atleastonce.html
- https://doc.akka.io/docs/alpakka-kafka/current/cluster-sharding.html
- https://doc.akka.io/docs/alpakka-kafka/current/serialization.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-error.html

---
*Source: [https://doc.akka.io/docs/alpakka-kafka/current/errorhandling.html](https://doc.akka.io/docs/alpakka-kafka/current/errorhandling.html)*