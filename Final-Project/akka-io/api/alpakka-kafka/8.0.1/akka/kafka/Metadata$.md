---
description: Alpakka Kafka 8.0.1 - akka.kafka.Metadata
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:37Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/Metadata$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.Metadata
---

# Alpakka Kafka 8.0.1 - akka.kafka.Metadata

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.Metadata

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
- Metadata
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

# Metadata[**](../../akka/kafka/Metadata$.html "Permalink")

### 

#### object Metadata

Messages for Kafka metadata fetching via [KafkaConsumerActor](KafkaConsumerActor$.html).

NOTE: Processing of these requests blocks the actor loop. The KafkaConsumerActor is configured to run on its
own dispatcher, so just as the other remote calls to Kafka, the blocking happens within a designated thread pool.
However, calling these during consuming might affect performance and even cause timeouts in extreme cases.

Source[Metadata.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/Metadata.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Metadata
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Type Members

1. [**](../../akka/kafka/Metadata$$BeginningOffsets.html "Permalink") final  case class [BeginningOffsets](Metadata$$BeginningOffsets.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]]) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
2. [**](../../akka/kafka/Metadata$$CommittedOffsets.html "Permalink") final  case class [CommittedOffsets](Metadata$$CommittedOffsets.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [OffsetAndMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndMetadata.html#org.apache.kafka.clients.consumer.OffsetAndMetadata)]]) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
3. [**](../../akka/kafka/Metadata$$EndOffsets.html "Permalink") final  case class [EndOffsets](Metadata$$EndOffsets.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]]) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
4. [**](../../akka/kafka/Metadata$$GetBeginningOffsets.html "Permalink") final  case class [GetBeginningOffsets](Metadata$$GetBeginningOffsets.html "org.apache.kafka.clients.consumer.KafkaConsumer#beginningOffsets()")(partitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#beginningOffsets()

org.apache.kafka.clients.consumer.KafkaConsumer\#beginningOffsets()

Warning: KafkaConsumer documentation states that this method may block indefinitely if the partition does not exist.
5. [**](../../akka/kafka/Metadata$$GetCommittedOffsets.html "Permalink") final  case class [GetCommittedOffsets](Metadata$$GetCommittedOffsets.html "org.apache.kafka.clients.consumer.KafkaConsumer#committed()")(partitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#committed()
6. [**](../../akka/kafka/Metadata$$GetEndOffsets.html "Permalink") final  case class [GetEndOffsets](Metadata$$GetEndOffsets.html "org.apache.kafka.clients.consumer.KafkaConsumer#endOffsets()")(partitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]) extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#endOffsets()

org.apache.kafka.clients.consumer.KafkaConsumer\#endOffsets()

Warning: KafkaConsumer documentation states that this method may block indefinitely if the partition does not exist.
7. [**](../../akka/kafka/Metadata$$GetOffsetsForTimes.html "Permalink") final  case class [GetOffsetsForTimes](Metadata$$GetOffsetsForTimes.html "org.apache.kafka.clients.consumer.KafkaConsumer#offsetsForTimes()")(timestampsToSearch: Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]) extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#offsetsForTimes()

org.apache.kafka.clients.consumer.KafkaConsumer\#offsetsForTimes()

