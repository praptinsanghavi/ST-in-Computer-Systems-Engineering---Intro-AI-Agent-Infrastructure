---
description: Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage.Message
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:35Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ProducerMessage$$Message.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage.Message
---

# Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage.Message

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ProducerMessage.Message

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/kafka/index.html "Permalink")  package [kafka](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/kafka/ProducerMessage$.html "Permalink")  object [ProducerMessage](ProducerMessage$.html "Classes that are used in both javadsl.Producer and scaladsl.Producer.")Classes that are used in both [javadsl.Producer](javadsl/Producer$.html) and
[scaladsl.Producer](scaladsl/Producer$.html).

Classes that are used in both [javadsl.Producer](javadsl/Producer$.html) and
[scaladsl.Producer](scaladsl/Producer$.html).

Definition Classes[kafka](index.html)
- [Envelope](ProducerMessage$$Envelope.html "Type accepted by Producer.committableSink and Producer.flexiFlow with implementations")
- Message
- [MultiMessage](ProducerMessage$$MultiMessage.html "Envelope implementation that produces multiple message to a Kafka topics, flows emit a MultiResult for every element processed.")
- [MultiResult](ProducerMessage$$MultiResult.html "Results implementation emitted when all messages in a MultiMessage have been successfully published.")
- [MultiResultPart](ProducerMessage$$MultiResultPart.html)
- [PassThroughMessage](ProducerMessage$$PassThroughMessage.html "Envelope implementation that does not produce anything to Kafka, flows emit a PassThroughResult for every element processed.")
- [PassThroughResult](ProducerMessage$$PassThroughResult.html "Results implementation emitted when a PassThroughMessage has passed through the flow.")
- [Result](ProducerMessage$$Result.html "Results implementation emitted when a Message has been successfully published.")
- [Results](ProducerMessage$$Results.html "Output type produced by Producer.flexiFlow and Transactional.flow.")
c[akka](../index.html).[kafka](index.html).[ProducerMessage](ProducerMessage$.html)

# Message[**](../../akka/kafka/ProducerMessage$$Message.html "Permalink")

### 

#### final  case class Message\[K, V, \+PassThrough](record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V], passThrough: PassThrough) extends [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough] with [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product) with Serializable

[Envelope](ProducerMessage$$Envelope.html) implementation that produces a single message to a Kafka topic, flows emit
a [Result](ProducerMessage$$Result.html) for every element processed.

The `record` contains a topic name to which the record is being sent, an optional
partition number, and an optional key and value.

The `passThrough` field may hold any element that is passed through the `Producer.flow`
and included in the [Result](ProducerMessage$$Result.html). That is useful when some context is needed to be passed
on downstream operations. That could be done with unzip/zip, but this is more convenient.
It can for example be a [ConsumerMessage.CommittableOffset](ConsumerMessage$$CommittableOffset.html) or [ConsumerMessage.CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html)
that can be committed later in the flow.

Source[ProducerMessage.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ProducerMessage.scala#L53)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product), [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals), [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough], [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Message
2. Serializable
3. Product
4. Equals
5. Envelope
6. AnyRef
7. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Instance Constructors

1. [**](../../akka/kafka/ProducerMessage$$Message.html#<init>(record:org.apache.kafka.clients.producer.ProducerRecord[K,V],passThrough:PassThrough):akka.kafka.ProducerMessage.Message[K,V,PassThrough] "Permalink")  new Message(record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V], passThrough: PassThrough)
### Value Members

1. [**](../../akka/kafka/ProducerMessage$$Message.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ProducerMessage$$Message.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ProducerMessage$$Message.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ProducerMessage$$Message.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/ProducerMessage$$Message.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/ProducerMessage$$Message.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/kafka/ProducerMessage$$Message.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
8. [**](../../akka/kafka/ProducerMessage$$Message.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
9. [**](../../akka/kafka/ProducerMessage$$Message.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
10. [**](../../akka/kafka/ProducerMessage$$Message.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
11. [**](../../akka/kafka/ProducerMessage$$Message.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
12. [**](../../akka/kafka/ProducerMessage$$Message.html#passThrough:PassThrough "Permalink")  val passThrough: PassThroughDefinition ClassesMessage → [Envelope](ProducerMessage$$Envelope.html)
13. [**](../../akka/kafka/ProducerMessage$$Message.html#productElementNames:Iterator[String] "Permalink")  def productElementNames: Iterator\[String]Definition ClassesProduct
14. [**](../../akka/kafka/ProducerMessage$$Message.html#record:org.apache.kafka.clients.producer.ProducerRecord[K,V] "Permalink")  val record: [ProducerRecord](https://javadoc.io/static/org.apache.kafka/kafka-clients/4.1.0/org/apache/kafka/clients/producer/ProducerRecord.html#org.apache.kafka.clients.producer.ProducerRecord)\[K, V]
15. [**](../../akka/kafka/ProducerMessage$$Message.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
16. [**](../../akka/kafka/ProducerMessage$$Message.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/kafka/ProducerMessage$$Message.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/kafka/ProducerMessage$$Message.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
19. [**](../../akka/kafka/ProducerMessage$$Message.html#withPassThrough[PassThrough2](value:PassThrough2):akka.kafka.ProducerMessage.Message[K,V,PassThrough2] "Permalink")  def withPassThrough\[PassThrough2](value: PassThrough2): Message\[K, V, PassThrough2]Definition ClassesMessage → [Envelope](ProducerMessage$$Envelope.html)
### Deprecated Value Members

1. [**](../../akka/kafka/ProducerMessage$$Message.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [Product](https://www.scala-lang.org/api/2.13.17/scala/Product.html#scala.Product)

### Inherited from [Equals](https://www.scala-lang.org/api/2.13.17/scala/Equals.html#scala.Equals)

### Inherited from [Envelope](ProducerMessage$$Envelope.html)\[K, V, PassThrough]

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Envelope.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$MultiResultPart.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughMessage.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughResult$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$PassThroughResult.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Result.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Results.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Producer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ProducerMessage$$Message.html)*