---
description: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.MetadataClient
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:46Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/scaladsl/MetadataClient.html
title: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.MetadataClient
---

# Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.MetadataClient

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.MetadataClient

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[kafka](../index.html)
- [Committer](Committer$.html)
- [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- MetadataClient
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
[c](MetadataClient$.html "See companion object")[akka](../../index.html).[kafka](../index.html).[scaladsl](index.html)

# [MetadataClient](MetadataClient$.html "See companion object")[**](../../../akka/kafka/scaladsl/MetadataClient.html "Permalink")

### Companion [object MetadataClient](MetadataClient$.html "See companion object")

#### class MetadataClient extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Source[MetadataClient.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/scaladsl/MetadataClient.scala#L21)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. MetadataClient
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/scaladsl/MetadataClient.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/scaladsl/MetadataClient.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/scaladsl/MetadataClient.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/scaladsl/MetadataClient.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/scaladsl/MetadataClient.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/scaladsl/MetadataClient.html#close():Unit "Permalink")  def close(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)
7. [**](../../../akka/kafka/scaladsl/MetadataClient.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/kafka/scaladsl/MetadataClient.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getBeginningOffsetForPartition(partition:org.apache.kafka.common.TopicPartition):scala.concurrent.Future[Long] "Permalink")  def getBeginningOffsetForPartition(partition: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
10. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getBeginningOffsets(partitions:Set[org.apache.kafka.common.TopicPartition]):scala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,Long]] "Permalink")  def getBeginningOffsets(partitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]]
11. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getCommittedOffsets(partitions:Set[org.apache.kafka.common.TopicPartition]):scala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,org.apache.kafka.clients.consumer.OffsetAndMetadata]] "Permalink")  def getCommittedOffsets(partitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [OffsetAndMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndMetadata.html#org.apache.kafka.clients.consumer.OffsetAndMetadata)]]
13. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getEndOffsetForPartition(partition:org.apache.kafka.common.TopicPartition):scala.concurrent.Future[Long] "Permalink")  def getEndOffsetForPartition(partition: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]
14. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getEndOffsets(partitions:Set[org.apache.kafka.common.TopicPartition]):scala.concurrent.Future[Map[org.apache.kafka.common.TopicPartition,Long]] "Permalink")  def getEndOffsets(partitions: Set\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[[TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)]]
15. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getPartitionsFor(topic:String):scala.concurrent.Future[List[org.apache.kafka.common.PartitionInfo]] "Permalink")  def getPartitionsFor(topic: String): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[List\[[PartitionInfo](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/PartitionInfo.html#org.apache.kafka.common.PartitionInfo)]]
16. [**](../../../akka/kafka/scaladsl/MetadataClient.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
17. [**](../../../akka/kafka/scaladsl/MetadataClient.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
18. [**](../../../akka/kafka/scaladsl/MetadataClient.html#listTopics():scala.concurrent.Future[Map[String,List[org.apache.kafka.common.PartitionInfo]]] "Permalink")  def listTopics(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[Map\[String, List\[[PartitionInfo](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/PartitionInfo.html#org.apache.kafka.common.PartitionInfo)]]]
19. [**](../../../akka/kafka/scaladsl/MetadataClient.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
20. [**](../../../akka/kafka/scaladsl/MetadataClient.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
21. [**](../../../akka/kafka/scaladsl/MetadataClient.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
22. [**](../../../akka/kafka/scaladsl/MetadataClient.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
23. [**](../../../akka/kafka/scaladsl/MetadataClient.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
24. [**](../../../akka/kafka/scaladsl/MetadataClient.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
25. [**](../../../akka/kafka/scaladsl/MetadataClient.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
26. [**](../../../akka/kafka/scaladsl/MetadataClient.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/scaladsl/MetadataClient.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
2. [**](../../../akka/kafka/scaladsl/MetadataClient.html#getCommittedOffset(partition:org.apache.kafka.common.TopicPartition):scala.concurrent.Future[org.apache.kafka.clients.consumer.OffsetAndMetadata] "Permalink")  def getCommittedOffset(partition: [TopicPartition](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/common/TopicPartition.html#org.apache.kafka.common.TopicPartition)): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[OffsetAndMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/consumer/OffsetAndMetadata.html#org.apache.kafka.clients.consumer.OffsetAndMetadata)]Annotations@deprecated Deprecated*(Since version 2\.0\.3\)* use `getCommittedOffsets`
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Committer$.html
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

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/MetadataClient.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/MetadataClient.html)*