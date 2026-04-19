---
description: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Committer
knowledge_type: official_documentation
scraped_at: '2026-04-05T19:28:49Z'
section: api
site: akka-io
source_url: https://doc.akka.io/api/alpakka-kafka/current/akka/kafka/javadsl/Committer$.html
title: Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Committer
---

# Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Committer

> **Summary:** Alpakka Kafka 8.0.1 - akka.kafka.javadsl.Committer

## Content

Alpakka Kafka8\.0\.1 \< Back****# Packages

- [**](../../../index.html "Permalink")  package [root](../../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/index.html "Permalink")  package [akka](../../index.html)Definition Classes[root](../../../index.html)
- [**](../../../akka/kafka/index.html "Permalink")  package [kafka](../index.html)Definition Classes[akka](../../index.html)
- [**](../../../akka/kafka/javadsl/index.html "Permalink")  package [javadsl](index.html)Definition Classes[kafka](../index.html)
- Committer
- [Consumer](Consumer$.html "Akka Stream connector for subscribing to Kafka topics.")
- [DiscoverySupport](DiscoverySupport$.html "Scala API.")
- [MetadataClient](MetadataClient.html)
- [PartitionAssignmentHandler](PartitionAssignmentHandler.html "The API is new and may change in further releases.")
- [Producer](Producer$.html "Akka Stream connector for publishing messages to Kafka topics.")
- [SendProducer](SendProducer.html "Utility class for producing to Kafka without using Akka Streams.")
- [Transactional](Transactional$.html "Akka Stream connector to support transactions between Kafka topics.")
o[akka](../../index.html).[kafka](../index.html).[javadsl](index.html)

# Committer[**](../../../akka/kafka/javadsl/Committer$.html "Permalink")

### 

#### object Committer

