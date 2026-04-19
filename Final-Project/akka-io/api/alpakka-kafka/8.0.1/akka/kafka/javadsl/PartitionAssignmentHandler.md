---
description: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.PartitionAssignmentHandler
knowledge_type: official_documentation
scraped_at: '2026-04-06T03:06:38Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/javadsl/PartitionAssignmentHandler.html
title: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.PartitionAssignmentHandler
---

# Alpakka Kafka 8.0.1 - akka.kafka.javadsl.PartitionAssignmentHandler

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.javadsl.PartitionAssignmentHandler

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[kafka](../index.html)
- [Committer](Committer$.html)
- [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- [MetadataClient](MetadataClient.html)
- PartitionAssignmentHandler
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
t[akka](../../index.html).[kafka](../index.html).[javadsl](index.html)

# PartitionAssignmentHandler[**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html "Permalink")

### 

#### trait PartitionAssignmentHandler extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

The API is new and may change in further releases.

Allows the user to execute user code when Kafka rebalances partitions between consumers, or an Alpakka Kafka consumer is stopped.
Use with care: These callbacks are called synchronously on the same thread Kafka's `poll()` is called.
A warning will be logged if a callback takes longer than the configured `partition-handler-warning`.

There is no point in calling `Committable`'s commit methods as their committing won't be executed as long as any of
the callbacks in this class are called. Calling `commitSync` on the passed [akka.kafka.RestrictedConsumer](../RestrictedConsumer.html) is available.

This complements the methods of Kafka's [ConsumerRebalanceListener](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html) with
an `onStop` callback which is called before `Consumer.close`.

Source[PartitionAssignmentHandler.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/javadsl/PartitionAssignmentHandler.scala#L24)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PartitionAssignmentHandler
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#onAssign(assignedTps:java.util.Set[org.apache.kafka.common.TopicPartition],consumer:akka.kafka.RestrictedConsumer):Unit "Permalink") abstract  def onAssign(assignedTps: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)], consumer: [RestrictedConsumer](../RestrictedConsumer.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See [org.apache.kafka.clients.consumer.ConsumerRebalanceListener\#onPartitionsAssigned](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html#onPartitionsAssigned(x$1:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit)

See [org.apache.kafka.clients.consumer.ConsumerRebalanceListener\#onPartitionsAssigned](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html#onPartitionsAssigned(x$1:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit)

assignedTpsThe list of partitions that are now assigned to the consumer (may include partitions previously assigned to the consumer)

consumerThe [akka.kafka.RestrictedConsumer](../RestrictedConsumer.html) gives some access to the internally used [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html)
2. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#onLost(lostTps:java.util.Set[org.apache.kafka.common.TopicPartition],consumer:akka.kafka.RestrictedConsumer):Unit "Permalink") abstract  def onLost(lostTps: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)], consumer: [RestrictedConsumer](../RestrictedConsumer.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called when partition metadata has changed and partitions no longer exist.

Called when partition metadata has changed and partitions no longer exist. This can occur if a topic is deleted or if the leader's metadata is stale.
See [org.apache.kafka.clients.consumer.ConsumerRebalanceListener\#onPartitionsLost](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html#onPartitionsLost(x$1:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit)

lostTpsThe list of partitions that are no longer valid

consumerThe [akka.kafka.RestrictedConsumer](../RestrictedConsumer.html) gives some access to the internally used [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html)
3. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#onRevoke(revokedTps:java.util.Set[org.apache.kafka.common.TopicPartition],consumer:akka.kafka.RestrictedConsumer):Unit "Permalink") abstract  def onRevoke(revokedTps: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)], consumer: [RestrictedConsumer](../RestrictedConsumer.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)See [org.apache.kafka.clients.consumer.ConsumerRebalanceListener\#onPartitionsRevoked](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html#onPartitionsRevoked(x$1:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit)

See [org.apache.kafka.clients.consumer.ConsumerRebalanceListener\#onPartitionsRevoked](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html#onPartitionsRevoked(x$1:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit)

revokedTpsThe list of partitions that were revoked from the consumer

consumerThe [akka.kafka.RestrictedConsumer](../RestrictedConsumer.html) gives some access to the internally used [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html)
4. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#onStop(currentTps:java.util.Set[org.apache.kafka.common.TopicPartition],consumer:akka.kafka.RestrictedConsumer):Unit "Permalink") abstract  def onStop(currentTps: [Set](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/Set.html#java.util.Set)\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)], consumer: [RestrictedConsumer](../RestrictedConsumer.html)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Called before a consumer is closed.

Called before a consumer is closed.
See [org.apache.kafka.clients.consumer.ConsumerRebalanceListener\#onPartitionsRevoked](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/ConsumerRebalanceListener.html#onPartitionsRevoked(x$1:java.util.Collection[org.apache.kafka.common.TopicPartition]):Unit)

currentTpsThe list of partitions that are currently assigned to the consumer

consumerThe [akka.kafka.RestrictedConsumer](../RestrictedConsumer.html) gives some access to the internally used [Consumer](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/Consumer.html)
### Concrete Value Members

1. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
13. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/javadsl/PartitionAssignmentHandler.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/RestrictedConsumer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/DiscoverySupport$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/MetadataClient$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/MetadataClient.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/PartitionAssignmentHandler.html)*