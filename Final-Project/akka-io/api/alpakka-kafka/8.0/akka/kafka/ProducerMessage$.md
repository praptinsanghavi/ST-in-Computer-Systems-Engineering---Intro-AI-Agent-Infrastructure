---
description: Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:39:02Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ProducerMessage$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage
---

# Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/kafka/index.html "Permalink")  package [kafka](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/kafka/cluster/index.html "Permalink")  package [cluster](cluster/index.html)Definition Classes[kafka](index.html)
- [**](../../akka/kafka/internal/index.html "Permalink")  package [internal](internal/index.html)Definition Classes[kafka](index.html)
- [**](../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](javadsl/index.html)Definition Classes[kafka](index.html)
- [**](../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](scaladsl/index.html)Definition Classes[kafka](index.html)
- [**](../../akka/kafka/testkit/index.html "Permalink")  package [testkit](testkit/index.html)Definition Classes[kafka](index.html)
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
- ProducerMessage
- [ProducerSettings](ProducerSettings.html "Settings for producers.")
- [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.")
- [Subscription](Subscription.html)
- [Subscriptions](Subscriptions$.html)
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
o[akka](../index.html).[kafka](index.html)

# ProducerMessage[**](../../akka/kafka/ProducerMessage$.html "Permalink")

### 

#### object ProducerMessage

Classes that are used in both [javadsl.Producer](javadsl/Producer$.html) and
[scaladsl.Producer](scaladsl/Producer$.html).

Source[ProducerMessage.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ProducerMessage.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ProducerMessage
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/kafka/ProducerMessage$$Envelope.html "Permalink") sealed  trait [Envelope](ProducerMessage$$Envelope.html "Type accepted by Producer.committableSink and Producer.flexiFlow with implementations")\[K, V, \+PassThrough] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Type accepted by `Producer.committableSink` and `Producer.flexiFlow` with implementations

Type accepted by `Producer.committableSink` and `Producer.flexiFlow` with implementations

\- [Message](ProducerMessage$$Message.html) publishes a single message to its topic, and continues in the stream as [Result](ProducerMessage$$Result.html)

\- [MultiMessage](ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and continues in the stream as [MultiResult](ProducerMessage$$MultiResult.html)

\- [PassThroughMessage](ProducerMessage$$PassThroughMessage.html) does not publish anything, and continues in the stream as [PassThroughResult](ProducerMessage$$PassThroughResult.html)

The `passThrough` field may hold any element that is passed through the `Producer.flexiFlow`
and included in the [Results](ProducerMessage$$Results.html). That is useful when some context is needed to be passed
on downstream operations. That could be done with unzip/zip, but this is more convenient.
It can for example be a [ConsumerMessage.CommittableOffset](ConsumerMessage$$CommittableOffset.html) or [ConsumerMessage.CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)
that can be committed later in the flow.
2. [**](../../akka/kafka/ProducerMessage$$Message.html "Permalink") final  case class [Message](ProducerMessage$$Message.html "Envelope implementation that produces a single message to a Kafka topic, flows emit a Result for every element processed.")\[K, V, \+PassThrough](record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V], passThrough: PassThrough) extends [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Envelope](ProducerMessage$$Envelope.html) implementation that produces a single message to a Kafka topic, flows emit
a [Result](ProducerMessage$$Result.html) for every element processed.

[Envelope](ProducerMessage$$Envelope.html) implementation that produces a single message to a Kafka topic, flows emit
a [Result](ProducerMessage$$Result.html) for every element processed.

The `record` contains a topic name to which the record is being sent, an optional
partition number, and an optional key and value.

The `passThrough` field may hold any element that is passed through the `Producer.flow`
and included in the [Result](ProducerMessage$$Result.html). That is useful when some context is needed to be passed
on downstream operations. That could be done with unzip/zip, but this is more convenient.
It can for example be a [ConsumerMessage.CommittableOffset](ConsumerMessage$$CommittableOffset.html) or [ConsumerMessage.CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)
that can be committed later in the flow.
3. [**](../../akka/kafka/ProducerMessage$$MultiMessage.html "Permalink") final  case class [MultiMessage](ProducerMessage$$MultiMessage.html "Envelope implementation that produces multiple message to a Kafka topics, flows emit a MultiResult for every element processed.")\[K, V, \+PassThrough](records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]], passThrough: PassThrough) extends [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Envelope](ProducerMessage$$Envelope.html) implementation that produces multiple message to a Kafka topics, flows emit
 a [MultiResult](ProducerMessage$$MultiResult.html) for every element processed.

[Envelope](ProducerMessage$$Envelope.html) implementation that produces multiple message to a Kafka topics, flows emit
 a [MultiResult](ProducerMessage$$MultiResult.html) for every element processed.

Every element in `records` contains a topic name to which the record is being sent, an optional
partition number, and an optional key and value.