Source[Committer.scala](https://github.com/akka/alpakka-kafka/tree/v8.0.1/core/src/main/scala/akka/kafka/javadsl/Committer.scala#L18)Linear Supertypes[AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef), [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)****Ordering1. Alphabetic
2. By Inheritance
Inherited  
1. Committer
2. AnyRef
3. Any
1. Hide All
2. Show All
Visibility1. Public
2. Protected
### Value Members

1. [**](../../../akka/kafka/javadsl/Committer$.html#!=(x$1:Any):Boolean "Permalink") final  def !\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
2. [**](../../../akka/kafka/javadsl/Committer$.html###:Int "Permalink") final  def \#\#: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → Any
3. [**](../../../akka/kafka/javadsl/Committer$.html#==(x$1:Any):Boolean "Permalink") final  def \=\=(arg0: [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
4. [**](../../../akka/kafka/javadsl/Committer$.html#asInstanceOf[T0]:T0 "Permalink") final  def asInstanceOf\[T0]: T0Definition ClassesAny
5. [**](../../../akka/kafka/javadsl/Committer$.html#batchFlow[C<:akka.kafka.ConsumerMessage.Committable](settings:akka.kafka.CommitterSettings):akka.stream.javadsl.Flow[C,akka.kafka.ConsumerMessage.CommittableOffsetBatch,akka.NotUsed] "Permalink")  def batchFlow\[C \<: [Committable](../ConsumerMessage$$Committable.html)](settings: [CommitterSettings](../CommitterSettings.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[C, [CommittableOffsetBatch](../ConsumerMessage$$CommittableOffsetBatch.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Batches offsets and commits them to Kafka, emits `CommittableOffsetBatch` for every committed batch.
6. [**](../../../akka/kafka/javadsl/Committer$.html#clone():Object "Permalink")  def clone(): [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.CloneNotSupportedException]) @native()
7. [**](../../../akka/kafka/javadsl/Committer$.html#eq(x$1:AnyRef):Boolean "Permalink") final  def eq(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
8. [**](../../../akka/kafka/javadsl/Committer$.html#equals(x$1:Object):Boolean "Permalink")  def equals(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef → Any
9. [**](../../../akka/kafka/javadsl/Committer$.html#flow[C<:akka.kafka.ConsumerMessage.Committable](settings:akka.kafka.CommitterSettings):akka.stream.javadsl.Flow[C,akka.Done,akka.NotUsed] "Permalink")  def flow\[C \<: [Committable](../ConsumerMessage$$Committable.html)](settings: [CommitterSettings](../CommitterSettings.html)): [Flow](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html#akka.stream.javadsl.Flow)\[C, [Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]Batches offsets and commits them to Kafka, emits `Done` for every committed batch.
10. [**](../../../akka/kafka/javadsl/Committer$.html#flowWithOffsetContext[E,C<:akka.kafka.ConsumerMessage.Committable](settings:akka.kafka.CommitterSettings):akka.stream.javadsl.FlowWithContext[E,C,akka.NotUsed,akka.kafka.ConsumerMessage.CommittableOffsetBatch,akka.NotUsed] "Permalink")  def flowWithOffsetContext\[E, C \<: [Committable](../ConsumerMessage$$Committable.html)](settings: [CommitterSettings](../CommitterSettings.html)): [FlowWithContext](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/FlowWithContext.html#akka.stream.javadsl.FlowWithContext)\[E, C, [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed), [CommittableOffsetBatch](../ConsumerMessage$$CommittableOffsetBatch.html), [NotUsed](https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html#akka.NotUsed)]API MAY CHANGE

API MAY CHANGE

Batches offsets from context and commits them to Kafka, emits no useful value, but keeps the committed
`CommittableOffsetBatch` as context.

Annotations@ApiMayChange()
11. [**](../../../akka/kafka/javadsl/Committer$.html#getClass():Class[_] "Permalink") final  def getClass(): [Class](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/Class.html#java.lang.Class)\[\_ \<: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)]Definition ClassesAnyRef → AnyAnnotations@native()
12. [**](../../../akka/kafka/javadsl/Committer$.html#hashCode():Int "Permalink")  def hashCode(): [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)Definition ClassesAnyRef → AnyAnnotations@native()
13. [**](../../../akka/kafka/javadsl/Committer$.html#isInstanceOf[T0]:Boolean "Permalink") final  def isInstanceOf\[T0]: [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAny
14. [**](../../../akka/kafka/javadsl/Committer$.html#ne(x$1:AnyRef):Boolean "Permalink") final  def ne(arg0: [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)): [Boolean](https://www.scala-lang.org/api/2.13.17/scala/Boolean.html#scala.Boolean)Definition ClassesAnyRef
15. [**](../../../akka/kafka/javadsl/Committer$.html#notify():Unit "Permalink") final  def notify(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
16. [**](../../../akka/kafka/javadsl/Committer$.html#notifyAll():Unit "Permalink") final  def notifyAll(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@native()
17. [**](../../../akka/kafka/javadsl/Committer$.html#sink[C<:akka.kafka.ConsumerMessage.Committable](settings:akka.kafka.CommitterSettings):akka.stream.javadsl.Sink[C,java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def sink\[C \<: [Committable](../ConsumerMessage$$Committable.html)](settings: [CommitterSettings](../CommitterSettings.html)): [Sink](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[C, [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]Batches offsets and commits them to Kafka.
18. [**](../../../akka/kafka/javadsl/Committer$.html#sinkWithOffsetContext[E,C<:akka.kafka.ConsumerMessage.Committable](settings:akka.kafka.CommitterSettings):akka.stream.javadsl.Sink[akka.japi.Pair[E,C],java.util.concurrent.CompletionStage[akka.Done]] "Permalink")  def sinkWithOffsetContext\[E, C \<: [Committable](../ConsumerMessage$$Committable.html)](settings: [CommitterSettings](../CommitterSettings.html)): [Sink](https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Sink.html#akka.stream.javadsl.Sink)\[[Pair](https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html#akka.japi.Pair)\[E, C], [CompletionStage](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/concurrent/CompletionStage.html#java.util.concurrent.CompletionStage)\[[Done](https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html#akka.Done)]]API MAY CHANGE

API MAY CHANGE

Batches offsets from context and commits them to Kafka.

Annotations@ApiMayChange()
19. [**](../../../akka/kafka/javadsl/Committer$.html#synchronized[T0](x$1:=>T0):T0 "Permalink") final  def synchronized\[T0](arg0: \=\> T0): T0Definition ClassesAnyRef
20. [**](../../../akka/kafka/javadsl/Committer$.html#toString():String "Permalink")  def toString(): [String](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/lang/String.html#java.lang.String)Definition ClassesAnyRef → Any
21. [**](../../../akka/kafka/javadsl/Committer$.html#wait():Unit "Permalink") final  def wait(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
22. [**](../../../akka/kafka/javadsl/Committer$.html#wait(x$1:Long,x$2:Int):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long), arg1: [Int](https://www.scala-lang.org/api/2.13.17/scala/Int.html#scala.Int)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException])
23. [**](../../../akka/kafka/javadsl/Committer$.html#wait(x$1:Long):Unit "Permalink") final  def wait(arg0: [Long](https://www.scala-lang.org/api/2.13.17/scala/Long.html#scala.Long)): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.InterruptedException]) @native()
### Deprecated Value Members

1. [**](../../../akka/kafka/javadsl/Committer$.html#finalize():Unit "Permalink")  def finalize(): [Unit](https://www.scala-lang.org/api/2.13.17/scala/Unit.html#scala.Unit)Attributesprotected\[lang] Definition ClassesAnyRefAnnotations@throws(classOf\[java.lang.Throwable]) @Deprecated Deprecated*(Since version 9\)*
### Inherited from [AnyRef](https://www.scala-lang.org/api/2.13.17/scala/AnyRef.html#scala.AnyRef)

### Inherited from [Any](https://www.scala-lang.org/api/2.13.17/scala/Any.html#scala.Any)

### Ungrouped

## Related Pages (Internal Links)

- https://doc.akka.io/api/akka-core/2.10.11/akka/Done.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/NotUsed.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/japi/Pair.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Flow.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/FlowWithContext.html
- https://doc.akka.io/api/akka-core/2.10.11/akka/stream/javadsl/Sink.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/index.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/CommitterSettings.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$Committable.html
- https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/ConsumerMessage$$CommittableOffsetBatch.html
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
*Source: [https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html](https://doc.akka.io/api/alpakka-kafka/8.0.1/akka/kafka/javadsl/Committer$.html)*