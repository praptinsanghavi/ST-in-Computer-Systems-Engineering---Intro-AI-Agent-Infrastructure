---
description: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:34Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/scaladsl/Consumer$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer
---

# Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.Consumer

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[kafka](../index.html)
- [Committer](Committer$.html)
- Consumer
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- [MetadataClient](MetadataClient.html)
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
o[akka](../../index.html).[kafka](../index.html).[scaladsl](index.html)

# Consumer[**](../../../akka/kafka/scaladsl/Consumer$.html "Permalink")

### 

#### object Consumer

Akka Stream connector for subscribing to Kafka topics.

Source[Consumer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/scaladsl/Consumer.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Consumer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../../akka/kafka/scaladsl/Consumer$$Control.html "Permalink")  trait [Control](Consumer$$Control.html "Materialized value of the consumer Source.") extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Materialized value of the consumer `Source`.

Materialized value of the consumer `Source`.

See [Controlled shutdown](https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html#controlled-shutdown)
2. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl.html "Permalink") final  class [DrainingControl](Consumer$$DrainingControl.html "Combine control and a stream completion signal materialized values into one, so that the stream can be stopped in a controlled way without losing commits.")\[T] extends [Control](Consumer$$Control.html)Combine control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

Combine control and a stream completion signal materialized values into
one, so that the stream can be stopped in a controlled way without losing
commits.

