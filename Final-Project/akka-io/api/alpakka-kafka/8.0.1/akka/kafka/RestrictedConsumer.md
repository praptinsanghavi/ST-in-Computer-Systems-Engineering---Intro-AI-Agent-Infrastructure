---
description: Alpakka Kafka 8.0.1 - akka.kafka.RestrictedConsumer
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:05:43Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/RestrictedConsumer.html
title: Alpakka Kafka 8.0.1 - akka.kafka.RestrictedConsumer
---

# Alpakka Kafka 8.0.1 - akka.kafka.RestrictedConsumer

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.RestrictedConsumer

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
- [ProducerMessage](ProducerMessage$.html "Classes that are used in both javadsl.Producer and scaladsl.Producer.")
- [ProducerSettings](ProducerSettings.html "Settings for producers.")
- RestrictedConsumer
- [Subscription](Subscription.html)
- [Subscriptions](Subscriptions$.html)
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
c[akka](../index.html).[kafka](index.html)

# RestrictedConsumer[**](../../akka/kafka/RestrictedConsumer.html "Permalink")

### 

#### final  class RestrictedConsumer extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Offers parts of the [org.apache.kafka.clients.consumer.Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html) API which becomes available to
the [akka.kafka.scaladsl.PartitionAssignmentHandler](scaladsl/PartitionAssignmentHandler.html) callbacks.

Annotations@ApiMayChange() Source[RestrictedConsumer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/RestrictedConsumer.scala#L17)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. RestrictedConsumer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/kafka/RestrictedConsumer.html#<init>(consumer:org.apache.kafka.clients.consumer.Consumer[_,_],duration:java.time.Duration):akka.kafka.RestrictedConsumer "Permalink")  new RestrictedConsumer(consumer: [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html#org.apache.kafka.clients.consumer.Consumer)\[\_, \_], duration: [Duration](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/time/Duration.html#java.time.Duration))
### Value Members

1. [**](../../akka/kafka/RestrictedConsumer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/RestrictedConsumer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/RestrictedConsumer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/RestrictedConsumer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/RestrictedConsumer.html#assignment():java.util.Set[org.apache.kafka.common.TopicPartition] "Permalink")  def assignment(): [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]See [org.apache.kafka.clients.consumer.KafkaConsumer\#assignment](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/KafkaConsumer.html#assignment():java.util.Set[org.apache.kafka.common.TopicPartition])
6. [**](../../akka/kafka/RestrictedConsumer.html#beginningOffsets(tps:java.util.Collection[org.apache.kafka.common.TopicPartition]):java.util.Map[org.apache.kafka.common.TopicPartition,Long] "Permalink")  def beginningOffsets(tps: [Collection](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Long.html#java.lang.Long)]See org.apache.kafka.clients.consumer.KafkaConsumer\#beginningOffsets()
7. [**](../../akka/kafka/RestrictedConsumer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
8. [**](../../akka/kafka/RestrictedConsumer.html#commitSync(offsets:java.util.Map[org.apache.kafka.common.TopicPartition,org.apache.kafka.clients.consumer.OffsetAndMetadata]):Unit "Permalink")  def commitSync(offsets: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [OffsetAndMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndMetadata.html#org.apache.kafka.clients.consumer.OffsetAndMetadata)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See org.apache.kafka.clients.consumer.KafkaConsumer\#commitSync(Map,java.time.Duration)
9. [**](../../akka/kafka/RestrictedConsumer.html#committed(partitions:java.util.Set[org.apache.kafka.common.TopicPartition]):java.util.Map[org.apache.kafka.common.TopicPartition,org.apache.kafka.clients.consumer.OffsetAndMetadata] "Permalink")  def committed(partitions: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [OffsetAndMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndMetadata.html#org.apache.kafka.clients.consumer.OffsetAndMetadata)]See org.apache.kafka.clients.consumer.KafkaConsumer\#committed(java.util.Set\[TopicPartition],java.time.Duration)
10. [**](../../akka/kafka/RestrictedConsumer.html#endOffsets(tps:java.util.Collection[org.apache.kafka.common.TopicPartition]):java.util.Map[org.apache.kafka.common.TopicPartition,Long] "Permalink")  def endOffsets(tps: [Collection](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Long.html#java.lang.Long)]See org.apache.kafka.clients.consumer.KafkaConsumer\#endOffsets(java.util.Collection\[TopicPartition],java.time.Duration)
11. [**](../../akka/kafka/RestrictedConsumer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/kafka/RestrictedConsumer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
13. [**](../../akka/kafka/RestrictedConsumer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
14. [**](../../akka/kafka/RestrictedConsumer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
15. [**](../../akka/kafka/RestrictedConsumer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
16. [**](../../akka/kafka/RestrictedConsumer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
17. [**](../../akka/kafka/RestrictedConsumer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
18. [**](../../akka/kafka/RestrictedConsumer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
19. [**](../../akka/kafka/RestrictedConsumer.html#offsetsForTimes(timestampsToSearch:java.util.Map[org.apache.kafka.common.TopicPartition,Long]):java.util.Map[org.apache.kafka.common.TopicPartition,org.apache.kafka.clients.consumer.OffsetAndTimestamp] "Permalink")  def offsetsForTimes(timestampsToSearch: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Long.html#java.lang.Long)]): [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [OffsetAndTimestamp](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndTimestamp.html#org.apache.kafka.clients.consumer.OffsetAndTimestamp)]See org.apache.kafka.clients.consumer.KafkaConsumer\#offsetsForTimes(java.util.Map\[TopicPartition,Long],java.time.Duration)
20. [**](../../akka/kafka/RestrictedConsumer.html#position(tp:org.apache.kafka.common.TopicPartition):Long "Permalink")  def position(tp: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)): [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)See java.time.Duration)
21. [**](../../akka/kafka/RestrictedConsumer.html#seek(tp:org.apache.kafka.common.TopicPartition,offset:Long):Unit "Permalink")  def seek(tp: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), offset: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See Long)
22. [**](../../akka/kafka/RestrictedConsumer.html#seekToBeginning(tps:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit "Permalink")  def seekToBeginning(tps: [Collection](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See org.apache.kafka.clients.consumer.KafkaConsumer\#seekToBeginning(java.util.Collection\[TopicPartition])
23. [**](../../akka/kafka/RestrictedConsumer.html#seekToEnd(tps:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit "Permalink")  def seekToEnd(tps: [Collection](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Collection.html#java.util.Collection)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See org.apache.kafka.clients.consumer.KafkaConsumer\#seekToEnd(java.util.Collection\[TopicPartition])
24. [**](../../akka/kafka/RestrictedConsumer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
25. [**](../../akka/kafka/RestrictedConsumer.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
26. [**](../../akka/kafka/RestrictedConsumer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
27. [**](../../akka/kafka/RestrictedConsumer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
28. [**](../../akka/kafka/RestrictedConsumer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/kafka/RestrictedConsumer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html)*