The `passThrough` field may hold any element that is passed through the `Producer.flow`
and included in the [MultiResult](ProducerMessage$$MultiResult.html). That is useful when some context is needed to be passed
on downstream operations. That could be done with unzip/zip, but this is more convenient.
It can for example be a [ConsumerMessage.CommittableOffset](ConsumerMessage$$CommittableOffset.html) or [ConsumerMessage.CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)
that can be committed later in the flow.
4. [**](../../akka/kafka/ProducerMessage$$MultiResult.html "Permalink") final  case class [MultiResult](ProducerMessage$$MultiResult.html "Results implementation emitted when all messages in a MultiMessage have been successfully published.")\[K, V, PassThrough] extends [Results](ProducerMessage$$Results.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Results](ProducerMessage$$Results.html) implementation emitted when all messages in a [MultiMessage](ProducerMessage$$MultiMessage.html) have been
successfully published.
5. [**](../../akka/kafka/ProducerMessage$$MultiResultPart.html "Permalink") final  case class [MultiResultPart](ProducerMessage$$MultiResultPart.html)\[K, V] extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
6. [**](../../akka/kafka/ProducerMessage$$PassThroughMessage.html "Permalink") final  case class [PassThroughMessage](ProducerMessage$$PassThroughMessage.html "Envelope implementation that does not produce anything to Kafka, flows emit a PassThroughResult for every element processed.")\[K, V, \+PassThrough](passThrough: PassThrough) extends [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Envelope](ProducerMessage$$Envelope.html) implementation that does not produce anything to Kafka, flows emit
a [PassThroughResult](ProducerMessage$$PassThroughResult.html) for every element processed.

[Envelope](ProducerMessage$$Envelope.html) implementation that does not produce anything to Kafka, flows emit
a [PassThroughResult](ProducerMessage$$PassThroughResult.html) for every element processed.

