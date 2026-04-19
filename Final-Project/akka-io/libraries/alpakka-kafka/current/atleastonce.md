---
description: Achieve at-least-once semantics with offset committing in Alpakka Kafka.
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:53Z'
section: libraries
site: akka-io
source_url: https://doc.akka.io/libraries/alpakka-kafka/current/atleastonce.html
title: At-Least-Once Delivery • Alpakka Kafka Documentation
---

# At-Least-Once Delivery • Alpakka Kafka Documentation

> **Summary:** Achieve at-least-once semantics with offset committing in Alpakka Kafka.

## Content

New to Akka? Start with the [Akka SDK](https://doc.akka.io/).

# At\-Least\-Once Delivery

At\-least\-once delivery semantics, the requirement to process every message, is a basic requirement of most applications. 

When using committable sources ([Offset Storage in Kafka](consumer.html#offset-storage-in-kafka-committing)), care is needed to ensure at\-least\-once delivery semantics are not lost inadvertently by committing an offset too early.

Below are some scenarios where this risk is present. These risks can easily be overlooked. Problems can also go undetected during tests since they depend on abruptly interrupting the flow in a particular state, and that state could be unlikely to occur. 

## Multiple Effects per Commit

### Multiple Messages

When connecting a committable source to a producer flow, some applications may require each consumed message to produce more than one message. In that case, in order to preserve at\-least\-once semantics, the message offset should only be committed after all associated messages have been produced.

To achieve this, use the [`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage")[`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage") implementation of [`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope")[`ProducerMessage.Envelope`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html "akka.kafka.ProducerMessage.Envelope"):

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AtLeastOnce.scala#L9-L54 "Go to snippet source")import akka.{Done, NotUsed}
import akka.kafka.ConsumerMessage.{CommittableOffset, CommittableOffsetBatch}
import akka.kafka.ProducerMessage.Envelope
import akka.kafka.scaladsl.Consumer.DrainingControl
import akka.kafka.{ProducerMessage, Subscriptions}
import akka.kafka.scaladsl.{Committer, Consumer, Producer}
import akka.kafka.testkit.scaladsl.TestcontainersKafkaLike
import akka.stream.scaladsl.{Keep, Sink}
import akka.stream.testkit.scaladsl.StreamTestKit.assertAllStagesStopped
import org.apache.kafka.clients.producer.ProducerRecord

import scala.collection.immutable
import scala.concurrent.Await
import scala.concurrent.duration._

Consumer
  .committableSource(consumerSettings, Subscriptions.topics(topic1))
  .map(
    msg =>
      ProducerMessage.multi(
        immutable.Seq(
          new ProducerRecord(topic2, msg.record.key, msg.record.value),
          new ProducerRecord(topic3, msg.record.key, msg.record.value)
        ),
        msg.committableOffset
      )
  )
  .via(Producer.flexiFlow(producerSettings))
  .map(_.passThrough)
  .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AtLeastOnceTest.java#L69-L83 "Go to snippet source")Consumer.committableSource(consumerSettings, Subscriptions.topics(topic1))
    .map(
        msg -> {
          Envelope<String, String, CommittableOffset> multiMsg =
              ProducerMessage.multi(
                  Arrays.asList(
                      new ProducerRecord<>(topic2, msg.record().value()),
                      new ProducerRecord<>(topic3, msg.record().value())),
                  msg.committableOffset());
          return multiMsg;
        })
    .via(Producer.flexiFlow(producerSettings))
    .map(m -> m.passThrough())
    .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
    .run(system);
```

### Batches

If committable messages are processed in batches (using `batch` or `grouped`), it is also important to commit the resulting [`ConsumerMessage.CommittableOffsetBatch`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "akka.kafka.ConsumerMessage.CommittableOffsetBatch")[`ConsumerMessage.CommittableOffsetBatch`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "akka.kafka.ConsumerMessage.CommittableOffsetBatch") only after all messages in the batch are fully processed.

Should the batch need to be split up again, using mapConcat, care should be taken to associate the [`ConsumerMessage.CommittableOffsetBatch`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "akka.kafka.ConsumerMessage.CommittableOffsetBatch")[`ConsumerMessage.CommittableOffsetBatch`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "akka.kafka.ConsumerMessage.CommittableOffsetBatch") only with the last message. This scenario could occur if we created batches to more efficiently update a database and then needed to split up the batches to send individual messages to a Kafka producer flow.

### Multiple Destinations

In the Conditional Message Processing section below we discuss how to handle producing to multiple Kafka topics, but here we consider writing to other types of persistent storage, or performing other side\-effects, perhaps in addition to producing to Kafka topics.

To commit an offset or an offset batch only after the multiple effects have been performed, we will usually want to assemble our side\-effecting flows in series, one after the other. This still allows the side effects to be performed concurrently on distinct messages, using `mapAsync` for example.

Alternatively, we could split\-off the flow using `alsoTo` to perform the effects in distinct parallel flows. We would then use `zip` to bring the two flows back together and re\-associate the matching committable offsets. This step is important to ensure that we only commit an offset once the effects from both flows are complete. This constrains the two flows to output the exact same sequence of committable offsets. So this approach may not be significantly more flexible then a serial arrangement.

## Non\-Sequential Processing

Messages from committable sources should be processed in order, otherwise a larger offset for a partition could be committed before the work associated to a smaller offset has been completed.

Reordering would be acceptable if the original order was reconstituted before committing the offsets, but that is a fairly complex and possibly brittle process that we will not consider here.

Using `mapAsync` is safe since it preserves the order of messages. That is in contrast to `mapAsyncUnordered` which would not be safe to use here. As indicated in the [Akka Streams documentation](https://doc.akka.io/libraries/akka-core/2.10/stream/stream-flows-and-basics.html#stream-ordering) almost all stages will preserve input ordering.

### Using groupBy

Using `groupBy` followed at some point by a `mergeSubstreams` can reorder messages, so in general it is not safe with respect to the at\-least\-once guarantee.

However it can only lead to reordering between messages sent to different substreams, so it is possible to use `groupBy` and preserve at\-least\-once semantics as long as all messages from the same partition are sent to the same substream.

If a particular substream expects to see all messages regarding some entity, it then requires that writers to the source topic become responsible for placing messages about various entities in the appropriate partitions. If your application already has a requirement to preserve the order of messages about a particular entity within a Kafka topic, you will already need to ensure those messages go to the same partition since Kafka only preserves order information within a partition.

Consider instead using `mapAsyncPartitioned` in place of a `groupBy` followed by `mergeSubstreams`. Both allow for demultiplexing an input stream, but `mapAsyncPartitioned` will not reorder output messages and also allows its partitions to be finer\-grained than a Kafka partition. Note that partitioning in `mapAsyncPartitioned` only happens within that stage: complex processing of a partition may require techniques outside of streams, such as using the ask pattern to an actor.

## Conditional Message Processing

Most flows will require some messages to be handled differently from others. Unfortunately this is difficult to do while preserving the at\-least\-once guarantee because the order of messages must be maintained.

We cannot safely send off the messages to be handled differently to a distinct flow: this other flow cannot commit on its own, and even if we merge it back, downstream, with the main flow, ordering will not be preserved. The reason this separate flow cannot commit on its own is that it will only be seeing a subset of the committable messages. If it commits an offset, it cannot know that all prior offsets have been processed in the main flow.

This is a significant challenge. Below we suggest a few strategies to deal with some special cases of this general problem.

### Publishing to Message\-Dependent Topics

Since [`ProducerRecord`](https://kafka.apache.org/41/javadoc/org/apache/kafka/clients/producer/ProducerRecord.html "org.apache.kafka.clients.producer.ProducerRecord") contains the destination topic, it is possible to use a single producer flow to write to any number of topics. This preserves the ordering of messages coming from the committable source. Since the destination topics likely admit different types of messages, it will be necessary to serialize the messages to the appropriate input type for the common producer flow, which could be a byte array or a string.

In case a committable message should lead to the production of multiple messages, the [`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage")[`ProducerMessage.MultiMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html "akka.kafka.ProducerMessage.MultiMessage") is available. If no messages should be produced, the [`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage")[`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage") can be used.

Scala

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/scala/docs/scaladsl/AtLeastOnce.scala#L81-L105 "Go to snippet source")Consumer
  .committableSource(consumerSettings, Subscriptions.topics(topic1))
  .map(msg => {
    val out: Envelope[String, String, CommittableOffset] =
      if (duplicate(msg.record.value))
        ProducerMessage.multi(
          immutable.Seq(
            new ProducerRecord(topic2, msg.record.key, msg.record.value),
            new ProducerRecord(topic3, msg.record.key, msg.record.value)
          ),
          msg.committableOffset
        )
      else if (ignore(msg.record.value))
        ProducerMessage.passThrough(msg.committableOffset)
      else
        ProducerMessage.single(
          new ProducerRecord(topic4, msg.record.key, msg.record.value),
          msg.committableOffset
        )
    out
  })
  .via(Producer.flexiFlow(producerSettings))
  .map(_.passThrough)
  .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
  .run()
```

Java

```
[source](https://github.com/akka/alpakka-kafka/tree/v8.0.1/tests/src/test/java/docs/javadsl/AtLeastOnceTest.java#L30-L183 "Go to snippet source")import akka.Done;
import akka.japi.Pair;
import akka.kafka.*;
import akka.kafka.ConsumerMessage.CommittableOffset;
import akka.kafka.ProducerMessage.Envelope;
import akka.kafka.javadsl.Committer;
import akka.kafka.javadsl.Consumer;
import akka.kafka.javadsl.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

Consumer.committableSource(consumerSettings, Subscriptions.topics(topic1))
    .map(
        msg -> {
          final Envelope<String, String, CommittableOffset> produce;
          if (duplicate(msg.record().value())) {
            produce =
                ProducerMessage.multi(
                    Arrays.asList(
                        new ProducerRecord<>(topic2, msg.record().value()),
                        new ProducerRecord<>(topic3, msg.record().value())),
                    msg.committableOffset());
          } else if (ignore(msg.record().value())) {
            produce = ProducerMessage.passThrough(msg.committableOffset());
          } else {
            produce =
                ProducerMessage.single(
                    new ProducerRecord<>(topic4, msg.record().value()),
                    msg.committableOffset());
          }
          return produce;
        })
    .via(Producer.flexiFlow(producerSettings))
    .map(m -> m.passThrough())
    .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
    .run(system);
```

### Excluding Messages

Failure to deserialize a message is a particular case of conditional message processing. It is also likely that we would have no message to produce to Kafka when we encounter messages that fail to deserialize. As described above, the producer flow will not let us pass through the corresponding committable offset without producing a message. 

Why can’t we commit the offsets of bad messages as soon as we encounter them, instead of passing them downstream? Because the previous offsets, for messages that have deserialized successfully, may not have been committed yet. That’s possible if the downstream flow includes a buffer, an asynchronous boundary or performs batching. It is then likely that some previous messages would concurrently be making their way downstream to a final committing stage.

Note that here we assume that we take the full control over the handling of messages that fail to deserialize. To do this, we should not ask for the deserialization to be performed by the committable source. We can instead create a [`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html "akka.kafka.ConsumerSettings")[`ConsumerSettings`](/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html "akka.kafka.ConsumerSettings") parametrized by byte arrays. A subsequent `map` can deserialize and use [`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage")[`ProducerMessage.PassThroughMessage`](/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html "akka.kafka.ProducerMessage.PassThroughMessage") to skip bad messages.

## Code Examples

### Example 1: Multiple Messages

```scala
import akka.{Done, NotUsed}
import akka.kafka.ConsumerMessage.{CommittableOffset, CommittableOffsetBatch}
import akka.kafka.ProducerMessage.Envelope
import akka.kafka.scaladsl.Consumer.DrainingControl
import akka.kafka.{ProducerMessage, Subscriptions}
import akka.kafka.scaladsl.{Committer, Consumer, Producer}
import akka.kafka.testkit.scaladsl.TestcontainersKafkaLike
import akka.stream.scaladsl.{Keep, Sink}
import akka.stream.testkit.scaladsl.StreamTestKit.assertAllStagesStopped
import org.apache.kafka.clients.producer.ProducerRecord

import scala.collection.immutable
import scala.concurrent.Await
import scala.concurrent.duration._

Consumer
  .committableSource(consumerSettings, Subscriptions.topics(topic1))
  .map(
    msg =>
      ProducerMessage.multi(
        immutable.Seq(
          new ProducerRecord(topic2, msg.record.key, msg.record.value),
          new ProducerRecord(topic3, msg.record.key, msg.record.value)
        ),
        msg.committableOffset
      )
  )
  .via(Producer.flexiFlow(producerSettings))
  .map(_.passThrough)
  .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
  .run()
```

### Example 2: Multiple Messages

```java
Consumer.committableSource(consumerSettings, Subscriptions.topics(topic1))
    .map(
        msg -> {
          Envelope<String, String, CommittableOffset> multiMsg =
              ProducerMessage.multi(
                  Arrays.asList(
                      new ProducerRecord<>(topic2, msg.record().value()),
                      new ProducerRecord<>(topic3, msg.record().value())),
                  msg.committableOffset());
          return multiMsg;
        })
    .via(Producer.flexiFlow(producerSettings))
    .map(m -> m.passThrough())
    .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
    .run(system);
```

### Example 3: Publishing to Message-Dependent Topics

```scala
Consumer
  .committableSource(consumerSettings, Subscriptions.topics(topic1))
  .map(msg => {
    val out: Envelope[String, String, CommittableOffset] =
      if (duplicate(msg.record.value))
        ProducerMessage.multi(
          immutable.Seq(
            new ProducerRecord(topic2, msg.record.key, msg.record.value),
            new ProducerRecord(topic3, msg.record.key, msg.record.value)
          ),
          msg.committableOffset
        )
      else if (ignore(msg.record.value))
        ProducerMessage.passThrough(msg.committableOffset)
      else
        ProducerMessage.single(
          new ProducerRecord(topic4, msg.record.key, msg.record.value),
          msg.committableOffset
        )
    out
  })
  .via(Producer.flexiFlow(producerSettings))
  .map(_.passThrough)
  .toMat(Committer.sink(committerSettings))(DrainingControl.apply)
  .run()
```

### Example 4: Publishing to Message-Dependent Topics

```java
import akka.Done;
import akka.japi.Pair;
import akka.kafka.*;
import akka.kafka.ConsumerMessage.CommittableOffset;
import akka.kafka.ProducerMessage.Envelope;
import akka.kafka.javadsl.Committer;
import akka.kafka.javadsl.Consumer;
import akka.kafka.javadsl.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

Consumer.committableSource(consumerSettings, Subscriptions.topics(topic1))
    .map(
        msg -> {
          final Envelope<String, String, CommittableOffset> produce;
          if (duplicate(msg.record().value())) {
            produce =
                ProducerMessage.multi(
                    Arrays.asList(
                        new ProducerRecord<>(topic2, msg.record().value()),
                        new ProducerRecord<>(topic3, msg.record().value())),
                    msg.committableOffset());
          } else if (ignore(msg.record().value())) {
            produce = ProducerMessage.passThrough(msg.committableOffset());
          } else {
            produce =
                ProducerMessage.single(
                    new ProducerRecord<>(topic4, msg.record().value()),
                    msg.committableOffset());
          }
          return produce;
        })
    .via(Producer.flexiFlow(producerSettings))
    .map(m -> m.passThrough())
    .toMat(Committer.sink(committerSettings), Consumer::createDrainingControl)
    .run(system);
```

## Related Pages (Internal Links)

- https://doc.akka.io/
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html
- https://doc.akka.io/libraries/akka-core/2.10/stream/stream-flows-and-basics.html
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html
- https://doc.akka.io/libraries/alpakka-kafka/current/errorhandling.html
- https://doc.akka.io/libraries/alpakka-kafka/current/transactions.html

---
*Source: [https://doc.akka.io/libraries/alpakka-kafka/current/atleastonce.html](https://doc.akka.io/libraries/alpakka-kafka/current/atleastonce.html)*