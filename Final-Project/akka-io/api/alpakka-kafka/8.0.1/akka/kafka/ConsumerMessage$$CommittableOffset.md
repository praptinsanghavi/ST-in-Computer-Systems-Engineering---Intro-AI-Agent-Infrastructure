---
description: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.CommittableOffset
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:31Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/ConsumerMessage$$CommittableOffset.html
title: Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.CommittableOffset
---

# Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.CommittableOffset

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.ConsumerMessage.CommittableOffset

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
- CommittableOffset
- [CommittableOffsetBatch](ConsumerMessage$$CommittableOffsetBatch.html "For improved efficiency it is good to aggregate several CommittableOffset, using this class, before committing them.")
- [CommittableOffsetMetadata](ConsumerMessage$$CommittableOffsetMetadata.html)
- [GroupTopicPartition](ConsumerMessage$$GroupTopicPartition.html "groupId, topic, partition key for an offset position.")
- [PartitionOffset](ConsumerMessage$$PartitionOffset.html "Offset position for a groupId, topic, partition.")
- [PartitionOffsetMetadata](ConsumerMessage$$PartitionOffsetMetadata.html "Offset position and metadata for a groupId, topic, partition.")
- [TransactionalMessage](ConsumerMessage$$TransactionalMessage.html "Output element of transactionalSource.")
t[akka](../index.html).[kafka](index.html).[ConsumerMessage](ConsumerMessage$.html)

# CommittableOffset[**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html "Permalink")

### 

#### sealed  trait CommittableOffset extends [Committable](ConsumerMessage$$Committable.html)

Included in [CommittableMessage](ConsumerMessage$$CommittableMessage.html). Makes it possible to
commit an offset with the [Committable\#commitScaladsl](ConsumerMessage$$Committable.html#commitScaladsl():scala.concurrent.Future[akka.Done]) / [Committable\#commitJavadsl](ConsumerMessage$$Committable.html#commitJavadsl():java.util.concurrent.CompletionStage[akka.Done]) method
or aggregate several offsets in a [batch](ConsumerMessage$$CommittableOffsetBatch.html)
before committing.

Note that the offset position that is committed to Kafka will automatically
be one more than the `offset` of the message, because the committed offset
should be the next message your application will consume,
i.e. lastProcessedMessageOffset \+ 1\.

Annotations@DoNotInherit() Source[ConsumerMessage.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/ConsumerMessage.scala#L82)Linear Supertypes[Committable](ConsumerMessage$$Committable.html), [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)Known Subclasses[CommittableOffsetMetadata](ConsumerMessage$$CommittableOffsetMetadata.html)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. CommittableOffset
2. Committable
3. AnyRef
4. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Abstract Value Members

1. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#batchSize:Long "Permalink") abstract  def batchSize: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)Get a number of processed messages this committable contains

Get a number of processed messages this committable contains

Definition Classes[Committable](ConsumerMessage$$Committable.html)
2. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#partitionOffset:akka.kafka.ConsumerMessage.PartitionOffset "Permalink") abstract  def partitionOffset: [PartitionOffset](ConsumerMessage$$PartitionOffset.html)
3. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#commitJavadsl():java.util.concurrent.CompletionStage[akka.Done] "Permalink") abstract  def commitJavadsl(): [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Definition Classes[Committable](ConsumerMessage$$Committable.html)Annotations@Deprecated @deprecated Deprecated*(Since version 2\.0\.0\)* use `Committer.flow` or `Committer.sink` instead of direct usage
4. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#commitScaladsl():scala.concurrent.Future[akka.Done] "Permalink") abstract  def commitScaladsl(): [Future](https://www.scala-lang.org/api/2.13.17/scala/concurrent/Future.html#scala.concurrent.Future)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]Definition Classes[Committable](ConsumerMessage$$Committable.html)Annotations@deprecated Deprecated*(Since version 2\.0\.0\)* use `Committer.flow` or `Committer.sink` instead of direct usage
### Concrete Value Members

1. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
6. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
7. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
8. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
9. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
10. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
11. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
12. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
13. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
14. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
15. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
16. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
17. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
18. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../akka/kafka/ConsumerMessage$$CommittableOffset.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [Committable](ConsumerMessage$$Committable.html)

### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffset.html)*