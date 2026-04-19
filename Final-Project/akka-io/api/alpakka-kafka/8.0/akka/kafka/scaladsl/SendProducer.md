---
description: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.SendProducer
knowledge_type: official_documentation
scraped_at: '2026-04-06T01:38:55Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/scaladsl/SendProducer.html
title: Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.SendProducer
---

# Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.SendProducer

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.scaladsl.SendProducer

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/scaladsl/index.html "Permalink")  package [scaladsl](index.html)Definition Classes[kafka](../index.html)
- [Committer](Committer$.html)
- [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- [MetadataClient](MetadataClient.html)
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- SendProducer
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
[c](SendProducer$.html "See companion object")[akka](../../index.html).[kafka](../index.html).[scaladsl](index.html)

# [SendProducer](SendProducer$.html "See companion object")[**](../../../akka/kafka/scaladsl/SendProducer.html "Permalink")

### Companion [object SendProducer](SendProducer$.html "See companion object")

#### final  class SendProducer\[K, V] extends [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

Utility class for producing to Kafka without using Akka Streams.

Source[SendProducer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/scaladsl/SendProducer.scala#L22)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. SendProducer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/scaladsl/SendProducer.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/scaladsl/SendProducer.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/scaladsl/SendProducer.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/scaladsl/SendProducer.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/scaladsl/SendProducer.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../../akka/kafka/scaladsl/SendProducer.html#close():scala.concurrent.Future[akka.Done] "Permalink")  def close(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Close the underlying producer (depending on the "close producer on stop" setting).
7. [**](../../../akka/kafka/scaladsl/SendProducer.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/kafka/scaladsl/SendProducer.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/kafka/scaladsl/SendProducer.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../../akka/kafka/scaladsl/SendProducer.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../../akka/kafka/scaladsl/SendProducer.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
12. [**](../../../akka/kafka/scaladsl/SendProducer.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
13. [**](../../../akka/kafka/scaladsl/SendProducer.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../../akka/kafka/scaladsl/SendProducer.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../../akka/kafka/scaladsl/SendProducer.html#send(record:org.apache.kafka.clients.producer.ProducerRecord[K,V]):scala.concurrent.Future[org.apache.kafka.clients.producer.RecordMetadata] "Permalink")  def send(record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[RecordMetadata](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/RecordMetadata.html#org.apache.kafka.clients.producer.RecordMetadata)]Send a raw Kafka [org.apache.kafka.clients.producer.ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html) and complete a future with the resulting metadata.
16. [**](../../../akka/kafka/scaladsl/SendProducer.html#sendEnvelope[PT](envelope:akka.kafka.ProducerMessage.Envelope[K,V,PT]):scala.concurrent.Future[akka.kafka.ProducerMessage.Results[K,V,PT]] "Permalink")  def sendEnvelope\[PT](envelope: [Envelope](../ProducerMessage$$Envelope.html)\[K, V, PT]): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Results](../ProducerMessage$$Results.html)\[K, V, PT]]Send records to Kafka topics and complete a future with the result.

Send records to Kafka topics and complete a future with the result.

It publishes records to Kafka topics conditionally:

\- [Message](../ProducerMessage$$Message.html) publishes a single message to its topic, and completes the future with [Result](../ProducerMessage$$Result.html)

\- [MultiMessage](../ProducerMessage$$MultiMessage.html) publishes all messages in its `records` field, and completes the future with [MultiResult](../ProducerMessage$$MultiResult.html)

\- [PassThroughMessage](../ProducerMessage$$PassThroughMessage.html) does not publish anything, and completes the future with [PassThroughResult](../ProducerMessage$$PassThroughResult.html)

The messages support passing through arbitrary data.
17. [**](../../../akka/kafka/scaladsl/SendProducer.html#settings:akka.kafka.ProducerSettings[K,V] "Permalink")  val settings: [ProducerSettings](../ProducerSettings.html)\[K, V]
18. [**](../../../akka/kafka/scaladsl/SendProducer.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
19. [**](../../../akka/kafka/scaladsl/SendProducer.html#toString():String "Permalink")  def toString(): StringDefinition ClassesSendProducer → AnyRef → Any
20. [**](../../../akka/kafka/scaladsl/SendProducer.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../../akka/kafka/scaladsl/SendProducer.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/kafka/scaladsl/SendProducer.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/scaladsl/SendProducer.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Message.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$MultiResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$PassThroughMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$PassThroughResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Result.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerMessage$$Results.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/ProducerSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Committer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/DiscoverySupport$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/MetadataClient$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/MetadataClient.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/PartitionAssignmentHandler.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/SendProducer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/SendProducer.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/Transactional$.html
- https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/SendProducer.html](https://doc.akka.io/api/alpakka-kafka/8.0/akka/kafka/scaladsl/SendProducer.html)*