The `passThrough` field may hold any element that is passed through the `Producer.flow`
and included in the [Results](ProducerMessage$$Results.html). That is useful when some context is needed to be passed
on downstream operations. That could be done with unzip/zip, but this is more convenient.
It can for example be a [ConsumerMessage.CommittableOffset](ConsumerMessage$$CommittableOffset.html) or [ConsumerMessage.CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)
that can be committed later in the flow.
7. [**](../../akka/kafka/ProducerMessage$$PassThroughResult.html "Permalink") final  case class [PassThroughResult](ProducerMessage$$PassThroughResult.html "Results implementation emitted when a PassThroughMessage has passed through the flow.")\[K, V, PassThrough] extends [Results](ProducerMessage$$Results.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Results](ProducerMessage$$Results.html) implementation emitted when a [PassThroughMessage](ProducerMessage$$PassThroughMessage.html) has passed
through the flow.
8. [**](../../akka/kafka/ProducerMessage$$Result.html "Permalink") final  case class [Result](ProducerMessage$$Result.html "Results implementation emitted when a Message has been successfully published.")\[K, V, PassThrough] extends [Results](ProducerMessage$$Results.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable[Results](ProducerMessage$$Results.html) implementation emitted when a [Message](ProducerMessage$$Message.html) has been successfully published.

[Results](ProducerMessage$$Results.html) implementation emitted when a [Message](ProducerMessage$$Message.html) has been successfully published.

Includes the original message, metadata returned from `KafkaProducer` and the
`offset` of the produced message.
9. [**](../../akka/kafka/ProducerMessage$$Results.html "Permalink") sealed  trait [Results](ProducerMessage$$Results.html "Output type produced by Producer.flexiFlow and Transactional.flow.")\[K, V, PassThrough] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Output type produced by `Producer.flexiFlow` and `Transactional.flow`.
### Value Members

1. [**](../../akka/kafka/ProducerMessage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ProducerMessage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ProducerMessage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ProducerMessage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/ProducerMessage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/ProducerMessage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/kafka/ProducerMessage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/kafka/ProducerMessage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/kafka/ProducerMessage$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../akka/kafka/ProducerMessage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/kafka/ProducerMessage$.html#multi[K,V](records:java.util.Collection[org.apache.kafka.clients.producer.ProducerRecord[K,V]]):akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed] "Permalink")  def multi\[K, V](records: [Collection](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]]): [Envelope](ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Java API:
Create a multi\-message containing several `records`.

Java API:
Create a multi\-message containing several `records`.

Kthe type of keys

Vthe type of values
12. [**](../../akka/kafka/ProducerMessage$.html#multi[K,V,PassThrough](records:java.util.Collection[org.apache.kafka.clients.producer.ProducerRecord[K,V]],passThrough:PassThrough):akka.kafka.ProducerMessage.Envelope[K,V,PassThrough] "Permalink")  def multi\[K, V, PassThrough](records: [Collection](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]], passThrough: PassThrough): [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough]Java API:
Create a multi\-message containing several `records` and one `passThrough`.

Java API:
Create a multi\-message containing several `records` and one `passThrough`.

Kthe type of keys

Vthe type of values

PassThroughthe type of data passed through
13. [**](../../akka/kafka/ProducerMessage$.html#multi[K,V](records:Seq[org.apache.kafka.clients.producer.ProducerRecord[K,V]]):akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed] "Permalink")  def multi\[K, V](records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]]): [Envelope](ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a multi\-message containing several `records`.

Create a multi\-message containing several `records`.

Kthe type of keys

Vthe type of values
14. [**](../../akka/kafka/ProducerMessage$.html#multi[K,V,PassThrough](records:Seq[org.apache.kafka.clients.producer.ProducerRecord[K,V]],passThrough:PassThrough):akka.kafka.ProducerMessage.Envelope[K,V,PassThrough] "Permalink")  def multi\[K, V, PassThrough](records: [Seq](https://www.scala-lang.org/api/2.13.17/scala/collection/immutable/Seq.html#scala.collection.immutable.Seq)\[[ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]], passThrough: PassThrough): [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough]Create a multi\-message containing several `records` and one `passThrough`.

Create a multi\-message containing several `records` and one `passThrough`.

Kthe type of keys

Vthe type of values

PassThroughthe type of data passed through
15. [**](../../akka/kafka/ProducerMessage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
16. [**](../../akka/kafka/ProducerMessage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../akka/kafka/ProducerMessage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../akka/kafka/ProducerMessage$.html#passThrough[K,V]():akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed] "Permalink")  def passThrough\[K, V](): [Envelope](ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a pass\-through message not containing any records for use with `withContext` flows and sinks.

Create a pass\-through message not containing any records for use with `withContext` flows and sinks.
In some cases the type parameters need to be specified explicitly.

Kthe type of keys

Vthe type of values
19. [**](../../akka/kafka/ProducerMessage$.html#passThrough[K,V,PassThrough](passThrough:PassThrough):akka.kafka.ProducerMessage.Envelope[K,V,PassThrough] "Permalink")  def passThrough\[K, V, PassThrough](passThrough: PassThrough): [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough]Create a pass\-through message not containing any records.

Create a pass\-through message not containing any records.
In some cases the type parameters need to be specified explicitly.

Kthe type of keys

Vthe type of values

PassThroughthe type of data passed through
20. [**](../../akka/kafka/ProducerMessage$.html#single[K,V](record:org.apache.kafka.clients.producer.ProducerRecord[K,V]):akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed] "Permalink")  def single\[K, V](record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]): [Envelope](ProducerMessage$$Envelope.html)\[K, V, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Create a message containing the `record`.

Create a message containing the `record`.

Kthe type of keys

Vthe type of values
21. [**](../../akka/kafka/ProducerMessage$.html#single[K,V,PassThrough](record:org.apache.kafka.clients.producer.ProducerRecord[K,V],passThrough:PassThrough):akka.kafka.ProducerMessage.Envelope[K,V,PassThrough] "Permalink")  def single\[K, V, PassThrough](record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V], passThrough: PassThrough): [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough]Create a message containing the `record` and a `passThrough`.

Create a message containing the `record` and a `passThrough`.

Kthe type of keys

Vthe type of values

PassThroughthe type of data passed through
22. [**](../../akka/kafka/ProducerMessage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../akka/kafka/ProducerMessage$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../akka/kafka/ProducerMessage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../akka/kafka/ProducerMessage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../akka/kafka/ProducerMessage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
27. [**](../../akka/kafka/ProducerMessage$$MultiResult$.html "Permalink")  object [MultiResult](ProducerMessage$$MultiResult$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
28. [**](../../akka/kafka/ProducerMessage$$MultiResultPart$.html "Permalink")  object [MultiResultPart](ProducerMessage$$MultiResultPart$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
29. [**](../../akka/kafka/ProducerMessage$$PassThroughResult$.html "Permalink")  object [PassThroughResult](ProducerMessage$$PassThroughResult$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
30. [**](../../akka/kafka/ProducerMessage$$Result$.html "Permalink")  object [Result](ProducerMessage$$Result$.html) extends [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../akka/kafka/ProducerMessage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/AutoSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitDelivery$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitDelivery.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitTimeoutException.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitWhen$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitWhen.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitterSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/CommitterSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConnectionCheckerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConnectionCheckerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerMessage$$CommittableOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerRebalanceEvent.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/InitialPollFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/KafkaConnectionFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/KafkaConsumerActor$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ManualSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/Metadata$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/OffsetResetProtectionSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/OffsetResetProtectionSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Message.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiResult$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiResultPart$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiResultPart.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$PassThroughMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$PassThroughResult$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$PassThroughResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Result$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Result.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Results.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/RestrictedConsumer.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/Subscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/Subscriptions$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/TopicPartitionsAssigned.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/TopicPartitionsRevoked.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/Version$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/WakeupsExceeded.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/cluster/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$.html)*