Warning: KafkaConsumer documentation states that this method may block indefinitely if the partition does not exist.
8. [**](../../akka/kafka/Metadata$$GetPartitionsFor.html "Permalink") final  case class [GetPartitionsFor](Metadata$$GetPartitionsFor.html "org.apache.kafka.clients.consumer.KafkaConsumer#partitionsFor()")(topic: String) extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#partitionsFor()
9. [**](../../akka/kafka/Metadata$$OffsetsForTimes.html "Permalink") final  case class [OffsetsForTimes](Metadata$$OffsetsForTimes.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [OffsetAndTimestamp](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndTimestamp.html#org.apache.kafka.clients.consumer.OffsetAndTimestamp)]]) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
10. [**](../../akka/kafka/Metadata$$PartitionsFor.html "Permalink") final  case class [PartitionsFor](Metadata$$PartitionsFor.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[List\[[PartitionInfo](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/PartitionInfo.html#org.apache.kafka.common.PartitionInfo)]]) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
11. [**](../../akka/kafka/Metadata$$Request.html "Permalink") sealed  trait [Request](Metadata$$Request.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
12. [**](../../akka/kafka/Metadata$$Response.html "Permalink") sealed  trait [Response](Metadata$$Response.html) extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)
13. [**](../../akka/kafka/Metadata$$Topics.html "Permalink") final  case class [Topics](Metadata$$Topics.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[Map\[String, List\[[PartitionInfo](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/PartitionInfo.html#org.apache.kafka.common.PartitionInfo)]]]) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable
### Deprecated Type Members

1. [**](../../akka/kafka/Metadata$$CommittedOffset.html "Permalink") final  case class [CommittedOffset](Metadata$$CommittedOffset.html)(response: [Try](https://www.scala-lang.org/api/2.13.17/scala/util/Try.html#scala.util.Try)\[[OffsetAndMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndMetadata.html#org.apache.kafka.clients.consumer.OffsetAndMetadata)], requestedPartition: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)) extends [Response](Metadata$$Response.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with SerializableAnnotations@deprecated Deprecated*(Since version 2\.0\.3\)* use `CommittedOffsets`
2. [**](../../akka/kafka/Metadata$$GetCommittedOffset.html "Permalink") final  case class [GetCommittedOffset](Metadata$$GetCommittedOffset.html "org.apache.kafka.clients.consumer.KafkaConsumer#committed()")(partition: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)) extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#committed()

org.apache.kafka.clients.consumer.KafkaConsumer\#committed()

Annotations@deprecated Deprecated*(Since version 2\.0\.3\)* use `GetCommittedOffsets`
### Value Members

1. [**](../../akka/kafka/Metadata$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/Metadata$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/Metadata$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/Metadata$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/Metadata$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/Metadata$.html#createGetBeginningOffsets(partitions:java.util.Set[org.apache.kafka.common.TopicPartition]):akka.kafka.Metadata.GetBeginningOffsets "Permalink")  def createGetBeginningOffsets(partitions: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [GetBeginningOffsets](Metadata$$GetBeginningOffsets.html)Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#beginningOffsets()

Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#beginningOffsets()

Warning: KafkaConsumer documentation states that this method may block indefinitely if the partition does not exist.
7. [**](../../akka/kafka/Metadata$.html#createGetCommittedOffsets(partitions:java.util.Set[org.apache.kafka.common.TopicPartition]):akka.kafka.Metadata.GetCommittedOffsets "Permalink")  def createGetCommittedOffsets(partitions: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [GetCommittedOffsets](Metadata$$GetCommittedOffsets.html)Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#committed()
8. [**](../../akka/kafka/Metadata$.html#createGetEndOffsets(partitions:java.util.Set[org.apache.kafka.common.TopicPartition]):akka.kafka.Metadata.GetEndOffsets "Permalink")  def createGetEndOffsets(partitions: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [GetEndOffsets](Metadata$$GetEndOffsets.html)Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#endOffsets()

Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#endOffsets()

Warning: KafkaConsumer documentation states that this method may block indefinitely if the partition does not exist.
9. [**](../../akka/kafka/Metadata$.html#createGetOffsetForTimes(timestampsToSearch:java.util.Map[org.apache.kafka.common.TopicPartition,Long]):akka.kafka.Metadata.GetOffsetsForTimes "Permalink")  def createGetOffsetForTimes(timestampsToSearch: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Long.html#java.lang.Long)]): [GetOffsetsForTimes](Metadata$$GetOffsetsForTimes.html)Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#offsetsForTimes()

Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#offsetsForTimes()

Warning: KafkaConsumer documentation states that this method may block indefinitely if the partition does not exist.
10. [**](../../akka/kafka/Metadata$.html#createGetPartitionsFor(topic:String):akka.kafka.Metadata.GetPartitionsFor "Permalink")  def createGetPartitionsFor(topic: String): [GetPartitionsFor](Metadata$$GetPartitionsFor.html)Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#partitionsFor()
11. [**](../../akka/kafka/Metadata$.html#createListTopics:akka.kafka.Metadata.ListTopics.type "Permalink")  def createListTopics: [ListTopics](Metadata$$ListTopics$.html).typeJava API:
org.apache.kafka.clients.consumer.KafkaConsumer\#listTopics()
12. [**](../../akka/kafka/Metadata$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../akka/kafka/Metadata$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
14. [**](../../akka/kafka/Metadata$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../akka/kafka/Metadata$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
16. [**](../../akka/kafka/Metadata$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
17. [**](../../akka/kafka/Metadata$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/kafka/Metadata$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../akka/kafka/Metadata$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
20. [**](../../akka/kafka/Metadata$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
21. [**](../../akka/kafka/Metadata$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
22. [**](../../akka/kafka/Metadata$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../akka/kafka/Metadata$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
24. [**](../../akka/kafka/Metadata$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
25. [**](../../akka/kafka/Metadata$$ListTopics$.html "Permalink")  case object [ListTopics](Metadata$$ListTopics$.html "org.apache.kafka.clients.consumer.KafkaConsumer#listTopics()") extends [Request](Metadata$$Request.html) with [NoSerializationVerificationNeeded](https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html#akka.actor.NoSerializationVerificationNeeded) with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializableorg.apache.kafka.clients.consumer.KafkaConsumer\#listTopics()
### Deprecated Value Members

1. [**](../../akka/kafka/Metadata$.html#createGetCommittedOffset(partition:org.apache.kafka.common.TopicPartition):akka.kafka.Metadata.GetCommittedOffset "Permalink")  def createGetCommittedOffset(partition: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)): [GetCommittedOffset](Metadata$$GetCommittedOffset.html)Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#committed()

Java API:
org.apache.kafka.clients.consumer.KafkaConsumer\#committed()

Annotations@deprecated Deprecated*(Since version 2\.0\.3\)* use `createGetCommittedOffsets`
2. [**](../../akka/kafka/Metadata$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/actor/NoSerializationVerificationNeeded.html
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
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerRebalanceEvent.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/InitialPollFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConnectionFailed.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/KafkaConsumerActor$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ManualSubscription.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$BeginningOffsets.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$CommittedOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$CommittedOffsets.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$EndOffsets.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$GetBeginningOffsets.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$GetCommittedOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$GetCommittedOffsets.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$GetEndOffsets.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$GetOffsetsForTimes.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$GetPartitionsFor.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$ListTopics$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$OffsetsForTimes.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$PartitionsFor.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$Request.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$Response.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$$Topics.html
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

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Metadata$.html)*