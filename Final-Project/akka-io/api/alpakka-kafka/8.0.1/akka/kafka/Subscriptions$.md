---
description: Alpakka Kafka 8.0.1 - akka.kafka.Subscriptions
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:48Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/Subscriptions$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.Subscriptions
---

# Alpakka Kafka 8.0.1 - akka.kafka.Subscriptions

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.Subscriptions

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
- [RestrictedConsumer](RestrictedConsumer.html "Offers parts of the org.apache.kafka.clients.consumer.Consumer API which becomes available to the akka.kafka.scaladsl.PartitionAssignmentHandler callbacks.")
- [Subscription](Subscription.html)
- Subscriptions
- [TopicPartitionsAssigned](TopicPartitionsAssigned.html)
- [TopicPartitionsRevoked](TopicPartitionsRevoked.html)
- [Version](Version$.html)
- [WakeupsExceeded](WakeupsExceeded.html)
o[akka](../index.html).[kafka](index.html)

# Subscriptions[**](../../akka/kafka/Subscriptions$.html "Permalink")

### 

#### object Subscriptions

Source[Subscriptions.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/Subscriptions.scala#L80)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Subscriptions
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/kafka/Subscriptions$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/Subscriptions$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/Subscriptions$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/Subscriptions$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/Subscriptions$.html#assignment(tps:java.util.Set[org.apache.kafka.common.TopicPartition]):akka.kafka.ManualSubscription "Permalink")  def assignment(tps: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [ManualSubscription](ManualSubscription.html)JAVA API
Manually assign given topics and partitions
6. [**](../../akka/kafka/Subscriptions$.html#assignment(tps:org.apache.kafka.common.TopicPartition*):akka.kafka.ManualSubscription "Permalink")  def assignment(tps: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)\*): [ManualSubscription](ManualSubscription.html)JAVA API
Manually assign given topics and partitions

JAVA API
Manually assign given topics and partitions

Annotations@varargs()
7. [**](../../akka/kafka/Subscriptions$.html#assignment(tps:Set[org.apache.kafka.common.TopicPartition]):akka.kafka.ManualSubscription "Permalink")  def assignment(tps: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions
8. [**](../../akka/kafka/Subscriptions$.html#assignmentOffsetsForTimes(tp:org.apache.kafka.common.TopicPartition,timestamp:Long):akka.kafka.ManualSubscription "Permalink")  def assignmentOffsetsForTimes(tp: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), timestamp: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions with timestamps
9. [**](../../akka/kafka/Subscriptions$.html#assignmentOffsetsForTimes(tps:java.util.Map[org.apache.kafka.common.TopicPartition,Long]):akka.kafka.ManualSubscription "Permalink")  def assignmentOffsetsForTimes(tps: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Long.html#java.lang.Long)]): [ManualSubscription](ManualSubscription.html)JAVA API
Manually assign given topics and partitions with timestamps
10. [**](../../akka/kafka/Subscriptions$.html#assignmentOffsetsForTimes(tps:(org.apache.kafka.common.TopicPartition,Long)*):akka.kafka.ManualSubscription "Permalink")  def assignmentOffsetsForTimes(tps: ([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))\*): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions with timestamps
11. [**](../../akka/kafka/Subscriptions$.html#assignmentOffsetsForTimes(tps:Map[org.apache.kafka.common.TopicPartition,Long]):akka.kafka.ManualSubscription "Permalink")  def assignmentOffsetsForTimes(tps: Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions with timestamps
12. [**](../../akka/kafka/Subscriptions$.html#assignmentWithOffset(tp:org.apache.kafka.common.TopicPartition,offset:Long):akka.kafka.ManualSubscription "Permalink")  def assignmentWithOffset(tp: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), offset: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions with offsets
13. [**](../../akka/kafka/Subscriptions$.html#assignmentWithOffset(tps:java.util.Map[org.apache.kafka.common.TopicPartition,Long]):akka.kafka.ManualSubscription "Permalink")  def assignmentWithOffset(tps: [Map](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Map.html#java.util.Map)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Long.html#java.lang.Long)]): [ManualSubscription](ManualSubscription.html)JAVA API
Manually assign given topics and partitions with offsets
14. [**](../../akka/kafka/Subscriptions$.html#assignmentWithOffset(tps:(org.apache.kafka.common.TopicPartition,Long)*):akka.kafka.ManualSubscription "Permalink")  def assignmentWithOffset(tps: ([TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))\*): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions with offsets
15. [**](../../akka/kafka/Subscriptions$.html#assignmentWithOffset(tps:Map[org.apache.kafka.common.TopicPartition,Long]):akka.kafka.ManualSubscription "Permalink")  def assignmentWithOffset(tps: Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]): [ManualSubscription](ManualSubscription.html)Manually assign given topics and partitions with offsets
16. [**](../../akka/kafka/Subscriptions$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
17. [**](../../akka/kafka/Subscriptions$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
18. [**](../../akka/kafka/Subscriptions$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
19. [**](../../akka/kafka/Subscriptions$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
20. [**](../../akka/kafka/Subscriptions$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
21. [**](../../akka/kafka/Subscriptions$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
22. [**](../../akka/kafka/Subscriptions$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
23. [**](../../akka/kafka/Subscriptions$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
24. [**](../../akka/kafka/Subscriptions$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
25. [**](../../akka/kafka/Subscriptions$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
26. [**](../../akka/kafka/Subscriptions$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
27. [**](../../akka/kafka/Subscriptions$.html#topicPattern(pattern:String):akka.kafka.AutoSubscription "Permalink")  def topicPattern(pattern: String): [AutoSubscription](AutoSubscription.html)Creates subscription for given topics pattern
28. [**](../../akka/kafka/Subscriptions$.html#topics(ts:java.util.Set[String]):akka.kafka.AutoSubscription "Permalink")  def topics(ts: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[String]): [AutoSubscription](AutoSubscription.html)JAVA API
Creates subscription for given set of topics
29. [**](../../akka/kafka/Subscriptions$.html#topics(ts:String*):akka.kafka.AutoSubscription "Permalink")  def topics(ts: String\*): [AutoSubscription](AutoSubscription.html)JAVA API
Creates subscription for given set of topics

JAVA API
Creates subscription for given set of topics

Annotations@varargs()
30. [**](../../akka/kafka/Subscriptions$.html#topics(ts:Set[String]):akka.kafka.AutoSubscription "Permalink")  def topics(ts: Set\[String]): [AutoSubscription](AutoSubscription.html)Creates subscription for given set of topics
31. [**](../../akka/kafka/Subscriptions$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
32. [**](../../akka/kafka/Subscriptions$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
33. [**](../../akka/kafka/Subscriptions$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/kafka/Subscriptions$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
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
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/testkit/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/Subscriptions$.html)*