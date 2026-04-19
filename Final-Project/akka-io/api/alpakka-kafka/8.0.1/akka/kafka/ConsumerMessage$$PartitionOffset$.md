---
description: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.PartitionOffset
knowledge_type: official_documentation
scraped_at: '2026-04-06T13:44:57Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ConsumerMessage$$PartitionOffset$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.PartitionOffset
---

# Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.PartitionOffset

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.PartitionOffset

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../index.html "Permalink")  package [root](../../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/index.html "Permalink")  package [akka](../index.html)Definition Classes[root](../../index.html)
- [**](../../akka/kafka/index.html "Permalink")  package [kafka](index.html)Definition Classes[akka](../index.html)
- [**](../../akka/kafka/ConsumerMessage$.html "Permalink")  object [ConsumerMessage](ConsumerMessage$.html "Classes that are used in both javadsl.Consumer and scaladsl.Consumer.")Classes that are used in both [javadsl.Consumer](javadsl/Consumer$.html) and
[scaladsl.Consumer](scaladsl/Consumer$.html).

Classes that are used in both [javadsl.Consumer](javadsl/Consumer$.html) and
[scaladsl.Consumer](scaladsl/Consumer$.html).

Definition Classes[kafka](index.html)
- [Committable](ConsumerMessage$$Committable.html "Carries offsets from Kafka for aggregation and committing by the scaladsl.Committer or javadsl.Committer.")
- [CommittableMessage](ConsumerMessage$$CommittableMessage.html "Output element of committableSource.")
- [CommittableOffset](ConsumerMessage$$CommittableOffset.html "Included in CommittableMessage.")
- [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html "For improved efficiency it is good to aggregate several CommittableOffset, using this class, before committing them.")
- [CommittableOffsetMetadata](ConsumerMessage$$CommittableOffsetMetadata.html)
- [GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html "groupId, topic, partition key for an offset position.")
- [PartitionOffset](ConsumerMessage$$PartitionOffset.html "Offset position for a groupId, topic, partition.")
- [PartitionOffsetMetadata](ConsumerMessage$$PartitionOffsetMetadata.html "Offset position and metadata for a groupId, topic, partition.")
- [TransactionalMessage](ConsumerMessage$$TransactionalMessage.html "Output element of transactionalSource.")
[o](ConsumerMessage$$PartitionOffset.html "See companion class")[akka](../index.html).[kafka](index.html).[ConsumerMessage](ConsumerMessage$.html)

# [PartitionOffset](ConsumerMessage$$PartitionOffset.html "See companion class")[**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html "Permalink")

### Companion [class PartitionOffset](ConsumerMessage$$PartitionOffset.html "See companion class")

#### object PartitionOffset extends [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [PartitionOffset](ConsumerMessage$$PartitionOffset.html)] with [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

Source[ConsumerMessage.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ConsumerMessage.scala#L118)Linear Supertypes[Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable), [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [PartitionOffset](ConsumerMessage$$PartitionOffset.html)], ([GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> [PartitionOffset](ConsumerMessage$$PartitionOffset.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. PartitionOffset
2. Serializable
3. AbstractFunction2
4. Function2
5. AnyRef
6. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#apply(key:akka.kafka.ConsumerMessage.GroupTopicPartition,offset:Long):akka.kafka.ConsumerMessage.PartitionOffset "Permalink")  def apply(key: [GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), offset: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [PartitionOffset](ConsumerMessage$$PartitionOffset.html)Definition ClassesPartitionOffset → Function2
5. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
6. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#curried:T1=>(T2=>R) "Permalink")  def curried: ([GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html)) \=\> ([Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> [PartitionOffset](ConsumerMessage$$PartitionOffset.html)Definition ClassesFunction2Annotations@unspecialized()
8. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
9. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
10. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
11. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
13. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
14. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
15. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
17. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#toString():String "Permalink")  def toString(): StringDefinition ClassesFunction2 → AnyRef → Any
18. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#tupled:((T1,T2))=>R "Permalink")  def tupled: (([GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))) \=\> [PartitionOffset](ConsumerMessage$$PartitionOffset.html)Definition ClassesFunction2Annotations@unspecialized()
19. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#unapply(arg:akka.kafka.ConsumerMessage.PartitionOffset):Option[(akka.kafka.ConsumerMessage.GroupTopicPartition,Long)] "Permalink")  def unapply(arg: [PartitionOffset](ConsumerMessage$$PartitionOffset.html)): [Option](https://www.scala-lang.org/api/2.13.17/scala/Option.html#scala.Option)\[([GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long))]
20. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
21. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/kafka/ConsumerMessage$$PartitionOffset$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Serializable](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/io/Serializable.html#java.io.Serializable)

### Inherited from [AbstractFunction2](https://www.scala-lang.org/api/2.13.17/scala/runtime/AbstractFunction2.html#scala.runtime.AbstractFunction2)\[[GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), [PartitionOffset](ConsumerMessage$$PartitionOffset.html)]

### Inherited from ([GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html), [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)) \=\> [PartitionOffset](ConsumerMessage$$PartitionOffset.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
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
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/scaladsl/Consumer$.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/index.html

---
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$PartitionOffset$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$PartitionOffset$.html)*