See [Controlled shutdown](https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html#controlled-shutdown)
### Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/scaladsl/Consumer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/scaladsl/Consumer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/scaladsl/Consumer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/scaladsl/Consumer$.html#atMostOnceSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control] "Permalink")  def atMostOnceSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [Control](Consumer$$Control.html)]Convenience for "at\-most once delivery" semantics.

Convenience for "at\-most once delivery" semantics. The offset of each message is committed to Kafka
before being emitted downstream.
6. [**](../../../akka/kafka/scaladsl/Consumer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/kafka/scaladsl/Consumer$.html#commitWithMetadataPartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription,metadataFromRecord:org.apache.kafka.clients.consumer.ConsumerRecord[K,V]=>String):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control] "Permalink")  def commitWithMetadataPartitionedSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [AutoSubscription](../AutoSubscription.html), metadataFromRecord: ([ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V]) \=\> String): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[CommittableMessage](../ConsumerMessage$$CommittableMessage.html)\[K, V], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]), [Control](Consumer$$Control.html)]The same as [\#plainPartitionedSource](#plainPartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control]) but with offset commit with metadata support.
8. [**](../../../akka/kafka/scaladsl/Consumer$.html#commitWithMetadataSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription,metadataFromRecord:org.apache.kafka.clients.consumer.ConsumerRecord[K,V]=>String):akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.scaladsl.Consumer.Control] "Permalink")  def commitWithMetadataSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html), metadataFromRecord: ([ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V]) \=\> String): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[CommittableMessage](../ConsumerMessage$$CommittableMessage.html)\[K, V], [Control](Consumer$$Control.html)]The `commitWithMetadataSource` makes it possible to add additional metadata (in the form of a string)
when an offset is committed based on the record.

The `commitWithMetadataSource` makes it possible to add additional metadata (in the form of a string)
when an offset is committed based on the record. This can be useful (for example) to store information about which
node made the commit, what time the commit was made, the timestamp of the record etc.
9. [**](../../../akka/kafka/scaladsl/Consumer$.html#committableExternalSource[K,V](consumer:akka.actor.ActorRef,subscription:akka.kafka.ManualSubscription,groupId:String,commitTimeout:scala.concurrent.duration.FiniteDuration):akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.scaladsl.Consumer.Control] "Permalink")  def committableExternalSource\[K, V](consumer: [ActorRef](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html#akka.actor.ActorRef), subscription: [ManualSubscription](../ManualSubscription.html), groupId: String, commitTimeout: [FiniteDuration](https://www.scala-lang.org/api/2.13.17/scala/concurrent/duration/FiniteDuration.html#scala.concurrent.duration.FiniteDuration)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[CommittableMessage](../ConsumerMessage$$CommittableMessage.html)\[K, V], [Control](Consumer$$Control.html)]The same as [\#plainExternalSource](#plainExternalSource[K,V](consumer:akka.actor.ActorRef,subscription:akka.kafka.ManualSubscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control]) but with offset commit support.
10. [**](../../../akka/kafka/scaladsl/Consumer$.html#committablePartitionedManualOffsetSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription,getOffsetsOnAssign:Set[org.apache.kafka.common.TopicPartition]=>scala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,Long]],onRevoke:Set[org.apache.kafka.common.TopicPartition]=>Unit):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control] "Permalink")  def committablePartitionedManualOffsetSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [AutoSubscription](../AutoSubscription.html), getOffsetsOnAssign: (Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]], onRevoke: (Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) \= \_ \=\> ()): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[CommittableMessage](../ConsumerMessage$$CommittableMessage.html)\[K, V], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]), [Control](Consumer$$Control.html)]The same as [\#plainPartitionedManualOffsetSource](#plainPartitionedManualOffsetSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription,getOffsetsOnAssign:Set[org.apache.kafka.common.TopicPartition]=>scala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,Long]],onRevoke:Set[org.apache.kafka.common.TopicPartition]=>Unit):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control]) but with offset commit support.
11. [**](../../../akka/kafka/scaladsl/Consumer$.html#committablePartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control] "Permalink")  def committablePartitionedSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [AutoSubscription](../AutoSubscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[CommittableMessage](../ConsumerMessage$$CommittableMessage.html)\[K, V], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]), [Control](Consumer$$Control.html)]The same as [\#plainPartitionedSource](#plainPartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control]) but with offset commit support.
12. [**](../../../akka/kafka/scaladsl/Consumer$.html#committableSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[akka.kafka.ConsumerMessage.CommittableMessage[K,V],akka.kafka.scaladsl.Consumer.Control] "Permalink")  def committableSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[CommittableMessage](../ConsumerMessage$$CommittableMessage.html)\[K, V], [Control](Consumer$$Control.html)]The `committableSource` makes it possible to commit offset positions to Kafka.

The `committableSource` makes it possible to commit offset positions to Kafka.
This is useful when "at\-least once delivery" is desired, as each message will likely be
delivered one time but in failure cases could be duplicated.

If you commit the offset before processing the message you get "at\-most once delivery" semantics,
and for that there is a [\#atMostOnceSource](#atMostOnceSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control]).

Compared to auto\-commit, this gives exact control over when a message is considered consumed.

If you need to store offsets in anything other than Kafka, [\#plainSource](#plainSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control]) should be used
instead of this API.
13. [**](../../../akka/kafka/scaladsl/Consumer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../../akka/kafka/scaladsl/Consumer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
15. [**](../../../akka/kafka/scaladsl/Consumer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
16. [**](../../../akka/kafka/scaladsl/Consumer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../../akka/kafka/scaladsl/Consumer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/kafka/scaladsl/Consumer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
19. [**](../../../akka/kafka/scaladsl/Consumer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../../akka/kafka/scaladsl/Consumer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../../akka/kafka/scaladsl/Consumer$.html#plainExternalSource[K,V](consumer:akka.actor.ActorRef,subscription:akka.kafka.ManualSubscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control] "Permalink")  def plainExternalSource\[K, V](consumer: [ActorRef](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html#akka.actor.ActorRef), subscription: [ManualSubscription](../ManualSubscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [Control](Consumer$$Control.html)]Special source that can use an external `KafkaAsyncConsumer`.

Special source that can use an external `KafkaAsyncConsumer`. This is useful when you have
a lot of manually assigned topic\-partitions and want to keep only one kafka consumer.
22. [**](../../../akka/kafka/scaladsl/Consumer$.html#plainPartitionedManualOffsetSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription,getOffsetsOnAssign:Set[org.apache.kafka.common.TopicPartition]=>scala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,Long]],onRevoke:Set[org.apache.kafka.common.TopicPartition]=>Unit):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control] "Permalink")  def plainPartitionedManualOffsetSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [AutoSubscription](../AutoSubscription.html), getOffsetsOnAssign: (Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) \=\> [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]], onRevoke: (Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) \=\> [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit) \= \_ \=\> ()): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]), [Control](Consumer$$Control.html)]The `plainPartitionedManualOffsetSource` is similar to [\#plainPartitionedSource](#plainPartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control]) but allows the use of an offset store outside
of Kafka, while retaining the automatic partition assignment.

The `plainPartitionedManualOffsetSource` is similar to [\#plainPartitionedSource](#plainPartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control]) but allows the use of an offset store outside
of Kafka, while retaining the automatic partition assignment. When a topic\-partition is assigned to a consumer, the `getOffsetsOnAssign`
function will be called to retrieve the offset, followed by a seek to the correct spot in the partition.

The `onRevoke` function gives the consumer a chance to store any uncommitted offsets, and do any other cleanup
that is required. Also allows the user access to the `onPartitionsRevoked` hook, useful for cleaning up any
partition\-specific resources being used by the consumer.
23. [**](../../../akka/kafka/scaladsl/Consumer$.html#plainPartitionedSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.AutoSubscription):akka.stream.scaladsl.Source[(org.apache.kafka.common.TopicPartition,akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.NotUsed]),akka.kafka.scaladsl.Consumer.Control] "Permalink")  def plainPartitionedSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [AutoSubscription](../AutoSubscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]), [Control](Consumer$$Control.html)]The `plainPartitionedSource` is a way to track automatic partition assignment from kafka.

The `plainPartitionedSource` is a way to track automatic partition assignment from kafka.
When a topic\-partition is assigned to a consumer, this source will emit tuples with the assigned topic\-partition and a corresponding
source of `ConsumerRecord`s.
When a topic\-partition is revoked, the corresponding source completes.
24. [**](../../../akka/kafka/scaladsl/Consumer$.html#plainSource[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.Source[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.scaladsl.Consumer.Control] "Permalink")  def plainSource\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html)): [Source](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html#akka.stream.scaladsl.Source)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [Control](Consumer$$Control.html)]The `plainSource` emits `ConsumerRecord` elements (as received from the underlying `KafkaConsumer`).

The `plainSource` emits `ConsumerRecord` elements (as received from the underlying `KafkaConsumer`).
It has no support for committing offsets to Kafka. It can be used when the offset is stored externally
or with auto\-commit (note that auto\-commit is by default disabled).

The consumer application doesn't need to use Kafka's built\-in offset storage and can store offsets in a store of its own
choosing. The primary use case for this is allowing the application to store both the offset and the results of the
consumption in the same system in a way that both the results and offsets are stored atomically. This is not always
possible, but when it is, it will make the consumption fully atomic and give "exactly once" semantics that are
stronger than the "at\-least once" semantics you get with Kafka's offset commit functionality.
25. [**](../../../akka/kafka/scaladsl/Consumer$.html#sourceWithOffsetContext[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription,metadataFromRecord:org.apache.kafka.clients.consumer.ConsumerRecord[K,V]=>String):akka.stream.scaladsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.CommittableOffset,akka.kafka.scaladsl.Consumer.Control] "Permalink")  def sourceWithOffsetContext\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html), metadataFromRecord: ([ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V]) \=\> String): [SourceWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/SourceWithContext.html#akka.stream.scaladsl.SourceWithContext)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [CommittableOffset](../ConsumerMessage$$CommittableOffset.html), [Control](Consumer$$Control.html)]API MAY CHANGE

API MAY CHANGE

This source emits `ConsumerRecord` together with the offset position as flow context, thus makes it possible
to commit offset positions to Kafka.
This is useful when "at\-least once delivery" is desired, as each message will likely be
delivered one time but in failure cases could be duplicated.

It is intended to be used with Akka's \[flow with context](https://doc.akka.io/libraries/akka\-core/current/stream/operators/Flow/asFlowWithContext.html),
[Producer.flowWithContext](Producer$.html#flowWithContext[K,V,C](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.scaladsl.FlowWithContext[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],C,akka.kafka.ProducerMessage.Results[K,V,C],C,akka.NotUsed]) and/or [Committer.sinkWithOffsetContext](Committer$.html#sinkWithOffsetContext[E](settings:akka.kafka.CommitterSettings):akka.stream.scaladsl.Sink[(E,akka.kafka.ConsumerMessage.Committable),scala.concurrent.Future[akka.Done]]).

This variant makes it possible to add additional metadata (in the form of a string)
when an offset is committed based on the record. This can be useful (for example) to store information about which
node made the commit, what time the commit was made, the timestamp of the record etc.

Annotations@ApiMayChange()
26. [**](../../../akka/kafka/scaladsl/Consumer$.html#sourceWithOffsetContext[K,V](settings:akka.kafka.ConsumerSettings[K,V],subscription:akka.kafka.Subscription):akka.stream.scaladsl.SourceWithContext[org.apache.kafka.clients.consumer.ConsumerRecord[K,V],akka.kafka.ConsumerMessage.CommittableOffset,akka.kafka.scaladsl.Consumer.Control] "Permalink")  def sourceWithOffsetContext\[K, V](settings: [ConsumerSettings](../ConsumerSettings.html)\[K, V], subscription: [Subscription](../Subscription.html)): [SourceWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/SourceWithContext.html#akka.stream.scaladsl.SourceWithContext)\[[ConsumerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRecord.html#org.apache.kafka.clients.consumer.ConsumerRecord)\[K, V], [CommittableOffset](../ConsumerMessage$$CommittableOffset.html), [Control](Consumer$$Control.html)]API MAY CHANGE

API MAY CHANGE

This source emits `ConsumerRecord` together with the offset position as flow context, thus makes it possible
to commit offset positions to Kafka.
This is useful when "at\-least once delivery" is desired, as each message will likely be
delivered one time but in failure cases could be duplicated.

It is intended to be used with Akka's \[flow with context](https://doc.akka.io/libraries/akka\-core/current/stream/operators/Flow/asFlowWithContext.html),
[Producer.flowWithContext](Producer$.html#flowWithContext[K,V,C](settings:akka.kafka.ProducerSettings[K,V]):akka.stream.scaladsl.FlowWithContext[akka.kafka.ProducerMessage.Envelope[K,V,akka.NotUsed],C,akka.kafka.ProducerMessage.Results[K,V,C],C,akka.NotUsed]) and/or [Committer.sinkWithOffsetContext](Committer$.html#sinkWithOffsetContext[E](settings:akka.kafka.CommitterSettings):akka.stream.scaladsl.Sink[(E,akka.kafka.ConsumerMessage.Committable),scala.concurrent.Future[akka.Done]]).

Annotations@ApiMayChange()
27. [**](../../../akka/kafka/scaladsl/Consumer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
28. [**](../../../akka/kafka/scaladsl/Consumer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
29. [**](../../../akka/kafka/scaladsl/Consumer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
30. [**](../../../akka/kafka/scaladsl/Consumer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
31. [**](../../../akka/kafka/scaladsl/Consumer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
32. [**](../../../akka/kafka/scaladsl/Consumer$$DrainingControl$.html "Permalink")  object [DrainingControl](Consumer$$DrainingControl$.html)
33. [**](../../../akka/kafka/scaladsl/Consumer$$NoopControl$.html "Permalink")  object [NoopControl](Consumer$$NoopControl$.html "An implementation of Control to be used as an empty value, all methods return a failed future.") extends [Control](Consumer$$Control.html)An implementation of Control to be used as an empty value, all methods return
a failed future.
### Deprecated Value Members

1. [**](../../../akka/kafka/scaladsl/Consumer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/ActorRef.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/Source.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/scaladsl/SourceWithContext.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/AutoSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ManualSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$Control.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$DrainingControl.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$$NoopControl$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/DiscoverySupport$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/MetadataClient$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/MetadataClient.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/SendProducer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html
- https://doc.akka.io/libraries/alpakka-kafka/current/consumer.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html)*