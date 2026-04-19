---
description: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:30Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ConsumerMessage$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage
---

# Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage

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
- ConsumerMessage
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
o[akka](../index.html).[kafka](index.html)

# ConsumerMessage[**](../../akka/kafka/ConsumerMessage$.html "Permalink")

### 

#### object ConsumerMessage

Classes that are used in both [javadsl.Consumer](javadsl/Consumer$.html) and
[scaladsl.Consumer](scaladsl/Consumer$.html).

Source[ConsumerMessage.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ConsumerMessage.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. ConsumerMessage
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/kafka/ConsumerMessage$$Committable.html "Permalink")  trait [Committable](ConsumerMessage$$Committable.html "Carries offsets from Kafka for aggregation and committing by the scaladsl.Committer or javadsl.Committer.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Carries offsets from Kafka for aggregation and committing by the [scaladsl.Committer](scaladsl/Committer$.html)
or [javadsl.Committer](javadsl/Committer$.html).

Carries offsets from Kafka for aggregation and committing by the [scaladsl.Committer](scaladsl/Committer$.html)
or [javadsl.Committer](javadsl/Committer$.html).

`Committable` may be a single offset in [CommittableOffset](ConsumerMessage$$CommittableOffset.html) or [CommittableOffsetMetadata](ConsumerMessage$$CommittableOffsetMetadata.html),
or a number of offsets aggregated as [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html).

Annotations@DoNotInherit()
2. [**](../../akka/kafka/ConsumerMessage$$CommittableMessage.html "Permalink") final  case class [CommittableMessage](ConsumerMessage$$CommittableMessage.html "Output element of committableSource.")\[K, V](record: [ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], committableOffset: [CommittableOffset](ConsumerMessage$$CommittableOffset.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableOutput element of `committableSource`.

Output element of `committableSource`.
The offset can be committed via the included [CommittableOffset](ConsumerMessage$$CommittableOffset.html).
3. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html "Permalink") sealed  trait [CommittableOffset](ConsumerMessage$$CommittableOffset.html "Included in CommittableMessage.") extends [Committable](ConsumerMessage$$Committable.html)Included in [CommittableMessage](ConsumerMessage$$CommittableMessage.html).

Included in [CommittableMessage](ConsumerMessage$$CommittableMessage.html). Makes it possible to
commit an offset with the [Committable\#commitScaladsl](ConsumerMessage$$Committable.html#commitScaladsl():scala.concurrent.Future[akka.Done]) / [Committable\#commitJavadsl](ConsumerMessage$$Committable.html#commitJavadsl():java.util.concurrent.CompletionStage[akka.Done]) method
or aggregate several offsets in a [batch](ConsumerMessage$$CommittableOffsetBatch.html)
before committing.

Note that the offset position that is committed to Kafka will automatically
be one more than the `offset` of the message, because the committed offset
should be the next message your application will consume,
i.e. lastProcessedMessageOffset \+ 1\.

Annotations@DoNotInherit()
4. [**](../../akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html "Permalink")  trait [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html "For improved efficiency it is good to aggregate several CommittableOffset, using this class, before committing them.") extends [Committable](ConsumerMessage$$Committable.html)For improved efficiency it is good to aggregate several [CommittableOffset](ConsumerMessage$$CommittableOffset.html),
using this class, before [committing](ConsumerMessage$$Committable.html#commitScaladsl():scala.concurrent.Future[akka.Done]) them.

For improved efficiency it is good to aggregate several [CommittableOffset](ConsumerMessage$$CommittableOffset.html),
using this class, before [committing](ConsumerMessage$$Committable.html#commitScaladsl():scala.concurrent.Future[akka.Done]) them. Start with
the [empty](ConsumerMessage$$CommittableOffsetBatch$.html#empty:akka.kafka.ConsumerMessage.CommittableOffsetBatch) batch.

Annotations@DoNotInherit()
5. [**](../../akka/kafka/ConsumerMessage$$CommittableOffsetMetadata.html "Permalink")  trait [CommittableOffsetMetadata](ConsumerMessage$$CommittableOffsetMetadata.html) extends [CommittableOffset](ConsumerMessage$$CommittableOffset.html)Annotations@DoNotInherit()
6. [**](../../akka/kafka/ConsumerMessage$$GroupTopicPartition.html "Permalink") final  case class [GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html "groupId, topic, partition key for an offset position.")(groupId: String, topic: String, partition: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializablegroupId, topic, partition key for an offset position.
7. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset.html "Permalink") sealed  class [PartitionOffset](ConsumerMessage$$PartitionOffset.html "Offset position for a groupId, topic, partition.") extends [Product2](https://www.scala-lang.org/api/2.13.17/scala/Product2.html#scala.Product2)\[[GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)] with SerializableOffset position for a groupId, topic, partition.
8. [**](../../akka/kafka/ConsumerMessage$$PartitionOffsetMetadata.html "Permalink") final  case class [PartitionOffsetMetadata](ConsumerMessage$$PartitionOffsetMetadata.html "Offset position and metadata for a groupId, topic, partition.")(key: [GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), offset: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), metadata: String) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableOffset position and metadata for a groupId, topic, partition.
9. [**](../../akka/kafka/ConsumerMessage$$TransactionalMessage.html "Permalink") final  case class [TransactionalMessage](ConsumerMessage$$TransactionalMessage.html "Output element of transactionalSource.")\[K, V](record: [ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], partitionOffset: [PartitionOffset](ConsumerMessage$$PartitionOffset.html)) extends [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableOutput element of `transactionalSource`.

Output element of `transactionalSource`.
The offset is automatically committed as by the Producer
### Value Members

1. [**](../../akka/kafka/ConsumerMessage$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ConsumerMessage$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ConsumerMessage$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ConsumerMessage$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/ConsumerMessage$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/ConsumerMessage$.html#createCommittableOffsetBatch[T<:akka.kafka.ConsumerMessage.Committable](offsets:java.util.List[T]):akka.kafka.ConsumerMessage.CommittableOffsetBatch "Permalink")  def createCommittableOffsetBatch\[T \<: [Committable](ConsumerMessage$$Committable.html)](offsets: [List](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/List.html#java.util.List)\[T]): [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)Java API:
Create an offset batch out of a list of offsets.
7. [**](../../akka/kafka/ConsumerMessage$.html#createCommittableOffsetBatch(first:akka.kafka.ConsumerMessage.CommittableOffset):akka.kafka.ConsumerMessage.CommittableOffsetBatch "Permalink")  def createCommittableOffsetBatch(first: [CommittableOffset](ConsumerMessage$$CommittableOffset.html)): [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)Java API:
Create an offset batch out of a first offsets.
8. [**](../../akka/kafka/ConsumerMessage$.html#emptyCommittableOffsetBatch:akka.kafka.ConsumerMessage.CommittableOffsetBatch "Permalink")  val emptyCommittableOffsetBatch: [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)
9. [**](../../akka/kafka/ConsumerMessage$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/kafka/ConsumerMessage$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
11. [**](../../akka/kafka/ConsumerMessage$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/kafka/ConsumerMessage$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../akka/kafka/ConsumerMessage$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../akka/kafka/ConsumerMessage$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../akka/kafka/ConsumerMessage$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../akka/kafka/ConsumerMessage$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../akka/kafka/ConsumerMessage$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
18. [**](../../akka/kafka/ConsumerMessage$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
19. [**](../../akka/kafka/ConsumerMessage$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
20. [**](../../akka/kafka/ConsumerMessage$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/kafka/ConsumerMessage$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
22. [**](../../akka/kafka/ConsumerMessage$$CommittableOffsetBatch$.html "Permalink")  object [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch$.html)
23. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html "Permalink")  object [PartitionOffset](ConsumerMessage$$PartitionOffset$.html) extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [PartitionOffset](ConsumerMessage$$PartitionOffset.html)] with [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)
### Deprecated Value Members

1. [**](../../akka/kafka/ConsumerMessage$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

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
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetMetadata.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$GroupTopicPartition.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$PartitionOffset$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$PartitionOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$PartitionOffsetMetadata.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$TransactionalMessage.html
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
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$.html)*